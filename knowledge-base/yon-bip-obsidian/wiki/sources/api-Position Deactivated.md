---
title: "岗位停用"
apiId: "82a824cc10f244e3a1621d5f669749d5"
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

# 岗位停用

> `ContentType	application/json` 请求方式	POST | 分类: Position (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/position/disable

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 职位主键 |

## 3. 请求示例

Url: /yonbip/digitalModel/position/disable?access_token=访问令牌
Body: {
	"data": {
		"id": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 状态码，200成功 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| code | string | 否 | 编码 |
| org_id_name | string | 否 | 组织名称 |
| org_id | string | 否 | 组织主键 |
| dept_id_name | string | 否 | 部门名称 |
| enable | int | 否 | 启用状态，0初始化 1启用 2停用 |
| name | string | 否 | 名称 |
| id | string | 否 | 职位主键 |
| dept_id | string | 否 | 部门主键 |
| pubts | DateTime | 否 | 时间戳，yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 修改人 |
| modifiedtime | string | 否 | 修改时间，yyyy-MM-dd HH:mm:ss |
| yhtTenant | string | 否 | 友互通租户 |
| tenant | string | 否 | 租户ID |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "",
		"org_id_name": "",
		"org_id": "",
		"dept_id_name": "",
		"enable": 0,
		"name": "",
		"id": "",
		"dept_id": "",
		"pubts": "",
		"modifier": "",
		"modifiedtime": "",
		"yhtTenant": "",
		"tenant": ""
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

