---
title: "业务日志记录"
apiId: "6500ddb107d748eeabdebd9631b16b15"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Audit Log - Business Log"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Audit Log - Business Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务日志记录

> `ContentType	application/json` 请求方式	POST | 分类: Audit Log - Business Log (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/log-pub/openapi/rest/business

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
| busiObjId | string | 否 | 是 | 业务对象id 示例：00000001 |
| busiObjCode | string | 否 | 是 | 业务对象code 示例：abc-2020-234 |
| busiObjName | string | 否 | 是 | 业务对象name 示例：物料1 |
| newBusiObj | string | 否 | 是 | 业务对象实体（json） 示例：{"abc":"abc"} |
| operCode | string | 否 | 是 | 操作编码，对应OperCodeTypes中的code 示例：insert |
| serviceCode | string | 否 | 是 | 工作台服务编码 示例：pc_product |
| busiObjTypeName | string | 否 | 是 | 类型名称，支持多语 示例：物料新增 |
| ip | string | 否 | 是 | IP 示例：192.168.1.1 |
| mdUri | string | 否 | 否 | 元数据uri |
| operResult | string | 否 | 否 | 操作结果，成功 success 失败 failed |

## 3. 请求示例

Url: /yonbip/digitalModel/log-pub/openapi/rest/business?access_token=访问令牌
Body: {
	"busiObjId": "00000001",
	"busiObjCode": "abc-2020-234",
	"busiObjName": "物料1",
	"newBusiObj": "{\"abc\":\"abc\"}",
	"operCode": "insert",
	"serviceCode": "pc_product",
	"busiObjTypeName": "物料新增",
	"ip": "192.168.1.1",
	"mdUri": "",
	"operResult": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 200 成功 示例：200 |
| message | string | 否 | 信息 示例：success |
| data | object | 否 | 数据 |
| displayCode | string | 否 | 异常码 |
| level | number |
| 小数位数:2,最大长度:10 | 否 | 异常等级 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {},
	"displayCode": "",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

