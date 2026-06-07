---
title: "发包履约义务批量新增"
apiId: "2383632975940026377"
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

# 发包履约义务批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Contracting Performance Obligation (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/EFI/RVN/rclEmployPerformanceObligation/fiercl/employperformance/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 入参 |
| accentity | string | 否 | 否 | 会计主体id 示例：1525772228455038981 |
| accentity_code | string | 否 | 是 | 会计主体编码 示例：1208 |
| id | string | 否 | 否 | 主表id 示例：1628654459275444227 |
| name | string | 否 | 是 | 名称 示例：名称 |
| billDate | string | 否 | 是 | 单据日期 示例：2022-10-13 |
| orimnyNotax | number |
| 小数位数:8,最大长度:38 | 否 | 是 | 无税金额 示例：0.0 |
| orimnyTax | number |
| 小数位数:8,最大长度:38 | 否 | 否 | 税额 示例：0.0 |
| orimny | number |
| 小数位数:8,最大长度:38 | 否 | 是 | 含税金额 示例：0.0 |
| exchangeRateType | string | 否 | 否 | 汇率类型id(id和code必输其一,同时输入,id优先) 示例：0000L6YQ8AVLFUZPXD0000 |
| exchangeRateType_code | string | 否 | 否 | 汇率类型code(id和code必输其一,同时输入,id优先) 示例：01 |
| exchangeRateDate | string | 否 | 是 | 汇率日期 示例：2022-10-13 |
| exchangeRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | number |
| 小数位数:8,最大长度:38 | 否 | 是 | 汇率 示例：1 |
| localmnyNotax | number |
| 小数位数:8,最大长度:38 | 否 | 是 | 本币无税金额 示例：100.0 |
| localmny | number |
| 小数位数:8,最大长度:38 | 否 | 是 | 本币含税金额 示例：100.0 |
| localmnyTax | number |
| 小数位数:8,最大长度:38 | 否 | 否 | 本币税额 示例：200.0 |
| signDate | string | 否 | 否 | 签订日期 示例：2022-10-13 |
| deptId | string | 否 | 否 | 部门id 示例：1525655517005348867 |
| deptCode | string | 否 | 否 | 部门code 示例：bu1 |
| employee | string | 否 | 否 | 人员id 示例：1563528487077150729 |
| employee_code | string | 否 | 否 | 人员code 示例：00000001 |
| signOrgId | string | 否 | 否 | 签约组织id 示例：1556193765280972809 |
| signOrgCode | string | 否 | 否 | 签约组织code 示例：1208 |
| blnOpenContract | boolean | 否 | 否 | 是否敞口(true--是;false--否) 示例：false 默认值：false |
| version | number |
| 小数位数:8,最大长度:38 | 否 | 是 | 版本号 示例：2 |
| srcBillVersion | number |
| 小数位数:8,最大长度:38 | 否 | 是 | 来源单据版本号 示例：2 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳 示例：2023-01-10 14:51:11 |
| receiptPlanDimension | string | 否 | 否 | 收款计划维度(0：履约义务；1：履约义务行) 示例：0 默认值：0 |
| _status | string | 否 | 是 | 接口类型(Update) 示例：Update 默认值：Update |
| extSrcSystems | string | 否 | 否 | 来源单据系统(外) |
| extSrcBillCode | string | 否 | 否 | 来源单据编码(外) |
| rclPerformanceBaseInfoList | object | 是 | 否 | 发包履约基本信息 |
| rclCostPeriodPlanList | object | 是 | 否 | 分期成本计划 |
| isAsync | boolean | 否 | 否 | 是否异步 示例：false 默认值：false |
| rclEmployPeriodExecuteSituationList | object | 是 | 否 | 分期执情况子实体 |

## 3. 请求示例

