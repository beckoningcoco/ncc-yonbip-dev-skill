---
title: "查询流程抄送消息信息"
apiId: "5d3efbf57c574b75b6f5543a5d87f895"
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

# 查询流程抄送消息信息

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/query/ext/messages

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| source | string | header | 是 | 应用来源 |
| securityTenantCode | string | header | 否 | 安全租户Code |
| sign | string | header | 否 | 签名(用于安全租户的验证) |
| tenantId | string | header | 否 | 租户id |
| yhtAccessToken | string | header | 否 | 友互通token |
| restservice | string | header | 是 | 审批版本    默认值: REST_SERVICE_1.0.0 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 否 | 流程id |
| ids | string | 是 | 否 | 流程id列表 |
| businessKey | string | 否 | 否 | 业务key |
| procssInstId | string | 否 | 否 | 流程实例id |
| taskId | string | 否 | 否 | 任务id |
| copyUserId | string | 否 | 否 | 抄送人id |
| copyUserIds | string | 是 | 否 | 抄送人id列表 |
| categoryIds | string | 是 | 否 | 交易类型id列表 |
| returnProcessInstance | boolean | 否 | 否 | 返回结果中是否包含流程实例信息 |
| title | string | 否 | 否 | 标题(精确查询匹配) |
| titleLike | string | 否 | 否 | 标题(模糊查询匹配) |
| taskStatus | string | 否 | 否 | 任务状态(run运行态，end结束态，Suspend挂起态) |
| startedBefore | DateTime | 否 | 否 | 指定开始时间之前 |
| startedAfter | DateTime | 否 | 否 | 指定开始时间之后 |
| modifyTimeBefore | DateTime | 否 | 否 | 指定修改时间之前 |
| modifyTimeAfter | DateTime | 否 | 否 | 指定修改时间之后 |
| start | int | 否 | 否 | 分页时当前页记录索引 |
| size | int | 否 | 否 | 每页数量 |
| sort | string | 否 | 否 | 判断是否排序 |
| order | string | 否 | 否 | 确定排序(值为desc则降序，反之为升序) |

## 3. 请求示例

Url: /yonbip/digitalModel/query/ext/messages?access_token=访问令牌
Header: 
	source : ""
	securityTenantCode : ""
	sign : ""
	tenantId : ""
	yhtAccessToken : ""
	restservice : ""
