云审批
最后更新时间：2024-02-20
基本概念

iuap红皮书

云审批

2022年5月

背景

在业务系统中，业务对象除进行简单审核外，往往需要按一定顺序，在一定人员范围内进行审批，已保证业务对象的有效性及推动业务对象进行工作流转。

云审批就是为企业提供了对业务对象进行审批的服务。它包括对审批流程模型的设计管理，对业务单据流转的审批操作，以及对业务单据审批过程的管理调度。

目前，云审批为开发者，提供了基于MDD&MDF编程模型的对接方式，使对接方天然支持审批流，以及在流程流转过程中产生的待办与通知消息。同时云审批还为开发者提供了多种的集成及扩展方式，包括在流程转过程中的对于外部服务的调用；在流程流转过程中，对于审批环节的审批事件获取；基于元数据标签对流程环节处理人选取的规则进行扩展；非标准MDF页面集成Web及移动端审批交互组件等，方便开发者快速接入审批流。

在开发配置层面，云审批支持不同接入方进行审批数据隔离，服务隔离，支持接入方定制不同的审批配置参数，支持开发者讲以上信息作为预制数据抽取为初始化脚本，方便接入方按实际业务需要对审批能力进行灵活定制。

综上所属，云审批既为对接方提供基于框架的无感对接，又支持对接方更具实际需要进行灵活扩展，方便开发者快速接入审批流。

名词解释

**来源应用：**在流程对接过程中，首先应注册应用来源，即source或appSource。流程通过来源应用标识不同的对接方，并以此来作为数据隔离、服务隔离、配置隔离的依据。无论通过何种对接方式，在调用审批服务的上下文当中都需要提供source，以保证流程数据的正确定。

租户注册：在租户开通应用时，应用如支持审批，应调用租户来源应用注册接口，开通租户预制数据。

**流程回调：**流程回调是指在流程状态发送改变时，通知对接方改变业务对象状态，进行业务处理的调用接口，流程通过不同的审核操作（如审批通过、驳回、终止等）均调用该接口通知对接方，依据不同的操作及流程状态，传递不同的参数。流程回调是接入方必须抽取的预制数据之一。

**流程设计器配置：**流程设计器配置包含两部分：流程流转控制属性的参数控制模板，其决定了在流程设计页面中支持的流程环节、流程环节中的参与人选取方式、环节的操作配置、流程属性、是否支持字段权限控制、是否支持自定义动作名称、是否支持审批标题配置、是否支持消息模板等，流程流转控制属性通过参数控制决定了以上信息的可配置性及默认值，不可配置时属性不可见，依据默认值处理；流程参照配置，通过框架接入的对接方，流程设计器打开其参照及通过消息模板发送消息时，需要使用对接方的domainKey，调用对接方服务。对接方依据是否个性化流程设计器配置，以及是否存在业务对象参照决定是否抽取该预制数据。

业务对象：此处指软件中业务主体，可以是基础数据、单据类型。例如：凭证、人员、采购订单、销售订单等，一个来源应用下可以包含多个业务对象。

单据注册：单据注册是接入审批的业务对象在审批服务中缓存的业务对象信息，方便云审批在审批中是否可以将业务对象属性作为流程的发起条件、分支条件，以及控制不同属性在审批环节中的可见性及可编辑性。其数据来源有两部分，一部分来源于对应业务对象的UI模板，一部分来源于对应业务对象的模型设计。在接入方未启用业务对象的情况下，云审批将完全基于业务对象的UI模板进行控制。启用业务对象后权限可见性依然依据UI模板进行控制，发起条件，分支条件将依据业务对象进行控制。

**businessKey：**对接方与云审批在发起审批时约定的唯一标识，该标识至少应保证租户、来源应用下唯一。通过框架对接的对接方，businessKey的格式为：billno+'_'+billid。使用busikessKey发起流程后，在流程终止之前，对接方应控制不可在此使用该businessKey发起流程。

**流程变量：**对接方将业务对象实例的值在提交审批流时传递给云审批形成流程变量，用于流程分支判断。其中，业务对象实例的值只包含主表及平行表属性值。如单据已经提交流程，在单据修改保存后，接入方会通过框架调用流程更新流程变量。

**审批组件：**分为Web端及移动端版本，使用该组件需传入租户用户信息、来源饮用信息，登陆上下文，单据信息等。通过该组件，用户可以直观的获取到流程审批历史，对流程待办任务进行审批操作。

产品亮点

**灵活定制：**支持对接方通过配置灵活定制流程属性，以使用不同的业务场景需要。

**事件扩展：**支持对接方基于事件中心事件对流程进行扩展，同时依据租户及来源应用对事件进行隔离，保障数据隐私。

**第三方集成：**审批组件将审批UI、审批操作打包为统一前端组件，支持第三方页面引用，方便用户直接在第三方系统进行审批操作，覆盖流程设计器配置的各个属性操作，实现完整适配功能。

