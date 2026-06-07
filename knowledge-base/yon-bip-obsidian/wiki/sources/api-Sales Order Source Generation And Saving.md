---
title: "销售订单来源生单保存"
apiId: "2521632723287146496"
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

# 销售订单来源生单保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/SCC/voucherorder/makebill

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
| data | object | 否 | 是 | 销售订单 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| tepid | number |
| 小数位数:0,最大长度:19 | 否 | 否 | UI模板id 示例：2252089260190990348 |
| salesOrgId | string | 否 | 否 | 销售组织，可传入id，code 示例：2282800216593664 |
| transactionTypeId | string | 否 | 否 | 交易类型，可传入id，code 示例：2291507369660672 |
| vouchdate | string | 否 | 否 | 单据日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-09 00:00:00 |
| code | string | 否 | 否 | 单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：UO-366420210609000004 |
| agentId | string | 否 | 否 | 客户，可传入id，code 示例：1487909695235293192 |
| corpContact | string | 否 | 否 | 销售业务员，可传入id，code 示例：1123123565864 |
| saleDepartmentId | string | 否 | 否 | 销售部门，可传入id，code 示例：3455313215 |
| hopeReceiveDate | string | 否 | 否 | 希望到货日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-28 00:00:00 |
| receiveAgreementId | string | 否 | 否 | 收款协议，可传入id，code 示例：1498765122019524625 |
| memo | string | 否 | 否 | 备注 |
| invoiceAgentId | string | 否 | 否 | 开票客户，可传入id，code 示例：2282507926999296 |
| orderDetails | object | 是 | 是 | 销售订单子表 |

## 3. 请求示例

