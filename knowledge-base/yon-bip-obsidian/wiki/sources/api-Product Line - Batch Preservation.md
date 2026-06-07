---
title: "产品线-批量保存"
apiId: "e91a63a554814311b4ac02adf63a9e57"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Line"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Line]
platform_version: "BIP"
source_type: community-api-docs
---

# 产品线-批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Product Line (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/productline/save

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
| id | long | 否 | 否 | 产品线id，新增时不输，修改时必输 示例：2578664973308160 |
| code | string | 否 | 是 | 产品线编码 示例：20211227 |
| name | object | 否 | 是 | 产品线名称 |
| stopstatus | boolean | 否 | 是 | 停用状态, false:启用、true:停用 示例：false 默认值：false |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Update |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/productline/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2578664973308160,
			"code": "20211227",
			"name": {
				"zh_CN": "20211227",
				"en_US": "",
				"zh_TW": ""
			},
			"stopstatus": false,
			"_status": "Update"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| count | long | 否 | 操作数量 示例：2 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：1 |
| messages | string | 是 | 失败原因 示例：["编码 (sd)已经存在"] |
| infos | object | 是 | 成功的返回值 |
| failInfos | string | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			"编码 (sd)已经存在"
		],
		"infos": [
			{
				"id": 2579778207945216,
				"code": "大",
				"name": {
					"zh_CN": "阿凡达",
					"en_US": "424",
					"zh_TW": "42424"
				},
				"remark": {
					"zh_CN": "4756",
					"en_US": "2424",
					"zh_TW": "备注"
				},
				"stopstatus": true,
				"isEnabled": true,
				"stoptime": "2021-12-28 10:15:57",
				"pubts": "2021-12-28 10:16:06",
				"tenant": 0,
				"yTenantId": ""
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

