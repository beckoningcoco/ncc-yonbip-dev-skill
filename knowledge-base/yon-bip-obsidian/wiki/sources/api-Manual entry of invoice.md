---
title: "手录行程"
apiId: "2382718963943473160"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personal Invoices"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personal Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 手录行程

> `ContentType	application/json` 请求方式	POST | 分类: Personal Invoices (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/rbsm/api/billcommon/manualApiInvoices

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
| nmny | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 金额 |
| pk_startaddr | string | 否 | 否 | 出发地 |
| pk_costaddr | string | 否 | 否 | 目的地 |
| dcostdate | string | 否 | 否 | 发生日期 |
| itraffictype | number |
| 小数位数:0,最大长度:2 | 否 | 否 | 交通费用类型 |
| pk_consumekind | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 消费类型 |
| pk_costpsndoc | string | 否 | 否 | 费用人员 |
| vcurrency | string | 否 | 否 | 币种 |

## 3. 请求示例

Url: /yonbip/FCC/rbsm/api/billcommon/manualApiInvoices?access_token=访问令牌
Body: {
	"nmny": 0,
	"pk_startaddr": "",
	"pk_costaddr": "",
	"dcostdate": "",
	"itraffictype": 0,
	"pk_consumekind": 0,
	"pk_costpsndoc": "",
	"vcurrency": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| id | string | 否 | id |
| tallydata | object | 否 | tallydata |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"tallydata": {}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-31

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

