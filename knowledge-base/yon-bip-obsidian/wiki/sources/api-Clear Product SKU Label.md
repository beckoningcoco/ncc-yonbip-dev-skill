---
title: "商品SKU清除标签"
apiId: "2f342c4db27b4c059457bdaaeee31765"
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

# 商品SKU清除标签

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/sku/deleteTags

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
| skuId | long | 否 | 是 | 货品id 示例：2350741328023808 |
| orgId | string | 否 | 是 | 使用组织id 示例：1970281714585857 |
| tags | string | 是 | 否 | 标签id 示例：["2305519856210176"] |

## 3. 请求示例

Url: /yonbip/digitalModel/sku/deleteTags?access_token=访问令牌
Body: {
	"data": [
		{
			"skuId": 2350741328023808,
			"orgId": "1970281714585857",
			"tags": [
				"2305519856210176"
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
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

999	操作失败	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

