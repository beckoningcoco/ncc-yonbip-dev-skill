---
title: "银行对账单池保存"
apiId: "1705963896272584709"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Statement Pool"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Statement Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行对账单池保存

> `ContentType	application/json` 请求方式	POST | 分类: Bank Statement Pool (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/revenue/dataimport/revBankPayDataInputBill

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| sales_org_id | string | 否 | 否 | 业务组织，传id或code，示例：000001 |
| finance_org_id | string | 否 | 是 | 会计主体 |
| sales_channel_id | string | 否 | 否 | 销售渠道，传id或code，示例：000047 |
| payment_channel_id | string | 否 | 否 | 支付渠道，传id或code，示例：00006 |
| busi_no | string | 否 | 是 | 业务单号 |
| bank_trans_no | string | 否 | 是 | 银行交易流水号 |
| biz_type | string | 否 | 否 | 收付类型（0-收款、1-退款） |
| trans_date | Date | 否 | 是 | 交易日期 |
| trans_time | DateTime | 否 | 否 | 交易时间 |
| busi_date | Date | 否 | 是 | 账务日期，该交易的账务处理日期，一般指定交易日期 |
| currency_id | string | 否 | 是 | 币种，传id或code，示例：CNY |
| trans_amt | BigDecimal | 否 | 是 | 交易金额 |
| balance | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 余额 |
| rcv_bank_acc | string | 否 | 是 | 本方银行账号，收款银行账户账号 |
| ctpt_bank_acc | string | 否 | 是 | 对方银行账号，付款银行账户账号 |
| ctpt_acc_name | string | 否 | 否 | 对方银行户名，付款银行账户名称 |
| ctpt_bank_acc_name | string | 否 | 否 | 对方银行名称，付款银行的名称，如工商银行 |
| ctpt_bank_branch_name | string | 否 | 否 | 对方开户行名称 |
| ctpt_bank_branch_code | string | 否 | 否 | 对方开户行行号 |
| remark | string | 否 | 否 | 备注 |
| purpose | string | 否 | 否 | 用途 |
| summary | string | 否 | 否 | 摘要 |
| store_id | string | 否 | 否 | 门店 |
| bustype | string | 否 | 否 | 交易类型，传id或code，示例：ZX-012 |
| trans_postscript | string | 否 | 否 | 交易附言 |
| source_unique | string | 否 | 否 | 来源单据主键 |
| batch_no | string | 否 | 是 | 批次号 |
| data_source | string | 否 | 是 | 数据来源 |
| creator | string | 否 | 否 | 创建人，传用户id或code；若未传，则为“默认用户” |
| trans_rec_status | string | 否 | 否 | 交易对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| fund_rec_status | string | 否 | 否 | 资金对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| pool_cash_rec_status | string | 否 | 否 | 现金对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| bank_type | string | 否 | 否 | 本方银行类别 |
| customer | string | 否 | 否 | 客户 |

## 3. 请求示例

Url: /yonbip/AMP/revenue/dataimport/revBankPayDataInputBill?access_token=访问令牌
Body: [{
	"sales_org_id": "",
	"finance_org_id": "",
	"sales_channel_id": "",
	"payment_channel_id": "",
	"busi_no": "",
	"bank_trans_no": "",
	"biz_type": "",
	"trans_date": "",
	"trans_time": "",
	"busi_date": "",
	"currency_id": "",
	"trans_amt": 0,
	"balance": 0,
	"rcv_bank_acc": "",
	"ctpt_bank_acc": "",
	"ctpt_acc_name": "",
	"ctpt_bank_acc_name": "",
	"ctpt_bank_branch_name": "",
	"ctpt_bank_branch_code": "",
	"remark": "",
	"purpose": "",
	"summary": "",
	"store_id": "",
	"bustype": "",
	"trans_postscript": "",
	"source_unique": "",
	"batch_no": "",
	"data_source": "",
	"creator": "",
	"trans_rec_status": "",
	"fund_rec_status": "",
	"pool_cash_rec_status": "",
	"bank_type": "",
	"customer": ""
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态标识 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应体 |
| count | int | 否 | 总条数 |
| successCount | int | 否 | 成功数量 |
| failCount | int | 否 | 失败数量 |
| messages | object | 是 | 保存失败的数据ID及原因 |
| infos | object | 是 | 保存成功的数据集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "",
					"targetUnique": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

20000000	接口请求异常	接口请求返回信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-02

更新

请求说明

新增

请求参数 customer

更新

请求参数 (34)

2	2025-10-16

新增

请求参数 balance

3	2025-07-31

新增

请求参数 bank_type

改名字

4	2025-06-25

新增

请求参数 trans_rec_status

新增

请求参数 fund_rec_status

新增

请求参数 pool_cash_rec_status

删除

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

