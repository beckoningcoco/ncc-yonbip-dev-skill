---
title: "贴现办理查询"
apiId: "1845596650417946629"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Process Discounting"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Process Discounting]
platform_version: "BIP"
source_type: community-api-docs
---

# 贴现办理查询

> `ContentType	application/json` 请求方式	POST | 分类: Process Discounting (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/discountapi/query/discountdetail

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
| accentityCodes | string | 是 | 否 | 会计主体编码 示例：["A0001"] |
| ytenantId | string | 否 | 否 | 租户id 示例：00 |
| noteNo | string | 否 | 否 | 票据号 示例：00 |
| discountDateStart | string | 否 | 否 | 贴现日期开始 示例：2023-10-01 |
| discountDateEnd | string | 否 | 否 | 贴现日期结束 示例：2023-10-01 |
| billBType | string | 否 | 否 | 票据大类0-商业汇票 1-银行汇票 2-债权凭证 示例：0 |
| bankAccept | string | 否 | 否 | 票据介质0-纸质票据 1-电子票据 示例：0 |
| notetypeCode | string | 否 | 否 | 票据类型编码 示例：D001 |
| hasCleared | string | 否 | 否 | 是否结清0-空或者未结清 1-已结清 为空表示全部 示例：0 |
| invoiceDate | string | 否 | 否 | 出票日期 示例：2023-10-01 |
| endDate | string | 否 | 否 | 到期日期 示例：2023-10-01 |
| acceptOpenBankNumber | string | 否 | 否 | 承兑人开户行行号 示例：00 |
| interestPayType | string | 否 | 否 | 付息方式0-卖方付息 1-买方付息 2-协议付息 示例：0 |
| recourse | string | 否 | 否 | 是否追索0-否 1-是 示例：0 |
| billStatus | string | 否 | 否 | 单据状态0-在贴现 1-已贴现 2-已作废 示例：0 |

## 3. 请求示例

Url: /yonbip/ctm/discountapi/query/discountdetail?access_token=访问令牌
Body: {
	"accentityCodes": [
		"A0001"
	],
	"ytenantId": "00",
	"noteNo": "00",
	"discountDateStart": "2023-10-01",
	"discountDateEnd": "2023-10-01",
	"billBType": "0",
	"bankAccept": "0",
	"notetypeCode": "D001",
	"hasCleared": "0",
	"invoiceDate": "2023-10-01",
	"endDate": "2023-10-01",
	"acceptOpenBankNumber": "00",
	"interestPayType": "0",
	"recourse": "0",
	"billStatus": "0"
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
| code | string | 否 | 请求结果00：成功 其它失败 示例：00 |
| message | string | 否 | 失败原因 示例：00 |
| data | object | 否 | data |
| resultCount | long | 否 | 本次查询记录数 示例：10 |
| headExtendsData | string | 否 | 扩展字段 |
| discountDatas | object | 是 | discountDatas |

## 5. 正确返回示例

{
	"code": "00",
	"message": "00",
	"data": {
		"resultCount": 10,
		"headExtendsData": "",
		"discountDatas": [
			{
				"accentity": "00",
				"discountDate": "00",
				"noteTypeCode": "00",
				"noteNo": "00",
				"billRange": "00",
				"invoiceDate": "00",
				"endDate": "00",
				"discountAmount": "00",
				"discountInBankName": "00",
				"discountInBankNo": "00",
				"discountBankAccount": "00",
				"discountBankName": "00",
				"discountBankNo": "00",
				"interestPayType": "00",
				"discountRate": "00",
				"rateDayNum": "00",
				"discountDelayDays": "00",
				"discountInterest": "00",
				"poundageAmount": "00",
				"discountMoney": "00",
				"dealType": "00",
				"businessAccountDate": "00",
				"isCanTrans": "00",
				"currency": "00",
				"payBillRoles": "00",
				"payerId": "00",
				"payerName": "00",
				"payerBankAcc": "00",
				"invoiceRoles": "00",
				"invoicerId": "00",
				"invoicerName": "00",
				"invoicerBankAcc": "00",
				"invoiceOpenBankName": "00",
				"invoiceOpenBankNo": "00",
				"receiverId": "00",
				"receiverName": "00",
				"receiverBankAcc": "00",
				"receiverOpenBankName": "00",
				"receiverOpenBankNo": "00",
				"acceptanceRoles": "00",
				"acceptancerId": "00",
				"acceptancerName": "00",
				"acceptancerBankAcc": "00",
				"acceptancerOpenBankName": "00",
				"acceptancerOpenBankNo": "00",
				"billStatus": "00",
				"hasCleared": "00",
				"rExtendData": {
					"def1": "00"
				},
				"billId": "00",
				"billCode": "00"
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

