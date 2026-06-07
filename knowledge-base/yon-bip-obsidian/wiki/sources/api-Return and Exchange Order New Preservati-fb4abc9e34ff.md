---
title: "退换货单新增保存"
apiId: "fb4abc9e34ff4473b109d1d750b8f806"
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

# 退换货单新增保存

>  请求方式	POST | Return & Exchange Document (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/dst/returnorder/add
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
externalData	object	否	是	需要保存的数据
Added	object	是	是	退换货单的表体信息
Head	object	是	是	退换货单的表头信息
partParam	object	否	否	id:时间戳

## 3. 请求示例

Url: /yonbip/sd/dst/returnorder/add?access_token=访问令牌
Body: {
	"externalData": {
		"Added": [
			{
				"enableNum": 0,
				"total_fee": 0,
				"num": 0,
				"payment": 0,
				"memo": "",
				"goodtype": 0,
				"cbatch": "",
				"oid": "",
				"actualReturnQuantity": "",
				"citemID": 0,
				"price": 0,
				"created": "",
				"productID": 0,
				"tenant_id": 0,
				"refund_phase": "",
				"sku_id": "",
				"title": "",
				"good_status": "",
				"tid": "",
				"cTradeLineId": "",
				"product_name": "",
				"isInbound": 0,
				"org_id": 0,
				"num_iid": "",
				"modified": "",
				"iWarehouseId": 0,
				"storeOrg": "",
				"storeOrgCode": "",
				"sku": "",
				"cTradeCodeLine": "",
				"isGift": ""
			}
		],
		"Head": [
			{
				"memo": "",
				"blend_id": "",
				"buyer_nick": "",
				"convert_type": 0,
				"blend_date": "",
				"srctype": "",
				"tid": "",
				"plat": "",
				"refund_version": 0,
				"total_fee": 0,
				"refundNum": 0,
				"created": "",
				"order_status": "",
				"inbound_status": "",
				"tenant_id": 0,
				"refund_fee": 0,
				"transferPerson": "",
				"newAddTradePerson": "",
				"convert_time": "",
				"image_name": "",
				"isBlend": 0,
				"bill_code": "",
				"shopCode": "",
				"image_url": "",
				"refund_id": "",
				"auditPerson": "",
				"payment": 0,
				"refund_type": "",
				"refundFee": "",
				"org_id": "",
				"down_time": "",
				"blend_person": "",
				"oribillid": [
					0
				],
				"modified": "",
				"company_name": "",
				"moneytype": "",
				"statu": "",
				"image_id": "",
				"fail_reason": "",
				"isAuditing": 0,
				"sid": "",
				"reason": "",
				"distributor_nick": "",
				"good_status": "",
				"desc": "",
				"newAddTradeTime": "",
				"audit_date": "",
				"isClosed": 0,
				"refund_status": "",
				"refund_phase": "",
				"inbound_time": "",
				"moneytype_code": ""
			}
		]
	},
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息

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
999	保存失败	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-24	
新增
请求参数 storeOrg
新增
请求参数 storeOrgCode
更新
请求参数 (9)
恢复描述
	2	2024-09-25	
更新
请求说明
支持集成

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

