---
title: "订单修改(新)"
apiId: "2141620150245261317"
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

# 订单修改(新)

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/dst/tradeorder/directModify
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
Head	object	否	是	订单表头支持字段
Modified	object	是	否	订单表体支持字段
ids	string	否	是	订单id 示例：1065329598779648
partParam	object	否	是	id-时间戳键值对

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/directModify?access_token=访问令牌
Body: {
	"externalData": {
		"Head": {
			"id": "1065329598779648",
			"tradeType": "2076928273338368",
			"tradeTypeName": "普通订单",
			"seller_memo": "线上卖家备注",
			"trade_memo": "交易备注",
			"buyer_message": "买家留言",
			"customer": "214149582811037",
			"customerName": "客户A",
			"department": "214149582811038",
			"departmentName": "部门A",
			"salesman": "214149582811039",
			"salesmanName": "业务员A",
			"isInvoice": "1",
			"bank_account": "",
			"deposit_bank": "",
			"iinvoicetype": "1",
			"invoice_name": "",
			"makeInvoiceTime": "2025-01-01 00:00:00",
			"receiverInvoiceMobile": "",
			"receiveInvoiceMail": "",
			"registered_address": "",
			"registered_phone": "",
			"taxpayer_ident": "",
			"cInvoiceCode": "",
			"cinvoiceurlpatch": "",
			"invoiceUrl": "",
			"cinvoiceextractcode": "",
			"invoice_amount": "",
			"fpqqlsh": "",
			"invoiceCode": "",
			"makeInvoiceStatus": "",
			"makeRedInvoiceTime": "",
			"makeBlueInvoiceFailedReason": "",
			"bizInvoiceApplyNo": "",
			"status": "",
			"cExpressCoID": "1865165875384576",
			"expressCode": "001",
			"cExpressCode": "SF123456",
			"shipRptCode": "",
			"salerptcode": "",
			"bizIsFinish": ""
		},
		"Modified": [
			{
				"id": "1065329598779648",
				"batchno": "JYPC"
			}
		]
	},
	"ids": "1065329598779648",
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
message	string	否	message 示例：订单修改成功
cpickrowno	string	否	波次号

## 5. 正确返回示例

{
	"code": 200,
	"message": "订单修改成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	没有符合条件的单据或当前单据不是最新状态	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-17	
更新
请求说明
新增
请求参数 shipRptCode
新增
请求参数 salerptcode
新增
请求参数 bizIsFinish
新增表头业务完成字段
	2	2025-08-19	
新增
请求参数 cExpressCoID
新增
请求参数 expressCode
新增
请求参数 cExpressCode
支持快递公司以及快递单号
	3	2025-08-12	
新增
请求参数 status
支持线上交易状态修改

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

