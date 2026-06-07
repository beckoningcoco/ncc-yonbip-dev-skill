---
title: "自定义档案维护停用"
apiId: "68c423de5db44b65a65090eb457ed382"
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

# 自定义档案维护停用

> `ContentType	application/json` 请求方式	POST | 分类: User-defined File Maintenance (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerdoc/stop

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
| id | string | 否 | 是 | 主键 示例：111 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerdoc/stop?access_token=访问令牌
Body: {
	"data": {
		"id": "111"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码，200成功 999失败 示例：200 |
| message | string | 否 | 回执消息 示例：操作成功 |
| data | object | 否 | 回执数据 |
| dr | long | 否 | 是否删除0-否 1-是 示例：0 |
| ispreset | boolean | 否 | 是否预制false-否 true 是 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-11-23 15:40:24 |
| enable | long | 否 | 是否可用1-是 2-否 示例：2 |
| id | string | 否 | 主键 示例：2e9b1b4bf1794725a239d0d2a773d5cd |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"dr": 0,
		"ispreset": false,
		"pubts": "2021-11-23 15:40:24",
		"enable": 2,
		"id": "2e9b1b4bf1794725a239d0d2a773d5cd"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	请检查参数和路径是否正确！


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

更新

请求参数 data

更新

请求参数 id

更新

返回参数 (8)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

