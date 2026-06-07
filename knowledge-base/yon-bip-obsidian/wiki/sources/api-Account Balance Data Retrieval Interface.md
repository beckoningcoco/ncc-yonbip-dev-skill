---
title: "科目余额发生取数接口"
apiId: "3ce1dc0700b4408e866dd45751a6d1e8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Ledger"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Ledger]
platform_version: "BIP"
source_type: community-api-docs
---

# 科目余额发生取数接口

> `ContentType	application/json` 请求方式	POST | 分类: General Ledger (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/ficloud/api/amount/query

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accbookCode | string | 否 | 是 | 账簿编码 示例：0209_0001 |
| period | string | 否 | 是 | 会计年-会计月，格式：2021-01 示例：2021-02 |
| accsubjectCode | string | 否 | 是 | 科目编码,如果是非末级科目，自动包含下级所有科目 示例：1121 |
| fetchFlag | string | 否 | 是 | 取数性质,OpenBal--期初余额 ；CloseBal--期末余额；Amt--当期发生；NetAmt--当期净发生；AccumAmt--当期累计发生 示例：OpenBal |
| auxiliaryInfoList | object | 是 | 否 | [辅助核算类型=辅助核算档案编码,辅助核算类型=辅助核算档案编码] |
| docType | string | 否 | 否 | 辅助核算类型 示例：dept |
| docCode | string | 否 | 否 | 辅助核算档案编码 示例：123456 |
| direction | string | 否 | 否 | 方向,debit--借方；credit--贷方；null--借方-贷方（默认） |
| recordFlag | string | 否 | 否 | 是否包含未记账,1--包含；0--不包含（默认） |
| lossFlag | long | 否 | 否 | 是否包含损益凭证,1--包含；0--不包含（默认） 示例：1 |
| currency | string | 否 | 否 | 币种编码，不传默认返回本币 示例：USD |

## 3. 请求示例

Url: /yonbip/fi/ficloud/api/amount/query?access_token=访问令牌
Body: {
	"accbookCode": "0209_0001",
	"period": "2021-02",
	"accsubjectCode": "1121",
	"fetchFlag": "OpenBal",
	"auxiliaryInfoList": [
		{
			"docType": "dept",
			"docCode": "123456"
		}
	],
	"direction": "",
	"recordFlag": "",
	"lossFlag": 1,
	"currency": "USD"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| success | boolean | 否 | 返回成功标识 示例：true |
| message | string | 否 | 返回信息 |
| data | string | 否 | 返回数据 示例：100.00000000 |
| code | long | 否 | 返回编码 示例：1 |
| total | long | 否 | 总计 示例：0 |

## 5. 正确返回示例

{
	"success": true,
	"message": "",
	"data": "100.00000000",
	"code": 1,
	"total": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

success	false


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

