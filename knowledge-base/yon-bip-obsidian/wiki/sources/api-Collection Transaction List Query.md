---
title: "收款事务列表查询"
apiId: "2242634173157736454"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Transaction"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款事务列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Collection Transaction (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/collectionPublicEvent/list

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
| pageSize | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 每页数据量，限制500 示例：10 |
| pageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 当前页码 示例：1 |
| financeOrg | string | 是 | 否 | 会计主体id 示例：["1858746165258878983"] |
| financeOrg.code | string | 是 | 否 | 会计主体code 示例：["abc"] |
| accPeriodCode | string | 否 | 否 | 会计期间 示例：2025-01,2025-01 |
| open_accDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 记账日期结束 示例：2025-03-11 00:00:00 |
| open_accDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 记账日期开始 示例：2025-04-04 00:00:00 |
| code | string | 否 | 否 | code 示例：AR07250331000001 |
| arapEventType | string | 是 | 否 | 收付会计事务 示例：["106"] |
| bizBillCode | string | 否 | 否 | 业务单据编号 示例：123 |
| open_srcBillDate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 来源单据日期开始 示例：2025-04-10 00:00:00 |
| open_srcBillDate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 来源单据日期结束 示例：2025-03-11 00:00:00 |
| srcApp | string | 是 | 否 | 来源应用列表 示例：["102"] |
| objectType | string | 是 | 否 | 往来对象类型 示例：["1"] |
| customer | string | 是 | 否 | 客户id 示例：["1860570109013655556"] |
| customer.code | string | 是 | 否 | 客户code 示例：[1] |
| employee | string | 是 | 否 | 员工id 示例：["1861960261063671811"] |
| employee.code | string | 是 | 否 | 员工code 示例：[123] |
| funder | string | 是 | 否 | 资金业务对象id 示例：["1862772233211478025"] |
| funder.code | string | 是 | 否 | 资金业务对象code 示例：[123] |
| oriCurrency | string | 是 | 否 | 原币id 示例：["1910290806500491264"] |
| oriCurrency.code | string | 是 | 否 | 原币code 示例：["CNY"] |
| bodyItem.arSubject | string | 是 | 否 | 应收账款科目 示例：["1858946662894403601"] |
| bodyItem.settleMode | string | 是 | 否 | 结算方式id 示例：["1860580958079025152"] |
| balanceState | string | 是 | 否 | 清账状态 示例：["0"] |

## 3. 请求示例

Url: /yonbip/EFI/collectionPublicEvent/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"financeOrg": [
		"1858746165258878983"
	],
	"financeOrg.code": [
		"abc"
	],
	"accPeriodCode": "2025-01,2025-01",
	"open_accDate_end": "2025-03-11 00:00:00",
	"open_accDate_begin": "2025-04-04 00:00:00",
	"code": "AR07250331000001",
	"arapEventType": [
		"106"
	],
	"bizBillCode": "123",
	"open_srcBillDate_begin": "2025-04-10 00:00:00",
	"open_srcBillDate_end": "2025-03-11 00:00:00",
	"srcApp": [
		"102"
	],
	"objectType": [
		"1"
	],
	"customer": [
		"1860570109013655556"
	],
	"customer.code": [
		1
	],
	"employee": [
		"1861960261063671811"
	],
	"employee.code": [
		123
	],
	"funder": [
		"1862772233211478025"
	],
	"funder.code": [
		123
	],
	"oriCurrency": [
		"1910290806500491264"
	],
	"oriCurrency.code": [
		"CNY"
	],
	"bodyItem.arSubject": [
		"1858946662894403601"
	],
	"bodyItem.settleMode": [
		"1860580958079025152"
	],
	"balanceState": [
		"0"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回收款事务数据 |
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
| 小数位数:0,最大长度:10 | 否 | 截止页码 示例：1 |

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
				"bodyItem_clearTime": "2025-03-31",
				"accCurrency": "1858241326195673598",
				"entryCode": "SF2025033100000002",
				"id": "2235231779951476739",
				"srcBillId": "2235231702637084677",
				"eventType": "1436619015316307969",
				"srcApp": "95",
				"bodyItem_id": "2235231779951476740",
				"srcBillType": "2614241203376640",
				"accPurpose": "1858834014501601582",
				"blnWriteOff": false,
				"bodyItem_createTime": "2025-03-31 18:00:27",
				"auditTime": "2025-03-31 18:00:24",
				"bizBillType": "2614241203376640",
				"status": "1",
				"bodyItem_gblAmount": 0,
				"bodyItem_orgAmount": 0,
				"writeOffState": "0",
				"bodyItem_blnHangUp": false,
				"bodyItem_oriOcupyAmount": 0,
				"bodyItem_expireDate": "9999-12-31",
				"bodyItem_orgExchangeRateType": "0000LOR2VZS09YN0G10000",
				"srcBillCode": "RECar250331012259",
				"bodyItem_event": "2235231779951476739",
				"bodyItem_blnBaddebtGain": false,
				"bodyItem_customerBankAccount": "1860569739624448008",
				"pubts": "2025-03-31 18:00:37",
				"bodyItem_verifyCurrency": "1858241326195673598",
				"creator": "85e2cdaa-9f61-4606-b1ff-566eb8367340",
				"bodyItemId": "2235231779951476740",
				"arapEventType": "126",
				"postState": "2",
				"auditor": "85e2cdaa-9f61-4606-b1ff-566eb8367340",
				"bodyItem_eventType": "1436619015316307969",
				"accDate": "2025-03-31",
				"partner": "1862709329146675200",
				"bodyItem_grpBalance": 0,
				"createTime": "2025-03-31 18:00:27",
				"bodyItem_oriBalance": 0,
				"bodyItem_exchangeRateDate": "2025-03-31",
				"objectType": "1",
				"bizBillId": "2235231702637084677",
				"accYear": "1858853668281909253",
				"srcBillDate": "2025-03-31",
				"orgCurrency": "1858241326195673598",
				"bodyItem_gblBalance": 0,
				"bodyItem_orgExchangeRate": 1,
				"bodyItem_grpAmount": 0,
				"bodyItem_issueNo": 1,
				"bodyItem_arSubjectVid": "1858946662894403601",
				"bodyItem_amountDirection": "-1",
				"bodyItem_accBalance": 0,
				"bodyItem_localBalanceState": "1",
				"accBook": "1860559131066761230",
				"bodyItem_verifyAmount": 200,
				"srcSystem": "0",
				"blnEffect": "1",
				"code": "AR07250331000001",
				"bodyItem_settleState": "0",
				"bodyItem_oriCurrency": "1858241326195673598",
				"bodyItem_objectBankAccountNo": "1000",
				"bodyItem_accExchangeRate": 1,
				"bodyItem_quickType": "1858834014501601597",
				"accPeriodCode": "2025-03",
				"bodyItem_balanceState": "1",
				"bodyItem_accAmount": 200,
				"bizBillCode": "RECar250331012259",
				"voucherType": "1858921528745787596",
				"org": "1858746165258878983",
				"bodyItem_localClearTime": "2025-03-31",
				"accBook_name": "收付总公司账簿",
				"bodyItem_oriAmount": 200,
				"accPeriod": "1858853668281909256",
				"bodyItem_orgBalance": 0,
				"accYearCode": "2025",
				"customer": "1860569739624448007"
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

