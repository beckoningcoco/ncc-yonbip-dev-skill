---
title: "查询银行对账单信息"
apiId: "1655519617139867650"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Transaction Record"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Transaction Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询银行对账单信息

> `ContentType	application/json` 请求方式	POST | 分类: Account Transaction Record (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/queryBankReconciliationInfo

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
| accentity | string | 否 | 否 | 账户使用组织id 示例：2591580914225408 |
| accentity_code | string | 否 | 否 | 账户使用组织编码 示例：110 |
| dc_flag | int | 否 | 否 | 借贷方向：1借；2贷 示例：1 |
| currency | string | 否 | 否 | 币种id 示例：2350737731850752 |
| currency_name | string | 否 | 否 | 币种名称 示例：人民币 |
| bank_seq_no | string | 否 | 否 | 银行交易流水号 示例：test01 |
| tran_date | Date | 否 | 否 | 交易日期 示例：2023-02-10 |
| bankaccount | string | 否 | 否 | 本方银行账户id 示例：1510000739330031619 |
| bankaccount_account | string | 否 | 否 | 本方银行账号 示例：622221444555 |

## 3. 请求示例

Url: /yonbip/ctm/queryBankReconciliationInfo?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "2591580914225408",
	"accentity_code": "110",
	"dc_flag": 1,
	"currency": "2350737731850752",
	"currency_name": "人民币",
	"bank_seq_no": "test01",
	"tran_date": "2023-02-10",
	"bankaccount": "1510000739330031619",
	"bankaccount_account": "622221444555"
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"id": 2788485821747968,
				"accentity": "2591580914225408",
				"accentity_code": "ZSZB",
				"accentity_name": "曾氏总部",
				"currency": "2591342867010560",
				"currency_name": "人民币",
				"bankaccount": "1510000739330031619",
				"bankaccount_acctName": "测试银行账户户名",
				"bankaccount_account": "622221444555",
				"bank_seq_no": "test01",
				"tran_date": "2023-03-01",
				"dc_flag": 1,
				"tran_amt": 22.3,
				"to_acct_no": "",
				"to_acct_name": "",
				"to_acct_bank": "",
				"to_acct_bank_name": "",
				"use_name": "",
				"remark": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-19

更新

请求说明

2	2024-11-11

更新

请求参数 accentity

更新

请求参数 accentity_code

更新

返回参数 accentity

更新

返回参数 accentity_code

更新

返回参数 accentity_name

账户使用组织


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

