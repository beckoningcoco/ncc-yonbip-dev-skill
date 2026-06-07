---
title: "银行交易回单数据新增"
apiId: "2132047939436019712"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Transaction Receipt"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Transaction Receipt]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行交易回单数据新增

> `ContentType	application/json` 请求方式	POST | 分类: Account Transaction Receipt (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/bank/tran/add

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 否 | 账户所属组织ID 非必填，默认取企业账户档案中的所属组织 |
| accentity_code | string | 否 | 否 | 账户所属组织编码 非必填，默认取企业账户档案中的所属组织 |
| currency | string | 否 | 否 | 币种ID 必填其一，同时传入以ID为准(币种为本方银行账户支持的币种) |
| currency_code | string | 否 | 否 | 币种编码 必填其一，同时传入以ID为准(币种为本方银行账户支持的币种) |
| bankaccount | string | 否 | 否 | 本方银行账户ID 必填其一，同时传入以ID为准 |
| bankaccount_account | string | 否 | 否 | 本方银行账户-账号 必填其一，同时传入以ID为准 |
| receiptno | string | 否 | 是 | 回单编号 存储传入值 |
| bank_seq_no | string | 否 | 是 | 银行交易流水号 |
| tran_date | date |
| 格式:yyyy-MM-dd | 否 | 是 | 交易日期 yyyy-MM-dd 交易日期&时间为同一天 |
| tranTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 交易时间 yyyy-MM-dd HH:mm:ss 交易日期&时间为同一天 |
| dc_flag | string | 否 | 是 | 收付方向 1:支出 2:收入 |
| tran_amt | string | 否 | 是 | 交易金额 |
| bankcheckcode | string | 否 | 否 | 银行对账码 |
| to_acct_no | string | 否 | 否 | 对方账号 |
| to_acct_name | string | 否 | 否 | 对方账户名 |
| to_acct_bank | string | 否 | 否 | 对方开户行 |
| to_acct_bank_name | string | 否 | 否 | 对方开户行名 |
| use_name | string | 否 | 否 | 用途 |
| remark | string | 否 | 否 | 摘要 |
| postscript | string | 否 | 否 | 附言 |
| extendContent | string | 否 | 否 | 扩展信息 |
| filename | string | 否 | 是 | 电子回单文件名称 文件名称的后缀名必须填写，且仅支持格式pdf/ofd/png/jpg/jpeg/bmp（不区分大小写,新增电子回单文件名称不能与系统已有回单文件名称相同) |
| detailReceiptRelationCode | string | 否 | 否 | 流水回单关联码，非必填。传递后可用于流水与回单进行关联 |

## 3. 请求示例

Url: /yonbip/ctm/bank/tran/add?access_token=访问令牌
Body: [{
	"accentity": "",
	"accentity_code": "",
	"currency": "",
	"currency_code": "",
	"bankaccount": "",
	"bankaccount_account": "",
	"receiptno": "",
	"bank_seq_no": "",
	"tran_date": "2026-06-07",
	"tranTime": "2026-06-07 12:08:20",
	"dc_flag": "",
	"tran_amt": "",
	"bankcheckcode": "",
	"to_acct_no": "",
	"to_acct_name": "",
	"to_acct_bank": "",
	"to_acct_bank_name": "",
	"use_name": "",
	"remark": "",
	"postscript": "",
	"extendContent": "",
	"filename": "",
	"detailReceiptRelationCode": ""
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| id | string | 否 | 新增回单的主键 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-27

更新

请求参数 detailReceiptRelationCode

2	2025-06-07

新增

请求参数 detailReceiptRelationCode

更新

请求参数 accentity

更新

请求参数 accentity_code


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

