---
title: "员工批量新增或更新_集成_API"
apiId: "2091867755890343945"
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

# 员工批量新增或更新_集成_API

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/staff/batchSaveOrupdate

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | data |
| id | string | 否 | 否 | 主键 |
| changeUserStatus | string | 否 | 否 | 员工状态变化是否同步修改用户标识：同步变化：true 不变化：false |
| code | string | 否 | 是 | 编码 |
| name | string | 否 | 是 | 名称 |
| name2 | string | 否 | 否 | name2 |
| name3 | string | 否 | 否 | name3 |
| name4 | string | 否 | 否 | name4 |
| name5 | string | 否 | 否 | name5 |
| name6 | string | 否 | 否 | name6 |
| creator | string | 否 | 否 | 创建人 |
| creationtime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间 |
| modifier | string | 否 | 否 | 修改人 |
| modifiedtime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间 |
| marital | string | 否 | 否 | 婚姻状况 |
| education | string | 否 | 否 | 学历 |
| email | string | 否 | 否 | 邮箱，手机号和邮箱至少有一个 |
| birthdate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 生日，yyyy-MM-dd HH:mm:ss |
| ordernumber | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 序号 |
| photo | string | 否 | 否 | 头像 |
| mobile | string | 否 | 否 | 手机号码，手机号码和邮箱至少有一个 |
| objid | string | 否 | 否 | 外部系统主键id |
| cert_type | string | 否 | 否 | 证件类型 |
| cert_no | string | 否 | 否 | 证件号 |
| officetel | string | 否 | 否 | 办公电话 |
| biz_man_tag | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 是否支持业务员，1是 0否 |
| shop_assis_tag | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 是否支持店员，1是 0否 |
| sex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 性别，0女 1男 |
| remark | string | 否 | 否 | 备注 |
| enable | int | 否 | 否 | 员工状态，0：未启用、1：启用、2：停用，示例：1 |
| joinworkdate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 参加工作日期 |
| user_id | string | 否 | 否 | 友互通ID |
| bu_id | string | 否 | 否 | 所属业务群 |
| org_id | string | 否 | 否 | 所属组织--员工自用 |
| shortname | string | 否 | 否 | 姓名简拼 |
| linkaddr | string | 否 | 否 | 通讯地址 |
| selfemail | string | 否 | 否 | 个人邮箱 |
| degree | string | 否 | 否 | 学位 |
| origin | string | 否 | 否 | 籍贯 |
| country | string | 否 | 否 | 国家地区 |
| political | string | 否 | 否 | 政治面貌 |
| nationality | string | 否 | 否 | 民族 |
| qq | string | 否 | 否 | qq |
| weixin | string | 否 | 否 | weixin |
| linkedin | string | 否 | 否 | 领英 |
| joinpolitydate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 加入党团时间 |
| characterrpr | string | 否 | 否 | 户口性质 |
| permanreside | string | 否 | 否 | 户口所在地 |
| bloodtype | string | 否 | 否 | 血型 |
| psncl_id | string | 否 | 否 | 人员类别 |
| dept_id | string | 否 | 否 | 部门ID |
| unit_id | string | 否 | 否 | 组织ID |
| jsonextattr | string | 否 | 否 | 扩展属性 |
| log | string | 否 | 否 | 删除引用日志 |
| businessid | string | 否 | 否 | 友企联同步业务主键 |
| synchts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 友企联同步时间戳 |
| userrlatid | string | 否 | 否 | 友企联用户关联主键 |
| majorcorpid | string | 否 | 否 | 合同主体单位 |
| jobgrade_id | string | 否 | 否 | 职级 |
| addr_id | string | 否 | 否 | 工作地点 |
| post_id | string | 否 | 否 | 职位主键 |
| jobrank_id | string | 否 | 否 | 职等主键 |
| tenantid | string | 否 | 否 | 租户标识 |
| sysid | string | 否 | 否 | 系统标识 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳 |
| wagegroup | string | 否 | 否 | 薪资组 |
| dr | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 逻辑删除标识 0：否 1：是 |
| mainJobList | object | 是 | 是 | 主职信息 |
| ptJobList | object | 是 | 否 | 兼职信息 |
| bankAcctList | object | 是 | 否 | 员工银行账户信息 |