Url: /yonbip/FCC/EFI/RVN/rclEmployPerformanceObligation/fiercl/employperformance/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"accentity": "1525772228455038981",
			"accentity_code": "1208",
			"id": "1628654459275444227",
			"name": "名称",
			"billDate": "2022-10-13",
			"orimnyNotax": 0,
			"orimnyTax": 0,
			"orimny": 0,
			"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
			"exchangeRateType_code": "01",
			"exchangeRateDate": "2022-10-13",
			"exchangeRateOps": NaN,
			"exchangeRate": 1,
			"localmnyNotax": 100,
			"localmny": 100,
			"localmnyTax": 200,
			"signDate": "2022-10-13",
			"deptId": "1525655517005348867",
			"deptCode": "bu1",
			"employee": "1563528487077150729",
			"employee_code": "00000001",
			"signOrgId": "1556193765280972809",
			"signOrgCode": "1208",
			"blnOpenContract": false,
			"version": 2,
			"srcBillVersion": 2,
			"pubts": "2023-01-10 14:51:11",
			"receiptPlanDimension": "0",
			"_status": "Update",
			"extSrcSystems": "",
			"extSrcBillCode": "",
			"rclPerformanceBaseInfoList": [
				{
					"id": "1633297155701080077",
					"rowNo": 1,
					"materialTypeId": 1539617287450919000,
					"materialTypeCode": "000001",
					"materialId": 1526402386049368000,
					"materialCode": "000001",
					"projectId": "16074030727718548",
					"projectCode": "XM0001",
					"wbs": "20555847984014610",
					"wbsCode": "WBS001",
					"costCenterId": 1556810883353018400,
					"costCenterCode": "0001",
					"expenseItemId": 1550263660986237000,
					"expenseItemCode": "00001",
					"beginDate": "2022-10-13",
					"endDate": "2022-10-14",
					"quantity": 10,
					"unitId": 1528655706284097500,
					"unitCode": "1002",
					"currency": "1622076364663816198",
					"currency_code": "11",
					"oriUnitpriceNotax": 100,
					"oriUnitprice": 113,
					"orimnyNotax": 1000,
					"orimny": 1130,
					"taxRateEntity": "1607403072771850289",
					"taxRateEntity_code": "NO VAT",
					"orimnyTax": 130,
					"exchangeRatetype": "汇率类型",
					"exchangeRatetype_code": "01",
					"exchangeRateDate": "2022-10-13",
					"exchangeRateOps": NaN,
					"exchangeRate": 1,
					"localUnitprice": 113,
					"localUnitpriceNotax": 100,
					"localmnyNotax": 1000,
					"localmnyTax": 130,
					"localmny": 1130,
					"financeIncome": 1000,
					"memo": "备注",
					"pubts": "2023-01-10 16:53:35",
					"_status": "Insert",
					"extBeginBillId": "",
					"extSrcBillCode": "",
					"extSrcBodyId": "",
					"extBeginBillNo": "",
					"extSrcBillId": "",
					"extBeginBodyId": "",
					"extSrcTranstypeCode": "",
					"extBeginBilltypeCode": "",
					"extBeginTranstypeCode": "",
					"extSrcSystems": "",
					"extSrcBilltypeCode": "",
					"changeLocalmnyTax": 0,
					"changeLocalmnyNotax": 0,
					"changeLocalmny": 0,
					"changeOrimnyNotax": 0,
					"changeOrimnyTax": 0,
					"changeOrimny": 0
				}
			],
			"rclCostPeriodPlanList": [
				{
					"id": "1633231846435717126",
					"_status": "Insert",
					"blnDiscountIncluded": true
				}
			],
			"isAsync": false,
			"rclEmployPeriodExecuteSituationList": [
				{
					"rowNo": 1,
					"materialTypeId": 1539617287450919000,
					"materialId": 1526402386049368000,
					"projectId": "1607837087783976969",
					"periodId": 1556256609240350727,
					"orimnyInvoiceNotaxCurrent": 100,
					"orimnyInvoiceCurrent": 120,
					"orimnyInvoiceTaxCurrent": 20,
					"localmnyInvoiceNotaxCurrent": 100,
					"localmnyInvoiceCurrent": 120,
					"localmnyInvoiceTaxCurrent": 20,
					"localmnyPaymentNotaxCurrent": 100,
					"localmnyPaymentCurrent": 120,
					"localmnyPaymentTaxCurrent": 20,
					"orimnyCostNotaxCurrent": 100,
					"orimnyCostCurrent": 120,
					"orimnyCostTaxCurrent": 20,
					"localmnyCostNotaxCurrent": 100,
					"localmnyCostCurrent": 120,
					"localmnyCostTaxCurrent": 20,
					"invoiceQuantityTotal": 100,
					"orimnyInvoiceNotaxTotal": 100,
					"orimnyInvoiceTotal": 120,
					"orimnyInvoiceTaxTotal": 20,
					"localmnyInvoiceNotaxTotal": 100,
					"localmnyInvoiceTotal": 120,
					"localmnyInvoiceTaxTotal": 20,
					"orimnyPaymentNotaxTotal": 100,
					"orimnyPaymentTotal": 120,
					"orimnyPaymentTaxTotal": 20,
					"localmnyPaymentNotaxTotal": 100,
					"localmnyPaymentTotal": 120,
					"localmnyPaymentTaxTotal": 20,
					"orimnyCostNotaxTotal": 100,
					"orimnyCostTotal": 120,
					"orimnyCostTaxTotal": 20,
					"localmnyCostNotaxTotal": 100,
					"localmnyCostTotal": 120,
					"localmnyCostTaxTotal": 20,
					"blnStartFlag": true,
					"localmnyPaymentTotalSaved": 120,
					"localmnyPaymentCurrentSaved": 100,
					"localmnyCostTaxCurrentSaved": 20,
					"localmnyCostCurrentSaved": 120,
					"orimnyPaymentTotalSaved": 120,
					"orimnyCostTaxTotalSaved": 20,
					"localmnyCostTaxTotalSaved": 20,
					"localmnyCostNotaxCurrentSaved": 100,
					"orimnyPaymentTaxCurrent": 20,
					"orimnyPaymentCurrentSaved": 100,
					"orimnyCostTotalSaved": 100,
					"orimnyPaymentCurrent": 120,
					"localmnyCostNotaxTotalSaved": 100,
					"orimnyCostNotaxTotalSaved": 100,
					"localmnyCostTotalSaved": 120,
					"orimnyPaymentNotaxCurrent": 100,
					"orimnyCostCurrentSaved": 120,
					"orimnyCostNotaxCurrentSaved": 100,
					"orimnyCostTaxCurrentSaved": 20,
					"_status": "Insert",
					"orimnyDefercostNotaxCurrentCfmd": 0,
					"orimnyDefercostCurrentCfmd": 0,
					"orimnyDefercostTaxCurrentCfmd": 0,
					"localmnyDefercostNotaxCurrentCfmd": 0,
					"localmnyDefercostCurrentCfmd": 0,
					"localmnyDefercostTaxCurrentCfmd": 0
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 数据 |
| busiObj | string | 否 | 业务对象 示例：rclRevenueContract |
| contractType | string | 否 | 交易类型 示例：1607403021234340397 |
| signDate | string | 否 | 签订日期 示例：2023-01-04 |
| employee | string | 否 | 人员 示例：1610101678025474057 |
| accentity | string | 否 | 会计主体 示例：1607417838875705352 |
| dr | number |
| 小数位数:0,最大长度:38 | 否 | 逻辑删除 示例：0 |
| exchangeRate | number |
| 小数位数:8,最大长度:38 | 否 | 汇率 示例：1 |
| id | string | 否 | 主表id 示例：1628821215692455937 |
| signOrgId | string | 否 | 签约组织 示例：1614623273556901896 |
| metaFullName | string | 否 | 元数据全名称 示例：RCL.RCL.rclRevenueContract |
| orimny | number |
| 小数位数:8,最大长度:38 | 否 | 含税金额 示例：1130 |
| deptId | string | 否 | 部门 示例：1614623273556901896 |
| billDate | string | 否 | 单据日期 示例：2023-01-04 |
| ytenantId | string | 否 | 租户id 示例：0000LBC4W3H13EZ4LE0000 |
| _status | number |
| 小数位数:0,最大长度:38 | 否 | 状态 示例：0 |
| version | number |
| 小数位数:8,最大长度:38 | 否 | 版本号 示例：1 |
| blnOpenContract | boolean | 否 | 是否敞口(true-是,false-否) 示例：false |
| verifyState | number |
| 小数位数:0,最大长度:38 | 否 | 单据状态 示例：0 |
| name | string | 否 | 名称 示例：openApi测试1 |
| localmnyTax | number |
| 小数位数:8,最大长度:38 | 否 | 本币税额 示例：130 |
| localmny | number |
| 小数位数:8,最大长度:38 | 否 | 本币含税金额 示例：1130 |
| projectId | string | 否 | 项目 示例：1607837087783976969 |
| srcSystem | string | 否 | 单据来源系统 示例：收入合同台账 |
| code | string | 否 | 单据编号 示例：RECON20230104006869 |
| currType | string | 否 | 币种 示例：1607403072771850274 |
| cBillNo | string | 否 | 单据编码 示例：rclRevenueContract |
| orimnyNotax | number |
| 小数位数:8,最大长度:38 | 否 | 无税金额 示例：1000 |
| orimnyTax | number |
| 小数位数:8,最大长度:38 | 否 | 税额 示例：130 |
| originId | string | 否 | 原始版本 示例：1628821215692455937 |
| blnLatest | boolean | 否 | 最新版本(true-是,false-否) 示例：true |
| customerId | string | 否 | 客户 示例：1607427184715628553 |
| srcBillCode | string | 否 | 来源单据编号 示例：202301041112 |
| pubts | string | 否 | 时间戳 示例：2023-01-04 16:09:06 |
| billTypeId | string | 否 | 单据类型 示例：1570189715179044871 |
| creator | string | 否 | 创建人 示例：e73dba5f-bb3a-4e36-8c64-9efc3a1d6012 |
| localmnyNotax | number |
| 小数位数:8,最大长度:38 | 否 | 本币无税金额 示例：1000 |
| blnStartFlag | boolean | 否 | 期初标识(true-是,false-否) 示例：false |
| bustype | string | 否 | 交易类型 示例：1607403021234340397 |
| parentId | string | 否 | 上级履约义务 示例：1608763245959577608 |
| exchangeRateType | string | 否 | 汇率类型 示例：0000LBC4W3H13EZ4LE0000 |
| exchangeRateDate | string | 否 | 汇率日期 示例：2023-01-04 |
| createTime | string | 否 | 创建时间 示例：2023-01-04 16:09:06 |
| thirdPartId | string | 否 | 第三方主体 示例：1609385809968365574 |
| rclContractBaseInfoList | object | 是 | 合同基本信息子实体 |
| rclContractReceiptPlanList | object | 是 | 收款计划 |
| rclReceiptPlanList | object | 是 | 收款计划子表 |
| rclCriticalEventList | object | 是 | 大事记子表 |
| rclPeriodPlanList | object | 是 | 分期收入计划子表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "rclRevenueContract",
		"contractType": "1607403021234340397",
		"signDate": "2023-01-04",
		"employee": "1610101678025474057",
		"accentity": "1607417838875705352",
		"dr": 0,
		"exchangeRate": 1,
		"id": "1628821215692455937",
		"signOrgId": "1614623273556901896",
		"metaFullName": "RCL.RCL.rclRevenueContract",
		"orimny": 1130,
		"deptId": "1614623273556901896",
		"billDate": "2023-01-04",
		"ytenantId": "0000LBC4W3H13EZ4LE0000",
		"_status": 0,
		"version": 1,
		"blnOpenContract": false,
		"verifyState": 0,
		"name": "openApi测试1",
		"localmnyTax": 130,
		"localmny": 1130,
		"projectId": "1607837087783976969",
		"srcSystem": "收入合同台账",
		"code": "RECON20230104006869",
		"currType": "1607403072771850274",
		"cBillNo": "rclRevenueContract",
		"orimnyNotax": 1000,
		"orimnyTax": 130,
		"originId": "1628821215692455937",
		"blnLatest": true,
		"customerId": "1607427184715628553",
		"srcBillCode": "202301041112",
		"pubts": "2023-01-04 16:09:06",
		"billTypeId": "1570189715179044871",
		"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
		"localmnyNotax": 1000,
		"blnStartFlag": false,
		"bustype": "1607403021234340397",
		"parentId": "1608763245959577608",
		"exchangeRateType": "0000LBC4W3H13EZ4LE0000",
		"exchangeRateDate": "2023-01-04",
		"createTime": "2023-01-04 16:09:06",
		"thirdPartId": "1609385809968365574",
		"rclContractBaseInfoList": [
			{
				"expenseItemId": "1608642033386258437",
				"endDate": "2023-01-31",
				"localmny": 1130,
				"incomeConfirmRule1": "1593241680834199559",
				"memo": "备注",
				"receiveAgreementId": "1608684398959394817",
				"dr": 0,
				"exchangeRate": 1,
				"id": "1628821215692455942",
				"metaFullName": "RCL.RCL.rclContractBaseInfo",
				"tradeConfirmRule1": "1593247564945686529",
				"localUnitprice": 113,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"materialId": "1607839252471611399",
				"_status": 0,
				"financeCompFlag": false,
				"taxRate": 13,
				"localUnitpriceNotax": 100,
				"localmnyTax": 130,
				"rowNo": 1,
				"exchangeRatetype": "0000LBC4W3H13EZ4LE0000",
				"materialTypeId": "1607432476115337218",
				"orimnyNotax": 1000,
				"rclRevenuecontractBaseId": "1628821215692455937",
				"orimnyTax": 130,
				"costCenterId": "1609384650402693123",
				"unitId": "1607434176922386433",
				"currency": "1607403072771850274",
				"pubts": "2023-01-04 16:09:06",
				"orimny": 1130,
				"procenterId": "1607417838875705352",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"quantity": 10,
				"oriUnitprice": 113,
				"localmnyNotax": 1000,
				"oppProcenterId": "1607417838875705352",
				"beginDate": "2023-01-04",
				"exchangeRateDate": "2023-01-04",
				"oriUnitpriceNotax": 100,
				"createTime": "2023-01-04 16:09:06"
			}
		],
		"rclContractReceiptPlanList": [
			{
				"fixedExpireDate1": "0",
				"fixedExpireDate2": "0",
				"fixedExpireDate3": "0",
				"fixedExpireDate4": "0",
				"expireComfirmWay": "0",
				"dueDate": "2023-02-03",
				"blnRetentionAmountFlag": false,
				"accountPeriod": 30,
				"dr": 0,
				"accountPeriodUnitId": "0",
				"startTimeId": "不设起算日、到期日",
				"id": "1628821215692455945",
				"settleModeId": "1608684167017005057",
				"metaFullName": "RCL.RCL.rclContractReceiptPlan",
				"oriAmount": 5000,
				"deloyMonth": 5,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"_status": 0,
				"startDate": "2023-01-04",
				"rowNo": 1,
				"blnAdvancedPaymentFlag": false,
				"deloyDays": 5,
				"rclRevenuecontractBaseId": "1628821215692455937",
				"baseInfoId": "1628821215692455942",
				"pubts": "2023-01-04 16:09:06",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"oriReceiveAmount": 0,
				"fixedAccountDate1": "0",
				"fixedAccountDate2": "0",
				"fixedAccountDate3": "0",
				"fixedAccountDate4": "0",
				"accountComfirmWay": "0",
				"createTime": "2023-01-04 16:09:06",
				"effectiveDate": "2023-01-04",
				"ratio": 100
			}
		],
		"rclReceiptPlanList": [
			{
				"fixedExpireDate3": "0",
				"fixedExpireDate4": "0",
				"fixedExpireDate1": "0",
				"fixedExpireDate2": "0",
				"expireComfirmWay": "0",
				"dueDate": "2023-02-03",
				"blnRetentionAmountFlag": false,
				"accountPeriod": 30,
				"dr": 0,
				"accountPeriodUnitId": "0",
				"startTimeId": "不设起算日、到期日",
				"id": "1628821215692455944",
				"settleModeId": "1608684167017005057",
				"metaFullName": "RCL.RCL.rclReceiptPlanBase",
				"oriAmount": 1130,
				"deloyMonth": 0,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"_status": 0,
				"startDate": "2023-01-04",
				"rowNo": 1,
				"blnAdvancedPaymentFlag": false,
				"deloyDays": 0,
				"rclRevenuecontractBaseId": "1628821215692455937",
				"baseInfoId": "1628821215692455942",
				"pubts": "2023-01-04 16:09:06",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"oriReceiveAmount": 0,
				"fixedAccountDate4": "0",
				"fixedAccountDate3": "0",
				"accountComfirmWay": "0",
				"fixedAccountDate2": "0",
				"fixedAccountDate1": "0",
				"createTime": "2023-01-04 16:09:06",
				"effectiveDate": "2023-01-04",
				"ratio": 100
			}
		],
		"rclCriticalEventList": [
			{
				"rclRevenuecontractBaseId": "1628821215692455937",
				"dr": 0,
				"id": "1628821215692455945",
				"pubts": "2023-01-04 16:09:06",
				"metaFullName": "RCL.RCL.rclCriticalEvent",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"eventContent": "大事记内容",
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"_status": 0,
				"eventCode": "202301041111",
				"createTime": "2023-01-04 16:09:06",
				"idx": 1,
				"remarks": "备注"
			}
		],
		"rclPeriodPlanList": [
			{
				"dr": 0,
				"id": "1628821215692455940",
				"metaFullName": "RCL.RCL.rclPeriodPlan",
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"_status": 0,
				"version": 1,
				"rowNo": 1,
				"rclRevenuecontractBaseId": "1628821215692455937",
				"orimnyTaxCurrent": 15.6,
				"orimnyNotaxCurrent": 120,
				"orimnyCurrent": 135.6,
				"pubts": "2023-01-04 16:09:06",
				"periodId": "1607962045562486793",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"currPeriodConfirmProportion": 12,
				"createTime": "2023-01-04 16:09:06"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据不是最新状态，请刷新重试。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-26

新增

请求参数 (12)

添加input字段

2	2025-11-19

新增

请求参数 (62)

更新

请求参数 (30)

删除

请求参数 (140)

新增

返回参数 (187)

更新

返回参数 data

删除

返回参数 (80)

增加分期执行情况


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

