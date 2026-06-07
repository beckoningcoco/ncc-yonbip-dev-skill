---
title: "银行对账单保存"
apiId: "1658513673205841929"
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

# 银行对账单保存

> `ContentType	application/json` 请求方式	POST | 分类: Bank Transaction Processing (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/cmp/bankReconciliationSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

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
| bank_seq_no | string | 否 | 否 | 银行交易流水号 |
| thirdserialno | string | 否 | 是 | 第三方流水号 |
| tran_date | Date | 否 | 是 | 交易日期 |
| dc_flag | short | 否 | 是 | 收付方向 1：支出 2：收入 |
| tran_amt | BigDecimal | 否 | 是 | 交易金额 |
| acct_bal | BigDecimal | 否 | 否 | 余额 |
| to_acct_no | string | 否 | 否 | 对方账号 |
| to_acct_name | string | 否 | 否 | 对方户名 |
| to_acct_bank | string | 否 | 否 | 对方开户行 |
| to_acct_bank_name | string | 否 | 否 | 对方开户行名 |
| use_name | string | 否 | 否 | 用途 |
| remark | string | 否 | 否 | 摘要 |
| bankcheckno | string | 否 | 否 | 银行对账编号 |
| accentity | string | 否 | 否 | 账户使用组织编码 |
| currency | string | 否 | 是 | 币种编码 |
| defines | object | 否 | 否 | 表头自由自定义项 |
| id | string | 否 | 否 | 表头自由自定义项id |
| define1 | string | 否 | 否 | 表头自由自定义项1 |
| define2 | string | 否 | 否 | 表头自由自定义项2 |
| billprocessflag | short | 否 | 否 | 回单处理标识：0无需回单中台处理；1需要回单中台处理；2人工确认。 默认值：1 |
| tran_time | DateTime | 否 | 否 | 交易时间 |
| isautoublish | short | 否 | 否 | 是否自动发布 |
| detailReceiptRelationCode | string | 否 | 否 | 流水回单关联码，非必填。传递后可用于流水与回单进行关联 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankReconciliationSave?access_token=访问令牌
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
	},
	"billprocessflag": 0,
	"tran_time": "",
	"isautoublish": 0,
	"detailReceiptRelationCode": ""
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
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 操作结果 示例：操作成功 |
| data | object | 否 | 新增的实体返回值 |
| id | long | 否 | 主键ID 示例：1666610425297895430 |
| accentity | string | 否 | 账户使用组织 示例：1649405095559823369 |
| currency | string | 否 | 币种 示例：1493014220928712733 |
| bankaccount | string | 否 | 银行账户 示例：1649412671888424964 |
| bank_seq_no | string | 否 | 交易流水号 示例：1113 |
| thirdserialno | string | 否 | 第三方流水号 示例：1112 |
| tran_date | Date | 否 | 交易日期 示例：2023-02-24 |
| dc_flag | int | 否 | 借贷方向：1借；2贷 |
| tran_amt | BigDecimal | 否 | 交易金额 示例：330 |
| smartcheckno | string | 否 | 财资统一对账码:用于流水与结算单自动关联 示例：_qwesad21_ |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 1666610425297895430,
		"accentity": "1649405095559823369",
		"currency": "1493014220928712733",
		"bankaccount": "1649412671888424964",
		"bank_seq_no": "1113",
		"thirdserialno": "1112",
		"tran_date": "2023-02-24",
		"dc_flag": 0,
		"tran_amt": 330,
		"smartcheckno": "_qwesad21_"
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

2	2025-06-27

更新

请求说明

新增

请求参数 detailReceiptRelationCode

更新

请求参数 dc_flag

更新

请求参数 accentity

更新

请求参数 billprocessflag

新增

返回参数 smartcheckno

3	2025-06-25

更新

请求说明

新增

请求参数 detailReceiptRelationCode

更新

请求参数 dc_flag

更新

请求参数 accentity

更新

请求参数 billprocessflag

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

