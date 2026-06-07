---
title: "融入登记查询"
apiId: "2082873286908706817"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Lending Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lending Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 融入登记查询

> `ContentType	application/json` 请求方式	GET | 分类: Lending Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tlmFinanceinOpenApi/list/financeIns

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| funOrgId | string | query | 否 | 资金组织 |
| protocolNumber | string | query | 是 | 协议号 |
| debtCode | string | query | 否 | 借据号 |

## 3. 请求示例

Url: /yonbip/ctm/tlmFinanceinOpenApi/list/financeIns?access_token=访问令牌&funOrgId=&protocolNumber=&debtCode=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 是 | data |
| billInfo | object | 否 | billInfo |
| financeInInfo | object | 否 | financeInInfo |
| interestInfo | object | 否 | interestInfo |
| overdueSettings | string | 否 | overdueSettings |
| cashFlowList | object | 是 | cashFlowList |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：成功 |
| timestamp | string | 否 | timestamp 示例：1725956417651 |

## 5. 正确返回示例

{
	"data": [
		{
			"billInfo": {
				"fundOrgId": "1525652227072458756",
				"fundOrgName": "收入中台演示销售组织1",
				"billCode": "RR2312060016",
				"billDate": "20231206",
				"isInitialization": false,
				"auditStatus": 4,
				"postingStatus": 6,
				"settleParam": "yes",
				"isBudget": "",
				"createMethod": ""
			},
			"financeInInfo": {
				"protocolNumber": "1878298299300053000",
				"protocolNumberName": "长期周期1206",
				"debtCode": "长期周期12060001",
				"cashFlowPlanId": "1878301228550062081",
				"cashFlowPlanCode": "102177_1_1",
				"financeInDate": "20231206",
				"financeInTermNumber": 2,
				"financeInTermUnit": "year",
				"financeInTerm": "2年",
				"termType": "1",
				"financeInExpireDate": "20251206",
				"capitalCurrency": "1623643074168094746",
				"capitalCurrencyName": "人民币",
				"capitalCurrencyMoneyDigit": 2,
				"capitalExchangeRate": 1,
				"financeInAmtBJ": 100000,
				"financeInAmtXY": 100000,
				"outlayAcctId": "1780313233316904960",
				"outlayAcct": "001110110",
				"repaymentType": "period_repayment",
				"repaymentCycle": "3",
				"firstRepaymentDate": "20231207",
				"monthAdjustDate": "",
				"gracePeriod": "",
				"useOverdue": false,
				"periodHeadTail": "1",
				"interestBase": "repayment_amount",
				"includedExpirationDate": false,
				"issueNum": "",
				"issueUnitPrice": "",
				"realInAmXY": "",
				"payFeeSameTime": "",
				"feeAmtXY": "",
				"amortizeFeeAmtXY": "",
				"amortizedCost": "",
				"repaidAmtBJ": 0,
				"repaidAmtXY": 0,
				"payInterestAmtJX": 0,
				"payInterestAmtXY": 0,
				"settlementAmtXY": 0,
				"settlementAmtJX": 0,
				"settlementUnpaidAmtXY": 0,
				"settlementUnpaidAmtJX": 0,
				"initPayInterestDate": "",
				"initPayCapitalDate": "",
				"debtBalanceXY": 100000,
				"debtBalanceBJ": 100000,
				"debtStatus": "1",
				"expireEndType": "",
				"endDate": "",
				"endReason": "",
				"advancePrincipal": false,
				"advanceDate": "",
				"advanceAmtBJ": "",
				"advanceAmtXY": "",
				"inUseAmtXY": "",
				"releaseAmtXY": "",
				"canLoanAmtXY": 100000,
				"lockAmtXY": 0,
				"holidayPrinciple": "normal",
				"holidayInterestPrinciple": "normal"
			},
			"interestInfo": {
				"interestRateType": "fixed",
				"interestDays": "standard",
				"yearMonthDayRate": "year",
				"baseRateType": "",
				"baseRateTypeName": "",
				"baseRate": "",
				"floatType": "0",
				"floatValue": 0,
				"debtRate": 2,
				"settlementType": "period",
				"settlementCycle": "3",
				"firstPaymentDate": "20231207",
				"monthInterestAdjustDate": "",
				"normalInterestBase": "",
				"interestSettlementRule": "heads_and_tails",
				"interestCurrency": "1623643074168094746",
				"interestCurrencyName": "人民币",
				"interestCurrencyMoneyDigit": 2,
				"appointRate": 1
			},
			"overdueSettings": "",
			"cashFlowList": [
				{
					"event": "ZJ",
					"cashFlowID": "102177_1_1",
					"cashFlowProjectId": "1539077581855784962",
					"relateCashFlowID": "",
					"planDate": "20231206",
					"endDate": "20251206",
					"term": "2年",
					"termNumber": 2,
					"termUnit": "year",
					"direction": "income",
					"protocolCurrency": "1623643074168094746",
					"protocolCurrencyName": "人民币",
					"protocolCurrencyMoneyDigit": 2,
					"protocolAmt": 100000,
					"dealCurrency": "1623643074168094746",
					"dealCurrencyName": "人民币",
					"dealCurrencyMoneyDigit": 2,
					"dealCurrencyAmt": 100000,
					"executeStatus": 1,
					"planScope": "in",
					"executeDate": "20231206",
					"executeAmt": 100000,
					"interestBeginDate": ""
				}
			]
		}
	],
	"code": 200,
	"message": "成功",
	"timestamp": "1725956417651"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

