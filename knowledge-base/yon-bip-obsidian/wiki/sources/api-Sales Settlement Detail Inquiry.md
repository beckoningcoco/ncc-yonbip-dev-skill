---
title: "销售结算详情查询"
apiId: "1691227090381701127"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sales Settlement"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售结算详情查询

> `ContentType` 请求方式	GET | 分类: Sales Settlement (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/settlement/detail

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 是 | id |

## 3. 请求示例

Url: /yonbip/sd/settlement/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| currency_priceDigit | long | 否 | 原币单价精度 示例：2 |
| invAgentId | long | 否 | 开票客户 示例：1676883402867867665 |
| agentContacts | string | 否 | 客户联系人 示例：刘德华 |
| source | string | 否 | 来源单据类型 示例：voucher_order |
| saleAreaId | long | 否 | 销售区域id 示例：1684471656581431298 |
| natCurrency | string | 否 | 本币id 示例：1676384430742044707 |
| invoiceTitleType | long | 否 | 发票抬头类型 示例：0 |
| bdInvoiceTypeName | string | 否 | 发票类型名称 示例：增值税电子普通发票 |
| modifyInvoiceType | boolean | 否 | 发票类型可改 true 是 false 否 示例：true |
| invoiceType | long | 否 | 发票类型 示例：3 |
| id | long | 否 | id 示例：1687382819789078528 |
| invoiceTitle | string | 否 | 发票抬头 示例：加气枪 |
| orgName | string | 否 | 开票组织名称 示例：自动化_普通组织 |
| bdInvoiceTypeId | long | 否 | 发票类型id 示例：1 |
| settlementDetails | object | 是 | 销售结算表体详情 |
| agentName | string | 否 | 客户名称 示例：自动化_内部交易客户 |
| checkByRevenueManagement | boolean | 否 | 收入管理核算 示例：false |
| costBillNoType | string | 否 | 结转成本单据(st_salesout：销售出库;usp_signconfirmation:签收确认;voucher_saleinvoice:销售发票) 示例：voucher_saleinvoice |
| agentRelationId | long | 否 | 客户交易关系id 示例：1676883402867867692 |
| barCode | string | 否 | 单据条码 示例：voucher_order|1687382665170255872 |
| wholeDiscountRate | long | 否 | 整单扣率 示例：100 |
| receievInvoiceMobile | string | 否 | 收票手机号 示例：18596523322 |
| natCurrency_moneyDigit | long | 否 | 本币金额精度 示例：2 |
| natCurrency_priceDigit | long | 否 | 本币单价精度 示例：2 |
| invAgentTaxNo | string | 否 | 纳税识别号 示例：123456789032156 |
| invAgentName | string | 否 | 开票客户名称 示例：自动化_内部交易客户 |
| status | long | 否 | 状态 示例：0 |
| currency_moneyDigit | long | 否 | 原币金额精度 示例：2 |
| agentId | long | 否 | 客户id 示例：1676883402867867665 |
| agentContactsTel | string | 否 | 客户联系人电话 示例：18888888888 |
| creatorId | long | 否 | 创建人id 示例：1676382145806860291 |
| bizFlow | string | 否 | 流程id 示例：f9ee154d-be63-11ed-ade5-b8cef6da5712 |
| exchRate | BigDecimal | 否 | 汇率 示例：1 |
| orgId | string | 否 | 开票组织id 示例：1676478249989832710 |
| vouchdate | string | 否 | 单据日期 示例：2023-03-24 00:00:00 |
| natCurrency_name | string | 否 | 本币 示例：人民币 |
| saleAreaId_name | string | 否 | 销售区域名称 示例：大大大 |
| bizFlow_version | string | 否 | 流程版本 示例：V1.0 |
| currency | string | 否 | 原币id 示例：1676384430742044707 |
| exchRateDate | string | 否 | 汇率日期 示例：2023-03-24 00:00:00 |
| pubts | string | 否 | 时间戳 示例：2023-03-24 13:53:35 |
| isFlowCoreBill | long | 否 | 是否流程核心单据 示例：0 |
| createDate | string | 否 | 创建日期 示例：2023-03-24 13:53:35 |
| sourceid | long | 否 | 上游单据主表id 示例：1687382665170255872 |
| creator | string | 否 | 创建人 示例：yonyou2023test |
| currency_name | string | 否 | 原币名称 示例：人民币 |
| discountMoney | BigDecimal | 否 | 整单扣额 示例：0 |
| retailInvestors | boolean | 否 | 是否散户 true 是 false 否 示例：false |
| bdInvoiceTypeCode | string | 否 | 发票类型编码 示例：1 |
| receiverCustId_name | string | 否 | 收货客户名称 示例：自动化_内部交易客户 |
| exchangeRateType | object | 否 | 汇率类型 |
| createTime | string | 否 | 创建时间 示例：2023-03-24 13:53:35 |
| upcode | string | 否 | 来源单据编码 示例：QbOJ-000000000-20230324-000003 |
| receiverCustId | long | 否 | 收货客户id 示例：1676883402867867665 |
| bizFlow_name | string | 否 | 流程名称 示例：普通销售（有发货） |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"currency_priceDigit": 2,
		"invAgentId": 1676883402867867665,
		"agentContacts": "刘德华",
		"source": "voucher_order",
		"saleAreaId": 1684471656581431298,
		"natCurrency": "1676384430742044707",
		"invoiceTitleType": 0,
		"bdInvoiceTypeName": "增值税电子普通发票",
		"modifyInvoiceType": true,
		"invoiceType": 3,
		"id": 1687382819789078528,
		"invoiceTitle": "加气枪",
		"orgName": "自动化_普通组织",
		"bdInvoiceTypeId": 1,
		"settlementDetails": [
			{
				"saleOrgId": "1676478249989832710",
				"discountRate": 100,
				"oriTax": 23.01,
				"orderId": 1687382665170255872,
				"firstsource": "voucher_order",
				"firstupcode": "QbOJ-000000000-20230324-000003",
				"natTax": 23.01,
				"source": "voucher_order",
				"subQty": 100,
				"closedRowCount": 0,
				"productName": "自动化_普通物料",
				"taxItems": "13%增值税税率",
				"lineDiscountMoney": 0,
				"model": "12312",
				"id": 1687382819789078529,
				"chargeUnitName": "千克",
				"mainid": 1687382819789078528,
				"firstlineno": 10,
				"calBase": "1",
				"lineAgentId": 1676883402867867665,
				"skuId": 1676883136579895321,
				"orderNo": "QbOJ-000000000-20230324-000003",
				"productId": 1676883136579895296,
				"unitName": "千克",
				"orderDetailLineno": 10,
				"oriUnitPrice": 1.77,
				"natSum": 200,
				"taxCode": "VATR1",
				"isScrap": false,
				"rebateMoney": 0,
				"invProductType": "SALE",
				"modelDescription": "41231",
				"taxRate": 13,
				"chargeUnitId": 1676882835932184587,
				"productAuxUnitName": "千克",
				"taxId": "10004",
				"qty": 100,
				"lineAgentId_name": "自动化_内部交易客户",
				"saleUserName": "李四",
				"oriTaxUnitPrice": 2,
				"saleOrgId_name": "自动化_普通组织",
				"oriMoney": 176.99,
				"invExchRate": 1,
				"productAuxUnitId": 1676882835932184587,
				"saleUserId": "1676509843784466434",
				"unitExchangeTypePrice": 0,
				"skuCode": "WLFL000001",
				"natUnitPrice": 1.77,
				"isUpdateCost": false,
				"firstsourceautoid": 1687382665170255873,
				"skuName": "自动化_普通物料",
				"stockName": "自动化_普通仓库",
				"invPriceExchRate": 1,
				"unitId": 234134123412341,
				"firstsourceid": 1687382665170255872,
				"stockOrgName": "自动化_普通组织",
				"pubts": "2023-03-24 13:53:35",
				"sourceid": 1687382665170255872,
				"oriSum": 200,
				"salePrice": 0,
				"saleCost": 0,
				"saleDeptId": "1676503006181326854",
				"unitExchangeType": 0,
				"saleDeptName": "RPA主部门",
				"cashRebateMoney": 0,
				"orderDetailId": 1687382665170255873,
				"receiverCustId_name": "自动化_内部交易客户",
				"sourceautoid": 1687382665170255873,
				"lineno": 10,
				"productCode": "WLFL000001",
				"invExchRateNum": 1,
				"invExchRateDen": 1,
				"priceQty": 100,
				"taxIssuedDiscountline": false,
				"upcode": "QbOJ-000000000-20230324-000003",
				"receiverCustId": 1676883402867867665,
				"stockId": 1676884339170738180,
				"uplineno": 10,
				"stockOrgId": "1676478249989832710",
				"natTaxUnitPrice": 2,
				"priceMark": true,
				"natMoney": 176.99,
				"invPriceExchRateNum": 1,
				"invPriceExchRateDen": 1
			}
		],
		"agentName": "自动化_内部交易客户",
		"checkByRevenueManagement": false,
		"costBillNoType": "voucher_saleinvoice",
		"agentRelationId": 1676883402867867692,
		"barCode": "voucher_order|1687382665170255872",
		"wholeDiscountRate": 100,
		"receievInvoiceMobile": "18596523322",
		"natCurrency_moneyDigit": 2,
		"natCurrency_priceDigit": 2,
		"invAgentTaxNo": "123456789032156",
		"invAgentName": "自动化_内部交易客户",
		"status": 0,
		"currency_moneyDigit": 2,
		"agentId": 1676883402867867665,
		"agentContactsTel": "18888888888",
		"creatorId": 1676382145806860291,
		"bizFlow": "f9ee154d-be63-11ed-ade5-b8cef6da5712",
		"exchRate": 1,
		"orgId": "1676478249989832710",
		"vouchdate": "2023-03-24 00:00:00",
		"natCurrency_name": "人民币",
		"saleAreaId_name": "大大大",
		"bizFlow_version": "V1.0",
		"currency": "1676384430742044707",
		"exchRateDate": "2023-03-24 00:00:00",
		"pubts": "2023-03-24 13:53:35",
		"isFlowCoreBill": 0,
		"createDate": "2023-03-24 13:53:35",
		"sourceid": 1687382665170255872,
		"creator": "yonyou2023test",
		"currency_name": "人民币",
		"discountMoney": 0,
		"retailInvestors": false,
		"bdInvoiceTypeCode": "1",
		"receiverCustId_name": "自动化_内部交易客户",
		"exchangeRateType": {
			"name": "基准汇率"
		},
		"createTime": "2023-03-24 13:53:35",
		"upcode": "QbOJ-000000000-20230324-000003",
		"receiverCustId": 1676883402867867665,
		"bizFlow_name": "普通销售（有发货）"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	该单据已经被删除或者没有权限	请检查传入参数正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

更新

请求说明

新增

返回参数 (4)

更新

返回参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

