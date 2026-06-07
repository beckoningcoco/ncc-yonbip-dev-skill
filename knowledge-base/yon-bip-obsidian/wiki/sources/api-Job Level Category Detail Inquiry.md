---
title: "职级类别详情查询"
apiId: "1815044641070776323"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Job Level Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级类别详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Job Level Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bd_rank_type/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 否 | 职级类别编码 |
| id | string | query | 是 | 职级类别主键 |

## 3. 请求示例

Url: /yonbip/digitalModel/bd_rank_type/detail?access_token=访问令牌&code=&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| code | string | 否 | 编码 |
| enable | int | 否 | 启用状态，0初始化 1启用 2停用 |
| name | object | 否 | 名称 |
| memo | string | 否 | 描述 |
| id | string | 否 | 主键 |
| pubts | string | 否 | 时间戳 |
| dr | long | 否 | 删除状态，0未删除 1已删除 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "",
		"enable": 0,
		"name": {
			"en_US": "",
			"zh_TW": "",
			"zh_CN": ""
		},
		"memo": "",
		"id": "",
		"pubts": "",
		"dr": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	查询详情失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-09

新增

返回参数 en_US

新增

返回参数 zh_TW

新增

返回参数 zh_CN

更新

返回参数 name


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

