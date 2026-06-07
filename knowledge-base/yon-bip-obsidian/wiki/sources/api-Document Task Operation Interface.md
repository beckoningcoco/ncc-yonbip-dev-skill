---
title: "单据任务操作接口"
apiId: "1957690288913776645"
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

# 单据任务操作接口

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/runtime/ext/tasks/{taskId}

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| restservice | string | header | 是 | 审批版本(REST_SERVICE_1.0.0,REST_SERVICE_2.0.0)    默认值: REST_SERVICE_1.0.0 |
| taskId | string | path | 是 | 任务id |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| source | string | 否 | 是 | 应用来源(由对应的领域在流程预制，如：RBSM) |
| action | string | 否 | 是 | 审批动作：complete/delegateCompletelyMulti/counterSignAdd/counterSignAfterAdd ：同意/转交/前加签/后加签（前后加签支持抢占并行串行，不支持范围限制） |
| message | string | 否 | 否 | 审批意见 |
| assignInfo | object | 否 | 否 | 指派信息 |
| taskId | string | 否 | 否 | 指派的任务id |
| userChange | string | 否 | 否 | 是否为管理员修改 |
| executionId | string | 否 | 否 | 执行实例ID,开始活动下一步需要指派时需要设置此参数 |
| assignInfoItems | object | 是 | 否 | 指派活动以及参与者信息 |
| subProcess | boolean | 否 | 否 | 是否子流程 |
| assignee | string | 否 | 否 | 转交人id，当action为delegateCompletelyMulti为必填项 |
| assignees | string | 是 | 否 | 加签人用户id集合,前后加签人员需要使用此参数传递，action为 |
| sendToLiveCard | boolean | 否 | 否 | 将加签待处理的消息发送到加签人的友空间聊天窗口 |
| counterSignType | string | 否 | 否 | 加签方式：grab/countersign/sequential：抢占/并行会签/串行会签，串行会签只在后加签场景生效 |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/runtime/ext/tasks/{taskId}?access_token=访问令牌
Header: 
	restservice : ""
Body: {
	"source": "",
	"action": "",
	"message": "",
	"assignInfo": {
		"taskId": "",
		"userChange": "",
		"executionId": "",
		"assignInfoItems": [
			{
				"activityId": "",
				"activityName": "",
				"mainActivityId": "",
				"condition": "",
				"participants": [
					{
						"id": "",
						"code": "",
						"name": "",
						"org": "",
						"org_name": "",
						"type": "",
						"priority": ""
					}
				],
				"fullStaffAssign": true,
				"defaultFlow": "",
				"assignAble": true,
				"parentProcess": "",
				"multiInstanceType": "",
				"depts": {},
				"dutys": {},
				"posts": "",
				"usergroups": ""
			}
		],
		"subProcess": true
	},
	"assignee": "",
	"assignees": [
		""
	],
	"sendToLiveCard": true,
	"counterSignType": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| data | object | 否 | 返回数据 |
| taskId | string | 否 | 任务id 示例：bc5f5a54-e8ee-11ee-9c6e-c621d3caf4c7 |
| currentActivityEndStatus | boolean | 否 | 当前活动是否结束 示例：false |
| action | string | 否 | 审批动作 示例：complete |
| historicProcessInstance | object | 否 | 历史流程实例 |
| taskDefinitionKey | string | 否 | 任务定义key |
| exceptionReason | string | 否 | 异常原因 |
| comment | string | 否 | 审批意见 示例：审批意见 |
| commentId | string | 否 | 评论id 示例：3efb411d-e8f1-11ee-9c6e-c621d3caf4c7 |
| variableMap | object | 否 | 变量集合 |
| toDoTasks | object | 否 | 待办任务 |
| displayCode | string | 否 | 业务异常码 示例：000-530-401026 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"taskId": "bc5f5a54-e8ee-11ee-9c6e-c621d3caf4c7",
		"currentActivityEndStatus": false,
		"action": "complete",
		"historicProcessInstance": {},
		"taskDefinitionKey": "",
		"exceptionReason": "",
		"comment": "审批意见",
		"commentId": "3efb411d-e8f1-11ee-9c6e-c621d3caf4c7",
		"variableMap": {
			"withErrCode": "false",
			"allThreadLocalTaskId2": "bc5f5a54-e8ee-11ee-9c6e-c621d3caf4c7",
			"firstThreadLocalTaskId2": "bc5f5a54-e8ee-11ee-9c6e-c621d3caf4c7"
		},
		"toDoTasks": {},
		"displayCode": "000-530-401026",
		"level": 0
	}
}

## 6. 业务异常码

000-530-401026

taskid不能为空

000-530-401027

action不能为空

000-530-401037

操作任务失败：{0}


## 7. 错误返回码

405	接口禁止访问

500	服务器错误


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

