---
title: "销售发票列表查询"
apiId: "02a37c9c6ab04f928a1729d4c9a7126d"
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

# 销售发票列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Invoice (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersaleinvoice/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始时间,格式为:yyyy-MM-dd HH:mm:ss |
| open_vouchdate_end | string | 否 | 否 | 单据截止时间,格式为:yyyy-MM-dd HH:mm:ss |
| code | string | 否 | 否 | 单据编号 示例：TIrgan201012000023 |
| agentConfirmStatus | long | 否 | 否 | 客户确认状态 0:无需客户确认、1:未客户确认、2:已客户确认 示例：0 |
| taxBillingStatus | long | 否 | 否 | 税务开票状态 0:开票中、1:未开税票、2:已开税票、3:开票失败 示例：0 |
| status | string | 否 | 否 | 发票状态 (0:开立 1:已审核 3:审核中) |
| businessState | long | 否 | 否 | 发票业务状态(0:开票中、3:已作废、4:已红冲) 示例：0 |
| invoiceType | long | 否 | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票） 示例：0 |
| pageSize | long | 否 | 是 | 每页显示几条数据，默认值：10 示例：10 默认值：10 |
| pageIndex | long | 否 | 是 | 页码，默认值：1 示例：1 默认值：1 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性（字段）(条件传属性的名称，如单据日期vouchdate、时间戳pubts、商品id saleInvoiceDetails.productId等) 示例：vouchdate |
| op | string | 否 | 否 | 逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) 示例：in |
| value1 | string | 否 | 否 | 值1(条件)如："2021-04-19 23:59:59" 示例：2021-11-17 00:00:00 |
| value2 | string | 否 | 否 | 值2(条件)如： "2021-04-19 00:00:00" 示例：2021-12-16 23:59:59 |

## 3. 请求示例

