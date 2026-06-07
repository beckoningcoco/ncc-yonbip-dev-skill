---
title: "新增外部用户"
apiId: "1758742395838005252"
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

# 新增外部用户

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/iuap-apcom-bipuser/IUserIdentityService/addIdentityByUserIdAndUserType

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
| userId | string | 否 | 是 | 友户通用户id |
| userType | int | 否 | 是 | 身份类型1员工,2客户管理员,3客户业务员,4商家管理员,5商家业务员,6外部参会人员,7供应商,30其他外部用户 示例：30 默认值：30 |

## 3. 请求示例

Url: /yonbip/digitalModel/iuap-apcom-bipuser/IUserIdentityService/addIdentityByUserIdAndUserType?access_token=访问令牌
Body: {
	"userId": "",
	"userType": 30
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 |
| data | object | 否 | 返回对象 |
| id | long | 否 | 身份主键 示例：1758659649007517699 |
| yhtUserId | string | 否 | 友户通用户id 示例：9618e1ef-d389-476a-b253-07a67349fa9f |
| userName | string | 否 | 用户名 示例：昵称-贝贝001-jt |
| tenantId | string | 否 | 租户 示例：0000KPC165PABLPTS60000 |
| userType | int | 否 | 身份类型1员工,2客户管理员,3客户业务员,4商家管理员,5商家业务员,6外部参会人员,7供应商,30其他外部用户 示例：30 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": 1758659649007517699,
		"yhtUserId": "9618e1ef-d389-476a-b253-07a67349fa9f",
		"userName": "昵称-贝贝001-jt",
		"tenantId": "0000KPC165PABLPTS60000",
		"userType": 30
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	用户不存在


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

