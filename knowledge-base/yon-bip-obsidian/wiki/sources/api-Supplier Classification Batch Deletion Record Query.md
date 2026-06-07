---
title: "供应商分类批量删除记录查询"
apiId: "2241284831897452550"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商分类批量删除记录查询

> `ContentType	application/json` 请求方式	POST | 分类: Supplier Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendorclassification/getDeleteVendorClassRecord

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页码 示例：1 |
| pageSize | string | 否 | 否 | 分页大小 示例：10 |
| pubts | string | 否 | 否 | 更新时间 示例：2025-01-01 00:00:00 |
| otherFields | string | 否 | 否 | 其他查询字段 示例：name,code |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/getDeleteVendorClassRecord?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": "10",
	"pubts": "2025-01-01 00:00:00",
	"otherFields": "name,code"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 |
| message | string | 否 | 消息 |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 |
| recordList | object | 是 | 数据 |

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordList": [
			{
				"objId": "",
				"pubts": ""
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

