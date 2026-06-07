---
title: "获取域用户信息"
apiId: "3e8d23aef4f74d5896d6d1d802c93946"
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

# 获取域用户信息

> `ContentType	application/json` 请求方式	POST | 分类: Enterprise Information (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/user/getScopeUserInfo

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

## 3. 请求示例

Url: /yonbip/digitalModel/user/getScopeUserInfo?access_token=访问令牌
Body: {
	"scope": "scope",
	"scopeCode": "scopeCode"
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

0	查询用户失败


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

