---
title: "客户档案批量删除"
apiId: "6d32ab96421f4f3b89f0cc03a29ceeb2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户档案批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/merchant/batchdelete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量删除

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 参数数据体 |
| merchantId | long | 否 | 是 | 客户档案id 示例：2323526375264512 |
| orgId | string | 否 | 是 | 使用组织id 示例：2282542348554496 |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"merchantId": 2323526375264512,
			"orgId": "2282542348554496"
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

999	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员	操作失败


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

