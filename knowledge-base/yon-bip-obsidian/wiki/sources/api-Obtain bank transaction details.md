---
title: "获取银行交易明细"
apiId: "77b741d94c994b65acd8a54e857dc0e2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取银行交易明细

> `ContentType	application/json` 请求方式	POST | 分类: Payment Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cmpBankTradeDetailElectron/list

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
| start_time | string | 否 | 否 | 开始时间 |
| end_time | string | 否 | 否 | 结束时间 |

## 3. 请求示例

Url: /yonbip/fi/cmpBankTradeDetailElectron/list?access_token=访问令牌
Body: {
	"start_time": "",
	"end_time": ""
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
| tran_date | string | 否 | 到款日期 |
| accentity_code | string | 否 | 公司代码 |
| tran_amt | string | 否 | 回款金额 |
| accentity_name | string | 否 | 到款单位 |
| to_acct_no | string | 否 | 付款账号 |
| to_acct_bank_name | string | 否 | 出票/付款银行 |
| billcode | string | 否 | 回单唯一码 |
| bankseqno | string | 否 | 银行回单流水号 |
| remark | string | 否 | remark |
| url | string | 否 | 回单地址 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"tran_date": "",
		"accentity_code": "",
		"tran_amt": "",
		"accentity_name": "",
		"to_acct_no": "",
		"to_acct_bank_name": "",
		"billcode": "",
		"bankseqno": "",
		"remark": "",
		"url": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	明细获取失败


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