**一致性保障：**在用户使用审批功能是，流程与业务对象状态的一致性尤为重要

。而在微服务架构下，流程与不同的接入方均属于不同的微服务，因此流程与业务对象的一致性问题为分布式环境下的事务一致性问题。对接方通过框架接入云审批后，云审批和框架天然支持业务对象与流程状态的一致性保障，为对接方屏蔽了分布式事务编程的困难。同时，云审批还据此提供给非框架接入的对接方标准接口方案，通过适配该方案，保证流程与业务对象的一致性。

技术架构
总体架构设计

图1 流程接入架构

如上图1所示接入方与云审批的接入主要包含以下部分：

接入方在注册业务对象后设计发布流程模型；
接入方通过后端框架SDK查询当前业务对象实例是否受流程控制、发起\撤回流程、更新流程变量、查询流程当前处理人。
接入方通过前端框架引入云审批的Web审批组件和移动审批组件，即点击单据上的审批流按钮，查询流程历史、处理流程待办、查看流程图。以外，通过审批组件的接口查询业务对象字段在当前审批环节的可见性、可编辑性。
当流程已经接受到来自框架的提交请求、审批组件的待办处理请求后，会根据流程模型的分支条件计算下一环节，根据流程环节的参与人配置查找环节处理人，像消息平台&消息中心，发送通知、已办、待办等。
后端框架通过分布式事务组件YTS进行提交与撤回的分布式事务控制，保障提交和撤回的流程一致性。当流程结束或被驳回时，云审批通过回调接口调用后端框架更新单据状态，通知业务进行处理。当前回调接口超时后，云审批会依据回调配置，将流程设置为挂起状态，等待后端框架的超时补偿事件，与此同时将该流程实例加入到一致性查询的轮询对接中，两处有一处返回时，流程将依据结果进行解除流程挂起，或回滚流程操作。若30分钟均为得到结果，云审批将认定回调失败，回滚流程操作。
云审批接入过程
功能概述

云审批接入分为开发态及运行态两个阶段。

设计态主要包括接入方注册来源应用，绑定规格租户开通来源应用接口，框架前后端配置，流程设计器配置等。

运行态主要包括流程开启审批流，配置发起条件、流程分支条件，更新发起条件、流程分支条件，开启流程字段权限控制。

设计态接入过程
注册来源应用

无论以何种方式接口云审批，首先应注册来源应用，来源应用是审批用来作为业务分类、与微服务集成的基础标识。目前，系统内天然支持的来源应用有两类。第一通过低代码专业版引擎新建的应用，流程来源应用的编码与引擎编码一直，为低代码专业版引擎自动创建；第二即通过领域开发态预制业务对象时，通过既定的formId格式进行预制。领域预制业务对象过程参见交易类型红皮书。其主要入口如下图所示：

通过框架接入云审批的应用应注意，流程应用编码（Source）应与应用对应的表单id中的SubId保持一致。如下图所示，表单ID的符号‘.’前边的前缀即为subId，即为审批的Source。

确定流程Source后联系云审批开发，提供微服务域名与domainKey，并确认服务是否支持通过事件中心发送事件，导出如下所示的bpm_id_basicdata表预制数据。其中EVENT_CENTER_标志了是否发送流程事件以及是否开启回调超时一致性同步策略。

REPLACE INTO bpm_id_basicdata(ID_, REV_, ENABLE_, CREATE_TIME_, MODIFY_TIME_, CODE_, NAME_, TYPE_, CATEGORY_, TENANT_ID_, URL_, TOKEN_, OPERATIONS_, SOURCE_, PROCDEF_ID_, ACTIVITY_ID_, SYNC_, EVENT_CENTER_, ytenant_id, ISVTAG) VALUES ('预制数据主键', 1, '1', '2019-05-15 16:48:16', '2021-12-20 23:22:41', '领域服务编码', '领域服务名称', 'process_listener', '~', 'u8c', '{{#领域微服务域名编码}}/bpm/complete', 'yxybpm', '~', '流程Source', '~', '~', '1', '1', '0', NULL);

绑定规格租户开通来源应用接口

确定来源应用Source后，还应修改领域规格开通逻辑，开通时为租户注册本领域的流程服务，并生成相关预制。此步不可省略，否则会产提交流程后，审批组件找不到流程待办，无法进行应用隔离等问题，请接入方务必重视。有两种方式进行绑定：

在本领域回调接口中同步调用流程注册接口
将流程注册接口加入到本领域规格的回调地址当中，流程注册接口如下所示：

{$domain.iuap-apcom-workflow}/ubpm-process-center-be/rest/registered/registeredServer/{source}

**请求方式 :**post

请求参数：

{

****"tenantId":"tenantId" //租户id 必填

}

返回结果：

{

"msg":"租户开通成功",

"status":"1"

}

如下图所示，让本领域的产品经理，进入运营管理后台，增加规格开通回调。

