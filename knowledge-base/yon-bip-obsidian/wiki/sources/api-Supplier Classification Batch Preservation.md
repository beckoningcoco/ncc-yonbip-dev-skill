---
title: "供应商分类批量保存"
apiId: "aa6b5f728c3a441ca01715dfcc79dd22"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商分类批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Supplier Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendorclassification/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 供应商分类数据 |
| name | muti_lang | 否 | 是 | 分类名称,支持多语 |
| code | string | 否 | 是 | 分类编码 |
| parent | string | 否 | 否 | 父级分类ID |
| parent_name | string | 否 | 否 | 父级分类名称 |
| parent_code | string | 否 | 否 | 父级分类编码 |
| erpCode | string | 否 | 否 | 外部编码，更新时需要传erpCode或者id |
| order | int | 否 | 否 | 排序号 |
| level | int | 否 | 否 | 等级 |
| path | string | 否 | 否 | 路径 |
| isEnd | boolean | 否 | 否 | 是否末级 true是，false否 |
| id | string | 否 | 否 | 供应商分类ID，新增时不填，更新时需要传ID或者传erpCode |
| comment | muti_lang | 否 | 否 | 备注,支持多语 |
| isEnabled | boolean | 否 | 是 | 是否启用, true:是、false:否 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"name": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"code": "",
			"parent": "",
			"parent_name": "",
			"parent_code": "",
			"erpCode": "",
			"order": 0,
			"level": 0,
			"path": "",
			"isEnd": true,
			"id": "",
			"comment": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"isEnabled": true,
			"_status": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 返回的数据 |
| successCountAI | long | 否 | 成功条数 |
| failCountAI | long | 否 | 失败条数 |
| count | long | 否 | 总条数 |
| sucessCount | long | 否 | 成功条数 |
| failCount | long | 否 | 失败条数 |
| messages | string | 是 | 错误信息 |
| infos | object | 是 | 保存详情信息 |

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"name": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"code": "",
				"erpCode": "",
				"order": 0,
				"level": 0,
				"isEnd": true,
				"isEnabled": true,
				"comment": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": 0,
				"namemultiLangText": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"pubts": "",
				"vendorclassorgs": {
					"org": 0,
					"isCreator": true,
					"pubts": "",
					"_status": ""
				},
				"creator": "",
				"creatorId": 0,
				"createTime": "",
				"createDate": "",
				"tenant": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


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

