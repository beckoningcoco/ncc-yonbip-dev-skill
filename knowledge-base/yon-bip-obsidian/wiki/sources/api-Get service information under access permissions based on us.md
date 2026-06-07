---
title: "根据userId获取访问权限下的服务信息"
apiId: "1125baed4ba84dbeb2f000b2ba0d2a3a"
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

# 根据userId获取访问权限下的服务信息

> `ContentType	application/json` 请求方式	GET | 分类: Mobile Configuration (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/service/list_by_user_id

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| userId | string | query | 否 | userId |

## 3. 请求示例

Url: /yonbip/uspace/service/list_by_user_id?access_token=访问令牌&userId=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| tenantId | string | 否 | 租户Id |
| applicationId | string | 否 | 应用Id |
| serviceId | string | 否 | 服务Id |
| serviceName | string | 否 | 服务名称 |
| serviceCode | string | 否 | 服务code |
| enable | string | 否 | 停启用状态 |
| url | string | 否 | 服务地址 |
| serviceIcon | string | 否 | 服务图标 |
| capable | string | 否 | 是否关键性服务 |
| ykjId | string | 否 | 服务对应的空间应用Id |
| clientStatus | string | 否 | 是否可在pc端显示 |
| webStatus | string | 否 | 是否可在web端显示 |
| phoneStatus | string | 否 | 是否可在移动端显示 |
| strategy | string | 否 | 免登策略 |
| hasWidget | string | 否 | 是否支持桌面磁贴 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"tenantId": "",
		"applicationId": "",
		"serviceId": "",
		"serviceName": "",
		"serviceCode": "",
		"enable": "",
		"url": "",
		"serviceIcon": "",
		"capable": "",
		"ykjId": "",
		"clientStatus": "",
		"webStatus": "",
		"phoneStatus": "",
		"strategy": "",
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

