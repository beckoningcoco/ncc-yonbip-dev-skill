---
title: "项目类别批量保存V5"
apiId: "2178724621716029441"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目类别批量保存V5

> `ContentType	application/json` 请求方式	POST | 分类: Project Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/projectClass/batchSave

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
| unmatchedStrategy | string | 否 | 是 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理 示例：add 默认值：add |
| data | object | 是 | 否 | 请求体 |
| sourceUnique | string | 否 | 是 | 源系统唯一标识 示例：2211575684096589831 |
| id | string | 否 | 否 | 主键ID 示例：2211575684096589831 |
| code | string | 否 | 是 | 编码 示例：001 |
| description | object | 否 | 否 | 描述(根据租户开通的语种传入，当前为开通中英繁情况下传入格式) |
| enable | number |
| 小数位数:0,最大长度:11 | 否 | 否 | 启用状态(1:启用,2:停用.新增时默认启用) 示例：1 |
| name | object | 否 | 是 | 名称(根据租户开通的语种传入，当前为开通中英繁情况下传入格式) |
| orgid | string | 否 | 否 | 所属组织id(与orgid___code二选一录入即可，默认orgid有值时，orgid___code字段不生效) 示例：666666 |
| orgid___code | string | 否 | 否 | 所属组织编码(与orgid二选一录入即可，orgid为空时，按orgid___code匹配) 示例：global00 |
| parent | string | 否 | 否 | 上级分类(与parent___code二选一录入即可，默认parent有值时，parent___code字段不生效) 示例：2211575684096589833 |
| parent___code | string | 否 | 否 | 上级分类编码(与parent二选一录入即可，parent为空时，按parent___code匹配) 示例：001 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/projectClass/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"sourceUnique": "2211575684096589831",
			"id": "2211575684096589831",
			"code": "001",
			"description": {
				"zh_CN": "描述-cn",
				"en_US": "描述-en",
				"zh_TW": "描述-fan"
			},
			"enable": 1,
			"name": {
				"zh_CN": "001-cn",
				"en_US": "001-en",
				"zh_TW": "001-fan"
			},
			"orgid": "666666",
			"orgid___code": "global00",
			"parent": "2211575684096589833",
			"parent___code": "001"
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

