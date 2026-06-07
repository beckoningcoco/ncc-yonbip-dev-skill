---
title: "员工详情查询"
apiId: "57a419ce100a471cb42d25f01a0665c8"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Employee"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工详情查询

> `ContentType` 请求方式	GET | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staff/detail

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 业务数据ID |
| code | string | query | 否 | 业务数据人员code |

## 3. 请求示例

Url: /yonbip/digitalModel/staff/detail?access_token=访问令牌&id=&code=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| enable | int | 否 | 员工状态 0：初始态、1：已启用、2：已停用 |
| name | string | 否 | 员工姓名 |
| email | string | 否 | 邮箱 |
| shop_assis_tag | string | 否 | 店员 |
| mobile | string | 否 | 手机号, |
| code | string | 否 | 员工编码 |
| cert_type | string | 否 | 证件类型 id |
| photo | string | 否 | 头像 |
| ordernumber | string | 否 | 序号 |
| officetel | string | 否 | 办公 |
| sex | string | 否 | 性别, 1:男、2:女、0:不限、 |
| remark | string | 否 | 备注 |
| birthdate | string | 否 | 出生日期 |
| user_id | string | 否 | 关联用户 |
| id | string | 否 | 员工主键id |
| cert_no | string | 否 | 证件号 |
| cert_type_name | string | 否 | 证件类型 名称 |
| biz_man_tag | string | 否 | 业务员 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：格式为:yyyy-MM-dd HH:mm:ss |
| account_org_id | string | 否 | 会计主体 |
| objid | string | 否 | 友企联同步主键 |
| mainJobList | object | 是 | 员工任职信息[bd.staff.StaffMainJob] |
| ptJobList | object | 是 | 员工兼职信息[bd.staff.StaffPtJob] |
| bankAcctList | object | 是 | 员工银行账号[bd.staff.StaffBankAcct] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"enable": 0,
		"name": "",
		"email": "",
		"shop_assis_tag": "",
		"mobile": "",
		"code": "",
		"cert_type": "",
		"photo": "",
		"ordernumber": "",
		"officetel": "",
		"sex": "",
		"remark": "",
		"birthdate": "",
		"user_id": "",
		"id": "",
		"cert_no": "",
		"cert_type_name": "",
		"biz_man_tag": "",
		"pubts": "格式为:yyyy-MM-dd HH:mm:ss",
		"account_org_id": "",
		"objid": "",
		"mainJobList": [
			{
				"id": "",
				"staff_id": "",
				"pubts": "",
				"org_id": "",
				"org_id_name": "",
				"dept_id": "",
				"dept_id_name": "",
				"psncl_id": "",
				"psncl_id_name": "",
				"job_id": "",
				"job_id_name": "",
				"post_id": "",
				"post_id_name": "",
				"jobgrade_id": "",
				"jobgrade_id_name": "",
				"director": "",
				"director_name": "",
				"begindate": "",
				"enddate": "",
				"responsibilities": "",
				"dr": ""
			}
		],
		"ptJobList": [
			{
				"id": "",
				"staff_id": "",
				"pubts": "",
				"org_id": "",
				"org_id_name": "",
				"dept_id": "",
				"dept_id_name": "",
				"psncl_id": "",
				"psncl_id_name": "",
				"job_id": "",
				"job_id_name": "",
				"post_id": "",
				"post_id_name": "",
				"jobgrade_id": "",
				"jobgrade_id_name": "",
				"director": "",
				"director_name": "",
				"begindate": "",
				"enddate": "",
				"responsibilities": "",
				"dr": ""
			}
		],
		"bankAcctList": [
			{
				"id": "",
				"staff_id": "",
				"pubts": "",
				"account": "",
				"accountname": "",
				"bank": "",
				"bankname_name": "",
				"bankname": "",
				"bank_name": "",
				"currency": "",
				"accttype": "",
				"currency_name": "",
				"isdefault": "",
				"memo": "",
				"dr": "",
				"enable": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-22

新增

返回参数 (5)

更新

返回参数 (6)

返回值中增加特征组

2	2023-11-20

新增

返回参数 user_id

增加user_id返回值


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

