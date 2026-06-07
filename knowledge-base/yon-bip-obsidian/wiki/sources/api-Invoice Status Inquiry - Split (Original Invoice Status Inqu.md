---
title: "开票状态查询-拆分（原查询发票状态）"
apiId: "1758524924463939586"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "Outbound Enterprise Invoice Folder"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outbound Enterprise Invoice Folder]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票状态查询-拆分（原查询发票状态）

> `ContentType	application/x-www-form-urlencoded` 请求方式	POST | 分类: Outbound Enterprise Invoice Folder (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/invoiceApply/queryInvoiceStatusByysfpqqlsh

请求方式	POST

ContentType	application/x-www-form-urlencoded

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| ysfpqqlsh | string | query | 是 | 原始发票请求流水号    示例: 155524415 |

## 3. 请求示例

Url: /yonbip/tax/api/invoiceApply/queryInvoiceStatusByysfpqqlsh?access_token=访问令牌&ysfpqqlsh=155524415

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 信息说明 示例：操作成功 |
| data | object | 否 | 返回数据 |
| fpqqlsh | string | 否 | 发票请求流水号 示例：1225452144 |
| statuscode | string | 否 | 开票状态码 1-待开票（需要开票员确认开票）;2-开票中;3-开票失败;4-开票成功 示例：1 |
| status | string | 否 | 开票状态 待开票;开票中;开票失败;开票成功 示例：开票成功 |
| bstatus | string | 否 | 版式状态 0-重画版式成功；1-版式失败 （版式失败，data数据中没有pdf） 示例：0 |
| errmsg | string | 否 | 开票失败明细 示例：税控设备错误 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功",
	"data": {
		"fpqqlsh": "1225452144",
		"statuscode": "1",
		"status": "开票成功",
		"bstatus": "0",
		"errmsg": "税控设备错误"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1002	数据不存在	返回错误码


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

