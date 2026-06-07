---
title: "租户下用户身份列表查询"
apiId: "026a8732c9b34033b809ed860e163a43"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BIP Role"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BIP Role]
platform_version: "BIP"
source_type: community-api-docs
---

# 租户下用户身份列表查询

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/role/users

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
| pageNumber | int | 否 | 是 | 当前页 示例：1 |
| userTypes | int | 是 | 否 | 身份类型（1平台管理员,0租户管理员,1员工,2客户管理员,3客户业务员,4商家管理员,5商家业务员,6外部参会人员,7供应商） 示例：[1] |
| orgIds | string | 是 | 否 | 组织Ids 示例：["1789928997277952"] |
| keyword | string | 否 | 否 | 用户名，手机号，邮箱模糊查询 示例："李慧" |
| pageSize | int | 否 | 是 | 每页条数 示例：10 |
| yhtTenantId | string | 否 | 否 | 友户通租户Id 示例：czqne4bp |
| mobiles | string | 是 | 否 | 手机号List 示例：["15878945612"] |
| pubtsBegin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 示例：2020-09-09 12:00:00 |
| pubtsEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-09-09 12:00:00 示例：2022-09-09 12:00:00 |

## 3. 请求示例

Url: /yonbip/digitalModel/role/users?access_token=访问令牌
Body: {
	"pageNumber": 1,
	"userTypes": [
		1
	],
	"orgIds": [
		"1789928997277952"
	],
	"keyword": "\"李慧\"",
	"pageSize": 10,
	"yhtTenantId": "czqne4bp",
	"mobiles": [
		"15878945612"
	],
	"pubtsBegin": "2020-09-09 12:00:00",
	"pubtsEnd": "2022-09-09 12:00:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| data | object | 否 | 返回数据 |
| pageSize | long | 否 | 每页条数（一次最多能查询500条） 示例：10 |
| pageNum | long | 否 | 当前页码 示例：1 |
| total | long | 否 | 总条数 示例：1329 |
| pages | long | 否 | 总页数 示例：133 |
| list | object | 是 | 用户身份数组 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"pageSize": 10,
		"pageNum": 1,
		"total": 1329,
		"pages": 133,
		"list": [
			{
				"id": 1530028668883219,
				"code": "YHT-29302-295591576585537662",
				"name": "stt470",
				"email": "st2019122***@test1988.com",
				"mobile": "",
				"tenant": 1292161350684928,
				"userType": 1,
				"yhtUserId": "002b3f5c-ae55-42e5-900d-684e283c59a7",
				"gender": 1,
				"pubts": "2019-12-18 10:25:40"
			}
		]
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110010

上下文读取友户通租户Id失败！


## 7. 错误返回码

999	服务端逻辑异常	查看具体返回信息或咨询支持人员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

请求参数 pubtsBegin

新增

请求参数 pubtsEnd

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

