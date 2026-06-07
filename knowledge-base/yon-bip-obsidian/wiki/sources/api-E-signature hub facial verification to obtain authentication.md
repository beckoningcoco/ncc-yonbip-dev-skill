---
title: "电子签hub人脸验证获取认证链接"
apiId: "2275264637461069832"
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

# 电子签hub人脸验证获取认证链接

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/identity/face/v1/verify

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
| idCard | string | 否 | 是 | 待认证身份证号 示例：220323***********6 |
| userName | string | 否 | 是 | 待认证用户名称 示例：张三 |
| returnUrl | string | 否 | 否 | 认证成功后前端页面跳转地址 示例：http://test.com/vi-rela/complete?123123 |
| accountId | string | 否 | 否 | 待认证电子签用户accountId，accountId、uniqueId必须有一个有值 示例：b9cf581b7412968da4efe4d96177418f |
| uniqueId | string | 否 | 否 | 待认证电子签用户业务系统关联的唯一用户ID 示例：123123 |

## 3. 请求示例

Url: /yonbip/id/identity/face/v1/verify?access_token=访问令牌
Body: {
	"idCard": "220323***********6",
	"userName": "张三",
	"returnUrl": "http://test.com/vi-rela/complete?123123",
	"accountId": "b9cf581b7412968da4efe4d96177418f",
	"uniqueId": "123123"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| verifyId | string | 否 | 验证流水号 示例：32a82383a28667e77a81a52774f68ff0 |
| verifyUrl | string | 否 | 人脸验证url地址 示例：https://test.com/real/face |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"verifyId": "32a82383a28667e77a81a52774f68ff0",
		"verifyUrl": "https://test.com/real/face"
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

