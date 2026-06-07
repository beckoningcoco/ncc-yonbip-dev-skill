---
title: "批量查询物料"
apiId: "2488221202032623619"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "PLM Material Management"
domain: "PLMPDM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, PLM Material Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量查询物料

>  请求方式	POST | PLM Material Management (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/devpart/v1/list
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
page	object	否	否	page
pageIndex	number
小数位数:0,最大长度:10	否	否	页数 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	单页大小 示例：10 默认值：10
totalCount	number
小数位数:0,最大长度:10	否	否	总数 示例：10 默认值：10
billnum	string	否	否	billnum 默认值：da9f2739-2e9b-40b8-8715-554b7198c54a
condition	object	否	否	condition
commonVOs	object	是	否	commonVOs 最大请求量：20
serviceCode	string	否	否	serviceCode 示例：plm_psdm_dpmgt 默认值：plm_psdm_dpmgt
ownDomain	string	否	否	ownDomain 示例：IMP-PLM-PSDM 默认值：IMP-PLM-PSDM
bEmptyWithoutFilterTree	boolean	否	否	bEmptyWithoutFilterTree 示例：false 默认值：false
tplid	string	否	否	tplid
queryId	number
小数位数:0,最大长度:10	否	否	queryId

## 3. 请求示例

Url: /yonbip/RDC/openapi/devpart/v1/list?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 10,
		"totalCount": 10
	},
	"billnum": "",
	"condition": {
		"commonVOs": [
			{
				"itemName": "",
				"value1": ""
			}
		]
	},
	"serviceCode": "plm_psdm_dpmgt",
	"ownDomain": "IMP-PLM-PSDM",
	"bEmptyWithoutFilterTree": false,
	"tplid": "",
	"queryId": 0
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
code	string	否	返回码，调用成功时返回200 示例：200
success	boolean	否	success
message	string	否	接口返回信息 示例：操作成功
data	object	否	业务数据对象
pageIndex	number
小数位数:0,最大长度:2	否	当前页码 示例：1
pageSize	number
小数位数:0,最大长度:2	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:4	否	总记录数 示例：1
pageCount	number
小数位数:0,最大长度:4	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:4	否	起始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:4	否	结束页码 示例：1
recordList	object	是	记录列表

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"EncryptAttrGrant": true,
				"ownedorg": "1980670408412626952",
				"partclassid": "1981161452045074437",
				"devpartDefineCharacter": {
					"ytenant": "bzot2m5x",
					"id": "2454066951923695627",
					"pubts": "2026-01-20T14:38:53.000+08:00",
					"dr": 0
				},
				"stateid": "1980667032588779557",
				"lifecyclestate_name": "编制中",
				"newest_flag": true,
				"devpartDefineCharacter__id": "2454066951923695627",
				"revisionid": "1981145749643591687",
				"path": "1981161452045074437",
				"ecoState": "0",
				"Reusable": true,
				"canDelete": true,
				"id": "2454066951923695625",
				"canJumpToPartApply": false,
				"ownedorg_name": "test001",
				"ownedby": "1980670880874233864",
				"tenant": "bzot2m5x",
				"canUnLock": false,
				"createdorg_name": "test001",
				"lifecycletempid": "1980667075538452566",
				"CatalogueEditable": true,
				"owneddept": "1980670605981122561",
				"isWfControlled": 0,
				"secretLimit_name": "****",
				"weight": 0,
				"secretLevel": "2303450034061967361",
				"revision": "****",
				"unit_name": "kg",
				"unit": "1981178314063085575",
				"originalCanEdit": true,
				"name": "xjx中试配方3",
				"Viewable": true,
				"Deletable": true,
				"creationtime": "2026-01-20T14:36:34.000+08:00",
				"Syncable": false,
				"owneddept_name": "测试部门",
				"revisionorder": 1,
				"canGive": true,
				"verifystate": 0,
				"code": "ycc2026012000003",
				"sch_id": "1981159218661031938",
				"canDetail": true,
				"canEdit": true,
				"edition": 1,
				"ownedby_name": "ycc",
				"lifecyclestate": "1980667075538452537",
				"canChange": true,
				"partclassid_name": "yc物料类型-001",
				"Revisable": true,
				"canPublish": true,
				"Editable": true,
				"canLock": true,
				"isDevPartDup": true,
				"pubts": "2026-01-20T14:36:34.000+08:00",
				"canReUse": true,
				"editingstate": 0,
				"canJump": true,
				"createdorg": "1980670408412626952",
				"secretLevel_secretCode": "****",
				"creator": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
				"secretLevel.secretName": "****",
				"Authorized": true,
				"apply_status": "4",
				"canEditLib": true,
				"selfmade_name": "自制",
				"Transition": true,
				"selfmade": "1980667032589828471",
				"Published": true,
				"creator_name": "ycc",
				"lifecycletempid_name": "研发物料-默认模板使用"
			}
		]
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

