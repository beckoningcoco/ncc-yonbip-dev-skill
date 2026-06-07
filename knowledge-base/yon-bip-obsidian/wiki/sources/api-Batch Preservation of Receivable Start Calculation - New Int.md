---
title: "收款起算批量保存-新集成"
apiId: "2201585761962164231"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Start Date"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Start Date]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款起算批量保存-新集成

> `ContentType	application/json` 请求方式	POST | 分类: Collection Start Date (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/receivestartbase/batchSave

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
| id | string | 否 | 否 | 主键 示例：1604976699624129617 |
| code | string | 否 | 是 | 编码 示例：NotSet |
| name | object | 否 | 是 | 名称，根据租户开通的语种传入 |
| enable | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 状态，1：启用 2：停用 示例：1 |
| order | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 顺序 示例：1 |
| comment | string | 否 | 否 | 备注 示例：收款起算备注说明 |
| sourceUnique | string | 否 | 是 | 源系统唯一健 示例：1604976699624129617 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/receivestartbase/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"id": "1604976699624129617",
			"code": "NotSet",
			"name": {
				"zh_TW": "不设起算日、到期日",
				"en_US": "No Set Start",
				"zh_CN": "不设起算日、到期日"
			},
			"enable": 1,
			"order": 1,
			"comment": "收款起算备注说明",
			"sourceUnique": "1604976699624129617"
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
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

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

