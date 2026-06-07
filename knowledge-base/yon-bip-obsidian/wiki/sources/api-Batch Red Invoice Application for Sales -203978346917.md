---
title: "销售发票批量红冲申请"
apiId: "2039783469170556932"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Invoice"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发票批量红冲申请

>  请求方式	POST | Sales Invoice (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/xsfw/vouchersaleinvoice/redApply
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
data	object	否	是	请求参数
id	long	是	否	发票id(可做独立条件) 示例：[2155419223904768]

## 3. 请求示例

Url: /yonbip/xsfw/vouchersaleinvoice/redApply?access_token=访问令牌
Body: {
	"data": {
		"id": [
			2155419223904768
		]
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
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
count	long	否	执行总条数 示例：1
sucessCount	long	否	成功条数 示例：1
failCount	long	否	失败条数 示例：0
messages	string	是	返回消息 示例：[""]
infos	object	是	数据体

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"blueEinvoiceKprq": "",
				"saleOrgId": "2282501235675648",
				"invDirection": 1,
				"invAgentId": 2282507926999296,
				"oriTax": -30.552,
				"agentContacts": "刘德华",
				"source": "st_salesout",
				"natTax": -30.552,
				"natCurrency": "2281153755730176",
				"invoiceTitleType": 0,
				"invoiceType": 0,
				"modifyInvoiceType": true,
				"invoiceTitle": "2",
				"orgName": "lcy-all",
				"isWfControlled": false,
				"agentName": "lcy客户0531",
				"natSum": -500,
				"taxRate": 5,
				"auditTime": "2021-06-08 14:21:14",
				"invAgentName": "lcy客户0531",
				"oriMoney": -469.448,
				"status": 1,
				"verifystate": 2,
				"agentId": 2282507926999296,
				"code": "TI5648210715000001",
				"agentContactsTel": "19877754612",
				"bizFlow": "08584451-c81f-11eb-a68a-0624d60000dc",
				"exchRate": 1,
				"orgId": "2282501235675648",
				"vouchdate": "2021-07-15 00:00:00",
				"businessState": 1,
				"currency": "2281153755730176",
				"pubts": "2021-07-15 15:25:44",
				"isFlowCoreBill": false,
				"auditDate": "2021-06-08 00:00:00",
				"invAgentSubBank": "中国工商银行股份有限公司濮阳兴工支行",
				"creator": "YonSuite默认用户",
				"transactionTypeId": "1248018423173393",
				"oriSum": -500,
				"invoiceSrcSystem": 2,
				"auditor": "lcy",
				"invAgentBank": "中国工商银行",
				"exchangeRateType": "0000KPC165PABLPTS60000",
				"erpSystem": 4,
				"createTime": "2021-07-15 15:25:43",
				"natMoney": -469.448,
				"blueInvNo": "TI5648210608000002",
				"blueInvId": 2292656259600896,
				"redType": "1",
				"saleInvoiceDetails": [
					{
						"saleOrgId": "2282501235675648",
						"oriTax": -11.504,
						"orderId": 2292655356547328,
						"firstsource": "udinghuo.voucher_order",
						"firstupcode": "UO-564820210608000004",
						"natTax": -11.504,
						"source": "ustock.st_salesout",
						"productName": "lcy物料1",
						"taxItems": "13%",
						"sourceOriPrice": 10,
						"chargeUnitName": "个",
						"skuId": 2282510615957760,
						"orderNo": "UO-564820210608000004",
						"productId": 2282510599311616,
						"unitName": "个",
						"oriUnitPrice": 8.85,
						"natSum": -100,
						"taxCode": "VAT13",
						"rebateMoney": 0,
						"invProductType": "SALE",
						"chargeUnitId": 2281391401455872,
						"taxRate": 13,
						"srcVoucherNo": "XSCK20210608000002",
						"taxId": "2281153770967296",
						"qty": -10,
						"oriTaxUnitPrice": 10,
						"oriMoney": -88.496,
						"natUnitPrice": 8.85,
						"accOrigReceiveMoney": 0,
						"natAccReceiveMoney": 0,
						"firstsourceautoid": 2292655356563712,
						"makeRuleCode": "salesout_saleinvoicelist",
						"invPriceExchRate": 1,
						"unitId": 2281391401455872,
						"firstsourceid": 2292655356547328,
						"sourceid": 2292656057799424,
						"oriSum": -100,
						"unitExchangeType": 0,
						"invoiceSource": 4,
						"cashRebateMoney": 0,
						"orderDetailId": 2292655356563712,
						"orderRebateMoney": 0,
						"sourceautoid": 2292656057799425,
						"productCode": "000002",
						"priceQty": -10,
						"upcode": "XSCK20210608000002",
						"stockOrgId": "2282501235675648",
						"natTaxUnitPrice": 10,
						"natMoney": -88.496,
						"id": 2345106527949313,
						"mainid": 2345106527949312,
						"pubts": "2021-07-15 15:25:43",
						"blueInvlineno": "10"
					}
				],
				"id": 2345106527949312
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
200	TI5648210712000004当前单据不是最新状态，请刷新重试	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-19	
更新
请求说明
新增
返回参数 blueEinvoiceKprq
NBJY-37168-【日常环境】【蓝字税票日期】销售发票列表查询和详情查询API接口没有增加蓝字税票日期

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

