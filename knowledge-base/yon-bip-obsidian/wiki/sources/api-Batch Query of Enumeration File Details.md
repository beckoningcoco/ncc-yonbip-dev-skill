---
title: "枚举档案详情批量查询"
apiId: "2076343141326127106"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "User-defined File Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, User-defined File Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 枚举档案详情批量查询

> `ContentType	application/json` 请求方式	POST | 分类: User-defined File Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/enum/queryByCodes

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情批量查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| enumtypes | string | 是 | 否 | 枚举定义编码列表 示例：["test001"] 最大请求量：100 |
| enable | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 启用状态，1表示启用，2表示停用 示例：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/enum/queryByCodes?access_token=访问令牌
Body: {
	"enumtypes": [
		"test001"
	],
	"enable": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 是 | 调用成功时的返回数据 |
| id | string | 否 | 枚举类型id 示例：2061352004656562183 |
| code | string | 否 | 枚举类型编码 示例：test000 |
| name | string | 否 | 枚举类型名称 示例：test000 |
| measurepoint | object | 是 | 枚举值列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "2061352004656562183",
			"code": "test000",
			"name": "test000",
			"measurepoint": [
				{
					"id": "2061352004656562184",
					"code": "1",
					"name": "1",
					"custenumdefid": "2061352004656562183",
					"enumDefCode": "test000",
					"sortnum": "0"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	按参数格式正确填写


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-09

新增

请求参数 enable

更新

请求参数 enumtypes


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

