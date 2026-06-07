---
title: "电子签hub企业删除"
apiId: "2275240422435454981"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子签hub企业删除

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/company/common/v1/delete

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
| companyId | string | 否 | 否 | 电子签企业ID、uniqueid其一必须有值，如果两者都有值，则以companyId为准 示例：5dd2b642db1c3195447f6e10a83418ee |
| uniqueId | string | 否 | 否 | 1. 企业关联的业务系统方ID,当companyId为空时生效。2. 如果companyId和uniqueId都有值的情况下，以companyId为准。 示例：123123-123123 |
| accountId | string | 否 | 否 | 删除企业操作者账号accountId 示例：5dd2b642db1c3195447f6e10a83417aa |
| accountUniqueId | string | 否 | 否 | 删除企业操作者业务系统关联的唯一用户ID 示例：876-876 |

## 3. 请求示例

Url: /yonbip/id/company/common/v1/delete?access_token=访问令牌
Body: {
	"companyId": "5dd2b642db1c3195447f6e10a83418ee",
	"uniqueId": "123123-123123",
	"accountId": "5dd2b642db1c3195447f6e10a83417aa",
	"accountUniqueId": "876-876"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

