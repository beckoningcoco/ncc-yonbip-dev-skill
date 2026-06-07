---
title: "组织上级批量查询"
apiId: "1509196979093110786"
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

# 组织上级批量查询

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/querySuperiorOrgInfos

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
| funcType | string | 否 | 是 | 职能类型，树形结构的职能有 adminorg-人力职能；financeorg-会计主体；salesorg-销售组织；orgunit-业务单元 示例：adminorg |
| ids | string | 是 | 否 | 多个主键，主键+编码最多支持300，id与code至少输入一条 |
| codes | string | 是 | 否 | 多个编码，主键+编码最多支持300，id与code至少输入一条 示例：["333414"] |
| enable | long | 是 | 否 | 状态 0-未启用；1-启用；2-停用，默认查询启用状态 示例：[1,2] |
| includeCurrent | boolean | 否 | 否 | 是否包含当前节点,true-包含；false-不包含 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/digitalModel/querySuperiorOrgInfos?access_token=访问令牌
Body: {
	"funcType": "adminorg",
	"ids": [
		""
	],
	"codes": [
		"333414"
	],
	"enable": [
		1,
		2
	],
	"includeCurrent": false
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| 1489238970334707713 | object | 是 | 查询各组织的数据集合，使用组织id标识，组织id |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"1489238970334707713": [
			{
				"is_biz_unit": 1,
				"id": "2524597916718080",
				"code": "111901g",
				"name": "11190g",
				"shortname": "1119015511112",
				"orgtype": 1,
				"enable": 1,
				"effectivedate": "2022-06-28 16:53:51",
				"expirationdate": "2099-12-31 00:00:00",
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"creationtime": "2021-11-19 10:33:49",
				"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"modifiedtime": "2022-07-01 10:01:00",
				"companytype": "45ebda24614f424abe5dfb04e00f737c",
				"displayorder": 0,
				"parentid": "2366043600277760",
				"principal": "2366043600277760",
				"branchleader": "2524597916718080",
				"exchangerate": "2060492943889152"
			}
		]
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000524

需要查询的当前组织为空，请检查输入的codes/ids

000-545-000525

参数不能为空:

000-545-000523

最多支持300个主键

000-545-100013

数据错误,内部码为空, id:


## 7. 错误返回码

999	需要查询的当前组织为空，请检查输入的codes/ids	输入正确的codes


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

