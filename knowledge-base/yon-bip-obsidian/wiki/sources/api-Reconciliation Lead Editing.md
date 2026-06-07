---
title: "对账线索编辑"
apiId: "1878146257627119624"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Value-added Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Value-added Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 对账线索编辑

> `ContentType	application/json` 请求方式	POST | 分类: Value-added Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/api/ot-voucher/edit

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
| orgCode | string | 否 | 是 | 税务组织编码 示例：1234567891011 |
| billType | string | 否 | 是 | 单据类型 示例：111 |
| billTypeName | string | 否 | 是 | 单据类型名称 示例：12312 |
| srcBillNo | string | 否 | 是 | 来源单据号 示例：12312321 |
| voucherNo | string | 否 | 是 | 凭证号 示例：1 |
| voucherDate | string | 否 | 否 | 凭证日期(yyyy-MM-dd) 示例：2023-09-01 |
| voucherTypeCode | string | 否 | 否 | 凭证类型code 示例：123123 |
| voucherTypeName | string | 否 | 否 | 凭证类型名称 示例：123123 |
| accountBookCode | string | 否 | 否 | 账簿code 示例：12222 |
| accountBookId | string | 否 | 否 | 账簿ID 示例：12222 |
| voucherId | string | 否 | 否 | 凭证ID 示例：12222 |
| sourceId | string | 否 | 是 | 来源ID 示例：12222 |
| id | string | 否 | 是 | 主键ID 示例：111 |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/ot-voucher/edit?access_token=访问令牌
Body: {
	"orgCode": "1234567891011",
	"billType": "111",
	"billTypeName": "12312",
	"srcBillNo": "12312321",
	"voucherNo": "1",
	"voucherDate": "2023-09-01",
	"voucherTypeCode": "123123",
	"voucherTypeName": "123123",
	"accountBookCode": "12222",
	"accountBookId": "12222",
	"voucherId": "12222",
	"sourceId": "12222",
	"id": "111"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	操作失败	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-09

更新

请求参数 orgCode

税务组织改造


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

