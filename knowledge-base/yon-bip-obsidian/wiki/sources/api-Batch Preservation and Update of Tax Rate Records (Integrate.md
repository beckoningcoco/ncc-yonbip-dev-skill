---
title: "税率档案批量保存更新(集成)"
apiId: "2266207814143705092"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Rate Archive"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Rate Archive]
platform_version: "BIP"
source_type: community-api-docs
---

# 税率档案批量保存更新(集成)

> `ContentType	application/json` 请求方式	POST | 分类: Tax Rate Archive (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/tax/api/rate/save-or-update

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
| objid | string | 否 | 是 | 来源系统id |
| code | string | 否 | 是 | 编码 示例：VAT |
| name | string | 否 | 是 | 名称 示例：增值税税率 |
| scope | string | 否 | 是 | 适用范围(1:全部,2:采购,3:销售) 示例：1 |
| country | string | 否 | 否 | 国家主键 |
| countryCode | string | 否 | 否 | 国家编码 示例：CN |
| taxRateArchiveDetailList | object | 是 | 是 | 税率档案子表 最大请求量：500 |

## 3. 请求示例

Url: /yonbip/digitalModel/tax/api/rate/save-or-update?access_token=访问令牌
Body: {
	"data": [
		{
			"objid": "",
			"code": "VAT",
			"name": "增值税税率",
			"scope": "1",
			"country": "",
			"countryCode": "CN",
			"taxRateArchiveDetailList": [
				{
					"ntaxrate": 13,
					"effectiveDate": "2024-01-02",
					"invalidationDate": "2024-05-06",
					"taxfree": "false",
					"notaxation": "false"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 说明 示例：操作成功 |
| data | object | 否 | 成功或失败的数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：2 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功的条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败的条数 示例：1 |
| messages | object | 是 | 失败的数据 |
| infos | object | 是 | 成功的数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "2217322771360776304",
				"message": "税率明细生效期间冲突！"
			}
		],
		"infos": [
			{
				"sourceUnique": "2217322771360776304",
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

1	2025-08-28

更新

请求说明

新增

返回参数 messages

新增

返回参数 sourceUnique

新增

返回参数 message

删除

返回参数 message

删除

返回参数 sourceUnique

删除

返回参数 message

鉴权

2	2025-08-19

更新

请求说明

新增

返回参数 messages

新增

返回参数 sourceUnique

新增

返回参数 message

删除

返回参数 message

删除

返回参数 sourceUnique

删除

返回参数 message

3	2025-08-06

更新

请求说明

新增

请求参数 (4)

更新

请求参数 country

更新

请求参数 ntaxrate

删除

请求参数 (8)

新增

返回参数 sourceUnique

新增

返回参数 message

更新

返回参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

