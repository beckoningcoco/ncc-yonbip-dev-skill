---
title: "期初付款退款列表查询"
apiId: "1835917933028048902"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Payment Refund"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Payment Refund]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初付款退款列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Opening Payment Refund (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openingpaymentrefundevent/list

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
| status | string | 否 | 否 | 事务状态（枚举值 0：未审核；1：已审核；） 示例：0 |
| open_accDate_begin | string | 否 | 否 | 记账日期开始时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-04-01 00:00:00 |
| open_accDate_end | string | 否 | 否 | 记账日期结束时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-04-30 23:59:59 |
| code | string | 否 | 否 | 单据编号 示例：AP04230430000002 |
| financeOrg | string | 是 | 否 | 会计主体id 示例：["1474252334897823749","1718421354514481153"] |
| postState | string | 是 | 否 | 过账状态（枚举值 0：未过账；1：过账中；2：过账成功；3：过账失败；4：不过账；） 示例：["0","1"] |
| objectType | string | 是 | 否 | 往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：["0","2"] |
| employee | string | 是 | 否 | 员工id 示例：["1471493952192905217","1722963591694385156"] |
| supplier | string | 是 | 否 | 供应商id 示例：["1505445153267515397","1722256571342782467"] |
| funder | string | 是 | 否 | 资金业务对象id 示例：["1474252334897","1726091032249499652"] |
| oriCurrency | string | 是 | 否 | 币种id 示例：["1468336086076358677","1717763331189112841"] |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体，默认为false 示例：false |
| bodyItem.apSubject | string | 是 | 否 | 应付账款科目id 示例：["1717708364185075802","1717708364185075803"] |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 否 | 否 | 收票组织编码 示例：456 |
| employee.code | string | 否 | 否 | 员工编码 示例：100011 |
| supplier.code | string | 否 | 否 | 供应商编码 示例：8900 |
| funder.code | string | 否 | 否 | 资金业务对象编码 示例：100011 |
| oriCurrency.code | string | 否 | 否 | 原币币种编码 示例：CNY |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-04-30 23:59:59 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-05-30 23:59:59 |
| open_auditTime_begin | string | 否 | 否 | 审核时间开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_end | string | 否 | 否 | 审核时间结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/openingpaymentrefundevent/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"status": "0",
	"open_accDate_begin": "2023-04-01 00:00:00",
	"open_accDate_end": "2023-04-30 23:59:59",
	"code": "AP04230430000002",
	"financeOrg": [
		"1474252334897823749",
		"1718421354514481153"
	],
	"postState": [
		"0",
		"1"
	],
	"objectType": [
		"0",
		"2"
	],
	"employee": [
		"1471493952192905217",
		"1722963591694385156"
	],
	"supplier": [
		"1505445153267515397",
		"1722256571342782467"
	],
	"funder": [
		"1474252334897",
		"1726091032249499652"
	],
	"oriCurrency": [
		"1468336086076358677",
		"1717763331189112841"
	],
	"isSum": false,
	"bodyItem.apSubject": [
		"1717708364185075802",
		"1717708364185075803"
	],
	"simple": {
		"financeOrg.code": "456",
		"employee.code": "100011",
		"supplier.code": "8900",
		"funder.code": "100011",
		"oriCurrency.code": "CNY",
		"open_pubts_begin": "2023-04-30 23:59:59",
		"open_pubts_end": "2023-05-30 23:59:59",
		"open_auditTime_begin": "2023-04-13 14:59:24",
		"open_auditTime_end": "2023-04-13 14:59:24"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回期初付款退款数据 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：20 |
| recordCount | int | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |
| pageCount | int | 否 | 总页数 示例：1 |
| beginPageIndex | int | 否 | 开始页数 示例：1 |
| endPageIndex | int | 否 | 结束页数 示例：1 |

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
				"accYearCode": "2023",
				"accDate": "2023-04-30 00:00:00",
				"code": "AP04230430000002",
				"financeOrg": "1718421354514481153",
				"arapEventType": "307",
				"accPeriod": "1658321095469039623",
				"accPeriod_name": "2023-05",
				"bizBillCode": "AP04230430000002",
				"srcBillCode": "AP04230430000002",
				"srcBillDate": "2023-04-30 00:00:00",
				"objectType": "0",
				"supplier": "1722256571342782467",
				"employee": "1722256571342782445",
				"funder": "1722256571342782424",
				"partner": "1722256571342783497",
				"oriCurrency": "1717763331189112841",
				"oriAmount": -100,
				"accCurrency": "1718420753246846983",
				"accAmount": -100,
				"status": "1",
				"postState": "2",
				"entry": "1723202348897534011",
				"entryCode": "SF00220230501000011",
				"voucherType": "1625144955603779774",
				"voucher": "1625144955603779390",
				"voucherCode": "53487027627349067236",
				"creator": "7cc74ef9-ea4c-4cae-a490-d14fd3630d96",
				"createTime": "2023-05-10 19:32:57",
				"modifier": "7cc74ef9-ea4c-4cae-a490-d14fd3630d96",
				"modifyTime": "2023-05-10 19:32:58",
				"blnEffect": "1",
				"srcTradeType": "5089273046273626",
				"srcApp": "94",
				"eventType": "2738987604747008",
				"bodyItem_settleMode": "1625144947009650745",
				"bodyItem_oriCurrency": "1717763331189112841",
				"bodyItem_oriTaxIncludedAmount": -10,
				"bodyItem_oriOcupyAmount": 0,
				"bodyItem_oriBalance": -10,
				"bodyItem_accTaxIncludedAmount": -69.8,
				"bodyItem_accBalance": -70,
				"bodyItem_quickType": "1625145032916860948",
				"bodyItem_material": "1625145032916890876",
				"bodyItem_expenseItem": "1625145032910987654",
				"bodyItem_enterpriseBankAccount": "1625145032910982342",
				"bodyItem_enterpriseCashAccount": "162514503291043231",
				"bodyItem_supplierBankAccount": "1625145032910423424",
				"bodyItem_employeeBankAccount": "1625145032910453453",
				"bodyItem_funderBankAccount": "16251450329104707975",
				"bodyItem_funderBankAccount_no": "89075235676645972427",
				"bodyItem_objectBankAccountNo": "89075235676645972427",
				"bodyItem_accExchangeRateType": "0000LCAALQGPE642KN0000",
				"bodyItem_exchangeRateDate": "2023-04-30 00:00:00",
				"bodyItem_accExchangeRate": 6.98,
				"bodyItem_dept": "1625145032910470535",
				"bodyItem_staff": "16251450329104795725",
				"bodyItem_project": "16251450329104794234",
				"bodyItem_orderNo": "424521679457295",
				"bodyItem_contractNo": "2705427523756262",
				"bodyItem_proCenter": "16251450329104795235",
				"bodyItem_oppProCenter": "16251450329104798976",
				"bodyItem_costCenter": "1625145032910479676",
				"bodyItem_noteType": "162514503291043453",
				"bodyItem_noteNo": "162514503291786879",
				"accBook": "1718429961642573841",
				"accPurpose": "1625145032916860933",
				"srcSystem": "1",
				"remarks": "api测试",
				"bodyItem_settleSubjectVid": "16251450329168609534",
				"bodyItem_costSubjectVid": "16251450329168609523",
				"bodyItem_apSubjectVid": "1717708364185075802",
				"settleState": "0",
				"balanceState": "0",
				"org": "1718421354514481153",
				"id": "1722440060925640709",
				"pubts": "2023-05-29 11:01:52",
				"bodyItem_id": "1722440060925640710",
				"bodyItem_invoiceNo": "2345393509267656252",
				"bodyItem_settleDate": "2023-05-29 11:01:52",
				"bodyItem_remarks": "api测试",
				"bodyItem_settleState": "2",
				"bodyItem_balanceState": "0",
				"bodyItem_clearTime": "9999-12-31 00:00:00",
				"bodyItem_rowNo": 10,
				"bodyItem_issueNo": 1,
				"bodyItem_noteDate": "2023-05-29",
				"bodyItem_expireDate": "2023-04-30 00:00:00",
				"bodyItem_inventoryOrg": "17224400605353536"
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