## 3. 请求示例

Url: /yonbip/digitalModel/staff/batchSaveOrupdate?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"changeUserStatus": "",
			"code": "",
			"name": "",
			"name2": "",
			"name3": "",
			"name4": "",
			"name5": "",
			"name6": "",
			"creator": "",
			"creationtime": "2026-06-07 11:42:36",
			"modifier": "",
			"modifiedtime": "2026-06-07 11:42:36",
			"marital": "",
			"education": "",
			"email": "",
			"birthdate": "2026-06-07 11:42:36",
			"ordernumber": 0,
			"photo": "",
			"mobile": "",
			"objid": "",
			"cert_type": "",
			"cert_no": "",
			"officetel": "",
			"biz_man_tag": 0,
			"shop_assis_tag": 0,
			"sex": 0,
			"remark": "",
			"enable": 0,
			"joinworkdate": "2026-06-07 11:42:36",
			"user_id": "",
			"bu_id": "",
			"org_id": "",
			"shortname": "",
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
			"joinpolitydate": "2026-06-07 11:42:36",
			"characterrpr": "",
			"permanreside": "",
			"bloodtype": "",
			"psncl_id": "",
			"dept_id": "",
			"unit_id": "",
			"jsonextattr": "",
			"log": "",
			"businessid": "",
			"synchts": "2026-06-07 11:42:36",
			"userrlatid": "",
			"majorcorpid": "",
			"jobgrade_id": "",
			"addr_id": "",
			"post_id": "",
			"jobrank_id": "",
			"tenantid": "",
			"sysid": "",
			"pubts": "2026-06-07 11:42:36",
			"wagegroup": "",
			"dr": 0,
			"mainJobList": [
				{
					"director": "",
					"dept_id": "",
					"job_id": "",
					"responsibilities": "",
					"begindate": "2026-06-07",
					"enddate": "2026-06-07",
					"org_id": "",
					"psncl_id": "",
					"post_id": "",
					"jobgrade_id": "",
					"objid": "",
					"id": "",
					"enable": 0,
					"creator": "",
					"creationtime": "2026-06-07 11:42:36",
					"modifier": "",
					"modifiedtime": "2026-06-07 11:42:36",
					"staff_id": "",
					"memo": "",
					"showorder": 0,
					"businessid": "",
					"synchts": "2026-06-07 11:42:36",
					"pubts": "2026-06-07 11:42:36",
					"lastestjob": 0,
					"account_org_id": "",
					"new_post_id": "",
					"jobrank_id": "",
					"sysid": "",
					"jsonextattr": "",
					"tenantid": "",
					"dr": 0,
					"trnsevent": ""
				}
			],
			"ptJobList": [
				{
					"dept_id": "",
					"director": "",
					"begindate": "2026-06-07",
					"enddate": "2026-06-07",
					"responsibilities": "",
					"org_id": "",
					"job_id": "",
					"post_id": "",
					"jobgrade_id": "",
					"objid": "",
					"id": "",
					"enable": 0,
					"creator": "",
					"creationtime": "2026-06-07 11:42:36",
					"modifier": "",
					"modifiedtime": "2026-06-07 11:42:36",
					"staff_id": "",
					"memo": "",
					"showorder": 0,
					"psncl_id": "",
					"businessid": "",
					"synchts": "2026-06-07 11:42:36",
					"account_org_id": "",
					"new_post_id": "",
					"jobrank_id": "",
					"pubts": "2026-06-07 11:42:36",
					"sysid": "",
					"jsonextattr": "",
					"tenantid": "",
					"dr": 0,
					"trnsevent": ""
				}
			],
			"bankAcctList": [
				{
					"currency": "",
					"bank": "",
					"isdefault": 0,
					"account": "",
					"accountname": "",
					"memo": "",
					"accttype": "",
					"bankname": "",
					"objid": "",
					"id": "",
					"enable": 0,
					"creator": "",
					"creationtime": "2026-06-07 11:42:36",
					"modifier": "",
					"modifiedtime": "2026-06-07 11:42:36",
					"showorder": 0,
					"businessid": "",
					"synchts": "2026-06-07 11:42:36",
					"bu_id": "",
					"recordnum": 0,
					"staff_id": "",
					"pubts": "2026-06-07 11:42:36",
					"sysid": "",
					"jsonextattr": "",
					"tenantid": "",
					"dr": 0
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 成功标识 |
| message | string | 否 | 返回描述 |
| data | object | 否 | 返回体 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 数量 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数 |
| messages | object | 是 | 返回消息 |
| infos | object | 是 | 成功数据 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		],
		"infos": [
			{
				"data": {},
				"sourceUnique": "",
				"targetUnique": "",
				"code": "",
				"name": "",
				"mobile": "",
				"email": "",
				"sex": 0,
				"birthdate": "2026-06-07 11:42:36",
				"name2": "",
				"name3": "",
				"name4": "",
				"name5": "",
				"name6": "",
				"creator": "",
				"creationtime": "2026-06-07 11:42:36",
				"modifier": "",
				"modifiedtime": "2026-06-07 11:42:36",
				"enable": 0,
				"dr": 0,
				"photo": "",
				"cert_type": "",
				"cert_no": "",
				"marital": "",
				"education": "",
				"joinworkdate": "2026-06-07 11:42:36",
				"user_id": "",
				"bu_id": "",
				"org_id": "",
				"shortname": "",
				"officetel": "",
				"linkaddr": "",
				"selfemail": "",
				"degree": "",
				"origin": "",
				"country": "",
				"political": "",
				"nationality": "",
				"linkedin": "",
				"joinpolitydate": "2026-06-07 11:42:36",
				"characterrpr": "",
				"permanreside": "",
				"bloodtype": "",
				"objid": "",
				"biz_man_tag": 0,
				"ordernumber": 0,
				"remark": "",
				"shop_assis_tag": "",
				"deptId": "",
				"psnclId": "",
				"unitId": "",
				"mainJobList": [
					{
						"sourceUnique": "",
						"targetUnique": "",
						"id": "",
						"enable": 0,
						"creator": "",
						"creationtime": "2026-06-07 11:42:36",
						"modifier": "",
						"modifiedtime": "2026-06-07 11:42:36",
						"staff_id": "",
						"org_id": "",
						"dept_id": "",
						"job_id": "",
						"post_id": "",
						"jobgrade_id": "",
						"begindate": "2026-06-07 11:42:36",
						"enddate": "2026-06-07 11:42:36",
						"memo": "",
						"showorder": 0,
						"director": "",
						"psncl_id": "",
						"objid": "",
						"businessid": "",
						"synchts": "2026-06-07 11:42:36",
						"lastestjob": "",
						"account_org_id": "",
						"new_post_id": "",
						"jobrank_id": "",
						"dr": 0
					}
				],
				"ptJobList": [
					{
						"sourceUnique": "",
						"targetUnique": "",
						"id": "",
						"enable": 0,
						"creator": "",
						"creationtime": "2026-06-07 11:42:36",
						"modifier": "",
						"modifiedtime": "2026-06-07 11:42:36",
						"staff_id": "",
						"org_id": "",
						"dept_id": "",
						"job_id": "",
						"post_id": "",
						"jobgrade_id": "",
						"begindate": "2026-06-07 11:42:36",
						"enddate": "2026-06-07 11:42:36",
						"memo": "",
						"showorder": 0,
						"director": "",
						"psncl_id": "",
						"objid": "",
						"synchts": "2026-06-07 11:42:36",
						"businessid": "",
						"account_org_id": "",
						"new_post_id": "",
						"jobrank_id": "",
						"dr": 0
					}
				],
				"bankAcctList": [
					{
						"sourceUnique": "",
						"targetUnique": "",
						"id": "",
						"enable": 0,
						"creator": "",
						"creationtime": "2026-06-07 11:42:36",
						"modifier": "",
						"modifiedtime": "2026-06-07 11:42:36",
						"memo": "",
						"showorder": 0,
						"objid": "",
						"businessid": "",
						"synchts": "",
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
						"pubts": "2026-06-07 11:42:36",
						"sysid": "",
						"dr": 0
					}
				]
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

1	2025-08-08

新增

请求参数 trnsevent

新增

请求参数 trnsevent

勾选海外环境

2	2025-05-29

更新

请求参数 objid

更新

请求参数 objid

去除objid必填校验


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

