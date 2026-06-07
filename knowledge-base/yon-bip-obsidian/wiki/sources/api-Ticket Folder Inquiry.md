---
title: "票夹查询"
apiId: "2118718551405101064"
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

# 票夹查询

> `ContentType	application/json` 请求方式	POST | 分类: Personal Invoices (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/api/billcommon/queryInvoiceWallet

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| creatorId | string | 否 | 否 | 创建人id 示例：2533060013838592 |
| ids | string | 是 | 否 | 票夹id 示例：["1679849876742471700"] |

## 3. 请求示例

Url: /yonbip/znbz/api/billcommon/queryInvoiceWallet?access_token=访问令牌
Body: {
	"creatorId": "2533060013838592",
	"ids": [
		"1679849876742471700"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 操作信息 示例：操作成功 |
| data | object | 是 | 票夹数据 |
| creator | string | 否 | 创建人名字 示例：昵称-黄东发 |
| createTime | string | 否 | 创建时间 示例：2024-10-25 18:11:33 |
| ytenant | string | 否 | 租户关联id 示例：xtikzjvp |
| creatorId | number |
| 小数位数:0,最大长度:16 | 否 | 创建人id 示例：1987089360785664 |
| name | string | 否 | 票袋名字 示例：票袋1 |
| id | number |
| 小数位数:0,最大长度:19 | 否 | 票袋id 示例：2118716756095664000 |
| iorder | number |
| 小数位数:0,最大长度:10 | 否 | 顺序 示例：1 |
| pubts | string | 否 | 时间戳 示例：2024-10-25 18:11:33 |
| invoicenum | number |
| 小数位数:0,最大长度:10 | 否 | 票据数量 示例：0 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | 租户id 示例：1951632932835584 |
| createDate | string | 否 | 创建日期 示例：2024-10-25 00:00:00 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"creator": "昵称-黄东发",
			"createTime": "2024-10-25 18:11:33",
			"ytenant": "xtikzjvp",
			"creatorId": 1987089360785664,
			"name": "票袋1",
			"id": 2118716756095664000,
			"iorder": 1,
			"pubts": "2024-10-25 18:11:33",
			"invoicenum": 0,
			"tenant": 1951632932835584,
			"createDate": "2024-10-25 00:00:00"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

