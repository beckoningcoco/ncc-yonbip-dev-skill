---
title: "查询用户签名图片"
apiId: "2149116087947493380"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Process Instance"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Process Instance]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询用户签名图片

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/identity/ext/users/lastSignUrlAndFileId

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| ids | string | 是 | 否 | 友户通用户id |

## 3. 请求示例

Url: /yonbip/digitalModel/identity/ext/users/lastSignUrlAndFileId?access_token=访问令牌
Body: {
	"ids": [
		""
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：查询成功 |
| data | object | 是 | 接口返回数据 |
| userId | string | 否 | 友户通用户id 示例：7dddd127-4024-4bc0-9812-7428f9e4d4be |
| signUrl | string | 否 | 用户上次使用的签名图片url 示例：https://cdn.yonyoucloud.com/dev/yht/test/yht/signImage/1711684103185.png |
| fileId | string | 否 | 用户上次使用的签名图片的fileId |
| displayCode | string | 否 | 业务异常码 示例：000-530-000001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "查询成功",
	"data": [
		{
			"userId": "7dddd127-4024-4bc0-9812-7428f9e4d4be",
			"signUrl": "https://cdn.yonyoucloud.com/dev/yht/test/yht/signImage/1711684103185.png",
			"fileId": "",
			"displayCode": "000-530-000001",
			"level": 0
		}
	]
}

## 6. 业务异常码

000-530-000001

租户信息不能为空

000-530-000002

用户信息不能为空


## 7. 错误返回码

405	接口禁止访问

500	服务器错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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

