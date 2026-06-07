---
title: "期初收款退款列表查询"
apiId: "1835921059754278914"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Collection Refund"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Collection Refund]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初收款退款列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Opening Collection Refund (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openingreceivementrefundevent/list

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
| pageIndex | string | 否 | 是 | 当前页码 示例：1 |
| pageSize | string | 否 | 是 | 每页查询数据大小，限制500 示例：10 |
| status | string | 否 | 否 | 事务状态（枚举值 0：未审核；1：已审核；） 示例：0 |
| open_accDate_begin | string | 否 | 否 | 记账日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_accDate_end | string | 否 | 否 | 记账日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| code | string | 否 | 否 | 会计事务编号 示例：PAYap221208182455 |
| financeOrg | string | 是 | 否 | 会计主体id 示例：["1474252334897823749","1718421354514481153"] |
| postState | string | 是 | 否 | 过账状态（枚举值 0：未过账；1：过账中；2：过账成功；3：过账失败；4：不过账；） 示例：["0","1"] |
| objectType | string | 是 | 否 | 往来对象类型 (枚举值 1:客户 2:员工 3:资金业务对象) 示例：["1","2"] |
| customer | string | 是 | 否 | 客户ID 示例：["1505445153267515397","1722256571342782467"] |
| employee | string | 是 | 否 | 员工id 示例：["1471493952192905217","1722963591694385156"] |
| funder | string | 是 | 否 | 资金业务对象id 示例：["1474252334897","1726091032249499652"] |
| oriCurrency | string | 是 | 否 | 币种id 示例：["1468336086076358677","1717763331189112841"] |
| bodyItem.arSubject | string | 是 | 否 | 应收账款科目ID 示例：["1717708364185075802","1717708364185075803"] |
| open_auditTime_begin | string | 否 | 否 | 审核时间开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_auditTime_end | string | 否 | 否 | 审核时间结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体，默认为false 示例：false 默认值：false |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 否 | 否 | 收票组织编码 示例：456 |
| employee.code | string | 否 | 否 | 员工编码 示例：100011 |
| customer.code | string | 否 | 否 | 客户编码 示例：8900 |
| funder.code | string | 否 | 否 | 资金业务对象编码 示例：100011 |
| oriCurrency.code | string | 否 | 否 | 币种简称 示例：CNY |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/openingreceivementrefundevent/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"status": "0",
	"open_accDate_begin": "2022-11-09 00:00:00",
	"open_accDate_end": "2022-12-08 23:59:59",
	"code": "PAYap221208182455",
	"financeOrg": [
		"1474252334897823749",
		"1718421354514481153"
	],
	"postState": [
		"0",
		"1"
	],
	"objectType": [
		"1",
		"2"
	],
	"customer": [
		"1505445153267515397",
		"1722256571342782467"
	],
	"employee": [
		"1471493952192905217",
		"1722963591694385156"
	],
	"funder": [
		"1474252334897",
		"1726091032249499652"
	],
	"oriCurrency": [
		"1468336086076358677",
		"1717763331189112841"
	],
	"bodyItem.arSubject": [
		"1717708364185075802",
		"1717708364185075803"
	],
	"open_auditTime_begin": "2022-11-09 00:00:00",
	"open_auditTime_end": "2022-12-08 23:59:59",
	"isSum": false,
	"simple": {
		"financeOrg.code": "456",
		"employee.code": "100011",
		"customer.code": "8900",
		"funder.code": "100011",
		"oriCurrency.code": "CNY",
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:24"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回期初收款退款列表数据 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：20 |
| recordCount | int | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 开始页数 示例：1 |
| endPageIndex | long | 否 | 结束页数 示例：1 |

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
				"id": "1837196072339898375",
				"accDate": "2023-06-30 00:00:00",
				"code": "AR04230630000017",
				"financeOrg": "1812935142113017863",
				"financeOrgName": "收付多版本测试组织",
				"arapEventType": "107",
				"eventType": "1436624770572484615",
				"eventType_name": "期初收款退款",
				"accPeriodCode": "2023-07",
				"accBook": "1814181773554221071",
				"accBookName": "收付多版本测试组织",
				"accPurpose": "1580569448542109991",
				"accPurpose_name": "法人核算目的",
				"bizBillCode": "AR04230630000016",
				"srcBillDate": "2023-06-30 00:00:00",
				"srcSystem": "0",
				"org": "1812935142113017863",
				"orgCode": "0909",
				"orgName": "收付多版本测试组织",
				"objectType": "1",
				"customer": "1814472164876222466",
				"customerCode": "chhs01nbgys",
				"customerName": "chhs01内部供应商（chhs发货）",
				"employee": "1736459574",
				"employeeCode": "1846594633",
				"funder": "1483736363",
				"funder_code": "1248474364764",
				"partner": "14567877766",
				"partner_name": "王明",
				"partner_code": "134677754",
				"status": "0",
				"settleState": "0",
				"balanceState": "0",
				"blnEffect": "0",
				"oriCurrency": "1580569439952699425",
				"oriCurrency_nam_name": "人民币",
				"oriCurrency_moneyDigit": 3,
				"oriAmount": 0,
				"oriBalance": -80,
				"accCurrency": "1580569439952699425",
				"accCurrency_name": "人民币",
				"accCurrency_moneyDigit": 3,
				"accCurrency_priceDigit": 3,
				"accAmount": 0,
				"accBalance": -80,
				"orgCurrency": "1580569439952699425",
				"orgCurrency_name": "人民币",
				"orgCurrency_moneyDigit": 3,
				"orgAmount": 0,
				"orgBalance": 0,
				"grpAmount": 0,
				"grpBalance": 0,
				"gblAmount": 0,
				"gblBalance": 0,
				"pubts": "2023-10-12 10:29:33",
				"bodyItemId": "1837196072339898377",
				"postState": "0",
				"blnWriteOff": 0,
				"bodyItem_dept": "1818042519668129796",
				"remarks": "采购退款",
				"writeOffState": "0",
				"localBalanceState": "0",
				"accYearCode": "2023",
				"entry": "1873636273",
				"entryCode": "1332387373623",
				"voucherCode": "13736284362683",
				"srcApp": "95",
				"srcApp_name": "应收管理",
				"creator": "21719ffb-647c-4e5e-b686-6a24e487d4ac",
				"creator_userName": "昵称-孙悦儿",
				"createTime": "2023-10-12 10:29:32",
				"accYear": "1591544722069913603",
				"accYear_id": "124544664",
				"verifyState": "0",
				"auditTime": "2023-10-02 00:00:00",
				"modifyTime": "2023-08-13 10:29:32",
				"bodyItem_staff": "1344553353",
				"bodyItem_project": "1815140547702554913",
				"bodyItem_settleMode": "1691202935474880529",
				"bodyItem_enterpriseBankAccount": "123454372",
				"bodyItem_enterpriseBankAccount_account": "1344567544",
				"bodyItem_enterpriseCashAccount": "1234345443",
				"bodyItem_customerBankAccount": "124435423233223",
				"bodyItem_customerBankAccount_bankAccount": "143455343",
				"bodyItem_employeeBankAccount": "14445322323",
				"bodyItem_employeeBankAccount_no": "13434334534",
				"bodyItem_funderBankAccount": "1244334535",
				"bodyItem_funderBankAccount_bankaccount": "12234422",
				"bodyItem_objectBankAccountNo": "12343454324",
				"bodyItem_oriCurrency": "1580569439952699425",
				"bodyItem_oriTaxIncludedAmount": -80,
				"bodyItem_oriOcupyAmount": 0,
				"bodyItem_oriBalance": -80,
				"bodyItem_accTaxIncludedAmount": -80,
				"bodyItem_accBalance": -80,
				"bodyItem_quickTypeCode": "2",
				"bodyItem_quickType": "1580569448542110004",
				"bodyItem_accExchangeRateType": "0000L9WH2UZ56SI9FH0000",
				"bodyItem_accExchangeRateType_digit": 7,
				"bodyItem_material": "1814953364432093192",
				"bodyItem_expenseItem": "1791319611115307017",
				"accExchangeRate": "1",
				"bodyItem_exchangeRateDate": "2023-06-30 00:00:00",
				"order_no": "156543463376",
				"contract_no": "144567844",
				"invoice_no": ":0513HLWZX51320220151828",
				"note_type": "123434256",
				"noteNo": "14335345234",
				"note_date": "2023-03-16 00:00:00",
				"bodyItem_issueNo": 1,
				"bodyItem_expireDate": "2023-06-30 00:00:00",
				"bodyItem_arSubjectVid": "1814206727330463772",
				"bodyItem_arSubjectVid_name": "原材料",
				"bodyItem_costCenter": "145673432",
				"bodyItem_costCenter_id": "13456775",
				"bodyItem_proCenter": "1356775573",
				"bodyItem_oppProCenter": "1581880753585127430",
				"oriBillNo": "134567777",
				"oriBillId": "144566765",
				"oriBillType": "13456764",
				"oriBillRowId": "145675436",
				"bodyItem_srcBillNo": "1457432678",
				"srcBillId": "134789",
				"srcBillType": "14583674",
				"srcBillRowId": "1456777864",
				"bodyItem_settleState": "2",
				"bodyItem_settleDate": "2023-08-14 10:29:33",
				"bodyItem_amountOrg": "14566443689",
				"bodyItem_amountOrg_id": "14566443689",
				"bodyItem_createTime": "2023-10-12 10:29:32",
				"bodyItem_accAmount": -80,
				"bodyItem_modifyTime": "2023-07-31 00:00:00",
				"bodyItem_balanceState": "0",
				"bodyItem_localBalanceState": "0",
				"bodyItem_clearTime": "9999-12-31 00:00:00",
				"bodyItem_amountDirection": "-1"
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

