---
title: "商品SKU批量启用"
apiId: "dbdb1b3e3aef4cceb9d305df25118e1c"
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

# 商品SKU批量启用

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/sku/batchStart

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

Url: /yonbip/digitalModel/sku/batchStart?access_token=访问令牌
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
| _realtype | string | 否 | 真实类型 示例：真实类型 |
| _entityName | string | 否 | 实体名称 示例：实体名称 |
| _keyName | string | 否 | 关键字名称 示例：关键字名称 |
| name | string | 否 | 物料名称 示例：1622099764 |
| id | long | 否 | 货品id 示例：2275733771800832 |
| productId | long | 否 | 物料id 示例：2275733766213888 |
| isCreator | boolean | 否 | 是否是创建者：true是，false否 示例：true |
| productApplyRangeId | string | 否 | 物料使用范围id 示例：2275733768245504 |
| _status | string | 否 | 实体状态 示例：实体状态 |
| pubts | string | 否 | 时间戳 示例：2021-05-27 15:16:06 |
| errorDetail | string | 否 | 错误详情 示例：错误详情 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"_realtype": "真实类型",
		"_entityName": "实体名称",
		"_keyName": "关键字名称",
		"name": "1622099764",
		"id": 2275733771800832,
		"productId": 2275733766213888,
		"isCreator": true,
		"productApplyRangeId": "2275733768245504",
		"_status": "实体状态",
		"pubts": "2021-05-27 15:16:06"
	},
	"errorDetail": "错误详情"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

