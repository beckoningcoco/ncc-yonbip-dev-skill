---
title: "批量查询银行账户交易明细"
apiId: "2122935101166190595"
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

# 批量查询银行账户交易明细

> `ContentType	application/json` 请求方式	POST | 分类: Account Transaction Record (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmp/bankaccount/batchQueryTransDetail

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
| data | object | 是 | 是 | 账户数据 最大请求量：100 |
| acct_no | string | 否 | 是 | 银行账号 |
| acct_name | string | 否 | 是 | 银行账户户名 |
| curr_code | string | 否 | 是 | 币种编码，如CNY |
| begin_date | string | 否 | 是 | 开始日期，如2023-11-21(兼容20231221) |
| end_date | string | 否 | 是 | 结束日期，最大范围为30天，如2023-12-21(兼容20231221)；需晚于等于开始日期，早于等于当前日期 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankaccount/batchQueryTransDetail?access_token=访问令牌
Body: {
	"data": [
		{
			"acct_no": "",
			"acct_name": "",
			"curr_code": "",
			"begin_date": "",
			"end_date": ""
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message |
| data | object | 是 | data |
| acct_no | string | 否 | 本方账号 |
| acct_name | string | 否 | 本方账户名称 |
| tran_date | string | 否 | 交易日期 |
| tran_time | string | 否 | 交易时间 |
| dc_flag | string | 否 | 收付方向 |
| bank_seq_no | string | 否 | 银行交易流水号 |
| to_acct_no | string | 否 | 对方账号 |
| to_acct_name | string | 否 | 对方户名 |
| to_acct_bank | string | 否 | 对方开户行 |
| to_acct_bank_name | string | 否 | 对方开户行名 |
| curr_code | string | 否 | 币种 |
| cash_flag | string | 否 | 钞汇标志 |
| acct_bal | number |
| 小数位数:2,最大长度:10 | 否 | 余额 |
| tran_amt | number |
| 小数位数:2,最大长度:10 | 否 | 交易金额 |
| oper | string | 否 | 操作员 |
| value_date | string | 否 | 起息日 |
| use_name | string | 否 | 用途 |
| remark | string | 否 | 摘要 |
| bank_check_code | string | 否 | 银行明细对账编号 |
| remark01 | string | 否 | 扩展附言 |
| pay_use_desc | string | 否 | 汇款用途 |
| pubts | string | 否 | 时间戳 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"acct_no": "",
			"acct_name": "",
			"tran_date": "",
			"tran_time": "",
			"dc_flag": "",
			"bank_seq_no": "",
			"to_acct_no": "",
			"to_acct_name": "",
			"to_acct_bank": "",
			"to_acct_bank_name": "",
			"curr_code": "",
			"cash_flag": "",
			"acct_bal": 0,
			"tran_amt": 0,
			"oper": "",
			"value_date": "",
			"use_name": "",
			"remark": "",
			"bank_check_code": "",
			"remark01": "",
			"pay_use_desc": "",
			"pubts": ""
		}
	]
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

