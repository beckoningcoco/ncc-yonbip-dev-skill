---
title: "生命周期模板删除"
apiId: "1665208101290639362"
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

# 生命周期模板删除

> `ContentType	application/json` 请求方式	POST | 分类: Life Cycle Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/lifeCycleTemplate/delete

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
| idList | string | 是 | 否 | 生命周期模板Id，若Id 和code 同时存在以id为准 示例：["1654770892589236228"] |
| codeList | string | 是 | 否 | 生命周期模板编码 若id为空时会以code作为删除依据 示例：["0114"] |

## 3. 请求示例

Url: /yonbip/digitalModel/lifeCycleTemplate/delete?access_token=访问令牌
Body: {
	"idList": [
		"1654770892589236228"
	],
	"codeList": [
		"0114"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的异常错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据结果 |
| count | long | 否 | 本次处理总数 示例：3 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：2 |
| messages | string | 是 | 失败原因汇总 示例：["生命周期模板[123]非停用状态不允许删除，请确认!","生命周期模板[cesda]非停用状态不允许删除，请确认!"] |
| failInfos | object | 是 | 具体失败原因明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 3,
		"sucessCount": 1,
		"failCount": 2,
		"messages": [
			"生命周期模板[123]非停用状态不允许删除，请确认!",
			"生命周期模板[cesda]非停用状态不允许删除，请确认!"
		],
		"failInfos": [
			{
				"code": "123",
				"id": "1594818260151828484",
				"message": "生命周期模板[123]非停用状态不允许删除，请确认!"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

