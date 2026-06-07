---
title: "SKU属性批量删除"
apiId: "88a9b89bbbe348dfb53161583d87c62b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product SKU File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product SKU File]
platform_version: "BIP"
source_type: community-api-docs
---

# SKU属性批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Product SKU File (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productskupro/batchdelete

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
| data | object | 是 | 是 | 参数数据体 |
| id | long | 否 | 是 | SKU属性id 示例：2237431302820165 |
| pubts | string | 否 | 否 | 时间戳 示例：2021-07-06 15:12:07 |

## 3. 请求示例

Url: /yonbip/digitalModel/productskupro/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2237431302820165,
			"pubts": "2021-07-06 15:12:07"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 调用完成时返回编码 示例：200 |
| message | string | 否 | 调用完成时返回信息 示例：操作成功 |
| data | string | 否 | 调用完成时返回数据 示例：正在批量删除。可根据asyncKey[delete_8C8849CC-9FD9-26CF-AFDA-05DABF74DF9E]调用[批量删除进度查询]API以查看删除进度及结果。 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "正在批量删除。可根据asyncKey[delete_8C8849CC-9FD9-26CF-AFDA-05DABF74DF9E]调用[批量删除进度查询]API以查看删除进度及结果。"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

