业务流
最后更新时间：2024-05-14
第一章 基本概念

背景

业务流本意是在企业或组织中，为了实现特定的目标，定义、执行或管理的一组相关的活动集合。

业务流是业务流程的简称，有三个层面的含义，一是业务流程管理的思想理念和方法，二是业务流程管理的软件平台或工具，最常见的就是专业厂商提供的 BPM（Business Process Management）平台或套件，三是 ERP、CRM 或协同等企业应用中的业务流程管理特性或功能。我们通常说的业务流大都是指用友 NC、YS，以及金蝶星空等 ERP 中的一种特殊的产品形态和应用模型，不是一般意义上的业务流程或业务流程管理。

实际上，由于客户需求的阶段性演化、企业应用的历史沿革影响，以及流程管理技术发展的不均衡不同步等因素，一些典型的关键的企业应用，比如 ERP，一直没有和业务流程管理的理念技术有效地整合起来。我们现有产品中的业务流，可以看作是在即有应用和技术架构下的变通。

我们这里指业务流服务，是由用户定义和实现的，是以单据为核心的系列规则流转， 所以也可以称为单据流。

基于历史原因，有两种不同的业务流引擎：

一是基于 YonSuite 原有的业务场景，预置了供应链和营销的 7 个流程，实现了采购供应和销售管理等业务单据的流程预置和自定义修改。其特点是，核心单据通过选择对应的交易类型确定唯一的业务流。一旦业务流确定以后，后续单据每一步流转都会从上游携带流程 id，单据流转严格按照流程定义进行。

另一种业务流是基于低代码平台的数据推送。这种业务流相对灵活，没有交易类型、核心单据的概念。其特点是，数据的流转基于单据与单据之间的推送关系，不管有多少推送关系，也不论在哪个流中定义，只要是启用状态，就直接全部转换。

现在我们在做同时融合这两种能力的业务流，即要支持在一个业务流中定义完整业务场景，使单据只在一个流程中逐步流转，同时也要照顾到推送场景的灵活性，如增加支持同一个业务流的多单据入口、多规则转换等功能，以完成业务流设计态&运行态的

统一，在此基础上实现其他领域的流程需求，以及原厂单据流程的扩展场景。

第二章 技术架构
总体架构设计

架构设计

业务流提供对单据数据的转换服务。业务流通过用户配置的的转换规则和上游单据数据生成对应下游单据，并返回给业务系统；全局联查可以查询相应的所有上下游单据， 并以图形化的方式进行展示。

典型推单逻辑

推单逻辑

推送触发来源可能是用户在单据上手工触发，也可能是审批流回调数据触发，或者是上游单据的具体单据动作触发。具体的转单逻辑可以描述为：

推送第一步是查找具体的转换规则。根据来源单据，查找来源单据到下游单据的具体转换规则。若没有相关规则，则直接结束。若找到则转下一步。
检查找到的规则中设置的具体推送时机，并与推送触发来源进行匹配。若不匹配，则跳过此规则。若匹配，则继续下一步。
检查规则是否是即时推送还是定时推送。若是定时推送则，按定时设置启动定时任务。然后结束。若是即时推送，则直接下一步。
检查规则是否进行了分枝设置。若有则进行分枝过滤条件，进行单据的过滤。过滤完以后转到下一步。
检查规则是否设置了分组拆分设置，若有则对单据进行分组拆分。尤其是子表分组拆分后的数据遂行进行推送。完成后进入下一步。
检查规则设置的推单方式，若是需要更新，则先查找目标单据。若是新建单据， 则直接下一步。
这一步是具体的转换流程，对来源单据使用设置的具体转换字段逐字段进行转换。转换完成生成下游单据数据。
保存单据数据，整个推单完成
典型推单活动时序

推单时序

由用户点击下推按钮，页面请求打到后端服务中的业务流 SDK，交互查找可用推单规则。
业务流 SDK 把请求参数转发到业务流服务中，查找业务流设计态保存好的业务流数据。
业务流服务将找到的相关规则返回业务流 SDK。然后把转换规则返给页面，下拉显示。
用户选择一下特定转换规则进行推单，请求打到业务流 SDK。
业务流 SDK 把单据数据以及选定的转换规则 ID，发到业务流服务进行转换。
业务流服务转换引擎执行数据转换，记录相关日志，并把转换结果返回给业务

流 SDK。

业务流 SDK 处理本地数据，保存或更新后，把执行结果返回页面，提示给用户。
第三章 功能描述

业务流提供功能主要是三种，推单、拉单、和回写。

推单是主要的活动过程，即一种上游单据通过转换规则，转换成一张或多张下游单据。

拉单本质上与推单类似，是由下游单据主动拉取上游单据，通过同样的转换规则， 转成下游单据。

回写是指由上游单据转换生成的下游单据，在特定的时机下，将部分数据追踪溯源回写到原始来流单据的过程。

业务流服务根据接入方式不同可分为两种不同代码实现，以下对这两种方式进行对比介绍：

预置单据转换规则（业务流）方式	自定义业务流方式
服务形式	SDK 形式整个转换过程的代码以 SDK 形式存在于各领域服务中	SDK+独立服务形式
SDK 提供对 Rule 的支持，Rule 只负责组织数据，发送请求
业务流服务接收 SDK 的生单请求，完 成生单或回写的过程| |触发时机|
推单可以通过点击页面上按钮触发
推单和回写也可以通过特定时机触发，如保存、审核等，具体时机可由配置 Rule 指定 |
推单可以通过点击页面上按钮触发
推单和回写也可以通过特定时机触发，如保存、审核等，具体时机通过业务流设计器配置（前提是相应时机上配 有自定义业务流生单 Rule）| |按钮生成方式|各领域自己预置，对应表为：1.bill_toolbaritem 按钮表|分为两种：1.低代码单据：为动态按钮，前端通过|
2.bill_command 按钮命令表	/searchRule 接口查询自定义业务流规则，并动态生成按钮2.领域单据：业务流服务会自动往各领域库中添加或删除按钮
支持的推单（拉单）场景	支持主子孙表的推单
支持主子孙表的推单
支持多子表、多孙表的推单 | |支持的分单场景|支持主子孙表的分单|支持主子表的分单| |支持的回写场景|支持主子表的回写|支持主子孙表的回写|
自定义业务流
3.1.1 支持推单/拉单场景

支持主子孙的推拉单，支持多子表多孙表配置有子到主时会自动按子表分单

支持分单场景

支持主表以及单子表的分单

分单显示字段就是分单规则设置的字段

支持回写场景

支持主子孙的回写，仅支持单子单孙

触发时机

业务流活动触发时机指的是在何时种时间或何种操作下，会触发业务流活动。自定义业务流触发时机通过业务流设计器配置，主要分类四种类型：手工触发、审批流触发、单据动作触发、定时触发。

手工触发是指由用户选择具体业务流转换规则，通过点击具体触发按钮进行单据转换活动的触发方式。

审批流触发是指业务流和审批流相互融合，在单据的审批流事件发生时，由审批流回凋业务流，告知相关审批发生的单据及时机，业务流根据相关配置，进行相应转换操作的触发方式。

单据动作触发是一种自动触发的方式，指在单据相关动作发生时，如保存、更新、删除等动作发生时，触发业务流进行转单服务的触发方式。

定时任务触发指在上述三种触发方式被触发时，并不是立即执行相关转单活动，而是启动相关定时任务。在定时时间到达时，由定时任务触发立即转单活动的触发方式。

以下为各种触发时机的触发方式对比：

触发时机	触发方式
手动触发	手工点击页面上按钮
单据生效	审批流回调触发
单据动作	规则链配置触发
流程环节	审批流回调触发
流程操作	审批流回调触发
定时任务	内部定时任务触发

自定义业务流的方式，使用审核、保存等时机推单回写如若未触发相关动作， 请先检查 billruleregister 表相应动作上是否配有相关 rule，

请先检查 billruleregister 表相应动作上是否配有相关 rule， 请先检查 billruleregister 表相应动作上是否配有相关 rule。开发接入示例章节有详细说明。

引用单据转换规则

单据转换规则大体分为两种。一是自定义的转换规则。二是各领域预置的转换规则， 对应单据的页面上都预置有相应的推单或拉单按钮。

值得一提的是，自定义转换规则可以引用预置的转换规则。可以在自定义规则中增量添加自定义配置，相当于对预置的转换规则的一种扩展。此时，生单的触发手段是通过各领域单据上预置的按钮。

同时，业务流也可以引用自定义单据转换规则或预置的转换规则（非必须）。可以在业务流规则中增量添加自定义配置，相当于赋予单据转换规则流程的能力。此时，若业务流引用的是纯自定义的转换规则，并且触发时机为手动触发，系统会在领域相应页面上动态添加生单按钮；若业务流直接或间接引用了预置的转换规则，则走的还是领域预置的按钮。

以下为各种生单方式使用方式的区别：

