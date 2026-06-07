---
title: "标准工序保存V1V2"
apiId: "1940351780820877318"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Standard Operation"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Standard Operation]
platform_version: "BIP"
source_type: community-api-docs
---

# 标准工序保存V1V2

> `ContentType	application/json` 请求方式	POST | 分类: Standard Operation (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/operation/save/V1

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 标准工序数据集 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 标准工序id。主键， 新增时无需填写，修改时必填 示例：2336607882694912 |
| orgId | long | 否 | 否 | 组织id,组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：2323654194123014 |
| orgCode | string | 否 | 否 | 组织编码,组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：Amy001 |
| code | string | 否 | 是 | 编码。同一组织下编码不能重复 示例：GX-220 |
| name | string | 否 | 是 | 名称 示例：脱水工序 |
| operationGroup | string | 否 | 否 | 工序组 示例：脱水间 |
| prepareTime | float | 否 | 否 | 准备时间 示例：2.00 |
| processTime | float | 否 | 否 | 加工时间 示例：1.00 |
| timeUnit | int | 否 | 否 | 时间单位。0：天；1：小时；2：分；3：秒 示例：1 |
| workCenterId | string | 否 | 否 | 工作中心Id,Id和编码同时存在时，以Id为准 示例：234666623211 |
| workCenterId_code | string | 否 | 否 | 工作中心编码,Id和编码同时存在时，以Id为准 示例：IM0001 |
| stopstatus | boolean | 否 | 否 | 启用状态。true-停用；false-启用 示例：false |
| routeDesc | string | 否 | 否 | 工艺描述 示例：先清洗，再烘干。 |
| creatorId | string | 否 | 否 | 创建者ID 示例：1866554948653312 |
| creator | string | 否 | 否 | 创建人 示例：张三 |
| _status | string | 否 | 是 | 数据状态，枚举值，Insert：插入，Update：更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/mfg/operation/save/V1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2336607882694912,
		"orgId": 2323654194123014,
		"orgCode": "Amy001",
		"code": "GX-220",
		"name": "脱水工序",
		"operationGroup": "脱水间",
		"prepareTime": 2,
		"processTime": 1,
		"timeUnit": 1,
		"workCenterId": "234666623211",
		"workCenterId_code": "IM0001",
		"stopstatus": false,
		"routeDesc": "先清洗，再烘干。",
		"creatorId": "1866554948653312",
		"creator": "张三",
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 接口调用返回码，成功时返回200 示例：200 |
| message | string | 否 | 接口调用返回信息 示例：操作成功 |
| data | object | 否 | 接口调用返回数据 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| count | long | 否 | 记录总数 示例：1 |
| messages | string | 是 | 数据返回信息汇总 |
| infos | object | 是 | 返回详细信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			""
		],
		"infos": [
			{
				"code": 200,
				"rowNum": 1,
				"message": "操作成功",
				"data": {
					"id": 2336607882694912,
					"orgId": "2323654194123014",
					"orgCode": "Amy001",
					"orgIdName": "泰安市锁鲜食品科技有限公司",
					"code": "GX-220",
					"name": "脱水工序",
					"operationGroup": "脱水间1",
					"prepareTime": 2,
					"processTime": 1,
					"timeUnit": 1,
					"stopstatus": false,
					"routeDesc": "先清洗，再烘干。",
					"creatorId": 1866554948653312,
					"creator": "张三",
					"modifier": "19998888888",
					"modifierId": 1959752072810752,
					"modifyTime": "2022-12-27 12:00:00",
					"modifyDate": "2022-12-27 12:00:00",
					"tenant": 1292161350684928,
					"pubts": "2022-12-27 12:00:00",
					"workCenterId": "223333444432",
					"workCenterId_code": "IM00001"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-29

更新

请求说明

新增

请求参数 workCenterId

新增

请求参数 workCenterId_code

删除

请求参数 resubmitCheckKey

新增

返回参数 workCenterId

新增

返回参数 workCenterId_code


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

