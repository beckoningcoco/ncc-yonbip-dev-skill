---
title: "履约义务批量新增"
apiId: "1945564324921606152"
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

# 履约义务批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Fulfillment Obligation (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/fiercl/revenuecontract/batchsave

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
| accentity_code | string | 否 | 是 | 会计主体code 示例：1208 |
| contractType | string | 否 | 否 | 交易类型id(id和code必输其一,同时输入,id优先) 示例：1529304778923311108 |
| contractType_code | string | 否 | 否 | 交易类型code(id和code必输其一,同时输入,id优先) 示例：rcl_businessct |
| code | string | 否 | 否 | 单据编号(手工编号时必输，自动编号时不输) 示例：RECON20230110007148 |
| name | string | 否 | 是 | 名称 示例：名称 |
| contractCode | string | 否 | 否 | 合同号 示例：202302101123 |
| parentId | string | 否 | 否 | 上级履约义务id 示例：上级履约义务 |
| parentCode | string | 否 | 否 | 上级履约义务code 示例：RECON20230211020232 |
| version | BigDecimal | 否 | 是 | 版本号 示例：1.0 默认值：1.0 |
| billDate | string | 否 | 是 | 单据日期 示例：2022-10-13 |
| signDate | string | 否 | 是 | 签订日期 示例：2022-10-13 |
| enablePeriod | string | 否 | 否 | 启用期间id 示例：1556256609240350727 |
| enablePeriodCode | string | 否 | 否 | 启用期间code 示例：2023-10 |
| thirdPartId | string | 否 | 否 | 第三方主体id 示例：1471403105020018693 |
| thirdPartCode | string | 否 | 否 | 第三方主体code 示例：0001000001 |
| customerId | string | 否 | 否 | 客户id(id和code必输其一,同时输入,id优先) 示例：1539728853543944200 |
| customerCode | string | 否 | 否 | 客户code(id和code必输其一,同时输入,id优先) 示例：yl-kh |
| deptId | string | 否 | 否 | 部门id 示例：1525655517005348867 |
| deptCode | string | 否 | 否 | 部门code 示例：bu1 |
| employee | string | 否 | 否 | 人员id 示例：1563528487077150729 |
| employee_code | string | 否 | 否 | 人员code 示例：00000001 |
| currType | string | 否 | 否 | 币种id(id和code必输其一,同时输入,id优先) 示例：1525643705855773169 |
| currType_code | string | 否 | 否 | 币种code(id和code必输其一,同时输入,id优先) 示例：11 |
| orimnyNotax | BigDecimal | 否 | 是 | 无税金额 示例：1000 |
| orimnyTax | BigDecimal | 否 | 否 | 税额 示例：130 |
| orimny | BigDecimal | 否 | 是 | 含税金额 示例：226 |
| exchangeRateType | string | 否 | 否 | 汇率类型id(id和code必输其一,同时输入,id优先) 示例：0000L6YQ8AVLFUZPXD0000 |
| exchangeRateType_code | string | 否 | 否 | 汇率类型code(id和code必输其一,同时输入,id优先) 示例：01 |
| exchangeRateDate | string | 否 | 是 | 汇率日期 示例：2022-10-13 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| localmnyNotax | BigDecimal | 否 | 是 | 本币无税金额 示例：1000 |
| localmny | BigDecimal | 否 | 是 | 本币含税金额 示例：1130 |
| localmnyTax | BigDecimal | 否 | 否 | 本币税额 示例：130 |
| signOrgId | string | 否 | 否 | 签约组织id 示例：1556193765280972809 |
| signOrgCode | string | 否 | 否 | 签约组织code 示例：1208 |
| projectId | string | 否 | 否 | 项目id 示例：1607837087783976969 |
| projectCode | string | 否 | 否 | 项目code 示例：00000001 |
| receiveAgreementId | string | 否 | 否 | 收款协议id 示例：123 |
| receiveAgreementCode | string | 否 | 否 | 收款协议code 示例：00000001 |
| blnStartFlag | boolean | 否 | 是 | 期初标识(true--是;false--否) 示例：true 默认值：false |
| blnOpenContract | boolean | 否 | 否 | 是否敞口(true--是;false--否) 示例：false 默认值：false |
| extSrcSystem | string | 否 | 是 | 来源单据系统(外) 示例：结算信息 |
| extSrcBillCode | string | 否 | 是 | 来源单据编码(外) 示例：test1 |
| receiptPlanDimension | string | 否 | 否 | 收款计划维度(0：履约义务；1：履约义务行) 示例：0 默认值：0 |
| _status | string | 否 | 是 | 接口类型 示例：Insert 默认值：Insert |
| rclContractBaseInfoList | object | 是 | 是 | 合同基本信息子实体 |
| rclContractReceiptPlanList | object | 是 | 否 | 收款计划子实体 |
| rclReceiptPlanList | object | 是 | 否 | 收款计划明细子实体 |
| rclCriticalEventList | object | 是 | 否 | 大事记子实体 |
| rclPeriodPlanList | object | 是 | 否 | 分期收入计划子实体 |
| rclPeriodExecuteSituationList | object | 是 | 否 | 分期执情况子实体 |
| isAsync | boolean | 否 | 否 | 是否异步 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/AMP/fiercl/revenuecontract/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"accentity": "1525772228455038981",
			"accentity_code": "1208",
			"contractType": "1529304778923311108",
			"contractType_code": "rcl_businessct",
			"code": "RECON20230110007148",
			"name": "名称",
			"contractCode": "202302101123",
			"parentId": "上级履约义务",
			"parentCode": "RECON20230211020232",
			"version": 1,
			"billDate": "2022-10-13",
			"signDate": "2022-10-13",
			"enablePeriod": "1556256609240350727",
			"enablePeriodCode": "2023-10",
			"thirdPartId": "1471403105020018693",
			"thirdPartCode": "0001000001",
			"customerId": "1539728853543944200",
			"customerCode": "yl-kh",
			"deptId": "1525655517005348867",
			"deptCode": "bu1",
			"employee": "1563528487077150729",
			"employee_code": "00000001",
			"currType": "1525643705855773169",
			"currType_code": "11",
			"orimnyNotax": 1000,
			"orimnyTax": 130,
			"orimny": 226,
			"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
			"exchangeRateType_code": "01",
			"exchangeRateDate": "2022-10-13",
			"exchRateOps": NaN,
			"exchangeRate": 1,
			"localmnyNotax": 1000,
			"localmny": 1130,
			"localmnyTax": 130,
			"signOrgId": "1556193765280972809",
			"signOrgCode": "1208",
			"projectId": "1607837087783976969",
			"projectCode": "00000001",
			"receiveAgreementId": "123",
			"receiveAgreementCode": "00000001",
			"blnStartFlag": true,
			"blnOpenContract": false,
			"extSrcSystem": "结算信息",
			"extSrcBillCode": "test1",
			"receiptPlanDimension": "0",
			"_status": "Insert",
			"rclContractBaseInfoList": [
				{
					"rowNo": 1,
					"materialTypeId": "1539617287450919000",
					"materialTypeCode": "000001",
					"materialId": "1526402386049368000",
					"materialCode": "000001",
					"costCenterId": "1556810883353018400",
					"costCenterCode": "0001",
					"procenterId": "1526217092562944002",
					"procenterCode": "1208",
					"oppProcenterId": "1540512453146181634",
					"oppProcenterCode": "1208",
					"receiveAgreementId": "123",
					"receiveAgreementCode": "00000004",
					"expenseItemId": "1550263660986237000",
					"expenseItemCode": "00001",
					"projectId": "1607837087783976969",
					"projectCode": "00000001",
					"wbs": "WBSID",
					"wbsCode": "WBSCode",
					"financeCompFlag": false,
					"incomeConfirmRule1": "1593241680834199559",
					"incomeConfirmRule1_code": "1111",
					"incomeConfirmRule2": "1593241680834199559",
					"incomeConfirmRule2_code": "1111",
					"incomeConfirmRule3": "1593241680834199559",
					"incomeConfirmRule3_code": "1111",
					"incomeConfirmRule4": "1593241680834199559",
					"incomeConfirmRule4_code": "1111",
					"incomeConfirmRule5": "1593241680834199559",
					"incomeConfirmRule5_code": "1111",
					"tradeConfirmRule1": "1593246894930788354",
					"tradeConfirmRule1_code": "AR001",
					"beginDate": "2022-10-13",
					"endDate": "2022-10-14",
					"quantity": 10,
					"unitId": "1528655706284097500",
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
					"exchangeRatetype": "0000L3WE7R4W25O1SI0000",
					"exchangeRatetype_code": "01",
					"exchangeRateDate": "2022-10-13",
					"exchRateOps": NaN,
					"exchangeRate": 1,
					"localUnitprice": 113,
					"localUnitpriceNotax": 100,
					"localmnyNotax": 1000,
					"localmnyTax": 130,
					"localmny": 1130,
					"financeIncome": 10000,
					"extBeginBillId": "1821063530835607552",
					"extSrcBillCode": "test1",
					"extSrcBodyId": "1821063539425542157",
					"extBeginBillNo": "test1",
					"extSrcBillId": "1819572782035894279",
					"extBeginBodyId": "1821063539425542157",
					"extSrcTranstypeCode": "rcl_businessct",
					"extBeginBilltypeCode": "prjl_schedule",
					"extBeginTranstypeCode": "rcl_businessct",
					"extSrcSystems": "收入合同",
					"extSrcBilltypeCode": "prjl_schedule",
					"memo": "备注",
					"relMatchCode": "123456",
					"relRevenuecontractId": "1812104091632926723",
					"relRevenuecontractBodyId": "1812104091632926726",
					"matchCode": "654321",
					"_status": "Insert",
					"expectedGrossProfit": 6.5,
					"expProfitMargin": 8.98,
					"chargeOffMethod": NaN,
					"preSubmissionIncomeRule_code": "R006",
					"preSubmissionIncomeRule": "1812104091632926001",
					"localFinanceIncome": 0,
					"leaseIncentiveAmount": 0,
					"interestAccrualAlgorithm": "1、枚举值：1-(期初净投资余额-收款原值)*期折现率 2-期初净投资余额*期折现率",
					"rentStartDate": "2025-07-07",
					"discountPeriodsStartFromZero": true,
					"periodDiscountRateMethod": "3-月复利 4-月单利",
					"annualDiscountRate": 0,
					"accBook": "111"
				}
			],
			"rclContractReceiptPlanList": [
				{
					"issueNo": 1,
					"financeName": "2/8",
					"ratio": 5,
					"oriAmount": 500,
					"oriReceiveAmount": 500,
					"settleModeId": "1525649083156923163",
					"settleModeCode": "0001",
					"startTimeId": "不设起算日、到期日",
					"startDate": "2022-10-15",
					"deloyDays": 1,
					"deloyMonth": 1,
					"accountPeriod": 5,
					"accountPeriodUnitId": "0",
					"accountComfirmWay": "0",
					"fixedAccountDate": "34",
					"fixedAccountDate1": "1",
					"fixedAccountDate2": "1",
					"fixedAccountDate3": "1",
					"fixedAccountDate4": "1",
					"expireComfirmWay": "0",
					"fixedExpireDate": "34",
					"fixedExpireDate1": "1",
					"fixedExpireDate2": "1",
					"fixedExpireDate3": "1",
					"fixedExpireDate4": "1",
					"blnRetentionAmountFlag": false,
					"blnAdvancedPaymentFlag": false,
					"effectiveDate": "2022-10-15",
					"dueDate": "2022-10-15",
					"_status": "Insert",
					"blnDiscountIncluded": true,
					"collectionStartDate": "",
					"collectionEndDate": "",
					"oriNoTaxAmount": 0,
					"taxAmount": 0
				}
			],
			"rclReceiptPlanList": [
				{
					"rowNo": 1,
					"issueNo": 1,
					"financeName": "2/8",
					"ratio": 5,
					"oriAmount": 500,
					"oriReceiveAmount": 400,
					"settleModeId": "1525649083156923163",
					"settleModeCode": "0001",
					"startTimeId": "不设起算日、到期日",
					"startDate": "2022-10-15",
					"deloyDays": 1,
					"deloyMonth": 1,
					"accountPeriod": 5,
					"accountPeriodUnitId": "0",
					"accountComfirmWay": "0",
					"fixedAccountDate": "34",
					"fixedAccountDate1": "2",
					"fixedAccountDate2": "1",
					"fixedAccountDate3": "1",
					"fixedAccountDate4": "1",
					"expireComfirmWay": "0",
					"fixedExpireDate": "34",
					"fixedExpireDate1": "1",
					"fixedExpireDate2": "1",
					"fixedExpireDate3": "1",
					"fixedExpireDate4": "1",
					"blnRetentionAmountFlag": false,
					"blnAdvancedPaymentFlag": false,
					"effectiveDate": "2022-10-15",
					"dueDate": "2022-10-28",
					"_status": "Insert",
					"blnDiscountIncluded": true,
					"collectionStartDate": "",
					"collectionEndDate": "",
					"oriNoTaxAmount": 0,
					"taxAmount": 0
				}
			],
			"rclCriticalEventList": [
				{
					"idx": 2,
					"eventCode": "333",
					"eventContent": "333",
					"remarks": "33231",
					"_status": "Insert"
				}
			],
			"rclPeriodPlanList": [
				{
					"rowNo": 1,
					"calculateRuleId": "1628668400748724227",
					"calculateRuleCode": "1111",
					"periodId": "1556256609240350727",
					"periodCode": "2022-01",
					"currPeriodConfirmProportion": 60,
					"orimnyNotaxCurrent": 1000,
					"orimnyCurrent": 2000,
					"orimnyTaxCurrent": 500,
					"businessDate": "2023-02-01",
					"_status": "Insert",
					"accBook": "111"
				}
			],
			"rclPeriodExecuteSituationList": [
				{
					"rowNo": 1,
					"materialTypeId": 1539617287450919000,
					"materialId": 1526402386049368000,
					"projectId": "1607837087783976969",
					"periodId": 1556256609240350727,
					"progress": 80,
					"blnCheck": false,
					"sendQuantityCurrent": 100,
					"invoiceQuantityCurrent": 80,
					"orimnyInvoiceNotaxCurrent": 100,
					"orimnyInvoiceCurrent": 120,
					"orimnyInvoiceTaxCurrent": 20,
					"localmnyInvoiceNotaxCurrent": 100,
					"localmnyInvoiceCurrent": 120,
					"localmnyInvoiceTaxCurrent": 20,
					"localmnyCollectionNotaxCurrent": 100,
					"localmnyCollectionCurrent": 120,
					"localmnyCollectionTaxCurrent": 20,
					"orimnyRevenueNotaxCurrent": 100,
					"orimnyRevenueCurrent": 120,
					"orimnyRevenueTaxCurrent": 20,
					"localmnyRevenueNotaxCurrent": 100,
					"localmnyRevenueCurrent": 120,
					"localmnyRevenueTaxCurrent": 20,
					"orimnyReceivableNotaxCurrent": 100,
					"orimnyReceivableCurrent": 120,
					"orimnyReceivableTaxCurrent": 20,
					"localmnyReceivableNotaxCurrent": 100,
					"localmnyReceivableCurrent": 120,
					"localmnyReceivableTaxCurrent": 20,
					"currentProcess": 70,
					"sendQuantityTotal": 80,
					"invoiceQuantityTotal": 100,
					"orimnyInvoiceNotaxTotal": 100,
					"orimnyInvoiceTotal": 120,
					"orimnyInvoiceTaxTotal": 20,
					"localmnyInvoiceNotaxTotal": 100,
					"localmnyInvoiceTotal": 120,
					"localmnyInvoiceTaxTotal": 20,
					"orimnyCollectionNotaxTotal": 100,
					"orimnyCollectionTotal": 120,
					"orimnyCollectionTaxTotal": 20,
					"localmnyCollectionNotaxTotal": 100,
					"localmnyCollectionTotal": 120,
					"localmnyCollectionTaxTotal": 20,
					"orimnyRevenueNotaxTotal": 100,
					"orimnyRevenueTotal": 120,
					"orimnyRevenueTaxTotal": 20,
					"localmnyRevenueNotaxTotal": 100,
					"localmnyRevenueTotal": 120,
					"localmnyRevenueTaxTotal": 20,
					"orimnyReceivableNotaxTotal": 100,
					"orimnyReceivableTotal": 120,
					"orimnyReceivableTaxTotal": 20,
					"localmnyReceivableNotaxTotal": 100,
					"localmnyReceivableTotal": 120,
					"localmnyReceivableTaxTotal": 20,
					"blnStartFlag": true,
					"orimnyDeferrevenueCurrent": 100,
					"orimnyDeferrevenueTotal": 120,
					"orimnyDeferrevenueNotaxTotal": 100,
					"orimnyDeferrevenueTaxTotal": 20,
					"localmnyDeferrevenueTaxTotal": 20,
					"orimnyDeferrevenueTaxCurrent": 20,
					"orimnyDeferrevenueNotaxCurrent": 100,
					"localmnyDeferrevenueNotaxCurrent": 100,
					"localmnyDeferrevenueCurrent": 120,
					"localmnyDeferrevenueTotal": 100,
					"localmnyDeferrevenueTaxCurrent": 120,
					"localmnyDeferrevenueNotaxTotal": 100,
					"settlementQuantityCurrent": 20,
					"orimnySettlementNotaxCurrent": 100,
					"orimnySettlementCurrent": 120,
					"orimnySettlementTaxCurrent": 20,
					"localmnySettlementNotaxCurrent": 100,
					"localmnySettlementCurrent": 120,
					"localmnySettlementTaxCurrent": 20,
					"settlementQuantityTotal": 100,
					"orimnySettlementNotaxTotal": 100,
					"orimnySettlementTotal": 120,
					"orimnySettlementTaxTotal": 100,
					"localmnySettlementNotaxTotal": 120,
					"localmnySettlementTotal": 100,
					"localmnySettlementTaxTotal": 20,
					"localmnyScheduleNotaxCurrent": 100,
					"localmnyScheduleTaxTotal": 120,
					"orimnyScheduleNotaxCurrent": 100,
					"localmnyScheduleTaxCurrent": 20,
					"localmnyScheduleNotaxTotal": 100,
					"localmnyScheduleCurrent": 120,
					"orimnyScheduleCurrent": 120,
					"localmnyScheduleTotal": 120,
					"orimnyScheduleNotaxTotal": 100,
					"orimnyScheduleTaxCurrent": 20,
					"orimnyScheduleTotal": 100,
					"orimnyScheduleTaxTotal": 20,
					"orimnySettlementCurrentSaved": 120,
					"localmnyCollectionTotalSaved": 120,
					"localmnySettlementTotalSaved": 100,
					"localmnyCollectionCurrentSaved": 100,
					"localmnySignTotal": 120,
					"localmnyRevenueTaxCurrentSaved": 20,
					"localmnyRevenueCurrentSaved": 120,
					"orimnySignTotal": 120,
					"orimnyCollectionTotalSaved": 120,
					"orimnyRevenueTaxTotalSaved": 20,
					"localmnyRevenueTaxTotalSaved": 20,
					"localmnySignNotaxCurrent": 100,
					"signQuantityCurrent": 10,
					"localmnyRevenueNotaxCurrentSaved": 100,
					"signQuantityCurrentSaved": 20,
					"orimnySignTaxCurrent": 100,
					"settlementQuantityCurrentSaved": 20,
					"orimnyCollectionTaxCurrent": 20,
					"orimnySettlementTotalSaved": 120,
					"orimnySignTotalSaved": 120,
					"orimnyCollectionCurrentSaved": 100,
					"signQuantityTotal": 80,
					"orimnySignNotaxTotal": 100,
					"localmnySignCurrent": 120,
					"orimnyRevenueTotalSaved": 100,
					"localmnySignTaxTotal": 20,
					"orimnyCollectionCurrent": 120,
					"localmnyRevenueNotaxTotalSaved": 100,
					"localmnySignTotalSaved": 100,
					"orimnySignCurrentSaved": 120,
					"localmnySignTaxCurrent": 20,
					"orimnySignTaxTotal": 20,
					"orimnyRevenueNotaxTotalSaved": 100,
					"localmnySignCurrentSaved": 120,
					"orimnySignNotaxCurrent": 100,
					"localmnySignNotaxTotal": 100,
					"settlementQuantityTotalSaved": 20,
					"localmnySettlementCurrentSaved": 120,
					"orimnySignCurrent": 100,
					"localmnyRevenueTotalSaved": 120,
					"orimnyCollectionNotaxCurrent": 100,
					"signQuantityTotalSaved": 10,
					"orimnyRevenueCurrentSaved": 120,
					"localmnySignNotaxCurrentSaved": 100,
					"orimnyRevenueNotaxCurrentSaved": 100,
					"orimnyRevenueTaxCurrentSaved": 20,
					"_status": "Insert",
					"expectCost": 0,
					"totalCost": 0,
					"expectDebt": 0,
					"totalCarryForwardCost": 0,
					"totalCarryForwardCostSave": 0,
					"totalConfirmLoss": 0,
					"totalConfirmLossSave": 0,
					"curCarryForwardCost": 0,
					"curCarryForwardCostSave": 0,
					"curConfirmLoss": 0,
					"curConfirmLossSave": 0,
					"accBook": "111"
				}
			],
			"isAsync": false
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
| data | object | 否 | 后端返回data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 记录数 示例：5 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数 示例：3 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数 示例：2 |
| messages | object | 是 | 失败原因 示例：{ "sourceUnique":"数据唯一标识", "message":"错误数据描述" } |
| infos | object | 是 | 数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 5,
		"sucessCount": 3,
		"failCount": 2,
		"messages": [
			{
				"sourceUnique": "数据唯一标识",
				"message": "错误数据描述"
			}
		],
		"infos": [
			{
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
				"rclContractReceiptPlanList": {
					"fixedExpireDate1": "0",
					"fixedExpireDate2": "0",
					"fixedExpireDate3": "0",
					"fixedExpireDate4": "0",
					"expireComfirmWay": "0",
					"dueDate": "2023-02-03",
					"blnRetentionAmountFlag": false,
					"accountPeriod": 30,
					"dr": 0,
					"accountPeriodUnitId": "不设起算日、到期日",
					"startTimeId": "不设起算日、到期日",
					"id": "1628821215692455944",
					"settleModeId": "1608684167017005057",
					"metaFullName": "RCL.RCL.rclContractReceiptPlan",
					"oriAmount": 5000,
					"deloyMonth": 0,
					"ytenantId": "0000LBC4W3H13EZ4LE0000",
					"_status": 0,
					"startDate": "2023-01-04",
					"rowNo": 0,
					"blnAdvancedPaymentFlag": false,
					"deloyDays": 0,
					"rclRevenuecontractBaseId": "1628821215692455937",
					"baseInfoId": "1628821215692455942",
					"pubts": "2023-01-04 16:09:06",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"oriReceiveAmount": 0,
					"fixedAccountDate1": "0",
					"fixedAccountDate2": "0",
					"fixedAccountDate3": "0",
					"fixedAccountDate4": "0",
					"accountComfirmWay": "0",
					"createTime": "2023-01-04 16:09:06",
					"effectiveDate": "2023-01-04",
					"ratio": 5
				},
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
				],
				"data": {
					"sourceUnique": "15489875421215",
					"targetUnique": "15454811234565"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	保存错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-21

更新

请求说明

新增

请求参数 accBook

新增

请求参数 accBook

更新

请求参数 (35)

更新

返回参数 (8)

2	2025-09-10

新增

请求参数 exchRateOps

新增

请求参数 exchRateOps

新增

请求参数 chargeOffMethod

3	2025-07-08

新增

请求参数 (17)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

