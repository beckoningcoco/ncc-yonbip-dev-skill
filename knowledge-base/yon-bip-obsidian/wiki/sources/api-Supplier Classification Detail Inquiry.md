---
title: "供应商分类详情查询"
apiId: "6510228237de454da81702ecd7c0e558"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Supplier Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商分类详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Supplier Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendorclassification/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| name | muti_lang | 否 | 分类名称,支持多语 |
| code | string | 否 | 分类编码 |
| parent | string | 否 | 上级分类id |
| parent_name | string | 否 | 上级分类名称 |
| erpCode | string | 否 | 外部编码 |
| order | int | 否 | 排序号 |
| level | int | 否 | 层级 |
| path | string | 否 | 路径 |
| isEnd | string | 否 | 是否末级 |
| id | string | 否 | 分类ID |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| comment | muti_lang | 否 | 备注,支持多语 |
| isEnabled | string | 否 | 是否启用, true:是、false:否、 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"code": "",
		"parent": "",
		"parent_name": "",
		"erpCode": "",
		"order": 0,
		"level": 0,
		"path": "",
		"isEnd": "",
		"id": "",
		"pubts": "",
		"comment": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"isEnabled": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	{ "code":"999","message":"For input string: \"test\""}	请检查业务数据ID


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

