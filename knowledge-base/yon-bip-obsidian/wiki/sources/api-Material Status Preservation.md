---
title: "物料状态保存"
apiId: "1665153022630035459"
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

# 物料状态保存

> `ContentType	application/json` 请求方式	POST | 分类: Life Cycle Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/materialstatus/save

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
| code | string | 否 | 是 | 物料状态编码 示例：2022110dd4011 |
| name | object | 否 | 是 | 物料状态名称多语对象 |
| simplifiedName | string | 否 | 否 | 简体中文 示例：2022110dd4011 |
| englishName | string | 否 | 否 | 英文 示例：202211vv04011 |
| traditionalName | string | 否 | 否 | 繁体中文 示例：66661 |
| stopstatus | int | 否 | 否 | 是否停用（1：是；0：否），不传值默认为 0 示例：0 |
| materialStatusDetail | object | 是 | 否 | 物料状态明细数据信息 |
| serviceCode | string | 否 | 是 | 服务编码 示例：po_production_order_list |
| serviceName | string | 否 | 否 | 服务名称 示例：产品订单 |
| granularityControl | long | 否 | 是 | 控制粒度（控制粒度 1:按服务 2:按交易类型） 示例：1 |
| transType_Code | string | 否 | 否 | 交易类型编码，当控制粒度选（2：按交易类型）时，交易类型Id和交易类型编码二选一必填;当控制粒度选（1：按服务）时，无需填 示例：ia_depreciationbill_main |
| transType | string | 否 | 否 | 交易类型Id，当控制粒度选（2：按交易类型）时，交易类型Id和交易类型编码二选一必填;当控制粒度选（1：按服务）时，无需填 |
| materialStatusDetailAction | object | 是 | 否 | 控制点明细信息 |
| controlRule | long | 否 | 是 | 控制规则（0:禁止；1:允许；2:警告） 示例：1 |
| entityStatus | string | 否 | 否 | 操作符（新增：Insert；修改：Update；删除：Delete）若为空默认 Insert 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/materialstatus/save?access_token=访问令牌
Body: {
	"code": "2022110dd4011",
	"name": {
		"simplifiedName": "2022110dd4011",
		"englishName": "202211vv04011",
		"traditionalName": "66661"
	},
	"stopstatus": 0,
	"materialStatusDetail": [
		{
			"serviceCode": "po_production_order_list",
			"serviceName": "产品订单",
			"granularityControl": 1,
			"transType_Code": "ia_depreciationbill_main",
			"transType": "",
			"materialStatusDetailAction": [
				{
					"serviceCode": "po_production_order_list",
					"action": "1593152929634713771",
					"actionCode": "delete",
					"entityStatus": "Insert"
				}
			],
			"controlRule": 1,
			"entityStatus": "Insert"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 物料状态Id 示例：1660675785412837383 |
| code | string | 否 | 物料状态编码 示例：2022110dd4011 |
| name | object | 否 | 物料状态多语对象 |
| systemFlag | long | 否 | 是否系统预置（1：是；0：否） 示例：0 |
| stopstatus | long | 否 | 是否停用（1：是；0：否） 示例：0 |
| materialStatusDetail | object | 是 | 物料状态明细数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1660675785412837383",
		"code": "2022110dd4011",
		"name": {
			"simplifiedName": "2022110dd4011",
			"englishName": "",
			"traditionalName": ""
		},
		"systemFlag": 0,
		"stopstatus": 0,
		"materialStatusDetail": [
			{
				"serviceCode": "po_production_order_list",
				"serviceName": "产品订单",
				"systemFlag": 0,
				"transType": "",
				"granularityControl": 1,
				"controlRule": 1,
				"materialStatusDetailAction": [
					{
						"materialStatusDetailId": "1660677374550736904",
						"serviceCode": "po_production_order_list",
						"action": "1614552174577582108",
						"actionCode": "delete"
					}
				]
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

