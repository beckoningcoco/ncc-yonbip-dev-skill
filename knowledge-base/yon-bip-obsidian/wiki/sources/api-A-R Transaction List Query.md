---
title: "应收事务列表查询"
apiId: "2241977661651943431"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "A/R Transaction"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/R Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收事务列表查询

> `ContentType	application/json` 请求方式	POST | 分类: A/R Transaction (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/arPublicEvent/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | string | 否 | 是 | 当前页码 |
| pageSize | string | 否 | 是 | 每页查询数据大小，限制500 |
| financeOrg | string | 是 | 否 | 会计主体id 示例：[1994100564922728450] |
| financeOrg.code | string | 是 | 否 | 会计主体编码 示例：[123] |
| accPeriodCode | string | 否 | 否 | 会计期间 示例：2025-01,2025-02 |
| open_accDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 记账日期开始 示例：2025-03-11 00:00:00 |
| open_accDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 记账日期结束 示例：2025-03-11 00:00:00 |
| code | string | 否 | 否 | 事务编码 示例：AR0601250409000002 |
| arapEventType | string | 是 | 否 | 收付会计事务 示例：[101] |
| bizBillCode | string | 否 | 否 | 业务单据编号 示例：123123 |
| open_srcBillDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 来源单据日期开始 示例：2025-04-09 00:00:00 |
| open_srcBillDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 来源单据日期结束 示例：2025-03-11 00:00:00 |
| objectType | string | 是 | 否 | 往来对象类型 示例：[1] |
| customer | string | 是 | 否 | 客户id 示例：[2013185191989739529] |
| customer.code | string | 是 | 否 | 客户code 示例：[123] |
| employee | string | 是 | 否 | 员工id 示例：[2023631462987202564] |
| employee.code | string | 是 | 否 | 员工code 示例：[123] |
| funder | string | 是 | 否 | 资金业务对象id 示例：[1941123294372036613] |
| funder.code | string | 是 | 否 | 资金业务对象code 示例：[123] |
| oriCurrency | string | 是 | 否 | 原币id 示例：[1939062405854658600] |
| oriCurrency.code | string | 是 | 否 | 原币code 示例：["CNY"] |
| srcApp | string | 是 | 否 | 来源应用列表 示例：[102] |
| open_bodyItem.grandsonItem.expireDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 到期日开始 示例：2025-04-11 00:00:00 |
| open_bodyItem.grandsonItem.expireDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 到期日结束 示例：2025-04-11 23:59:59 |
| balanceState | string | 是 | 否 | 清账状态 示例：[0] |
| bodyItem.grandsonItem.arSubject | string | 是 | 否 | 应收账款科目id 示例：[2023671431936606222] |
| dept | string | 是 | 否 | 部门id 示例：[2023631291192180745] |
| dept.code | string | 是 | 否 | 部门code 示例：["AA"] |
| project | string | 是 | 否 | 项目id 示例：[1991597741472481281] |
| project.code | string | 是 | 否 | 项目code 示例：["XIANGMU"] |
| staff | string | 是 | 否 | 业务员id 示例：[2076317543328382985] |
| staff.code | string | 是 | 否 | 业务员code 示例：["A"] |
| org | string | 是 | 否 | 业务组织id 示例：[2148261243426701316] |
| org.code | string | 是 | 否 | 业务组织code 示例：[123] |

## 3. 请求示例

Url: /yonbip/EFI/arPublicEvent/list?access_token=访问令牌
Body: {
	"pageIndex": "",
	"pageSize": "",
	"financeOrg": [
		1994100564922728450
	],
	"financeOrg.code": [
		123
	],
	"accPeriodCode": "2025-01,2025-02",
	"open_accDate_begin": "2025-03-11 00:00:00",
	"open_accDate_end": "2025-03-11 00:00:00",
	"code": "AR0601250409000002",
	"arapEventType": [
		101
	],
	"bizBillCode": "123123",
	"open_srcBillDate_begin": "2025-04-09 00:00:00",
	"open_srcBillDate_end": "2025-03-11 00:00:00",
	"objectType": [
		1
	],
	"customer": [
		2013185191989739529
	],
	"customer.code": [
		123
	],
	"employee": [
		2023631462987202564
	],
	"employee.code": [
		123
	],
	"funder": [
		1941123294372036613
	],
	"funder.code": [
		123
	],
	"oriCurrency": [
		1939062405854658600
	],
	"oriCurrency.code": [
		"CNY"
	],
	"srcApp": [
		102
	],
	"open_bodyItem.grandsonItem.expireDate_begin": "2025-04-11 00:00:00",
	"open_bodyItem.grandsonItem.expireDate_end": "2025-04-11 23:59:59",
	"balanceState": [
		0
	],
	"bodyItem.grandsonItem.arSubject": [
		2023671431936606222
	],
	"dept": [
		2023631291192180745
	],
	"dept.code": [
		"AA"
	],
	"project": [
		1991597741472481281
	],
	"project.code": [
		"XIANGMU"
	],
	"staff": [
		2076317543328382985
	],
	"staff.code": [
		"A"
	],
	"org": [
		2148261243426701316
	],
	"org.code": [
		123
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：调用成功 |
| data | object | 否 | 返回应收事务数据 |
| pageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 当前页码 示例：1 |
| pageSize | number |
| 小数位数:2,最大长度:10 | 否 | 每页查询数据大小，限制500 示例：1 |
| recordCount | number |
| 小数位数:2,最大长度:10 | 否 | 总记录数 示例：2 |
| pageCount | number |
| 小数位数:2,最大长度:10 | 否 | 总页数 示例：2 |
| beginPageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 起始页码 示例：2 |
| endPageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 最终页码 示例：1 |
| recordList | object | 否 | 查询结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "调用成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 2,
		"pageCount": 2,
		"beginPageIndex": 2,
		"endPageIndex": 1,
		"recordList": {
			"accBook": "2123093259064442889",
			"accBookName": "KK实际+多维",
			"accCurrency": "1939062405854658600",
			"accCurrencyCode": "CNY",
			"accDate": "2025-04-09",
			"accPeriod": "1942708807332265993",
			"accPeriodCod_code": "2025-04",
			"accPurpose": "1939062405859377459",
			"accPurpose_name": "法人核算目的",
			"arapEventType": "113",
			"bizBillCode": "OARar250409018836",
			"bizBillId": "2241694211081502726",
			"bizBillType": "2614099822008320",
			"bizTradeType": "1939062405866194501",
			"bizTradeType_name": "应收发票",
			"blnEffect": "1",
			"bodyItem_accBalance": 12,
			"bodyItem_accExchangeRate": 1,
			"bodyItem_accExchangeRateType": "0000LT2ON7R546TLHP0000",
			"bodyItem_accTaxAmount": 0,
			"bodyItem_accTaxExcludedAmount": 12,
			"bodyItem_accTaxIncludedAmount": 12,
			"bodyItem_eventType": "2738391568884992",
			"bodyItem_exchangeRateDate": "2025-04-09",
			"bodyItem_gblBalance": 96,
			"bodyItem_gblExchangeRate": 8,
			"bodyItem_gblExchangeRateType": "1941105367177494534",
			"bodyItem_gblTaxAmount": 0,
			"bodyItem_gblTaxExcludedAmount": 96,
			"bodyItem_gblTaxIncludedAmount": 96,
			"bodyItem_grandsonItem_accAmount": 12,
			"bodyItem_grandsonItem_accBalance": 12,
			"bodyItem_grandsonItem_arSubjectVid": "2023671431936606222",
			"bodyItem_grandsonItem_arSubjectVid_displayname": "应收账款",
			"bodyItem_grandsonItem_balanceState": "0",
			"bodyItem_grandsonItem_blnHangUp": false,
			"bodyItem_grandsonItem_convertWay": "0",
			"bodyItem_grandsonItem_expireDate": "2025-04-09",
			"bodyItem_grandsonItem_gblAmount": 96,
			"bodyItem_grandsonItem_gblBalance": 96,
			"bodyItem_grandsonItem_grpAmount": 12,
			"bodyItem_grandsonItem_grpBalance": 12,
			"bodyItem_grandsonItem_id": "2241697312049725450",
			"bodyItem_grandsonItem_issueNo": 1,
			"bodyItem_grandsonItem_orgAmount": 12,
			"bodyItem_grandsonItem_orgBalance": 12,
			"bodyItem_grandsonItem_oriAmount": 12,
			"bodyItem_grandsonItem_oriBalance": 12,
			"bodyItem_grandsonItem_oriOcupyAmount": 0,
			"bodyItem_grandsonItem_pubts": "2025-04-09 11:05:14",
			"bodyItem_grandsonItem_quickType": "1939062405859377474",
			"bodyItem_grandsonItem_quickType_name": "应收款",
			"bodyItem_grandsonItem_ratio": 100,
			"bodyItem_grandsonItem_srcBody": "2241697312049725446",
			"bodyItem_grpBalance": 12,
			"bodyItem_grpExchangeRate": 1,
			"bodyItem_grpExchangeRateType": "0000LT2ON7R546TLHP0000",
			"bodyItem_grpTaxAmount": 0,
			"bodyItem_grpTaxExcludedAmount": 12,
			"bodyItem_grpTaxIncludedAmount": 12,
			"bodyItem_id": "2241697312049725448",
			"bodyItem_incomeSubjectVid": "2023671431936606369",
			"bodyItem_incomeSubjectVid_displayname": "生产成本_固定制造费",
			"bodyItem_orgBalance": 12,
			"bodyItem_orgExchangeRate": 1,
			"bodyItem_orgExchangeRateType": "0000LT2ON7R546TLHP0000",
			"bodyItem_orgTaxAmount": 0,
			"bodyItem_orgTaxExcludedAmount": 12,
			"bodyItem_orgTaxIncludedAmount": 12,
			"bodyItem_oriBalance": 12,
			"bodyItem_oriCurrency": "1939062405854658600",
			"bodyItem_oriCurrency_name": "人民币",
			"bodyItem_oriOcupyAmount": 0,
			"bodyItem_oriTaxAmount": 0,
			"bodyItem_oriTaxExcludedAmount": 12,
			"bodyItem_oriTaxIncludedAmount": 12,
			"bodyItem_pubts": "2025-04-09 11:05:14",
			"bodyItem_srcBillNo": "OARar250409018836",
			"bodyItem_srcBillRowId": "2241694211081502727",
			"bodyItem_srcBillType": "2614099822008320",
			"bodyItem_srcBillType_name": "应收发票",
			"bodyItem_taxRate": 0,
			"code": "AR0601250409000003",
			"createTime": "2025-04-09 11:05:14",
			"creator": "3a71063c-8317-4e28-9e63-4ec5b7be7500",
			"customer": "1942715258373144582",
			"customerName": "集成验证_客户档案2",
			"entry": "~",
			"entryCode": "~",
			"eventType": "2738391568884992",
			"eventType_name": "确认应收",
			"financeOrg": "1994100564922728450",
			"financeOrgName": "KKK集团",
			"gblCurrency": "1939062405854658612",
			"gblCurrencyCode": "USD",
			"gblCurrencyNam_name": "美元",
			"grpCurrency": "1939062405854658600",
			"grpCurrencyCode": "CNY",
			"grpCurrencyNam_name": "人民币",
			"id": "2241697312049725452",
			"objectType": "1",
			"org": "1994100564922728450",
			"orgCurrency": "1939062405854658600",
			"orgCurrencyCode": "CNY",
			"orgCurrencyNam_name": "人民币",
			"orgName": "KKK集团",
			"oriAmount": 12,
			"oriCurrency": "1939062405854658600",
			"oriCurrencyCode": "CNY",
			"postState": "4",
			"pubts": "2025-04-09 11:05:14",
			"srcApp": "95",
			"srcApp_name": "应收管理",
			"srcBillCode": "OARar250409018836",
			"srcBillDate": "2025-04-09",
			"srcBillId": "2241694211081502726",
			"srcBillType": "2614099822008320",
			"srcBillType_name": "应收发票",
			"srcSystem": "0",
			"status": "1",
			"voucher": "~",
			"voucherCode": "~",
			"voucherType": "~",
			"writeOffState": "0"
		}
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

