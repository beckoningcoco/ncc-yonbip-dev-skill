---
title: "履约义务查询"
apiId: "1567881780132315137"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fulfillment Obligation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fulfillment Obligation]
platform_version: "BIP"
source_type: community-api-docs
---

# 履约义务查询

> `ContentType	application/json` 请求方式	POST | 分类: Fulfillment Obligation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/fiercl/revenuecontract/query

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
| accentity_code | string | 否 | 否 | 会计主体code【必输项】 示例：1208 |
| contractType | string | 否 | 否 | 交易类型id 示例：1607403021234340397 |
| contractType_code | string | 否 | 否 | 交易类型code 示例：rcl_businessct |
| code | string | 否 | 否 | 单据编号 示例：RECON20230104006893 |
| name | string | 否 | 否 | 名称 示例：openApi测试 |
| parentId | string | 否 | 否 | 上级履约义务id 示例：1608763245959577608 |
| parentCode | string | 否 | 否 | 上级履约义务code 示例：RECON20230211020232 |
| billDate_begin | string | 否 | 否 | 单据日期起 示例：2023-01-04 |
| billDate_end | string | 否 | 否 | 单据日期止 示例：2023-01-04 |
| signDate_begin | string | 否 | 否 | 签订日期起 示例：2023-01-04 |
| signDate_end | string | 否 | 否 | 签订日期止 示例：2023-01-04 |
| effectDate_begin | string | 否 | 否 | 生效日期起 示例：2023-01-05 |
| effectDate_end | string | 否 | 否 | 生效日期止 示例：2023-01-05 |
| endDate_begin | string | 否 | 否 | 终止日期起 示例：2023-01-06 |
| endDate_end | string | 否 | 否 | 终止日期止 示例：2023-01-06 |
| thirdPartId | string | 否 | 否 | 第三方主体id 示例：1609385809968365574 |
| thirdPartCode | string | 否 | 否 | 第三方主体code 示例：0001000001 |
| customerId | string | 否 | 否 | 客户id 示例：1607427184715628553 |
| customerCode | string | 否 | 否 | 客户code 示例：yl-kh |
| deptId | string | 否 | 否 | 部门id 示例：1614623273556901896 |
| deptCode | string | 否 | 否 | 部门code 示例：bu1 |
| employee | string | 否 | 否 | 人员id 示例：1610101678025474057 |
| employee_code | string | 否 | 否 | 人员code 示例：00000001 |
| verifyState | short | 否 | 否 | 单据状态(0-自由态,1-审批态,2-审批通过,3-审批不通过,4-自由态,5-生效态,6-冻结,7-终止) 示例：0 |
| srcBillCode | string | 否 | 否 | 来源单据编号 示例：202301041112 |
| srcSystem | string | 否 | 否 | 单据来源系统 示例：收入合同台账 |
| contractCode | string | 否 | 否 | 合同号 示例：202301061507 |
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

