---
title: "结算工作台详情查询"
apiId: "1603552617390145541"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Settlement Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算工作台详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Settlement Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/settleBench/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 是 | 结算单ID    示例: 1539710376890859530 |
| tplid | string | query | 否 | UI模板ID，增加此字段可以获取UI模板中的自定义字段    示例: 1573730151215136768 |
| subid | string | query | 否 | 结算明细id    示例: 1619720376890859 |

## 3. 请求示例

Url: /yonbip/ctm/settleBench/detail?access_token=访问令牌&id=1539710376890859530&tplid=1573730151215136768&subid=1619720376890859

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 请求返回编码，成功：200；未成功：其他 示例：200 |
| message | string | 否 | 请求返回信息 示例：操作成功 |
| data | object | 否 | 返回数据，结算单详情信息 |
| autoRuleId | string | 否 | 自动生单规则ID 示例：-1 |
| code | string | 否 | 编码 示例：00ST2221118000009 |
| ischange | boolean | 否 | 是否找零 示例：false |
| modifier | string | 否 | 修改人名称 示例：YonSuite默认用户 |
| settleBench_b | object | 是 | 结算明细信息 |
| stopamount | long | 否 | 结算止付金额 示例：0 |
| accentity_name | string | 否 | 资金组织名称 示例：甘甘专用结算中心 |
| accentity | string | 否 | 资金组织ID 示例：1529944136455028738 |
| vouchdate | string | 否 | 结算单日期 示例：2022-11-18 00:00:00 |
| failamount | long | 否 | 结算失败金额 示例：0 |
| natCurrency_name | string | 否 | 本币币种名称 示例：人民币 |
| modifyTime | string | 否 | 修改时间 示例：2022-11-18 16:06:02 |
| natCurrency | string | 否 | 本币币种ID 示例：1524777565678469141 |
| id | long | 否 | ID 示例：1593937620132954119 |
| pubts | long | 否 | 时间戳 示例：2022-11-18 16:06:03 |
| operUser | long | 否 | 提交人ID 示例：1524777247850364928 |
| createDate | string | 否 | 创建日期 示例：2022-11-18 00:00:00 |
| auditDate | string | 否 | 审批日期 示例：2022-11-18 00:00:00 |
| pendingamount | BigDecimal | 否 | 结算中金额 示例：0 |
| creator | string | 否 | 创建人 示例：YonSuite默认用户 |
| modifyDate | string | 否 | 修改日期 示例：2022-11-18 00:00:00 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| partyname | string | 否 | 对方名称 示例：每天都要快乐呀 |
| auditor | string | 否 | 审批人 示例：自动 |
| basebilltype | long | 否 | 单据类型：6:其他收款单，8:其他单笔付款单; 示例：6 |
| isCancelSettled | boolean | 否 | 是否取消结算过 示例：false |
| natSum | BigDecimal | 否 | 本币暂估金额合计 示例：1 |
| autoRuleNo | string | 否 | 自动生单规则编号 示例：Auto001 |
| countdetail | string | 否 | 结算明细行数 示例：1 |
| operUser_name | string | 否 | 提交人名称 示例：YonSuite默认用户 |
| statementstatus | long | 否 | 结算单状态 1:待结算;2:结算中;3:结算成功;4:结算失败;6:已止付 示例：5 |
| natCurrency_moneyDigit | long | 否 | 币种金额精度 示例：3 |
| createTime | string | 否 | 创建时间 示例：2022-11-18 16:06:02 |
| auditTime | string | 否 | 审批时间 示例：2022-11-18 16:06:02 |
| natCurrency_priceDigit | long | 否 | 币种单价精度 示例：3 |
| receipttype | long | 否 | 收付类型 1：收款；2：付款 示例：2 |
| sucessamount | BigDecimal | 否 | 结算成功金额 示例：1 |
| defines | object | 是 | 主表自定义项 |
| org | string | 否 | 业务组织 |
| dept | string | 否 | 部门 |
| description | string | 否 | 备注 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"autoRuleId": "-1",
		"code": "00ST2221118000009",
		"ischange": false,
		"modifier": "YonSuite默认用户",
		"settleBench_b": [
			{
				"exchangePaymentRate": 1,
				"iscanmerge": "0",
				"ourbankaccount_code": "0001",
				"settlemode": 1524777582831075374,
				"bizbilltype": "6",
				"dataSettledId": "1593936658060279810",
				"counterpartybankaccount": "1567914559344738312",
				"counterpartyBankType": "1528613203378962434",
				"relateClaimBillId": 1748124394862411784,
				"checkIdentificationCode": "ccd1590a5002407bb3548e9004c3e296",
				"relateBankCheckBillId": 1748124394862411784,
				"exchangePaymentCurrency_moneyDigit": 3,
				"exchangePaymentRateType_digit": 6,
				"bizbilldetailid": "1587353418088841224",
				"natCurrency": "1524777565678469141",
				"settlesuccessdate": "2022-11-09 00:00:00",
				"isRelateCheckBill": "0",
				"counterpartyBankType_name": "中国工商银行",
				"issuspicious": 0,
				"iscansplit": "0",
				"exchangePaymentAmount": 1,
				"counterpartytype": "1",
				"id": 1593937620132954120,
				"singlebatch": 0,
				"mainid": 1593937620132954119,
				"bizbillno": "AGTP221109000025",
				"exchangeRateType_digit": 6,
				"isjournalregistered": 1,
				"ourbankaccount_name": "基本户",
				"islinkpayment": false,
				"natAmt": 1,
				"originalcurrency": "1524777565678469141",
				"plansettledate": "2022-11-09 00:00:00",
				"bizsyssrc": "12",
				"originalcurrencyamt": 1,
				"originalcurrency_moneyDigit": 3,
				"isrefund": 0,
				"counterpartybankacc": "34566789987665",
				"submitTime": "2022-11-18 00:00:00",
				"natCurrency_moneyDigit": 3,
				"relatedstatementno": "00ST2221118000009",
				"natCurrency_priceDigit": 3,
				"settleDetailId": "00ST2221118000009_1",
				"isGenerateVoucher": "1",
				"settlesuccesstime": "2022-11-09 16:06:01",
				"statementdetailstatus": 3,
				"inoutFlag": 0,
				"ourbankaccount": "1529958979865673731",
				"ischange": false,
				"paySettlementMode": "1",
				"exchangerate": 1,
				"offLineSettleFlag": true,
				"counterpartybankcode": "102100000595",
				"counterpartyname": "每天都要快乐呀",
				"exchangePaymentCurrency_priceDigit": 3,
				"counterpartyid": "1567914559344738311",
				"natCurrency_name": "人民币",
				"counterpartybankname": "中国工商银行股份有限公司北京顺义支行",
				"originalcurrency_priceDigit": 3,
				"isExchangePayment": 0,
				"ismerged": false,
				"openwsettlestatus": "2",
				"pubts": "2022-11-18 16:06:04",
				"settlemode_name": "银行转账",
				"refundAmt": 0,
				"isdirectacc": false,
				"tradetype_name": "代理付款",
				"originalcurrency_name": "人民币",
				"ourbankaccount_account": "11111111",
				"expectdate": "2022-11-09 00:00:00",
				"receipttypeb": 2,
				"isIncomeAndExpenditure": false,
				"voucherstatus": 6,
				"exchangePaymentCurrency_name": "人民币",
				"tradetype": "1524777574269453062",
				"exchangeRateType": "0000L6X2BKUY48HCZN0000",
				"issysmodify": 0,
				"counterpartyaccname": "每天都要快乐呀",
				"exchangePaymentCurrency": "1524777565678469141",
				"ourbankaccount_bankNumber_name": "中国工商银行股份有限公司北京经济技术开发区天宝园支行",
				"exchangePaymentRateType": "0000L6X2BKUY48HCZN0000",
				"exchangeRateType_name": "基准汇率",
				"settlemode_serviceAttr": 0,
				"exchangePaymentRateType_name": "基准汇率",
				"defines": [
					{
						"define1": [
							""
						],
						"id": 0
					}
				]
			}
		],
		"stopamount": 0,
		"accentity_name": "甘甘专用结算中心",
		"accentity": "1529944136455028738",
		"vouchdate": "2022-11-18 00:00:00",
		"failamount": 0,
		"natCurrency_name": "人民币",
		"modifyTime": "2022-11-18 16:06:02",
		"natCurrency": "1524777565678469141",
		"id": 1593937620132954119,
		"pubts": NaN,
		"operUser": 1524777247850364928,
		"createDate": "2022-11-18 00:00:00",
		"auditDate": "2022-11-18 00:00:00",
		"pendingamount": 0,
		"creator": "YonSuite默认用户",
		"modifyDate": "2022-11-18 00:00:00",
		"isWfControlled": false,
		"partyname": "每天都要快乐呀",
		"auditor": "自动",
		"basebilltype": 6,
		"isCancelSettled": false,
		"natSum": 1,
		"autoRuleNo": "Auto001",
		"countdetail": "1",
		"operUser_name": "YonSuite默认用户",
		"statementstatus": 5,
		"natCurrency_moneyDigit": 3,
		"createTime": "2022-11-18 16:06:02",
		"auditTime": "2022-11-18 16:06:02",
		"natCurrency_priceDigit": 3,
		"receipttype": 2,
		"sucessamount": 1,
		"defines": [
			{
				"define1": "",
				"id": 0
			}
		],
		"org": "",
		"dept": "",
		"description": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	QuerySchemaExecutor error	查询请求参数不是数字会报错，请求数据ID必须为数字


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-28

删除

返回参数 fundPurposeId

删除

返回参数 fundPurposeName


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

