---
title: "根据code获取nc用户信息"
apiId: "6aae6201-d840-4a11-a5e3-971d734beca9"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Mobile Configuration"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mobile Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据code获取nc用户信息

> `ContentType	application/json` 请求方式	GET | 分类: Mobile Configuration (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/freelogin/nc_info_by_code

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | java.lang.String | query | 是 | 免登code（必须是nc集成的用户） |

## 3. 请求示例

Url: /yonbip/uspace/freelogin/nc_info_by_code?access_token=访问令牌&code=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| yhtUserId | string | 否 | 用户id |
| tenantId | string | 否 | 租户Id |
| memberId | string | 否 | 空间用户id |
| qzId | string | 否 | 空间Id |
| bindEmail | string | 否 | 绑定的邮箱 |
| bindMobile | string | 否 | 绑定的手机号 |
| bindUcode | string | 否 | 绑定的用户编码 |
| bindUid | string | 否 | 绑定的用户ID |
| tenantCode | string | 否 | 租户编码 |
| userName | string | 否 | 用户名 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"yhtUserId": "",
		"tenantId": "",
		"memberId": "",
		"qzId": "",
		"bindEmail": "",
		"bindMobile": "",
		"bindUcode": "",
		"bindUid": "",
		"tenantCode": "",
		"userName": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