使 用 方****式	对应按钮	后端接口	Rule
业务流没 有 引用转换规则	动态生成	/batchPush	BizFlowBatchPushRule
业务流引 用 纯自定义转换规则	动态生成	/batchPush	BizFlowBatchPushRule
业务流直 接 或间接引用预置转换规则	系统预置	/pullVoucher	一系列 rule， 其中生单 Rule 为 BeforePullAndPushRule
预 置 单据转换规则	系统预置	/pullVoucher	一系列 rule， 其中生单 Rule 为 BeforePullAndPushRule
自 定 义单据转换规则无引用	无	无	无
自 定 义单据转换规则引 用 预置转换规则	系统预置	/pullVoucher	一系列 rule， 其中生单 Rule 为 BeforePullAndPushRule
相关Rule 说明

使用自定义业务流的方式（自定义业务流，并且业务流引用的单据转换规则为纯自定义规则。业务流是一个单独的服务）：

业务流推单 rule
1
把单据相关信息以 HTTP 请求方式请求业务流服务
业务流服务会根据单据数据、触发时机、交易类型、业务流配置等对某些推单请求进行过滤，只会处理真正需要推单 的单据
调 HTTP 接口查询各领域单据数据 |

|||

转换数据
调 HTTP 接口保存单据 | |---|---|---| |2|BizFlowBatchPushRule|多条单据（自动）推单兼容 BizFlowPushRule，推单的 Rule 可统一配置成这个 Rule|
回写 rule
1
把单据相关信息以 HTTP 请求方式请求业务流服务
根据单据数据、触发时机、交易类型、业务流配置等对某些推单 请求进行过滤，只会处理真正需要推回写的单据
调 HTTP 接口查询上下游单据数据
转换数据
调 HTTP 接口保存单据 |
多版本

新建业务流时可以勾选启用版本控制，开启业务流多版本功能。点击发布则为发布一个新版本，相当于新建一个更高版本的业务流。

业务流服务在生单后，会在下游单据上记录业务流 id；业务流/searchRule 接口会根据单据上的业务流 id 进行过滤。所以旧版本业务流生成的单据不能走新版本业务流，各版本业务流和单据独立运行，互不干预。

请谨慎使用多版本功能。

预置单据转换规则/业务流
支持推单/拉单场景

支持主子孙的推拉单，仅配有主表和子表字段时只支持单子表，配有孙表字段时支持多子表多孙表

支持分单场景

支持主子孙的分单，仅支持单子单孙

分单显示的字段可另外配置， 具体为 domain_make_bill_rule_group_item 或

domain_make_bill_rule_group_item_tenant 表的 s_ori_field_name 字段

支持回写场景

支持主子的回写

配置触发时机

触发时机由相关配置指定：

若预置有按钮，则可以手动触发

若配置在某个动作的规则链上，则可以由动作触发

相关Rule 说明

使用预置单据转换规则的方式（预置业务流、直接或间接引用预置单据转换规则，业务流是在各领域服务里运行）：

业务流生单 rule
在走规则链之前，会把领域预置的单据转换规则查出来。
1
当参数的pushAndPullVO 里面sourceData 有值就不去去查上游数据。
会根据传过来的主子表 id，查询上游数据。只拼写查询条件， 查询字段用的时 UI 模板的数据。|
2	DivideVoucherByInnerCoRul e	查询内部购销转换规则查询条件 来源组织，来源交易类型，目标组织mapCondition.put("srcOrg", array[1]); mapCondition.put("srcBizTypeId", array[2]); mapCondition.put("tarOrg", array[4]); makeBillRuleService.findDetailListByCondition(vo.getCode(),vo.getGroupCode(),mapCondition);
3	DivideVoucherBySocialRule	来源交易类型和来源租户同时存在时进行社会化分单mapCondition.put("srcTenant",srcTenantId); mapCondition.put("srcBizTypeId", srcTransaction); mapCondition.put("sysid",ruleId); billRule=makeBillRuleService.findDetailListByCondition(code,groupCode,mapCondition);
4	DivideVoucherByTenantRule	租户级分单mapCondition.put("srcBizTypeId", key);mapCondition.put("sysid",makeBillRule.getId()); billRule=makeBillRuleService.findDetailListByCondition(vo.getCode(), vo.getGroupCode(),mapCondition);
5	DivideVoucherByFlowRule	如果有业务流则查询流的规则
查询流信息（来源 ，交易类型）
获取流上引用的转换规则 dode 查询，流上的规则 | |6|DivideVoucherForPullRule|
虚拟子表处理
将主表的时间戳提前写给子表，以防合并生单后丢失
获取分担规则
将数据进行合单，拆单处理 | |7|BeforePullAndPushRule|
根据单据转换规则进行数据关联查询
主表有回写设置回写需要的信息（来源，时间戳，code）
设置业务流
单据转换规则进行转单
设置交易类型 |
回写规则 rule
1

查询回写规则

如果是删除操作 ，查询下游数据库的数据（id code）；

如果是更新，有子表回写（防止子表数据删除，无法获取到回写 code），查询下游数据库的数据（id code）；无子表回写直接用页面传过来的数据，

查询规则。

如果不是新增操作，需要查询当前下游的数据，与修改的数据做 差量回写。| |2|BackWriteRule|回写主子表

需要查询上游数据（判断需不需要回写，以及组装回滚数据）

如果是删除操作，将当前数据换成查询出来的数据，回写时后， 直接取反。

将回写规则进行分组。（回写主子） |

|||

判断数据是否需要回写多个来与来源（依次进行回写）
组装回写内容
组装回滚数据 | |---|---|---| |3|BackWriteSaveRule|
根据 rule 上的 config 配置 ，获取当前来源的会写数据
时间戳并发校验。分别是主子表时间戳的校验，如果上有数据 有修改则报错。
回写事件发送
后面的 rule 有异常之后，就行回滚操作 |
单据联查

联查就是要把业务发生整个过程中的这些有关系的单据，集中起来在界面中以图形化的方式进行展示。

用户在单据列表页面，或单据详情页面。通过点击界面中的“全局联查”按钮，触

发单据联查请求。

单据联查完毕，返回数据以图形化的方式进行展示：

联查图中的每个节点，代码一个单据。以单据之间的箭头标明单据的上下游关系。其中每个单据都可以通过点击跳转到各个单据的详情页面。

第四章 开发接入说明
接入模式
开发接入前提

应用引入业务流并使用相关功能的前提条件是该应用是基于用友 mdd 框架开发而成的。

开发接入示例
maven 引入业务流 SDK 依赖：

com.yonyou.common

bizFlow-runtime-sdk

${mdd.version}

配置业务流地址（只有自定义业务流会使用到）：

对接了 YMS 的应用，不需要配置。旧服务升级后可删除原来的配置项：

bizFlow.url

YMS 默认配置项为：

键：domain.iuap-yonbuilder-businessflow

值：${domain.url}/iuap-yonbuilder-businessflow

1. 未对接 YMS 的应用，需在配置文件中添加配置：bizFlow.url，示例如下：


bizFlow.url=xxx/iuap-yonbuilder-businessflow

1. mdd.version 版本严格和 mdd 框架保持一致，请根据框架情况进行实际替换。如：


3.1.0-SNAPSHOT

为使按钮可以正确触发业务流请求，需要往 billruleregister 表相应动作上注册添加业务流规则：（低代码、常用领域默认已配置，此配置只有自定义业务流会使用到） 相关配置说明：
按钮命令	按钮命令说明	对应业务流规则
bizflowpush	单条单据推单	bizFlowPushRule
bizflowbatchpush	多条单据推单	bizFlowBatchPushRule

配置示例：

单条单据推单动作 bizFlowPushRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029095', 'common', 'bizflowpush', 'bizFlowPushRule', '30.00', NULL, 'dw72i0vh', NULL, '1', NULL, '0', '0', NULL, NULL, NULL, NULL);

多条单据推单动作 bizFlowBatchPushRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029097', 'common', 'bizflowbatchpush', 'bizFlowBatchPushRule', '30.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

为使单据在触发动作后能发出请求，调用业务流，需在规则链上加入业务流动作： 单据规则注册 billruleregister 表结构如上。（此配置只有自定义业务流会使用到。） 配置说明：
单据动作	单据动作说明	对应业务流规则（可选）
save	单据保存时触发	bizFlowPushRule（推单）、bizFlowWriteBackRule（回写）
delete	单据删除时触发	bizFlowPushRule（推单）、bizFlowWriteBackRule（回写）
audit	单据审核时触发	bizFlowWriteBackRule（回写）
unaudit	单据弃审时触发	bizFlowWriteBackRule（回写）
submit	单据提交时触发	bizFlowPushRule（推单）
unsubmit	单据撤回时触发	bizFlowPushRule（推单）

配置示例：

save 时触发 bizFlowWriteBackRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029100', 'common', 'save', 'bizFlowWriteBackRule', '50.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

