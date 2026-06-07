---
title: "分页查询人员待办任务"
apiId: "1957446240284704771"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Process Instance"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Process Instance]
platform_version: "BIP"
source_type: community-api-docs
---

# 分页查询人员待办任务

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/task/querytaskstodo/page

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
| assignee | string | 否 | 否 | 待查询的人员id |
| processBusinessKeyIds | string | 是 | 否 | businesskey集合 |
| source | string | 否 | 否 | 应用来源(由对应的领域在流程预制，如：RBSM) |
| sources | string | 否 | 否 | 应用来源集合，由英文逗号分隔(由对应的领域在流程预制，如：RBSM,PU) |
| returnParticipants | boolean | 否 | 否 | 是否返回当前待办人员信息 true：是，false：否 默认值：true |
| returnProcessInstance | boolean | 否 | 否 | 是否返回流程信息 true：是，false：否 默认值：true |
| start | number |
| 小数位数:1,最大长度:10 | 否 | 否 | 分页：开始展示的位置，第一页从0开始，size*页数为当前页开始位置 默认值：0 |
| size | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 分页：每页数量，最大为10，超过10按10分页查询 默认值：10 |
| sort | string | 否 | 否 | 用于排序参数 默认值：createTime |
| order | string | 否 | 否 | 分页方式，正序/倒序:asc/desc 默认值：desc |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/task/querytaskstodo/page?access_token=访问令牌
Body: {
	"assignee": "",
	"processBusinessKeyIds": [
		""
	],
	"source": "",
	"sources": "",
	"returnParticipants": true,
	"returnProcessInstance": true,
	"start": 0,
	"size": 0,
	"sort": "",
	"order": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：查询成功 |
| data | object | 否 | 返回数据 |
| data | object | 是 | 任务基本数据 |
| size | long | 否 | 默认返回长度 示例：1 |
| start | long | 否 | 分页起始任务数 示例：0 |
| total | long | 否 | 返回数量 示例：1 |
| sort | string | 否 | 排序字段 示例：id |
| order | string | 否 | 排序方式 示例：asc |
| displayCode | string | 否 | 业务异常码 示例：000-530-000001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"data": [
			{
				"activity": {
					"name": "5",
					"id": "approveUserTask_86f440b5947648a78a167cbb0d49ce69",
					"type": "userTask",
					"properties": {
						"useCallbackFunction": "",
						"formFieldForDueDateWarnningOnce": "",
						"rejectToAll": "",
						"type": "userTask",
						"withDraw": "",
						"useCloudsignature": "",
						"rejectToEnd": "",
						"withCloudsignature": "",
						"hideHiddenCommentOption": "",
						"extendAttributes": [
							""
						],
						"multiInstance": "parallel",
						"canBeRejected": "",
						"selectedByOperator": true,
						"addsignType": "addsignGrab",
						"canBeJumped": "false",
						"canAttachment": true,
						"rejectToInitial": "true",
						"rejectToStart": "true",
						"countersignOnlyLastJump": "false",
						"ApproveService": {},
						"dueDateAfter": false,
						"rejectAble": "true",
						"copyToAble": "true",
						"addsignBehindType": "addsignBehindGrab",
						"warningDateAfter": false,
						"duedateStrategy": "reminder",
						"formFieldForDueDateDay": "0",
						"formFieldForDueDateHour": "0",
						"name": "5"
					}
				},
				"executionUrl": "http://bip-daily.yyuap.com/ubpm-web-rest/service/openapi/runtime/executions/e37333d2-e568-11ec-940a-ca054978de9d",
				"dueDate": 33179872720000,
				"outtime": false,
				"processInstance": {
					"processDefinitionId": "processcenter_43616623:19:cf3cedf4-e54a-11ec-9b55-de3969bc08a8",
					"variables": [
						{}
					],
					"businessKey": "567aa7a5_2806366544204032",
					"ended": false,
					"name": "流程",
					"tenantId": "0000KO42POTJDOJAJU0000_developplatform",
					"startParticipant": {
						"name": "zouyang",
						"sortNum": 0,
						"id": "dfebface-9acc-4b13-bdb2-b11bbbae66e1",
						"priority": 50,
						"type": "USER"
					},
					"completed": false,
					"id": "dfaf97ce-e54a-11ec-9b55-de3969bc08a8",
					"suspended": false,
					"url": "http://bip-daily.yyuap.com/ubpm-web-rest/service/openapi/runtime/process-instances/dfaf97ce-e54a-11ec-9b55-de3969bc08a8",
					"processDefinitionUrl": "http://bip-daily.yyuap.com/ubpm-web-rest/service/openapi/repository/process-definitions/processcenter_43616623:19:cf3cedf4-e54a-11ec-9b55-de3969bc08a8"
				},
				"processDefinitionName": "流程主流程",
				"source": "developplatform",
				"warning": false,
				"assigneeParticipant": {
					"code": "YHT-6673-63101624516548359",
					"name": "",
					"sortNum": 0,
					"id": "aaf776ea-2d60-4855-8234-daa913f6d3eb",
					"priority": 50,
					"type": "USER"
				},
				"sortNum": 0,
				"id": "e373d016-e568-11ec-940a-ca054978de9d",
				"processDefinitionId": "processcenter_43616623:19:cf3cedf4-e54a-11ec-9b55-de3969bc08a8",
				"processInstanceId": "dfaf97ce-e54a-11ec-9b55-de3969bc08a8",
				"variables": [
					{}
				],
				"read": false,
				"priority": 50,
				"suspended": false,
				"url": "http://bip-daily.yyuap.com/ubpm-web-rest/service/openapi/runtime/tasks/e373d016-e568-11ec-940a-ca054978de9d",
				"executionId": "e37333d2-e568-11ec-940a-ca054978de9d",
				"processInstanceUrl": "http://bip-daily.yyuap.com/ubpm-web-rest/service/openapi/runtime/process-instances/dfaf97ce-e54a-11ec-9b55-de3969bc08a8",
				"taskDefinitionKey": "approveUserTask_41dcaa33304dc811732fe851a9972af4",
				"createTime": 1654499920000,
				"name": "5",
				"tenantId": "0000KO42POTJDOJAJU0000_developplatform",
				"procInsStartTime": 1654487028000,
				"assignee": "aaf776ea-2d60-4855-8234-daa913f6d3eb",
				"category": "developplatform.567aa7a5",
				"processDefinitionUrl": "http://bip-daily.yyuap.com/ubpm-web-rest/service/openapi/repository/process-definitions/processcenter_43616623:19:cf3cedf4-e54a-11ec-9b55-de3969bc08a8"
			}
		],
		"size": 1,
		"start": 0,
		"total": 1,
		"sort": "id",
		"order": "asc",
		"displayCode": "000-530-000001",
		"level": 0
	}
}

## 6. 业务异常码

000-530-000001

租户信息不能为空

000-530-000002

用户信息不能为空


## 7. 错误返回码

30009	出现严重错误，流程无法继续流转	请检查入参是否正确

310071	接口调用失败，任务查询失败	请检查入参是否正确

30000	获取的参数为空	请检查入参是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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

