---
title: "销售报价单个保存"
apiId: "27ee85af811747138a5370394d70ebac"
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

# 销售报价单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Quotation (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/quote/salesquotation/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 销售订单[quote.quotation.SalesQuotation] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| salesOrgId | string | 否 | 是 | 销售组织，传id或者code 示例：2352669639348480 |
| vouchdate | string | 否 | 是 | 单据日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-02-21 00:00:00 |
| code | string | 否 | 否 | 单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输；修改时必传 示例：BJD20220221000007 |
| name | string | 否 | 否 | 销售报价名称 示例：API测试报价 |
| transactionTypeId | string | 否 | 是 | 交易类型，传id或者code 示例：2351874939490562 |
| shippingChoiceId | string | 否 | 否 | 发运方式,传id或code 示例：2247184964505856 |
| invoiceAgentId | string | 否 | 否 | 开票客户，传id或code 示例：2219081455980800 |
| receiveContacterPhone | string | 否 | 否 | 客户联系电话 示例：13146392911 |
| validityDateBegin | string | 否 | 是 | 价格开始有效期,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-02-21 00:00:00 |
| validityDateEnd | string | 否 | 是 | 价格结束有效期,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-02-28 00:00:00 |
| saleDepartmentId | string | 否 | 否 | 销售部门, 可传id或code 示例：2213502336127232 |
| agentId | string | 否 | 是 | 客户,传id或者code 示例：2353231358169344 |
| saleArea | string | 否 | 否 | 销售区域,传ID或者code 示例：235323135816935 |
| receiveAgreementId | string | 否 | 否 | 收款协议,传ID或者CODE 示例：253698541263254 |
| corpContact | string | 否 | 否 | 报价员，传id或code 示例：2246286450102528 |
| currencyPk | string | 否 | 是 | 币种，传id或者code 示例：2351874939032064 |
| natCurrencyPk | string | 否 | 是 | 本币，传id或者code 示例：2351874939032064 |
| exchangeRateType | string | 否 | 是 | 汇率类型，传id或者code 示例：2351874941506048 |
| exchRateDate | string | 否 | 否 | 汇率日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2022-02-21 00:00:00 |
| exchRate | BigDecimal | 否 | 否 | 汇率，(与汇率类型同时传则以汇率为准；若币种和本币一样汇率只能传1) 示例：1 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1 |
| receiver | string | 否 | 否 | 收货人 示例：哈哈 |
| bankName | string | 否 | 否 | 开户银行 示例：中国工商银行 |
| subBankName | string | 否 | 否 | 开户支行 示例：中国工商银行股份有限公司濮阳兴工支行 |
| bankAccount | string | 否 | 否 | 开户账号 示例：3654645645 |
| receiveContacter | string | 否 | 否 | 客户联系人 示例：张三 |
| invoiceTitle | string | 否 | 否 | 发票抬头 示例：腾讯视频 |
| invoiceAddress | string | 否 | 否 | 营业地址 示例：北京市石景山区 |
| invoiceTelephone | string | 否 | 否 | 营业电话 示例：010-1110123 |
| taxNum | string | 否 | 否 | 纳税识别号 示例：2323232 |
| invoiceTitleType | string | 否 | 否 | 抬头类型，0:企业，1:个人，2:非营利组织 示例：0 |
| invoiceUpcType | string | 否 | 否 | 发票类型,枚举,{0:收据,1:增值税专用发票,2:增值税普通发票,3:增值税电子普通发票,4:机动车销售销售统一发票,5:增值税电子普通发票(成品油),6:增值税普通发票(成品油),7:增值税专用发票(成品油),8:电子收购发票,9:增值税电子专用发票,10:电子发票（增值税专用发票）,11:电子发票（普通发票）,12:数电纸质发票(增值税专用发票),13:数电纸质发票(普通发票)}(与invoiceTypeId同时使用时，以invoiceTypeId为准) 示例：0 |
| invoiceTypeId | string | 否 | 否 | 发票类型, 可查“发票类型”档案，填写对应编码值(与invoiceUpcType同时使用时，以invoiceTypeId为准) 示例：4 |
| receievInvoiceEmail | string | 否 | 否 | 收票邮箱 示例：100000@qq.com |
| receievInvoiceMobile | string | 否 | 否 | 收票手机号 示例：18810182905 |
| purchasePo | string | 否 | 否 | 客户采购PO号 示例：8372932399 |
| memo | string | 否 | 否 | 备注 示例：报价草稿 |
| modifyInvoiceType | boolean | 否 | 否 | 发票类型可改, true:是、false:否 示例：true |
| orderPayType | string | 否 | 否 | 支付方式, FIRSTPAY:款到发货、FIRSTDELIVER:其他 示例：FIRSTDELIVER |
| settlement | string | 否 | 否 | 结算方式，传id或者code 示例：2213355414294791 |
| receiveAddress | string | 否 | 否 | 收货地址 示例：北京市石景山区 |
| receiveMobile | string | 否 | 否 | 收货电话 示例：010-1110123 |
| totalDiscountSum | BigDecimal | 否 | 否 | 折扣总额 示例：0 |
| totalDiscountRate | BigDecimal | 否 | 否 | 整单扣率% 示例：100 |
| defines | object | 否 | 否 | 表头自定义项(1-60) |
| frees | object | 否 | 否 | 表头自由自定义项(1-60) |
| childs | object | 是 | 是 | 销售报价子表[quote.quotation.SalesQuotationDetail] |
| _status | string | 否 | 是 | 操作标识, Insert:新增（目前只支持新增保存） 示例：Insert 默认值：Insert |
| signSubjects | object | 是 | 否 | 合同签署主体[quote.quotation.SignSubject] |

