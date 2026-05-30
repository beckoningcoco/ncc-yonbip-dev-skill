工作流开发
最后更新时间：2025-09-22
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	是
私有云	客户化定制开发	是
专属云	客户化定制开发	是
本地部署	客户化定制开发	是
公有云	ISV生态开发	是
私有云	ISV生态开发	是
专属云	ISV生态开发	是
本地部署	ISV生态开发	是
业务场景

在项目交付和产品开发中，平台工作流有着广泛的业务场景和个性化需求。本文将重点介绍平台工作流在项目交付和产品开发过程中如何扩展开发和相关常见问题，便于快速开发工作流相关需求，快速定位工作流相关问题，以提高效能。

关键词

工作流、单据注册、事件中心、事件订阅、YPD预置插件

平台工作流简介

工作流是在Flowable框架基础上基于企业开发场景扩展后实现的流程引擎服务。在提供核心运行引擎的基础上，提供了包括单据注册管理、模型管理、流程的可视化设计器、流程的调度及统计、以及各项流程辅助工具等面向企业多组织开发场景的完整流程设计、运行及管理服务。

工作流采用独立微服务方式部署，业务系统通过工作流提供的后端SDK及前端的审批组件与工作流服务进行交互，驱动流程的运转。

目前无论使用低代码平台开发的单据，还是标准领域服务开发的单据，均使用框架与流程进行对接，一般不需要开发者手动进行代码开发。 接入方(领域标品和低代码开发的单据)与工作流的接入主要包含以下部分：

接入方在注册业务对象后设计发布流程模型；
接入方通过后端框架 SDK 查询当前业务对象实例是否受流程控制、发起\撤回 流程、更新流程变量、查询流程当前处理人。
接入方通过前端框架引入工作流的 Web 审批组件和移动审批组件，即点击单据上的审批流按钮，查询流程历史、处理流程待办、查看流程图。
当流程已经接受到来自框架的提交请求、审批组件的待办处理请求后，会根据流程模型的分支条件计算下一环节，根据流程环节的参与人配置查找环节处理人，向消息平台发送通知、已办、待办等。
后端框架通过分布式事务组件 YTS 进行提交与撤回的分布式事务控制，保障提交和撤回的流程一致性。 当流程结束或被驳回时，工作流通过回调接口调用后端框架更新单据状态，通知业务进行处理。 当前回调接口超时后，工作流会依据回调配置，将流程设置为挂起状态，等待后端框架的超时补偿事件， 与此同时将该流程实例加入到一致性查询的轮询对接中，两处有一处返回时，流程将依据结果进行解除流程挂起， 或回滚流程操作。若30分钟均未得到结果，工作流将认定回调失败，回滚流程操作。
扩展开发方法
事件扩展
事件中心中注册

事件中心扩展的方式不适用于公有云开发，且无法配置迁移。

事件中心地址

工作台域名+/iuap-apcom-event/ucf-wh/eventCenter/index.html

事件类型中找事件源和事件类型并增加监听

事件源示例（以人力为例，具体事件源为各领域预置的，如果需要监听，需要和对应领域研发确认。）

事件源名称	事件源编码	所属应用
活动节点人力云事件源	bpm_activity_hr_cloud	流程管理
云流程人力云事件源	bpm_process_hr_cloud	流程管理
任务人力云事件源	bpm_task_hr_cloud	流程管理

任务事件类型

事件类型名称	事件类型编码
任务完成	complete
任务创建	create
任务跳转	jump
撤回	withdraw
删除	delete
超时	outtime

流程事件类型

事件类型名称	事件类型编码
流程结束	end
流程开始（提交）	start
撤回流程（反提交）	deleteAll
撤回终审	excution_withdraw（仅限终审撤回）

任务事件和流程事件的区别：

流程事件的主角是流程实例，如流程启动，流程关闭；任务事件的主角是各审批节点，如果审批节点的同意，拒绝等。

配置事件监听

在事件中心对应要监听的事件源的事件类型下新建监听事件，配置监听建议用请求方式为RPC方式，

对应的事件接收地址为：rpc://bean对应微服务编码@微服务的客户端id/beanName

- bean对应微服务编码：引擎编码（默认）

