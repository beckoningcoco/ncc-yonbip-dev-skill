---
title: "审批撤回"
apiId: "2107368215555342342"
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

# 审批撤回

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/runtime/ext/jump

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
| taskId | string | 否 | 是 | 任务id 示例：b1dcd025-8618-11ef-b838-ee618bfd1247 |
| appSource | string | 否 | 否 | 应用来源(由对应的领域在流程预制，如：RBSM) 示例：RBSM |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/runtime/ext/jump?access_token=访问令牌
Body: {
	"taskId": "b1dcd025-8618-11ef-b838-ee618bfd1247",
	"appSource": "RBSM"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 任务id 示例：3d9ebf5c-861a-11ef-b838-ee618bfd1247 |
| url | string | 否 | 任务url 示例：https://bip-daily.yonyoucloud.com/ubpm-web-rest/service/runtime/tasks/3d9ebf5c-861a-11ef-b838-ee618bfd1247 |
| assignee | string | 否 | 任务处理人 示例：7e9a7047-bf83-436e-a198-61be32652012 |
| name | string | 否 | 活动名称 示例：活动1 |
| description | string | 否 | 任务描述 |
| createTime | string | 否 | 创建时间 示例：2024-10-09T16:41:13.000+08:00 |
| dueDate | string | 否 | 截止时间 示例：3023-10-09T16:41:13.000+08:00 |
| priority | number |
| 小数位数:0,最大长度:10 | 否 | 优先级 示例：50 |
| suspended | boolean | 否 | 是否挂起任务 true：是，false：否 示例：false |
| taskDefinitionKey | string | 否 | 任务定义key 示例：approveUserTask_f6a38f5558da473cb6e8a110fa1273f4 |
| tenantId | string | 否 | 租户id 示例：0000L7PISMYKARJ3MC0000_iuap-apcom-auth |
| category | string | 否 | 目录 示例：iuap-apcom-auth.AutoAuthApply |
| formKey | string | 否 | 业务活动 |
| parentTaskId | string | 否 | 父任务id |
| parentTaskUrl | string | 否 | 父任务url |
| executionId | string | 否 | 执行对象id 示例：fd29ce89-6ea1-11ef-b7fe-de635e9b1472 |
| executionUrl | string | 否 | 执行对象url 示例：https://bip-daily.yonyoucloud.com//ubpm-web-rest/service/runtime/executions/fd29ce89-6ea1-11ef-b7fe-de635e9b1472 |
| processInstanceId | string | 否 | 流程实例id 示例：fcf502b7-6ea1-11ef-b7fe-de635e9b1472 |
| processInstanceUrl | string | 否 | 流程实例url 示例：https://bip-daily.yonyoucloud.com//ubpm-web-rest/service/runtime/process-instances/fcf502b7-6ea1-11ef-b7fe-de635e9b1472 |
| processDefinitionId | string | 否 | 流程定义id 示例：processcenter_98d3a170:5:b0bb88ee-6e6f-11ef-b306-4a46fa8ffbeb |
| processDefinitionUrl | string | 否 | 流程定义url 示例：https://bip-daily.yonyoucloud.com/ubpm-web-rest/service/repository/process-definitions/processcenter_98d3a170:5:b0bb88ee-6e6f-11ef-b306-4a46fa8ffbeb |
| variables | string | 是 | 变量 |
| processDefinitionName | string | 否 | 流程定义名称 |
| activity | string | 否 | 活动 |
| processInstance | string | 否 | 流程实例id |
| taskComments | string | 否 | 审批意见 |
| agent | string | 否 | 代理人 |
| source | string | 否 | 应用来源 示例：iuap-apcom-auth |
| read | boolean | 否 | 是否已读 true：是，false：否 示例：false |
| sortNum | number |
| 小数位数:0,最大长度:10 | 否 | 顺序号 示例：0 |
| businessStepCode | string | 否 | 业务阶段编码 |
| procInsStartTime | string | 否 | 流程发起时间 |
| displayCode | string | 否 | 业务异常码 示例：000-530-000001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "3d9ebf5c-861a-11ef-b838-ee618bfd1247",
		"url": "https://bip-daily.yonyoucloud.com/ubpm-web-rest/service/runtime/tasks/3d9ebf5c-861a-11ef-b838-ee618bfd1247",
		"assignee": "7e9a7047-bf83-436e-a198-61be32652012",
		"name": "活动1",
		"description": "",
		"createTime": "2024-10-09T16:41:13.000+08:00",
		"dueDate": "3023-10-09T16:41:13.000+08:00",
		"priority": 50,
		"suspended": false,
		"taskDefinitionKey": "approveUserTask_f6a38f5558da473cb6e8a110fa1273f4",
		"tenantId": "0000L7PISMYKARJ3MC0000_iuap-apcom-auth",
		"category": "iuap-apcom-auth.AutoAuthApply",
		"formKey": "",
		"parentTaskId": "",
		"parentTaskUrl": "",
		"executionId": "fd29ce89-6ea1-11ef-b7fe-de635e9b1472",
		"executionUrl": "https://bip-daily.yonyoucloud.com//ubpm-web-rest/service/runtime/executions/fd29ce89-6ea1-11ef-b7fe-de635e9b1472",
		"processInstanceId": "fcf502b7-6ea1-11ef-b7fe-de635e9b1472",
		"processInstanceUrl": "https://bip-daily.yonyoucloud.com//ubpm-web-rest/service/runtime/process-instances/fcf502b7-6ea1-11ef-b7fe-de635e9b1472",
		"processDefinitionId": "processcenter_98d3a170:5:b0bb88ee-6e6f-11ef-b306-4a46fa8ffbeb",
		"processDefinitionUrl": "https://bip-daily.yonyoucloud.com/ubpm-web-rest/service/repository/process-definitions/processcenter_98d3a170:5:b0bb88ee-6e6f-11ef-b306-4a46fa8ffbeb",
		"variables": [
			""
		],
		"processDefinitionName": "",
		"activity": "",
		"processInstance": "",
		"taskComments": "",
		"agent": "",
		"source": "iuap-apcom-auth",
		"read": false,
		"sortNum": 0,
		"businessStepCode": "",
		"procInsStartTime": "",
		"displayCode": "000-530-000001",
		"level": 0
	}
}

## 6. 业务异常码

000-530-401025

流程定义上检查出不允许撤回

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

更新

返回参数 (35)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

