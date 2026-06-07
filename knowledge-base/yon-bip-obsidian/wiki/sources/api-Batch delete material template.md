---
title: "物料模板批量删除"
apiId: "9122c38a14f94d4dba3fc77c7e56f281"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料模板批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Material Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/producttpl/batchDelete

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
| data | object | 是 | 是 | 参数数据体 |
| id | long | 否 | 是 | 物料模板id 示例：2281489327214848 |
| pubts | string | 否 | 否 | 时间戳 示例：2021-07-19 16:39:17 |

## 3. 请求示例

Url: /yonbip/digitalModel/producttpl/batchDelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2281489327214848,
			"pubts": "2021-07-19 16:39:17"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| successCountAI | long | 否 | 成功记录数初始值，默认为0 示例：1 |
| failCountAI | long | 否 | 失败记录数初始值 示例：0 |
| count | long | 否 | 本次选择记录数 示例：1 |
| sucessCount | long | 否 | 成功记录数 示例：1 |
| failCount | long | 否 | 失败记录数 示例：0 |
| messages | string | 是 | 失败原因列表 |
| infos | string | 是 | 异步执行成功后，返回信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员	操作失败


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

