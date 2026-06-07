---
title: "使用权资产变更保存"
apiId: "2454133455330476039"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Right-of-Use Asset Change"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Right-of-Use Asset Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 使用权资产变更保存

> `ContentType	application/json` 请求方式	POST | 分类: Right-of-Use Asset Change (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/FaLeaseChange/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 使用权资产变更信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| oriBillId | string | 否 | 否 | 业务幂等id |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 |
| accentityCode | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 |
| vouchdate | string | 否 | 是 | 单据日期 格式yyyy-MM-DD |
| assetId | string | 否 | 否 | 固定资产id，固定资产id和固定资产编码不能同时为空，id和编码同时存在，以id为准 |
| assetCode | string | 否 | 否 | 固定资产id，固定资产id和固定资产编码不能同时为空，id和编码同时存在，以id为准 |
| discountRate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 年折现率(%) |
| leaseEndDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 止租日期 |
| blnRenewalOption | boolean | 否 | 否 | 执行续租选择权 |
| renewalEndDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 续租截止期 |
| blnPurchaseOption | boolean | 否 | 否 | 执行购买选择权 |
| purchasePrice | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 购买价格 |
| taxItemId | string | 否 | 否 | 税目id,税目id和税目编码不能同时为空，id和编码同时存在，以id为准 |
| taxItemIdCode | string | 否 | 否 | 税目编码,税目id和税目编码不能同时为空，id和编码同时存在，以id为准 |
| taxRate | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 税率 |
| blnTaxDeduction | boolean | 否 | 否 | 税金可抵扣 |
| remarks | object | 否 | 否 | 备注 |
| FaLeaseChangePaymentRuleList | object | 否 | 否 | 使用权资产变更付款规则 |
| FaLeaseChangPaymentPlanList | object | 否 | 否 | 使用权资产变更付款计划 |
| FaLeaseChangeInterestList | object | 否 | 否 | 使用权资产变更利息明细 |

## 3. 请求示例

Url: /yonbip/FCC/FaLeaseChange/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"oriBillId": "",
		"accentity": "",
		"accentityCode": "",
		"vouchdate": "",
		"assetId": "",
		"assetCode": "",
		"discountRate": 0,
		"leaseEndDate": "2026-06-07",
		"blnRenewalOption": true,
		"renewalEndDate": "2026-06-07",
		"blnPurchaseOption": true,
		"purchasePrice": 0,
		"taxItemId": "",
		"taxItemIdCode": "",
		"taxRate": 0,
		"blnTaxDeduction": true,
		"remarks": {
			"zh_CN": ""
		},
		"FaLeaseChangePaymentRuleList": {
			"leasePayment": 0,
			"paymentFrequency": "",
			"startDate": "",
			"endDate": "",
			"paymentDateRef": "",
			"delayDays": 0
		},
		"FaLeaseChangPaymentPlanList": {
			"rentType": "",
			"startDate": "",
			"endDate": "",
			"paymentDate": "",
			"leasePayment": 0,
			"taxAmount": 0,
			"outTaxAmount": 0,
			"blnDiscount": true,
			"discountDays": 0,
			"discountFactor": 0,
			"oriLeaseLiability": 0,
			"leaseLiability": 0
		},
		"FaLeaseChangeInterestList": {
			"startDate": "",
			"endDate": "",
			"beginningLeaseLiability": 0,
			"beginningUnconFinanceCost": 0,
			"leasePayment": 0,
			"interest": 0,
			"accumIntAccrued": 0,
			"endingLeaseLiability": 0,
			"endingUnconFinanceCost": 0
		}
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "200"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

