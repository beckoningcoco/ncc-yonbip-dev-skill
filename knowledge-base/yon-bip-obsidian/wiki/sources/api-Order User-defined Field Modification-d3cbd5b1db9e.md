---
title: "订单自定义项修改"
apiId: "d3cbd5b1db9e476f8ee72d81d37aa86b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Online Retailer Order"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Online Retailer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 订单自定义项修改

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/dst/tradeorder/modify
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
externalData	object	否	否	修改数据
Added	object	是	否	新增订单表体
Modified	object	是	否	修改订单表体，字段参考Added
Head	object	是	是	订单表头数据
ids	string	否	是	订单id
partParam	object	否	是	id-时间戳键值对

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/modify?access_token=访问令牌
Body: {
	"externalData": {
		"Added": [
			{
				"store_code": "",
				"total_fee": 0,
				"sub_order_tax_fee": 0,
				"logistics_company": "",
				"iorderweight": 0,
				"productID": 0,
				"oriItemNum": 0,
				"tid": "",
				"dealerCode": "",
				"invoice_no": "",
				"outer_sku_id": "",
				"goodtype": 0,
				"cRefundState": 0,
				"sku_properties_name": "",
				"consign_time": "",
				"status": "",
				"payment": "",
				"outer_iid": "",
				"oid": "",
				"price": 0,
				"cWhCode": 0,
				"isGift": 0,
				"citemID": 0,
				"post_fee": 0,
				"oriItemName": "",
				"order_memo": "",
				"sku_id": "",
				"isPtoSplit": 0,
				"num_iid": "",
				"title": "",
				"adjust_fee": 0,
				"tradeOrderDetailCustomItem_define1~60": "",
				"buyer_nick": "",
				"refund_id": 0,
				"oriItemCode": "",
				"is_service_order": 0,
				"num": 0,
				"refund_status": "",
				"id": 0,
				"discount_fee": 0,
				"refund_fee": 0,
				"refund_num": 0,
				"seller_nick": "",
				"isInPromotion": 0,
				"bvirtual": 0
			}
		],
		"Modified": [
			{
				"value": [
					{}
				]
			}
		],
		"Head": [
			{
				"refund_fee": 0,
				"iinvoice": "",
				"receiver_address": "",
				"cdistrictid": 0,
				"refund_num": 0,
				"receiver_zip": "",
				"discount_fee": 0.555,
				"has_buyer_message": 0,
				"isInvoice": 0,
				"receiver_district": "",
				"cstateid": 0,
				"cExpressCode": "",
				"received_payment": 0,
				"bank_account": "",
				"receiver_mobile": "",
				"buyer_payment": 0,
				"cancel_status": "",
				"seller_memo": "",
				"trade_memo": "",
				"pay_time": "",
				"wmsDeliveryCode": "",
				"post_fee": 0,
				"real_point_fee": "",
				"taxpayer_ident": "",
				"cShipMode": "ECDeliver",
				"applier_nick": "",
				"coupon_point": 0,
				"receiver_town": "",
				"cFenxiao": "",
				"point_fee": 0,
				"end_time": "",
				"payment": 3.865,
				"sys_Status": "",
				"isUpload": 0,
				"receiver_state": "",
				"adjust_fee": 1,
				"turn_into_status": "",
				"cinvoiceextractcode": "",
				"order_tax_fee": 0,
				"shopCode": "",
				"total_fee": 3.42,
				"modified": "",
				"tid": "",
				"receiver_country": "",
				"receiver_card_id": "",
				"invoice_name": "",
				"invoice_amount": 0,
				"receiver_name": "",
				"has_post_fee": 0,
				"coupon_ticket": 0,
				"deposit_bank": "",
				"receiver_city": "",
				"receiver_phone": "",
				"isCollection": 0,
				"isPickSelf": "",
				"coupon_fee": 0,
				"isBlend": "",
				"isHold": 0,
				"ccityid": 0,
				"status": "",
				"tradewaystatus": 0,
				"buyer_message": "",
				"cExpressCoID": 1022883864170752,
				"tradeOrderCustomItem_define1~60": "",
				"id": 1065329598779648,
				"cInvoiceCode": "",
				"sign_datetime": "",
				"coupon_card": 0,
				"isClosed": 0,
				"buyer_nick": "",
				"created": ""
			}
		]
	},
	"ids": "",
	"partParam": {}
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
code	long	否	code 示例：200
message	string	否	message 示例：操作成功
cpickrowno	string	否	波次号
data	string	否	data 示例：修改完成

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "修改完成"
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
	1	2025-06-25	
更新
请求说明
更新
请求参数 (121)
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

