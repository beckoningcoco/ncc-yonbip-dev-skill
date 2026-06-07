---
title: "商品SKU批量停用"
apiId: "7c41e0e6a25e475c89cd0ded20d6436b"
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

# 商品SKU批量停用

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/sku/batchStop

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
| data | object | 是 | 是 | 货品数据 |
| skuId | long | 否 | 是 | 货品id 示例：2275733771800832 |
| orgId | string | 否 | 是 | 使用组织id 示例：1970281714585857 |

## 3. 请求示例

Url: /yonbip/digitalModel/sku/batchStop?access_token=访问令牌
Body: {
	"data": [
		{
			"skuId": 2275733771800832,
			"orgId": "1970281714585857"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 200：成功，其它：失败 示例：200 |
| message | string | 否 | 调用结果 示例：操作成功 |
| data | object | 否 | 返回数据 |
| name | string | 否 | 货品名称 示例：1622099764 |
| id | long | 否 | 货品id 示例：2275733771800832 |
| productId | long | 否 | 物料id 示例：2275733766213888 |
| isCreator | boolean | 否 | 是否创建者：true是，false否 示例：true |
| productApplyRangeId | string | 否 | 物料使用范围id 示例：2275733768245504 |
| pubts | string | 否 | 时间戳 示例：2021-05-27 15:16:06 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"name": "1622099764",
		"id": 2275733771800832,
		"productId": 2275733766213888,
		"isCreator": true,
		"productApplyRangeId": "2275733768245504",
		"pubts": "2021-05-27 15:16:06"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-11

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

