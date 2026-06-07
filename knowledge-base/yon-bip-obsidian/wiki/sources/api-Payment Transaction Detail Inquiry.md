---
title: "付款事务详情查询"
apiId: "2242394771695861762"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payment Transaction"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款事务详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Payment Transaction (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/paymentEvent/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 付款事务id    示例: 2215941930772332546 |

## 3. 请求示例

Url: /yonbip/EFI/paymentEvent/detail?access_token=访问令牌&id=2215941930772332546

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回付款事务数据 |
| oriCurrency | string | 否 | 原币id 示例：1858241326195673598 |
| accConvertParam | string | 否 | 账簿币折算参数 示例：1 |
| financeOrg | string | 否 | 会计主体id 示例：1858746165258878983 |
| settleState | string | 否 | 结算状态 示例：0 |
| oriOcupyAmount | number |
| 小数位数:0,最大长度:10 | 否 | 预占用金额 示例：0 |
| objectType | string | 否 | 往来对象类型 示例：0 |
| accAmount | number |
| 小数位数:0,最大长度:10 | 否 | 本币金额 示例：-9 |
| gblBalance | number |
| 小数位数:0,最大长度:10 | 否 | 全局币余额 示例：0 |
| supplier | string | 否 | 供应商id 示例：1860575829912715267 |
| srcBillDate | date |
| 格式:yyyy-MM-dd | 否 | 来源单据日期 示例：2025-03-05 |
| accCurrency | string | 否 | 账簿本币id 示例：1858241326195673598 |
| entryCode | string | 否 | 事项分录编码 示例：SF2025030500000059 |
| id | string | 否 | id 示例：2215941930772332546 |
| oriAmount | number |
| 小数位数:0,最大长度:10 | 否 | 金额 示例：-9 |
| bodyItem | object | 是 | 子表信息 |
| eventType | string | 否 | 会计事务 示例：2738997478580992 |
| srcApp | string | 否 | 来源应用 示例：94 |
| srcBillType | string | 否 | 业务事项id 示例：2614250133869056 |
| accPurpose | string | 否 | 核算目的 示例：1858834014501601582 |
| orgBalance | number |
| 小数位数:0,最大长度:10 | 否 | 组织币余额 示例：0 |
| entry | string | 否 | 事项分录 示例：2215941947966619658 |
| accBook | string | 否 | 账簿id 示例：1860559131066761230 |
| auditTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 审批日期 示例：2025-03-05 18:13:11 |
| grpAmount | number |
| 小数位数:0,最大长度:10 | 否 | 集团币金额 示例：0 |
| oriBalance | number |
| 小数位数:0,最大长度:10 | 否 | 余额 示例：0 |
| srcSystem | string | 否 | 来源系统 示例：1 |
| bizBillType | string | 否 | 业务单据类型ID 示例：2614250133869056 |
| grpBalance | number |
| 小数位数:0,最大长度:10 | 否 | 集团币余额 示例：0 |
| status | string | 否 | 事务状态 示例：1 |
| blnEffect | string | 否 | 生效状态 示例：1 |
| code | string | 否 | code 示例：AP08250305000001 |
| gblAmount | number |
| 小数位数:0,最大长度:10 | 否 | 全局币金额 示例：0 |
| srcBillCode | string | 否 | 来源单据编号 示例：SREFap250305000474 |
| creator | string | 否 | 创建人 示例：3a71063c-8317-4e28-9e63-4ec5b7be7500 |
| bizBillCode | string | 否 | 业务单据编号 示例：SREFap250305000474 |
| org | string | 否 | 业务组织 示例：1858746165258878983 |
| voucherType | string | 否 | 凭证类型 示例：1858921528745787596 |
| accPeriod_code | string | 否 | 会计期间 示例：2025-03 |
| arapEventType | string | 否 | 收付会计事务 示例：327 |
| postState | string | 否 | 过账状态 示例：2 |
| auditor | string | 否 | 审批人 示例：3a71063c-8317-4e28-9e63-4ec5b7be7500 |
| oriRefundAmount | number |
| 小数位数:0,最大长度:10 | 否 | 已退款金额 示例：0 |
| balanceState | string | 否 | 清账状态 示例：1 |
| orgAmount | number |
| 小数位数:0,最大长度:10 | 否 | 组织币金额 示例：0 |
| accDate | string | 否 | 记账日期 示例：2025-03-05 |
| accPeriod | string | 否 | 会计期间ID 示例：1858853668281909256 |
| partner | string | 否 | 业务伙伴id 示例：1862709466585628679 |
| createTime | string | 否 | 创建时间 示例：2025-03-05 18:13:13 |
| accBalance | number |
| 小数位数:0,最大长度:10 | 否 | 本币余额 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"oriCurrency": "1858241326195673598",
		"accConvertParam": "1",
		"financeOrg": "1858746165258878983",
		"settleState": "0",
		"oriOcupyAmount": 0,
		"objectType": "0",
		"accAmount": -9,
		"gblBalance": 0,
		"supplier": "1860575829912715267",
		"srcBillDate": "2025-03-05",
		"accCurrency": "1858241326195673598",
		"entryCode": "SF2025030500000059",
		"id": "2215941930772332546",
		"oriAmount": -9,
		"bodyItem": [
			{
				"oriCurrency": "1858241326195673598",
				"settleState": "0",
				"oriOcupyAmount": 0,
				"srcBillNo": "SREFap250305000474",
				"settleSubject": "1858946662894403595",
				"gblBalance": 0,
				"gblArapAmount": 0,
				"id": "2215941930772332547",
				"oriArapAmount": -9,
				"srcBillId": "2215941862048399362",
				"oriWhtaxAmount": 0,
				"accWhtaxAmount": 0,
				"orgArapAmount": 0,
				"apSubject": "1858946662894403676",
				"apSubjectVid": "1858946662894403676",
				"srcBillType": "2614250133869056",
				"settleSubjectVid": "1858946662894403595",
				"orgBalance": 0,
				"grpWhtaxAmount": 0,
				"blnHangUp": false,
				"orgTaxIncludedAmount": 0,
				"verifyAmount": 0,
				"oriBalance": 0,
				"grpBalance": 0,
				"orgWhtaxAmount": 0,
				"gblWhtaxAmount": 0,
				"grpTaxIncludedAmount": 0,
				"quickType": "1858834014501601599",
				"accExchangeRate": 1,
				"gblAmount": 0,
				"digest": "327",
				"expireDate": "2025-03-05",
				"event": "2215941930772332546",
				"accExchangeRateType": "0000LOR2VZS09YN0G10000",
				"srcBillRowId": "2215941862048399363",
				"gblTaxIncludedAmount": 0,
				"oriRefundAmount": 0,
				"accArapAmount": -9,
				"balanceState": "1",
				"supplierBankAccount": "1860575829912715269",
				"orgAmount": 0,
				"exchangeRateDate": "2025-03-05",
				"grpArapAmount": 0,
				"accBalance": 0,
				"objectBankAccountNo": "2000",
				"localBalanceState": "1"
			}
		],
		"eventType": "2738997478580992",
		"srcApp": "94",
		"srcBillType": "2614250133869056",
		"accPurpose": "1858834014501601582",
		"orgBalance": 0,
		"entry": "2215941947966619658",
		"accBook": "1860559131066761230",
		"auditTime": "2025-03-05 18:13:11",
		"grpAmount": 0,
		"oriBalance": 0,
		"srcSystem": "1",
		"bizBillType": "2614250133869056",
		"grpBalance": 0,
		"status": "1",
		"blnEffect": "1",
		"code": "AP08250305000001",
		"gblAmount": 0,
		"srcBillCode": "SREFap250305000474",
		"creator": "3a71063c-8317-4e28-9e63-4ec5b7be7500",
		"bizBillCode": "SREFap250305000474",
		"org": "1858746165258878983",
		"voucherType": "1858921528745787596",
		"accPeriod_code": "2025-03",
		"arapEventType": "327",
		"postState": "2",
		"auditor": "3a71063c-8317-4e28-9e63-4ec5b7be7500",
		"oriRefundAmount": 0,
		"balanceState": "1",
		"orgAmount": 0,
		"accDate": "2025-03-05",
		"accPeriod": "1858853668281909256",
		"partner": "1862709466585628679",
		"createTime": "2025-03-05 18:13:13",
		"accBalance": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求数据是否正确


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

