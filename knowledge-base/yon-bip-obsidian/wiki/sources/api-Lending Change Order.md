---
title: "融入变更生单"
apiId: "2120698067472089090"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lending Change"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lending Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 融入变更生单

> `ContentType	application/json` 请求方式	POST | 分类: Lending Change (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/financeinchange/openapi/create

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
| accentity | string | 否 | 是 | 会计主体 示例：1541096895095504906 |
| protocolNumber | string | 否 | 是 | 协议号 示例：2302568380185444360 |
| debtcode | string | 否 | 是 | 借据号 示例：2302568380185444361 |
| changeDebtCode | string | 否 | 是 | 变更借据号 |
| changeReason | string | 否 | 否 | 变更原因 |
| changeDate | string | 否 | 是 | 变更日期 示例：2025-08-26 |
| financeintermNumber | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 融入期限数量 示例：1 |
| financeintermUnit | string | 否 | 否 | 融入期限单位，日：day，月：month，年：year |
| financeinexpireDate | string | 否 | 否 | 融入到期日期 |
| repaymentType | string | 否 | 否 | 还款方式，等额本金:average_capital,,等额本息:average_interest,,自定义:custom,,到期一次:expire_once,,不还本:no_repayment,,周期还本:period_repayment, |
| repaymentCycle | string | 否 | 否 | 还款周期，年:1,半年:2,季度:3,月:4 |
| firstRepaymentDate | string | 否 | 否 | 首次还款日 |
| monthAdjustDate | string | 否 | 否 | 月末日期调整(还本)，29日:29,30日:30,31日:31 |
| gracePeriod | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 宽限期 |
| useOverdue | string | 否 | 否 | 是否启用逾期，否:no,是:yes |
| holidayPrinciple | string | 否 | 否 | 节假日处理原则，提前:advance,延后:delayed,正常:normal |
| interestRateType | string | 否 | 否 | 利率类型，固定利率:fixed,浮动利率:float |
| baseRateType | string | 否 | 否 | 基准利率类型 |
| baserate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 基准利率 |
| floatType | string | 否 | 否 | 浮动方式，加减点（BP）:0,比例（%）:1 |
| floatValue | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 浮动值 |
| debtRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 借据利率 |
| rateAdjustCycle | string | 否 | 否 | 利率调整周期，即时浮动:0,按月:1,按季度:2,按半年:3,按年:4 |
| firstEffectDate | string | 否 | 否 | 利率调整首次生效日 |
| settlementType | string | 否 | 否 | 结息方式，自定义:custom,到期一次:expire_once,不计息:no_interest,周期计息:period,利随本清:principal_clear,利随本清&周期计息:principal_clear_period,预扣利息:withhold_interest |
| settlementCycle | string | 否 | 否 | 结息周期，年:1,半年:2,季度:3,月:4 |
| firstPaymentDate | string | 否 | 否 | 首次付息日 |
| monthInterestAdjustDate | string | 否 | 否 | 月末日期调整（计息），29日:29,30日:30,31日:31 |
| isPenalty | string | 否 | 否 | 是否计算罚息，否:no,是:yes |
| isCompoundInterest | string | 否 | 否 | 是否计算复利，否:no,是:yes |
| penaltyFloatPercent | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 罚息上浮比例（%） |
| penaltyRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 罚息利率（%） |
| compoundFloatPercent | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 复利上浮比例（%） |
| compoundRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 复利利率（%） |
| withholdingInterestDate | string | 否 | 否 | 预提起息日 |
| accrualPeriod | string | 否 | 否 | 预提利息周期，年:1,半年:2,季度:3,月:4 |
| firstAccrualDate | string | 否 | 否 | 首次预提利息日 |
| withholdingRule | string | 否 | 否 | 预提头尾规则，算头算尾:heads_and_tails,算头不算尾:heads_not_tails |
| monthWithHoldingAdjustDate | string | 否 | 否 | 月末日期调整(预提)，29日:29,30日:30,31日:31 |
| realAccrualRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际利率(%) |
| auditstatus | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 审批状态，保存:1，审批通过:4 |
| yearMonthDay | string | 否 | 否 | 年/月/日，日:day,半年:half_year,月:month,年:year 示例：year |
| financeinterm | string | 否 | 否 | 融入期限 |
| interestDays | string | 否 | 否 | 计息天数，实际-365/366:reality,实际-365:reality365,标准-360:standard,实际-360:standard360,标准-365:standard365 示例：standard |
| holidayInterestPrinciple | string | 否 | 否 | 节假日计息原则，提前:advance,延后:delayed,不变:normal 示例：normal |
| interestSettlementRule | string | 否 | 否 | 结息头尾规则，算头算尾:heads_and_tails,算头不算尾:heads_not_tails 示例：heads_not_tails |

## 3. 请求示例

Url: /yonbip/ctm/fm/financeinchange/openapi/create?access_token=访问令牌
Body: {
	"accentity": "1541096895095504906",
	"protocolNumber": "2302568380185444360",
	"debtcode": "2302568380185444361",
	"changeDebtCode": "",
	"changeReason": "",
	"changeDate": "2025-08-26",
	"financeintermNumber": 1,
	"financeintermUnit": "",
	"financeinexpireDate": "",
	"repaymentType": "",
	"repaymentCycle": "",
	"firstRepaymentDate": "",
	"monthAdjustDate": "",
	"gracePeriod": 0,
	"useOverdue": "",
	"holidayPrinciple": "",
	"interestRateType": "",
	"baseRateType": "",
	"baserate": 0,
	"floatType": "",
	"floatValue": 0,
	"debtRate": 0,
	"rateAdjustCycle": "",
	"firstEffectDate": "",
	"settlementType": "",
	"settlementCycle": "",
	"firstPaymentDate": "",
	"monthInterestAdjustDate": "",
	"isPenalty": "",
	"isCompoundInterest": "",
	"penaltyFloatPercent": 0,
	"penaltyRate": 0,
	"compoundFloatPercent": 0,
	"compoundRate": 0,
	"withholdingInterestDate": "",
	"accrualPeriod": "",
	"firstAccrualDate": "",
	"withholdingRule": "",
	"monthWithHoldingAdjustDate": "",
	"realAccrualRate": 0,
	"auditstatus": 0,
	"yearMonthDay": "year",
	"financeinterm": "",
	"interestDays": "standard",
	"holidayInterestPrinciple": "normal",
	"interestSettlementRule": "heads_not_tails"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：0 |
| data | object | 否 | data |
| code | string | 否 | code 示例：ZQ2411220002 |
| statusMsg | string | 否 | statusMsg 示例：保存成功 |
| message | string | 否 | message |
| timestamp | string | 否 | timestamp 示例：1732265723706 |

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"code": "ZQ2411220002",
		"statusMsg": "保存成功"
	},
	"message": "",
	"timestamp": "1732265723706"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-27

更新

请求说明

更新

请求参数 (44)

删除

请求参数 (214)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

