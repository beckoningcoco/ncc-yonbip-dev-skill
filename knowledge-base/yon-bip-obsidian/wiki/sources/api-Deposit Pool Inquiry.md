---
title: "缴存单池查询"
apiId: "2215911015506771977"
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

# 缴存单池查询

> `ContentType	application/json` 请求方式	POST | 分类: Deposit Receipt Pool (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/depositReceipt/query

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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 分页大小 示例：100 默认值：100 |
| bill_date_begin | string | 否 | 否 | 单据日期开始时间(格式为:yyyy-MM-dd) 示例：2022-11-09 |
| bill_date_end | string | 否 | 否 | 单据日期结束时间(格式为:yyyy-MM-dd) 示例：2022-11-09 |
| pubts_begin | string | 否 | 否 | 时间戳开始时间(格式为:yyyy-MM-dd HH:mm:ss)  示例：2022-11-09 00:00:00 |
| pubts_end | string | 否 | 否 | 时间戳结束时间(格式为:yyyy-MM-dd HH:mm:ss)  示例：2022-11-09 00:00:00 |
| busi_no | string | 否 | 否 | 业务单号 |
| code | string | 否 | 否 | 单据编号 |
| sales_org_id | string | 否 | 否 | 销售组织，传id或code |
| finance_org_id | string | 否 | 否 | 会计主体，传id或code |
| sales_channel_id | string | 否 | 否 | 销售渠道，传id或code |
| payment_channel_id | string | 否 | 否 | 支付渠道，传id或code |
| store_id | string | 否 | 否 | 门店，传id或code |
| bustype | string | 否 | 否 | 交易类型编码 |
| source_unique | string | 否 | 否 | 来源单据唯一标识，校验唯一性 |
| batch_no | string | 否 | 否 | 批次号，一批数据指定一个批次号 |
| data_source | string | 否 | 否 | 数据来源（0：手工新增；1：手工导入；2：集成方案接入；3：接口接入） |
| creator | string | 否 | 否 | 创建人，传用户的id或code |
| pool_cash_rec_status | string | 否 | 否 | 现金对账状态未对符；(0 未对符；1 已对符；11 未对账；12 对账中；13 无需对账） |
| pool_trans_rec_status | string | 否 | 否 | 交易对账状态（0 未对符；1 已对符；11 未对账；12 对账中；13 无需对账） |
| pool_open_acc_status | string | 否 | 否 | 立账状态（0 未立账；1 已立账） |

## 3. 请求示例

Url: /yonbip/EFI/revenue/depositReceipt/query?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"bill_date_begin": "2022-11-09",
	"bill_date_end": "2022-11-09",
	"pubts_begin": "2022-11-09 00:00:00",
	"pubts_end": "2022-11-09 00:00:00",
	"busi_no": "",
	"code": "",
	"sales_org_id": "",
	"finance_org_id": "",
	"sales_channel_id": "",
	"payment_channel_id": "",
	"store_id": "",
	"bustype": "",
	"source_unique": "",
	"batch_no": "",
	"data_source": "",
	"creator": "",
	"pool_cash_rec_status": "",
	"pool_trans_rec_status": "",
	"pool_open_acc_status": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200；调用失败时返回999 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功！ |
| data | object | 否 | data |
| pageIndex | string | 否 | 当前页数 示例：1 |
| pageSize | string | 否 | 分页大小 示例：100 |
| pageCount | string | 否 | 总共页数 示例：1 |
| recordCount | string | 否 | 总条数 示例：1 |
| recordList | object | 是 | 结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": "1",
		"pageSize": "100",
		"pageCount": "1",
		"recordCount": "1",
		"recordList": [
			{
				"code": "",
				"sales_org_id": "",
				"sales_org_code": "",
				"finance_org_id": "",
				"finance_org_code": "",
				"sales_channel_id": "",
				"sales_channel_code": "",
				"payment_channel_id": "",
				"payment_channel_code": "",
				"store_id": "",
				"store_code": "",
				"bank_account": "",
				"virtual_account": "",
				"customer_id": "",
				"customer_code": "",
				"last_ret_amt": "",
				"rcv_amt": "",
				"curr_ret_amt": "",
				"fake_amt": "",
				"over_payment_amt": "",
				"under_payment_amt": "",
				"deposit_amt": "",
				"currency": "",
				"currency_code": "",
				"bill_source": "",
				"bill_date": "",
				"busi_date": "",
				"busi_no": "",
				"remark": "",
				"bustype": "",
				"character_define": "",
				"source_unique": "",
				"batch_no": "",
				"data_source": "",
				"creator": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

20000000	接口请求异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-04

新增

请求参数 busi_no

新增

返回参数 busi_no

更新接口信息


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

