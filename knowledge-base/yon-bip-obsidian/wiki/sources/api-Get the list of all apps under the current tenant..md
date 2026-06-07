---
title: "获取当前租户下的所有应用列表"
apiId: "9e04ae63-fe34-4ac6-8b0c-4a9fd2b8e2c0"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Mobile Configuration"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mobile Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取当前租户下的所有应用列表

> `ContentType	application/json` 请求方式	GET | 分类: Mobile Configuration (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/app/list_all

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/uspace/app/list_all?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| tenantId | string | 否 | 租户Id |
| applicationId | string | 否 | 应用Id |
| applicationName | string | 否 | 应用名称 |
| applicationCode | string | 否 | 应用Code |
| applicationIcon | string | 否 | 应用图标 |
| applicationDesc | string | 否 | 应用描述 |
| eternal | string | 否 | 是否可停用，true是不可停用 |
| webStatus | string | 否 | 是否可以在web端显示 |
| clientStatus | string | 否 | 是否是pc端应用 |
| phoneStatus | string | 否 | 是否可在移动端显示 |
| simpleStatus | string | 否 | 是否为简单应用，一个应用下只对应一个服务 |
| enable | string | 否 | 启用状态：停用、启用 |
| applicationType | string | 否 | 应用类型 |
| hasWidget | string | 否 | 是否已经放在桌面上 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"tenantId": "",
		"applicationId": "",
		"applicationName": "",
		"applicationCode": "",
		"applicationIcon": "",
		"applicationDesc": "",
		"eternal": "",
		"webStatus": "",
		"clientStatus": "",
		"phoneStatus": "",
		"simpleStatus": "",
		"enable": "",
		"applicationType": "",
		"hasWidget": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

