---
title: "关键程度保存"
apiId: "2001959831096786950"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Critical Level"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Critical Level]
platform_version: "BIP"
source_type: community-api-docs
---

# 关键程度保存

> `ContentType	application/json` 请求方式	POST | 分类: Critical Level (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/am/priority/save

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
| data | object | 是 | 是 | 数据 |
| priority_code | string | 否 | 是 | 关键程度编码 示例：99 |
| priority_name | object | 否 | 是 | 关键程度名称 |
| memo | string | 否 | 否 | 备注 示例：核心资产 |
| enablestate | string | 否 | 是 | 启用状态 1-未启用 2-已启用 3-已停用 示例：2 默认值：2 |

## 3. 请求示例

Url: /yonbip/am/priority/save?access_token=访问令牌
Body: {
	"data": [
		{
			"priority_code": "99",
			"priority_name": {
				"zh_CN": "核心资产",
				"en_US": "",
				"zh_TW": ""
			},
			"memo": "核心资产",
			"enablestate": "2"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | http 状态码(200:成功 其他：失败) 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功！ |
| data | object | 否 | 返回的数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总共需要保存的条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 详细信息 |
| infos | object | 是 | 成功单据信息 |
| failInfos | string | 是 | 失败的单据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"_entityName": "ampub.equipbase.PriorityVO",
				"priority_code": "98239218",
				"priority_name": {
					"zh_CN": "测试关键程度",
					"zh_TW": "",
					"en_US": ""
				},
				"pre_flag": false,
				"memo": "22222222",
				"enablestate": 2,
				"id": "2008976751103836169",
				"sysid": "AMBD",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "默认用户",
				"creationtime": "2024-05-30 21:27:55",
				"pubts": "2024-05-30 21:27:55"
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

999	服务端逻辑异常	服务端逻辑异常


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

