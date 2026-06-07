---
title: "合同变更单详情"
apiId: "2154133477333139465"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Contract Change"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同变更单详情

> `ContentType	application/json` 请求方式	GET | 分类: Contract Change (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/apct/openapi/bill/changedetail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 变更单id,变更单id和单据号必选其    示例: 1476727009146568707 |
| code | string | query | 否 | 变更单单据号,变更单id和单据号必选其一    示例: BGD202207151234 |

## 3. 请求示例

Url: /yonbip/znbz/apct/openapi/bill/changedetail?access_token=访问令牌&id=1476727009146568707&code=BGD202207151234

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | ID |
| code | string | 否 | 合同编码 |
| attachmentId | string | 否 | 附件 |
| auditDate | string | 否 | 审批日期 |
| auditTime | string | 否 | 审批时间 |
| auditor | string | 否 | 审批人名称 |
| auditorId | object | 是 | 审批人 |
| availableAmt | number |
| 小数位数:8,最大长度:28 | 否 | 合同可用金额 |
| createTime | string | 否 | 创建时间 |
| isDeleted | boolean | 否 | 逻辑删除标记 |
| modifierId | object | 是 | 修改人 |
| payTermId | object | 是 | 付款协议 |
| tplid | string | 否 | 模板id |
| usedAmt | number |
| 小数位数:8,最大长度:28 | 否 | 合同已用金额 |
| ctVouchdate | string | 否 | 合同单据日期 |
| contractDirection | string | 否 | 收支方向 |
| localCurrency | object | 是 | 本币币种 |
| customer | object | 是 | 客户 |
| pushBillSystem | string | 否 | 下推单据系统 |
| originalMoneyAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币价税合计 |
| originalTaxAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币税额 |
| noTaxOriginalMoneyAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币无税金额 |
| localMoneyAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额 |
| localTaxAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 |
| noTaxLocalMoneyAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税金额 |
| localPlanAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币付款金额 |
| retentionApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币付款已退质保金金额 |
| advanceApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退预付款金额 |
| localRetentionApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币付款已退质保金金额 |
| localAdvanceApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已退预付款金额 |
| localAvailableAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币合同付款可用金额 |
| localUsedAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币合同付款已用金额 |
| localOriginalReceiptAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币收票金额 |
| localUnapprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币付款金额 |
| localApprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币付款金额 |
| localPaidAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已付款金额 |
| localApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币退款金额 |
| localUnapprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币预付款金额 |
| localApprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币预付款金额 |
| localPaidAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已付预付款金额 |
| localUnapprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币质保金金额 |
| localApprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币质保金金额 |
| localPaidRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已付质保金金额 |
| localMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已收保证金金额 |
| localUnapprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币退保证金金额 |
| localApprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币退保证金金额 |
| localMarginRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已退保证金金额 |
| unapprSubjectLocalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币应付金额 |
| apprSubjectLocalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币应付金额 |
| verifiedSubjectLocalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已核销本币应付金额 |
| roriginalTotalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币收款金额 |
| rlocalPlanAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币收款金额 |
| ravailableAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币合同收款可用金额 |
| rusedAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币合同收款已用金额 |
| rlocalAvailableAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币合同收款可用金额 |
| rlocalUsedAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币合同收款已用金额 |
| rretentionApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币收款已退质保金金额 |
| radvanceApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退预收款金额 |
| rlocalRetentionApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币收款已退质保金金额 |
| rlocalAdvanceApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已退预收款金额 |
| roriginalReceiptAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币开票金额 |
| runapprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币收款金额 |
| rapprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币收款金额 |
| rpaidAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收款金额 |
| rapprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退款金额 |
| runapprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币预收款金额 |
| rapprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币预收款金额 |
| rpaidAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收预收款金额 |
| runapprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币质保金金额 |
| rapprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币质保金金额 |
| rpaidRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币收款质保金金额 |
| rmarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收保证金金额 |
| runapprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退保证金金额 |
| rapprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退保证金金额 |
| rmarginRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退保证金金额 |
| rlocalOriginalReceiptAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币开票金额 |
| rlocalUnapprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币收款金额 |
| rlocalApprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币收款金额 |
| rlocalPaidAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已收款金额 |
| rlocalApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币退款金额 |
| rlocalUnapprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币预收款金额 |
| rlocalApprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币预收款金额 |
| rlocalPaidAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已收预收款金额 |
| rlocalUnapprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币质保金金额 |
| rlocalApprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币质保金金额 |
| rlocalPaidRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币收款质保金金额 |
| rlocalMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已收保证金金额 |
| rlocalUnapprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币退保证金金额 |
| rlocalApprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币退保证金金额 |
| rlocalMarginRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 本币已退保证金金额 |
| runapprSubjectOriginalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币应收金额 |
| rapprSubjectOriginalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币应收金额 |
| rverifiedSubjectOriginalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已核销原币应收金额 |
| runapprSubjectLocalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币应收金额 |
| rapprSubjectLocalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币应收金额 |
| rverifiedSubjectLocalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已核销本币应收金额 |
| ytenant | object | 是 | 租户id |
| wbs | object | 是 | WBS |
| activity | object | 是 | 活动 |
| ctId | string | 否 | ctId |
| reason | string | 否 | 变更原因 |
| ctDate | string | 否 | ctDate |
| beforeCtId | string | 否 | beforeCtId |
| isWfControlled | boolean | 否 | 是否受审批控制 |
| ctCode | string | 否 | 合同单据号 |
| version | string | 否 | version |
| verifystate | string | 否 | 审批状态 |
| acctEntityId | object | 是 | 会计主体id |
| returncount | string | 否 | 退回次数 |
| businessCode | string | 否 | 合同业务号 |
| name | string | 否 | 合同名称 |
| ctBustype | object | 是 | 合同类型id |
| ctVersion | string | 否 | 版本号 |
| signDate | string | 否 | 签字盖章日期 |
| valDate | string | 否 | 计划生效日期 |
| invalDate | string | 否 | 计划终止日期 |
| orgId | object | 是 | 承办组织id |
| deptId | object | 是 | 承办部门id |
| personnelId | object | 是 | 承办人员id |
| applyBillId | object | 是 | 申请单id |
| currencyId | object | 是 | 币种id |
| rateTypeId | object | 是 | 汇率类型id |
| rateDate | string | 否 | 汇率日期 |
| nexchangeRate | number |
| 小数位数:8,最大长度:28 | 否 | 折本汇率 |
| settleTypeId | object | 是 | 结算方式id |
| populateMode | string | 否 | 计划金额计算方式 |
| exceedRatio | number |
| 小数位数:8,最大长度:28 | 否 | 超合同付款比例(%) |
| openFlag | string | 否 | 是否敞口合同 |
| projectId | object | 是 | 项目名称id |
| beginningFlag | string | 否 | 期初标志 |
| status | string | 否 | 变更单状态 |
| signOrgId | object | 是 | 签约组织(本方)id |
| payerAccountId | object | 是 | 付款方银行账户 |
| payerCardno | string | 否 | 付款方银行账号 |
| supplierId | object | 是 | 供应商id |
| payeeAccountId | object | 是 | 收款方银行账户 |
| payeeCardno | string | 否 | 收款方银行账号 |
| originalTotalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币价税合计 |
| originalReceiptAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币收票金额 |
| unapprSubjectAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币应付金额 |
| apprSubjectAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币应付金额 |
| verfitySubjectAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已核销原币应付金额 |
| unapprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币付款金额 |
| apprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币付款金额 |
| paidAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付款金额 |
| unapprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币预付款金额 |
| apprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币预付款金额 |
| paidAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付预付款金额 |
| unapprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币质保金金额 |
| apprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币质保金金额 |
| paidRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付质保金金额 |
| marginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收保证金金额 |
| unapprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退保证金金额 |
| creator | string | 否 | 制单人 |
| apprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退保证金金额 |
| createDate | string | 否 | 制单日期 |
| marginRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退保证金金额 |
| apprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退款金额 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| modifier | string | 否 | 修改人名称 |
| tenant | object | 是 | tenant |
| pubts | string | 否 | 时间戳 |
| bustype | object | 是 | 变更单类型 |
| creatorId | object | 是 | 创建人 |
| apctChangeCounterpartys | object | 是 | 合同相对方 |
| changeibpmcurrentauditor | object | 是 | 当前审批人 |
| ibpmsteps | object | 是 | 合同审批业务阶段 |
| items | object | 是 | 合同条款 |
| materials | object | 是 | 合同标的物子表 |
| plans | object | 是 | 付款计划子表 |
| receiptplans | object | 是 | 收款计划子表 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "",
		"code": "",
		"attachmentId": "",
		"auditDate": "",
		"auditTime": "",
		"auditor": "",
		"auditorId": [
			{}
		],
		"availableAmt": 0,
		"createTime": "",
		"isDeleted": true,
		"modifierId": [
			{}
		],
		"payTermId": [
			{}
		],
		"tplid": "",
		"usedAmt": 0,
		"ctVouchdate": "",
		"contractDirection": "",
		"localCurrency": [
			{}
		],
		"customer": [
			{}
		],
		"pushBillSystem": "",
		"originalMoneyAmt": 0,
		"originalTaxAmt": 0,
		"noTaxOriginalMoneyAmt": 0,
		"localMoneyAmt": 0,
		"localTaxAmt": 0,
		"noTaxLocalMoneyAmt": 0,
		"localPlanAmt": 0,
		"retentionApprPlanRefundAmt": 0,
		"advanceApprPlanRefundAmt": 0,
		"localRetentionApprPlanRefundAmt": 0,
		"localAdvanceApprPlanRefundAmt": 0,
		"localAvailableAmt": 0,
		"localUsedAmt": 0,
		"localOriginalReceiptAmt": 0,
		"localUnapprAmt": 0,
		"localApprAmt": 0,
		"localPaidAmt": 0,
		"localApprPlanRefundAmt": 0,
		"localUnapprAdvanceAmt": 0,
		"localApprAdvanceAmt": 0,
		"localPaidAdvanceAmt": 0,
		"localUnapprRetentionAmt": 0,
		"localApprRetentionAmt": 0,
		"localPaidRetentionAmt": 0,
		"localMarginAmt": 0,
		"localUnapprMarginAmt": 0,
		"localApprMarginAmt": 0,
		"localMarginRefundAmt": 0,
		"unapprSubjectLocalAmt": 0,
		"apprSubjectLocalAmt": 0,
		"verifiedSubjectLocalAmt": 0,
		"roriginalTotalAmt": 0,
		"rlocalPlanAmt": 0,
		"ravailableAmt": 0,
		"rusedAmt": 0,
		"rlocalAvailableAmt": 0,
		"rlocalUsedAmt": 0,
		"rretentionApprPlanRefundAmt": 0,
		"radvanceApprPlanRefundAmt": 0,
		"rlocalRetentionApprPlanRefundAmt": 0,
		"rlocalAdvanceApprPlanRefundAmt": 0,
		"roriginalReceiptAmt": 0,
		"runapprAmt": 0,
		"rapprAmt": 0,
		"rpaidAmt": 0,
		"rapprPlanRefundAmt": 0,
		"runapprAdvanceAmt": 0,
		"rapprAdvanceAmt": 0,
		"rpaidAdvanceAmt": 0,
		"runapprRetentionAmt": 0,
		"rapprRetentionAmt": 0,
		"rpaidRetentionAmt": 0,
		"rmarginAmt": 0,
		"runapprMarginAmt": 0,
		"rapprMarginAmt": 0,
		"rmarginRefundAmt": 0,
		"rlocalOriginalReceiptAmt": 0,
		"rlocalUnapprAmt": 0,
		"rlocalApprAmt": 0,
		"rlocalPaidAmt": 0,
		"rlocalApprPlanRefundAmt": 0,
		"rlocalUnapprAdvanceAmt": 0,
		"rlocalApprAdvanceAmt": 0,
		"rlocalPaidAdvanceAmt": 0,
		"rlocalUnapprRetentionAmt": 0,
		"rlocalApprRetentionAmt": 0,
		"rlocalPaidRetentionAmt": 0,
		"rlocalMarginAmt": 0,
		"rlocalUnapprMarginAmt": 0,
		"rlocalApprMarginAmt": 0,
		"rlocalMarginRefundAmt": 0,
		"runapprSubjectOriginalAmt": 0,
		"rapprSubjectOriginalAmt": 0,
		"rverifiedSubjectOriginalAmt": 0,
		"runapprSubjectLocalAmt": 0,
		"rapprSubjectLocalAmt": 0,
		"rverifiedSubjectLocalAmt": 0,
		"ytenant": [
			{}
		],
		"wbs": [
			{}
		],
		"activity": [
			{}
		],
		"ctId": "",
		"reason": "",
		"ctDate": "",
		"beforeCtId": "",
		"isWfControlled": true,
		"ctCode": "",
		"version": "",
		"verifystate": "",
		"acctEntityId": [
			{}
		],
		"returncount": "",
		"businessCode": "",
		"name": "",
		"ctBustype": [
			{}
		],
		"ctVersion": "",
		"signDate": "",
		"valDate": "",
		"invalDate": "",
		"orgId": [
			{}
		],
		"deptId": [
			{}
		],
		"personnelId": [
			{}
		],
		"applyBillId": [
			{}
		],
		"currencyId": [
			{}
		],
		"rateTypeId": [
			{}
		],
		"rateDate": "",
		"nexchangeRate": 0,
		"settleTypeId": [
			{}
		],
		"populateMode": "",
		"exceedRatio": 0,
		"openFlag": "",
		"projectId": [
			{}
		],
		"beginningFlag": "",
		"status": "",
		"signOrgId": [
			{}
		],
		"payerAccountId": [
			{}
		],
		"payerCardno": "",
		"supplierId": [
			{}
		],
		"payeeAccountId": [
			{}
		],
		"payeeCardno": "",
		"originalTotalAmt": 0,
		"originalReceiptAmt": 0,
		"unapprSubjectAmt": 0,
		"apprSubjectAmt": 0,
		"verfitySubjectAmt": 0,
		"unapprAmt": 0,
		"apprAmt": 0,
		"paidAmt": 0,
		"unapprAdvanceAmt": 0,
		"apprAdvanceAmt": 0,
		"paidAdvanceAmt": 0,
		"unapprRetentionAmt": 0,
		"apprRetentionAmt": 0,
		"paidRetentionAmt": 0,
		"marginAmt": 0,
		"unapprMarginAmt": 0,
		"creator": "",
		"apprMarginAmt": 0,
		"createDate": "",
		"marginRefundAmt": 0,
		"apprPlanRefundAmt": 0,
		"modifyTime": "",
		"modifyDate": "",
		"modifier": "",
		"tenant": [
			{}
		],
		"pubts": "",
		"bustype": [
			{}
		],
		"creatorId": [
			{}
		],
		"apctChangeCounterpartys": [
			{
				"changeId": "",
				"counterpartyType": "",
				"supplierId": "",
				"customerId": "",
				"contactNumber": "",
				"mailAddress": "",
				"payAccountId": "",
				"sourceautoid": "",
				"tenant": "",
				"ytenant": "",
				"createTime": "",
				"createDate": "",
				"modifyTime": "",
				"modifyDate": "",
				"creator": "",
				"modifier": "",
				"creatorId": "",
				"modifierId": "",
				"isDeleted": true,
				"id": "",
				"pubts": ""
			}
		],
		"changeibpmcurrentauditor": [
			{
				"approvalActivityId": "",
				"approvalActivityName": "",
				"approvalActivityResid": "",
				"approvalComment": "",
				"approvalInstId": "",
				"approvalResult": "",
				"approvalSign": "",
				"approvalTime": "",
				"auditor": "",
				"changeId": "",
				"id": "",
				"pubts": "",
				"taskId": "",
				"taskStatus": "",
				"tenant": "",
				"ytenant": ""
			}
		],
		"ibpmsteps": [
			{
				"stepId": "",
				"taskId": "",
				"changeId": "",
				"flag": "",
				"id": "",
				"processinstId": "",
				"pubts": "",
				"stepLastModify": "",
				"stepparam": "",
				"tenant": "",
				"yTenantId": ""
			}
		],
		"items": [
			{
				"changeId": "",
				"code": "",
				"ytenant": "",
				"content": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"id": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"name": "",
				"note": "",
				"otherInfo": "",
				"pubts": "",
				"referId": "",
				"tenant": ""
			}
		],
		"materials": [
			{
				"changeId": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"material": "",
				"rowNo": 0,
				"contractDirection": "",
				"payTermId": "",
				"materialCode": "",
				"costCenter": "",
				"costCenterCode": "",
				"profitCenter": "",
				"profitCenterCode": "",
				"quantity": 0,
				"unit": "",
				"taxSubject": "",
				"taxRateId": "",
				"originalPrice": 0,
				"noTaxOriginalPrice": 0,
				"originalTax": 0,
				"noTaxOriginalMoney": 0,
				"localPrice": 0,
				"noTaxLocalPrice": 0,
				"localMoney": 0,
				"localTax": 0,
				"noTaxLocalMoney": 0,
				"localInvoiceTotal": 0,
				"originalInvoiceTotal": 0,
				"sourceautorowid": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"materialTypeId": "",
				"unapprRefundSubjectAmt": 0,
				"apprRefundSubjectAmt": 0,
				"unapprRefundSubjectLocalAmt": 0,
				"apprRefundSubjectLocalAmt": 0,
				"ytenant": "",
				"creatorId": "",
				"expenseitemId": "",
				"id": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"originalTotalAmt": 0,
				"pk_projectapply": "",
				"pubts": "",
				"releaseAmt": 0,
				"tenant": "",
				"usedAmt": 0
			}
		],
		"plans": [
			{
				"planName": "",
				"beginBase": "",
				"changeId": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"localPlanAmt": 0,
				"acctEntityId": "",
				"rowNo": "",
				"materialId": "",
				"issueNo": "",
				"localUnapprAmt": 0,
				"localApprAmt": 0,
				"localPaidAmt": 0,
				"localApprPlanRefundAmt": 0,
				"payTermId": "",
				"localInvoiceTotal": 0,
				"originalInvoiceTotal": 0,
				"verifiedSubjectOriginalAmt": 0,
				"unapprSubjectLocalAmt": 0,
				"apprSubjectLocalAmt": 0,
				"verifiedSubjectLocalAmt": 0,
				"sourceautorowid": "",
				"supplierId": "",
				"customer": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"settleModeId": "",
				"startTimeId": "",
				"startDate": "",
				"deloyDays": 0,
				"deloyMonth": 0,
				"accountPeriod": 0,
				"accountPeriodUnitId": "",
				"accountComfirmWay": "",
				"fixedAccountDate": "",
				"fixedAccountDate1": "",
				"fixedAccountDate2": "",
				"fixedAccountDate3": "",
				"fixedAccountDate4": "",
				"fixedExpireDate": "",
				"expireComfirmWay": "",
				"fixedExpireDate1": "",
				"fixedExpireDate2": "",
				"fixedExpireDate3": "",
				"fixedExpireDate4": "",
				"ytenant": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"pubts": "",
				"tenant": "",
				"id": "",
				"code": "",
				"planRatio": 0,
				"planAmt": 0,
				"condition": "",
				"beginDate": "",
				"accountDays": "",
				"payEndDate": "",
				"expenseitemId": "",
				"amtTypeId": "",
				"advanceFlag": "",
				"marginFlag": "",
				"unapprSubjectAmt": 0,
				"apprSubjectAmt": 0,
				"verfitySubjectAmt": 0,
				"unapprAmt": 0,
				"apprAmt": 0,
				"paidAmt": 0,
				"apprPlanRefundAmt": 0
			}
		],
		"receiptplans": [
			{
				"accountComfirmWay": "",
				"accountDays": "",
				"accountPeriod": 0,
				"accountPeriodUnitId": "",
				"acctEntityId": "",
				"advanceFlag": "",
				"amtTypeId": "",
				"apprAmt": 0,
				"apprPlanRefundAmt": 0,
				"apprSubjectAmt": 0,
				"beginBase": "",
				"beginDate": "",
				"changeId": "",
				"code": "",
				"condition": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"customer": "",
				"deloyDays": 0,
				"deloyMonth": 0,
				"expenseitemId": "",
				"expireComfirmWay": "",
				"fixedAccountDate": "",
				"fixedAccountDate1": "",
				"fixedAccountDate2": "",
				"fixedAccountDate3": "",
				"fixedAccountDate4": "",
				"fixedExpireDate": "",
				"fixedExpireDate1": "",
				"fixedExpireDate2": "",
				"fixedExpireDate3": "",
				"fixedExpireDate4": "",
				"id": "",
				"isDeleted": true,
				"issueNo": "",
				"localApprAmt": 0,
				"localApprPlanRefundAmt": 0,
				"localInvoiceTotal": 0,
				"localPaidAmt": 0,
				"localPlanAmt": 0,
				"localUnapprAmt": 0,
				"marginFlag": "",
				"materialId": "",
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"originalInvoiceTotal": 0,
				"paidAmt": 0,
				"payEndDate": "",
				"planAmt": 0,
				"planName": "",
				"planRatio": 0,
				"pubts": "",
				"rapprSubjectLocalAmt": 0,
				"receiveAgreementId": "",
				"rowNo": "",
				"runapprSubjectLocalAmt": 0,
				"rverifiedSubjectLocalAmt": 0,
				"rverifiedSubjectOriginalAmt": 0,
				"settleModeId": "",
				"source": "",
				"sourceautoid": "",
				"sourceautorowid": "",
				"sourceid": "",
				"startDate": "",
				"startTimeId": "",
				"supplierId": "",
				"tenant": "",
				"unapprAmt": 0,
				"unapprSubjectAmt": 0,
				"upcode": "",
				"verfitySubjectAmt": 0,
				"ytenant": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	未找到对应的合同	合同不存在，新增后重试


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode

更新

返回参数 apctChangeCounterpartys


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

