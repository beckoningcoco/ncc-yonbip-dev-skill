---
title: "域用户获取友户通登录token"
apiId: "7e7d715be46f4812871d86aac75a63bc"
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

# 域用户获取友户通登录token

> `ContentType	application/json` 请求方式	POST | 分类: Enterprise Information (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/cas/genLoginTokenWithScope

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
| scope | string | 否 | 是 | 域的名称（专属云客户专用码） 示例：scope 默认值：%专属云客户专属码% |
| scopeCode | string | 否 | 是 | 在该域下的账号名，注意：scope+scopeCode 组成了唯一索引，不可重复 示例：scopeCode 默认值：%code% |
| password | string | 否 | 是 | "##@##"+sha1(Password)+"##@####@##"+sha256(Password) 示例：##@##b2c3f8e41fa84696eb9435f0bf15db46ed482dce |

## 3. 请求示例

Url: /yonbip/digitalModel/cas/genLoginTokenWithScope?access_token=访问令牌
Body: {
	"scope": "scope",
	"scopeCode": "scopeCode",
	"password": "##@##b2c3f8e41fa84696eb9435f0bf15db46ed482dce"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| status | int | 否 | 状态码。0：失败，1：成功 |
| curYhtEnvironment | string | 否 | 当前环境地址 |
| msg | string | 否 | 提示信息 |
| token | string | 否 | 登录码 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"status": 0,
		"curYhtEnvironment": "",
		"msg": "",
		"token": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

0	获取登录码失败


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

