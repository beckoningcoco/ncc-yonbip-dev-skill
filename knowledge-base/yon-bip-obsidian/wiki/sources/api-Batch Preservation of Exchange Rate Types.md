---
title: "汇率类型批量保存V7"
apiId: "2173717978350092291"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Exchange Rate Type"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Exchange Rate Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率类型批量保存V7

> `ContentType	application/json` 请求方式	POST | 分类: Exchange Rate Type (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/exchangerate_type/batchSave

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
| matchRule | string | 否 | 是 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 是 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理 示例：add 默认值：add |
| data | object | 是 | 否 | 业务数据 |
| id | string | 否 | 否 | 主键ID 示例：2217349090920366088 |
| code | string | 否 | 是 | 编码 示例：testasdf |
| name | object | 否 | 是 | 名称，根据租户开通的语种传入 |
| description | string | 否 | 否 | 描述 示例：新加汇率类型描述 |
| enable | number |
| 小数位数:2,最大长度:11 | 否 | 否 | 启用状态，1-启用 2-停用 示例：1 |
| digit | number |
| 小数位数:2,最大长度:8 | 否 | 是 | 精度，请输入0-18范围内的数字 示例：3 |
| syncOriginExchangeRate | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 请选择汇率，0:现汇买入、1:现汇卖出、3:现钞卖出、2:现钞买入、4:平均价 示例：4 |
| isMapHistoryDate | number |
| 小数位数:2,最大长度:6 | 否 | 否 | 是否向历史日期匹配 示例：1 |
| exchangeRateTypeConfigDefineVO | object | 是 | 否 | 汇率类型同步配置自定义表 |
| sourceUnique | string | 否 | 是 | 来源系统id 示例：2217349090920366088 |

## 3. 请求示例

Url: /yonbip/digitalModel/exchangerate_type/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"id": "2217349090920366088",
			"code": "testasdf",
			"name": {
				"zh_CN": "简体中文",
				"en_US": "Simplified Chinese",
				"zh_TW": "簡體中文"
			},
			"description": "新加汇率类型描述",
			"enable": 1,
			"digit": 3,
			"syncOriginExchangeRate": 4,
			"isMapHistoryDate": 1,
			"exchangeRateTypeConfigDefineVO": [
				{
					"sourceCurrencyId": "1001A110000000001GUS",
					"sourceCurrencyId___code": "RUB",
					"targetCurrencyId": "1001A11000000000YEI8",
					"targetCurrencyId___code": "NZD",
					"exchangeConversionMethod": 1,
					"bankSource": "ICBC"
				}
			],
			"sourceUnique": "2217349090920366088"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | successCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | object | 是 | messages 示例：[] |
| infos | object | 是 | infos |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [],
		"infos": [
			{
				"created": true,
				"sourceUnique": "2217349090920366090",
				"targetUnique": "2217349090920366091",
				"id": "2217349090920366091"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": 0
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

2	2025-09-26

更新

请求说明

新增

请求参数 isMapHistoryDate

新增

请求参数 exchangeConversionMethod

新增

请求参数 bankSource

更新

请求参数 syncOriginExchangeRate

删除

请求参数 autoUpdate

删除

请求参数 syncOriginBank

删除

请求参数 syncScope

新增

返回参数 sourceUnique

新增

返回参数 message

更新

返回参数 level

3	2025-07-01

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

