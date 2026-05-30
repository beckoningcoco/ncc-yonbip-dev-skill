安全权限改造方案
最后更新时间：2024-03-27
概述

YonBIP在R2_2302_1版本以前按钮动作接口调用的时候，没有做强权校验，例如在客开时，直接调用客户档案的保存接口进行数据插入，在接口调用时没有校验租户是否有客户档案保存按钮的权限，有些项目出于安全问题，提出此项安全漏洞。

所以，在YonBIP发版的20230517SP补丁时，解决了此类问题，项目上可以根据安全要求启用“严控开关”来解决。

安全权限改造过程
MDD版本要求

20230517BIP发版SP补丁，本版本已经完成安全权限严控开关改造，参数是control_noauthid，默认true。

如果项目升级了此SP补丁，对于项目上客开自建引擎的mdd版本要求如下：

项目升级SP补丁后，严控开关可以不开启，那么mdd至少要是6.0版本，也就是项目客开引擎至少升级到R2。
项目升级SP补丁后，严控开关开启，那么要mdd660以上，涉及脚手架升级，ypd页面改造工作。
严控开关参数说明

严控开关参数配置位置是YMS管理控制台的【配置管理】->【YonBIP】->【基础全局公共配置】，参数名称是：authid严控开关，参数编码：control_noauthid，默认值：true。

如果领域不准备开启严控开关，可以微服务级关闭，需要在配置里面添加对应参数，并设置为FALSE。

YPD权限配置
页面按钮权限启用控制

单据上可以启用按钮(功能)权限控制【该功能主要为控制按钮的显示和隐藏，非必须配置】。

从YPD2.1.2版本开始不再使用开关，强制开启功能权限(计划3月3日提供，3月3日之前仍受控)。

页面按钮完善authid

YPD框架根据UI协议的动作action的authid进行功能权限校验，即工作台功能权限注册里的button_code与action的authid一致则放行。

按钮上的authid和action的authid分别控制前后端功能权限。如果产品设计上可不控制前端显示可仅配置action的authid，即仅控制后端接口越权。

如果通过应用构建发布自动注册工作台功能权限，列表卡片页action的authid默认规则是单据编号+卡片action，可手工调整。设计器保存时会将button的authid补全到action的authid中。

原厂产品开发往往使用运营后台进行功能权限注册，需要手工添加authid(设计器上编辑协议的方式)，如crud、提交、审核等业务功能建议单独配置authid。

YPD框架总体控权逻辑为：1.校验细粒度authid是否有权；2.如果authid未通过，serviceCode做兜底验证。

注意：一定保证同一action的authid要保持一致，才能达到相同action受同一功能权限项控制的目的。

authid强制越权检查过程

authid强制越权检查，暂未开启目前仍是serviceCode非空控权，待财务确认后再整体开启control_noauthid的强控，检查规则如下：

管理员身份不做越权检查。
YPD框架级流程回调接口白名单: /bpm/complete。
增加控制参数白名单范围内的url不进行serviceCode强校验：ypd.servicecode.nonecheck.whitelist(YMS或脚手架添加上面的配置)，该白名单内配置请求接口的url(多个url以逗号分隔)，配置的url接口不进行serviceCode权限以及serviceCode非空校验，示例： ypd.servicecode.nonecheck.whitelist=url1,url2,url3。

设计器需要特殊配置的action

1、公共请求可配置到CommonCommand的action上，authid值为当前单据的serviceCode。在单据的actions中手工加上CommonCommand。

公共请求/bill/list，/bill/querytree ，/bill/detail等，示例：

{

"DESCRIPTION": "公共请求",

"authid": "服务编码serviceCode",

"cAction": "CommonCommand",

"cCommand": "CommonCommand",

"id" : "commonCommandId"

}


2、批量操作batchDo接口(请求中有actionCode参数)最终以单个Action的authid为准。

3、领域可配置是否找不到action时走CommonCommand，参数: ypd.custom.defaultCheckCommonCommandAction，值为true时 找不到action时走CommonCommand的authid，由领域决定要不要开启。

4、审批消息鉴权采用动态权限的方式，消息中心会固定加参数来识别审批消息: adt=fw；识别后走动态权限token进行控权。

自定义接口
越权校验

自定义接口两种方式：

