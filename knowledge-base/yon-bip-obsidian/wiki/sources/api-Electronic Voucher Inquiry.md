---
title: "电子凭证查询"
apiId: "1760350912637829124"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子凭证查询

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/input-tax/api/evoucher/query

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情批量查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| bills | object | 是 | 是 | 票据信息 |
| billCode | string | 否 | 否 | 发票代码 示例：1245 |
| billNum | string | 否 | 否 | 发票号码（srcBillid和billNum不能同时为空） 示例：4567 |
| srcBillid | string | 否 | 否 | 单据pk（srcBillid和billNum不能同时为空） 示例：121234 |
| billType | string | 否 | 否 | 票据类型（invoice-增值税发票；train-火车票；air-航空电子行程单；nontax-财政非税票据（包含医疗门诊、住院）） 示例：invoice |
| srcBillType | string | 否 | 否 | 来源单据类型（非枚举，可与srcBillid联合确定唯一性） 示例：4444 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/evoucher/query?access_token=访问令牌
Body: {
	"bills": [
		{
			"billCode": "1245",
			"billNum": "4567",
			"srcBillid": "121234",
			"billType": "invoice",
			"srcBillType": "4444"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 返回数据 |
| evoucherXml | string | 否 | 电子凭证XML base64编码 示例：base64String |
| uniqueCode | string | 否 | 发票唯一标识 对应类型xml解析出的字段 示例：ElectronicInvoiceRailwayETicketNumber |
| billType | string | 否 | 票据类型（invoice-增值税发票;tolls-过路费;train-火车票;quota-定额发票;machine-机打发票;taxi-出租车发票;passenger-客运发票;air-航空电子行程单;other-其他发票;nontax-财政非税票据（包含医疗门诊、住院）,增值税时，invoice-1、invoice-2根据1、2来区分是专票(2)还是普票(1)） 示例：invoice-2 |
| bred | long | 否 | 是否红字发票（0-否 1-是 ） 示例：1 |
| yyVerifyStatus | long | 否 | 用友查验状态（0-未查验,1-相符, 2-不相符,3-未通过,4-失败） 示例：1 |
| payeeName | string | 否 | 收款方 示例：王xx |
| billCode | string | 否 | 发票代码 示例：12345 |
| billNum | string | 否 | 发票号码 示例：4444576 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"evoucherXml": "base64String",
			"uniqueCode": "ElectronicInvoiceRailwayETicketNumber",
			"billType": "invoice-2",
			"bred": 1,
			"yyVerifyStatus": 1,
			"payeeName": "王xx",
			"billCode": "12345",
			"billNum": "4444576"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


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