Body: {
	"id": "",
	"ids": [
		""
	],
	"businessKey": "",
	"procssInstId": "",
	"taskId": "",
	"copyUserId": "",
	"copyUserIds": [
		""
	],
	"categoryIds": [
		""
	],
	"returnProcessInstance": true,
	"title": "",
	"titleLike": "",
	"taskStatus": "",
	"startedBefore": "",
	"startedAfter": "",
	"modifyTimeBefore": "",
	"modifyTimeAfter": "",
	"start": 0,
	"size": 0,
	"sort": "",
	"order": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| data | object | 是 | 编码 |
| errcode | long | 否 | 编码名称 示例：0 |
| errmsg | string | 否 | 错误返回值ok为正确 |
| id | string | 否 | 流程id 示例：af1df614-c913-11eb-a900-269f6a835166 |
| url | string | 否 | 地址 |
| tenantId | string | 否 | 租户id 示例：0000KO42POTJDOJAJU0000_PU |
| revision | int | 否 | 是否修改 示例：0 |
| status | string | 否 | 状态（CREATE创建，CONTINUE继续，MOVED_PERMANENTLY永久转移，MULTI_STATUS多线程状态，RESET_CONTENT重置状态） |
| taskStatus | string | 否 | 任务状态（1在运行，0为已结束） 示例：0 |
| taskId | string | 否 | 任务Id 示例：d1170acb-c910-11eb-a900-269f6a835166 |
| activityId | string | 否 | 活动Id |
| procssInstId | string | 否 | 流程实例id 示例：d0ce1b0e-c910-11eb-a900-269f6a835166 |
| title | string | 否 | 标题 示例：采购订单CGDD210609000009 |
| description | string | 否 | 描述 |
| taskAssignee | string | 否 | 任务指派人 示例：eeccdb60-2511-4a7e-87f1-58a51aa7fbdc |
| copyUserId | string | 否 | 抄送人id 示例：1838579e-6b2a-40e0-8c36-9d64817ba53c |
| createTime | DateTime | 否 | 创建时间 示例：2021-06-09T19:13:14.000+08:00 |
| modifyTime | DateTime | 否 | 修改时间 示例：2021-06-09T19:13:14.000+08:00 |
| historicProcessInstance | object | 否 | 历史流程实例 |
| category | string | 否 | 交易类型 |
| total | long | 否 | 查询获取总数 示例：3 |
| start | int | 否 | 分页时当前页记录索引 示例：0 |
| sort | string | 否 | 判断是否排序 |
| order | string | 否 | 确定排序(值为desc则降序，反之为升序) |
| size | int | 否 | 每页数量 示例：3 |
| displayCode | string | 否 | 业务异常码 示例：000-530-000001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"data": [
			{
				"errcode": 0,
				"errmsg": "",
				"id": "af1df614-c913-11eb-a900-269f6a835166",
				"url": "",
				"tenantId": "0000KO42POTJDOJAJU0000_PU",
				"revision": 0,
				"status": "",
				"taskStatus": "0",
				"taskId": "d1170acb-c910-11eb-a900-269f6a835166",
				"activityId": "",
				"procssInstId": "d0ce1b0e-c910-11eb-a900-269f6a835166",
				"title": "采购订单CGDD210609000009",
				"description": "",
				"taskAssignee": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
				"copyUserId": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
				"createTime": "2021-06-09T19:13:14.000+08:00",
				"modifyTime": "2021-06-09T19:13:14.000+08:00",
				"historicProcessInstance": {
					"id": "d0ce1b0e-c910-11eb-a900-269f6a835166",
					"url": "https://ys-u8c-daily.yyuap.com/ubpm-web-rest/service/history/historic-process-instances/d0ce1b0e-c910-11eb-a900-269f6a835166",
					"businessKey": "st_purchaseorder_2294349001511680",
					"processDefinitionId": "processcenter_b5ca5de0:6:c165403c-c910-11eb-a900-269f6a835166",
					"processDefinitionUrl": "https://ys-u8c-daily.yyuap.com/ubpm-web-rest/service/repository/process-definitions/processcenter_b5ca5de0:6:c165403c-c910-11eb-a900-269f6a835166",
					"startTime": "2021-06-09T18:52:43.000+08:00",
					"endTime": "",
					"durationInMillis": "",
					"startUserId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
					"startActivityId": "startEvent_92bcd0f068594afb9f8ae9dac731d0ee",
					"endActivityId": "",
					"deleteReason": "",
					"superProcessInstanceId": "",
					"variables": [
						""
					],
					"tenantId": "0000KO42POTJDOJAJU0000_PU",
					"state": "run",
					"name": "采购订单CGDD210609000009",
					"keyFeature": "",
					"currentActivityId": "",
					"historicTasks": [
						""
					],
					"tasks": [
						""
					],
					"historicActivityInstances": [
						""
					],
					"executions": "",
					"subHistoricProcessInstanceResponses": "",
					"bpmForms": [
						""
					],
					"bpmActivityForms": "",
					"iforms": "",
					"activityIForms": "",
					"startParticipant": {
						"id": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
						"code": NaN,
						"name": "17600591893",
						"org": "",
						"org_name": "",
						"pic": "",
						"source": "",
						"msg": "",
						"sortNum": 0,
						"type": "USER",
						"priority": 50
					},
					"copyUserParticipants": [
						""
					],
					"processDefination": "",
					"icon": "",
					"hasTaskFinished": false,
					"withdrawAll": false,
					"cannotWithdraw": false,
					"makeBillUserId": "",
					"makeBilParticipant": {
						"id": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
						"code": NaN,
						"name": "17600591893",
						"org": "",
						"org_name": "",
						"pic": "",
						"source": "",
						"msg": "",
						"sortNum": NaN,
						"type": "USER",
						"priority": 50
					},
					"assigneeIds": [
						""
					],
					"rejectToTermCantDelete": false,
					"rejectToDraftCantDelete": false,
					"orgId": "",
					"extend": "",
					"canCooperation": false,
					"jumpToRejectActivity": false,
					"canAttachment": false,
					"canComment": false,
					"commentId": "e407fb0e-c910-11eb-a900-269f6a835166",
					"canStore": false,
					"originalProcessDefinitionId": "",
					"initiatorCanCopyAfterSubmit": false,
					"category": "2237606327865616",
					"selectedByInitiator": false,
					"superHistoricProcessInstanceResponse": "",
					"startUserOrgId": "",
					"predict": false,
					"formDataList": "",
					"formDataMap": ""
				},
				"category": ""
			}
		],
		"total": 3,
		"start": 0,
		"sort": "",
		"order": "",
		"size": 3,
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

403	Forbidden	传入正常heade中的r参数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-04

更新

请求说明

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