通过DiworkPermission注解自助鉴权。
通过ypd框架进行越权校验。
方式一：DiworkPermission注解自助鉴权

通过DiworkPermission注解自助鉴权(DiworkPermission/ButtonPermission)。

方式二：通过ypd框架进行越权校验

分为两种方案：旧版方案和新版方案。

第一种：旧版配置方案

通过ypd框架进行越权校验，设计器需要配置action，cSvcUrl 为接口路径 。

第二种：新版配置方案--推荐使用

自定义接口，领域开启：ypd.custom.defaultCheckCommonCommandAction 配置，并且配置commoncommand action，并且传参中需要有billnum。

后端在查询不到authid后，会默认取commoncommand配置中的authid。

越权校验类的扫包范围配置

需要确保接口所在包路径，在越权校验类的扫包范围内。

自定义接口billnum的获取问题

YpdAuthControllerAop中无法获取到billnum的问题，解决方案有两种(二选一)：

1、在请求链接中加上billnum参数： 例：URL?billnum=xxxxxx。

2、配置文件添加：ypd.auth.filterAop=/rollup/exec/allstep,/roll/step，配置文件添加该配置，value内容为要校验的接口路径。多个路径以逗号分隔 (支持通配符)。

action缺少authid自查

测试环境系统级数据统计缺少authid的单据：

1、测试环境mongo uimeta系统级只读账号信息：uimeta_export:dongzhk@172.20.32.244:27020/uimeta。

2、统计语句（按应用统计）：

var appCode=["appCode1","appCode2","appCode3"];db.uimeta_bill.find({cSubId:{$in:appCode}, actions:{$ne:[], $elemMatch:{authid:{$exists:false}}}},{cSubId:1,cBillNo:1,actions:1,pubts:1}).sort({cSubId:1});
MDD框架越权拦截原理说明

根据安全要求，MDD开发框架提供了统一的AOP拦截，进行常用功能的统一越权处理。

控制对象

业务动作(按钮)：领域在框架配置的按钮动作，对应后台bill_command表,表结构如下：

Column	Data type	Attributes	Default	Description
id	BIGINT	PRIMARY, Not null		主键
name	VARCHAR(100)	Not null		命令名称
action	VARCHAR(100)	Not null		动作名称 例：save detail等
billnumber	VARCHAR(200)	Not null		单据编码
target	VARCHAR(200)		NULL	对应按钮区域名
ruleid	VARCHAR(100)		NULL	规则id
parameter	VARCHAR(200)		NULL	命令参数 JSON结构 例：{“isAsync”:true}或{“action”:”cooperation”} 等
svcurl	VARCHAR(1000)		NULL	命令对应路由
httpmethod	VARCHAR(10)		NULL	请求方式 GET POST
subid	VARCHAR(10)		NULL	模块名
system	INT		‘0’	系统预置标识
pubts	TIMESTAMP	Not null	CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP	时间戳
tenant_id	BIGINT	Not null	‘0’	租户id
authid	VARCHAR(50)		NULL	权限id
description	VARCHAR(30)		NULL	描述说明
auth_suffix	VARCHAR(200)		NULL	权限后缀扩展，JSON格式，key,value都是字符类型，适用相同单据动作通过URL参数区别节点的场景
ytenant_id	VARCHAR(36)	Not null	'~'	租户id

说明：

领域需要通过billnumber和url确定每一个命令，并且需要为该命令设置全局唯一的authid，并到权限服务中进行注册。
如果一个billNumber拥有多条相同url的，则需要通过suffix来进行区别（后续有说明）。
框架会根据前端传递的billnumber和url，获取到对应的authId，然后到权限服务中进行鉴权处理，如果相关authid没有权限，框架会抛出没有相应权限异常。
如果authid为空，除非是框架注册过的公共请求（后续有说明），否则在严格模式下，框架会认为领域没有按照规范注册authId，抛出相关异常。
领域修改该表后要生效，需要清理redis缓存，清理key为 actionAuth_ 开头的相关redis数据。
或者使用请求进行清理，该地址最好不要暴露，使用前先需要获取secret。
secret获取地址为：https://环境domain/yms微服务编码/home/getSecret。
清除缓存地址为：https://环境domain/yms微服务编码/cache/refreshCache?types=actionAuth&secret=前面获取到的secret。
拦截器拦截范围

