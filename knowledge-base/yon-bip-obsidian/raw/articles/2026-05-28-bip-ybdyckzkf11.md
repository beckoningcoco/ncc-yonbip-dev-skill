YonBuilder原厂扩展开发（MDD）
最后更新时间：2024-02-23
基本概念
背景

YonBuilder低代码构建开发平台，可自定义创建应用，实现应用低成本开发、发布。在此基础上，针对已购买/已授权的应用，进行特性增强的应用程序。主要基于以下场景需要。

1.1.1. ISV基于系统产品扩展开发ISV产品

研发机构基于用友云标准领域的产品，扩展开发具有新的通用特性的产品，包括对原有功能的增强、及增加一些新的功能。

对原有功能的增强，通常包括：

调用标准产品的实体模型：通常包括为实体/子实体模型增加新的属性（字段）、增加新的子实体（子表）

调整标准产品的后台业务逻辑 ：通常是在标准产品的逻辑处理过程中增加新的处理逻辑

调整标准产品的前端逻辑：通常包括调整UI界面的展现效果、字段的显示/隐藏、页面布局的调整、以及为页面动作事件增加新的处理逻辑。

增加新的功能通常包括：

注册新的原子服务

创建新的业务实体模型，并基于该实体模型为原子服务生成前后台逻辑、

扩展出的新特性，可以是行业特性（行业扩展开发），也可以是最佳实践特性。

参与本场景下的开发机构，通常是用友集团各行业事业部、行业产品公司、分支机构的开发团队、以及生态伙伴公司。

参与本场景的开发者，通常为用友集团行业事业部成员、行业产品公司成员、分支机构成员、生态伙伴公司的成员。

1.1.2. 租户基于系统产品扩展

即租户开发场景的一种细分，研发机构基于用友云标准领域产品进行扩展开发，以实现客户定制需求。包括对原有功能的增强、及增加一些新的功能，具体描述同1.1.1。

参与本场景的开发机构，通常是用友集团负责用友云产品交付的分机机构、以及与用友分支机构签约的伙伴公司、或与客户签约的伙伴公司、或者客户自己。

参与本场景的开发者，通常是用友分支机构的成员、伙伴公司的成员、或客户自己的研发人员、或者由上述开发机构招募的社会级开发人员。

1.1.3. 租户基于ISV标准产品扩展

即租户开发场景的一种细分，研发机构基于其他生态服务商的产品再次进行扩展开发，以实现客户定制需求。包括对标准产品扩展或对服务商产品的再次扩展、及增加一些新的功能，具体描述同1.1.1。

参与本场景的开发机构，通常是用友集团各分机机构、以及与用友分支机构签约的伙伴公司、或与客户签约的伙伴公司、或提供增强产品的伙伴、或者客户自己。

参与本场景的开发者，通常是用友分支机构的成员、开发伙伴公司的成员、提供增强产品的伙伴公司的成员、或客户自己的研发人员、或者由上述开发机构招募的社会级开发人员。

1.1.4. ISV基于其他ISV产品扩展

研发机构基于服务商产品进行再次扩展开发，以实现新的通用特性。包括对标准产品扩展或对服务商产品进行再次扩展、及增加一些新的功能，具体描述同1.1.1。

参与本场景下的开发机构，通常是生态伙伴公司。

参与本场景的开发者，通常为生态伙伴公司的成员。

名词解释

原厂扩展应用：已购买/已授权的应用。

原厂扩展服务：已发布的服务，该服务下有多个原厂单据。

**原厂扩展模板：**原厂扩展模板，当前租户没有租户级默认模板，在系统级模板上扩展生成租户级默认模板去扩展，有租户级默认模板，在该模板基础上扩展。

产品亮点

支持公有云ys及bip的企业客户针对已经购买开通的原厂应用（mdd开发框架实现的）进行构建相关的数据模型、页面等资源的个性化调整或特性增强。

扩展原则：扩展后的资源，在主列表上之看到一条记录，当前环境下最新状态的记录；在资源的详情内查看组合后的最新形态，且提供按钮查看相关分层+版本的情况。

原厂实体元数据及其属性不支持修改，仅支持查看

支持实体元数据扩展子实体，扩展子实体可增删改查、停启用、发布等

