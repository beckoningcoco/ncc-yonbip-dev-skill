---
title: "客户行业批量删除"
apiId: "adbf354b34de4f69995d2ef4bd1d98da"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer's Industry"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer's Industry]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户行业批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Customer's Industry (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customertrade/batchdelete

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
| data | object | 是 | 是 | 客户行业数据，id与编码必输其一,id和编码同时存在时，以id为准 |
| id | long | 否 | 否 | 客户行业id 示例：2401825186107648 |
| code | string | 否 | 否 | 客户行业编码 示例：888 |
| pubts | string | 否 | 否 | 时间戳 示例：2021-08-26 11:08:04 |

## 3. 请求示例

Url: /yonbip/digitalModel/customertrade/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2401825186107648,
			"code": "888",
			"pubts": "2021-08-26 11:08:04"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 调用完成后返回编码 示例：200 |
| message | string | 否 | 调用完成后返回信息 示例：操作成功 |
| data | string | 否 | 调用完成后返回数据 示例：正在批量删除。可根据asyncKey[delete_8C8849CC-9FD9-26CF-AFDA-05DABF74DF9E]调用[批量删除进度查询]API以查看删除进度及结果。 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "正在批量删除。可根据asyncKey[delete_8C8849CC-9FD9-26CF-AFDA-05DABF74DF9E]调用[批量删除进度查询]API以查看删除进度及结果。"
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

