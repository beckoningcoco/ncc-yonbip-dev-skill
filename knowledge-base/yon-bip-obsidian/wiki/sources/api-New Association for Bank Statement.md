---
title: "银行对账单关联关系新增"
apiId: "1748293994520510466"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Transaction Processing"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Transaction Processing]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行对账单关联关系新增

> `ContentType	application/json` 请求方式	POST | 分类: Bank Transaction Processing (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmp/bankReconciliationInsertRelation

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity_name | string | 否 | 否 | 账户使用组织名称，编码和名称同时有值时，以编码为主 |
| accentity_code | string | 否 | 否 | 账户使用组织编码，编码和ID同时有值时，以ID为主 |
| accentity | string | 否 | 否 | 账户使用组织id，ID有值时，以ID为主 |
| bankaccount | string | 否 | 否 | 银行账户id，ID有值时，以ID为主 |
| bankaccount_account | string | 否 | 是 | 银行账户账号 |
| bank_seq_no | string | 否 | 是 | 银行交易流水号 |
| tran_date | Date | 否 | 否 | 交易日期 |
| dc_flag | short | 否 | 是 | 收支标识：1支出；2收入 |
| tran_amt | BigDecimal | 否 | 是 | 交易金额 |
| currency | string | 否 | 否 | 币种id，ID有值时，以ID为主 |
| currency_name | string | 否 | 是 | 币种名称 |
| BankReconciliationbusrelation_b | object | 否 | 是 | 关联信息 |
| billtype | string | 否 | 是 | 如单据为BIP系统产生单据，需传入对应编码：12：转账单，14：外币兑换单，17：资金收款单，18：资金付款单 ；如非BIP系统单据，直接传入名称即可 |
| vouchdate | Date | 否 | 否 | 业务单据日期 |
| billcode | string | 否 | 是 | 业务单据编号。如为BIP系统的单据，需传递BIP系统的单据编号 |
| amountmoney | BigDecimal | 否 | 否 | 业务单据金额 |
| busid | string | 否 | 否 | 业务单据子表id，如为BIP系统资金收款单或资金付款单单据，可传递想要单据的子表ID |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankReconciliationInsertRelation?access_token=访问令牌
Body: [{
	"accentity_name": "",
	"accentity_code": "",
	"accentity": "",
	"bankaccount": "",
	"bankaccount_account": "",
	"bank_seq_no": "",
	"tran_date": "",
	"dc_flag": 0,
	"tran_amt": 0,
	"currency": "",
	"currency_name": "",
	"BankReconciliationbusrelation_b": {
		"billtype": "",
		"vouchdate": "",
		"billcode": "",
		"amountmoney": 0,
		"busid": ""
	}
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码：200 接收成功，999 接收失败 示例：200 |
| message | string | 否 | 提示信息 |
| data | object | 是 | 返回数据 |
| bank_seq_no | string | 否 | 银行流水号 示例：16546512312 |
| msg | string | 否 | 操作结果 示例：新增关联信息成功! |
| flag | string | 否 | 成功失败标识 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"bank_seq_no": "16546512312",
			"msg": "新增关联信息成功!",
			"flag": "success"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403000	接口请求异常！异常详细信息：XXXXX	根据错误提示修改请求参数或者选择正确的业务单据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-19

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

