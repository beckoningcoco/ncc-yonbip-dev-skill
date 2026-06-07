---
title: "应收事务详情查询"
apiId: "2235700163230826501"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "A/R Transaction"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/R Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收事务详情查询

> `ContentType	application/json` 请求方式	GET | 分类: A/R Transaction (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/arPublicEvent/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 事务id |

## 3. 请求示例

Url: /yonbip/EFI/arPublicEvent/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回应收事务信息 |
| accAmount | number |
| 小数位数:2,最大长度:10 | 否 | 本币含税金额 示例：12 |
| accBalance | number |
| 小数位数:2,最大长度:10 | 否 | 本币余额 示例：12 |
| accBook | string | 否 | 账簿id 示例：1950738317425246230 |
| accBookName | string | 否 | 账簿名称 示例：春天 |
| accConvertParam | string | 否 | 账簿币折算参数 示例：1 |
| accCurrency | string | 否 | 账簿币id 示例：1939062405854658600 |
| accCurrencyName | string | 否 | 账簿币名称 示例：人民币 |
| accDate | date |
| 格式:yyyy-MM-dd | 否 | 记账日期 示例：2025-04-09 |
| accPeriod | string | 否 | 会计期间ID 示例：1942708807332265993 |
| accPeriodCod_code | string | 否 | 会计期间 示例：2025-04 |
| accPurpose | string | 否 | 核算目的 示例：accPurpose |
| arapEventType | string | 否 | 收付会计事务 示例：113 |
| balanceState | string | 否 | 清账状态 示例：0 |
| bizBillCode | string | 否 | 业务单据编号 示例：OARar250409018836 |
| bizBillId | string | 否 | 业务单据ID 示例：2241694211081502726 |
| bizBillType | string | 否 | 业务单据类型ID 示例：2614099822008320 |
| bizBillType_name | string | 否 | 业务单据类型名称 示例：应收发票 |
| code | string | 否 | 编码 示例：AR0601250409000003 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间 示例：2025-04-09 11:05:14 |
| creator | string | 否 | 创建人 示例：3a71063c-8317-4e28-9e63-4ec5b7be7500 |
| creator_userName | string | 否 | 创建人名称 示例：小明 |
| customer | string | 否 | 客户 示例：1942715258373144582 |
| entry | string | 否 | 事项分录 示例：~ |
| entryCode | string | 否 | 事项分录编码 示例：~ |
| eventType | string | 否 | 会计事务 示例：2738391568884992 |
| eventType_name | string | 否 | 会计事务名称 示例：确认应收 |
| financeOrg | string | 否 | 会计主体 示例：1994100564922728450 |
| financeOrg_name | string | 否 | 会计主体名称 示例：KKK集团 |
| gblAmount | number |
| 小数位数:2,最大长度:10 | 否 | 全局币金额 示例：96 |
| gblBalance | number |
| 小数位数:2,最大长度:10 | 否 | 全局币余额 示例：96 |
| gblConvertParam | string | 否 | 全局币折算参数 示例：3 |
| gblCurrency | string | 否 | 全局币id 示例：1939062405854658612 |
| grpAmount | number |
| 小数位数:2,最大长度:10 | 否 | 集团币金额 示例：12 |
| grpBalance | number |
| 小数位数:2,最大长度:10 | 否 | 集团币余额 示例：12 |
| grpConvertParam | string | 否 | 集团币折算参数 示例：3 |
| grpCurrency | string | 否 | 集团币种 示例：1939062405854658600 |
| id | string | 否 | id 示例：2241697312049725452 |
| objectType | string | 否 | 往来对象类型 示例：1 |
| org | string | 否 | 业务组织 示例：1994100564922728450 |
| orgAmount | number |
| 小数位数:2,最大长度:10 | 否 | 组织币金额 示例：12 |
| orgBalance | number |
| 小数位数:2,最大长度:10 | 否 | 组织币余额 示例：12 |
| orgConvertParam | string | 否 | 组织币折算参数 示例：1 |
| orgCurrency | string | 否 | 组织币 示例：1939062405854658600 |
| orgName | string | 否 | 组织名称 示例：KKK集团 |
| oriAmount | number |
| 小数位数:2,最大长度:10 | 否 | 金额 示例：12 |
| oriBalance | number |
| 小数位数:2,最大长度:10 | 否 | 余额 示例：12 |
| oriCurrency | string | 否 | 原币 示例：1939062405854658600 |
| oriOcupyAmount | number |
| 小数位数:2,最大长度:10 | 否 | 预占用金额 示例：0 |
| postState | string | 否 | 过账状态 示例：4 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 时间 示例：2025-04-09 11:05:14 |
| srcApp | string | 否 | 来源应用列表 示例：95 |
| srcApp_name | string | 否 | 来源应用列表名称 示例：应收管理 |
| srcBillCode | string | 否 | 来源单据编号 示例：OARar250409018836 |
| srcBillDate | date |
| 格式:yyyy-MM-dd | 否 | 来源单据日期 示例：2025-04-09 |
| srcBillType | string | 否 | 业务事项 示例：2614099822008320 |
| srcBillTypeCode | string | 否 | 业务事项编码 示例：receivable |
| srcBillTypeName | string | 否 | 业务事项名称 示例：应收发票 |
| srcSystem | string | 否 | 来源系统 示例：0 |
| status | string | 否 | 事务状态 示例：1 |
| voucherCode | string | 否 | 凭证号 示例：~ |
| voucherType | string | 否 | 凭证类型 示例：~ |
| writeOffState | string | 否 | 冲销状态 示例：0 |
| bodyItem | object | 否 | 表体信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accAmount": 12,
		"accBalance": 12,
		"accBook": "1950738317425246230",
		"accBookName": "春天",
		"accConvertParam": "1",
		"accCurrency": "1939062405854658600",
		"accCurrencyName": "人民币",
		"accDate": "2025-04-09",
		"accPeriod": "1942708807332265993",
		"accPeriodCod_code": "2025-04",
		"accPurpose": "accPurpose",
		"arapEventType": "113",
		"balanceState": "0",
		"bizBillCode": "OARar250409018836",
		"bizBillId": "2241694211081502726",
		"bizBillType": "2614099822008320",
		"bizBillType_name": "应收发票",
		"code": "AR0601250409000003",
		"createTime": "2025-04-09 11:05:14",
		"creator": "3a71063c-8317-4e28-9e63-4ec5b7be7500",
		"creator_userName": "小明",
		"customer": "1942715258373144582",
		"entry": "~",
		"entryCode": "~",
		"eventType": "2738391568884992",
		"eventType_name": "确认应收",
		"financeOrg": "1994100564922728450",
		"financeOrg_name": "KKK集团",
		"gblAmount": 96,
		"gblBalance": 96,
		"gblConvertParam": "3",
		"gblCurrency": "1939062405854658612",
		"grpAmount": 12,
		"grpBalance": 12,
		"grpConvertParam": "3",
		"grpCurrency": "1939062405854658600",
		"id": "2241697312049725452",
		"objectType": "1",
		"org": "1994100564922728450",
		"orgAmount": 12,
		"orgBalance": 12,
		"orgConvertParam": "1",
		"orgCurrency": "1939062405854658600",
		"orgName": "KKK集团",
		"oriAmount": 12,
		"oriBalance": 12,
		"oriCurrency": "1939062405854658600",
		"oriOcupyAmount": 0,
		"postState": "4",
		"pubts": "2025-04-09 11:05:14",
		"srcApp": "95",
		"srcApp_name": "应收管理",
		"srcBillCode": "OARar250409018836",
		"srcBillDate": "2025-04-09",
		"srcBillType": "2614099822008320",
		"srcBillTypeCode": "receivable",
		"srcBillTypeName": "应收发票",
		"srcSystem": "0",
		"status": "1",
		"voucherCode": "~",
		"voucherType": "~",
		"writeOffState": "0",
		"bodyItem": {
			"accBalance": 12,
			"accExchangeRate": 1,
			"accExchangeRateType": "0000LT2ON7R546TLHP0000",
			"accTaxAmount": 0,
			"accTaxExcludedAmount": 12,
			"accTaxIncludedAmount": 12,
			"bodyItemOriBalance": 12,
			"event": "2241697312049725452",
			"exchangeRateDate": "2025-04-09",
			"gblBalance": 96,
			"gblExchangeRate": 8,
			"gblExchangeRateType": "1941105367177494534",
			"gblTaxAmount": 0,
			"gblTaxExcludedAmount": 96,
			"gblTaxIncludedAmount": 96,
			"grpBalance": 12,
			"grpExchangeRate": 1,
			"grpExchangeRateType": "0000LT2ON7R546TLHP0000",
			"orgTaxAmount": 0,
			"orgTaxExcludedAmount": 12,
			"orgTaxIncludedAmount": 12,
			"oriCurrency": "1939062405854658600",
			"oriOcupyAmount": 0,
			"oriTaxAmount": 0,
			"oriTaxExcludedAmount": 12,
			"oriTaxIncludedAmount": 12,
			"pubts": "2025-04-09 11:05:14",
			"srcBillId": "2241694211081502726",
			"srcBillNo": "OARar250409018836",
			"srcBillRowId": "2241694211081502727",
			"srcBillType": "2614099822008320",
			"srcBillType_name": "应收发票",
			"taxRate": 0,
			"taxSubject": "10002",
			"taxSubjectCode": "VATZR",
			"taxSubjectName": "0%增值税税率",
			"grandsonItem": {
				"accAmount": 12,
				"accBalance": 12,
				"amountDirection": "1",
				"arSubjectVid": "2023671431936606222",
				"balanceState": "0",
				"blnDeposit": false,
				"blnHangUp": false,
				"blnPrepare": false,
				"body": "2241697312049725448",
				"convertWay": "0",
				"expireDate": "2025-04-09",
				"gblAmount": 96,
				"gblBalance": 96,
				"grpAmount": 12,
				"grpBalance": 12,
				"id": "2241697312049725450",
				"issueNo": 1,
				"orgAmount": 12,
				"orgBalance": 12,
				"oriAmount": 12,
				"oriBalance": 12,
				"oriOcupyAmount": 0,
				"pubts": "2025-04-09 11:05:14",
				"quickType": "1939062405859377474",
				"quickType_name": "应收款",
				"ratio": 100,
				"startDate": "2025-04-09"
			}
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	查询失败


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

