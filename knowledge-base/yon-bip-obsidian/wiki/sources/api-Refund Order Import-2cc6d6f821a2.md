---
title: "退款单导入"
apiId: "2cc6d6f821a2409b80639644b7dd87e0"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Return & Exchange Document"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Return & Exchange Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 退款单导入

>  请求方式	POST | Return & Exchange Document (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/refundorder/import
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
externalData	object	是	是	退款单原单主表[ec.ec_refundsource.RefundSource]
shopCode	string	否	是	店铺编码
status	string	否	是	平台状态
stored_card_refund	Decimal	否	是	会员钱包退款
tid	string	否	是	交易编号
oid	string	否	是	子订单编号
refund_type	string	否	是	退款类型(“1”:”退款”,”2”:”退货”,”3”:”拒收”)
refund_id	string	否	是	退款单号
order_status	string	否	是	“waiting_buyer_to_pay”:”待付款”,”buyers_have_paid”:”待发货”,”sellers_have_been_shipped”:”已发货”,”sellers_have_been_shipped_part”:”部分发货”,”trade_closed”:”交易关闭”,”trade_refunding”:”退款中”,”trade_finished”:”交易完成”
refund_phase	string	否	是	退款阶段(“onsale”:”售中”,”aftersale”:”售后”,”sale”:”售中/售后”)
sys_status	string	否	是	系统状态，具体参考：https://www.showdoc.com.cn/265424688438926?page_id=1583015898805370
stored_card_disrefund	Decimal	否	是	会员钱包折扣退款，精确到2位小数，单位元。如200.07，表示200元7分。
total_fee	Decimal	否	是	订单交易总金额，精确到2位小数，单位元。如200.07，表示200元7分。
refund_fee	Decimal	否	是	申请退款金额，精确到2位小数，单位元。如200.07，表示200元7分
payment	string	否	是	实际退款金额，精确到2位小数，单位元。如200.07，表示200元7分。
buyer_nick	string	否	是	买家昵称
seller_nick	string	否	是	卖家昵称
reason	string	否	是	退款原因
desc	string	否	否	退款说明
company_name	string	否	否	退货快递公司名称
sid	string	否	否	退货快递单号
created	DateTime	否	是	退款申请时间，格式"2019-06-28 11:04:22"
modified	DateTime	否	是	修改时间，格式"2019-06-28 11:04:22"
good_status	string	否	是	货物状态(“BUYER_NOT_RECEIVED”:”买家未收到货”,”BUYER_RECEIVED”:”买家已收到货”,”BUYER_RETURNED_GOODS”:”买家已退货”)
refund_num	string	否	是	退货申请数量
refundSourceDetail	object	是	是	退款单原单子表[ec.ec_refundsource.RefundSourceDetail]

## 3. 请求示例

Url: /yonbip/sd/dst/refundorder/import?access_token=访问令牌
Body: {
	"externalData": [
		{
			"shopCode": "",
			"status": "",
			"stored_card_refund": 0,
			"tid": "",
			"oid": "",
			"refund_type": "",
			"refund_id": "",
			"order_status": "",
			"refund_phase": "",
			"sys_status": "",
			"stored_card_disrefund": 0,
			"total_fee": 0,
			"refund_fee": 0,
			"payment": "",
			"buyer_nick": "",
			"seller_nick": "",
			"reason": "",
			"desc": "",
			"company_name": "",
			"sid": "",
			"created": "",
			"modified": "",
			"good_status": "",
			"refund_num": "",
			"refundSourceDetail": [
				{
					"oid": "",
					"num_iid": "",
					"tid": "",
					"productID": 0,
					"title": "",
					"sku": "",
					"num": 0,
					"price": 0,
					"total_fee": 0,
					"refund_fee": 0,
					"memo": "",
					"created": "",
					"modified": "",
					"stored_card_refund": 0,
					"stored_card_disrefund": 0
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
code	string	否	返回码，调用成功时返回200
message	string	否	返回信息

## 5. 正确返回示例

{
	"code": "",
	"message": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	导入异常，请检查入参	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-04-28	
更新
请求参数 (41)
更新
返回参数 code
更新
返回参数 message
结构修改

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

