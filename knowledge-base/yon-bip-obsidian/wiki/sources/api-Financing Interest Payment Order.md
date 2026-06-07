---
title: "融资付息生单"
apiId: "2120722170828554243"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financing Interest Payment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financing Interest Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资付息生单

> `ContentType	application/json` 请求方式	POST | 分类: Financing Interest Payment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/payinterest/openapi/create

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
| accentity | string | 否 | 否 | 资金组织 示例：星星科技 |
| accentityRaw | string | 否 | 否 | 核算会计主体 示例：1530661876902920193 |
| sumPiMode | string | 否 | 否 | 汇总付息方式 示例：1-借据单笔 2-协议按日汇总 |
| protocolNumber | string | 否 | 是 | 协议号 示例：协议号 |
| debtcode | string | 否 | 是 | 借据号 示例：借据号 |
| interestSettlementMethod | string | 否 | 否 | 结息方式 示例：expire_once |
| ifPlanPayInsterest | string | 否 | 否 | 是否计划付息 示例：yes-是 no-否 |
| payInterestAmountRef | string | 否 | 否 | 付息现金流 |
| payInsterestStartDate | string | 否 | 否 | 付息起息日 示例：2023-03-01 |
| payInsterestEndDate | string | 否 | 否 | 付息止息日 示例：2024-03-01 |
| tradeAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息金额(计息币种) 示例：40 |
| adjustTAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息调整后金额(计息币种) 示例：40 |
| appointRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 利息约定汇率 |
| payInsterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息金额(协议币种) 示例：40 |
| diffAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息调整差额(协议币种) 示例：0 |
| fundPaymentMode | string | 否 | 否 | 资金支付模式 示例：1 |
| deductFlag | string | 否 | 否 | 是否减免 示例：no |
| expectDate | string | 否 | 否 | 期望付款日 示例：2024-03-01 |
| realAmountInterCurr | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际付息金额（计息币种） 示例：40 |
| rateType | string | 否 | 否 | 汇率类型 示例：1525696886140831495 |
| rate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 汇率 示例：1 |
| functionalCurrencyAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息金额(本币币种) 示例：40 |
| realAmountFunCurr | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际付息金额（本币币种） 示例：40 |
| settleStatus | string | 否 | 否 | 结算状态 示例：0-待结算 2-结算成功 |
| settleMethod | string | 否 | 否 | 结算方式 示例：1525698921952182428 |
| ourBankAccount | string | 否 | 否 | 本方银行账户 示例：1658459771276099590 |
| otherType | string | 否 | 否 | 对方类型 示例：TBOT0007 |
| otherBankAccount | string | 否 | 否 | 对方银行账号 |
| otherAccountName | string | 否 | 否 | 对方账户名称 |
| otherBankType | string | 否 | 否 | 对方账户银行类别 |
| otherOpenAccountBank | string | 否 | 否 | 对方账户开户行 |
| otherAccountUnitBankNum | string | 否 | 否 | 对方账户联行号 |
| postscriptInfo | string | 否 | 否 | 附言 |
| abstractInfo | string | 否 | 否 | 摘要 |
| interestContractedRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 利息约定汇率 示例：1 |
| associatedBankStatements | string | 否 | 否 | 关联银行对账单id |
| associatedClaimForm | string | 否 | 否 | 关联认领单id |
| deductInterestInterCurrAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免利息(计息币种) 示例：0 |
| incorporationNum | string | 否 | 否 | 财资统一对账码 |
| otherTypeObject | string | 否 | 否 | 资金业务对象银行账户id（对方银行账号伙伴档案单据编号） |
| deductInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免利息（协议币种） 示例：0 |
| debtOffsetInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 债务抵销利息（计息币种） 示例：0 |
| interestBearTransCurrency | string | 否 | 否 | 计息交易币种 示例：1649462390317645827 |
| compoundInterestProtocolCurrencyAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 复利金额合计(协议币种) 示例：0 |
| settleParam | string | 否 | 否 | 结算集成参数:资金结算stwb,不结算no 示例：stwb |
| debtOffset | string | 否 | 否 | 是否债务抵销 示例：no |
| taxInterestFunctionCurrencyAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 代扣税费后付息金额(本币币种) 示例：40 |
| action | string | 否 | 否 | 单据状态 示例：保存save 审批submit |
| settledAddition | string | 否 | 否 | 已结算补单 示例：是：yes；否：no |

## 3. 请求示例

Url: /yonbip/ctm/fm/payinterest/openapi/create?access_token=访问令牌
Body: {
	"accentity": "星星科技",
	"accentityRaw": "1530661876902920193",
	"sumPiMode": "1-借据单笔 2-协议按日汇总",
	"protocolNumber": "协议号",
	"debtcode": "借据号",
	"interestSettlementMethod": "expire_once",
	"ifPlanPayInsterest": "yes-是 no-否",
	"payInterestAmountRef": "",
	"payInsterestStartDate": "2023-03-01",
	"payInsterestEndDate": "2024-03-01",
	"tradeAmount": 40,
	"adjustTAmount": 40,
	"appointRate": 0,
	"payInsterestAmount": 40,
	"diffAmount": 0,
	"fundPaymentMode": "1",
	"deductFlag": "no",
	"expectDate": "2024-03-01",
	"realAmountInterCurr": 40,
	"rateType": "1525696886140831495",
	"rate": 1,
	"functionalCurrencyAmount": 40,
	"realAmountFunCurr": 40,
	"settleStatus": "0-待结算 2-结算成功",
	"settleMethod": "1525698921952182428",
	"ourBankAccount": "1658459771276099590",
	"otherType": "TBOT0007",
	"otherBankAccount": "",
	"otherAccountName": "",
	"otherBankType": "",
	"otherOpenAccountBank": "",
	"otherAccountUnitBankNum": "",
	"postscriptInfo": "",
	"abstractInfo": "",
	"interestContractedRate": 1,
	"associatedBankStatements": "",
	"associatedClaimForm": "",
	"deductInterestInterCurrAmount": 0,
	"incorporationNum": "",
	"otherTypeObject": "",
	"deductInterestAmount": 0,
	"debtOffsetInterestAmount": 0,
	"interestBearTransCurrency": "1649462390317645827",
	"compoundInterestProtocolCurrencyAmount": 0,
	"settleParam": "stwb",
	"debtOffset": "no",
	"taxInterestFunctionCurrencyAmount": 40,
	"action": "保存save 审批submit",
	"settledAddition": "是：yes；否：no"
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

1	2025-09-09

新增

请求参数 settledAddition

更新

请求参数 settleStatus

2	2025-06-26

新增

请求参数 action

更新

请求参数 (10)

删除

请求参数 (74)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

