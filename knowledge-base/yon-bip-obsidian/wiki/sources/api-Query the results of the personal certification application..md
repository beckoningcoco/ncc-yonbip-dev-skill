---
title: "查询申请的个人认证结果"
apiId: "1815673493020213255"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询申请的个人认证结果

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/identity/user/getAuthUniqueMessage

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
| flowId | string | 否 | 是 | 申请认证唯一ID，值从 申请进行个人认证 返回参数中获取 示例：123********321 |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/identity/user/getAuthUniqueMessage?access_token=访问令牌
Body: {
	"flowId": "123********321"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| flowId | string | 否 | 认证流程ID 示例：1806666666666664770 |
| accountId | string | 否 | 认证用户ID 示例：1806666666666664770 |
| verifyStatus | string | 否 | 认证状态 1认证中 2已完成 3认证超时 示例：2 |
| bankCard | string | 否 | 银行卡号 示例：6000000000000012 |
| mobile | string | 否 | 认证用户手机号 示例：135******** |
| realName | string | 否 | 认证用户姓名 示例：第五** |
| idCard | string | 否 | 认证用户身份证号 示例：30000000000000000x |
| providerUserId | string | 否 | 认证用户ID 示例：ed4a02a5-****-****-9854-eea0b9b11575 |
| verifyType | string | 否 | 认证类型 1三要素 2四要素 3人脸 示例：2 |
| successFlag | boolean | 否 | 认证状态 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"flowId": "1806666666666664770",
		"accountId": "1806666666666664770",
		"verifyStatus": "2",
		"bankCard": "6000000000000012",
		"mobile": "135********",
		"realName": "第五**",
		"idCard": "30000000000000000x",
		"providerUserId": "ed4a02a5-****-****-9854-eea0b9b11575",
		"verifyType": "2",
		"successFlag": true
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	接口调用错误	接口调用错误


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

