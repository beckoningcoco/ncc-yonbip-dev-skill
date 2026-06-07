---
title: "ebom 列表查询（list）"
apiId: "2536498154839212034"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Structure Management"
domain: "PLMPDM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Structure Management]
platform_version: "BIP"
source_type: community-api-docs
---

# ebom 列表查询（list）

>  请求方式	POST | Product Structure Management (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/current_yonbip_default_sys/RDC/openapi/ebom/v1/list
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
billnum	string	否	否	billnum
condition	object	否	否	condition
serviceCode	string	否	否	serviceCode
ownDomain	string	否	否	ownDomain
bEmptyWithoutFilterTree	boolean	否	否	bEmptyWithoutFilterTree
tplid	string	否	否	tplid
queryId	number
小数位数:0,最大长度:10	否	否	queryId

## 3. 请求示例

Url: /current_yonbip_default_sys/RDC/openapi/ebom/v1/list?access_token=访问令牌
Body: {
	"page": {},
	"billnum": "",
	"condition": {},
	"serviceCode": "",
	"ownDomain": "",
	"bEmptyWithoutFilterTree": true,
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
code	number
小数位数:0,最大长度:3	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
		否	
		否	
pageIndex	number
小数位数:0,最大长度:2	否	当前页码 示例：1
pageSize	number
小数位数:0,最大长度:2	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:2	否	总记录数 示例：1
recordList	object	是	记录列表
pageCount	number
小数位数:0,最大长度:1	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:1	否	起始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:1	否	结束页码 示例：1
traceId	string	否	追踪ID 示例：2883ddf2c4675991
uploadable	string	否	是否可上传 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"partId_remark": "0423test",
				"ownedorg": "1980670408412626952",
				"modifier": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
				"creator_userName": "ycc",
				"partRevision": "A",
				"partId_model": "0423test",
				"Reusable": true,
				"partId_keypart": 0,
				"id": "2379171063414652933",
				"ownedorg_name": "test001",
				"ownedby": "1980670880874233864",
				"tenant": "bzot2m5x",
				"modifier_userName": "ycc",
				"lifecycleState": "1980667075538452540",
				"createdorg_name": "test001",
				"partId_specification": "0423test",
				"secretLimit_name": "1年",
				"partId_material": "0423test",
				"batchApprovalType": 0,
				"secretLevel": "2303450034061967361",
				"bomType": "1980667032589828457",
				"revision": "A",
				"userDefineChrstc__id": "2379171063414652933",
				"lockedby": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
				"lifecycleState_name": "编辑中",
				"lifecycleState_state_id_name": "编辑中",
				"partId_partclassid_name": "yc物料类型-001",
				"name": "G20251011A",
				"editingState": "1",
				"Viewable": true,
				"secretLevel_secretName": "公开",
				"Deletable": true,
				"creationtime": "2025-10-11 16:39:24",
				"lifecycleTemplateId": "1980667075538452567",
				"supportConfigBom": 0,
				"code": "ycc2025101100001",
				"bomType_name": "EBOM",
				"partId": "2379170350450081797",
				"ownedby_name": "ycc",
				"partCode": "ycc2025101100001",
				"modifiedtime": "2026-01-08 13:40:16",
				"fromType": 0,
				"Editable": true,
				"partId_selfmade_name": "自制",
				"pubts": "2026-01-08 13:42:23",
				"lifecycleState_state_id": "1980667032588779546",
				"isConfigBom": 0,
				"createdorg": "1980670408412626952",
				"secretLevel_secretCode": "GK",
				"creator": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
				"Authorized": true,
				"bomIsChanging": 0,
				"secretLimit": "2303451124983660546",
				"userDefineChrstc": {
					"ytenant": "bzot2m5x",
					"id": "2379171063414652933",
					"pubts": "2025-12-15 11:35:27",
					"dr": 0
				},
				"Transition": true,
				"batchFlowType": 0
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "2883ddf2c4675991",
	"uploadable": "0"
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

