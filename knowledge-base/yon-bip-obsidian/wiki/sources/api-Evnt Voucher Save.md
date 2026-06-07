---
title: "事项分录保存"
apiId: "2521655469418741760"
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

# 事项分录保存

> `ContentType	application/json` 请求方式	POST | 分类: Event Entry (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/AMP/AAI/eventvoucher/save

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
| srcVoucherId | string | 否 | 是 | Source Voucher Id |
| version | string | 否 | 是 | Version |
| data | object | 是 | 是 | 事项分录明细 |
| multiAccentityBatchNo | string | 否 | 否 | 批号 |
| multiAccentityVersion | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 版本号 |
| accbookId | string | 否 | 否 | 账簿 |
| accbookId___code | string | 否 | 否 | 账簿 |
| attachedNum | number |
| 小数位数:0,最大长度:11 | 否 | 否 | 附单据数 |
| auditState | string | 否 | 否 | 审核状态 |
| bipGlVoucherId | string | 否 | 否 | BIP总账凭证ID |
| bipGlVoucherNo | string | 否 | 否 | BIP总账凭证号 |
| blnBeginPeriodSplit | string | 否 | 否 | 期初拆分数据标识。1:Yes,0:No |
| blnBeginPeriodSplitCompleted | string | 否 | 否 | 期初被完全拆分标识。1:Yes,0:No |
| blnManual | string | 否 | 否 | 手工凭证。1:Yes,0:No |
| blnRecalculate | string | 否 | 否 | 重算。1:Yes,0:No |
| blnWriteoff | string | 否 | 否 | 冲销凭证。1:Yes,0:No |
| blnFromReversalVoucher | string | 否 | 否 | 总账凭证手工修改标识。1:Yes,0:No |
| busiDate | string | 否 | 否 | 业务日期 |
| busiRel1 | string | 否 | 否 | 业务关联信息1 |
| busiRel10 | string | 否 | 否 | 业务关联信息10 |
| busiRel2 | string | 否 | 否 | 业务关联信息2 |
| busiRel3 | string | 否 | 否 | 业务关联信息3 |
| busiRel4 | string | 否 | 否 | 业务关联信息4 |
| busiRel5 | string | 否 | 否 | 业务关联信息5 |
| busiRel6 | string | 否 | 否 | 业务关联信息6 |
| busiRel7 | string | 否 | 否 | 业务关联信息7 |
| busiRel8 | string | 否 | 否 | 业务关联信息8 |
| busiRel9 | string | 否 | 否 | 业务关联信息9 |
| cashFlowState | string | 否 | 否 | 现金流量状态 |
| controlCreditTotal | string | 否 | 否 | 管控范围币贷方合计 |
| controlDebitTotal | string | 否 | 否 | 管控范围币借方合计 |
| creditTotal | string | 否 | 否 | 本币贷方合计 |
| debitTotal | string | 否 | 否 | 本币借方合计 |
| dtcGtxid | string | 否 | 否 | 分布式事务id |
| dtcStatus | number |
| 小数位数:0,最大长度:11 | 否 | 否 | 分布式事务状态 |
| editRuleId | string | 否 | 否 | 修改规则 |
| fiAppCode | string | 否 | 否 | 财务应用编码 |
| fiEventCode | string | 否 | 否 | 会计事务号 |
| fiEventRecordId | string | 否 | 否 | 会计事务对应的记录的id |
| fiEventRecordNo | string | 否 | 否 | 会计事务记录号 |
| freeChId | object | 否 | 否 | 自由自定义项 |
| glGroupId | string | 否 | 否 | 总账凭证分组ID |
| glVoucherId | string | 否 | 否 | 总账凭证ID |
| glVoucherNo | string | 否 | 否 | 总账凭证号 |
| globalCreditTotal | string | 否 | 否 | 全局币贷方合计 |
| globalDebitTotal | string | 否 | 否 | 全局币借方合计 |
| groupCreditTotal | string | 否 | 否 | 集团币贷方合计 |
| groupDebitTotal | string | 否 | 否 | 集团币借方合计 |
| makeDate | string | 否 | 否 | 制单日期 |
| makerId | string | 否 | 否 | 制单人 |
| makerId___code | string | 否 | 否 | 制单人 |
| mergeRuleId | string | 否 | 否 | 分录合并规则 |
| orgCreditTotal | string | 否 | 否 | 组织币贷方合计 |
| orgDebitTotal | string | 否 | 否 | 组织币借方合计 |
| oriBillId | string | 否 | 否 | 源头单据id |
| oriBillNo | string | 否 | 否 | 源头单据号 |
| oriBillTypeId | string | 否 | 否 | 源头单据类型 |
| periodBeginType | number |
| 小数位数:0,最大长度:11 | 否 | 否 | 期初余额标识 |
| periodCode | string | 否 | 否 | 会计期间编码 |
| periodYear | string | 否 | 否 | 期间年 |
| sendGlOperation | string | 否 | 否 | 传总账操作。0:自动传,1:手工传 |
| sendGlState | string | 否 | 否 | 传总账状态。0:Transmitted successfully,1:Failed to transmit,2:Do not post to GL,3:Not posted to General Ledger,4:Transmitting |
| sendGlType | string | 否 | 否 | 传总账类型。0:Details,1:Summary,2:Do not post to GL |
| settleRedflushFiAppCode | string | 否 | 否 | 红冲财务应用编码 |
| settleRedflushFiAppId | string | 否 | 否 | 红冲财务应用ID |
| settleRedflushPeriodYear | string | 否 | 否 | 红冲的期间年编码 |
| settleRedflushType | string | 否 | 否 | 红冲标识 |
| settleRedflushVoucherId | string | 否 | 否 | 被红冲分录ID |
| srcAppCode | string | 否 | 否 | 来源应用编码 |
| srcBillAccountingDate | string | 否 | 否 | 来源单据记账日期 |
| srcBillAmount | string | 否 | 否 | 来源数据的金额 |
| srcBillDate | string | 否 | 否 | 来源单据日期 |
| srcBillId | string | 否 | 否 | 来源单据id |
| srcBillNo | string | 否 | 否 | 来源单据号 |
| srcBillOrgId | string | 否 | 否 | 来源数据的组织 |
| srcBillOrgId___code | string | 否 | 否 | 来源数据的组织 |
| srcBillTypeId | string | 否 | 否 | 来源单据类型 |
| srcBillTypeId___code | string | 否 | 否 | 来源单据类型 |
| srcBusiObjCode | string | 否 | 否 | 来源业务对象编码 |
| srcModule | string | 否 | 否 | 来源模块 |
| srcSystemId | string | 否 | 否 | 来源系统主键 |
| srcSystemId___code | string | 否 | 否 | 来源系统主键 |
| srcTradType | string | 否 | 否 | 来源交易类型 |
| srcTradType___code | string | 否 | 否 | 来源交易类型 |
| summary | string | 否 | 否 | 摘要 |
| transportPubts | date |
| 格式:yyyy-MM-dd | 否 | 否 | 传送时间 |
| transporter | string | 否 | 否 | 传送人 |
| transporter___code | string | 否 | 否 | 传送人 |
| voucherCategory | string | 否 | 否 | 凭证分类。1:Responsibility Voucher,2:Adjustment Voucher,3:Accrual Voucher,4:Amortization Voucher,5:Allocation Voucher,7:Gain/Loss Voucher,8:Income Tax Voucher,9:Accrual Settlement Voucher,10:Adjustment Period Voucher |
| voucherNo | string | 否 | 否 | 事项分录编码 |
| voucherTmplCode | string | 否 | 否 | 凭证模板编码 |
| voucherTmplId | string | 否 | 否 | 凭证模板ID |
| writeoffOpposeNo | string | 否 | 否 | 冲销对方编码-事项分录 |
| writeoffStatus | string | 否 | 否 | 冲销状态。0:Not Reversed,1:Reversed,2:Partial Reversal |
| writeoffedVoucherId | string | 否 | 否 | 被冲销凭证ID |
| oriSystem | string | 否 | 否 | 源头系统 |
| externalSourceSystemId | string | 否 | 否 | 外部来源系统id |
| externalSourceSystemName | string | 否 | 否 | 外部来源系统名称 |
| externalSourceDataId | string | 否 | 否 | 外部来源数据标识 |
| externalSourceDataType | string | 否 | 否 | 外部来源数据类型 |
| externalSourceDataVersion | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 外部来源数据版本号 |
| externalSourceDataCode | string | 否 | 否 | 外部来源数据编码 |
| details | object | 是 | 否 | 事项分录明细 |
| bustype | string | 否 | 否 | 交易类型 |
| bustype___code | string | 否 | 否 | 交易类型 |
| auditor | string | 否 | 否 | 审批人 |
| auditor___code | string | 否 | 否 | 审批人 |
| auditTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 审批日期 |
| auditNote | string | 否 | 否 | 审批批语 |
| procinstId | string | 否 | 否 | 流程实例ID |
| verifyState | string | 否 | 否 | 单据状态。0:Saved,1:Approving,2:Approved,3:Terminated,4:Rejected to Document Creator |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间 |
| modifier | string | 否 | 否 | 修改人 |
| modifier___code | string | 否 | 否 | 修改人 |
| creator | string | 否 | 否 | 创建人 |
| creator___code | string | 否 | 否 | 创建人 |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间 |
| ytenantId | string | 否 | 否 | 租户id |
| code | string | 否 | 否 | 编码 |
| dr | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 逻辑删除 |
| id | string | 否 | 否 | 主键 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳 |

## 3. 请求示例

Url: /yonbip/FCC/AMP/AAI/eventvoucher/save?access_token=访问令牌
Body: [{
	"srcVoucherId": "",
	"version": "",
	"data": [
		{
			"multiAccentityBatchNo": "",
			"multiAccentityVersion": 0,
			"accbookId": "",
			"accbookId___code": "",
			"attachedNum": 0,
			"auditState": "",
			"bipGlVoucherId": "",
			"bipGlVoucherNo": "",
			"blnBeginPeriodSplit": "",
			"blnBeginPeriodSplitCompleted": "",
			"blnManual": "",
			"blnRecalculate": "",
			"blnWriteoff": "",
			"blnFromReversalVoucher": "",
			"busiDate": "",
			"busiRel1": "",
			"busiRel10": "",
			"busiRel2": "",
			"busiRel3": "",
			"busiRel4": "",
			"busiRel5": "",
			"busiRel6": "",
			"busiRel7": "",
			"busiRel8": "",
			"busiRel9": "",
			"cashFlowState": "",
			"controlCreditTotal": "",
			"controlDebitTotal": "",
			"creditTotal": "",
			"debitTotal": "",
			"dtcGtxid": "",
			"dtcStatus": 0,
			"editRuleId": "",
			"fiAppCode": "",
			"fiEventCode": "",
			"fiEventRecordId": "",
			"fiEventRecordNo": "",
			"freeChId": {
				"id": "",
				"pubts": "2026-06-07 12:13:31",
				"ytenantId": ""
			},
			"glGroupId": "",
			"glVoucherId": "",
			"glVoucherNo": "",
			"globalCreditTotal": "",
			"globalDebitTotal": "",
			"groupCreditTotal": "",
			"groupDebitTotal": "",
			"makeDate": "",
			"makerId": "",
			"makerId___code": "",
			"mergeRuleId": "",
			"orgCreditTotal": "",
			"orgDebitTotal": "",
			"oriBillId": "",
			"oriBillNo": "",
			"oriBillTypeId": "",
			"periodBeginType": 0,
			"periodCode": "",
			"periodYear": "",
			"sendGlOperation": "",
			"sendGlState": "",
			"sendGlType": "",
			"settleRedflushFiAppCode": "",
			"settleRedflushFiAppId": "",
			"settleRedflushPeriodYear": "",
			"settleRedflushType": "",
			"settleRedflushVoucherId": "",
			"srcAppCode": "",
			"srcBillAccountingDate": "",
			"srcBillAmount": "",
			"srcBillDate": "",
			"srcBillId": "",
			"srcBillNo": "",
			"srcBillOrgId": "",
			"srcBillOrgId___code": "",
			"srcBillTypeId": "",
			"srcBillTypeId___code": "",
			"srcBusiObjCode": "",
			"srcModule": "",
			"srcSystemId": "",
			"srcSystemId___code": "",
			"srcTradType": "",
			"srcTradType___code": "",
			"summary": "",
			"transportPubts": "2026-06-07",
			"transporter": "",
			"transporter___code": "",
			"voucherCategory": "",
			"voucherNo": "",
			"voucherTmplCode": "",
			"voucherTmplId": "",
			"writeoffOpposeNo": "",
			"writeoffStatus": "",
			"writeoffedVoucherId": "",
			"oriSystem": "",
			"externalSourceSystemId": "",
			"externalSourceSystemName": "",
			"externalSourceDataId": "",
			"externalSourceDataType": "",
			"externalSourceDataVersion": 0,
			"externalSourceDataCode": "",
			"details": [
				{
					"costCollectorId": "",
					"costCollectorId___code": "",
					"multiAccentityTransId": "",
					"multiAccentityTransId___code": "",
					"aRconfimRule": "",
					"aRconfimRule___code": "",
					"accbookId": "",
					"accbookId___code": "",
					"accsubjectId": "",
					"accsubjectId___code": "",
					"activity": "",
					"activity___code": "",
					"activityTypeId": "",
					"activityTypeId___code": "",
					"amount": "",
					"attachedNum": 0,
					"auditState": "",
					"auditTime": "2026-06-07",
					"auditor": "",
					"auditor___code": "",
					"bankAccount": "",
					"bankAccount___code": "",
					"bankId": "",
					"bankId___code": "",
					"bankReconciliationNo": "",
					"batchNo": "",
					"blnAccClear": "",
					"blnAccrued": "",
					"blnAdjustQuantity": "",
					"blnAmt": "",
					"blnAuxVoucherDetail": "",
					"blnBeginPeriodSplit": "",
					"blnBeginPeriodSplitCompleted": "",
					"blnCoa": "",
					"blnGift": "",
					"blnManual": "",
					"blnRecalculate": "",
					"blnRedRemark": "",
					"blnRespVoucher": "",
					"blnWriteoff": "",
					"busiDate": "",
					"busiDeptId": "",
					"busiDeptId___code": "",
					"busiOrgId": "",
					"busiOrgId___code": "",
					"busiRel1": "",
					"busiRel10": "",
					"busiRel2": "",
					"busiRel3": "",
					"busiRel4": "",
					"busiRel5": "",
					"busiRel6": "",
					"busiRel7": "",
					"busiRel8": "",
					"busiRel9": "",
					"businessPartnerId": "",
					"businessPartnerId___code": "",
					"cashAccount": "",
					"cashAccount___code": "",
					"cashFlowAttachItem": "",
					"cashFlowAttachItem___code": "",
					"cashFlowMainItem": "",
					"cashFlowMainItem___code": "",
					"coaPlanId": "",
					"coaTypeId": "",
					"contractNo": "",
					"contractType": "",
					"contractType___code": "",
					"controlAmount": "",
					"controlConvertType": "",
					"controlCreditTotal": "",
					"controlDebitTotal": "",
					"controlRate": "",
					"controlRateOps": "",
					"convertType": "",
					"cooperateNo": "",
					"corpId": "",
					"corpId___code": "",
					"costCenterId": "",
					"costCenterId___code": "",
					"costComponentId": "",
					"costComponentId___code": "",
					"costElementId": "",
					"costElementId___code": "",
					"costField": "",
					"costField___code": "",
					"costItemId": "",
					"costItemId___code": "",
					"costItemTypeId": "",
					"costItemTypeId___code": "",
					"creditTotal": "",
					"currtypeConvertParam": "",
					"currtypeId": "",
					"currtypeId___code": "",
					"customerId": "",
					"customerId___code": "",
					"customerTypeId": "",
					"customerTypeId___code": "",
					"debitTotal": "",
					"def1Amount": "",
					"def1CurrtypeId": "",
					"def1CurrtypeId___code": "",
					"def1Rate": "",
					"def1RateOps": "",
					"def1RateTypeId": "",
					"def1RateTypeId___code": "",
					"def2Amount": "",
					"def2CurrtypeId": "",
					"def2CurrtypeId___code": "",
					"def2Rate": "",
					"def2RateOps": "",
					"def2RateTypeId": "",
					"def2RateTypeId___code": "",
					"def3Amount": "",
					"def3CurrtypeId": "",
					"def3CurrtypeId___code": "",
					"def3Rate": "",
					"def3RateOps": "",
					"def3RateTypeId": "",
					"def3RateTypeId___code": "",
					"deptNature": "",
					"deptNature___code": "",
					"direction": "",
					"editRuleId": "",
					"employeeId": "",
					"employeeId___code": "",
					"expireDate": "",
					"faAddWay": "",
					"faAddWay___code": "",
					"faCategoryId": "",
					"faCategoryId___code": "",
					"faChangeDirection": "",
					"faCode": "",
					"faCreateCardDate": "",
					"faEntityCode": "",
					"faImpairmentReason": "",
					"faImpairmentReason___code": "",
					"faImpairmentUnitId": "",
					"faImpairmentUnitId___code": "",
					"faLabelNo": "",
					"faLocation": "",
					"faMgmtDeptId": "",
					"faMgmtDeptId___code": "",
					"faName": "",
					"faPositionId": "",
					"faPositionId___code": "",
					"faReduceWay": "",
					"faReduceWay___code": "",
					"faSubcategoryId": "",
					"faSubcategoryId___code": "",
					"faUsageStateId": "",
					"faUsageStateId___code": "",
					"faUseDept": "",
					"faUseDept___code": "",
					"fiAppCode": "",
					"fiEventFullname": "",
					"fiEventRecordId": "",
					"fiEventRecordNo": "",
					"fiEventRowId": "",
					"fiEventSubjectField": "",
					"fiEventSubjectFullname": "",
					"fiEventSubjectRowId": "",
					"financialProduct": "",
					"financialProduct___code": "",
					"freeChId": {},
					"funBusiObj": "",
					"funBusiObj___code": "",
					"glGroupId": "",
					"glVoucherId": "",
					"glVoucherNo": "",
					"globalAmount": "",
					"globalConvertType": "",
					"globalCreditTotal": "",
					"globalCurrtypeId": "",
					"globalCurrtypeId___code": "",
					"globalDebitTotal": "",
					"globalRate": "",
					"globalRateOps": "",
					"globalRateTypeId": "",
					"globalRateTypeId___code": "",
					"goodsSort": "",
					"goodsSort___code": "",
					"groupAmount": "",
					"groupConvertType": "",
					"groupCreditTotal": "",
					"groupCurrtypeId": "",
					"groupCurrtypeId___code": "",
					"groupDebitTotal": "",
					"groupRate": "",
					"groupRateOps": "",
					"groupRateTypeId": "",
					"groupRateTypeId___code": "",
					"header": "",
					"incomeConfirmRule": "",
					"incomeConfirmRule___code": "",
					"innerOrg": "",
					"innerOrg___code": "",
					"inventoryOrgId": "",
					"inventoryOrgId___code": "",
					"invoiceCode": "",
					"invoiceNo": "",
					"invoiceTypeId": "",
					"invoiceTypeId___code": "",
					"mainUnitId": "",
					"mainUnitId___code": "",
					"makeDate": "",
					"makerId": "",
					"makerId___code": "",
					"matChId": {
						"A_00": "",
						"A_04": true,
						"A_05": "",
						"A_05___code": "",
						"A_06": "",
						"A_06___code": "",
						"A_08": "2026-06-07",
						"A_09": "",
						"A_10": "2026-06-07 12:13:31",
						"ApdocRfchkDmnSrvT01": "",
						"ApdocRfchkDmnSrvT01___code": "",
						"CH001": "",
						"CH001___code": "",
						"CH002": "",
						"CH002___code": "",
						"DS": "",
						"DS___code": "",
						"DS1": "",
						"DS1___code": "",
						"GC035": "",
						"JSGZ1": "",
						"JSGZ1___code": "",
						"LZC_DN": "",
						"LZC_DN___code": "",
						"LZC_FBL": "",
						"LZC_FBL___code": "",
						"LZC_SXL": "",
						"LZC_SXL___code": "",
						"PZ01": "",
						"PZ01___code": "",
						"SF002": "",
						"TZ_cc_01": "",
						"TZ_cc_02": "",
						"WL_TZ_SIZE": "",
						"WYQ_TZ_XX_001": "",
						"YS01": "",
						"YS01___code": "",
						"a12323": "",
						"abc": "",
						"accountflag": "",
						"asd007": "",
						"bankNumber": "",
						"bank_reconcileno": "",
						"c1024": "",
						"ces121": "",
						"ces121___code": "",
						"ceshikehu": "",
						"ceshikehu___code": "",
						"cgl11": "2026-06-07",
						"color": "",
						"color001": "",
						"color002": "",
						"curr_rate": "",
						"cust": "",
						"cust___code": "",
						"def3": "",
						"delflag": true,
						"dr": 0,
						"dx_udef1": "",
						"dx_udef2": "",
						"dxh": "",
						"dxh___code": "",
						"f_length": "",
						"ff34": "",
						"ff34___code": "",
						"guige": "",
						"guige___code": "",
						"id": "",
						"jgmlwb001": "",
						"jichudangan": "",
						"jichudangan___code": "",
						"ke251": "",
						"ke251___code": "",
						"kehudangan": "",
						"kehudangan___code": "",
						"la11": "",
						"lcl_text": "",
						"p4": "",
						"p4___code": "",
						"ping251": "",
						"ping251___code": "",
						"po0916001": "",
						"po0916002": "",
						"po0916003": "",
						"po0916004": 0,
						"po0916005": true,
						"po0916006": "",
						"po0916006___code": "",
						"po0916007": "",
						"po0916007___code": "",
						"po0916008": "2026-06-07",
						"po0916009": "",
						"po0916010": "2026-06-07 12:13:31",
						"privateDomain": "",
						"pubts": "2026-06-07 12:13:31",
						"qwe0001": "",
						"qwe_wl025": "2026-06-07 12:13:31",
						"qwe_wl026": "",
						"qwe_wl026___code": "",
						"qwe_wl027": "",
						"qwe_wl027___code": "",
						"qwe_wl028": "",
						"qwe_wl028___code": "",
						"qwe_zyx001": "",
						"qwe_zyx002": "",
						"qwe_zyx003": "",
						"qwe_zyx004": "",
						"qwe_zyx005": "",
						"qwe_zyx006": "",
						"qwe_zyx007": "",
						"qwe_zyx008": "",
						"qwe_zyx009": "",
						"qwe_zyx010": "",
						"qwe_zyx011": "",
						"qwe_zyx012": "",
						"qwe_zyx013": true,
						"qwe_zyx014": "",
						"qwe_zyx014___code": "",
						"qwe_zyx015": "",
						"qwe_zyx015___code": "",
						"qwe_zyx016": "",
						"qwe_zyx016___code": "",
						"qwe_zyx017": "",
						"qwe_zyx017___code": "",
						"qwe_zyx018": "",
						"qwe_zyx018___code": "",
						"qwe_zyx019": "",
						"qwe_zyx019___code": "",
						"qwe_zyx020": "",
						"qwe_zyx020___code": "",
						"qwe_zyx021": "",
						"qwe_zyx021___code": "",
						"qwe_zyx022": "",
						"qwe_zyx022___code": "",
						"qwe_zyx023": "2026-06-07",
						"qwe_zyx024": "",
						"qwe_zyx025": "2026-06-07 12:13:31",
						"registe_bankcode": "",
						"retail_color_00002": "",
						"retail_color_00002___code": "",
						"riqishijian": "2026-06-07 12:13:31",
						"s001": "",
						"s001___code": "",
						"s002": "",
						"s002___code": "",
						"shouji": "",
						"shouji___code": "",
						"shuzhi": "",
						"size": "",
						"t202210281018": "",
						"test0103g1": "2026-06-07",
						"test_0823_01": "",
						"test_rev_amt_def": "",
						"test_rev_thre_amt_def": "",
						"tzxgg": "",
						"wenben": "",
						"willbe": true,
						"willjbda": "",
						"willjbda___code": "",
						"willsz": "",
						"wxjtest01": "",
						"xgg_00": "",
						"xgg_01": "",
						"xgg_02": 0,
						"xgg_04": true,
						"xgg_05": "",
						"xgg_05___code": "",
						"xgg_06": "",
						"xgg_06___code": "",
						"xgg_06_1": "",
						"xgg_06_1___code": "",
						"xgg_08": "",
						"xgg_09": "2026-06-07 12:13:31",
						"xgg_16": "",
						"xiang251": "",
						"xiang251___code": "",
						"xmy002": "",
						"yanse123": "",
						"yanse123___code": "",
						"ygytest01": "",
						"ygytest01___code": "",
						"ypdfanweizhi": "",
						"ytenantId": "",
						"yxy0001": "",
						"yxy0001___code": "",
						"zkl_220": "",
						"zz001": ""
					},
					"materialCostSort": "",
					"materialCostSort___code": "",
					"materialId": "",
					"materialId___code": "",
					"materialSort": "",
					"materialSort___code": "",
					"mergeRecordId": "",
					"mergeRuleId": "",
					"noteDate": "",
					"noteNo": "",
					"oppAccentityId": "",
					"oppAccentityId___code": "",
					"oppActivityTypeId": "",
					"oppActivityTypeId___code": "",
					"oppClueId": "",
					"oppFaId": "",
					"oppFaId___code": "",
					"oppWroteoffSubject": "",
					"oppWroteoffSubject___code": "",
					"orderNo": "",
					"orgAmount": "",
					"orgCreditTotal": "",
					"orgCurrtypeId": "",
					"orgCurrtypeId___code": "",
					"orgDebitTotal": "",
					"orgRate": "",
					"orgRateOps": "",
					"orgRateTypeId": "",
					"orgRateTypeId___code": "",
					"oriAmount": "",
					"oriBillId": "",
					"oriBillNo": "",
					"oriBillTypeId": "",
					"oriBillTypeId___code": "",
					"oriCurrtypeId": "",
					"oriCurrtypeId___code": "",
					"oriRowId": "",
					"originalRecordNo": 0,
					"outsourcingOrgId": "",
					"outsourcingOrgId___code": "",
					"payAgreement": "",
					"payAgreement___code": "",
					"paymentType": "",
					"paymentType___code": "",
					"periodBeginType": 0,
					"periodCode": "",
					"periodYear": "",
					"personAttribute": "",
					"personAttribute___code": "",
					"planProportion": "",
					"prodOrgId": "",
					"prodOrgId___code": "",
					"produceProduct": "",
					"productOrderId": "",
					"productionOrderId": "",
					"productionOrderRow": "",
					"profitCenterId": "",
					"profitCenterId___code": "",
					"projectClass": "",
					"projectClass___code": "",
					"projectId": "",
					"projectId___code": "",
					"quantity": "",
					"rate": "",
					"rateDate": "",
					"rateOps": "",
					"rateTypeId": "",
					"rateTypeId___code": "",
					"receiveAgreement": "",
					"receiveAgreement___code": "",
					"recordNo": 0,
					"remarks": "",
					"repairOrderId": "",
					"retailerId": "",
					"rpObjectType": "",
					"salaryItem": "",
					"salesOrderId": "",
					"salesOrderId___code": "",
					"salesOrderRowId": "",
					"salesOrderRowId___code": "",
					"salesmanId": "",
					"salesmanId___code": "",
					"sendEccState": "",
					"sendGlOperation": "",
					"sendGlState": "",
					"sendGlType": "",
					"settleMode": "",
					"settleMode___code": "",
					"settleRedflushFiAppCode": "",
					"settleRedflushFiAppId": "",
					"settleRedflushPeriodYear": "",
					"settleRedflushType": "",
					"settleRedflushVoucherId": "",
					"smartCheckNo": "",
					"sourceTradType": "",
					"sourceTradType___code": "",
					"srcAppCode": "",
					"srcBillAmount": "",
					"srcBillDate": "",
					"srcBillId": "",
					"srcBillNo": "",
					"srcBillOrgId": "",
					"srcBillOrgId___code": "",
					"srcBillTypeId": "",
					"srcBillTypeId___code": "",
					"srcBusiObjCode": "",
					"srcModule": "",
					"srcRowId": "",
					"srcSystemId": "",
					"srcSystemId___code": "",
					"srcTradType": "",
					"srcTradType___code": "",
					"startDate": "",
					"summary": "",
					"supplierId": "",
					"supplierId___code": "",
					"supplierTypeId": "",
					"supplierTypeId___code": "",
					"taxCode": "",
					"taxExcludedPrice": "",
					"taxIncludedPrice": "",
					"taxRate": "",
					"taxSubjectId": "",
					"taxSubjectId___code": "",
					"twoLevelAccentityId": "",
					"twoLevelAccentityId___code": "",
					"verifyCode": "",
					"verifyNo": "",
					"verifySrc": "",
					"voucherCategory": "",
					"voucherNo": "",
					"voucherTmplBId": "",
					"voucherTmplCode": "",
					"voucherTmplId": "",
					"warehouseId": "",
					"warehouseId___code": "",
					"warehouserKeeperId": "",
					"warehouserKeeperId___code": "",
					"wbs": "",
					"wbs___code": "",
					"writeoffOpposeNo": "",
					"writeoffStatus": "",
					"writeoffedVoucherId": "",
					"ytenantId": "",
					"oriSystem": "",
					"externalSourceSystemId": "",
					"externalSourceSystemName": "",
					"externalSourceDataId": "",
					"externalSourceDataType": "",
					"externalSourceDataVersion": 0,
					"externalSourceDataIdH": "",
					"externalSourceDataCode": "",
					"CashFlowDOList": [
						{
							"accbookId": "",
							"accsubjectdirection": "",
							"amountOrg": "",
							"amountOriginal": "",
							"cashFlowItem": "",
							"cashFlowItem___code": "",
							"controlAmount": "",
							"direction": "",
							"glCashFlowId": "",
							"globalAmount": "",
							"groupAmount": "",
							"innerorg": "",
							"innerorg___code": "",
							"isCashFlowOpening": true,
							"mainItem": true,
							"mergeRecordId": "",
							"orgAmount": "",
							"periodCode": "",
							"periodYear": "",
							"voucherId": "",
							"voucherRecordId": "",
							"id": "",
							"pubts": "2026-06-07 12:13:31",
							"createTime": "2026-06-07 12:13:31",
							"creator": "",
							"creator___code": "",
							"modifier": "",
							"modifier___code": "",
							"modifyTime": "2026-06-07 12:13:31",
							"ytenantId": "",
							"dr": 0
						}
					],
					"id": "",
					"pubts": "2026-06-07 12:13:31",
					"createTime": "2026-06-07 12:13:31",
					"creator": "",
					"creator___code": "",
					"modifier": "",
					"modifier___code": "",
					"modifyTime": "2026-06-07 12:13:31",
					"dr": 0
				}
			],
			"bustype": "",
			"bustype___code": "",
			"auditor": "",
			"auditor___code": "",
			"auditTime": "2026-06-07 12:13:31",
			"auditNote": "",
			"procinstId": "",
			"verifyState": "",
			"createTime": "2026-06-07 12:13:31",
			"modifier": "",
			"modifier___code": "",
			"creator": "",
			"creator___code": "",
			"modifyTime": "2026-06-07 12:13:31",
			"ytenantId": "",
			"code": "",
			"dr": 0,
			"id": "",
			"pubts": "2026-06-07 12:13:31"
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-27

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

