---
title: "保存用户角色"
apiId: "1668725129753395207"
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

# 保存用户角色

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/role/saveUserRole

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| userId | string | 否 | 是 | 友户通用户Id、 示例：031bbe2a-5633-4561-96b6-ef5755669f34 |
| roleId | string | 否 | 否 | 角色Id（角色Id与角色编码二选一必填） 示例：045064e7-a6f6-44e7-aabd-d29a8e307040 |
| roleCode | string | 否 | 否 | 角色编码（角色Id与角色编码二选一必填） 示例：123 |
| userType | string | 否 | 是 | 身份类型（1:普通员工,2:客户管理员,3:客户业务员,4:商家管理员,5:商家业务员,6:外部参会人,7:供应商,11:开发者,30:其他外部人员） 示例：1 |
| systemCode | string | 否 | 否 | 系统编码 示例：diwork 默认值：diwork |
| begindate | string | 否 | 否 | 用户角色授权生效时间 示例：2023-11-14 |
| enddate | string | 否 | 否 | 用户角色授权失效时间 示例：2045-11-14 |

## 3. 请求示例

Url: /yonbip/digitalModel/role/saveUserRole?access_token=访问令牌
Body: {
	"userId": "031bbe2a-5633-4561-96b6-ef5755669f34",
	"roleId": "045064e7-a6f6-44e7-aabd-d29a8e307040",
	"roleCode": "123",
	"userType": "1",
	"systemCode": "diwork",
	"begindate": "2023-11-14",
	"enddate": "2045-11-14"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示 示例：success |
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

000-554-110010

上下文读取友户通租户Id失败！


## 7. 错误返回码


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

