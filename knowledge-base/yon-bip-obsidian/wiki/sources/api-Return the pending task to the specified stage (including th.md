---
title: "退回待办到指定环节（包含开立态）"
apiId: "1957693329750622212"
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

# 退回待办到指定环节（包含开立态）

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/runtime/ext/procesInstances/reject

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
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| jumpOrigin | string | 否 | 否 | 驳回原因 |
| activityId | string | 否 | 否 | 退回到的环节id，当action为rejectToActivity是必填项 |
| taskId | string | 否 | 是 | 退回操作的任务 |
| processInstanceId | string | 否 | 是 | 对应流程实例id |
| source | string | 否 | 是 | 应用来源(由对应的领域在流程预制，如：RBSM) |
| action | string | 否 | 是 | 退回动作 默认值：rejectToStart/rejectToActivity : 退回开立/退回指定环节 |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/runtime/ext/procesInstances/reject?access_token=访问令牌
Header: 
	restservice : ""
Body: {
	"jumpOrigin": "",
	"activityId": "",
	"taskId": "",
	"processInstanceId": "",
	"source": "",
	"action": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| data | object | 否 | 返回的数据 |
| id | string | 否 | 流程实例id 示例：dd451cd2-e847-11ee-ac4d-ce092414a521 |
| url | string | 否 | 操作的url 示例：/history/historic-process-instances/dd451cd2-e847-11ee-ac4d-ce092414a521 |
| name | string | 否 | 单据名称 示例：物料申请单WLXZWLXZ000444 |
| businessKey | string | 否 | 单据的key 示例：pc_productapply_1957736958029463558 |
| businessStatus | string | 否 | 业务状态 |
| processDefinitionId | string | 否 | 流程定义id 示例：processcenter_9cc045b6:1:cf668b80-e847-11ee-ac4d-ce092414a521 |
| processDefinitionUrl | string | 否 | 流程定义url 示例：/repository/process-definitions/processcenter_9cc045b6:1:cf668b80-e847-11ee-ac4d-ce092414a521 |
| processDefinitionName | string | 否 | 流程定义名称 |
| processDefinitionDescription | string | 否 | 流程定义描述 |
| startTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 开始时间 示例：2024-03-22T20:29:45.000+08:00 |
| endTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 结束时间 |
| durationInMillis | number |
| 小数位数:0,最大长度:10 | 否 | 处理时长 |
| startUserId | string | 否 | 流程的发起者 示例：eeccdb60-2511-4a7e-87f1-58a51aa7fbdc |
| startActivityId | string | 否 | 开始的活动环节id 示例：startEvent_ca854361867d48e98e368969f52bcb20 |
| endActivityId | string | 否 | 结束环节id |
| deleteReason | string | 否 | 删除原因 |
| superProcessInstanceId | string | 否 | 父亲流程的流程实例id |
| variables | object | 是 | 变量 |
| callbackId | string | 否 | 回调的id |
| callbackType | string | 否 | 回调的type |
| referenceId | string | 否 | 参照 |
| referenceType | string | 否 | 参照类型 |
| propagatedStageInstanceId | string | 否 | 实例id |
| tenantId | string | 否 | 租户id 示例：0000LC5NLRD4GPBAR40000_PC |
| errcode | number |
| 小数位数:0,最大长度:10 | 否 | 错误码 示例：0 |
| errmsg | string | 否 | 错误信息 示例：ok |
| state | string | 否 | 流程状态 |
| keyFeature | string | 否 | 关键特性 |
| currentActivityId | string | 否 | 当前活动id |
| historicTasks | object | 否 | 流程的历史任务 |
| tasks | object | 否 | 流程的待办任务 |
| historicActivityInstances | object | 否 | 历史活动实例 |
| executions | string | 否 | 执行实例 |
| subHistoricProcessInstanceResponses | object | 是 | 子流程实例 |
| bpmForms | object | 是 | 表单返回值格式实体 |
| bpmActivityForms | object | 是 | 表单活动返回值 |
| iforms | object | 是 | 表单实体 |
| activityIForms | object | 是 | 表单活动 |
| startParticipant | object | 否 | 发起人 |
| currentParticipant | object | 否 | 当前参与者 |
| initialParticipant | object | 否 | 流程的发起人 |
| copyUserParticipants | object | 是 | 抄送人 |
| processDefination | object | 否 | 流程定义 |
| icon | string | 否 | 图标 |
| hasTaskFinished | boolean | 否 | 是否有任务已完成 示例：false |
| withdrawAll | boolean | 否 | 流程完成前，表单可撤回 示例：false |
| cannotWithdraw | boolean | 否 | 表单不允许撤回 示例：false |
| makeBillUserId | string | 否 | 制单人id |
| makeBilParticipant | object | 否 | 制单人 |
| assigneeIds | string | 否 | 参与人 |
| rejectToTermCantDelete | boolean | 否 | 驳回终止的单据不可删除 示例：false |
| rejectToDraftCantDelete | boolean | 否 | 驳回草稿的单据可删除 示例：false |
| orgId | string | 否 | 组织id |
| extend | string | 否 | 扩展信息 |
| canCooperation | boolean | 否 | 可协作 示例：false |
| jumpToRejectActivity | boolean | 否 | 是否跳转到驳回环节 示例：false |
| canAttachment | boolean | 否 | 允许制单人上传附件 示例：false |
| canEdit | boolean | 否 | 是否可编辑 示例：false |
| canUpload | boolean | 否 | 待办环节可上传附件 示例：true |
| canComment | boolean | 否 | 可发起评论 示例：false |
| canForward | boolean | 否 | 待办环节可转发 示例：false |
| commentId | string | 否 | 评论id 示例：d7cadf1d-e848-11ee-ac4d-ce092414a521 |
| canStore | boolean | 否 | 可收藏 示例：false |
| originalProcessDefinitionId | string | 否 | 后加签原始流程定义id |
| initiatorCanCopyAfterSubmit | boolean | 否 | 发起人提交后是否可转发 示例：false |
| category | string | 否 | 流程分类 示例：PC.pc_productapply |
| selectedByInitiator | boolean | 否 | 开始环节的“驳回提交方式”增加第三个 示例：false |
| superHistoricProcessInstanceResponse | object | 否 | 父流程实例 |
| startUserOrgId | string | 否 | 发起人组织id |
| predict | boolean | 否 | 是否可流程预测，租户级设置 示例：false |
| processStartAndAutoEnd | string | 否 | 是否提交即完成 |
| bpmCallbackRequestId | string | 否 | 回调id |
| bpmCallbackRequestTs | number |
| 小数位数:0,最大长度:13 | 否 | 回调的时间戳 示例：1711111005286 |
| notRecorded | string | 否 | 找不到人自动审批 不记录历史 |
| source | string | 否 | 业务来源 示例：PC |
| uuid | string | 否 | uuid |
| ts | string | 否 | 时间戳 |
| flwHost | string | 否 | 分流标识 |
| hideCommentList | object | 否 | 对表单用户隐藏全部审批意见 |
| processDefinitionVersion | number |
| 小数位数:0,最大长度:10 | 否 | 流程定义版本 示例：0 |
| withdrawNotRecord | boolean | 否 | 是否记录撤回 示例：false |
| procInstContent | string | 否 | 流程扩展信息 |
| taskComments | object | 是 | 任务评论 |
| variableMap | object | 是 | 变量map |
| formDataList | object | 是 | 表单数据列表 |
| formDataMap | object | 是 | 表单数据集合 |
| procDefKey | string | 否 | 流程定义的key |
| model | string | 否 | 模型 |
| displayCode | string | 否 | 业务异常码 示例：000-530-000003 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"id": "dd451cd2-e847-11ee-ac4d-ce092414a521",
		"url": "/history/historic-process-instances/dd451cd2-e847-11ee-ac4d-ce092414a521",
		"name": "物料申请单WLXZWLXZ000444",
		"businessKey": "pc_productapply_1957736958029463558",
		"businessStatus": "",
		"processDefinitionId": "processcenter_9cc045b6:1:cf668b80-e847-11ee-ac4d-ce092414a521",
		"processDefinitionUrl": "/repository/process-definitions/processcenter_9cc045b6:1:cf668b80-e847-11ee-ac4d-ce092414a521",
		"processDefinitionName": "",
		"processDefinitionDescription": "",
		"startTime": "2024-03-22T20:29:45.000+08:00",
		"endTime": "2026-06-07 11:39:22",
		"durationInMillis": 0,
		"startUserId": "eeccdb60-2511-4a7e-87f1-58a51aa7fbdc",
		"startActivityId": "startEvent_ca854361867d48e98e368969f52bcb20",
		"endActivityId": "",
		"deleteReason": "",
		"superProcessInstanceId": "",
		"variables": [
			{}
		],
		"callbackId": "",
		"callbackType": "",
		"referenceId": "",
		"referenceType": "",
		"propagatedStageInstanceId": "",
		"tenantId": "0000LC5NLRD4GPBAR40000_PC",
		"errcode": 0,
		"errmsg": "ok",
		"state": "",
		"keyFeature": "",
		"currentActivityId": "",
		"historicTasks": {},
		"tasks": {},
		"historicActivityInstances": {},
		"executions": "",
		"subHistoricProcessInstanceResponses": [
			{}
		],
		"bpmForms": [
			{}
		],
		"bpmActivityForms": [
			{}
		],
		"iforms": [
			{}
		],
		"activityIForms": [
			{}
		],
		"startParticipant": {},
		"currentParticipant": {},
		"initialParticipant": {},
		"copyUserParticipants": [
			{}
		],
		"processDefination": {},
		"icon": "",
		"hasTaskFinished": false,
		"withdrawAll": false,
		"cannotWithdraw": false,
		"makeBillUserId": "",
		"makeBilParticipant": {},
		"assigneeIds": "",
		"rejectToTermCantDelete": false,
		"rejectToDraftCantDelete": false,
		"orgId": "",
		"extend": "",
		"canCooperation": false,
		"jumpToRejectActivity": false,
		"canAttachment": false,
		"canEdit": false,
		"canUpload": true,
		"canComment": false,
		"canForward": false,
		"commentId": "d7cadf1d-e848-11ee-ac4d-ce092414a521",
		"canStore": false,
		"originalProcessDefinitionId": "",
		"initiatorCanCopyAfterSubmit": false,
		"category": "PC.pc_productapply",
		"selectedByInitiator": false,
		"superHistoricProcessInstanceResponse": {},
		"startUserOrgId": "",
		"predict": false,
		"processStartAndAutoEnd": "",
		"bpmCallbackRequestId": "",
		"bpmCallbackRequestTs": 1711111005286,
		"notRecorded": "",
		"source": "PC",
		"uuid": "",
		"ts": "",
		"flwHost": "",
		"hideCommentList": {},
		"processDefinitionVersion": 0,
		"withdrawNotRecord": false,
		"procInstContent": "",
		"taskComments": [
			{}
		],
		"variableMap": [
			{}
		],
		"formDataList": [
			{}
		],
		"formDataMap": [
			{}
		],
		"procDefKey": "",
		"model": "",
		"displayCode": "000-530-000003",
		"level": 0
	}
}

## 6. 业务异常码

000-530-000003

参数不能全部为空

000-530-401029

processInstanceId为必传项

000-530-401030

taskId为必传项

000-530-401031

根据processInatnceId未查询到对应的流程实例，请检查参数正确性

000-530-401032

未查询到待办，请确定任务状态！

000-530-401033

action无法识别，请输入正确的action

000-530-401034

退回失败：{0}


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

