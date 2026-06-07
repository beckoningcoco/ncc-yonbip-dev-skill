---
title: "查询交易类型详情"
apiId: "b57a9b706dcd47efb7d98878cda368c1"
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

# 查询交易类型详情

> `ContentType	application/json` 请求方式	GET | 分类: Transaction Type (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/transtype/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 交易类型id或code，根据id搜不到会尝试使用code查询 |

## 3. 请求示例

Url: /yonbip/digitalModel/transtype/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | int | 否 | 主键 示例：110000000000042 |
| billtype_id | string | 否 | 单据类型 示例：21 |
| code | string | 否 | 交易类型编码 示例：A21001 |
| name | object | 否 | 交易类型名称多语 |
| default | string | 否 | 默认交易类型, 0:否、1:是、 示例：1 |
| memo | object | 否 | 备注多语 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 110000000000042,
		"billtype_id": "21",
		"code": "A21001",
		"name": {
			"zh_CN": "普通委外",
			"zh_TW": "普通委外",
			"en_US": "General outsourcing"
		},
		"default": "1",
		"memo": {
			"zh_CN": "普通委外",
			"zh_TW": "普通委外",
			"en_US": "General outsourcing"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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

