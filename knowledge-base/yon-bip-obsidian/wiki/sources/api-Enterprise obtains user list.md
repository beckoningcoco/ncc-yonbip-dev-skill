---
title: "企业获取用户列表"
apiId: "1814328188995633159"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业获取用户列表

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/company/users

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
| companyAppAuthId | string | 否 | 是 | 企业授权ID 示例：1806237724627173376 |
| uniqueId | string | 否 | 否 | 业务系统方关联的唯一标识Id 示例：11232123 |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/company/users?access_token=访问令牌
Body: {
	"companyAppAuthId": "1806237724627173376",
	"uniqueId": "11232123"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 示例：{users: [{"accountId": "bed7785e-cca1-4833-879d-da76f90fa787","name": "小明"}]} |
| accountId | string | 否 | 用户账号ID 示例：bed7785e-cca1-4833-879d-da76f90fa787 |
| name | string | 否 | 用户名称 示例：小明 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"users": [
			{
				"accountId": "bed7785e-cca1-4833-879d-da76f90fa787",
				"name": "小明"
			}
		],
		"accountId": "bed7785e-cca1-4833-879d-da76f90fa787",
		"name": "小明"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	后端系统异常信息	后端系统异常导致业务执行失败


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

