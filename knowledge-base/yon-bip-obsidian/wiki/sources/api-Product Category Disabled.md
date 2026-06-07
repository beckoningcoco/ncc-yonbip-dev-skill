---
title: "商品分类停用"
apiId: "3faf64aeb6a748758b5abcb233680f1d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 商品分类停用

> `ContentType	application/json` 请求方式	POST | 分类: Product Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/presentationclass/stop

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
| data | object | 是 | 是 | 请求数据 |
| id | long | 否 | 是 | 商品分类id 示例：1973868427759872 |

## 3. 请求示例

Url: /yonbip/digitalModel/presentationclass/stop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1973868427759872
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 是 | 请求结果数据 |
| id | long | 否 | 商品分类id 示例：1973868427759872 |
| stoptime | string | 否 | 停用时间 示例：2020-10-26 09:26:23 |
| stopstatus | boolean | 否 | 是否为停用状态，true:已停用，false：已启用 示例：true |
| pubts | string | 否 | 时间戳 示例：2020-10-26 09:26:23 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 1973868427759872,
			"stoptime": "2020-10-26 09:26:23",
			"stopstatus": true,
			"pubts": "2020-10-26 09:26:23"
		}
	]
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

