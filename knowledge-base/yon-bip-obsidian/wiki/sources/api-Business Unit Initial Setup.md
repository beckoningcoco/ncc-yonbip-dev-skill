---
title: "业务单元期初设置"
apiId: "1774291508874706975"
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

# 业务单元期初设置

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/orgBpConfig/save

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
| data | object | 否 | 否 | 数据集合 |
| org_bpConflist | object | 是 | 否 | 期初数据 |
| externalData | object | 否 | 否 | 扩展值集合 |
| orgid | string | 否 | 否 | 业务单元id,与orgid_code两项中必须输入一项，当两项都输入时，以orgid为准 示例：1529503532824657922 |
| orgid_code | string | 否 | 否 | 业务单元编码,与orgid两项中必须输入一项，当两项都输入时，以orgid为准 示例：cccc |

## 3. 请求示例

Url: /yonbip/digitalModel/orgBpConfig/save?access_token=访问令牌
Body: {
	"data": {
		"org_bpConflist": [
			{
				"type_code": "cashManagement",
				"periodid": "xxxxxxx",
				"periodid_code": "2021-03",
				"id": "1773679871065587722"
			}
		]
	},
	"externalData": {
		"orgid": "1529503532824657922",
		"orgid_code": "cccc"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-100014

不存在期初编码为【%s】的数据，请检查


## 7. 错误返回码

999	服务器错误	服务器错误


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

