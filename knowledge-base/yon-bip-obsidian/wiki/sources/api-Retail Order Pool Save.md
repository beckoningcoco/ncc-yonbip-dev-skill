---
title: "零售订单池保存"
apiId: "1684299179471405060"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Retail Order Pool"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Retail Order Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 零售订单池保存

> `ContentType	application/json` 请求方式	POST | 分类: Retail Order Pool (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/revenue/offLineOrder/insertFullSave

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
| sales_org_id | string | 否 | 是 | 销售组织，传id或code,示例：000001 |
| sales_channel_id | string | 否 | 否 | 销售渠道，传id或code,示例：000047 |
| finance_org_id | string | 否 | 否 | 会计主体，传id或code |
| store_id | string | 否 | 否 | 门店名称，传id或code,示例：000037 |
| oms_order_no | string | 否 | 否 | 系统订单号，一般是企业内部系统订单号。当汇总标识为汇总时，非必传 |
| trans_date | Date | 否 | 是 | 交易日期，格式为：yyyy-mm-dd |
| summary_flag | string | 否 | 否 | 汇总标识（传入的数据时汇总数据或明细数据），0：明细；1：汇总，默认为明细 |
| bustype | string | 否 | 否 | 交易类型，传id或code,示例：ZX-013 |
| order_status | string | 否 | 否 | 订单状态（0：未支付；1：待发货；2：已发货；3：交易完成；4：已退款；5：已退货；6：舱内拦截；7：交易关闭） |
| total_amt | BigDecimal | 否 | 否 | 订单总金额（商品明细子不为空，则累加商品明细的商品报价金额） |
| total_reduce_amt | BigDecimal | 否 | 否 | 订单总优惠金额（商品明细子不为空，则累加商品明细的商品优惠金额、平台优惠金额） |
| total_fact_amt | BigDecimal | 否 | 否 | 订单总实收金额（商品明细子不为空，则累加商品明细的商品含税金额） |
| total_payment_amt | BigDecimal | 否 | 否 | 订单总支付金额（商品明细子不为空，则累加支付明细的支付金额） |
| transport_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 运费 |
| customer | string | 否 | 否 | 客户 |
| src_system | string | 否 | 否 | 来源系统 |
| remark | string | 否 | 否 | 备注 |
| biz_type | string | 否 | 否 | 业务类型（0-正常单、1-退货单） |
| currency_id | string | 否 | 是 | 币种，传id或code,示例：CNY |
| channel_order_no | string | 否 | 否 | 渠道订单号，一般指渠道商(比如电商平台)的订单号 |
| old_channel_order_no | string | 否 | 否 | 原渠道订单号，退货订单的原渠道订单号 |
| busi_no | string | 否 | 是 | 业务单号，必传，零售订单可能存在多个单号，指定一个单号作为数据追踪，若为汇总交易，则按规则编码，用作数据追踪 |
| busi_date | Date | 否 | 是 | 账务日期，该交易的账务处理日期，一般指定交易日期 |
| source_unique | string | 否 | 否 | 来源单据主键 |
| batch_no | string | 否 | 是 | 批次号，一批数据指定一个批次号 |
| data_source | string | 否 | 是 | 数据来源，传3（接口接入） |
| creator | string | 否 | 否 | 创建人，传用户id或code |
| trans_rec_status | string | 否 | 否 | 交易对账状态，无需对账传13 |
| rev_online_order_goodsitemList | object | 是 | 否 | 订单商品信息 |
| row_no | string | 否 | 否 | 行号，传数值，示例：10，20，30 |
| goods_id | string | 否 | 否 | 商品，传id或code,示例：0105000002；汇总标识为明细时，必传 |
| goods_category | string | 否 | 否 | 商品分类，传id或code，汇总标识为汇总时，必传 |
| unit_id | string | 否 | 否 | 单位，传id或code,示例：1525645209096421378 |
| price | BigDecimal | 否 | 否 | 单价 |
| goods_num | BigDecimal | 否 | 否 | 数量 |
| goods_fact_amt | BigDecimal | 否 | 否 | 商品报价金额 |
| goods_reduce_amt | BigDecimal | 否 | 否 | 商品优惠金额 |
| platform_reduce_amt | BigDecimal | 否 | 否 | 平台优惠金额 |
| goods_tax_amt | BigDecimal | 否 | 是 | 商品含税金额 |
| tax_amt | BigDecimal | 否 | 否 | 税额 |
| tax_rate_id | string | 否 | 否 | 税率编码，传税目档案ID及税目编码 |
| goods_notax_amt | BigDecimal | 否 | 否 | 商品不含税金额 |
| card_no | string | 否 | 否 | 卡号 |
| remark | string | 否 | 否 | 备注 |
| cost_unit | string | 否 | 否 | 成本计量单位 |
| cost_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 成本单价 |
| is_gift | string | 否 | 否 | 是否赠品 |
| return_state | string | 否 | 否 | 退款状态 |
| return_order_no | string | 否 | 否 | 退货单号 |
| source_unique | string | 否 | 否 | 来源单据明细主键 |
| rev_online_goods_discountList | object | 是 | 否 | 订单折扣明细 |
| pool_coupon_rec_status | string | 否 | 否 | 卡券对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| rev_online_order_payitemList | object | 是 | 否 | 订单支付信息 |
| row_no | string | 否 | 否 | 行号 |
| pay_serial_no | string | 否 | 否 | 支付流水号，当汇总标识为明细时，必传 |
| payment_channel_id | string | 否 | 是 | 支付渠道，传id或code,示例：000047 |
| pay_amt | BigDecimal | 否 | 是 | 支付金额 |
| pay_date | Date | 否 | 是 | 支付日期 |
| pay_time | DateTime | 否 | 否 | 支付时间，格式为：yyyy-mm-dd hh:mm:ss |
| merchant_no | string | 否 | 否 | 商户订单号，收款商户收款时记录的单号 |
| busi_date | Date | 否 | 是 | 业务日期 |
| old_merchant_no | string | 否 | 否 | 原商户订单号 |
| source_unique | string | 否 | 否 | 来源单据主键 |
| trans_rec_status | string | 否 | 否 | 交易对账状态，无需对账传13，未对账传11，不传默认为未对账 |
| bank_type | string | 否 | 否 | 数币银行类型，传id或code，使用数字人民币收款的银行类别 |

## 3. 请求示例

Url: /yonbip/AMP/revenue/offLineOrder/insertFullSave?access_token=访问令牌
Body: [{
	"sales_org_id": "",
	"sales_channel_id": "",
	"finance_org_id": "",
	"store_id": "",
	"oms_order_no": "",
	"trans_date": "",
	"summary_flag": "",
	"bustype": "",
	"order_status": "",
	"total_amt": 0,
	"total_reduce_amt": 0,
	"total_fact_amt": 0,
	"total_payment_amt": 0,
	"transport_amt": 0,
	"customer": "",
	"src_system": "",
	"remark": "",
	"biz_type": "",
	"currency_id": "",
	"channel_order_no": "",
	"old_channel_order_no": "",
	"busi_no": "",
	"busi_date": "",
	"source_unique": "",
	"batch_no": "",
	"data_source": "",
	"creator": "",
	"trans_rec_status": "",
	"rev_online_order_goodsitemList": [
		{
			"row_no": "",
			"goods_id": "",
			"goods_category": "",
			"unit_id": "",
			"price": 0,
			"goods_num": 0,
			"goods_fact_amt": 0,
			"goods_reduce_amt": 0,
			"platform_reduce_amt": 0,
			"goods_tax_amt": 0,
			"tax_amt": 0,
			"tax_rate_id": "",
			"goods_notax_amt": 0,
			"card_no": "",
			"remark": "",
			"cost_unit": "",
			"cost_amt": 0,
			"is_gift": "",
			"return_state": "",
			"return_order_no": "",
			"source_unique": "",
			"rev_online_goods_discountList": [
				{
					"rev_online_order_goodsitem_id": "",
					"discount": "",
					"discount_amt": 0,
					"discount_count": "",
					"source_unique": ""
				}
			],
			"pool_coupon_rec_status": ""
		}
	],
	"rev_online_order_payitemList": [
		{
			"row_no": "",
			"pay_serial_no": "",
			"payment_channel_id": "",
			"pay_amt": 0,
			"pay_date": "",
			"pay_time": "",
			"merchant_no": "",
			"busi_date": "",
			"old_merchant_no": "",
			"source_unique": "",
			"trans_rec_status": "",
			"bank_type": ""
		}
	]
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

20000000	接口请求异常	接口返回异常信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-02

更新

请求说明

2	2025-12-24

更新

请求说明

更新

请求参数 (4)

改成支持集成API

3	2025-06-25

新增

请求参数 bank_type

更新

请求参数 (6)

4	2025-05-19

新增

请求参数 trans_rec_status

新增

请求参数 pool_coupon_rec_status

新增

请求参数 trans_rec_status

删除

请求参数 tax_rate


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