@Pointcut("execution(* com.yonyou*...controller..(..))")

在此范围内的所有controller的REST请求，都会被框架统一拦截器拦截，框架拦截器代码类为：com.yonyou.ucf.mdd.ext.aop.AuthServiceContextAop。

几种不进行权限拦截的特殊情况

1、审批流详情查看兼容逻辑。

只兼容detail（查看详情）动作，且请求参数中billnum和单据id不能为空，框架根据两者组合出流程需要的businessKey，调用审批流接口 yonyou.bpm.rest.HistoryService#getHistoricTasksCount判断是否在审批流中，如果在会跳过权限拦截。

2、框架全局权限开关关闭（默认开启，预留目的为开发本地开发临时关闭用）。

3、请求参数中获取到动态权限token（具体动态权限配置使用请咨询权限服务）。

4、领域个别在拦截范围内的Rest接口不需要权限控制，通过配置注解 @Authentication(value = false) 在类或者方法上实现。

5、领域在类或者方法上配置了权限拦截注册 @DiworkPermission 的，框架跳过权限拦截，交给权限拦截器来拦截。

bill_command的auth_suffix扩展能力

为了区别相同的请求url在不同的节点下使用不同的authid，框架 bill_command表增加了字段 auth_suffix：权限后缀扩展字段。

该字段存储格式为json格式，key和value均为字符类型。

请求的url中（不支持body传递）需要按照该key和value将参数传递过来，在单据下一个url匹配到多条的情况下，框架会根据这个定位到准确的authId。

几种特殊情况的处理方案

因为目前openAPI网关能力的缺失，鉴权也需要直接到具体业务服务进行，cmdName唯一机制进行调整，按照url加auth_suffix的逻辑来确定唯一性。

领域访问统一服务提供组件或者地址，单据和领域无关，比如领域查看导入日志。
serviceCode为领域当前页面的serviceCode，billNum是导入日志服务的billNum，该情况下需要领域 注册bill_command表信息到导入服务，bill_command表的url和billNum均为导入日志的billNum，领域需要根据需要查看导入日志的当前单据添加合适的auth_suffix，比如：导入服务中登记的url为 bill/querytree, billNum为 导入服务自身的importLog，auth_suffix 为空，authId为导入服务自身定义的动作唯一authId。
领域当前节点的serviceCode： characterList，领域当前的billNum为 characterBill。
最终领域需要注册的url、billNum和导入服务中url、billNum保持一致，auth_suffix需要配置请求中有区别的参数（具体参数需要服务方提供样例），导入日志参数是busiName=领域当前单据编码，所以auth_suffix最终需要配置 {"busiName":"characterBill"}。
如果领域对导入日志查看，不想进行单据单独控权，想要和节点一致， authId为领域的serviceCode： characterList，这样领域节点有权限，该节点导入日志查看就自然有权限。
如果领域对导入日志查看，想进行单据单独控权 authId为领域的自定义的唯一authId，但是就需要单独到权限服务注册。
领域访问公共服务，但是具体和领域当前单据有关，比如领域查看导入模版。

serviceCode为领域当前页面的serviceCode，billNum是领域当前单据的billNum，该情况下需要领域注册bill_command表信息到导入服务，bill_command表的注册约定为：

具体的billNum为领域服务自己的billNum。
比如：导入服务中登记的url为 template/getTplDetail，领域serviceCode为 characterList, 领域单据billNum 为 characterBill。
最终领域需要注册的url和导入服务中url保持一致，billNum为 characterBill，即领域自己单据的billNum。
如果领域对导入模版查看，不想进行单据单独控权 ，想要和节点一致，authId为领域的serviceCode： characterList，这样领域节点有权限，该节点导入模版就自然有权限。
如果领域对导入模版查看，想进行单据单独控权 authId为领域的自定义的唯一authId，但是就需要单独到权限服务注册。
两个节点共用一个单据。

比如，期初采购入库和采购入库的单据查询动作，billNum 都为 storeIn, url都为 bill/query，需要分别注册不同的authId，期初采购入库和采购入库两个节点分开控制单据查询权限。

为了区别相同的url在不同的节点下使用不同的authid，auth_suffix需要配置请求中有区别的参数。

