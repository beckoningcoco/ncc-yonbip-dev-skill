---
title: "采购订单有来源生单"
apiId: "2043727846895517702"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购订单有来源生单

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purchaseorder/addPurchaseOrderBySource

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
| data | object | 否 | 是 | 采购订单[pu.purchaseorder.PurchaseOrder] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| makeRuleCode | string | 否 | 是 | 生单规则编号（预置的单据转换规则编号），采购订单参照请购单生单：pu_applyorder 示例：pu_applyorder |
| bRecalculateQty | boolean | 否 | 否 | 是否重算数量，为是的时候会根据数量重算采购数量和计价数量 示例：false |
| bRecalculatePrice | boolean | 否 | 否 | 是否重算金额，为是的时候会根据金额重算标识进行重算，否则以上游携带或者录入的为准 示例：false |
| recalculatePriceFlag | string | 否 | 否 | 重算金额的标识，当bRecalculatePrice为是的时候必填，具体值录入单价、金额或税额的业务对象上的编码，如含税金额：oriSum 示例：oriSum |
| bAutoGetPriceForApi | boolean | 否 | 否 | 自动取价标识（自动取价为否，价税额信息需要传值或者从上游携带；自动取价为是，支持按照采购参数的设置取价格目录或者最新采购价） 示例：true 默认值：false |
| code | string | 否 | 否 | 采购订单单据编码，手工编码时必填 示例：CGDD20240716001 |
| vouchdate | string | 否 | 否 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-03-05 00:00:00 |
| bustype_code | string | 否 | 否 | 推单后采购订单交易类型没有默认值时必填，录入交易类型的code或id 示例：2043576921746833408 |
| vendor_code | string | 否 | 否 | 推单后采购订单没有供货供应商时必填，录入供应商code或id 示例：2043576921746833408 |
| invoiceVendor_code | string | 否 | 否 | 推单后采购订单没开票供应商时必填，录入供应商code或id 示例：2043576921746833408 |
| operator | string | 否 | 否 | 采购员：录入采购员id或code 示例：1451464415082708997 |
| department | string | 否 | 否 | 采购部门：录入部门id和code 示例：1451464415082708997 |
| vendorcontact | string | 否 | 否 | 供方联系人id 示例：1530102234079559689 |
| contact | string | 否 | 否 | 供方联系人姓名 示例：坤坤 |
| purchaseOrders | object | 是 | 是 | 采购订单子表[pu.purchaseorder.PurchaseOrders] |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/addPurchaseOrderBySource?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"makeRuleCode": "pu_applyorder",
		"bRecalculateQty": false,
		"bRecalculatePrice": false,
		"recalculatePriceFlag": "oriSum",
		"bAutoGetPriceForApi": true,
		"code": "CGDD20240716001",
		"vouchdate": "2021-03-05 00:00:00",
		"bustype_code": "2043576921746833408",
		"vendor_code": "2043576921746833408",
		"invoiceVendor_code": "2043576921746833408",
		"operator": "1451464415082708997",
		"department": "1451464415082708997",
		"vendorcontact": "1530102234079559689",
		"contact": "坤坤",
		"purchaseOrders": [
			{
				"sourceid": "2043576921746833408",
				"sourceautoid": "2043576921746833409",
				"oriUnitPrice": 1,
				"oriTaxUnitPrice": 1,
				"oriMoney": 1,
				"oriSum": 1,
				"oriTax": 0,
				"natUnitPrice": 1,
				"natTaxUnitPrice": 1,
				"natMoney": 1,
				"natSum": 1,
				"natTax": 0,
				"qty": 1,
				"priceQty": 1,
				"subQty": 1,
				"taxitems_code": "VATR1",
				"warehouse_code": "9488383858",
				"project_code": "888900000002",
				"recieveDate": "2021-03-05 00:00:00",
				"batchno": 228845,
				"invaliddate": "2023-01-31",
				"producedate": "2023-01-31",
				"isGiftProduct": false
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
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 单据信息 |
| vendor_code | string | 否 | 供应商编码 示例：090206 |
| code | string | 否 | 单据编号 示例：00079 |
| invoiceVendor | long | 否 | 开票供应商id 示例：2277208958341376 |
| exchRate | long | 否 | 汇率 示例：1 |
| invoiceVendor_code | string | 否 | 开票供应商编码 示例：090206 |
| currency_code | string | 否 | 币种编码 示例：CNY |
| vouchdate | string | 否 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-08-18 00:00:00 |
| natCurrency | string | 否 | 本币 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| currency | string | 否 | 币种Id 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| id | long | 否 | 采购订单主表id 示例：2410387773493760 |
| source | string | 否 | 来源单据类型：20:计划独立需求、280:计划订单、45:ERP采购入库单、claimDeduction:索赔扣款单、CONSUMER:ERP消耗汇总单、cpu-buyoffer-service.reqcard:采购需求单、cpu-buyoffer-service.reqcardHead:定标生单、cpu-contract-service.agreement:协议直采、cpu-contract-service.yccontract:采购合同、cpu-contract-service.yccontractH 示例：pu_applyorder |
| srcBill | long | 否 | 来源单据ID 示例：2288453282518528 |
| srcBillNO | string | 否 | 来源单据号 示例：CGRK20210605000003 |
| bustype_code | string | 否 | 交易类型编码 示例：A20001 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| org | string | 否 | 采购组织 示例：2262688837571584 |
| bustype | string | 否 | 交易类型 示例：110000000000027 |
| exchRateType | string | 否 | 汇率类型id 示例：k8p3lxta |
| operator | string | 否 | 采购员id 示例：1451464415082708997 |
| operator_name | string | 否 | 采购员 示例：阿三 |
| department | string | 否 | 采购部门id 示例：2262688837571584 |
| department_name | string | 否 | 采购部门 示例：设备管理部 |
| vendorcontact | string | 否 | 供方联系人id 示例：1530102234079559689 |
| contact | string | 否 | 供方联系人 示例：坤坤 |
| org_code | string | 否 | 采购组织编码 示例：0518 |
| purchaseOrders | object | 是 | 采购订单子表 |
| natCurrency_code | string | 否 | 本币编码 示例：CNY |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-08-30 18:13:17 |
| status | long | 否 | 状态：0：开立、1：已审核、2：已关闭、3：审核中 示例：0 |
| creator | string | 否 | 创建人 示例：YonSuite默认用户 |
| creatorId | long | 否 | 创建人id 示例：2067791299891456 |
| createTime | string | 否 | 创建时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-08-30 18:13:15 |
| createDate | string | 否 | 创建日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-08-30 18:13:15 |
| barCode | string | 否 | 扫码 示例：st_purchaseorder|2410387773493760 |
| isWfControlled | boolean | 否 | 是否审批流控制：true or false 示例：false |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 总数量 示例：29.59 |
| moneysum | number |
| 小数位数:8,最大长度:28 | 否 | 金额 示例：1000.345555 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"vendor_code": "090206",
			"code": "00079",
			"invoiceVendor": 2277208958341376,
			"exchRate": 1,
			"invoiceVendor_code": "090206",
			"currency_code": "CNY",
			"vouchdate": "2021-08-18 00:00:00",
			"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
			"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
			"id": 2410387773493760,
			"source": "pu_applyorder",
			"srcBill": 2288453282518528,
			"srcBillNO": "CGRK20210605000003",
			"bustype_code": "A20001",
			"resubmitCheckKey": "OPENAPI_66f9b3aaec324974a183c74739e473b6_k8p3lxta_654d423a33a525b49d9f0da17f7e4f70",
			"org": "2262688837571584",
			"bustype": "110000000000027",
			"exchRateType": "k8p3lxta",
			"operator": "1451464415082708997",
			"operator_name": "阿三",
			"department": "2262688837571584",
			"department_name": "设备管理部",
			"vendorcontact": "1530102234079559689",
			"contact": "坤坤",
			"org_code": "0518",
			"purchaseOrders": [
				{
					"purUOM": 2262713287365888,
					"oriTax": 19.345455,
					"productsku": 2262713287365888,
					"productsku_cCode": "0001000004",
					"product_cCode": "0001000004",
					"inOrg": "2262688837571584",
					"natTax": 15,
					"subQty": 29.27,
					"proDescFlag": "0",
					"priceUOM_Code": "001",
					"inInvoiceOrg": "2262688837571584",
					"firstsource": "pu_applyorder",
					"firstupcode": "123456",
					"source": "pu_applyorder",
					"firstsourceautoid": 2288451311391233,
					"firstsourceid": 2288453282518528,
					"sourceautoid": 2288453282518529,
					"upcode": "CGRK20210605000003",
					"sourceid": 2288453282518528,
					"unit_code": "001",
					"inOrg_code": "0518",
					"id": 2410387773526528,
					"batchno": 228845,
					"invaliddate": "2021-08-18 00:00:00",
					"producedate": "2021-08-18 00:00:00",
					"mainid": 2410387773493760,
					"oriUnitPrice": 300,
					"natSum": 678000,
					"taxRate": 6,
					"unit": 2262713287365888,
					"qty": 29.59,
					"makeRuleCode": "st_purinrecord",
					"expenseItemId": "2262713287365888",
					"expenseItemId_code": "2262713287365888",
					"oriTaxUnitPrice": 200,
					"oriMoney": 600000.244,
					"invExchRate": 0.01,
					"unitExchangeTypePrice": 1,
					"natUnitPrice": 300,
					"purUOM_Code": "001",
					"priceUOM": 2262713287365888,
					"invPriceExchRate": 0.02,
					"inInvoiceOrg_code": "0518",
					"product": 2262900308235520,
					"oriSum": 1000.345555,
					"unitExchangeType": 1,
					"priceQty": 20.89,
					"natTaxUnitPrice": 200,
					"natMoney": 600000,
					"pubts": "2021-08-30 18:13:15",
					"signatory": "0",
					"outForeignBusinessmen_code": "090206",
					"hasForeignInvestors": "false"
				}
			],
			"natCurrency_code": "CNY",
			"pubts": "2021-08-30 18:13:17",
			"status": 0,
			"creator": "YonSuite默认用户",
			"creatorId": 2067791299891456,
			"createTime": "2021-08-30 18:13:15",
			"createDate": "2021-08-30 18:13:15",
			"barCode": "st_purchaseorder|2410387773493760",
			"isWfControlled": false,
			"totalQuantity": 29.59,
			"moneysum": 1000.345555
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-22

更新

请求说明

更新

返回参数 resubmitCheckKey

2	2025-05-29

新增

请求参数 bAutoGetPriceForApi

增加参数


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

