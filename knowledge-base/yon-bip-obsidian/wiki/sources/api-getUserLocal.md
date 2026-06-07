---
title: "查询用户语种"
apiId: "2450207571754614792"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Workbench Management"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Workbench Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询用户语种

> `ContentType	application/json` 请求方式	POST | 分类: Workbench Management (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/iuap-apcom-workbench/manager/i18Ref/getLocalByTenantIdAndUserIdList

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| tenant | string | 否 | 否 | 租户id |
| userIdList | object | 是 | 否 | 用户Id集合 最大请求量：100 |

## 3. 请求示例

Url: /yonbip/PFC/iuap-apcom-workbench/manager/i18Ref/getLocalByTenantIdAndUserIdList?access_token=访问令牌
Body: {
	"tenant": "",
	"userIdList": [
		{}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
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

