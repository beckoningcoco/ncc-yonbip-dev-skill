---
title: "电子签hub普通用户新增保存"
apiId: "2275211775003590662"
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

# 电子签hub普通用户新增保存

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/user/common/v1/create

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
| userName | string | 否 | 是 | 电子签用户姓名 示例：张三 |
| licenseType | string | 否 | 否 | 证件类型: 1. 身份证 2. 中国护照 3. 港澳居民来往内地通行证 4. 台胞证，默认值1 示例：1 |
| licenseNumber | string | 否 | 是 | 电子签用户证件号码 示例：220000********7890 |
| userMobile | string | 否 | 是 | 电子签用户手机号 示例：15912344321 |
| uniqueId | string | 否 | 否 | 用于关联业务系统的唯一标识(一般为用户、员工编号) 示例：23123123-123123123 |

## 3. 请求示例

Url: /yonbip/id/user/common/v1/create?access_token=访问令牌
Body: {
	"userName": "张三",
	"licenseType": "1",
	"licenseNumber": "220000********7890",
	"userMobile": "15912344321",
	"uniqueId": "23123123-123123123"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| accountId | string | 否 | 电子签用户accountId |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"accountId": ""
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

