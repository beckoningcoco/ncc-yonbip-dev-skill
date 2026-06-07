---
title: "期初应付列表查询"
apiId: "1835915072579829764"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening A/P"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening A/P]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初应付列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Opening A/P (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openningapsureevent/list

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
| open_accDate_begin | string | 否 | 否 | 记账日期开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_accDate_end | string | 否 | 否 | 记账日期结束时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| status | string | 否 | 否 | 事务状态(枚举值 0:未审核；1:已审核) 示例：1 |
| postState | string | 是 | 否 | 过账状态(枚举值 0:未过账；1:过账中；2:过账成功；3:过账失败；4:不过账) 示例：["0"] |
| financeOrg | string | 是 | 否 | 会计主体id 示例：["1474252334897823749"] |
| code | string | 否 | 否 | 会计事务编号 示例：Pap221208182455 |
| objectType | string | 是 | 否 | 往来对象类型(枚举值 0:供应商；2:员工；3:资金业务对象) 示例：["0"] |
| supplier | string | 是 | 否 | 供应商id 示例：["1734183678338662404"] |
| employee | string | 是 | 否 | 员工id 示例：["1471493952192905217"] |
| funder | string | 是 | 否 | 资金业务对象id 示例：["1474252334897"] |
| oriCurrency | string | 是 | 否 | 币种id 示例：["1468336086076358677"] |
| srcSystem | string | 否 | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理; 8:内部交易; 9:B2C订单中心; 10:营销管理) 示例：1 |
| srcBillCode | string | 否 | 否 | 单据编号 示例：AP02220930000001 |
| open_bodyItem.grandsonItem.expireDate_begin | string | 否 | 否 | 到期日开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-01-10 16:13:41 |
| open_bodyItem.grandsonItem.expireDate_end | string | 否 | 否 | 到期日结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-07-10 16:13:41 |
| bodyItem.grandsonItem.apSubject | string | 是 | 否 | 应付账款科目id 示例：["1705979049004761094"] |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体，默认为false 示例：false 默认值：false |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 否 | 否 | 会计主体编码 示例：456 |
| supplier.code | string | 否 | 否 | 供应商编码 示例：8900 |
| employee.code | string | 否 | 否 | 员工编码 示例：100011 |
| funder.code | string | 否 | 否 | 资金业务对象编码 示例：100011 |
| oriCurrency.code | string | 否 | 否 | 币种简称 示例：CNY |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_begin | string | 否 | 否 | 审核时间开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_end | string | 否 | 否 | 审核时间结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/openningapsureevent/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"open_accDate_begin": "2022-11-09 00:00:00",
	"open_accDate_end": "2022-12-08 23:59:59",
	"status": "1",
	"postState": [
		"0"
	],
	"financeOrg": [
		"1474252334897823749"
	],
	"code": "Pap221208182455",
	"objectType": [
		"0"
	],
	"supplier": [
		"1734183678338662404"
	],
	"employee": [
		"1471493952192905217"
	],
	"funder": [
		"1474252334897"
	],
	"oriCurrency": [
		"1468336086076358677"
	],
	"srcSystem": "1",
	"srcBillCode": "AP02220930000001",
	"open_bodyItem.grandsonItem.expireDate_begin": "2023-01-10 16:13:41",
	"open_bodyItem.grandsonItem.expireDate_end": "2023-07-10 16:13:41",
	"bodyItem.grandsonItem.apSubject": [
		"1705979049004761094"
	],
	"isSum": false,
	"simple": {
		"financeOrg.code": "456",
		"supplier.code": "8900",
		"employee.code": "100011",
		"funder.code": "100011",
		"oriCurrency.code": "CNY",
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:24",
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
| data | object | 否 | 返回应付发票数据 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：1 |
| recordCount | int | 否 | 总记录数 示例：2020 |
| recordList | object | 是 | 查询结果集 |

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
				"accDate": "2023-04-30 00:00:00",
				"code": "AP04230430000002",
				"financeOrg": "1718421354514481153",
				"accBook": "1718429961642573841",
				"accBook_code": "731397312035134394",
				"arapEventType": "301",
				"accPeriod": "1658321095469039623",
				"srcBillCode": "AP04230430000002",
				"srcBillDate": "2023-04-30 00:00:00",
				"srcBillType": "2640014822067376542",
				"objectType": "0",
				"supplier": "1722256571342782467",
				"employee": "14039610031970175390",
				"funder": "6209555961406038092",
				"partner": "3348583201349155358",
				"oriCurrency": "1717763331189112841",
				"accCurrency": "1718420753246846983",
				"oriAmount": 1344495327411671729,
				"accAmount": 8419099111607684726,
				"status": "1",
				"srcApp": "94",
				"bodyItem_oriCurrency": "1717763331189112841",
				"bodyItem_material": "14641679681715500715",
				"bodyItem_expenseItem": "204242670994845886",
				"bodyItem_taxRate": 0,
				"bodyItem_oriTaxIncludedAmount": -10,
				"bodyItem_oriTaxAmount": 764445572667852780,
				"bodyItem_oriTaxExcludedAmount": 12598940011869601979,
				"bodyItem_accTaxIncludedAmount": -69.8,
				"bodyItem_accTaxAmount": 774114005293376752,
				"bodyItem_accTaxExcludedAmount": 172571640859576472,
				"bodyItem_unit": "5933309221479474323",
				"bodyItem_quantity": 12871144312022863525,
				"bodyItem_taxSubject": "1963606113922628004",
				"bodyItem_oriTaxExcludedPrice": 3953411491043436536,
				"bodyItem_oriTaxIncludedPrice": 170990304699510200,
				"bodyItem_oriBalance": -10,
				"bodyItem_accExchangeRateType": "0000LCAALQGPE642KN0000",
				"bodyItem_exchangeRateDate": "2023-04-30 00:00:00",
				"bodyItem_accExchangeRate": 6.98,
				"bodyItem_accBalance": -70,
				"bodyItem_accTaxIncludedPrice": 9650683262115807636,
				"bodyItem_accTaxExcludedPrice": 5972896731236968099,
				"bodyItem_remarks": "40355412511234978",
				"bodyItem_staff": "19865583311260570354",
				"bodyItem_payAgreement": "179906295620708762",
				"bodyItem_dept": "4865250581412844831",
				"bodyItem_project": "1281381299365667295",
				"bodyItem_orderNo": "2775267352067412216",
				"bodyItem_contractNo": "973621425205425834",
				"bodyItem_invoiceType": "11985756671968611287",
				"bodyItem_proCenter": "1488149182863441749",
				"bodyItem_oppProCenter": "20002754561181173185",
				"bodyItem_costCenter": "166410264777108299",
				"bodyItem_taxInSubjectVid": "315895182042597773",
				"bodyItem_taxInBuffSubjectVid": "19589888851002550901",
				"bodyItem_purchaseSubjectVid": "9509752072002062849",
				"bodyItem_nonDeductTaxRate": 150178980321799577,
				"bodyItem_oriNonDeductTax": 4266670421440352362,
				"bodyItem_blnDeductTax": 1,
				"bodyItem_oriOcupyAmount": 0,
				"bodyItem_deductTaxType": "0",
				"bodyItem_invoiceNo": "1870111372933950745",
				"bodyItem_invoiceDate": "2022-10-30 00:00:00",
				"bodyItem_oriBillNo": "4541935431130765258",
				"bodyItem_srcBillType": "1415730186922119142",
				"bodyItem_grandsonItem_issueNo": 1,
				"bodyItem_grandsonItem_expireDate": "2022-10-30 00:00:00",
				"bodyItem_grandsonItem_oriAmount": 1939149779721794672,
				"bodyItem_grandsonItem_oriBalance": 1403072850168864952,
				"bodyItem_grandsonItem_accAmount": 14736557751981978373,
				"bodyItem_grandsonItem_accBalance": 305498660530554578,
				"bodyItem_grandsonItem_accBook": "116251242239531173",
				"bodyItem_grandsonItem_startDate": "2022-10-30 00:00:00",
				"bodyItem_grandsonItem_apSubjectVid": "113796208654445845",
				"bodyItem_grandsonItem_balanceState": "14944556271567264693",
				"bodyItem_grandsonItem_blnPrepare": 0,
				"bodyItem_grandsonItem_blnDeposit": 0,
				"bodyItem_grandsonItem_settleMode": "1734328170439266587",
				"bodyItem_grandsonItem_ratio": 0,
				"bodyItem_grandsonItem_convertWay": 0,
				"bodyItem_grandsonItem_oriOcupyAmount": 100,
				"bodyItem_grandsonItem_localClearTime": "2022-10-30 00:00:00",
				"bodyItem_grandsonItem_localBalanceState": "2145749810709639160",
				"remarks": "5251801012019595197",
				"accPurpose": "1625145032916860933",
				"srcSystem": "1",
				"id": "1722440060925640709",
				"pubts": "2023-05-29 11:01:52",
				"bodyItem_id": "1722440060925640710",
				"postState": "2",
				"blnEffect": "0",
				"balanceState": 1,
				"writeOffState": "1",
				"entry": "1723202348897534011",
				"entryCode": "SF00220230501000011",
				"voucherType": "1625144955603779774",
				"voucher": "8764376031401394807",
				"voucherCode": "735432347708844888",
				"pageCount": 3867,
				"beginPageIndex": 2,
				"endPageIndex": 10
			}
		]
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