delete 时触发 bizFlowWriteBackRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029112', 'common', 'delete', 'bizFlowWriteBackRule', '50.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

audit 时触发 bizFlowWriteBackRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029113', 'common', 'audit', 'bizFlowWriteBackRule', '50.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

unaudit 时触发 bizFlowWriteBackRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029114', 'common', 'unaudit', 'bizFlowWriteBackRule', '50.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

save 时触发 bizFlowPushRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029115', 'common', 'save', 'bizFlowPushRule', '50.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

delete 时触发 bizFlowPushRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029116', 'common', 'delete', 'bizFlowPushRule', '50.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

submit 时触发 bizFlowPushRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029117', 'common', 'submit', 'bizFlowPushRule', '50.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

unsubmit 时触发 bizFlowPushRule：

**INSERT INTO **cloud_uitemplate.billruleregister (id, billnum, **action**,

ruleId, iorder, overrule, tenant_id, **key**, isSystem, url, isSync,

isAsyn, config, **domain**, dataRule, mock) **VALUES **('3029118', 'common', 'unsubmit', 'bizFlowPushRule', '50.00', NULL, 'dw72i0vh', NULL, b'1', NULL, '0', '0', NULL, NULL, NULL, NULL);

单据联查配置

联查配置数据分为两个表，bill_relation、bill_relation_config。

bill_relaiton_config 表保存单据基础信息，包括单据号、别名、所属领域等。详细字段如下：

字段	类型	名称	备注
Id	String	主键
cBillNo	String	单据号
cName	String	单据名
cName_resid	String	单据名多语资源 id
cBillNoAlias	String	单据别名
domain	String	领域
subid	String	应用
billType	String	单据类型
srvUrl	String	跳转 url
menuCode	String	菜单 code
requestType	String	查询数据请求类型默认：meta，非微服务用：rest
requestUrl	String	rest 地址
Pubts	Date	修改时间
fullName	String	单据实体 uri	requestType 为 meta 时必填
billIdField	String	单据 id 字段	必填
billCodeField	String	单据 code 字段	必填
billDateField	String	单据日期字段	必填（若没有填 ~）
requestUrl	String	数据请求地址	requestType为 rest 时必填
excludeBill	String	过滤单据	可空

bill_relaiton 表保存上下游单据之间的关系信息，包括来源单据号、目标单据号、关联字段等。详细字段如下：

字段	类型	名称	备注
Id	String
sourceBillNumber	String	来源单据号	可能为别名
sourceRealBillNumber	String	来源单据号
sourceBillName	String	来源单据名
sourceBillName_resid	String	来源单据多语资源id
sourceTable	String	来源单据表
sourceChildKey	String	来源子表 key
sourceRelatedField	String	来源单据关联字段
bizcoditions	String	来源单据查询附加条件
sourceBillIdField	String	来源单据 id 字段
sourceBillCodeField	String	来源单据 code 字段
sourceVouchdate	String	来源单据日期字段
targetBillNumber	String	目标单据号
targetRealBillNumber	String	目标单据号
targetBillName	String	目标单据名
targetBillName_resid	String	目标单据多语资源id
targetTable	String	目标单据表
targetChildKey	String	目标单据子表
targetRelatedField	String	目标单据关联字段
tarBizConditions	String	目标单据条件
targetFilter	String	目标单据过滤
targetBillIdField	String	目标单据 id
targetBillCodeField	String	目标单据 code
targetVouchdate	String	目标单据日期字段
withPartitionable	String	是否分词，影响删除标记
subid	String	应用 id
system	String	是否系统预置
type	String	查询数据请求类型默认：meta，非微服务用：rest
pubts	Date	修改时间
API 说明
业务流的接口会校验 yht_access_token，调用接口时保证 Header 或 Cookie 里有

yht_access_token

以下主要介绍自定义业务流相关的接口
以/bizFlow 开头的接口是业务流 SDK 中的接口，请求地址为本领域地址
以/iuap-yonbuilder-businessflow 开头的接口是业务流服务中的接口，请求地址为业务流服务地址
全局联查接口

后端通过 com.yonyou.ucf.mdd.ext.billrelation.controller 暴露接口，前端使用 Post 请求调用联查接口 billrelation/map。HTTP 示例请求如下：

请求方式： POST

请求路径： /mdf-node/uniform/billrelation/map Cookie: yht_access_token=xxxxxxxxxxxxxx;

Header: domain-Key:udinghuo 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
billNumber	String	单据编码	true	voucher_saleinvoice
billId		单据 id	true	2288519204246272

返回数据中，顶层为根节点信息。

在根节点中使用 upperNodes 保存所有上游节点信息。在根节点中使用 downNodes 保存所有下游信息。

upperNodes、downNodes 节点中使用 nodes 保存进一步的上下游节点信息。请求示例：

{

"billNumber": "voucher_saleinvoice", "billId": 2288519204246272

}

响应示例：

{

"code":200, "message":"操作成功", "data":{

"billNumber":"voucher_saleinvoice", "billName":" 销 售 发 票 ", "billName_resid":"P_YS_PF_GZTSYS_0000012527", "billId":"2288519204246272", "billCode":"TI0528210605000001",

"vouchdate":"2021-06-05", "domain":"udinghuo", "menuCode":"saleinvoice", "isCrossDomain":false, "upperNodes":[

{

"billNumber":"voucher_delivery", "billName":" 销 售 发 货 单 ", "billName_resid":"P_YS_SCM_PU_0000028211", "billId":"2288517991322368", "billCode":"FHD0528210605000001",

"vouchdate":"2021-06-05", "domain":"udinghuo", "menuCode":"deliveryOrderList", "isCrossDomain":false, "nodes":[

{

"id":"voucher_order_2288516876620800", "billNumber":"voucher_order", "billName":"销售订单",

"billName_resid":"P_YS_PF_GZTSYS_0000012702", "billId":"2288516876620800",

"billCode":"UO-20210605000001",

"vouchdate":"2021-06-05", "domain":"udinghuo", "menuCode":"orderList", "isCrossDomain":false, "requestType":"meta"

}

],

"requestType":"meta"

}

],

"downNodes":[

{

"billNumber":"arap_oar",

"billName":" 应 收 事 项 ", "billName_resid":"P_YS_PF_GZTSYS_0000013496", "billId":"2288519610077440", "billCode":"TI0528210605000001",

"vouchdate":"2021-06-05", "fullName":"arap.oar.OarMain", "srvUrl":"fidomain", "domain":"yonyoufi", "menuCode":"marap0008", "isCrossDomain":false, "requestType":"meta"

}

],

"requestType":"meta"

}

}

联查配置保存或更新（低代码单据保存serviceCode）

接口类型： REST 请求方式： POST

请求路径： {domain.iuap-yonbuilder-businessflow}/billRelationConfig/save 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
cBillNo	String	单据号	true
cName	String	单据名称	true
cName_resid	String	单据名称多语	false
cBillNoAlias	String	单据别名	false
tenantId	String	租户	true
domain	String	单据所属领域	true
subid	String	单据所属应用	true
menuCode	String	单据 service Code	true
srvUrl	String	服务 url，低代码没有传空串	true
fullName	String	实体 uri	true
billIdField	String	单据 id 字段，默认值 id	false
billCodeField	String	单据编码字段，默认值 ~	false
billDateField	String	单据日期字段，默认值 pubts	false
excludeBill	String	联查过滤单据	false

请求示例：

{

"cBillNo": "c020ed3a", "cName": "销售前置订单",

"cName_resid": "", "domain": "developplatform",

"fullName": "GT42592AT32.GT42592AT32.xsqzdd",

"menuCode": "e7ad5644-f925-4a45-8252-ce5f269ff0ea", "pubts": "2021-09-02 16:58:30",

"requestType": "meta", "srvUrl": "",

"subid": "GT42592AT32",

"tenantId": "lb8wswv4"

}

响应示例：

{

"data":{

},

"desc":"OK", "flag":0, "msgSuccess":true

}

查询联查日志

联查的日志可以通过接口获取。通过查询联查日志，可以快速定位问题。 请求方式： POST

请求路径： /mdf-node/uniform/billrelation/logs Cookie: yht_access_token=xxxxxxxxxxxxxx; Header: domain-Key:udinghuo

注册专业版引擎地址（默认已配置）

业务流是以单据为核心，通过配置规则对单据数据进行流转。业务流会调用单据所在系统的接口对单据进行一系列操作。因此在低代码平台新建的专业版引擎需要注册引擎所在地址，接口如下： 接口类型： REST

请求方式： POST

请求路径： /config/init 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
name	String	配置名称	true	专业版 / yonbuilder1026
nameEng	String	名称多语	false	{"en": "CustomBuilding","zh-TW":"自訂擴展","zh-CN":"自定义扩展"}
code	String	专业版引擎 domain	true	yonbuilder1026
domain	String	专业版引擎 domain	true	yonbuilder1026
type	Integer		true	固定为 1
value	String	专业版引擎后端地址	true	http://172.20.50.246:8081

