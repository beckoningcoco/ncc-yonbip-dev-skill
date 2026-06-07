---
title: "期初应收列表查询"
apiId: "1835919015349846021"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Receivable"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初应收列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Opening Receivable (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/fiear_receivable_init/list

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
| pageIndex | int | 否 | 是 | 当前页码 示例：1 |
| pageSize | int | 否 | 是 | 每页查询数据大小，限制500 示例：10 |
| code | string | 否 | 否 | 单据编号 示例：PAYap221208182455 |
| financeOrg | string | 是 | 否 | 收票组织id 示例：["1474252334897823749","1718421354514481153"] |
| objectType | string | 是 | 否 | 往来对象类型 (枚举值 1:客户；2:员工；3:资金业务对象) 示例：["1","2"] |
| employee | string | 是 | 否 | 员工id 示例：["1471493952192905217","1722963591694385156"] |
| funder | string | 是 | 否 | 资金业务对象id 示例：["1474252334897","1726091032249499652"] |
| customer | string | 是 | 否 | 客户ID 示例：["1526228774896533510"] |
| oriCurrency | string | 是 | 否 | 原币种id 示例：["1468336086076358677","1717763331189112841"] |
| open_bodyItem.grandsonItem.expireDate_begin | string | 否 | 否 | 到期日开始时间(大于等于此时间，yyyy-MM-dd HH:mm:ss) 示例：2022-11-09 00:00:00 |
| open_bodyItem.grandsonItem.expireDate_end | string | 否 | 否 | 到期日结束时间(小于等于此时间, yyyy-MM-dd HH:mm:ss) 示例：2022-12-08 23:59:59 |
| bodyItem.grandsonItem.arSubjectVid | string | 是 | 否 | 应收账款科目ID 示例：["1686542483765329937"] |
| postState | string | 是 | 否 | 过账状态（枚举值：0: 未过账； 1: 过账中； 2：过账成功； 3：过账失败； 4: 不过账） 示例：["0","1"] |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体，默认为false 示例：false 默认值：false |
| open_auditTime_begin | string | 否 | 否 | 审核时间开始时间(大于等于此时间，yyyy-MM-dd HH:mm:ss） 示例：2022-11-09 00:00:00 |
| open_auditTime_end | string | 否 | 否 | 审核时间结束时间(小于等于此时间，yyyy-MM-dd HH:mm:ss） 示例：2022-12-08 23:59:59 |
| status | string | 否 | 否 | 事务状态(枚举值：0:未审核; 1:已审核; ) 示例：1 |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 否 | 否 | 收票组织编码 示例：456 |
| employee.code | string | 否 | 否 | 员工编码 示例：100011 |
| funder.code | string | 否 | 否 | 资金业务对象编码 示例：100011 |
| oriCurrency.code | string | 否 | 否 | 原币种简称 示例：CNY |
| customer.code | string | 否 | 否 | 客户编码 示例：0000test000004 |
| open_accDate_begin | string | 否 | 否 | 记账日期开始时间(大于等于此时间，yyyy-MM-dd HH:mm:ss) 示例：2022-11-09 00:00:00 |
| open_accDate_end | string | 否 | 否 | 记账日期结束时间(小于等于此时间，yyyy-MM-dd HH:mm:ss) 示例：2022-12-08 23:59:59 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间，yyyy-MM-dd HH:mm:ss） 示例：2022-11-09 00:00:00 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间，yyyy-MM-dd HH:mm:ss) 示例：2022-12-08 23:59:59 |

## 3. 请求示例

Url: /yonbip/EFI/fiear_receivable_init/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "PAYap221208182455",
	"financeOrg": [
		"1474252334897823749",
		"1718421354514481153"
	],
	"objectType": [
		"1",
		"2"
	],
	"employee": [
		"1471493952192905217",
		"1722963591694385156"
	],
	"funder": [
		"1474252334897",
		"1726091032249499652"
	],
	"customer": [
		"1526228774896533510"
	],
	"oriCurrency": [
		"1468336086076358677",
		"1717763331189112841"
	],
	"open_bodyItem.grandsonItem.expireDate_begin": "2022-11-09 00:00:00",
	"open_bodyItem.grandsonItem.expireDate_end": "2022-12-08 23:59:59",
	"bodyItem.grandsonItem.arSubjectVid": [
		"1686542483765329937"
	],
	"postState": [
		"0",
		"1"
	],
	"isSum": false,
	"open_auditTime_begin": "2022-11-09 00:00:00",
	"open_auditTime_end": "2022-12-08 23:59:59",
	"status": "1",
	"simple": {
		"financeOrg.code": "456",
		"employee.code": "100011",
		"funder.code": "100011",
		"oriCurrency.code": "CNY",
		"customer.code": "0000test000004",
		"open_accDate_begin": "2022-11-09 00:00:00",
		"open_accDate_end": "2022-12-08 23:59:59",
		"open_pubts_begin": "2022-11-09 00:00:00",
		"open_pubts_end": "2022-12-08 23:59:59"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回期初应收数据 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：1 |
| recordCount | int | 否 | 总记录数 示例：2020 |
| recordList | object | 是 | 查询结果集 |
| pageCount | int | 否 | 总页数 示例：2020 |
| beginPageIndex | int | 否 | 起始页码 示例：2 |
| endPageIndex | int | 否 | 最终页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 2020,
		"recordList": [
			{
				"id": "1837270873490325517",
				"accDate": "2022-09-30 00:00:00",
				"code": "AR02220930000001",
				"financeOrg": "1705972022454517762",
				"financeOrg_name": "收付组织",
				"financeOrg_code": "01",
				"accBook": "1705984056939773967",
				"accBook_code": "收付组织",
				"accBook_name": "收付组织",
				"accPurpose": "1625145032916860933",
				"accPurpose_name": "法人核算目的",
				"arapEventType": "103",
				"eventType": "1436622906556678151",
				"eventType_name": "期初确认应收",
				"accPeriod": "1625145041506795548",
				"accPeriod_code": "2022-10",
				"srcBillCode": "AR02220930000001",
				"srcBillDate": "2022-09-30 00:00:00",
				"srcSystem": "0",
				"org": "1705972022454517762",
				"org_code": "01",
				"org_name": "收付组织",
				"objectType": "1",
				"customer": "1705997148025257992",
				"customer_code": "0418",
				"customer_name": "味多美",
				"employee": "1712650730956390401",
				"employee_code": "00000001",
				"funder": "1726092853315633161",
				"funder_code": "ZJDX230526",
				"partner": "1726092853315633161",
				"partner_code": "YW000001",
				"oriCurrency": "1625145024310673435",
				"oriCurrency_moneyDigit": 2,
				"accCurrency_code": "CNY",
				"accCurrency_name": "人民币",
				"accCurrency_moneyDigit": 2,
				"accCurrency_priceDigit": 4,
				"status": "1",
				"blnEffect": "1",
				"writeOffState": "0",
				"blnWriteOff": 0,
				"bodyItem_grandsonItem_arSubjectVid": "1705979049004761101",
				"bodyItem_grandsonItem_arSubjectVid_name": "应收账款",
				"srcBillType": "1815122611831046177",
				"creator": "9e5d1e20-1b6d-46b5-a6bc-ad3902036ed7",
				"creator_userName": "昵称-栗丹",
				"createTime": "2023-10-12 12:51:45",
				"modifier": "9e5d1e20-1b6d-46b5-a6bc-ad3902036ed7",
				"modifier_userName": "昵称-栗丹",
				"modifyTime": "2023-10-12 12:54:58",
				"auditor": "9e5d1e20-1b6d-46b5-a6bc-ad3902036ed7",
				"auditTime": "2023-10-12 12:55:05",
				"postState": "2",
				"voucherCode": "202302010000000010",
				"voucher": "1625145024310673435",
				"entryCode": "收付组织202210010000000010",
				"voucherType": "1625144955603779772",
				"srcApp": "95",
				"srcApp_name": "应收管理",
				"pubts": "2023-10-12 12:55:12",
				"bodyItem_oriCurrency": "1625145024310673435",
				"bodyItem_oriCurrency_name": "人民币",
				"bodyItem_oriCurrency_priceDigit": 4,
				"bodyItem_oriCurrency_moneyDigit": 2,
				"bodyItem_material": "1706035235773743106",
				"bodyItem_material_code": "000059",
				"bodyItem_expenseItem": "1821023630675674798",
				"expenseItem_code": "Cost_PU",
				"bodyItem_unit": "1679106254706835463",
				"bodyItem_quantity": "1",
				"bodyItem_accExchangeRateType": "0000LCAALQGPE642KN0000",
				"bodyItem_accExchangeRateType_name": "基准汇率",
				"bodyItem_exchangeRateDate": "2022-09-30 00:00:00",
				"bodyItem_accExchangeRateType_digit": 6,
				"bodyItem_accExchangeRate": 1,
				"bodyItem_taxRate": 1.5,
				"bodyItem_taxSubject": "10003",
				"bodyItem_oriTaxIncludedAmount": 10.16,
				"bodyItem_oriTaxAmount": 0.15,
				"bodyItem_oriTaxExcludedAmount": 10.01,
				"bodyItem_oriOcupyAmount": 0,
				"bodyItem_oriBalance": 10.16,
				"bodyItem_accTaxExcludedPrice": "10.01",
				"bodyItem_accTaxIncludedPrice": "10.16",
				"bodyItem_accTaxIncludedAmount": 10.16,
				"bodyItem_accTaxAmount": 0.15,
				"bodyItem_accTaxExcludedAmount": 10.01,
				"bodyItem_accBalance": 10.16,
				"bodyItem_orgTaxIncludedAmount": 10.16,
				"bodyItem_grpTaxIncludedAmount": 10.16,
				"bodyItem_orgTaxAmount": 0.15,
				"bodyItem_grpTaxAmount": 0.15,
				"bodyItem_orgTaxExcludedAmount": 10.01,
				"bodyItem_grpTaxExcludedAmount": 10.01,
				"bodyItem_orgBalance": 10.16,
				"bodyItem_grpBalance": 10.16,
				"bodyItem_gblTaxIncludedAmount": 10.16,
				"bodyItem_gblTaxAmount": 0.15,
				"bodyItem_gblTaxExcludedAmount": 10.01,
				"bodyItem_gblBalance": 10.16,
				"bodyItem_receiveAgreement": "1718644022806315011",
				"bodyItem_dept": "1732013843675086850",
				"bodyItem_staff": "1628068892010610691",
				"bodyItem_project": "1628068892010610691",
				"bodyItem_orderNo": "1111",
				"bodyItem_contractNo": "AC00000001",
				"bodyItem_invoiceType": "2",
				"bodyItem_invoiceDate": "2022-09-30 00:00:00",
				"bodyItem_invoiceNo": "OAR231011306808",
				"bodyItem_costCenter": "1624324195835445255",
				"bodyItem_proCenter": "1528441481898491905",
				"bodyItem_oppProCenter": "1575189056999915529",
				"bodyItem_grandsonItem_issueNo": 1,
				"bodyItem_grandsonItem_startDate": "2022-09-30 00:00:00",
				"bodyItem_grandsonItem_expireDate": "2022-10-30 00:00:00",
				"bodyItem_grandsonItem_ratio": 100,
				"bodyItem_grandsonItem_oriAmount": 10.16,
				"bodyItem_grandsonItem_oriBalance": 10.16,
				"bodyItem_grandsonItem_oriOcupyAmount": 0,
				"bodyItem_grandsonItem_accAmount": 10.16,
				"bodyItem_grandsonItem_accBalance": 10.16,
				"bodyItem_grandsonItem_blnPrepare": 0,
				"bodyItem_grandsonItem_blnDeposit": 0,
				"bodyItem_grandsonItem_settleMode": "1625144947009650745",
				"bodyItem_grandsonItem_orgAmount": 10.16,
				"bodyItem_grandsonItem_orgBalance": 10.16,
				"bodyItem_grandsonItem_grpAmount": 3.629,
				"bodyItem_grandsonItem_grpBalance": 3.629,
				"bodyItem_grandsonItem_gblAmount": 10.16,
				"bodyItem_grandsonItem_gblBalance": 10.16,
				"bodyItem_grandsonItem_convertWay": "0",
				"bodyItem_grandsonItem_balanceState": "0",
				"bodyItem_id": "1837270873490325520"
			}
		],
		"pageCount": 2020,
		"beginPageIndex": 2,
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

