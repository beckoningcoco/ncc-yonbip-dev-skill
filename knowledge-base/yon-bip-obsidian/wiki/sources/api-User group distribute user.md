---
title: "用户组分配用户"
apiId: "2201177405067886599"
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

# 用户组分配用户

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/usergroup/allocate

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| userGroupId | number |
| 小数位数:-1,最大长度:19 | 否 | 是 | 用户组ID 示例：7349540912688529408 |
| addUserId | string | 是 | 否 | 添加用户ID集合，addUserId与deleteUserId不能同时为空 示例：["d22cb00b-15ba-4301-8be1-17115d262010"] |
| deleteUserId | string | 是 | 否 | 删除用户ID集合，addUserId与deleteUserId不能同时为空 示例：["dfd3441b-676a-475f-9f56-e1718a10dd08"] |

## 3. 请求示例

Url: /yonbip/digitalModel/usergroup/allocate?access_token=访问令牌
Body: {
	"userGroupId": 7349540912688529408,
	"addUserId": [
		"d22cb00b-15ba-4301-8be1-17115d262010"
	],
	"deleteUserId": [
		"dfd3441b-676a-475f-9f56-e1718a10dd08"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | string | 否 | data |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "",
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

更新

请求参数 userGroupId

新增

返回参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