- 微服务的客户端id：技术平台的微服务注册中心查找

- beanName：监听类的beanName（参考3.1.1.3的listenAuditActivity）

编写事件监听代码

事件监听示例代码：

@Component("listenAuditActivity")
@Slf4j
public class ListenAuditActivity implements IEventReceiveService {

@Override
public String onEvent(BusinessEvent businessEvent, String queueName) throws BusinessException {
try {
Map userObject = new ObjectMapper().readValue(businessEvent.getUserObject(), Map.class);
/*
businessKey 业务活动规则编码 （低代码单据为业务对象_id,原厂的需要找对应领域研发确认）
taskId 任务事件会有对应的任务id
userObject里的关键参数：
processInstId:流程实例id；
processEnd:流程是否结束
tenantCode:微服务编码_租户
eventCenterEventSource:监听的事件中心事件源
userid:节点处理人id
userName:节点处理人姓名
*/
log.info("userObject信息：",userObject.toString());
HashMap<String, String> result = new HashMap<>();
result.put("success","true");
return new ObjectMapper().writeValueAsString(result);
} catch (JsonProcessingException e) {
log.error(MessageFormat.format("onEvent报错信息：{0}", e.getMessage()), e);
}
return null;
}
}

事件订阅

通过事件订阅进行扩展事件可以参考社区文档：[事件订阅]。

通过框架扩展
YPD后端框架

可通过YPD预置插件实现扩展

actionCode	plugin	备注
ACTIONCODE_AUDIT	beforeAudit	执行审核前处理插件
ACTIONCODE_AUDIT	afterAudit	执行审批后处理插件
ACTIONCODE_SUBMIT	beforeSubmit	执行提交前处理插件
ACTIONCODE_SUBMIT	afterSubmit	执行提交后处理插件
ACTIONCODE_UNAUDIT	beforeUnAudit	执行弃审前处理插件
ACTIONCODE_UNAUDIT	afterUnAudit	执行弃审后处理插件
ACTIONCODE_UNSUBMIT	beforeUnSubmit	执行反提交前处理插件
ACTIONCODE_UNSUBMIT	afterUnSubmit	执行反提交后处理插件
ACTIONCODE_BPMCOMPLETE	beforeBpmcomplete	审批流回调前处理插件
ACTIONCODE_BPMCOMPLETE	afterBpmcomplete	审批流回调后处理插件

扩展插件的写法：

所有插件继承AbstractBillPlugin，并重写需要扩展的方法。支持业务对象级扩展。示例代码：

@BillPlugin(busiObj = "GreenTeaFrappucino")
@Slf4j
public class TestPlugin extends AbstractBillPlugin {
@Override
public void beforeAudit(YpdBillContext billContext) throws Exception {
GreenTeaFrappucino billDO = (GreenTeaFrappucino) billContext.getBillDO();
log.info(billDO.toString());
}
}

MDD后端框架

MDD后端框架扩展时，需要先在低代码单据设计器页面扩展相关动作的规则，如在自建单据审核按钮动作扩展规则链：

也可在以下动作节点扩展规则：

- 提交审批流扩展：增加submit的规则

- 撤回提交审批流扩展：增加unsubmit的规则

- 终审扩展：增加audit的规则

可参考文档[基于平行表的标品扩展开发]中的规则链扩展功能。

MDF前端框架
beforeWorkflow 打开审批组件前事件

示例代码：

// @params params action传入的参数
// @params data 传给审批组件的参数
viewmodel.on('beforeWorkflow', ({ params, data }) => {
// 可以在这里修改传给审批组件的值 data.bussinessKey等
data.rejectToActivity = true // 开启由退回人选择的时候可以通过这个参数设置默认的退回重新提交方式为提交成功之后重新返回本环节
})


效果：

afterWorkflowBeforeQueryAsync 点击同意、退回等审批面板中的按钮然后点同意后触发事件

示例代码：

viewmodel.on('afterWorkflowBeforeQueryAsync', (data) => {
// 处理逻辑
})


效果如下：

workFlowClose 关闭审批组件都会走

示例代码：

