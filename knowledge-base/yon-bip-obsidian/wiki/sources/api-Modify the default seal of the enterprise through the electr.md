---
title: "电子签hub修改企业默认印章"
apiId: "2359955207785283591"
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

# 电子签hub修改企业默认印章

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/TRST/company/seal/v1/default

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| companyId | string | query | 是 | 企业id，创建企业时电子签平台返回的企业id    示例: sdsyeus7 |
| sealId | string | query | 是 | 待配置的默认印章ID，创建印章接口电子签平台返回的印章id |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| sealId | string | 否 | 是 | 企业id，创建企业时电子签平台返回的企业id 示例：536fr67y |
| companyId | string | 否 | 是 | 企业id，创建企业时电子签平台返回的企业id 示例：sdsyeus7 |

## 3. 请求示例

Url: /yonbip/TRST/company/seal/v1/default?access_token=访问令牌&companyId=sdsyeus7&sealId=
Body: {
	"sealId": "536fr67y",
	"companyId": "sdsyeus7"
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

