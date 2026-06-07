---
title: "应付事务详情查询"
apiId: "2241995554485698563"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "A/P Transaction"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/P Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付事务详情查询

> `ContentType	application/json` 请求方式	GET | 分类: A/P Transaction (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/apPublicEvent/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 事务id    示例: 2241964699533705222 |

## 3. 请求示例

Url: /yonbip/EFI/apPublicEvent/detail?access_token=访问令牌&id=2241964699533705222

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回应付事务信息 |
| oriCurrency | string | 否 | 原币id 示例：1939062405854658600 |
| accConvertParam | string | 否 | 账簿币折算参数 示例：1 |
| financeOrg | string | 否 | 会计主体id 示例：1994100564922728450 |
| gblCurrency | string | 否 | 全局本币id 示例：1939062405854658612 |
| voucher | string | 否 | 凭证 示例：~ |
| oriOcupyAmount | number |
| 小数位数:0,最大长度:10 | 否 | 预占用金额 示例：0 |
| objectType | string | 否 | 往来对象类型 示例：0 |
| accAmount | number |
| 小数位数:0,最大长度:10 | 否 | 本币金额 示例：1000 |
| bizBillId | string | 否 | 业务单据ID 示例：2241964519143505924 |
| gblBalance | number |
| 小数位数:0,最大长度:10 | 否 | 全局币余额 示例：8000 |
| supplier | string | 否 | 供应商id 示例：1941101458764070916 |
| srcBillDate | string | 否 | 来源单据日期 示例：2025-04-09 |
| accCurrency | string | 否 | 账簿本币id 示例：1939062405854658600 |
| orgCurrency | string | 否 | 组织本币id 示例：1939062405854658600 |
| id | string | 否 | id 示例：2241964699533705222 |
| grpConvertParam | string | 否 | 集团币折算参数 示例：3 |
| oriAmount | number |
| 小数位数:0,最大长度:10 | 否 | 金额 示例：1000 |
| bodyItem | object | 是 | 表体信息 |
| eventType | string | 否 | 会计事务 示例：2740066088296704 |
| srcApp | string | 否 | 来源应用 示例：94 |
| srcBillType | string | 否 | 业务事项 示例：2614247099060992 |
| accPurpose | string | 否 | 核算目的 示例：1939062405859377459 |
| gblConvertParam | string | 否 | 全局币折算参数 示例：3 |
| entry | string | 否 | 事项分录 示例：~ |
| orgBalance | number |
| 小数位数:0,最大长度:10 | 否 | 组织币余额 示例：1000 |
| accBook | string | 否 | 账簿id 示例：2123093259064442889 |
| auditTime | string | 否 | 审批日期 示例：2025-04-09 19:43:57 |
| grpAmount | number |
| 小数位数:0,最大长度:10 | 否 | 集团币金额 示例：1000 |
| oriBalance | number |
| 小数位数:0,最大长度:10 | 否 | 余额 示例：1000 |
| srcSystem | string | 否 | 来源系统 示例：1 |
| bizBillType | string | 否 | 业务单据类型 示例：2614247099060992 |
| grpBalance | number |
| 小数位数:0,最大长度:10 | 否 | 集团币余额 示例：1000 |
| status | string | 否 | 事务状态 示例：1 |
| blnEffect | string | 否 | 生效状态 示例：1 |
| code | string | 否 | 事务编号 示例：AP0601250409000003 |
| writeOffState | string | 否 | 冲销状态 示例：0 |
| bizTradeType | string | 否 | 业务单据交易类型 示例：1939062405866194507 |
| accPeriodCode | string | 否 | 会计期间 示例：2025-04 |
| gblAmount | number |
| 小数位数:0,最大长度:10 | 否 | 全局币金额 示例：8000 |
| srcBillCode | string | 否 | 来源单据编号 示例：OAPap250409024097 |
| grpCurrency | string | 否 | 集团本币 示例：1939062405854658600 |
| orgConvertParam | string | 否 | 组织币折算参数 示例：1 |
| creator | string | 否 | 创建人 示例：8ebf818b-d271-43d9-992e-2fcf1e56d553 |
| bizBillCode | string | 否 | 业务单据编号 示例：OAPap250409024097 |
| org | string | 否 | 业务组织 示例：1994100564922728450 |
| voucherType | string | 否 | 凭证类型 示例：~ |
| arapEventType | string | 否 | 收付会计事务 示例：313 |
| postState | string | 否 | 过账状态 示例：2 |
| auditor | string | 否 | 审批人 示例：8ebf818b-d271-43d9-992e-2fcf1e56d553 |
| balanceState | string | 否 | 清账状态 示例：0 |
| orgAmount | number |
| 小数位数:0,最大长度:10 | 否 | 组织币金额 示例：1000 |
| accDate | string | 否 | 记账日期 示例：2025-04-09 |
| createTime | string | 否 | 创建时间 示例：2025-04-09 19:44:02 |
| accBalance | number |
| 小数位数:0,最大长度:10 | 否 | 本币余额 示例：1000 |
| remarks | string | 否 | 备注 示例：1234567 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"oriCurrency": "1939062405854658600",
		"accConvertParam": "1",
		"financeOrg": "1994100564922728450",
		"gblCurrency": "1939062405854658612",
		"voucher": "~",
		"oriOcupyAmount": 0,
		"objectType": "0",
		"accAmount": 1000,
		"bizBillId": "2241964519143505924",
		"gblBalance": 8000,
		"supplier": "1941101458764070916",
		"srcBillDate": "2025-04-09",
		"accCurrency": "1939062405854658600",
		"orgCurrency": "1939062405854658600",
		"id": "2241964699533705222",
		"grpConvertParam": "3",
		"oriAmount": 1000,
		"bodyItem": [
			{
				"orgExchangeRateType": "0000LT2ON7R546TLHP0000",
				"oriCurrency": "1939062405854658600",
				"orgExchangeRate": 1,
				"oriOcupyAmount": 0,
				"srcBillNo": "OAPap250409024097",
				"accNonDeductTax": 0,
				"gblTaxExcludedAmount": 8000,
				"gblBalance": 8000,
				"gblArapAmount": 8000,
				"accTaxAmount": 0,
				"id": "2241964699533705223",
				"oriArapAmount": 1000,
				"srcBillId": "2241964519143505924",
				"gblTaxAmount": 0,
				"nonDeductTaxRate": 0,
				"oriWhtaxAmount": 0,
				"taxSubject": "10000",
				"accWhtaxAmount": 0,
				"grpExchangeRateType": "0000LT2ON7R546TLHP0000",
				"orgArapAmount": 1000,
				"orgNonDeductTax": 0,
				"grandsonItem": [
					{
						"oriAmount": 1000,
						"blnDeposit": false,
						"oriOcupyAmount": 0,
						"balanceState": "0",
						"issueNo": 1,
						"body": "2241964699533705223",
						"orgAmount": 1000,
						"quickType": "1939062405859377476",
						"accAmount": 1000,
						"orgBalance": 1000,
						"gblAmount": 8000,
						"gblBalance": 8000,
						"convertWay": "0",
						"blnHangUp": false,
						"expireDate": "9999-12-31",
						"grpAmount": 1000,
						"oriBalance": 1000,
						"accBalance": 1000,
						"id": "2241964699533705224",
						"grpBalance": 1000,
						"startDate": "2025-04-09",
						"ratio": 100,
						"blnPrepare": false
					}
				],
				"taxRate": 0,
				"orgBalance": 1000,
				"grpWhtaxAmount": 0,
				"orgTaxIncludedAmount": 1000,
				"grpTaxAmount": 0,
				"oriBalance": 1000,
				"grpBalance": 1000,
				"gblNonDeductTax": 0,
				"deductTaxType": "0",
				"rowNo": 10,
				"accTaxExcludedAmount": 1000,
				"gblExchangeRate": 8,
				"orgWhtaxAmount": 0,
				"gblWhtaxAmount": 0,
				"grpExchangeRate": 1,
				"oriTaxExcludedAmount": 1000,
				"grpTaxIncludedAmount": 1000,
				"accExchangeRate": 1,
				"oriTaxAmount": 0,
				"grpTaxExcludedAmount": 1000,
				"accTaxIncludedAmount": 1000,
				"grpNonDeductTax": 0,
				"event": "2241964699533705222",
				"oriTaxIncludedAmount": 1000,
				"oriNonDeductTax": 0,
				"orgTaxExcludedAmount": 1000,
				"orgTaxAmount": 0,
				"accExchangeRateType": "0000LT2ON7R546TLHP0000",
				"srcBillRowId": "2241964544913047553",
				"gblTaxIncludedAmount": 8000,
				"accArapAmount": 1000,
				"dept": "2123809169957453833",
				"gblExchangeRateType": "1941105367177494534",
				"exchangeRateDate": "2025-04-09",
				"grpArapAmount": 1000,
				"accBalance": 1000
			}
		],
		"eventType": "2740066088296704",
		"srcApp": "94",
		"srcBillType": "2614247099060992",
		"accPurpose": "1939062405859377459",
		"gblConvertParam": "3",
		"entry": "~",
		"orgBalance": 1000,
		"accBook": "2123093259064442889",
		"auditTime": "2025-04-09 19:43:57",
		"grpAmount": 1000,
		"oriBalance": 1000,
		"srcSystem": "1",
		"bizBillType": "2614247099060992",
		"grpBalance": 1000,
		"status": "1",
		"blnEffect": "1",
		"code": "AP0601250409000003",
		"writeOffState": "0",
		"bizTradeType": "1939062405866194507",
		"accPeriodCode": "2025-04",
		"gblAmount": 8000,
		"srcBillCode": "OAPap250409024097",
		"grpCurrency": "1939062405854658600",
		"orgConvertParam": "1",
		"creator": "8ebf818b-d271-43d9-992e-2fcf1e56d553",
		"bizBillCode": "OAPap250409024097",
		"org": "1994100564922728450",
		"voucherType": "~",
		"arapEventType": "313",
		"postState": "2",
		"auditor": "8ebf818b-d271-43d9-992e-2fcf1e56d553",
		"balanceState": "0",
		"orgAmount": 1000,
		"accDate": "2025-04-09",
		"createTime": "2025-04-09 19:44:02",
		"accBalance": 1000,
		"remarks": "1234567"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求数据是否正确


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

