---
title: "职级类别列表查询_集成_API"
apiId: "2133535501381533696"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级类别列表查询_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Job Level Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/ranktype/listForIntegration

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 否 | 页码 默认值：1 |
| codeOrName | string | 否 | 否 | 名称或编码，查询所有时设置为空 |
| pubts | string | 否 | 否 | 时间戳 示例：2020-11-23 16:11:09 |
| pageSize | int | 否 | 否 | 每页大小 默认值：10 |
| idList | string | 是 | 否 | 主键id 示例：["1111"] |
| enableList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 启用状态，0初始化 1启用 2停用 示例：[1,0] |
| drList | number |
| 小数位数:0,最大长度:10 | 是 | 否 | 删除状态，0未删除，1删除 示例：[0] |
| codeList | string | 是 | 否 | 编码列表 示例：["111"] |
| distributionSite | string | 否 | 否 | 来源 |

## 3. 请求示例

Url: /yonbip/digitalModel/ranktype/listForIntegration?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"codeOrName": "",
	"pubts": "2020-11-23 16:11:09",
	"pageSize": 0,
	"idList": [
		"1111"
	],
	"enableList": [
		1,
		0
	],
	"drList": [
		0
	],
	"codeList": [
		"111"
	],
	"distributionSite": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | pageIndex 示例：0 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | pageSize 示例：0 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | recordCount 示例：0 |
| recordList | object | 是 | recordList |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | pageCount 示例：0 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | beginPageIndex 示例：0 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | endPageIndex 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"code": "",
				"enable": 0,
				"name": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"memo": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": "",
				"pubts": "",
				"distributionSite": "",
				"dr": 0,
				"modifier": "",
				"modifyTime": "",
				"creator": "",
				"createTime": "",
				"sysid": "",
				"user_define_character": {
					"ytenant": "",
					"id": ""
				}
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	查询失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-20

新增

返回参数 user_define_character

新增

返回参数 ytenant

新增

返回参数 id

HXRL-123878 职级类别接特征


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