继续上面的举例：期初采购入库url为 bill/query, billNum为storeIn，auth_suffix配置 {"purchaseType":"initial"},authId 为 领域自己定义的唯一authid, 同时节点注册的url上需要有 purchaseType=initial 参数传递。

采购入库url为 bill/query, billNum为storeIn，auth_suffix配置 {"purchaseType":"common"},authId 为 领域自己定义的唯一authid, 同时节点注册的url上需要有 purchaseType=common 参数传递。

4、个别端的老请求兼容。

个别端的请求不使用mdf，当时也需要按照 似于前面1、2、3中情况中使用url和auth_suffix配合来进行使用适配相关场景 。

5、框架公共请求。

框架的公共请求，比如获取模版的meta请求，获取查询方案的getInitFilterInfo请求等，按照安全要求，也需要进行权限控制，具体权限应该同步按照领域的节点权限进行控制，所以也要求领域在bill_command表中进行注册，为了减轻领域注册量，所有公共请求，领域每个单据只需要注册一条公共数据，使用特殊的固定name来区别。

具体注册信息约定如下：

name为CommonCommand，billNum为领域当前单据的billNum，authid为 领域单据节点的serviceCode。
比如：需要注册的领域serviceCode为 characterList, 领域单据billNum 为 characterBill。
最终注册的cmdName 为 CommonCommand, billNum为 characterBill，authId为： characterList。

注：如果公共请求存在单据内重复，需要使用auth_suffix区分的场景，因为公共请求的URL注册没有意义，领域需要自己保证访问的URL上带上auth_suffix相关参数。

参照的权限处理。

因为参照比较多，如果每一个参照都要配置工作量巨大，所以参照最终的越权方案和公共请求类似，参照都是随参照使用方的公共权限配置走，比如特征单据使用了组织参照，特征单据billNum为 characterBill，领域serviceCode为 characterList，就会走特征单据的公共请求权限，也就是必须预置 billNum为 characterBill 的公共请求权限。

最终需要注册的cmdName 为 CommonCommand, billNum为 characterBill，authId为： characterList。

7、参数服务的权限处理。

因为参数服务没有具体的billNum，所以需要做一定的变通处理，目前的方案使用参数定义表(pub_option_meta)中的optionid代替billNum使用，所以领域需要在bill_command中使用自己的optionid做为billNum进行注册，一个optionid注册一条数据，authid为领域参数节点的serviceCode，这样只要参数节点有权限，参数的相关请求就有权限。

比如领域在pub_option_meta表中有10条pub_option_meta数据，optionid均为 business_option，参数节点的serviceCode为 characterList，最终需要注册一条数据，name随意，billNum为 business_option，authId为： characterList。

严控开关的处理逻辑

框架权限拦截提供了严控开关，严控开关默认关闭。

开启前，只要被拦截请求动作的authid不能取到并且serviceCode也为空的情况下，考虑兼容以前请求，直接不控制。

开启后，只要被拦截请求动作的authid不能取到并且serviceCode也不能取到的情况下，会直接抛出 没有相应权限异常。

框架越权扩展插件

为了适配领域的一些特殊需求，框架提供了扩展插件接口，领域有扩展需要的，可以实现该接口进行扩展，实现后正常spring注入就行，接口路径如下：com.yonyou.ucf.mdd.plugins.auth.AuthBillExtendPlugin。

1、接口方法如下：

public interface AuthBillExtendPlugin extends MddPlugin {
/**
* 得到跳过auth验证的billNo集合
* @return
*/
Set<String> getIgnoreAuthBillNoSet();
/**
* 得到领域扩展的公共命令集合
* @return
*/
Set<String> getCommonCommandSet();
/**
* 得到特殊url的authid
*
* @param billNo
* @param url
* @param request
* @return
*/
default String getAuthIdBySpUrl(String billNo, String url, HttpServletRequest request) {
return null;
}
/**
* 根据传入的billNo得到认证需要的billNo
* @param billNo
* @param request
* @return
*/
default String getAuthBillNoByBillNo(String billNo, HttpServletRequest request) {
return null;
}
}


2、框架整体AOP拦截流程图如下：

参考资料

文档编写过程，请注明相关参考资料，主要目的包括：

尊重原始版权，在原始素材下资料扩展；利于使用者更好的使用文档。
资料文件溯源，挖掘深层意义与价值。