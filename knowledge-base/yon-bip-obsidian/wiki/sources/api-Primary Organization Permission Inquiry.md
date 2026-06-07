---
title: "主组织权限查询"
apiId: "d37344d2095741cdaf09d91125d9a052"
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

# 主组织权限查询

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/mainOrgPermission

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
| userId | string | 否 | 是 | 友户通用户Id 示例：1b65884d-49e9-4a42-b192-bd9cba095f67 |
| serviceCode | string | 否 | 是 | 服务编码 示例：aa_electroinvoicelist |
| tenantId | string | 否 | 否 | 租户Id 示例：tte2tqx4 |
| roleId | string | 否 | 否 | 角色Id（角色Id与角色编码都有值，优先取角色Id） 示例：4a260100-3467-41ad-9034-a40f1f8b40b8 |
| roleCode | string | 否 | 否 | 角色编码（角色Id与角色编码都有值，优先取角色Id） 示例：btest01 |

## 3. 请求示例

Url: /yonbip/digitalModel/mainOrgPermission?access_token=访问令牌
Body: {
	"userId": "1b65884d-49e9-4a42-b192-bd9cba095f67",
	"serviceCode": "aa_electroinvoicelist",
	"tenantId": "tte2tqx4",
	"roleId": "4a260100-3467-41ad-9034-a40f1f8b40b8",
	"roleCode": "btest01"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态编码 示例：200 |
| data | string | 是 | 返回值 示例：["123a","456b"] |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		"123a",
		"456b"
	],
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110010

上下文读取友户通租户Id失败！


## 7. 错误返回码

暂时没有数据哦~


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

