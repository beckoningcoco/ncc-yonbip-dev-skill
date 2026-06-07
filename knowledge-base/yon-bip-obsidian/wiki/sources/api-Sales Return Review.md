---
title: "销售退货审核"
apiId: "23743e9114c244d9be9830e728332b04"
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

# 销售退货审核

> `ContentType	application/json` 请求方式	POST | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersalereturn/audit

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
| data | object | 否 | 是 | 退货单[voucher.salereturn.SaleReturn] |
| id | long | 否 | 是 | 单据主表id 示例：2088849684795648 |

## 3. 请求示例

Url: /yonbip/sd/vouchersalereturn/audit?access_token=访问令牌
Body: {
	"data": {
		"id": 2088849684795648
	}
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
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| id | long | 否 | 主体ID 示例：2295307742662912 |
| bizId | long | 否 | 商家id 示例：2213418494152960 |
| agentRelationId | long | 否 | 客户交易关系id 示例：2214563370995969 |
| salesOrgId | string | 否 | 销售组织id 示例：2213500664107264 |
| settlementOrgId | string | 否 | 财务组织id 示例：2213500664107264 |
| agentId | long | 否 | 客户id 示例：2214563340669184 |
| code | string | 否 | 单据编号 示例：UR-052820210610000001 |
| saleReturnStatus | string | 否 | 单据状态, SUBMITSALERETURN:开立、CONFIRMSALERETURNORDER:已确认、SALERETURNING:退货中、ENDSALERETURN:已审核、OPPOSESALERETURN:已驳回、 示例：ENDSALERETURN |
| refundStatus | string | 否 | 退货单退款状态 示例：NONE |
| refundAmount | number |
| 小数位数:8,最大长度:28 | 否 | 退款金额 示例：0 |
| saleReturnSourceType | string | 否 | 退货来源类型 示例：NONE |
| totalMoney | number |
| 小数位数:8,最大长度:28 | 否 | 总金额 示例：1000 |
| rebateToOrderMoney | number |
| 小数位数:8,最大长度:28 | 否 | 退款整单金额 示例：0 |
| rebateToCashMoney | number |
| 小数位数:8,最大长度:28 | 否 | 直接抵现金额 示例：0 |
| payMoney | number |
| 小数位数:8,最大长度:28 | 否 | 退货实付金额 示例：1000 |
| createTime | string | 否 | 创建时间 示例：2021-06-10 11:07:46 |
| createDate | string | 否 | 创建日期 示例：2021-06-10 11:07:46 |
| creatorId | long | 否 | 制单人 示例：2261587329077504 |
| confirmUserId | long | 否 | 审核人id 示例：0 |
| currencyCode | string | 否 | 原币简称 示例：CNY |
| currencyName | string | 否 | 原币名称 示例：人民币 |
| natCurrencyCode | string | 否 | 本币简称 示例：CNY |
| natCurrencyName | string | 否 | 本币名称 示例：人民币 |
| taxInclusive | boolean | 否 | 单价含税 示例：true |
| exchangeRateType | string | 否 | 汇率类型Id 示例：0000KNFNTQ4ZBZAVBV0000 |
| vouchdate | string | 否 | 单据日期 示例：2021-06-10 00:00:00 |
| creator | string | 否 | 制单人 示例：jiangjinlei |
| pubts | string | 否 | 时间戳 示例：2021-06-11 13:58:23 |
| transactionTypeId | long | 否 | 交易类型 示例：1248018423173392 |
| invoiceAgentId | long | 否 | 开票客户id 示例：2214563340669184 |
| invoiceTitleType | long | 否 | 抬头类型 示例：0 |
| totalOriTax | number |
| 小数位数:8,最大长度:28 | 否 | 原币税额 示例：0 |
| totalNatTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 示例：0 |
| totalMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税总金额 示例：1000 |
| rebateToOrderMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税整单返利金额 示例：0 |
| rebateToCashMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税抵现返利金额 示例：0 |
| payMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税退货金额 示例：1000 |
| totalMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币总金额 示例：1000 |
| rebateToOrderMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税整单返利金额 示例：0 |
| rebateToCashMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税抵现返利金额 示例：0 |
| payMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币退货金额 示例：1000 |
| totalMoneyDomesticTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税总金额 示例：1000 |
| rebateToOrderMoneyDomesticTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税整单返利金额 示例：0 |
| rebateToCashMoneyDomesticTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税抵现返利金额 示例：0 |
| payMoneyDomesticTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税退货金额 示例：1000 |
| modifyInvoiceType | boolean | 否 | 发票类型是否可改 示例：true |
| realMoney | number |
| 小数位数:8,最大长度:28 | 否 | 应付金额 示例：1000 |
| isDeleted | long | 否 | 是否删除 示例：0 |
| isWfControlled | boolean | 否 | 是否受审批流控制 示例：false |
| verifystate | long | 否 | 审批状态 示例：2 |
| natCurrency | string | 否 | 本币pk 示例：2213420703028224 |
| currency | string | 否 | 原币pk 示例：2213420703028224 |
| exchRate | long | 否 | 汇率 示例：1 |
| barCode | string | 否 | 单据条码 示例：voucher_salereturn|2295307742662912 |
| status | long | 否 | 单据状态 示例：1 |
| uordercorp | long | 否 | 租户id 示例：2213418494152960 |
| auditor | string | 否 | 审核人 示例：李志强 |
| auditorId | long | 否 | 审核人id 示例：2219060695798016 |
| auditTime | string | 否 | 审核时间 示例：2021-06-11 13:58:23 |
| auditDate | string | 否 | 审批日期 示例：2021-06-11 00:00:00 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2295307742662912,
		"bizId": 2213418494152960,
		"agentRelationId": 2214563370995969,
		"salesOrgId": "2213500664107264",
		"settlementOrgId": "2213500664107264",
		"agentId": 2214563340669184,
		"code": "UR-052820210610000001",
		"saleReturnStatus": "ENDSALERETURN",
		"refundStatus": "NONE",
		"refundAmount": 0,
		"saleReturnSourceType": "NONE",
		"totalMoney": 1000,
		"rebateToOrderMoney": 0,
		"rebateToCashMoney": 0,
		"payMoney": 1000,
		"createTime": "2021-06-10 11:07:46",
		"createDate": "2021-06-10 11:07:46",
		"creatorId": 2261587329077504,
		"confirmUserId": 0,
		"currencyCode": "CNY",
		"currencyName": "人民币",
		"natCurrencyCode": "CNY",
		"natCurrencyName": "人民币",
		"taxInclusive": true,
		"exchangeRateType": "0000KNFNTQ4ZBZAVBV0000",
		"vouchdate": "2021-06-10 00:00:00",
		"creator": "jiangjinlei",
		"pubts": "2021-06-11 13:58:23",
		"transactionTypeId": 1248018423173392,
		"invoiceAgentId": 2214563340669184,
		"invoiceTitleType": 0,
		"totalOriTax": 0,
		"totalNatTax": 0,
		"totalMoneyOrigTaxfree": 1000,
		"rebateToOrderMoneyOrigTaxfree": 0,
		"rebateToCashMoneyOrigTaxfree": 0,
		"payMoneyOrigTaxfree": 1000,
		"totalMoneyDomestic": 1000,
		"rebateToOrderMoneyDomestic": 0,
		"rebateToCashMoneyDomestic": 0,
		"payMoneyDomestic": 1000,
		"totalMoneyDomesticTaxfree": 1000,
		"rebateToOrderMoneyDomesticTaxfree": 0,
		"rebateToCashMoneyDomesticTaxfree": 0,
		"payMoneyDomesticTaxfree": 1000,
		"modifyInvoiceType": true,
		"realMoney": 1000,
		"isDeleted": 0,
		"isWfControlled": false,
		"verifystate": 2,
		"natCurrency": "2213420703028224",
		"currency": "2213420703028224",
		"exchRate": 1,
		"barCode": "voucher_salereturn|2295307742662912",
		"status": 1,
		"uordercorp": 2213418494152960,
		"auditor": "李志强",
		"auditorId": 2219060695798016,
		"auditTime": "2021-06-11 13:58:23",
		"auditDate": "2021-06-11 00:00:00"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

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

