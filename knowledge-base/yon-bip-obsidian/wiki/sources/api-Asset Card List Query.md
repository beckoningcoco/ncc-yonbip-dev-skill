---
title: "资产卡片列表查询"
apiId: "1701554116021977093"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产卡片列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Asset Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/am/aimequipcard/batchquery

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| showImageType | number |
| 小数位数:0,最大长度:1 | query | 否 | 返回资产图片地址类型，0不需要，1缩略图，2原图    示例: 0 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| page | object | 否 | 是 | 分页 |
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 页数 示例：2 默认值：2 |
| condition | object | 否 | 否 | 查询条件 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| commonVOs | object | 是 | 否 | 查询区查询条件 |

## 3. 请求示例

Url: /yonbip/am/aimequipcard/batchquery?access_token=访问令牌&showImageType=0
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 2
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "pk_usedorg",
				"op": "eq",
				"value1": "1653986425502695431"
			}
		],
		"commonVOs": [
			{
				"itemName": "",
				"value1": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功！ |
| data | object | 否 | 返回数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每条页数 示例：1 |
| recordCount | long | 否 | 记录数 示例：24 |
| recordList | object | 是 | 返回数据 |
| beginPageIndex | long | 否 | 起始页 示例：2 |
| endPageIndex | long | 否 | 结束页 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 24,
		"recordList": [
			{
				"associate_flag": false,
				"bill_status": 0,
				"billmaker": "1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16",
				"billmaker__name": "昵称-郝小侠",
				"billmaketime": "2023-03-10 14:11:11",
				"creationtime": "2023-03-10 14:11:11",
				"creator": "1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16",
				"pk_fiorg": "",
				"creator__name": "昵称-郝小侠",
				"equip_code": "IEAM-20230407-000359",
				"equip_name": "测量点卡片",
				"id": "1677001514566549512",
				"isWfControlled": false,
				"pk_category": "1679146326729162757",
				"pk_category__category_name": "wuhf技术参数删除",
				"pk_mandept": "1653986717560471558",
				"pk_mandept__name": "WUHF固定资产部门",
				"pk_org": "1653986425502695431",
				"pk_org__name": "WUHF固定资产资产",
				"pk_transitype": "1524173469928390745",
				"pk_transitype__name": "资产卡片",
				"pk_used_status": "PRESET01_0000L6VWE12DH6JBPJ0000",
				"pk_used_status__status_name": "在用",
				"pubts": "2023-03-10 14:39:17",
				"source": "origin",
				"source_rent_in": "origin",
				"start_used_date": "2023-04-07",
				"transi_type": "4A00-01",
				"purc_price_tax": 22.2,
				"purc_price": 20,
				"tax": 2.2,
				"begin_date": "2026-01-13",
				"service_month": 12,
				"used_month": 2,
				"origin_value": 5000,
				"accu_dep": 0,
				"new_value": 5000
			}
		],
		"beginPageIndex": 2,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	报错具体提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-22

更新

请求说明

新增

返回参数 (9)

更新

返回参数 (4)

资产卡片列表查询支持用户级


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

