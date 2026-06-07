---
title: "员工保存"
apiId: "9375dfca84234b35a0cc32cb15395f3d"
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

# 员工保存

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staff/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 员工基本信息[bd.staff.Staff] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| enable | int | 否 | 否 | 员工状态，0：初始态、1：已启用、2：已停用，示例：1 |
| objid | string | 否 | 否 | 外部系统id，示例：1623093086277888 |
| photo | string | 否 | 否 | 员工头像，photo，示例：https://yyfw-oss1.oss-cn-beijing.aliyuncs.com/26b06422-0438-4fda-b884-11991bcb229c.png |
| id | string | 否 | 否 | 员工表主键ID 新增时无需填写，更新时必填，示例：1623093086277888 |
| code | string | 否 | 是 | 员工编码，示例A001 |
| name | string | 否 | 是 | 员工姓名，示例：张三 |
| cert_type | string | 否 | 否 | 证件类型id，示例：0011-1b3e-4983-abe7-b5f8447159d6 |
| cert_type_name | string | 否 | 否 | 证件类型名称，示例：学生证 |
| cert_no | string | 否 | 否 | 证件号，示例：21873826473 |
| sex | string | 否 | 否 | 性别, 1:男、2:女、0:不限，示例：1 |
| birthdate | Date | 否 | 否 | 出生日期，格式：yyyy-MM-dd，示例：1997-03-12 |
| email | string | 否 | 否 | 邮箱，手机号和邮箱必须最少一个不为空，示例：213214@qq.com |
| mobile | string | 否 | 否 | 手机号, 86:中国 |
| officetel | string | 否 | 否 | 办公电话，示例：18896001111 |
| biz_man_tag | boolean | 否 | 否 | 业务员，true：是，false：否，示例：true |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss，示例：1999-01-01 01:01:00 |
| shop_assis_tag | boolean | 否 | 否 | 店员，true：是，false：否，示例：true |
| ordernumber | int | 否 | 否 | 序号，不能大于999999，示例9999 |
| remark | string | 否 | 否 | 备注 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新，示例：Insert |
| defines | object | 否 | 否 | 员工自定义项 |
| mainJobList | object | 是 | 是 | 员工任职信息[bd.staff.StaffMainJob] |
| ptJobList | object | 是 | 否 | 员工兼职信息[bd.staff.StaffPtJob] |
| bankAcctList | object | 是 | 否 | 员工银行账号[bd.staff.StaffBankAcct] |

## 3. 请求示例

Url: /yonbip/digitalModel/staff/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"enable": 0,
		"objid": "",
		"photo": "",
		"id": "",
		"code": "",
		"name": "",
		"cert_type": "",
		"cert_type_name": "",
		"cert_no": "",
		"sex": "",
		"birthdate": "",
		"email": "",
		"mobile": "",
		"officetel": "",
		"biz_man_tag": true,
		"pubts": "",
		"shop_assis_tag": true,
		"ordernumber": 0,
		"remark": "",
		"_status": "",
		"defines": {
			"id": "",
			"define1": "",
			"define2": ""
		},
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
				"_status": ""
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
				"_status": ""
			}
		],
		"bankAcctList": [
			{
				"id": "",
				"staff_id": "",
				"pubts": "",
				"account": "",
				"bank": "",
				"bankname_name": "",
				"bankname": "",
				"bank_name": "",
				"currency": "",
				"accttype": "",
				"accountname": "",
				"currency_name": "",
				"isdefault": "",
				"memo": "",
				"_status": "",
				"enable": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| enable | int | 否 | 员工状态，0：初始态、1：已启用、2：已停用 |
| photo | string | 否 | 员工照片 |
| id | string | 否 | 员工主键id |
| code | string | 否 | 员工编码 |
| name | string | 否 | 员工姓名 |
| cert_type | string | 否 | 证件类型id |
| cert_type_name | string | 否 | 证件类型名称 |
| cert_no | string | 否 | 证件号 |
| sex | string | 否 | 性别, 1:男、2:女、0:不限、 |
| birthdate | Date | 否 | 出生日期 |
| email | string | 否 | 邮箱 |
| mobile | string | 否 | 手机号 |
| officetel | string | 否 | 办公电话 |
| biz_man_tag | boolean | 否 | 业务员 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| shop_assis_tag | boolean | 否 | 店员 |
| ordernumber | int | 否 | 序号 |
| creator | string | 否 | 创建人id |
| creationtime | string | 否 | 创建时间 |
| sysid | string | 否 | 旧系统id |
| dr | string | 否 | 删除标识，1：已删除，0：未删除 |
| user_id | string | 否 | 关联用户id |
| tenant | string | 否 | 租户id |
| yhtTenant | string | 否 | 租户id |
| yhtTenantId | string | 否 | 租户id |
| yTenantId | string | 否 | 租户id |
| remark | string | 否 | 备注 |
| defines | object | 否 | 员工自定义项 |
| user_define_character | object | 否 | 基本信息特征 |
| mainJobList | object | 是 | 员工任职信息[bd.staff.StaffMainJob] |
| ptJobList | object | 是 | 员工兼职信息[bd.staff.StaffPtJob] |
| bankAcctList | object | 是 | 员工银行账号[bd.staff.StaffBankAcct] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"enable": 0,
		"photo": "",
		"id": "",
		"code": "",
		"name": "",
		"cert_type": "",
		"cert_type_name": "",
		"cert_no": "",
		"sex": "",
		"birthdate": "",
		"email": "",
		"mobile": "",
		"officetel": "",
		"biz_man_tag": true,
		"pubts": "",
		"shop_assis_tag": true,
		"ordernumber": 0,
		"creator": "",
		"creationtime": "",
		"sysid": "",
		"dr": "",
		"user_id": "",
		"tenant": "",
		"yhtTenant": "",
		"yhtTenantId": "",
		"yTenantId": "",
		"remark": "",
		"defines": {
			"id": "",
			"define1": "",
			"define2": ""
		},
		"user_define_character": {},
		"mainJobList": [
			{
				"id": "",
				"enable": 0,
				"lastestjob": 0,
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
				"creator": "",
				"creationtime": "",
				"sysid": "",
				"tenant": "",
				"yhtTenantId": "",
				"yTenantId": "",
				"yhtTenant": "",
				"dr": 0,
				"user_define_character": {}
			}
		],
		"ptJobList": [
			{
				"id": "",
				"enable": 0,
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
				"creator": "",
				"creationtime": "",
				"sysid": "",
				"tenant": "",
				"yhtTenant": "",
				"yhtTenantId": "",
				"yTenantId": "",
				"dr": 0,
				"user_define_character": {}
			}
		],
		"bankAcctList": [
			{
				"id": "",
				"enable": 0,
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
				"creator": "",
				"creationtime": "",
				"sysid": "",
				"tenant": "",
				"yhtTenant": "",
				"yhtTenantId": "",
				"yTenantId": "",
				"dr": 0,
				"user_define_character": {}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	后台接口异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-18

新增

请求参数 enable

增加银行账户enable字段

2	2025-11-05

更新

请求参数 mobile

1

3	2025-08-04

更新

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

