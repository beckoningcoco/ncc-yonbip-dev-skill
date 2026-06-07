---
title: "销售发货提交"
apiId: "f0a726460bcf4d459de19339f648e4d5"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Shipping Document"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Shipping Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发货提交

> `ContentType	application/json` 请求方式	POST | 分类: Sales Shipping Document (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherdelivery/submit

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
| data | object | 否 | 是 | 发货单[voucher.delivery.DeliveryVoucher] |
| id | long | 是 | 是 | 发货单主表id 示例：[2088849684795648] |

## 3. 请求示例

Url: /yonbip/sd/voucherdelivery/submit?access_token=访问令牌
Body: {
	"data": {
		"id": [
			2088849684795648
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
| code | long | 否 | 返回码 示例：200 |
| message | string | 否 | 调用完成后的信息提示 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| count | long | 否 | 总数量 示例：1 |
| sucessCount | long | 否 | 成功的条数 示例：1 |
| failCount | long | 否 | 失败的条数 示例：0 |
| messages | string | 是 | 信息 |
| infos | object | 是 | 信息 |
| failInfos | string | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"purUOM_Precision": "2",
				"verifystate": 1,
				"agentId": 2098769631318272,
				"code": "66BG-0000000000-20210827-000000",
				"bizFlow": "8641b337-be22-11eb-badc-00163e0abb70",
				"payStatusCode": "NOTPAYMENT",
				"settVoucherType": "ORDER",
				"vouchdate": "2021-08-27 00:00:00",
				"payMoney": 11792,
				"bizFlow_version": "V3.0",
				"stockOrgName": "AAA",
				"totalOutStockPriceQty": "0",
				"id": 2406082187088384,
				"agentId_name": "11",
				"pubts": "2021-10-21 11:06:21",
				"deliveryDetailPrices": {
					"natMoney": "10435.398",
					"natTax": "1356.602"
				},
				"isFlowCoreBill": false,
				"oriSum": "11792",
				"transactionTypeId": "2097662145843459",
				"isWfControlled": true,
				"logisticWayId": 0,
				"agentRelationId_agentCategoryId_name": "11",
				"pubuts": "2021-10-21 11:06:00",
				"barCode": "voucher_delivery|2406082187088384",
				"createTime": "2021-08-27 17:13:22",
				"unit_Precision": "2",
				"stockOrgId": "2098757656416512",
				"statusCode": "APPROVING",
				"status": 3,
				"salesOrgId": "2098757656416512",
				"creditBalance": 0,
				"deliveryPrice": {
					"exchRate": "1",
					"currency": "2097662046049792",
					"exchangeRateType_name": "基准汇率",
					"originalName": "人民币",
					"originalCode": "CNY",
					"natCurrency_priceDigit": "6",
					"domesticName": "人民币",
					"natCurrency": "2097662046049792",
					"exchangeRateType": "iid8ifzk",
					"currency_priceDigit": "6",
					"currency_moneyDigit": "3",
					"natCurrency_moneyDigit": "3",
					"domesticCode": "CNY",
					"uordercorp": "2097660412236032"
				}
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	没有查询到对应的单据，请检查相关数据！	请查询单据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

