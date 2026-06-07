---
title: "用户通过员工编号绑定员工"
apiId: "fe81582702304bab8d788b06055f7532"
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

# 用户通过员工编号绑定员工

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bindStaffUserByStaffCode

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| tenantId | string | query | 否 | tenantId |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| staffCodeUserIdMap | object | 否 | 是 | 参数格式：员工编码与用户id的map |

## 3. 请求示例

Url: /yonbip/digitalModel/bindStaffUserByStaffCode?access_token=访问令牌&tenantId=
Body: {
	"staffCodeUserIdMap": {}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回的信息 示例：success |
| data | object | 是 | 返回数据 |
| status | long | 否 | 0绑定失败，1绑定成功 示例：0 |
| code | string | 否 | 员工编号 示例：001 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": [
		{
			"status": 0,
			"code": "001"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-05

更新

请求参数 staffCodeUserIdMap

修改示例


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

