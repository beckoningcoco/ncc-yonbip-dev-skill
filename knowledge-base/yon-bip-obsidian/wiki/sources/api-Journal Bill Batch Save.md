---
title: "日记账录入批量保存"
apiId: "2420562272971653128"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Journal Entry Input"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Journal Entry Input]
platform_version: "BIP"
source_type: community-api-docs
---

# 日记账录入批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Journal Entry Input (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/journalbill/batchSave

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
| data | object | 是 | 是 | 日记账录入数据 |
| journalBill_b | object | 是 | 是 | 日记账明细数据 |
| billState | string | 否 | 是 | 单据状态 示例：0-保存态 1-提交态 |
| billDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据日期 |
| tradeType | string | 否 | 是 | 交易类型编码 示例：cmp_journalbill_bank: 银行日记账, cmp_journalbill_cash：现金日记账 |
| accentity | string | 否 | 否 | 资金组织ID或编码 示例：ORG_CODE |
| accentityRaw | string | 否 | 否 | 核算会计组织ID或编码 示例：ORG_CODE |
| dept | string | 否 | 否 | 部门ID或编码 |
| id | string | 否 | 否 | 日记账单据ID |
| code | string | 否 | 否 | 日记账单据编码 |

## 3. 请求示例

Url: /yonbip/FCC/journalbill/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"journalBill_b": [
				{
					"cashAccount": "CASH_ACCOUNT_01",
					"bankAccount": "BANK_ACCOUNT_01",
					"currency": "CNY",
					"exchangeRateType": "01",
					"exchangeRate": 0,
					"businessDate": "2026-06-07",
					"dzDate": "2026-06-07",
					"debitoriSum": "",
					"creditoriSum": "",
					"description": "",
					"settleMode": "YQL",
					"paymentType": NaN,
					"oppositeType": NaN,
					"oppositeId": "",
					"oppositeCode": "",
					"oppositeAccountId": "",
					"oppositeAccountNo": "",
					"oppositeAccountCode": "",
					"noteType": "",
					"noteNo": "",
					"noteDate": "2026-06-07",
					"project": "PROJ",
					"costProject": "COSTPROJ",
					"unireconciliationcode": ""
				}
			],
			"billState": "0-保存态  1-提交态",
			"billDate": "2026-06-07",
			"tradeType": "cmp_journalbill_bank: 银行日记账, cmp_journalbill_cash：现金日记账",
			"accentity": "ORG_CODE",
			"accentityRaw": "ORG_CODE",
			"dept": "",
			"id": "",
			"code": ""
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 日记账录入单据ID |
| code | string | 否 | 日记账录入单据编码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "",
		"code": ""
	}
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

