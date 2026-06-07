---
title: "员工批量新增"
apiId: "d18cdca077c64c9ba2316d565a1e30c3"
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

# 员工批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staff/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | data |
| id | string | 否 | 否 | 主键 |
| code | string | 否 | 是 | 编码 |
| name | string | 否 | 是 | 名称 |
| email | string | 否 | 否 | 邮箱，手机号和邮箱至少有一个 |
| birthdate | string | 否 | 否 | 生日，yyyy-MM-dd HH:mm:ss |
| ordernumber | string | 否 | 否 | 序号 |
| photo | string | 否 | 否 | 头像 |
| mobile | string | 否 | 否 | 手机号码，手机号码和邮箱至少有一个 |
| objid | string | 否 | 否 | 外部系统主键id |
| cert_type | string | 否 | 否 | 证件类型 |
| cert_no | string | 否 | 否 | 证件号 |
| officetel | string | 否 | 否 | 办公电话 |
| biz_man_tag | boolean | 否 | 否 | 是否支持业务员，true是 false否 |
| shop_assis_tag | boolean | 否 | 否 | 是否支持店员，true是 false否 |
| sex | string | 否 | 否 | 性别，0女 1男 |
| remark | string | 否 | 否 | 备注 |
| enable | int | 否 | 否 | 员工状态，0：未启用、1：启用、2：停用，示例：1 |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 |
| mainJobList | object | 是 | 是 | 主职信息 |
| ptJobList | object | 是 | 否 | 兼职信息 |
| bankAcctList | object | 是 | 否 | 员工银行账户信息 |

## 3. 请求示例

