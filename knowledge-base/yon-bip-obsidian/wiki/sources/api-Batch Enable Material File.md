---
title: "物料档案批量启用"
apiId: "bfe25c4845f347b18591e804a76b0a06"
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

# 物料档案批量启用

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/product/batchStart

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
| enablesku | boolean | 否 | 是 | 是否启用SKU：true启用，false不启用 示例：true |

## 3. 请求示例

Url: /yonbip/digitalModel/product/batchStart?access_token=访问令牌
Body: {
	"data": [
		{
			"productId": 2350741328023808,
			"productCode": "WL01",
			"orgId": 2350741328023808,
			"orgCode": "ZZ01",
			"enablesku": true
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 200：成功，其它：失败 示例：200 |
| message | string | 否 | 调用结果 示例：操作成功 |
| data | object | 否 | 物料档案 |
| _realtype | string | 否 | 真实类型 |
| _entityName | string | 否 | 实体名称 |
| _keyName | string | 否 | 关键字名称 |
| enablesku | boolean | 否 | 是否启用SKU：true已启用，false未启用 示例：false |
| id | long | 否 | 物料id 示例：2183763449975040 |
| isCreator | boolean | 否 | 是否是创建者：true是，false否 示例：true |
| productApplyRangeId | string | 否 | 适用范围id 示例：2183763451793664 |
| _status | string | 否 | 实体状态 |
| pubts | string | 否 | 时间戳 示例：2021-03-23 15:59:03 |
| errorDetail | string | 否 | 错误详情 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"enablesku": false,
		"id": 2183763449975040,
		"isCreator": true,
		"productApplyRangeId": "2183763451793664",
		"_status": "",
		"pubts": "2021-03-23 15:59:03"
	},
	"errorDetail": ""
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