流程模型自定义配置

接入方再接入审批流后，可根据业务本身的设计场景选择是否启用流程模型设计中的某些选项，可以通过接入方根据来源应用自定义流程设计器配置。

如上图所示，红色区域内的所有选项均支持通过参数配置是否启用，具体场景可由产品经理推演联系流程开发定制。流程更新基准库后，由接入方抽取公共脚本执行脚本流水线上线即可。

此外，如下图所示，接入方在流程模型中需要打开参照、枚举类的业务对象属性时，需要像流程开发提供本服务的domainKey，流程更新基准库后，由接入方抽取公共脚本执行脚本流水线上线即可。如未提供会造成某些参照打开黑屏。

后端框架配置

本节介绍后端框架接入流程的主要配置，具体可参见MDD后端编程模型红皮书

后端工程增加相关配置

配置项可以写死在application.properties 也可以通过YMS控制台配置

A63.bpmrest.source=【Source】

领域元数据修改
需要支持审批的元数据或者公共的基类元数据继承接口base.itf.IApprovalFlow
;
需要实现审批流管理的业务元数据需要在相应属性上打三个标签

isMasterOrg ：组织id字段，标识主组织字段，默认取字段名为org的字段。

isTransactionType ：交易类型id，标识交易类型，默认取字段名为bustype 的字段（如果支持单据级流程此项可根据实际情况是否打标签）。

isCode：编码列，标识单据编码列，默认取 code 字段。

根据业务元数据 建表或修改已有表结构，增加步骤1中的字段
UI元数据修改

列表和卡片页 bill_base 增加 isSupportBpm 列设置为 1，即此单据支持云审

单据卡片配置 bill_toolbaritem 、bill_command 表中，增加提交、撤销、审批流三个按钮和对应 action

按钮编码	按钮名称	命令	动作	接口URI
btnSubmit	提交	cmdSubmit	submit	/bill/submit
btnSubmit	撤回	cmdUnsubmit	unsubmit	/bill/unsubmit
btnWorkflow	审批流	cmdWorkflow	workflow

刷新0租户或特定测试租户的UI元数据

刷规则注册表 submit unsubmit 规则注册（指定租户的规则请自行修改插入）

INSERT INTO billruleregister (billnum, action, ruleId, iorder, overrule, tenant_id, key, isSystem, url, isSync, isAsyn, config) VALUES ('common', 'submit', 'submitBillRule', 30.00, NULL, '0', NULL, b'1', NULL, 0, 0, NULL);

INSERT INTO billruleregister (billnum, action, ruleId, iorder, overrule, tenant_id, key, isSystem, url, isSync, isAsyn, config) VALUES ('common', 'unsubmit', 'unsubmitBillRule', 30.00, NULL, '0', NULL, b'1', NULL, 0, 0, NULL);

INSERT INTO billruleregister (billnum, action, ruleId, iorder, overrule, tenant_id, key, isSystem, url, isSync, isAsyn, config) VALUES ('common', 'audit', 'auditBillRule', 30.00, NULL, '0', NULL, b'1', NULL, 0, 0, NULL);

INSERT INTO billruleregister (billnum, action, ruleId, iorder, overrule, tenant_id, key, isSystem, url, isSync, isAsyn, config) VALUES ('common', 'unaudit', 'unauditBillRule', 30.00, NULL, '0', NULL, b'1', NULL, 0, 0, NULL);

INSERT INTO billruleregister (billnum, action, ruleId, iorder, overrule, tenant_id, key, isSystem, url, isSync, isAsyn, config) VALUES ('common', 'deleteBpm', 'deleteBpmRule', 30.00, NULL, '0', NULL, b'1', NULL, 0, 0, NULL);

INSERT INTO billruleregister (billnum, action, ruleId, iorder, overrule, tenant_id, key, isSystem, url, isSync, isAsyn, config) VALUES ('common', 'delete', 'cancelBpmRule', 50.00, NULL, '0', NULL, b'1', NULL, 0, 0, NULL);

前端框架配置

本节介绍前端框架接入流程的主要配置，具体可参见MDF前端编程模型红皮书

由于前端点审批流按钮后需要弹出公共审批组件，需要配置对应的appSource

审批流配置env

属性	值	描述	备注
WORKFLOW_META	{}	审批流配置
appSource	Source	审批流应用编码

配置方式分3种情况，如下：

方式一：不配置，不配置appSource默认取cSubId，对于同一个doaminKey下所有单据appSource不同的情况适用
方式二：在领域前端脚手架中通过registerEnv注册，脚手架中注册优先级高于MDF配置中心配置
方式三：在MDF配置中心配置（推荐）
运行态接入
开启审批流配置

如上图所示，运行态开启审批流控制，仅需在模型管理中选择对应组织，领域-单据类型-交易类型，新建模型-设计-保存并发布即可。

