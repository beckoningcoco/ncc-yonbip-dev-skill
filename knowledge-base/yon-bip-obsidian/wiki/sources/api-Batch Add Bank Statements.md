---
title: "银行对账单批量新增"
apiId: "1791407632148332545"
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

# 银行对账单批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Bank Transaction Processing (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/cmp/bankReconciliationBatchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| bankaccount | string | 否 | 是 | 企业银行账号 |
| thirdserialno | string | 否 | 否 | 第三方流水号 |
| bank_seq_no | string | 否 | 是 | 银行交易流水号 |
| tran_date | Date | 否 | 是 | 交易日期 |
| dc_flag | long | 否 | 是 | 收付方向：1支出；2收入 |
| tran_amt | BigDecimal | 否 | 是 | 交易金额 |
| acct_bal | BigDecimal | 否 | 否 | 余额 |
| to_acct_no | string | 否 | 否 | 对方账号 |
| to_acct_name | string | 否 | 否 | 对方户名 |
| to_acct_bank | string | 否 | 否 | 对方开户行 |
| bankcheckno | string | 否 | 否 | 银行对账编号 |
| to_acct_bank_name | string | 否 | 否 | 对方开户行名 |
| use_name | string | 否 | 否 | 用途 |
| accentity | string | 否 | 否 | 账户使用组织编码 |
| currency | string | 否 | 是 | 币种编码 |
| billprocessflag | long | 否 | 否 | 回单处理标识：0无需回单中台处理；1需要回单中台处理；2人工确认。 默认值：1 |
| remark | string | 否 | 否 | 摘要 |
| bankaccount_account | string | 否 | 否 | 银行账号,和银行账户ID 不能同时为空 |
| tran_time | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 交易时间 |
| detailReceiptRelationCode | string | 否 | 否 | 流水回单关联码，非必填。传递后可用于流水与回单进行关联 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankReconciliationBatchSave?access_token=访问令牌
Body: [{
	"bankaccount": "",
	"thirdserialno": "",
	"bank_seq_no": "",
	"tran_date": "",
	"dc_flag": 0,
	"tran_amt": 0,
	"acct_bal": 0,
	"to_acct_no": "",
	"to_acct_name": "",
	"to_acct_bank": "",
	"bankcheckno": "",
	"to_acct_bank_name": "",
	"use_name": "",
	"accentity": "",
	"currency": "",
	"billprocessflag": 0,
	"remark": "",
	"bankaccount_account": "",
	"tran_time": "2026-06-07 12:09:01",
	"detailReceiptRelationCode": ""
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
| code | string | 否 | 成功状态码 示例：200 |
| data | object | 否 | 返回数据 |
| total | long | 否 | 发送总条数 示例：4 |
| errornum | long | 否 | 失败条数 示例：4 |
| successnum | long | 否 | 成功条数 示例：0 |
| success | object | 是 | 新增成功详细数据 |
| faild | object | 是 | 新增失败详细数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"total": 4,
		"errornum": 4,
		"successnum": 0,
		"success": [
			{
				"tran_date": "2023-08-17",
				"bank_seq_no": "lsh-202308180003",
				"dc_flag": 1,
				"bankaccount": "wwz-bj-gh-yhzh-01",
				"currency": "CNY",
				"tran_amt": 1001.03,
				"acct_bal": 3,
				"id": 1801598344004370400,
				"accentity": "wwz01",
				"billprocessflag": 1,
				"smartcheckno": ""
			}
		],
		"faild": [
			{
				"msg": "重复数据不允许新增！",
				"tran_date": "2023-08-17",
				"bank_seq_no": "lsh-202308180003",
				"dc_flag": 1,
				"bankaccount": "wwz-bj-gh-yhzh-01",
				"currency": "CNY",
				"tran_amt": 1001.03,
				"acct_bal": 3,
				"accentity": "wwz01",
				"billprocessflag": 1,
				"smartcheckno": "_rdfdfdsf_"
			}
		]
	}
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

2	2025-07-15

新增

请求参数 characterDef

新增特征组参数

3	2025-06-27

更新

请求参数 billprocessflag

更新

请求参数 detailReceiptRelationCode

4	2025-06-25

更新

请求参数 billprocessflag

5	2025-06-07

更新

请求说明

新增

请求参数 detailReceiptRelationCode

更新

请求参数 billprocessflag

新增

返回参数 smartcheckno

新增

返回参数 smartcheckno


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

