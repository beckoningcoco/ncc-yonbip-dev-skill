---
title: "三方支付账单池保存"
apiId: "1685238840976998401"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Third-Party Bill Pool"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Third-Party Bill Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 三方支付账单池保存

> `ContentType	application/json` 请求方式	POST | 分类: Third-Party Bill Pool (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/revenue/threpaybill/batchInsert

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
| finance_org_id | string | 否 | 否 | 会计主体，传id或code，示例：000001 |
| sales_channel_id | string | 否 | 否 | 销售渠道，传id或code，示例：000047 |
| payment_channel_id | string | 否 | 是 | 支付渠道，传id或code，示例：000006 |
| store_id | string | 否 | 否 | 门店，传id或code，示例：000037 |
| terminal_no | string | 否 | 否 | 终端号，一般一个门店或一个销售渠道分配一个终端号 |
| merchant_no | string | 否 | 否 | 商户号，三方支付给每个收款商户分配商户号 |
| merchant_order_no | string | 否 | 否 | 商户订单号，收款商户收款时记录的单号 |
| pay_serial_no | string | 否 | 否 | 支付流水号，第三方支付平台（如支付宝、微信等）生成单号，当汇总标识为明细时，必传 |
| bustype | string | 否 | 否 | 交易类型，传id或code |
| biz_type | string | 否 | 否 | 收付类型，0：收入；1：支出；2：提现 |
| trans_date | date |
| 格式:yyyy-MM-dd | 否 | 是 | 支付日期 |
| summary_flag | string | 否 | 否 | 汇总标识（传入的数据时汇总数据或明细数据），0：明细；1：汇总 |
| pay_amt | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 支付金额 |
| goods_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 商品金额，销售商品的金额 |
| reduce_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 优惠金额，指商家优惠金额 |
| sales_channel_subsidy | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 电商平台补贴，电商平台补贴用户金额 |
| payment_channel_subsidy | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 支付平台补贴，支付平台补贴用户金额 |
| other_subsidy1 | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 其他补贴1，政府补贴、以旧换新补贴等金额 |
| cust_fact_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 用户实付，商品金额扣除优惠、补贴金额后用户支付金额 |
| rate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 手续费费率，传小数，示例，0.03 |
| charge_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 手续费 |
| transport_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 运费 |
| influencer_ommission | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 达人佣金，达人销售商品抽成 |
| service_provider_commission | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 服务商佣金，服务商销售商品抽成 |
| channel_sharing | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 渠道分成，和渠道商分成金额 |
| other_expense1 | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 其他费用1，预留金额字段 |
| other_expense2 | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 其他费用2，预留金额字段 |
| other_expense3 | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 其他费用3，预留金额字段 |
| business_description | string | 否 | 否 | 业务描述，账单中账单的描述 |
| income_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 收入金额，账单中账单的收入金额 |
| expenditure_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 支出金额，账单中账单的支出金额 |
| account_balance | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 账户余额，账单中账单的账户余额 |
| audit_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 清算金额，三方支付扣除手续费等之后向商户结算的金额 |
| cash_rec_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 清算日期，三方支付向商户结算清算金额的日期，若为空且在支付渠道维护了清算日期计算方式，则会自动计算清算日期 |
| order_date | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 下单时间，订单下单时间，格式：yyyy-mm-dd hh:mm:ss |
| pay_time | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 支付时间，支付成功的时间，格式：yyyy-mm-dd hh:mm:ss |
| currency_id | string | 否 | 是 | 币种，传id或code，示例：CNY |
| busi_no | string | 否 | 是 | 业务单号，必传，三方支付可能存在多个单号，指定一个单号作为数据追踪。若为汇总交易，则按规则编码，用作数据追踪 |
| busi_date | date |
| 格式:yyyy-MM-dd | 否 | 是 | 账务日期，该交易的账务处理日期，一般指定交易日期 |
| busi_type | string | 否 | 否 | 业务类型 |
| expense_total_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 费用总金额，该笔交易费用金额的合计 |
| describe | string | 否 | 否 | 账单说明，传入三方支付账单账单明细说明 |
| counter_part_account | string | 否 | 否 | 对方账户，传入三方支付账单中付款人账号 |
| counter_part_name | string | 否 | 否 | 对方名称，传入三方支付账单中付款人账号名称 |
| remark | string | 否 | 否 | 备注 |
| writeoff_date | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 核销日期 |
| source_liquidation_date | date |
| 格式:yyyy-MM-dd | 否 | 否 | 清算基准日期，通过该字段，及使用支付渠道参数计算清算日期 |
| source_unique | string | 否 | 否 | 来源单据唯一标识 |
| batch_no | string | 否 | 是 | 批次号，一批数据指定一个批次号 |
| data_source | string | 否 | 是 | 数据来源，（2:集成方案接入;3:接口接入） |
| creator | string | 否 | 否 | 创建人，传用户id或code；若未传，则为“默认用户”； |
| trans_rec_status | string | 否 | 否 | 交易对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| fund_rec_status | string | 否 | 否 | 资金对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| bank_type | string | 否 | 否 | 银行类别，传id或code |
| expense_flag | string | 否 | 否 | 费用标识，（1：含费用；0：不含费用；默认为0） 默认值：0 |

## 3. 请求示例

Url: /yonbip/AMP/revenue/threpaybill/batchInsert?access_token=访问令牌
Body: [{
	"sales_org_id": "",
	"finance_org_id": "",
	"sales_channel_id": "",
	"payment_channel_id": "",
	"store_id": "",
	"terminal_no": "",
	"merchant_no": "",
	"merchant_order_no": "",
	"pay_serial_no": "",
	"bustype": "",
	"biz_type": "",
	"trans_date": "2026-06-07",
	"summary_flag": "",
	"pay_amt": 0,
	"goods_amt": 0,
	"reduce_amt": 0,
	"sales_channel_subsidy": 0,
	"payment_channel_subsidy": 0,
	"other_subsidy1": 0,
	"cust_fact_amt": 0,
	"rate": 0,
	"charge_amt": 0,
	"transport_amt": 0,
	"influencer_ommission": 0,
	"service_provider_commission": 0,
	"channel_sharing": 0,
	"other_expense1": 0,
	"other_expense2": 0,
	"other_expense3": 0,
	"business_description": "",
	"income_amt": 0,
	"expenditure_amt": 0,
	"account_balance": 0,
	"audit_amt": 0,
	"cash_rec_date": "2026-06-07",
	"order_date": "2026-06-07 11:56:52",
	"pay_time": "2026-06-07 11:56:52",
	"currency_id": "",
	"busi_no": "",
	"busi_date": "2026-06-07",
	"busi_type": "",
	"expense_total_amt": 0,
	"describe": "",
	"counter_part_account": "",
	"counter_part_name": "",
	"remark": "",
	"writeoff_date": "2026-06-07 11:56:52",
	"source_liquidation_date": "2026-06-07",
	"source_unique": "",
	"batch_no": "",
	"data_source": "",
	"creator": "",
	"trans_rec_status": "",
	"fund_rec_status": "",
	"bank_type": "",
	"expense_flag": ""
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

2	2025-12-11

更新

请求参数 writeoff_date

3	2025-09-26

更新

请求参数 writeoff_date

4	2025-06-25

新增

请求参数 (4)

更新

请求参数 biz_type


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

