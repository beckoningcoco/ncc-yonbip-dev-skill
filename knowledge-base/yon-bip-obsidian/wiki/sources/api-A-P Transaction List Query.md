---
title: "应付事务列表查询"
apiId: "2242414159178235904"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "A/P Transaction"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/P Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付事务列表查询

> `ContentType	application/json` 请求方式	POST | 分类: A/P Transaction (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/apPublicEvent/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | string | 否 | 是 | 当前页码 示例：1 |
| pageSize | string | 否 | 是 | 每页查询数据大小，限制500 示例：2 |
| financeOrg | string | 是 | 否 | 会计主体id 示例：[1858746165258878983] |
| financeOrg.code | string | 是 | 否 | 会计主体code 示例：[123] |
| accPeriodCode | string | 否 | 否 | 会计期间 示例：2025-01,2025-02 |
| open_accDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 记账日期开始 示例：2025-03-12 00:00:00 |
| open_accDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 记账日期结束 示例：2025-04-11 23:59:59 |
| code | string | 否 | 否 | 事务编号 示例：AP0601250407000001 |
| arapEventType | string | 是 | 否 | 收付会计事务 示例：[301] |
| bizBillCode | string | 否 | 否 | 业务单据编号 示例：123 |
| open_srcBillDate_begin | date |
| 格式:yyyy-MM-dd | 否 | 否 | 来源单据日期开始 示例：2025-04-10 |
| open_srcBillDate_end | date |
| 格式:yyyy-MM-dd | 否 | 否 | 来源单据日期结束 示例：2025-04-11 |
| srcApp | string | 是 | 否 | 来源应用 示例：[102] |
| objectType | string | 是 | 否 | 往来对象类型 示例：[0] |
| supplier | string | 是 | 否 | 供应商id 示例：[1860576036071145472] |
| supplier.code | string | 是 | 否 | 供应商code 示例：[123] |
| employee | string | 是 | 否 | 员工id 示例：[1861960261063671811] |
| employee.code | string | 是 | 否 | 员工code 示例：[123] |
| oriCurrency | string | 是 | 否 | 原币id 示例：[1858241326195673598] |
| oriCurrency.code | string | 是 | 否 | 原币code 示例：["CNY"] |
| open_bodyItem.grandsonItem.expireDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 孙行到期日开始 示例：2025-04-11 00:00:00 |
| open_bodyItem.grandsonItem.expireDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 孙行到期日结束 示例：2025-04-11 23:59:59 |
| balanceState | string | 是 | 否 | 清账状态 示例：[1] |
| bodyItem.grandsonItem.apSubject | string | 否 | 否 | 孙行应付账款科目id 示例：1858946662894403600 |
| funder.code | string | 是 | 否 | 资金业务对象code 示例：[1] |
| funder | string | 是 | 否 | 资金业务对象id 示例：[2024418842160660483] |
| bodyItem.orderNo | string | 否 | 否 | 表体订单编号 示例：FP250407000001 |

## 3. 请求示例

Url: /yonbip/EFI/apPublicEvent/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "2",
	"financeOrg": [
		1858746165258878983
	],
	"financeOrg.code": [
		123
	],
	"accPeriodCode": "2025-01,2025-02",
	"open_accDate_begin": "2025-03-12 00:00:00",
	"open_accDate_end": "2025-04-11 23:59:59",
	"code": "AP0601250407000001",
	"arapEventType": [
		301
	],
	"bizBillCode": "123",
	"open_srcBillDate_begin": "2025-04-10",
	"open_srcBillDate_end": "2025-04-11",
	"srcApp": [
		102
	],
	"objectType": [
		0
	],
	"supplier": [
		1860576036071145472
	],
	"supplier.code": [
		123
	],
	"employee": [
		1861960261063671811
	],
	"employee.code": [
		123
	],
	"oriCurrency": [
		1858241326195673598
	],
	"oriCurrency.code": [
		"CNY"
	],
	"open_bodyItem.grandsonItem.expireDate_begin": "2025-04-11 00:00:00",
	"open_bodyItem.grandsonItem.expireDate_end": "2025-04-11 23:59:59",
	"balanceState": [
		1
	],
	"bodyItem.grandsonItem.apSubject": "1858946662894403600",
	"funder.code": [
		1
	],
	"funder": [
		2024418842160660483
	],
	"bodyItem.orderNo": "FP250407000001"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 应付事务查询数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页查询数据大小，限制500 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 起始页码 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 最终页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"bodyItem_grpTaxAmount": 0,
				"bodyItem_grandsonItem_apSubjectVid": "1858946662894403676",
				"oriCurrency": "1858241326195673598",
				"financeOrg": "1858746165258878983",
				"bodyItem_accExchangeRateType": "0000LOR2VZS09YN0G10000",
				"bodyItem_grandsonItem_ratio": 100,
				"bodyItem_purchaseSubjectVid": "1858946662894403613",
				"supplier": "1860575829912715267",
				"accCurrency": "1858241326195673598",
				"entryCode": "SF2025040700000001",
				"id": "2240160959290933255",
				"bodyItem_taxSubject": "10000",
				"srcBillId": "2240160839043645446",
				"bodyItem_material_name": "收付物料01",
				"bodyItem_grandsonItem_accAmount": 100,
				"bodyItem_unit_name": "千克",
				"bodyItem_orgTaxAmount": 0,
				"eventType": "2740066088296704",
				"bodyItem_gblTaxAmount": 0,
				"srcApp": "125",
				"bodyItem_id": "2240160959290933256",
				"srcBillType": "50",
				"accPurpose": "1858834014501601582",
				"bodyItem_gblTaxExcludedAmount": 0,
				"bodyItem_oriTaxIncludedPrice": 10,
				"auditTime": "2025-04-07 09:24:11",
				"bodyItem_material": "1860572694561947649",
				"bodyItem_grandsonItem_grpAmount": 0,
				"bodyItem_grandsonItem_quickType": "1858834014501601599",
				"bizBillType": "50",
				"status": "1",
				"bodyItem_grandsonItem_gblBalance": 0,
				"bodyItem_taxInSubjectVid": "1858946662894403683",
				"bodyItem_grandsonItem_oriBalance": 100,
				"writeOffState": "0",
				"bodyItem_quantity": 10,
				"bodyItem_gblNonDeductTax": 0,
				"bodyItem_grandsonItem_issueNo": 1,
				"bodyItem_grandsonItem_id": "2240160959290933257",
				"srcBillCode": "FP250407000001",
				"pubts": "2025-04-07 09:25:24",
				"bodyItem_accTaxExcludedPrice": 10,
				"creator": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
				"arapEventType": "313",
				"postState": "2",
				"auditor": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
				"bodyItem_invoiceType": "4",
				"accDate": "2025-04-07",
				"bodyItem_grandsonItem_pubts": "2025-04-07 09:25:24",
				"partner": "1862709466585628679",
				"bodyItem_grpTaxIncludedAmount": 0,
				"bodyItem_grpBalance": 0,
				"createTime": "2025-04-07 09:24:20",
				"bodyItem_orgTaxExcludedAmount": 0,
				"bodyItem_grandsonItem_expireDate": "9999-12-31",
				"bodyItem_oriBalance": 100,
				"bodyItem_grandsonItem_orgAmount": 0,
				"bodyItem_grandsonItem_blnHangUp": false,
				"bodyItem_grandsonItem_grpBalance": 0,
				"bodyItem_grpTaxExcludedAmount": 0,
				"bodyItem_grandsonItem_gblAmount": 0,
				"bodyItem_exchangeRateDate": "2025-04-07",
				"objectType": "0",
				"bodyItem_orgNonDeductTax": 0,
				"bodyItem_grandsonItem_accBalance": 100,
				"bizBillId": "2240160839043645446",
				"srcBillDate": "2025-04-07",
				"bodyItem_oriTaxExcludedAmount": 100,
				"bodyItem_gblBalance": 0,
				"bodyItem_accTaxExcludedAmount": 100,
				"bodyItem_unit": "1858693551892201481",
				"bodyItem_oriTaxIncludedAmount": 100,
				"bodyItem_accTaxIncludedAmount": 100,
				"bodyItem_accBalance": 100,
				"entry": "2240161019433844744",
				"accBook": "1860559131066761230",
				"bodyItem_orgTaxIncludedAmount": 0,
				"srcSystem": "5",
				"bodyItem_oriTaxExcludedPrice": 10,
				"bodyItem_grandsonItem_balanceState": "0",
				"code": "AP0601250407000001",
				"bodyItem_oriCurrency": "1858241326195673598",
				"bodyItem_grandsonItem_orgBalance": 0,
				"bodyItem_grandsonItem_convertWay": "0",
				"bodyItem_accExchangeRate": 1,
				"bodyItem_grpNonDeductTax": 0,
				"bodyItem_grandsonItem_oriAmount": 100,
				"bodyItem_accTaxAmount": 0,
				"bodyItem_pubts": "2025-04-07 09:25:24",
				"bodyItem_grandsonItem_blnDeposit": false,
				"bodyItem_taxRate": 0,
				"bodyItem_grandsonItem_blnPrepare": false,
				"bodyItem_accNonDeductTax": 0,
				"bizBillCode": "FP250407000001",
				"org": "1858746165258878983",
				"voucherType": "1858921528745787596",
				"accPeriod_code": "2025-04",
				"accBook_name": "收付总公司账簿",
				"bodyItem_accTaxIncludedPrice": 10,
				"accPeriod": "1858853668281909257",
				"bodyItem_oriTaxAmount": 0,
				"bodyItem_orgBalance": 0,
				"bodyItem_oriNonDeductTax": 0,
				"bodyItem_grandsonItem_oriOcupyAmount": 0,
				"bodyItem_gblTaxIncludedAmount": 0
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310036	非法token	token过期或者无效，使用有效的token


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

