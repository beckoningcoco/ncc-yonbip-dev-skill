---
title: "委外核销取未核销的委外入库单"
apiId: "69ee9ab6418543feac372ee91fe2cbcd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Settlement"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外核销取未核销的委外入库单

>  请求方式	POST | Subcontracting Settlement (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/verification/receipt/list
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
pageIndex	int	否	是	页号 默认值：1
pageSize	int	否	是	每页行数 默认值：10
osmOrg	string	是	否	委外组织id
vendor	long	是	否	委外商id
osmId	long	是	否	委外订单id
osmVouchdate	string	否	否	单据日期（区间，格式 2021-03-02|2021-03-02 23:59:59）
osmType	string	是	否	委外订单类型（“0”：标准订单，“1”：返工订单）
osmLineClose	string	否	否	行关闭（“true” ：行关闭的委外订单，“false”：行未关闭的委外订单）
osmdeliveryDate	string	否	否	交货日期（区间，格式 2021-03-02|2021-03-02 23:59:59）
department	string	是	否	委外部门id
operator	string	是	否	业务员id
product	long	是	否	物料id
org	string	是	否	入库组织id
vouchdate	string	否	否	入库日期（区间，格式 2021-03-02|2021-03-02 23:59:59）)
code	string	否	否	入库单号
warehouse	long	是	否	入库仓库
type	string	是	否	入库单类型（“0”：入库，“1”：退库）
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名（委外入库单字段，如：pubts（表头时间戳）、id（表头id）、auditDate（审核日期）等。若是子表字段，则使用 osmInRecords.xxx）
op	string	否	否	比较符（eq：相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空）
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2

## 3. 请求示例

Url: /yonbip/mfg/verification/receipt/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"osmOrg": [
		""
	],
	"vendor": [
		0
	],
	"osmId": [
		0
	],
	"osmVouchdate": "",
	"osmType": [
		""
	],
	"osmLineClose": "",
	"osmdeliveryDate": "",
	"department": [
		""
	],
	"operator": [
		""
	],
	"product": [
		0
	],
	"org": [
		""
	],
	"vouchdate": "",
	"code": "",
	"warehouse": [
		0
	],
	"type": [
		""
	],
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
code	long	否	接口返回码，调用成功时返回200 示例：200
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
data	object	否	接口调用成功时的返回数据
pageIndex	long	否	当前页 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	总记录数 示例：1
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1
recordList	object	是	返回数据集合

## 5. 正确返回示例

{
	"code": 200,
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
				"osmOrg": "2325505713575680",
				"osmOrgName": "资产管理公司",
				"osmVendor": 2325541812343040,
				"osmVendorName": "WWS1",
				"osmCode": "WWDD20210827000003",
				"osmDetailId": 2405908887966209,
				"deliveryDate": "2021-09-16 00:00:00",
				"osmType": 0,
				"id": 2571646121792256,
				"pubts": "2021-12-22 16:31:28",
				"code": "OSMI20211222000001",
				"vouchdate": "2021-12-22 00:00:00",
				"org": "2325505713575680",
				"orgName": "资产管理公司",
				"warehouse": 2325544527892736,
				"warehouseName": "WWS1委外仓",
				"isUpdateCost": true,
				"detailId": 2571646121792257,
				"purinType": 0,
				"materialId": 2325533924905472,
				"productId": 2325533913174272,
				"prodcutName": "P10",
				"productCode": "000001",
				"skuId": 2325533922283776,
				"skuName": "P10",
				"skuCode": "000001",
				"qty": 10,
				"subQty": 10,
				"mainUnitID": 2325529461018880,
				"mainUnitName": "袋",
				"stockUnitId": 2325529461018880,
				"stockUnitName": "袋",
				"omsUnit": "袋",
				"omsQty": 10,
				"omsSubQty": 10,
				"isScrap": false
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
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
请求参数 (6)
更新
返回参数 (46)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

