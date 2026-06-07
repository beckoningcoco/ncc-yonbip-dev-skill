---
title: "退换货单修改"
apiId: "4963a3ad061f4ca0a17d317e5943df3b"
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

# 退换货单修改

>  请求方式	POST | Return & Exchange Document (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/dst/returnorder/modify
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
externalData	object	否	是	修改数据
Modified	object	是	否	修改订单表体，字段参看Added
Deleted	object	是	否	删除订单表体，字段参考Added
onlyModifyValue	string	否	否	true，false, 是否仅做数据修改,true为是
Head	object	是	是	修改订单表头
Added	object	是	否	新增订单表体（换货行）
partParam	object	是	是	id-时间戳键值对
ids	string	否	是	修改单据ID

## 3. 请求示例

Url: /yonbip/sd/dst/returnorder/modify?access_token=访问令牌
Body: {
	"externalData": {
		"Modified": [
			{
				"value": [
					{}
				]
			}
		],
		"Deleted": [
			{}
		],
		"onlyModifyValue": "",
		"Head": [
			{
				"convert_time": "",
				"image_name": "",
				"shopCode": "",
				"refund_type": "",
				"oribillid": 0,
				"tid": "",
				"payment": 0,
				"total_fee": 0,
				"status": "",
				"memo": "",
				"buyer_nick": "",
				"sys_status": "",
				"reason": "",
				"refundFee": 0,
				"salerpter": "",
				"refund_fee": 0,
				"blend_person": "",
				"created": "",
				"distributor_nick": "",
				"plat": "",
				"image_url": "",
				"refundNum": 0,
				"desc": "",
				"turn_into_status": "",
				"srctype": "",
				"image_id": "",
				"blend_date": "",
				"audit_date": "",
				"isSuccessReturn": "",
				"refund_status": "",
				"isClosed": 0,
				"isAuditing": "",
				"sid": "",
				"good_status": "",
				"id": 0,
				"salerpttime": "",
				"refund_phase": "",
				"company_name": "",
				"convert_type": 0,
				"isBlend": "",
				"moneytype": "",
				"bill_code": "",
				"wmsDeliveryCode": "",
				"down_time": "",
				"bsalerpt": 0,
				"auditPerson": "",
				"fail_reason\t": "",
				"newAddTradePerson": "",
				"cancel_status": "",
				"refund_id": "",
				"transferPerson": "",
				"order_status": "",
				"newAddTradeTime": "",
				"salerptid": 0,
				"salerptcode": "",
				"refund_version": 0,
				"blend_id": ""
			}
		],
		"Added": [
			{
				"total_fee": 0,
				"citemID": 0,
				"modified": "",
				"enableNum": 0,
				"id": "",
				"tid": "",
				"cbatch": "",
				"title": "",
				"isGift": "",
				"actualReturnQuantity": 0,
				"oid": "",
				"product_name": "",
				"sku": "",
				"cwhcode": "",
				"price": 0,
				"good_status": "",
				"payment": 0,
				"created": "",
				"num": 0,
				"exchange_lable": "",
				"productID": 0,
				"cTradeLineId": "",
				"cTradeCodeLine": "",
				"sku_id": "",
				"num_iid": "",
				"refund_phase": "",
				"memo": ""
			}
		]
	},
	"partParam": [
		{}
	],
	"ids": ""
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
data	object	是	返回具体数据
code	string	否	返回类型
isShowMsg	boolean	否	是否在客户端显示消息
externalMap	object	否	扩展参数
failCount	string	否	失败数
successCount	string	否	成功数
actionName	string	否	动作名称
exceptionMsg	string	否	异常信息

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"code": "",
			"isShowMsg": true,
			"externalMap": {},
			"failCount": "",
			"successCount": "",
			"actionName": "",
			"exceptionMsg": ""
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
999	店铺编码不存在	请输入正确的店铺编码信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2024-09-25	
更新
请求说明
更新
请求参数 (90)
更新
返回参数 (10)
支持集成

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

