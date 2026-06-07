---
title: "根据客户银行子表id删除客户银行"
apiId: "2074078765841383430"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据客户银行子表id删除客户银行

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/merchant/deleteAgentFinancialById

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
| id | number |
| 小数位数:-1,最大长度:22 | 否 | 否 | 客户档案的银行子表id 示例：1856036556179505153 |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/deleteAgentFinancialById?access_token=访问令牌
Body: {
	"id": 1856036556179505153
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 调用完成返回信息 示例：处理成功 |
| code | string | 否 | 调用完成返回码，调用成功时返回200； 示例：200 |
| data | object | 否 | 修改成功后返回的对象信息；固定为null 示例：null |

## 5. 正确返回示例

{
	"message": "处理成功",
	"code": "200",
	"data": "null"
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

