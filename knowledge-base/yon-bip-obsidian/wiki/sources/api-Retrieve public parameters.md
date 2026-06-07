---
title: "获取公共参数"
apiId: "1493750232277581824"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "BIP Built-in Permission Rule Parameters"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BIP Built-in Permission Rule Parameters]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取公共参数

> `ContentType	application/json` 请求方式	GET | 分类: BIP Built-in Permission Rule Parameters (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/rest/option/getOptionByName

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| name | string | query | 是 | 参数编码    示例: allowToAuth |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/option/getOptionByName?access_token=访问令牌&name=allowToAuth

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码 示例：200 |
| data | object | 否 | 返回数据 |
| name | string | 否 | 参数编码 示例：conversionAccuracy |
| caption | string | 否 | 参数名称 示例：换算率精度 |
| value | long | 否 | 参数值 示例：0 |
| tenantId | string | 否 | 租户 id 示例：2223793007218944 |
| orgId | string | 否 | 组织 id |
| paramsType | long | 否 | 参数类型，0: 租户级，1: 组织级别 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"name": "conversionAccuracy",
		"caption": "换算率精度",
		"value": 0,
		"tenantId": "2223793007218944",
		"orgId": "",
		"paramsType": 0
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	没有对应的参数值	修改请求参数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level

更新

返回参数 (8)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

