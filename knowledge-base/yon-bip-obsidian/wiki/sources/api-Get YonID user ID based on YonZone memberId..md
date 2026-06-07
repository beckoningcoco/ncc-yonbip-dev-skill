---
title: "根据友空间memberId获取友户通用户Id"
apiId: "28253f90-e88d-42c0-9a51-569b125a62ac"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Mobile Configuration"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mobile Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据友空间memberId获取友户通用户Id

> `ContentType` 请求方式	GET | 分类: Mobile Configuration (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/batchDoConvert/getYhtByMid

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| memberid | string | query | 否 | 空间用户id |

## 3. 请求示例

Url: /yonbip/uspace/batchDoConvert/getYhtByMid?access_token=访问令牌&memberid=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 错误信息 示例：success |
| data | object | 否 | 数据 |
| first_letter | string | 否 | 姓名首字母 |
| name | string | 否 | 姓名 |
| nickname | string | 否 | 昵称 |
| id | string | 否 | 空间用户ID |
| avatar | string | 否 | 头像 |
| yhtUserId | string | 否 | 友户通用户ID |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"first_letter": "",
		"name": "",
		"nickname": "",
		"id": "",
		"avatar": "",
		"yhtUserId": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-29

更新

请求说明

新增

返回参数 (9)

删除

返回参数 (6)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

