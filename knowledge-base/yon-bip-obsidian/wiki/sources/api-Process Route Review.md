---
title: "工艺路线审核"
apiId: "2e15cbe6fc104cc88a98bad007fa27a7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Routing"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Routing]
platform_version: "BIP"
source_type: community-api-docs
---

# 工艺路线审核

> `ContentType	application/json` 请求方式	POST | 分类: Routing (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/routing/audit

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
| data | object | 否 | 是 | 业务数据 |
| id | long | 否 | 否 | 工艺路线id,工艺路线id和工艺路线编码不能同时为空，id和编码同时存在，以id为准 示例：2209168982298880 |
| code | string | 否 | 否 | 工艺路线编码,工艺路线id和工艺路线编码不能同时为空，id和编码同时存在，以id为准 示例：xxx |

## 3. 请求示例

Url: /yonbip/mfg/routing/audit?access_token=访问令牌
Body: {
	"data": {
		"id": 2209168982298880,
		"code": "xxx"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| name | string | 否 | 工艺路线名称 示例：xxx |
| code | string | 否 | 单据编码 示例：51013 |
| isWfControlled | boolean | 否 | 是否审批流控制:true-是,false-否 示例：false |
| returncount | long | 否 | 退回次数 示例：0 |
| id | long | 否 | 单据id 示例：2209168982298880 |
| pubts | string | 否 | 时间戳 示例：2021-06-01 05:37:10 |
| status | long | 否 | 单据状态: 0-开立, 1-已审核, 3-审核中 示例：1 |
| verifystate | long | 否 | 审批状态：-1-驳回,0-开立，1-审批中，2-审核 示例：2 |
| auditor | string | 否 | 审核人 示例：19998888888 |
| auditorId | long | 否 | 审核人id 示例：1452977546072320 |
| auditTime | string | 否 | 审核时间 示例：2021-05-31 16:37:10 |
| auditDate | string | 否 | 审核日期 示例：2021-05-31 00:00:00 |
| rollup | long | 否 | 默认卷积，0：否，1：是 |
| tenant | long | 否 | 租户id 示例：1452977542353152 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"name": "xxx",
		"code": "51013",
		"isWfControlled": false,
		"returncount": 0,
		"id": 2209168982298880,
		"pubts": "2021-06-01 05:37:10",
		"status": 1,
		"verifystate": 2,
		"auditor": "19998888888",
		"auditorId": 1452977546072320,
		"auditTime": "2021-05-31 16:37:10",
		"auditDate": "2021-05-31 00:00:00",
		"rollup": 0,
		"tenant": 1452977542353152
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

