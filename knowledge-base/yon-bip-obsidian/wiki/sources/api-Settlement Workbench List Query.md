---
title: "结算工作台列表查询"
apiId: "2753b90f392b44bea50d4430c025419f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算工作台列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Document (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/stwb/settlebench

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| accentity | string | 否 | 否 | 资金组织id |
| accentity_code | string | 否 | 否 | 资金组织编码 |
| partyname | string | 否 | 否 | 对方名称 |
| receipttype | int | 否 | 否 | 收付类型 收款1，付款2 |
| open_vouchdate_begin | string | 否 | 否 | 结算单开始日期 示例：2022-03-01 |
| open_vouchdate_end | string | 否 | 否 | 结算单结束日期 示例：2022-03-02 |
| settlemode | string | 否 | 否 | 结算方式id |
| settlemode_code | string | 否 | 否 | 结算方式编码 |
| code | string | 否 | 否 | 结算单号 |
| open_natSum_begin | double | 否 | 否 | 结算单金额合计起始值 |
| open_natSum_end | double | 否 | 否 | 结算单金额合计结束值 |
| bizbilltype | int | 是 | 否 | 业务单据类型，类型枚举值见示例 |
| bizbillno | string | 否 | 否 | 业务单据编号 |
| statementdetailstatus | int | 是 | 否 | 结算明细状态 待结算1，结算中2，结算成功3，结算失败4，已止付6 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 属性名(条件) ，1：defines.define1(单据自由自定义项1) 2：pubts(时间戳) |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |
| value1 | string | 否 | 否 | 值1 |
| value2 | string | 否 | 否 | 值2 |
| isSum | boolean | 否 | 否 | 是否按照表头查询 true:表头 false:表头+明细，不传默认false |

## 3. 请求示例

Url: /yonbip/ctm/stwb/settlebench?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "",
	"accentity_code": "",
	"partyname": "",
	"receipttype": 0,
	"open_vouchdate_begin": "2022-03-01",
	"open_vouchdate_end": "2022-03-02",
	"settlemode": "",
	"settlemode_code": "",
	"code": "",
	"open_natSum_begin": 0,
	"open_natSum_end": 0,
	"bizbilltype": [
		0
	],
	"bizbillno": "",
	"statementdetailstatus": [
		0
	],
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
		}
	],
	"isSum": true
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 返回的数据 |
| pageIndex | int | 否 | 页号 |
| pageSize | int | 否 | 每页数量 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页号 |
| endPageIndex | int | 否 | 终止页号 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 单据明细 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"accentity": "",
				"accentity_name": "",
				"code": "",
				"ischange": true,
				"bustype_name": "",
				"modifier": "",
				"settleBench_b": {
					"pubts": ""
				},
				"stopamount": 0,
				"vouchdate": "",
				"failamount": 0,
				"natCurrency_name": "",
				"natCurrency": "",
				"modifyTime": "",
				"id": "",
				"pubts": "",
				"createDate": "",
				"pendingamount": 0,
				"creator": "",
				"modifyDate": "",
				"isWfControlled": true,
				"partyname": "",
				"basebilltype": "",
				"natSum": 0,
				"countdetail": 0,
				"bustype": "",
				"statementstatus": "",
				"natCurrency_moneyDigit": "",
				"natCurrency_priceDigit": "",
				"receipttype": "",
				"relatedstatementno": "",
				"autoRuleNo": "",
				"settleDetailId": "",
				"settlemode_name": "",
				"originalcurrency_name": "",
				"originalcurrencyamt": 0,
				"statementdetailstatus": "",
				"settlesuccessdate": "",
				"counterpartytype": "",
				"counterpartyname": "",
				"counterpartyBankType_name": "",
				"ourbankaccount_account": "",
				"ourcashaccount_name": "",
				"swbillno": "",
				"receiptDirection": "",
				"billamt": 0,
				"description": "",
				"bizbilltype": "",
				"bizbillno": "",
				"bizbilldetailid": "",
				"dept_name": "",
				"project_name": "",
				"tradetype_name": "",
				"csplProject_name": "",
				"originalcurrency_name3": "",
				"originalcurrency_name2": "",
				"counterpartyBankType_name2": "",
				"counterpartyBankType_name3": "",
				"settlemode": "",
				"counterpartyBankType": "",
				"issuspicious": 0,
				"singlebatch": 0,
				"dept_code": "",
				"mainid": "",
				"isjournalregistered": 0,
				"ourbankaccount_name": "",
				"bustype_name2": "",
				"bustype_name3": "",
				"originalcurrency": "",
				"natAmt": "",
				"plansettledate": "",
				"bizsyssrc": "",
				"isGenerateVoucher": "",
				"settlemode_name2": "",
				"verifystate": 0,
				"settlemode_name3": "",
				"ourbankaccount": "",
				"signature": "",
				"exchangerate": "",
				"offLineSettleFlag": "",
				"counterpartybankname": "",
				"originalcurrency_priceDigit": "",
				"tradetype_name3": "",
				"tradetype_name2": "",
				"isdirectacc": "",
				"detailid": "",
				"dept": "",
				"indextradeseqno": "",
				"expectdate": "",
				"voucherstatus": 0,
				"tradetype": "",
				"issysmodify": "",
				"counterpartyaccname": "",
				"natCurrency_name3": "",
				"natCurrency_name2": "",
				"settlemode_serviceAttr": "",
				"csplBizCode": "",
				"csplBizName": "",
				"settlefailreason": "",
				"ourcashaccount": "",
				"sucessamount": 0
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	操作成功	查询时不会出现错误信息，只是查出来的data为空。


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

