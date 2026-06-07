---
title: "简版员工列表查询_集成_API"
apiId: "2126610390600122371"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee]
platform_version: "BIP"
source_type: community-api-docs
---

# 简版员工列表查询_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/staff/listForApi

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 页号 |
| pageSize | int | 否 | 是 | 每页行数，每页查询数量阈值500 |
| objid | string | 否 | 否 | 来源主键 |
| ids | string | 是 | 否 | 主键集合 |
| codes | string | 是 | 否 | 编码集合 |
| name | string | 否 | 否 | 名称 |
| mobile | string | 否 | 否 | 手机号 |
| email | string | 否 | 否 | 邮箱 |
| orgIds | string | 是 | 否 | 任职组织IDs |
| userId | string | 否 | 否 | 用户ID |
| deptIds | string | 是 | 否 | 部门IDs |
| pubts | string | 否 | 否 | 查询pubts时间以后的数据 |
| enable | int | 是 | 否 | 员工状态0:未启用，1启用，2停用 |

## 3. 请求示例

Url: /yonbip/digitalModel/staff/listForApi?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"objid": "",
	"ids": [
		""
	],
	"codes": [
		""
	],
	"name": "",
	"mobile": "",
	"email": "",
	"orgIds": [
		""
	],
	"userId": "",
	"deptIds": [
		""
	],
	"pubts": "",
	"enable": [
		0
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 编码 示例：200表示成功 |
| message | string | 否 | 说明 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageCount | string | 否 | 总页数 |
| pageSIze | int | 否 | 每页行数 示例：默认值 10 |
| recordCount | int | 否 | 总数 |
| recordList | object | 是 | 返回数据集合 |

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": {
		"pageCount": "",
		"pageSIze": NaN,
		"recordCount": 0,
		"recordList": [
			{
				"mainJobList": [
					{
						"id": "",
						"enable": NaN,
						"creator": "",
						"creationtime": "2026-06-07 11:42:31",
						"modifier": "",
						"modifiedtime": "2026-06-07 11:42:31",
						"staff_id": "",
						"org_id": "",
						"dept_id": "",
						"job_id": "",
						"post_id": "",
						"jobgrade_id": "",
						"begindate": "2026-06-07 11:42:31",
						"enddate": "2026-06-07 11:42:31",
						"memo": "",
						"showorder": 0,
						"director": "",
						"psncl_id": "",
						"objid": "",
						"businessid": "",
						"synchts": "2026-06-07 11:42:31",
						"lastestjob": NaN,
						"account_org_id": "",
						"new_post_id": "",
						"jobrank_id": "",
						"dr": NaN,
						"tenantid": "",
						"pubts": "2026-06-07 11:42:31",
						"sysid": "",
						"responsibilities": "",
						"jsonextattr": ""
					}
				],
				"ptJobList": [
					{
						"id": "",
						"enable": NaN,
						"creator": "",
						"creationtime": "2026-06-07 11:42:31",
						"modifier": "",
						"modifiedtime": "2026-06-07 11:42:31",
						"staff_id": "",
						"org_id": "",
						"dept_id": "",
						"job_id": "",
						"post_id": "",
						"jobgrade_id": "",
						"begindate": "2026-06-07 11:42:31",
						"enddate": "",
						"memo": "",
						"showorder": 0,
						"director": "",
						"psncl_id": "",
						"objid": "",
						"businessid": "",
						"synchts": "2026-06-07 11:42:31",
						"account_org_id": "",
						"new_post_id": "",
						"jobrank_id": "",
						"pubts": "2026-06-07 11:42:31",
						"sysid": "",
						"responsibilities": "",
						"jsonextattr": "",
						"tenantid": "",
						"dr": NaN
					}
				],
				"bankAcctList": [
					{
						"id": "",
						"enable": NaN,
						"creator": "",
						"creationtime": "2026-06-07 11:42:31",
						"modifier": "",
						"modifiedtime": "2026-06-07 11:42:31",
						"memo": "",
						"showorder": 0,
						"objid": "",
						"businessid": "",
						"synchts": "2026-06-07 11:42:31",
						"accountname": "",
						"bank": "",
						"account": "",
						"bankname": "",
						"accttype": "",
						"bu_id": "",
						"recordnum": 0,
						"isdefault": 0,
						"currency": "",
						"staff_id": "",
						"pubts": "2026-06-07 11:42:31",
						"sysid": "",
						"jsonextattr": "",
						"tenantid": "",
						"dr": NaN
					}
				],
				"id": "",
				"code": "",
				"name": "",
				"name2": "",
				"name3": "",
				"name4": "",
				"name5": "",
				"name6": "",
				"creator": "",
				"creationtime": "2026-06-07 11:42:31",
				"modifier": "",
				"modifiedtime": "2026-06-07 11:42:31",
				"enable": NaN,
				"photo": "",
				"cert_type": "",
				"cert_no": "",
				"sex": "",
				"birthdate": "2026-06-07 11:42:31",
				"marital": "",
				"education": "",
				"email": "",
				"mobile": "",
				"joinworkdate": "2026-06-07 11:42:31",
				"user_id": "",
				"bu_id": "",
				"org_id": "员工自用",
				"shortname": "",
				"officetel": "",
				"linkaddr": "",
				"selfemail": "",
				"degree": "",
				"origin": "",
				"country": "",
				"political": "",
				"nationality": "",
				"qq": "",
				"weixin": "",
				"linkedin": "",
				"joinpolitydate": "2026-06-07 11:42:31",
				"characterrpr": "",
				"permanreside": "",
				"bloodtype": "",
				"objid": "",
				"biz_man_tag": NaN,
				"ordernumber": 0,
				"remark": "",
				"psncl_id": "",
				"dept_id": "",
				"unit_id": "",
				"jsonextattr": "",
				"log": "",
				"businessid": "",
				"synchts": "2026-06-07 11:42:31",
				"userrlatid": "",
				"shop_assis_tag": NaN,
				"majorcorpid": "",
				"jobgrade_id": "",
				"addr_id": "",
				"post_id": "",
				"jobrank_id": "",
				"tenantid": "",
				"sysid": "",
				"pubts": "2026-06-07 11:42:31",
				"wagegroup": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-05-29

删除

请求参数 dr

去除查询接口dr过滤条件


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

