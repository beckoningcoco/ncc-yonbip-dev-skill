---
title: "批量查询银行账户余额"
apiId: "2122907140929093633"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Real-Time Historical Balance"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Real-Time Historical Balance]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量查询银行账户余额

> `ContentType	application/json` 请求方式	POST | 分类: Account Real-Time Historical Balance (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmp/bankaccount/batchQueryBalance

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
| data_sources | string | 否 | 是 | 数据来源，0 实时获取 1 已有数据；实时查询会调用银企联接口实时获取余额 已有数据会返回系统中已经查询到的数据 |
| acctbal_type | string | 否 | 是 | 余额类型 0 当日余额 1 历史余额；当日余额与历史余额不允许同时查询； 查询当日余额时，开始日期、结束日期默认为空；查询历史余额时，开始日期、结束日期必填，且结束日期需早于当前日期 |
| data | object | 是 | 是 | 账户数据 最大请求量：100 |
| acct_no | string | 否 | 是 | 银行账户 |
| acct_name | string | 否 | 是 | 银行账户户名 |
| curr_code | string | 否 | 是 | 币种编码，如CNY |
| begin_date | string | 否 | 是 | 开始日期，如2023-12-21(兼容20231121) |
| end_date | string | 否 | 是 | 结束日期，最大范围为30天，如2023-12-21(兼容20231221)；需晚于等于开始日期，早于当前日期 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankaccount/batchQueryBalance?access_token=访问令牌
Body: {
	"data_sources": "",
	"acctbal_type": "",
	"data": [
		{
			"acct_no": "",
			"acct_name": "",
			"curr_code": "",
			"begin_date": "",
			"end_date": ""
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message |
| data | object | 是 | data |
| acct_no | string | 否 | 银行账号 |
| acct_name | string | 否 | 银行户名 |
| curr_code | string | 否 | 币种编号 |
| avlbal | number |
| 小数位数:0,最大长度:10 | 否 | 账户可用余额 示例：0 |
| acctbal | number |
| 小数位数:0,最大长度:10 | 否 | 账户余额 示例：0 |
| frzbal | number |
| 小数位数:0,最大长度:10 | 否 | 冻结金额 示例：0 |
| balancedate | string | 否 | 余额日期 |
| pubts | string | 否 | 时间戳 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"acct_no": "",
			"acct_name": "",
			"curr_code": "",
			"avlbal": 0,
			"acctbal": 0,
			"frzbal": 0,
			"balancedate": "",
			"pubts": ""
		}
	]
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