Url: /yonbip/sd/vouchersaleinvoice/list?access_token=访问令牌
Body: {
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"code": "TIrgan201012000023",
	"agentConfirmStatus": 0,
	"taxBillingStatus": 0,
	"status": "",
	"businessState": 0,
	"invoiceType": 0,
	"pageSize": 10,
	"pageIndex": 1,
	"isSum": false,
	"simpleVOs": [
		{
			"field": "vouchdate",
			"op": "in",
			"value1": "2021-11-17 00:00:00",
			"value2": "2021-12-16 23:59:59"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| pageIndex | int | 否 | 第几页 |
| pageSize | int | 否 | 每页数据行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页数 |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 返回结果 |

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
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"agentConfirmStatus": 0,
				"taxBillingStatus": 0,
				"orgName": "",
				"code": "",
				"transactionTypeId_name": "",
				"vouchdate": "",
				"transactionTypeId": "",
				"auditDate": "",
				"status": "",
				"agentName": "",
				"currency": "",
				"invAgentName": "",
				"currency_code": "",
				"currency_name": "",
				"exchangeRateType": {
					"name": ""
				},
				"redType": "",
				"id": "",
				"exchRate": 0,
				"pubts": "",
				"orgId": "",
				"natCurrency_code": "",
				"natCurrency_name": "",
				"tplid": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define60": ""
				},
				"invDirection": "",
				"invoiceType": "",
				"billStationCode": "",
				"invAgentTaxNo": "",
				"invAgentAdress": "",
				"invAgentTel": "",
				"invAgentBank": "",
				"receievInvoiceMobile": "",
				"receievInvoiceEmail": "",
				"einvoiceHm": "",
				"einvoiceNo": "",
				"einvoiceRequestNo": "",
				"businessState": "",
				"oriSum": 0,
				"oriMoney": 0,
				"oriTax": 0,
				"natSum": 0,
				"natMoney": 0,
				"natTax": 0,
				"bizFlow_version": "",
				"createTime": "",
				"modifier": "",
				"modifyTime": "",
				"auditor": "",
				"auditTime": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"blueEinvoiceKprq": "",
				"issuedTaxQty": 0,
				"issuedTaxAmount": 0,
				"issuedTaxSum": 0,
				"source": "",
				"natCurrency": "",
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"isWfControlled": "",
				"verifystate": "",
				"mainid": "",
				"saleInvoiceDetails_saleOrgId": "",
				"srcVoucherChildColumnNo": "",
				"productId": "",
				"skuId": "",
				"saleInvoiceDetails_projectId": "",
				"invoiceSource": "",
				"batchNo": "",
				"unitId": "",
				"saleInvoiceDetails_saleOrgId_name": "",
				"srcVoucherNo": "",
				"srcVoucherColumnNo": "",
				"chargeUnitId": "",
				"productCode": "",
				"productName": "",
				"speciDes": "",
				"saleInvoiceDetails_lineAgentId": 0,
				"subQty": 0,
				"cusProductCode": "",
				"invExchRate": 0,
				"cusProductName": "",
				"unitExchangeType": 0,
				"cusProductVersion": "",
				"unitExchangeTypePrice": 0,
				"cusSkuCode": "",
				"invProductType": "",
				"chargeUnitName": "",
				"priceUOM_Precision": "",
				"taxId": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"saleInvoiceDetails_lineAgentId_name": "",
				"unitName": "",
				"unit_Precision": "",
				"qty": 0,
				"saleInvoiceDetails_projectCode": "",
				"saleInvoiceDetails_saleDeptId": "",
				"saleInvoiceDetails_projectName": "",
				"oriTaxUnitPrice": 0,
				"saleInvoiceDetails_saleUserId": "",
				"oriUnitPrice": 0,
				"saleInvoiceDetails": {
					"oriSum": 0,
					"oriMoney": 0,
					"oriTax": 0,
					"natSum": 0,
					"natMoney": 0,
					"natTax": 0,
					"blueInvlineno": {},
					"totalRedQty": {},
					"totalRedPriceQty": {},
					"totalRedOrisum": {},
					"excessiveSigning": {},
					"calBase": {},
					"issuedTaxSum": 0,
					"issuedTaxAmount": 0,
					"issuedTaxQty": 0,
					"advancePaymentOffsetMethod": ""
				},
				"bodyItem": {
					"id": "",
					"define1": "",
					"define60": ""
				},
				"taxCode": "",
				"taxItems": "",
				"taxRate": 0,
				"natTaxUnitPrice": 0,
				"natUnitPrice": 0,
				"taxStartDate": "",
				"taxEndDate": "",
				"saleInvoiceDetails_saleDeptName": "",
				"saleInvoiceDetails_saleUserName": "",
				"accOrigReceiveMoney": 0,
				"natAccReceiveMoney": 0,
				"oriWithholdingTax": 0,
				"natWithholdingTax": 0,
				"blueInvId": "",
				"bizFlow": "",
				"isFlowCoreBill": "",
				"retailInvestors": "",
				"retailAgentName": "",
				"agentContactsTel": "",
				"agentContacts": "",
				"modifyInvoiceType": "",
				"invoiceTitleType": "",
				"invoiceTitle": "",
				"blueInvNo": "",
				"isIssueRedInvoice": "",
				"invAgentSubBank": "",
				"invAgentBankNo": "",
				"billStationName": "",
				"einvoiceDownUrl": "",
				"einvoiceFailMemo": "",
				"bizFlow_name": "",
				"saleInvoiceDetails_model": "",
				"saleInvoiceDetails_memo": "",
				"stockOrgId": 0,
				"isAdvRecInv": true,
				"prepayInvRvnRecogBkgMeth": "",
				"offsetAdvRecInv": true,
				"offsetNo": 0,
				"offsetId": 0,
				"offsetAdvRecInvQty": 0,
				"offsetAdvRecInvMoney": 0,
				"offsetAdvRecInvNatMoney": 0,
				"offsetAdvRecInvTaxMoney": 0,
				"offsetAdvRecInvNatTaxMoney": 0,
				"checkByRevenueManagement": true,
				"costBillNoType": "",
				"issuedRevSettleInfo": true,
				"saleInvoiceDetailId": "",
				"noTaxSaleCost": 0,
				"noTaxSalePrice": 0,
				"priceDate": "",
				"taxCodeId": "",
				"taxCode_taxCode": "",
				"carryOverOfCostMethod": "",
				"sourcesys": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-12

新增

返回参数 (10)

增加“预收款开票冲抵方式”

2	2025-12-05

新增

返回参数 (9)

NBJY-39278【日常环境】【开税票】销售发票批量更新API接口和销售发票列表查询接口，没有增加开税票相关字段

3	2025-08-20

新增

返回参数 carryOverOfCostMethod

新增

返回参数 sourcesys

NBJY-33521-【日常环境】【发出商品】销售发票单个保存和出库推发票接口没有增加结转成本和出库来源系统字段

4	2025-06-20

新增

返回参数 taxCodeId

新增

返回参数 taxCode_taxCode

NBJY-26444-全球化计税引擎：销售发票api接口对税码的处理


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

