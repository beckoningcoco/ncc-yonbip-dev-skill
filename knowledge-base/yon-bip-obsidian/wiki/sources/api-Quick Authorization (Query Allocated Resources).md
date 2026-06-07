---
title: "快速授权(查询已分配的资源)"
apiId: "1982851650434367531"
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

# 快速授权(查询已分配的资源)

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/open/funcpermission/fastAuth/getSubjectIdList

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
| serviceCode | string | 否 | 是 | 服务编码 示例：AMC211012 |

## 3. 请求示例

Url: /yonbip/digitalModel/open/funcpermission/fastAuth/getSubjectIdList?access_token=访问令牌
Body: {
	"serviceCode": "AMC211012"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态编码 示例：200 |
| data | object | 否 | 全员应用服务下分配的资源 |
| userIdentitySet | object | 是 | 用户身份｛1普通员工,2客户管理员,3客户业务员,4商家管理员,5商家业务员,6外部参会人,7供应商,30其他外部用户｝ 示例：["1","2","3"] |
| orgDepIdSet | object | 是 | 组织部门ID 示例：["child://2383326834348288"] |
| userlabelSet | string | 是 | 用户标签ID |
| yhtUserIdSet | string | 是 | 用户ID 示例：["fc1e6b5b-0f74-48b5-94f4-7451c36770cf", "f8d23831-57d8-4c7a-8e47-b2844e83bcb2"] |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"userIdentitySet": [
			"1",
			"2",
			"3"
		],
		"orgDepIdSet": [
			"child://2383326834348288"
		],
		"userlabelSet": [
			""
		],
		"yhtUserIdSet": [
			"fc1e6b5b-0f74-48b5-94f4-7451c36770cf",
			"f8d23831-57d8-4c7a-8e47-b2844e83bcb2"
		]
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110211

参数异常


## 7. 错误返回码

999	参照message提示	参照提示信息修改请求数据


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

