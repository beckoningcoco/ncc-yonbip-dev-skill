---
title: "日记账明细查询"
apiId: "2195786052872437762"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Journal Ledger"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Journal Ledger]
platform_version: "BIP"
source_type: community-api-docs
---

# 日记账明细查询

> `ContentType	application/json` 请求方式	POST | 分类: Journal Ledger (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/cmp/journal/query

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 是 | 否 | 资金组织，资金组织id，或资金组织编码code 示例: pkm00 最大请求量：500 |
| accentityRaw | string | 是 | 否 | 核算会计主体，核算会计主体id，或核算会计主体编码code 示例: pkm00 最大请求量：500 |
| bankaccount | string | 是 | 否 | 银行账号ID，或银行账号编码，或银行账号 示例: 4000021119201298365 最大请求量：500 |
| cashaccount | string | 是 | 否 | 现金账号ID，或现金账号 示例: 4000021119201298365 示例: 001110110 最大请求量：500 |
| currency | string | 是 | 否 | 币种：币种id，或币种编码 示例: CNY 最大请求量：500 |
| dzstartdate | string | 否 | 否 | YYYY-MM-DD；登账日期的开始日期 |
| dzenddate | string | 否 | 否 | YYYY-MM-DD；登账日期的结束日期 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页号 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 每页行数 默认值：10 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/journal/query?access_token=访问令牌
Body: {
	"accentity": [
		""
	],
	"accentityRaw": [
		""
	],
	"bankaccount": [
		""
	],
	"cashaccount": [
		""
	],
	"currency": [
		""
	],
	"dzstartdate": "",
	"dzenddate": "",
	"pageIndex": 0,
	"pageSize": 0
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| recordList | object | 是 | 返回数据 |
| totalCount | number |
| 小数位数:2,最大长度:10 | 否 | 总记录数 示例：10 |
| pageNum | number |
| 小数位数:2,最大长度:10 | 否 | 总页数 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"id": "",
				"accentity": "",
				"accentityCode": "",
				"accentityName": "",
				"parentAccentity": "",
				"parentAccentityCode": "",
				"parentAccentityName": "",
				"dzdate ": "",
				"vouchdate": "",
				"banktype": "",
				"cashaccount": "",
				"cashaccountno": "",
				"bankaccount": "",
				"bankaccountno": "",
				"currency": "",
				"currencyname": "",
				"exchangerate": 0,
				"creditoriSum": 0,
				"creditnatSum": 0,
				"debitoriSum": 0,
				"debitnatSum": 0,
				"costproject": "",
				"bankbilldate": "",
				"billnodate": "",
				"bankbilltype": "",
				"noteno": "",
				"billnum": "",
				"enableDate": "",
				"customer": "",
				"customerbankaccount": "",
				"customerbankname": "",
				"employee": "",
				"employeeaccount": "",
				"innerunit": "",
				"innerunitbankaccount": "",
				"otherbankaccount": "",
				"othercashaccount": "",
				"othername": "",
				"othertitle": "",
				"supplier": "",
				"supplierbankaccount": "",
				"supplierbankname": "",
				"tallyed": "",
				"journaltype": "",
				"projectCode ": "",
				"project": "",
				"dept": "",
				"description": "",
				"direction": "",
				"reconciliation": "",
				"reconciliationdatasource ": "",
				"refund ": "",
				"relevanceid ": "",
				"rptype": "",
				"tradetype": "",
				"settlemode": "",
				"settlemode ": "",
				"transeqno": "",
				"voucherNo": "",
				"voucherPeriod": "",
				"natCurrency": "",
				"natbalance": 0,
				"oribalance": 0,
				"topbilltype": "",
				"topsrcbillid": "",
				"topsrcbillno": "",
				"topsrcitem": "",
				"settlestatus": "",
				"sourceheadclue": "",
				"sourcelineclue": "",
				"srcbillitemid": "",
				"srcbillitemno": "",
				"srcbillno": "",
				"srcitem": "",
				"billtype": "",
				"paydate": "",
				"payman": "",
				"paymentstatus": "",
				"paymessage": "",
				"paystatus": "",
				"payway": "",
				"porderid ": "",
				"period": "",
				"operator": "",
				"orderno": "",
				"org": "",
				"initflag": "",
				"bankcheckno": "",
				"bankreconciliationscheme": "",
				"bankreconciliationsettingid": "",
				"checkdate": "",
				"checkflag": "",
				"insidecheckflag ": "",
				"sealflag": "",
				"checkman": "",
				"checkno": "",
				"checkmatch": "",
				"bankreturnmsg": "",
				"batno": "",
				"billno": "",
				"bookkeeper": "",
				"caobject": "",
				"capBizObj": "",
				"capBizObjbankaccount": ""
			}
		],
		"totalCount": 10,
		"pageNum": 10
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-03-17

新增

返回参数 id


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

