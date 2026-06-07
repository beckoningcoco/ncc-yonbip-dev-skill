---
title: "根据单据类型编码查询交易类型"
apiId: "29494367b12b445db2adcc2de531cf1f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transaction Type"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transaction Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据单据类型编码查询交易类型

> `ContentType	application/json` 请求方式	POST | 分类: Transaction Type (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/transtype/queryByBillTypeCodes

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
| codes | string | 是 | 是 | 单据类型编码数组或单据类型id数组 |

## 3. 请求示例

Url: /yonbip/digitalModel/transtype/queryByBillTypeCodes?access_token=访问令牌
Body: {
	"codes": [
		""
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 操作返回编码，200为成功 示例：200 |
| message | string | 否 | 操作返回消息 示例：操作成功 |
| data | object | 是 | 接口返回数据 |
| billtype_id | string | 否 | 单据类型id 示例：FICM2 |
| code | string | 否 | 单据类型编码或id 示例：FICM2 |
| data | object | 是 | 此单据类型下的交易类型 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"billtype_id": "FICM2",
			"code": "FICM2",
			"data": [
				{
					"code": "arap_payment_other",
					"sysid": "CM",
					"billtype_id": "FICM2",
					"memo": {
						"zh_CN": "其他付款   ",
						"zh_TW": "其他付款",
						"en_US": "Other Payments"
					},
					"default": "1",
					"name": {
						"zh_CN": "其他付款   ",
						"zh_TW": "其他付款",
						"en_US": "Other Payments"
					},
					"id": "11530911359601201",
					"pubts": "2020-05-20 13:39:27",
					"preset": "1",
					"enable": "1",
					"extend_attrs_json": "{\\\"MKTPartner\\\":\\\"true\\\"}"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

更新

返回参数 (23)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

