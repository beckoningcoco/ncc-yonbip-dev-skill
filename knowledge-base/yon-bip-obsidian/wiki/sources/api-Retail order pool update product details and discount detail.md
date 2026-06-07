---
title: "零售订单池更新商品明细、折扣明细"
apiId: "2349398418664718341"
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

# 零售订单池更新商品明细、折扣明细

> `ContentType	application/json` 请求方式	POST | 分类: Retail Order Pool (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/revenue/offLineOrder/batchUpdateGoodsItemAndDiscount

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
| order_source_unique | string | 否 | 是 | 主表来源数据唯一标识，使用该字段查询数据 示例：1002 |
| revOnlineOrderGoodsitem | object | 是 | 是 | 零售订单池-商品明细（包含商品核心信息、金额、税率等子参数） |
| row_no | string | 否 | 是 | 订单行号 示例：110 |
| Summaryflag | string | 否 | 否 | 汇总标识（传入的数据时汇总数据或明细数据），（0：明细；1：汇总），默认为明细 示例：0 默认值：0 |
| goods_id | string | 否 | 否 | 商品，传id或code，示例：0105000002。当汇总标识为汇总时；当汇总标识为明细时。 示例：0105000002 |
| goods_category | string | 否 | 否 | 商品分类，传id或code。当汇总标识为汇总时；当汇总标识为明细时。 示例：007 |
| unit_id | string | 否 | 否 | 单位，传id或code，示例：1525645209096421378 示例：1525645209096421378 |
| price | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 单价 |
| goods_num | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 数量 |
| goods_fact_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 商品报价金额，一般指商品优惠前金额 |
| goods_reduce_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 商品优惠金额，一般指商品本身的优惠金额 |
| platform_reduce_amt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 平台优惠金额，一般指销售平台的优惠金额 |
| goods_tax_amt | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 商品含税金额，优惠后开票的金额 |
| tax_amt | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 税额 |
| tax_rate_id | string | 否 | 是 | 税率编码，传税目档案ID及税目编码 |
| goods_notax_amt | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 商品不含税金额 |
| card_no | string | 否 | 否 | 卡号 |
| remark | string | 否 | 否 | 备注 |
| cost_unit | string | 否 | 否 | 成本计量单位 |
| cost_amt | string | 否 | 否 | 成本单价 |
| is_gift | string | 否 | 否 | 是否赠品 |
| return_state | string | 否 | 否 | 退款状态 |
| return_order_no | string | 否 | 否 | 退货单号 |
| source_unique | string | 否 | 否 | 来源数据唯一标识，使用该字段更新，若不存在则新增商品明细 |
| rev_online_goods_discountList | object | 是 | 否 | 零售订单池-折扣明细 |

## 3. 请求示例

Url: /yonbip/FCC/revenue/offLineOrder/batchUpdateGoodsItemAndDiscount?access_token=访问令牌
Body: [{
	"order_source_unique": "1002",
	"revOnlineOrderGoodsitem": [
		{
			"row_no": "110",
			"Summaryflag": "0",
			"goods_id": "0105000002",
			"goods_category": "007",
			"unit_id": "1525645209096421378",
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
			"cost_amt": "",
			"is_gift": "",
			"return_state": "",
			"return_order_no": "",
			"source_unique": "",
			"rev_online_goods_discountList": [
				{
					"discount": "",
					"discount_amt": 0,
					"discount_count": "",
					"source_unique": ""
				}
			]
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
| count | string | 否 | 总条数 |
| successCount | string | 否 | 成功数量 |
| failCount | string | 否 | 失败数量 |
| messages | object | 是 | 保存失败的数据ID及原因 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": "",
		"successCount": "",
		"failCount": "",
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