流程模型受上级组织管控，交易类型受单据类型管控。因此确定某组织下某交易类型单据是否开启审批流控制的判断条件如下：

本组织交易类型是否存在启用的已发布模型-->本组织单据类型是否存在启用的已发布模型-->上级组织交易类型是否存在启用的已发布模型-->上级组织单据类型是否存在启用的已发布模型，直至顶级组织的单据类型，如以上均不存在，方可认定单据不受流程管控。

另外，单据是否受流程管控的判定时机为单据保存，因此在启用停用流程模型后为确保单据控制正确因重新编辑保存。

配置更新流程条件

如上图所示，需要但字段支持作为流程分支判断条件，需在单据注册页面找到对应业务对象，勾选条件可见，其中该项及发起条件仅对主表及平行表生效。仅单据类型下的模型可设置发起条件。

当UI模板有更新时，需要点击页面上的刷新按钮重新拉取新的单据字段。

开启流程字段权限控制

需要开启流程控制字段权限，首先应如上图所示在单据注册页面勾选权限可见，随后在模型设计页面，如下图所示，点击流程字段权限按钮进行修改，对后保存并发布模型，配置对新提交单据生效。

MDD后端框架-流程接口说明

目前无论使用低代码平台开发的单据，还是标准领域服务开发的单据，均使用框架与流程进行对接，一般不需要开发者手动进行代码开发。如接入方未非框架接入，可模拟框架接入的主要后端接口进行对接。

框架在与云审批对接，即使就是通过调用流程的接口实现单据状态与流程状态的同步，框架记录的单据状态与流程状态入下：

审批流状态 verifystate：枚举类 com.yonyou.ucf.mdd.ext.bpm.model.VerifyState
INIT_NEW_OPEN("初始开立", (short) 0), // 单据创建未启动流程
SUBMITED("审批中", (short) 1), // 流程审批中 approval in progress
COMPLETED("审批完成", (short) 2), // 流程完成 approval to complete
TERMINATED("不通过流程终止", (short) 3), // 流程终止回调后的状态
REJECTED_TO_MAKEBILL("驳回到制单", (short) 4); // 驳回到制单 rejected to make the bill
单据状态 status : 枚举类 com.yonyou.ucf.mdd.ext.voucher.enums.Status
newopen("开立", (short) 0),
confirmed("已审核", (short) 1),
closed("已关闭", (short) 2),
confirming("审核中", (short) 3),
locking("锁定", (short) 4);
框架调用流程接口
查询单据是否启用审批流

MDD规则：SaveBillRule

MDD方法入口：com.yonyou.ucf.mdd.ext.bpm.service.ProcessService.bpmControl

流程SDK接口：yonyou.bpm.rest.RepositoryService.queryProcessDefinition

应用场景：

单据新增/修改 数据保存之前需要查询是否存在流程定义，单据配置支持云审批（isSupportBpm） 并且已经定义了流程定义，则更新单据中isWfControlled=1， 之后的提交审核等操作需要判断 isWfControlled。

更新流程变量

MDD规则：SaveBillRule

MDD方法入口：com.yonyou.ucf.mdd.ext.bpm.service.ProcessService.updateBpmProcess

流程SDK接口：yonyou.bpm.rest.RuntimeService.updateProcessVariablesByBusinessKey

应用场景：

单据编辑保存，如果isSupportBpm=1并且有流程定义则需要调用接口同步单据数据作为流程变量。在提交时，MDD不会提交为空值的变量，但保存时如单据字段取值被制空，则会调用次接口将流程变量制空。

提交审批流

MDD规则：SubmitBillRule

MDD方法入口：com.yonyou.ucf.mdd.ext.bpm.service.ProcessService.startBpm

流程SDK接口：yonyou.bpm.rest.RuntimeService.startProcess

应用场景：

单据卡片中点击提交按钮或列表批量提交，启动流程实例。提交时流程操作人会取当前用户，流程所属组织会取isMasterOrg标签对应的组织。提交接口支持分布式事务，对接方需要整提交相关规则在同一事务内执行，提交执行成功会将单据变更为审批中

特殊提交场景：

流程通过流程设计可以实现提交自动审批通过的场景。此时流程会返回给单据的数据中增加特殊标记"processStartAndAutoEnd":"1"，标识流程为提交及结束场景。此时，流程虽然已经结束，但会挂起不发终审回调，框架会判断此标志发事件给流程，流程接收到事件后会发起终审回调，通知单据审批完成。整体流程如下：

撤回审批流

MDD规则：UnsubmitBillRule

MDD方法入口：com.yonyou.ucf.mdd.ext.bpm.service.ProcessService.withdraw

流程SDK接口：yonyou.bpm.rest.RuntimeService.withDrawFormUseBusinessKey

应用场景：

单据卡片或列表批量撤回按钮，撤回流程，此处通过分布式事务保持单据流程状态一致性。

根据单据、当前用户查询待办

MDD规则：AuthServiceContextAop

