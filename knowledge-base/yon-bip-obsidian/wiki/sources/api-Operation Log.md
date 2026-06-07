---
title: "操作日志"
apiId: "5b24d9a0a6dd48138c7b18c31584b73f"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Audit Log - Operation Log"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Audit Log - Operation Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 操作日志

> `ContentType` 请求方式	GET | 分类: Audit Log - Operation Log (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/log-pub/operation/rest/query

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| serviceId | string | query | 否 | 服务id |
| serviceCode | string | query | 否 | 服务编码 |
| serviceName | string | query | 否 | 服务名称 |
| applicationId | string | query | 否 | 应用id |
| applicationCode | string | query | 否 | 应用编码 |
| applicationName | string | query | 否 | 应用名称 |
| operUser | string | query | 否 | 操作人(id) |
| button | string | query | 否 | 操作名称 |
| ip | string | query | 否 | ip地址 |
| device | string | query | 否 | 登录设备 (1/2/3/4) web/android/client/iphone |
| startDate | string | query | 否 | 开始时间（时间戳） |
| endDate | string | query | 否 | 结束时间（时间戳） |
| page | int | query | 是 | 页码    示例: 1 |
| size | int | query | 是 | 每页数量    示例: 10 |

## 3. 请求示例

Url: /yonbip/digitalModel/log-pub/operation/rest/query?access_token=访问令牌&serviceId=&serviceCode=&serviceName=&applicationId=&applicationCode=&applicationName=&operUser=&button=&ip=&device=&startDate=&endDate=&page=1&size=10

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| status | number |
| 小数位数:2,最大长度:10 | 否 | 状态码 示例：1 |
| data | object | 否 | 数据 |
| totalPages | number |
| 小数位数:2,最大长度:10 | 否 | 总条数 示例：10000 |
| content | object | 是 | 内容 |
| last | string | 否 | 最后 |
| totalElements | number |
| 小数位数:2,最大长度:10 | 否 | 总条数 示例：15867124 |
| number | number |
| 小数位数:2,最大长度:10 | 否 | 页码 示例：0 |
| first | string | 否 | 第一 |
| displayCode | string | 否 | 异常码 |
| level | number |
| 小数位数:2,最大长度:10 | 否 | 异常等级 |

## 5. 正确返回示例

{
	"code": "200",
	"status": 1,
	"data": {
		"totalPages": 10000,
		"content": [
			{
				"tenantId": "",
				"serviceCode": "",
				"sessionId": "",
				"applicationId": "e7145c88-cd23-43da-9eff-6bf26e77f44e",
				"operUserName": "***",
				"operResult": "success",
				"operUser": "YHT-110393-1109411571636882116",
				"device": 1,
				"applicationName": "库存云",
				"caepOrg": "",
				"applicationCode": "UStock",
				"ip": "10.3.2.165",
				"serviceId": "dd352083-5728-4508-aef9-fd81849e1b10",
				"button": "打开",
				"serviceName": "null",
				"operDate": "2020-08-29T08:19:04.658+0000",
				"labelName": "数字化建模",
				"labelName2": "Digital Modeling",
				"labelName3": "數字化建模",
				"serviceName2": "",
				"serviceName3": "",
				"deviceName": "Web端",
				"characteristic": "false",
				"beanMap": {},
				"_status": "",
				"labelCode": "",
				"isYht": "",
				"applicationName2": "",
				"applicationName3": "",
				"operationId": "",
				"ytenantId": "",
				"operCode": "",
				"token": ""
			}
		],
		"last": "",
		"totalElements": 15867124,
		"number": 0,
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

返回参数 (20)

更新

返回参数 tenantId

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