Url: /yonbip/digitalModel/staff/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"code": "",
			"name": "",
			"email": "",
			"birthdate": "",
			"ordernumber": "",
			"photo": "",
			"mobile": "",
			"objid": "",
			"cert_type": "",
			"cert_no": "",
			"officetel": "",
			"biz_man_tag": true,
			"shop_assis_tag": true,
			"sex": "",
			"remark": "",
			"enable": 0,
			"_status": "",
			"mainJobList": [
				{
					"_status": "",
					"director": "",
					"dept_id": "",
					"job_id": "",
					"responsibilities": "",
					"begindate": "",
					"enddate": "",
					"org_id": "",
					"psncl_id": "",
					"post_id": "",
					"jobgrade_id": "",
					"id": ""
				}
			],
			"ptJobList": [
				{
					"dept_id": "",
					"director": "",
					"begindate": "",
					"enddate": "",
					"responsibilities": "",
					"_status": "",
					"org_id": "",
					"job_id": "",
					"post_id": "",
					"jobgrade_id": "",
					"id": ""
				}
			],
			"bankAcctList": [
				{
					"currency": "",
					"bank": "",
					"_status": "",
					"isdefault": "",
					"account": "",
					"accountname": "",
					"memo": "",
					"accttype": "",
					"bankname": "",
					"id": "",
					"enable": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 错误码 示例：200 |
| message | string | 否 | 消息内容 示例：操作成功 |
| data | object | 否 | 返回数据 |
| successCountAI | long | 否 | 框架保留字段 示例：1 |
| failCountAI | long | 否 | 框架保留字段 示例：0 |
| count | long | 否 | 数据总量 示例：1 |
| sucessCount | long | 否 | 成功数量 示例：1 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | string | 是 | 提示信息 |
| infos | object | 是 | 详细信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"photo": "https://yyfw-oss1.oss-cn-beijing.aliyuncs.com/26b06422-0438-4fda-b884-11991bcb229c.png",
				"cert_type": "0011-1b3e-4983-abe7-b5f8447159d6",
				"code": "D1301011",
				"cert_no": "102012432316",
				"birthdate": "1997-03-12 00:00:00",
				"mainJobList": [
					{
						"hasDefaultInit": true,
						"begindate": "2020-08-03 00:00:00",
						"enddate": "2022-08-27 00:00:00",
						"responsibilities": "工程师",
						"org_id": "2291057911812352",
						"job_id": "2295312406319872",
						"director": "1623093090095360",
						"dept_id": "2291058351952128",
						"enable": 1,
						"lastestjob": 1,
						"id": "2325583938376704",
						"staff_id": "2325583938343936",
						"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"creationtime": "2021-07-01 20:26:19",
						"sysid": "diwork",
						"dr": 0,
						"pubts": "2021-07-01 20:26:19",
						"yhtTenant": "0000KPF2RZGN43YQ6F0000",
						"tenant": "0000KPF2RZGN43YQ6F0000",
						"yhtTenantId": "0000KPF2RZGN43YQ6F0000",
						"yTenantId": "0000KPF2RZGN43YQ6F0000",
						"jobgrade_id": ""
					}
				],
				"sex": 1,
				"mobile": "+86-15601012579",
				"biz_man_tag": true,
				"remark": "测试",
				"ptJobList": [
					{
						"hasDefaultInit": true,
						"begindate": "2020-08-28 00:00:00",
						"enddate": "2021-08-13 00:00:00",
						"responsibilities": "工作",
						"org_id": "2291057911812352",
						"director": "1623093090095360",
						"job_id": "2295312406319872",
						"director_name": "**",
						"dept_id": "2291058351952128",
						"id": "2325583938376705",
						"staff_id": "2325583938343936",
						"enable": 1,
						"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"creationtime": "2021-07-01 20:26:19",
						"sysid": "diwork",
						"dr": 0,
						"pubts": "2021-07-01 20:26:19",
						"yhtTenant": "0000KPF2RZGN43YQ6F0000",
						"tenant": "0000KPF2RZGN43YQ6F0000",
						"yhtTenantId": "0000KPF2RZGN43YQ6F0000",
						"yTenantId": "0000KPF2RZGN43YQ6F0000",
						"jobgrade_id": ""
					}
				],
				"officetel": "18896001111",
				"bankAcctList": [
					{
						"hasDefaultInit": true,
						"bank": "1889619219927808",
						"memo": "工资",
						"currency": "G001ZM0000DEFAULTCURRENCT00000000004",
						"isdefault": 0,
						"bankname": "1889620004033792",
						"account": "696382837838773874",
						"accountname": "账户名",
						"accttype": "BAT00001",
						"id": "2325583938376706",
						"staff_id": "2325583938343936",
						"enable": 1,
						"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"creationtime": "2021-07-01 20:26:19",
						"sysid": "diwork",
						"dr": 0,
						"pubts": "2021-07-01 20:26:19",
						"yhtTenant": "0000KPF2RZGN43YQ6F0000",
						"tenant": "0000KPF2RZGN43YQ6F0000",
						"yhtTenantId": "0000KPF2RZGN43YQ6F0000",
						"yTenantId": "0000KPF2RZGN43YQ6F0000"
					}
				],
				"name": "syf3BMD ",
				"ordernumber": 999999,
				"email": "122901067@qq.com",
				"shop_assis_tag": true,
				"id": "2325583938343936",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creationtime": "2021-07-01 20:26:19",
				"sysid": "diwork",
				"dr": 0,
				"enable": 1,
				"user_id": "16a88179-9c9c-47eb-aebb-1fff5ed40119",
				"pubts": "2021-07-01 20:26:19",
				"yhtTenant": "0000KPF2RZGN43YQ6F0000",
				"tenant": "0000KPF2RZGN43YQ6F0000",
				"yhtTenantId": "0000KPF2RZGN43YQ6F0000",
				"yTenantId": "0000KPF2RZGN43YQ6F0000"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	程序异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-18

新增

请求参数 enable

增加银行账号enable字段

2	2025-09-26

更新

请求说明

新增

请求参数 id

新增

请求参数 id

新增

请求参数 id

更新

请求参数 _status

更新

返回参数 dr

增加子集ID字段

3	2025-08-07

更新

请求参数 post_id

更新

请求参数 post_id


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

