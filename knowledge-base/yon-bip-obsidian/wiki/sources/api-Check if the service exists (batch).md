---
title: "查询服务是否存在（批量）"
apiId: "1940545372160000005"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tenant Metering"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tenant Metering]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询服务是否存在（批量）

> `ContentType	application/json` 请求方式	POST | 分类: Tenant Metering (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/manager/pub/existServices

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/digitalModel/manager/pub/existServices?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| data | object | 否 | data |
| status | number |
| 小数位数:0,最大长度:10 | 否 | status 示例：0 |
| msg | string | 否 | msg 示例：数据解析错误,请确认数据是否正确 |
| errorCode | string | 否 | errorCode 示例：000000 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"status": 0,
		"msg": "数据解析错误,请确认数据是否正确",
		"errorCode": "000000"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 (4)

新增

错误码 999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

