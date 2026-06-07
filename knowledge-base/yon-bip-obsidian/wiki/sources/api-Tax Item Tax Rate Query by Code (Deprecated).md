---
title: "税目税率根据编码查询（废弃）"
apiId: "35775b69a3f543c099a124a0a458b97f"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Material Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 税目税率根据编码查询（废弃）

> `ContentType	application/json` 请求方式	GET | 分类: Material Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/taxrate/findByCode

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 否 | 税目税率编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/taxrate/findByCode?access_token=访问令牌&code=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 税目编码 |
| name | string | 否 | 税目名称 |
| ntaxrate | int | 否 | 税率 |
| scope | string | 否 | 适用范围, 1:全部、2:采购、3:销售、 |
| id | string | 否 | 主键 |
| taxfree | string | 否 | 免税, false:否、true:是、 |
| notaxation | string | 否 | 不征税, false:否、true:是、 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"code": "",
		"name": "",
		"ntaxrate": 0,
		"scope": "",
		"id": "",
		"taxfree": "",
		"notaxation": ""
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