流程SDK接口：yonyou.bpm.rest.HistoryService#getHistoricTasksCount

应用场景：

功能权限拦截AOP中判断当前用户是否存在待办任务。 如果没有detail 的查询权限但是存在待办任务则放过权限拦截。

查询当前单据待办处理人

MDD规则：BpmController.getAuditors

MDD方法入口：com.yonyou.ucf.mdd.ext.bpm.service.ProcessService.getAuditorsNew

流程SDK接口：yonyou.bpm.rest.HistoryService#getHistoricProcessInstancesAssignee

应用场景：

查询当前单据审批人。

流程调用框架接口

流程主动调用框架接口主要包含终审回调接口，已经查询流程终审调用结果接口，前者为流程状态变更通知单据进行业务处理，后者用来保障单据与流程状态的一致性。

终审回调

流程的终审回调接口

批流程回调类别区分: BpmRequestBody.eventName / BpmRequestBody.deleteReason

DELETEALL : 审批流程删除,

WITHDRAW : 流程撤回

REJECTTOSTART : 驳回到制单

WITHDRAWREJECTTOSTART : 撤回驳回到制单 （REJECTTOSTART 的反操作）

ACTIVITI_DELETED : 流程终止

END : 流程结束

审批状态对应关系：

场景	触发操作人	审批状态（verifystate ）	单据状态（ status）
新增创建单据	客户操作员	0	0
单据提交	客户操作员	1	3
审批流组件终审前的审核	审批流参与人	1	3
审批流组件中操作【撤销审核】（WITHDRAW）操作后会回调到注册的回调地址，执行unaudit的动作规则 UnAuditBillRule.java	审批流参与人	1	3
审批流组件制单前的【驳回】	审批流参与人	1	3
审批流组件中操作 【驳回到制单】流程后端会通过终审接口回调业务服务 （REJECTTOSTART）操作后会回调到注册的回调地址，执行deleteBpm的动作规则DeleteBpmRule.java	审批流参与人	4	0
审批流组件中操作 【撤销驳回到制单】 -- 驳回制单的反向操作（WITHDRAWREJECTTOSTART）操作后会回调到注册的回调地址，执行deleteBpm的动作规则DeleteBpmRule.java	审批流参与人	1	3
审批流组件中操作 【终止】（ACTIVITI_DELETED）操作后会回调到注册的回调地址，执行deleteBpm的动作规则DeleteBpmRule.java	审批流参与人	3	0
审批流终审结束会回调到注册的回调地址， deleteReason 为空并不是END；执行audit的动作规则AuditBillRule.java	审批流参与人	2	1
审批流功能中操作删除流程实例的等（具体场景还不清晰）（DELETEALL）会回调到注册的回调地址，执行deleteBpm的动作规则DeleteBpmRule.java	审批流参与人	0	0
超时重试查询补偿接口

场景：流程终审回调、撤回审批回调（withdraw）

功能：会在一定时间内对回调进行查询，以确定对方是否收到回调，回调结果如何，流程根据查询结果进行相应的补偿操作，以达到状态一致性。

重试查询请求接口Request

// 查询请求接口request结构

{

// 以下4个是查询接口特有参数

"bpmQueryId": "122222222", // 此次查询请求uuid，仅仅代表此次请求

"bpmQueryTs": "133300972342", // 此次查询请求时间戳，仅仅代表此次请求发起时的时间戳

"bpmQueryCount": "3", // 是第几次重试查询 例如这次请求是第3次

"bpmQuerySize": "5", // 总共要重试查询 例如总共查5次

//================================================以下新增参数命名

"bpmCallbackRequestId": "1333006a3abb434a9b03bac5739ffb85", // 同complete时原来的uuid

"bpmCallbackRequestTs": "1333006435738", // 同complete时的ts

//================================================以上改成新的命名 以下不变

// ==================以下同complete时参数，并保同complete时请求参数的数量和含义一致

"businessKey": "znbzbx_travelexpbill_2367503471939840-222", // complete时的原来参数

"tenantId": "w9dc85ld_RBSM2", // complete时的参数

"source": "RBSM", // complete时的参数

"userId": "88244de5-a5b4-4ad1-8e5a-caf3f8b491d1", // complete时的参数

"yht_access_token": "57023b68-6e67-497d-a6f1-e76e6e8133dxxxxxxx",

// ......以下省略

}

重试查询请求接口 Response

// 重试查询请求返回结果response

