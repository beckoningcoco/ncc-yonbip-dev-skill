---
title: "对公预付单批量删除"
apiId: "1856707387220033538"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Prepayment Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Prepayment Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 对公预付单批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Prepayment Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/loanbill/batchdelete

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
| data | object | 是 | 是 | 传递的json数据 |
| id | long | 否 | 是 | 单据id 示例：1857211908446224390 |
| pk_billtype | string | 否 | 是 | 单据类型 示例：znbzbx_pubprepay |
| billnum | string | 否 | 是 | 单据类型 示例：znbzbx_pubprepaylist |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/loanbill/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1857211908446224390,
			"pk_billtype": "znbzbx_pubprepay"
		}
	],
	"billnum": "znbzbx_pubprepaylist"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | string | 否 | 响应数据 |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "",
	"displayCode": ""
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

