---
title: "自定义档案维护批量保存V11"
apiId: "2175179186330140677"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "User-defined File Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, User-defined File Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 自定义档案维护批量保存V11

> `ContentType	application/json` 请求方式	POST | 分类: User-defined File Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/customerdoc/batchSave

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
| countries___code | string | 是 | 否 | 国家编码 示例：["AE"] |
| sourceUnique | string | 否 | 是 | 来源主键 示例：2211575684096589833 |
| id | string | 否 | 否 | 主键ID 示例：id001 |
| code | string | 否 | 是 | 编码 示例：code001 |
| name | object | 否 | 是 | 默认按当前租户开通语种返回，当前为开通中英繁情况下返回格式 |
| description | object | 否 | 否 | 默认按当前租户开通语种返回，当前为开通中英繁情况下返回格式 |
| enable | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 启用状态：1表示启用，2表示停用 示例：1 默认值：1 |
| orgid | string | 否 | 否 | 所属组织，与orgid___code二选一必填，默认orgid有值时，orgid___code字段不生效 示例：666666 |
| orgid___code | string | 否 | 否 | 所属组织编码，与orgid二选一录入即可，orgid为空时，按orgid___code匹配组织档案 示例：global00 默认值：global00 |
| custdocdefid | string | 否 | 否 | 所属档案定义主键，与custdocdefid___code二选一必填，默认custdocdefid有值时，custdocdefid___code字段不生效 示例：1622705817811681285 |
| custdocdefid___code | string | 否 | 否 | 所属档案定义编码，与custdocdefid二选一必填，custdocdefid为空时，按custdocdefid___code匹配自定义档案定义 示例：00031 |
| parent | string | 否 | 否 | 父级档案主键，树形档案时与parent___code二选一必填，列表型档案为空，默认parent有值时，parent___code字段不生效 示例：id000 |
| parent___code | string | 否 | 否 | 父级档案编码，树形档案时与parent二选一必填，parent为空时，按parent___code匹配自定义档案父级档案 示例：00030 |
| shortname | string | 否 | 否 | 简称 示例：测试 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerdoc/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"countries___code": [
				"AE"
			],
			"sourceUnique": "2211575684096589833",
			"id": "id001",
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
			"enable": 1,
			"orgid": "666666",
			"orgid___code": "global00",
			"custdocdefid": "1622705817811681285",
			"custdocdefid___code": "00031",
			"parent": "id000",
			"parent___code": "00030",
			"shortname": "测试"
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
				"created": true,
				"sourceUnique": "sourceUnique001",
				"targetUnique": "targetUnique001",
				"id": "targetUnique001"
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

999-999-999999	调?失败时的错误信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-25

更新

请求说明

新增

请求参数 countries___code

更新

错误码 999-999-999999

新增国家字段

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

