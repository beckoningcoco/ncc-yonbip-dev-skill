---
title: "费用报账单池保存"
apiId: "1742341668082286600"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Reimbursement Document Pool"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Reimbursement Document Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用报账单池保存

> `ContentType	application/json` 请求方式	POST | 分类: Expense Reimbursement Document Pool (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/revenue/expense-claim/insertBatch

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
| sales_org_id | string | 否 | 是 | 销售组织，传id或code，示例：000001 |
| finance_org_id | string | 否 | 否 | 会计主体 |
| store_id | string | 否 | 否 | 门店，传id或code，示例：000046 |
| trans_date | Date | 否 | 是 | 交易日期 |
| expense_project_id | string | 否 | 是 | 结算项目，传所属结算项目大类下得结算项目id或code，示例：000001 |
| biz_type | string | 否 | 否 | 收付类型，0：收款；1：退款；2：提现 |
| sales_channel_id | string | 否 | 否 | 销售渠道，传id或code，示例：000001 |
| payment_channel_id | string | 否 | 否 | 支付渠道，传id或code，示例：000011 |
| merchant_no | string | 否 | 否 | 商户号，三方支付给每个收款商户分配商户号，传商户号的id或code,示例：000011 |
| merchant_order_no | string | 否 | 否 | 商户订单号，收款商户收款时记录的单号 |
| summary_flag | string | 否 | 否 | 汇总标识（传入的数据时汇总数据或明细数据），0：明细；1：汇总 |
| expense_amt | BigDecimal | 否 | 是 | 费用金额 |
| tax_exclusive_amt | BigDecimal | 否 | 否 | 不含税金额 |
| tax_rate_id | string | 否 | 否 | 税率编码，传税目档案ID及税目编码 |
| pay_serial_no | string | 否 | 否 | 支付流水号，第三方支付平台（如支付宝、微信等）生成单号，当汇总标识为明细时，必传 |
| expense_department_id | string | 否 | 否 | 费用承担部门 |
| busi_date | Date | 否 | 是 | 账务日期，该交易的账务处理日期，一般用交易日期赋值 |
| currency_id | string | 否 | 是 | 币种，传id或code，示例：CNY |
| bustype | string | 否 | 否 | 交易类型 |
| source_unique | string | 否 | 否 | 来源单据主键 |
| batch_no | string | 否 | 是 | 批次号，一批数据指定一个批次号 |
| data_source | string | 否 | 是 | 数据来源，传3（接口接入） |
| creator | string | 否 | 否 | 创建人，传用户id或code；若未传，则为“默认用户”； |
| pool_trans_rec_status | string | 否 | 否 | 交易对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| vendor | string | 否 | 否 | 供应商，传id或code |

## 3. 请求示例

Url: /yonbip/AMP/revenue/expense-claim/insertBatch?access_token=访问令牌
Body: [{
	"sales_org_id": "",
	"finance_org_id": "",
	"store_id": "",
	"trans_date": "",
	"expense_project_id": "",
	"biz_type": "",
	"sales_channel_id": "",
	"payment_channel_id": "",
	"merchant_no": "",
	"merchant_order_no": "",
	"summary_flag": "",
	"expense_amt": 0,
	"tax_exclusive_amt": 0,
	"tax_rate_id": "",
	"pay_serial_no": "",
	"expense_department_id": "",
	"busi_date": "",
	"currency_id": "",
	"bustype": "",
	"source_unique": "",
	"batch_no": "",
	"data_source": "",
	"creator": "",
	"pool_trans_rec_status": "",
	"vendor": ""
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

20000000	接口请求异常	接口返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-02

更新

请求说明

用户身份透传

2	2025-09-26

更新

请求参数 expense_project_id

删除

请求参数 parse_rule_id

3	2025-06-20

新增

请求参数 pool_trans_rec_status

新增

请求参数 vendor

新增

请求参数 parse_rule_id


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

