---
title: "仓库详情分页查询V5"
apiId: "2173512661716697092"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Warehouse"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Warehouse]
platform_version: "BIP"
source_type: community-api-docs
---

# 仓库详情分页查询V5

> `ContentType	application/json` 请求方式	POST | 分类: Warehouse (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/warehouse/batchQueryDetail

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页大小 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 |
| ids | string | 是 | 否 | 主键id集合 示例：["2211575684096589833","2211575684096589834"] |
| code | string | 否 | 否 | 编码 |
| name | string | 否 | 否 | 名称 |
| stocks.org_code | string | 否 | 否 | 库存组织编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/warehouse/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"startTs": "2026-06-07 11:46:38",
	"endTs": "2026-06-07 11:46:38",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "",
	"name": "",
	"stocks.org_code": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每行页数 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 |
| recordList | object | 是 | 处理数据 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"pubts": "2026-06-07 11:46:38",
				"modifyTime": "",
				"latitude": 0,
				"isGoodsPosition": true,
				"bWMS": true,
				"eStore": true,
				"linkman": "",
				"operator___name": "",
				"operator___code": "",
				"operator": "",
				"bMRP": true,
				"code": "",
				"modifyDate": "",
				"longitude": 0,
				"department": "",
				"department___code": "",
				"department___name": "",
				"ownerorg___name": "",
				"ownerorg___code": "",
				"ownerorg": "",
				"regionCode": "",
				"name": "",
				"modifier": "",
				"iUsed": "",
				"id": 0,
				"phone": "",
				"iSerialManage": true,
				"createDate": "",
				"wStore": true,
				"creator": "",
				"isInvertedScour": true,
				"org___name": "",
				"org": "",
				"org___code": "",
				"isWasteWarehouse": true,
				"isCarSales": true,
				"countCost": true,
				"country": "",
				"country___code": "",
				"country___name": "",
				"isConsignment": true,
				"consignmentCustomer": 0,
				"consignmentCustomer___code": "",
				"consignmentCustomer___name": "",
				"isPDAStorage": true
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-05

更新

请求说明

新增

请求参数 stocks.org_code

更新

返回参数 defineCharacter

2	2025-06-30

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

