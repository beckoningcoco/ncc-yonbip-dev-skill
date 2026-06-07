---
title: "汇率批量保存V7"
apiId: "2199504360701952008"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Exchange Rate Details"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Exchange Rate Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率批量保存V7

> `ContentType	application/json` 请求方式	POST | 分类: Exchange Rate Details (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/exchangerate/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| matchRule | string | 否 | 是 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据。 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 是 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add |
| data | object | 是 | 否 | 请求体 |
| id | string | 否 | 否 | 主键 示例：2162598746106888200 |
| sourceCurrencyId | string | 否 | 否 | 原币种主键，与原币种编码二选一，必填 示例：1604976699624128545 |
| sourceCurrencyId___code | string | 否 | 否 | 原币种编码，与原币种主键二选一，必填 示例：JPY |
| targetCurrencyId | string | 否 | 否 | 目标币种主键，与目标币种编码二选一，必填 示例：1604976699624128540 |
| targetCurrencyId___code | string | 否 | 否 | 目标币种编码，与目标币种主键二选一，必填 示例：CNY |
| quotationDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 报价日期，yyyy-MM-dd 示例：2024-12-23 |
| exchangerateSchemeId | string | 否 | 否 | 汇率方案 示例：G001ZM0000DEFAULTRATESCHEME00001 |
| exchangeRateType | string | 否 | 否 | 汇率类型主键，与汇率类型编码二选一，必填 示例：0000LB7GORZKFK09HO0000 |
| exchangeRateType___code | string | 否 | 否 | 汇率类型编码，与汇率类型主键二选一，必填 示例：E01 |
| exchangeRate | number |
| 小数位数:8,最大长度:18 | 否 | 否 | 直接汇率，与间接汇率相乘等于1，与汇率类型精度保持一致作四舍五入，可与间接汇率二选一输入。 示例：1.2 |
| indirectExchangeRate | number |
| 小数位数:8,最大长度:18 | 否 | 否 | 间接汇率，与直接汇率相乘等于1，与汇率类型精度保持一致作四舍五入，可与直接汇率二选一输入。 示例：0.833333 |
| sourceUnique | string | 否 | 是 | 来源唯一键 示例：2162598746106888200 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/exchangerate/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"id": "2162598746106888200",
			"sourceCurrencyId": "1604976699624128545",
			"sourceCurrencyId___code": "JPY",
			"targetCurrencyId": "1604976699624128540",
			"targetCurrencyId___code": "CNY",
			"quotationDate": "2024-12-23",
			"exchangerateSchemeId": "G001ZM0000DEFAULTRATESCHEME00001",
			"exchangeRateType": "0000LB7GORZKFK09HO0000",
			"exchangeRateType___code": "E01",
			"exchangeRate": 1.2,
			"indirectExchangeRate": 0.833333,
			"sourceUnique": "2162598746106888200"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功是返回200 示例：200 |
| data | object | 否 | 调用成功时的返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：10 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：9 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：1 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 成功数据信息 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | string | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "2179483104347947010",
				"message": "编码冲突！"
			}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "2179483104347947011",
				"targetUnique": "2179483104347947020",
				"id": "2179483104347947020"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": "0"
}

## 6. 业务异常码

000-525-000066

传入的数据列表为空或存在空对象，请检查代码

000-525-000067

执行批量操作时，数据必须包含sourceUnique


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-30

更新

请求参数 sourceCurrencyId

更新

请求参数 sourceCurrencyId___code

api文档中，所有的“源币种”都改为“原币种”

2	2025-07-01

更新

请求说明

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

