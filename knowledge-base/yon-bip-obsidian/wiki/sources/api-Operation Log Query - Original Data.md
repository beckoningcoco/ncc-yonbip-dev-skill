---
title: "操作日志查询--原始数据"
apiId: "1910331359576981505"
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

# 操作日志查询--原始数据

> `ContentType` 请求方式	GET | 分类: Audit Log - Operation Log (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/log-pub/operation/rest/queryInitial

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| serviceId | string | query | 否 | 业务ID |
| queryServiceCode | string | query | 否 | 服务编码 |
| applicationId | string | query | 否 | 应用ID |
| applicationCode | string | query | 否 | 应用编码 |
| labelCode | string | query | 否 | 领域编码 |
| button | string | query | 否 | 按钮 |
| device | string | query | 否 | 操作设备 |
| orgId | string | query | 否 | 组织Id |
| operUser | string | query | 否 | 用户 |
| operUserName | string | query | 否 | 用户名称 |
| page | number |
| 小数位数:0,最大长度:4 | query | 否 | 分页 |
| size | number |
| 小数位数:0,最大长度:5 | query | 否 | 分页大小 |
| identityType | string | query | 否 | 身份类型 |
| ip | string | query | 否 | IP |
| tenantId | string | query | 否 | 租户ID |
| currentUserId | string | query | 否 | 当前登录用户id |
| token | string | query | 否 | yht_access_token，授权权使用 |
| tenantId | string | header | 否 | 租户id |
| startDate | string | query | 否 | 开始时间（毫秒时间戳） |
| endDate | string | query | 否 | 结束时间（毫秒时间戳） |
| serviceName | string | query | 否 | 服务名称 |
| serviceName2 | string | query | 否 | 服务名称 |
| serviceName3 | string | query | 否 | 名称 |
| applicationName | string | query | 否 | 应用名称 |
| applicationName2 | string | query | 否 | 应用名称 |
| applicationName3 | string | query | 否 | 应用名称 |
| status | string | query | 否 | 状态 |

## 3. 请求示例

Url: /yonbip/digitalModel/log-pub/operation/rest/queryInitial?access_token=访问令牌&serviceId=&queryServiceCode=&applicationId=&applicationCode=&labelCode=&button=&device=&orgId=&operUser=&operUserName=&page=&size=&identityType=&ip=&tenantId=&currentUserId=&token=&startDate=&endDate=&serviceName=&serviceName2=&serviceName3=&applicationName=&applicationName2=&applicationName3=&status=
Header: 
	tenantId : ""

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| status | number |
| 小数位数:2,最大长度:10 | 否 | 状态值 |
| data | object | 否 | 数据体 |
| data | object | 否 | 数据体 |
| status | string | 否 | 状态 |
| displayCode | string | 否 | 异常码 |
| level | number |
| 小数位数:2,最大长度:10 | 否 | 异常等级 |

## 5. 正确返回示例

{
	"code": "200",
	"status": 0,
	"data": {
		"data": {
			"content": {
				"operationId": "",
				"serviceId": "",
				"serviceCode": "",
				"applicationId": "",
				"operCode": "",
				"serviceName": "",
				"tenantId": "",
				"serviceName2": "",
				"secretName": "",
				"applicationName": "",
				"serviceName3": "",
				"docSecretName": "",
				"applicationName2": "",
				"ip": "",
				"countrySecretCode": "",
				"applicationName3": "",
				"countrySecretName": "",
				"labelName": "",
				"deviceName": "",
				"button": "",
				"device": 0,
				"businessIdentity": "",
				"dataLevel": "",
				"ts": "",
				"defaultButton": "",
				"labelName2": "",
				"labelName3": "",
				"labelCode": "",
				"applicationCode": "",
				"operResult": "",
				"businessSecretCode": "",
				"caepOrg": "",
				"operUserName": "",
				"operDate": "",
				"deptName": "",
				"operUser": "",
				"businessSecretName": "",
				"orgId": "",
				"orgName": "",
				"deptId": "",
				"deviceInfo": "",
				"identity": "",
				"sessionId": "",
				"caepRole": "",
				"token": "",
				"yTenantId": ""
			},
			"totalPages": 0,
			"totalElements": 0,
			"number": 0,
			"first": "",
			"last": ""
		},
		"status": ""
	},
	"displayCode": "",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

status	0	状态值

msg	查询操作日志失败

errorCode	000000


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

新增

返回参数 (55)

更新

返回参数 (4)

删除

返回参数 (50)

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

