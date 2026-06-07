---
title: "票据工作台现有票据列表接口"
apiId: "1670353626730594311"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 票据工作台现有票据列表接口

> `ContentType	application/json` 请求方式	POST | 分类: Bill Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/noteInformation/list

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
| acctgSubject | string | 否 | 是 | 会计主体 |
| tranDate | string | 否 | 否 | 交易日期 |
| payerType | short | 否 | 否 | 付票方 0=资金业务对象 1=客户 2=供应商 3=其他 |
| payer | string | 否 | 否 | 付票人 |
| payerName | string | 否 | 否 | 付票人名称 |
| receiverType | short | 否 | 否 | 收票方 1=客户 2=供应商 3=其他 4=本企业 5=资金业务对象 |
| receiver | string | 否 | 否 | 收票人 |
| receiverName | string | 否 | 否 | 收票人名称 |
| currency | string | 否 | 否 | 币种 |
| billType | string | 否 | 否 | 票据类型 |
| billDirection | short | 否 | 否 | 票据方向 |
| isSettlement | short | 否 | 否 | 是否结清 1=未结清 2=已结清 |
| noteStatus | short | 否 | 否 | 票据状态 |
| isHold | short | 否 | 否 | 是否持有 0=持有 1=非持有 2-全部，默认0=持有 |

## 3. 请求示例

Url: /yonbip/ctm/api/noteInformation/list?access_token=访问令牌
Body: {
	"acctgSubject": "",
	"tranDate": "",
	"payerType": 0,
	"payer": "",
	"payerName": "",
	"receiverType": 0,
	"receiver": "",
	"receiverName": "",
	"currency": "",
	"billType": "",
	"billDirection": 0,
	"isSettlement": 0,
	"noteStatus": 0,
	"isHold": 0
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
| code | string | 否 | 请求结果 |
| message | string | 否 | 失败原因 |
| data | object | 否 | data |
| recordNum | long | 否 | 本次查询记录数 |
| recordList | object | 是 | recordList |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"recordNum": 0,
		"recordList": [
			{
				"acctgSubject": "",
				"tranDate": "",
				"billType": "",
				"billtypeno": "",
				"billDirection": 0,
				"billNo": "",
				"invoiceDate": "",
				"endDate": "",
				"noteMoney": 0,
				"billCurrency": "",
				"payerType": 0,
				"payer": {},
				"payAcc": "",
				"invoicerType": 0,
				"invoicer": {},
				"invoicerBankAcc": "",
				"invoicerOpenBankName": "",
				"receiverType": 0,
				"receiver": {},
				"receiverBankAcc": "",
				"receiverOpenBankName": "",
				"acceptType": 0,
				"acceptancerid": 0,
				"acceptancer": "",
				"acceptBankAcc": "",
				"acceptOpenBankName": "",
				"acceptOpenBankNo": "",
				"isTransfer": 0,
				"noteStatus": "",
				"ecdsStatus": "",
				"isSettlement": 0
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

