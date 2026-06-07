---
title: "采购订单单个保存V2"
apiId: "66f9b3aaec324974a183c74739e473b6"
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

# 采购订单单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purchaseorder/singleSave_v1

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
| bustype_code | string | 否 | 是 | 交易类型编码 示例：A20001 |
| code | string | 否 | 否 | 采购订单code，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：CG20240516001 |
| id | string | 否 | 否 | 采购订单主表id：新增时无需填写，修改必填 示例：1998548312812158981 |
| exchRate | number |
| 小数位数:8,最大长度:19 | 否 | 是 | 汇率 示例：1 |
| exchRateType | string | 否 | 是 | 汇率类型id 或 汇率类型code 示例：1104 |
| invoiceVendor_code | string | 否 | 是 | 开票供应商编码 示例：1001000089 |
| currency_code | string | 否 | 是 | 币种编码 示例：CNY |
| natCurrency_code | string | 否 | 是 | 本币简称 示例：CNY |
| natMoney | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 本币无税金额；小数位数取自单据上[本币]对应的币种档案上设置的“金额精度”，最多是20位数，最大精度为8位 示例：400000 |
| natSum | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 本币含税金额；小数位数取自单据上[本币]对应的币种档案上设置的“金额精度”，最多是20位数，最大精度为8位 示例：412000 |
| org_code | string | 否 | 是 | 组织编码 示例：991 |
| bAutoGetPriceForApi | boolean | 否 | 否 | 自动取价标识（价税额信息为必填信息，自动取价为否，价税额信息需要传值；自动取价为是，如果想支持完全取价格目录或者最新采购价，需要设置采购参数，含税单价/无税单价需要录入负数，取不到的时系统会报错，如果想支持完全取价格目录或者最新采购价，取不到再取传入的价格，含税单价/无税单价可以录入正数或者0） 示例：true 默认值：false |
| oriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 无税金额；小数位数取自单据表头[币种]对应的币种档案上设置的“金额精度”，最多是20位数，最大精度为8位 示例：400000 |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 含税金额；小数位数取自单据表头[币种]对应的币种档案上设置的“金额精度”，最多是20位数，最大精度为8位 示例：412000 |
| srcBill | long | 否 | 否 | 来源单据ID：推拉单必传 示例：2288453282518528 |
| srcBillNO | string | 否 | 否 | 来源单据号：推拉单必传 示例：CGRK20210605000003 |
| source | string | 否 | 否 | 来源单据类型(推拉单必传)来源单据类型：20:计划独立需求、280:计划订单、45:ERP采购入库单、claimDeduction:索赔扣款单、CONSUMER:ERP消耗汇总单、cpu-buyoffer-service.reqcard:采购需求单、cpu-buyoffer-service.reqcardHead:定标生单、cpu-contract-service.agreement:协议直采、cpu-contract-service.yccontract:采购合同、cpu-contract-servic 示例：pu_applyorder |
| operator | string | 否 | 否 | 采购员：录入采购员id或code 示例：1451464415082708997 |
| department | string | 否 | 否 | 采购部门：录入部门id和code 示例：1451464415082708997 |
| vendorcontact | string | 否 | 否 | 供方联系人id 示例：1530102234079559689 |
| contact | string | 否 | 否 | 供方联系人姓名 示例：坤坤 |
| headItem | object | 否 | 否 | 表头自定义项 |
| headFreeItem | object | 否 | 否 | 表头自由自定义项 |
| purchaseOrders | object | 是 | 是 | 采购订单子表[pu.purchaseorder.PurchaseOrders] |
| _status | string | 否 | 是 | 操作标识：Insert:新增、Update:更新 示例：Insert |
| headParallel | object | 否 | 否 | 主表平行表 |
| vendor_code | string | 否 | 是 | 供货供应商编码 示例：0000000001 |
| vouchdate | string | 否 | 是 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-03-05 00:00:00 |
| tradeRouteID | number |
| 小数位数:-1,最大长度:20 | 否 | 否 | 贸易路径 示例：1451464415082708997 |
| tradeRouteID_code | string | 否 | 否 | 贸易路径编码 示例：test001 |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/singleSave_v1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"bustype_code": "A20001",
		"code": "CG20240516001",
		"id": "1998548312812158981",
		"exchRate": 1,
		"exchRateType": "1104",
		"invoiceVendor_code": "1001000089",
		"currency_code": "CNY",
		"natCurrency_code": "CNY",
		"natMoney": 400000,
		"natSum": 412000,
		"org_code": "991",
		"bAutoGetPriceForApi": true,
		"oriMoney": 400000,
		"oriSum": 412000,
		"srcBill": 2288453282518528,
		"srcBillNO": "CGRK20210605000003",
		"source": "pu_applyorder",
		"operator": "1451464415082708997",
		"department": "1451464415082708997",
		"vendorcontact": "1530102234079559689",
		"contact": "坤坤",
		"headItem": {
			"id": "2343232343234",
			"define1": "2343232343234",
			"define2": "4234543223433"
		},
		"headFreeItem": {
			"id": "34543454324",
			"define1": "34543454324",
			"define2": "3454323432"
		},
		"purchaseOrders": [
			{
				"bustype": "4345235235",
				"demandOrg_code": "991",
				"inInvoiceOrg_code": "991",
				"id": 1234321234322332,
				"inOrg_code": "991",
				"invExchRate": 1,
				"invoiceVendor": "23124142",
				"source": "pu_applyorder",
				"makeRuleCode": "pu_applyorder",
				"upcode": "CGRK20210605000003",
				"sourceautoid": 2288453282518529,
				"sourceid": 2288453282518528,
				"firstsourceid": 2288451311391232,
				"firstsourceautoid": 2288451311391233,
				"firstsource": "pu_applyorder",
				"firstupcode": "123456",
				"batchno": 228845,
				"define1": "红色",
				"define10": "绿色",
				"invaliddate": "2023-01-31",
				"producedate": "2023-01-31",
				"mainid": 1998548312812158982,
				"moneysum": 0,
				"natMoney": 412000,
				"natSum": 12000,
				"natTax": 0,
				"natTaxUnitPrice": 0,
				"natUnitPrice": 0,
				"oriMoney": 400000,
				"oriSum": 412000,
				"oriTax": 12000,
				"discountTaxType": "0",
				"oriTaxUnitPrice": 206,
				"oriUnitPrice": 200,
				"taxitems_code": "VAT9",
				"expenseItemId_code": "1445655442234",
				"priceQty": 2000,
				"productsku": "00000002",
				"product_cCode": "00000002",
				"priceUOM_Code": "001",
				"purUOM_Code": "001",
				"project_code": "888900000002",
				"qty": 2000,
				"rowno": "10",
				"subQty": 2000,
				"unitExchangeTypePrice": 0,
				"unitExchangeType": 0,
				"invPriceExchRate": 0.1,
				"warehouse_code": "9488383858",
				"unit_code": "001",
				"isGiftProduct": false,
				"bodyItem": {
					"id": "23432343234323",
					"define1": "23432343234323",
					"define2": "23432343234322"
				},
				"bodyFreeItem": {
					"id": "34543234543234",
					"define1": "34543234543234",
					"define2": "2345432345432"
				},
				"_status": "Insert",
				"signatory": "采购项目方",
				"outForeignBusinessmen_code": "WWS10002",
				"hasForeignInvestors": false,
				"bodyParallel": {
					"0": "1",
					"1": "4",
					"2": "5",
					"3": "1",
					"4": "4",
					"5": "6",
					"6": "4",
					"7": "4",
					"8": "1",
					"9": "5",
					"10": "0",
					"11": "8",
					"12": "2",
					"13": "7",
					"14": "0",
					"15": "8",
					"16": "9",
					"17": "9",
					"18": "7",
					"erpOrderBodyId": "1451464415082708997"
				}
			}
		],
		"_status": "Insert",
		"headParallel": {
			"erpOrderId": "1451464415082708997"
		},
		"vendor_code": "0000000001",
		"vouchdate": "2021-03-05 00:00:00",
		"tradeRouteID": 1451464415082708997,
		"tradeRouteID_code": "test001"
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
| data | object | 否 | 单据信息 |
| vendor_code | string | 否 | 供应商编码 示例：090206 |
| code | string | 否 | 单据编号 示例：00079 |
| invoiceVendor | long | 否 | 开票供应商id 示例：2277208958341376 |
| exchRate | number |
| 小数位数:8,最大长度:19 | 否 | 汇率 示例：1 |
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
| tenant | long | 否 | 租户id 示例：2067791299383552 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 总数量 示例：29.59 |
| moneysum | number |
| 小数位数:8,最大长度:28 | 否 | 金额 示例：1000.345555 |
| headItem | object | 否 | 表头自定义项 |
| headFreeItem | object | 否 | 表头自由自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
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
				"bodyItem": {
					"poiExcelRowNum": "1",
					"poiExcelSheetName": "PurchaseOrder(3)",
					"define1": "表体1",
					"pubts": "2021-08-30 18:13:15",
					"id": 2410387773526528
				},
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
		"tenant": 2067791299383552,
		"totalQuantity": 29.59,
		"moneysum": 1000.345555,
		"headItem": {
			"poiExcelRowNum": "1",
			"define2": "测试2",
			"define1": "测试1",
			"id": 2410387773493760,
			"poiExcelSheetName": "PurchaseOrder(2)",
			"pubts": "2021-08-30 18:13:15"
		},
		"headFreeItem": {
			"id": 2410387773493760,
			"poiExcelRowNum": 1,
			"poiExcelSheetName": "PurchaseOrder(1)",
			"pubts": "2021-08-30 18:13:15",
			"define1": "表头自由自定义项1"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-05-29

新增

请求参数 bAutoGetPriceForApi

修改参数


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

