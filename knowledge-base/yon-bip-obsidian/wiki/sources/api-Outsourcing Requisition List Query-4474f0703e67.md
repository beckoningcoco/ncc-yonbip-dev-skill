---
title: "委外申请单列表查询"
apiId: "4474f0703e674ba3b3325f7133e4f990"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Requisition"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外申请单列表查询

>  请求方式	POST | Subcontracting Requisition (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/subcontractrequisition/list
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
pageIndex	int	否	是	页号 默认值:1 示例：1 默认值：1
pageSize	int	否	是	每页行数 默认值:10 示例：10 默认值：10
orgId	string	是	否	组织ID 示例：["1866605942198527"]
code	string	否	否	委外申请单号 示例：WWSQ202105010001
vouchdate	string	否	否	单据日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
transTypeId	string	是	否	交易类型ID 示例：["1866605942198526"]
status	short	否	否	申请单状态： 0-开立，1-已审核，2-已关闭，3-审核中。 示例：0
materialId	long	是	否	制造物料ID 示例：[1866605942198785]
productId	long	是	否	物料ID 示例：[1866605942198650]
requisitionDate	string	否	否	需求日期（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
departmentId	string	是	否	需求部门ID 示例：["186660594219847"]
operatorId	string	是	否	需求人ID 示例：["186660594218648"]
simple	object	否	否	扩展参数
open_pubts_begin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，开始时间 示例：2022-01-01 00:00:00
open_pubts_end	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，结束时间 示例：2022-01-01 10:00:00
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)(1.pubts(时间戳)) 2.id(单据ID) 3.sourceType(来源类别 0：手工录入 1：计划订单) 示例：pubts
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or 示例：and
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/subcontractrequisition/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"orgId": [
		"1866605942198527"
	],
	"code": "WWSQ202105010001",
	"vouchdate": "2021-03-02|2021-03-02 23:59:59",
	"transTypeId": [
		"1866605942198526"
	],
	"status": 0,
	"materialId": [
		1866605942198785
	],
	"productId": [
		1866605942198650
	],
	"requisitionDate": "2021-03-02|2021-03-02 23:59:59",
	"departmentId": [
		"186660594219847"
	],
	"operatorId": [
		"186660594218648"
	],
	"simple": {
		"open_pubts_begin": "2022-01-01 00:00:00",
		"open_pubts_end": "2022-01-01 10:00:00"
	},
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": "",
			"logicOp": "and",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
				}
			]
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
code	long	否	返回码，成功时返回200 示例：200
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
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
pageIndex	long	否	当前页 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	记录总数 示例：0
recordList	object	是	返回数据对象
sumRecordList	object	是	合计字段集合
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"id": 2573294878692352,
				"orgId": "2325505713575680",
				"orgName": "资产管理公司",
				"code": "WWSQ202112230004",
				"vouchdate": "2021-12-23 00:00:00",
				"status": 1,
				"transTypeId": "2325273783079171",
				"transTypeName": "标准委外",
				"transTypeExtendAttrsJson": "{\"specialType\":\"none\",\"businessType\":\"wholeOutsourcing\"}",
				"departmentId": "2325510861050112",
				"departmentName": "仓储部",
				"operatorId": "2391833684873472",
				"operatorName": "张三",
				"sourceType": "1",
				"isWfControlled": false,
				"verifystate": 2,
				"pubts": "2021-12-23 20:14:33",
				"subcontractRequisitionProduct": {
					"id": "",
					"materialId": "2325533924905472",
					"productId": "2325533913174272",
					"outsourceOrgId": "2325505713575680",
					"rcvOrgId": "2325505713575680",
					"productCode": "",
					"productName": "P10",
					"demandQuantityDU": 10,
					"demandUnitId": 2325529461018880,
					"demandUnitName": "袋",
					"demandUnitTruncationType": 4,
					"demandUnitPrecision": 1,
					"demandQuantityMU": 10,
					"mainUnitId": 2325529461018880,
					"mainUnitName": "袋",
					"mainUnitTruncationType": 4,
					"mainUnitPrecision": 1,
					"requisitionDate": "2022-01-12 00:00:00",
					"rcvOrgName": "资产管理公司",
					"outsourceOrgName": "资产管理公司"
				}
			}
		],
		"sumRecordList": [
			{
				"subcontractRequisitionProduct": {
					"demandQuantityDU": 5533.5333,
					"demandQuantityMU": "6632.3"
				}
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0
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
999	取决于错误类型，不同错误信息不同	

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