请求示例：

[

{

"name": " 专 业 版 ", "code": "yonbuilder1026",

"domain": "yonbuilder1026", "type": 1,

"value": "http://172.20.50.246:8081"

}

]

响应示例：

{

"data":{

},

"desc":"OK", "flag":0, "msgSuccess":true

}

获取业务流列表

接口类型： REST 请求方式： GET

请求路径： /businessFlow/list

请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
tenantId	String	租户 Id	true
subId	String	应用 Id	false	GT38159AT6
index	String	从第几条开始	true
size	String	页面大小	true

响应参数：

参数名称	参数类型	参数说明	示例值
billCode	String	领域 code+billNum
content	String	流程设计器图形数据
createTime	long	创建时间
describe	String	描述
entranceCtrl	boolean	入口控制
isCurrentVersion	boolean	是否当前版本
isPreset	boolean	是否预制
isVerSupport	boolean	是否启用多版本支持
name	String	业务流程名称
status	boolean	停用启用
subId	String	应用 Id
tenantId	String	所属租户
transactionTypeId	String	交易类型 Id
transactionTypeName	String	交易类型 name
updateTime	long	更新时间
userId	String	用户 Id
userName	String	用户名
version	String	流程版本号

请求示例：

/flow/businessFlow/list?tenantId=rqkwv8uj&subId=GT40829AT16&index=1&size=10 响应示例：

{

"data":{

"total":1,

"pageData":[

{

"billCode":"ST.st_purinrecord", "content":"", "createTime":1604383627000, "describe":"采购入库单、材料出库单", "entranceCtrl":false,

"id":"cd3a7f33-1d9a-11eb-8d5f-0624d60000dc", "isCurrentVersion":true,

"isPreset":false, "isVerSupport":false, "name":"入库出库", "status":true, "subId":"GT40829AT16",

"tenantId":"rqkwv8uj", "transactionTypeId":"1976730545852672", "transactionTypeName":"直接材料出", "updateTime":1604383966000,

"userId":"f10af0f9-7e5b-40a4-a511-55ee1d21236d", "userName":"19902588888",

"version":"V1.0"

}

]

},

"desc":"OK", "flag":0, "msgSuccess":true

}

根据 Id 获取业务流

接口类型： REST 请求方式： GET

请求路径： /businessFlow/getById 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
id	String	业务流程 id	true

响应参数：

参数名称	参数类型	参数说明	示例值
billCode	String	领域 code+billNum
content	String	流程设计器图形数据
createTime	long	创建时间
describe	String	描述
entranceCtrl	boolean	入口控制
isCurrentVersion	boolean	是否当前版本
isPreset	boolean	是否预制
isVerSupport	boolean	是否启用多版本支持
name	String	业务流程名称
status	boolean	停用启用
subId	String	应用 Id
tenantId	String	所属租户
transactionTypeId	String	交易类型 Id
transactionTypeName	String	交易类型 name
updateTime	long	更新时间
userId	String	用户 Id
userName	String	用户名
version	String	流程版本号

请求示例：

/flow/businessFlow/getById?id=8669db73-0131-11eb-8d5f-0624d60000dc 响应示例：

{

"data":{

"billCode":"ST.st_purinrecord", "content":"", "createTime":1601259778000, "describe":"目列表、来列表", "entranceCtrl":false,

"id":"8669db73-0131-11eb-8d5f-0624d60000dc",

"isCurrentVersion":true, "isPreset":false,

"isVerSupport":false, "name":" 来 目 ", "status":true, "subId":"GT18307AT12",

"tenantId":"c2w60ge7", "updateTime":1604022183000,

"userId":"989ac042-8376-43a7-affb-0a82ba400a72", "userName":"zyy",

"version":"V1.0"

},

"desc":"OK", "flag":0, "msgSuccess":true

}

获取流程单据信息

接口类型： REST 请求方式： GET

请求路径： /flowBill/getByBusinessFlowIdAndNodeId 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
businessFlowId	String	业务流流程 id	true
nodeId	String	节点 Id	true

响应参数：

参数名称	参数类型	参数说明	示例值
billDes	String	单据描述
billSubId	String	单据所在应用 Id
billType	String	领域 code+billNum
businessFlowId	String	业务流程 Id
businessFlowName	String	业务流程 name
createTime	long	创建时间
updateTime	long	更新时间
id	String	流程单据 Id
nodeId	String	节点 Id
isSelfMake	boolean	是否自制
isCoreBill	boolean	是否核心单据
isStartBill	boolean	是否起始单据
refMakeBill	boolean	参照生单
tenantId	String	租户 Id
transactionTypeId	String	交易类型 Id
transactionTypeName	String	交易类型 name

请求示例：

/flow/flowBill/getByBusinessFlowIdAndNodeId?businessFlowId=8669db73-0131-11eb-8d5f-062 4d60000dc&nodeId=billItemNode_6fbcca8b-ec19-40d2-98c0-33fd7dcdf29b

响应示例：

{

"data":{

"billDes":"签到单据列表", "billSubId":"GT18307AT12",

"billType":"developplatform.c453016cList", "businessFlowId":"8669db73-0131-11eb-8d5f-0624d60000dc", "businessFlowName":" 业 务 流 程 ", "createTime":1601259865000,

"id":"ba0f67ad-0131-11eb-8d5f-0624d60000dc", "isSelfMake":true,

"nodeId":"billItemNode_6fbcca8b-ec19-40d2-98c0-33fd7dcdf29b", "refMakeBill":true,

"tenantId":"c2w60ge7", "transactionTypeId":"", "transactionTypeName":""

},

"desc":"OK", "flag":0, "msgSuccess":true

}

根据节点 Id 获取流程分支

接口类型： REST 请求方式： GET

请求路径： /flowBranch/getByNodeId

请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
nodeId	String	节点 id	true

响应参数：

参数名称	参数类型	参数说明	示例值
id	String	流程分支 Id
tenantId	String	租户 Id
nodeId	String	节点 Id
ruleNodeId	String	规则节点 Id
businessFlowId	String	业务流程 Id
businessFlowName	String	业务流程 name
expression	String	公式
expressionDisplay	String	显示公式
createTime	long	创建时间
updateTime	long	更新时间

请求示例：

/flow/flowBranch/getByNodeId?nodeId=inclusiveGateway_5fabd95c-34fd-4b42-8644-347c51424 4bf

响应示例：

{

"data":[

{

"businessFlowId":"8669db73-0131-11eb-8d5f-0624d60000dc", "businessFlowName":"来目",

"createTime":1604408788000, "expression":"mingcheng==" 小 明 "", "expressionDisplay":" 名 称 ==" 小 明 "", "id":"62b346d5-1dd5-11eb-8d5f-0624d60000dc",

"nodeId":"inclusiveGateway_5fabd95c-34fd-4b42-8644-347c514244bf", "ruleNodeId":"7b58939b-32eb-48e4-98c4-35a331d4cea7", "tenantId":"c2w60ge7"

}

],

"desc":"OK", "flag":0, "msgSuccess":true

}

根据规则节点Id 获取流程分支

接口类型： REST 请求方式： GET

请求路径： /flowBranch/getByRuleNodeId 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
ruleNodeId	String	规则节点 Id	true

响应参数：

参数名称	参数类型	参数说明	示例值
id	String	流程分支 Id
tenantId	String	租户 Id
nodeId	String	节点 Id
ruleNodeId	String	规则节点 Id
businessFlowId	String	业务流程 Id
businessFlowName	String	业务流程 name
expression	String	公式
expressionDisplay	String	显示公式
createTime	long	创建时间
updateTime	long	更新时间

请求示例：

/flow/flowBranch/getByRuleNodeId?ruleNodeId=7b58939b-32eb-48e4-98c4-35a331d4cea7 响应示例：

{

"data":[

{

"businessFlowId":"8669db73-0131-11eb-8d5f-0624d60000dc", "businessFlowName":"来目",

"createTime":1604408788000, "expression":"mingcheng=="小明"", "expressionDisplay":"名称=="小明"",

"id":"62b346d5-1dd5-11eb-8d5f-0624d60000dc",

"nodeId":"inclusiveGateway_5fabd95c-34fd-4b42-8644-347c514244bf", "ruleNodeId":"7b58939b-32eb-48e4-98c4-35a331d4cea7", "tenantId":"c2w60ge7"

}

],

"desc":"OK", "flag":0, "msgSuccess":true

}

根据节点Id 获取规则列表

接口类型： REST 请求方式： GET

请求路径： /flowRule/list 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
businessFlowId	String	业务流流程 id	true
nodeId	String	节点 id	true

响应参数：

