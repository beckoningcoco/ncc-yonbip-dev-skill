---
title: "个性化租户移动端数据"
apiId: "1933797325728645120"
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

# 个性化租户移动端数据

> `ContentType	application/json` 请求方式	POST | 分类: Tenant Metering (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/manager/pub/activeApp

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
| ykjId | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 友空间id |
| serviceCode | string | 否 | 是 | 服务编码 |
| ykj | object | 否 | 是 | 个性化数据 |
| ykjId | string | 否 | 是 | 友空间id |
| isNewFirst | string | 否 | 否 | 新应用是否放在首位 (1 是 0 否) |
| isHome | string | 否 | 否 | 是否在首页显示 1：是 |
| appUrl | string | 否 | 否 | 访问url |
| icon | string | 否 | 否 | 图标 |
| navShow | string | 否 | 否 | 是否显示导航栏：1：显示，2：不显示 |
| gzipVersion | string | 否 | 否 | gzip版本 |

## 3. 请求示例

Url: /yonbip/digitalModel/manager/pub/activeApp?access_token=访问令牌
Body: [{
	"ykjId": 0,
	"serviceCode": "",
	"ykj": {
		"ykjId": "",
		"isNewFirst": "",
		"isHome": "",
		"appUrl": "",
		"icon": "",
		"navShow": "",
		"gzipVersion": ""
	}
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| status | number |
| 小数位数:0,最大长度:10 | 否 | status 示例：1 |
| data | string | 是 | data 示例：["服务编码为：EPP_BIDDING,ykjId=2298的服务执行结果：成功"] |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": 1,
		"data": [
			"服务编码为：EPP_BIDDING,ykjId=2298的服务执行结果：成功"
		],
		"displayCode": "000-545-100001",
		"level": 0
	}
}

## 6. 业务异常码

000-555-411004

参数异常


## 7. 错误返回码

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

更新

请求说明

新增

返回参数 displayCode

新增

返回参数 level

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

