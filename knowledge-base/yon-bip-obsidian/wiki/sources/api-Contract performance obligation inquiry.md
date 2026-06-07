---
title: "发包履约义务查询"
apiId: "2382833819958902792"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contracting Performance Obligation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contracting Performance Obligation]
platform_version: "BIP"
source_type: community-api-docs
---

# 发包履约义务查询

> `ContentType	application/json` 请求方式	POST | 分类: Contracting Performance Obligation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/EFI/RVN/rclEmployPerformanceObligation/fiercl/employperformanceobligation/query

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 入参 |
| accentity | string | 否 | 否 | 会计主体id 示例：1607417838875705352 |
| accentity_code | string | 否 | 是 | 会计主体code 示例：1208 |
| bustype | string | 否 | 否 | 交易类型id 示例：1607403021234340397 |
| bustype_code | string | 否 | 否 | 交易类型code 示例：rcl_businessct |
| code | string | 否 | 否 | 单据编号 示例：RECON20230104006893 |
| name | string | 否 | 否 | 名称 示例：openApi测试 |
| billDate_begin | string | 否 | 否 | 单据日期起 示例：2023-01-04 |
| billDate_end | string | 否 | 否 | 单据日期止 示例：2023-01-04 |
| signDate_begin | string | 否 | 否 | 签订日期起 示例：2023-01-04 |
| signDate_end | string | 否 | 否 | 签订日期止 示例：2023-01-04 |
| effectDate_begin | string | 否 | 否 | 生效日期起 示例：2023-01-05 |
| effectDate_end | string | 否 | 否 | 生效日期止 示例：2023-01-05 |
| endDate_begin | string | 否 | 否 | 终止日期起 示例：2023-01-06 |
| endDate_end | string | 否 | 否 | 终止日期止 示例：2023-01-06 |
| supplierId | string | 否 | 否 | 客户id 示例：1607427184715628553 |
| supplierCode | string | 否 | 否 | 客户code 示例：yl-kh |
| deptId | string | 否 | 否 | 部门id 示例：1614623273556901896 |
| deptCode | string | 否 | 否 | 部门code 示例：bu1 |
| employee | string | 否 | 否 | 人员id 示例：1610101678025474057 |
| employee_code | string | 否 | 否 | 人员code 示例：00000001 |
| verifyState | short | 否 | 否 | 单据状态(0-自由态,1-审批态,2-审批通过,3-审批不通过,4-自由态,5-生效态,6-冻结,7-终止) 示例：0 |
| srcBillCode | string | 否 | 否 | 来源单据编号 示例：202301041112 |
| srcSystem | string | 否 | 否 | 单据来源系统 示例：收入合同台账 |
| project_code | string | 否 | 否 | 项目编码 示例：00000001 |
| signOrgId | string | 否 | 否 | 签约组织id 示例：1614623273556901896 |
| signOrgCode | string | 否 | 否 | 签约组织code 示例：1208 |
| blnOpenContract | short | 否 | 否 | 是否敞口(1--是;0--否) 示例：0 |
| creator | string | 否 | 否 | 制单人 示例：e73dba5f-bb3a-4e36-8c64-9efc3a1d6012 |
| createTime_begin | DateTime | 否 | 否 | 制单日期起 示例：2023-01-04 19:46:54 |
| createTime_end | DateTime | 否 | 否 | 制单日期止 示例：2023-01-04 19:46:54 |
| modifier | string | 否 | 否 | 修改人 示例：e73dba5f-bb3a-4e36-8c64-9efc3a1d6012 |
| modifyTime_begin | DateTime | 否 | 否 | 修改日期起 示例：2023-01-04 19:46:54 |
| modifyTime_end | DateTime | 否 | 否 | 修改日期止 示例：2023-01-04 19:46:54 |
| auditor | string | 否 | 否 | 审批人 示例：e73dba5f-bb3a-4e36-8c64-9efc3a1d6012 |
| auditTime_begin | DateTime | 否 | 否 | 审批时间起 示例：2023-01-04 19:46:54 |
| auditTime_end | DateTime | 否 | 否 | 审批时间止 示例：2023-01-04 19:46:54 |
| bln_start_flag | short | 否 | 否 | 是否期初(1--是;0--否) 示例：0 |
| simpleVOs | object | 是 | 否 | 简单查询条件 |

## 3. 请求示例

