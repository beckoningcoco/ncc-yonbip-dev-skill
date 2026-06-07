---
title: "工艺路线自定义项特征更新"
apiId: "2079423543421435905"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Routing"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Routing]
platform_version: "BIP"
source_type: community-api-docs
---

# 工艺路线自定义项特征更新

> `ContentType	application/json` 请求方式	POST | 分类: Routing (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/mfg/routing/updateDefineCharacter

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 单据数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 工艺路线id，只有id和自定义项特征同时传的时候才会处理，如果有一个不传会直接跳过不处理 示例：2074904507678982145 |
| routingOperation | object | 是 | 否 | 工序 |
| operationSequence | object | 是 | 否 | 工序序列 |

## 3. 请求示例

Url: /yonbip/mfg/routing/updateDefineCharacter?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": 2074904507678982145,
			"routingOperation": [
				{
					"id": 2074904507678982146
				}
			],
			"operationSequence": [
				{
					"id": 2486704649066774531
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 是 | data |
| id | number |
| 小数位数:0,最大长度:19 | 否 | id 示例：2074904507678982145 |
| routingOperation | object | 是 | routingOperation |
| operationSequence | object | 是 | 工序序列 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": 2074904507678982145,
			"routingOperation": [
				{
					"id": 2074904507678982145
				}
			],
			"operationSequence": [
				{
					"id": 2486704649066774531
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-10

更新

请求说明

新增

请求参数 operationSequence

新增

请求参数 id

新增

请求参数 defineCTS

更新

请求参数 (4)

新增

返回参数 operationSequence

新增

返回参数 id

新增

返回参数 defineCTS

更新

返回参数 routingDefineCharacter

更新

返回参数 routingOperationDefineCharacter

工艺路线自定义项特征更新增加返回值示例


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

