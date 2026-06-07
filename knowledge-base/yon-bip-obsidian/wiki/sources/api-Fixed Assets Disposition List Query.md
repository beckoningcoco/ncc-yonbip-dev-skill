---
title: "固定资产处置列表查询"
apiId: "1815332034530246661"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Disposal"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Disposal]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产处置列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Disposal (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/DisposalBill/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageSize | long | 否 | 是 | 每页记录数 示例：10 默认值：10 |
| pageIndex | long | 否 | 是 | 页码 示例：1 默认值：1 |
| isSum | boolean | 否 | 否 | 表头-true,表头明细-false 示例：true 默认值：true |

## 3. 请求示例

Url: /yonbip/EFI/DisposalBill/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"isSum": true
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| errorDetail | string | 否 | 错误信息 |
| total | long | 否 | 总条数 示例：1 |
| data | object | 否 | 返回固定资产处置信息 |
| pageIndex | long | 否 | 当前页码 示例：1 |
| pageSize | long | 否 | 每页查询数据大小，限制500 示例：10 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"errorDetail": "",
	"total": 1,
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"disposalOriValue": 2000,
				"cleanCostAmount": 0,
				"busiPostFailureReason": "",
				"bodies_orgCleanCostAmount": 0,
				"accentity_name": "测试使用权1",
				"accentity": 1796677711656648705,
				"disposalAmount": 0,
				"oriCurrtypeId_name": "人民币",
				"beforeDisposalDepr": 1000,
				"accbook_name": "第一",
				"gainLossAmount": 16,
				"disposalYearDeprAmount": 100,
				"breduceDate": "2022-01-01",
				"id": "1812121683913342977",
				"bodies_accRateTypeId_code": "01",
				"bodies_accRateTypeId_name": "基准汇率",
				"bodies_disposalNetAmount": 100,
				"periodId_code": "2022-01",
				"bodies_orgBeAccumDeprAmount": 122,
				"billTradeTypeId": "1795048785173282916",
				"bodies_orgBeImpairmentAmount": 111,
				"bodies_beforeDisposalOriValue": 111,
				"accRateTypeId_digit": 5,
				"verifyState": 2,
				"bodies_accRateTypeId": "0000LLDEYOZQHA5RER0000",
				"accAdjustDeprAmount": 100,
				"beforeImpairmentAmount": 111,
				"auditTime": "2023-09-08 15:38:58",
				"name": "1234",
				"inputValueAddedTax": 111,
				"cleanIncomeAmount": 111,
				"accbookCurrtypeId": "1795048836713414690",
				"bodies_orgCleanIncomeAmount": 123,
				"accbookCurrtypeId_name": "人民币",
				"beforeScrapValue": 111,
				"code": "DP002503",
				"disposalType": 1,
				"reduceWayId_name": "出售",
				"auditor_name": "昵称-Ian",
				"assetId_code": "0201002522",
				"oriCurrtypeId_id": "1795048836713414690",
				"bodies_orgTaxAmount": 11,
				"bodies_id": "1812121701093212163",
				"bodies_disposalNetValue": 333,
				"vouchdate": "2023-09-08",
				"bodies_calculateId_accbook": "1796686164160675863",
				"disposalImpairmentAmount": 111,
				"busiPostStatus": "1",
				"accbookList": "1796686164160675863",
				"assetId": "111",
				"disposalConvention_name": "次月计提",
				"pubts": "2023-09-08 15:39:04",
				"bodies_beforeNetAmount": 111,
				"billTypeId": "HSFWGDZCYY3EFA",
				"scrapValue": 111,
				"disposalConvention": "1796029051344257025",
				"outputValueAddedTax": 111,
				"periodId": "1796029051344257025",
				"creator": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
				"accbookCurrtypeId_moneyDigit": 6,
				"accbookCurrtypeId_priceDigit": 8,
				"bodies_orgCleanIncomeTaxAmount": 111,
				"isDisposalcurdepr": 111,
				"auditor": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
				"accbookName": "第一",
				"beforeDisposalAmount": 1,
				"disposalDepreciation": 11,
				"beforeYearDeprAmount": 11,
				"bodies_beforeNetValue": 11,
				"oriCurrtypeId_moneyDigit": 6,
				"oriCurrtypeId_code": "CNY",
				"reduceWayId": "1795048810950950939",
				"createTime": "2023-09-08 15:38:07",
				"oriCurrtypeId_priceDigit": 6,
				"bodiesid": "111",
				"oriCurrtypeId": "1795048836713414690",
				"cleanIncomeTaxAmount": 11,
				"creator_name": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
				"remarks": {
					"en_US": "",
					"zh_CN": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310036	非法token


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

