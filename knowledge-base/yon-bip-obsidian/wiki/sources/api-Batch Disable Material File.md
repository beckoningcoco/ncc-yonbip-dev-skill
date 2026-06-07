---
title: "物料档案批量停用"
apiId: "3f38540a05604212b51eaf11d0da8820"
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

# 物料档案批量停用

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/product/batchStop

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 物料数据 |
| productId | long | 否 | 否 | 物料档案id 示例：2350741328023808 |
| productCode | string | 否 | 否 | 物料档案编码，优先级高于id 示例：WL01 |
| orgId | long | 否 | 否 | 使用组织id 示例：2350741328023808 |
| orgCode | string | 否 | 否 | 使用组织编码，优先级高于id 示例：ZZ01 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/batchStop?access_token=访问令牌
Body: {
	"data": [
		{
			"productId": 2350741328023808,
			"productCode": "WL01",
			"orgId": 2350741328023808,
			"orgCode": "ZZ01"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| enablesku | boolean | 否 | SKU启用状态：true已启用，false未启用 示例：false |
| id | long | 否 | 物料档案id 示例：1971319250784512 |
| isCreator | boolean | 否 | 是否创建者, true:是、false:否、 示例：true |
| productApplyRangeId | string | 否 | 物料适用范围id 示例：1971319251898624 |
| pubts | string | 否 | 时间戳 示例：2020-10-24 14:09:38 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"enablesku": false,
		"id": 1971319250784512,
		"isCreator": true,
		"productApplyRangeId": "1971319251898624",
		"pubts": "2020-10-24 14:09:38"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-24

新增

请求参数 productCode

新增

请求参数 orgCode

更新

请求参数 productId

更新

请求参数 orgId

微服务调整回物料


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

