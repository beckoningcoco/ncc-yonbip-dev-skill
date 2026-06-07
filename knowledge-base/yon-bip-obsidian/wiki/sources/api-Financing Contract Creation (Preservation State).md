---
title: "融资合同生单（保存态）"
apiId: "2058521440840843269"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Contract"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资合同生单（保存态）

> `ContentType	application/json` 请求方式	POST | 分类: Financial Contract (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/generateFinancingRegisterOpenApi/createFancingRegister

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
| code | string | 否 | 否 | 请求流水号（融资申请直联业务） 示例：R2024121004440918250 |
| accentity | string | 否 | 否 | 资金组织（编码） 示例：CTM121201 |
| protocolNumber | string | 否 | 是 | 协议号 示例：0801-0001 |
| financialProduct | string | 否 | 否 | 金融业务定义（编码） 示例：P000001 |
| financingOrgType | string | 否 | 否 | 融资机构类型（编码） 示例：TBOT0005 |
| financingOrgForOther | string | 否 | 否 | 融资机构（伙伴档案、客户、供应商名称） 示例：中国工商银行股份有限公司临海白水洋支行 |
| protocolCurrency | string | 否 | 是 | 协议币种（编码） 示例：CNY |
| protocolAmount | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 协议金额 示例：10000.00 |
| signDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 签约日期 示例：2024-12-12 |
| beginDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 开始日期 示例：2024-12-12 |
| termNumber | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 期限数量 示例：1 |
| termUnit | string | 否 | 否 | 期限单位 示例：year |
| expireDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 到期日期 示例：2025-12-12 |
| termType | string | 否 | 否 | 融资期限分类 示例：0 |
| lendByTrustee | string | 否 | 否 | 是否通过受托人放款 示例：1 |
| trusteeType | string | 否 | 否 | 受托人机构类型（编码） 示例：TBOT0005 |
| trustee | string | 否 | 否 | 受托人（伙伴档案名称） 示例：司库公司 |
| capitalCurrency | string | 否 | 否 | 本金币种（编码） 示例：CNY |
| capitalExchangeRate | number |
| 小数位数:6,最大长度:28 | 否 | 否 | 本金约定汇率 示例：1.000000 |
| repaymentType | string | 否 | 否 | 还款方式 示例：expire_once |
| repaymentCycle | string | 否 | 否 | 还款周期 示例：1 |
| firstRepaymentDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 首次还款日 示例：2024-12-20 |
| gracePeriod | number |
| 小数位数:0,最大长度:9 | 否 | 否 | 宽限期（天） 示例：0 |
| monthAdjustDate | string | 否 | 否 | 月末日期调整（还本） 示例：30 |
| periodHeadTail | string | 否 | 否 | 周期首尾规则 示例：1 |
| holidayPrinciple | string | 否 | 否 | 节假日处理原则 示例：normal |
| incomeAccid | string | 否 | 否 | 收入账户（企业银行账户的银行账号） 示例：6217000254440568484 |
| outlayAccid | string | 否 | 否 | 支出账户（企业银行账户的银行账号） 示例：6217000254440568484 |
| fundPaymentType | string | 否 | 否 | 资金支付模式 示例：0 |
| rateType | string | 否 | 是 | 利率类型 示例：fixed |
| baseRateType | string | 否 | 否 | 基准利率类型（编码） 示例：SOFR |
| baseRate | number |
| 小数位数:6,最大长度:28 | 否 | 否 | 基准利率（%） 示例：2.15 |
| floatType | string | 否 | 否 | 浮动方式 示例：0 |
| floatValue | number |
| 小数位数:2,最大长度:28 | 否 | 否 | 浮动值 示例：1 |
| protocolRate | number |
| 小数位数:6,最大长度:28 | 否 | 是 | 协议利率（%） 示例：2.16 |
| settlementType | string | 否 | 是 | 结息方式 示例：expire_once |
| settlementCycle | string | 否 | 否 | 结息周期 示例：1 |
| interestDays | string | 否 | 是 | 计息天数 示例：standard |
| firstPaymentDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 首次付息日 示例：2024-12-25 |
| yearMonthDay | string | 否 | 否 | 年/月/日利率 示例：year |
| monthInterestAdjustDate | string | 否 | 否 | 月末日期调整（付息） 示例：30 |
| interestSettlementRule | string | 否 | 否 | 结息头尾规则 示例：heads_not_tails |
| rateAdjustCycle | string | 否 | 否 | 利率调整周期 示例：0 |
| firstEffectDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 调整首次生效日 示例：2024-12-30 |
| holidayInterestPrinciple | string | 否 | 否 | 节假日计息原则 示例：normal |
| interestCurrency | string | 否 | 否 | 计息币种 示例：CNY |
| appointRate | number |
| 小数位数:6,最大长度:28 | 否 | 否 | 利息约定汇率 示例：1.000000 |
| interestAccid | string | 否 | 否 | 计息账户（企业银行账户的银行账号） 示例：6217000254440568484 |
| useOverdue | string | 否 | 否 | 是否启用逾期 示例：no |
| isPenalty | string | 否 | 否 | 是否计算罚息 示例：yes |
| penaltyFloatPercent | number |
| 小数位数:2,最大长度:28 | 否 | 否 | 罚息上浮比例（%） 示例：2.00 |
| penaltyRate | number |
| 小数位数:1,最大长度:28 | 否 | 否 | 罚息利率（%） 示例：2.05 |
| isCompoundInterest | string | 否 | 否 | 是否计算复利 示例：yes |
| compoundFloatPercent | number |
| 小数位数:2,最大长度:28 | 否 | 否 | 复利上浮比例（%） 示例：5.00 |
| compoundRate | number |
| 小数位数:2,最大长度:28 | 否 | 否 | 复利利率（%） 示例：2.05 |
| isInit | string | 否 | 否 | 是否初始化 示例：1 |
| advancePrincipal | string | 否 | 否 | 是否预付本金 示例：yes |
| advanceDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 预付本金日期 示例：2024-12-25 |
| advanceAmountCapital | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 预付本金（本金币种） 示例：100.00 |
| exchangeRateTypeIn | string | 否 | 否 | 本币币种汇率类型编码 示例：01 |
| infuseIncomeAccid | string | 否 | 否 | 收入账户（企业银行账户的银行账号） 示例：6217000254440568484 |
| settledAddition | string | 否 | 否 | 已结算补单 示例：no |
| settlementStatus | string | 否 | 否 | 结算状态 示例：0 |
| settlementMethod | string | 否 | 否 | 结算方式（编码） 示例：system_0001 |
| purchaseDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 融入日期（初始化场景） 示例：2024-12-25 |
| scAmount | string | 否 | 否 | 内部存款业务的对方银行账户（伙伴档案银行信息的银行账号） 示例：6217000254440568484 |
| financingRegisterCashFlow | object | 是 | 是 | 现金流计划 |
| event | string | 否 | 是 | 现金流事件 示例：ZJ |
| code | string | 否 | 是 | 放款计划编号（融资申请直联业务） 示例：RZFK202412120001 |
| relateCodeForShow | string | 否 | 否 | 关联放款计划编号 示例：RZFK202412120002 |
| protocolAmount | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 协议币种金额 示例：10000.00 |
| planDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 计划日期 示例：2024-12-12 |
| termNumber | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 期限数值 示例：1 |
| termUnit | string | 否 | 否 | 期限单位 示例：year |
| endDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日期 示例：2025-12-12 |
| protocolCurrency | string | 否 | 否 | 协议币种（编码） 示例：CNY |
| dealCurrency | string | 否 | 否 | 交易币种（编码） 示例：CNY |
| direction | string | 否 | 否 | 方向 示例：income |
| dealCurrencyAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 交易币种金额 示例：10000.00 |
| executeStatus | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 执行状态 示例：0 |
| planScope | string | 否 | 否 | 计划内外 示例：in |
| executeDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 执行日期 示例：2024-08-06 |
| executeAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 执行金额（交易币种） 示例：5000.00 |
| isOverdue | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 是否逾期 示例：0 |
| financingRegisterCostFlow | object | 是 | 否 | 费用计划 |
| code | string | 否 | 否 | 计划编号（融资申请直联业务） 示例：RZFF202412120001 |
| flowType | string | 否 | 否 | 现金流项目（编码） 示例：RZFX0001 |
| planDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 计划日期 示例：2024-12-12 |
| costAmount | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 费用币种金额 示例：5000.00 |
| costCurrency | string | 否 | 否 | 费用币种 示例：CNY |
| direction | string | 否 | 否 | 方向 示例：outcome |
| feeItem | string | 否 | 否 | 付费项目（费用项目编码） 示例：00001 |
| payeeType | string | 否 | 否 | 收款方类型 示例：capital_business |
| payeeUnit | string | 否 | 否 | 收款方单位（客户、供应商、伙伴档案编码） 示例：ZJDX240313000000 |
| otherBankAccount | string | 否 | 否 | 对方银行账号（客户、供应商、伙伴档案银行账号） 示例：6217000254440568484 |

## 3. 请求示例

Url: /yonbip/ctm/generateFinancingRegisterOpenApi/createFancingRegister?access_token=访问令牌
Body: {
	"code": "R2024121004440918250",
	"accentity": "CTM121201",
	"protocolNumber": "0801-0001",
	"financialProduct": "P000001",
	"financingOrgType": "TBOT0005",
	"financingOrgForOther": "中国工商银行股份有限公司临海白水洋支行",
	"protocolCurrency": "CNY",
	"protocolAmount": 10000,
	"signDate": "2024-12-12",
	"beginDate": "2024-12-12",
	"termNumber": 1,
	"termUnit": "year",
	"expireDate": "2025-12-12",
	"termType": "0",
	"lendByTrustee": "1",
	"trusteeType": "TBOT0005",
	"trustee": "司库公司",
	"capitalCurrency": "CNY",
	"capitalExchangeRate": 1,
	"repaymentType": "expire_once",
	"repaymentCycle": "1",
	"firstRepaymentDate": "2024-12-20",
	"gracePeriod": 0,
	"monthAdjustDate": "30",
	"periodHeadTail": "1",
	"holidayPrinciple": "normal",
	"incomeAccid": "6217000254440568484",
	"outlayAccid": "6217000254440568484",
	"fundPaymentType": "0",
	"rateType": "fixed",
	"baseRateType": "SOFR",
	"baseRate": 2.15,
	"floatType": "0",
	"floatValue": 1,
	"protocolRate": 2.16,
	"settlementType": "expire_once",
	"settlementCycle": "1",
	"interestDays": "standard",
	"firstPaymentDate": "2024-12-25",
	"yearMonthDay": "year",
	"monthInterestAdjustDate": "30",
	"interestSettlementRule": "heads_not_tails",
	"rateAdjustCycle": "0",
	"firstEffectDate": "2024-12-30",
	"holidayInterestPrinciple": "normal",
	"interestCurrency": "CNY",
	"appointRate": 1,
	"interestAccid": "6217000254440568484",
	"useOverdue": "no",
	"isPenalty": "yes",
	"penaltyFloatPercent": 2,
	"penaltyRate": 2.05,
	"isCompoundInterest": "yes",
	"compoundFloatPercent": 5,
	"compoundRate": 2.05,
	"isInit": "1",
	"advancePrincipal": "yes",
	"advanceDate": "2024-12-25",
	"advanceAmountCapital": 100,
	"exchangeRateTypeIn": "01",
	"infuseIncomeAccid": "6217000254440568484",
	"settledAddition": "no",
	"settlementStatus": "0",
	"settlementMethod": "system_0001",
	"purchaseDate": "2024-12-25",
	"scAmount": "6217000254440568484",
	"financingRegisterCashFlow": [
		{
			"event": "ZJ",
			"code": "RZFK202412120001",
			"relateCodeForShow": "RZFK202412120002",
			"protocolAmount": 10000,
			"planDate": "2024-12-12",
			"termNumber": 1,
			"termUnit": "year",
			"endDate": "2025-12-12",
			"protocolCurrency": "CNY",
			"dealCurrency": "CNY",
			"direction": "income",
			"dealCurrencyAmount": 10000,
			"executeStatus": 0,
			"planScope": "in",
			"executeDate": "2024-08-06",
			"executeAmount": 5000,
			"isOverdue": 0
		}
	],
	"financingRegisterCostFlow": [
		{
			"code": "RZFF202412120001",
			"flowType": "RZFX0001",
			"planDate": "2024-12-12",
			"costAmount": 5000,
			"costCurrency": "CNY",
			"direction": "outcome",
			"feeItem": "00001",
			"payeeType": "capital_business",
			"payeeUnit": "ZJDX240313000000",
			"otherBankAccount": "6217000254440568484"
		}
	]
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
| bankTransactionNum | string | 否 | 请求流水号（直联业务） 示例：R2024121004440918250 |
| code | string | 否 | 1. 成功：200 2. 失败：400 示例：200 |
| message | string | 否 | 成功 示例：成功 |

## 5. 正确返回示例

{
	"bankTransactionNum": "R2024121004440918250",
	"code": "200",
	"message": "成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-09

新增

请求参数 settledAddition

新增

请求参数 purchaseDate

更新

请求参数 code

删除

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

