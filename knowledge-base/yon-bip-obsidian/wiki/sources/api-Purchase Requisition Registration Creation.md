---
title: "申购登记生单"
apiId: "2168400525359841286"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Requisition Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Requisition Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 申购登记生单

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Requisition Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/purchaseregister/openapi/create

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
| accentity | string | 否 | 是 | 资金组织 示例：1530661876902920193 |
| protocolNumber | string | 否 | 是 | 协议号 示例：2085878028767854601 |
| settlementType | string | 否 | 是 | 结息方式,expire_once:到期一次,principal_clear:利随本清,period:周期付息,principal_clear_period:利随本清&周期计息,custom:自定义 示例：period |
| repaymentType | string | 否 | 是 | 赎回方式,expire_once:到期一次,average_capital:等额本金,average_interest:等额本息,period_repayment:周期还本,custom:自定义 示例：average_capital |
| settlementCycle | string | 否 | 否 | 结息周期,1:年,2:半年,3:季度,4:月 示例：1 |
| firstPaymentDate | string | 否 | 否 | 首次结息日 示例：2025-02-01 |
| firstRepaymentDate | string | 否 | 否 | 首次赎回日 示例：2022-02-01 |
| initialization | string | 否 | 是 | 是否期初,false:否,true:是 示例：true |
| createMethod | string | 否 | 否 | 生成方式,protocolyes:协议自动生成,pr_apply:申购申请自动生成,rengong:人工,scheduling_generation:调度自动生成,serialnumber_generation:流水生单,sync:协同生成,transfer_auto:到期自动转存,transfer_create:到期转存生成,transfer_manual:到期手工转存 示例：manual |
| repaymentCycle | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 赎回周期,1:年,2:半年,3:季度,4:月 示例：4 |
| monthAdjustDate | string | 否 | 否 | 月末日期调整（赎回）,29:29日,30:30日,31:31日 示例：30 |
| rateType | string | 否 | 否 | 利率类型,fixed:固定利率,float:浮动利率 示例：float |
| interestDays | string | 否 | 否 | 计息天数,reality:实际-365/366,reality365:实际-365,standard:标准-360,standard360:实际-360,standard365:标准-365 示例：standard |
| yearMonthDay | string | 否 | 否 | 年/月/日利率,day:日,half_year:半年,month:月,year:年 示例：month |
| baseRateType | string | 否 | 否 | 基准利率类型 示例：1546425291657707529 |
| baseRate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 基准利率（%） 示例：4.5 |
| floatType | string | 否 | 否 | 浮动方式,0:加减点（BP）,1:比例（%） 示例：0 |
| floatValue | number |
| 小数位数:8,最大长度:16 | 否 | 否 | 浮动值 示例：0.5 |
| purchaseRate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 申购单利率（%） 示例：5 |
| rateAdjustCycle | string | 否 | 否 | 利率调整周期,0:即时浮动,1:按月,2:按季度,3:按半年,4:按年 示例：4 |
| firstEffectDate | string | 否 | 否 | 利率调整首次生效日 示例：2025-01-01 |
| monthInterestAdjustDate | string | 否 | 否 | 月末日期调整（利息）,29:29日,30:30日,31:31日 示例：31 |
| periodHeadTail | string | 否 | 否 | 周期首尾规则,1:首期不合,尾期合,2:首期合,尾期不合,3:首尾均不合 示例：start-inclusive |
| interestSettlementRule | string | 否 | 否 | 结息首尾规则,heads_and_tails:算头算尾,heads_not_tails:算头不算尾 示例：exact-day |
| purchaseCode | string | 否 | 否 | 申购单号 示例：PO001 |
| cashflowplan | string | 否 | 否 | 现金流计划 示例：123456 |
| purchaseDate | string | 否 | 否 | 申购日期 示例：2024-02-20 |
| purchaseTermNumber | string | 否 | 否 | 申购期限数量 示例：6 |
| purchaseTermUnit | string | 否 | 是 | 期限单位,day:日,month:月,year:年 示例：month |
| purchaseEnddate | string | 否 | 否 | 申购到期日期 示例：2025-06-20 |
| purchaseAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 申购金额（协议币种） 示例：1 |
| fundPaymentType | string | 否 | 否 | 资金支付模式,0:被动扣款,1:主动付款 示例：1 |
| isUpdateSettlementDate | string | 否 | 否 | 是否更新申购日为结算日,no:否,yes:是 示例：no |
| initRedeemedAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 期初赎回金额 示例：1 |
| initInterestAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 期初收息金额 示例：1 |
| lastInterestDate | string | 否 | 否 | 初始化收息日期 示例：2024-12-20 |
| postscriptInfo | string | 否 | 否 | 附言 示例：ving123 |
| abstractInfo | string | 否 | 否 | 用途 示例：Test summary |
| isPenalty | string | 否 | 否 | 是否计算罚息,no:否,yes:是 示例：no |
| isCompoundInterest | string | 否 | 否 | 是否计算复利,no:否,yes:是 示例：no |
| penaltyFloatPercent | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 罚息上浮比例（%） 示例：0 |
| penaltyRate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 罚息利率（%） 示例：0 |
| compoundFloatPercent | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 复利上浮比例（%） 示例：0 |
| compoundRate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 复利利率（%） 示例：0 |
| oldcurrency | string | 否 | 否 | 本币币种 示例：USD |
| exchangerateType | string | 否 | 否 | 本币币种汇率类型 示例：spot |
| exchangerate | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 本币币种汇率 示例：1 |
| settledAddition | string | 否 | 否 | 已结算补单,yes:是，no:否 |
| settlementStatus | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 结算状态,0:待结算,2:结算成功 示例：0 |
| settlementMethod | string | 否 | 否 | 结算方式 示例：1 |
| otherAccount | string | 否 | 否 | 本方银行账户 示例：1234567890 |
| otherAcctNo | string | 否 | 否 | 对方银行账户 示例：9876543210 |
| accrualBeginDate | string | 否 | 否 | 预提起息日 示例：2022-12-20 |
| accrualPeriod | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 预提利息周期 示例：1 |
| firstAccrualDate | string | 否 | 否 | 首次预提利息日 示例：2025-01-20 |
| monthWithHoldingAdjustDate | string | 否 | 否 | 月末日期调整（预提）,29:29日,30:30日,31:31日 示例：31 |
| withholdingRule | string | 否 | 否 | 预提头尾规则,heads_and_tails:算头算尾,heads_not_tails:算头不算尾 示例：heads_not_tails |
| lastRedeemDate | string | 否 | 否 | 初始化赎回日期 示例：2024-12-20 |
| includedExpirationDate | string | 否 | 否 | 是否含到期日,no:否,yes:是 示例：no |
| exchangerateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式(1-*;2-/) 示例：1 默认值：1 |

