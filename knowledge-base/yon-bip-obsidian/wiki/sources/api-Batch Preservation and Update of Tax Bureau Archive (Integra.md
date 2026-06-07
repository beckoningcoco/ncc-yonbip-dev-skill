---
title: "税制档案批量保存更新(集成)"
apiId: "2266286712692932614"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax system file"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax system file]
platform_version: "BIP"
source_type: community-api-docs
---

# 税制档案批量保存更新(集成)

> `ContentType	application/json` 请求方式	POST | 分类: Tax system file (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/tax/api/bureau/save-or-update

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
| data | object | 是 | 是 | 数据 |
| country | string | 否 | 否 | 国家地区 示例：12312 |
| countryCode | string | 否 | 否 | 国家地区编码 示例：CN |
| name | string | 否 | 是 | 税制名称 示例：中国税务局 |
| code | string | 否 | 是 | 编码 示例：CHNBRE |
| level | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 税制级别 示例：1 |
| effectiveDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 生效日期 示例：2025-01-01 |
| invalidationDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 失效日期 示例：2025-01-01 |
| id | string | 否 | 是 | 主键 示例：123456789 |
| currency | string | 否 | 否 | 默认纳税币种 示例：21432434 |
| currencyCode | string | 否 | 否 | 默认纳税币种编码 示例：CNY |
| defaultPrecision | string | 否 | 否 | 默认精度 示例：1 |
| taxRoundingRule | string | 否 | 否 | 默认舍入规则 示例：8 |
| exchangeRateType | string | 否 | 否 | 汇率类型的主键 示例：23414425 |
| exchangeRateTypeCode | string | 否 | 否 | 汇率类型的编码 示例：VAT |

## 3. 请求示例

Url: /yonbip/digitalModel/tax/api/bureau/save-or-update?access_token=访问令牌
Body: {
	"data": [
		{
			"country": "12312",
			"countryCode": "CN",
			"name": "中国税务局",
			"code": "CHNBRE",
			"level": 1,
			"effectiveDate": "2025-01-01",
			"invalidationDate": "2025-01-01",
			"id": "123456789",
			"currency": "21432434",
			"currencyCode": "CNY",
			"defaultPrecision": "1",
			"taxRoundingRule": "8",
			"exchangeRateType": "23414425",
			"exchangeRateTypeCode": "VAT"
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
				"sourceUnique": "2217322771360776202",
				"targetUnique": "2217322771360776203",
				"id": "2217322771360776203"
			}
		]
	}
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

