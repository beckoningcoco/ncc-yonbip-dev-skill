---
title: "物料状态删除"
apiId: "1665178294217605122"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Life Cycle Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Life Cycle Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料状态删除

> `ContentType	application/json` 请求方式	POST | 分类: Life Cycle Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/materialstatus/delete

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
| idList | string | 是 | 否 | 物料状态Id集合，若有id时优先以id数据为准 示例：["1752588351926435846","1752588351926435847"] |
| codeList | string | 是 | 否 | 物料状态编码集合，若id有值时优先以id数据为准 示例：["test1","test2"] |

## 3. 请求示例

Url: /yonbip/digitalModel/materialstatus/delete?access_token=访问令牌
Body: {
	"idList": [
		"1752588351926435846",
		"1752588351926435847"
	],
	"codeList": [
		"test1",
		"test2"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| count | long | 否 | 处理总条数 示例：2 |
| sucessCount | long | 否 | 成功总条数 示例：0 |
| failCount | long | 否 | 失败总条数 示例：2 |
| messages | string | 是 | 失败信息汇总 示例：["物料状态[123213]在生命周期模板中[test01]已存在引用不允许删除，请检查!","物料状态[test1]非停用状态不允许删除，请确认!"] |
| failInfos | object | 是 | 失败信息明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 0,
		"failCount": 2,
		"messages": [
			"物料状态[123213]在生命周期模板中[test01]已存在引用不允许删除，请检查!",
			"物料状态[test1]非停用状态不允许删除，请确认!"
		],
		"failInfos": [
			{
				"code": "test",
				"id": "1587976695062724615",
				"message": "物料状态[123213]在生命周期模板中[test01]已存在引用不允许删除，请检查!"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否


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

