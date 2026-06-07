---
title: "缴存单池保存"
apiId: "2211523414359277577"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Deposit Receipt Pool"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Deposit Receipt Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 缴存单池保存

> `ContentType	application/json` 请求方式	POST | 分类: Deposit Receipt Pool (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/revenue/depositReceipt/batchInsert

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| code | string | 否 | 否 | 单据编号 |
| sales_org_id | string | 否 | 是 | 销售组织，传id或code，示例：000001 |
| finance_org_id | string | 否 | 否 | 会计主体，传id或code，示例：000001 |
| sales_channel_id | string | 否 | 否 | 销售渠道，传id或code，示例：000047 |
| payment_channel_id | string | 否 | 否 | 支付渠道，传id或code，示例：000006 |
| store_id | string | 否 | 否 | 门店，传id或code，示例：000037 |
| bank_account | string | 否 | 否 | 银行账户，传入银行账户id或账号 |
| virtual_account | string | 否 | 否 | 虚拟账户，传入商户号 |
| customer_id | string | 否 | 否 | 客户，传入id或code |
| last_ret_amt | BigDecimal | 否 | 否 | 上次留存金额，上次存款后留存的现金 |
| rcv_amt | BigDecimal | 否 | 是 | 收款金额，记录应收款的现金金额 |
| curr_ret_amt | BigDecimal | 否 | 否 | 本次留存金额，本次存款后留存的现金 |
| fake_amt | BigDecimal | 否 | 否 | 伪钞，记录收到伪钞的金额 |
| over_payment_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 长款，人工核对后，记录多收到的现金 |
| under_payment_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 短款，人工核对后，记录少收到的现金 |
| deposit_amt | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 本次缴存金额，本次存款的现金 |
| currency_id | string | 否 | 是 | 币种，传id或code，示例：CNY |
| bill_source | string | 否 | 否 | 单据来源，上游单据类型 |
| bill_date | Date | 否 | 是 | 单据日期，向银行存款的日期 |
| busi_date | Date | 否 | 是 | 账务日期，该交易的账务处理日期，一般指定交易日期 |
| busi_no | string | 否 | 否 | 业务单号 |
| remark | string | 否 | 否 | 备注 |
| bustype | string | 否 | 否 | 交易类型，传id或code |
| source_unique | string | 否 | 是 | 来源单据唯一标识 |
| batch_no | string | 否 | 否 | 批次号，一批数据指定一个批次号 |
| data_source | string | 否 | 否 | 数据来源，传3（接口接入） |
| creator | string | 否 | 否 | 创建人，传用户id或code；若未传，则为“默认用户”； |
| pool_trans_rec_status | string | 否 | 否 | 交易对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| pool_cash_rec_status | string | 否 | 否 | 现金对账状态，无需对账传13，未对账传11，不传默认为未对账 |

## 3. 请求示例

Url: /yonbip/EFI/revenue/depositReceipt/batchInsert?access_token=访问令牌
Body: [{
	"code": "",
	"sales_org_id": "",
	"finance_org_id": "",
	"sales_channel_id": "",
	"payment_channel_id": "",
	"store_id": "",
	"bank_account": "",
	"virtual_account": "",
	"customer_id": "",
	"last_ret_amt": 0,
	"rcv_amt": 0,
	"curr_ret_amt": 0,
	"fake_amt": 0,
	"over_payment_amt": 0,
	"under_payment_amt": 0,
	"deposit_amt": 0,
	"currency_id": "",
	"bill_source": "",
	"bill_date": "",
	"busi_date": "",
	"busi_no": "",
	"remark": "",
	"bustype": "",
	"source_unique": "",
	"batch_no": "",
	"data_source": "",
	"creator": "",
	"pool_trans_rec_status": "",
	"pool_cash_rec_status": ""
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

2	2025-08-28

新增

请求参数 busi_no

增加业务单号字段

3	2025-06-25

新增

请求参数 pool_trans_rec_status

新增

请求参数 pool_cash_rec_status


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

