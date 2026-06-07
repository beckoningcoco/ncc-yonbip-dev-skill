---
title: "销售订单变更审核校验（U9C）"
apiId: "2074888195381657602"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "SO Change"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SO Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单变更审核校验（U9C）

>  请求方式	POST | SO Change (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/xsfw/voucherOrderchange/U9Ccheck
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
routeDirection	string	header	否	路由参数    默认值: U9C
Body参数
名称	类型	数组	必填	描述
salesOrgId_code	string	否	是	销售组织编码
salesOrgId	string	否	是	销售组织id
originalOrderId	string	否	是	原单id
id	string	否	是	id
agentId_code	string	否	是	客户编码
agentId	string	否	是	客户id
orderPrices_originalCode	string	否	是	原币编码
orderPrices_currency	string	否	否	原币
orderPrices_domesticCode	string	否	否	本币编码
orderPrices_natCurrency	string	否	否	本币
orderDetails	object	是	否	销售订单表体行
id	string	否	是	订单子表id
originalOrderDetailId	string	否	否	原订单行id
productCode	string	否	是	商品编码
productId	string	否	是	商品id
priceQty	number
小数位数:2,最大长度:10	否	是	计价数量
subQty	number
小数位数:2,最大长度:10	否	是	销售数量
oriSum	number
小数位数:2,最大长度:10	否	是	原币含税金额
orderDetailPrices_oriMoney	number
小数位数:2,最大长度:10	否	是	原币无税金额
_status	string	否	是	操作类型

## 3. 请求示例

Url: /yonbip/xsfw/voucherOrderchange/U9Ccheck?access_token=访问令牌
Header: 
	routeDirection : ""
Body: {
	"salesOrgId_code": "",
	"salesOrgId": "",
	"originalOrderId": "",
	"id": "",
	"agentId_code": "",
	"agentId": "",
	"orderPrices_originalCode": "",
	"orderPrices_currency": "",
	"orderPrices_domesticCode": "",
	"orderPrices_natCurrency": "",
	"orderDetails": [
		{
			"id": "",
			"originalOrderDetailId": "",
			"productCode": "",
			"productId": "",
			"priceQty": 0,
			"subQty": 0,
			"oriSum": 0,
			"orderDetailPrices_oriMoney": 0,
			"_status": ""
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
code	string	否	code 示例：200
message	string	否	message
data	object	是	data
code	string	否	code
data	object	是	data
message	string	否	message
success	string	否	success

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"code": "",
			"data": [
				{
					"Org": "",
					"SrcYXYSOID": "",
					"ErpDocNO": "",
					"SrcYXYSOLineID": "",
					"ErpDocLineNo": "",
					"CanModify": "",
					"ErrMsg": ""
				}
			],
			"message": "",
			"success": ""
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
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