参数名称	参数类型	参数说明	示例值
id	String	id
ruleId	String	规则 Id
name	String	名称
nameStr	String	名称多语
tenantId	String	租户 id
nodeId	String	节点 id
businessFlowId	String	业务流 Id
businessFlowName	String	业务流名称
pushRuleType	int	推送类型：0 推单、6 拉单、9 回写
pushOpportunity	int	推送时机：0:单据生效、1:环节生效、2:手工推送、 3:流程操作、4:单据动作
pushOpportunityStr	String	推送时机 json
pushMode	int	推送方式：0 新增单据、1 仅更新单据、2 更新或新增
verifyState	int	单据状态 0:草稿态 1:提交态
targetConditions	String	目标单据范围的条件
showConvertedBill	boolean	是否显示转单画面
originType	String	源表单模板 id
originDes	String	源表单模板名称
originSubId	String	源表单域
originDomain	String	源表单域
originBillType	String	源单类型
originFlowBillNodeId	String	来源 flowBillNodeId
targetType	String	目标表单模板 id
targetDes	String	目标表单模板名称
targetSubId	String	目标表单域
targetDomain	String	目标表单域
targetBillType	String	目标单类型
targetFlowBillNodeId	String	目标 flowBillNodeId
expression	String	公式
expressionDisplay	String	公式前端展示
dataItems	String	字段对应关系 json
groupItems	String	分组规则 json
collectItems	String	汇总规则 json
filterItems	String	公式过滤规则 json
pushTimeType	int	推送时间类型:0 即时推送、1 定时推送
timeSetting	String	定时设置 json
status	boolean	状态,停用，启用
locale	String	语言
order	int	顺序
description	String	描述
descriptionStr	String	描述多语
createUserType	int	推送人类型:0 推送触发人、1 指定用户、2 表单字段
createUserId	String	推送人 id
createUserName	String	推送人姓名
createTime	long	创建时间
updateTime	long	修改时间

请求示例：

flow/flowRule/list?businessFlowId=8669db73-0131-11eb-8d5f-0624d60000dc&nodeId=d5d8f375

-3e78-49cc-be4a-f14d197e1e17

响应示例：

