---
title: "业务日志"
apiId: "e179ea7bd91047d2a6c77b95a3d2817d"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Audit Log - Business Log"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Audit Log - Business Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务日志

> `ContentType` 请求方式	GET | 分类: Audit Log - Business Log (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/log-pub/business/rest/query

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| content | string | query | 否 | 日志内容 |
| busiObjType | string | query | 否 | 业务对象类型 |
| busiObjCode | string | query | 否 | 业务对象编码 |
| busiObjName | string | query | 否 | 业务对象名称 |
| operator | string | query | 否 | 操作人(id)，多个用逗号分隔 |
| startDate | string | query | 否 | 开始时间（时间戳） |
| endDate | string | query | 否 | 结束时间（时间戳） |
| page | int | query | 是 | 页码    示例: 1 |
| size | int | query | 是 | 每页数量    示例: 10 |
| operNameResid | string | query | 否 | 操作类型 |

## 3. 请求示例

Url: /yonbip/digitalModel/log-pub/business/rest/query?access_token=访问令牌&content=&busiObjType=&busiObjCode=&busiObjName=&operator=&startDate=&endDate=&page=1&size=10&operNameResid=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| status | number |
| 小数位数:2,最大长度:10 | 否 | 状态码 示例：1 |
| data | object | 否 | 数据 |
| number | number |
| 小数位数:2,最大长度:10 | 否 | 页码 示例：1 |
| totalPages | number |
| 小数位数:2,最大长度:10 | 否 | 总页数 示例：10000 |
| content | object | 是 | 内容 |
| last | string | 否 | 最后 |
| totalElements | number |
| 小数位数:2,最大长度:10 | 否 | 总条数 示例：10000 |
| first | string | 否 | 第一 |
| displayCode | string | 否 | 异常码 |
| level | number |
| 小数位数:2,最大长度:10 | 否 | 异常等级 |

## 5. 正确返回示例

{
	"code": "200",
	"status": 1,
	"data": {
		"number": 1,
		"totalPages": 10000,
		"content": [
			{
				"busiObjCode": "YHT-2262631-22630211596791945093",
				"busiObjName": "黄家成",
				"operationDate": "2020-08-29T08:24:59.989+0000",
				"operResult": "success",
				"operCode": "",
				"detail": "13910934966在2020-08-29 16:24:59对黄家成设置管理员",
				"busiObjTypeName": "租户管理员",
				"busiObjId": "2f2c6672-87c7-44e7-a4d3-ef4b27b3597e",
				"operationName": "设置管理员",
				"busiObjTypeCode": "bd_user_manager",
				"tenantId": "s4adr3x4",
				"newBusiObj": "{\"begindate\":1598689499633}",
				"sysId": "aps",
				"operator": "other",
				"businessId": "ca2ea9e9-5835-44f2-8fdd-35a2b72bb4f1",
				"operatorName": "",
				"ip": "",
				"mdUri": "",
				"characteristic": "",
				"beanMap": "",
				"_status": "",
				"ts": "",
				"compress": "",
				"isYht": "",
				"operationName4Select": "",
				"errorFlag": "",
				"ytenantId": "",
				"struct": "",
				"token": "",
				"defaultBusiObjTypeName": ""
			}
		],
		"last": "",
		"totalElements": 10000,
		"first": ""
	},
	"displayCode": "",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

status	0	状态值

msg	查询日志失败

errorCode	000000


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

更新

请求说明

新增

返回参数 (16)

更新

返回参数 displayCode

更新

返回参数 level

2	2025-06-30

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