## 3. 请求示例

Url: /yonbip/sd/quote/salesquotation/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"salesOrgId": "2352669639348480",
		"vouchdate": "2022-02-21 00:00:00",
		"code": "BJD20220221000007",
		"name": "API测试报价",
		"transactionTypeId": "2351874939490562",
		"shippingChoiceId": "2247184964505856",
		"invoiceAgentId": "2219081455980800",
		"receiveContacterPhone": "13146392911",
		"validityDateBegin": "2022-02-21 00:00:00",
		"validityDateEnd": "2022-02-28 00:00:00",
		"saleDepartmentId": "2213502336127232",
		"agentId": "2353231358169344",
		"saleArea": "235323135816935",
		"receiveAgreementId": "253698541263254",
		"corpContact": "2246286450102528",
		"currencyPk": "2351874939032064",
		"natCurrencyPk": "2351874939032064",
		"exchangeRateType": "2351874941506048",
		"exchRateDate": "2022-02-21 00:00:00",
		"exchRate": 1,
		"exchRateOps": 1,
		"receiver": "哈哈",
		"bankName": "中国工商银行",
		"subBankName": "中国工商银行股份有限公司濮阳兴工支行",
		"bankAccount": "3654645645",
		"receiveContacter": "张三",
		"invoiceTitle": "腾讯视频",
		"invoiceAddress": "北京市石景山区",
		"invoiceTelephone": "010-1110123",
		"taxNum": "2323232",
		"invoiceTitleType": "0",
		"invoiceUpcType": "0",
		"invoiceTypeId": "4",
		"receievInvoiceEmail": "100000@qq.com",
		"receievInvoiceMobile": "18810182905",
		"purchasePo": "8372932399",
		"memo": "报价草稿",
		"modifyInvoiceType": true,
		"orderPayType": "FIRSTDELIVER",
		"settlement": "2213355414294791",
		"receiveAddress": "北京市石景山区",
		"receiveMobile": "010-1110123",
		"totalDiscountSum": 0,
		"totalDiscountRate": 100,
		"defines": {
			"define1": "",
			"define2": ""
		},
		"frees": {
			"define1": "",
			"define2": ""
		},
		"childs": [
			{
				"discountRate": 100,
				"subQty": 50,
				"skuId": "2216036636709121",
				"productId": "2353235008721152",
				"stockId": "2231779412251136",
				"projectId": "1617778966311469058",
				"oriUnitPrice": 44.2478,
				"natSum": 2500,
				"masterUnitId": 2352410771869952,
				"qty": 50,
				"oriTaxUnitPrice": 50,
				"settlementOrgId": "2352669639348480",
				"oriMoney": 2212.39,
				"invExchRate": 1,
				"natUnitPrice": 44.2478,
				"taxcCodeId": "2351874942145024",
				"masterUnitId_precision": "2",
				"discountSum": 0,
				"invPriceExchRate": 1,
				"quoteDate": "2022-02-21 17:30:50",
				"cqtUnitId": "2352410771869952",
				"saleunitId": "2352410771869952",
				"cqtUnitId_precision": "2",
				"oriSum": 2500,
				"priceMark": 0,
				"discountNatSum": 0,
				"priceQty": 50,
				"stockOrgId": "2352669639348480",
				"natTaxUnitPrice": 50,
				"natMoney": 2212.39,
				"basicQuotation": 15,
				"basicQuotationMoney": 16,
				"quotationDeductionRate": 17,
				"quotationDeduction": 18,
				"lowestSellinePrice": 19,
				"antiDumpingWarning": 0,
				"forecastDeliveryDay": 2,
				"forecastRebatePriceSum": 2,
				"forecastCBPriceSum": 13,
				"forecastCommissionPrice": 4,
				"forecastCBPrice": 13,
				"forecastCostPriceSum": 13,
				"forecastCostPrice": 13,
				"overloadRate": 20,
				"memo": "API测试",
				"defines": {
					"define1": "",
					"define2": ""
				},
				"frees": {
					"define1": "",
					"define2": ""
				},
				"productType": "SALE",
				"invExchRateNum": 0,
				"invExchRateDen": 0,
				"invPriceExchRateNum": 0,
				"invPriceExchRateDen": 0
			}
		],
		"_status": "Insert",
		"signSubjects": [
			{
				"signOrder": 10,
				"signSubjectType": 1,
				"signOrgId": "2298190279606272008",
				"address": "北京",
				"postalCode": "473000",
				"telephone": "",
				"facsimile": "",
				"bankOfDeposit": "",
				"bankAccount": "",
				"memo": "",
				"isOriginator": "",
				"isDefault": ""
			}
		]
	}
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回描述 示例：操作成功 |
| data | object | 否 | 销售报价数据 |
| id | long | 否 | 销售报价ID 示例：2658073001169152 |
| salesOrgId_name | string | 否 | 销售组织 示例：西单商城 |
| transactionTypeId_name | string | 否 | 报价类型 示例：一般报价 |
| pubts | string | 否 | 时间戳 示例：2022-02-22 10:27:18 |
| salesOrgId | string | 否 | 销售组织 示例：2352669639348480 |
| vouchdate | string | 否 | 单据日期 示例：2022-02-21 00:00:00 |
| name | string | 否 | 销售报价名称 示例：API测试报价 |
| transactionTypeId | string | 否 | 报价类型id 示例：2351874939490562 |
| agentId_name | string | 否 | 客户 示例：商家01 |
| receiveContacterPhone | string | 否 | 客户联系电话 示例：13146392911 |
| currency_name | string | 否 | 币种 示例：人民币 |
| quoteStatus | long | 否 | 报价状态，0:开立、1:已审核、2:关闭、3:审核中、4:驳回、5:生效、6:取消、7:作废、8:已失效 示例：0 |
| validityDateBegin | string | 否 | 价格有效期开始 示例：2022-02-21 00:00:00 |
| status | long | 否 | 单据状态，0:开立、1:已审核、2:已关闭、3:审核中、4:锁定 示例：0 |
| validityDateEnd | string | 否 | 价格有效期结束 示例：2022-02-28 00:00:00 |
| changestatus | long | 否 | 变更状态，0:不可变更、1:可变更、2:可变更、3:生效、4:原单已关闭 示例：0 |
| agentId | long | 否 | 客户id 示例：2353231358169344 |
| saleArea | long | 否 | 销售区域ID 示例：2351874939032065 |
| currency | string | 否 | 原币pk 示例：2351874939032064 |
| currency_code | string | 否 | 原币简称 示例：CNY |
| natCurrency | string | 否 | 本币pk 示例：2351874939032064 |
| natCurrency_code | string | 否 | 本币简称 示例：CNY |
| natCurrency_name | string | 否 | 本币 示例：人民币 |
| exchangeRateType | string | 否 | 汇率类型Id 示例：2351874941506048 |
| exchangeRateType_name | string | 否 | 汇率类型 示例：用户自定义汇率 |
| exchRateDate | string | 否 | 汇率日期 示例：2022-02-21 00:00:00 |
| exchangeRateType_digit | long | 否 | 汇率精度 示例：6 |
| exchRate | long | 否 | 汇率 示例：1 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 汇率折算方式 示例：1 |
| isWfControlled | boolean | 否 | 是否审批流控制，true:是、false:否 示例：true |
| verifystate | long | 否 | 审批状态，0:初始开立、1:审批中、2:审批完成、3:不通过流程终止、4:驳回到制单 示例：0 |
| createTime | string | 否 | 创建时间 示例：2022-02-21 17:31:41 |
| createDate | string | 否 | 创建日期 示例：2022-02-21 00:00:00 |
| openDate | string | 否 | 创建开立日期 示例：2022-02-22 10:27:18 |
| receiver | string | 否 | 收货人 示例：哈哈 |
| invoiceTypeId | string | 否 | 发票类型id 示例：5 |
| invoiceTypeIdCode | string | 否 | 发票类型编码 示例：4 |
| invoiceUpcType | string | 否 | 发票类型枚举 |
| invoiceTypeIdName | string | 否 | 发票类型名称 示例：增值税普通发票 |
| invoiceAgentId | long | 否 | 开票客户id 示例：2353231358169344 |
| modifyInvoiceType | boolean | 否 | 发票类型可改，true:是、false:否 示例：true |
| defines | object | 否 | 表头固定自定义项 |
| ctTplId | string | 否 | 合同模板id 示例：2303248986597752832 |
| frees | object | 否 | 表头自由自定义项 |
| orderPayType | string | 否 | 支付方式, FIRSTPAY:款到发货、FIRSTDELIVER:其他 示例：FIRSTDELIVER |
| childs | object | 是 | 销售报价子表集合 |
| code | string | 否 | 销售报价编码 示例：BJD20220221000007 |
| signFileId | string | 否 | 待签署合同文件 示例：5d23492c-e4b4-4e18-af14-e69c21592f17 |
| signSubjects | object | 是 | 合同签署主体[quote.quotation.SignSubject] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2658073001169152,
		"salesOrgId_name": "西单商城",
		"transactionTypeId_name": "一般报价",
		"pubts": "2022-02-22 10:27:18",
		"salesOrgId": "2352669639348480",
		"vouchdate": "2022-02-21 00:00:00",
		"name": "API测试报价",
		"transactionTypeId": "2351874939490562",
		"agentId_name": "商家01",
		"receiveContacterPhone": "13146392911",
		"currency_name": "人民币",
		"quoteStatus": 0,
		"validityDateBegin": "2022-02-21 00:00:00",
		"status": 0,
		"validityDateEnd": "2022-02-28 00:00:00",
		"changestatus": 0,
		"agentId": 2353231358169344,
		"saleArea": 2351874939032065,
		"currency": "2351874939032064",
		"currency_code": "CNY",
		"natCurrency": "2351874939032064",
		"natCurrency_code": "CNY",
		"natCurrency_name": "人民币",
		"exchangeRateType": "2351874941506048",
		"exchangeRateType_name": "用户自定义汇率",
		"exchRateDate": "2022-02-21 00:00:00",
		"exchangeRateType_digit": 6,
		"exchRate": 1,
		"exchRateOps": 1,
		"isWfControlled": true,
		"verifystate": 0,
		"createTime": "2022-02-21 17:31:41",
		"createDate": "2022-02-21 00:00:00",
		"openDate": "2022-02-22 10:27:18",
		"receiver": "哈哈",
		"invoiceTypeId": "5",
		"invoiceTypeIdCode": "4",
		"invoiceUpcType": "",
		"invoiceTypeIdName": "增值税普通发票",
		"invoiceAgentId": 2353231358169344,
		"modifyInvoiceType": true,
		"defines": {
			"id": 2701231232321321,
			"define1": "测试1固定",
			"tenant": 2351873187860736
		},
		"ctTplId": "2303248986597752832",
		"frees": {
			"id": 27012922882888,
			"define1": "自由测试1",
			"tenant": 2351873187860736
		},
		"orderPayType": "FIRSTDELIVER",
		"childs": [
			{
				"defines": {
					"id": 0,
					"define1": "表体测试1",
					"tenant": 2351873187860736
				},
				"frees": {
					"id": 235123121871231,
					"define1": "测试0000",
					"tenant": 2351873187860736
				},
				"discountRate": 100,
				"skuId_code": "000003",
				"oriTax": 287.61,
				"natTax": 287.61,
				"subQty": 50,
				"masterUnitId_name": "件",
				"cqtUnitId_name": "件",
				"settlementOrgId_name": "西单商城",
				"saleunitId_precision": "2",
				"projectId": "1617778966311469058",
				"projectId_name": "一季度施工001",
				"id": 2658073001169153,
				"skuId": 2353235022893312,
				"productId_code": "000003",
				"productId": 2353235008721152,
				"exclusiveTaxQuotation": 15,
				"quotationId": 2658073001169152,
				"oriUnitPrice": 44.2478,
				"natSum": 2500,
				"taxRate": 13,
				"masterUnitId": 2352410771869952,
				"quotationExclusiveTaxMoney": 2,
				"basicQuotation": 15,
				"basicQuotationMoney": 16,
				"quotationDeductionRate": 17,
				"quotationDeduction": 18,
				"lowestSellinePrice": 19,
				"qty": 50,
				"oriTaxUnitPrice": 50,
				"settlementOrgId": "2352669639348480",
				"saleunitId_name": "件",
				"oriMoney": 2212.39,
				"invExchRate": 1,
				"natUnitPrice": 44.2478,
				"masterUnitId_precision": "2",
				"productId_name": "取价01",
				"taxcCodeId": "2351874942145024",
				"discountSum": 0,
				"invPriceExchRate": 1,
				"cqtUnitExchangeType": 0,
				"quoteDate": "2022-02-21 17:30:50",
				"cqtUnitId": 2352410771869952,
				"saleunitId": 2352410771869952,
				"rowno": 10,
				"cqtUnitId_precision": "2",
				"oriSum": 2500,
				"skuId_name": "取价01",
				"saleUnitExchangeType": 0,
				"discountNatSum": 0,
				"priceQty": 50,
				"stockOrgId": "2352669639348480",
				"natTaxUnitPrice": 50,
				"priceMark": 0,
				"natMoney": 2212.39,
				"totalPushSactQty": 0,
				"stockOrgId_name": "西单商城",
				"overloadRate": 0,
				"memo": "API测试",
				"invExchRateNum": 1,
				"invExchRateDen": 1,
				"invPriceExchRateNum": 1,
				"invPriceExchRateDen": 1
			}
		],
		"code": "BJD20220221000007",
		"signFileId": "5d23492c-e4b4-4e18-af14-e69c21592f17",
		"signSubjects": [
			{
				"id": "",
				"mainid": "",
				"signOrder": "",
				"signSubjectType": "",
				"signOrgId": "",
				"address": "",
				"postalCode": "",
				"telephone": "",
				"facsimile": "",
				"bankOfDeposit": "",
				"bankAccount": "",
				"memo": "",
				"isOriginator": "",
				"isDefault": ""
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

1	2026-04-28

更新

请求参数 postalCode

2	2026-03-05

更新

请求说明

新增

请求参数 (18)

更新

请求参数 (18)

新增

返回参数 (22)

更新

返回参数 (13)

电子签修改


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

