---
title: "签收确认列表查询"
apiId: "1439381778761515008"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sign-in Confirmation Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sign-in Confirmation Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 签收确认列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sign-in Confirmation Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/signconfirmation/list

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
| pageIndex | long | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 每页数 示例：10 默认值：10 |
| stockOrg | long | 否 | 否 | 库存组织id 示例：2356392404080640 |
| stockOrg_code | string | 否 | 否 | 库存组织编码 示例：cc |
| salesOrg | string | 否 | 否 | 销售组织id 示例：2356392404080640 |
| salesOrg_code | string | 否 | 否 | 销售组织编码 示例：cc |
| cust | long | 否 | 否 | 客户id 示例：2592843724003328 |
| cust_code | string | 否 | 否 | 客户编码 示例：0002 |
| code | string | 否 | 否 | 单据编号 示例：QSQR202204290001 |
| upcode | string | 否 | 否 | 来源单号 示例：XSCK20220429000001 |
| bustype | long | 否 | 否 | 交易类型id 示例：2592843724003328 |
| bustype_code | string | 否 | 否 | 交易类型编码 示例：x001 |
| department | long | 否 | 否 | 部门id 示例：2419872714969344 |
| department_code | string | 否 | 否 | 部门编码 示例：cc |
| corpContact | long | 否 | 否 | 业务员id 示例：2697460861718784 |
| corpContact_code | string | 否 | 否 | 业务员编码 示例：00000001 |
| isSum | boolean | 否 | 否 | 查询表头或表头+明细，true查询表头，false查询表头+明细 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 查询条件 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或)，当使用conditions查询条件时必填 示例：and |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/scm/signconfirmation/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"stockOrg": 2356392404080640,
	"stockOrg_code": "cc",
	"salesOrg": "2356392404080640",
	"salesOrg_code": "cc",
	"cust": 2592843724003328,
	"cust_code": "0002",
	"code": "QSQR202204290001",
	"upcode": "XSCK20220429000001",
	"bustype": 2592843724003328,
	"bustype_code": "x001",
	"department": 2419872714969344,
	"department_code": "cc",
	"corpContact": 2697460861718784,
	"corpContact_code": "00000001",
	"isSum": false,
	"simpleVOs": [
		{
			"logicOp": "and",
			"conditions": [
				{
					"field": "code",
					"op": "eq",
					"value1": "123",
					"value2": "456"
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
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 分页大小 示例：10 |
| recordCount | long | 否 | 总记录数 示例：574 |
| recordList | object | 是 | 返回结果对象 |
| sumRecordList | object | 是 | 汇总 |
| pageCount | long | 否 | 总页数 示例：58 |
| beginPageIndex | long | 否 | 开始页 示例：1 |
| endPageIndex | long | 否 | 结束页 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 574,
		"recordList": [
			{
				"saleArea_name": "华北大区",
				"saleArea": 1471497053137272835,
				"details_expireDateNofirstsourceid": 2745395784946432,
				"currency_priceDigit": 4,
				"corpContact_name": "李亚苹",
				"invoiceOrg": "2353226125496576",
				"details_stockUnitId": 2352410771869952,
				"subWarehouse": "2352410771869951",
				"autoGeneratePurchase": false,
				"details_expireDateNosourceautoid": 2745399065514241,
				"bustype_name": "销售签收确认",
				"details_productsku_cCode": "000009",
				"details_orderProductType": "SALE",
				"details_priceUOM_name": "件",
				"subWarehouse_name": "仓库",
				"natCurrency": "2351874939032064",
				"details_expireDateNosourceid": 2745399065514240,
				"details_productsku_cName": "商品分类测试1",
				"id": 2745434712707328,
				"natCurrencyName": "人民币",
				"details_unit": "件",
				"details_subQty": 10,
				"salesOrg_name": "AAA",
				"corpContact": "2697460861718784",
				"details_priceUOM": 2352410771869952,
				"isWfControlled": true,
				"details_natUnitPrice": 30,
				"details_expireDateNofirstsource": "udinghuo.voucher_order",
				"warehouse": 2424326570529024,
				"details_product_cCode": "000009",
				"barCode": "usp_signconfirmation|2745434712707328",
				"details_natMoney": 60,
				"warehouse_name": "电商1",
				"details_receivedSubQty": 2,
				"natCurrency_moneyDigit": 2,
				"details_natTax": 0,
				"natCurrency_priceDigit": 4,
				"exchRateType": "0000KRBF48WG59AUYJ0000",
				"details_invPriceExchRate": 1,
				"details_taxRate": 0,
				"details_oriUnitPrice": 30,
				"status": "0",
				"details_receivedBilling": false,
				"details_receivedQty": 2,
				"details_unit_Precision": 2,
				"verifystate": 0,
				"currency_moneyDigit": 2,
				"code": "QSQR202204240747",
				"details_productsku": 2353679837090048,
				"details_unit_name": 2352410771869952,
				"exchRate": 1,
				"salesOrg": "2353226125496576",
				"invoiceOrg_name": "AAA",
				"details_priceQty": 2,
				"details_varianceQty": 7,
				"vouchdate": "2022-04-24 00:00:00",
				"details_product_cName": "商品分类测试1",
				"details_stockUnit_name": "件",
				"details_oriSum": 60,
				"currencyName": "人民币",
				"details_natSum": 60,
				"details_natTaxUnitPrice": 30,
				"currency": "2351874939032064",
				"cust_name": "国网新疆电力有限公司",
				"department": "2352116179849472",
				"pubts": "2022-04-24 10:40:37",
				"org_name": "AAA",
				"createDate": "2022-04-24 00:00:00",
				"details_varianceSubQty": 7,
				"details_oriTaxUnitPrice": 30,
				"creator": "门浩",
				"details_expireDateNosourceType": "st_salesout",
				"org": "2353226125496576",
				"details_oriMoney": 60,
				"details_qty": 10,
				"exchRateType_name": "基准汇率",
				"department_name": "财资部",
				"details_invExchRate": 1,
				"bustype": "2592843724003328",
				"details_id": 2745434712707329,
				"details_expireDateNoupcode": "XSCK20220424000002",
				"details_oriTax": 0,
				"createTime": "2022-04-24 10:40:36",
				"details_expireDateNofirstupcode": "UO-657620220424000003",
				"details_expireDateNofirstsourceautoid": 2745395784946433,
				"details_stockUnitId_Precision": 2,
				"details_product": 2353679830896896,
				"details_unitName": "件",
				"cust": "1439366480086958081",
				"headItem": {
					"define1": "1",
					"id": 2745434712707328
				},
				"postAccountStatus": 99,
				"details_salesoutAccountingMethod": "signconfirmationEstimate",
				"details_stockAccount": "sendGoods",
				"details_costBillNoType": "usp_signconfirmation",
				"noPostReasonMsg": "11",
				"postAccountVersion": 1,
				"exchRateDate": "2024-04-16 12:12:12",
				"details_costCenter_code": "11",
				"details_costCenter_name": "11",
				"details_providerProfitCenter_name": "11",
				"details_providerProfitCenter_code": "11",
				"details_consumerProfitCenter_code": "11",
				"details_consumerProfitCenter_name": "11",
				"details_isUpdateCost": 1,
				"details_invoiceCust_name": "张三",
				"details_costCenter": 1942697846575726593,
				"details_providerProfitCenter": "1942697717723561992",
				"details_consumerProfitCenter": "1942697717723561992",
				"details_invoiceCust": 1933704391227867144,
				"details_checkByRevenueManagement": 1,
				"details_rclRecconfirmed": 1,
				"details_excessiveSigning": 1
			}
		],
		"sumRecordList": [
			{
				"details_receivedQty": 11441.1,
				"details_varianceQty": 1311.6,
				"details_natMoney": 40635.4782,
				"details_oriSum": 50826.4583,
				"details_receivedSubQty": 12992.30891336,
				"details_oriMoney": 44945.4282,
				"details_natSum": 90480.9515,
				"details_qty": 12978,
				"details_priceQty": 105406.54666667,
				"details_varianceSubQty": 881.03,
				"details_subQty": 12073.19666667
			}
		],
		"pageCount": 58,
		"beginPageIndex": 1,
		"endPageIndex": 10
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-29

新增

返回参数 subWarehouse

新增

返回参数 subWarehouse_name

2	2025-09-04

更新

返回参数 details_stockAccount


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

