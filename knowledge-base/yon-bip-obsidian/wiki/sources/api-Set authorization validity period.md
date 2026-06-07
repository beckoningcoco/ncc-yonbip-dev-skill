---
title: "设置授权有效期"
apiId: "2054002654197055491"
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

# 设置授权有效期

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/userRole/setValidityDate

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| userRoles | object | 是 | 是 | 授权列表（不能超过500条） |
| roleId | string | 否 | 否 | 角色Id（角色Id与角色编码二选一必填，优先取角色Id的值） 示例：0562b308-2b9c-455b-9f5b-0bc56de2c1e4 |
| roleCode | string | 否 | 否 | 角色编码（角色Id与角色编码二选一必填，优先取角色Id的值） 示例：code1 |
| userId | string | 否 | 是 | 用户Id 示例：4094253b-8c46-4de4-be1a-8865f6346b9a |
| identityId | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 身份Id（身份Id与身份类型二选一必填，优先取身份Id的值） 示例：1587080618968998150 |
| identityType | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 身份类型（身份类型与身份Id二选一必填，优先取身份Id的值）枚举列举：1:普通员工,2:客户管理员,3:客户业务员,4:商家管理员,5:商家业务员,6:外部参会人,7:供应商,30:其他外部人员 示例：1 |
| beginDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 有效期开始日期（开始时间与结束时间不能同时为空） 示例：2024-07-30 |
| endDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 有效期结束日期（开始时间与结束时间不能同时为空） 示例：9999-12-31 |

## 3. 请求示例

Url: /yonbip/digitalModel/userRole/setValidityDate?access_token=访问令牌
Body: {
	"userRoles": [
		{
			"roleId": "0562b308-2b9c-455b-9f5b-0bc56de2c1e4",
			"roleCode": "code1",
			"userId": "4094253b-8c46-4de4-be1a-8865f6346b9a",
			"identityId": 1587080618968998150,
			"identityType": 1
		}
	],
	"beginDate": "2024-07-30",
	"endDate": "9999-12-31"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：success |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110211

参数异常


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

