---
title: "部门批量冻结/解冻"
apiId: "2157834467819388932"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Department"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Department]
platform_version: "BIP"
source_type: community-api-docs
---

# 部门批量冻结/解冻

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/dept/batchfrozenorunfrozen

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
| ids | string | 是 | 否 | 部门 ids,当ids与codes都有值时，以ids为准，最多支持500条数据 示例：["id1","id2"] 最大请求量：500 |
| codes | string | 是 | 否 | 部门codes,当ids与codes都有值时，以ids为准，最多支持500条数据 示例：["code1","code2"] 最大请求量：500 |
| frozenFlag | string | 否 | 否 | 冻结标识，frozen-冻结，unfrozen-解冻,不填写时默认 frozen 示例：frozen 默认值：frozen |
| frozenDate | string | 否 | 否 | 冻结日期 例如：2024-09-01 示例：2024-09-01 |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/dept/batchfrozenorunfrozen?access_token=访问令牌
Body: {
	"ids": [
		"id1",
		"id2"
	],
	"codes": [
		"code1",
		"code2"
	],
	"frozenFlag": "frozen",
	"frozenDate": "2024-09-01"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| traceId | string | 否 | traceId 示例：a957047f83c9fd2d |
| uploadable | string | 否 | uploadable 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"traceId": "a957047f83c9fd2d",
	"uploadable": "0",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-200001

openapi 部门冻结时，冻结日期必输

000-545-000519

租户id参数为空

000-545-200002

部门id数据为空


## 7. 错误返回码

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-26

更新

请求说明

新增

返回参数 traceId

新增

返回参数 uploadable

更新

返回参数 (4)

2	2025-07-02

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

