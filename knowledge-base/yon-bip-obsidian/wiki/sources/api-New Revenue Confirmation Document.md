---
title: "收入确认单新增"
apiId: "1821177983214288902"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Revenue Recognition Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Revenue Recognition Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 收入确认单新增

> `ContentType	application/json` 请求方式	POST | 分类: Revenue Recognition Document (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/fiervn/rvnRevenueBill/add

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
| accountEntity_code | string | 否 | 否 | 会计主体编码(编码和id必输其一，同时输入id优先) 示例：XMHS-RMB |
| accountEntity | string | 否 | 否 | 会计主体(编码和id必输其一，同时输入id优先) 示例：187100245480145 |
| accBook_code | string | 否 | 否 | 账簿编码(编码和id必输其一，同时输入id优先) |
| accBook | string | 否 | 否 | 账簿(编码和id必输其一，同时输入id优先) |
| transType | string | 否 | 否 | 交易类型id 示例：1570290767175352322 |
| transType_code | string | 否 | 否 | 交易类型编码 示例：revenuebill |
| billDate | Date | 否 | 是 | 单据日期 示例：2023-09-20 |
| customer_code | string | 否 | 否 | 客户编码(编码和id必输其一，同时输入id优先) 示例：CUSTF0001 |
| customer | string | 否 | 否 | 客户Id(编码和id必输其一，同时输入id优先) 示例：1890002219773 |
| oriCurrency_code | string | 否 | 否 | 币种编码 示例：CNY |
| oriCurrency | string | 否 | 否 | 币种Id 示例：20170024581358899 |
| exchangeRateType | string | 否 | 否 | 汇率类型 示例：0000LKQJBKJJE1K6PT0000 |
| exchangeRateType_code | string | 否 | 否 | 汇率类型编码 示例：01 |
| exchangeRateDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 汇率日期 示例：2023-09-20 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 汇率 示例：1 |
| extSrcSystems | string | 否 | 是 | 来源单据系统(外) 示例：外系统 |
| extSrcBillcode | string | 否 | 是 | 来源单据号(外) 示例：REC01231110000452 |
| _status | string | 否 | 是 | 接口状态(Insert-新增） 示例：Insert 默认值：Insert |
| rvnRevenueBillBodyList | object | 是 | 是 | 收入确认单子表 |

## 3. 请求示例

Url: /yonbip/EFI/fiervn/rvnRevenueBill/add?access_token=访问令牌
Body: {
	"data": {
		"accountEntity_code": "XMHS-RMB",
		"accountEntity": "187100245480145",
		"accBook_code": "",
		"accBook": "",
		"transType": "1570290767175352322",
		"transType_code": "revenuebill",
		"billDate": "2023-09-20",
		"customer_code": "CUSTF0001",
		"customer": "1890002219773",
		"oriCurrency_code": "CNY",
		"oriCurrency": "20170024581358899",
		"exchangeRateType": "0000LKQJBKJJE1K6PT0000",
		"exchangeRateType_code": "01",
		"exchangeRateDate": "2023-09-20",
		"exchRateOps": NaN,
		"exchangeRate": 1,
		"extSrcSystems": "外系统",
		"extSrcBillcode": "REC01231110000452",
		"_status": "Insert",
		"rvnRevenueBillBodyList": [
			{
				"revenueContractId": "18106088331243683",
				"revenueContractBillNo": "RECONRECON20230918007053",
				"revenueContractBodyId": "17510240051402",
				"baseRowNo": 1,
				"materialTypeId": "17310250026001",
				"materialTypeId_code": "YT002",
				"materialId_code": "WL-002",
				"materialId": "16310360365103",
				"project_code": "XM-002",
				"projectId": "180125480154893",
				"wbs": "1880152036904567",
				"wbsCode": "XM001",
				"customerId": "154102533310124",
				"customer_code": "KU-002",
				"expenseItemId": "1587803487610077193",
				"expenseItemCode": "pols",
				"deptId": "1525653687361339397",
				"dept_code": "bu1",
				"employee": "1563528487077150729",
				"employee_code": "00000001",
				"costCenter": "1580525167313420290",
				"costCenterCode": "010101001",
				"proCenter": "1525652227072458756",
				"proCenterCode": "pkm00",
				"oppProCenter": "1525652227072458756",
				"oppProCenterCode": "pkm00",
				"oriCurrency": "152103623017782",
				"oriCurrency_code": "CNY",
				"quantity": 7,
				"unitId": "1528655706284097538",
				"unit_code": "HUR",
				"taxRate": "125200021154896",
				"taxRate_code": "VAT00",
				"appointRecord": 10,
				"totalIncomeExcludeTax": 100,
				"totalIncomeIncludeTax": 110,
				"totalTax": 10,
				"curPeriodProcess": 20,
				"curPeriodConfirmExcludeTax": 100,
				"curPeriodConfirmIncludeTax": 110,
				"oriTaxAmount": 6,
				"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"exchangeRateTypeCode": "01",
				"exchangeRateDate": "2023-09-19",
				"exchRateOps": NaN,
				"exchangeRate": 1,
				"extSrcSystems": "外系统",
				"extSrcBillcode": "REC01231110000452",
				"extSrcBilltypeCode": "rcl_contract",
				"extSrcTranstypeCode": "rcl_businessct",
				"extSrcBillId": "1867133222768869377",
				"extSrcBodyId": "1867133222768869384",
				"extBeginBilltypeBode": "rcl_contract",
				"extBeginTranstypeCode": "rcl_businessct",
				"extBeginBillNo": "REC01231110000452",
				"extBeginBillId": "186713322276886937",
				"extBeginBodyId": "1867133222768869384",
				"_status": "Insert",
				"preSubmissionIdentify": false,
				"chargeOffStartPeriod": "1556256609240350727",
				"chargeOffStartPeriod_code": "1980-01",
				"chargeOffEndPeriod": "1556256609240350727",
				"chargeOffEndPeriod_code": "1980-01",
				"localChargeoffIncomeExcludeTax": 0,
				"localChargeoffIncomeIncludeTax": 0,
				"localChargeoffIncomeTax": 0,
				"oriChargeoffIncomeExcludeTax": 0,
				"oriChargeoffIncomeIncludeTax": 0,
				"oriChargeoffIncomeTax": 0,
				"localChargeoffIncomeExcludeTaxTobe": 0,
				"localChargeoffIncomeIncludeTaxTobe": 0,
				"localChargeoffIncomeTaxTobe": 0,
				"oriChargeoffIncomeExcludeTaxTobe": 0,
				"oriChargeoffIncomeIncludeTaxTobe": 0,
				"oriChargeoffIncomeTaxTobe": 0,
				"chargeOffMethod": NaN,
				"preSubmissionChargeoffType": NaN,
				"createType": ""
			}
		]
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
| sourceId | string | 否 | 上游单据主表id 示例：1820975037342547972 |
| oriCurrency | string | 否 | 币种id 示例：1525643705855773169 |
| accConvertParam | string | 否 | 本币折算参数 示例：1 |
| accountEntity_name | string | 否 | 会计主体 示例：收入中台演示销售组织1 |
| accBook_name | string | 否 | 账簿 示例：YL账簿 |
| creator_userName | string | 否 | 创建人 示例：测试管理员 |
| bizFlowMakeBillCode | string | 否 | 单据转换规则编码 示例：userDefine_rclRevenueContract_890607 |
| srcBillNo | string | 否 | 来源单据号 示例：RECONRECON20230920007068 |
| accountEntity | string | 否 | 会计主体id 示例：1525652227072458756 |
| accBook | string | 否 | 账簿id 示例：1525652227072458756 |
| srcBillSystem | string | 否 | 来源单据系统 示例：收入管理 |
| sourceCode | string | 否 | 上游单据号 示例：rclRevenueContract |
| revenueConfirmPeriod_name | string | 否 | 收入确认期间 示例：2023-09 |
| bizFlowInstanceId | string | 否 | 业务流实例id 示例：68c0dce1-7cd2-4056-851a-eb0c1996283f |
| exchangeRate | long | 否 | 汇率 示例：1 |
| oriCurrency_name | string | 否 | 币种 示例：人民币2 |
| id | string | 否 | 单据id 示例：1821090571867914248 |
| glbLocalCurrency_name | string | 否 | 全局币名称 示例：财务公共自动化_台币 |
| glbLocalCurrency | string | 否 | 全局币id 示例：1668885220284694533 |
| srcBillId | string | 否 | 来源单据ID 示例：1820975037342547972 |
| sourceChildId | string | 否 | 上游单据子表id 示例：1820975114651959300 |
| srcBillType_name | string | 否 | 来源单据类型 示例：收入管理 |
| billDate | string | 否 | 单据日期 示例：2023-09-20 |
| srcBillType | string | 否 | 来源单据类型id 示例：1570189715179044871 |
| verifyState | long | 否 | 单据状态(0:自有态,1:审批中,2:审批通过,3:审批不通过,4:驳回至制单人) 示例：1 |
| transType | string | 否 | 交易类型id 示例：1803833470668505095 |
| code | string | 否 | 单据编号 示例：RRE20230920001362 |
| oriTaxExcludedAmount | long | 否 | 履约义务行无税金额 示例：250 |
| conConvertParam | string | 否 | 合同币折算参数 示例：1 |
| bizflowName | string | 否 | 流程名称 示例：收入确认单按计划确认拉分期收入计划 |
| grpTaxExcludedAmount | long | 否 | 集团币无税金额 示例：0 |
| orgConvertParam | string | 否 | orgConvertParam 示例：1 |
| pubts | string | 否 | 时间戳 示例：2023-09-20 22:06:50 |
| orgTaxExcludedAmount | long | 否 | 组织币无税金额 示例：250 |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| transType_name | string | 否 | 交易类型 示例：收入确认单 |
| revenueConfirmPeriod | string | 否 | 收入确认期间ID 示例：1529511366840287247 |
| orgLocalCurrency_name | string | 否 | 组织币名称 示例：人民币2 |
| glbConvertParam | string | 否 | 全局币折算参数 示例：2 |
| exchangeRateType | string | 否 | 汇率类型ID 示例：0000L6YQ8AVLFUZPXD0000 |
| exchangeRateDate | string | 否 | 汇率日期 示例：2023-09-20 |
| glbTaxExcludedAmount | long | 否 | glbTaxExcludedAmount 示例：1500 |
| localTaxExcludedAmount | long | 否 | 本币无税金额 示例：250 |
| exchangeRateType_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| customer_name | string | 否 | 客户名称 示例：叼着奶嘴闲逛01 |
| customer | string | 否 | 客户ID 示例：1529369985109983235 |
| orgLocalCurrency | string | 否 | 组织币id 示例：1525643705855773169 |
| rvnRevenueBillBodyList | object | 是 | 收入确认单子表 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"errorDetail": "",
	"total": 1,
	"data": {
		"sourceId": "1820975037342547972",
		"oriCurrency": "1525643705855773169",
		"accConvertParam": "1",
		"accountEntity_name": "收入中台演示销售组织1",
		"accBook_name": "YL账簿",
		"creator_userName": "测试管理员",
		"bizFlowMakeBillCode": "userDefine_rclRevenueContract_890607",
		"srcBillNo": "RECONRECON20230920007068",
		"accountEntity": "1525652227072458756",
		"accBook": "1525652227072458756",
		"srcBillSystem": "收入管理",
		"sourceCode": "rclRevenueContract",
		"revenueConfirmPeriod_name": "2023-09",
		"bizFlowInstanceId": "68c0dce1-7cd2-4056-851a-eb0c1996283f",
		"exchangeRate": 1,
		"oriCurrency_name": "人民币2",
		"id": "1821090571867914248",
		"glbLocalCurrency_name": "财务公共自动化_台币",
		"glbLocalCurrency": "1668885220284694533",
		"srcBillId": "1820975037342547972",
		"sourceChildId": "1820975114651959300",
		"srcBillType_name": "收入管理",
		"billDate": "2023-09-20",
		"srcBillType": "1570189715179044871",
		"verifyState": 1,
		"transType": "1803833470668505095",
		"code": "RRE20230920001362",
		"oriTaxExcludedAmount": 250,
		"conConvertParam": "1",
		"bizflowName": "收入确认单按计划确认拉分期收入计划",
		"grpTaxExcludedAmount": 0,
		"orgConvertParam": "1",
		"pubts": "2023-09-20 22:06:50",
		"orgTaxExcludedAmount": 250,
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"transType_name": "收入确认单",
		"revenueConfirmPeriod": "1529511366840287247",
		"orgLocalCurrency_name": "人民币2",
		"glbConvertParam": "2",
		"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
		"exchangeRateDate": "2023-09-20",
		"glbTaxExcludedAmount": 1500,
		"localTaxExcludedAmount": 250,
		"exchangeRateType_name": "基准汇率",
		"customer_name": "叼着奶嘴闲逛01",
		"customer": "1529369985109983235",
		"orgLocalCurrency": "1525643705855773169",
		"rvnRevenueBillBodyList": [
			{
				"totalIncomeExcludeTax": 250,
				"materialId_name": "张加工商品",
				"oriCurrency": "1525643705855773169",
				"glbTaxExchangeRateType": "1668887711365726215",
				"localTotalIncomeExcludeTax": 250,
				"caculateRule_name": "产出法-分期平均-按月",
				"revenueContractBodyId_taxAmount": 0,
				"conCurrency_name": "人民币2",
				"totalIncomeIncludeTax": 250,
				"srcBillNo": "RECONRECON20230920007068",
				"employee": "1563528487077150729",
				"localTotalIncomeIncludeTax": 250,
				"revenueContractBodyId_oriTaxIncludedAmount": 1000,
				"totalTax": 0,
				"orgTaxExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"exchangeRate": 1,
				"oriCurrency_name": "人民币2",
				"taxRate_ntaxrate": 0,
				"localCurPeriodIncludeTax": 250,
				"orgTaxExchangeRateType_name": "基准汇率",
				"confirmStatus": "0",
				"revenueContractId": "1820975037342547972",
				"projectId_name": "分单验证",
				"id": "1821090571867914250",
				"revenueContractBodyId_rowNo": 1,
				"srcBillId": "1820975063112351748",
				"saveLocalTotalIncomeExcludeTax": 0,
				"revenueContractBodyId_taxIncludedSum": 1000,
				"glbTaxAmount": 0,
				"costCenter": "1628141133276643331",
				"taxRateNumber": 0,
				"deptId": "1525655517005348867",
				"deptId_name": "可达鸭",
				"saveLocalTotalIncomeIncludeTax": 0,
				"revenueContractBillNo": "RECONRECON20230920007068",
				"materialId": "1576817081552207881",
				"saveLocalTotalTax": 0,
				"taxRate": "1525643714445705232",
				"materialTypeId_name": "张加工分类",
				"glbTaxExchangeRate": 6,
				"conTaxIncludedAmount": 250,
				"orgTaxIncludedAmount": 250,
				"conTaxExchangeRate": 1,
				"rvnRevenueBill_id": "1821090571867914248",
				"revenueContractId_code": "RECONRECON20230920007068",
				"srcBillBodyId": "1820975114651959300",
				"projectId": "1812867135502286849",
				"conTaxAmount": 0,
				"glbTaxIncludedAmount": 1500,
				"glbTaxExchangeRateType_name": "财务公共自动化_全局币汇率类型1",
				"curPeriodConfirmIncludeTax": 250,
				"revenueContractBodyId": "1820975063112351748",
				"materialTypeId": "1576816119479533570",
				"costCenter_name": "事项会计中台-成本中心",
				"saveTotalIncomeExcludeTax": 0,
				"postStatus": "1",
				"createType": "1",
				"oriTaxAmount": 0,
				"curPeriodProcess": 0.25,
				"conTaxExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"revenueContractBodyId_oriTaxAmount": 0,
				"localCurPeriodTax": 0,
				"customerId": "1529369985109983235",
				"pubts": "2023-09-20 17:40:48",
				"curPeriodConfirmExcludeTax": 250,
				"orgTaxExchangeRate": 1,
				"revenueContractBodyId_taxExcludedAmount": 1000,
				"orgTaxExcludedAmount": 250,
				"orgTaxAmount": 0,
				"saveTotalTax": 0,
				"conCurrency": "1525643705855773169",
				"appointRecord": 0.25,
				"baseRowNo": 1,
				"employee_name": "yyq测试1",
				"conTaxExchangeRateType_name": "基准汇率",
				"localTotalTax": 0,
				"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"saveTotalIncomeIncludeTax": 0,
				"customerId_name": "叼着奶嘴闲逛01",
				"localCurPeriodExcludeTax": 250,
				"exchangeRateDate": "2023-09-20",
				"glbTaxExcludedAmount": 1500,
				"rvnRevenueBill_id_id": "1821090571867914248",
				"conTaxExcludedAmount": 250,
				"exchangeRateType_name": "基准汇率",
				"revenueContractBodyId_oriTaxExcludedAmount": 1000,
				"caculateRule": 900000002,
				"chargeOffStartPeriod": "1556256609240350727",
				"chargeOffEndPeriod": "1556256609240350727",
				"preSubmissionIdentify": "false"
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

1	2026-03-24

新增

请求参数 accBook_code

新增

请求参数 accBook

新增

返回参数 accBook_name

新增

返回参数 accBook

2	2026-03-09

更新

请求说明

更新

返回参数 errorDetail

更新

返回参数 data

更新

返回参数 rvnRevenueBillBodyList

3	2025-09-10

新增

请求参数 (16)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

