---
title: "销售报价单详情查询"
apiId: "ee125b9e5aac47cfbbc329c0e182f18b"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sales Quotation"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Quotation]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售报价单详情查询

> `ContentType` 请求方式	GET | 分类: Sales Quotation (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/quote/salesquotation/detail

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 否 | 报价单id，报价单id和报价单编码不能同时为空，id和编码同时存在，以id为准    示例: 2264229101637888 |
| code | string | query | 否 | 报价单编码，报价单id和报价单编码不能同时为空，id和编码同时存在，以id为准    示例: BJD20220406000002 |

## 3. 请求示例

Url: /yonbip/sd/quote/salesquotation/detail?access_token=访问令牌&id=2264229101637888&code=BJD20220406000002

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
| transactionTypeId_name | string | 否 | 报价类型 示例：一般报价 |
| shippingChoiceId | long | 否 | 发运方式id 示例：2346428379960648 |
| currency_priceDigit | int | 否 | 原币单价精度 示例：2 |
| totalOriMoney | BigDecimal | 否 | 合计无税金额 示例：0 |
| masterOrgKeyField | string | 否 | 主组织关键属性 示例：salesOrgId |
| receiveContacter | string | 否 | 客户联系人 示例：345353 |
| receievInvoiceMobile | string | 否 | 收票手机号 示例：12312341234 |
| receievInvoiceEmail | string | 否 | 收票邮箱 示例：111@163.com |
| invoiceAddress | string | 否 | 营业地址 示例：北京市昌平区东小口地区 |
| memo | string | 否 | 备注 示例：备注 |
| childs | object | 是 | 返回的报价信息 |
| natCurrency | string | 否 | 本币pk 示例：2364609091195136 |
| invoiceTitleType | string | 否 | 抬头类型，0:企业，1:个人，2:非盈利组织 示例：0 |
| quoteTableTotalMoney | BigDecimal | 否 | 价表总金额 示例：0 |
| receiveContacterPhone | string | 否 | 客户联系电话 示例：4353246234642364 |
| modifyInvoiceType | boolean | 否 | 发票类型可改,true:发票类型可以修改,false:发票类型不可以修改 示例：true |
| id | long | 否 | 报价单id 示例：2657912815178240 |
| saleArea_name | string | 否 | 销售区域 示例：测试区域 |
| agentId_name | string | 否 | 客户 示例：星日星 |
| invoiceTitle | string | 否 | 发票抬头 示例：星日星 |
| bankAccount | string | 否 | 银行账号 示例：111111111111111 |
| exchangeRateType_digit | int | 否 | 汇率精度 示例：6 |
| receiver | string | 否 | 收货人 示例：王二 |
| totalDiscountSum | BigDecimal | 否 | 折扣总额 示例：0 |
| isWfControlled | boolean | 否 | 是否审批流控制,true:受审批流控制,false:不受审批流控制 示例：false |
| receiveAddress | string | 否 | 收货地址 示例：北京市 市辖区 东城区 潇湘路 |
| totalDiscountRate | BigDecimal | 否 | 整单扣率% 示例：100 |
| totalMoney | BigDecimal | 否 | 合计含税金额 示例：0 |
| agentRelationId | long | 否 | 客户交易关系id 示例：2370369477431552 |
| invoiceAgentId | long | 否 | 开票客户id 示例：2370369475350784 |
| quoteExecutes | object | 是 | 报价执行明细 |
| agentId_merchantApplyRanges_isPotential | boolean | 否 | 是否潜客,true:潜客,false:非潜客 示例：false |
| changestatus | short | 否 | 变更状态，0:不可变更，1:可变更，2:变更中，3:生效，4:原单已关闭 示例：0 |
| natCurrency_moneyDigit | int | 否 | 本币金额精度 示例：2 |
| natCurrency_priceDigit | int | 否 | 本币单价精度 示例：2 |
| shippingChoiceId_code | string | 否 | 发运方式编码 示例：system_0001 |
| natCurrency_code | string | 否 | 本币简称 示例：CNY |
| status | short | 否 | 单据状态, 0:未审核，1:已审核，2:已关闭，3:审核中 示例：0 |
| subBankName | string | 否 | 开户支行 示例：招商银行北京支行 |
| currency_moneyDigit | int | 否 | 原币金额精度 示例：2 |
| saleArea | long | 否 | 销售区域id 示例：1467760989938122759 |
| agentId | long | 否 | 客户id 示例：2370369475350784 |
| code | string | 否 | 报价编号 示例：BJD20220221000012 |
| totalParticularlyMoney | BigDecimal | 否 | 特殊优惠 示例：0 |
| creatorId | long | 否 | 创建人ID 示例：2370224694350080 |
| orderPayType | string | 否 | 支付方式, FIRSTPAY:款到发货、FIRSTDELIVER:其他 示例：FIRSTDELIVER |
| quotePersonId_name | string | 否 | 报价人 示例：wangwenfeng |
| exchRate | int | 否 | 汇率 示例：1 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 汇率折算方式 示例：1 |
| bankName | string | 否 | 开户银行 示例：招商银行 |
| settlement_name | string | 否 | 结算方式 示例：现金 |
| quoteStatus | string | 否 | 报价状态，0:开立，1:已审核，2:关闭，3:审核中，5:生效，8:已失效 示例：0 |
| validityDateEnd | string | 否 | 价格有效期结束 示例：2022-02-25 00:00:00 |
| currency_code | string | 否 | 原币简称 示例：CNY |
| settlement | long | 否 | 结算方式id 示例：2466599332237568 |
| vouchdate | string | 否 | 单据日期 示例：2022-02-21 00:00:00 |
| natCurrency_name | string | 否 | 本币 示例：人民币 |
| isPotential | boolean | 否 | 是否潜在客户，true:潜在客户,fasle:非潜在客户 示例：false |
| quotePersonId | long | 否 | 报价人id 示例：2370224694350080 |
| invoiceTelephone | string | 否 | 营业电话 示例：132002363669 |
| shippingChoiceId_name | string | 否 | 发运方式 示例：公路运输-普通 |
| currency | string | 否 | 原币pk 示例：2364609091195136 |
| taxNum | string | 否 | 纳税识别号 示例：7446465546581223 |
| currency_priceRount | int | 否 | 原币单价舍入方式 示例：4 |
| pubts | string | 否 | 时间 示例：2022-02-21 14:51:22 |
| isFlowCoreBill | boolean | 否 | 是否流程核心单据,true:核心单据,false:非核心单据 示例：false |
| createDate | string | 否 | 创建日期 示例：2022-02-21 00:00:00 |
| receiveMobile | string | 否 | 收货电话 示例：18563694561 |
| creator | string | 否 | 制单人 示例：wangwenfeng |
| currency_name | string | 否 | 币种 示例：人民币 |
| invoiceAgentId_name | string | 否 | 开票客户 示例：星日星 |
| transactionTypeId | string | 否 | 报价类型 示例：2364609089589509 |
| transactionTypeId_code | string | 否 | 交易类型编码 示例：QUOTE-001 |
| transTypeKeyField | string | 否 | 交易类型关键属性 示例：transactionTypeId |
| currency_moneyRount | long | 否 | 原币金额舍入方式 示例：4 |
| natCurrency_priceRount | long | 否 | 本币单价舍入方式 示例：4 |
| exchangeRateType | string | 否 | 汇率类型Id 示例：0000KRO9UW4WFX42RO0000 |
| quoteVersion | string | 否 | 变更版本号 示例：V.1 |
| validityDateBegin | string | 否 | 价格有效期开始 示例：2022-02-21 00:00:00 |
| createTime | string | 否 | 创建时间 示例：2022-02-21 14:48:44 |
| exchangeRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| exchRateDate | string | 否 | 汇率日期 示例：2022-02-21 00:00:00 |
| openDate | string | 否 | 开立日期 示例：2022-02-21 00:00:00 |
| invoiceTypeIdName | string | 否 | 发票类型名称(档案) |
| invoiceTypeId | string | 否 | 发票类型ID(档案) |
| invoiceTypeIdCode | string | 否 | 发票类型编码(档案) |
| invoiceUpcType | string | 否 | 发票类型枚举，0:收据;1:增值税专用发票;2:增值税普通发票;3:增值税电子普通发票;4:机动车销售销售统一发票;5:增值税电子普通发票(成品油);6:增值税普通发票(成品油);7:增值税专用发票(成品油);8:电子收购发票;9:增值税电子专用发票 示例：3 |
| totalOriTax | BigDecimal | 否 | 合计税额 示例：0 |
| natCurrency_moneyRount | int | 否 | 本币金额舍入方式 示例：4 |
| salesOrgId_name | string | 否 | 销售组织 示例：卓越者 |
| salesOrgId | string | 否 | 销售组织id 示例：2370216314639360 |
| frees | object | 否 | 表头自由自定义项 |
| defines | object | 否 | 表头固定自定义项 |
| wholeFavorableRate | BigDecimal | 否 | 整单倒扣% 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"transactionTypeId_name": "一般报价",
		"shippingChoiceId": 2346428379960648,
		"currency_priceDigit": 2,
		"totalOriMoney": 0,
		"masterOrgKeyField": "salesOrgId",
		"receiveContacter": "345353",
		"receievInvoiceMobile": "12312341234",
		"receievInvoiceEmail": "111@163.com",
		"invoiceAddress": "北京市昌平区东小口地区",
		"memo": "备注",
		"childs": [
			{
				"discountRate": 100,
				"productClass_name": "饮料",
				"skuId_code": "073103",
				"oriTax": 0,
				"natTax": 0,
				"subQty": 2,
				"masterUnitId_name": "瓶",
				"cqtUnitId_name": "瓶",
				"settlementOrgId_name": "卓越者",
				"saleunitId_precision": 2,
				"projectId_name": "一季度施工001",
				"id": 2657912815194624,
				"productClass_code": "001",
				"skuId": 2370309981606144,
				"productId_code": "073103",
				"variantConfiguration": 2024981714794184714,
				"favorableRate": 0,
				"productClass": 2370267717243136,
				"productId": 2370309971497216,
				"exclusiveTaxQuotation": 15,
				"quoteSalePrice": 0,
				"quotationId": 2657912815178240,
				"oriUnitPrice": 101,
				"natSum": 202,
				"taxRate": 0,
				"idKey": "SQ2592766526263552",
				"masterUnitId": 2370279691358464,
				"quotationExclusiveTaxMoney": 20,
				"basicQuotation": 15,
				"variantconfigctsVersion": "V1.0",
				"basicQuotationMoney": 16,
				"variantconfigctsId": 2012359853873823747,
				"optionalQuotationId": 2012359853873823747,
				"quotationDeductionRate": 17,
				"quotationDeduction": 18,
				"lowestSellinePrice": 19,
				"oriTaxUnitPrice": 101,
				"qty": 2,
				"settlementOrgId": "2370216314639360",
				"saleunitId_name": "瓶",
				"oriMoney": 202,
				"invExchRate": 1,
				"optionalQuotationIdCode": "XPBJ_2024009",
				"projectId": "1617778966311469058",
				"natUnitPrice": 101,
				"forecastCBPrice": 1.6029,
				"masterUnitId_precision": 2,
				"productId_name": "BBBB",
				"variantconfigctsCode": "XP_20240628001",
				"optionalType": "0",
				"forecastCBPriceSum": 0,
				"cusFavorableRate": 0,
				"costCurrency_name": "人民币",
				"costCurrency": 2364609091195136,
				"taxcCodeId": "2364609095323906",
				"discountSum": 0,
				"invExchRateNum": 1,
				"productId_model": "WTD",
				"invPriceExchRate": 1,
				"cqtUnitExchangeType": 0,
				"pubts": "2022-02-21 14:48:45",
				"productType": "SALE",
				"quoteDate": "2022-02-21 14:47:14",
				"cqtUnitId": 2370279691358464,
				"saleunitId": 2370279691358464,
				"rowno": 10,
				"cqtUnitId_precision": 2,
				"oriSum": 202,
				"forecastCostPrice": 0,
				"skuId_model": "WTD",
				"skuId_name": "BBBB",
				"invExchRateDen": 1,
				"saleUnitExchangeType": 0,
				"discountNatSum": 0,
				"priceQty": 2,
				"forecastCostPriceSum": 0,
				"stockOrgId": "2370216314639360",
				"natTaxUnitPrice": 101,
				"priceMark": "0",
				"natMoney": 202,
				"stockOrgId_name": "卓越者",
				"projectId_code": "ADF321",
				"quoteSaleCost": 0,
				"invPriceExchRateNum": 1,
				"invPriceExchRateDen": 1
			}
		],
		"natCurrency": "2364609091195136",
		"invoiceTitleType": "0",
		"quoteTableTotalMoney": 0,
		"receiveContacterPhone": "4353246234642364",
		"modifyInvoiceType": true,
		"id": 2657912815178240,
		"saleArea_name": "测试区域",
		"agentId_name": "星日星",
		"invoiceTitle": "星日星",
		"bankAccount": "111111111111111",
		"exchangeRateType_digit": 6,
		"receiver": "王二",
		"totalDiscountSum": 0,
		"isWfControlled": false,
		"receiveAddress": "北京市 市辖区 东城区 潇湘路",
		"totalDiscountRate": 100,
		"totalMoney": 0,
		"agentRelationId": 2370369477431552,
		"invoiceAgentId": 2370369475350784,
		"quoteExecutes": [
			{
				"quotationDetailId": 2657912815194624,
				"quotationDetailId_qty": 2,
				"quotationId": 2657912815178240,
				"quotationDetailId_skuId_name": "BBBB",
				"quotationDetailId_masterUnitId": 2370279691358464,
				"quotationDetailId_productId_name": "BBBB",
				"totalPushSaleQty": 5,
				"totalPushSactQty": 10,
				"id": 2657912815194624,
				"quotationDetailId_productId": 2370309971497216,
				"quotationDetailId_masterUnitId_name": "瓶",
				"quotationDetailId_masterUnitId_precision": 2,
				"quotationDetailId_skuId": 2370309981606144
			}
		],
		"agentId_merchantApplyRanges_isPotential": false,
		"changestatus": 0,
		"natCurrency_moneyDigit": 2,
		"natCurrency_priceDigit": 2,
		"shippingChoiceId_code": "system_0001",
		"natCurrency_code": "CNY",
		"status": 0,
		"subBankName": "招商银行北京支行",
		"currency_moneyDigit": 2,
		"saleArea": 1467760989938122759,
		"agentId": 2370369475350784,
		"code": "BJD20220221000012",
		"totalParticularlyMoney": 0,
		"creatorId": 2370224694350080,
		"orderPayType": "FIRSTDELIVER",
		"quotePersonId_name": "wangwenfeng",
		"exchRate": 1,
		"exchRateOps": 1,
		"bankName": "招商银行",
		"settlement_name": "现金",
		"quoteStatus": "0",
		"validityDateEnd": "2022-02-25 00:00:00",
		"currency_code": "CNY",
		"settlement": 2466599332237568,
		"vouchdate": "2022-02-21 00:00:00",
		"natCurrency_name": "人民币",
		"isPotential": false,
		"quotePersonId": 2370224694350080,
		"invoiceTelephone": "132002363669",
		"shippingChoiceId_name": "公路运输-普通",
		"currency": "2364609091195136",
		"taxNum": "7446465546581223",
		"currency_priceRount": 4,
		"pubts": "2022-02-21 14:51:22",
		"isFlowCoreBill": false,
		"createDate": "2022-02-21 00:00:00",
		"receiveMobile": "18563694561",
		"creator": "wangwenfeng",
		"currency_name": "人民币",
		"invoiceAgentId_name": "星日星",
		"transactionTypeId": "2364609089589509",
		"transactionTypeId_code": "QUOTE-001",
		"transTypeKeyField": "transactionTypeId",
		"currency_moneyRount": 4,
		"natCurrency_priceRount": 4,
		"exchangeRateType": "0000KRO9UW4WFX42RO0000",
		"quoteVersion": "V.1",
		"validityDateBegin": "2022-02-21 00:00:00",
		"createTime": "2022-02-21 14:48:44",
		"exchangeRateType_name": "基准汇率",
		"exchRateDate": "2022-02-21 00:00:00",
		"openDate": "2022-02-21 00:00:00",
		"invoiceTypeIdName": "",
		"invoiceTypeId": "",
		"invoiceTypeIdCode": "",
		"invoiceUpcType": "3",
		"totalOriTax": 0,
		"natCurrency_moneyRount": 4,
		"salesOrgId_name": "卓越者",
		"salesOrgId": "2370216314639360",
		"frees": {
			"define": "false",
			"id": 2657853049786624
		},
		"defines": {
			"define": "333",
			"id": 2657853049786624
		},
		"wholeFavorableRate": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-05

更新

请求说明

新增

返回参数 (21)

更新

返回参数 (12)

2	2026-01-21

更新

请求说明

新增

返回参数 (5)

更新

返回参数 (12)

换算比分子分母


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

