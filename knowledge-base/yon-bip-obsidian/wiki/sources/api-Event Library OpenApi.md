---
title: "事项库OpenApi"
apiId: "31cf204ef4f941809cd893bd56c3ca12"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Event Library"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Event Library]
platform_version: "BIP"
source_type: community-api-docs
---

# 事项库OpenApi

> `ContentType	application/json` 请求方式	POST | 分类: Event Library (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/yssx/datasend

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
| action | string | 否 | 是 | 行为（add表示保存，delete表示删除） |
| diwork | string | 否 | 是 | 用来区分是高端（Y）还是中端（N） 默认值：N |
| dyentitycode | string | 否 | 是 | 单据编号（应收单receivable_documents_src 核销单arap_verify_src 收款单receipt_documents_src） |

## 3. 请求示例

Url: /yonbip/fi/yssx/datasend?access_token=访问令牌
Body: {
	"data": {},
	"action": "",
	"diwork": "",
	"dyentitycode": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 业务码 示例：200 |
| message | string | 否 | 错误信息 示例：操作成功。 |
| data | boolean | 否 | 状态标识 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功。",
	"data": true
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

