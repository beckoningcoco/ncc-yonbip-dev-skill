---
title: "物料模板列表查询V2"
apiId: "1694268657491771401"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料模板列表查询V2

> `ContentType	application/json` 请求方式	POST | 分类: Material Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/producttpl/listnew

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageSize | int | 否 | 否 | 每页页数（默认100） 示例：100 默认值：100 |
| pageIndex | int | 否 | 否 | 页码（默认为1） 示例：1 默认值：1 |
| idList | string | 是 | 否 | 物料模板ID集合（idList和nameList都传以idList为准） 示例：[1991566207711444993,1691943112985280500] |
| nameList | string | 是 | 否 | 物料模板名称集合（idList和nameList都传以idList为准） 示例：["TPL050705","物料模板BB"] |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳，获取大于等于此值的数据 示例：2024-05-07 10:27:02 |
| beginTime | DateTime | 否 | 否 | 查询启始时间（填写值之后查询数据会是在这个值之后的数据） 示例：2024-05-07 10:27:02 |
| endTime | DateTime | 否 | 否 | 查询终止时间（填写值之后查询数据会是在这个值之前的数据） 示例：2024-05-07 10:27:03 |

## 3. 请求示例

Url: /yonbip/digitalModel/producttpl/listnew?access_token=访问令牌
Body: {
	"pageSize": 100,
	"pageIndex": 1,
	"idList": [
		1991566207711444993,
		1691943112985280500
	],
	"nameList": [
		"TPL050705",
		"物料模板BB"
	],
	"pubts": "2024-05-07 10:27:02",
	"beginTime": "2024-05-07 10:27:02",
	"endTime": "2024-05-07 10:27:03"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 返回值的提示信息 示例：物料模板列表查询成功 |
| code | string | 否 | 错误码，成功时为200 示例：200 |
| data | object | 是 | 查询成功时的返回数据 |
| id | long | 否 | 物料模板ID 示例：1691943112985280519 |
| name | string | 否 | 物料模板名称 示例：11213131 |
| enableCyclePurchase | boolean | 否 | 是否启用周期购（true：启用，false：不启用） 示例：false |
| stopStatus | boolean | 否 | 停用状态（true表示已停用，false表示启用） 示例：false |

## 5. 正确返回示例

{
	"message": "物料模板列表查询成功",
	"code": "200",
	"data": [
		{
			"id": 1691943112985280519,
			"name": "11213131",
			"enableCyclePurchase": false,
			"stopStatus": false
		}
	]
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

