---
title: "企业修改信息"
apiId: "1814319504571760641"
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

# 企业修改信息

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/company/common/update

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
| companyId | string | 否 | 是 | 企业ID 示例：1742220970793369605 |
| accountId | string | 否 | 否 | 用户ID 示例：259e2a76-****-****-****-7a9a1c640ea0 |
| uniqueId | string | 否 | 否 | 企业 业务方唯一ID 示例：company123 |
| accountUniqueId | string | 否 | 否 | 用户 业务方唯一ID 示例：user123 |
| registerNo | string | 否 | 是 | 统一社会信信用代码 示例：911122201760P |
| name | string | 否 | 是 | 企业名称 示例：测试公司 |
| companyAppAuthId | string | 否 | 是 | 待认证的企业授权ID 示例：1820280455315324934 |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/company/common/update?access_token=访问令牌
Body: {
	"companyId": "1742220970793369605",
	"accountId": "259e2a76-****-****-****-7a9a1c640ea0",
	"uniqueId": "company123",
	"accountUniqueId": "user123",
	"registerNo": "911122201760P",
	"name": "测试公司",
	"companyAppAuthId": "1820280455315324934"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 示例：null |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "null"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	后端系统异常信息	后端系统异常导致业务执行失败


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