{

"msgSuccess": true, // 请求接口成功还是失败

"desc": "库存不足", // 请求接口成功还是失败描述信息

"processing": 1, // 1 处理中 2 处理成功 3 处理失败

// 以下是查询请求时的参数

"bpmQueryId": "5ac2abdce8ea4e29a10ed1b593b29af2", // 暂定有

"bpmQueryTs": "13330164963",// 非必须 可以有更好

"bpmQueryCount": "3", // 非必须 可以有更好

"bpmQuerySize": "5", // 非必须 可以有更好

// ==============================以下同complete时参数参数保持数量和含义一致

"bpmCallbackRequestId": "1333006a3abb434a9b03bac5739ffb85", // complete时的uuid参数

"bpmCallbackRequestTs": "1333006435738", // complete时的ts参数

//=================================以上改成新的命名 以下同complete时参数

"businessKey": "znbzbx_travelexpbill_2367503471939840-222", // 同complete时参数

"processInstId":"04696909-57ef-11ec-aabc-72deb5d6e475", // 同complete时参数保持

"processDefinitionKey": "processcenter_2082259f",// 同complete时参数

"tenantId": "w9dc85ld_RBSM2",// 同complete时参数

"yht_access_token": "57023b68-6e67-497d-a6f1-e76e6e8133dxxxxxxx",// 同complete时参数

"appSource": "PU",// 同complete时参数

"userId": "88244de5-a5b4-4ad1-8e5a-caf3f8b491d1",// 同complete时参数

。。。。。

}

对以上协议的解释：

如果收不到一个有效的Response，则认为对方没有重试查询接口，此种情况无法通过重试查询来获取最终结果。流程不会做任何额外操作。

下面我们仅对能收到一个有效的重试查询结果的情况加以说明：

msgSucess为false时，说明有2种可能

*  可能1：流程回调没有记录


可能就是没收到回调，丢失了，重试达到上限，可以认为是确实没有收到回调，流程应做回调

*           *  可能2：数据库抖动阻塞导致，重试解决
*  可能3：还没来的及入库（再试可能就会查出，会再重试查询）


鉴于存在可能2的情况，因此也需要继续重试查询，直到达到重试上限或绝对超时时限阈值后，又分2种情况：

*           *  （1）msgSuccess仍为false，则流程认为对方没有收到回调，流程回滚。相当于回滚用户的操作，回调用户操作（不仅限与审批）之前的状态。
*  （2）msgSuccess变为true，则按照下述情况处理。


msgSucess为true时，存在以下几种情况：

*  如果processing是1表示处理中，最终结果还未知，则需要重试查询，直到达到重试上限或绝对超时时限阈值

如果processing是2 表示 回调成功 ，应停止重试查询，流程根据processing的值来处理流程（逻辑处理相当于complete时收到msgSuccess为true一样）
如果processing是3 表示 回调失败 ，应停止重试查询，流程根据processing的值来处理流程（逻辑处理相当于complete时收到msgSuccess为false一样）
如果processing是其他值 的（不应该出现），都暂时等同于processing为1的情况，即未知情况
超时查询接口

以MDD框架为例进行说明

MDD框架统一流程回调接口为：https://upuweb-yonsuite.diwork.com/bpm/complete

例如：https://upuweb-yonsuite.diwork.com/bpm/complete?businessKey=st_purchaseorder_2551717089530112&processDefinitionKey=processcenter_2082259f&processInstId=04696909-57ef-11ec-aabc-72deb5d6e475&processEnd=true&processActionType=null

超时重试查询接口规范：

在原来的回到接口最后加上Check（注意大小写）

https://zzz-yonsuite.diwork.com/yyy/xxx/queryState

mdd超时重试查询接口为：

以mdd终审接口为例：

https://zzz-yonsuite.diwork.com/bpm/complete POST

默认的重试查询接口为：

https://zzz-yonsuite.diwork.com/bpm/complete/queryState POST

https://zzz-yonsuite.diwork.com/xxxxx/xxxxx/queryState

流程事件及外部服务集成

对于某些领域或项目，希望对流程进行扩展，目前有两种方式扩展流程。第一通过事件中心集成流程事件，接入方通过监听流程事件进行相应操作；第二通过流程外部服务调用的方式（目前仅支持同步调用），在流程环节审批动作前后进行服务扩展，或自定义流程环节动作，进行外部服务调用。

流程事件扩展

接入事件中心流程事件，需要关注以下几个属性

事件源
事件类型

这也是接入事件中心必须要素。

根据目前产品现状及综合各领域需求，并结合目前事件中心提供的事件发送和监听机制，根据不同领域的服务应用编码（source）的不同来注册为不同的事件源，即实现服务应用的事件隔离。

流程事件源
流程事件源分类

根据流程里source来做事件发送的隔离；具体而言是领域的一个souceId会对应一个具体的事件源。

同一个source，开放出以下3大类事件源

*  任务事件源，事件源规范为 bpm_task_{source}

节点事件源，事件源规范为 bpm_activity_{source}
流程实例事件源，事件源规范为 bpm_process_{source}
已注册生效的事件源列表

