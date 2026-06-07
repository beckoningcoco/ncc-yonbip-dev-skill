---
title: "收款工作台单据详情查询"
apiId: "1526356387039281161"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Collection Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款工作台单据详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Collection Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/receivebill/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 是 | 收款单ID |

## 3. 请求示例

Url: /yonbip/ctm/receivebill/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回的数据 |
| currency_priceDigit | long | 否 | 币种单价精度 示例：3 |
| settlemode | long | 否 | 结算方式ID 示例：2159411245650211 |
| ReceiveBill_b | object | 是 | 收款单明细 |
| accentity_name | string | 否 | 会计主体 示例：星星科技01 |
| accentity | string | 否 | 会计主体ID 示例：2176329210843648 |
| settlestatus | long | 否 | 结算状态（1：已结算，2：未结算） 示例：1 |
| natCurrency | string | 否 | 本币币种id 示例：2163654411424512 |
| balance | double | 否 | 余额 示例：100 |
| id | long | 否 | 主表ID 示例：2212118430568704 |
| cashaccount_code | string | 否 | 收款现金账户编码 示例：xx5566756 |
| customer_code | string | 否 | 付款客户编码 示例：kh001 |
| customerbankaccount_bankAccountName | string | 否 | 付款客户账户 示例：华为对公账户 |
| exchangeRateType_code | string | 否 | 汇率类型编码 示例：01 |
| exchangeRateType_digit | long | 否 | 汇率精度 示例：6 |
| localbalance | double | 否 | 本币余额 示例：100 |
| natSum | double | 否 | 本币金额 示例：100 |
| natCurrency_moneyDigit | long | 否 | 本币币种金额精度 示例：4 |
| natCurrency_priceDigit | long | 否 | 本币币种单价精度 示例：3 |
| status | long | 否 | 单据状态（0：未审核，1：已审核，2：已关闭，3：审核中） 示例：0 |
| verifystate | short | 否 | 审批流状态；0：初始开立，1：审批中，2：审批完成，3：流程终止，4：驳回到制单 示例：0 |
| currency_moneyDigit | long | 否 | 本币币种金额精度 示例：4 |
| code | string | 否 | 单据编号 示例：CMR00210412000001 |
| settlemode_code | string | 否 | 结算方式编码 示例：system_0002 |
| openBank | string | 否 | 开户行 示例：2163898002051840 |
| exchRate | long | 否 | 汇率 示例：1 |
| cashaccount | string | 否 | 付款现金账户ID 示例：2176349434712576 |
| caobject | short | 否 | 收款对象(1：客户，2：供应商，3：员工，4：其他 示例：1 |
| vouchdate | string | 否 | 单据日期 示例：2021-04-12 00:00:00 |
| natCurrency_name | string | 否 | 本币币种 示例：人民币 |
| billtype | short | 否 | 单据类型，0：\"现金期初日记账未达\", 1：\"销售发票\", 2：\"其它应收事项\", 5：\"订单日报\", 6：\"内部交易结算单\", 7：\"收款单\", 8：\"其它应付事项\", 9：\"客户退款单\", 10：\"付款单\", 11：\"供应商退款单\", 12：\"转账单\", 13：\"汇率损益单\", 14：\"外币兑换单\", 15：\"薪资支付单\", 16：\"银行对账单\", 17：\"资金收款单\", 18：\"资金付款单\", 50：\"应收票据期初\", 51：\"收票登记\", 52：\"银行托收\", 53：\"到期兑付\", 54：\"应付票据期初\", 55：\"票据签发\", 56：\"付票登记\", 57：\"票据贴现\", 58：\"票据背书\", 59：\"付款申请单\", 60：\"资金结算明细\", 70：\"销售费用\", 71：\"供应链费用\", 72：\"销售费用\", 73：\"供应链费用\", 72：\"内部交易待结算单\", 74：\"内部交易待结算单\ 示例：7 |
| printCount | long | 否 | 打印次数 示例：0 |
| currency | string | 否 | 币种ID 示例：2163654411424512 |
| customerbankaccount | long | 否 | 收款客户账户ID 示例：2176338275471617 |
| pubts | string | 否 | 时间戳 示例：2022-08-23 13:34:00 |
| settlemode_name | string | 否 | 结算方式 示例：现金收付款 |
| createDate | string | 否 | 创建日期 示例：2021-04-12 00:00:00 |
| customerbankaccount_bankAccount | string | 否 | 付款客户账号 示例：166666 |
| auditstatus | long | 否 | 审批状态（1：已审批，2：未审批） 示例：2 |
| creator | string | 否 | 创建人 示例：杨远红 |
| currency_name | string | 否 | 币种 示例：人民币 |
| cashaccount_name | string | 否 | 收款现金账户 示例：星星现金账户01 |
| oriSum | double | 否 | 收款金额 示例：100 |
| redflag | boolean | 否 | 是否红冲 示例：false |
| accentity_code | string | 否 | 会计主体编码 示例：11023 |
| srcitem | short | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方 示例：8 |
| voucherstatus | short | 否 | 凭证状态(1：已生成， 2：未生成， 3：已接收未生成， 4：不生成) 示例：2 |
| tradetype | string | 否 | 交易类型ID 示例：2163654486118656 |
| exchangeRateType | string | 否 | 汇率类型id 示例：jrig9o3z |
| writeoffstatus | long | 否 | 核销状态（1：已核销，2：未核销，3：部分核销） 示例：2 |
| initflag | boolean | 否 | 期初标志 示例：false |
| createTime | string | 否 | 创建时间 示例：2021-04-12 16:43:14 |
| customerbankaccount_openBank_name | string | 否 | 付款客户银行网点 示例：中国银行当阳玉阳支行 |
| exchangeRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| customer_name | string | 否 | 付款客户 示例：华为科技 |
| customer | long | 否 | 收款客户ID 示例：2176338275471616 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"currency_priceDigit": 3,
		"settlemode": 2159411245650211,
		"ReceiveBill_b": [
			{
				"quickType_code": "9",
				"oriSum": 100,
				"natSum": 100,
				"id": 2212118430585088,
				"mainid": 2212118430568704,
				"pubts": "2022-01-12 18:58:19",
				"quickType": 2087208495768797,
				"quickType_name": "杂项"
			}
		],
		"accentity_name": "星星科技01",
		"accentity": "2176329210843648",
		"settlestatus": 1,
		"natCurrency": "2163654411424512",
		"balance": 100,
		"id": 2212118430568704,
		"cashaccount_code": "xx5566756",
		"customer_code": "kh001",
		"customerbankaccount_bankAccountName": "华为对公账户",
		"exchangeRateType_code": "01",
		"exchangeRateType_digit": 6,
		"localbalance": 100,
		"natSum": 100,
		"natCurrency_moneyDigit": 4,
		"natCurrency_priceDigit": 3,
		"status": 0,
		"verifystate": 0,
		"currency_moneyDigit": 4,
		"code": "CMR00210412000001",
		"settlemode_code": "system_0002",
		"openBank": "2163898002051840",
		"exchRate": 1,
		"cashaccount": "2176349434712576",
		"caobject": 1,
		"vouchdate": "2021-04-12 00:00:00",
		"natCurrency_name": "人民币",
		"billtype": 7,
		"printCount": 0,
		"currency": "2163654411424512",
		"customerbankaccount": 2176338275471617,
		"pubts": "2022-08-23 13:34:00",
		"settlemode_name": "现金收付款",
		"createDate": "2021-04-12 00:00:00",
		"customerbankaccount_bankAccount": "166666",
		"auditstatus": 2,
		"creator": "杨远红",
		"currency_name": "人民币",
		"cashaccount_name": "星星现金账户01",
		"oriSum": 100,
		"redflag": false,
		"accentity_code": "11023",
		"srcitem": 8,
		"voucherstatus": 2,
		"tradetype": "2163654486118656",
		"exchangeRateType": "jrig9o3z",
		"writeoffstatus": 2,
		"initflag": false,
		"createTime": "2021-04-12 16:43:14",
		"customerbankaccount_openBank_name": "中国银行当阳玉阳支行",
		"exchangeRateType_name": "基准汇率",
		"customer_name": "华为科技",
		"customer": 2176338275471616
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	操作成功	查询时不会出现错误信息，只是查出来的data中 "_emptyResult": true。


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

