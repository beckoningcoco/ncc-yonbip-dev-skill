---
title: "客户行业批量保存"
apiId: "c1e5f88e51804779921326151a032608"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer's Industry"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer's Industry]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户行业批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Customer's Industry (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/customertrade/save

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
| data | object | 是 | 是 | 数据集合 |
| id | long | 否 | 否 | 客户行业id，新增时不输，修改时必输 示例：123456 |
| code | string | 否 | 是 | 客户行业编码 示例：20211229001 |
| name | object | 否 | 是 | 客户行业名称 |
| order | long | 否 | 否 | 排序 示例：0 |
| parent | long | 否 | 否 | 上级行业id 示例：2581203136532736 |
| parent_code | string | 否 | 否 | 上级行业编码 示例：20211229 |
| stopstatus | boolean | 否 | 否 | 停用状态, false:启用、true:停用，不传值默认启用 示例：false |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/customertrade/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 123456,
			"code": "20211229001",
			"name": {
				"zh_CN": "20211229001",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"order": 0,
			"parent": 2581203136532736,
			"parent_code": "20211229",
			"stopstatus": false,
			"_status": "Insert"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| count | long | 否 | 操作数量 示例：2 |
| sucessCount | long | 否 | 成功数 示例：2 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 失败原因 示例：["失败原因"] |
| infos | object | 是 | 成功的返回值 |
| failInfos | string | 是 | 错误信息 示例：["错误信息"] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			"失败原因"
		],
		"infos": [
			{
				"code": "zs02",
				"name": {
					"zh_CN": "ed",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": 2563378814521600,
				"isEnd": true,
				"parent": "2581203136532736",
				"parent_code": "20211229",
				"stopstatus": false,
				"isEnabled": true,
				"order": "1",
				"creator": "YonSuite默认用户",
				"creatorId": 2155538209116416,
				"createTime": "2021-12-16 20:03:46",
				"createDate": "2021-12-16 20:03:46",
				"pubts": "2021-12-16 20:03:46",
				"tenant": 2155538208313600,
				"yTenantId": "csrka3z7"
			}
		],
		"failInfos": [
			"错误信息"
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