领域接入事件无需在流程中心登记注册，流程审批过程中任何（领域）source的事件都会默认发送到事件中心。
需要在事件中心注册自己领域（source）的事件，日常可联系流程开发人员来完成，上预发和生产需由事件中心来推数据。
领域只需要去事件中心监听消费即可，这一步有领域开发来完成。
事件源示例
事件源名称	事件源编码	所属应用
活动节点人力云事件源	bpm_activity_hr_cloud	流程管理
云流程人力云事件源	bpm_process_hr_cloud	流程管理
任务人力云事件源	bpm_task_hr_cloud	流程管理
任务USMPEXP事件源	bpm_task_USMPEXP	流程管理
活动USMPEXP事件源	bpm_activity_USMPEXP	流程管理
流程USMPEXP事件源	bpm_process_USMPEXP	流程管理
事件类型
事件类型为流程（模型）定义里对应的标准事件名，即end、complete、create等
不同的事件源的事件也不尽相同，请按照bpm规范选择合适事件进行监听

例如：任务类事件源有complete但没有end，而流程、活动节点类事件源有end但没有complete

需要开放更多的事件，请联系流程中心开发部相关人员

具体说明如下：

任务事件类型
事件类型名称	事件类型编码	描述
任务完成	complete	1、任务完成事件，事件体对象结构保持和原来一致2、但没有execution对象，只有task对象场景：审批组件同意时触发业务调用complete任务接口
任务创建	create
任务跳转	jump
撤回	withdraw
删除	delete

【注意】上述的事件类型的前提是模型定义中要有相应的定义，这点请开发务必注意！

模型定义里的事件清单

对于一个任务而言，相对比较全的事件监听如下：

<activiti:executionListener event="end" class="com.yonyou.bpm.listener.ActivityEndExecutionListener"/>

<activiti:executionListener event="start" class="com.yonyou.bpm.listener.ActivityStartExecutionListener"/>

<activiti:taskListener event="create" class="com.yonyou.bpm.message.defaultImpl.EsnMessageSendAdapter"/>

<activiti:taskListener event="complete" class="com.yonyou.bpm.message.defaultImpl.EsnMessageSendAdapter"/>

<activiti:taskListener event="jump" class="com.yonyou.bpm.message.defaultImpl.EsnMessageSendAdapter"/>

<activiti:taskListener event="withdraw" class="com.yonyou.bpm.message.defaultImpl.EsnMessageSendAdapter"/>

<activiti:taskListener event="outtime" class="com.yonyou.bpm.message.defaultImpl.EsnMessageSendAdapter"/>

<activiti:taskListener event="delete" class="com.yonyou.bpm.message.defaultImpl.EsnMessageSendAdapter"/>

事件中心注册的事件类型

环节（活动）事件类型
事件类型名称	事件类型编码	描述
环节（活动节点）结束	end	1、活动节点结束事件，事件体与回调callabck的保持一致2、但不含task部分
环节（活动节点）开始	start	暂时没有，视需求而定。流程发起都在领域单据上，因此不需要事件，而通过提交审批接口的返回值来获取流程发起后的信息。

流程（实例）事件类型
事件类型名称	事件类型编码	描述
流程结束	end	1、流程结束事件，事件体保持和原先一致，但不含task部分2、流程的正向终审后会触发该事件，其中deleteReason为null
流程开始（提交）	start	暂时无需开放，目前各领域都是靠返回值来做业务处理的
撤回流程（反提交）	deleteAll	场景：发起人撤回单据流程（即反提交），会触发该事件，其中返回值属性deleteReason也为deleteAll说明：该事件并不是流程本身流转触发的，而是又外部调用流程触发的事件，为兼容领域云审历史场景，默认是false，即默认不触发该事件。如果需要触发该事件，需要通过接口参数sendDeleteAllEvent来控制。如果设置了callback参数为true，也会触发该事件。例如，标准单据的toolbar上的撤回按钮点击时，会删除流程，通过callback或sendDeleteAllEvent从都可以来控制发送该事件说明：参数callback 默认false 表明是否需要流程进行回调。设置为true后，回调方式有2种方式。方式1： 同步rest回调，提前是需要在流程中心预置同步回调地址url方式2：异步可靠性事件，通过事件中心发送事件，领域通过监听事件的方式达到回调参数sendDeleteALLEvent，默认false。如果callback为true，可以不设置sendDeleteAllEvent也会发deleteAll事件，至于是否rest回调要看是否在流程中心注册了回调url。如果设置callback为false，sendDeleteAllEvent为true，将只发送异步事件，不会同步rest回调。即该参数可单独控制是否发异步事件，优先级更高。
撤回终审	excution_withdraw（仅限终审撤回）	流程终审结束后，最后审批人进行撤回触发的事件（前提是流程结束后允许撤回），事件体数据中的deleteReason为withdraw。例如：审批人通过审批组件终审后，再次撤回终审会触发该事件注意：改事件仅限为终审后的撤回，终审后的撤回通常会影响单据状态（已审批变更为审批中）注意：普通任务审批后的撤回，不会触发该事件（这种操作不会触发改变单据状态）

事件监听

