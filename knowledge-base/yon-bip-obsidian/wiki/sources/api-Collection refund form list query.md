---
title: "收款退款单列表查询"
apiId: "1487076840942600198"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Refund Note"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Refund Note]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款退款单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Collection Refund Note (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/arRefund/list

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
| pageIndex | int | 否 | 是 | 页码 示例：1 |
| pageSize | int | 否 | 是 | 每页条数 示例：10 |
| modifier | string | 否 | 否 | 修改人id 示例：68cdz-bf268c6-ffd4 |
| open_modifyTime_begin | string | 否 | 否 | 修改时间开始时间, (大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_modifyTime_end | string | 否 | 否 | 修改时间开始时间, (大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| open_billDate_begin | string | 否 | 否 | 单据日期开始时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-11-09 00:00:00 |
| open_billDate_end | string | 否 | 否 | 单据日期结束时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-12-08 23:59:59 |
| verifyState | string | 是 | 否 | 单据状态(枚举值 0:开立; 1:审批中; 2:已审批; 3:终止; 4:已驳回) 示例：["0","1"] |
| financeOrg | string | 是 | 否 | 收款组织id 示例：["1468336103164477457","1629655968344965126"] |
| code | string | 否 | 否 | 单据编号 示例：CREF099686 |
| bustype | string | 是 | 否 | 交易类型id 示例：["1468336043126686576"] |
| objectType | string | 是 | 否 | 往来对象类型(枚举值1:客户; 2:员工；3：资金业务对象) 示例：["1"] |
| customer | string | 是 | 否 | 客户id 示例：["1468336043127886576"] |
| employee | string | 是 | 否 | 员工id 示例：["1468339943126686576"] |
| funder | string | 否 | 否 | 资金业务对象id |
| oriCurrency | string | 是 | 否 | 币种id 示例：["1468336043120086576"] |
| settleMode | string | 是 | 否 | 结算方式id 示例：["146833607777686576"] |
| extSystemCode | string | 否 | 否 | 外部系统编码 示例：AB1234 |
| extVouchCode | string | 否 | 否 | 外部系统单号 示例：AB1234 |
| open_auditTime_begin | string | 否 | 否 | 审核日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_auditTime_end | string | 否 | 否 | 审核日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| isSum | boolean | 否 | 否 | 是否仅查询表头(true：返回表头字段；false或者为空：返回表头+表体字段) 示例：false |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 否 | 否 | 收款组织编码 示例：45600 |
| bustype.code | string | 否 | 否 | 交易类型编码 示例：ar_refsale |
| customer.code | string | 否 | 否 | 客户编码 示例：0001000111 |
| funder.code | string | 否 | 否 | 资金业务对象编码 |
| employee.code | string | 否 | 否 | 员工编码 示例：100011 |
| oriCurrency.code | string | 否 | 否 | 币种简称 示例：CNY |
| settleMode.code | string | 否 | 否 | 结算方式编码 示例：system_0001 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/arRefund/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"modifier": "68cdz-bf268c6-ffd4",
	"open_modifyTime_begin": "2022-11-09 00:00:00",
	"open_modifyTime_end": "2022-12-08 23:59:59",
	"open_billDate_begin": "2022-11-09 00:00:00",
	"open_billDate_end": "2022-12-08 23:59:59",
	"verifyState": [
		"0",
		"1"
	],
	"financeOrg": [
		"1468336103164477457",
		"1629655968344965126"
	],
	"code": "CREF099686",
	"bustype": [
		"1468336043126686576"
	],
	"objectType": [
		"1"
	],
	"customer": [
		"1468336043127886576"
	],
	"employee": [
		"1468339943126686576"
	],
	"funder": "",
	"oriCurrency": [
		"1468336043120086576"
	],
	"settleMode": [
		"146833607777686576"
	],
	"extSystemCode": "AB1234",
	"extVouchCode": "AB1234",
	"open_auditTime_begin": "2022-11-09 00:00:00",
	"open_auditTime_end": "2022-12-08 23:59:59",
	"isSum": false,
	"simple": {
		"financeOrg.code": "45600",
		"bustype.code": "ar_refsale",
		"customer.code": "0001000111",
		"funder.code": "",
		"employee.code": "100011",
		"oriCurrency.code": "CNY",
		"settleMode.code": "system_0001",
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
| data | object | 否 | 返回数据 |
| pageIndex | int | 否 | 页码 示例：1 |
| pageSize | int | 否 | 每页行数 示例：200 |
| recordCount | int | 否 | 总条数 示例：1 |
| recordList | object | 是 | 返回业务对象数组 |
| sumRecordList | object | 是 | 合计 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 200,
		"recordCount": 1,
		"recordList": [
			{
				"id": "1472183698151964677",
				"oriCurrency": "1441827152751231007",
				"financeOrg": "1447595628823052296",
				"quickTypeCode": "2",
				"orgCurrencyMoneyDigit": 2,
				"financeOrgName": "leishu公司",
				"orgCurrency": "1441827152751231004",
				"billDate": "2022-06-07 00:00:00",
				"extSystemCode": "AB1234",
				"extVouchCode": "AB1234",
				"srcApp": "~",
				"modifyTime": "2023-01-10 00:00:00",
				"verifyState": 2,
				"bodyItemSettleModeName": "银行转账",
				"bodyItem_taxSubject": "1441827152751231025",
				"bodyItemCustomerName": "我的客户1",
				"bodyItem_funder_name": "",
				"bodyItem_partner_name": "",
				"modifier": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
				"bodyItem_extRowNo": "",
				"bodyItemOrgCurrency": "1441827152751231004",
				"bodyItemLocalTaxIncludedAmount": 15,
				"bodyItemOrg": "1447595628823052296",
				"bodyItemLocalTaxExcludedAmount": 15,
				"bodyItem_oriOccupyAmount": 0,
				"bodyItemExchangeRateTypeDigit": 6,
				"bodyItemOrgCurrencyMoneyDigit": 2,
				"bodyItem_id": "1472183698151964678",
				"bodyItemOriTaxExcludedAmount": 5,
				"bodyItemSettleMode": "1441827152748609670",
				"bodyItemOriCurrency": "1441827152751231007",
				"quickTypeName": "应收款",
				"blnWriteOff": 0,
				"localTaxAmount": 0,
				"taxRate": 0,
				"effectTime": "2022-06-07 14:57:01",
				"billTypeName": "收款退款单",
				"srcSystem": "0",
				"status": "1",
				"billTypeCode": "arRefund",
				"code": "CREF00220607000002",
				"bustypeCode": "ar_refsale",
				"bodyItemOrderNo": "UR-147420221230000001",
				"writeOffState": "0",
				"postStatus": "0",
				"quickType": "1441827161349554192",
				"settleSubmitType": "0",
				"srcAppName": "应收管理",
				"oriTaxAmount": 0,
				"customerBankAccount": "1566568447844810752",
				"funderBankAccount": "",
				"taxSubjectCode": "VAT0",
				"oriCurrencyMoneyDigit": 1,
				"effectState": "1",
				"pubts": "2022-06-07 14:57:01",
				"billType": "2614243574141696",
				"bustypeName": "销售退款",
				"bustype": "1441827144161299178",
				"businessType": "2",
				"taxSubjectName": "0%",
				"bodyItemId": "1472183698151964678",
				"bodyItemExchangeRateDate": "2022-06-07 00:00:00",
				"bodyItemOrgCurrencyName": "人民币",
				"bodyItemExchangeRateType": "0000L2HCW91M32DB8V0000",
				"bodyItemCustomer": "1447680729306628100",
				"bodyItem_partner": "",
				"bodyItem_funder": "",
				"bodyItem_funder_code": "",
				"bodyItemOriCurrencyName": "港元",
				"bodyItemPubts": "2022-06-07 14:52:19",
				"bodyItemObjectType": "1",
				"bodyItemSettleState": "0",
				"bodyItemOrgName": "leishu公司",
				"bodyItemExchangeRateTypeName": "基准汇率",
				"bodyItemOriTaxIncludedAmount": 5,
				"bodyItemExchangeRate": 3,
				"bodyItemOriCurrencyMoneyDigit": 1
			}
		],
		"sumRecordList": [
			{
				"bodyItemLocalTaxIncludedAmount": 15
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	非法token	token过期或者无效，使用有效的token


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

