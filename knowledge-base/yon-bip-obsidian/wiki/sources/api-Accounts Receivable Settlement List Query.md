---
title: "应收结算清单列表查询"
apiId: "1637539114535878661"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "AR Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AR Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收结算清单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: AR Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/receivable/list

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
| verifyState | string | 是 | 否 | 单据状态(枚举值 0:开立、1:审批中、2:已审批、3:终止、4:已驳回、不输入时为查询全部) 示例：["0","1"] |
| open_billDate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_billDate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| code | string | 否 | 否 | 单据编号 示例：PAYap221208182455 |
| financeOrg | string | 否 | 否 | 开票组织id 示例：1474252334897823749 |
| bustype | string | 否 | 否 | 交易类型id 示例：1468336043126686582 |
| objectType | string | 否 | 否 | 往来对象类型(枚举值 1:客户; 2:员工；3：资金业务对象) 示例：1 |
| employee | string | 否 | 否 | 员工id 示例：1471493952192905217 |
| oriCurrency | string | 否 | 否 | 币种id 示例：1468336086076358677 |
| direction | string | 否 | 否 | 单据方向(枚举值 -1:红字、1:蓝字) 示例：1 |
| staff | string | 否 | 否 | 业务员id 示例：1471531089999926344 |
| project | string | 否 | 否 | 项目id 示例：1471531765458126344 |
| org | string | 否 | 否 | 业务组织id 示例：1474252334897823749 |
| funder | string | 否 | 否 | 资金业务对象id |
| dept | string | 否 | 否 | 部门id 示例：1471491813291851784 |
| customer | string | 否 | 否 | 客户id 示例：1471403105020018693 |
| modifier | string | 否 | 否 | 修改人id 示例：sda132-131fasd |
| open_modifyTime_begin | string | 否 | 否 | 修改时间开始时间, (大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_modifyTime_end | string | 否 | 否 | 修改时间结束时间, (小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-19 00:00:00 |
| extSystemCode | string | 否 | 否 | 外部系统编码 示例：AB1234 |
| open_auditTime_begin | string | 否 | 否 | 审核日期开始时间, (大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| open_auditTime_end | string | 否 | 否 | 审核日期结束时间, (小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| extVouchCode | string | 否 | 否 | 外部系统单号 示例：AB1234 |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体，默认为false 示例：false 默认值：false |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 否 | 否 | 开票组织编码 示例：456 |
| bustype.code | string | 否 | 否 | 交易类型编码 示例：ap_paypurc |
| employee.code | string | 否 | 否 | 员工编码 示例：100011 |
| oriCurrency.code | string | 否 | 否 | 币种简称 示例：CNY |
| staff.code | string | 否 | 否 | 业务员编码 示例：yw001 |
| project.code | string | 否 | 否 | 项目编码 示例：9088 |
| org.code | string | 否 | 否 | 业务组织编码 示例：99956 |
| funder.code | string | 否 | 否 | 资金业务对象编码 示例：cmd231 |
| dept.code | string | 否 | 否 | 部门编码 示例：bm003 |
| customer.code | string | 否 | 否 | 客户编码 示例：8900 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/receivable/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"verifyState": [
		"0",
		"1"
	],
	"open_billDate_begin": "2022-11-09 00:00:00",
	"open_billDate_end": "2022-12-08 23:59:59",
	"code": "PAYap221208182455",
	"financeOrg": "1474252334897823749",
	"bustype": "1468336043126686582",
	"objectType": "1",
	"employee": "1471493952192905217",
	"oriCurrency": "1468336086076358677",
	"direction": "1",
	"staff": "1471531089999926344",
	"project": "1471531765458126344",
	"org": "1474252334897823749",
	"funder": "",
	"dept": "1471491813291851784",
	"customer": "1471403105020018693",
	"modifier": "sda132-131fasd",
	"open_modifyTime_begin": "2022-11-09 00:00:00",
	"open_modifyTime_end": "2022-11-19 00:00:00",
	"extSystemCode": "AB1234",
	"open_auditTime_begin": "2022-12-08 23:59:59",
	"open_auditTime_end": "2022-12-08 23:59:59",
	"extVouchCode": "AB1234",
	"isSum": false,
	"simple": {
		"financeOrg.code": "456",
		"bustype.code": "ap_paypurc",
		"employee.code": "100011",
		"oriCurrency.code": "CNY",
		"staff.code": "yw001",
		"project.code": "9088",
		"org.code": "99956",
		"funder.code": "cmd231",
		"dept.code": "bm003",
		"customer.code": "8900",
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
| data | object | 否 | 返回应收结算清单数据 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：1 |
| recordCount | int | 否 | 总记录数 示例：3867 |
| recordList | object | 是 | 查询结果集 |
| pageCount | int | 否 | 总页数 示例：3867 |
| beginPageIndex | int | 否 | 起始页码 示例：2 |
| endPageIndex | int | 否 | 最终页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 3867,
		"recordList": [
			{
				"bodyItemLocalTaxIncludedAmount": 6863.3,
				"financeOrg": "1474252334897823749",
				"financeOrgName": "收付组织",
				"bodyItemOrgCurrencyPriceDigit": 3,
				"id": "1633116225909817351",
				"bodyItemCustomerName": "sbq1",
				"bodyItem_funder_name": "scdad-fsad",
				"bodyItem_extRowNo": "20354791896",
				"extSystemCode": "AB1234",
				"bodyItemOrgCurrency": "1468336086076358677",
				"taxSubject": "1506206848627245062",
				"bodyItemOrg": "1474252334897823749",
				"srcAppName": "应收管理",
				"bodyItemLocalTaxExcludedAmount": 6020.9665,
				"billDate": "2023-01-10 00:00:00",
				"bodyItemExchangeRateTypeDigit": 6,
				"extVouchCode": "AB1234",
				"srcApp": "95",
				"bodyItem_id": "1633116225909817353",
				"bodyItemOrgCurrencyMoneyDigit": 4,
				"verifyState": 2,
				"bodyItemOriCurrency": "1468336086076358689",
				"blnWriteOff": 0,
				"localTaxAmount": 842.3335,
				"taxRate": 13.99,
				"bodyItemOriTaxExcludedAmount": 877.2699,
				"modifyTime": "2023-01-10 00:00:00",
				"effectTime": "2023-01-10 00:00:00",
				"billTypeName": "应收发票",
				"srcSystem": "0",
				"startDate": "2023-01-10 00:00:00",
				"bodyItemCustomer": "1477929625664356360",
				"bodyItem_funder": "",
				"modifier": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
				"bodyItem_funder_code": "ZJDX230510000012",
				"bodyItem_partner": "",
				"bodyItemExchangeRateType": "0000L3WE7R4W25O1SI0000",
				"billTypeCode": "receivable",
				"code": "OARar230110481161",
				"bustypeCode": "ar_invoice",
				"writeOffState": "0",
				"bodyItemOrgCurrencyName": "人民币",
				"postStatus": "2",
				"bodyItemExchangeRateDate": "2023-01-10 00:00:00",
				"oriTaxAmount": 122.7301,
				"taxSubjectCode": "0723",
				"effectState": "1",
				"pubts": "2023-01-10 11:03:17",
				"bodyItemPubts": "2023-01-10 11:02:32",
				"direction": "1",
				"bodyItemOriCurrencyName": "美元",
				"bodyItemObjectType": "1",
				"bodyItemId": "1633116225909817353",
				"billType": "2614099822008320",
				"bodyItemOrgName": "收付组织",
				"bodyItemOriCurrencyPriceDigit": 3,
				"bustypeName": "应收发票",
				"bustype": "1468336043126686575",
				"bodyItemExchangeRateTypeName": "基准汇率",
				"taxSubjectName": "ls13.99",
				"bodyItemOriTaxIncludedAmount": 1000,
				"bodyItemExchangeRate": 6.8633,
				"bodyItemOriCurrencyMoneyDigit": 4,
				"businessType": "0"
			}
		],
		"pageCount": 3867,
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

1	2025-07-02

更新

请求说明

更新

返回参数 data


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

