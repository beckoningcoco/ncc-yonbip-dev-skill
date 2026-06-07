---
title: "合同详情"
apiId: "1477238385156816899"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Contract Register"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Register]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同详情

> `ContentType	application/json` 请求方式	GET | 分类: Contract Register (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/apct/openapi/bill/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | id，合同单据号和id二者必选其一    示例: 1476727009146568707 |
| code | string | query | 否 | 合同单据号，合同单据号和id二者必选其一    示例: FKHT202207151234 |

## 3. 请求示例

Url: /yonbip/znbz/apct/openapi/bill/detail?access_token=访问令牌&id=1476727009146568707&code=FKHT202207151234

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| groupTaskKey | string | 否 | 分组任务KEY |
| isprojectapply | boolean | 否 | 是否引用立项申请 |
| makeRuleCode | string | 否 | 生单规则编号 |
| source | string | 否 | 上游单据类型 |
| sourceMainPubts | string | 否 | 时间戳 |
| sourceautoid | string | 否 | 上游单据子表id |
| sourceid | string | 否 | 上游单据主表id |
| upcode | string | 否 | 上游单据号 |
| acctEntityId | object | 是 | 会计主体 |
| contractLedgerId | object | 是 | 合同台账 |
| contractType | object | 是 | 合同类型 |
| contractClass | string | 否 | 合同性质 |
| ytenant | object | 是 | 租户id |
| applyBillId | object | 是 | 申请单号 |
| apprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币预付款金额 |
| apprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币付款金额 |
| apprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退保证金金额 |
| apprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退款金额 |
| contractDirection | string | 否 | 收支方向 |
| localCurrency | object | 是 | 本币币种 |
| parentId | object | 是 | 上级合同 |
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
| unlocalApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币退款金额 |
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
| unapprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退款金额 |
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
| unrapprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退款金额 |
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
| unrlocalApprPlanRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币退款金额 |
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
| wbs | object | 是 | WBS |
| activity | object | 是 | 活动 |
| apprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币质保金金额 |
| apprSubjectAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币应付金额 |
| attachmentId | string | 否 | 附件 |
| auditDate | string | 否 | 审批日期 |
| auditTime | string | 否 | 审批时间 |
| auditor | string | 否 | 审批人名称 |
| auditorId | object | 是 | 审批人 |
| availableAmt | number |
| 小数位数:8,最大长度:28 | 否 | 合同可用金额 |
| beginningFlag | string | 否 | 期初标识 |
| businessCode | string | 否 | 合同业务号 |
| bustype | object | 是 | 合同类型 |
| changeId | string | 否 | 当前变更单 |
| code | string | 否 | 合同单据号 |
| createDate | string | 否 | 创建日期 |
| createTime | string | 否 | 创建时间 |
| creator | string | 否 | 创建人名称 |
| creatorId | object | 是 | 创建人 |
| ctVersion | string | 否 | 合同版本号 |
| currencyId | object | 是 | 币种 |
| deptId | object | 是 | 承办部门 |
| exceedRatio | number |
| 小数位数:8,最大长度:28 | 否 | 超合同付款比例 |
| historyFlag | string | 否 | 是否历史版本 |
| invalDate | string | 否 | 计划终止日期 |
| isDeleted | boolean | 否 | 逻辑删除标记 |
| isWfControlled | boolean | 否 | 是否审批流控制 |
| marginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收保证金金额 |
| marginRefundAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退保证金金额 |
| modifierId | object | 是 | 修改人 |
| name | string | 否 | 合同名称 |
| nexchangeRate | number |
| 小数位数:8,最大长度:28 | 否 | 拆本汇率 |
| openFlag | string | 否 | 是否敞口合同 |
| orgId | object | 是 | 承办组织 |
| originalReceiptAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币收票金额 |
| originalTotalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币价税合计 |
| paidAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付预付款金额 |
| paidAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付款金额 |
| paidRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付质保金金额 |
| payTermId | object | 是 | 付款协议 |
| payeeAccountId | object | 是 | 收款方银行账户 |
| payeeCardno | string | 否 | 收款方银行账号 |
| payerAccountId | object | 是 | 付款方银行账户 |
| payerCardno | string | 否 | 付款方银行账号 |
| personnelId | object | 是 | 承办人员 |
| populateMode | string | 否 | 计划金额计算方式 |
| projectId | object | 是 | 项目名称 |
| rateDate | string | 否 | 汇率日期 |
| rateTypeId | object | 是 | 汇率类型 |
| returncount | string | 否 | 退回次数 |
| settleTypeId | object | 是 | 结算方式 |
| signDate | string | 否 | 签字盖章日期 |
| signOrgId | object | 是 | 签约组织(本方) |
| status | string | 否 | 合同状态 |
| supplierId | object | 是 | 供应商 |
| tplid | string | 否 | 模板id |
| unapprAdvanceAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币预付款金额 |
| unapprAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币付款金额 |
| unapprMarginAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退保证金金额 |
| unapprRetentionAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币质保金金额 |
| unapprSubjectAmt | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币应付金额 |
| usedAmt | number |
| 小数位数:8,最大长度:28 | 否 | 合同已用金额 |
| valDate | string | 否 | 计划生效日期 |
| verfitySubjectAmt | number |
| 小数位数:8,最大长度:28 | 否 | 已核销原币应付金额 |
| verifystate | string | 否 | 审批状态 |
| version | string | 否 | 锁版本号 |
| vouchdate | string | 否 | 单据日期 |
| id | string | 否 | ID |
| settledcount | string | 否 | 已审批原币付款次数 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| modifier | string | 否 | 修改人名称 |
| ctfrom | string | 否 | 来源系统 |
| tenant | object | 是 | 租户 |
| pubts | string | 否 | 时间戳 |
| advanceApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退预付款金额备份 |
| apctCounterpartys | object | 是 | 合同相对方子表 |
| apctInvoiceinfos | object | 是 | 收票信息子表 |
| apctInvoicinginfos | object | 是 | 开票信息子表 |
| apctOwnerChangelogs | object | 是 | 所属人维护记录 |
| apctownersub | object | 是 | 合同所属人子表 |
| apprAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币预付款金额备份 |
| apprAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币付款金额备份 |
| apprMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退保证金金额备份 |
| apprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退款金额备份 |
| apprRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币质保金金额备份 |
| apprSubjectAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币应付金额备份 |
| apprSubjectLocalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币应付金额备份 |
| availableAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 合同可用金额备份 |
| ctVersionBak | string | 否 | 合同版本号备份 |
| hisrecords | object | 是 | 变更历史 |
| historyFlagBak | string | 否 | 是否历史版本备份 |
| ibpmcurrentauditors | object | 是 | 合同审批当前审批人 |
| ibpmsteps | object | 是 | 合同审批业务阶段 |
| items | object | 是 | 合同条款 |
| localAdvanceApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已退预付款金额备份 |
| localApprAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币预付款金额备份 |
| localApprAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币付款金额备份 |
| localApprMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币退保证金金额备份 |
| localApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币退款金额备份 |
| localApprRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币质保金金额备份 |
| localAvailableAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币合同付款可用金额备份 |
| localMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已收保证金金额备份 |
| localMarginRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已退保证金金额备份 |
| localMoneyAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额备份 |
| localOriginalReceiptAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币收票金额备份 |
| localPaidAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已付预付款金额备份 |
| localPaidAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已付款金额备份 |
| localPaidRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已付质保金金额备份 |
| localPlanAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币付款金额备份 |
| localRetentionApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币付款已退质保金金额备份 |
| localTaxAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额备份 |
| localUnapprAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币预付款金额备份 |
| localUnapprAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币付款金额备份 |
| localUnapprMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币退保证金金额备份 |
| localUnapprRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币质保金金额备份 |
| localUsedAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币合同付款已用金额备份 |
| marginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收保证金金额备份 |
| marginRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退保证金金额备份 |
| margins | object | 是 | 履约保证金子表 |
| materials | object | 是 | 标的物子表 |
| memorabilias | object | 是 | 合同大事记 |
| noTaxLocalMoneyAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税金额备份 |
| noTaxOriginalMoneyAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币无税金额备份 |
| originalReceiptAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币收票金额备份 |
| originalTaxAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币税额备份 |
| paidAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付预付款金额备份 |
| paidAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付款金额备份 |
| paidRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已付质保金金额备份 |
| plans | object | 是 | 付款计划子表 |
| processes | object | 是 | 执行过程子表 |
| radvanceApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退预收款金额备份 |
| rapprAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币预收款金额备份 |
| rapprAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币收款金额备份 |
| rapprMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退保证金金额备份 |
| rapprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币退款金额备份 |
| rapprRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币质保金金额备份 |
| rapprSubjectLocalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币应收金额备份 |
| rapprSubjectOriginalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批原币应收金额备份 |
| ravailableAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币合同收款可用金额备份 |
| receiptplans | object | 是 | 收款计划子表 |
| relateVouchers | object | 是 | 下游关联单据 |
| retentionApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币付款已退质保金金额备份 |
| rlocalAdvanceApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已退预收款金额备份 |
| rlocalApprAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币预收款金额备份 |
| rlocalApprAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币收款金额备份 |
| rlocalApprMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币退保证金金额备份 |
| rlocalApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币退款金额备份 |
| rlocalApprRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已审批本币质保金金额备份 |
| rlocalAvailableAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币合同收款可用金额备份 |
| rlocalMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已收保证金金额备份 |
| rlocalMarginRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已退保证金金额备份 |
| rlocalOriginalReceiptAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币开票金额备份 |
| rlocalPaidAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已收预收款金额备份 |
| rlocalPaidAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币已收款金额备份 |
| rlocalPaidRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币收款质保金金额备份 |
| rlocalPlanAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币收款金额备份 |
| rlocalRetentionApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币收款已退质保金金额备份 |
| rlocalUnapprAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币预收款金额备份 |
| rlocalUnapprAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币收款金额备份 |
| rlocalUnapprMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币退保证金金额备份 |
| rlocalUnapprRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币质保金金额备份 |
| rlocalUsedAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 本币合同收款已用金额备份 |
| rmarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收保证金金额备份 |
| rmarginRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已退保证金金额备份 |
| roriginalReceiptAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币开票金额备份 |
| roriginalTotalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币收款金额备份 |
| rpaidAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收预收款金额备份 |
| rpaidAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币已收款金额备份 |
| rpaidRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币收款质保金金额备份 |
| rretentionApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币收款已退质保金金额备份 |
| runapprAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币预收款金额备份 |
| runapprAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币收款金额备份 |
| runapprMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退保证金金额备份 |
| runapprRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币质保金金额备份 |
| runapprSubjectLocalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币应收金额备份 |
| runapprSubjectOriginalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币应收金额备份 |
| rusedAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 原币合同收款已用金额备份 |
| rverifiedSubjectLocalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已核销本币应收金额备份 |
| rverifiedSubjectOriginalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已核销原币应收金额备份 |
| thirdVoucher | object | 是 | 中间表数据标的物和付款计划 |
| unapprAdvanceAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币预付款金额备份 |
| unapprAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币付款金额备份 |
| unapprMarginAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退保证金金额备份 |
| unapprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退款金额备份 |
| unapprRetentionAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币质保金金额备份 |
| unapprSubjectAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币应付金额备份 |
| unapprSubjectLocalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币应付金额备份 |
| unlocalApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币退款金额备份 |
| unrapprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批原币退款金额备份 |
| unrlocalApprPlanRefundAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 未审批本币退款金额备份 |
| usedAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 合同已用金额备份 |
| verfitySubjectAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已核销原币应付金额备份 |
| verifiedSubjectLocalAmtBak | number |
| 小数位数:8,最大长度:28 | 否 | 已核销本币应付金额备份 |
| versionBak | string | 否 | 锁版本号备份 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"groupTaskKey": "",
		"isprojectapply": true,
		"makeRuleCode": "",
		"source": "",
		"sourceMainPubts": "",
		"sourceautoid": "",
		"sourceid": "",
		"upcode": "",
		"acctEntityId": [
			{}
		],
		"contractLedgerId": [
			{}
		],
		"contractType": [
			{}
		],
		"contractClass": "",
		"ytenant": [
			{}
		],
		"applyBillId": [
			{}
		],
		"apprAdvanceAmt": 0,
		"apprAmt": 0,
		"apprMarginAmt": 0,
		"apprPlanRefundAmt": 0,
		"contractDirection": "",
		"localCurrency": [
			{}
		],
		"parentId": [
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
		"unlocalApprPlanRefundAmt": 0,
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
		"unapprPlanRefundAmt": 0,
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
		"unrapprPlanRefundAmt": 0,
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
		"unrlocalApprPlanRefundAmt": 0,
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
		"wbs": [
			{}
		],
		"activity": [
			{}
		],
		"apprRetentionAmt": 0,
		"apprSubjectAmt": 0,
		"attachmentId": "",
		"auditDate": "",
		"auditTime": "",
		"auditor": "",
		"auditorId": [
			{}
		],
		"availableAmt": 0,
		"beginningFlag": "",
		"businessCode": "",
		"bustype": [
			{}
		],
		"changeId": "",
		"code": "",
		"createDate": "",
		"createTime": "",
		"creator": "",
		"creatorId": [
			{}
		],
		"ctVersion": "",
		"currencyId": [
			{}
		],
		"deptId": [
			{}
		],
		"exceedRatio": 0,
		"historyFlag": "",
		"invalDate": "",
		"isDeleted": true,
		"isWfControlled": true,
		"marginAmt": 0,
		"marginRefundAmt": 0,
		"modifierId": [
			{}
		],
		"name": "",
		"nexchangeRate": 0,
		"openFlag": "",
		"orgId": [
			{}
		],
		"originalReceiptAmt": 0,
		"originalTotalAmt": 0,
		"paidAdvanceAmt": 0,
		"paidAmt": 0,
		"paidRetentionAmt": 0,
		"payTermId": [
			{}
		],
		"payeeAccountId": [
			{}
		],
		"payeeCardno": "",
		"payerAccountId": [
			{}
		],
		"payerCardno": "",
		"personnelId": [
			{}
		],
		"populateMode": "",
		"projectId": [
			{}
		],
		"rateDate": "",
		"rateTypeId": [
			{}
		],
		"returncount": "",
		"settleTypeId": [
			{}
		],
		"signDate": "",
		"signOrgId": [
			{}
		],
		"status": "",
		"supplierId": [
			{}
		],
		"tplid": "",
		"unapprAdvanceAmt": 0,
		"unapprAmt": 0,
		"unapprMarginAmt": 0,
		"unapprRetentionAmt": 0,
		"unapprSubjectAmt": 0,
		"usedAmt": 0,
		"valDate": "",
		"verfitySubjectAmt": 0,
		"verifystate": "",
		"version": "",
		"vouchdate": "",
		"id": "",
		"settledcount": "",
		"modifyTime": "",
		"modifyDate": "",
		"modifier": "",
		"ctfrom": "",
		"tenant": [
			{}
		],
		"pubts": "",
		"advanceApprPlanRefundAmtBak": 0,
		"apctCounterpartys": [
			{
				"creator": "",
				"ctId": "",
				"payAccountId": "",
				"sourceautoid": "",
				"supplierId": "",
				"modifyDate": "",
				"ytenant": "",
				"modifier": "",
				"creatorId": "",
				"modifierId": "",
				"mailAddress": "",
				"counterpartyType": "",
				"modifyTime": "",
				"isDeleted": true,
				"createTime": "",
				"customerId": "",
				"contactNumber": "",
				"id": "",
				"pubts": "",
				"tenant": "",
				"createDate": ""
			}
		],
		"apctInvoiceinfos": [
			{
				"ctId": "",
				"id": "",
				"pk_invoice": "",
				"pubts": "",
				"tenant": "",
				"pk_invoicetype": "",
				"vinvoicecode": "",
				"vinvoiceno": "",
				"dcostdate": "",
				"vcustname": "",
				"vcurrency": "",
				"nuntaxmny": 0,
				"ntaxmny": 0,
				"nmny": 0,
				"billno": "",
				"billtype": "",
				"invoicestate": "",
				"nnatmny": 0,
				"nnattaxmny": 0,
				"nnatuntaxmny": 0,
				"ytenant": ""
			}
		],
		"apctInvoicinginfos": [
			{
				"billno": "",
				"billtype": "",
				"ctId": "",
				"dcostdate": "",
				"exchangeRate": 0,
				"exchangeRateDate": "",
				"exchangeRateType": "",
				"id": "",
				"invoiceOrg": "",
				"invoicestate": "",
				"nmny": 0,
				"nnatmny": 0,
				"nnattaxmny": 0,
				"nnatuntaxmny": 0,
				"ntaxmny": 0,
				"nuntaxmny": 0,
				"pk_invoice": "",
				"pk_invoicetype": "",
				"pubts": "",
				"tenant": "",
				"vcurrency": "",
				"vcustname": "",
				"vinvoicecode": "",
				"vinvoiceno": "",
				"ytenant": ""
			}
		],
		"apctOwnerChangelogs": [
			{
				"changeAfterId": "",
				"changeBeforeId": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
				"id": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"pubts": "",
				"tenant": "",
				"ytenant": ""
			}
		],
		"apctownersub": [
			{
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"pubts": "",
				"tenant": "",
				"ctId": "",
				"id": "",
				"ownerId": "",
				"sourceautoid": "",
				"ytenant": ""
			}
		],
		"apprAdvanceAmtBak": 0,
		"apprAmtBak": 0,
		"apprMarginAmtBak": 0,
		"apprPlanRefundAmtBak": 0,
		"apprRetentionAmtBak": 0,
		"apprSubjectAmtBak": 0,
		"apprSubjectLocalAmtBak": 0,
		"availableAmtBak": 0,
		"ctVersionBak": "",
		"hisrecords": [
			{
				"changeCode": "",
				"copyCtId": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
				"ctVersion": "",
				"id": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"pubts": "",
				"reason": "",
				"tenant": "",
				"ytenant": ""
			}
		],
		"historyFlagBak": "",
		"ibpmcurrentauditors": [
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
				"ctId": "",
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
				"ctId": "",
				"flag": "",
				"id": "",
				"processinstId": "",
				"pubts": "",
				"stepId": "",
				"stepLastModify": "",
				"stepparam": "",
				"taskId": "",
				"tenant": "",
				"yTenantId": ""
			}
		],
		"items": [
			{
				"code": "",
				"content": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
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
				"tenant": "",
				"ytenant": ""
			}
		],
		"localAdvanceApprPlanRefundAmtBak": 0,
		"localApprAdvanceAmtBak": 0,
		"localApprAmtBak": 0,
		"localApprMarginAmtBak": 0,
		"localApprPlanRefundAmtBak": 0,
		"localApprRetentionAmtBak": 0,
		"localAvailableAmtBak": 0,
		"localMarginAmtBak": 0,
		"localMarginRefundAmtBak": 0,
		"localMoneyAmtBak": 0,
		"localOriginalReceiptAmtBak": 0,
		"localPaidAdvanceAmtBak": 0,
		"localPaidAmtBak": 0,
		"localPaidRetentionAmtBak": 0,
		"localPlanAmtBak": 0,
		"localRetentionApprPlanRefundAmtBak": 0,
		"localTaxAmtBak": 0,
		"localUnapprAdvanceAmtBak": 0,
		"localUnapprAmtBak": 0,
		"localUnapprMarginAmtBak": 0,
		"localUnapprRetentionAmtBak": 0,
		"localUsedAmtBak": 0,
		"marginAmtBak": 0,
		"marginRefundAmtBak": 0,
		"margins": [
			{
				"code": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"tenant": "",
				"id": "",
				"receiptNum": "",
				"acctDate": "",
				"acctAmt": 0,
				"pubts": "",
				"unapprRefundAmt": 0,
				"apprRefundAmt": 0,
				"refundedAmt": 0,
				"acctAmtBak": 0,
				"apprRefundAmtBak": 0,
				"refundedAmtBak": 0,
				"unapprRefundAmtBak": 0,
				"ytenant": ""
			}
		],
		"materials": [
			{
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
				"groupTaskKey": "",
				"isDeleted": true,
				"makeRuleCode": "",
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"pubts": "",
				"source": "",
				"sourceMainPubts": "",
				"sourceautoid": "",
				"sourceid": "",
				"tenant": "",
				"upcode": "",
				"id": "",
				"expenseitemId": "",
				"pk_projectapply": "",
				"originalTotalAmt": 0,
				"usedAmt": 0,
				"releaseAmt": 0,
				"activity": "",
				"apprRefundSubjectAmt": 0,
				"apprRefundSubjectAmtBak": 0,
				"apprRefundSubjectLocalAmt": 0,
				"apprRefundSubjectLocalAmtBak": 0,
				"contractDirection": "",
				"costCenter": "",
				"localInvoiceTotal": 0,
				"localInvoiceTotalBak": 0,
				"localMoney": 0,
				"localPaidAmt": 0,
				"localPaidAmtBak": 0,
				"localPrice": 0,
				"localTax": 0,
				"localUsedAmt": 0,
				"localUsedAmtBak": 0,
				"material": "",
				"materialTypeId": "",
				"noTaxLocalMoney": 0,
				"noTaxLocalMoneyBak": 0,
				"noTaxLocalPrice": 0,
				"noTaxOriginalMoney": 0,
				"noTaxOriginalMoneyBak": 0,
				"noTaxOriginalPrice": 0,
				"originalInvoiceTotal": 0,
				"originalInvoiceTotalBak": 0,
				"originalPrice": 0,
				"originalTax": 0,
				"paidAmt": 0,
				"paidAmtBak": 0,
				"payTermId": "",
				"profitCenter": "",
				"projectId": "",
				"quantity": 0,
				"releaseAmtBak": 0,
				"rowNo": 0,
				"sourceautorowid": "",
				"takerOrg": "",
				"taxRateId": "",
				"taxSubject": "",
				"unapprRefundSubjectAmt": 0,
				"unapprRefundSubjectAmtBak": 0,
				"unapprRefundSubjectLocalAmt": 0,
				"unapprRefundSubjectLocalAmtBak": 0,
				"unit": "",
				"usedAmtBak": 0,
				"wbs": "",
				"ytenant": ""
			}
		],
		"memorabilias": [
			{
				"code": "",
				"content": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
				"id": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"note": "",
				"pubts": "",
				"tenant": "",
				"sourceautoid": "",
				"ytenant": ""
			}
		],
		"noTaxLocalMoneyAmtBak": 0,
		"noTaxOriginalMoneyAmtBak": 0,
		"originalReceiptAmtBak": 0,
		"originalTaxAmtBak": 0,
		"paidAdvanceAmtBak": 0,
		"paidAmtBak": 0,
		"paidRetentionAmtBak": 0,
		"plans": [
			{
				"groupTaskKey": "",
				"makeRuleCode": "",
				"source": "",
				"sourceMainPubts": "",
				"sourceautoid": "",
				"sourceid": "",
				"upcode": "",
				"planName": "",
				"accountDays": "",
				"advanceFlag": "",
				"amtTypeId": "",
				"apprAmt": 0,
				"apprPlanRefundAmt": 0,
				"apprSubjectAmt": 0,
				"beginBase": "",
				"beginDate": "",
				"code": "",
				"condition": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
				"expenseitemId": "",
				"id": "",
				"isDeleted": true,
				"marginFlag": "",
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"paidAmt": 0,
				"payEndDate": "",
				"planAmt": 0,
				"planRatio": 0,
				"pubts": "",
				"tenant": "",
				"unapprAmt": 0,
				"unapprSubjectAmt": 0,
				"verfitySubjectAmt": 0,
				"accountComfirmWay": "",
				"accountPeriod": 0,
				"accountPeriodUnitId": "",
				"acctEntityId": "",
				"apprAmtBak": 0,
				"apprPlanRefundAmtBak": 0,
				"apprSubjectAmtBak": 0,
				"apprSubjectLocalAmt": 0,
				"apprSubjectLocalAmtBak": 0,
				"customer": "",
				"deloyDays": 0,
				"deloyMonth": 0,
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
				"issueNo": "",
				"localApprAmt": 0,
				"localApprAmtBak": 0,
				"localApprPlanRefundAmt": 0,
				"localApprPlanRefundAmtBak": 0,
				"localInvoiceTotal": 0,
				"localInvoiceTotalBak": 0,
				"localPaidAmt": 0,
				"localPaidAmtBak": 0,
				"localPlanAmt": 0,
				"localPlanAmtBak": 0,
				"localUnapprAmt": 0,
				"localUnapprAmtBak": 0,
				"materialId": "",
				"originalInvoiceTotal": 0,
				"originalInvoiceTotalBak": 0,
				"paidAmtBak": 0,
				"payTermId": "",
				"planAmtBak": 0,
				"rowNo": "",
				"settleModeId": "",
				"sourceautorowid": "",
				"startDate": "",
				"startTimeId": "",
				"supplierId": "",
				"unapprAmtBak": 0,
				"unapprPlanRefundAmt": 0,
				"unapprPlanRefundAmtBak": 0,
				"unapprSubjectAmtBak": 0,
				"unapprSubjectLocalAmt": 0,
				"unapprSubjectLocalAmtBak": 0,
				"unlocalApprPlanRefundAmt": 0,
				"unlocalApprPlanRefundAmtBak": 0,
				"verfitySubjectAmtBak": 0,
				"verifiedSubjectLocalAmt": 0,
				"verifiedSubjectLocalAmtBak": 0,
				"verifiedSubjectOriginalAmt": 0,
				"verifiedSubjectOriginalAmtBak": 0,
				"ytenant": ""
			}
		],
		"processes": [
			{
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
				"executeDate": "",
				"executeFlow": "",
				"id": "",
				"isDeleted": true,
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"pubts": "",
				"reason": "",
				"tenant": "",
				"ytenant": ""
			}
		],
		"radvanceApprPlanRefundAmtBak": 0,
		"rapprAdvanceAmtBak": 0,
		"rapprAmtBak": 0,
		"rapprMarginAmtBak": 0,
		"rapprPlanRefundAmtBak": 0,
		"rapprRetentionAmtBak": 0,
		"rapprSubjectLocalAmtBak": 0,
		"rapprSubjectOriginalAmtBak": 0,
		"ravailableAmtBak": 0,
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
				"apprAmtBak": 0,
				"apprPlanRefundAmt": 0,
				"apprPlanRefundAmtBak": 0,
				"apprSubjectAmt": 0,
				"apprSubjectAmtBak": 0,
				"beginBase": "",
				"beginDate": "",
				"code": "",
				"condition": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
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
				"groupTaskKey": "",
				"id": "",
				"isDeleted": true,
				"issueNo": "",
				"localApprAmt": 0,
				"localApprAmtBak": 0,
				"localApprPlanRefundAmt": 0,
				"localApprPlanRefundAmtBak": 0,
				"localInvoiceTotal": 0,
				"localInvoiceTotalBak": 0,
				"localPaidAmt": 0,
				"localPaidAmtBak": 0,
				"localPlanAmt": 0,
				"localPlanAmtBak": 0,
				"localUnapprAmt": 0,
				"localUnapprAmtBak": 0,
				"makeRuleCode": "",
				"marginFlag": "",
				"materialId": "",
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"originalInvoiceTotal": 0,
				"originalInvoiceTotalBak": 0,
				"paidAmt": 0,
				"paidAmtBak": 0,
				"payEndDate": "",
				"planAmt": 0,
				"planAmtBak": 0,
				"planName": "",
				"planRatio": 0,
				"pubts": "",
				"rapprSubjectLocalAmt": 0,
				"rapprSubjectLocalAmtBak": 0,
				"receiveAgreementId": "",
				"rowNo": "",
				"runapprSubjectLocalAmt": 0,
				"runapprSubjectLocalAmtBak": 0,
				"rverifiedSubjectLocalAmt": 0,
				"rverifiedSubjectLocalAmtBak": 0,
				"rverifiedSubjectOriginalAmt": 0,
				"rverifiedSubjectOriginalAmtBak": 0,
				"settleModeId": "",
				"source": "",
				"sourceMainPubts": "",
				"sourceautoid": "",
				"sourceautorowid": "",
				"sourceid": "",
				"startDate": "",
				"startTimeId": "",
				"supplierId": "",
				"tenant": "",
				"unapprAmt": 0,
				"unapprAmtBak": 0,
				"unapprPlanRefundAmt": 0,
				"unapprPlanRefundAmtBak": 0,
				"unapprSubjectAmt": 0,
				"unapprSubjectAmtBak": 0,
				"unlocalApprPlanRefundAmt": 0,
				"unlocalApprPlanRefundAmtBak": 0,
				"upcode": "",
				"verfitySubjectAmt": 0,
				"verfitySubjectAmtBak": 0,
				"ytenant": ""
			}
		],
		"relateVouchers": [
			{
				"billDate": "",
				"billNum": "",
				"billStatus": "",
				"billType": "",
				"bustype": "",
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctCode": "",
				"ctId": "",
				"currencyId": "",
				"domain": "",
				"id": "",
				"isDeleted": true,
				"location": "",
				"marginId": "",
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"originalAmt": 0,
				"outbillId": "",
				"planId": "",
				"pubts": "",
				"settleStatus": "",
				"tenant": "",
				"contractDirection": "",
				"localAmt": 0,
				"outBusimemo": "",
				"outMaterial": "",
				"outProject": "",
				"outbillDate": "",
				"outbillNo": "",
				"outbillRowId": "",
				"outbillStatus": "",
				"outbillType": "",
				"outbustype": "",
				"outoriginalAmt": 0,
				"outsettleStatus": "",
				"planCode": "",
				"ytenant": ""
			}
		],
		"retentionApprPlanRefundAmtBak": 0,
		"rlocalAdvanceApprPlanRefundAmtBak": 0,
		"rlocalApprAdvanceAmtBak": 0,
		"rlocalApprAmtBak": 0,
		"rlocalApprMarginAmtBak": 0,
		"rlocalApprPlanRefundAmtBak": 0,
		"rlocalApprRetentionAmtBak": 0,
		"rlocalAvailableAmtBak": 0,
		"rlocalMarginAmtBak": 0,
		"rlocalMarginRefundAmtBak": 0,
		"rlocalOriginalReceiptAmtBak": 0,
		"rlocalPaidAdvanceAmtBak": 0,
		"rlocalPaidAmtBak": 0,
		"rlocalPaidRetentionAmtBak": 0,
		"rlocalPlanAmtBak": 0,
		"rlocalRetentionApprPlanRefundAmtBak": 0,
		"rlocalUnapprAdvanceAmtBak": 0,
		"rlocalUnapprAmtBak": 0,
		"rlocalUnapprMarginAmtBak": 0,
		"rlocalUnapprRetentionAmtBak": 0,
		"rlocalUsedAmtBak": 0,
		"rmarginAmtBak": 0,
		"rmarginRefundAmtBak": 0,
		"roriginalReceiptAmtBak": 0,
		"roriginalTotalAmtBak": 0,
		"rpaidAdvanceAmtBak": 0,
		"rpaidAmtBak": 0,
		"rpaidRetentionAmtBak": 0,
		"rretentionApprPlanRefundAmtBak": 0,
		"runapprAdvanceAmtBak": 0,
		"runapprAmtBak": 0,
		"runapprMarginAmtBak": 0,
		"runapprRetentionAmtBak": 0,
		"runapprSubjectLocalAmtBak": 0,
		"runapprSubjectOriginalAmtBak": 0,
		"rusedAmtBak": 0,
		"rverifiedSubjectLocalAmtBak": 0,
		"rverifiedSubjectOriginalAmtBak": 0,
		"thirdVoucher": [
			{
				"createDate": "",
				"createTime": "",
				"creator": "",
				"creatorId": "",
				"ctId": "",
				"id": "",
				"isDeleted": true,
				"materialId": "",
				"modifier": "",
				"modifierId": "",
				"modifyDate": "",
				"modifyTime": "",
				"originalAmt": 0,
				"outbillId": "",
				"outbillRowId": "",
				"planId": "",
				"pubts": "",
				"relateVoucherId": "",
				"tenant": "",
				"ytenant": ""
			}
		],
		"unapprAdvanceAmtBak": 0,
		"unapprAmtBak": 0,
		"unapprMarginAmtBak": 0,
		"unapprPlanRefundAmtBak": 0,
		"unapprRetentionAmtBak": 0,
		"unapprSubjectAmtBak": 0,
		"unapprSubjectLocalAmtBak": 0,
		"unlocalApprPlanRefundAmtBak": 0,
		"unrapprPlanRefundAmtBak": 0,
		"unrlocalApprPlanRefundAmtBak": 0,
		"usedAmtBak": 0,
		"verfitySubjectAmtBak": 0,
		"verifiedSubjectLocalAmtBak": 0,
		"versionBak": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	未找到对应的付款合同	合同不存在，新增后重试


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

