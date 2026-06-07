---
title: "单个条码解析"
apiId: "2287840086947528713"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Barcode Generation"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Barcode Generation]
platform_version: "BIP"
source_type: community-api-docs
---

# 单个条码解析

> `ContentType	application/json` 请求方式	POST | 分类: Barcode Generation (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/barcode/yonbip-scm-stock/api/scanCode

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| keyword | string | 否 | 是 | 扫描的条码 示例：0105000003ABC00002 |

## 3. 请求示例

Url: /yonbip/scm/barcode/yonbip-scm-stock/api/scanCode?access_token=访问令牌
Body: {
	"keyword": "0105000003ABC00002"
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
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 是 | 响应数据 |
| product | number |
| 小数位数:0,最大长度:19 | 否 | 物料id 示例：1572371945001320454 |
| product_cName | string | 否 | 物料名称 示例：条码（浮动换算率） |
| product_cCode | string | 否 | 物料编码 示例：0001|000434 |
| skuId | string | 否 | skuid |
| skuName | string | 否 | sku名称 |
| skuCode | string | 否 | sku编码 |
| skufreecharacter | string | 否 | sku自由项特征组 |
| ruleType | string | 否 | 条码规则类型，支持类型【0：条码，1：箱码，2：批次码，4：序列号】 示例：0 |
| unitExchangeType | number |
| 小数位数:0,最大长度:1 | 否 | 换算方式，支持类型【0：固定换算，1：浮动换算】 示例：1 |
| scanCountUnit | number |
| 小数位数:0,最大长度:1 | 否 | 扫码计数单位，支持类型【0：主计量单位，1：库存单位】 示例：0 |
| barCodeRule | object | 否 | 条码规则 |
| parsingBarcodeRule | object | 否 | 条码的解析结果 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"product": 1572371945001320454,
			"product_cName": "条码（浮动换算率）",
			"product_cCode": "0001|000434",
			"skuId": "",
			"skuName": "",
			"skuCode": "",
			"skufreecharacter": "",
			"ruleType": "0",
			"unitExchangeType": 1,
			"scanCountUnit": 0,
			"barCodeRule": {
				"id": 2266315746660319237,
				"code": "2025051201",
				"name": "定长解析01",
				"regulationType": 0,
				"ruleType": 0,
				"iLength": 15,
				"isScanDetail": false,
				"isExternalCode": false,
				"isDoubleCheck": false,
				"isOutAutoDeBarcode": false,
				"isRepeatInStock": false,
				"isOneLine": false,
				"isNoInOut": false,
				"isOverGeneration": true,
				"isCustCheck": false,
				"isRepeatOutStock": false,
				"isFalsifying": false,
				"isRepeatGeneration": false,
				"isScanOverQty": 0,
				"modifierId": 1525641755939569667,
				"modifier": "u8c_vip管理员",
				"creatorId": 1525641755939569667,
				"creator": "u8c_vip管理员",
				"modifyDate": "2025-06-12 00:00:00",
				"modifyTime": "2025-06-12 17:04:30",
				"createDate": "2025-05-12 00:00:00",
				"createTime": "2025-05-12 15:11:18",
				"tenant": 2909930715861584,
				"ytenant": "0000L6YQ8AVLFUZPXD0000",
				"pubts": "2025-06-12 17:04:30",
				"barcodeRuleDetail": [
					{
						"id": 2266315746660319239,
						"lineno": 10,
						"cRuleType": 1,
						"isconstituent": 0,
						"cprefixseed": false,
						"iPosition": 1,
						"iLength": 11,
						"ytenant": "0000L6YQ8AVLFUZPXD0000",
						"iRuleID": 2266315746660319237,
						"tenant": 2909930715861584,
						"pubts": "2025-06-12 17:04:30"
					}
				]
			},
			"parsingBarcodeRule": {
				"productCode": "",
				"productBarcode": "",
				"mnemonicCode": "",
				"skuCode": "",
				"skuBarCode": "",
				"batch": "",
				"produceDate": "",
				"invalidDate": "",
				"snCode": "",
				"unit": "",
				"qty": "",
				"subQty": "",
				"checkCode": "",
				"serialNumber": "",
				"money": "",
				"characterData": {},
				"systemTime": "",
				"flag": "",
				"other": ""
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	条码解析异常


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

