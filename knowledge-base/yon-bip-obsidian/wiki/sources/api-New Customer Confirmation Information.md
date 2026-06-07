---
title: "客户确认信息新增"
apiId: "1820455105869119494"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Confirmation Information"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Confirmation Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户确认信息新增

> `ContentType	application/json` 请求方式	POST | 分类: Customer Confirmation Information (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/fiercl/recConfirmInfo/add

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
| accentity | string | 否 | 否 | 会计主体id 示例：1525652227072458756 |
| accentity_code | string | 否 | 是 | 会计主体编码 示例：xmhs |
| billDate | Date | 否 | 是 | 单据日期 示例：2023-09-19 |
| code | string | 否 | 否 | 单据编码(手动输入时为必填) 示例：SEI20230918002002 |
| customer | string | 否 | 否 | 客户id 示例：1526228774896533510 |
| customer_code | string | 否 | 是 | 客户编码 示例：00000000013470 |
| oriCurrtype | string | 否 | 否 | 币种id 示例：1525643705855773169 |
| oriCurrtype_code | string | 否 | 是 | 币种编码 示例：CNY |
| exchangeRateType | string | 否 | 否 | 汇率类型id 示例：0000L6YQ8AVLFUZPXD0000 |
| exchangeRateType_code | string | 否 | 否 | 汇率类型编码 示例：0000001 |
| exchangeRateDate | Date | 否 | 否 | 汇率日期 示例：2023-09-19 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| remarks | string | 否 | 否 | 备注 示例：备注 |
| _status | string | 否 | 是 | 接口状态(Insert-新增） 示例：Insert 默认值：Insert |
| extSrcSystems | string | 否 | 是 | 来源单据系统(外) 示例：履约义务信息 |
| extSrcBillCode | string | 否 | 是 | 来源单据编码(外) 示例：test1 |
| rclRecConfirmInfoBodyList | object | 是 | 是 | 客户确认信息子表 |
| externalData | object | 否 | 否 | 扩展参数 |
| isAsync | boolean | 否 | 否 | 是否异步 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/AMP/fiercl/recConfirmInfo/add?access_token=访问令牌
Body: {
	"data": {
		"accentity": "1525652227072458756",
		"accentity_code": "xmhs",
		"billDate": "2023-09-19",
		"code": "SEI20230918002002",
		"customer": "1526228774896533510",
		"customer_code": "00000000013470",
		"oriCurrtype": "1525643705855773169",
		"oriCurrtype_code": "CNY",
		"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
		"exchangeRateType_code": "0000001",
		"exchangeRateDate": "2023-09-19",
		"exchRateOps": NaN,
		"exchangeRate": 1,
		"remarks": "备注",
		"_status": "Insert",
		"extSrcSystems": "履约义务信息",
		"extSrcBillCode": "test1",
		"rclRecConfirmInfoBodyList": [
			{
				"rclContract": "1821773729540079620",
				"rclContractBaseInfo": "1821773729540079622",
				"project": "1812867135502286849",
				"project_code": "000004",
				"materialCode": "0105000002",
				"material": "1576817081552207881",
				"dept": "1525653687361339397",
				"dept_code": "bu1",
				"staff": "1563528487077150729",
				"staff_code": "00000001",
				"costCenter": "1580525167313420290",
				"costCenterCode": "010101001",
				"profitCenter": "1525652227072458756",
				"profitCenterCode": "pkm00",
				"otherProCenter": "1525652227072458756",
				"otherProCenterCode": "pkm00",
				"expenseItem": "1587803487610077193",
				"expenseItemCode": "pols",
				"oriCurrency": "1783169601426161704",
				"oriCurrencyCode": "CNY",
				"quantity": 7,
				"unit": "1528655706284097538",
				"unit_code": "HUR",
				"money": 100,
				"noTaxMoney": 90,
				"taxRateCode": "VAT0",
				"taxRateId": "1607403072771850292",
				"tax": 10,
				"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"exchangeRateTypeCode": "01",
				"exchangeRateDate": "2023-09-19",
				"exchangeRate": 1,
				"remarks": "备注",
				"confirmRate": 50,
				"_status": "Insert",
				"extSrcSystems": "履约义务信息",
				"extSrcBillCode": "test1",
				"extSrcBilltypeCode": "prjl_schedule",
				"extSrcTranstypeCode": "rcl_businessct",
				"extSrcBillId": "1819572782035894279",
				"extSrcBodyId": "1821063539425542157",
				"extOriBillNo": "test1",
				"extOriBillTypeCode": "prjl_schedule",
				"extOriTransTypeCode": "rcl_businessct",
				"extOriBillId": "1821063530835607552",
				"extOriBodyId": "1821063539425542157",
				"customerConfirmStartPeriod": "1556256609240350727",
				"customerConfirmStartPeriod_code": "1980-01",
				"customerConfirmEndPeriod": "1556256609240350727",
				"customerConfirmEndPeriod_code": "1980-01",
				"localmnyChargeoff": 0,
				"localmnyChargeoffNotax": 0,
				"localmnyChargeoffTax": 0,
				"orimnyChargeoff": 0,
				"orimnyChargeoffNotax": 0,
				"orimnyChargeoffTax": 0
			}
		]
	},
	"externalData": {
		"isAsync": false
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 操作码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| errorDetail | string | 否 | 报错信息 |
| total | long | 否 | 总记录数 示例：1 |
| data | object | 否 | 返回值 |
| sourceId | string | 否 | 上游单据主表id 示例：1819658526692212744 |
| bustype_name | string | 否 | 交易类型 示例：客户确认信息 |
| bizFlowMakeBillCode | string | 否 | 单据转换规则编码 示例：userDefine_rclRevenueContract_195490 |
| receiptType_name | string | 否 | 交易类型 示例：客户确认信息 |
| localTax | long | 否 | 本币税额 示例：0 |
| accentity_name | string | 否 | 会计主体 示例：收入中台演示销售组织1 |
| accentity | string | 否 | 会计主体id 示例：1525652227072458756 |
| firstId | string | 否 | 来源单据主表id 示例：1819658526692212744 |
| sourceCode | string | 否 | 上游单据号 示例：rclRevenueContract |
| bizFlowInstanceId | string | 否 | 业务流实例id 示例：d9003587-c578-466a-91cf-8f74680a59ad |
| exchangeRate | long | 否 | 汇率 示例：1 |
| id | string | 否 | 主表id 示例：1820299387352383491 |
| localMoney | long | 否 | 本币含税金额 示例：10 |
| sourceChildId | string | 否 | 上游单据子表id 示例：1819658535282147338 |
| receiptType | string | 否 | 交易类型ID 示例：1788211506390237189 |
| noTaxLocalMoney | long | 否 | 本币无税金额 示例：10 |
| noTaxMoney | long | 否 | 无税金额 示例：10 |
| billDate | string | 否 | 单据日期 示例：2023-09-19 |
| tax | long | 否 | 税额 示例：0 |
| accentity_currency_name | string | 否 | 会计主体币种名称 示例：人民币2 |
| verifyState | string | 否 | 客户确认信息单据状态(0:自由态,1:审批中,2:审批通过,3:审批不通过,4:驳回至制单人) 示例：0 |
| srcSystem | string | 否 | 来源系统 示例：履约义务信息 |
| code | string | 否 | 单据编码 示例：RECEIP20230919000405 |
| firstChildId | string | 否 | 来源单据子表id 示例：1819658535282147338 |
| bizflowId | string | 否 | 业务流id 示例：9ea107a9-917c-4564-bf3d-bb007f388701 |
| billType_name | string | 否 | 单据类型 示例：客户确认信息 |
| accentity_currency | string | 否 | 本币ID 示例：1525643705855773169 |
| bizflowName | string | 否 | 流程名称 示例：客户确认信息参照履约义务信息制单 |
| firstCode | string | 否 | 来源单据号 示例：yonbip-fi-ercl.rclRevenueContract |
| pubts | string | 否 | 时间戳 示例：2023-09-19 16:05:38 |
| oriCurrtype_name | string | 否 | 币种 示例：人民币2 |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| rclRecConfirmInfoBodyList | object | 是 | 客户确认信息子表 |
| billType | string | 否 | 单据类型id 示例：1780151373197213702 |
| contractConversionParams | string | 否 | 合同币折算参数 示例：1 |
| oriCurrtype | string | 否 | 币种id 示例：1525643705855773169 |
| bustype | string | 否 | 交易类型id 示例：1788211506390237189 |
| exchangeRateType | string | 否 | 汇率类型id 示例：0000L6YQ8AVLFUZPXD0000 |
| money | long | 否 | 含税金额 示例：10 |
| exchangeRateDate | string | 否 | 汇率日期 示例：2023-09-18 |
| createTime | string | 否 | 创建时间 示例：2023-09-19 16:04:56 |
| srcApplication | string | 否 | 来源应用 示例：履约义务信息 |
| exchangeRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| customer_name | string | 否 | 客户 示例：客户A |
| customer | string | 否 | 客户id 示例：1526228774896533510 |
| customerConfirmStartPeriod | string | 否 | 客户确认开始期间 示例：1556256609240350727 |
| customerConfirmEndPeriod | string | 否 | 客户确认截止期间 示例：1556256609240350727 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"errorDetail": "",
	"total": 1,
	"data": {
		"sourceId": "1819658526692212744",
		"bustype_name": "客户确认信息",
		"bizFlowMakeBillCode": "userDefine_rclRevenueContract_195490",
		"receiptType_name": "客户确认信息",
		"localTax": 0,
		"accentity_name": "收入中台演示销售组织1",
		"accentity": "1525652227072458756",
		"firstId": "1819658526692212744",
		"sourceCode": "rclRevenueContract",
		"bizFlowInstanceId": "d9003587-c578-466a-91cf-8f74680a59ad",
		"exchangeRate": 1,
		"id": "1820299387352383491",
		"localMoney": 10,
		"sourceChildId": "1819658535282147338",
		"receiptType": "1788211506390237189",
		"noTaxLocalMoney": 10,
		"noTaxMoney": 10,
		"billDate": "2023-09-19",
		"tax": 0,
		"accentity_currency_name": "人民币2",
		"verifyState": "0",
		"srcSystem": "履约义务信息",
		"code": "RECEIP20230919000405",
		"firstChildId": "1819658535282147338",
		"bizflowId": "9ea107a9-917c-4564-bf3d-bb007f388701",
		"billType_name": "客户确认信息",
		"accentity_currency": "1525643705855773169",
		"bizflowName": "客户确认信息参照履约义务信息制单",
		"firstCode": "yonbip-fi-ercl.rclRevenueContract",
		"pubts": "2023-09-19 16:05:38",
		"oriCurrtype_name": "人民币2",
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"rclRecConfirmInfoBodyList": [
			{
				"sourceId": "1819658526692212744",
				"rclRecConfirmInfoHeader_id_contractConversionParams": "1",
				"oriCurrency": "1525643705855773169",
				"noTaxPrice": 1,
				"taxRateId_ntaxrate": 0,
				"project": "1812867135502286849",
				"localTax": 0,
				"project_name": "分单验证",
				"rclContract_name": "test1",
				"firstId": "1819658526692212744",
				"oriBillType_name": "履约义务信息",
				"rclContractBaseInfo_rowNo": 1,
				"contractCurrency_id": "1525643705855773169",
				"exchangeRate": 1,
				"oriCurrency_name": "人民币2",
				"price": 1,
				"contractCurMoney": 10,
				"rclContractBaseInfo": "1819658535282147338",
				"oriTransType": "1570194285024247810",
				"id": "1820299387352383493",
				"taxRateId": "1525643714445705232",
				"oriTransType_name": "买卖合同",
				"srcTransType_name": "买卖合同",
				"localMoney": 10,
				"srcBillId": "1819658526692212744",
				"rclContract": "1819658526692212744",
				"sourceChildId": "1819658535282147338",
				"taxSubject": "0%",
				"noTaxLocalMoney": 10,
				"srcBillType_name": "履约义务信息",
				"noTaxMoney": 10,
				"contractCurrency_name": "人民币2",
				"tax": 0,
				"rclRecConfirmInfoHeader_id": "1820299387352383491",
				"srcBillType": "1570189715179044871",
				"oriCode": "RECONRECON20230918007053",
				"unit_name": "个",
				"taxRate": 0,
				"unit": "1528655706284097538",
				"rclContractBaseInfo_id": "1819658535282147338",
				"oriBillType": "1570189715179044871",
				"contractCurNoTaxMoney": 10,
				"rclRecConfirmInfoHeader_id_id": "1820299387352383491",
				"oriBillDetailId": "1819658535282147338",
				"firstChildId": "1819658535282147338",
				"contractCurrency": "1525643705855773169",
				"srcTransType": "1570194285024247810",
				"noTaxLocalPrice": 1,
				"orgCurrtype_name": "人民币2",
				"taxSubjectCode": "VAT0",
				"firstCode": "yonbip-fi-ercl.rclRevenueContract",
				"contractCurExchangeRate": 1,
				"pubts": "2023-09-19 16:05:38",
				"material_name": "张加工商品",
				"quantity": 10,
				"orgCurrtype": "1525643705855773169",
				"srcBillDetailId": "1819658535282147338",
				"sourceBillTs": "2023-09-18 19:23:05",
				"contractCurExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"dept_name": "皮卡丘",
				"dept": "1525653687361339397",
				"contractCurExchangeRateType_name": "基准汇率",
				"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"contractCurTax": 0,
				"oriBillId": "1819658526692212744",
				"contractCurrency_code": "CNY2",
				"material": "1576817081552207881",
				"money": 10,
				"exchangeRateDate": "2023-09-18",
				"contractId": "1819658526692212744",
				"srcCode": "RECONRECON20230918007053",
				"exchangeRateType_name": "基准汇率",
				"contractCode": "RECONRECON20230918007053",
				"exchangeRateTypeCode": "01",
				"contractDetailId": "1819658526692212744",
				"localPrice": 1
			}
		],
		"billType": "1780151373197213702",
		"contractConversionParams": "1",
		"oriCurrtype": "1525643705855773169",
		"bustype": "1788211506390237189",
		"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
		"money": 10,
		"exchangeRateDate": "2023-09-18",
		"createTime": "2023-09-19 16:04:56",
		"srcApplication": "履约义务信息",
		"exchangeRateType_name": "基准汇率",
		"customer_name": "客户A",
		"customer": "1526228774896533510",
		"customerConfirmStartPeriod": "1556256609240350727",
		"customerConfirmEndPeriod": "1556256609240350727"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	保存错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-10

新增

请求参数 (7)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

