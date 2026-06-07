---
title: "岗位数量查询_通过组织部门"
apiId: "2049454575872638976"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Position"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Position]
platform_version: "BIP"
source_type: community-api-docs
---

# 岗位数量查询_通过组织部门

> `ContentType	application/json` 请求方式	POST | 分类: Position (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/position/countByOrgIdOrDeptId

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| idList | string | 是 | 是 | 组织或者部门id 示例：["111","222"] |
| conditionType | string | 否 | 是 | 组织或者部门 示例：ORG或者DEPT 默认值：ORG |
| queryStartTimeDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 查询开始日期，非时间租户不用传，时间轴租户，不传则默认为当天 示例：2024-08-05 |

## 3. 请求示例

Url: /yonbip/digitalModel/position/countByOrgIdOrDeptId?access_token=访问令牌
Body: {
	"idList": [
		"111",
		"222"
	],
	"conditionType": "ORG或者DEPT",
	"queryStartTimeDate": "2024-08-05"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | data |
| id1 | object | 否 | key为id,value为数量 示例：{ "111": 0, "1936763516023734273": 2 } |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id1": {
			"111": 0,
			"1936763516023734273": 2
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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

