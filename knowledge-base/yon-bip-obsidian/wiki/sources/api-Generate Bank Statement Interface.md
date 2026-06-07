---
title: "生成银行对账单接口"
apiId: "1564987461815238658"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Transaction Record"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Transaction Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 生成银行对账单接口

> `ContentType	application/json` 请求方式	POST | 分类: Account Transaction Record (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmp/createBankReconciliation

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
| bankaccount | string | 否 | 是 | 银行账户_银行账号 |
| statementno | string | 否 | 否 | 对账单行号 |
| bank_seq_no | string | 否 | 是 | 银行交易流水号 |
| thirdserialno | string | 否 | 是 | 第三方流水号 |
| tran_date | Date | 否 | 是 | 交易日期 |
| dc_flag | short | 否 | 是 | 借贷标识：1借；2贷 |
| tran_amt | BigDecimal | 否 | 是 | 交易金额 |
| acct_bal | BigDecimal | 否 | 是 | 余额 |
| to_acct_no | string | 否 | 否 | 对方账号 |
| to_acct_name | string | 否 | 否 | 对方户名 |
| to_acct_bank | string | 否 | 否 | 对方开户行 |
| to_acct_bank_name | string | 否 | 否 | 对方开户行名 |
| use_name | string | 否 | 否 | 用途 |
| remark | string | 否 | 否 | 摘要 |
| bankcheckno | string | 否 | 否 | 银行对账编号 |
| accentity | string | 否 | 是 | 账户使用组织编码 |
| currency | string | 否 | 是 | 币种编码 |
| defines | object | 否 | 否 | 表头自由自定义项 |
| id | string | 否 | 否 | 表头自由自定义项id，更新操作时必填 |
| define1 | string | 否 | 否 | 表头自由自定义项1 |
| define2 | string | 否 | 否 | 表头自由自定义项2 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/createBankReconciliation?access_token=访问令牌
Body: {
	"bankaccount": "",
	"statementno": "",
	"bank_seq_no": "",
	"thirdserialno": "",
	"tran_date": "",
	"dc_flag": 0,
	"tran_amt": 0,
	"acct_bal": 0,
	"to_acct_no": "",
	"to_acct_name": "",
	"to_acct_bank": "",
	"to_acct_bank_name": "",
	"use_name": "",
	"remark": "",
	"bankcheckno": "",
	"accentity": "",
	"currency": "",
	"defines": {
		"id": "",
		"define1": "",
		"define2": ""
	}
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

