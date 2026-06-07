---
title: "销售发货弃审"
apiId: "d7ee0ebe1204436c89250d252e945a7a"
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

# 销售发货弃审

> `ContentType	application/json` 请求方式	POST | 分类: Sales Shipping Document (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherdelivery/unaudit

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
| id | long | 是 | 否 | 发货单id，发货单ID和退货单据编号不能同时为空，ID和单据编号同时存在以ID为准 示例：[2088849684795648] |
| code | string | 是 | 否 | 单据编号，发货单ID和发货单据编号不能同时为空，ID和单据编号同时存在以ID为准 示例：["TI5424210810000003"] |

## 3. 请求示例

Url: /yonbip/sd/voucherdelivery/unaudit?access_token=访问令牌
Body: {
	"data": {
		"id": [
			2088849684795648
		],
		"code": [
			"TI5424210810000003"
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
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| count | long | 否 | 数据总条数 示例：1 |
| sucessCount | long | 否 | 成功数据条数 示例：1 |
| failCount | long | 否 | 失败数据条数 示例：0 |
| messages | string | 是 | 失败返回信息 |
| infos | object | 是 | 成功返回数据 |

## 5. 正确返回示例

{
	"code": "200",
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
				"unConfirmPrice": 0,
				"iConfirmUserId": 2314091620618496,
				"shippingChoiceId": 2216989216610623,
				"orderId": 2405697314935808,
				"deliveryPayMoney": 300,
				"receiveContacter": "光头强",
				"modifier": "张佳兴",
				"modifierId": 2314091620618496,
				"payStatusCode": "NOTPAYMENT",
				"invoiceAddress": "北清路68号",
				"source": "0",
				"realMoney": 300,
				"settVoucherType": "ORDER",
				"logisticsUserPhone": "123456",
				"modifyTime": "2021-08-27 10:44:02",
				"reight": 0,
				"enable": true,
				"invoiceTitleType": 0,
				"bizId": 2155538208313600,
				"receiveContacterPhone": "13400000001",
				"modifyInvoiceType": true,
				"deliveryRealMoney": 300,
				"id": 2405699153482496,
				"invoiceTitle": "四海",
				"bankAccount": "123456",
				"receiver": "光头强",
				"modifyDate": "2021-08-27 10:44:02",
				"receiveAddress": "北清路68号",
				"isWfControlled": false,
				"totalMoney": 300,
				"agentRelationId": 2263009425510656,
				"invoiceAgentId": 2263009400901888,
				"version": 0,
				"barCode": "voucher_delivery|2405699153482496",
				"rebateToOrderMoney": 0,
				"sourceType": "voucher_order",
				"systemDate": "2021-08-27 10:44:02",
				"settlementOrgId": "2262779338265344",
				"statusCode": "DELIVERUNAUDITED",
				"status": 0,
				"subBankName": "永丰支行",
				"verifystate": 0,
				"agentId": 2263009400901888,
				"code": "66BG-0000000000-20210827-000002",
				"logisticsCarNum": "123456",
				"logisticsUserName": "123456",
				"defaultReceiveDay": 0,
				"shippingMemoId": 0,
				"confirmPrice": 0,
				"creatorId": 2314091620618496,
				"bankName": "中国银行",
				"rebateToCashMoney": 0,
				"vouchdate": "2021-08-27 00:00:00",
				"payMoney": 300,
				"stockOrgName": "九江酷酷熊",
				"invoiceTelephone": "13400000001",
				"receiveTelePhone": "110",
				"taxNum": "123456",
				"pubts": "2021-08-27 11:08:50",
				"receiveMobile": "1340000001",
				"createDate": "2021-08-27 10:43:44",
				"creator": "张佳兴",
				"uordercorp": 2155538208313600,
				"logisticsBillNo": "123456",
				"transactionTypeId": "2155547426656516",
				"logisticWayId": 2154744480764413,
				"receiveId": 2263127923609856,
				"deleted": 0,
				"settlementOrgName": "九江酷酷熊",
				"createTime": "2021-08-27 10:43:44",
				"stockOrgId": "2262779338265344",
				"invoiceAgentName": "四海",
				"invoiceUpcType": 1
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	"Index: 0, Size: 0"	请查找正确的数据


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

