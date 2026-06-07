---
title: "集团司库数据上报结算整单新增"
apiId: "2184655378837405699"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Regulatory Reporting"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Regulatory Reporting]
platform_version: "BIP"
source_type: community-api-docs
---

# 集团司库数据上报结算整单新增

> `ContentType	application/json` 请求方式	POST | 分类: Regulatory Reporting (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/submit/api/group/settlement/bill/insert

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| dataDate | string | 否 | 是 | 数据日期 |
| submitType | string | 否 | 是 | 报送业务名称 SETTLEMENT 示例：SETTLEMENT |
| detailList | object | 是 | 是 | 明细数据 |
| submitGroupCreditCode | string | 否 | 是 | 所属集团编码 |
| submitGroupName | string | 否 | 是 | 所属集团名称 |
| dataSource | string | 否 | 是 | 数据来源 MANUAL_INPUT 手工录入 BANK_STATEMENT 银行流水 BANK_STATEMENT_REVISION 银行流水修订 |
| sourceId | string | 否 | 是 | 外部数据来源id |
| ownUnitCode | string | 否 | 是 | 本方单位编码 |
| ownUnitName | string | 否 | 是 | 本方单位名称 |
| ownUnitAccountName | string | 否 | 是 | 本方单位账户户名 |
| ownUnitAccount | string | 否 | 是 | 本方单位账号 |
| counterpartyUnitAccountName | string | 否 | 是 | 对方单位账户户名 |
| counterpartyUnitAccount | string | 否 | 是 | 对方单位账号 |
| oppositeUnitCode | string | 否 | 否 | 对方单位编码 |
| incomeExpendMark | string | 否 | 是 | 收支标记 T00：收； T01：支 |
| transactionNumber | string | 否 | 是 | 交易流水号 |
| transactionAmount | number |
| 小数位数:2,最大长度:32 | 否 | 是 | 交易金额 |
| pk_currency | string | 否 | 是 | 币种id |
| transactionTime | string | 否 | 是 | 交易时间 |
| summary | string | 否 | 否 | 摘要 |
| paymentChannel | string | 否 | 否 | 支付渠道 T00：非银企直联； T01：银企直联； |
| remark | string | 否 | 否 | 备注 |

## 3. 请求示例

Url: /yonbip/ctm/submit/api/group/settlement/bill/insert?access_token=访问令牌
Body: {
	"dataDate": "",
	"submitType": "SETTLEMENT",
	"detailList": [
		{
			"submitGroupCreditCode": "",
			"submitGroupName": "",
			"dataSource": "",
			"sourceId": "",
			"ownUnitCode": "",
			"ownUnitName": "",
			"ownUnitAccountName": "",
			"ownUnitAccount": "",
			"counterpartyUnitAccountName": "",
			"counterpartyUnitAccount": "",
			"oppositeUnitCode": "",
			"incomeExpendMark": "",
			"transactionNumber": "",
			"transactionAmount": 0,
			"pk_currency": "",
			"transactionTime": "",
			"summary": "",
			"paymentChannel": "",
			"remark": ""
		}
	]
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

