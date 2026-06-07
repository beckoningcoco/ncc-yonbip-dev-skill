---
title: "电子签hub个人实名运营商三要素验证"
apiId: "2275252242185453577"
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

# 电子签hub个人实名运营商三要素验证

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/identity/verify/v1/mobile3Element

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
| accountId | string | 否 | 否 | 待认证电子签用户账号accountId 示例：56db221228ec205f6f98f7cf18b50116 |
| uniqueId | string | 否 | 否 | 待认证电子签用业务系统关联的唯一用户账号ID,如果accountId也有值，应以accountId为准 示例：213123 |
| idCardNumber | string | 否 | 是 | 待认证电子签用户证件号码 示例：220323***********5 |
| userName | string | 否 | 是 | 待认证电子签用户真实姓名 示例：张三 |
| mobile | string | 否 | 是 | 待认证电子签用户手机号 示例：15711112222 |
| verifyCode | string | 否 | 否 | 短信验证码，使用接口【 电子签发送短信验证码】发送的短信，非必填。如果为空，则不进行短信验证码校验 示例：123321 |

## 3. 请求示例

Url: /yonbip/id/identity/verify/v1/mobile3Element?access_token=访问令牌
Body: {
	"accountId": "56db221228ec205f6f98f7cf18b50116",
	"uniqueId": "213123",
	"idCardNumber": "220323***********5",
	"userName": "张三",
	"mobile": "15711112222",
	"verifyCode": "123321"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| flowId | string | 否 | 验证流水号 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"flowId": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

