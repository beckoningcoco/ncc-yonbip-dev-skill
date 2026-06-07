---
title: "事项凭证信息查询"
apiId: "1780094301763010566"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Event Entry"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Event Entry]
platform_version: "BIP"
source_type: community-api-docs
---

# 事项凭证信息查询

> `ContentType	application/json` 请求方式	POST | 分类: Event Entry (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/eventvoucher/query

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
| pageIndex | int | 否 | 是 | 分页页码 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 分页数据量 示例：100 默认值：100 |
| accpurposeId | string | 否 | 否 | 核算目的ID 示例：1753351869140828431 |
| accentityId | string | 否 | 否 | 会计主体ID 示例：1666608492475580426 |
| makeDate | string | 否 | 否 | 制单日期区间(开始日期,结束日期) 示例：2023-01-01,2023-08-23 |
| createTime | string | 否 | 否 | 创建时间区间(开始时间,结束时间) 示例：2023-01-01 12:12:12,2023-01-31 12:12:12 |
| accBookId | string | 否 | 是 | 账簿ID 示例：1666621497632358418 |
| periodCode | string | 否 | 是 | 期间 示例：2023-01 |
| srcAppIds | string | 是 | 否 | 来源应用ID 多选 示例：["94","136"] |
| fiEventIds | string | 是 | 否 | 会计事务ID 多选 示例：["2740066088296704","1447745755110965256"] |
| voucherNos | string | 是 | 否 | 事项凭证编码 多选 示例：["423jwg4232","342bwjh324"] |
| srcBillIds | string | 是 | 否 | 来源单据ID 多选 示例：["1521523552314563334","1451552155245552879"] |
| srcBillNos | string | 是 | 否 | 来源单据号 多选 示例：["RP202408120111","AP2412001421224"] |
| srcBillTypeIds | string | 是 | 否 | 来源单据类型ID 多选 示例：["4512455255555542252","1245255425552422221"] |
| ids | string | 是 | 否 | 事项凭证id 多选 示例：["7424284826728283423","8463836748397372842"] |
| pubts | string | 否 | 否 | 更新时间区间(开始时间,结束时间) 示例：2023-01-01 12:12:12,2023-01-31 12:12:12 |

## 3. 请求示例

Url: /yonbip/AMP/eventvoucher/query?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"accpurposeId": "1753351869140828431",
	"accentityId": "1666608492475580426",
	"makeDate": "2023-01-01,2023-08-23",
	"createTime": "2023-01-01 12:12:12,2023-01-31 12:12:12",
	"accBookId": "1666621497632358418",
	"periodCode": "2023-01",
	"srcAppIds": [
		"94",
		"136"
	],
	"fiEventIds": [
		"2740066088296704",
		"1447745755110965256"
	],
	"voucherNos": [
		"423jwg4232",
		"342bwjh324"
	],
	"srcBillIds": [
		"1521523552314563334",
		"1451552155245552879"
	],
	"srcBillNos": [
		"RP202408120111",
		"AP2412001421224"
	],
	"srcBillTypeIds": [
		"4512455255555542252",
		"1245255425552422221"
	],
	"ids": [
		"7424284826728283423",
		"8463836748397372842"
	],
	"pubts": "2023-01-01 12:12:12,2023-01-31 12:12:12"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 响应码：200成功，500失败 |
| message | string | 否 | 返回信息 |
| data | object | 是 | 返回数据 |
| id | string | 否 | 事项凭证ID |
| voucherNo | string | 否 | 事项凭证编码 |
| fiEventRecordNo | string | 否 | 会计事务记录号 |
| fiEventRecordId | string | 否 | 会计事务记录号ID |
| accbookId | string | 否 | 账簿ID’ |
| accpurposeId | string | 否 | 核算目的ID |
| accentityId | string | 否 | 会计主体ID |
| voucherType | string | 否 | 凭证类型 |
| makerId | string | 否 | 制单人ID |
| fiEventId | string | 否 | 会计事务ID |
| makeDate | string | 否 | 制单日期 |
| srcAppId | string | 否 | 来源应用ID |
| accbookTypeId | string | 否 | 账簿类型ID |
| periodCode | string | 否 | 期间编码 |
| glVoucherNo | string | 否 | 总账凭证号 |
| periodYear | string | 否 | 期间年 |
| glVoucherId | string | 否 | 总账品这行ID |
| creditTotal | BigDecimal | 否 | 贷方合计 |
| debitTotal | BigDecimal | 否 | 借方合计 |
| details | object | 是 | 明细信息 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"id": "",
			"voucherNo": "",
			"fiEventRecordNo": "",
			"fiEventRecordId": "",
			"accbookId": "",
			"accpurposeId": "",
			"accentityId": "",
			"voucherType": "",
			"makerId": "",
			"fiEventId": "",
			"makeDate": "",
			"srcAppId": "",
			"accbookTypeId": "",
			"periodCode": "",
			"glVoucherNo": "",
			"periodYear": "",
			"glVoucherId": "",
			"creditTotal": 0,
			"debitTotal": 0,
			"details": [
				{
					"id": "",
					"summary": "",
					"accsubjectId": "",
					"accentityId": "",
					"accbookId": "",
					"amount": 0,
					"oriAmount": 0,
					"orgAmount": 0,
					"groupAmount": 0,
					"controlAmount": 0,
					"globalAmount": 0,
					"rateTypeId": "",
					"orgRateTypeId": "",
					"groupRateTypeId": "",
					"controlRateTypeId": "",
					"globalRateTypeId": "",
					"rate": 0,
					"orgRate": "",
					"groupRate": "",
					"controlRate": "",
					"currtypeId": "",
					"globalRate": "",
					"oriCurrtypeId": "",
					"groupCurrtypeId": "",
					"controlCurrtypeId": "",
					"globalCurrtypeId": "",
					"quantity": 0,
					"bankReconciliationNo": "",
					"noteNo": "",
					"noteDate": "",
					"settleMode": "",
					"verifyNo": "",
					"cooperateNo": "",
					"smartCheckNo": "",
					"rateDate": "",
					"freeChId": {
						"id": "",
						"lxdj": ""
					},
					"matChId": {
						"id": "",
						"lxdj": ""
					},
					"rpObjectType": "",
					"customerId": "0",
					"globalRateOps": 0,
					"controlRateOps": 0,
					"groupRateOps": 0,
					"rateOps": 0,
					"orgRateOps": 0,
					"customerTypeId": "0",
					"supplierId": "0",
					"supplierTypeId": "0",
					"employeeId": "",
					"retailerId": "",
					"salaryItem": "",
					"faCode": "",
					"faName": "",
					"faCategoryId": "",
					"faSubcategoryId": "",
					"faAddWay": "",
					"faUsageStateId": "",
					"faMgmtDeptId": "",
					"faPositionId": "",
					"faLocation": "",
					"faChangeDirection": "",
					"faUseDept": "",
					"faEntityCode": "",
					"faLabelNo": "",
					"faCreateCardDate": "",
					"faReduceWay": 0,
					"faImpairmentReason": "",
					"faImpairmentUnitId": "",
					"busiOrgId": "",
					"busiDeptId": "",
					"deptNature": "",
					"salesmanId": "",
					"personAttribute": "",
					"inventoryOrgId": "",
					"warehouseId": "0",
					"warehouserKeeperId": "",
					"corpId": "",
					"outsourcingOrgId": "",
					"prodOrgId": "",
					"profitCenterId": "",
					"costCenterId": "0",
					"costField": "",
					"invoiceTypeId": "",
					"invoiceNo": "",
					"invoiceCode": "",
					"projectId": "",
					"projectClass": "",
					"costItemId": "0",
					"materialId": "0",
					"materialSort": "0",
					"materialCostSort": "0",
					"goodsSort": "0",
					"orderNo": "",
					"contractNo": "",
					"receiveAgreement": "0",
					"payAgreement": 0,
					"startDate": "",
					"planProportion": 0,
					"expireDate": "",
					"paymentType": 0,
					"fiAppCode": "",
					"srcAppCode": "",
					"bankId": "",
					"bankAccount": "",
					"cashAccount": "",
					"batchNo": "",
					"blnGift": true,
					"costComponentId": "",
					"remarks": "",
					"accbookTypeId": "",
					"accpurposeId": "",
					"twoLevelAccentityId": "",
					"oppAccentityId": "",
					"controlScopeId": "",
					"srcAccBookId": "",
					"makeDate": "",
					"busiDate": "",
					"periodId": "",
					"periodCode": "",
					"innerOrg": "",
					"cashFlowMainItem": "",
					"taxCode": "",
					"taxSubjectId": "",
					"direction": "",
					"mainUnitId": "",
					"taxExcludedPrice": 0,
					"taxIncludedPrice": 0,
					"taxRate": 0,
					"orgCurrtypeId": "",
					"recordNo": 0,
					"editRuleId": "",
					"blnRedRemark": true,
					"blnAccClear": true,
					"verifyCode": "",
					"oppClueId": "",
					"coaPlanId": "",
					"coaTypeId": "",
					"blnCoa": true,
					"blnAmt": true,
					"blnAccrued": true,
					"blnRespVoucher": true,
					"activityTypeId": "",
					"oppActivityTypeId": "",
					"oppWroteoffSubject": "",
					"oppFaId": "",
					"glVoucherNo": "",
					"glVoucherId": "",
					"srcBillNo": "",
					"srcBillTypeId": "",
					"srcBillId": "",
					"srcRowId": "",
					"oriBillNo": "",
					"oriBillTypeId": "",
					"sourceTradType": "",
					"oriBillId": "",
					"oriRowId": "",
					"srcSystemId": "",
					"def1CurrtypeId": "",
					"def1RateTypeId": "",
					"def1Rate": 0,
					"def1Amount": 0,
					"def2CurrtypeId": "",
					"def2RateTypeId": "",
					"def2Rate": 0,
					"def2Amount": 0,
					"def3CurrtypeId": "",
					"def3RateTypeId": "",
					"def3Rate": 0,
					"def3Amount": 0,
					"fiEventId": "",
					"voucherType": "",
					"voucherNo": "",
					"voucherTmplBId": "",
					"fiEventRecordId": "",
					"fiEventRecordNo": "",
					"ytenantId": "",
					"costItemTypeId": "",
					"srcAppId": "",
					"periodBeginType": 0,
					"blnPeriodBegin": true,
					"faAccBookCategoryId": "",
					"blnAdjustQuantity": "",
					"fiAppId": "",
					"productOrderId": "",
					"productionOrderId": "",
					"productionOrderRow": "",
					"produceProduct": "",
					"repairOrderId": "",
					"attachedNum": 0,
					"sendGlType": "",
					"accBookPropertyId": "",
					"makerId": "",
					"mergeRuleId": "",
					"voucherCategory": "",
					"blnEffective": true,
					"auditor": "",
					"auditTime": "",
					"auditState": "",
					"busiEventId": "",
					"srcBillDate": "",
					"srcBillAmount": 0,
					"srcBillOrgId": "",
					"srcBusiObjCode": "",
					"srcModule": "",
					"voucherTmplCode": "",
					"sendGlState": "",
					"sendGlOperation": "",
					"glGroupId": "",
					"writeoffStatus": "",
					"writeoffOpposeNo": "",
					"writeoffedVoucherId": "",
					"busiRel1": "",
					"busiRel2": "",
					"busiRel3": "",
					"busiRel4": "",
					"busiRel5": "",
					"busiRel6": "",
					"busiRel7": "",
					"busiRel8": "",
					"busiRel9": "",
					"busiRel10": "",
					"blnRecalculate": "",
					"blnManual": true,
					"orgCreditTotal": 0,
					"orgDebitTotal": 0,
					"groupCreditTotal": 0,
					"groupDebitTotal": 0,
					"creditTotal": 0,
					"debitTotal": 0,
					"controlCreditTotal": 0,
					"controlDebitTotal": 0,
					"globalCreditTotal": 0,
					"globalDebitTotal": 0,
					"blnWriteoff": "",
					"srcTradType": "",
					"businessPartnerId": "",
					"voucherTmplId": "",
					"blnBeginPeriodSplitCompleted": true,
					"blnBeginPeriodSplit": true,
					"sendEccState": "",
					"funBusiObj": "",
					"financialProduct": "",
					"header": "",
					"dr": 0,
					"createTime": "",
					"modifyTime": "",
					"creator": "",
					"modifier": "",
					"pubts": "",
					"fiEventRowId": "",
					"fiEventFullname": "",
					"fiEventSubjectRowId": "",
					"fiEventSubjectFullname": "",
					"fiEventSubjectField": "",
					"contractType": "",
					"aRconfimRule": "",
					"incomeConfirmRule": "",
					"blnAuxVoucherDetail": true,
					"currtypeConvertParam": "",
					"convertType": "",
					"controlConvertType": "",
					"groupConvertType": "",
					"globalConvertType": "",
					"cashFlowAttachItem": "",
					"mergeRecordId": "",
					"periodYear": ""
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	参数[accBookId]不能为空	null


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-27

更新

请求说明

更新

请求参数 voucherNos

更新

请求参数 ids

更新

返回参数 (264)

2	2025-10-28

更新

请求参数 (7)

取消接口非必输字段的默认值

3	2025-09-17

更新

请求说明

更新

请求参数 (7)

新增

返回参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

