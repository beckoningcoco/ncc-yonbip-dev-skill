---
title: "批量开票状态查询"
apiId: "1874302330643415041"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量开票状态查询

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/api/invoiceApply/batchQueryInvoiceStatus

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| fpqqlshs | string | query | 是 | 发票请求流水号数组的json字符串，单次最多查询20个    示例: ["11223344","55667788"] |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/invoiceApply/batchQueryInvoiceStatus?access_token=访问令牌&fpqqlshs=%5B%2211223344%22%2C%2255667788%22%5D

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 是 | 数据列表 |
| code | string | 否 | 状态码 示例：0000 |
| msg | string | 否 | 消息 示例：操作成功 |
| fpqqlsh | string | 否 | 发票请求流水号 示例：11223344 |
| statuscode | string | 否 | 开票状态码 1-待开票（需要开票员确认开票）;2-开票中;3-开票失败;4-开票成功 示例：1 |
| status | string | 否 | 开票状态： 待开票;开票中;开票失败;开票成功 示例：待开票 |
| errmsg | string | 否 | 开票失败明细：开票状态为失败时，此处为明细信息 示例：税控设备错误 |
| bsstatus | string | 否 | 版式状态：0-重画版式成功；1-版式失败 （版式失败，data数据中没有pdf） 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "0000",
			"msg": "操作成功",
			"fpqqlsh": "11223344",
			"statuscode": "1",
			"status": "待开票",
			"errmsg": "税控设备错误",
			"bsstatus": "0"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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

