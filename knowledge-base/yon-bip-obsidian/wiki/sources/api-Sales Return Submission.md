---
title: "销售退货提交"
apiId: "0a44dfd939074211bfca40a9fafde895"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Return"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Return]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售退货提交

> `ContentType	application/json` 请求方式	POST | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersalereturn/submit

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
| data | object | 是 | 是 | 退货单[SaleReturn] |
| id | long | 否 | 是 | 退货单主表id 示例：2591830206731008 |

## 3. 请求示例

Url: /yonbip/sd/vouchersalereturn/submit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2591830206731008
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
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返 示例：200 |
| message | string | 否 | 调用信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| count | long | 否 | 返回数据总数 示例：1 |
| sucessCount | long | 否 | 返回成功数 示例：1 |
| failCount | long | 否 | 返回失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 单据信息 |
| failInfos | string | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"natCurrencyCode": "CNY",
				"source": "voucher_saleoutlist_pull",
				"realMoney": 10000,
				"payMoneyDomestic": 10000,
				"natCurrency": "2155547424560384",
				"invoiceTitleType": 0,
				"bizId": 2155538208313600,
				"modifyInvoiceType": true,
				"id": 2670616104407808,
				"payMoneyOrigTaxfree": 9708.737864,
				"natCurrencyName": "人民币",
				"refundUnConfirmMoney": 0,
				"corpContact": "2163960865427712",
				"isWfControlled": true,
				"totalMoney": 10000,
				"agentRelationId": 2251598196248832,
				"saleReturnStatus": "APPROVING",
				"invoiceAgentId": 2216247878177024,
				"corpContactUserName": "倪帅臣",
				"barCode": "voucher_salereturn|2670616104407808",
				"rebateToOrderMoney": 0,
				"rebateToCashMoneyDomesticTaxfree": 0,
				"payMoneyDomesticTaxfree": 9708.737864,
				"saleDepartmentId": "2163953113665792",
				"rebateToOrderMoneyOrigTaxfree": 0,
				"settlementOrgId": "2163951720681984",
				"totalNatTax": 291.262136,
				"status": 3,
				"verifystate": 1,
				"agentId": 2251598175195392,
				"code": "S0T5-0000000000-20220302-000000",
				"rebateToCashMoneyDomestic": 0,
				"rebateToOrderMoneyDomesticTaxfree": 0,
				"shop": -1,
				"invoiceMoney": 0,
				"creatorId": 2192008994279680,
				"refundStatus": "NONE",
				"bizFlow": "01d906ac-9756-11eb-930b-00163e0abb70",
				"exchRate": 1,
				"rebateToCashMoney": 0,
				"vouchdate": "2022-03-02 00:00:00",
				"taxInclusive": true,
				"refundConfirmMoney": 0,
				"payMoney": 10000,
				"currencyName": "人民币",
				"isDeleted": 0,
				"totalMoneyDomesticTaxfree": 9708.737864,
				"currency": "2155547424560384",
				"saleReturnMemoId": 2670616104407808,
				"saleReturnSourceType": "DELIVERYEND",
				"pubts": "2022-03-02 15:07:19",
				"isFlowCoreBill": false,
				"refundAmount": 0,
				"createDate": "2022-03-02 14:11:11",
				"rebateToOrderMoneyDomestic": 0,
				"creator": "刘预发接口测试员工",
				"rebateToCashMoneyOrigTaxfree": 0,
				"uordercorp": 2155538208313600,
				"transactionTypeId": "2155547426656517",
				"totalMoneyDomestic": 10000,
				"receiveId": 2251598175211778,
				"exchangeRateType": "2155547426346240",
				"createTime": "2022-03-02 14:11:11",
				"totalMoneyOrigTaxfree": 9708.737864,
				"currencyCode": "CNY",
				"invoiceUpcType": 0,
				"totalOriTax": 291.262136,
				"salesOrgId": "2163951720681984"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	单据不存在	请传入正确的单据信息


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