// @params callbackData 审批流面板操作返回参数
viewmodel.on('workFlowClose', (callbackData) => {
// 处理逻辑
})


效果如下：

beforeWorkflowAction 点击审批按钮前置事件

示例代码：

// resolve必须执行
// resolve传入true 代表成功
// resolve传入false 代表失败
// 领域在扩展脚本的init中监听事件
viewmodel.on('beforeWorkflowAction', ({ data, resolve }) => {
// data: 审批流传入的数据
// resolve： 自己的异步逻辑执行完成之后成功调用 resolve(true) 失败调用 resolve(false)
if ('成功') {
resolve(true)
} else {
resolve(false)
}
return false; // 这个也必须这么写
});


效果如下：

服务扩展

工作流节点中的服务是各个领域注册的校验逻辑。项目或生态产品想实现工作流某个环节，调用外部三方审批接口校验，校验成功或失败影响流程运转，以上场景可以使用服务来解决。

注意：服务扩展为系统级功能，不适用于公有云客开。

注册服务

注册服务需要在工作流的表bpm_id_basicdata里新增相关内容。

具体SQL为：

INSERT INTO`iuap_apcom_workflow`.`bpm_id_basicdata`(`ID_`,`REV_`,`ENABLE_`,`CREATE_TIME_`,`MODIFY_TIME_`,`CODE_`,`NAME_`,`TYPE_`,`CATEGORY_`,`TENANT_ID_`,`URL_`,`TOKEN_`,`OPERATIONS_`,`SOURCE_`,`PROCDEF_ID_`,`ACTIVITY_ID_`,`SYNC_`,`ISVTAG`,`EVENT_CENTER_`,`ytenant_id`,`micro_service_code`,`applicationCode`)VALUES('0101417c-6726-11e9-a714-54ee75a2b2222',1,'1','2022-05-31 16:18:12','2024-01-17 15:14:20','nocodeTest',' ISV生态服务扩展测试 ','bpm_service_callback','~','u8c','{{#domain.iuap-apcom-workflownew}}/approve-component/api/v1/service/nocode','PU','{"serviceParams":[{"id":"stringid","code":"文本","name":"","type":{"name":"string"},"system":false,"extendData":{}},{"id":"selectid","code":"枚举","name":"","type":{"name":"select"},"system":false,"extendData":{"options":[{"defOption":false,"componentKey":"Option","value":"选项一","key":"1"},{"defOption":false,"componentKey":"Option","value":"选项二","key":"2"},{"defOption":false,"componentKey":"Option","value":"选项三","key":"3"}]}},{"id":"referenceid","code":"参照","name":"","type":{"name":"reference"},"system":false,"extendData":{"refParam":{"isAllDataRange":true,"columncode":"bustype_name","formName":"","hasLinkage":false,"pk_bo":"PU.pu_applyorder","relate_pk_bo":null,"componentKey":"Reference","contMetaType":null,"fieldId":"bustype_name"},"originalData":{"bPrintCaption":true,"iTplId":435633117,"bEnum":false,"cShowCaptionResid":"P_YS_PF_GZTSYS_0000012631","isshoprelated":false,"cRefId":{"bustype":"id","bustype_code":"code"},"isTransType":true,"cDataSourceName":"pu.applyorder.ApplyOrder","iMaxShowLen":255,"iBillTplGroupId":37187137,"iBillEntityId":723623195,"iFieldType":1,"bVmExclude":0,"iSystem":1,"bSplit":false,"bHidden":false,"id":424725033,"refReturn":"name","bCanModify":true,"iOrder":60,"bPrintUpCase":false,"cRefRetId":{"bustype":"id"},"bNeedSum":false,"iMaxLength":255,"fieldRuntimeState":false,"isExport":true,"multiple":false,"cShowCaption":"","bFilter":true,"bExtend":false,"bMustSelect":true,"iAlign":1,"cExtProps":{"entityCode":"pu_applyorder","treeTypeValue":"1"},"bMain":true,"bEnableFormat":false,"cControlType":"refer","cCaptionResid":"P_YS_PF_GZTSYS_0000012631","iColWidth":1,"bSelfDefine":false,"bShowIt":true,"cRefType":"transtype.bd_billtyperef","cStyle":{"explains":"code","examples":"A25001","tips":""},"bJointQuery":false,"cItemName":"bustype_name","cFieldName":"bustype.name","uncopyable":false,"bIsNull":false,"cCaption":""},"refCode":"transtype.bd_billtyperef"}}]}','PU','~','~','1',NULL,'0','0','yonbip-scm-pu','PU');