原厂实体支持通过非固定自定义项进行主表字段扩展，包括文本、数值、日期、枚举、档案等类型

一个原厂实体预置最多可分配60个自定义项

原厂单据页面支持扩展，扩展页面删除后被扩展内容失效，可重新扩展

支持原厂页面布局设计重新调整

支持对原厂页面内的事件函数进行设置

原厂页面记录历史版本，支持版本回退

支持原厂页面设置交互规则

支持对原厂页面字段设置标题文本、显示隐藏、公式、数值范围、正则校验、默认值等

原厂扩展页面支持设置多个UI模板并分配

原厂扩展流程
原厂扩展规格设计

用户想要使用原厂扩展需要先购买该产品，对应不同开发场景对应编码如下：PointCode_ppm0000085414 = "ppm0000085414";// 公有云计量编码ppm0000085414、PointCode_ppm0000085795 = "ppm0000085795";// ISV计量编码ppm0000085795、PointCode_ppm0000085374 = "ppm0000085374";// 标准版计量编码ppm0000085374、PointCode_ppm0000085427 = "ppm0000085427";// 专业版计量编码ppm0000085427、PointCode_ppm0000086193 = "ppm0000086193";// 专属化产品编码ppm0000086193，购买规格后可在应用构建下看到原厂扩展入口。

原厂应用

在扩展入口下，可以看到不同领域下对应的原厂应用，可选择对应原厂应用进行扩展。这里领域和原厂应用数据可对照ui模板界面下数据，两者保持一致。

原厂单据

在扩展的原厂应用下，可看到不同服务下对应的单据。该单据信息和ui模板对应应用下发布的服务下的单据节点相同。

原厂模板

在对应服务节点下单据下，有不同模板可扩展，包括pc端模板、移动端模板、交易类型模板。

功能介绍
功能概述
数据建模

原厂应用的数据建模下，可在原厂实体下扩展子实体：

具体操作细节如下：

1、 数据建模列表上在实体显示名称后打标签标识分层，包括原厂、扩展、自建三种；

2、 支持查看扩展应用下可扩展的原厂实体列表，标识为“原”；

3、 支持查看原厂实体的详情和关系图，及原厂的字段属性；

4、 支持在扩展应用下新建数据模型，新建数据模型标识为自建，规则约束与自建应用下的数据模型维护相同

5、 自建实体只能选择本应用下自建实体做父实体

6、 不支持直接编辑、删除、停用原厂实体

7、 支持点击扩展按钮进行原厂实体的扩展编辑，进入元数据设计器进行编辑，编辑保存后实体标识为“扩”，且状态从“发布”变更为“更新”，保存为新版本，新版本发布后才可被引用的地方看到

8、 扩展实体支持编辑，编辑保存后保存为新版本，新版本发布后才可被引用的地方看到。

不可修改、删除、停用原厂实体详情的基本信息和已有的字段

10、 不支持对原厂实体删除、新增特性接口

11、 扩展实体下新建的实体属性的操作规则：实体未发布前允许删除，发布后实体也允许删除，删除时给出提示信息“删除实体属性后，数据库表中对应的字段将被删除，已产生的历史数据不再保留，是否继续？”

12、 扩展实体未发布前，可支持恢复至原厂版本，且标识变更回“原”；发布后再编辑只能恢复到扩展的上一个发布版本。

3.3页面扩展

原厂扩展模板，当前租户没有租户级默认模板，在系统级模板上扩展生成租户级默认模板去扩展，有租户级默认模板，在该模板基础上扩展。通过设计器编辑可自定义按钮、组件等信息。

3.4原厂扩展按钮权限注册

原厂单据可以在设计器界面增加自定义按钮，在设计器保存会自动注册按钮权限。主要是通过设计器保存协议区分哪些按钮是新增、更新和删除，然后再注册按钮到权限。

开发示例
原厂应用数据来源

调用ui元数据服务接口【/mdf/rest/v1/business_object_tree/getDomainAppTree】

，对应数据结构如下，领域和应用信息

