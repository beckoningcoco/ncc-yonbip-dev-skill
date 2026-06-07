---
title: "交易原单查询"
apiId: "2ca9da0b86d8437a84df862c5d463d6f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Original Transaction Document"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Original Transaction Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 交易原单查询

>  请求方式	POST | Original Transaction Document (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/tradevouch/query
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
partParam	object	否	是	查询条件
shopcode	string	否	否	店铺编码
tid	string	否	否	交易编号
start_modify	string	否	否	查询交易修改时间开始。格式:yyyy-MM-dd HH:mm:ss
end_modify	string	否	否	查询交易修改时间结束。格式:yyyy-MM-dd HH:mm:ss
status	string	否	否	线上交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
id	string	否	否	订单id
pageIndex	int	否	是	页码
pageSize	int	否	是	每页数据行数
isclosed	int	否	否	关闭状态 0-未关闭，1-已关闭
start_pay	string	否	否	查询付款时间开始。格式:yyyy-MM-dd HH:mm:ss
end_pay	string	否	否	查询付款时间结束。格式:yyyy-MM-dd HH:mm:ss
start_created	string	否	否	查询交易创建时间开始。格式:yyyy-MM-dd HH:mm:ss
end_created	string	否	否	查询交易创建时间结束。格式:yyyy-MM-dd HH:mm:ss
ids	string	否	否	订单ids 多个id用英文逗号分隔
headselectfields	string	否	是	需要返回的订单头字段，可参考 https://www.showdoc.com.cn/265424688438926?page_id=2219663876097382
bodyselectfields	string	否	是	需要返回的订单体字段，可参考https://www.showdoc.com.cn/265424688438926?page_id=2219663876097382

## 3. 请求示例

Url: /yonbip/sd/dst/tradevouch/query?access_token=访问令牌
Body: {
	"partParam": {
		"shopcode": "",
		"tid": "",
		"start_modify": "",
		"end_modify": "",
		"status": "",
		"id": "",
		"pageIndex": 0,
		"pageSize": 0,
		"isclosed": 0,
		"start_pay": "",
		"end_pay": "",
		"start_created": "",
		"end_created": "",
		"ids": "",
		"headselectfields": "",
		"bodyselectfields": ""
	}
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
pageIndex	int	否	页码
pageSize	int	否	每页数据行数
totalCount	int	否	返回数据条数
info	object	是	返回具体数据

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"totalCount": 0,
		"info": [
			{
				"code": "",
				"id": 0,
				"plat": "",
				"shop_id": 0,
				"tid": "",
				"order_status": "",
				"payment": 0,
				"post_fee": 0,
				"receiver_name": "",
				"receiver_state": "",
				"receiver_address": "",
				"receiver_zip": "",
				"receiver_mobile": "",
				"receiver_phone": "",
				"receiver_country": "",
				"receiver_town": "",
				"consign_time": "",
				"invoice_kind": "",
				"num": 0,
				"title": "",
				"type": "",
				"price": 0,
				"discount_fee": 0,
				"has_post_fee": "",
				"total_fee": 0,
				"created": "",
				"pay_time": "",
				"advance_paytime": "",
				"modified": "",
				"end_time": "",
				"buyer_message": "",
				"buyer_memo": "",
				"buyer_flag": "",
				"seller_memo": "",
				"seller_flag": "",
				"buyer_nick": "",
				"has_buyer_message": "",
				"credit_card_fee": "",
				"shipping_type": "",
				"buyer_cod_fee": 0,
				"adjust_fee": 0,
				"trade_from": "",
				"buyer_rate": "",
				"receiver_city": "",
				"receiver_district": "",
				"down_time": "",
				"invoice_type": "",
				"invoice_name": "",
				"creator": "",
				"create_time": "",
				"updator": "",
				"update_time": "",
				"error_result": "",
				"is_sh_ship": "",
				"taxpayer_ident": "",
				"registered_address": "",
				"registered_phone": "",
				"deposit_bank": "",
				"bank_account": "",
				"service_fee": 0,
				"isdeleted": "",
				"buyer_cod_payment": "",
				"third_ship_type": "",
				"store_name": "",
				"is_offline": "",
				"lading_code": "",
				"coupon_point": 0,
				"coupon_ticket": 0,
				"coupon_card": 0,
				"invoice_amount": 0,
				"order_tax_fee": "",
				"pubts": "",
				"org": "",
				"step_trade_status": "",
				"stored_card_pay": 0,
				"stored_card_discount": 0,
				"ordervouchdetail": [
					{
						"row_no": 0,
						"tid": "",
						"oid": "",
						"num_iid": "",
						"sku_id": "",
						"sku_properties_name": "",
						"outer_iid": "",
						"product_code": "",
						"product_name": "",
						"product_skucode": "",
						"product_skuname": "",
						"num": "",
						"price": 0,
						"total_fee": 0,
						"payment": 0,
						"discount_fee": 0,
						"adjust_fee": 0,
						"sub_order_tax_fee": 0,
						"divide_order_fee": 0,
						"part_mjz_discount": "",
						"status": "",
						"refund_status": "",
						"title": "",
						"logistics_company": "",
						"invoice_no": "",
						"store_code": "",
						"is_service_order": "",
						"end_time": "",
						"consign_time": "",
						"is_daixiao": "",
						"is_www": "",
						"id": "",
						"source_trade_id": 0,
						"item_meal_name": "",
						"buyer_rate": "",
						"outer_sku_id": "",
						"refund_id": "",
						"shipping_type": "",
						"is_sh_ship": "",
						"shipper": "",
						"shop_id": "",
						"pubts": "",
						"citemID": "",
						"productID": "",
						"shipExpressCode": "",
						"shipWarehouseCode": "",
						"stored_card_pay": 0,
						"stored_card_discount": 0,
						"product_attribute": "",
						"tradeVouchDetailCustomItem_id": "",
						"tradeVouchDetailCustomItem_define1": "",
						"tradeVouchDetailCustomItem_define30": ""
					}
				]
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
999	查询异常,请检查入参	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (16)
更新
返回参数 (136)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

