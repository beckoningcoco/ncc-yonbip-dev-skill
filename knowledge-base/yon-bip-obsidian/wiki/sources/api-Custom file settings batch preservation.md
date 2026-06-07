---
title: "自定义档案设置批量保存V4"
apiId: "2175192122771636226"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "User-defined File Definition"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, User-defined File Definition]
platform_version: "BIP"
source_type: community-api-docs
---

# 自定义档案设置批量保存V4

> `ContentType	application/json` 请求方式	POST | 分类: User-defined File Definition (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/customerdocdef/batchSave

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
| data | object | 是 | 否 | 业务数据 |
| sourceUnique | string | 否 | 是 | 来源主键 示例：2211575684096589834 |
| id | string | 否 | 否 | 主键ID 示例：2211575684096589833 |
| code | string | 否 | 是 | 编码 示例：code001 |
| name | object | 否 | 是 | 默认按当前租户开通语种返回，当前为开通中英繁情况下返回格式 |
| description | object | 否 | 否 | 默认按当前租户开通语种返回，当前为开通中英繁情况下返回格式 |
| classify | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 是否多级：0表示否，1表示是 示例：0 默认值：0 |
| mcflag | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 是否分级管理：0表示否，1表示是 示例：0 默认值：0 |
| ispreset | boolean | 否 | 是 | 是否预置，通过api新增的必须为false 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/digitalModel/customerdocdef/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"sourceUnique": "2211575684096589834",
			"id": "2211575684096589833",
			"code": "code001",
			"name": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"description": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"classify": 0,
			"mcflag": 0,
			"ispreset": false
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| data | object | 否 | 保存数据记录 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 记录数 示例：10 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功记录数 示例：10 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败记录数 示例：0 |
| messages | object | 是 | 失败信息 |
| infos | object | 是 | 成功详情 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 10,
		"successCount": 10,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "2211575684096589834",
				"targetUnique": "2211575684096589833",
				"id": "2211575684096589833"
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

999-999-999999	调⽤失败时的错误信息


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

