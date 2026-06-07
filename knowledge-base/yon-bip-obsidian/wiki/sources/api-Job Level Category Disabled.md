---
title: "职级类别停用"
apiId: "1815041505744650242"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级类别停用

> `ContentType	application/json` 请求方式	POST | 分类: Job Level Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bd_rank_type/disable

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
| id | string | 否 | 是 | 主键 |
| code | string | 否 | 否 | 编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/bd_rank_type/disable?access_token=访问令牌
Body: {
	"data": {
		"id": "",
		"code": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| code | string | 否 | 编码 |
| enable | int | 否 | 启用状态，0初始化 1启用 2停用 |
| name | string | 否 | 名称 |
| memo | string | 否 | 描述 |
| id | string | 否 | 主键 |
| pubts | string | 否 | 时间戳 |
| modifier | string | 否 | 修改人 |
| modifiedtime | string | 否 | 修改时间 |
| yhtTenant | string | 否 | 友互通租户 |
| tenant | string | 否 | 租户ID |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "",
		"enable": 0,
		"name": "",
		"memo": "",
		"id": "",
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

999	停用失败


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

