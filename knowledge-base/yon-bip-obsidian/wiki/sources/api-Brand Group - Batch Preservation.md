---
title: "品牌分组-批量保存"
apiId: "d75c7faa47844471af447b90f5cc86ed"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Brand Group"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Brand Group]
platform_version: "BIP"
source_type: community-api-docs
---

# 品牌分组-批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Brand Group (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/brandclass/save

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
| data | object | 是 | 是 | 请求数据 |
| id | long | 否 | 否 | 品牌分组id，新增时不输，修改时必输 示例：123456 |
| code | string | 否 | 是 | 品牌分组编码 示例：20220106 |
| name | object | 否 | 是 | 品牌分组名称 |
| brandclassAbbr | object | 否 | 否 | 备注 |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/brandclass/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 123456,
			"code": "20220106",
			"name": {
				"zh_CN": "20220106",
				"en_US": "22",
				"zh_TW": "33"
			},
			"brandclassAbbr": {
				"zh_CN": "11",
				"en_US": "22",
				"zh_TW": "33"
			}
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
				"code": "20210106001",
				"name": {
					"zh_CN": "20210106001",
					"en_US": "20210106001",
					"zh_TW": "20210106001"
				},
				"stopstatus": false,
				"brandclassAbbr": {
					"zh_CN": "11",
					"en_US": "11",
					"zh_TW": "11"
				},
				"id": 2592550714086144,
				"isEnabled": true,
				"pubts": "2022-01-06 10:38:58",
				"tenant": 2302391788065024,
				"yTenantId": "0000KPXH1DUADA8E8O0000"
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

