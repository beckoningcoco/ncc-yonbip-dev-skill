---
title: "商旅订单删除"
apiId: "1976730892535595016"
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

# 商旅订单删除

> `ContentType	application/json` 请求方式	POST | 分类: Personal Invoices (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/billcommon/deleteBtisInvoices

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
| orderNos | string | 是 | 是 | 订单编号 示例：["123","456"] |
| openapi_bitis_del_secret_key | string | 否 | 是 | 商旅订单删除密钥 |
| timeStamp | string | 否 | 是 | 时间戳 示例：1715372676000 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/billcommon/deleteBtisInvoices?access_token=访问令牌
Body: {
	"orderNos": [
		"123",
		"456"
	],
	"openapi_bitis_del_secret_key": "",
	"timeStamp": "1715372676000"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| orderId | object | 是 | 订单编号 |
| vparentsourcesysid | string | 否 | 父订单号 示例：F11414209774515650560 |
| nuntaxmny | string | 否 | 订单金额 示例：20 |
| vinvoicetypename | string | 否 | 订单类型名称 示例：飞机订单 |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"orderId": [
			{
				"vparentsourcesysid": "F11414209774515650560",
				"nuntaxmny": "20",
				"vinvoicetypename": "飞机订单"
			}
		],
		"displayCode": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000101	商旅订单orderNos不能为空

1021000102	当前删除订单数量过多，共计：()条，目前仅支持批量删除数量最多20条

1021000104	数据库未查询到订单号集包括：()

1021000105	订单编号:"()未查询到父订单号"

1021000106	非商旅订单无法删除

1021000107	订单号：()的父订单号为空！

1021000108	订单号：()已经报销的票据无法删除！报销单：()

1021000110	vdef1为null的订单，且不是数电票的单据来源系统id:()

1021000111	租户信息或商旅密文为空

1021000112	无删除操作权限（密钥错误）

1021000113	时间戳无效


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

