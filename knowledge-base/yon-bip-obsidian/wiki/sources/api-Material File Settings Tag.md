---
title: "物料档案设置标签"
apiId: "c708a0afc5714ccab2e7d3a10c637434"
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

# 物料档案设置标签

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/addTags

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
| productId | long | 否 | 是 | 物料id 示例：2350741328023808 |
| orgId | long | 否 | 是 | 使用组织id 示例：2350741328023808 |
| tags | string | 是 | 否 | 标签id 示例：["2305519856210176"] |

## 3. 请求示例

Url: /yonbip/digitalModel/product/addTags?access_token=访问令牌
Body: {
	"data": [
		{
			"productId": 2350741328023808,
			"orgId": 2350741328023808,
			"tags": [
				"2305519856210176"
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用成功/失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| count | long | 否 | 本次选择记录数 示例：1 |
| sucessCount | long | 否 | 成功记录数 示例：1 |
| failCount | long | 否 | 失败记录数 示例：0 |
| messages | string | 是 | 失败原因列表 示例：["失败信息"] |
| infos | string | 是 | 异步执行成功后，返回信息 示例：["返回信息"] |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			"失败信息"
		],
		"infos": [
			"返回信息"
		]
	}
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

