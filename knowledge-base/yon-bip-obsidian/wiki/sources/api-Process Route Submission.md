---
title: "工艺路线提交"
apiId: "1dd7a10a710840f49008ba02d30d9a98"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Routing"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Routing]
platform_version: "BIP"
source_type: community-api-docs
---

# 工艺路线提交

> `ContentType	application/json` 请求方式	POST | 分类: Routing (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/routing/batchsubmit

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 业务数据 |
| id | long | 否 | 否 | 工艺路线id,工艺路线id和工艺路线编码不能同时为空，id和编码同时存在，以id为准 示例：2293848285565184 |
| code | string | 否 | 否 | 工艺路线编码,工艺路线id和工艺路线编码不能同时为空，id和编码同时存在，以id为准 示例：xxx |

## 3. 请求示例

Url: /yonbip/mfg/routing/batchsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2293848285565184,
			"code": "xxx"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| count | long | 否 | 总数量 示例：2 |
| sucessCount | long | 否 | 成功计数 示例：2 |
| failCount | long | 否 | 失败计数 示例：0 |
| messages | string | 是 | 操作失败提示信息 |
| infos | object | 是 | 操作成功单据信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"returncount": 2,
				"verifystate": 1,
				"code": "0011000023",
				"isWfControlled": true,
				"id": 2294117737058560,
				"pubts": "2021-06-16 15:11:31",
				"status": 1,
				"orgId": 1866605942198528,
				"name": "2342",
				"tenant": 1861077976273152
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

