---
title: "批量审批"
apiId: "1457429205556396032"
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

# 批量审批

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/runtime/ext/tasks/batch

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
| bpmTaskActions | object | 是 | 否 | 批量任务列表 |
| bpmTaskActionRequest | object | 否 | 是 | 任务请求参数列表 |
| taskId | string | 否 | 是 | 任务id(可通过接口/yonbip/digitalModel/openapi/query/ext/tasks获取对应人员的待办任务) 示例：2b81a2ca-d5d1-11ec-969c-d2b8b1c1db6d |
| view | string | 否 | 否 | 审批意见 示例：同意 默认值：同意 |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/runtime/ext/tasks/batch?access_token=访问令牌
Header: 
	restservice : ""
Body: {
	"appSource": "",
	"bpmTaskActions": [
		{
			"bpmTaskActionRequest": {
				"action": "complete",
				"returnExecutions": false,
				"returnHistoricProcessInstance": false,
				"returnHistoricTasks": false,
				"returnVariables": false,
				"returnTasks": false
			},
			"taskId": "2b81a2ca-d5d1-11ec-969c-d2b8b1c1db6d",
			"view": "同意"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 返回数据 |
| taskDefinitionKey | string | 否 | 任务定义id 示例：approveUserTask_efe014a4f14c42e8a0c8e9c3149a23cb |
| currentActivityEndStatus | boolean | 否 | 当前活动是否为结束状态 true：是，false：否 示例：true |
| historicProcessInstance | object | 否 | 历史流程对象 |
| action | string | 否 | 审批动作 示例：complete |
| commentId | string | 否 | 评论id 示例：a1720694-e72a-11ec-b3c3-fa037b55b8b7 |
| taskId | string | 否 | 任务Id 示例：79ef968b-e72a-11ec-b3c3-fa037b55b8b7 |
| exceptionReason | string | 否 | 返回的报错信息 |
| displayCode | string | 否 | 业务异常码 示例：000-530-000001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"taskDefinitionKey": "approveUserTask_efe014a4f14c42e8a0c8e9c3149a23cb",
			"currentActivityEndStatus": true,
			"historicProcessInstance": {
				"cannotWithdraw": false,
				"canCooperation": false,
				"withdrawAll": false,
				"source": "developplatform",
				"startUserId": "dfebface-9acc-4b13-bdb2-b11bbbae66e1",
				"jumpToRejectActivity": false,
				"startActivityId": "startEvent_9422faa9a36641c2abe7a4848e53415e",
				"hasTaskFinished": false,
				"historicTasks": [
					{}
				],
				"predict": false,
				"canAttachment": false,
				"startTime": 1654693016000,
				"canComment": false,
				"id": "7987faed-e72a-11ec-b3c3-fa037b55b8b7",
				"tasks": [
					{}
				],
				"processDefinitionId": "processcenter_43616623:19:cf3cedf4-e54a-11ec-9b55-de3969bc08a8",
				"variables": [
					{}
				],
				"canForward": false,
				"bpmCallbackRequestTs": 1654693083907,
				"rejectToTermCantDelete": false,
				"initiatorCanCopyAfterSubmit": false,
				"url": "http://bip-daily.yyuap.com/ubpm-web-rest/service/openapi/history/historic-process-instances/7987faed-e72a-11ec-b3c3-fa037b55b8b7",
				"executions": [
					{}
				],
				"rejectToDraftCantDelete": false,
				"businessKey": "567aa7a5_1473113678830108676",
				"name": "流程",
				"selectedByInitiator": false,
				"tenantId": "0000KO42POTJDOJAJU0000_developplatform",
				"commentId": "a1720694-e72a-11ec-b3c3-fa037b55b8b7",
				"canStore": false,
				"category": "developplatform.567aa7a5",
				"processDefinitionUrl": "http://bip-daily.yyuap.com/ubpm-web-rest/service/openapi/repository/process-definitions/processcenter_43616623:19:cf3cedf4-e54a-11ec-9b55-de3969bc08a8"
			},
			"action": "complete",
			"commentId": "a1720694-e72a-11ec-b3c3-fa037b55b8b7",
			"taskId": "79ef968b-e72a-11ec-b3c3-fa037b55b8b7",
			"exceptionReason": "",
			"displayCode": "000-530-000001",
			"level": 0
		}
	]
}

## 6. 业务异常码

000-530-000001

租户信息不能为空

000-530-000003

参数不能全部为空


## 7. 错误返回码

405	接口禁止访问

500	服务器错误

310071	接口调用失败	请检查入参是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-21

更新

请求说明

修正opepnapi批量审批接口的请求路径

2	2025-07-04

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

