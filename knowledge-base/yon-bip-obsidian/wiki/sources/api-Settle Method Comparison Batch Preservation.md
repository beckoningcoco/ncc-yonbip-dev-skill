---
title: "结算方式对照批量保存V3"
apiId: "2174283582585962503"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Method Mapping"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Method Mapping]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算方式对照批量保存V3

> `ContentType	application/json` 请求方式	POST | 分类: Payment Method Mapping (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/settlemethodcontrast/batchSave

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
| matchRule | string | 否 | 否 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据。 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 否 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add |
| data | object | 是 | 否 | 请求体 |
| bankAccountId | string | 否 | 否 | 银行账号（与bankAccountId___code二选一录入即可，默认id有值时，code字段不生效） 示例：2211575684096589833 |
| bankAccountId___code | string | 否 | 否 | 银行账号编码 示例：1 |
| cashAccountId | string | 否 | 否 | 与cashAccountId___code二选一录入即可，默认id有值时，code字段不生效 示例：2211575684096589833 |
| cashAccountId___code | string | 否 | 否 | 现金账号编码 示例：1 |
| comment | string | 否 | 否 | 备注 示例：备注 |
| currency | string | 否 | 否 | 币种（与currency___code二选一录入即可，默认id有值时，code字段不生效） 示例：2211575684096589833 |
| currency___code | string | 否 | 否 | 币种编码 示例：1 |
| isDefault | boolean | 否 | 否 | 是否默认 示例：false |
| onlineShopId | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 电商店铺（与onlineShopId___code二选一录入即可，默认id有值时，code字段不生效） 示例：2211575684096589833 |
| onlineShopId___code | string | 否 | 否 | 电商店铺编码 示例：1 |
| order | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 顺序 示例：1 |
| orgId | string | 否 | 否 | 组织（与orgId___code二选一录入即可，默认id有值时，code字段不生效） 示例：2211575684096589833 |
| orgId___code | string | 否 | 否 | 组织编码 示例：2 |
| settleMethodId | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 结算方式（与settleMethodId___code二选一录入即可，默认id有值时，code字段不生效） 示例：2211575684096589833 |
| settleMethodId___code | string | 否 | 否 | 结算方式编码 示例：dsa |
| storeId | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 门店（与storeId___code二选一录入即可，默认id有值时，code字段不生效） 示例：2211575684096589833 |
| storeId___code | string | 否 | 否 | 门店编码 示例：kjl |
| sourceUnique | string | 否 | 是 | 来源主键 示例：2211575684096589833 |
| id | string | 否 | 否 | 主键 示例：2211575684096589833 |

## 3. 请求示例

Url: /yonbip/digitalModel/settlemethodcontrast/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"bankAccountId": "2211575684096589833",
			"bankAccountId___code": "1",
			"cashAccountId": "2211575684096589833",
			"cashAccountId___code": "1",
			"comment": "备注",
			"currency": "2211575684096589833",
			"currency___code": "1",
			"isDefault": false,
			"onlineShopId": 2211575684096589833,
			"onlineShopId___code": "1",
			"order": 1,
			"orgId": "2211575684096589833",
			"orgId___code": "2",
			"settleMethodId": 2211575684096589833,
			"settleMethodId___code": "dsa",
			"storeId": 2211575684096589833,
			"storeId___code": "kjl",
			"sourceUnique": "2211575684096589833",
			"id": "2211575684096589833"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| success | boolean | 否 | 保存成功时返回true |
| data | object | 否 | 保存数据记录 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 记录数 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功记录数 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败记录数 |
| messages | object | 是 | 失败信息 |
| infos | object | 是 | 成功详情 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000066 |
| level | number |
| 小数位数:0,最大长度:2 | 否 | 异常级别 示例：0：错误，1：警告 |

## 5. 正确返回示例

{
	"code": "",
	"success": true,
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "",
				"targetUnique": "",
				"id": ""
			}
		]
	},
	"displayCode": "000-525-000066",
	"level": NaN
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

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

