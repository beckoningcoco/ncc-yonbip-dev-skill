---
title: "物料状态详情查询"
apiId: "1665124658666012679"
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

# 物料状态详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Life Cycle Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/materialstatus/query

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
| idList | string | 是 | 否 | 物料状态Id集合 示例：["1629368067993632771"] |
| codeList | string | 是 | 否 | 物料状态编码集合 示例：["0121"] |

## 3. 请求示例

Url: /yonbip/digitalModel/materialstatus/query?access_token=访问令牌
Body: {
	"idList": [
		"1629368067993632771"
	],
	"codeList": [
		"0121"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 是 | 调用成功时的返回数据 |
| id | string | 否 | 物料状态Id 示例：1614552174577582150 |
| code | string | 否 | 物料状态编码 示例：system_02 |
| name | object | 否 | 物料状态多语对象 |
| systemFlag | long | 否 | 是否系统预置（1：是；0：否） 示例：1 |
| stopstatus | long | 否 | 是否停用（1：是；0：否） 示例：0 |
| materialStatusDetail | object | 是 | 物料状态明细数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "1614552174577582150",
			"code": "system_02",
			"name": {
				"simplifiedName": "试产",
				"englishName": "",
				"traditionalName": ""
			},
			"systemFlag": 1,
			"stopstatus": 0,
			"materialStatusDetail": [
				{
					"materialStatusId": "1614552174577582150",
					"systemFlag": 1,
					"serviceCode": "pu_applyorderlist",
					"serviceName": "请购单",
					"transType": "",
					"granularityControl": 1,
					"controlRule": 0,
					"materialStatusDetailAction": [
						{
							"materialStatusDetailId": "1614552174577582203",
							"action": "1614552174577582108",
							"actionCode": "save",
							"actionName": "保存"
						}
					]
				}
			]
		}
	]
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

