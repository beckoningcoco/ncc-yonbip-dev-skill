---
title: "销售报价单列表查询"
apiId: "c9ad78c817dd438aa4f41435fcd2bf87"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Quotation"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Quotation]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售报价单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Quotation (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/quote/salesquotation/list

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
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 默认值：10 |
| code | string | 否 | 否 | 报价编号 示例：BJD20220214000017 |
| salesOrg | string | 否 | 否 | 销售组织id 示例：2581272313746432 |
| salesOrg_code | string | 否 | 否 | 销售组织编码 示例：GYT001 |
| vouchdate_begin | string | 否 | 否 | 单据日期开始日期，，格式为:yyyy-MM-dd 示例：2022-02-01 |
| vouchdate_end | string | 否 | 否 | 单据日期结束日期，格式为:yyyy-MM-dd 示例：2022-02-12 |
| transactionType | string | 否 | 否 | 报价类型id 示例：2351874939490562 |
| transactionType_code | string | 否 | 否 | 报价类型编码 示例：QUOTE-001 |
| quoteStatus | string | 否 | 否 | 报价状态，0:开立,1:已审核,2:关闭,3:审核中,5:生效,8:已失效 示例：0 |
| agent | string | 否 | 否 | 客户id 示例：2582623828120832 |
| agent_code | string | 否 | 否 | 客户编码 示例：SHkh001 |
| product | string | 否 | 否 | 物料id 示例：2581270376699136 |
| product_code | string | 否 | 否 | 物料编码 示例：LJXLH1001 |
| invoiceTypeId | string | 否 | 否 | 发票类型id 示例：0 |
| invoiceTypeIdCode | string | 否 | 否 | 发票类型编码 示例：0 |
| settlementOrg | string | 否 | 否 | 开票组织id 示例：2352669639348480 |
| settlementOrg_code | string | 否 | 否 | 开票组织编码 示例：AAA |
| isSum | boolean | 否 | 否 | 查询表头或表头+明细，默认true查询表头，false查询表头+明细 示例：true 默认值：true |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或)，当使用conditions查询条件时必填 示例：and |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/sd/quote/salesquotation/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "BJD20220214000017",
	"salesOrg": "2581272313746432",
	"salesOrg_code": "GYT001",
	"vouchdate_begin": "2022-02-01",
	"vouchdate_end": "2022-02-12",
	"transactionType": "2351874939490562",
	"transactionType_code": "QUOTE-001",
	"quoteStatus": "0",
	"agent": "2582623828120832",
	"agent_code": "SHkh001",
	"product": "2581270376699136",
	"product_code": "LJXLH1001",
	"invoiceTypeId": "0",
	"invoiceTypeIdCode": "0",
	"settlementOrg": "2352669639348480",
	"settlementOrg_code": "AAA",
	"isSum": true,
	"simpleVOs": [
		{
			"logicOp": "and",
			"conditions": [
				{
					"field": "pubts",
					"op": "eq",
					"value1": "2022-02-18 10:48:15",
					"value2": ""
				}
			]
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用成功时返回的信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| pageSize | int | 否 | 分页大小 示例：10 |
| recordCount | int | 否 | 总记录数 示例：3 |
| recordList | object | 是 | 返回的数据列表 |
| sumRecordList | object | 是 | 汇总结果对象 |
| pageCount | int | 否 | 总页数 示例：1 |
| beginPageIndex | int | 否 | 开始页 示例：1 |
| endPageIndex | int | 否 | 结束页 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 3,
		"recordList": [
			{
				"receiveContacter": "刘非",
				"memo": "备注",
				"childs_saleunitId_precision": 2,
				"natCurrency": "2155547424560384",
				"childs_masterUnitId_precision": 2,
				"quoteTableTotalMoney": 0,
				"id": 2652327014961664,
				"childs_cqtUnitId": 2261946919473408,
				"childs_natTaxUnitPrice": 1455,
				"agentId_name": "中央大客户工信部",
				"childs_productClass_code": "商品分类编码1",
				"childs_priceQty": 1000,
				"childs_productId_code": "物料分类000003",
				"corpContact": "2192006489690368",
				"childs_productClass": 2192109930991872,
				"childs_productId": 2323920840298752,
				"childs_quoteSalePrice": 0,
				"isWfControlled": false,
				"childs_masterUnitId_name": "m",
				"corpContactUserName": "刘预发",
				"auditorId": "2192008994279680",
				"childs_taxRate": 5,
				"auditTime": "2022-02-17 16:46:25",
				"natCurrency_priceDigit": 6,
				"childs_natMoney": 1385714.285714,
				"childs_discountRate": 100,
				"status": 1,
				"verifystate": 0,
				"currency_moneyDigit": 6,
				"auditorId_name": "刘预发",
				"childs_productId_model": "型号",
				"vouchdate": "2022-02-17 00:00:00",
				"childs_favorableRate": 0,
				"natCurrency_name": "人民币",
				"exchangeRateType": "2351874941506048",
				"exchangeRateType_name": "基准汇率",
				"exchRateDate": "2022-01-25 00:00:00",
				"quotePersonId": 2192008994279680,
				"currency": "2155547424560384",
				"childs_settlementOrgId": "2163951720681984",
				"pubts": "2022-02-17 16:46:26",
				"childs_saleunitId": 2261947121029376,
				"childs_natUnitPrice": 1385.714286,
				"transactionTypeId": "2166791274991872",
				"childs_oriSum": 1455000,
				"childs_skuId_model": "型号",
				"childs_discountNatSum": 0,
				"childs_skuId_name": "带批次号-有效期-浮动换算的物料",
				"transactionTypeId_code": "QUOTE-001",
				"childs_masterUnitId": 2261946919473408,
				"childs_subQty": 1,
				"childs_projectId_code": "ADF321",
				"childs_projectId_name": "一季度施工001",
				"childs_projectId": "1617778966311469058",
				"transactionTypeId_name": "一般报价",
				"childs_skuId_code": "物料分类000003",
				"childs_productClass_name": "商品分类名称1",
				"currency_priceDigit": 6,
				"childs_oriUnitPrice": 1385.714286,
				"childs_saleunitId_name": "km",
				"childs_qty": 1000,
				"receiveContacterPhone": "18888",
				"autoCheckDate": "2022-02-17 00:00:00",
				"childs_skuId": 2323920848457984,
				"childs_discountSum": 0,
				"totalDiscountSum": 0,
				"totalDiscountRate": 200,
				"natCurrency_moneyDigit": 6,
				"childs_productId_modelDescription": "规格",
				"name": "报价名称",
				"childs_oriTaxUnitPrice": 1455,
				"childs_cqtUnitId_precision": 2,
				"natCurrency_code": "CNY",
				"wholeFavorableRate": 0,
				"childs_oriMoney": 1385714.285714,
				"childs_cqtUnitId_name": "m",
				"agentId": 2216247878177024,
				"code": "BJD20220217000002",
				"childs_productId_name": "带批次号-有效期-浮动换算的物料",
				"quotePersonId_name": "刘预发接口测试员工",
				"exchRate": 1,
				"quoteStatus": "1",
				"validityDateEnd": "2022-02-20 00:00:00",
				"isPotential": false,
				"childs_id": 2652327014961665,
				"currency_name": "人民币",
				"childs_natSum": 1455000,
				"childs_totalPushSactQty": 12,
				"childs_totalPushSaleQty": 8,
				"variantconfigctsVersion": "V1.0",
				"variantconfigctsCode": "XP_20240628001",
				"optionalType": "0",
				"optionalQuotationId": 2012359853873823747,
				"variantconfigctsId": 2012359853873823750,
				"optionalQuotationIdCode": "XPBJ_202406002",
				"variantConfiguration": 2024981714794184714,
				"childs_forecastCBPrice": 33.33,
				"childs_forecastCBPriceSum": 99.99,
				"childs_costCurrency_name": "人民币",
				"childs_costCurrency": 1525643705855773169,
				"childs_settlementOrgId_name": "中国电信全职能组织",
				"childs_skuId_modelDescription": "规格",
				"validityDateBegin": "2022-02-17 00:00:00",
				"openDate": "2022-02-17 00:00:00",
				"childs_priceMark": "0",
				"exclusiveTaxQuotation": 15,
				"childs_quotationExclusiveTaxMoney": 20,
				"childs_basicQuotation": 15,
				"childs_basicQuotationMoney": 16,
				"childs_quotationDeductionRate": 17,
				"childs_quotationDeduction": 18,
				"childs_lowestSellinePrice": 19,
				"salesOrgId_name": "中国电信全职能组织",
				"salesOrgId": "2163951720681984",
				"invoiceTypeId": "",
				"invoiceTypeIdCode": "",
				"childs_cusFavorableRate": 0,
				"invoiceTypeIdName": "收据",
				"childs_quoteSaleCost": 0,
				"frees": {
					"define": "",
					"id": ""
				}
			}
		],
		"sumRecordList": [
			{
				"totalDiscountSum": 0,
				"childs_oriSum": 1455002,
				"quoteTableTotalMoney": 0,
				"childs_qty": 1010.66,
				"childs_oriTaxUnitPrice": 1655,
				"childs_totalPushSactQty": 80,
				"childs_totalPushSaleQty": 301
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

