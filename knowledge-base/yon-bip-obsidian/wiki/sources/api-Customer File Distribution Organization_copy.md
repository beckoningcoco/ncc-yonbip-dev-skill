---
title: "客户档案取消分配组织"
apiId: "2459407451844771847"
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

# 客户档案取消分配组织

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/merchant/cancelSuitOrg

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

执行方式	异步API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 参数数据体 |
| merchantId | long | 否 | 是 | 所属客户id 示例：2285747004510464 |
| orgIds | string | 是 | 是 | 分配组织id 示例：["2285679325860352"] |

## 3. 请求示例

Url: /yonbip/PFC/merchant/cancelSuitOrg?access_token=访问令牌
Body: {
	"data": [
		{
			"merchantId": 2285747004510464,
			"orgIds": [
				"2285679325860352"
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| infos | object | 是 | 异步执行成功后，返回信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"infos": [
			{
				"asyncKey": "cancelSuitOrg_423ccf66-015a-4622-8d5c-8150b50ce5c0"
			}
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

