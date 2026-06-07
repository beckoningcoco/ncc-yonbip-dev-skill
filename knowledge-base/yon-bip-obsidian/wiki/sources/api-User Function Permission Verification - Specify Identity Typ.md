---
title: "用户功能权限校验-指定身份类型"
apiId: "2256516795971665921"
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

# 用户功能权限校验-指定身份类型

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/open/funcpermission/checkAuthIdByUserTypes

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
| userId | string | 否 | 是 | userId 示例：7e9a7047-bf83-436e-a198-61be32652012 |
| authIds | string | 是 | 是 | authIds 示例：["HRGXFWM140","u8c_GZTACT010"] |
| userType | string | 否 | 是 | userType-身份类型，员工身份为1 示例：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/open/funcpermission/checkAuthIdByUserTypes?access_token=访问令牌
Body: {
	"userId": "7e9a7047-bf83-436e-a198-61be32652012",
	"authIds": [
		"HRGXFWM140",
		"u8c_GZTACT010"
	],
	"userType": "1"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态 示例：200 |
| data | string | 是 | 返回权限数据 示例：["u8c_GZTACT010"] |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		"u8c_GZTACT010"
	],
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

