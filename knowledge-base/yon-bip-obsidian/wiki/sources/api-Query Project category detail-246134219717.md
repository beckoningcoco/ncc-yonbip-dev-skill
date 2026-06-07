---
title: "ownedorg_name	string	否	所属组织 示例：智石开"
apiId: "2461342197175287815"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "PLM Project Management"
domain: "PLMPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, PLM Project Management]
platform_version: "BIP"
source_type: community-api-docs
---

# ownedorg_name	string	否	所属组织 示例：智石开

>  请求方式	POST | PLM Project Management (PLMPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/prjTask/v1/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	是	ID 示例：2226817689824264194

## 3. 请求示例

Url: /yonbip/RDC/openapi/prjTask/v1/detail?access_token=访问令牌
Body: {
	"id": "2226817689824264194"
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	接口返回状态 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
		否	
		否	
parent	string	否	父任务ID 示例：2459282390857547796
projectId_lifecycleAttrpoolId_code	string	否	项目生命周期编码 示例：Executing
ownedorg	string	否	所属组织ID 示例：1980670408412626952
submitPerson	string	否	提交人ID 示例：1981140234900340744
SuperMgtAuth	boolean	否	超级管理员权限 示例：false
path	string	否	路径 示例：2459282390857547796|707956777885|
userDefine	object	否	特征组
CombineEdit	boolean	否	协同编制权限 示例：true
planStarttime	string	否	计划开始时间 示例：2026-01-28
id	number
小数位数:0,最大长度:12	否	ID 示例：707956777885
publishTime	string	否	发布时间 示例：2026-03-23 14:33:41
specialTask	string	否	特殊任务 示例：false
inputMaterialExpRecipeList	object	是	实验配方输入物
publishDept_name	string	否	发布部门 示例：测试部门
typeId_code	string	否	任务类别编码 示例：1001
principalDept_name	string	否	责任人部门 示例：测试部门
lifecycleAttrpoolId_code	string	否	生命周期状态池编码 示例：Executing
secretLevel	string	否	密级ID 示例：2303450034061967361
classifyId_name	string	否	任务状态 示例：执行中
childAllFinish	string	否	子任务是否全部完成 示例：none
principalRole	string	否	责任人角色 示例：1992435990284730377
rootTaskName	string	否	根任务 示例：gggggggggg
typeId	string	否	任务类别ID 示例：1980667178594598921
lifecycleUseId	string	否	生命周期应用模板ID 示例：1980667178617667749
Deletable	boolean	否	删除权限 示例：true
rootTaskId	string	否	根任务ID 示例：2459282390857547796
lifecycleAttrId	string	否	生命周期模板ID 示例：1980667178617667703
RollOut	boolean	否	转出权限 示例：true
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：2
lifecycleAttrpoolId_name	string	否	生命周期状态池 示例：执行中
projectId_ownedorg	string	否	项目所属组织ID 示例：1980670408412626952
typeId_name	string	否	任务类别 示例：通用类型(内置)
classifyId_code	string	否	任务状态编码 示例：PROGRESS
submitPerson_name	string	否	提交人 示例：黎一
planDuration	number
小数位数:0,最大长度:10	否	计划工期 示例：10
lifecycleId_name	string	否	生命周期模板 示例：项目任务-默认模板
projectId_ownedorg_code	string	否	项目所属组织编码 示例：zsk
hasOutputPackage	string	否	是否有输出包 示例：Y
secretLevel_secretCode	string	否	密级编码 示例：GK
planType	string	否	计划类型ID 示例：2459282390857547792
planType_planTypeCode	string	否	计划类型编码 示例：PT-00000001
publisher_name	string	否	发布人 示例：黎一
rootTaskCode	string	否	根任务编码 示例：task98150867
grpMember	string	否	项目组成员ID 示例：2482107144133410824
prjTaskFormList	object	是	流程单据
principalYht	string	否	任务负责人友互通 示例：bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2
hasChild	boolean	否	是否有子任务 示例：false
principalDept	string	否	责任人部门ID 示例：1980670605981122561
wfId	string	否	审批流水 示例：1980667178617667728
projectId_code	string	否	项目编码 示例：20260127000001
createorg_name	string	否	创建组织 示例：智石开
WBSEdit	boolean	否	WBS编辑权限 示例：true
classifyId	string	否	任务状态ID 示例：1980667178594598916
planEndtime	string	否	计划结束时间 示例：2026-02-10
Terminate	boolean	否	终止权限 示例：true
lifecycleAttrpoolId	string	否	生命周期状态池ID 示例：1980667178617667683
realStarttime	string	否	实际开始时间 示例：2026-03-23
projectId_name	string	否	项目名称 示例：gggggggggg
lifecycleUseId_name	string	否	生命周期应用模板 示例：项目任务-默认模板使用
bpmAsyncAuditStatus	number
小数位数:0,最大长度:10	否	异步审批状态 示例：2
typeId_type	string	否	任务类别 示例：1001
manualSchedule	string	否	手工排程 示例：1
publishDept	string	否	发布部门ID 示例：1980670605981122561
owner_name	string	否	所有者 示例：黎二
projectId_lifecycleAttrpoolId_name	string	否	项目生命周期状态 示例：执行中
planType_planType	string	否	计划类型ID 示例：1981150929351081993
parent_id	string	否	父任务ID 示例：2459282390857547796
name	string	否	名称 示例：DDD
Viewable	boolean	否	查看权限 示例：true
publisher	string	否	发布人ID 示例：1981140234900340744
secretLevel_secretName	string	否	密级 示例：公开
projectId_lifecycleAttrpoolId	string	否	项目生命周期状态ID 示例：1980667178617667683
creationtime	string	否	创建时间 示例：2026-01-27 15:56:36
wfstate	number
小数位数:0,最大长度:10	否	流程标志 示例：0
projectId	string	否	项目ID 示例：2459282390857547785
projectId_planEndtime	string	否	项目计划结束时间 示例：2026-08-27
createorg	string	否	创建组织ID 示例：1980670408412626952
code	string	否	编码 示例：task56655889
Execute	boolean	否	执行权限 示例：true
projectId_classifyId	string	否	项目类型ID 示例：1992351860465336328
Suspend	boolean	否	暂停权限 示例：true
principalRole_name	string	否	责任人角色 示例：导入9
principal	string	否	责任人ID 示例：1981140234900340744
taskType	string	否	任务类型信息 示例：TASK
lifecycleAttrId_name	string	否	生命周期状态 示例：执行中
projectId_classifyId_pubSeparate	string	否	项目与计划发布分离 示例：no
grpMember_name	string	否	项目组成员 示例：黎一
prjTaskDesignDocLinkList	object	是	设计规范
Editable	boolean	否	编辑权限 示例：true
startState	number
小数位数:0,最大长度:10	否	启动状态 示例：1
Finish	boolean	否	完成权限 示例：true
planType_planTypeName	string	否	计划类型 示例：项目计划
Publish	boolean	否	发布权限 示例：true
classifyId_collectMember	string	否	汇总团队成员 示例：true
owner	string	否	所有者ID 示例：1985904049416306698
severity	string	否	严重程度 示例：GENERAL_TASK
projectId_wfstate	number
小数位数:0,最大长度:10	否	项目流程状态 示例：0
collabPrepareState	number
小数位数:0,最大长度:10	否	协同编制状态 示例：2
deliverables_status	string	否	交付物状态 示例：10
projectId_classifyId_name	string	否	项目类型 示例：车型项目T
lifecycleId	string	否	生命周期模板ID 示例：1980667178617667691
projectDetail	object	否	项目详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"parent": "2459282390857547796",
		"projectId_lifecycleAttrpoolId_code": "Executing",
		"ownedorg": "1980670408412626952",
		"submitPerson": "1981140234900340744",
		"SuperMgtAuth": false,
		"path": "2459282390857547796|707956777885|",
		"userDefine": {
			"id": ""
		},
		"CombineEdit": true,
		"planStarttime": "2026-01-28",
		"id": 707956777885,
		"ownedorg_name": "智石开",
		"publishTime": "2026-03-23 14:33:41",
		"specialTask": "false",
		"inputMaterialExpRecipeList": [
			{
				"expRecipe_lcTemplateUseId_name": "实验配方-默认模板使用-ycc",
				"expRecipe_modifier_userName": "ycc",
				"expRecipe_owner": "1980670880874233864",
				"expRecipe_createOrg": "1980670408412626952",
				"expRecipe_createOrg_name": "智石开",
				"expRecipe_experimentRecipeType": "2157049236217659399",
				"expRecipe_owner_name": "ycc",
				"expRecipe_modifier": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
				"source": "1",
				"expRecipe_code": "202412160003",
				"expRecipe_name": "yc实验配方001",
				"expRecipe_lifecyclestate_name": "已发布",
				"expRecipe_experimentRecipeType_name": "yc实验配方类型001",
				"expRecipe_groupBy": "1",
				"expRecipe_lifecyclestate_code": "Published",
				"expRecipe_orgId": "1980670408412626952",
				"expRecipe_modifyTime": 1734504555000,
				"id": "2500079692488900613",
				"expRecipe_creator_userName": "ycc",
				"expRecipe_orgId_name": "智石开",
				"expRecipe_creator": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
				"expRecipe_verifyState": 1,
				"expRecipe_createTime": 1734317643000,
				"expRecipe_desc": "yc实验配方001",
				"expRecipe_ifOptRecipe": "2",
				"task": 707956777885,
				"expRecipe_lcTemplateUseId": "2157048016433840135",
				"expRecipe": "2157087787816321031",
				"expRecipe_ownedDept": "1980670605981122561",
				"expRecipe_revision": "A0",
				"expRecipe_lifecyclestate": "2122414216208449543",
				"expRecipe_ownedDept_name": "测试部门"
			}
		],
		"publishDept_name": "测试部门",
		"typeId_code": "1001",
		"principalDept_name": "测试部门",
		"lifecycleAttrpoolId_code": "Executing",
		"secretLevel": "2303450034061967361",
		"classifyId_name": "执行中",
		"childAllFinish": "none",
		"principalRole": "1992435990284730377",
		"rootTaskName": "gggggggggg",
		"typeId": "1980667178594598921",
		"lifecycleUseId": "1980667178617667749",
		"Deletable": true,
		"rootTaskId": "2459282390857547796",
		"lifecycleAttrId": "1980667178617667703",
		"RollOut": true,
		"verifystate": 2,
		"lifecycleAttrpoolId_name": "执行中",
		"projectId_ownedorg": "1980670408412626952",
		"typeId_name": "通用类型(内置)",
		"classifyId_code": "PROGRESS",
		"submitPerson_name": "黎一",
		"planDuration": 10,
		"lifecycleId_name": "项目任务-默认模板",
		"projectId_ownedorg_code": "zsk",
		"hasOutputPackage": "Y",
		"secretLevel_secretCode": "GK",
		"planType": "2459282390857547792",
		"planType_planTypeCode": "PT-00000001",
		"publisher_name": "黎一",
		"rootTaskCode": "task98150867",
		"grpMember": "2482107144133410824",
		"prjTaskFormList": [
			{
				"taskId_name": "DDD",
				"delType_cardKey": "Process",
				"code": "ycc22025091200002",
				"appDept": "",
				"ownedorg": "智石开",
				"delType_deliverablePubRef": "zskpd.RefTable_3180091130",
				"delType": "2435334787087990786",
				"billState": "0",
				"billDate": "2025-09-12 16:10:00",
				"billNum": "Process",
				"delType_serviceCode": "plm_pbm_tech_pss",
				"applicant": "ycc",
				"delType_fullname": "ZSKPD.ZSKPD.Process",
				"delType_systemType": "external",
				"delType_serviceDomain": "zskpd",
				"name": "行行行",
				"delType_name": "工艺路线",
				"formDataId": "2357632962080014344",
				"id": "2500079692488900615",
				"taskId": 707956777885
			}
		],
		"principalYht": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
		"hasChild": false,
		"principalDept": "1980670605981122561",
		"wfId": "1980667178617667728",
		"projectId_code": "20260127000001",
		"createorg_name": "智石开",
		"WBSEdit": true,
		"classifyId": "1980667178594598916",
		"planEndtime": "2026-02-10",
		"Terminate": true,
		"lifecycleAttrpoolId": "1980667178617667683",
		"realStarttime": "2026-03-23",
		"projectId_name": "gggggggggg",
		"lifecycleUseId_name": "项目任务-默认模板使用",
		"bpmAsyncAuditStatus": 2,
		"typeId_type": "1001",
		"manualSchedule": "1",
		"publishDept": "1980670605981122561",
		"owner_name": "黎二",
		"projectId_lifecycleAttrpoolId_name": "执行中",
		"planType_planType": "1981150929351081993",
		"parent_id": "2459282390857547796",
		"name": "DDD",
		"Viewable": true,
		"publisher": "1981140234900340744",
		"secretLevel_secretName": "公开",
		"projectId_lifecycleAttrpoolId": "1980667178617667683",
		"creationtime": "2026-01-27 15:56:36",
		"wfstate": 0,
		"projectId": "2459282390857547785",
		"projectId_planEndtime": "2026-08-27",
		"createorg": "1980670408412626952",
		"code": "task56655889",
		"Execute": true,
		"projectId_classifyId": "1992351860465336328",
		"Suspend": true,
		"principalRole_name": "导入9",
		"principal": "1981140234900340744",
		"taskType": "TASK",
		"lifecycleAttrId_name": "执行中",
		"projectId_classifyId_pubSeparate": "no",
		"grpMember_name": "黎一",
		"prjTaskDesignDocLinkList": [
			{
				"taskId_name": "DDD",
				"docRevision": "A/1",
				"docId": "2344197668705140738",
				"docCode": "0013",
				"projectId_name": "gggggggggg",
				"id": "2500079692488900614",
				"docId_secretLevel_secretName": "公开",
				"projectId": "2459282390857547785",
				"docId_name": "afterSaveTest",
				"docId_secretLevel": "2303450034061967361",
				"taskId": 707956777885,
				"docVersion": "1"
			}
		],
		"Editable": true,
		"startState": 1,
		"Finish": true,
		"planType_planTypeName": "项目计划",
		"Publish": true,
		"classifyId_collectMember": "true",
		"owner": "1985904049416306698",
		"severity": "GENERAL_TASK",
		"projectId_wfstate": 0,
		"collabPrepareState": 2,
		"deliverables_status": "10",
		"projectId_classifyId_name": "车型项目T",
		"lifecycleId": "1980667178617667691",
		"projectDetail": {
			"id": "2459282390857547785",
			"planTypeAuth": {}
		}
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