{"data":[{"businessFlowId":"8669db73-0131-11eb-8d5f-0624d60000dc","businessFlowName":" 来目

","collectItems":"[]","createTime":1601259865000,"createUserId":"989ac042-8376-43a7-af fb-0a82ba400a72","createUserName":"zyy","createUserType":"0","dataItems":"[{"originTa bleCode":"yzylai_1934291112382720","mapped_relation":0,"target_field":"mubiaom ingzi","target_field_display":"mubiaomingzi","target_field_name":"目标名字

","calculate_formulas":"","calculate_formulas_display":"","mapped_type":"0

","origin_field":"mingcheng","origin_field_display":"mingcheng","origin_fiel d_name":"名称

","isSys":false,"is_edit":1,"targetTableCode":"yzymubiao_1934290855956736"," target_field_type":"input","origin_field_type":"input"},{"originTableCode":" yzylai_1934291112382720","mapped_relation":0,"target_field":"mubiaoshuzi","tar get_field_display":"mubiaoshuzi","target_field_name":"目标数字

","calculate_formulas":"","calculate_formulas_display":"","mapped_type":"0

","origin_field":"shuzi","origin_field_display":"shuzi","origin_field_name":

"数字

","isSys":false,"is_edit":1,"targetTableCode":"yzymubiao_1934290855956736"," target_field_type":"numberwidget","origin_field_type":"numberwidget"}]","descri ption":"","descriptionStr":"{"zhs":"","zht":"","en":""}","expression":""," expressionDisplay":"","filterItems":"[{"isItemSub":false,"expression":"","expre ssionDisplay":""}]","groupItems":"[]","id":"ba12833a-0131-11eb-8d5f-0624d60000dc","

name":"推","nameStr":"{"zhs":"推","zht":"推","en":"推

"}","nodeId":"d5d8f375-3e78-49cc-be4a-f14d197e1e17","order":1,"originBillType":"0","o riginDes":"来列表","originDomain":"developplatform","originFlowBillNodeId":"billItemNode_757a806f-57bf- 4094-b549-5f36e2506060","originSubId":"GT18307AT12","originType":"developplatform.5668 6010","pushMode":"0","pushOpportunity":"2","pushOpportunityStr":"","pushRuleType":"0", "pushTimeType":"0","ruleId":"customRule","showConvertedBill":false,"targetBillType":"0 ","targetConditions":"[{"targetFieldId":"mubiaomingzi","targetFieldName":"mubia omingzi","targetFieldType":"0","targetSubFormId":"","targetSubFormName":"\ ","matchRelation":"=","matchRelationDisplay":"=","originTableCode":"yzylai_ 1934291112382720","sourceFieldId":"shuzi","sourceFieldName":"shuzi","sourceF ieldType":"0","sourceSubFormName":"","order":0}]","targetDes":"目列表","targetDomain":"developplatform","targetFlowBillNodeId":"billItemNode_6fbcca8b-ec19- 40d2-98c0-33fd7dcdf29b","targetSubId":"GT18307AT12","targetType":"developplatform.c453 016cList","tenantId":"c2w60ge7","timeSetting":"{"pushTimeSource":0,"pushTimeFieldId

":"","pushTimeFieldName":"","pushTimeFieldType":0,"pushFrequency":0,"pushT imeDelay":0,"pushTimeHour":"","pushTimeDate":"","cronExpression":"","pus hTimePeriod":0,"pushEndTime":"","pushTimeInterval":0,"pushDateArray":""}"," updateTime":1604022183000,"verifyState":0}],"desc":"OK","flag":0,"msgSuccess":true}

获取流程日志列表

接口类型： REST 请求方式： GET

请求路径： /pushItem/list 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
tenantId	String	租户 id	true
bizFlowId	String	业务流程 Id	false
subId	String	所属应用 Id	false
index	int	第几页	true
size	int	页面大小	true

响应参数：

参数名称	参数类型	参数说明	示例值
code	String	响应编码
data	Object	操作的主要信息
message	String	返回信息

请求示例：

/flow/pushItem/list?tenantId=c2w60ge7&bizFlowId=8669db73-0131-11eb-8d5f-0624d60000dc&s ize=10&index=1

响应示例：

{"data":{"total":31,"pageData":[{"bizFlowId":"8669db73-0131-11eb-8d5f-0624d60000dc","b izFlowName":"来目","bizFlowVersion":"V1.0","createTime":1604375616000,"createUserId":"989ac042-8376-43a 7-affb-0a82ba400a72","createUserName":"zyy","errorMsg":"","flowRuleId":"ba12833a-0131- 11eb-8d5f-0624d60000dc","flowRuleName":"推

","id":"0347f38b-a4e9-425d-9539-8500bd73edb9","nodeId":"d5d8f375-3e78-49cc-be4a-f14d19 7e1e17","pushRuleType":"0","sourceBillData":"{"tenant_id":"c2w60ge7","creator":\ "989ac042-8376-43a7-affb-0a82ba400a72","createTime":"2020-10-29 10:18:50","mingcheng":"哈哈哈哈

","creator_userName":"zyy","_keyName":"id","_entityName":"GT18307AT12.GT18 307AT12.yzyLai","id":"1978170237473024","pubts":"2020-10-29

10:18:50","_status":"Unchanged","isFlowCoreBill":false}","sourceBillId":"197817 0237473024","sourceBillName":"来列表","sourceBillNum":"developplatform.56686010","sourceSubId":"GT18307AT12","status":true, "targetBillName":"目列表","targetBillNum":"developplatform.c453016cList","targetSubId":"GT18307AT12","tenantId ":"c2w60ge7"}]},"desc":"OK","flag":0,"msgSuccess":true}

单条单据推单

接口类型： REST 请求方式： POST

请求路径： /bizflow/push 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
billnum	String	单据编码	true
data	List<Map<String, Object>>	单据数据	true
custMap	Map<String,Object>	businessFlowId、tenantId、ruleId, 联合下面参数必须出现一次	false
businessFlowId	String	业务流流程 id	false
ruleId	String	业务流规则 id	false
billnum	String	单据编码	false
sourceDomainKey	String	来源单据领域	false

响应参数：

参数名称	参数类型	参数说明	示例值
code	String	响应编码，200 为全部或部分推送成功500 为全部失败
data	Object	操作的主要信息， 主要包括：count：本次操作单据总数dimensionKeys：拉单缓存数据errors： 错 误 信 息 failCount：失败条数successCount：成功条数skipCount：跳过条数unConvertBillList：转换失败的单据数据
message	String	返回信息

请求示例：

{

"billnum":"56686010List",

"data":"[{"mingcheng":"A1","shuzi":1,"tenant_id":"c2w60ge7","isFlowCoreBill":false,"id ":"1937453662376192","pubts":"2020-09-30 15:59:47"}]",

"custMap":{

"businessFlowId":"2180be73-09d7-11eb-8d5f-0624d60000dc", "tenantId":"c2w60ge7",

"ruleId":"35706806-09d7-11eb-8d5f-0624d60000dc"

}

}

响应示例：

{

"code":200,

"data":{

"bills":[], "count":1, "dimensionKeys":[],

"errorMsg":"",

"errors":[], "failCount":0, "infos":[],

"messages":[], "skipCount":0, "successCount":1,

"sucessCount":1, "unConvertBillList":[]

},

"message":"操作成功"

}

多条单据推单

接口类型： REST 请求方式： POST

请求路径：/bizflow/batchPush 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
billnum	String	单据编码	true
data	List	单据数据	true
custMap	Map<String,Object>	businessFlowId、tenantId、ruleId, 联合下面参数必须出现一次	false
businessFlowId	String	业务流流程 id	false
ruleId	String	业务流规则 id	false
billnum	String	单据编码	false
sourceDomainKey	String	来源单据领域	false

响应参数：

参数名称	参数类型	参数说明	示例值
code	String	响应编码，200 为全部或部分推送成功500 为全部失败
data	Object	操作的主要信息， 主要包括：count：本次操作单据总数dimensionKeys：拉单缓存数据errors： 错 误 信 息 failCount：失败条数successCount：成功条数skipCount：跳过条数unConvertBillList：转换失败的单据数据
message	String	返回信息

请求示例：

{

"billnum":"56686010List",

"data":"[{"mingcheng":"B1","shuzi":11,"tenant_id":"c2w60ge7","isFlowCoreBill":false,"i d":"1949925412376832","pubts":"2020-10-09

11:26:42"},{"mingcheng":"A1","shuzi":1,"tenant_id":"c2w60ge7","isFlowCoreBill":false," id":"1937453662376192","pubts":"2020-09-30 15:59:47"}]",

"custMap":{

"businessFlowId":"2180be73-09d7-11eb-8d5f-0624d60000dc", "tenantId":"c2w60ge7",

"ruleId":"35706806-09d7-11eb-8d5f-0624d60000dc"

}

}

响应示例：

{

"code":200,

"data":{

"bills":[], "count":2, "dimensionKeys":[],

"errorMsg":"["不满足数据范围公式条件，无需下推！"]", "errors":[

"不满足数据范围公式条件，无需下推！"

],

"failCount":1, "infos":[],

"messages":[], "skipCount":0, "successCount":1, "sucessCount":1, "unConvertBillList":[

{

"msg":"不满足数据范围公式条件，无需下推！", "originData":{

"tenant_id":"c2w60ge7",

"creator":"989ac042-8376-43a7-affb-0a82ba400a72", "createTime":"2020-10-09 11:26:42",

"mingcheng":"B1", "creator_userName":"zyy", "_keyName":"id", "shuzi":11,

"_entityName":"GT18307AT12.GT18307AT12.yzyLai", "id":"1949925412376832",

"pubts":"2020-10-09 11:26:42",

"_status":"Unchanged", "isFlowCoreBill":false

}

}

]

},

"message":"操作成功"

}

根据单据数据查找适用的业务流规则

接口类型： REST 请求方式： POST

请求路径： /bizflow/searchRule 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
billnum	String	单据编码	true
data	List<Map<String, Object>>	单据数据	true

响应参数：

参数名称	参数类型	参数说明	示例值
code	String	HTTP 响应编码
data	Object	查询到的所有规则
message	String	返回信息

请求示例：

{

"billnum":"56686010List",

"data":"[{"tenant_id":"c2w60ge7","mingcheng":"A1","shuzi":1,"id":"1937453662376192","p

ubts":"2020-09-30 15:59:47","isFlowCoreBill":false,"_id":"rowId_4"}]"

}

响应示例：

{

"code":200,

"data":[

{

"originSubId":"GT18307AT12",

"createUserId":"989ac042-8376-43a7-affb-0a82ba400a72", "pushOpportunityStr":"", "nameStr":"{"zhs":"push","zht":"push","en":"push"}", "pushMode":"0",

"expressionDisplay":"", "description":"", "createUserName":"zyy",

"targetFlowBillNodeId":"billItemNode_018f6bea-8501-4d87-a10c-7b1e0d4bde84", "originDes":"来",

"targetDomain":"developplatform", "businessFlowId":"2180be73-09d7-11eb-8d5f-0624d60000dc", "filterItems":"",

"dataItems":"", "createUserType":"0",

"id":"35706806-09d7-11eb-8d5f-0624d60000dc",

"ruleId":"customRule", "pushOpportunity":"2", "order":1, "businessFlowName":"测试", "expression":"",

"targetDes":"目",

"originFlowBillNodeId":"billItemNode_e8325a38-5b44-4d13-9038-feb1b4cf4c91", "targetType":"developplatform.c453016c", "updateTime":1602213982000,

"originBillType":"0", "originDomain":"developplatform", "targetConditions":"", "verifyState":0, "pushTimeType":"0",

"originType":"developplatform.56686010", "showConvertedBill":false, "targetBillType":"0",

"collectItems":"", "createTime":1602210548000, "pushRuleType":"0",

"name":"push", "tenantId":"c2w60ge7", "groupItems":"",

"nodeId":"d89a7463-4368-4fd1-823c-aef34deab29f", "targetSubId":"GT18307AT12", "descriptionStr":"{"zhs":"","zht":"","en":""}"

}

],

"message":"操作成功"

}

根据单据数据查找适用的业务流规则（非SDK 接口）

接口类型： REST 请求方式： POST

请求路径： /iuap-yonbuilder-businessflow/businessConvert/searchRule 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
billCode	Strin g	单据 Code，	true	6a8b55f9
billNum	Strin g	单据编码	true	6a8b55f9
domain	Strin g	所属领域	true	developplatform
pushOpportun ity	int	操作时机，0:单据生效、1:环节生效、2:手工推送、3:流程操作、4:单据动作， 默认为 2	true	2
ruleType	int	规则类型枚举，0：推单、6：拉单、9：回写	true
sourceBills	List< Map<S tring,Objec t>>	源单数据	true
tenantId	Strin g	租户 Id	true
token	Strin g	友互通 token	false

请求示例：

{

"billCode":"developplatform.56686010", "billNum":"56686010",

"domain":"developplatform", "pushOpportunity":2, "ruleType":0, "sourceBills":[

{

"tenant_id":"c2w60ge7", "mingcheng":"A2",

"_keyName":"id", "shuzi":22,

"_entityName":"GT18307AT12.GT18307AT12.yzyLai", "id":"1937461430096128",

"pubts":"2020-09-30 16:07:41",

"_status":"Unchanged", "isFlowCoreBill":false

}

],

"tenantId":"c2w60ge7"

}

响应示例：

{

"code":200,

"data":[

{

"originSubId":"GT18307AT12",

"createUserId":"989ac042-8376-43a7-affb-0a82ba400a72", "pushOpportunityStr":"", "nameStr":"{"zhs":"push","zht":"push","en":"push"}", "pushMode":"0",

"expressionDisplay":"", "description":"", "createUserName":"zyy",

"targetFlowBillNodeId":"billItemNode_018f6bea-8501-4d87-a10c-7b1e0d4bde84", "originDes":"来",

"targetDomain":"developplatform", "businessFlowId":"2180be73-09d7-11eb-8d5f-0624d60000dc", "filterItems":"",

"dataItems":"", "createUserType":"0",

"id":"35706806-09d7-11eb-8d5f-0624d60000dc",

"ruleId":"customRule", "pushOpportunity":"2", "order":1, "businessFlowName":"测试", "expression":"",

"targetDes":"目",

"originFlowBillNodeId":"billItemNode_e8325a38-5b44-4d13-9038-feb1b4cf4c91", "targetType":"developplatform.c453016c", "updateTime":1602213982000,

"originBillType":"0", "originDomain":"developplatform", "targetConditions":"", "verifyState":0, "pushTimeType":"0",

"originType":"developplatform.56686010", "showConvertedBill":false, "targetBillType":"0",

"collectItems":"", "createTime":1602210548000, "pushRuleType":"0",

"name":"push", "tenantId":"c2w60ge7", "groupItems":"",

"nodeId":"d89a7463-4368-4fd1-823c-aef34deab29f", "targetSubId":"GT18307AT12", "descriptionStr":"{"zhs":"","zht":"","en":""}"

}

],

"message":"操作成功"

}

重试转换

接口类型： REST 请求方式： POST

请求路径： /iuap-yonbuilder-businessflow/businessConvert/retry

接口说明： 根据流程日志重新尝试推送或回写，一般用于操作失败的流程日志请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
pushItemId	String	推送日志 Id	true

响应参数：

参数名称	参数类型	参数说明	示例值
code	String	HTTP 响应编码
data	Object	返回数据
flag	int	成功标志位
msgSuccess	Boolean	是否成功

请求示例：

/flow/businessConvert/retry?pushItemId=612ba4de-eb55-478a-b179-3431761736dd 响应示例：

{

"data":{

},

"desc":"OK", "flag":0, "msgSuccess":true

}

根据转换参数批量转换

接口类型： REST 请求方式： POST

请求路径： /iuap-yonbuilder-businessflow/businessConvert/pushConvert 请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
billCode	String	单据 Code	false	6a8b55f9
billNum	String	单据编码	ture	6a8b55f9
businessFlowId	String	业务流 Id	false
domain	String	所属领域	true
operate	String	操作编码，对应规则的pushOpportunityStr 字段	true	bizflowbatchpush
pushOpportunity	int	操作时机，0:单据生效、1:环节生效、2:手工推送、3:流程操作、4:单据动作，默认为 2	false
retry	boolean	是否来自重试转换， 若为 true，则不会判断时机是否合适，且不会查询单据，默认false	false
needQueryBill	boolean	是否查询单据，false时转换直接使用sourceBills 的 数 据，默认 true	false
autoSave	boolean	转换后是否保存单 据，默认 true，若开启转单画面，则此配置不生效	false
ruleId	String	规则 Id，未指定会查询所有规则	false
ruleType	int	规则类型枚举，0：推单、6：拉单、9： 回写	true
sourceBills	List<Map<String, Object>>	源单数据	false
sourceIds	List	源单 Id	true
subId	String	应用 Id, domain 为developplatfrom 时不必填	true
tenantId	String	租户 Id	true
token	String	友互通 token	true

响应参数：

参数名称	参数类型	参数说明	示例值
data	String	返回数据，主要字段为： count： 总 数 failCount：失败数量successCount：成功数量unConvertBillList：转换失败的单据数据
desc	Object	返回数据
flag	int	成功标志位
msgSuccess	Boolean	是否成功

请求示例：

{

"billCode":"developplatform.56686010", "billNum":"56686010",

"businessFlowId":"8669db73-0131-11eb-8d5f-0624d60000dc", "domain":"developplatform", "operate":"bizflowbatchpush",

"pushOpportunity":2, "retry":false,

"ruleId":"ba12833a-0131-11eb-8d5f-0624d60000dc", "ruleType":0,

"sourceBills":[

{

"tenant_id":"c2w60ge7", "mingcheng":"A2",

"_keyName":"id", "shuzi":22,

"_entityName":"GT18307AT12.GT18307AT12.yzyLai", "id":"1937461430096128",

"pubts":"2020-09-30 16:07:41",

"_status":"Unchanged", "isFlowCoreBill":false

}

],

"sourceIds":[

"1937461430096128"

], "subId":"GT18307AT12",

"tenantId":"c2w60ge7",

"token":"bttSmJoUVdXKzhZek5Mb2NYeU5LNVJpMVFNbGdUWDRrWVVqd3U4UDJQV1lVdlJMVmhHRTB6MnJqek VOQmt1OFN3SGx0V3I4bG90eUxicXZVcFc5NVRDcktZM3cyRDJvSjlIdS9za1ZQN0ZHRCtUWnNCV0NYWDNCUU1a

TGRicllha2NfX3U4Yy1zc28tZGFpbHkueXl1YXAuY29t a47cc1974aabf6022a617ed5e13073eb_1604130 263162"

}

响应示例：

{

"data": {

"billNum": "developplatform.c453016cList", "billType": "0",

"convertedBillList": [], "count": 1, "dimensionKeys": [],

"errors": [], "failCount": 0,

"id": "ed9eff8f-07ec-4978-be05-418428a07432",

"subId": "GT18307AT12",

"successCount": 1, "unConvertBillList": []

},

"desc": "OK", "flag": 0, "msgSuccess": true

}

根据转换参数批量转换（转后无保存或更新动作）

接口类型： REST 请求方式： POST

请求路径： /iuap-yonbuilder-businessflow/businessConvert/pushConvertWithoutSave 接口说明： 只会按照规则 id 进行转换，而不进行保存或更新操作

请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
billCode	String	单据 Code	true	6a8b55f9
billNum	String	单据编码	true	6a8b55f9
businessFlowId	String	业务流 Id	false
domain	String	所属领域	true
operate	String	操作编码，对应规则的pushOpportunityStr 字段	true	bizflowbatchpush
pushOpportunity	int	操作时机，0:单据生效、1:环节生效、2:手工推送、3: 流程操作、4:单据动作，默认为 2	false
retry	boolean	是否来自重试转换，若为 true，则不会判断时机是否合适，且不会查询单据，默认 false	false
needQueryBill	boolean	是否查询单据，false 时转换直接使用sourceBills 的数据， 默认 true	false
autoSave	boolean	转换后是否保存单据， 此接口默认 false	false
ruleId	String	规则 Id，未指定会查询所有规则	false
ruleType	int	规则类型枚举，0：推单、6：拉单、9： 回写	true
sourceBills	List<Map<String, Object>>	源单数据	false
sourceIds	List	源单 Id	true
subId	String	应用 Id, domain 为developplatfrom 时不必填	true
tenantId	String	租户 Id	true
token	String	友互通 token	true

响应参数：

参数名称	参数类型	参数说明	示例值
data	String	返回数据，主要字段为： count： 总 数 failCount：失败数量successCount：成功数量unConvertBillList：转换失败的单据数据
desc	Object	返回数据
flag	int	成功标志位
msgSuccess	Boolean	是否成功

请求示例：

{

"billCode":"developplatform.56686010", "billNum":"56686010",

"businessFlowId":"8669db73-0131-11eb-8d5f-0624d60000dc", "domain":"developplatform", "operate":"bizflowbatchpush",

"pushOpportunity":2, "retry":false,

"ruleId":"ba12833a-0131-11eb-8d5f-0624d60000dc", "ruleType":0,

"sourceBills":[

{

"tenant_id":"c2w60ge7", "mingcheng":"A2",

"_keyName":"id", "shuzi":22,

"_entityName":"GT18307AT12.GT18307AT12.yzyLai", "id":"1937461430096128",

"pubts":"2020-09-30 16:07:41",

"_status":"Unchanged", "isFlowCoreBill":false

}

],

"sourceIds":[

"1937461430096128"

], "subId":"GT18307AT12",

"tenantId":"c2w60ge7",

"token":"bttSmJoUVdXKzhZek5Mb2NYeU5LNVJpMVFNbGdUWDRrWVVqd3U4UDJQV1lVdlJMVmhHRTB6MnJqek VOQmt1OFN3SGx0V3I4bG90eUxicXZVcFc5NVRDcktZM3cyRDJvSjlIdS9za1ZQN0ZHRCtUWnNCV0NYWDNCUU1a

TGRicllha2NfX3U4Yy1zc28tZGFpbHkueXl1YXAuY29t a47cc1974aabf6022a617ed5e13073eb_1604130 263162"

}

响应示例：

{

"data": {

"billNum": "developplatform.c453016cList", "billType": "0",

"convertedBillList": [ "mingcheng":"A2", "shuzi":22, "_status":"Insert", "verifystate": 0,

"bizFlowId": "46376d79-de3a-11eb-a68a-0624d60000dc", "制单人": "zyy",

"bizFlowPushSign": "bizFlowPushSign",

"createuser": "989ac042-8376-43a7-affb-0a82ba400a72", "_status": "Insert",

"source_id": "2332474071699712",

"bizFlowName": " 测 试 业 务 流 ", "source_billtype": "developplatform.75ba4480", "isFlowCoreBill": true

],

"count": 1, "dimensionKeys": [],

"errors": [], "failCount": 0,

"id": "ed9eff8f-07ec-4978-be05-418428a07432", "subId": "GT18307AT12",

"successCount": 1, "unConvertBillList": []

},

"desc": "OK", "flag": 0, "msgSuccess": true

}

单据转换

接口类型： REST 请求方式： POST

请求路径： /iuap-yonbuilder-businessflow/businessConvert/convert

接口说明： 纯转换接口，无查单、过滤、分单等与流程相关的操作，转完的单据数据无业务流相关字段

请求参数：

参数名称	参数类型	参数说明	是否必填	示例值
sourceDataList	List<Map<String, Object>>	来源单据数据	true
sourceDomain	String	来源单据领域	true
sourceType	String	来源单据编码	true
targetDomain	String	目标单据领域	true
targetType	String	目标单据编码	true
dataItems	int	字段对应关系json	true

DataItem 实体字段说明：

字段	类型	名称	备注
origin_field	String	来源字段
origin_field_name	String	来源字段名	非必须
target_field	String	目标字段
target_field_name	String	目标字段名	非必须
mapped_type	Integer	0:简单映射、1:公式计算、3:常量、4： 选项、5：目标公式计算
calculate_formulas	String	公式表达式	非 必 须 ， mapped_type 为1 时必填
calculate_formulas_display	String	公式表达式显示值	非必须
childKey	String	目标子表（或孙表）
parentKey	String	目标子表的父表	只有childKey 为孙表时 parentKey 才有值
sourceChildKey	String	来源子表（或孙表）
sourceParentKey	String	来源子表的父表	只有sourceChildKey 为孙表时sourceParentKey 才有值
originTableCode	String	来源表 code	非必填
targetTableCode	String	目标表 code	非必填
seq	Integer	顺序
mapped_relation	Integer	映射关系	0：主对主1：主对子2：子对主3：子对子

响应参数：

参数名称	参数类型	参数说明	示例值
data	String	返回数据，主要字段为： count： 总 数 failCount：失败数量successCount：成功数量unConvertBillList：转换失败的单据数据
desc	Object	返回数据
flag	int	成功标志位
msgSuccess	Boolean	是否成功

请求示例：

{

"targetDomian": "iuap-iom-idmbiz", "sourceType": "iuap-iom-idmbiz.iam_mf_product", "dataItems": [

{

"is_edit": 0, "_status": "Unchanged", "mapped_relation": 0, "isHidden": false,

"rule_id": "1449229692088877065",

"subId": "PO", "isDeleted": false,

"target_field": "sourceType", "mapped_type": 3,

"id": "1449232621256572930",

"origin_field": "iam_mf_product", "category": "PO",

"pubts": "2022-05-20 00:00:00",

"isSys": true

},

{

"childKey": "orderProduct", "is_edit": 0,

"_status": "Unchanged", "mapped_relation": 3, "isHidden": false,

"rule_id": "1449229692088877065",

"subId": "PO", "isDeleted": false,

"target_field": "productUnitTruncationType", "mapped_type": 0,

"id": "1449821134855340041",

"origin_field": "main_productionUnitTruncationType", "category": "PO",

"pubts": "2022-05-20 00:00:00",

"isSys": true

}

],

"sourceDataList": [

{

"stockOrgCode": "1002",

"auxiliaryQuantity": 10.0, "code": "SCJK2022051600023",

"productionUnitCode": "01",

"mainUnitTruncationType": 0,

"mainUnitPrecision": 2,

"mainUnitCode": "01", "stockOrgName": "LJ 组织 0720", "orderByProduct": [

{

"auxiliaryQuantity": 10.0, "main_bomVersion": null, "main_originalType": null, "productionUnitPrecision": 2,

"quantity": 10.0, "productionUnitName": " 件 ", "productCode": "liujie00002",

}

],

"id": 1456701096954691589,

"pubts": "2022-05-17 18:12:09"

}

],

"sourceDomian": null, "targetType": "po_production_order"

}

响应示例：

{

"data": [

{

"departmentName": "产品部门", "orgName": "LJ 组 织 0720", "bizType": "productType", "billSource": "0",

"bizFlowPushSign": "bizFlowPushSign", "_status": "Insert",

"orgId": "2352278795260416",

"docSource": "0",

"vouchdate": "2022-05-14 00:00:00",

"first_id": 1456701096954691589,

"sourceType": "iam_mf_product", "source_id": 1456701096954691589,

"productionDepartmentId": "2419873273647360",

"status": "0"

}

],

"desc": "OK", "flag": 0, "msgSuccess": true

}

第五章 开放接口说明

RESTful 接口

业务流id 查询

根据单据类型和交易类型查询适用的业务流，只返回当前版本的流。

请求说明
请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/businessFlow/getFlowByBillNumAndTransTypeId
请求方式	GET
ContentType	application/json
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
请求参数
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用 token 企业自建获取 token 服务商获取 token
billNum	string	query	是	单据类型，适用以下单据类型：采购订单（st_purchaseorder）、采购发票（ st_purinvoice ）、采购入库单
名称	类型	参数位置	必填	描述
（ st_purinrecord ）、 其他出库单（ st_othoutrecord ）、其他入库单（ st_othinrecord ）、 出库申请单（po_picking_requisition）、调拨订单（ st_transferapply ）、 调 入 申 请（aum_deploy_apply_card）、销售订单（ voucher_order ）、 销售报价（quote_salesquotation）、销售合同（ sact_salescontract ）、 销售退货（voucher_salereturn）
transTypeId	string	query	是	交易类型 id 或 code
请求示例

Url: /yonbip/digitalModel/businessFlow/getFlowByBillNumAndTransTypeId?access_token=访问令牌&billNum=&transTypeId=

返回值参数
名称	类型	数组	描述
code	string	否	请求结果状态码
message	string	否	请求结果信息
data	object	是	请求结果数据
describe	string	否	流程描述
名称	类型	数组	描述
id	string	否	业务流 id
name	string	否	业务流名称
transactio nTypeId	string	否	交易类型 id
transactio nTypeNam e	string	否	交易类型名称
version	string	否	版本
正确返回示例

{

"code": "200",

"message": "OK", "data": [

{

"describe": "采购订单、采购入库单、采购发票", "id": "b2ffed6e-79a4-11ea-8d5f-0624d60000dc", "name": "无源单采购退货",

"transactionTypeId": "1567661173543168", "transactionTypeName": " 采 购 退 货 ", "version": "V1.0"

}

]

}

错误返回码
错误码	错误信息	描述
20001	未找到友互通 token!	提供友互通 token
错误返回示例

{

"code": "500",

"message": "Internal Error",

}

业务流单据的交易类型查询

根据单据类型和业务流 id 查询适用的交易类型（这个用于业务流中中间单据的交易类型查询适用），交易类型如果设置了的就返回设置的交易类型，没有设置的就返回前端产品中的所有交易类型。

请求说明
请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/businessFlow/getTransTypeByFlowIdAndBillNum
请求方式	GET
ContentType	application/json
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
请求参数
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用 token企业自建获取 token
名称	类型	参数位置	必填	描述
服务商获取 token
flowId	string	query	是	业务流 id
billNum	string	query	是	单据类型，适用以下单据类型：材料出库单(st_materialout) 、 采购订单(st_purchaseorder) 、 采 购 发 票(st_purinvoice) 、 采 购 入 库 单(st_purinrecord) 、 产 品 入 库 单(st_storeprorecord) 、 出 库 申 请 单(po_picking_requisition) 、 到 货 单(pu_arrivalorder) 、 盘 点 差 异 单(st_storecheckdifference)、其他出库单(st_othoutrecord) 、 其 他 入 库 单(st_othinrecord) 、 请 购 单(pu_applyorder) 、 调 拨 订 单(st_transferapply) 、 调 拨 申 请(st_transferreq)、调出单(st_storeou)、调 入 单 (st_storein) 、 委 外 入 库 单(st_osminrecord) 、 销 售 报 价(quote_salesquotation) 、销售出库单(st_salesout) 、 销 售 订 单(voucher_order) 、 销 售 发 货(voucher_delivery) 、 销 售 发 票(voucher_saleinvoice) 、 销 售 合 同
名称	类型	参数位置	必填	描述
(sact_salescontract) 、 销 售 退 货(voucher_salereturn) 、 形 态 转 换 单(st_morphologyconversion) 、 转 库 单(st_storetransfer)、
请求示例

Url: /yonbip/digitalModel//businessFlow/getTransTypeByFlowIdAndBillNum?access_token=

访问令牌&flowId=&billNum=

返回值参数
名称	类型	数组	描述
code	string	否	请求结果状态码
data	object	否	请求结果数据
billDes	string	否	单据名称
billDomain	string	否	单据所属领域
billSubId	string	否	单据所属应用
billType	string	否	单据类型
businessFlo wId	string	否	业务流 id
名称	类型	数组	描述
businessFlo wName	string	否	业务流名称
createTime	string	否	创建时间
formId	string	否	单据全名
fullName	string	否	实体 uri
id	string	否	流程单据 id
isCoreBill	boolean	否	是否核心单据
nodeId	string	否	节点 id
showFieldSt r	string	否	流程字段显示值
tenantId	string	否	租户 id
transTypes	object	是	可用交易类型数据
transactionT ypeId	string	否	流程单据中配置的交易类型 id
transactionT	string	否	流程单据中配置的交易类型名称
名称	类型	数组	描述
ypeName
message	string	否	请求结果信息
正确返回示例

{

"code": "200", "data": {

"billDes": "采购发票",

"billDomain": "upu",

"billSubId": "PU", "billType": "st_purinvoice",

"businessFlowId": "ffc8f89b-3250-11ec-9f55-b8599feb8d54", "businessFlowName": "普通订货（有到货）",

"createTime": "2021-10-21 17:26:41",

"formId": "PU.st_purinvoice", "fullName": "pu.purinvoice.PurInvoice",

"id": "000032af-3251-11ec-9f55-b8599feb8d54",

"nodeId": "ruleItemNode_8db27a34107b3003e99e4853981a6f31", "showFieldStr": "",

"tenantId": "0000KUYUNZ089IQ9EW0000",

"transTypes": [

{

"code": "A50001",

"id": "2019511782445329",

"name": "通用采购发票", "order": 0

}

],

"transactionTypeId": "", "transactionTypeName": ""

},

"message": "OK"

}

错误返回码
错误码	错误信息	描述
50001	未找到相关信息	确认流 id 和单据类型是否正确
错误返回示例

{

"code": "50001",

"data": {},

"message": "未找到相关数据!"

}