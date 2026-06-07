---
title: "项目类别停用"
apiId: "a7646999e7cc4248a4e34742220ecf96"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目类别停用

> `ContentType	application/json` 请求方式	POST | 分类: Project Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/projectclass/disable

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
| data | object | 是 | 是 | 业务数据 |
| id | string | 否 | 是 | 项目类别主键 示例：2415932380500992 |

## 3. 请求示例

Url: /yonbip/digitalModel/projectclass/disable?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2415932380500992"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 回执信息 示例：操作成功 |
| data | object | 否 | 回执数据 |
| pubts | string | 否 | 时间戳 示例：2021-11-23 15:40:24 |
| id | string | 否 | 主键 示例：2523805571764736 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pubts": "2021-11-23 15:40:24",
		"id": "2523805571764736"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	请检查请求路径和参数是否正确，确认请求数据是否存在，如若无误联系管理员确认服务是否异常？


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

