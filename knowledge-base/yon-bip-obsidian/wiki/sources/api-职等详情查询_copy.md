---
title: "职等详情查询_copy"
apiId: "2490434226884706311"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Job Grade"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Grade]
platform_version: "BIP"
source_type: community-api-docs
---

# 职等详情查询_copy

> `ContentType` 请求方式	GET | 分类: Job Grade (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/grade/detail_copy

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 职等主键 |
| code | string | query | 否 | 职等编码 |

## 3. 请求示例

Url: /yonbip/PFC/grade/detail_copy?access_token=访问令牌&id=&code=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| code | string | 否 | 编码 |
| jobrankorder | long | 否 | 职等排序 |
| sysid | string | 否 | 系统标识 |
| enable | int | 否 | 启用状态，0初始化 1启用 2停用 |
| name | muti_lang | 否 | 名称 |
| memo | muti_lang | 否 | 描述 |
| id | string | 否 | 主键 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "",
		"jobrankorder": 0,
		"sysid": "",
		"enable": 0,
		"name": "",
		"memo": "",
		"id": ""
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

