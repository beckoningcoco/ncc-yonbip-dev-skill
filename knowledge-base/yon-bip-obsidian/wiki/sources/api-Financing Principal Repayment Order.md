---
title: "融资还本生单"
apiId: "2120718829343997952"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financing Principal Repayment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financing Principal Repayment]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资还本生单

> `ContentType	application/json` 请求方式	POST | 分类: Financing Principal Repayment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/repayment/openapi/create

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
| accentity | string | 否 | 否 | 资金组织 示例：1530661876902920193 |
| protocolNumber | string | 否 | 是 | 协议号Id 示例：2126909646650212354 |
| debtcode | string | 否 | 是 | 借据号Id 示例：2126909861398577161 |
| ifPlanRepay | string | 否 | 是 | 是否计划还本yes:按照计划还本 no :不按照计划还本 示例：no |
| ifPayInterestSameTime | string | 否 | 是 | 是否同时付息yes:同时付息 no:不同时付息 示例：yes |
| interesBase | string | 否 | 否 | 提前还本计息基数借据余额:financein_balance 还本金额:repayment_amount 示例：repayment_amount |
| rpTradeAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 还本金额(本金币种)(还本结算信息) 示例：1000 |
| rpAgreementAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 还本金额(协议币种) 示例：1000.000 |
| piTradeAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息金额(计息币种)(付息结算信息) 示例：0.560 |
| bizSerialNumber | string | 否 | 否 | 业务流水号 |
| piOurBankAccount | string | 否 | 否 | 本方银行账户(付息结算信息) 示例：1658459771276099590 |
| piSettleMethod | string | 否 | 否 | 结算方式(付息结算信息) 示例：1525698921952182428 |
| repaymentDate | string | 否 | 否 | 还本日期 示例：2024-11-15 |
| rpSettleStatus | string | 否 | 否 | 结算状态(还本结算信息)0 :待结算 2:结算成功 示例：2 |
| settledAddition | string | 否 | 否 | 还本已结算补单 yes:是 no:否 示例：yes |
| piSettleStatus | string | 否 | 否 | 结算状态(付息结算信息) 0 :待结算 2:结算成功 示例：2 |
| pisettledAddition | string | 否 | 否 | 付息已结算补单 yes:是 no:否 示例：yes |
| payInterestBeginDate | string | 否 | 否 | 付息起息日 示例：2024-11-05 00:00:00 |
| payInterestEndDate | string | 否 | 否 | 付息止息日 示例：2024-11-15 |
| cashFlowReCalcMethod | string | 否 | 否 | 现金流重算方式 示例：3 |
| rpAgreementAmountRef | string | 否 | 否 | 融入的还本现金流参照 |
| payInterestAmountRef | string | 否 | 否 | 融入的付息现金流参照 |
| rpDeductInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免利息（协议币种） 示例：0 |
| debtRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 提前还本利率（%） |
| deductFlag | string | 否 | 否 | 是否减免 yes:减免 no:不减免 示例：no |
| floatValue | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 浮动值 |
| debtOffsetInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 债务抵消利息（计息币种） 示例：0 |
| rpDeductPrincipalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免本金（协议币种） 示例：0 |
| rpRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 汇率(还本结算信息) 示例：1 |
| rpOurBankAccount | string | 否 | 否 | 本方银行账户(还本结算信息) 示例：1658459771276099590 |
| payInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息金额(协议币种) 示例：0.56 |
| rpSettleMethod | string | 否 | 否 | 结算方式(还本结算信息) 示例：1525698921952182428 |
| rpDeductPrincipalLocalCurrAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免本金（本金币种） 示例：0 |
| debtOffsetPrincipalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 债务抵销本金（本金币种） 示例：0 |
| floatType | string | 否 | 否 | 浮动方式 |
| rpDeductInterestInterCurrAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免利息（计息币种） 示例：0 |
| fundPaymentMode | string | 否 | 否 | 资金支付模式 示例：1 |
| debtOffset | string | 否 | 否 | 是否债务抵销 示例：no |
| piabstractInfo | string | 否 | 否 | 付息单摘要 |
| associatedClaimForm | string | 否 | 否 | 关联认领单id 示例：21231231231231453 |
| associatedBankStatements | string | 否 | 否 | 关联银行对账单id 示例：21231231231231453464 |
| incorporationNum | string | 否 | 否 | 财资统一对账码 示例：_sfsert_ |

## 3. 请求示例

Url: /yonbip/ctm/fm/repayment/openapi/create?access_token=访问令牌
Body: {
	"accentity": "1530661876902920193",
	"protocolNumber": "2126909646650212354",
	"debtcode": "2126909861398577161",
	"ifPlanRepay": "no",
	"ifPayInterestSameTime": "yes",
	"interesBase": "repayment_amount",
	"rpTradeAmount": 1000,
	"rpAgreementAmount": 1000,
	"piTradeAmount": 0.56,
	"bizSerialNumber": "",
	"piOurBankAccount": "1658459771276099590",
	"piSettleMethod": "1525698921952182428",
	"repaymentDate": "2024-11-15",
	"rpSettleStatus": "2",
	"settledAddition": "yes",
	"piSettleStatus": "2",
	"pisettledAddition": "yes",
	"payInterestBeginDate": "2024-11-05 00:00:00",
	"payInterestEndDate": "2024-11-15",
	"cashFlowReCalcMethod": "3",
	"rpAgreementAmountRef": "",
	"payInterestAmountRef": "",
	"rpDeductInterestAmount": 0,
	"debtRate": 0,
	"deductFlag": "no",
	"floatValue": 0,
	"debtOffsetInterestAmount": 0,
	"rpDeductPrincipalAmount": 0,
	"rpRate": 1,
	"rpOurBankAccount": "1658459771276099590",
	"payInterestAmount": 0.56,
	"rpSettleMethod": "1525698921952182428",
	"rpDeductPrincipalLocalCurrAmount": 0,
	"debtOffsetPrincipalAmount": 0,
	"floatType": "",
	"rpDeductInterestInterCurrAmount": 0,
	"fundPaymentMode": "1",
	"debtOffset": "no",
	"piabstractInfo": "",
	"associatedClaimForm": "21231231231231453",
	"associatedBankStatements": "21231231231231453464",
	"incorporationNum": "_sfsert_"
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

新增

请求参数 pisettledAddition

更新

请求参数 rpSettleStatus

更新

请求参数 piSettleStatus


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

