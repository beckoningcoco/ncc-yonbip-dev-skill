---
title: "发运方式停用"
apiId: "5b844c57381948b5b491f78b38437e44"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shipping Method"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shipping Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 发运方式停用

> `ContentType	application/json` 请求方式	POST | 分类: Shipping Method (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/sendtransway/stop

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
| data | object | 是 | 是 | 请求数据 |
| id | long | 否 | 否 | 发运方式id，与发运方式编码必输其一 示例：1973903017218304 |
| code | string | 否 | 否 | 发运方式编码，与发运方式id必输其一 |

## 3. 请求示例

Url: /yonbip/digitalModel/sendtransway/stop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1973903017218304,
			"code": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 是 | 请求结果数据 |
| id | long | 否 | 发运方式id 示例：1973903017218304 |
| stoptime | string | 否 | 停用时间 示例：2020-10-26 10:00:58 |
| stopstatus | boolean | 否 | 是否停用状态，true：已停用，false：已启用 示例：true |
| pubts | string | 否 | 时间戳 示例：2020-10-26 10:00:58 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 1973903017218304,
			"stoptime": "2020-10-26 10:00:58",
			"stopstatus": true,
			"pubts": "2020-10-26 10:00:58"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

