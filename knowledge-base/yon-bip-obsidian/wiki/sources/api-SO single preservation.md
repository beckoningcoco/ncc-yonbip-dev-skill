---
title: "销售订单单个保存V2"
apiId: "dde3e06ebb8d4119aed9f118e17c2cdd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Order"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/sd/voucherorder/singleSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 销售订单[voucher.order.Order] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| salesOrgId | string | 否 | 是 | 销售组织，传id或者code 示例：2282800216593664 |
| orderPrices!paymentModel | number |
| 小数位数:0,最大长度:8 | 否 | 否 | 收款模式（1：按协议收款，2：按商品明细收款） 示例：1 |
| transactionTypeId | string | 否 | 是 | 交易类型，传id或者code 示例：2291507369660672 |
| vouchdate | string | 否 | 是 | 单据日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-09 00:00:00 |
| code | string | 否 | 否 | 单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输；修改时必传 示例：UO-366420210609000004 |
| agentId | string | 否 | 是 | 客户，传id或者code 示例：2282507926999296 |
| corpContact | string | 否 | 否 | 销售业务员，传id或者code 示例：1123123565864 |
| saleDepartmentId | string | 否 | 否 | 销售部门，传id或者code 示例：3455313215 |
| retailInvestors | boolean | 否 | 否 | 是否散户 示例：false |
| retailAgentName | string | 否 | 否 | 散户名称 示例：abc |
| receiveContacter | string | 否 | 否 | 客户联系人 示例：刘德华 |
| receiveContacterPhone | string | 否 | 否 | 客户联系电话 示例：19877754612 |
| settlementOrgId | string | 否 | 是 | 开票组织，传id或者code 示例：2282800216593664 |
| hopeReceiveDate | string | 否 | 否 | 希望到货日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-28 00:00:00 |
| sendDate | string | 否 | 否 | 计划发货日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-23 00:00:00 |
| source | short | 否 | 否 | 单据来源, 0：PC、1：移动、2：导入、3：ERP、4：OPENAPI、 示例：0 |
| orderDate | string | 否 | 否 | 订单日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-09 11:34:26 |
| bizId | long | 否 | 否 | 商家id 示例：2281151360143616 |
| agentRelationId | long | 否 | 否 | 客户交易关系id 示例：2282800485126656 |
| invoiceMoney | BigDecimal | 否 | 否 | 发票金额 示例：0.0 |
| saleAreaId | string | 否 | 否 | 销售区域id 示例：1231231 |
| mainprojectId | string | 否 | 否 | 项目id，传id或code 示例：432423222 |
| version | long | 否 | 否 | 版本号 示例：0 |
| isWfControlled | boolean | 否 | 否 | 是否审批流控制 示例：false |
| orderPrices!currency | string | 否 | 是 | 币种，传id或者code 示例：2281153755730176 |
| orderPrices!signFileId | string | 否 | 否 | 待签署合同文件的fileId 示例：5d23492c-e4b4-4e18-af14-e69c21592f17 |
| orderPrices!exchRate | BigDecimal | 否 | 是 | 汇率 示例：1.0 |
| orderPrices!exchangeRateType | string | 否 | 是 | 汇率类型，传id或者code 示例：0000KPC165PABLPTS60000 |
| orderPrices!natCurrency | string | 否 | 是 | 本币，传id或者code 示例：2281153755730176 |
| orderPrices!taxInclusive | boolean | 否 | 是 | 单价含税 示例：true |
| creditBalance | string | 否 | 否 | 客户信用余额 示例：0 |
| agentTaxItem | string | 否 | 否 | 客户销项税率ID 示例：123555 |
| lockIn | boolean | 否 | 否 | 单据当前锁状态，true：存在未审核的变更单、false：不存在未审核的变更单 示例：false |
| bmake_voucher_delivery | boolean | 否 | 否 | 流程发货 示例：true |
| bizFlow | string | 否 | 否 | 流程ID 示例：19f1e925-c7fd-11eb-a68a-0624d60000dc |
| bizFlow_version | string | 否 | 否 | 版本信息 示例：V1.0 |
| isFlowCoreBill | boolean | 否 | 否 | 是否流程核心单据 示例：true |
| rebateValidFlag | boolean | 否 | 否 | 返利有效标志 示例：false |
| id | string | 否 | 否 | 订单id，新增时无需填写，修改时必填 |
| receiveId | long | 否 | 否 | 收货人id 示例：2282530502643968 |
| receiveZipCode | string | 否 | 否 | 收货人邮编 示例：010000 |
| receiveTelePhone | string | 否 | 否 | 收货人固定电话 示例：010-7453214 |
| receiver | string | 否 | 否 | 收货人 示例：地址联系我 |
| receiveMobile | string | 否 | 否 | 收货电话 示例：1879936325 |
| receivecode | string | 否 | 否 | 收货地址编码 示例：A111 |
| receiveAddress | string | 否 | 否 | 收货地址 示例：123 |
| orderPayType | string | 否 | 否 | 支付方式, FIRSTPAY:款到发货、FIRSTDELIVER:其他、 示例：FIRSTDELIVER |
| settlement | string | 否 | 否 | 结算方式，传id或者code 示例：月结 |
| shippingChoiceId | string | 否 | 否 | 发运方式， 传id或者code 示例：陆运 |
| invoiceAgentId | string | 否 | 是 | 开票客户，传id或者code 示例：2282507926999296 |
| tradeRouteID | string | 否 | 否 | 贸易路径，传id或者code 示例：1211507111900200 |
| modifyInvoiceType | boolean | 否 | 否 | 发票类型可改, true:是、false:否、 示例：true |
| bdInvoiceTypeId | string | 否 | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:电子发票（增值税专用发票）,32:电子发票（普通发票）,33:数电纸质发票（增值税专用发票）,34:数电纸质发票（普通发票） 示例：0 |
| invoiceUpcType | long | 否 | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票）、12:数电纸质发票（增值税专用发票）、13:数电纸质发票（普通发票） 示例：0 |
| invoiceTitle | string | 否 | 否 | 发票抬头 示例：2 |
| invoiceTitleType | string | 否 | 否 | 抬头类型，0：企业，1：个人，2：非营利组织 示例：1 |
| bankName | string | 否 | 否 | 开户银行 示例：中国工商银行 |
| receievInvoiceMobile | string | 否 | 否 | 收票手机号 |
| receievInvoiceEmail | string | 否 | 否 | 收票邮箱 |
| taxNum | string | 否 | 否 | 纳税识别号 示例：432443243222 |
| subBankName | string | 否 | 否 | 开户支行 示例：中国工商银行股份有限公司濮阳兴工支行 |
| bankAccount | string | 否 | 否 | 银行账号 示例：21474834255322156732 |
| invoiceTelephone | string | 否 | 否 | 营业电话 示例：010-6432121 |
| invoiceAddress | string | 否 | 否 | 营业地址 示例：河南省濮阳市兴区兴工街道66号 |
| promotionMoney | BigDecimal | 否 | 否 | 总优惠金额。可精确到6位小数。 示例：1333 |
| rebateMoney | BigDecimal | 否 | 否 | 折扣返利金额。可精确到6位小数。 示例：1333 |
| rebateCashMoney | BigDecimal | 否 | 否 | 抵现返利金额。可精确到6位小数。 示例：1333 |
| pointsMoney | BigDecimal | 否 | 否 | 积分抵扣金额。可精确到6位小数。 示例：1333 |
| reight | BigDecimal | 否 | 否 | 运费。可精确到6位小数 示例：10 |
| payMoney | BigDecimal | 否 | 是 | 合计含税金额。可精确到6位小数，需等于表体含税金额的合计。 示例：77.28 |
| orderPayMoney | BigDecimal | 否 | 否 | 商品实付金额。可精确到6位小数。 示例：77.28 |
| realMoney | BigDecimal | 否 | 否 | 应收金额，和表头合计含税金额相等，可精确到6位小数。 示例：77.28 |
| orderRealMoney | BigDecimal | 否 | 否 | 商品应付金额。可精确到6位小数。 示例：77.28 |
| orderPrices!totalMoneyOrigTaxfree | BigDecimal | 否 | 否 | 无税总金额 示例：1.0 |
| orderPrices!orderPayMoneyOrigTaxfree | BigDecimal | 否 | 否 | 商品实付无税金额 示例：73.6 |
| orderPrices!orderPayMoneyDomestic | BigDecimal | 否 | 否 | 商品本币含税实付金额 示例：77.28 |
| orderPrices!orderPayMoneyDomesticTaxfree | BigDecimal | 否 | 否 | 商品本币无税金额 示例：73.6 |
| orderPrices!orderId | long | 否 | 否 | 订单id，新增时无需填写，修改时必填 示例：2293918375186688 |
| orderPrices!wholeDiscountRate | BigDecimal | 否 | 否 | 整单扣率% 示例：100 |
| orderPrices!discountAfterMoney | BigDecimal | 否 | 否 | 整单折后金额 示例：1 |
| orderPrices!discountMoney | BigDecimal | 否 | 否 | 折扣总金额 示例：1 |
| headItem | object | 否 | 否 | 表头自定义项(1-60) |
| headFreeItem | object | 否 | 否 | 表头自由自定义项(1-60) |
| orderDetails | object | 是 | 是 | 销售订单子表[voucher.order.OrderDetail] |
| paymentSchedules | object | 是 | 否 | 收款协议 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| memo | string | 否 | 否 | 备注 示例：222222 |
| opposeMemo | string | 否 | 否 | 驳回原因 示例：123 |
| signSubjects | object | 否 | 否 | 合同签署主体[voucher.order.SignSubject] |

