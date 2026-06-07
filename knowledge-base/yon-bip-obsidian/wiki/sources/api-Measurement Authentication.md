---
title: "计量鉴权"
apiId: "2028079004688318472"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tenant Metering"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tenant Metering]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量鉴权

> `ContentType	application/json` 请求方式	POST | 分类: Tenant Metering (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/iuap-apcom-workbench/manager/license/validateByService

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
| tenantId | string | 否 | 是 | 租户id 示例：0000LXSN26GB2LV4750000 |
| userId | string | 否 | 是 | 友户通用户id 示例：ab3143a1-9b04-45e1-90ae-07e19f1ff6aa |
| code | string | 否 | 是 | 服务编码 示例：serviceCode |

## 3. 请求示例

Url: /yonbip/digitalModel/iuap-apcom-workbench/manager/license/validateByService?access_token=访问令牌
Body: {
	"tenantId": "0000LXSN26GB2LV4750000",
	"userId": "ab3143a1-9b04-45e1-90ae-07e19f1ff6aa",
	"code": "serviceCode"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| status | string | 否 | 状态 示例：1 |
| data | object | 否 | 计量信息 示例：{ "status": "VALID", "msg": "success,ppm0000064628ppm0000064628,standard:11111M_new,service:ed_workcenter_list,0000LM07U2N6C3P1QC0000", "valid": true } |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": "1",
		"data": {
			"status": "VALID",
			"msg": " \"success",
			"standard": "11111M_new",
			"service": "ed_workcenter_list",
			"valid": true
		},
		"displayCode": "000-545-100001",
		"level": 0
	}
}

## 6. 业务异常码

000-555-411004

参数异常


## 7. 错误返回码

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level

新增

错误码 999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

