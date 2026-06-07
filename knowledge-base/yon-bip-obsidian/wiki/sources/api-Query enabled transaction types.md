---
title: "查询启用的交易类型"
apiId: "0565d245d1e14e1b95f8b3b85e9eee8a"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Transaction Type"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transaction Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询启用的交易类型

> `ContentType	application/json` 请求方式	GET | 分类: Transaction Type (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/transtype/queryEnableTranstype

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| codeName | string | query | 是 | 交易类型编码|名称 |
| formId | string | query | 是 | 单据号（单据类型表中的form_id字段,可以使用【查询单据类型树】接口获取，取返回参数中对应的formId值） |

## 3. 请求示例

Url: /yonbip/digitalModel/transtype/queryEnableTranstype?access_token=访问令牌&codeName=&formId=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 返回数据 |
| sourceid | string | 否 | 资源id 示例：10000007 |
| code | string | 否 | 交易类型编码 示例：A01007 |
| extend_attrs_json | string | 否 | 交易类型扩展字段 示例：{} |
| log | string | 否 | 交易类型操作日志 |
| sysid | string | 否 | 交易类型系统ID 示例：RM |
| billtype_id | string | 否 | 单据ID 示例：101 |
| memo | string | 否 | 备注多语 示例：售卡 |
| preset | long | 否 | 预制交易类型（1表示预制） 示例：0 |
| default | string | 否 | 默认交易类型（1表示默认交易类型） 示例：0 |
| enable | long | 否 | 启用交易类型（1表示启用） 示例：1 |
| name | string | 否 | 名称 示例：售卡 |
| id | string | 否 | 主键 示例：2254283204956420 |
| pubts | string | 否 | 时间戳 示例：2021-05-12 11:35:27 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"sourceid": "10000007",
			"code": "A01007",
			"extend_attrs_json": "{}",
			"log": "",
			"sysid": "RM",
			"billtype_id": "101",
			"memo": "售卡",
			"preset": 0,
			"default": "0",
			"enable": 1,
			"name": "售卡",
			"id": "2254283204956420",
			"pubts": "2021-05-12 11:35:27"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

更新

返回参数 (16)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

