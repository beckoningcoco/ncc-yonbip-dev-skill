---
title: "根据单据分页查询对应的流程历史"
apiId: "1957004167890862087"
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

# 根据单据分页查询对应的流程历史

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/query/ext/historic-process-instances

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| restservice | string | header | 否 | 审批版本(REST_SERVICE_1.0.0,REST_SERVICE_2.0.0)    默认值: REST_SERVICE_1.0.0 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| appSource | string | 否 | 是 | 应用来源(由对应的领域在流程预制，如：RBSM) |
| size | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分页，每页数量，最大为20，超过20按照20处理 示例：10 默认值：20 |
| returnBusinessActivityRules | boolean | 否 | 否 | 是否返回任务的业务活动规则，默认为true 示例：true 默认值：true |
| returnAttachmentList | boolean | 否 | 否 | 是否返回任务的附件，默认为true 示例：true 默认值：true |
| businessKeyList | string | 是 | 否 | businesskey的集合,如果不传默认返回全部任务 示例：["pc_productapply_1913064831284412421", "pc_productapply_1944230196323287047", "pc_productapply_1944229869905772553", "pc_productapply_1941224887441424384" ] |
| start | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分页：开始数，当前页数*分页size+1获得 示例：0 默认值：0 |
| sort | string | 否 | 否 | 用于排序的参数规则 示例：startTime 默认值：startTime |
| order | string | 否 | 否 | 分页方式，正序/倒序:asc/desc 示例：desc 默认值：desc |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/query/ext/historic-process-instances?access_token=访问令牌
Header: 
	restservice : ""
