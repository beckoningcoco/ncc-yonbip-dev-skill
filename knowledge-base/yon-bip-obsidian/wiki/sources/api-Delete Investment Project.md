---
title: "投资项目删除"
apiId: "1624365264430694409"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment Project Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment Project Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 投资项目删除

> `ContentType	application/json` 请求方式	POST | 分类: Investment Project Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/investment/delete

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
| id | string | 否 | 否 | 投资项目id，id和code必输其一，都存在以id为准 示例：1545513710614216711 |
| code | string | 否 | 否 | 投资项目编码，id和code必输其一，都存在以id为准，为兼容华新投资计划的历史数据未存投资项目id的情况，该情况下传code进行判断 示例：cj0001 |

## 3. 请求示例

Url: /yonbip/digitalModel/investment/delete?access_token=访问令牌
Body: {
	"id": "1545513710614216711",
	"code": "cj0001"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	id或code必传其一！	id或code需至少传一个


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

