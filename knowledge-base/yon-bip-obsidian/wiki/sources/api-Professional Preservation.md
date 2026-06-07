---
title: "专业保存"
apiId: "2007474216905998345"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Major"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Major]
platform_version: "BIP"
source_type: community-api-docs
---

# 专业保存

> `ContentType	application/json` 请求方式	POST | 分类: Major (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/am/specialty/save

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
| data | object | 是 | 否 | data |
| pk_org | string | 否 | 是 | 业务单元ID 示例：1982862980563861509 |
| special_code | string | 否 | 是 | 专业编码 示例：ZY-0001 |
| special_name | object | 否 | 是 | 专业名称 |
| memo | string | 否 | 否 | 备注 示例：专业0001 |
| enablestate | string | 否 | 否 | 启用状态 1-未启用 2-已启用 3-已停用 示例：2 默认值：2 |

## 3. 请求示例

Url: /yonbip/am/specialty/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org": "1982862980563861509",
			"special_code": "ZY-0001",
			"special_name": {
				"zh_CN": "专业-0001",
				"en_US": "",
				"zh_TW": ""
			},
			"memo": "专业0001",
			"enablestate": "2"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回Http状态码（200：成功，其他：失败） 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功！ |
| data | object | 否 | 返回的数据实体 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 详细信息 |
| infos | object | 是 | 单据信息 |
| failInfos | string | 是 | 错误数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"pk_org": "1795743032269602824",
				"special_code": "9909901",
				"special_name": {
					"zh_CN": "资产NO1"
				},
				"memo": "测试专业",
				"enablestate": 2,
				"id": "2008931705477922816",
				"sysid": "AMBD",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "默认用户",
				"creationtime": "2024-05-30 20:00:31",
				"pubts": "2024-05-30 20:00:31"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端错误	服务端错误


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

