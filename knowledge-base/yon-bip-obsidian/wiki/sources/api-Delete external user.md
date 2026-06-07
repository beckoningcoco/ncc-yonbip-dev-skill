---
title: "删除外部用户"
apiId: "1758742395838005258"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BIP Role"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BIP Role]
platform_version: "BIP"
source_type: community-api-docs
---

# 删除外部用户

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/iuap-apcom-bipuser/IUserIdentityService/removeIdentityByUserIdsAndUserType

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条删除

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| userIds | string | 是 | 是 | 友户通用户id列表 |
| userType | int | 否 | 是 | 身份类型1员工,2客户管理员,3客户业务员,4商家管理员,5商家业务员,6外部参会人员,7供应商,30其他外部用户 示例：30 默认值：30 |

## 3. 请求示例

Url: /yonbip/digitalModel/iuap-apcom-bipuser/IUserIdentityService/removeIdentityByUserIdsAndUserType?access_token=访问令牌
Body: {
	"userIds": [
		""
	],
	"userType": 30
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回消息 |
| data | object | 否 | 返回对象 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110010

上下文读取友户通租户Id失败！


## 7. 错误返回码

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

