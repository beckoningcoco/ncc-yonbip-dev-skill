---
title: "SKU属性列表查询"
apiId: "0b469a5d96324c84b15139019f5638ef"
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

# SKU属性列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Product SKU File (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/pc_productskupro/list

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
| pageSize | long | 否 | 是 | 页大小 示例：10 |
| pageIndex | long | 否 | 是 | 当前页索引 示例：1 |
| simple | object | 否 | 否 | 查询条件，当SKU属性id与SKU属性名称同时输入时，任何一项输入错误，返回结果为空 |
| id | string | 否 | 否 | SKU属性id |
| showItem | string | 否 | 否 | SKU属性名称 |

## 3. 请求示例

Url: /yonbip/digitalModel/pc_productskupro/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"simple": {
		"id": "",
		"showItem": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求返回信息 示例：操作成功 |
| data | object | 否 | 请求返回的数据 |
| pageIndex | long | 否 | 当前页索引 示例：1 |
| pageSize | long | 否 | 页大小 示例：10 |
| recordCount | long | 否 | 记录条数 示例：0 |
| recordList | object | 是 | 记录条数 |
| pageCount | long | 否 | 页数 示例：0 |
| beginPageIndex | long | 否 | 起始页索引 示例：1 |
| endPageIndex | long | 否 | 尾页索引 示例：0 |
| pubts | string | 否 | 时间戳 示例：2021-03-03 10:47:15 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 0,
		"recordList": [
			{
				"isSerInput": false,
				"item": "自定义项3",
				"orderNum": 1,
				"userdefAlias": "繁体-SKU属性名1",
				"type": "String",
				"isEnabled": true,
				"showItem": "繁体-SKU属性名1",
				"sourcetype": false,
				"id": 1838006558658882,
				"isWebShow": false,
				"iorder": 3,
				"pubts": "2020-08-31 17:11:12",
				"maxInputLen": 200
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-03-03 10:47:15"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

