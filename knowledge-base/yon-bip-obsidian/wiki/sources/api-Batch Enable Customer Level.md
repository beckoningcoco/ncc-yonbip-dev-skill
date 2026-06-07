---
title: "客户级别批量启用"
apiId: "bb37cfe47f914b1480444c0e2f6e44f2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Grade"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Grade]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户级别批量启用

> `ContentType	application/json` 请求方式	POST | 分类: Customer Grade (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/cuslevel/batchStart

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
| data | object | 是 | 是 | 客户级别数据，id与编码必输其一,当id与编码同时存在时以id为主 |
| id | long | 否 | 否 | 客户级别id 示例：2155434515550464 |
| code | string | 否 | 否 | 客户级别编码 示例：111 |

## 3. 请求示例

Url: /yonbip/digitalModel/cuslevel/batchStart?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2155434515550464,
			"code": "111"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | string | 否 | 请求结果数据 示例：操作成功 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "操作成功"
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

