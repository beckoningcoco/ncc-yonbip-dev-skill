---
title: "获取单据打印模板pdf文件"
apiId: "3fbf286af43a4ce982ee024ec3d3547a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reimbursement"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reimbursement]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取单据打印模板pdf文件

> `ContentType	application/json` 请求方式	POST | 分类: Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/common/printbillpdf

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
| pk_billtype | string | 否 | 是 | 单据类型(znbzbx_expensebill:通用报销单;znbzbx_travelexpbill:差旅费报销单;znbzbx_loanbill:个人借款单;znbzbx_pubprepay:对公预付单;znbzbx_returnbill:还款单;znbzbx_busistrip:出差申请单;znbzbx_memoapply:通用申请单;znbzbx_refundbill:退款单;znbzbx_manualwithholding:预提单) 示例：znbzbx_expensebill |
| billID | long | 否 | 是 | 单据ID 示例：2431516334969088 |
| printTmplCode | string | 否 | 是 | 打印模版编码 示例：u8c1622105080000 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/common/printbillpdf?access_token=访问令牌
Body: {
	"pk_billtype": "znbzbx_expensebill",
	"billID": 2431516334969088,
	"printTmplCode": "u8c1622105080000"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 打印PDF的下载地址 示例：https://iuap-tenat-market.oss-cn-beijing.aliyuncs.com/print-pdf/202108/bc4974cd-3103-4b1e-817b-3051152ea3c2.pdf |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "https://iuap-tenat-market.oss-cn-beijing.aliyuncs.com/print-pdf/202108/bc4974cd-3103-4b1e-817b-3051152ea3c2.pdf",
	"displayCode": ""
}

## 6. 业务异常码

035-503-001020


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


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

