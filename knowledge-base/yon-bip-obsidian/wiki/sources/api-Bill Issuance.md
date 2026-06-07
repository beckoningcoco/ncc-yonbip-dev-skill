---
title: "票据签发"
apiId: "b15c0aa471e04f5c94184b99d79c21f7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 票据签发

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/drft/api/signnote/apply

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 是 | 会计主体名称 示例：四方公司 |
| acceptBankAcc | string | 否 | 是 | 承兑人账号 示例：622000 |
| acceptBankAccName | string | 否 | 否 | 承兑人账户名称 示例：李四 |
| billType | string | 否 | 是 | 票据类型:AC01=银承AC02=商承 示例：AC01 |
| contractNo | string | 否 | 是 | 交易合同号 示例：YS123456 |
| elecInvoiceBankName | string | 否 | 是 | 出票人银行名称 示例：工商银行 |
| elecInvoiceBankNum | string | 否 | 是 | 出票人银行代码 示例：123456 |
| elecInvoiceMode | string | 否 | 否 | 票据方式01=授信开票，默认，02=质押开票，03=背书开票 示例：01 默认值：01 |
| elecacceptBankName | string | 否 | 否 | 承兑人银行名称 示例：农业 |
| elecacceptBankNum | string | 否 | 否 | 承兑人银行代码 示例：123456 |
| elecacceptCurrencyType | string | 否 | 否 | 承兑人账号币种类别 示例：CNY 默认值：CNY |
| elecacceptOtherBank | string | 否 | 否 | 承兑人跨行标志:承兑人为本人时只能为本行，00=本行，10=跨行 示例：00 |
| elecacceptOwner | string | 否 | 否 | 承兑人是否为本人:1本人，2他人 示例：1 默认值：1 |
| elecreceiveBankName | string | 否 | 是 | 收款人账号银行名称 示例：YS123456 |
| elecreceiveBankNum | string | 否 | 是 | 收款人账号银行代码 示例：YS123456 |
| elecreceiveCurrencyType | string | 否 | 否 | 收款人账号币种类别:默认CNY人民币 示例：CNY 默认值：CNY |
| elecreceiveOtherBank | string | 否 | 否 | 收款人跨行标志:00本行，10跨行 示例：00 |
| extend | string | 否 | 否 | 扩展字段 示例：xxxxxxxx |
| invoiceDate | string | 否 | 否 | 出票日期 示例：20210415 |
| invoicerBankAccName | string | 否 | 是 | 出票人账户名称 示例：张三 |
| invoicerCurrencyType | string | 否 | 否 | 出票人账号币种类别 示例：CNY 默认值：CNY |
| isTransfer | long | 否 | 否 | 是否可转让:1可再转让，0不得转让 示例：1 |
| noteMoney | BigDecimal | 否 | 是 | 票据金额 |
| receiver | string | 否 | 是 | 收款人 示例：王五 |
| receiverBankAcc | string | 否 | 是 | 收款人账号 示例：62220000 |
| receiverBankAccName | string | 否 | 是 | 收款人账户名称 示例：王五 |
| serialNum | string | 否 | 是 | 收付云业务流水号 示例：YS123456 |
| srcItem | long | 否 | 是 | 事项来源:51：四方 示例：51 |
| isNewType | long | 否 | 否 | 是否新一代票 示例：1 |
| ifsepFlow | long | 否 | 否 | 能否分包流转 示例：1 |
| invoicer | string | 否 | 否 | 出票人 示例：测试 |
| invoicerBankAcc | string | 否 | 否 | 出票人账号 示例：123456789-2 |
| acceptancer | string | 否 | 否 | acceptancer 示例：平安银行深圳分行营业部 |

## 3. 请求示例

Url: /yonbip/ctm/drft/api/signnote/apply?access_token=访问令牌
Body: {
	"accentity": "四方公司",
	"acceptBankAcc": "622000",
	"acceptBankAccName": "李四",
	"billType": "AC01",
	"contractNo": "YS123456",
	"elecInvoiceBankName": "工商银行",
	"elecInvoiceBankNum": "123456",
	"elecInvoiceMode": "01",
	"elecacceptBankName": "农业",
	"elecacceptBankNum": "123456",
	"elecacceptCurrencyType": "CNY",
	"elecacceptOtherBank": "00",
	"elecacceptOwner": "1",
	"elecreceiveBankName": "YS123456",
	"elecreceiveBankNum": "YS123456",
	"elecreceiveCurrencyType": "CNY",
	"elecreceiveOtherBank": "00",
	"extend": "xxxxxxxx",
	"invoiceDate": "20210415",
	"invoicerBankAccName": "张三",
	"invoicerCurrencyType": "CNY",
	"isTransfer": 1,
	"noteMoney": 0,
	"receiver": "王五",
	"receiverBankAcc": "62220000",
	"receiverBankAccName": "王五",
	"serialNum": "YS123456",
	"srcItem": 51,
	"isNewType": 1,
	"ifsepFlow": 1,
	"invoicer": "测试",
	"invoicerBankAcc": "123456789-2",
	"acceptancer": "平安银行深圳分行营业部"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | long | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 否 | 响应体 |
| billNo | string | 否 | 票据号 示例：YS123456 |
| businessNum | string | 否 | 响应业务流水号 示例：YS123456 |
| serialNum | string | 否 | 收付云业务流水号 示例：YS123456 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"billNo": "YS123456",
		"businessNum": "YS123456",
		"serialNum": "YS123456"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403500	服务器异常

1022020403002	参数为空

1022020403004	日期格式错误

1022020403001	参数错误


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

