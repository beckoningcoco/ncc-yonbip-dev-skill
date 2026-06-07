---
title: "企业现金账户批量保存V7"
apiId: "2173702851475275781"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Cash Account Details"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Cash Account Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业现金账户批量保存V7

> `ContentType	application/json` 请求方式	POST | 分类: Enterprise Cash Account Details (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/orgfincashacct/batchSave

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
| id | string | 否 | 否 | 主键ID 示例：2217400106521460744 |
| code | string | 否 | 是 | 编码 示例：ttttttt |
| name | object | 否 | 是 | 名称，根据租户开通的语种传入，当前为开通中英繁情况下传入格式 |
| description | object | 否 | 否 | 描述，根据租户开通的语种传入，当前为开通中英繁情况下传入格式 |
| enable | number |
| 小数位数:2,最大长度:11 | 否 | 否 | 启用状态，0-未启用 1-启用 2-停用 示例：1 |
| orgid | string | 否 | 否 | 所属组织，与orgid___code二选一录入即可，默认id有值时，code字段不生效 示例：2578616857580032 |
| orgid___code | string | 否 | 否 | 所属组织编码，与orgid二选一录入即可，orgid为空时，按code匹配组织 示例：xianjinzuzhi1 |
| accountOpenDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 开户日期 示例：2019-12-17 |
| currency | string | 否 | 否 | 币种，与currency___code二选一录入即可，默认id有值时，code字段不生效 示例：1002Z0100000000001K4 |
| currency___code | string | 否 | 否 | 币种编码，与currency二选一录入即可，currency为空时，按code匹配币种 示例：GBP |
| isdefault | boolean | 否 | 是 | 是否默认，true-是 false-否 示例：false |
| sourceUnique | string | 否 | 是 | 来源系统id 示例：2217400106521460744 |

## 3. 请求示例

Url: /yonbip/digitalModel/orgfincashacct/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"id": "2217400106521460744",
			"code": "ttttttt",
			"name": {
				"zh_CN": "现金账户测试",
				"en_US": "Cash Account Test",
				"zh_TW": "現金賬戶測試"
			},
			"description": {
				"zh_CN": "简体中文",
				"en_US": "Simplified Chinese",
				"zh_TW": "簡體中文"
			},
			"enable": 1,
			"orgid": "2578616857580032",
			"orgid___code": "xianjinzuzhi1",
			"accountOpenDate": "2019-12-17",
			"currency": "1002Z0100000000001K4",
			"currency___code": "GBP",
			"isdefault": false,
			"sourceUnique": "2217400106521460744"
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
				"sourceUnique": "2217400106521460746",
				"targetUnique": "2217400106521460747",
				"id": "2217400106521460747"
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

