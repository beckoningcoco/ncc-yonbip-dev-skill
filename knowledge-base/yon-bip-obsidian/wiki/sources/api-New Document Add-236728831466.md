---
title: "新增文档"
apiId: "2367288314665893892"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Document Service"
domain: "PLMPDM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Document Service]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增文档

>  请求方式	POST | General Document Service (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/doc/v1/save
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
code	string	否	是	编码
name	string	否	是	名称
ownOrgBy	string	否	是	所属组织
ownOrgByCode	string	否	否	所属组织编码
createdOrg	string	否	是	创建组织id
createdOrgCode	string	否	否	创建组织编码
deptId	string	否	是	部门id
ownBy	string	否	是	所属人id
description	string	否	否	描述
validTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	生效日期
docClassfiyId	string	否	是	文档类型id
projectCode	string	否	否	项目编码
docFileList	object	是	否	文档附件列表
name	string	否	否	名称
url	string	否	否	路径
size	string	否	否	大小
format	string	否	否	后缀
id	string	否	否	id
linkLibList	object	是	否	所属库
libId	string	否	是	库id
ownedOrg	string	否	否	所属组织
depotType	string	否	是	类型
libCatalogId	string	否	是	库目录id
id	string	否	否	id
code9List	object	是	否	关联项目列表
projectCode	string	否	否	项目编码
projectId	string	否	否	项目id
ownedOrg	string	否	否	所属组织
id	string	否	否	id
whereUseList	object	是	否	何处使用列表
id	string	否	否	id
mid	string	否	否	使用处id

## 3. 请求示例

Url: /yonbip/RDC/openapi/doc/v1/save?access_token=访问令牌
Body: {
	"code": "",
	"name": "",
	"ownOrgBy": "",
	"ownOrgByCode": "",
	"createdOrg": "",
	"createdOrgCode": "",
	"deptId": "",
	"ownBy": "",
	"description": "",
	"validTime": "2026-06-07 13:27:47",
	"docClassfiyId": "",
	"projectCode": "",
	"docFileList": [
		{
			"name": "",
			"url": "",
			"size": "",
			"format": "",
			"id": ""
		}
	],
	"linkLibList": [
		{
			"libId": "",
			"ownedOrg": "",
			"depotType": "",
			"libCatalogId": "",
			"id": ""
		}
	],
	"code9List": [
		{
			"projectCode": "",
			"projectId": "",
			"ownedOrg": "",
			"id": ""
		}
	],
	"whereUseList": [
		{
			"id": "",
			"mid": ""
		}
	]
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
success	boolean	否	success 示例：true
code	number
小数位数:0,最大长度:10	否	code 示例：200
errorCode	string	否	errorCode
data	object	否	data
_entityName	string	否	_entityName
_keyName	string	否	_keyName
code	string	否	code 示例：20250929001
revision_version_show	string	否	revision_version_show 示例：A0
masterOrgKeyField	string	否	masterOrgKeyField 示例：own_org_by
cOwnOrg_name	string	否	cOwnOrg_name 示例：test001
created_org_name	string	否	created_org_name 示例：test001
LinkLibList	object	是	LinkLibList
own_org_by	string	否	own_org_by 示例：1980670408412626952
docFromType	string	否	docFromType 示例：plm
edit_state	number
小数位数:0,最大长度:10	否	edit_state 示例：1
cOwnOrg	string	否	cOwnOrg 示例：1980670408412626952
own_by	string	否	own_by 示例：1981140234900340744
versionRuleUseId	string	否	versionRuleUseId 示例：2004948277980037124
lock_by	string	否	lock_by
attachmentId	string	否	attachmentId 示例：2370245520072900612
created_org	string	否	created_org 示例：1980670408412626952
lctemplate_id	number
小数位数:0,最大长度:19	否	lctemplate_id 示例：1980667032588779610
tenant	string	否	tenant 示例：bzot2m5x
revision_num	number
小数位数:0,最大长度:10	否	revision_num 示例：1
doc_classfiy_id	string	否	doc_classfiy_id 示例：1992492288737017862
nonEndTypeAddDoc	boolean	否	nonEndTypeAddDoc 示例：true
createOrg	string	否	createOrg 示例：1980670408412626952
lctemplate_attribute_id	number
小数位数:0,最大长度:19	否	lctemplate_attribute_id 示例：1980667032588779571
creator	string	否	creator 示例：bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2
revision_version_id	string	否	revision_version_id 示例：2004947427576512517
dept_id_name	string	否	dept_id_name 示例：测试部门
lock_by_name	string	否	lock_by_name
deptId	string	否	deptId 示例：1980670605981122561
own_org_by_name	string	否	own_org_by_name 示例：test001
_status	string	否	_status
transTypeKeyField	string	否	transTypeKeyField 示例：bustype
uiAssignKeyFields	string	是	uiAssignKeyFields
version	string	否	version 示例：1
secretLevel	string	否	secretLevel 示例：2303450034061967361
revision	string	否	revision 示例：A0
lock_time	string	否	lock_time
own_by_dept_id_name	string	否	own_by_dept_id_name 示例：测试部门
isAuthorizefromPjGroup	number
小数位数:0,最大长度:10	否	isAuthorizefromPjGroup 示例：1
createOrg_name	string	否	createOrg_name 示例：test001
own_by_name	string	否	own_by_name 示例：黎一
name	string	否	name 示例：1212
dept_id	string	否	dept_id 示例：1980670605981122561
lcStateId	string	否	lcStateId 示例：1980667032588779546
_fromAdd	string	否	_fromAdd
lifeStateFlag	number
小数位数:0,最大长度:10	否	lifeStateFlag 示例：0
_id	string	否	_id
newest_flag	boolean	否	newest_flag 示例：true
wfstate	number
小数位数:0,最大长度:10	否	wfstate 示例：0
createTime	string	否	createTime 示例：2025-09-29 16:01:37
creationtime	string	否	creationtime 示例：2025-09-29 16:01:37
creator_name	string	否	creator_name 示例：黎一
id	number
小数位数:0,最大长度:19	否	id 示例：2370245537252769793
isWfControlled	boolean	否	isWfControlled 示例：false
pubts	string	否	pubts 示例：2025-09-29 15:56:06
ytenant	string	否	ytenant 示例：bzot2m5x
docFileList	object	是	docFileList
AttachmentList	object	是	AttachmentList
shadow	object	是	shadow
linkDocList	object	是	linkDocList
message	string	否	message 示例：操作成功！

## 5. 正确返回示例

{
	"success": true,
	"code": 200,
	"errorCode": "",
	"data": {
		"_entityName": "",
		"_keyName": "",
		"code": "20250929001",
		"revision_version_show": "A0",
		"masterOrgKeyField": "own_org_by",
		"cOwnOrg_name": "test001",
		"created_org_name": "test001",
		"LinkLibList": [
			{
				"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
				"libId": 2154157065356967941,
				"code": "depot-000275",
				"docId": 2370245537252769793,
				"libCatalogCode": "catalogue-000991",
				"depotType": "1980667032588779616",
				"libCatalogPath": "1/1.1",
				"name": "00000112[项目T20241212-01]",
				"libCatalogId": "2154157073946902535",
				"creator_name": "黎一",
				"__isFillPathName": true,
				"creationtime": "2025-09-29 16:01:37",
				"id": 2370245537252769794,
				"depotType_name": "项目库"
			}
		],
		"own_org_by": "1980670408412626952",
		"docFromType": "plm",
		"edit_state": 1,
		"cOwnOrg": "1980670408412626952",
		"own_by": "1981140234900340744",
		"versionRuleUseId": "2004948277980037124",
		"lock_by": "",
		"attachmentId": "2370245520072900612",
		"created_org": "1980670408412626952",
		"lctemplate_id": 1980667032588779610,
		"tenant": "bzot2m5x",
		"revision_num": 1,
		"doc_classfiy_id": "1992492288737017862",
		"nonEndTypeAddDoc": true,
		"createOrg": "1980670408412626952",
		"lctemplate_attribute_id": 1980667032588779571,
		"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
		"revision_version_id": "2004947427576512517",
		"dept_id_name": "测试部门",
		"lock_by_name": "",
		"deptId": "1980670605981122561",
		"own_org_by_name": "test001",
		"_status": "",
		"transTypeKeyField": "bustype",
		"uiAssignKeyFields": [
			""
		],
		"version": "1",
		"secretLevel": "2303450034061967361",
		"revision": "A0",
		"lock_time": "",
		"own_by_dept_id_name": "测试部门",
		"isAuthorizefromPjGroup": 1,
		"createOrg_name": "test001",
		"own_by_name": "黎一",
		"name": "1212",
		"dept_id": "1980670605981122561",
		"lcStateId": "1980667032588779546",
		"_fromAdd": "",
		"lifeStateFlag": 0,
		"_id": "",
		"newest_flag": true,
		"wfstate": 0,
		"createTime": "2025-09-29 16:01:37",
		"creationtime": "2025-09-29 16:01:37",
		"creator_name": "黎一",
		"id": 2370245537252769793,
		"isWfControlled": false,
		"pubts": "2025-09-29 15:56:06",
		"ytenant": "bzot2m5x",
		"docFileList": [
			{}
		],
		"AttachmentList": [
			{}
		],
		"shadow": [
			{}
		],
		"linkDocList": [
			{}
		]
	},
	"message": "操作成功！"
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

