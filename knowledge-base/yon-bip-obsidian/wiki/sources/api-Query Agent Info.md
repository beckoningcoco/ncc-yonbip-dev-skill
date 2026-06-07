---
title: "查询代理人信息"
apiId: "2392356449647329285"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Workflow Agent"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Workflow Agent]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询代理人信息

> `ContentType	application/json` 请求方式	POST | 分类: Workflow Agent (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/PF/GZTFLOW/query/agents

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
| id | string | 否 | 否 | id 示例：agent123 |
| agentId | string | 否 | 否 | agentId 示例：agent001 |
| type | string | 否 | 否 | type 示例：proxy |
| name | string | 否 | 否 | name 示例：代理人A |
| nameLike | string | 否 | 否 | nameLike 示例：代理 |
| nameLikeIgnoreCase | string | 否 | 否 | nameLikeIgnoreCase 示例：代理 |
| userName | string | 否 | 否 | userName 示例：user1 |
| agentUserName | string | 否 | 否 | agentUserName 示例：agentUser1 |
| returnCategoryName | boolean | 否 | 否 | returnCategoryName 示例：true |
| returnProcessDefinitionName | boolean | 否 | 否 | returnProcessDefinitionName 示例：true |
| returnUserName | boolean | 否 | 否 | returnUserName 示例：true |
| orgId | string | 否 | 否 | orgId 示例：org001 |
| orgIds | string | 是 | 否 | orgIds 示例：["org001","org002"] |
| userId | string | 否 | 否 | userId 示例：user001 |
| userIds | string | 是 | 否 | userIds 示例：["user001","user002"] |
| agentUserId | string | 否 | 否 | agentUserId 示例：agent001 |
| agentUserIds | string | 是 | 否 | agentUserIds 示例：["agent001","agent002"] |
| createBefore | string | 否 | 否 | createBefore 示例：2023-10-01T10:00:00Z |
| createAfter | string | 否 | 否 | createAfter 示例：2023-09-01T10:00:00Z |
| modifyBefore | string | 否 | 否 | modifyBefore 示例：2023-10-10T10:00:00Z |
| modifyAfter | string | 否 | 否 | modifyAfter 示例：2023-10-01T10:00:00Z |
| enable | boolean | 否 | 否 | enable 示例：true |
| categoryId | string | 否 | 否 | categoryId 示例：category001 |
| processDefinitionKey | string | 否 | 否 | processDefinitionKey 示例：processKey001 |
| processDefinitionId | string | 否 | 否 | processDefinitionId 示例：processDef001 |
| startBefore | string | 否 | 否 | startBefore 示例：2023-10-15T10:00:00Z |
| startAfter | string | 否 | 否 | startAfter 示例：2023-10-01T10:00:00Z |
| endBefore | string | 否 | 否 | endBefore 示例：2023-10-30T10:00:00Z |
| endAfter | string | 否 | 否 | endAfter 示例：2023-10-20T10:00:00Z |
| billTypeId | string | 否 | 否 | billTypeId 示例：billType001 |
| disableProxyWhenConditionFalse | boolean | 否 | 否 | disableProxyWhenConditionFalse 示例：false |
| notIncludeProcesskeyNull | boolean | 否 | 否 | notIncludeProcesskeyNull 示例：true |
| order | string | 否 | 否 | order 示例：createTime |
| start | number |
| 小数位数:0,最大长度:10 | 否 | 否 | start 示例：0 |
| size | number |
| 小数位数:0,最大长度:10 | 否 | 否 | size 示例：10 |

## 3. 请求示例

Url: /yonbip/PFC/PF/GZTFLOW/query/agents?access_token=访问令牌
Body: {
	"id": "agent123",
	"agentId": "agent001",
	"type": "proxy",
	"name": "代理人A",
	"nameLike": "代理",
	"nameLikeIgnoreCase": "代理",
	"userName": "user1",
	"agentUserName": "agentUser1",
	"returnCategoryName": true,
	"returnProcessDefinitionName": true,
	"returnUserName": true,
	"orgId": "org001",
	"orgIds": [
		"org001",
		"org002"
	],
	"userId": "user001",
	"userIds": [
		"user001",
		"user002"
	],
	"agentUserId": "agent001",
	"agentUserIds": [
		"agent001",
		"agent002"
	],
	"createBefore": "2023-10-01T10:00:00Z",
	"createAfter": "2023-09-01T10:00:00Z",
	"modifyBefore": "2023-10-10T10:00:00Z",
	"modifyAfter": "2023-10-01T10:00:00Z",
	"enable": true,
	"categoryId": "category001",
	"processDefinitionKey": "processKey001",
	"processDefinitionId": "processDef001",
	"startBefore": "2023-10-15T10:00:00Z",
	"startAfter": "2023-10-01T10:00:00Z",
	"endBefore": "2023-10-30T10:00:00Z",
	"endAfter": "2023-10-20T10:00:00Z",
	"billTypeId": "billType001",
	"disableProxyWhenConditionFalse": false,
	"notIncludeProcesskeyNull": true,
	"order": "createTime",
	"start": 0,
	"size": 10
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

