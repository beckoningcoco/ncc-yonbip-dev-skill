---
title: "融资变更生单"
apiId: "2288469514383261704"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financing Change"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financing Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资变更生单

> `ContentType	application/json` 请求方式	POST | 分类: Financing Change (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/financingchange/openapi/create

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
| accentity | string | 否 | 是 | 资金组织 |
| action | string | 否 | 是 | 审批状态:save-保存态;submit-审批通过态 默认值：save |
| changeProtocolNumber | string | 否 | 是 | 变更协议号：变更协议号不能重复 |
| changeReason | string | 否 | 否 | 变更原因 |
| protocolNumber | string | 否 | 是 | 协议号 |
| financingOrgType | string | 否 | 否 | 融资机构类型："条件变更：协议下无关联借据、协议未关联授信及担保，可变更 枚举 supplier-供应商;customer-客户;TBOT0007-资金组织;TBOT0006-结算中心;TBOT0005-银行;TBOT0004-非银类金融机构;other-其他;bank_consortium-银团;capital_business-资金业务对象;TBOT0009-财务公司" |
| financingOrgForBank | string | 否 | 否 | 融资机构(资金伙伴档案)：资金伙伴档案条件变更：协议下无关联借据、协议未关联授信及担保时，可变更 |
| trusteeType | string | 否 | 否 | 受托人类型："条件变更：协议下无关联借据时，可变更 1）枚举 TBOT0004-非银类金融机构;TBOT0005-银行;TBOT0006-结算中心;TBOT0007-资金组织;TBOT0009-财务公司;" |
| trustee | string | 否 | 否 | 受托人："条件变更：协议下无关联借据时，可变更 参照" |
| lendByTrustee | string | 否 | 否 | 是否通过受托人放款："条件变更：协议下无关联借据时，可变更 枚举：1-是、0-否" |
| protocolCurrency | string | 否 | 否 | 协议币种：条件变更：协议下无关联借据时，可变更 |
| num | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 数量：本金类型为“数量单价计算”时，可传入 |
| price | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 单价：本金类型为“数量单价计算”时，可传入 |
| protocolAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 协议金额 |
| moreCurrency | string | 否 | 否 | 是否多币种贷款：条件变更：协议下无关联借据时，可变更 枚举："yes-是；no-否" |
| beginDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 开始日期：条件变更：协议下无关联借据时，可变更 |
| termNumber | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 期限数量 |
| termUnit | string | 否 | 否 | 期限单位：year-年；month-月；day-日" |
| expireDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日：到期日期＞开始日期 |
| signDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 签约日期 |
| capitalCurrency | string | 否 | 否 | 本金币种（单币种）：条件变更：协议下无关联借据时，可变更 |
| repaymentType | string | 否 | 否 | 还款方式：条件变更：是否约定还款计划=否时，可变更；"period_repayment-周期还本；expire_once-到期一次；average_capital-等额本金；average_interest-等额本息；custom-自定义；no_repayment-不还本" |
| repaymentCycle | string | 否 | 否 | 还款周期："1-年；2-半年；3-季度；4-月" |
| firstRepaymentDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 首次还款日 |
| gracePeriod | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 宽限期（天） |
| useOverdue | string | 否 | 否 | 是否启用逾期："yes-是；no-否" |
| periodHeadTail | string | 否 | 否 | 周期首尾规则："1-首期不合,尾期合；2-首期合,尾期不合；3-首尾均不合" |
| holidayPrinciple | string | 否 | 否 | 节假日处理原则："advance-提前；delayed-延后；normal-正常" |
| holidayInterestPrinciple | string | 否 | 否 | 节假日计息原则："advance-提前；delayed-延后；normal-正常" |
| fundPaymentType | string | 否 | 否 | 资金支付模式："0-被动还款；1-主动付款" |
| prePaymentDays | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 提前付款天数 |
| incomeAccid | string | 否 | 否 | 收入账户 |
| outlayAccid | string | 否 | 否 | 支出账户 |
| isPenalty | string | 否 | 否 | 是否计算罚息："yes-是；no-否" |
| isCompoundInterest | string | 否 | 否 | 是否计算复利："yes-是；no-否" |
| penaltyFloatPercent | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 罚息上浮比例（%） |
| penaltyRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 罚息利率（%） |
| compoundFloatPercent | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 复利上浮比例（%） |
| compoundRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 复利利率（%） |
| rateType | string | 否 | 否 | 利率类型："fixed-固定利率；float-浮动利率""standard-标准-360；standard365-标准-365；reality-实际-365/366；reality360-实际-360；reality365-实际-365" |
| interestDays | string | 否 | 否 | 计息天数："实际-365/366: reality; 实际-360: reality360; 实际-365: reality365; 标准-360: standard; 标准-365: standard365;" |
| baseRateType | string | 否 | 否 | 基准利率类型 |
| interestRateDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 利率日期 |
| yearMonthDay | string | 否 | 否 | 年/月/日利率： "year-年；half_year-半年；month-月；day-日" |
| baseRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 基准利率（%） |
| floatType | string | 否 | 否 | 浮动方式："0-加减点（BP）；1-比例（%）" |
| floatValue | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 浮动值 |
| protocolRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 协议利率（%） |
| settlementType | string | 否 | 否 | 结息方式："expire_once：到期一次；principal_clear：利随本清period：周期计息；principal_clear_period：利随本清&周期计息；withhold_interest：预扣利息；custom：自定义；no_interest：不计息" |
| settlementCycle | string | 否 | 否 | 结息周期："1-年；2-半年；3-季度；4-月" |
| firstPaymentDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 首次付息日 |
| interestSettlementRule | string | 否 | 否 | 结息头尾规则："heads_not_tails：算头不算尾；heads_and_tails：算头算尾" |
| includedExpirationDate | string | 否 | 否 | 是否含到期日 |
| interestCurrency | string | 否 | 否 | 计息币种 |
| appointRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 利息约定汇率 |
| rateAdjustCycle | string | 否 | 否 | 利率调整周期："0-即时浮动；1-按月；2-按季度；3-按半年；4-按年" |
| firstEffectDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 调整首次生效日 |
| interestAccid | string | 否 | 否 | 计息账户 |
| contractType | string | 否 | 否 | 担保方式: 抵押担保:1; 质押担保:2; 第三方保证担保:3; 第三方抵押担保:4; 第三方质押担保:5; 保证担保:6; 定金:8; 留置:9; 流动性支持函:a; 差额补足承诺:b; 承诺函:c; 安慰函:d; 共同借款合同:e; 其他隐性担保:f; |
| combinedRatio | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 综合成本率 |
| financingRegisterCashFlow | object | 是 | 否 | 现金流 |
| event | string | 否 | 否 | 现金流事件：枚举："ZJ-增加本金；JS-减少本金；FX-付息；YQFX-逾期罚息；YQFL-逾期复利；LXTZ-利息调整" |
| code | string | 否 | 否 | 现金流ID：现金流ID不能重复，不传时按系统编码规则自动生成 |
| relateCodeForShow | string | 否 | 否 | 关联现金流ID：增加本金时为空；减少本金、付息要求传入关联增加本金现金流ID |
| flowType | string | 否 | 否 | 现金流项目：默认取金融产品定义预置的流类型 |
| planDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 计划日期：YYYYMMDD，需介于开始日期、到期日之间 |
| endDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 结束日期："YYYYMMDD，需介于开始日期、到期日之间； 增加本金时传入，若未传值取合同到期日期" |
| direction | string | 否 | 否 | 方向："income-收入；outcome-支出" |
| protocolCurrency | string | 否 | 否 | 协议币种 |
| protocolAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 协议币种金额 |
| dealCurrency | string | 否 | 否 | 交易币种 |
| dealCurrencyAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 交易币种金额 |
| executeStatus | string | 否 | 否 | 执行状态："0-未执行；1-已执行；2-执行中" |
| planScope | string | 否 | 否 | 计划内/外："in-计划内;out-计划外" |
| interestBeginDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 起息日期 |
| financingRegisterAgreement | object | 是 | 否 | 关联授信集合 |
| agreementNo | string | 否 | 否 | 授信协议号 |
| exchangeRateType | string | 否 | 否 | 汇率类型 |
| exchangeRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 核算汇率 |
| currentAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 本次占用额度（业务币种） |
| currentAmountChanged | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 变更后占用额度（业务币种） |
| currentSxAmountChanged | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 变更后占用额度（授信币种） |
| financingRegisterContract | object | 是 | 否 | 关联担保集合 |
| contractCode | string | 否 | 否 | 合同编号 |
| currentGuaranteeChangeAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 变更后占用额度 |
| financingRegisterCurrency | object | 是 | 否 | 本金币种：多币种贷款时传参 |
| capitalCurrency | string | 否 | 否 | 币种 示例：CNY |

## 3. 请求示例

Url: /yonbip/ctm/fm/financingchange/openapi/create?access_token=访问令牌
Body: {
	"accentity": "",
	"action": "",
	"changeProtocolNumber": "",
	"changeReason": "",
	"protocolNumber": "",
	"financingOrgType": "",
	"financingOrgForBank": "",
	"trusteeType": "",
	"trustee": "",
	"lendByTrustee": "",
	"protocolCurrency": "",
	"num": 0,
	"price": 0,
	"protocolAmount": 0,
	"moreCurrency": "",
	"beginDate": "2026-06-07",
	"termNumber": 0,
	"termUnit": "",
	"expireDate": "2026-06-07",
	"signDate": "2026-06-07",
	"capitalCurrency": "",
	"repaymentType": "",
	"repaymentCycle": "",
	"firstRepaymentDate": "2026-06-07",
	"gracePeriod": 0,
	"useOverdue": "",
	"periodHeadTail": "",
	"holidayPrinciple": "",
	"holidayInterestPrinciple": "",
	"fundPaymentType": "",
	"prePaymentDays": 0,
	"incomeAccid": "",
	"outlayAccid": "",
	"isPenalty": "",
	"isCompoundInterest": "",
	"penaltyFloatPercent": 0,
	"penaltyRate": 0,
	"compoundFloatPercent": 0,
	"compoundRate": 0,
	"rateType": "",
	"interestDays": "",
	"baseRateType": "",
	"interestRateDate": "2026-06-07",
	"yearMonthDay": "",
	"baseRate": 0,
	"floatType": "",
	"floatValue": 0,
	"protocolRate": 0,
	"settlementType": "",
	"settlementCycle": "",
	"firstPaymentDate": "2026-06-07",
	"interestSettlementRule": "",
	"includedExpirationDate": "",
	"interestCurrency": "",
	"appointRate": 0,
	"rateAdjustCycle": "",
	"firstEffectDate": "2026-06-07",
	"interestAccid": "",
	"contractType": "",
	"combinedRatio": 0,
	"financingRegisterCashFlow": [
		{
			"event": "",
			"code": "",
			"relateCodeForShow": "",
			"flowType": "",
			"planDate": "2026-06-07",
			"endDate": "2026-06-07",
			"direction": "",
			"protocolCurrency": "",
			"protocolAmount": 0,
			"dealCurrency": "",
			"dealCurrencyAmount": 0,
			"executeStatus": "",
			"planScope": "",
			"interestBeginDate": "2026-06-07"
		}
	],
	"financingRegisterAgreement": [
		{
			"agreementNo": "",
			"exchangeRateType": "",
			"exchangeRate": 0,
			"currentAmount": 0,
			"currentAmountChanged": 0,
			"currentSxAmountChanged": 0
		}
	],
	"financingRegisterContract": [
		{
			"contractCode": "",
			"currentGuaranteeChangeAmount": 0
		}
	],
	"financingRegisterCurrency": [
		{
			"capitalCurrency": "CNY"
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
| code | number |
| 小数位数:2,最大长度:10 | 否 | code |
| data | object | 否 | data |
| code | string | 否 | code |
| statusMsg | string | 否 | statusMsg |
| message | string | 否 | message |
| timestamp | string | 否 | timestamp |

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"code": "",
		"statusMsg": ""
	},
	"message": "",
	"timestamp": ""
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

