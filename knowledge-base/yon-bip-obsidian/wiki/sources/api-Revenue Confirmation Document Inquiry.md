---
title: "收入确认单查询"
apiId: "2314522133170487296"
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

# 收入确认单查询

> `ContentType	application/json` 请求方式	POST | 分类: Revenue Recognition Document (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/fiercl/rvn/revenueBill/list

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
| data | object | 否 | 是 | 数据 |
| ids | string | 是 | 否 | 收入确认单ID(ID和编码必输其一,同时输入,ID优先) 示例：["2293920094181916688"] |
| codes | string | 是 | 否 | 收入确认单编码(ID和编码必输其一,同时输入,ID优先) 示例：["RRE20250703001559","RRE20250703001558"] |

## 3. 请求示例

Url: /yonbip/FCC/fiercl/rvn/revenueBill/list?access_token=访问令牌
Body: {
	"data": {
		"ids": [
			"2293920094181916688"
		],
		"codes": [
			"RRE20250703001559",
			"RRE20250703001558"
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 是 | data |
| id | string | 否 | ID 示例：2293920094181916688 |
| code | string | 否 | 编码 示例：RRE20250708000001 |
| accountEntity | string | 否 | 会计主体 示例：1525652227072458756 |
| transType | string | 否 | 交易类型 示例：1803833470668505095 |
| revenueConfirmPeriod | number |
| 小数位数:0,最大长度:19 | 否 | 收入确认期间 示例：1563488724293517323 |
| billDate | string | 否 | 单据日期 示例：2025-07-03 |
| customer | number |
| 小数位数:0,最大长度:19 | 否 | 客户 示例：1529267825030463489 |
| oriCurrency | string | 否 | 币种 示例：1525643705855773169 |
| oriTaxExcludedAmount | number |
| 小数位数:8,最大长度:10 | 否 | 无税金额 示例：124.69000000 |
| exchangeRateType | string | 否 | 汇率类型 示例：0000L6YQ8AVLFUZPXD0000 |
| exchangeRateDate | string | 否 | 汇率日期 示例：2025-07-03 |
| exchangeRate | number |
| 小数位数:8,最大长度:10 | 否 | 汇率 示例：1.00000000 |
| adjustType | string | 否 | 调整类型（1-变更调整，2-手工调整） 示例：1 |
| accConvertParam | string | 否 | 本币折算参数（1-按原币折算,2-按组织币折算,3-按账簿币(本币)折算） 示例：1 |
| localTaxExcludedAmount | number |
| 小数位数:8,最大长度:10 | 否 | 本币无税金额 示例：124.69000000 |
| orgLocalCurrency | string | 否 | 组织币 示例：1525643705855773169 |
| orgConvertParam | string | 否 | 组织币折算参数（1-按原币折算,2-按组织币折算,3-按账簿币(本币)折算） 示例：1 |
| orgTaxExcludedAmount | number |
| 小数位数:8,最大长度:10 | 否 | 组织币无税金额 示例：124.69000000 |
| grpLocalCurrency | string | 否 | 集团币 示例：1525643705855773169 |
| grpConvertParam | string | 否 | 集团币折算参数（1-按原币折算,2-按组织币折算,3-按账簿币(本币)折算） 示例：1 |
| grpTaxExcludedAmount | number |
| 小数位数:8,最大长度:10 | 否 | 集团币无税金额 示例：124.69000000 |
| glbLocalCurrency | string | 否 | 全局币 示例：1525643705855773169 |
| glbConvertParam | string | 否 | 全局币折算参数（1-按原币折算,2-按组织币折算,3-按账簿币(本币)折算） 示例：1 |
| glbTaxExcludedAmount | number |
| 小数位数:8,最大长度:10 | 否 | 全局币无税金额 示例：124.69000000 |
| conCurrency | string | 否 | 合同币 示例：1525643705855773169 |
| conConvertParam | string | 否 | 合同币折算参数（1-按原币折算,2-按组织币折算,3-按账簿币(本币)折算） 示例：1 |
| conTaxExcludedAmount | number |
| 小数位数:8,最大长度:10 | 否 | 合同币无税金额 示例：124.69000000 |
| srcBillSystem | string | 否 | 来源应用 示例：1590899514909655042 |
| srcBillNo | string | 否 | 来源单据编号 示例：RECON20250618009032 |
| srcBillId | string | 否 | 来源单据ID 示例：2293919235188457475 |
| extSrcSystems | string | 否 | 来源单据系统(外) 示例：1590899514909655042 |
| extSrcBillcode | string | 否 | 来源单据编码(外) 示例：RECON20250618009032 |
| billTypeId | string | 否 | 单据类型 示例：1803830661759893506 |
| srcBillType | string | 否 | 来源单据类型 示例：1570194285024247810 |
| ytenantId | string | 否 | 租户id 示例：0000L6YQ8AVLFUZPXD0000 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间 示例：2025-06-18 19:50:46 |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 修改时间 示例：2025-06-18 19:50:46 |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| modifier | string | 否 | 修改人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | pubts 示例：2025-06-18 19:50:46 |
| verifyState | number |
| 小数位数:0,最大长度:1 | 否 | 单据状态（0-自由态,1-审批中,2-审批通过,3-驳回至制单人） 示例：0 |
| auditor | string | 否 | 审批人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| auditTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 审批日期 示例：2025-06-18 19:50:46 |
| auditNote | string | 否 | 审批批语 示例：通过 |
| rvnRevenueBillBodyList | object | 否 | 收入确认单子表 示例：数组 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "2293920094181916688",
			"code": "RRE20250708000001",
			"accountEntity": "1525652227072458756",
			"transType": "1803833470668505095",
			"revenueConfirmPeriod": 1563488724293517323,
			"billDate": "2025-07-03",
			"customer": 1529267825030463489,
			"oriCurrency": "1525643705855773169",
			"oriTaxExcludedAmount": 124.69,
			"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
			"exchangeRateDate": "2025-07-03",
			"exchangeRate": 1,
			"adjustType": "1",
			"accConvertParam": "1",
			"localTaxExcludedAmount": 124.69,
			"orgLocalCurrency": "1525643705855773169",
			"orgConvertParam": "1",
			"orgTaxExcludedAmount": 124.69,
			"grpLocalCurrency": "1525643705855773169",
			"grpConvertParam": "1",
			"grpTaxExcludedAmount": 124.69,
			"glbLocalCurrency": "1525643705855773169",
			"glbConvertParam": "1",
			"glbTaxExcludedAmount": 124.69,
			"conCurrency": "1525643705855773169",
			"conConvertParam": "1",
			"conTaxExcludedAmount": 124.69,
			"srcBillSystem": "1590899514909655042",
			"srcBillNo": "RECON20250618009032",
			"srcBillId": "2293919235188457475",
			"extSrcSystems": "1590899514909655042",
			"extSrcBillcode": "RECON20250618009032",
			"billTypeId": "1803830661759893506",
			"srcBillType": "1570194285024247810",
			"ytenantId": "0000L6YQ8AVLFUZPXD0000",
			"createTime": "2025-06-18 19:50:46",
			"modifyTime": "2025-06-18 19:50:46",
			"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"pubts": "2025-06-18 19:50:46",
			"verifyState": 0,
			"auditor": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"auditTime": "2025-06-18 19:50:46",
			"auditNote": "通过",
			"rvnRevenueBillBodyList": {
				"0": "数",
				"1": "组",
				"revenueContractBillNo": "RECON20250618009032",
				"baseRowNo": "1.00000000",
				"materialTypeId": 1529332636086960137,
				"materialCode": "601",
				"materialId": 1892227488221757448,
				"projectId": "2142233806464090113",
				"expenseItemId": 1587803487610077193,
				"customerId": 1529267825030463489,
				"deptId": "2022081800001",
				"employee": "1529267825030463489",
				"oriCurrency": "1525643705855773169",
				"quantity": 10,
				"unitId": 1525645209096421378,
				"oriTaxIncludedPrice": 10,
				"oriTaxExcludedPrice": 10,
				"taxRate": "1525643714445705232",
				"caculateRule": 1876554173398384647,
				"appointRecord": 1,
				"localTotalIncomeExcludeTax": 1000,
				"localTotalIncomeIncludeTax": 1000,
				"localTotalTax": 0,
				"totalIncomeExcludeTax": 1000,
				"totalIncomeIncludeTax": 1000,
				"totalTax": 0,
				"curPeriodProcess": 12.469,
				"localCurPeriodExcludeTax": 124.69,
				"localCurPeriodIncludeTax": 124.69,
				"localCurPeriodTax": 0,
				"curPeriodConfirmExcludeTax": 100,
				"curPeriodConfirmIncludeTax": 100,
				"oriTaxAmount": 0,
				"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"exchangeRateDate": "2023-08-31",
				"exchangeRate": 1,
				"saveLocalTotalIncomeIncludeTax": 0,
				"saveLocalTotalIncomeExcludeTax": 0,
				"saveLocalTotalTax": 0,
				"saveTotalIncomeIncludeTax": 0,
				"saveTotalIncomeExcludeTax": 0,
				"saveTotalTax": 0,
				"orgTaxExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"orgTaxExchangeRate": 1,
				"orgTaxIncludedAmount": 100,
				"orgTaxExcludedAmount": 100,
				"orgTaxAmount": 0,
				"grpTaxExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"grpTaxExchangeRate": "1.00000000",
				"grpTaxIncludedAmount": 100,
				"grpTaxExcludedAmount": 100,
				"grpTaxAmount": 0,
				"glbTaxExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"glbTaxExchangeRate": 1,
				"glbTaxIncludedAmount": 100,
				"glbTaxExcludedAmount": 100,
				"glbTaxAmount": 0,
				"conCurrency": "1525643705855773169",
				"conTaxExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"conTaxExchangeRate": 1,
				"conTaxIncludedAmount": 100,
				"conTaxExcludedAmount": 100,
				"conTaxAmount": 0,
				"postStatus": "1",
				"confirmStatus": "1",
				"createType": "1",
				"adjustType": "2",
				"srcApp": "",
				"srcBillType": "1570189715179044871",
				"srcBillTradeType": "1570194285024247810",
				"srcBillNo": "RECON20250617009000",
				"srcBillId": "2293052313210716166",
				"srcBillBodyId": "2293054890207870979",
				"revenueContractId": "2293052313210716166",
				"revenueContractBodyId": "2293052313210716168",
				"extSrcSystems": "",
				"extSrcBillcode": "",
				"extSrcBilltypeCode": "",
				"extSrcTranstypeCode": "",
				"extSrcBillId": "",
				"extSrcBodyId": "",
				"extBeginBilltypeBode": "",
				"extBeginTranstypeCode": "",
				"extBeginBillNo": "",
				"extBeginBillId": "",
				"extBeginBodyId": "",
				"costCenter": 1623515298887368704,
				"proCenter": "1623515298887368888",
				"oppProCenter": "1623515298887368888",
				"taxRateNumber": 0,
				"ytenantId": "0000L6YQ8AVLFUZPXD0000",
				"createTime": "2025-06-17 17:26:15",
				"modifyTime": "2025-06-17 17:26:15",
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"id": "2293920094181916681",
				"pubts": "2025-06-18 19:50:46",
				"wbs": "2142233806464090113",
				"activity": "",
				"preSubmissionIdentify": false,
				"chargeOffStartPeriod": 1563488724293517323,
				"chargeOffEndPeriod": 1563488724293517323,
				"chargedOffPeriod": 1563488724293517323,
				"chargeOffBillNo": "RRE20230908000367",
				"chargedOffBillId": "1812152117950414853",
				"chargedOffRowNo": "1",
				"chargedOffRowId": "1812152117950414854",
				"chargeOffMethod": NaN,
				"preSubmissionChargeoffType": NaN
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	根据id或编码未查询到收入确认单数据！


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

