---
title: "员工下级查询"
apiId: "1680737027993108488"
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

# 员工下级查询

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staffQry/currentStaffSubStaffDTO

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
| staffId | string | 否 | 是 | 员工ID或者code 示例：31c96777-a69b-4647-9009-424e9fb4e7bf |
| isInCludeLeaveStaff | boolean | 否 | 否 | 是否包含已离职员工，true包含；false不包含 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/digitalModel/staffQry/currentStaffSubStaffDTO?access_token=访问令牌
Body: {
	"staffId": "31c96777-a69b-4647-9009-424e9fb4e7bf",
	"isInCludeLeaveStaff": false
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 响应信息 示例：操作成功 |
| code | string | 否 | 响应编码 示例：200 |
| data | string | 是 | 下级员工id合集 |

## 5. 正确返回示例

{
	"message": "操作成功",
	"code": "200",
	"data": [
		""
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	失败	请求异常


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

