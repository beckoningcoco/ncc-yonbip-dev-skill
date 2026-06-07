---
title: "根据任职IDs查询员工IDs"
apiId: "1965565137205592069"
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

# 根据任职IDs查询员工IDs

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staffQry/queryStaffIdsByJobIdList

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
| jobIds | string | 是 | 是 | 任职的ids |

## 3. 请求示例

Url: /yonbip/digitalModel/staffQry/queryStaffIdsByJobIdList?access_token=访问令牌
Body: {
	"jobIds": [
		""
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 是 | 调用成功时的返回数据 |
| errorMsg | string | 否 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"errorMsg": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	后台接口异常	联系管理员


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

