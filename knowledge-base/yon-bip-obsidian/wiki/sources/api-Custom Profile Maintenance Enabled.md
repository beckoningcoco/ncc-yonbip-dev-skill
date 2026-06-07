---
title: "自定义档案维护启用"
apiId: "cf0a9321a05444f5a55990d6ee93ea69"
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

# 自定义档案维护启用

> `ContentType	application/json` 请求方式	POST | 分类: User-defined File Maintenance (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerdoc/unstop

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 主键 示例：1001 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerdoc/unstop?access_token=访问令牌
Body: {
	"data": {
		"id": "1001"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 回执编码 示例：200 |
| message | string | 否 | 回执消息 示例：操作成功 |
| data | object | 否 | 回执数据 |
| dr | long | 否 | 是否删除0-存在，1-删除 示例：0 |
| ispreset | boolean | 否 | 是否预制 FALSE-否，true-是 示例：false |
| enable | long | 否 | 是否可用 1-可用，2-不可用 示例：1 |
| id | string | 否 | 主键 示例：2e9b1b4bf1794725a239d0d2a773d5cd |
| pubts | string | 否 | 时间戳 示例：2021-11-23 15:40:24 |
| _status | string | 否 | 状态 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"dr": 0,
		"ispreset": false,
		"enable": 1,
		"id": "2e9b1b4bf1794725a239d0d2a773d5cd",
		"pubts": "2021-11-23 15:40:24",
		"_status": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	请检查参数和路径是否正确！


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

