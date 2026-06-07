---
title: "添加域用户"
apiId: "89a5aa61e4af480b8e1a7d3b3869119d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Information"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 添加域用户

> `ContentType	application/json` 请求方式	POST | 分类: Enterprise Information (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/user/addScopeUser

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
| scope | string | 否 | 是 | 域的名称（专属云客户专用码） 示例：scope 默认值：%专属云客户专用码% |
| scopeCode | string | 否 | 是 | 在该域下的账号名，注意：scope+scopeCode 组成了唯一索引，不可重复 示例：scopeCode 默认值：%code% |
| scopeMobile | string | 否 | 否 | 手机号 示例：17812341234 |
| scopeEmail | string | 否 | 否 | 邮箱 示例：17812341234@qq.com |
| userName | string | 否 | 否 | 用户昵称 示例：用户名称 |
| userPassword | string | 否 | 否 | 用户密码，注意：如果不填，则使用友户通的默认密码（可找友互通人员确认） 示例：password |

## 3. 请求示例

Url: /yonbip/digitalModel/user/addScopeUser?access_token=访问令牌
Body: {
	"scope": "scope",
	"scopeCode": "scopeCode",
	"scopeMobile": "17812341234",
	"scopeEmail": "17812341234@qq.com",
	"userName": "用户名称",
	"userPassword": "password"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| scope | string | 否 | 域的名称 |
| tenantUserId | string | 否 | 域用户对应的友互通用户id |
| scopeCode | string | 否 | 域用户的账号名 |
| scopeMobile | string | 否 | 域用户的手机号 |
| scopeEmail | string | 否 | 域用户的邮箱 |
| userCode | string | 否 | 域用户对应的友互通用户的账号名 |
| userName | string | 否 | 域用户的名字 |
| sysId | string | 否 | 应用标识 |
| userAvator | string | 否 | 头像地址 |
| userAvatorNew | string | 否 | 新版头像地址 |
| userBigAvatorNew | string | 否 | 新版大尺寸头像地址 |
| userSmallAvatorNew | string | 否 | 新版小尺寸头像地址 |
| sex | int | 否 | 性别。1：女，2：男 |
| birthday | string | 否 | 生日 |
| address | string | 否 | 地域 |
| industry | string | 否 | 行业 |
| position | string | 否 | 职位 |
| addr | string | 否 | 住址 |
| timeZone | string | 否 | 时区 |
| lang | string | 否 | 语言 |
| postCode | string | 否 | 邮政编码 |

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"scope": "",
		"tenantUserId": "",
		"scopeCode": "",
		"scopeMobile": "",
		"scopeEmail": "",
		"userCode": "",
		"userName": "",
		"sysId": "",
		"userAvator": "",
		"userAvatorNew": "",
		"userBigAvatorNew": "",
		"userSmallAvatorNew": "",
		"sex": 0,
		"birthday": "",
		"address": "",
		"industry": "",
		"position": "",
		"addr": "",
		"timeZone": "",
		"lang": "",
		"postCode": ""
	}
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

