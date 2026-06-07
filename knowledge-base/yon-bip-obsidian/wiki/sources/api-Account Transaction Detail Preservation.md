---
title: "账户交易明细保存"
apiId: "2011637758201167874"
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

# 账户交易明细保存

> `ContentType	application/json` 请求方式	POST | 分类: Account Transaction Record (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/saveBankDealDetail

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
| request_body | object | 否 | 否 | 推送报文头 |
| back_num | string | 否 | 否 | 返回记录数 |
| record | object | 是 | 否 | 返回记录 |
| request_head | object | 否 | 否 | 请求报文头 |
| request_date | string | 否 | 否 | 请求日期 |
| request_time | string | 否 | 否 | 请求时间 |
| tran_code | string | 否 | 否 | 交易码 示例：40D22 |

## 3. 请求示例

Url: /yonbip/ctm/saveBankDealDetail?access_token=访问令牌
Body: {
	"request_body": {
		"back_num": "",
		"record": [
			{
				"acct_no": "",
				"acct_name": "",
				"curr_code": "",
				"bank_seq_no": "",
				"tran_date": "20240520",
				"tran_time": "20240520235959",
				"dc_flag": "d/c",
				"tran_amt": 0,
				"acct_bal": 0,
				"to_acct_no": "",
				"to_acct_name": "",
				"to_acct_bank": "",
				"to_acct_bank_name": "",
				"cash_flag": "",
				"oper": "",
				"value_date": "",
				"use_name": "",
				"remark": "",
				"remark01": "",
				"bank_check_code": "",
				"unique_no": ""
			}
		]
	},
	"request_head": {
		"request_date": "",
		"request_time": "",
		"tran_code": "40D22"
	}
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
| code | string | 否 | 返回码 示例：1 |
| message | string | 否 | 操作信息 示例：成功 |
| record | object | 是 | 返回数据 |
| unique_no | string | 否 | 唯一码 |
| code | string | 否 | 错误码 示例：000000 |
| message | string | 否 | 操作信息 |

## 5. 正确返回示例

{
	"code": "1",
	"message": "成功",
	"record": [
		{
			"unique_no": "",
			"code": "000000",
			"message": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

000000	成功	操作成功

010011	失败，需要重试	失败需要重试

010100	失败，不需要重试	失败不需要重试

010012	失败，检查数据准确性	失败，检查数据准确性，重试

010013	失败，检查交易编码	失败，检查交易编码，重试

010014	失败，根据实际情况重试	失败，根据实际情况，重试

1	全部成功	全部成功

2	全部失败	全部失败

3	部分成功	部分成功


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-17

更新

请求说明

更新

请求参数 (28)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

