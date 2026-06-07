---
title: "订单拆分"
apiId: "1701670234757791752"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 订单拆分

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/ec/order/split
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
ectype	string	否	是	电商来源 示例：xinfangsheng
customerCode	string	否	是	客户标识 示例：lcmy20211229v1
data	object	是	是	data部分为JSONArray，里面是拆分的子订单，但同一次推送的子订单必须属于同一笔订单
orderCode	string	否	是	电商订单号 示例：CS1
shippingOrderCode	string	否	是	电商子订单号(发货单号) 示例：ceshichaidan01
nakedAmount	double	否	否	无税金额 示例：1306.1952
amount	double	否	否	含税金额 示例：1476
taxAmount	double	否	否	税额 示例：169.8048
freight	double	否	否	运费 示例：0
totalAmount	double	否	否	总额（含税金额+运费） 示例：1476
performState	string	否	否	发货状态 1：已发货 2：已妥投 3：退货 示例：1
paymentState	string	否	否	结算状态 1：已对账 2：已开票 3：已收款
sku	object	是	是	sku

## 3. 请求示例

Url: /yonbip/cpu/ec/order/split?access_token=访问令牌
Body: {
	"ectype": "xinfangsheng",
	"customerCode": "lcmy20211229v1",
	"data": [
		{
			"orderCode": "CS1",
			"shippingOrderCode": "ceshichaidan01",
			"nakedAmount": 1306.1952,
			"amount": 1476,
			"taxAmount": 169.8048,
			"freight": 0,
			"totalAmount": 1476,
			"performState": "1",
			"paymentState": "",
			"sku": [
				{
					"skuCode": "202300000001",
					"quantity": 12,
					"nakedPrice": 108.8496,
					"price": 123,
					"taxRate": 13,
					"taxPrice": 14.1504,
					"nakedAmount": 1306.1952,
					"amount": 1476,
					"taxAmount": 169.8048
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
code	string	否	状态码 示例：200
message	string	否	提示信息 示例：成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功"
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
	1	2025-06-24	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

