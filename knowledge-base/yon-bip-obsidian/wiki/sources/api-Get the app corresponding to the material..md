---
title: "获取物料对应的应用"
apiId: "2028071316696858628"
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

# 获取物料对应的应用

> `ContentType	application/json` 请求方式	POST | 分类: Tenant Metering (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/getAppCodesByPPMs

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
| ppmCodes | string | 否 | 是 | 物料编码集合使用英文逗号分隔 示例：ppm000012345,ppm000011111 |

## 3. 请求示例

Url: /yonbip/digitalModel/getAppCodesByPPMs?access_token=访问令牌
Body: {
	"ppmCodes": "ppm000012345,ppm000011111"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| status | string | 否 | 状态 示例：1 |
| data | object | 否 | 物料编码和应用编码的对照 示例：{ "ppm0000064505": [ "BCD", "GZTBDM", "SCCS", "ST", "YBMBCD", "YBMINV", "__MM_workbench_group__", "__SCMSD_workbench_group__" ] } |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"status": "1",
	"data": {
		"\"ppm0000064505\"": [
			"BCD",
			"GZTBDM",
			"SCCS",
			"ST",
			"YBMBCD",
			"YBMINV",
			"__MM_workbench_group__",
			"__SCMSD_workbench_group__"
		]
	},
	"displayCode": "000-545-100001",
	"level": 0
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