Url: /yonbip/FCC/EFI/RVN/rclEmployPerformanceObligation/fiercl/employperformanceobligation/query?access_token=访问令牌
Body: {
	"data": {
		"accentity": "1607417838875705352",
		"accentity_code": "1208",
		"bustype": "1607403021234340397",
		"bustype_code": "rcl_businessct",
		"code": "RECON20230104006893",
		"name": "openApi测试",
		"billDate_begin": "2023-01-04",
		"billDate_end": "2023-01-04",
		"signDate_begin": "2023-01-04",
		"signDate_end": "2023-01-04",
		"effectDate_begin": "2023-01-05",
		"effectDate_end": "2023-01-05",
		"endDate_begin": "2023-01-06",
		"endDate_end": "2023-01-06",
		"supplierId": "1607427184715628553",
		"supplierCode": "yl-kh",
		"deptId": "1614623273556901896",
		"deptCode": "bu1",
		"employee": "1610101678025474057",
		"employee_code": "00000001",
		"verifyState": 0,
		"srcBillCode": "202301041112",
		"srcSystem": "收入合同台账",
		"project_code": "00000001",
		"signOrgId": "1614623273556901896",
		"signOrgCode": "1208",
		"blnOpenContract": 0,
		"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
		"createTime_begin": "2023-01-04 19:46:54",
		"createTime_end": "2023-01-04 19:46:54",
		"modifier": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
		"modifyTime_begin": "2023-01-04 19:46:54",
		"modifyTime_end": "2023-01-04 19:46:54",
		"auditor": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
		"auditTime_begin": "2023-01-04 19:46:54",
		"auditTime_end": "2023-01-04 19:46:54",
		"bln_start_flag": 0,
		"simpleVOs": [
			{
				"field": "pubts",
				"op": "eq",
				"value": "2021-07-01 00:00:00"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | data |
| total | int | 否 | 总数 示例：100 |
| pageNum | int | 否 | 页码 示例：1 |
| pageSize | int | 否 | 条数 示例：10 |
| revenueContractBaseList | object | 是 | 履约义务数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"total": 100,
		"pageNum": 1,
		"pageSize": 10,
		"revenueContractBaseList": [
			{
				"endDate": "2023-01-06",
				"contractType": "1607403021234340397",
				"signDate": "2023-01-04",
				"employee": "1610101678025474057",
				"accentity": "1607417838875705352",
				"dr": 0,
				"exchangeRate": 1,
				"id": "1628821215692455937",
				"signOrgId": "1614623273556901896",
				"oriAmount": 1130,
				"deptId": "1614623273556901896",
				"accentityCode": "XMHS001",
				"billDate": "2023-01-04",
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"version": 1,
				"blnOpenContract": false,
				"name": "openApi测试1",
				"localmnyTax": 130,
				"accentityName": "项目核算管理",
				"localmny": 1130,
				"projectId": "1607837087783976969",
				"srcSystem": "履约义务",
				"code": "RECON20230104006869",
				"currType": "1607403072771850274",
				"orimnyNotax": 1000,
				"orimnyTax": 130,
				"originId": "1628821215692455937",
				"blnLatest": true,
				"customerId": 1607427184715628553,
				"srcBillCode": "202301041112",
				"currTypeCode": "CNY",
				"pubts": "2023-01-04 16:09:06",
				"effectDate": "2023-01-05",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"taxExcludedAmount": 1000,
				"blnStartFlag": false,
				"customerCode": "xmhs-cust",
				"currTypeName": "人民币",
				"exchangeRateType": "0000LBC4W3H13EZ4LE0000",
				"exchangeRateDate": "2023-01-04",
				"createTime": "2023-01-04 16:09:06",
				"rclContractBaseInfoBaseList": [
					{
						"expenseItemId": 1608642033386258437,
						"endDate": "2023-01-31",
						"localmny": 1130,
						"incomeConfirmRule1": 1593241680834199559,
						"memo": "备注",
						"receiveAgreementId": 1608684398959394817,
						"dr": 0,
						"exchangeRate": 1,
						"id": "1628821215692455942",
						"tradeConfirmRule1": 1593247564945686529,
						"taxIncludedPrice": 113,
						"ytenantId": "0000LBC4W3H13EZ4LE0000",
						"materialId": 1607839252471611399,
						"taxRate": 13,
						"localUnitpriceNotax": 100,
						"localmnyTax": 130,
						"rowNo": 1,
						"exchangeRatetype": "0000LBC4W3H13EZ4LE0000",
						"materialTypeId": 1607432476115337218,
						"oriTaxExcludedAmount": 1000,
						"rclRevenuecontractBaseId": "1628821215692455937",
						"orimnyTax": 130,
						"costCenterId": 1609384650402693123,
						"unitId": 1607434176922386433,
						"currency": "1607403072771850274",
						"pubts": "2023-01-04 16:09:06",
						"orimny": 1130,
						"procenterId": "1607417838875705352",
						"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
						"quantity": 10,
						"oriTaxIncludedPrice": 113,
						"taxExcludedAmount": 1000,
						"oppProcenterId": "1607417838875705352",
						"beginDate": "2023-01-04",
						"exchangeRateDate": "2023-01-04",
						"oriTaxExcludedPrice": 100,
						"createTime": "2023-01-04 16:09:06",
						"matchCode": "654321",
						"relMatchCode": "123456",
						"relRevenuecontractId": "1812104091632926723",
						"relRevenuecontractBodyId": "1812104091632926726",
						"expenseItemCode": "FYXMCO001",
						"expenseItemName": "差旅费用",
						"incomeConfirmRule1Code": "REV001",
						"incomeConfirmRule1Name": "结算确认收入",
						"tradeConfirmRule1Code": "REC001",
						"tradeConfirmRule1Name": "应收确认收入",
						"beginApportionPeriod": "1885016594005826",
						"beginApportionPeriodCode": "2025-01"
					}
				],
				"customerName": "中智财务",
				"contractTypeName": "rcl_common",
				"contractTypeCode": "rcl_common"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	合同不存在


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

