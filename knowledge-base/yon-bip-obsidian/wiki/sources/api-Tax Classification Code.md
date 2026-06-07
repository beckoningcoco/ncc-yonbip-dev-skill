---
title: "税收分类码查询"
apiId: "2516445450745151489"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 税收分类码查询

> `ContentType	application/json` 请求方式	POST | 分类: Tax Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/MD/DPMTAX/TaxesClassification/tax-revenue/query-byConditons

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| field | string | query | 否 | 查询字段    默认值: ["id","country"] |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| country | string | 否 | 否 | 国家地区 示例：CN 默认值：CN |
| taxRevenueCodeList | string | 是 | 否 | 税收分类编码 示例：["3030101000000000000"] |
| speicialTagList | string | 是 | 否 | 特定业务 示例：["E26"] |
| speicialTagLike | string | 否 | 否 | 特定业务 示例：E26 |

## 3. 请求示例

Url: /yonbip/PFC/MD/DPMTAX/TaxesClassification/tax-revenue/query-byConditons?access_token=访问令牌&field=
Body: {
	"country": "CN",
	"taxRevenueCodeList": [
		"3030101000000000000"
	],
	"speicialTagList": [
		"E26"
	],
	"speicialTagLike": "E26"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| id | string | 否 | 主键 示例：1010101070000000000 |
| code | string | 否 | 税收分类编码 示例：1010101070000000000 |
| parentCode | string | 否 | 父级编码 示例：1010101000000000000 |
| name | string | 否 | 名称 示例：燕麦 |
| simpleName | string | 否 | 简称 示例：谷物 |
| taxDesc | string | 否 | 描述 示例：包括裸燕麦、皮燕麦。 |
| country | string | 否 | 国家地区 示例：CN |
| isEnd | string | 否 | 是否末级 示例：1 |
| TaxClassPolicyList | object | 是 | 税收政策 |
| taxRevenueCode | string | 否 | 税收分类编码 示例：1010101070000000000 |
| name | string | 否 | 政策名称 示例：简易征收 |

## 5. 正确返回示例

{
	"id": "1010101070000000000",
	"code": "1010101070000000000",
	"parentCode": "1010101000000000000",
	"name": "燕麦",
	"simpleName": "谷物",
	"taxDesc": "包括裸燕麦、皮燕麦。",
	"country": "CN",
	"isEnd": "1",
	"TaxClassPolicyList": [
		{
			"taxRevenueCode": "1010101070000000000",
			"name": "简易征收"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