Url: /yonbip/SCC/voucherorder/makebill?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"tepid": 2252089260190990348,
		"salesOrgId": "2282800216593664",
		"transactionTypeId": "2291507369660672",
		"vouchdate": "2021-06-09 00:00:00",
		"code": "UO-366420210609000004",
		"agentId": "1487909695235293192",
		"corpContact": "1123123565864",
		"saleDepartmentId": "3455313215",
		"hopeReceiveDate": "2021-06-28 00:00:00",
		"receiveAgreementId": "1498765122019524625",
		"memo": "",
		"invoiceAgentId": "2282507926999296",
		"orderDetails": [
			{
				"makeRuleCode": "salescontract_to_order",
				"sourceCode": "XSHT20260421000149",
				"sourceLineno": 10,
				"sourceid": "2362422513848576",
				"sourceautoid": "2362422513848577",
				"productId": "2293858192511232",
				"skuId": "2293858201112832",
				"iProductAuxUnitId": "2281391349666048",
				"subQty": 5.36,
				"iProductUnitId": "2281391353483520",
				"priceQty": 7.24,
				"qty": 10.245,
				"stockOrgId": "2282800216593664",
				"stockId": "1993765162245947395",
				"consignTime": "2021-06-23 00:00:00",
				"settlementOrgId": "2282800216593664",
				"oriTaxUnitPrice": 3.94,
				"orderDetailPrices!oriUnitPrice": 3.21,
				"oriSum": 1590.5,
				"orderDetailPrices!oriMoney": 1486.12,
				"orderProductType": "SALE",
				"taxId": "2281153771049217",
				"memo": ""
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 单据数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 信息 |
| infos | object | 是 | 单据数据 |
| failInfos | string | 是 | 失败信息 |
| traceId | string | 否 | traceId 示例：885b076633edc3db |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"unConfirmPrice": 0,
				"sendDate": "2026-04-15 00:00:00",
				"receiveContacter": "张三",
				"settVoucherType": "SHIPPING",
				"settlementOrgId_name": "WW集团",
				"orderPrices!discountMoney": 0,
				"bizId": "4685024686396992",
				"id": "2517234900202422278",
				"agentId_name": "WW普通客户",
				"isAccDeliveryPlan": false,
				"salesOrgId_code": "WWJT",
				"receiveAddress": "北京市 市辖区 西城区 aadadadad",
				"isWfControlled": false,
				"pointsMoney": 0,
				"totalMoney": 798,
				"orderPrices!totalOriTax": 38,
				"promotionMoney": 0,
				"couponsMoney": 0,
				"orderPrices_natCurrency": "2456305111153508422",
				"rebateCashMoney": 0,
				"statusCode": "SUBMITORDER",
				"status": 0,
				"verifystate": 0,
				"particularlyMoney": 0,
				"orderDefineCharacter": {
					"ytenant": "0000MKQIYD2A6XUBSK0000",
					"pubts": "2026-04-13 17:18:26",
					"id": "2517234900202422283"
				},
				"confirmPrice": 0,
				"vouchdate": "2026-04-15 00:00:00",
				"orderPrices_originalName": "人民币",
				"payMoney": 798,
				"invoiceAgentId_code": "00000000000001",
				"exchRateDate": "2026-04-15 00:00:00",
				"orderPayMoney": 798,
				"pubts": "2026-04-15 17:18:32",
				"isFlowCoreBill": true,
				"createDate": "2026-04-15 17:18:32",
				"creator": "李志强",
				"nextStatus": "CONFIRMORDER",
				"submitSource": 3,
				"currentStatus": 0,
				"isChangeShipmentPlan": false,
				"receiverCustId_name": "WW普通客户",
				"createSource": 5,
				"orderPrices!orderPayMoneyDomestic": 798,
				"taxSettingType": 0,
				"settlementVersion": 0,
				"createTime": "2026-04-15 17:18:32",
				"orderPrices!payMoneyOrigTaxfree": 760,
				"invoiceUpcType": 0,
				"confirmer": 0,
				"orderPrices!payMoneyDomestic": 798,
				"bEffectStock": true,
				"orderRealMoney": 798,
				"orderPrices_currency": "2456305111153508422",
				"orderPrices_exchRate": 1,
				"payStatusCode": "NOTPAYMENT",
				"source": 0,
				"realMoney": 798,
				"nextStatusName": "开立",
				"invoiceTitleType": 0,
				"orderPrices!orderPayMoneyDomesticTaxfree": 760,
				"receiveContacterPhone": "+86-17610898767",
				"modifyInvoiceType": true,
				"invoiceType": "NONE",
				"billBusinessType": 0,
				"bdInvoiceTypeId": "0",
				"invoiceAgentId": "2460607732090667012",
				"receiveContacterId": "2483084936626569220",
				"rebateMoney": 0,
				"yTenantId": "0000MKQIYD2A6XUBSK0000",
				"barCode": "voucher_order|2517234900202422278",
				"orderPrices_exchangeRateType": "0000MKQIYD2A6XUBSK0000",
				"settlementOrgId_code": "WWJT",
				"settlementOrgId": "2460596401985290246",
				"changeStatus": "unchanged",
				"orderDate": "2026-04-15 17:18:31",
				"orderPrices!orderPayMoneyOrigTaxfree": 760,
				"agentId_code": "00000000000001",
				"agentId": "2460607732090667012",
				"isLowestPrice": false,
				"occupyInventory": "CONFIRM",
				"creatorId": "2459864960459079682",
				"orderPayType": "FIRSTDELIVER",
				"isFinishDelivery": false,
				"receiverCustId_code": "00000000000001",
				"haveDelivery": false,
				"invoiceAgentId_name": "WW普通客户",
				"ytenant": "0000MKQIYD2A6XUBSK0000",
				"code": "",
				"orderPrices_originalCode": "CNY",
				"orderPrices!payMoneyDomesticTaxfree": 760,
				"orderPrices!totalNatTax": 38,
				"receiveId": "2482244875396841477",
				"receiverCustId": "2460607732090667012",
				"salesOrgId_name": "WW集团",
				"salesOrgId": "2460596401985290246",
				"orderPrices!currency_moneyDigit": 2,
				"orderPrices!currency_priceDigit": 2,
				"orderPrices!orderId": "2517234900202422278",
				"orderPrices!exchRate": 1,
				"orderPrices!originalName": "人民币",
				"orderPrices!natCurrency": "2456305111153508422",
				"orderPrices!exchRateOps": 1,
				"orderPrices!domesticName": "人民币",
				"orderPrices!wholeFavorableRate": 0,
				"orderPrices!currency": "2456305111153508422",
				"orderDetails": {
					"qtyName": "千克",
					"oriTax": "38",
					"orderId": "2517234900202422278",
					"sendQty": 0,
					"productName": "",
					"sourceCode": "",
					"settlementOrgId_name": "",
					"receiverId": ""
				},
				"orderPrices!currency_priceRount": 4,
				"orderPrices!id": "2517234900202422278",
				"orderPrices!pubts": "2026-04-15 17:18:32.734",
				"orderPrices!compMatchExpand": 0,
				"orderPrices!paymentModel": 1,
				"orderPrices!ytenant": "0000MKQIYD2A6XUBSK0000",
				"orderPrices!domesticCode": "CNY",
				"orderPrices!discountAfterMoney": 798,
				"orderPrices!currency_moneyRount": 4,
				"orderPrices!natCurrency_priceRount": 4,
				"orderPrices!yTenantId": "0000MKQIYD2A6XUBSK0000",
				"orderPrices!exchangeRateType": "0000MKQIYD2A6XUBSK0000",
				"orderPrices!wholeDiscountRate": 100,
				"orderPrices!natCurrency_moneyDigit": 2,
				"orderPrices!natCurrency_priceDigit": 2,
				"orderPrices!outBoundSumMoney": 0,
				"orderPrices!originalCode": "CNY",
				"orderPrices!exchangeRateType_name": "基准汇率",
				"orderPrices!totalMoneyOrigTaxfree": 798,
				"orderPrices!natCurrency_moneyRount": 4
			}
		],
		"failInfos": [
			""
		]
	},
	"traceId": "885b076633edc3db",
	"uploadable": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

