---
title: "销售委托关系数据同步"
apiId: "6e647c74d1b04034b01acbb768dd632c"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售委托关系数据同步

> `ContentType	application/json` 请求方式	GET | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/saledelegate/qrydelegate

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| sales_org | string | query | 否 | 销售组织    示例: 1293432671916288 |
| inventory_org | string | query | 否 | 库存组织    示例: 1293328592015616 |
| billing_org | string | query | 否 | 开票组织    示例: 1293328592015616 |
| pubts | string | query | 否 | 时间戳(返回大于等于当前值的数据)    示例: 2019-12-03 10:48:47 |
| pageSize | string | query | 否 | 当前页大小    示例: 10 |
| pageIndex | string | query | 否 | 当前页数    示例: 1 |

## 3. 请求示例

Url: /yonbip/digitalModel/saledelegate/qrydelegate?access_token=访问令牌&sales_org=1293432671916288&inventory_org=1293328592015616&billing_org=1293328592015616&pubts=2019-12-03%2010%3A48%3A47&pageSize=10&pageIndex=1

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据集合 |
| pageIndex | int | 否 | 当前页数 示例：0 |
| pageSize | int | 否 | 每页行数 示例：0 |
| recordCount | int | 否 | 总数 示例：1 |
| recordList | object | 是 | 数据列表 |
| pageCount | int | 否 | 总页数 示例：0 |
| beginPageIndex | int | 否 | 开始页码（第一页） 示例：0 |
| endPageIndex | int | 否 | 结束页码（有多少页） 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 1,
		"recordList": [
			{
				"billingOrg": "1187465800962304",
				"inventoryOrg": "03b1bbbccb524f879bee9f59a4cf84c1",
				"inventoryOrg_name": "CS工厂",
				"isDefault": 0,
				"enable": 1,
				"billingOrg_name": "ID2",
				"salesOrg": "1000001",
				"salesOrg_name": "组织ER",
				"id": "1295051389980928",
				"dr": 0,
				"pubts": "2019-07-10 11:15:44"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000512

查询数据为空


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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

