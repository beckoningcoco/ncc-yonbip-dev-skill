---
title: "银行对账单批量更新"
apiId: "2054677462280306693"
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

# 银行对账单批量更新

> `ContentType	application/json` 请求方式	POST | 分类: Bank Transaction Processing (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/cmp/bankReconciliationBatchUpdate

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
| id | string | 否 | 否 | 交易流水id |
| unique_no | string | 否 | 否 | 银企联流水唯一码 |
| bank_seq_no | string | 否 | 否 | 银行交易流水号 |
| thirdserialno | string | 否 | 否 | 第三方流水号 |
| tran_date | Date | 否 | 否 | 交易日期 |
| dc_flag | long | 否 | 否 | 收付方向：1支出；2收入 |
| tran_amt | BigDecimal | 否 | 否 | 交易金额 |
| acct_bal | BigDecimal | 否 | 否 | 余额 |
| to_acct_no | string | 否 | 否 | 对方账号 |
| to_acct_name | string | 否 | 否 | 对方户名 |
| to_acct_bank | string | 否 | 否 | 对方开户行 |
| to_acct_bank_name | string | 否 | 否 | 对方开户行名 |
| use_name | string | 否 | 否 | 用途 |
| remark | string | 否 | 否 | 摘要 |
| tran_time | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 交易时间 |
| serialdealendstate | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 流水处理完结状态:0 未完结，1已完结 示例：示例：1 流水处理已结束，不允许进行生单、关联操作 |
| serialdealtype | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 流水认领处理方式:1 收付单据关联，2 收付单据生单，3 业务凭据关联?，4 异构系统处理 示例：示例: 4 异构从BIP获取流水并生成收付款单，该流水在BIP不允许生单，只进行关联操作； 如通过接口进行关联\\取消关联，该字段需全部传递为“4” |
| associationstatus | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 业务关联状态:0未关联，1已关联 示例：示例：1 流水已关联单据但未完结（如部分认领），如全部完结需同时更新流水处理完结状态为“1” |
| isparsesmartcheckno | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 流水支持处理方式：1 仅关联 0 生单和关联；为空时默认为0，为'1'时，该笔流水不允许做生单操作，只允许与收付单据进行关联 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankReconciliationBatchUpdate?access_token=访问令牌
Body: [{
	"id": "",
	"unique_no": "",
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
	"tran_time": "2026-06-07 12:09:02",
	"serialdealendstate": NaN,
	"serialdealtype": NaN,
	"associationstatus": NaN,
	"isparsesmartcheckno": 0
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
| message | string | 否 | 接口返回信息 示例：成功 |
| data | object | 是 | 返回数据 |
| id | string | 否 | 交易流水id 示例：XXXX |
| bankseqno | string | 否 | 交易流水号 示例：seq_001 |
| smartcheckno | string | 否 | 财资统一对账码:用于流水与结算单自动关联 示例：A1234BCD |
| code | string | 否 | 返回码，成功还是失败;200成功，其他失败 示例：200 |
| unique_no | string | 否 | 银企联流水唯一码 |
| message | string | 否 | 失败原因 示例：交易流水号【XXX】、【YYY】已发生后续业务，无法进行更新，请检查！ |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": [
		{
			"id": "XXXX",
			"bankseqno": "seq_001",
			"smartcheckno": "A1234BCD",
			"code": "200",
			"unique_no": "",
			"message": "交易流水号【XXX】、【YYY】已发生后续业务，无法进行更新，请检查！"
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

2	2025-11-06

更新

请求说明

新增

请求参数 unique_no

更新

请求参数 id

更新

请求参数 serialdealtype

新增

返回参数 unique_no

3	2025-05-14

更新

请求说明

增加集成API

4	2025-05-06

新增

请求参数 isparsesmartcheckno

更新

返回参数 smartcheckno

更新请求参数说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