在事件中心管理页面，打开【数字化建模】》【流程管理】，找到自己对应的领域的事件源，例如下图是【流程任务友报账ybz事件源】

注意：如果没有自己领域的事件源，说明没有在流程中心这里登记事件源，需要联系流程中心相关开发进行登记即可。

查看事件监听

如果没有增加过监听事件可以先看5.2如何新增事件监听

具体操纵步骤：

找到对应的事件源
在右侧事件类型列表中，找到对应的事件，例如任务complete事件
在鼠标浮动菜单中点击【查看监听】，即可进入事件监听页面，如下图

这里的事件接收地址，就是各个领域自行注册在事件中心的回调地址，事件的消费者

新作事件监听

第一次进入时，应该是空的，即没有对该事件进行监听，通过右上角的【新增】按钮进行新增即可。如下图所示：

新增事件监听在使用上的疑问可以咨询事件中心负责人或开发。

查看事件

在事件中心管理页面点击右上角的【事件查询】，如下图

2 进入事件查询页面后，可以录入相应的参数，进行搜索事件

小技巧：

在【事件内容】里通过录入id，可以高效精确的查找相应的事件
正常完整的事件记录会有2条记录，一个是流程发送事件记录，一个是领域消费事件记录，对应的事件状态为【进入】和【成功】

外部服务集成

如下图所示外部服务集成即在流程审批动作前后，或通过自定义审批动作的方式调用外部服务。本章节即主要介绍外部服务的接入过程。

外部服务注册

首先接入方需将接入的服务接口（Restful）提供给流程开发人员，流程开发人员会将数据导入基准库，接入方自行抽取预制脚本上线即可。

参数	说明
code	服务编码，英文
name	服务名称，中文
url	服务地址，示例：{$domain.iuap-apcom-workflow}/yonbip-mkt-mkc2b/api/voucher/check/batchVerifyPrice?yht_access_token={yht_access_token}
operations	业务提供的业务参数，在服务中可配置选择{"serviceParams":[{"name":"执行后工单状态","code":"nextStatus","type":"refer","billno":"RMM.rmm_workorder_card","fieldCode":"pk_wo_status__name","url":"","domain":"","defaultValue":"","canMultiSelect":true},{"name":"回退后工单状态","code":"backStatus","type":"refer","billno":"RMM.rmm_workorder_card","fieldCode":"pk_wo_status__name","url":"","domain":"","defaultValue":"","canMultiSelect":true}]}
source	来源应用
外部服务在流程设计器中的配置方式

打开流程模型设计器，双击”活动“，点击”服务“页签

（2）点击”新增“按钮，增加服务配置

（3）选择管控强度，选择关联服务，点击”新增“增加参数配置

强管控：流程回调业务，业务返回false，流程审批组件弹出强管控提示框，提示信息，流程不会继续流转，当前环节审批任务状态不变。

弱管控：流程回调业务，业务返回false，流程审批组件弹出弱管控提示框，提示信息，用户点击”确定“，继续审批；用户点击”取消“，取消审批，当前环节审批任务状态不变。

参数：流程变量，业务参数（业务注册服务时配置的参数）

（4）点击”新增“增加关联动作

关联流程动作：同意，驳回，终止

执行顺序：先执行对象服务（先调用业务服务，再调用流程动作），后执行对象服务（先调用流程动作，再调用业务服务）

新增的关联流程动作会在审批组件界面替换掉原生流程动作

流程调用外部服务接口说明

请求方式：POST请求

（2）鉴权方式：提供yhtAccessToken，二者任选

a、请求的地址提供参数yht_access_token

b、请求头信息中提供参数yht_access_token

（3）请求参数

{

"businessKey":"业务发起流程时设置的值",

"procInstId":"流程实例ID",

"id":"业务单据实例ID",

"processVariable":{

"initiatorDept":"发起人部门",

"initiator":"发起人",

"initiatorUserGroup":"发起人所属用户组",

"isManager":"发起人是否部门负责人",

"lastApproveUserGroup":"上一环节审批人所属用户组",

"lastApproveDept":"上一环节审批人所属部门"

},

"busiParams":{

"nextStatus":"",

"backStatus":""

}

}

（4）响应参数

{

"code":200,

"message":"操作成功",

"data":true,

"updatevariable":{

"key":"value"

}

}

流程根据code的值判断服务是否调用成功，code=200调用成功；code等于其它值调用失败，审批组件弹出业务返回的message信息，流程保持当前状态。

data是一个布尔值，标识业务通过true/不通过false。code=200调用成功时，已data返回值判断流程是否继续流转。data=true，流程继续流转；data=false，审批组件弹出业务返回的message信息，流程保持当前状态。

updatevariable不是必须值，如果业务方有需要修改的流程变量，可以放在这里，其中key为要修改的流程变量id，value为修改后的值，流程接到值后会修改流程变量表数据（code=200调用成功时，修改流程变量）