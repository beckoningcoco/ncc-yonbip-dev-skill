---
title: "交易类型保存V2"
apiId: "1945031834876248073"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transaction Type"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transaction Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 交易类型保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Transaction Type (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/transtype/save_idempotent

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 交易类型[bd.bill.TransType] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 主键 新增时无需填写，修改时必填 新增时无需填写，修改时必填 新增时无需填写，修改时必填 |
| code | string | 否 | 是 | 交易类型编码 |
| billtype_id | string | 否 | 是 | 单据类型 |
| name | string | 否 | 是 | 交易类型名称 |
| memo | string | 否 | 否 | 备注 |
| default | string | 否 | 否 | 默认交易类型, 0:否、1:是、 |

## 3. 请求示例

Url: /yonbip/digitalModel/transtype/save_idempotent?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"code": "",
		"billtype_id": "",
		"name": "",
		"memo": "",
		"default": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| enable | int | 否 | 是否启用，2否、1是 |
| preset | string | 否 | 是否预置，，0否、1是 |
| extend_attrs_json | string | 否 | 扩展字段属性拼接json |
| billtype_id | string | 否 | 单据类型 |
| code | string | 否 | 交易类型编码 |
| name | string | 否 | 交易类型名称 |
| default | string | 否 | 默认交易类型, 0:否、1:是、 |
| id | int | 否 | 主键 |
| memo | string | 否 | 备注 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"enable": 0,
		"preset": "",
		"extend_attrs_json": "",
		"billtype_id": "",
		"code": "",
		"name": "",
		"default": "",
		"id": 0,
		"memo": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

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

