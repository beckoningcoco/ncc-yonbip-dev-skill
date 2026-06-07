---
title: "快速授权(增量更新)"
apiId: "1962105051439169538"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BIP Role"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BIP Role]
platform_version: "BIP"
source_type: community-api-docs
---

# 快速授权(增量更新)

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/open/funcpermission/incremental/fastAuth

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
| subjectType | string | 否 | 是 | 授权类型，目前仅开放user 示例：user |
| serviceIds | string | 是 | 否 | 服务id（工作台wb_service表）,与serviceCodes参数传一个即可，优先取serviceId 示例：["0235a9bc-74af-4b18-b0d5-1ecfe726b905"] |
| subjectIds | string | 是 | 是 | 授权主体{用户id:yhtuserid} 示例：["fe6733b7-b6a7-4f0e-b352-c1252bc207e9", "fdf5c255-3d52-4e27-b44e-9ae0b26173e1"] |
| serviceCodes | string | 是 | 否 | 服务编码，与serviceId传一个即可，优先取serviceId 示例：[ "AMC211012"] |
| operationType | string | 否 | 否 | 数据操作类型add:添加 delete:删除,作用于服务与用户的关联关系 示例：add 默认值：add |

## 3. 请求示例

Url: /yonbip/digitalModel/open/funcpermission/incremental/fastAuth?access_token=访问令牌
Body: {
	"subjectType": "user",
	"serviceIds": [
		"0235a9bc-74af-4b18-b0d5-1ecfe726b905"
	],
	"subjectIds": [
		"fe6733b7-b6a7-4f0e-b352-c1252bc207e9",
		"fdf5c255-3d52-4e27-b44e-9ae0b26173e1"
	],
	"serviceCodes": [
		"AMC211012"
	],
	"operationType": "add"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 返回信息 示例：授权成功 |
| code | string | 否 | 状态码 示例：200 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"message": "授权成功",
	"code": "200",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110010

上下文读取友户通租户Id失败！


## 7. 错误返回码

999	参照message提示	参照提示信息修改请求数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

