---
title: "履约义务变更"
apiId: "1580586800211034116"
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

# 履约义务变更

> `ContentType	application/json` 请求方式	POST | 分类: Fulfillment Obligation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/fiercl/revenuecontract/update

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
| data | object | 是 | 是 | 入参 |
| accentity | string | 否 | 否 | 会计主体id 示例：1525772228455038981 |
| accentity_code | string | 否 | 是 | 会计主体编码 示例：1208 |
| id | string | 否 | 是 | 主表id 示例：1628654459275444227 |
| name | string | 否 | 是 | 名称 示例：名称 |
| parentId | string | 否 | 否 | 上级履约义务id 示例：上级履约义务 |
| parentCode | string | 否 | 否 | 上级履约义务code 示例：RECON20230211020232 |
| billDate | string | 否 | 是 | 单据日期 示例：2022-10-13 |
| orimnyNotax | BigDecimal | 否 | 是 | 无税金额 示例：0.0 |
| orimnyTax | BigDecimal | 否 | 否 | 税额 示例：0.0 |
| orimny | BigDecimal | 否 | 是 | 含税金额 示例：0.0 |
| exchangeRateType | string | 否 | 否 | 汇率类型id(id和code必输其一,同时输入,id优先) 示例：0000L6YQ8AVLFUZPXD0000 |
| exchangeRateType_code | string | 否 | 否 | 汇率类型code(id和code必输其一,同时输入,id优先) 示例：01 |
| exchangeRateDate | string | 否 | 是 | 汇率日期 示例：2022-10-13 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| localmnyNotax | BigDecimal | 否 | 是 | 本币无税金额 示例：100.0 |
| localmny | BigDecimal | 否 | 是 | 本币含税金额 示例：100.0 |
| localmnyTax | BigDecimal | 否 | 否 | 本币税额 示例：200.0 |
| signDate | string | 否 | 是 | 签订日期 示例：2022-10-13 |
| thirdPartId | long | 否 | 否 | 第三方主体id 示例：1471403105020018693 |
| thirdPartCode | string | 否 | 否 | 第三方主体code 示例：0001000001 |
| deptId | string | 否 | 否 | 部门id 示例：1525655517005348867 |
| deptCode | string | 否 | 否 | 部门code 示例：bu1 |
| employee | string | 否 | 否 | 人员id 示例：1563528487077150729 |
| employee_code | string | 否 | 否 | 人员code 示例：00000001 |
| signOrgId | string | 否 | 否 | 签约组织id 示例：1556193765280972809 |
| signOrgCode | string | 否 | 否 | 签约组织code 示例：1208 |
| blnOpenContract | boolean | 否 | 否 | 是否敞口(true--是;false--否) 示例：false 默认值：false |
| version | BigDecimal | 否 | 是 | 版本号 示例：2 |
| srcBillVersion | BigDecimal | 否 | 是 | 来源单据版本号 示例：2 |
| financeCompFlag | boolean | 否 | 否 | 融资成分标识(true--是;false--否) 示例：false 默认值：false |
| receiveAgreementId | string | 否 | 否 | 收款协议id 示例：1617551960236883977 |
| receiveAgreementCode | string | 否 | 否 | 收款协议code 示例：00000004 |
| pubts | DateTime | 否 | 否 | 时间戳 示例：2023-01-10 14:51:11 |
| receiptPlanDimension | string | 否 | 否 | 收款计划维度(0：履约义务；1：履约义务行) 示例：0 默认值：0 |
| extSrcSystem | string | 否 | 否 | 来源单据系统(外) 示例：结算信息 |
| extSrcBillCode | string | 否 | 否 | 来源单据编码(外) 示例：test1 |
| _status | string | 否 | 是 | 接口类型(Update) 示例：Update 默认值：Update |
| rclContractBaseInfoList | object | 是 | 否 | 基本信息子实体 |
| rclContractReceiptPlanList | object | 是 | 否 | 收款计划子实体 |
| rclReceiptPlanList | object | 是 | 否 | 收款计划明细子实体 |
| rclContractChangeList | object | 是 | 是 | 变更历史子实体 |
| rclCriticalEventList | object | 是 | 否 | 大事记子实体 |
| externalData | object | 否 | 否 | 扩展参数 |
| isAsync | boolean | 否 | 否 | 是否异步 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/AMP/fiercl/revenuecontract/update?access_token=访问令牌
Body: {
	"data": [
		{
			"accentity": "1525772228455038981",
			"accentity_code": "1208",
			"id": "1628654459275444227",
			"name": "名称",
			"parentId": "上级履约义务",
			"parentCode": "RECON20230211020232",
			"billDate": "2022-10-13",
			"orimnyNotax": 0,
			"orimnyTax": 0,
			"orimny": 0,
			"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
			"exchangeRateType_code": "01",
			"exchangeRateDate": "2022-10-13",
			"exchRateOps": NaN,
			"exchangeRate": 1,
			"localmnyNotax": 100,
			"localmny": 100,
			"localmnyTax": 200,
			"signDate": "2022-10-13",
			"thirdPartId": 1471403105020018693,
			"thirdPartCode": "0001000001",
			"deptId": "1525655517005348867",
			"deptCode": "bu1",
			"employee": "1563528487077150729",
			"employee_code": "00000001",
			"signOrgId": "1556193765280972809",
			"signOrgCode": "1208",
			"blnOpenContract": false,
			"version": 2,
			"srcBillVersion": 2,
			"financeCompFlag": false,
			"receiveAgreementId": "1617551960236883977",
			"receiveAgreementCode": "00000004",
			"pubts": "2023-01-10 14:51:11",
			"receiptPlanDimension": "0",
			"extSrcSystem": "结算信息",
			"extSrcBillCode": "test1",
			"_status": "Update",
			"rclContractBaseInfoList": [
				{
					"id": "1633297155701080077",
					"rowNo": 1,
					"materialTypeId": 1539617287450919000,
					"materialTypeCode": "000001",
					"materialId": 1526402386049368000,
					"materialCode": "000001",
					"projectId": "项目Id",
					"projectCode": "项目编码",
					"wbs": "WBSID",
					"wbsCode": "WBS编码",
					"costCenterId": 1556810883353018400,
					"costCenterCode": "0001",
					"procenterId": "1526217092562944002",
					"procenterCode": "1208",
					"oppProcenterId": "1540512453146181634",
					"oppProcenterCode": "1208",
					"receiveAgreementId": 1550263660986237000,
					"receiveAgreementCode": "00000004",
					"expenseItemId": 1550263660986237000,
					"expenseItemCode": "00001",
					"financeCompFlag": false,
					"incomeConfirmRule1": 1593241680834199559,
					"incomeConfirmRule1_code": "1111",
					"incomeConfirmRule2": "1593241680834199559",
					"incomeConfirmRule2_code": "1111",
					"incomeConfirmRule3": "1593241680834199559",
					"incomeConfirmRule3_code": "1111",
					"incomeConfirmRule4": "1593241680834199559",
					"incomeConfirmRule4_code": "1111",
					"incomeConfirmRule5": "1593241680834199559",
					"incomeConfirmRule5_code": "1111",
					"tradeConfirmRule1": 1593246894930788354,
					"tradeConfirmRule1_code": "AR001",
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
					"exchRateOps": NaN,
					"exchangeRate": 1,
					"exchangeRateDate": "2022-10-13",
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
					"expectedGrossProfit": 3.45,
					"expProfitMargin": 5.45,
					"chargeOffMethod": NaN,
					"preSubmissionIncomeRule_code": "R006",
					"preSubmissionIncomeRule": "163323184643110581",
					"localFinanceIncome": 0,
					"leaseIncentiveAmount": 0,
					"interestAccrualAlgorithm": "枚举值：1-(期初净投资余额-收款原值)*期折现率 2-期初净投资余额*期折现率",
					"rentStartDate": "2025-07-08",
					"discountPeriodsStartFromZero": true,
					"periodDiscountRateMethod": "3-月复利 4-月单利",
					"annualDiscountRate": 0,
					"accBook": "123463875893675836"
				}
			],
			"rclContractReceiptPlanList": [
				{
					"id": "1633231846435717126",
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
					"dueDate": "2022-10-28",
					"paymentType": "1633231846435717126",
					"paymentTypeCode": "0001",
					"_status": "Insert",
					"blnDiscountIncluded": true,
					"collectionStartDate": "2025-07-08",
					"collectionEndDate": "2025-07-30",
					"oriNoTaxAmount": 0,
					"taxAmount": 0
				}
			],
			"rclReceiptPlanList": [
				{
					"id": "1633231846435717126",
					"rowNo": 1,
					"issueNo": 1,
					"financeName": "2/8",
					"ratio": 5,
					"oriAmount": 500,
					"oriReceiveAmount": 400,
					"settleModeId": 1525649083156923163,
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
					"dueDate": "2022-10-28",
					"pubts": "2023-01-10 14:46:51",
					"paymentType": "1633231846435717126",
					"paymentTypeCode": "0001",
					"_status": "Insert",
					"blnDiscountIncluded": true,
					"collectionStartDate": "2025-07-08",
					"collectionEndDate": "2025-07-30",
					"oriNoTaxAmount": 0,
					"taxAmount": 0
				}
			],
			"rclContractChangeList": [
				{
					"version": 2,
					"modifyReason": "变更原因",
					"blnTraceAdjust": true,
					"contractModifier": "47a6d56e-27bb-4eb0-a97b-ce267bec37a2",
					"contractModifyTime": "2023-12-04",
					"_status": "Insert",
					"accBook": "123463875893675836"
				}
			],
			"rclCriticalEventList": [
				{
					"id": "1633231846435717128",
					"eventCode": "333",
					"eventContent": "333",
					"remarks": "33231",
					"pubts": "2023-01-10 14:46:51",
					"_status": "Insert"
				}
			]
		}
	],
	"externalData": {
		"isAsync": false
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
| busiObj | string | 否 | 业务对象 示例：rclRevenueContract |
| contractType | string | 否 | 交易类型id 示例：1607403021234340397 |
| modifier | string | 否 | 修改人 示例：e73dba5f-bb3a-4e36-8c64-9efc3a1d6012 |
| signDate | string | 否 | 签订日期 示例：2023-01-11 |
| employee | string | 否 | 人员id 示例：1610102914976055299 |
| accentity | string | 否 | 会计主体id 示例：1607417838875705352 |
| dr | short | 否 | 逻辑删除(0--正常;1--已删除) 示例：0 |
| modifyTime | string | 否 | 修改时间 示例：2023-01-11 18:43:23 |
| exchangeRate | BigDecimal | 否 | 汇率 示例：1 |
| id | string | 否 | 主表id 示例：1634099335336558601 |
| metaFullName | string | 否 | 元数据全名称 示例：RCL.RCL.rclRevenueContract |
| orimny | BigDecimal | 否 | 含税金额 示例：1130 |
| deptId | string | 否 | 部门id 示例：1607428095257608197 |
| billDate | string | 否 | 单据日期 示例：2023-01-11 |
| ytenantId | string | 否 | 租户id 示例：0000LBC4W3H13EZ4LE0000 |
| version | BigDecimal | 否 | 版本号 示例：2 |
| blnOpenContract | boolean | 否 | 是否敞口(true-是;false-否) 示例：false |
| verifyState | short | 否 | 单据状态 示例：0 |
| financeCompFlag | boolean | 否 | 融资成分标识(true-是;false-否) 示例：false |
| auditTime | string | 否 | 审批日期 示例：2023-01-11 18:43:15 |
| name | string | 否 | 名称 示例：openApiSunTest |
| localmnyTax | BigDecimal | 否 | 本币税额 示例：130 |
| localmny | BigDecimal | 否 | 本币含税金额 示例：1130 |
| projectId | string | 否 | 项目 示例：1607837087783976969 |
| srcSystem | string | 否 | 单据来源系统 示例：收入合同台账 |
| code | string | 否 | 单据编号 示例：RECON20230111007190 |
| currType | string | 否 | 币种 示例：1607403072771850274 |
| cBillNo | string | 否 | 单据编码 示例：rclRevenueContract |
| orimnyNotax | BigDecimal | 否 | 无税金额 示例：1000 |
| orimnyTax | BigDecimal | 否 | 税额 示例：130 |
| originId | string | 否 | 原始版本 示例：1634095658844553225 |
| blnLatest | boolean | 否 | 最新版本(true-是;false-否) 示例：true |
| customerId | string | 否 | 客户 示例：1607427184715628553 |
| pubts | string | 否 | 时间戳 示例：2023-01-11 18:50:01 |
| billTypeId | string | 否 | 单据类型 示例：1570189715179044871 |
| effectDate | string | 否 | 生效日期 示例：2023-01-11 |
| creator | string | 否 | 创建人 示例：e73dba5f-bb3a-4e36-8c64-9efc3a1d6012 |
| localmnyNotax | BigDecimal | 否 | 本币无税金额 示例：1000 |
| blnStartFlag | boolean | 否 | 期初标识(true-是;false-否) 示例：false |
| auditor | string | 否 | 审批人 示例：e73dba5f-bb3a-4e36-8c64-9efc3a1d6012 |
| fullName | string | 否 | 全名称 示例：RCL.RCL.rclRevenueContract |
| bustype | string | 否 | 交易类型 示例：1607403021234340397 |
| parentId | string | 否 | 上级履约义务 示例：1633956252789768196 |
| blnCheck | boolean | 否 | 是否验收(财务) 示例：false |
| exchangeRateType | string | 否 | 汇率类型 示例：0000LBC4W3H13EZ4LE0000 |
| exchangeRateDate | string | 否 | 汇率日期 示例：2023-01-11 |
| createTime | string | 否 | 创建时间 示例：2023-01-11 18:38:54 |
| thirdPartId | string | 否 | 第三方主体id 示例：1609385809968365574 |
| contractCode | string | 否 | 合同号 示例：202301111939 |
| rclContractBaseInfoList | object | 是 | 基本信息子表 |
| rclContractReceiptPlanList | object | 是 | 收款计划 |
| rclReceiptPlanList | object | 是 | 收款计划子表 |
| rclPeriodPlanList | object | 是 | 分期收入计划子表 |
| rclExecuteSituationList | object | 是 | 执行情况子表 |
| rclPeriodExecuteSituationList | object | 是 | 分期执行情况子表 |
| rclExcuteStepList | object | 是 | 执行过程子表 |
| rclAppointRecordList | object | 是 | 合同履约记录子表 |
| rclCriticalEventList | object | 是 | 大事记子表 |
| rclContractChangeList | object | 是 | 变更历史子表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "rclRevenueContract",
		"contractType": "1607403021234340397",
		"modifier": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
		"signDate": "2023-01-11",
		"employee": "1610102914976055299",
		"accentity": "1607417838875705352",
		"dr": 0,
		"modifyTime": "2023-01-11 18:43:23",
		"exchangeRate": 1,
		"id": "1634099335336558601",
		"metaFullName": "RCL.RCL.rclRevenueContract",
		"orimny": 1130,
		"deptId": "1607428095257608197",
		"billDate": "2023-01-11",
		"ytenantId": "0000LBC4W3H13EZ4LE0000",
		"version": 2,
		"blnOpenContract": false,
		"verifyState": 0,
		"financeCompFlag": false,
		"auditTime": "2023-01-11 18:43:15",
		"name": "openApiSunTest",
		"localmnyTax": 130,
		"localmny": 1130,
		"projectId": "1607837087783976969",
		"srcSystem": "收入合同台账",
		"code": "RECON20230111007190",
		"currType": "1607403072771850274",
		"cBillNo": "rclRevenueContract",
		"orimnyNotax": 1000,
		"orimnyTax": 130,
		"originId": "1634095658844553225",
		"blnLatest": true,
		"customerId": "1607427184715628553",
		"pubts": "2023-01-11 18:50:01",
		"billTypeId": "1570189715179044871",
		"effectDate": "2023-01-11",
		"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
		"localmnyNotax": 1000,
		"blnStartFlag": false,
		"auditor": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
		"fullName": "RCL.RCL.rclRevenueContract",
		"bustype": "1607403021234340397",
		"parentId": "1633956252789768196",
		"blnCheck": false,
		"exchangeRateType": "0000LBC4W3H13EZ4LE0000",
		"exchangeRateDate": "2023-01-11",
		"createTime": "2023-01-11 18:38:54",
		"thirdPartId": "1609385809968365574",
		"contractCode": "202301111939",
		"rclContractBaseInfoList": [
			{
				"expenseItemId": "1608642033386258437",
				"endDate": "2023-01-31",
				"localmny": 1130,
				"incomeConfirmRule1": "1593241680834199559",
				"standardCurr": "1607403072771850274",
				"receiveAgreementId": "1617551960236883977",
				"dr": 0,
				"exchangeRate": 1,
				"id": "1634099335336558608",
				"metaFullName": "RCL.RCL.rclContractBaseInfo",
				"tradeConfirmRule1": "1593247564945686529",
				"localUnitprice": 113,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"materialId": "1607839252471611399",
				"financeCompFlag": false,
				"taxRate": 13,
				"localUnitpriceNotax": 100,
				"localmnyTax": 130,
				"projectId": "1607837087783976969",
				"rowNo": 1,
				"exchangeRatetype": "0000LBC4W3H13EZ4LE0000",
				"materialTypeId": "1607432476115337218",
				"taxItem": "1607403072771850289",
				"orimnyNotax": 1000,
				"rclRevenuecontractBaseId": "1634099335336558601",
				"apportionNum": "2",
				"orimnyTax": 130,
				"costCenterId": "1609384650402693123",
				"taxRateEntity": "1607403072771850289",
				"unitId": "1607434176922386433",
				"currency": "1607403072771850274",
				"pubts": "2023-01-11 18:50:00",
				"orimny": 1130,
				"procenterId": "1607417838875705352",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"quantity": 10,
				"oriUnitprice": 113,
				"localmnyNotax": 1000,
				"financeIncome": 1000,
				"originBaseId": "1634095658844553230",
				"oppProcenterId": "1607417838875705352",
				"beginDate": "2023-01-11",
				"exchangeRateDate": "2023-01-11",
				"oriUnitpriceNotax": 100,
				"createTime": "2023-01-11 18:50:00"
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
				"modifier": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"blnRetentionAmountFlag": false,
				"accountPeriod": 30,
				"financeName": "2/8",
				"dr": 0,
				"accountPeriodUnitId": "0",
				"modifyTime": "2023-01-11 18:50:01",
				"startTimeId": "不设起算日、到期日",
				"id": "1634099335336558613",
				"settleModeId": "1608684167017005057",
				"metaFullName": "RCL.RCL.rclReceiptPlanBase",
				"oriAmount": 226,
				"deloyMonth": 0,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"materialId": "1607839252471611399",
				"taxRate": 13,
				"projectId": "1607837087783976969",
				"rowNo": 1,
				"fixedExpireDate": "0",
				"blnAdvancedPaymentFlag": false,
				"materialTypeId": "1607432476115337218",
				"deloyDays": 0,
				"fixedAccountDate": "0",
				"rclRevenuecontractBaseId": "1634099335336558601",
				"issueNo": 1,
				"baseInfoId": "1634099335336558608",
				"dateId": "1617551960236883978",
				"pubts": "2023-01-11 18:50:02",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"oriReceiveAmount": 0,
				"fixedAccountDate4": "0",
				"fixedAccountDate3": "0",
				"accountComfirmWay": "0",
				"fixedAccountDate2": "0",
				"fixedAccountDate1": "0",
				"createTime": "2023-01-11 18:50:00",
				"ratio": 20
			}
		],
		"rclPeriodPlanList": [
			{
				"calculateRuleId": "1593241680834199559",
				"dr": 0,
				"exchangeRate": 1,
				"localmnyCurrent": 113,
				"confirmStatus": "1",
				"id": "1634099335336558604",
				"metaFullName": "RCL.RCL.rclPeriodPlan",
				"orderNo": 1,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"materialId": "1607839252471611399",
				"version": 1,
				"localmnyNotaxCurrent": 100,
				"taxRate": 13,
				"triggerEvent": "2",
				"orimnyTaxTotal": 13,
				"projectId": "1607837087783976969",
				"srcSystem": "收入合同",
				"localmnyTaxCurrent": 13,
				"blnWriteBack": false,
				"rowNo": 1,
				"exchangeRatetype": "0000LBC4W3H13EZ4LE0000",
				"materialTypeId": "1607432476115337218",
				"postStatus": "4",
				"rclRevenuecontractBaseId": "1634099335336558601",
				"businessDate": "2023-01-11 00:00:00",
				"orimnyTaxCurrent": 13,
				"originId": "1634095658844553228",
				"orimnyNotaxCurrent": 100,
				"orimnyCurrent": 113,
				"pubts": "2023-01-11 18:50:00",
				"periodId": "1607962045562486793",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"currPeriodConfirmProportion": 10,
				"orimnyNotaxTotal": 100,
				"exchangeRateDate": "2023-01-11",
				"createTime": "2023-01-11 18:50:00",
				"performProgress": 10,
				"orimnyTotal": 113
			}
		],
		"rclExecuteSituationList": [
			{
				"withouttaxToConfirmIncome": 900,
				"withtaxToreceiveAmount": 1130,
				"withtaxToinvoiceAmount": 1130,
				"totalConfirmtax": 13,
				"oriWithouttaxToinvoiceAmount": 1000,
				"withtaxInvoicedAmount": 0,
				"oriWithtaxTotalReceivable": 113,
				"oriToConfirmTax": 117,
				"oriWithtaxToConfirmReceivable": 1017,
				"dr": 0,
				"withouttaxToreceiveAmount": 1000,
				"oriWithouttaxTotalConfirmincome": 100,
				"withtaxToConfirmIncome": 1017,
				"toConfirmTax": 117,
				"oriWithtaxReceivedAmount": 0,
				"oriToreceiveTaxAmount": 130,
				"oriWithouttaxToConfirmIncome": 900,
				"id": "1634099335336558602",
				"oriTotalConfirmtax": 13,
				"oriToConfirmReceivableTax": 117,
				"invoicedTaxAmount": 0,
				"withouttaxReceivedAmount": 0,
				"metaFullName": "RCL.RCL.rclExecuteSituation",
				"sendQuantity": 0,
				"withouttaxToConfirmReceivable": 900,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"materialId": "1607839252471611399",
				"oriWithouttaxReceivedAmount": 0,
				"withouttaxTotalConfirmincome": 100,
				"toinvoiceTaxAmount": 130,
				"oriReceivedTaxAmount": 0,
				"oriWithouttaxToreceiveAmount": 1000,
				"withouttaxToinvoiceAmount": 1000,
				"oriTotalReceivabletax": 13,
				"oriInvoicedQuantity": 0,
				"projectId": "1607837087783976969",
				"oriToinvoiceTaxAmount": 130,
				"oriToinvoiceQuantity": 10,
				"toConfirmReceivableTax": 117,
				"rowNo": 1,
				"oriWithtaxToreceiveAmount": 1130,
				"materialTypeId": "1607432476115337218",
				"performanceProgress": 10,
				"withouttaxTotalReceivable": 100,
				"rclRevenuecontractBaseId": "1634099335336558601",
				"oriWithtaxToinvoiceAmount": 1130,
				"withouttaxInvoicedAmount": 0,
				"oriWithtaxToConfirmIncome": 1017,
				"oriWithtaxInvoicedAmount": 0,
				"totalReceivabletax": 13,
				"pubts": "2023-01-11 18:50:00",
				"withtaxReceivedAmount": 0,
				"withtaxTotalConfirmincome": 113,
				"toSendQuantity": 10,
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"oriWithtaxTotalConfirmincome": 113,
				"receivedTaxAmount": 0,
				"toreceiveTaxAmount": 130,
				"createTime": "2023-01-11 18:50:00",
				"oriWithouttaxToConfirmReceivable": 900,
				"oriWithouttaxTotalReceivable": 100,
				"withtaxTotalReceivable": 113,
				"withtaxToConfirmReceivable": 1017,
				"oriWithouttaxInvoicedAmount": 0,
				"oriInvoicedTaxAmount": 0
			}
		],
		"rclPeriodExecuteSituationList": [
			{
				"localmnyCollectionTaxCurrent": 0,
				"localmnyCollectionTotal": 0,
				"dr": 0,
				"orimnyInvoiceTaxCurrent": 0,
				"localmnyCollectionNotaxTotal": 0,
				"localmnyRevenueTaxCurrent": 13,
				"orimnyReceivableTotal": 113,
				"orimnyRevenueCurrent": 113,
				"id": "1634099335336558605",
				"localmnyReceivableTotal": 113,
				"localmnyInvoiceTaxTotal": 0,
				"metaFullName": "RCL.RCL.rclPeriodExecuteSituation",
				"orimnyReceivableTaxCurrent": 13,
				"orimnyInvoiceTaxTotal": 0,
				"localmnyRevenueNotaxCurrent": 100,
				"orimnyCollectionTaxTotal": 0,
				"localmnyReceivableNotaxTotal": 100,
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"materialId": "1607839252471611399",
				"localmnyRevenueTaxTotal": 13,
				"localmnyRevenueCurrent": 113,
				"excludedReceive": 0,
				"invoiceQuantityTotal": 0,
				"orimnyRevenueTotal": 113,
				"projectId": "1607837087783976969",
				"localmnyReceivableNotaxCurrent": 100,
				"rowNo": 1,
				"sendQuantityTotal": 0,
				"localmnyInvoiceTotal": 0,
				"localmnyCollectionCurrent": 0,
				"orimnyRevenueTaxCurrent": 13,
				"orimnyCollectionTotal": 0,
				"materialTypeId": "1607432476115337218",
				"localmnyRevenueTotal": 113,
				"includedReceive": 0,
				"localmnyInvoiceCurrent": 0,
				"rclRevenuecontractBaseId": "1634099335336558601",
				"localmnyInvoiceNotaxTotal": 0,
				"orimnyCollectionNotaxTotal": 0,
				"localmnyCollectionTaxTotal": 0,
				"localmnyReceivableTaxTotal": 13,
				"localmnyReceivableCurrent": 113,
				"excludedReceiveTax": 0,
				"sendQuantityCurrent": 0,
				"localmnyCollectionNotaxCurrent": 0,
				"pubts": "2023-01-11 18:50:00",
				"orimnyInvoiceNotaxCurrent": 0,
				"periodId": "1607962045562486793",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"orimnyRevenueNotaxCurrent": 100,
				"orimnyInvoiceTotal": 0,
				"localmnyRevenueNotaxTotal": 100,
				"blnStartFlag": false,
				"orimnyRevenueTaxTotal": 13,
				"orimnyRevenueNotaxTotal": 100,
				"invoiceQuantityCurrent": 0,
				"orimnyReceivableNotaxCurrent": 100,
				"localmnyInvoiceNotaxCurrent": 0,
				"orimnyReceivableNotaxTotal": 100,
				"orimnyInvoiceCurrent": 0,
				"localmnyInvoiceTaxCurrent": 0,
				"orimnyReceivableCurrent": 113,
				"createTime": "2023-01-11 18:50:00",
				"orimnyReceivableTaxTotal": 13,
				"progress": 10,
				"localmnyReceivableTaxCurrent": 13,
				"orimnyInvoiceNotaxTotal": 0
			}
		],
		"rclExcuteStepList": [
			{
				"execProcedure": "生效",
				"rclRevenuecontractBaseId": "1634099335336558601",
				"dr": 0,
				"id": "1634099335336558603",
				"pubts": "2023-01-11 18:50:00",
				"metaFullName": "RCL.RCL.rclExcuteStep",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"execDate": "2023-01-11",
				"createTime": "2023-01-11 18:50:00"
			}
		],
		"rclAppointRecordList": [
			{
				"taxIncludedSum": 113,
				"dr": 0,
				"exchangeRate": 1,
				"id": "1634099335336558611",
				"billNo": "RVN0220230111001872",
				"metaFullName": "RCL.RCL.rclAppointRecord",
				"srcBillId": "1634095985282514948",
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"materialId": "1607839252471611399",
				"taxAmount": 13,
				"projectId": "1607837087783976969",
				"businessOpe": "3",
				"exchangeRatetype": "0000LBC4W3H13EZ4LE0000",
				"oriTaxExcludedAmount": 100,
				"rclRevenuecontractBaseId": "1634099335336558601",
				"baseInfoId": "1634095658844553230",
				"businessDate": "2023-01-11",
				"oriTaxAmount": 13,
				"unitId": "1607434176922386433",
				"cBodyRowNo": 1,
				"currency": "1607403072771850274",
				"pubts": "2023-01-11 18:50:00",
				"oriTaxIncludedAmount": 113,
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"taxExcludedAmount": 100,
				"exchangeRateDate": "2023-01-11",
				"createTime": "2023-01-11 18:50:00",
				"contractCode": "202301111939",
				"billBodyId": "1634095985282514949"
			}
		],
		"rclCriticalEventList": [
			{
				"rclRevenuecontractBaseId": "1634099335336558601",
				"dr": 0,
				"id": "1634099335336558615",
				"pubts": "2023-01-11 18:50:00",
				"metaFullName": "RCL.RCL.rclCriticalEvent",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"eventContent": "大事记内容",
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"eventCode": "202301111842",
				"createTime": "2023-01-11 18:50:00",
				"idx": 2,
				"remarks": "备注"
			}
		],
		"rclContractChangeList": [
			{
				"contractModifier": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"blnTraceAdjust": false,
				"rclRevenuecontractBaseId": "1634099335336558601",
				"dr": 0,
				"id": "1634099335336558606",
				"pubts": "2023-01-11 18:50:00",
				"modifyReason": "初始版本",
				"metaFullName": "RCL.RCL.rclContractChange",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"version": 1,
				"createTime": "2023-01-11 18:50:00",
				"idx": 1
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

