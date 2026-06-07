---
title: "付款单列表查询"
apiId: "1608763520827523074"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Payment Document (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/payment/list

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
| extVouchCode | string | 否 | 否 | 外部系统单号 示例：AB1234 |
| extSystemCode | string | 否 | 否 | 外部系统编码 示例：AB1234 |
| srcApp | string | 是 | 否 | 来源应用, 94:应付管理、102:现金管理、123:项目采购、125:采购管理、127:库存管理、130:委外管理、132:供应链费用、145:合同中心、不输入时为查询全部 示例：["94","125"] |
| verifyState | string | 是 | 否 | 单据状态, 0:开立、1:审批中、2:已审批、3:终止、4:已驳回、不输入时为查询全部 示例：["0","1"] |
| open_billDate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_billDate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| modifier | string | 否 | 否 | 修改人id 示例：5da132-131fasd |
| open_modifyTime_begin | string | 否 | 否 | 修改时间开始时间, (大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_modifyTime_end | string | 否 | 否 | 修改时间结束时间, (小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| code | string | 否 | 否 | 单据编号 示例：PAYap221208182455 |
| financeOrg | string | 否 | 否 | 付款组织id 示例：1474252334897823749 |
| bustype | string | 否 | 否 | 交易类型id 示例：1468336043126686582 |
| objectType | string | 否 | 否 | 往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| supplier | string | 否 | 否 | 供应商id 示例：1505445153267515397 |
| employee | string | 否 | 否 | 员工id 示例：1471493952192905217 |
| funder | string | 否 | 否 | 资金业务对象id |
| oriCurrency | string | 否 | 否 | 币种id 示例：1468336086076358677 |
| settleMode | string | 否 | 否 | 结算方式id 示例：1468336506962182287 |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体，默认为false 示例：false 默认值：false |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 否 | 否 | 付款组织编码 示例：456 |
| bustype.code | string | 否 | 否 | 交易类型编码 示例：ap_paypurc |
| supplier.code | string | 否 | 否 | 供应商编码 示例：0001000111 |
| employee.code | string | 否 | 否 | 员工编码 示例：100011 |
| funder.code | string | 否 | 否 | 资金业务对象编码 |
| oriCurrency.code | string | 否 | 否 | 币种简称 示例：CNY |
| settleMode.code | string | 否 | 否 | 结算方式编码 示例：system_0001 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_begin | string | 否 | 否 | 审核时间开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_end | string | 否 | 否 | 审核时间结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/payment/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"extVouchCode": "AB1234",
	"extSystemCode": "AB1234",
	"srcApp": [
		"94",
		"125"
	],
	"verifyState": [
		"0",
		"1"
	],
	"open_billDate_begin": "2022-11-09 00:00:00",
	"open_billDate_end": "2022-12-08 23:59:59",
	"modifier": "5da132-131fasd",
	"open_modifyTime_begin": "2022-11-09 00:00:00",
	"open_modifyTime_end": "2022-12-08 23:59:59",
	"code": "PAYap221208182455",
	"financeOrg": "1474252334897823749",
	"bustype": "1468336043126686582",
	"objectType": "0",
	"supplier": "1505445153267515397",
	"employee": "1471493952192905217",
	"funder": "",
	"oriCurrency": "1468336086076358677",
	"settleMode": "1468336506962182287",
	"isSum": false,
	"simple": {
		"financeOrg.code": "456",
		"bustype.code": "ap_paypurc",
		"supplier.code": "0001000111",
		"employee.code": "100011",
		"funder.code": "",
		"oriCurrency.code": "CNY",
		"settleMode.code": "system_0001",
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
| data | object | 否 | 返回付款单数据 |
| pageIndex | long | 否 | 当前页码 示例：1 |
| pageSize | long | 否 | 每页查询数据大小，限制500 示例：2 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 起始页码 示例：1 |
| endPageIndex | long | 否 | 最终页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 1,
		"recordList": [
			{
				"funder": "1664394763341660162",
				"funder_name": "LJMABC",
				"partner": "1664394763341660162",
				"partner_name": "业务伙伴-北京",
				"funderBankAccount_nam_accountname": "ljmLLLL",
				"funderBankAccount": "1664394763341660162",
				"bodyItem_funder": "1664394763341660162",
				"extSystemCode": "AB1234",
				"extVouchCode": "AB1234",
				"bodyItem_funder_name": "ljmLLLL",
				"modifier": "sda132-131fasd",
				"bodyItem_partner": "1664394763341660162",
				"bodyItem_partner_name": "业务伙伴-北京",
				"bodyItem_funderBankAccount": "1664394763341660162",
				"bodyItem_funderBankAccount_nam_accountname": "ljmLLLL",
				"bodyItemLocalTaxIncludedAmount": 100,
				"financeOrg": "1474252334897823749",
				"modifyTime": "2022-11-09 00:00:00",
				"bodyItem_extRowNo": "",
				"bodyItemSettleModeName": "票据结算",
				"bodyItemDept": "1576796568861802502",
				"headerId": "1609514109313220608",
				"financeOrgName": "收付组织",
				"id": "1609514109313220608",
				"bodyItemOrgCurrency": "1468336086076358677",
				"supplier": "1508711123886538761",
				"supplierName": "缓存供应商242277075",
				"taxSubject": "1468336086076358698",
				"bodyItemOrg": "1474252334897823749",
				"srcAppName": "委外管理",
				"bodyItemLocalTaxExcludedAmount": 100,
				"bodyItemSupplierName": "测试供应商",
				"billDate": "2022-12-09 00:00:00",
				"bodyItemExchangeRateTypeDigit": 6,
				"srcApp": "130",
				"bodyItem_id": "1609514109313220609",
				"bodyItemOrgCurrencyMoneyDigit": 4,
				"verifyState": 0,
				"bodyItemSettleMode": "1468336506962182287",
				"bodyItemOriCurrency": "1468336086076358677",
				"quickTypeName": "预付款",
				"taxRate": 0,
				"materialName": "普通物料第一轮",
				"settleSubmitType": "1",
				"bodyItemOriTaxExcludedAmount": 100,
				"billTypeName": "付款单",
				"srcSystem": "2",
				"bodyItemExchangeRateType": "0000L3WE7R4W25O1SI0000",
				"billTypeCode": "payment",
				"code": "PAYap221209182488",
				"bustypeCode": "ap_paypurc",
				"bodyItemOrgCurrencyName": "人民币",
				"postStatus": "0",
				"bodyItemSupplierBankAccount": "1505477236673216515",
				"issueNo": 1,
				"bodyItemExchangeRateDate": "2022-12-09 00:00:00",
				"quickType": "1468336103164477459",
				"oriTaxAmount": 0,
				"taxSubjectCode": "VAT0",
				"bodyItemDeptName": "人力资源部",
				"bodyItemOriOccupyAmount": 0,
				"bodyItemPubts": "2022-12-09 15:48:24",
				"bodyItemOriCurrencyName": "人民币",
				"bodyItemObjectType": "0",
				"bodyItemId": "1609514109313220609",
				"bodyItemSupplier": "1505445153267515397",
				"billType": "2614249315406336",
				"bodyItemSettleState": "0",
				"bodyItemOrderNo": "WWDD20221209000014",
				"bodyItemOrgName": "收付组织",
				"materialCode": "000003",
				"bodyItemSupplierBankAccountName": "测试账户",
				"bustypeName": "采购付款",
				"bustype": "1468336043126686582",
				"bodyItemExchangeRateTypeName": "基准汇率",
				"taxSubjectName": "0%",
				"bodyItemOriTaxIncludedAmount": 100,
				"bodyItemLocalTaxAmount": 0,
				"bodyItemExchangeRate": 1,
				"bodyItem_srcBillId": "1727506275524149254",
				"bodyItem_srcBillRowId": "1727506275524149256",
				"bodyItem_srcBillNo": "PAYAPA230517000001",
				"material": "1471445006723579912",
				"bodyItemOriCurrencyMoneyDigit": 4,
				"businessType": "4"
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

