---
title: "电子签hub绑定企业经办人"
apiId: "2275244820481966083"
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

# 电子签hub绑定企业经办人

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/company/common/v1/bindUser

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
| companyId | string | 否 | 否 | 企业ID、uniqueId其一必须有值，如果两者都有值，则以companyId为准 示例：2e192d1a99382921ac0031ce5853aaf3 |
| uniqueId | string | 否 | 否 | 业务系统方关联的唯一标识，如果companyId和uniqueId两者都有值的情况下，以companyId为准 示例：123123-123123 |
| accountId | string | 否 | 否 | 操作绑定企业经办人操作者电子签用户accountId 示例：ba760e45798e6e21669dee70fce854ec |
| accountUniqueId | string | 否 | 否 | 业务系统关联的唯一用户ID 示例：890-78 |
| users | object | 是 | 否 | 绑定的经办人用户列表 |
| accountId | string | 否 | 否 | 电子签用户账号ID，uniqueid两者不能同时为空，两者都有值的情况下，以accountId为准 示例：44532df36f8f430dfa3b8618ba10b3e1 |
| uniqueId | string | 否 | 否 | 业务系统方关联的用户ID 示例：123123 |
| isDefault | string | 否 | 否 | 是否为默认用户：0非默认用户，1默认用户，默认0 示例：0 |

## 3. 请求示例

Url: /yonbip/id/company/common/v1/bindUser?access_token=访问令牌
Body: {
	"companyId": "2e192d1a99382921ac0031ce5853aaf3",
	"uniqueId": "123123-123123",
	"accountId": "ba760e45798e6e21669dee70fce854ec",
	"accountUniqueId": "890-78",
	"users": [
		{
			"accountId": "44532df36f8f430dfa3b8618ba10b3e1",
			"uniqueId": "123123",
			"isDefault": "0"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {}
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

