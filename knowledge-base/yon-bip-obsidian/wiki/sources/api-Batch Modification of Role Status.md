---
title: "角色状态批量修改"
apiId: "065320c1bd7946daa7a713a7ffb31254"
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

# 角色状态批量修改

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/role/hiden

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
| hideRole | boolean | 否 | 是 | true:隐藏角色 false:显示角色 示例：true |
| tenantId | string | 否 | 是 | 友户通租户id 示例：rjtfwo7u |
| roleCodes | string | 是 | 是 | 角色编码 示例：["testB1","999"] |
| systemCode | string | 否 | 是 | 系统编码 示例：diwork |

## 3. 请求示例

Url: /yonbip/digitalModel/role/hiden?access_token=访问令牌
Body: {
	"hideRole": true,
	"tenantId": "rjtfwo7u",
	"roleCodes": [
		"testB1",
		"999"
	],
	"systemCode": "diwork"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态码 示例：200 |
| data | object | 否 | 返回更新数 |
| count | int | 否 | 执行数 示例：2 |
| sucessCount | int | 否 | 成功数 示例：1 |
| fileCount | int | 否 | 失败数 示例：1 |
| messages | string | 否 | 提示信息 示例：角色编码[ttsts]不存在 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | string | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"fileCount": 1,
		"messages": "角色编码[ttsts]不存在"
	},
	"displayCode": "000-545-100001",
	"level": "0"
}

## 6. 业务异常码

000-554-110010

上下文读取友户通租户Id失败！


## 7. 错误返回码

999	服务端逻辑异常	查看服务报错日志


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

