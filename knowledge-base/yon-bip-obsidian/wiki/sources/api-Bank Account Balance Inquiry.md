---
title: "银行账户余额查询"
apiId: "1556040933265375238"
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

# 银行账户余额查询

> `ContentType	application/json` 请求方式	POST | 分类: Account Real-Time Historical Balance (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmp/bankaccount/realtimebalance

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
| accentity_code | string | 否 | 是 | 账户使用组织编码 示例：ZSZB |
| enterpriseBankAccount | string | 否 | 否 | 银行账户名称 |
| enterpriseBankAccount_code | string | 否 | 否 | 银行账户编码 |
| currency | string | 否 | 否 | 币种ID |
| currency_code | string | 否 | 否 | 币种名称 |
| open_balancedate_begin | string | 否 | 是 | 余额日期开始日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-23 |
| open_balancedate_end | string | 否 | 是 | 余额日期结束日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-23 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 属性名(条件) ，1：pubts(时间戳) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 值1 示例：2022-05-24 20:34:29 |
| value2 | string | 否 | 否 | 值2 示例：2022-05-25 20:34:29 |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankaccount/realtimebalance?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "2591580914225408",
	"accentity_code": "ZSZB",
	"enterpriseBankAccount": "",
	"enterpriseBankAccount_code": "",
	"currency": "",
	"currency_code": "",
	"open_balancedate_begin": "2022-05-23",
	"open_balancedate_end": "2022-05-23",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2022-05-24 20:34:29",
			"value2": "2022-05-25 20:34:29"
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
| pageIndex | long | 否 | 页号 示例：1 |
| pageSize | long | 否 | 每页数量 示例：10 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 返回数据 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 开始页号 示例：1 |
| endPageIndex | long | 否 | 终止页号 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"id": 2788485821747968,
				"accentity": "2591580914225408",
				"accentity_name": "曾氏总部",
				"accentity_code": "ZSZB",
				"currency": "2591342867010560",
				"currency_name": "人民币",
				"currency_priceDigit": 2,
				"currency_moneyDigit": 2,
				"enterpriseBankAccount": "2719941813391872",
				"enterpriseBankAccount_name": "北京畅捷通支付技术有限公司",
				"enterpriseBankAccount_account": "699973566",
				"enterpriseBankAccount_bankNumber_name": "中国民生银行北京万柳支行",
				"enterpriseBankAccount_bank_name": "中国民生银行",
				"avlbal": 779.13,
				"acctbal": 779.13,
				"flag": "1",
				"frzbal": 0,
				"openFlag": 1,
				"balancedate": "2022-05-24 00:00:00",
				"pubts": "2022-05-24 20:34:29",
				"createDate": "2022-05-24 20:34:29",
				"createTime": "2022-05-24 00:00:00",
				"creator": "曾刚"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	账户使用组织不存在	请输入正确的账户使用组织ID或编码


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

