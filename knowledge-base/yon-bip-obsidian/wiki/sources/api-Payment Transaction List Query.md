---
title: "付款事务列表查询"
apiId: "2242423479257268233"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Transaction"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款事务列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Payment Transaction (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/paymentEvent/list

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
| pageSize | string | 否 | 是 | 每页查询数据大小，限制500 示例：10 |
| financeOrg | string | 是 | 否 | 会计主体 示例：[1858746165258878983] |
| financeOrg.code | string | 是 | 否 | 会计主体code 示例：[1] |
| accPeriodCode | string | 否 | 否 | 会计期间 示例：2025-01,2025-02 |
| open_accDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 记账日期开始 示例：2025-04-10 23:59:59 |
| open_accDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 记账日期结束 示例：2025-04-11 23:59:59 |
| code | string | 否 | 否 | code 示例：AP08250305000001 |
| arapEventType | string | 是 | 否 | 收付会计事务 示例：[306] |
| bizBillCode | string | 否 | 否 | 业务单据编号 示例：123 |
| open_srcBillDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 来源单据日期开始 示例：2025-04-10 00:00:00 |
| open_srcBillDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 来源单据日期结束 示例：2025-04-11 23:59:59 |
| srcApp | string | 是 | 否 | 来源应用 示例：[102] |
| objectType | string | 是 | 否 | 往来对象类型 示例：["0", "2"] |
| supplier | string | 是 | 否 | 供应商id 示例：[1860576010301341702] |
| supplier.code | string | 是 | 否 | 供应商code 示例：[1] |
| funder | string | 是 | 否 | 资金业务对象id 示例：[2024418842160660483] |
| funder.code | string | 是 | 否 | 资金业务对象code 示例：[123] |
| oriCurrency | string | 是 | 否 | 原币id 示例：[1858241326195673598] |
| oriCurrency.code | string | 是 | 否 | 原币code 示例：["CNY"] |
| bodyItem.apSubject | string | 是 | 否 | 表体应付账款科目 示例：[1858946662894403600] |
| bodyItem.settleMode | string | 是 | 否 | 表体结算方式 示例：[1860580958079025152] |
| balanceState | string | 是 | 否 | 清账状态 示例：[0] |
| employee.code | string | 是 | 否 | 员工code 示例：[123] |
| employee | string | 是 | 否 | 员工id 示例：["1918208991027003392"] |

## 3. 请求示例

Url: /yonbip/EFI/paymentEvent/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"financeOrg": [
		1858746165258878983
	],
	"financeOrg.code": [
		1
	],
	"accPeriodCode": "2025-01,2025-02",
	"open_accDate_begin": "2025-04-10 23:59:59",
	"open_accDate_end": "2025-04-11 23:59:59",
	"code": "AP08250305000001",
	"arapEventType": [
		306
	],
	"bizBillCode": "123",
	"open_srcBillDate_begin": "2025-04-10 00:00:00",
	"open_srcBillDate_end": "2025-04-11 23:59:59",
	"srcApp": [
		102
	],
	"objectType": [
		"0",
		"2"
	],
	"supplier": [
		1860576010301341702
	],
	"supplier.code": [
		1
	],
	"funder": [
		2024418842160660483
	],
	"funder.code": [
		123
	],
	"oriCurrency": [
		1858241326195673598
	],
	"oriCurrency.code": [
		"CNY"
	],
	"bodyItem.apSubject": [
		1858946662894403600
	],
	"bodyItem.settleMode": [
		1860580958079025152
	],
	"balanceState": [
		0
	],
	"employee.code": [
		123
	],
	"employee": [
		"1918208991027003392"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回付款事务信息 |
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
				"oriCurrency": "1858241326195673598",
				"financeOrg": "1858746165258878983",
				"bodyItem_accExchangeRateType": "0000LOR2VZS09YN0G10000",
				"bodyItem_exchangeRateDate": "2025-03-05",
				"objectType": "0",
				"supplier": "1860575829912715267",
				"srcBillDate": "2025-03-05",
				"accCurrency": "1858241326195673598",
				"entryCode": "SF2025030500000059",
				"id": "2215941930772332546",
				"bodyItem_gblBalance": 0,
				"bodyItem_apSubjectVid": "1858946662894403676",
				"bodyItem_grpAmount": 0,
				"srcBillId": "2215941862048399362",
				"eventType": "2738997478580992",
				"srcApp": "94",
				"bodyItem_id": "2215941930772332547",
				"bodyItem_oriRefundAmount": 0,
				"srcBillType": "2614250133869056",
				"accPurpose": "1858834014501601582",
				"bodyItem_accBalance": 0,
				"blnWriteOff": 0,
				"bodyItem_supplierBankAccount": "1860575829912715269",
				"accBook": "1860559131066761230",
				"bodyItem_verifyAmount": 0,
				"auditTime": "2025-03-05 18:13:11",
				"srcSystem": "1",
				"bizBillType": "2614250133869056",
				"status": "1",
				"blnEffect": "1",
				"bodyItem_gblAmount": 0,
				"code": "AP08250305000001",
				"bodyItem_settleState": "0",
				"bodyItem_orgAmount": 0,
				"bodyItem_oriCurrency": "1858241326195673598",
				"bodyItem_objectBankAccountNo": "2000",
				"bodyItem_accExchangeRate": 1,
				"bodyItem_blnHangUp": false,
				"bodyItem_oriOcupyAmount": 0,
				"bodyItem_quickType": "1858834014501601599",
				"srcBillCode": "SREFap250305000474",
				"pubts": "2025-03-05 18:14:44",
				"bodyItem_balanceState": "1",
				"bodyItem_accAmount": -9,
				"creator": "3a71063c-8317-4e28-9e63-4ec5b7be7500",
				"org": "1858746165258878983",
				"bizBillCode": "SREFap250305000474",
				"voucherType": "1858921528745787596",
				"accPeriod_code": "2025-03",
				"accBook_name": "收付总公司账簿",
				"arapEventType": "327",
				"postState": "2",
				"auditor": "3a71063c-8317-4e28-9e63-4ec5b7be7500",
				"accDate": "2025-03-05",
				"bodyItem_oriAmount": -9,
				"accPeriod": "1858853668281909256",
				"partner": "1862709466585628679",
				"bodyItem_orgBalance": 0,
				"bodyItem_grpBalance": 0,
				"createTime": "2025-03-05 18:13:13",
				"bodyItem_oriBalance": 0
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