## 3. 请求示例

Url: /yonbip/ctm/fm/purchaseregister/openapi/create?access_token=访问令牌
Body: {
	"accentity": "1530661876902920193",
	"protocolNumber": "2085878028767854601",
	"settlementType": "period",
	"repaymentType": "average_capital",
	"settlementCycle": "1",
	"firstPaymentDate": "2025-02-01",
	"firstRepaymentDate": "2022-02-01",
	"initialization": "true",
	"createMethod": "manual",
	"repaymentCycle": 4,
	"monthAdjustDate": "30",
	"rateType": "float",
	"interestDays": "standard",
	"yearMonthDay": "month",
	"baseRateType": "1546425291657707529",
	"baseRate": 4.5,
	"floatType": "0",
	"floatValue": 0.5,
	"purchaseRate": 5,
	"rateAdjustCycle": "4",
	"firstEffectDate": "2025-01-01",
	"monthInterestAdjustDate": "31",
	"periodHeadTail": "start-inclusive",
	"interestSettlementRule": "exact-day",
	"purchaseCode": "PO001",
	"cashflowplan": "123456",
	"purchaseDate": "2024-02-20",
	"purchaseTermNumber": "6",
	"purchaseTermUnit": "month",
	"purchaseEnddate": "2025-06-20",
	"purchaseAmount": 1,
	"fundPaymentType": "1",
	"isUpdateSettlementDate": "no",
	"initRedeemedAmount": 1,
	"initInterestAmount": 1,
	"lastInterestDate": "2024-12-20",
	"postscriptInfo": "ving123",
	"abstractInfo": "Test summary",
	"isPenalty": "no",
	"isCompoundInterest": "no",
	"penaltyFloatPercent": 0,
	"penaltyRate": 0,
	"compoundFloatPercent": 0,
	"compoundRate": 0,
	"oldcurrency": "USD",
	"exchangerateType": "spot",
	"exchangerate": 1,
	"settledAddition": "",
	"settlementStatus": 0,
	"settlementMethod": "1",
	"otherAccount": "1234567890",
	"otherAcctNo": "9876543210",
	"accrualBeginDate": "2022-12-20",
	"accrualPeriod": 1,
	"firstAccrualDate": "2025-01-20",
	"monthWithHoldingAdjustDate": "31",
	"withholdingRule": "heads_not_tails",
	"lastRedeemDate": "2024-12-20",
	"includedExpirationDate": "no",
	"exchangerateOps": 1
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
| data | object | 否 | data |
| code | string | 否 | code 示例：SG2412310001 |
| statusMsg | string | 否 | statusMsg 示例：提交成功 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：0 |
| message | string | 否 | message |
| timestamp | string | 否 | timestamp 示例：1735611415146 |

## 5. 正确返回示例

{
	"data": {
		"code": "SG2412310001",
		"statusMsg": "提交成功"
	},
	"code": 0,
	"message": "",
	"timestamp": "1735611415146"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-31

新增

请求参数 exchangerateOps

更新

请求参数 initialization

更新

请求参数 initRedeemedAmount

更新

请求参数 initInterestAmount

2	2025-09-09

新增

请求参数 settledAddition

更新

请求参数 (5)

3	2025-06-17

更新

请求参数 settlementMethod

更新

请求参数 otherAccount


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

