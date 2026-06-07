---
title: "生产领料委托关系启用"
apiId: "6fed8ffeefa04423b71364bdd60eb041"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Production Picking Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Production Picking Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产领料委托关系启用

> `ContentType	application/json` 请求方式	POST | 分类: Production Picking Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/pickingDelegate/unstop

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
| data | object | 否 | 是 | 数据参数 |
| id | string | 否 | 是 | 生产领料委托关系主键 示例：2342204613071104 |

## 3. 请求示例

Url: /yonbip/digitalModel/pickingDelegate/unstop?access_token=访问令牌
Body: {
	"data": {
		"id": "2342204613071104"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 响应编码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 主键 示例：2342204613071104 |
| enable | long | 否 | 启用状态，0未启用，1启用，2停用 示例：1 |
| dr | long | 否 | 删除标识 0-未删除；1-已删除 示例：0 |
| yhtTenant | string | 否 | 友互通租户id 示例：rw4c7fpf |
| tenant | string | 否 | 租户id 示例：rw4c7fpf |
| yhtTenantId | string | 否 | 友互通租户id 示例：rw4c7fpf |
| pubts | string | 否 | 时间戳 示例：2021-07-14 10:21:41 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2342204613071104",
		"enable": 1,
		"dr": 0,
		"yhtTenant": "rw4c7fpf",
		"tenant": "rw4c7fpf",
		"yhtTenantId": "rw4c7fpf",
		"pubts": "2021-07-14 10:21:41"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

999	服务端逻辑异常


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

