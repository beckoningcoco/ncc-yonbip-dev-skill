---
title: "薪资支付工作台单据详情查询"
apiId: "1530837386548740100"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "薪资支付工作台"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, 薪资支付工作台]
platform_version: "BIP"
source_type: community-api-docs
---

# 薪资支付工作台单据详情查询

> `ContentType	application/json` 请求方式	GET | 分类: 薪资支付工作台 (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/salarypay/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 薪资支付单据ID    示例: 20220825001319261 |

## 3. 请求示例

Url: /yonbip/ctm/salarypay/detail?access_token=访问令牌&id=20220825001319261

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
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回信息 |
| currency_priceDigit | long | 否 | 币种单价精度 示例：3 |
| busitype | long | 否 | 业务类型 示例：2 |
| batno | string | 否 | 批量支付编号 示例：5384b483170043038d5e759b57f2599c |
| modifier | string | 否 | 修改人 示例：曾刚 |
| settlemode | long | 否 | 结算方式ID 示例：2400018511451248 |
| payBankAccount | string | 否 | 付款银行账户ID 示例：2663331789624320 |
| payBankAccount_bank | string | 否 | 付款银行类别 示例：2406009194288385 |
| tradetype_code | string | 否 | 交易类型编码 示例：DFGZ |
| accentity_name | string | 否 | 会计主体 示例：快乐柠檬 |
| accentity | string | 否 | 会计主体ID 示例：2412834925744384 |
| settlestatus | short | 否 | 结算状态（1：未结算，2：已结算） 示例：1 |
| natCurrency | string | 否 | 本币币种id 示例：2404308656854308 |
| modifyTime | string | 否 | 修改时间 示例：2022-06-27 15:49:11 |
| agenttype | string | 否 | 代发类型 示例：BYBI |
| id | long | 否 | 主表ID 示例：2680301536367361 |
| exchangeRateType_digit | long | 否 | 汇率精度 示例：6 |
| modifyDate | string | 否 | 修改日期 示例：2022-06-27 00:00:00 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：true |
| natSum | long | 否 | 本币金额 示例：20 |
| defines!id | long | 否 | 自定义id 示例：2680301536367361 |
| payBankAccount_account | string | 否 | 付款银行账号 示例：755915680910511 |
| natCurrency_moneyDigit | long | 否 | 本币币种金额精度 示例：4 |
| natCurrency_priceDigit | long | 否 | 本币币种单价精度 示例：3 |
| payBankAccount_acctName | string | 否 | 付款账户开户名 示例：企业网银新20161097 |
| numline | long | 否 | 付款总笔数 示例：1 |
| status | short | 否 | 单据状态（0：未审核，1：已审核，2：已关闭，3：审核中） 示例：0 |
| verifystate | long | 否 | 审批流状态（0：初始开立，1：审批中，2：审批完成，3：流程终止，4：驳回到制单） 示例：0 |
| currency_moneyDigit | long | 否 | 币种金额精度 示例：4 |
| payBankAccount_name | string | 否 | 付款银行账户 示例：企业网银新20161097 |
| code | string | 否 | 单据编号 示例：SALDF220309000152 |
| settlemode_code | string | 否 | 结算方式编码 示例：system_0001 |
| exchRate | long | 否 | 汇率 示例：1 |
| currency_code | string | 否 | 币种 示例：CNY |
| vouchdate | string | 否 | 单据日期 示例：2022-03-09 00:00:00 |
| natCurrency_name | string | 否 | 本币币种 示例：人民币 |
| billtype | long | 否 | 事项类型 示例：15 |
| currency | string | 否 | 币种ID 示例：2404308656854308 |
| otherbankflag | long | 否 | 收方跨行标识 示例：0 |
| invalidflag | boolean | 否 | 作废标志 示例：false |
| pubts | string | 否 | 时间戳 示例：2022-07-26 15:18:25 |
| settlemode_name | string | 否 | 结算方式 示例：银行转账 |
| createDate | string | 否 | 创建日期 示例：2022-03-09 00:00:00 |
| auditstatus | short | 否 | 审批状态（1：已审批，2：未审批） 示例：2 |
| creator | string | 否 | 创建人 示例：曾刚 |
| Salarypay_b | object | 是 | 薪资支付单子表 |
| currency_name | string | 否 | 币种 示例：人民币 |
| oriSum | long | 否 | 付款金额 示例：20 |
| tradetype_name | string | 否 | 交易类型 示例：薪资支付 |
| accentity_code | string | 否 | 会计主体编码 示例：110 |
| srcitem | long | 否 | 事项来源 示例：9 |
| voucherstatus | short | 否 | 凭证状态(1：已生成， 2：未生成， 3：已接收未生成， 4：不生成) 示例：2 |
| requestseqno | string | 否 | 请求流水号 示例：RC103210000202203091840206481201 |
| tradetype | string | 否 | 交易类型ID 示例：2404308656903438 |
| exchangeRateType | string | 否 | 汇率类型id 示例：0000KSSCHDOOH3B6E60000 |
| createTime | string | 否 | 创建时间 示例：2022-03-09 10:23:43 |
| paystatus | short | 否 | 支付状态（0：待支付，1：预下单成功，2：预下单失败，3：支付成功，4：支付失败，5：支付中，6：支付不明，7：线下支付成功，8：部分成功） 示例：0 |
| exchangeRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| settlemode_serviceAttr | long | 否 | 结算方式业务属性 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"currency_priceDigit": 3,
		"busitype": 2,
		"batno": "5384b483170043038d5e759b57f2599c",
		"modifier": "曾刚",
		"settlemode": 2400018511451248,
		"payBankAccount": "2663331789624320",
		"payBankAccount_bank": "2406009194288385",
		"tradetype_code": "DFGZ",
		"accentity_name": "快乐柠檬",
		"accentity": "2412834925744384",
		"settlestatus": 1,
		"natCurrency": "2404308656854308",
		"modifyTime": "2022-06-27 15:49:11",
		"agenttype": "BYBI",
		"id": 2680301536367361,
		"exchangeRateType_digit": 6,
		"modifyDate": "2022-06-27 00:00:00",
		"isWfControlled": true,
		"natSum": 20,
		"defines!id": 2680301536367361,
		"payBankAccount_account": "755915680910511",
		"natCurrency_moneyDigit": 4,
		"natCurrency_priceDigit": 3,
		"payBankAccount_acctName": "企业网银新20161097",
		"numline": 1,
		"status": 0,
		"verifystate": 0,
		"currency_moneyDigit": 4,
		"payBankAccount_name": "企业网银新20161097",
		"code": "SALDF220309000152",
		"settlemode_code": "system_0001",
		"exchRate": 1,
		"currency_code": "CNY",
		"vouchdate": "2022-03-09 00:00:00",
		"natCurrency_name": "人民币",
		"billtype": 15,
		"currency": "2404308656854308",
		"otherbankflag": 0,
		"invalidflag": false,
		"pubts": "2022-07-26 15:18:25",
		"settlemode_name": "银行转账",
		"createDate": "2022-03-09 00:00:00",
		"auditstatus": 2,
		"creator": "曾刚",
		"Salarypay_b": [
			{
				"amount": 20,
				"identitytype": "01",
				"transeqno": "TC103210000202203091840258190002",
				"tradestatus": 1,
				"defines!id": 2680301536367363,
				"crtacc": "98452012",
				"identitynum": "98452012",
				"id": 2680301536367363,
				"showpersonnum": "A0000012",
				"invalidflag": false,
				"pubts": "2022-03-09 18:40:58",
				"crtaccname": "张三",
				"mainid": 2680301536367361
			}
		],
		"currency_name": "人民币",
		"oriSum": 20,
		"tradetype_name": "薪资支付",
		"accentity_code": "110",
		"srcitem": 9,
		"voucherstatus": 2,
		"requestseqno": "RC103210000202203091840206481201",
		"tradetype": "2404308656903438",
		"exchangeRateType": "0000KSSCHDOOH3B6E60000",
		"createTime": "2022-03-09 10:23:43",
		"paystatus": 0,
		"exchangeRateType_name": "基准汇率",
		"settlemode_serviceAttr": 0
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

