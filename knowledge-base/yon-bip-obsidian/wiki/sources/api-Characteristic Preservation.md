---
title: "特征保存"
apiId: "1660725400984092677"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Characteristic"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic]
platform_version: "BIP"
source_type: community-api-docs
---

# 特征保存

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/iuap-metadata-extend/import/character

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
| data | object | 是 | 否 | data |
| code | string | 否 | 是 | 编码 示例：showMe7 |
| name | object | 否 | 是 | 名称 |
| dataType | string | 否 | 是 | 数据类型 示例：5 |
| refDocCode | string | 否 | 否 | 参照档案编码 示例：productcenter.aa_merchantinvoiceref |
| refDocDomain | string | 否 | 否 | 参照档案的domain 示例：productcenter |
| refDocName | string | 否 | 否 | 参照档案名称 |
| refDocURI | string | 否 | 否 | 参照档案uri 示例：aa.merchant.AgentInvoice |
| refRetFieldName | string | 否 | 否 | 参照回显字段的编码 示例：title |
| refRetFieldCode | string | 否 | 否 | 参照回显字段的名称 |
| length | string | 否 | 否 | 长度 示例：255 |
| precision | string | 否 | 否 | 精度 示例：0 |
| referShowType | string | 否 | 否 | 参照展示方式 示例：1 |
| characterClass_code | string | 否 | 否 | 特征分类编码 示例：rebw2324 |
| _status | string | 否 | 是 | _status 示例：Insert |
| refRetAttrCode | string | 否 | 否 | 参照回显字段编码 示例：title |
| billnum | string | 否 | 是 | billnum 示例：base_charactercard |

## 3. 请求示例

Url: /yonbip/digitalModel/iuap-metadata-extend/import/character?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "showMe7",
			"name": {
				"zh_CN": "showMe7",
				"en_US": ""
			},
			"dataType": "5",
			"refDocCode": "productcenter.aa_merchantinvoiceref",
			"refDocDomain": "productcenter",
			"refDocName": "",
			"refDocURI": "aa.merchant.AgentInvoice",
			"refRetFieldName": "title",
			"refRetFieldCode": "",
			"length": "255",
			"precision": "0",
			"referShowType": "1",
			"characterClass_code": "rebw2324",
			"_status": "Insert",
			"refRetAttrCode": "title"
		}
	],
	"billnum": "base_charactercard"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | code 示例：200 |
| message | string | 否 | message |
| data | object | 否 | data |
| count | long | 否 | count 示例：2 |
| sucessCount | long | 否 | sucessCount 示例：1 |
| failCount | long | 否 | failCount 示例：1 |
| messages | string | 是 | messages 示例：[""] |
| infos | object | 是 | infos |
| failInfos | string | 是 | failInfos |
| traceId | string | 否 | traceId 示例：eada5ff2d9e15068 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "showMe003",
				"name": {
					"zh_CN": "showMe003"
				},
				"dataType": 5,
				"refDocCode": "productcenter.aa_merchantinvoiceref",
				"refDocDomain": "productcenter",
				"refDocName": "",
				"refDocURI": "aa.merchant.AgentInvoice",
				"refRetFieldName": "title",
				"refRetFieldCode": "",
				"characterClass_code": "rebw2324",
				"refRetAttrCode": "title",
				"characterClass": "1551567286642409472",
				"controlType": "refer",
				"id": "1554569666259582981",
				"creatorId": "1525695460210638858",
				"creator": "u8c_vip@163.com",
				"createTime": "2022-09-26 15:02:08",
				"createDate": "2022-09-26 15:02:08",
				"pubts": "2022-09-26 15:02:09",
				"ytenant": "0000L6YTYEY5FUZPXE0000"
			}
		],
		"failInfos": [
			""
		]
	},
	"traceId": "eada5ff2d9e15068"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	999


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-02

更新

请求参数 (18)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

