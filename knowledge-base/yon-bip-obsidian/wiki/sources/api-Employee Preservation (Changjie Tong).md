---
title: "员工保存(畅捷通)"
apiId: "1939740443773239302"
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

# 员工保存(畅捷通)

> `ContentType	application/json` 请求方式	POST | 分类: Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/staffQry/tPlus/syncStaff

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
| data | object | 是 | 是 | 员工基本信息[bd.staff.Staff] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | 员工表主键ID 新增时无需填写，更新时必填，示例：1623093086277888 |
| code | string | 否 | 否 | 员工编码，示例A001 |
| name | string | 否 | 否 | 员工姓名，示例：张三 |
| mobile | string | 否 | 否 | 手机号, 86:中国 |
| dept_id | string | 否 | 否 | 部门标识 |
| begindate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 任职开始时间 |
| id | string | 否 | 是 | 请求流水标识 |
| operation | string | 否 | 否 | 操作类型 |
| userId | string | 否 | 否 | 操作人 |
| tenantId | string | 否 | 否 | 租户标识 |
| sysId | string | 否 | 否 | 系统标识 |
| ts | string | 否 | 否 | 时间戳 |

## 3. 请求示例

Url: /yonbip/digitalModel/staffQry/tPlus/syncStaff?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "",
			"code": "",
			"name": "",
			"mobile": "",
			"dept_id": "",
			"begindate": "2026-06-07"
		}
	],
	"id": "",
	"operation": "",
	"userId": "",
	"tenantId": "",
	"sysId": "",
	"ts": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 是 | 调用成功时的返回数据 |
| id | string | 否 | 员工主键id 示例：1884081472960725000 |
| code | string | 否 | 员工编码 示例：test001 |
| name | string | 否 | 员工姓名 示例：test001 |
| mobile | string | 否 | 员工号码 示例：15733334444 |
| org_id | string | 否 | 员工组织ID 示例：1520904057049344 |
| org_id_name | string | 否 | 员工组织名称 示例：测试组织 |
| dept_id | string | 否 | 员工部门ID 示例：1520904057049345 |
| dept_id_name | string | 否 | 员工部门名称 示例：测试部门 |
| begindate | date |
| 格式:yyyy-MM-dd | 否 | 员工任职开始时间 示例：2023-01-24 |
| user_id | string | 否 | 员工的用户ID 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| errorMsg | string | 否 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"id": "1884081472960725000",
			"code": "test001",
			"name": "test001",
			"mobile": "15733334444",
			"org_id": "1520904057049344",
			"org_id_name": "测试组织",
			"dept_id": "1520904057049345",
			"dept_id_name": "测试部门",
			"begindate": "2023-01-24",
			"user_id": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"errorMsg": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	后台接口异常	联系管理员


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

