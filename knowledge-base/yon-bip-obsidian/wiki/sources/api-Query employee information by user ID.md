---
title: "通过用户ID查询员工信息"
apiId: "337143f38466401f8998ef4ef919c5af"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee]
platform_version: "BIP"
source_type: community-api-docs
---

# 通过用户ID查询员工信息

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staffQry/getStaff

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
| userId | string | 是 | 是 | 用户ID 示例：["31c96777-a69b-4647-9009-424e9fb4e7bf"] |

## 3. 请求示例

Url: /yonbip/digitalModel/staffQry/getStaff?access_token=访问令牌
Body: {
	"userId": [
		"31c96777-a69b-4647-9009-424e9fb4e7bf"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应编码 示例：200 |
| data | object | 否 | 响应数据 |
| status | long | 否 | 返回状态 0：失败，1：成功 示例：1 |
| errorCode | string | 否 | 错误编码 |
| msg | string | 否 | 返回消息 示例：操作成功 |
| data | object | 是 | 员工数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"status": 1,
		"errorCode": "",
		"msg": "操作成功",
		"data": [
			{
				"id": "2226463307780352",
				"name": "qixsss",
				"code": "00000001",
				"mobile": "+86-17612312321",
				"org_id": "2197859119829248",
				"org_id_name": "专业-日常-0402",
				"dept_id": "2226463101833472",
				"dept_id_name": "专业-日常-0402",
				"begindate": "2021-04-22 00:00:00.0",
				"user_id": "bd4a0bad-cebd-4586-8e53-5e40973a72ad",
				"userId": "bd4a0bad-cebd-4586-8e53-5e40973a72ad",
				"email": "23423424@qq.com"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

0	失败

1	成功


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-07

新增

返回参数 email

增加email字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

