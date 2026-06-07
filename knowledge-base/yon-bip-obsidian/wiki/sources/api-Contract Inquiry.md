---
title: "合同查询"
apiId: "1674842846828953607"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Register"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Register]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Register (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/apct/openapi/bill/list

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
| billnum | string | 否 | 是 | 单据类型：apct_preapct_list：合同期初，apct_apctmgr_list：合同管理，apct_mypreapct_list：我的期初，apct_myapct_list：合同查询 示例：apct_preapct_list |
| page | object | 否 | 是 | page |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 示例：10 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 |
| condition | object | 否 | 否 | 查询条件 |
| commonVOs | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/znbz/apct/openapi/bill/list?access_token=访问令牌
Body: {
	"billnum": "apct_preapct_list",
	"page": {
		"pageSize": 10,
		"pageIndex": 1
	},
	"condition": {
		"commonVOs": [
			{
				"itemName": "vouchdate",
				"value1": "2024-12-18 00:00:00",
				"value2": "2024-12-20 23:59:59"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | long | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | 数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页条数 示例：20 |
| recordCount | long | 否 | 总数 示例：1 |
| recordList | object | 是 | 列表数据 |
| pageCount | long | 否 | pageCount 示例：1 |
| beginPageIndex | long | 否 | beginPageIndex 示例：1 |
| vouchdate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 单据日期 |
| endPageIndex | long | 否 | endPageIndex 示例：1 |
| traceId | string | 否 | traceId 示例：c333082d5683aaef |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"acctEntityId": "1624391506661998597",
				"acctEntity_name": "北京宅急送快运股份有限公司",
				"id": "1629407976920973317",
				"code": "FKHT0005",
				"businessCode": "",
				"name": "0105001",
				"supplierId": "1628063257021382656",
				"supplierId_name": "三一重工",
				"currencyId_moneyDigit": 2,
				"bustype_name": "通用合同",
				"ctVersion": "1.0",
				"currencyId": "1622745640846491676",
				"currencyId_name": "人民币",
				"beginningFlag": 0,
				"apprSubjectAmt": 0,
				"unapprSubjectAmt": 0,
				"originalTotalAmt": 1000,
				"paidAmt": 0,
				"signOrgId": "1624391506661998597",
				"signOrgId_name": "北京宅急送快运股份有限公司",
				"pubts": "2023-01-05 11:07:36",
				"unapprAmt": 0,
				"createDate": "2023-01-05 00:00:00",
				"ownerId_name": "李书俊",
				"verfitySubjectAmt": 0,
				"originalReceiptAmt": 0,
				"apprAmt": 0,
				"version": "2",
				"bustype": "1622745649436427298",
				"createTime": "2023-01-05 11:07:34",
				"apprPlanRefundAmt": 0,
				"status": 6665,
				"apctownersub": [
					{
						"ctId": "1629407976920973317",
						"id": "1629407976920973320",
						"pubts": "2023-01-05 11:07:35",
						"ownerId": "1624393267588628488",
						"ownerId_name": "李书俊"
					}
				]
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"vouchdate": "2026-06-07 12:01:28",
		"endPageIndex": 1
	},
	"traceId": "c333082d5683aaef",
	"displayCode": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

