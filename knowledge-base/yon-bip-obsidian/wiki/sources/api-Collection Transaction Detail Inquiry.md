---
title: "收款事务详情查询"
apiId: "2242401755312685065"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Collection Transaction"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款事务详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Collection Transaction (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/collectionPublicEvent/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 收款事务id    示例: 2235231779951476739 |

## 3. 请求示例

Url: /yonbip/EFI/collectionPublicEvent/detail?access_token=访问令牌&id=2235231779951476739

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回收款事务数据 |
| oriCurrency | string | 否 | 原币id 示例：1858241326195673598 |
| accConvertParam | string | 否 | 账簿币折算参数 示例：1 |
| financeOrg | string | 否 | 会计主体id 示例：1858746165258878983 |
| settleState | string | 否 | 结算状态 示例：0 |
| objectType | string | 否 | 往来对象类型 示例：1 |
| accAmount | number |
| 小数位数:0,最大长度:10 | 否 | 本币金额 示例：200 |
| oriCurrency_name | string | 否 | 原币名称 示例：人民币 |
| gblBalance | number |
| 小数位数:0,最大长度:10 | 否 | 全局币余额 示例：0 |
| srcBillDate | string | 否 | 来源单据日期 示例：2025-03-31 |
| accCurrency | string | 否 | 账簿币id 示例：1858241326195673598 |
| orgCurrency | string | 否 | 组织币id 示例：1858241326195673598 |
| entryCode | string | 否 | 事项分录编号 示例：SF2025033100000002 |
| eventType_name | string | 否 | 会计事务名称 示例：收款 |
| id | string | 否 | id 示例：2235231779951476739 |
| oriAmount | number |
| 小数位数:0,最大长度:10 | 否 | 金额 示例：200 |
| bodyItem | object | 是 | 表体数据 |
| eventType | string | 否 | 会计事务 示例：1436619015316307969 |
| srcApp | string | 否 | 来源应用列表 示例：95 |
| srcBillType | string | 否 | 业务事项 示例：2614241203376640 |
| accPurpose | string | 否 | 核算目的 示例：1858834014501601582 |
| entry | string | 否 | 事项分录 示例：2235231831491346437 |
| orgBalance | number |
| 小数位数:0,最大长度:10 | 否 | 组织币余额 示例：0 |
| accBook | string | 否 | 财务账簿id 示例：1860559131066761230 |
| auditTime | string | 否 | 审批日期 示例：2025-03-31 18:00:24 |
| grpAmount | number |
| 小数位数:0,最大长度:10 | 否 | 集团币金额 示例：0 |
| oriBalance | number |
| 小数位数:0,最大长度:10 | 否 | 余额 示例：0 |
| srcSystem | string | 否 | 来源系统 示例：0 |
| bizBillType | string | 否 | 业务单据类型ID 示例：2614241203376640 |
| grpBalance | number |
| 小数位数:0,最大长度:10 | 否 | 集团币余额 示例：0 |
| status | string | 否 | 事务状态 示例：1 |
| code | string | 否 | 编码 示例：AR07250331000001 |
| bizBillType_name | string | 否 | 业务单据类型名称 示例：收款单 |
| accPeriodCode | string | 否 | 会计期间 示例：2025-03 |
| gblAmount | number |
| 小数位数:0,最大长度:10 | 否 | 全局币金额 示例：0 |
| srcBillCode | string | 否 | 来源单据编号 示例：RECar250331012259 |
| creator | string | 否 | 创建人 示例：85e2cdaa-9f61-4606-b1ff-566eb8367340 |
| voucherType | string | 否 | 凭证类型 示例：1858921528745787596 |
| bizBillCode | string | 否 | 业务单据编号 示例：RECar250331012259 |
| org | string | 否 | 业务组织 示例：1858746165258878983 |
| arapEventType | string | 否 | 收付会计事务 示例：126 |
| postState | string | 否 | 过账状态 示例：2 |
| auditor | string | 否 | 审批人 示例：85e2cdaa-9f61-4606-b1ff-566eb8367340 |
| balanceState | string | 否 | 清账状态 示例：1 |
| orgAmount | number |
| 小数位数:0,最大长度:10 | 否 | 组织币金额 示例：0 |
| accDate | string | 否 | 记账日期 示例：2025-03-31 |
| accPeriod | string | 否 | 会计期间ID 示例：1858853668281909256 |
| partner | string | 否 | 业务伙伴id 示例：1862709329146675200 |
| createTime | string | 否 | 创建时间 示例：2025-03-31 18:00:27 |
| accBalance | number |
| 小数位数:0,最大长度:10 | 否 | 本币余额 示例：0 |
| customer_name | string | 否 | 客户名称 示例：收付客户01 |
| customer | string | 否 | 客户id 示例：1860569739624448007 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"oriCurrency": "1858241326195673598",
		"accConvertParam": "1",
		"financeOrg": "1858746165258878983",
		"settleState": "0",
		"objectType": "1",
		"accAmount": 200,
		"oriCurrency_name": "人民币",
		"gblBalance": 0,
		"srcBillDate": "2025-03-31",
		"accCurrency": "1858241326195673598",
		"orgCurrency": "1858241326195673598",
		"entryCode": "SF2025033100000002",
		"eventType_name": "收款",
		"id": "2235231779951476739",
		"oriAmount": 200,
		"bodyItem": [
			{
				"orgExchangeRateType": "0000LOR2VZS09YN0G10000",
				"oriCurrency": "1858241326195673598",
				"settleState": "0",
				"orgExchangeRate": 1,
				"oriOcupyAmount": 0,
				"arSubjectVid": "1858946662894403601",
				"accAmount": 200,
				"gblBalance": 0,
				"id": "2235231779951476740",
				"srcBillId": "2235231702637084677",
				"customerBankAccount": "1860569739624448008",
				"oriAmount": 200,
				"blnBaddebtGain": false,
				"oriBillRowId": "2235230156453838858",
				"settleSubjectVid": "1858946662894403595",
				"orgBalance": 0,
				"amountDirection": "-1",
				"blnHangUp": false,
				"grpAmount": 0,
				"verifyAmount": 200,
				"oriBalance": 0,
				"grpBalance": 0,
				"verifyCurrency": "1858241326195673598",
				"issueNo": 1,
				"quickType": "1858834014501601597",
				"accExchangeRate": 1,
				"costSubjectVid": "1858946662894403863",
				"gblAmount": 0,
				"expireDate": "9999-12-31",
				"event": "2235231779951476739",
				"accExchangeRateType": "0000LOR2VZS09YN0G10000",
				"srcBillRowId": "2235231702637084678",
				"balanceState": "1",
				"orgAmount": 0,
				"exchangeRateDate": "2025-03-31",
				"accBalance": 0,
				"objectBankAccountNo": "1000"
			}
		],
		"eventType": "1436619015316307969",
		"srcApp": "95",
		"srcBillType": "2614241203376640",
		"accPurpose": "1858834014501601582",
		"entry": "2235231831491346437",
		"orgBalance": 0,
		"accBook": "1860559131066761230",
		"auditTime": "2025-03-31 18:00:24",
		"grpAmount": 0,
		"oriBalance": 0,
		"srcSystem": "0",
		"bizBillType": "2614241203376640",
		"grpBalance": 0,
		"status": "1",
		"code": "AR07250331000001",
		"bizBillType_name": "收款单",
		"accPeriodCode": "2025-03",
		"gblAmount": 0,
		"srcBillCode": "RECar250331012259",
		"creator": "85e2cdaa-9f61-4606-b1ff-566eb8367340",
		"voucherType": "1858921528745787596",
		"bizBillCode": "RECar250331012259",
		"org": "1858746165258878983",
		"arapEventType": "126",
		"postState": "2",
		"auditor": "85e2cdaa-9f61-4606-b1ff-566eb8367340",
		"balanceState": "1",
		"orgAmount": 0,
		"accDate": "2025-03-31",
		"accPeriod": "1858853668281909256",
		"partner": "1862709329146675200",
		"createTime": "2025-03-31 18:00:27",
		"accBalance": 0,
		"customer_name": "收付客户01",
		"customer": "1860569739624448007"
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

