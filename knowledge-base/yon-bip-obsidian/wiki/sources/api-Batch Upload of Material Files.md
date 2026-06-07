---
title: "物料档案批量上架"
apiId: "b23a7316d81b4421b1b2989d7ecb828e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料档案批量上架

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/shelves

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
| data | object | 是 | 否 | 物料档案数据 |
| productId | long | 否 | 否 | 物料档案id，与物料档案编码必输其一 示例：2573246778659328 |
| productCode | string | 否 | 否 | 物料档案编码，与物料档案id必输其一 示例：物料档案编码 |
| biz | string | 否 | 是 | 订货与商城上架标示，uorder订货上架，商城上架umall 示例：uorder |
| orgId | long | 否 | 否 | 使用组织id，不输时上架的是管理组织数据 示例：2573246779888128 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/shelves?access_token=访问令牌
Body: {
	"data": [
		{
			"productId": 2573246778659328,
			"productCode": "物料档案编码",
			"biz": "uorder",
			"orgId": 2573246779888128
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 调用完成后返回编码 示例：200 |
| message | string | 否 | 调用完成后返回信息 示例：操作成功 |
| data | string | 否 | 调用完成后返回数据 示例：正在进行批量操作。可根据asyncKey[delete_8C8849CC-9FD9-26CF-AFDA-05DABF74DF9E]调用[批量删除进度查询]API以查看操作进度及结果。 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "正在进行批量操作。可根据asyncKey[delete_8C8849CC-9FD9-26CF-AFDA-05DABF74DF9E]调用[批量删除进度查询]API以查看操作进度及结果。"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

