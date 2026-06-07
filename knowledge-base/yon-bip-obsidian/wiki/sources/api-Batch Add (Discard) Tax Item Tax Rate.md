---
title: "税目税率批量新增（废弃）"
apiId: "e3d0ede2c568452e92accdf6b53c75de"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 税目税率批量新增（废弃）

> `ContentType	application/json` 请求方式	POST | 分类: Material Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/taxrate/batchSave

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
| data | object | 是 | 是 | 数据 |
| id | string | 否 | 否 | 税目税率主键，新增时无需填写，修改必填 |
| code | string | 否 | 是 | 编码 示例：阿迪王无 |
| name | muti_lang | 否 | 是 | 名称 |
| ntaxRate | float | 否 | 是 | 税率，最多保留2位小数 |
| scope | string | 否 | 是 | 适用范围, 1:全部、2:采购、3:销售、 示例：3 |
| taxFree | boolean | 否 | 否 | 免税, false:否、true:是，与不征税不能同时填写,当免税为true时，ntaxRate填写为0 示例：true |
| noTaxation | boolean | 否 | 否 | 不征税, false:否、true:是，与免税不能同时填写,当不征税为true时，ntaxRate填写为0 示例：false |
| enable | string | 否 | 是 | 启用状态，1:启用、2:停用 示例：1 |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/taxrate/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"code": "阿迪王无",
			"name": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"ntaxRate": 0,
			"scope": "3",
			"taxFree": true,
			"noTaxation": false,
			"enable": "1",
			"_status": "Insert"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 回执码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 数据 |
| count | long | 否 | 总数 示例：2 |
| sucessCount | long | 否 | 成功数 示例：2 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 信息 |
| infos | object | 是 | 详情 |
| failInfos | string | 是 | 失败详情 |

## 5. 正确返回示例

{
	"code": "200",
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
				"noTaxation": "false",
				"taxFree": false,
				"code": "请问1",
				"ntaxRate": 2,
				"enable": 1,
				"scope": 3,
				"name": {
					"zh_CN": "qw1",
					"en_US": "",
					"zh_TW": ""
				},
				"id": "2601287649268736",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creationtime": "2022-01-12 14:46:38",
				"pubts": "2022-01-12 14:46:38",
				"yhtTenantId": "gppq37wd",
				"yhtTenant": "gppq37wd",
				"tenant": "gppq37wd",
				"yTenantId": "gppq37wd"
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