{
"code":200,
"message":null,
"data":{
"appTree":[
Object{...},
Object{...},
{
"domainCode":"ctm",
"domainName":"财资服务",
"orderNum":null,
"domainId":"47a96fa6-6b83-4d40-8ee6-d3fbb2c9835a",
"apps":[
{
"appName":"资金结算",
"appId":"4edefad4-b937-458f-aecf-6a9aca6996b0",
"orderNum":null,
"appCode":"STWB",
"services":[
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"d41324ce-8a07-4425-9fa4-795c6bc2e0d2",
"serviceName":"自动生单失败处理"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"92b3ef44-abfa-44b1-bb71-0b438252f384",
"serviceName":"自动化结算规则"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"be7f1fde-5a66-4585-a895-b1124f0f3353",
"serviceName":"待结算数据"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"97ccf52d-13b7-4135-9b05-9d6c99717d16",
"serviceName":"资金计划项目对照表"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"9cd514d8-1fb3-49ab-be57-a0a146b873e6",
"serviceName":"手工结算结果修正"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"5003799a-b83b-44d4-83a7-3fad52b57042",
"serviceName":"手工结算批处理"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"caef6dbc-bd7d-4c76-be8f-a7a7478e817c",
"serviceName":"付款指令工作台"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"00160a2a-fb35-4564-8ad5-8fd2688f3af3",
"serviceName":"自动化指令提交规则"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"03688ece-dc4e-43b5-8d88-3e891ac571f1",
"serviceName":"结算工作台"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"97b8e94e-ea52-4b9b-a937-7a34f10084e9",
"serviceName":"结算变更"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"93c20e28-99e4-41d1-ad3e-3718aab11afb",
"serviceName":"结算操作设置"
},
{
"nexusType":null,
"serviceCode":null,
"domain":"stwb",
"orderNum":null,
"bills":null,
"appCode":"STWB",
"serviceId":"1d59b907-5d7a-4612-9389-38a7fdd9ed7b",
"serviceName":"指令日志查询"
}
],
"creatable":true
}
]
},
Object{...},
Object{...},
Object{...},
Object{...},
Object{...},
Object{...},
Object{...}
]
}
}



扩展原厂应用

原厂扩展应用先获取设计器是否存在该应用【ideAppService.findByTenantCode】，若不存在则新建【/appopen/product/saveapp】

原厂单据数据来源

扩展原厂页面

首先获取原厂应用下的单据信息，调ui元数据接口【/mdf/rest/v1/business_object_tree/getBusinessBillTree?appId=" + appId + "&appCode=" + appCode】

对应数据结构

{
"code":200,
"message":null,
"data":{
"billTree":[
{
"nexusType":"0",
"serviceCode":"salescontractreviselist",
"domain":"sact",
"orderNum":0,
"bills":[
{
"billName":"销售合同变更",
"serviceCode":"salescontractreviselist",
"billId":"8335",
"billType":"Voucher",
"domain":"sact",
"orderNum":10,
"appCode":"SACT",
"billNo":"sact_salescontractrevise"
},
{
"billName":"销售合同变更列表",
"serviceCode":"salescontractreviselist",
"billId":"8336",
"billType":"VoucherList",
"domain":"sact",
"orderNum":null,
"appCode":"SACT",
"billNo":"sact_salescontractreviselist"
}
],
"appCode":"SACT",
"serviceId":"148ff6c2-cd4a-4fc7-97cc-d026b2b45ddf",
"serviceName":"销售合同变更"
},
Object{...}
]
}
}


原厂模板数据来源

扩展原厂模板：调用ui元数据接口，具体接口信息以及返回的数据结构如下所示：【/mdf/rest/v1/business_object_tree/getNewTemplateListByBillParam"】

具体数据结构如下：

{
"code":200,
"message":null,
"data":{
"billTree":[
{
"pkTemp":"9728",
"tplNameSysResId":"P_YS_SCM_SACT-UI_0001201569",
"enableAssignRoleOrUser":false,
"tplNameResId":"P_YS_SCM_SACT-UI_0001201569",
"tempformName":"销售合同变更信息显示模板",
"enableAssignExtType":false,
"enableDeleteTpl":false,
"extended":true,
"mul_language":{
"zh_TW":"銷售合同變更信息顯示模板",
"en_US":"Sales Contract Change Info Display Template",
"zh_CN":"销售合同变更信息显示模板"
},
"terminalType":"1",
"sysflag":"N",
"domain":"sact",
"canCopy":false,
"enableProDesigner":false,
"isdefault":"Y"
}
]
}
}



