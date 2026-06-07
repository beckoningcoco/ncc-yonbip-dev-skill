---
title: "登录日志查询--原始数据"
apiId: "1910305143096606729"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Audit Log -Login Log"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Audit Log -Login Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 登录日志查询--原始数据

> `ContentType` 请求方式	GET | 分类: Audit Log -Login Log (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/log-pub/login/rest/queryInitial

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| device | string | query | 否 | 设备 |
| loginStatus | string | query | 否 | 登录状态 |
| page | number |
| 小数位数:-1,最大长度:4 | query | 否 | 分页 |
| size | number |
| 小数位数:0,最大长度:5 | query | 否 | 分页大小 |
| orgId | string | query | 否 | 组织 |
| loginUserId | string | query | 否 | 用户 |
| loginUserIdList | string | query | 否 | 用户集合 |
| operateType | string | query | 否 | 登录(IN)，登出(OUT) |
| lastOperation | string | query | 否 | 是否最后一次操作（是：true 否：false） |
| startDate | string | query | 否 | 开始时间 |
| endDate | string | query | 否 | 结束时间 |
| identityType | string | query | 否 | 身份类型 |
| ip | string | query | 否 | IP |
| tenantId | string | query | 否 | 租户ID |
| currentUserId | string | query | 否 | 当前登录用户id |
| token | string | query | 否 | yht_access_token，授权权使用 |
| tenantId | string | header | 否 | 租户id |
| loginUserName | string | query | 否 | 登录用户名称 |

## 3. 请求示例

Url: /yonbip/digitalModel/log-pub/login/rest/queryInitial?access_token=访问令牌&device=&loginStatus=&page=&size=&orgId=&loginUserId=&loginUserIdList=&operateType=&lastOperation=&startDate=&endDate=&identityType=&ip=&tenantId=&currentUserId=&token=&loginUserName=
Header: 
	tenantId : ""

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 |
| data | object | 否 | 数据体 |
| data | object | 否 | 数据体 |
| status | number |
| 小数位数:2,最大长度:10 | 否 | 状态值 |
| displayCode | string | 否 | 异常码 |
| level | number |
| 小数位数:2,最大长度:10 | 否 | 异常等级 |

## 5. 正确返回示例

{
	"code": "",
	"data": {
		"data": {
			"content": {
				"loginUserId": "",
				"loginUserName": "",
				"operateDate": "2026-06-07 11:51:06",
				"ip": "",
				"device": 0,
				"deviceName": "",
				"tenantId": "",
				"sessionId": "",
				"source": "",
				"loginStatus": "",
				"operateType": "",
				"detail": "",
				"ts": "",
				"loginDate": "2026-06-07 11:51:06",
				"logoutDate": "2026-06-07 11:51:06",
				"deviceNameUspace": "",
				"deviceModelUspace": "",
				"systemModelUspace": "",
				"env": 0,
				"phoneName": "",
				"secretName": "",
				"docSecretName": "",
				"countrySecretCode": "",
				"countrySecretName": "",
				"businessSecretCode": "",
				"businessSecretName": "",
				"orgId": "",
				"orgName": "",
				"deptId": "",
				"deptName": "",
				"identity": "",
				"caepOrg": "",
				"caepRole": "",
				"token": "",
				"yTenantId": ""
			},
			"totalElements": 0,
			"totalPages": 0,
			"number": 0,
			"first": "",
			"last": ""
		},
		"status": 0
	},
	"displayCode": "",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

status	0	状态值

msg	查询登录日志失败

errorCode	000000


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

新增

返回参数 (44)

更新

返回参数 data

更新

返回参数 displayCode

更新

返回参数 level

删除

返回参数 (40)

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

