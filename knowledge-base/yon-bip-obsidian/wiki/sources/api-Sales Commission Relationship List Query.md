---
title: "销售委托关系列表查询"
apiId: "39f7754d441844328a714704926aec91"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售委托关系列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/salesDelegate/list

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
| pageIndex | string | 否 | 是 | 当前页数 示例：1 |
| pageSize | string | 否 | 是 | 每页数量 示例：20 |
| salesOrg | string | 否 | 否 | 销售组织 示例：2148246259470592 |
| salesOrgCode | string | 否 | 否 | 销售组织编码 示例：ee |
| inventoryOrg | string | 否 | 否 | 库存组织 示例：2173731750269440 |
| inventoryOrgCode | string | 否 | 否 | 库存组织编码 示例：rrr |
| billingOrg | string | 否 | 否 | 开票组织 示例：2148051396645120 |
| billingOrgCode | string | 否 | 否 | 开票组织编码 示例：yyy |

## 3. 请求示例

Url: /yonbip/digitalModel/salesDelegate/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "20",
	"salesOrg": "2148246259470592",
	"salesOrgCode": "ee",
	"inventoryOrg": "2173731750269440",
	"inventoryOrgCode": "rrr",
	"billingOrg": "2148051396645120",
	"billingOrgCode": "yyy"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 响应码 示例：200 |
| message | string | 否 | 响应内容 示例：操作成功 |
| data | object | 否 | 响应数据 |
| pageIndex | long | 否 | 当前页码 示例：1 |
| pageSize | long | 否 | 每页数量 示例：20 |
| recordCount | long | 否 | 总数 示例：0 |
| recordList | object | 是 | 数据集合 |
| pageCount | long | 否 | 本页数量 示例：0 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| endPageIndex | long | 否 | 结束页数 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"billing_org_name": "维维公司1",
				"isDefault": 0,
				"billing_org": "2148051396645120",
				"enable": 2,
				"sales_org_name": "春风5",
				"inventory_org": "2173731750269440",
				"inventory_org_name": "Z销售部",
				"sales_org": "2148246259470592",
				"id": "2352290713604352",
				"pubts": "2021-07-20 17:28:11"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

999	服务端逻辑异常


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

