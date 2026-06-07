---
title: "银行类别启用"
apiId: "bf29cbeebf7a4e2e897eaab6f1e4fb2b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行类别启用

> `ContentType	application/json` 请求方式	POST | 分类: Bank Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bank/enable

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 银行类别主键 |

## 3. 请求示例

Url: /yonbip/digitalModel/bank/enable?access_token=访问令牌
Body: {
	"data": {
		"id": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码，200成功 999失败 示例：200 |
| message | string | 否 | 回执消息 示例：操作成功 |
| data | object | 否 | 回执数据 |
| _realtype | string | 否 | 源类型 |
| _entityName | string | 否 | 实体名 |
| _keyName | string | 否 | 关键字 |
| enable | long | 否 | 是否启用 1-启用 2-停用 示例：1 |
| id | string | 否 | 银行类别主键 示例：ffcac2fe-cda2-11e7-8e8e-7cd30abe |
| pubts | string | 否 | 时间戳 示例：2021-11-23 15:40:24 |
| _status | string | 否 | 状态 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"enable": 1,
		"id": "ffcac2fe-cda2-11e7-8e8e-7cd30abe",
		"pubts": "2021-11-23 15:40:24",
		"_status": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务错误


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