Body: {
	"appSource": "",
	"size": 10,
	"returnBusinessActivityRules": true,
	"returnAttachmentList": true,
	"businessKeyList": [
		"pc_productapply_1913064831284412421",
		"pc_productapply_1944230196323287047",
		"pc_productapply_1944229869905772553",
		"pc_productapply_1941224887441424384"
	],
	"start": 0,
	"sort": "startTime",
	"order": "desc"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| data | object | 否 | 返回数据 |
| data | object | 是 | 返回流程数据 |
| total | number |
| 小数位数:0,最大长度:10 | 否 | 返回数量 示例：1 |
| start | number |
| 小数位数:0,最大长度:10 | 否 | 分页起始任务数 示例：0 |
| sort | string | 否 | 排序字段 示例：id |
| order | string | 否 | 排序方式 示例：asc |
| size | number |
| 小数位数:0,最大长度:10 | 否 | 默认返回长度 示例：1 |
| displayCode | string | 否 | 业务异常码 示例：000-530-000001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"data": [
			{
				"id": "7a631e2a-e8d8-11ee-ac4d-ce092414a521",
				"url": "http://bip-daily.yonyoucloud.com/ubpm-web-rest/service/openapi/query/ext/historic-process-instances/history/historic-process-instances/7a631e2a-e8d8-11ee-ac4d-ce092414a521",
				"name": "物料申请单WLXZWLXZ000448",
				"businessKey": "pc_productapply_1958270496032686081",
				"processDefinitionId": "processcenter_9cc045b6:3:68f91c28-e8d8-11ee-ac4d-ce092414a521",
				"processDefinitionUrl": "http://bip-daily.yonyoucloud.com/ubpm-web-rest/service/openapi/query/ext/historic-process-instances/repository/process-definitions/processcenter_9cc045b6:3:68f91c28-e8d8-11ee-ac4d-ce092414a521",
				"startTime": "2024-03-23T13:44:56.000+08:00",
				"endTime": "2024-03-23T13:45:32.000+08:00",
				"durationInMillis": 35931,
				"startUserId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
				"startActivityId": "startEvent_ca854361867d48e98e368969f52bcb20",
				"endActivityId": "endEvent_64a7db47c6eb44a19f4ece6d40065d0a",
				"tenantId": "0000LC5NLRD4GPBAR40000_PC",
				"errcode": 0,
				"errmsg": "ok",
				"state": "end",
				"historicTasks": [
					{
						"id": "7a6d7e8c-e8d8-11ee-ac4d-ce092414a521",
						"processDefinitionId": "processcenter_9cc045b6:3:68f91c28-e8d8-11ee-ac4d-ce092414a521",
						"processDefinitionUrl": "http://bip-daily.yonyoucloud.com/ubpm-web-rest/service/openapi/query/ext/historic-process-instances/repository/process-definitions/processcenter_9cc045b6:3:68f91c28-e8d8-11ee-ac4d-ce092414a521",
						"processInstanceId": "7a631e2a-e8d8-11ee-ac4d-ce092414a521",
						"processInstanceUrl": "http://bip-daily.yonyoucloud.com/ubpm-web-rest/service/openapi/query/ext/historic-process-instances/history/historic-process-instances/7a631e2a-e8d8-11ee-ac4d-ce092414a521",
						"executionId": "7a6cbb38-e8d8-11ee-ac4d-ce092414a521",
						"name": "活动1",
						"deleteReason": "completed",
						"assignee": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
						"startTime": "2024-03-23T13:44:56.000+08:00",
						"endTime": "2024-03-23T13:45:31.340+08:00",
						"durationInMillis": 35340,
						"taskDefinitionKey": "approveUserTask_e6d741a4f9514fdbbe31dd5968fcff3f",
						"priority": 50,
						"url": "7a6d7e8c-e8d8-11ee-ac4d-ce092414a521",
						"variables": [
							{}
						],
						"tenantId": "0000LC5NLRD4GPBAR40000_PC",
						"category": "PC.pc_productapply",
						"processFinished": false,
						"finished": true,
						"attachmentList": [
							{
								"id": "8dee0481-e8d8-11ee-ac4d-ce092414a521",
								"revision": 1,
								"originalPersistentState": {
									"name": "流程监控终止按钮.xmind",
									"description": "{\"extend\":{\"fileName\":\"流程监控终止按钮.xmind\",\"businessType\":\"iform_web\",\"fileId\":\"65fe6c78e2afe506c78819d8\"},\"filesize\":\"124365\"}"
								},
								"name": "流程监控终止按钮.xmind",
								"description": "{\"extend\":{\"fileName\":\"流程监控终止按钮.xmind\",\"businessType\":\"iform_web\",\"fileId\":\"65fe6c78e2afe506c78819d8\"},\"filesize\":\"124365\"}",
								"type": "application/vnd.xmind.workbook",
								"taskId": "7a6d7e8c-e8d8-11ee-ac4d-ce092414a521",
								"processInstanceId": "7a631e2a-e8d8-11ee-ac4d-ce092414a521",
								"url": "https://ykj-open-api-test.yonyoucloud.com/iuap-apcom-file-public/iuap-apcom-file/0000LC5NLRD4GPBAR40000/2024032313/a7ac57cd-7b01-4c9c-a011-0ace0cb59692.xmind",
								"userId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
								"time": 1711172729000,
								"persistentState": {
									"0": "状",
									"1": "态",
									"name": "流程监控终止按钮.xmind",
									"description": "{\"extend\":{\"fileName\":\"流程监控终止按钮.xmind\",\"businessType\":\"iform_web\",\"fileId\":\"65fe6c78e2afe506c78819d8\"},\"filesize\":\"124365\"}"
								},
								"deleted": false,
								"inserted": false,
								"idPrefix": "PRC-",
								"updated": false,
								"revisionNext": 2
							}
						],
						"businessActivityRules": [
							{}
						],
						"taskComments": [
							{
								"id": "8f7abf03-e8d8-11ee-ac4d-ce092414a521",
								"originalPersistentState": "org.flowable.engine.impl.persistence.entity.CommentEntityImpl",
								"type": "comment",
								"userId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
								"time": 1711172731000,
								"taskId": "7a6d7e8c-e8d8-11ee-ac4d-ce092414a521",
								"processInstanceId": "7a631e2a-e8d8-11ee-ac4d-ce092414a521",
								"action": "AddComment",
								"message": "同意的撒旦",
								"fullMessage": "同意的撒旦",
								"commentHideRange": "{}",
								"persistentState": "org.flowable.engine.impl.persistence.entity.CommentEntityImpl",
								"messageParts": [
									{}
								],
								"fullMessageBytes": "5ZCM5oSP55qE5pKS5pem",
								"deleted": false,
								"inserted": false,
								"idPrefix": "PRC-",
								"updated": false
							}
						],
						"source": "PC",
						"sortNum": 0,
						"sign": "https://ykj-open-api-test.yonyoucloud.com/iuap-apcom-file-public/iuap-apcom-file/0000LC5NLRD4GPBAR40000/2024032313/dfdba075-5f42-442d-ba65-d9187db0e1c9.png",
						"businessStepCode": "42343"
					}
				],
				"tasks": {
					"id": "dab747b1-e8d0-11ee-ac4d-ce092414a521",
					"assignee": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
					"name": "活动2",
					"createTime": "2024-03-23T12:50:22.000+08:00",
					"dueDate": "3023-03-23T12:50:22.000+08:00",
					"priority": 50,
					"suspended": false,
					"taskDefinitionKey": "approveUserTask_8d66f0c39813cf81684b097c038af20d",
					"tenantId": "0000LC5NLRD4GPBAR40000_PC",
					"category": "PC.pc_productapply",
					"formKey": "{\\\"expressionText\\\":\\\"{\\\\\\\"transtype.bd_businessstep_ref\\\\\\\":{\\\\\\\"code\\\\\\\":\\\\\\\"24234\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"1867039094270853124\\\\\\\",\\\\\\\"name\\\\\\\":\\\\\\\"344234\\\\\\\"}}\\\"}",
					"executionId": "dab6845d-e8d0-11ee-ac4d-ce092414a521",
					"processInstanceId": "c4d3f25c-e8d0-11ee-ac4d-ce092414a521",
					"processDefinitionId": "processcenter_9cc045b6:2:03764c9f-e8d0-11ee-ac4d-ce092414a521",
					"warning": false,
					"read": false,
					"outtime": false,
					"sortNum": 0,
					"ishangUpTask": false
				},
				"hasTaskFinished": true,
				"withdrawAll": false,
				"cannotWithdraw": false,
				"rejectToTermCantDelete": false,
				"rejectToDraftCantDelete": false,
				"canCooperation": false,
				"jumpToRejectActivity": false,
				"canAttachment": false,
				"canEdit": false,
				"canUpload": true,
				"canComment": false,
				"canForward": false,
				"canStore": false,
				"initiatorCanCopyAfterSubmit": false,
				"selectedByInitiator": false,
				"predict": false,
				"flwHost": "https://bip-daily.yonyoucloud.com/iuap-apcom-workflownew",
				"processDefinitionVersion": 0,
				"withdrawNotRecord": false
			}
		],
		"total": 1,
		"start": 0,
		"sort": "id",
		"order": "asc",
		"size": 1,
		"displayCode": "000-530-000001",
		"level": 0
	}
}

## 6. 业务异常码

000-530-000001

租户信息不能为空

000-530-000003

参数不能全部为空


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