## 3. 请求示例

Url: /yonbip/sd/voucherorder/singleSave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"salesOrgId": "2282800216593664",
		"orderPrices!paymentModel": 1,
		"transactionTypeId": "2291507369660672",
		"vouchdate": "2021-06-09 00:00:00",
		"code": "UO-366420210609000004",
		"agentId": "2282507926999296",
		"corpContact": "1123123565864",
		"saleDepartmentId": "3455313215",
		"retailInvestors": false,
		"retailAgentName": "abc",
		"receiveContacter": "刘德华",
		"receiveContacterPhone": "19877754612",
		"settlementOrgId": "2282800216593664",
		"hopeReceiveDate": "2021-06-28 00:00:00",
		"sendDate": "2021-06-23 00:00:00",
		"source": 0,
		"orderDate": "2021-06-09 11:34:26",
		"bizId": 2281151360143616,
		"agentRelationId": 2282800485126656,
		"invoiceMoney": 0,
		"saleAreaId": "1231231",
		"mainprojectId": "432423222",
		"version": 0,
		"isWfControlled": false,
		"orderPrices!currency": "2281153755730176",
		"orderPrices!signFileId": "5d23492c-e4b4-4e18-af14-e69c21592f17",
		"orderPrices!exchRate": 1,
		"orderPrices!exchangeRateType": "0000KPC165PABLPTS60000",
		"orderPrices!natCurrency": "2281153755730176",
		"orderPrices!taxInclusive": true,
		"creditBalance": "0",
		"agentTaxItem": "123555",
		"lockIn": false,
		"bmake_voucher_delivery": true,
		"bizFlow": "19f1e925-c7fd-11eb-a68a-0624d60000dc",
		"bizFlow_version": "V1.0",
		"isFlowCoreBill": true,
		"rebateValidFlag": false,
		"id": "",
		"receiveId": 2282530502643968,
		"receiveZipCode": "010000",
		"receiveTelePhone": "010-7453214",
		"receiver": "地址联系我",
		"receiveMobile": "1879936325",
		"receivecode": "A111",
		"receiveAddress": "123",
		"orderPayType": "FIRSTDELIVER",
		"settlement": "月结",
		"shippingChoiceId": "陆运",
		"invoiceAgentId": "2282507926999296",
		"tradeRouteID": "1211507111900200",
		"modifyInvoiceType": true,
		"bdInvoiceTypeId": "0",
		"invoiceUpcType": 0,
		"invoiceTitle": "2",
		"invoiceTitleType": "1",
		"bankName": "中国工商银行",
		"receievInvoiceMobile": "",
		"receievInvoiceEmail": "",
		"taxNum": "432443243222",
		"subBankName": "中国工商银行股份有限公司濮阳兴工支行",
		"bankAccount": "21474834255322156732",
		"invoiceTelephone": "010-6432121",
		"invoiceAddress": "河南省濮阳市兴区兴工街道66号",
		"promotionMoney": 1333,
		"rebateMoney": 1333,
		"rebateCashMoney": 1333,
		"pointsMoney": 1333,
		"reight": 10,
		"payMoney": 77.28,
		"orderPayMoney": 77.28,
		"realMoney": 77.28,
		"orderRealMoney": 77.28,
		"orderPrices!totalMoneyOrigTaxfree": 1,
		"orderPrices!orderPayMoneyOrigTaxfree": 73.6,
		"orderPrices!orderPayMoneyDomestic": 77.28,
		"orderPrices!orderPayMoneyDomesticTaxfree": 73.6,
		"orderPrices!orderId": 2293918375186688,
		"orderPrices!wholeDiscountRate": 100,
		"orderPrices!discountAfterMoney": 1,
		"orderPrices!discountMoney": 1,
		"headItem": {
			"orderId": "131221132131321",
			"define1": "表头自定义项1",
			"define2": "表头自定义项2"
		},
		"headFreeItem": {
			"id": "654561123413453",
			"define1": "表头自由自定义项1",
			"define2": "表头自由自定义项2"
		},
		"orderDetails": [
			{
				"id": "2293918375219456",
				"stockId": "aaa",
				"orderDetailPrices!discountRate": 100,
				"costCenter_code": "234234234234",
				"providerProfitCenter_code": "234234343",
				"consumerProfitCenter_code": "3452342343223",
				"taxIssuedDiscountline": false,
				"isExpiryDateManage": false,
				"bizId": 2281151360143616,
				"orderDetailPrices!particularlyMoneyDomesticTaxfree": 0,
				"isSkuReserve": false,
				"orderDetailPrices!natSum": 77.28,
				"orderDetailPrices!natMoney": 73.6,
				"productId": "2293858192511232",
				"orderDetailPrices!orderDetailId": 2293918375219456,
				"pointsMoney": 0,
				"promotionMoney": 0,
				"orderDetailPrices!saleCost_domestic_taxfree": 0,
				"productId_priceListFlag": "0",
				"masterUnitId": "2281391353483520",
				"cusDiscountMoney": 0,
				"invExchRate": 4,
				"cusDiscountRate": 0,
				"unitExchangeTypePrice": 0,
				"orderDetailPrices!saleCost_orig_taxfree": 0,
				"orderDetailPrices!oriTax": 3.68,
				"particularlyMoney": -77.28,
				"iProductAuxUnitId": "2281391349666048",
				"orderDetailPrices!particularlyMoneyOrigTaxfree": -77.28,
				"orderDetailPrices!natUnitPrice": 3.2,
				"orderDetailPrices!saleCost_domestic": 0,
				"invPriceExchRate": 1,
				"isBatchManage": false,
				"orderDetailPrices!isDeleted": false,
				"oriSum": 77.28,
				"noTaxSalePrice": 0,
				"salePrice": 22,
				"orderDetailPrices!oriMoney": 73.6,
				"lowestPrice": 1.3,
				"priceQty": 23,
				"stockOrgId": "2282800216593664",
				"prodPrice": 0,
				"iProductUnitId": "2281391353483520",
				"orderDetailPrices!natTaxUnitPrice": 3.36,
				"priceMark": true,
				"orderProductType": "SALE",
				"subQty": 5.75,
				"consignTime": "2021-06-23 00:00:00",
				"skuId": "2293858201112832",
				"ordRealMoney": 77.28,
				"orderDetailPrices!salePrice_domestic": 0,
				"marketPricie": 0,
				"taxId": "2281153771049217",
				"qty": 23,
				"realProductCode": "000023",
				"settlementOrgId": "2282800216593664",
				"oriTaxUnitPrice": 3.36,
				"orderDetailPrices!lineDiscountMoney": 0,
				"orderDetailPrices!natTax": 3.68,
				"isreserve": false,
				"prodCost": 0,
				"productId_pbatchName": "1",
				"specDescription": "",
				"orderDetailPrices!salePrice_domestic_taxfree": 0,
				"unitExchangeType": 0,
				"noTaxSaleCost": 0,
				"saleCost": 0,
				"orderDetailPrices!oriUnitPrice": 3.2,
				"salesOrgId": "2282800216593664",
				"orderRebateMoney": 0,
				"cashRebateMoney": 0,
				"_status": "Insert",
				"orderProductApportionName": "特殊优惠省-77.2800;",
				"memo": "123",
				"projectId": "00023",
				"isAdvRecInv": true,
				"orderDetailPrices!prepayInvRvnRecogBkgMeth": "1",
				"orderDetailPrices!checkByRevenueManagement": false,
				"orderDetailPrices!serviceStartDate": "2021-06-09 00:00:00",
				"orderDetailPrices!serviceEndDate": "2021-06-09 00:00:00",
				"bodyItem": {
					"orderDetailId": "564131325",
					"define1": "表体自定义项1",
					"define2": "表体自定义项2"
				},
				"bodyFreeItem": {
					"id": "132132132564",
					"define1": "表体自由自定义项1",
					"define2": "表体自由自定义项2"
				},
				"orderDetailPrices!calBase": "0",
				"batchId": 23422223324324,
				"orderDetailPrices!ownertype": -1,
				"batchNo": "PC00001",
				"orderDetailPrices!inventoryowner": "-1",
				"orderDetailPrices!taxCodeId": "32213",
				"orderDetailPrices!paidMoneyNew": 0
			}
		],
		"paymentSchedules": [
			{
				"startDateTime": "2021-06-09 00:00:00",
				"fixAccoutDateTime": "2021-06-09 00:00:00",
				"expiringDateTime": "2021-07-09 00:00:00",
				"number": 1,
				"name": "1",
				"payRatio": 25,
				"startDate": 2020875402352084,
				"startName": "订单单据日期",
				"accountType": "0",
				"accountUnit": "0",
				"accountDay": 30,
				"currencyPk": "248f097be0e5fdaf0ad05b831bf61cbf",
				"rate": 1,
				"natCurrencyPk": "248f097be0e5fdaf0ad05b831bf61cbf",
				"amount": 41.67
			}
		],
		"_status": "Insert",
		"memo": "222222",
		"opposeMemo": "123",
		"signSubjects": {
			"id": "2154255325536976902",
			"mainid": "2154255325536976900",
			"signOrder": "10",
			"signSubjectType": "1",
			"signOrgId": "2148303016270233606",
			"signAgentId": "2148303377038049287",
			"address": "北京市海淀区北清路68号",
			"postalCode": "100000",
			"telephone": "62434048",
			"facsimile": "62434048",
			"bankOfDeposit": "中国银行",
			"bankAccount": "631111111111111",
			"memo": "备注信息",
			"isOriginator": true,
			"isDefault": false
		}
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| receiveTelePhone | string | 否 | 收货人固定电话 |
| receiveZipCode | string | 否 | 收货人邮编 |
| cSettlementCode | string | 否 | 结算方式编码 |
| salesOrgId | string | 否 | 销售组织id |
| salesOrgId_name | string | 否 | 销售组织名称 |
| transactionTypeId | string | 否 | 交易类型id |
| transactionTypeId_name | string | 否 | 交易类型名称 |
| vouchdate | string | 否 | 单据日期 |
| auditDate | string | 否 | 审批日期 |
| code | string | 否 | 单据编号 |
| agentId_name | string | 否 | 客户名称 |
| retailAgentName | string | 否 | 散户名称 |
| retailInvestors | string | 否 | 是否散户, true:是、false:否、 |
| receiveContacter | string | 否 | 客户联系人 |
| receiveContacterPhone | string | 否 | 客户联系电话 |
| purchaseNo | string | 否 | 客户采购订单号 |
| saleDepartmentId | string | 否 | 销售部门id |
| saleDepartmentId_name | string | 否 | 销售部门名称 |
| corpContact | string | 否 | 企业业务员 |
| corpContactUserName | string | 否 | 销售业务员 |
| corpContactUserErpCode | string | 否 | 业务员erp编码 |
| settlementOrgId | string | 否 | 开票组织id |
| saleAreaId | string | 否 | 销售区域id |
| mainprojectId | string | 否 | 项目id |
| sendDate | string | 否 | 计划发货日期 |
| hopeReceiveDate | string | 否 | 希望到货日期 |
| settlementOrgId_name | string | 否 | 开票组织名称 |
| id | string | 否 | 主体id |
| parentOrderNo | string | 否 | 拆单来源订单号 |
| agentId | string | 否 | 客户id |
| source | string | 否 | 单据来源, 0:PC端、1:移动端、3:导入、4:ERP、 |
| submitSource | string | 否 | 制单人类型 |
| confirmer | string | 否 | 确认人 |
| orderDate | string | 否 | 订单日期 |
| confirmDate | string | 否 | 订单确认时间 |
| payDate | string | 否 | 订单付款时间 |
| settVoucherType | string | 否 | 结算类型 |
| opposeMemo | string | 否 | 驳回批注 |
| isLowestPrice | boolean | 否 | 是否超最低售价 |
| statusCode | string | 否 | 订单当前状态码 |
| nextStatusName | string | 否 | 订单状态 |
| currentStatus | string | 否 | 当前状态位置 |
| haveDelivery | string | 否 | 是否存在发货单, true:是、false:否、 |
| separatePromotionType | string | 否 | 拆单规则标识 |
| bizId | string | 否 | 商家id |
| bizName | string | 否 | 商家名称 |
| agentRelationId | string | 否 | 客户交易关系id |
| points | string | 否 | 积分 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| orderInvoice | string | 否 | 发票信息 |
| orderShippingAddress | string | 否 | 收货地址信息 |
| orderErp | string | 否 | 订单erp |
| deliveryDate | string | 否 | 交货日期 |
| outSysKey | string | 否 | 接口标识 |
| invoiceMoney | BigDecimal | 否 | 发票金额 |
| downloadU8 | string | 否 | erp是否下载 |
| downloadU8Date | string | 否 | 下载时间 |
| erpTS | string | 否 | 上传订单时间戳 |
| downloadSource | string | 否 | 下载去向 |
| downloadMsg | string | 否 | 下载返回消息 |
| downSuccess | string | 否 | 是否下载成功 |
| iDeleted | string | 否 | 是否删除 |
| version | string | 否 | 版本号 |
| isWfControlled | string | 否 | 是否审批流控制 |
| verifystate | string | 否 | 审批状态 |
| status | string | 否 | 单据状态, 0:开立、3:审核中、1:已审核、2:已关闭、 |
| returncount | string | 否 | 退回次数 |
| orderPrices | object | 否 | 订单价格 |
| receiveAgreementId | int | 否 | 收款协议id |
| receiveAgreementId_name | string | 否 | 收款协议名称 |
| paymentModel | string | 否 | 收款模式 |
| headItem | object | 否 | headItem |
| changeVersion | string | 否 | 变更版本号 |
| receiveId | string | 否 | 收货人id |
| receiver | string | 否 | 收货人 |
| receiveMobile | string | 否 | 收货电话 |
| receiveAddress | string | 否 | 收货地址 |
| orderPayType | string | 否 | 支付方式, FIRSTPAY:款到发货、FIRSTDELIVER:其他、 |
| settlement_name | string | 否 | 结算方式名称 |
| settlement | string | 否 | 结算方式id |
| shippingChoiceId_name | string | 否 | 发运方式名称 |
| shippingChoiceId | string | 否 | 发运方式id |
| creditBalance | BigDecimal | 否 | 客户信用余额 |
| pushProApplyOrder | string | 否 | 是否可下推生产和请购 |
| showVoucherBtn | string | 否 | 是否显示下游按钮 |
| showUnAudit | string | 否 | 是否显示弃审按钮 |
| finishDelivery | string | 否 | 是否完全发货 |
| flowPushVoucher | string | 否 | 是否走业务流 |
| shippingChoiceId_code | string | 否 | 发运方式编码 |
| address | string | 否 | 注册地址 |
| occupyInventory | string | 否 | 库存占用时机, SUBMIT:提交、CONFIRM:确认、 |
| telephone | string | 否 | 注册电话 |
| userBankName | string | 否 | 开户名 |
| bankCode | string | 否 | 开户行编码 |
| invoiceAgentId | string | 否 | 开票客户id |
| invoiceAgentId_name | string | 否 | 开票客户名称 |
| modifyInvoiceType | string | 否 | 发票类型可改, true:是、false:否、 |
| bdInvoiceTypeId | string | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:电子发票（增值税专用发票）,32:电子发票（普通发票）,33:数电纸质发票（增值税专用发票）,34:数电纸质发票（普通发票） |
| invoiceUpcType | string | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票）、12:数电纸质发票（增值税专用发票）、13:数电纸质发票（普通发票） |
| invoiceTitleType | string | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 |
| invoiceTitle | string | 否 | 发票抬头 |
| taxNum | string | 否 | 纳税识别号 |
| bankName | string | 否 | 开户银行 |
| subBankName | string | 否 | 开户支行 |
| bankAccount | string | 否 | 银行账号 |
| invoiceTelephone | string | 否 | 营业电话 |
| invoiceAddress | string | 否 | 营业地址 |
| receievInvoiceMobile | string | 否 | 收票手机号 |
| receievInvoiceEmail | string | 否 | 收票邮箱 |
| totalMoney | BigDecimal | 否 | 总金额 |
| promotionMoney | BigDecimal | 否 | 总优惠金额 |
| rebateMoney | BigDecimal | 否 | 折扣返利金额 |
| rebateCashMoney | BigDecimal | 否 | 抵现返利金额 |
| pointsMoney | BigDecimal | 否 | 积分抵扣金额 |
| reight | BigDecimal | 否 | 运费 |
| payMoney | BigDecimal | 否 | 合计含税金额 |
| nextStatus | string | 否 | 订单状态, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 |
| orderPayMoney | BigDecimal | 否 | 商品实付金额 |
| realMoney | BigDecimal | 否 | 应收金额 |
| orderRealMoney | BigDecimal | 否 | 商品应付金额 |
| particularlyMoney | BigDecimal | 否 | 特殊优惠 |
| unConfirmPrice | BigDecimal | 否 | 收款待确认金额 |
| confirmPrice | BigDecimal | 否 | 收款已确认金额 |
| payStatusCode | string | 否 | 支付状态, NOTPAYMENT:未付款、PARTPAYMENT:部分付款、CONFIRMPAYMENT:部分付款待确认、CONFIRMPAYMENT_ALL:付款待确认、FINISHPAYMENT:付款完成、 |
| createSource | string | 否 | API来源, 1:销售、2:U订货门户、4:采购、3:其他外部系统、 |
| lockIn | int | 否 | 标记锁 |
| stockCheck | int | 否 | 库存查拣 |
| collectMoney | int | 否 | 累计收款金额 |
| synSourceOrg | string | 否 | 协同来源组织id |
| synSourceTenant | string | 否 | 协同来源租户 |
| bEffectStock | string | 否 | 影响可用量参数 |
| synSourceOrg_name | string | 否 | 协同来源组织名称 |
| receivecode | string | 否 | 收货地址编码 |
| pubuts | string | 否 | 时间戳 |
| creator | string | 否 | 制单人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| creatorId | string | 否 | 创建人 |
| auditorId | string | 否 | 审核人ID |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| closerId | string | 否 | 关闭人ID |
| closeTime | string | 否 | 关闭时间 |
| closeDate | string | 否 | 关闭日期 |
| closer | string | 否 | 关闭人 |
| modifierId | string | 否 | 修改人id |
| modifyDate | string | 否 | 修改日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| uordercorp | int | 否 | 租户id |
| bmake_st_salesout | string | 否 | 流程出库 |
| tradeRouteID | string | 否 | 贸易路径Id |
| bmake_voucher_delivery | string | 否 | 流程发货 |
| bmake_voucher_saleinvoice | string | 否 | 流程开票 |
| bizFlow_name | string | 否 | 流程名称 |
| bizFlow | string | 否 | 流程ID |
| bizFlow_version | string | 否 | 版本信息 |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| paymentExeDetail | object | 是 | 订单收款执行明细[voucher.order.PaymentExeDetail] |
| paymentSchedules | object | 是 | 订单收款计划子表[voucher.order.PaymentSchedules] |
| orderDetails | object | 是 | 销售订单子表[voucher.order.OrderDetail] |
| voucher_orderAttachment | object | 是 | 订单附件[voucher.order.OrderAttachment] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |
| tradeRouteID_code | string | 否 | 贸易路径编码 |
| tradeRouteID_name | string | 否 | 贸易路径 |
| signSubjects | object | 否 | 合同签署主体[voucher.order.SignSubject] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"receiveTelePhone": "",
		"receiveZipCode": "",
		"cSettlementCode": "",
		"salesOrgId": "",
		"salesOrgId_name": "",
		"transactionTypeId": "",
		"transactionTypeId_name": "",
		"vouchdate": "",
		"auditDate": "",
		"code": "",
		"agentId_name": "",
		"retailAgentName": "",
		"retailInvestors": "",
		"receiveContacter": "",
		"receiveContacterPhone": "",
		"purchaseNo": "",
		"saleDepartmentId": "",
		"saleDepartmentId_name": "",
		"corpContact": "",
		"corpContactUserName": "",
		"corpContactUserErpCode": "",
		"settlementOrgId": "",
		"saleAreaId": "",
		"mainprojectId": "",
		"sendDate": "",
		"hopeReceiveDate": "",
		"settlementOrgId_name": "",
		"id": "",
		"parentOrderNo": "",
		"agentId": "",
		"source": "",
		"submitSource": "",
		"confirmer": "",
		"orderDate": "",
		"confirmDate": "",
		"payDate": "",
		"settVoucherType": "",
		"opposeMemo": "",
		"isLowestPrice": true,
		"statusCode": "",
		"nextStatusName": "",
		"currentStatus": "",
		"haveDelivery": "",
		"separatePromotionType": "",
		"bizId": "",
		"bizName": "",
		"agentRelationId": "",
		"points": "",
		"pubts": "",
		"orderInvoice": "",
		"orderShippingAddress": "",
		"orderErp": "",
		"deliveryDate": "",
		"outSysKey": "",
		"invoiceMoney": 0,
		"downloadU8": "",
		"downloadU8Date": "",
		"erpTS": "",
		"downloadSource": "",
		"downloadMsg": "",
		"downSuccess": "",
		"iDeleted": "",
		"version": "",
		"isWfControlled": "",
		"verifystate": "",
		"status": "",
		"returncount": "",
		"orderPrices": {
			"currency": "",
			"agentTaxItem": "",
			"currency_priceDigit": "",
			"currency_moneyDigit": "",
			"originalCode": "",
			"originalName": "",
			"exchRate": 0,
			"exchangeRateType": "",
			"exchangeRateType_name": "",
			"natCurrency": "",
			"natCurrency_priceDigit": "",
			"natCurrency_moneyDigit": "",
			"domesticCode": "",
			"domesticName": "",
			"taxInclusive": "",
			"totalMoneyOrigTaxfree": 0,
			"rebateMoneyOrigTaxfree": 0,
			"rebateCashMoneyOrigTaxfree": 0,
			"payMoneyOrigTaxfree": 0,
			"orderPayMoneyOrigTaxfree": 0,
			"realMoneyOrigTaxfree": 0,
			"orderRealMoneyOrigTaxfree": 0,
			"reightMoneyOrigTaxfree": 0,
			"particularlyMoneyOrigTaxfree": 0,
			"promotionMoneyOrigTaxfree": 0,
			"pointsMoneyOrigTaxfree": 0,
			"totalMoneyDomestic": 0,
			"rebateMoneyDomestic": 0,
			"rebateCashMoneyDomestic": 0,
			"payMoneyDomestic": 0,
			"orderPayMoneyDomestic": 0,
			"realMoneyDomestic": 0,
			"orderRealMoneyDomestic": 0,
			"reightMoneyDomestic": 0,
			"particularlyMoneyDomestic": 0,
			"promotionMoneyDomestic": 0,
			"pointsMoneyDomestic": 0,
			"totalMoneyDomesticTaxfree": 0,
			"rebateMoneyDomesticTaxfree": 0,
			"rebateCashMoneyDomesticTaxfree": 0,
			"payMoneyDomesticTaxfree": 0,
			"orderPayMoneyDomesticTaxfree": 0,
			"realMoneyDomesticTaxfree": 0,
			"orderRealMoneyDomesticTaxfree": 0,
			"id": "",
			"orderId": "",
			"totalOriTax": 0,
			"totalNatTax": 0,
			"sendSumMoney": 0,
			"invoiceOriSum": 0,
			"outBoundSumMoney": 0,
			"signFileId": ""
		},
		"receiveAgreementId": 0,
		"receiveAgreementId_name": "",
		"paymentModel": "",
		"headItem": {
			"orderId": "",
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": ""
		},
		"changeVersion": "",
		"receiveId": "",
		"receiver": "",
		"receiveMobile": "",
		"receiveAddress": "",
		"orderPayType": "",
		"settlement_name": "",
		"settlement": "",
		"shippingChoiceId_name": "",
		"shippingChoiceId": "",
		"creditBalance": 0,
		"pushProApplyOrder": "",
		"showVoucherBtn": "",
		"showUnAudit": "",
		"finishDelivery": "",
		"flowPushVoucher": "",
		"shippingChoiceId_code": "",
		"address": "",
		"occupyInventory": "",
		"telephone": "",
		"userBankName": "",
		"bankCode": "",
		"invoiceAgentId": "",
		"invoiceAgentId_name": "",
		"modifyInvoiceType": "",
		"bdInvoiceTypeId": "",
		"invoiceUpcType": "",
		"invoiceTitleType": "",
		"invoiceTitle": "",
		"taxNum": "",
		"bankName": "",
		"subBankName": "",
		"bankAccount": "",
		"invoiceTelephone": "",
		"invoiceAddress": "",
		"receievInvoiceMobile": "",
		"receievInvoiceEmail": "",
		"totalMoney": 0,
		"promotionMoney": 0,
		"rebateMoney": 0,
		"rebateCashMoney": 0,
		"pointsMoney": 0,
		"reight": 0,
		"payMoney": 0,
		"nextStatus": "",
		"orderPayMoney": 0,
		"realMoney": 0,
		"orderRealMoney": 0,
		"particularlyMoney": 0,
		"unConfirmPrice": 0,
		"confirmPrice": 0,
		"payStatusCode": "",
		"createSource": "",
		"lockIn": 0,
		"stockCheck": 0,
		"collectMoney": 0,
		"synSourceOrg": "",
		"synSourceTenant": "",
		"bEffectStock": "",
		"synSourceOrg_name": "",
		"receivecode": "",
		"pubuts": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"creatorId": "",
		"auditorId": "",
		"auditor": "",
		"auditTime": "",
		"closerId": "",
		"closeTime": "",
		"closeDate": "",
		"closer": "",
		"modifierId": "",
		"modifyDate": "",
		"modifier": "",
		"modifyTime": "",
		"uordercorp": 0,
		"bmake_st_salesout": "",
		"tradeRouteID": "",
		"bmake_voucher_delivery": "",
		"bmake_voucher_saleinvoice": "",
		"bizFlow_name": "",
		"bizFlow": "",
		"bizFlow_version": "",
		"isFlowCoreBill": "",
		"ecsuiteperson": "",
		"ecsuiteuser": "",
		"paymentExeDetail": [
			{
				"actualPayMoney": 0,
				"expiringDateTime": "",
				"fixAccoutDateTime": "",
				"startDateTime": "",
				"paidMoney": 0,
				"vouchcode": "",
				"vouchtype": "",
				"payMoney": 0,
				"payRatio": 0,
				"period": "",
				"number": "",
				"startName": "",
				"startDate": "",
				"vouchid": "",
				"vouchsubid": "",
				"paySum": 0,
				"writeBackSum": 0,
				"isAdvancePay": "",
				"rowno": "",
				"mainid": "",
				"id": "",
				"pubts": ""
			}
		],
		"paymentSchedules": [
			{
				"paidAmount": 0,
				"startDateTime": "",
				"accountType": "",
				"accountUnit": "",
				"accountDay": "",
				"amount": 0,
				"payRatio": 0,
				"name": "",
				"number": "",
				"startName": "",
				"startDate": "",
				"fixAccoutDateTime": "",
				"expiringDateTime": "",
				"id": "",
				"pubts": ""
			}
		],
		"orderDetails": [
			{
				"productId_pbatchName": "",
				"code": "",
				"idKey": "",
				"productId": "",
				"productId_priceListFlag": "",
				"skuId": "",
				"erpCode": "",
				"outSysKey": "",
				"productCode": "",
				"productName": "",
				"costCenter": "",
				"providerProfitCenter": "",
				"consumerProfitCenter": "",
				"skuCode": "",
				"skuName": "",
				"priceMark": true,
				"orderProductType": "",
				"model": "",
				"modelDescription": "",
				"specDescription": "",
				"projectId": "",
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"productAuxUnitName": "",
				"invExchRate": 0,
				"subQty": 0,
				"productUnitName": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"qtyName": "",
				"qty": 0,
				"stockId": "",
				"stockName": "",
				"stockOrgId_name": "",
				"consignTime": "",
				"stockOrgId": "",
				"deliveryDays": 0,
				"projectId_name": "",
				"projectId_code": "",
				"settlementOrgId_name": "",
				"noTaxSalePrice": 0,
				"salePrice": 0,
				"noTaxSaleCost": 0,
				"saleCost": 0,
				"orderDetailPrices": {
					"saleCost_orig_taxfree": 0,
					"oriUnitPrice": 0,
					"oriMoney": 0,
					"lowestPrice": 0,
					"oriTax": 0,
					"natSum": 0,
					"natMoney": 0,
					"natTaxUnitPrice": 0,
					"natTax": 0,
					"natUnitPrice": 0,
					"orderDetailId": "",
					"code": "",
					"salePrice_orig_taxfree": 0,
					"rebateMoneyOrigTaxfree": 0,
					"particularlyMoneyOrigTaxfree": 0,
					"promotionMoneyOrigTaxfree": 0,
					"pointsMoneyOrigTaxfree": 0,
					"saleCost_domestic": 0,
					"salePrice_domestic": 0,
					"rebateMoneyDomestic": 0,
					"particularlyMoneyDomestic": 0,
					"promotionMoneyDomestic": 0,
					"pointsMoneyDomestic": 0,
					"saleCost_domestic_taxfree": 0,
					"salePrice_domestic_taxfree": 0,
					"rebateMoneyDomesticTaxfree": 0,
					"particularlyMoneyDomesticTaxfree": 0,
					"promotionMoneyDomesticTaxfree": 0,
					"pointsMoneyDomesticTaxfree": 0,
					"id": "",
					"isDeleted": "",
					"prepayInvRvnRecogBkgMeth": "",
					"checkByRevenueManagement": "",
					"serviceStartDate": "",
					"serviceEndDate": "",
					"calBase": "",
					"returnOriSum": 0,
					"returnPriceQty": 0,
					"returnPreSendOriSum": 0,
					"totalReturnStockQty": 0,
					"totalReturnStockPriceQty": 0,
					"totalReturnStockOriSum": 0,
					"totalReturnInvoiceQty": 0,
					"totalReturnInvoicePriceQty": 0,
					"totalReturnInvoiceOriSum": 0,
					"taxCodeId": "",
					"taxCode_taxCode": "",
					"natWithholdingTax": 0,
					"oriWithholdingTax": 0
				},
				"oriTaxUnitPrice": 0,
				"oriSum": 0,
				"taxRate": 0,
				"taxId": "",
				"taxItems": "",
				"taxCode": "",
				"transactionTypeId": "",
				"orderProductApportionName": "",
				"rebateMoney": 0,
				"marketPricie": 0,
				"particularlyMoney": 0,
				"promotionMoney": 0,
				"pointsMoney": 0,
				"ordRealMoney": 0,
				"createDate": "",
				"shoppingCartId": "",
				"groupId": "",
				"rebateReturnProductId": "",
				"mutualActivities": "",
				"activities": "",
				"bizId": "",
				"salesOrgId": "",
				"saleDepartmentId": "",
				"settlementOrgId": "",
				"bizProductId": "",
				"bizSkuId": "",
				"orderDetailPrice": 0,
				"iDeleted": "",
				"iOrgId": "",
				"dCreatedTime": "",
				"dModifyTime": "",
				"cCreator": "",
				"cModifier": "",
				"iProductAuxUnitId": "",
				"iProductUnitId": "",
				"masterUnitId": "",
				"purUOM_Precision": "",
				"priceUOM_Precision": "",
				"unit_Precision": "",
				"cBizName": "",
				"id": "",
				"orderId": "",
				"bodyItem": {
					"orderDetailId": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
				},
				"pubts": "",
				"source": "",
				"upcode": "",
				"sourceid": "",
				"sourceautoid": "",
				"makeRuleCode": "",
				"hopeReceiveDate": "",
				"sendPayMoney": 0,
				"sendQty": 0,
				"auditCount": 0,
				"takeQuantity": 0,
				"takeSalePayMoney": 0,
				"orderOutPut": 0,
				"orderPurchaseQty": 0,
				"totalOutStockQuantity": 0,
				"totalOutStockOriTaxMoney": 0,
				"totalOutStockSubQty": 0,
				"totalOutStockOriMoney": 0,
				"invoiceOriSum": 0,
				"invoiceQty": 0,
				"coordinationQuantity": 0,
				"closedSumMoney": 0,
				"closedRowCount": 0,
				"memo": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"bmake_st_salesout": "",
				"bmake_voucher_delivery": "",
				"bmake_voucher_saleinvoice": "",
				"batchNo": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"productDate": "",
				"invalidDate": "",
				"isAdvRecInv": true,
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"batchId": 1231232323,
				"returnPreSendQty": 0,
				"reSendPriceQty": 0,
				"paidMoneyNew": 0
			}
		],
		"voucher_orderAttachment": [
			{
				"folder": "",
				"orderId": "",
				"type": "",
				"size": "",
				"fileName": "",
				"id": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": "",
		"tradeRouteID_code": "",
		"tradeRouteID_name": "",
		"signSubjects": {
			"id": "",
			"mainid": "",
			"signOrder": "",
			"signSubjectType": "",
			"signOrgId": "",
			"signAgentId": "",
			"address": "",
			"postalCode": "",
			"telephone": "",
			"facsimile": "",
			"bankOfDeposit": "",
			"bankAccount": "",
			"memo": "",
			"isOriginator": true,
			"isDefault": true,
			"pubts": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

返回参数 exchangeRateType

支持用户级

2	2026-04-09

新增

请求参数 (4)

更新

请求参数 (17)

删除

请求参数 paymentModel

删除

请求参数 projectId_code

新增

返回参数 saleAreaId

新增

返回参数 mainprojectId

更新

返回参数 (529)

3	2025-12-11

新增

请求参数 (5)

更新

请求参数 consignTime

新增

返回参数 (6)

销售订单单个保存接口支持税码

4	2025-11-14

新增

请求参数 orderDetailPrices!inventoryowner

新增

请求参数 orderDetailPrices!ownertype

更新

请求参数 consignTime

1

5	2025-09-11

更新

请求说明

新增

返回参数 (11)

更新

返回参数 settlementOrgId

返参增加英文信息：退货补发数量,退货补发计价数量,退货金额,退货计价数量,退货补发含税金额,累计退货入库数量,累计退货入库计价数量,累计退货入库含税金额,累计退货开票数量,累计退货开票计价数量,累计退货开票含税金额


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

