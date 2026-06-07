---
title: "业务单元启用"
apiId: "7fbdb92d04d54cca824cda0e2d84eb7c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元启用

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/orgunit/unstop

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
| data | object | 否 | 是 | 参数集合 |
| enable | string | 否 | 是 | 原组织单元状态 0：未启用；1启用；2停用 示例：1 |
| id | string | 否 | 是 | 组织单元id 示例：12324775521234 |

## 3. 请求示例

Url: /yonbip/digitalModel/orgunit/unstop?access_token=访问令牌
Body: {
	"data": {
		"enable": "1",
		"id": "12324775521234"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 内容 |
| enable | long | 否 | 状态, 0:未启用、1:启用、2:停用、 示例：1 |
| id | string | 否 | 主键id 示例：1895050357641472 |
| pubts | string | 否 | 时间戳 示例：2020-09-01 06:18:35 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"enable": 1,
		"id": "1895050357641472",
		"pubts": "2020-09-01 06:18:35"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000003

上级非启用状态，请先启用上级


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

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

