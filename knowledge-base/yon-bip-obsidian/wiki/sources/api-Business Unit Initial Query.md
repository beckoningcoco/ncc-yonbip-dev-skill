---
title: "业务单元期初查询"
apiId: "1775003373950992384"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元期初查询

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/orgBpConfig/list

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
| externalData | object | 否 | 否 | 入参数据 |
| orgid_code | string | 否 | 否 | 业务单元编码,与orgid两项中必须输入一项，如果都输入时，以orgid为准 示例：0001 |
| orgid | string | 否 | 否 | 业务单元id,与orgid_code两项中必须输入一项，如果都输入时，以orgid为准 示例：12314123132 |

## 3. 请求示例

Url: /yonbip/digitalModel/orgBpConfig/list?access_token=访问令牌
Body: {
	"externalData": {
		"orgid_code": "0001",
		"orgid": "12314123132"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 返回数据集合 |
| periodid | string | 否 | 期间id 示例：1700598958121287696 |
| periodid_enddate | string | 否 | 期间结束时间 示例：2021-08-31 00:00:00 |
| enable | long | 否 | 启用状态 1-启用；2停用 示例：1 |
| type_code_name | string | 否 | 期初名称 示例：现金管理 |
| id | string | 否 | 期初id 示例：1774370759435616264 |
| pubts | string | 否 | 时间戳 示例：2023-07-19 19:14:48 |
| periodid_name | string | 否 | 期间名称 示例：2021-08 |
| type_code_isperiod | long | 否 | 是否期间 1-是；2-不是 示例：1 |
| orgid | string | 否 | 组织id 示例：1529211071325798405 |
| type_code | string | 否 | 期初编码 示例：cashManagement |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"periodid": "1700598958121287696",
			"periodid_enddate": "2021-08-31 00:00:00",
			"enable": 1,
			"type_code_name": "现金管理",
			"id": "1774370759435616264",
			"pubts": "2023-07-19 19:14:48",
			"periodid_name": "2021-08",
			"type_code_isperiod": 1,
			"orgid": "1529211071325798405",
			"type_code": "cashManagement"
		}
	],
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000512

查询数据为空


## 7. 错误返回码

999	服务端逻辑错误	服务端逻辑错误


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

