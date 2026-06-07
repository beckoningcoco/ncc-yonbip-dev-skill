---
title: "供应商申请审核"
apiId: "1679216497909563401"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Supplier Application"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商申请审核

> `ContentType	application/json` 请求方式	GET | 分类: Supplier Application (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/vendorapply/audit

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 供应商申请单id |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorapply/audit?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码(200-成功；999-失败) 示例：200 |
| message | string | 否 | 操作成功 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-24

更新

返回参数 code

更新

返回参数 message

11


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

