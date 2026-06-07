---
title: "创建用户组"
apiId: "1742344545710374919"
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

# 创建用户组

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/usergroup/create

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
| code | string | 否 | 是 | 用户组编码 示例：code1113 |
| name | object | 否 | 是 | 用户组名称 |
| zh_CN | string | 否 | 是 | 简体中文 示例：外部用户组 |
| en_US | string | 否 | 否 | 英文 |
| zh_TW | string | 否 | 否 | 繁体 |
| type | string | 否 | 是 | 11普通员工,12客户管理员,13客户业务员,14商家管理员,15商家业务员,16外部参会人员,17供应商,18其他外部人员,以及其他自定义类型id 示例：18 默认值：18 |

## 3. 请求示例

Url: /yonbip/digitalModel/usergroup/create?access_token=访问令牌
Body: {
	"code": "code1113",
	"name": {
		"zh_CN": "外部用户组",
		"en_US": "",
		"zh_TW": ""
	},
	"type": "18"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| data | object | 否 | 返回数据对象 |
| id | string | 否 | 用户组主键 示例：7350290927258173440 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"id": "7350290927258173440"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110021

用户组编码不能重复


## 7. 错误返回码


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