扩展原厂模板主要调用ui元数据服务接口【 public static final String PRO_DESIGNER_BY_TPL_ID = "/rest/v1/business_object_tree/prodesignerByTplId";//扩展模板复制】

原厂扩展入口

原厂扩展入口展示是与租户挂钩的，使用原厂扩展之前，需要先购买原厂扩展，购买后才会在应用构建看到原厂扩展入口，使用原厂扩展。下面示例该租户没有购买原厂扩展，则在应用构建没有【扩展】入口。

扩展对应单据下模板，会报错以下问题【{"code":1001001000003,"message":"统一存储复制扩展页面异常：更新表单模板数据异常：调用设计:url:https://yonbip.diwork.com/iuap-yonbuilder-designer/appopen/product/mdd/copypage,tplUpdateParam:{"appCode":"sact","billNo":"sact_salescontractrevise","domain":"sact","extAppCode":"SACT","tenantId":"1793293037162752","tplId":"9728","tplName":"销售合同变更信息显示模板"},获取pageCode异常!设计返回数据:{"code":200,"data":"{\"success\":false,\"backMsg\":null,\"backData\":\"模板统一存储服务异常！接口调用失败，工具栏编码cGroupCode:sact_salescontractrevise_sharemerchant_toolbar_edit重复,无法存储！重复数据为:{\\\"templateType\\\":\\\"1\\\",\\\"parent\\\":\\\"sact_salescontractrevise_sharemerchant_base\\\",\\\"cGroupCode\\\":\\\"sact_salescontractrevise_sharemerchant_toolbar_edit\\\",\\\"tplmode\\\":0,\\\"groupId\\\":\\\"58865\\\",\\\"childrenField\\\":\\\"shareMerchants\\\",\\\"cDataSourceName\\\":\\\"Toolbar\\\",\\\"subid\\\":\\\"SACT\\\",\\\"cAlign\\\":\\\"right\\\",\\\"tpl_status\\\":\\\"UPDATE\\\",\\\"cDesignProps\\\":{\\\"uiisview\\\":true,\\\"nid\\\":\\\"nid_1653622573405_551\\\",\\\"uiTable\\\":\\\"BillToolbar\\\",\\\"uitype\\\":\\\"toolbar\\\",\\\"uiObject\\\":\\\"containers\\\",\\\"uititle\\\":\\\"工具栏\\\"},\\\"pubts\\\":\\\"1645200908000\\\",\\\"iOrder\\\":1,\\\"terminalType\\\":\\\"1\\\",\\\"bMain\\\":false,\\\"system\\\":1,\\\"cControlType\\\":\\\"toolbar\\\",\\\"billnumber\\\":\\\"sact_salescontractrevise\\\",\\\"designId\\\":\\\"toolbar_58865\\\"}null\"}"}更新表单模板数据异常：调用设计:url:https://yonbip.diwork.com/iuap-yonbuilder-designer/appopen/product/mdd/copypage,tplUpdateParam:{"appCode":"sact","billNo":"sact_salescontractrevise","domain":"sact","extAppCode":"SACT","tenantId":"1793293037162752","tplId":"9728","tplName":"销售合同变更信息显示模板"},获取pageCode异常!设计返回数据:{"code":200,"data":"{\"success\":false,\"backMsg\":null,\"backData\":\"模板统一存储服务异常！接口调用失败，工具栏编码cGroupCode:sact_salescontractrevise_sharemerchant_toolbar_edit重复,无法存储！重复数据为:{\\\"templateType\\\":\\\"1\\\",\\\"parent\\\":\\\"sact_salescontractrevise_sharemerchant_base\\\",\\\"cGroupCode\\\":\\\"sact_salescontractrevise_sharemerchant_toolbar_edit\\\",\\\"tplmode\\\":0,\\\"groupId\\\":\\\"58865\\\",\\\"childrenField\\\":\\\"shareMerchants\\\",\\\"cDataSourceName\\\":\\\"Toolbar\\\",\\\"subid\\\":\\\"SACT\\\",\\\"cAlign\\\":\\\"right\\\",\\\"tpl_status\\\":\\\"UPDATE\\\",\\\"cDesignProps\\\":{\\\"uiisview\\\":true,\\\"nid\\\":\\\"nid_1653622573405_551\\\",\\\"uiTable\\\":\\\"BillToolbar\\\",\\\"uitype\\\":\\\"toolbar\\\",\\\"uiObject\\\":\\\"containers\\\",\\\"uititle\\\":\\\"工具栏\\\"},\\\"pubts\\\":\\\"1645200908000\\\",\\\"iOrder\\\":1,\\\"terminalType\\\":\\\"1\\\",\\\"bMain\\\":false,\\\"system\\\":1,\\\"cControlType\\\":\\\"toolbar\\\",\\\"billnumber\\\":\\\"sact_salescontractrevise\\\",\\\"designId\\\":\\\"toolbar_58865\\\"}null\"}"}","data":null}】类似这种问题，需要找对应领域确认下注册的模板数据是否正确。

其次，可能也会碰到提示没有权限，这类问题是该领域没有开通高级设计器入口，需要找ui模板开发开通该领域。报错信息具体如下【{"code":1001001000003,"message":"统一存储复制扩展页面异常：更新表单模板数据异常：调用设计:url:https://yonbip.diwork.com/iuap-yonbuilder-designer/appopen/product/mdd/copypage,tplUpdateParam:

{"appCode":"QMS-QIT","billNo":"qms_LLCheckApply_card","domain":"QMS-QIT","extAppCode":"QMSQIT","tenantId":"kkru61dj","tplId":"209","tplName":"页面模板"}

,获取pageCode异常!设计返回数据:{"code":200,"data":"

{\"success\":false,\"backMsg\":null,\"backData\":\"模板统一存储服务异常！接口调用失败，异常编码:2090409110007,异常信息:租户:kkru61dj,服务域:QMS-QIT,无权限操作,异常详情:#checkTenantDomainAuth#租户用户无权限存储数据null\"}

"}更新表单模板数据异常：调用设计:url:https://yonbip.diwork.com/iuap-yonbuilder-designer/appopen/product/mdd/copypage,tplUpdateParam:{"appCode":"QMS-QIT","billNo":"qms_LLCheckApply_card","domain":"QMS-QIT","extAppCode":"QMSQIT","tenantId":"kkru61dj","tplId":"209","tplName":"页面模板"},获取pageCode异常!设计返回数据:{"code":200,"data":"

{\"success\":false,\"backMsg\":null,\"backData\":\"模板统一存储服务异常！接口调用失败，异常编码:2090409110007,异常信息:租户:kkru61dj,服务域:QMS-QIT,无权限操作,异常详情:#checkTenantDomainAuth#租户用户无权限存储数据null\"}

"}","data":null}】

新老版本原厂扩展使用问题

原厂扩展改版前的应用、单据等信息是通过脚本维护的。主要涉及global_config、hpa_domain_conf、hpa_uitemplate_conf这三张表数据维护。global_config主要控制租户是否开通原厂扩展，对应最新版原厂扩展是现在需要购买原厂扩展、hpa_domain_conf对应维护领域下的应用信息等、hpa_uitemplate_conf主要维护需要扩展的单据信息。

最新原厂扩展数据都是调用ui元数据服务获取，数据和ui模板节点数据一致。对于之前使用过原厂扩展应用的，升级到最新原厂扩展，以前扩展的应用只能看不能再扩展新单据，如果需要扩展新单据，需要在扩展入口扩展相同应用，在新扩展的应用下扩展单据。具体操作流程可参考如下：

使用老版原厂扩展的应用，发布状态为未发布，可以根据这个发布状态区分下是新扩展应用还是原来扩展的。

在原来扩展的【销售管理扩展】应用下，页面建模页签下已经扩展过的单据可以看到，只是不能再扩展该应用下的其他单据，扩展入口封掉了。

在新扩展的应用下，可以扩展其他单据，同时在之前扩展过的单据下的模板不允许再次扩展，例如【退货单列表】

之后需要扩展【销售管理】的单据，可在新扩展的应用下进行扩展和功能增强。