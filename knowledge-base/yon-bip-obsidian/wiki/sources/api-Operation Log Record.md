---
title: "操作日志记录"
apiId: "4a55470eff22464fa6431000848f0766"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Audit Log - Operation Log"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Audit Log - Operation Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 操作日志记录

> `ContentType	application/json` 请求方式	POST | 分类: Audit Log - Operation Log (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/log-pub/openapi/rest/operation

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
| serviceCode | string | 否 | 是 | 工作台服务code 示例：GZTLOG020 |
| ip | string | 否 | 是 | IP 示例：192.168.1.1 |
| button | string | 否 | 是 | open insert delete update 参考com.yonyou.iuap.log.cons.OperCodeTypes 示例：open |
| device | int | 否 | 是 | 设备 1 web 2 android 3 client 4 ios 示例：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/log-pub/openapi/rest/operation?access_token=访问令牌
Body: {
	"serviceCode": "GZTLOG020",
	"ip": "192.168.1.1",
	"button": "open",
	"device": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 200 成功 示例：200 |
| message | string | 否 | 信息 示例：success |
| data | object | 否 | 数据 |
| displayCode | string | 否 | 异常码 |
| level | string | 否 | 异常等级 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {},
	"displayCode": "",
	"level": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code	403	状态值

message	invalided yht_access_token

data	{}


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

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

