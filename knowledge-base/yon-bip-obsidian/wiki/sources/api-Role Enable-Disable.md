---
title: "角色启用停用"
apiId: "2068895599325347845"
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

# 角色启用停用

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/role/updateRoleIsEnable

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
| enable | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 角色状态 （1：启用 0：停用） 示例：1 |
| roleIdList | string | 是 | 是 | 角色ID集合 示例：["e411bc58-adc3-40a2-a21d-8c4d2adef58d"] 最大请求量：1000 |

## 3. 请求示例

Url: /yonbip/digitalModel/role/updateRoleIsEnable?access_token=访问令牌
Body: {
	"enable": 1,
	"roleIdList": [
		"e411bc58-adc3-40a2-a21d-8c4d2adef58d"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 返回信息 示例：操作成功 |
| code | string | 否 | 返回状态码 示例：200 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"message": "操作成功",
	"code": "200",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110211

参数异常


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

