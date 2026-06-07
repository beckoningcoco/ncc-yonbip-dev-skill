---
title: "固定资产处置详情查询"
apiId: "1815710927955165193"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Disposal"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Disposal]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产处置详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Disposal (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/DisposalBill/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 否 | 单据id    示例: 1812121683913342977 |
| busiObj | string | query | 否 | 业务对象    示例: DisposalBill    默认值: DisposalBill |
| serviceCode | string | query | 否 | 服务编码    示例: serviceCode    默认值: fixedasset0007new |
| billnum | string | query | 否 | 单据编码    示例: at_disposalbill    默认值: at_disposalbill |

## 3. 请求示例

Url: /yonbip/EFI/DisposalBill/detail?access_token=访问令牌&id=1812121683913342977&busiObj=DisposalBill&serviceCode=serviceCode&billnum=at_disposalbill

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
| bodies | object | 是 | 查询结果集 |
| verifystate | int | 否 | 过账状态 示例：2 |
| code | string | 否 | 处置单编码 示例：DP002503 |
| disposalType | int | 否 | 处置类型 示例：1 |
| auditor_name | string | 否 | 审核人 示例：昵称-Ian |
| busiPostFailureReason | string | 否 | 过账失败原因 |
| accentity_name | string | 否 | 会计主体名称 示例：测试使用权1 |
| accentity | string | 否 | 会计主体id 示例：1796677711656648705 |
| vouchdate | string | 否 | 处置日期 示例：2023-09-08 |
| busiPostStatus | string | 否 | 过账状态 示例：2 |
| accbookList | string | 否 | 账薄id集合 示例：222 |
| id | string | 否 | 处置单id 示例：111 |
| pubts | string | 否 | 时间戳 示例：2023-09-08 15:38:58 |
| billTypeId | string | 否 | 单据类型id 示例：HSFWGDZCYY3EFA |
| creator | string | 否 | 创建人 示例：15fa85d8-13af-4fc6-9f9d-8f73f03f497f |
| auditor | string | 否 | 审核人 示例：15fa85d8-13af-4fc6-9f9d-8f73f03f497f |
| billTradeTypeId | string | 否 | 交易类型id 示例：1795048785173282916 |
| accbookName | string | 否 | 账薄名称 示例：第一 |
| accentity_code | string | 否 | 会计主体编码 示例：010 |
| createTime | string | 否 | 创建时间 示例：2023-09-08 15:38:58 |
| auditTime | string | 否 | 审核时间 示例：2023-09-08 15:38:58 |
| creator_name | string | 否 | 创建人 示例：昵称-Ian |
| remarks | object | 否 | 备注 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"errorDetail": "",
	"total": 1,
	"data": {
		"bodies": [
			{
				"disposalOriValue": 2000,
				"cleanCostAmount": 0,
				"deprConvention_deprName": "当月计提",
				"accRateTypeId": "0000LLDEYOZQHA5RER0000",
				"disposalAmount": 0,
				"oriCurrtypeId_name": "人民币",
				"deprMethodId": "1796029042754322539",
				"discription": {
					"en_US": "",
					"zh_CN": ""
				},
				"beforeCurYearImpAmount": 100,
				"accbookSuperDepr": true,
				"disposalConvention_deprName": "次月计提",
				"assetId_name": "1234",
				"busiPostFailureReason": "",
				"orgCleanCostAmount": 0,
				"disposalNetAmount": 100,
				"accentity_name": "测试使用权1",
				"reduceWayId_code": "01",
				"accentity": 1796677711656648705,
				"beforeDisposalDepr": 1000,
				"accbook_name": "第一",
				"lifeMonth": 0,
				"fcOriValue": 10000,
				"gainLossAmount": 16,
				"assetCategoryId": "1796029042754322546",
				"orgBeCurrYearDeprAmount": 100,
				"disposalYearDeprAmount": 100,
				"breduceDate": "2022-01-01",
				"id": "1812121683913342977",
				"accRateTypeId_code": "01",
				"accRateTypeId_name": "基准汇率",
				"periodId_code": "2022-01",
				"orgBeAccumDeprAmount": 122,
				"billTradeTypeId": "1795048785173282916",
				"orgBeImpairmentAmount": 111,
				"beforeDisposalOriValue": 111,
				"accRateTypeId_digit": 5,
				"verifyState": 2,
				"accAdjustDeprAmount": 100,
				"disposalBillId": "1111",
				"beforeImpairmentAmount": 111,
				"resetStatus": "2",
				"auditTime": "2023-09-08 15:38:58",
				"name": "1234",
				"inputValueAddedTax": 111,
				"becategorycode_name": "房屋及建筑物.职工宿舍",
				"cleanIncomeAmount": 111,
				"accbookCurrtypeId": "1795048836713414690",
				"orgCleanIncomeAmount": 123,
				"usageStateId_name": "在用",
				"accbookCurrtypeId_name": "人民币",
				"beforeScrapValue": 111,
				"code": "DP002503",
				"disposalType": 1,
				"reduceWayId_name": "出售",
				"auditor_name": "昵称-Ian",
				"assetId_code": "0201002522",
				"oriCurrtypeId_id": "1795048836713414690",
				"orgTaxAmount": 11,
				"disposalNetValue": 333,
				"vouchdate": "2023-09-08",
				"calculateId_accbook": "1796686164160675863",
				"disposalImpairmentAmount": 111,
				"disposalConvention_code": "02",
				"busiPostStatus": "1",
				"accbookList": "1796686164160675863",
				"assetId": "111",
				"disposalConvention_name": "次月计提",
				"pubts": "2023-09-08 15:39:04",
				"beforeNetAmount": 111,
				"billTypeId": "HSFWGDZCYY3EFA",
				"scrapValue": 111,
				"disposalConvention": "1796029051344257025",
				"scrapValueRate": 0.5,
				"outputValueAddedTax": 111,
				"periodId": "1796029051344257025",
				"creator": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
				"accbookCurrtypeId_moneyDigit": 6,
				"accbookCurrtypeId_priceDigit": 8,
				"orgCleanIncomeTaxAmount": 111,
				"isDisposalcurdepr": 111,
				"disposalRate": 0.5,
				"auditor": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
				"accbookName": "第一",
				"scrapValueType": "0",
				"beforeDisposalAmount": 1,
				"lifeYear": "2",
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
				"accbook_code": "010",
				"disposalCurYearImpAmount": 1111,
				"deprMethodId_name": "直线法（一）",
				"cleanIncomeTaxAmount": 11,
				"creator_name": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
				"remarks": {
					"en_US": "",
					"zh_CN": ""
				}
			}
		],
		"verifystate": 2,
		"code": "DP002503",
		"disposalType": 1,
		"auditor_name": "昵称-Ian",
		"busiPostFailureReason": "",
		"accentity_name": "测试使用权1",
		"accentity": "1796677711656648705",
		"vouchdate": "2023-09-08",
		"busiPostStatus": "2",
		"accbookList": "222",
		"id": "111",
		"pubts": "2023-09-08 15:38:58",
		"billTypeId": "HSFWGDZCYY3EFA",
		"creator": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
		"auditor": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
		"billTradeTypeId": "1795048785173282916",
		"accbookName": "第一",
		"accentity_code": "010",
		"createTime": "2023-09-08 15:38:58",
		"auditTime": "2023-09-08 15:38:58",
		"creator_name": "昵称-Ian",
		"remarks": {
			"en_US": "",
			"zh_CN": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310036	非法token


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-20

更新

请求说明

更新

请求参数 serviceCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

