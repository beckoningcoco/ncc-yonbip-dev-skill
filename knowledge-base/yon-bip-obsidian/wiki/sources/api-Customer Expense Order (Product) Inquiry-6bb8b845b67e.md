---
title: "客户费用单(商品)查询"
apiId: "6bb8b845b67e4c6882c2d85a4865f72e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Expense Document - Product"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Expense Document - Product]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户费用单(商品)查询

>  请求方式	POST | Customer Expense Document - Product (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/rebate/product/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	否	当前页数 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	分页条数 默认值：12
valid	string	否	否	是否有效, 无默认值, （字符串）true有效|（字符串）false无效 示例：true
code	string	否	否	返利单号 示例：UO-9392202102230001
orderNos	string	否	否	订单号 示例：UO-9392202102230001
agentId_code	string	否	否	客户编码 示例：客户A
open_createDate_begin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建日期开始日期 示例：2021-03-03 00:00:00
open_createDate_end	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建日期结束日期 示例：2021-03-04 00:00:00
simpleVOs	object	是	否	查询条件
op	string	否	否	条件比较符(eq,neq,lt,gt,elt,egt,between,in,nin,like,leftlike,rightlike,is_null,is_not_null,and,or)
field	string	否	否	查询条件字段名(如果为自由自定义项，传参类似headItem.define2)
value1	string	否	否	查询条件值1
value2	string	否	否	查询条件值2
logicOp	string	否	否	分级逻辑符(and,or)
salesOrgId	number
小数位数:0,最大长度:30	否	否	销售组织id 示例：1686482740771291145
status	number
小数位数:0,最大长度:1	否	否	审核状态 示例：开立:0,已审核:1,已关闭:2,审核中:3

## 3. 请求示例

Url: /yonbip/sd/rebate/product/query?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"valid": "true",
	"code": "UO-9392202102230001",
	"orderNos": "UO-9392202102230001",
	"agentId_code": "客户A",
	"open_createDate_begin": "2021-03-03 00:00:00",
	"open_createDate_end": "2021-03-04 00:00:00",
	"simpleVOs": [
		{
			"op": "",
			"field": "",
			"value1": "",
			"value2": "",
			"logicOp": ""
		}
	],
	"salesOrgId": 1686482740771291145,
	"status": NaN
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
code	string	否	单据编号
pageIndex	number
小数位数:0,最大长度:10	否	当前页
pageSize	number
小数位数:0,最大长度:10	否	每页数量
pageCount	number
小数位数:0,最大长度:10	否	总页数
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页下标
endPageIndex	number
小数位数:0,最大长度:10	否	结束页下标
pubts	string	否	修改时间
recordCount	number
小数位数:0,最大长度:10	否	记录数量：如果查询明细信息如rebateReturnProductRecords.orderNo不为空，则返回明细总条数，否则返回费用单总条数
recordList	object	是	使用记录

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"pubts": "",
		"recordCount": 0,
		"recordList": [
			{
				"id": 0,
				"code": "",
				"bizName": "",
				"bizId": 0,
				"agentRelationId": 0,
				"agentId": 0,
				"agentId_name": "",
				"salesOrgId": 0,
				"salesOrgName": "",
				"vouchdate": "2026-06-07 13:13:19",
				"status": 0,
				"settlementOrgId": 0,
				"settlementOrgId_name": "",
				"agentId_code": "",
				"rebateMoney": 0,
				"surplusMoney": 0,
				"useWayCode": "",
				"validStartDate": "2026-06-07 13:13:19",
				"validEndDate": "2026-06-07 13:13:19",
				"memo": "",
				"canUsable": true,
				"auditorId": 0,
				"originalPk": "",
				"originalPk_priceDigit": 0,
				"originalPk_moneyDigit": 0,
				"originalPk_code": "",
				"originalPk_name": "",
				"auditDate": "2026-06-07 13:13:19",
				"auditTime": "2026-06-07 13:13:19",
				"createDate": "2026-06-07 13:13:19",
				"createTime": "2026-06-07 13:13:19",
				"isWiteList": true,
				"creatorId": "",
				"version": 0,
				"voucherType": "",
				"verifystate": 0,
				"isWfControlled": true,
				"valid": "",
				"rebateCode": "",
				"pubts": "",
				"rebateReturnProductRecords": [
					{
						"agentId": NaN,
						"rebateReturnProductId": "商品返利详细id",
						"rebateId": NaN,
						"orderNo": "订单编号",
						"rebateNo": "返利单号",
						"orderDetailIdKey": "订单详情",
						"quantity": "使用数量",
						"usedAmount": NaN,
						"recordStatus": ""
					}
				],
				"headItem": {
					"rebateId": 0,
					"define1": "",
					"define2": ""
				}
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
999	报错提示	按照错误提示进行操作

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