Url: /yonbip/AMP/fiercl/revenuecontract/query?access_token=访问令牌
Body: {
	"data": {
		"accentity": "1607417838875705352",
		"accentity_code": "1208",
		"contractType": "1607403021234340397",
		"contractType_code": "rcl_businessct",
		"code": "RECON20230104006893",
		"name": "openApi测试",
		"parentId": "1608763245959577608",
		"parentCode": "RECON20230211020232",
		"billDate_begin": "2023-01-04",
		"billDate_end": "2023-01-04",
		"signDate_begin": "2023-01-04",
		"signDate_end": "2023-01-04",
		"effectDate_begin": "2023-01-05",
		"effectDate_end": "2023-01-05",
		"endDate_begin": "2023-01-06",
		"endDate_end": "2023-01-06",
		"thirdPartId": "1609385809968365574",
		"thirdPartCode": "0001000001",
		"customerId": "1607427184715628553",
		"customerCode": "yl-kh",
		"deptId": "1614623273556901896",
		"deptCode": "bu1",
		"employee": "1610101678025474057",
		"employee_code": "00000001",
		"verifyState": 0,
		"srcBillCode": "202301041112",
		"srcSystem": "收入合同台账",
		"contractCode": "202301061507",
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
				"parentId": "1608763245959577608",
				"exchangeRateType": "0000LBC4W3H13EZ4LE0000",
				"exchangeRateDate": "2023-01-04",
				"createTime": "2023-01-04 16:09:06",
				"thirdPartId": 1609385809968365574,
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
						"financeCompFlag": NaN,
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
						"beginApportionPeriodCode": "2025-01",
						"materialCode": "",
						"materialName": "",
						"materialTypeCode": "",
						"materialTypeName": "",
						"projectId": "",
						"productCode": "",
						"productName": ""
					}
				],
				"customerName": "中智财务",
				"contractTypeName": "rcl_common",
				"contractTypeCode": "rcl_common",
				"productCode": "",
				"productName": "",
				"rclExecuteSituationBaseList": [
					{
						"rowNo": "10",
						"materialTypeId": 0,
						"materialId": 1533649567832604679,
						"projectId": "1592568547666034691",
						"performanceProgress": 0,
						"sendQuantity": 0,
						"baseInfoId": "2349454399272648746",
						"dtcStatus": "",
						"dtcGtxid": "",
						"orimnyInvoiceNotaxSaved": 10,
						"orimnyInvoiceSaved": 10,
						"orimnyInvoiceTaxSaved": 0,
						"localmnyInvoiceNotaxSaved": 0,
						"localmnyInvoiceSaved": 0,
						"localmnyInvoiceTaxSaved": 0,
						"orimnyInvoiceNotax": 0,
						"orimnyInvoice": 0,
						"orimnyInvoiceTax": 0,
						"orimnyInvoiceNotaxTobe": 0,
						"orimnyInvoiceTobe": 0,
						"orimnyInvoiceTaxTobe": 0,
						"localmnyInvoiceNotax": 0,
						"localmnyInvoice": 0,
						"localmnyInvoiceTax": 0,
						"localmnyInvoiceNotaxTobe": 0,
						"localmnyInvoiceTobe": 0,
						"localmnyInvoiceTaxTobe": 0,
						"orimnyCollectionNotax": 0,
						"orimnyCollection": 0,
						"orimnyCollectionTax": 0,
						"orimnyCollectionNotaxTobe": 0,
						"orimnyCollectionTobe": 0,
						"orimnyCollectionTaxTobe": 0,
						"localmnyCollectionNotax": 0,
						"localmnyCollection": 0,
						"localmnyCollectionTax": 0,
						"localmnyCollectionNotaxTobe": 0,
						"localmnyCollectionTobe": 0,
						"localmnyCollectionTaxTobe": 0,
						"orimnyCollectionNotaxSaved": 0,
						"orimnyCollectionSaved": 0,
						"orimnyCollectionTaxSaved": 0,
						"localmnyCollectionNotaxSaved": 0,
						"localmnyCollectionSaved": 0,
						"localmnyCollectionTaxSaved": 0,
						"orimnyRevenueNotax": 0,
						"orimnyRevenue": 0,
						"orimnyRevenueTax": 0,
						"orimnyRevenueNotaxTobe": 0,
						"orimnyRevenueTobe": 0,
						"orimnyRevenueTaxTobe": 0,
						"localmnyRevenueNotax": 0,
						"localmnyRevenue": 0,
						"localmnyRevenueTax": 0,
						"localmnyRevenueNotaxTobe": 0,
						"localmnyRevenueTobe": 0,
						"localmnyRevenueTaxTobe": 0,
						"orimnyRevenueNotaxSaved": 0,
						"orimnyRevenueSaved": 0,
						"orimnyRevenueTaxSaved": 0,
						"localmnyRevenueNotaxSaved": 0,
						"localmnyRevenueSaved": 0,
						"localmnyRevenueTaxSaved": 0,
						"orimnyReceivableNotax": 0,
						"orimnyReceivable": 0,
						"orimnyReceivableTax": 0,
						"orimnyReceivableNotaxTobe": 0,
						"orimnyReceivableTobe": 0,
						"orimnyReceivableTaxTobe": 0,
						"localmnyReceivableNotax": 0,
						"localmnyReceivable": 0,
						"localmnyReceivableTax": 0,
						"localmnyReceivableNotaxTobe": 0,
						"localmnyReceivableTobe": 0,
						"localmnyReceivableTaxTobe": 0,
						"orimnySettlementNotax": 0,
						"orimnySettlement": 0,
						"orimnySettlementTax": 0,
						"orimnySettlementNotaxTobe": 0,
						"orimnySettlementTobe": 0,
						"orimnySettlementTaxTobe": 0,
						"localmnySettlementNotax": 0,
						"localmnySettlement": 0,
						"localmnySettlementTax": 0,
						"localmnySettlementNotaxTobe": 0,
						"localmnySettlementTobe": 0,
						"localmnySettlementTaxTobe": 0,
						"orimnySettlementNotaxSaved": 0,
						"orimnySettlementSaved": 0,
						"orimnySettlementTaxSaved": 0,
						"localmnySettlementNotaxSaved": 0,
						"localmnySettlementSaved": 0,
						"localmnySettlementTaxSaved": 0,
						"orimnyDeferrevenueNotax": 0,
						"orimnyDeferrevenue": 0,
						"orimnyDeferrevenueTax": 0,
						"localmnyDeferrevenueNotax": 0,
						"localmnyDeferrevenue": 0,
						"localmnyDeferrevenueTax": 0,
						"orimnyScheduleNotax": 10,
						"orimnySchedule": 10,
						"orimnyScheduleTax": 0,
						"localmnyScheduleNotax": 10.1,
						"localmnySchedule": 10,
						"localmnyScheduleTax": 0.1,
						"orimnySignNotax": 0,
						"orimnySign": 0,
						"orimnySignTax": 0,
						"orimnySignNotaxTobe": 0,
						"orimnySignTobe": 0,
						"orimnySignTaxTobe": 0,
						"localmnySignNotax": 0,
						"localmnySign": 0,
						"localmnySignTax": 0,
						"localmnySignNotaxTobe": 0,
						"localmnySignTobe": 0,
						"localmnySignTaxTobe": 0,
						"orimnySignNotaxSaved": 0,
						"orimnySignSaved": 0,
						"orimnySignTaxSaved": 0,
						"localmnySignNotaxSaved": 0,
						"localmnySignSaved": 0,
						"localmnySignTaxSaved": 0,
						"orimnyDeferrevenueNotaxSaved": 0,
						"orimnyDeferrevenueSaved": 0,
						"orimnyDeferrevenueTaxSaved": 0,
						"localmnyDeferrevenueNotaxSaved": 0,
						"localmnyDeferrevenueSaved": 0,
						"localmnyDeferrevenueTaxSaved": 0,
						"orimnyDeferrevenueCfmd": 0,
						"orimnyDeferrevenueNotaxCfmd": 0,
						"orimnyDeferrevenueTaxCfmd": 0,
						"localmnyDeferrevenueCfmd": 0,
						"localmnyDeferrevenueNotaxCfmd": 0,
						"localmnyDeferrevenueTaxCfmd": 0,
						"orimnyDeferrevenueTobe": 0,
						"orimnyDeferrevenueNotaxTobe": 0,
						"orimnyDeferrevenueTaxTobe": 0,
						"localmnyDeferrevenueTobe": 0,
						"localmnyDeferrevenueNotaxTobe": 0,
						"localmnyDeferrevenueTaxTobe": 0,
						"orimnyDeferrevenueCfmdSaved": 0,
						"orimnyDeferrevenueNotaxCfmdSaved": 0,
						"orimnyDeferrevenueTaxCfmdSaved": 0,
						"localmnyDeferrevenueCfmdSaved": 0,
						"localmnyDeferrevenueNotaxCfmdSaved": 0,
						"localmnyDeferrevenueTaxCfmdSaved": 0,
						"invoiceQuantitySaved": 0,
						"sendQuantityTobe": 0,
						"invoiceQuantity": 0,
						"invoiceQuantityTobe": 0,
						"settlementQuantitySaved": 0,
						"settlementQuantity": 0,
						"settlementQuantityTobe": 0,
						"signQuantitySaved": 0,
						"signQuantity": 0,
						"signQuantityTobe": 0,
						"orimnyOutboundNotax": 0,
						"orimnyOutbound": 0,
						"orimnyOutboundTax": 0,
						"orimnyOutboundNotaxTobe": 0,
						"orimnyOutboundTobe": 0,
						"orimnyOutboundTaxTobe": 0,
						"localmnyOutboundNotax": 0,
						"localmnyOutbound": 0,
						"localmnyOutboundTax": 0,
						"localmnyOutboundNotaxTobe": 0,
						"localmnyOutboundTobe": 0,
						"localmnyOutboundTaxTobe": 0,
						"outboundQuantity": 0,
						"outboundQuantityTobe": 0,
						"rclRevenuecontractBaseId": "2074723904186220547",
						"ytenantId": "0000L6YQ8AVLFUZPXD0000",
						"createTime": "2025-09-01 15:41:30",
						"modifyTime": "2025-09-02 11:22:51",
						"creator": "14f27063-7b47-45eb-9a7b-71b54854a422",
						"modifier": "14f27063-7b47-45eb-9a7b-71b54854a422",
						"id": "2349454399272648761",
						"pubts": "2025-09-02 11:22:52",
						"dr": 0,
						"wbs": "",
						"activity": "",
						"localmnyCollectibleNotax": 105,
						"localmnyCollectible": 100,
						"localmnyCollectibleTax": 5,
						"localmnyContractassetNotax": 0,
						"localmnyContractasset": 0,
						"localmnyContractassetTax": 0,
						"localmnyAvailreceivableNotax": 0,
						"localmnyAvailreceivable": 0,
						"localmnyAvailreceivableTax": 0,
						"localmnyToreceivableNotax": 0,
						"localmnyToreceivable": 0,
						"localmnyToreceivableTax": 0,
						"orimnyReceivableNotaxSaved": 0,
						"orimnyReceivableSaved": 0,
						"orimnyReceivableTaxSaved": 0,
						"localmnyReceivableNotaxSaved": 0,
						"localmnyReceivableSaved": 0,
						"localmnyReceivableTaxSaved": 0,
						"localmnyContractassetNotaxSaved": 0,
						"localmnyContractassetSaved": 0,
						"localmnyContractassetTaxSaved": 0,
						"localmnyAvailreceivableNotaxSaved": 0,
						"localmnyAvailreceivableSaved": 0,
						"localmnyAvailreceivableTaxSaved": 0,
						"localmnyToreceivableNotaxSaved": 0,
						"localmnyToreceivableSaved": 0,
						"localmnyToreceivableTaxSaved": 0,
						"projectCode": "",
						"projectName": "",
						"materialCode": "",
						"materialName": "",
						"materialTypeCode": "",
						"materialTypeName": ""
					}
				]
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

1	2026-01-27

更新

请求参数 data

更新

请求参数 accentity_code

更新

请求参数 simpleVOs

2	2025-11-07

新增

返回参数 (13)

项目、物料、物料类别档案翻译

3	2025-11-05

更新

请求说明

新增

返回参数 (213)

更新

返回参数 financeCompFlag

履约义务执行情况项目档案翻译

4	2025-06-18

新增

返回参数 (16)

档案返回时添加档案code和name


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

