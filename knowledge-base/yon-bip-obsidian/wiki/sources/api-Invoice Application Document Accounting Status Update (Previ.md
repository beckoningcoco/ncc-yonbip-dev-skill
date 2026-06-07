---
title: "开票申请单记账状态更新（原未开票记账状态更新）"
apiId: "1847864144030597120"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoice Request"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoice Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票申请单记账状态更新（原未开票记账状态更新）

> `ContentType	application/json` 请求方式	POST | 分类: Invoice Request (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/api/invoice-will/updateAccountStatus

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
| djqqlsh | string | 否 | 是 | 单据请求流水号 示例：12303212385651 |
| accountStatus | string | 否 | 是 | 记账状态 1：未记账；2：已记账 示例：1 |
| accountTime | string | 否 | 是 | 记账时间 yyy-MM-dd 示例：2023-08-31 |
| accountNote | string | 否 | 否 | 记账备注 示例：测试接口记账 |
| srcVoucherId | string | 否 | 否 | 凭证主键 示例：222,333 |
| accountVoucherNo | string | 否 | 否 | 凭证号 示例：567 |
| accountUser | string | 否 | 否 | 记账人 示例：张三 |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/invoice-will/updateAccountStatus?access_token=访问令牌
Body: [{
	"djqqlsh": "12303212385651",
	"accountStatus": "1",
	"accountTime": "2023-08-31",
	"accountNote": "测试接口记账",
	"srcVoucherId": "222,333",
	"accountVoucherNo": "567",
	"accountUser": "张三"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回状态码 示例：0000 |
| message | string | 否 | 返回提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1001	返回错误码	按返回信息处理


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