主要参数说明：


参数	说明
code	服务编码，英文
name	服务名称，中文
operations	业务提供的业务参数，在服务中可配置选择
{
"serviceParams":[
{
"id":"stringid",
"code":"文本",
"name":"",
"type":{
"name":"string"
},
"system":false,
"extendData":{
}
},
{
"id":"selectid",
"code":"枚举",
"name":"",
"type":{
"name":"select"
},
"system":false,
"extendData":{
"options":[
{
"defOption":false,
"componentKey":"Option",
"value":"选项一",
"key":"1"
},
{
"defOption":false,
"componentKey":"Option",
"value":"选项二",
"key":"2"
},
{
"defOption":false,
"componentKey":"Option",
"value":"选项三","key":"3"
}
]
}
},
{
"id":"referenceid",
"code":"参照",
"name":"",
"type":{
"name":"reference"
},
"system":false,
"extendData":{
"refParam":{
"isAllDataRange":true,
"columncode":"bustype_name",
"formName":"",
"hasLinkage":false,
"pk_bo":"PU.pu_applyorder",
"relate_pk_bo":null,
"componentKey":"Reference",
"contMetaType":null,
"fieldId":"bustype_name"
},
"originalData":{
"bPrintCaption":true,
"iTplId":435633117,
"bEnum":false,
"cShowCaptionResid":"P_YS_PF_GZTSYS_0000012631",
"isshoprelated":false,
"cRefId":{
"bustype":"id",
"bustype_code":"code"
},
"isTransType":true,
"cDataSourceName":"pu.applyorder.ApplyOrder",
"iMaxShowLen":255,
"iBillTplGroupId":37187137,
"iBillEntityId":723623195,
"iFieldType":1,
"bVmExclude":0,
"iSystem":1,
"bSplit":false,
"bHidden":false,
"id":424725033,
"refReturn":"name",
"bCanModify":true,
"iOrder":60,
"bPrintUpCase":false,
"cRefRetId":{
"bustype":"id"
},
"bNeedSum":false,
"iMaxLength":255,
"fieldRuntimeState":false,
"isExport":true,
"multiple":false,
"cShowCaption":"",
"bFilter":true,
"bExtend":false,
"bMustSelect":true,
"iAlign":1,
"cExtProps":{
"entityCode":"pu_applyorder",
"treeTypeValue":"1"
},
"bMain":true,
"bEnableFormat":false,
"cControlType":"refer",
"cCaptionResid":"P_YS_PF_GZTSYS_0000012631",
"iColWidth":1,
"bSelfDefine":false,
"bShowIt":true,
"cRefType":"transtype.bd_billtyperef",
"cStyle":{
"explains":"code",
"examples":"A25001",
"tips":""
},
"bJointQuery":false,
"cItemName":"bustype_name",
"cFieldName":"bustype.name",
"uncopyable":false,
"bIsNull":false,
"cCaption":""
},
"refCode":"transtype.bd_billtyperef"
}
}
]
}
source	业务标识
url	服务地址，示例：{{#isvdomain.url}}/api/voucher/check/batchVerifyPrice?yht_access_token={yht_access_token}
调用业务服务

工作流调用注册服务的相关说明如下：

1、请求方式：POST请求；

2、鉴权方式：提供yhtAccessToken，二者任选其一：

a、请求的地址提供参数yht_access_token

b、请求头信息中提供参数yht_access_token

3、请求参数：

{
"businessKey": "业务发起流程时设置的值",
"procInstId": "流程实例ID",
"id": "业务单据实例ID",
"processVariable": {
"initiatorDept": "发起人部门",
"initiator": "发起人",
"initiatorUserGroup": "发起人所属用户组",
"isManager": "发起人是否部门负责人",
"lastApproveUserGroup": "上一环节审批人所属用户组",
"lastApproveDept": "上一环节审批人所属部门"
},
"busiParams": {
"nextStatus": "",
"backStatus": ""
}
}


4、响应参数：

{
"code":200,
"message":"操作成功",
"data":true,
"updatevariable":{
"key":"value"
},
"controlDegree":"strong"
}


5、响应参数说明：

流程根据code的值判断服务是否调用成功，code=200调用成功；code等于其它值调用失败，审批组件弹出业务返回的message信息，流程保持当前状态；

data是一个布尔值，标识业务通过true/不通过false，code=200调用成功时，以data返回值判断流程是否继续流转，data=true，流程继续流转；data=false，审批组件弹出业务返回的message信息，流程保持当前状态；

updatevariable不是必须值，如果业务方有需要修改的流程变量，可以放在这里，其中key为要修改的流程变量id，value为修改后的值，流程接到值后会修改流程变量表数据（code=200调用成功时，修改流程变量）；

controlDegree不是必须值，返回strong表示业务返回强管控，如果此时业务不通过，审批组件页面会弹出强管控窗口，返回weak表示弱管控，页面弹出弱管控窗口。

使用服务

1、打开工作流设计设计器，选择服务扩展环节，点击右侧属性【高级】页签和【扩展】子页签，点击【新增扩展】；

2、扩展类型选择【新增】，选择关联流程动作，选择管控强度，点击”加好“增加服务参数配置。

强管控：流程回调业务，业务返回false，流程审批组件弹出强管控提示框，提示信息，流程不会继续流转，当前环节审批任务状态不变。

弱管控：流程回调业务，业务返回false，流程审批组件弹出弱管控提示框，提示信息，用户点击”确定“，继续审批；用户点击”取消“，取消审批，当前环节审批任务状态不变。

服务参数：流程字段、流程变量，业务参数（业务注册服务时配置的参数）。

关联服务选择注册的服务：

监听审批流活动示例
按照3.1.1注册监听事件

监听接口代码

beanName要映射上图的配置的接收地址，监听示例代码：

@Component("listenAuditActivity")
@Slf4j
public class ListenAuditActivity implements IEventReceiveService {

@Override
public String onEvent(BusinessEvent businessEvent, String queueName) throws BusinessException {
try {
//拿上下文信息
Map userObject = new ObjectMapper().readValue(businessEvent.getUserObject(), Map.class);
log.info("userObject信息：",userObject.toString());
//写对应的业务逻辑
HashMap<String, String> result = new HashMap<>();
result.put("success","true");
return new ObjectMapper().writeValueAsString(result);
} catch (JsonProcessingException e) {
log.error(MessageFormat.format("onEvent报错信息：{0}", e.getMessage()), e);
}
return null;
}
}

常见问题
想在YPD开发的单据审批中实现编辑后直接保存并调用提交动作，如何实现？

- 增加对应单据的YPD插件，重写对应的afterSave方法

- 在方法调用com.yonyou.ypd.bill.action.submit.BillSubmitProcessor#submitBill将单据提交审批。

注意：如果低代码单据配置的审批流里有分支，且分支条件依赖于单据上的某个字段，那么需要用异步方式在save动作的事务后发起提交，要保证提交的事务在保存的事务之后发生。

如何自定义审批人

通过审批流预制的【外部审批人】接口，代码实现：

预置SQL脚本注册自定义角色，注册后可以从参与人的选择处理人中找到注册的角色
-- 防止有重复数据，先删除。
DELETE FROM iuap_apcom_workflow.bpm_id_basicdata WHERE CODE_ ='extField_kscjl' AND TENANT_ID_ LIKE '%_USMPEXP';
-- 插入注册数据
INSERT INTO `iuap_apcom_workflow`.`bpm_id_basicdata`(`ID_`,`REV_`, `ENABLE_`, `CREATE_TIME_`, `MODIFY_TIME_`, `CODE_`, `NAME_`, `TYPE_`, `CATEGORY_`, `TENANT_ID_`, `URL_`, `TOKEN_`, `OPERATIONS_`, `SOURCE_`, `PROCDEF_ID_`, `ACTIVITY_ID_`, `SYNC_`, `EVENT_CENTER_`)
select (SELECT UUID()),1, '1', NOW(), NOW(), 'extField_kscjl', 'KSC经理', 'user', NULL, alias, 'https://bip-prd.feihe.com/fhyxfy-be/external/getExtField/bpm/eval/rule', 'h0YXe53Tuq5/UUTqvJTwjh+iYWAWop1DRWlzfgIhltvpr095+i9SBwgd4p7HjvKL23yO8KaHMa+z7CZRWGGrQQ==', '~', '~', '~', '~', '1', NULL
from usmp.tenant
where not exists (select 1 from `iuap_apcom_workflow`.`bpm_id_basicdata` bas INNER JOIN usmp.tenant utt on utt.alias = bas.TENANT_ID_ where bas.CODE_ = 'extField_kscjl' and bas.TENANT_ID_ = utt.alias);


特殊字段注意：

- ID_ ：需要UUID生成

- CODE_ ：格式为：extField_ 加上对角色的自定义取名 如extField_kscjl

- TYPE_ ：必须是user

- TENANT_ID_ ：格式为：租户id加下划线再加项目cSubId

- URL_ ：应用开发的查询审批人的接口地址，等待审批流调用

- TOKEN_ ：UUID生成一个字符串即可

开发接口

接口示例代码：

/**
* 流程角色（外部变量）回调求值接口
* * @param callData
* @return 结果映射
*/
@ResponseBody
@PostMapping(value = "/getExtField/bpm/eval/rule")
public Map<String, Object> evalRule(@RequestBody Map<String,Object> callData) {
/**
* 返回值：key是第一步注册角色编码，值为友户通user_id，可用英文逗号间隔
{
" extField_kscjl ": "user_id01,user_id02 "
}
*/
}

常见问题
工作流设计中左侧树看不到节点
确认对象建模——业务对象——场景支持中是否勾选审批
如果已经勾选了审批，但是还看不到节点的，需要检查下基础档案的数据：

select bb.is_support_workflow ,bb.* from iuap_apdoc_basedoc.bd_billtype bb where service_code ='1812216731595702273';

注意上面的记录应该有2条，1条0租户，1条租户级

如果缺少将表备份后，手工补录。

提交成功，点击审批打开审批流组件时报错 未找到流程实例

a. 查看 流程实例ID (procinstId) 字段是否有值。如果没值说明未找到流程定义，审核场景。

b. 查看报错接口header中的Tenantappsource是否正确，值为domain。Tenantappsource如果不对，说明统一node缺少配置

"env": {
"__WORKFLOW_META__": {
"appSource": "domainCode"
}
},


c. 查看报错接口参数businessKey值，正确值为 busiObjCode_id。如果值为billno_id，说明单据url中缺少busiObj参数

设置了组织级流程不生效

组织级流程需要单据中有主组织字段

- 引用接口勾选主组织

- 业务属性中组织字段打主组织[isMasterOrg]标签

如果确认设置了主组织字段还不生效，跟下代码或者arthas抓一下 com.yonyou.ypd.bill.bpm.BpmUtils#getMasterOrg

单据提交后提示正在等待业务提交后处理结果

提交即完成的流程，需要收到框架发的事件之后，工作流服务才会去回调领域。

出现正在等待业务提交后处理结果，这种场景表示的是流程还没有收到框架发的事件，还没有进行回调。

如果是一段时间后刷新成功或者一直刷新不成功，请去事件中心查一下框架是否发了事件。

事件源编码：MDD_SUBMIT_AUTOAUDIT_CALLBACK

当流程结束审批后，单据状态还是审批中，终审任务审批也没有错误提示。

可以流程监控节点，查看对应单据的流程日志，进行详细判断。

审批组件提示：业务回调结果处理中，请稍后刷新重试

这个提示的含义是：流程还未处理完成，但是单据状态变为已审核。

解决方法：查一下是否注册了多条同步回调记录

select * from iuap_apcom_workflow.bpm_id_basicdata where source_ = '对应领域的source'

如果type_相同，Source_相同的数据有两条，请删除一条数据，如若不是，再排查一下是否是流程回调的服务时间太长了。

参考资料

官方文档

流程引擎数据字典

事件订阅