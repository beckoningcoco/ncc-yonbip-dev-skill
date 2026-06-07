---
title: "审批动作前检查"
apiId: "1957663711656148996"
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

# 审批动作前检查

> `ContentType	application/json` 请求方式	POST | 分类: Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/runtime/ext/taskactioncheck

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
| taskId | string | 否 | 是 | 任务id |
| source | string | 否 | 是 | 应用来源(由对应的领域在流程预制，如：RBSM) |

## 3. 请求示例

Url: /yonbip/digitalModel/runtime/ext/taskactioncheck?access_token=访问令牌
Header: 
	restservice : ""
Body: {
	"taskId": "",
	"source": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回错误，若code不为200则为错误信息 示例：查询成功 |
| data | object | 否 | 返回数据 |
| SpecifyInfoResult | object | 否 | 指定检查结果 |
| AssignCheckResult | object | 否 | 指派检查结果 |
| RejectCheckResult | object | 否 | 退回检查结果 |
| canDelegateTask | boolean | 否 | 是否可转交 示例：false |
| displayCode | string | 否 | 业务异常码 示例：000-530-401026 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "查询成功",
	"data": {
		"SpecifyInfoResult": {
			"specifyInfoItems": [
				{
					"activityId": "approveUserTask_d620fc9131a7d988242590dbeb38c27e",
					"activityName": "活动3",
					"assignMethod": "selectMulti",
					"assignNumber": 500,
					"fullStaffAssign": false,
					"participants": {}
				}
			]
		},
		"AssignCheckResult": {
			"assignInfo": {
				"taskId": "d0bf2d07-3235-11ef-82d6-76e7c492fac0",
				"executionId": "d0b7da03-3235-11ef-82d6-76e7c492fac0",
				"assignInfoItems": [
					{
						"activityId": "approveUserTask_d620fc9131a7d988242590dbeb38c27e",
						"activityName": "活动3",
						"multiInstanceType": "parallel",
						"mainActivityId": "",
						"mainActivityName": "",
						"condition": "",
						"participants": [
							{
								"id": "99ea7655-00a2-4bda-b23c-19ade37ea574",
								"code": "",
								"name": "u8c_vip管理员",
								"org": "",
								"org_name": "",
								"pic": "https://cdn.yonyoucloud.com/dev/yht/avator/99ea7655-00a2-4bda-b23c-19ade37ea574/1716968935904/original/original.png?v=X9ssvh",
								"source": "",
								"msg": "",
								"sortNum": 0,
								"dept": "",
								"deptName": "",
								"post": "",
								"postName": "",
								"duty": "",
								"dutyName": "",
								"orgName": "",
								"specifyFlag": false,
								"type": "USER",
								"positions": [
									{
										"positionTarget": [
											""
										],
										"contentId": " 1719239313032_FBa1J @approveUserTask_d620fc9131a7d988242590dbeb38c27e@99ea7655-00a2-4bda-b23c-19ade37ea574"
									}
								],
								"positionJson": {},
								"staffCode": "00000045",
								"priority": 50
							}
						],
						"specifyParticipants": {},
						"usergroups": [
							""
						],
						"depts": [
							""
						],
						"posts": [
							""
						],
						"dutys": [
							""
						],
						"defaultFlow": false,
						"orderNumber": 0,
						"fullStaffAssign": false,
						"assignAble": true,
						"assignMethod": "selectMulti",
						"assignNumber": 500,
						"subProcess": false,
						"subProcDefKey": "",
						"parentProcess": "",
						"specifyFlag": false,
						"hideButton": false
					}
				],
				"userChange": false
			},
			"description": "",
			"createType": "",
			"assignSingle": false,
			"assignAll": false,
			"processDefinitionKey": "",
			"assignAble": true
		},
		"RejectCheckResult": {
			"rejectInfo": {
				"assignInfoItems": [
					{
						"activityId": "approveUserTask_af29725856e54d9b893175b19c102466",
						"activityName": "活动1",
						"participants": [
							{
								"id": "99ea7655-00a2-4bda-b23c-19ade37ea574",
								"code": "00000005",
								"name": "u8c_vip管理员",
								"org": "",
								"org_name": "",
								"pic": "https://cdn.yonyoucloud.com/dev/yht/avator/99ea7655-00a2-4bda-b23c-19ade37ea574/1716968935904/original/original.png?v=X9ssvh",
								"source": "",
								"msg": "",
								"sortNum": 0,
								"dept": "",
								"deptName": "",
								"post": "",
								"postName": "",
								"duty": "",
								"dutyName": "",
								"orgName": "",
								"specifyFlag": false,
								"type": "USER",
								"positions": [
									""
								],
								"positionJson": {},
								"staffCode": "",
								"priority": 50
							}
						],
						"isFirstNode": true,
						"subProcess": false,
						"usergroups": "",
						"depts": "",
						"posts": "",
						"dutys": "",
						"multiInstanceType": "",
						"fullStaffAssign": false,
						"assignAble": false,
						"throughDynamicGateway": true
					}
				]
			},
			"rejectTypeInfo": "",
			"jumpAble": false,
			"rejectAble": true
		},
		"canDelegateTask": false,
		"displayCode": "000-530-401026",
		"level": 0
	}
}

## 6. 业务异常码

000-530-401026

taskid不能为空

000-530-401035

source不能为空

000-530-401036

不存在此条待办，请检查参数是否正确！


## 7. 错误返回码

405	接口禁止访问

500	服务器错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-04

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

