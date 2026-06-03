---
tags: [BIP, metadata, voucher, IBpmCurrentAuditor]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 当前审批人 (voucher.salereturn.IBpmCurrentAuditor)

> Platform: BIP V5 | Module: voucher | Table: salereturn_ibpmapprovaltask | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 当前审批人 |
| uri | voucher.salereturn.IBpmCurrentAuditor |
| tableName | salereturn_ibpmapprovaltask |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 审批任务 (IBpmApprovalTask) | ucfbase.ucfbaseItf.IBpmApprovalTask |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | approvalActivityId | 流程环节ID | approval_activity_id | text | String |  |  | nullable |
| 2 | approvalActivityName | 流程环节名称 | approval_activity_name | text | String |  |  | nullable |
| 3 | approvalActivityResid | 环节名称资源编码 | approval_activity_resid | text | String |  |  | nullable |
| 4 | approvalComment | 审批意见 | approval_comment | text | String |  |  | nullable |
| 5 | approvalInstId | 流程实例ID | approval_instid | text | String |  |  | nullable |
| 6 | approvalResult | 审批结果 | approval_result | text | String |  |  | nullable |
| 7 | approvalSign | 签名 | approval_sign | text | String |  |  | nullable |
| 8 | approvalTime | 审批时间 | approval_time | dateTime | Timestamp |  |  | nullable |
| 9 | auditor | 审批人 | auditor | quote | base.user.BipUser |  |  | nullable |
| 10 | id | 主键ID | id | long | Long |  |  | nullable,REF.ID |
| 11 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 12 | saleReturnId | 退货单id | iSaleReturnId | quote | voucher.salereturn.SaleReturn |  |  | nullable |
| 13 | taskId | 审批任务ID | taskid | text | String |  |  | nullable |
| 14 | taskStatus | 活动标记 | task_status | text | String |  |  | nullable |
| 15 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | auditor | 审批人 | auditor | base.user.BipUser |
| 2 | saleReturnId | 退货单id | iSaleReturnId | voucher.salereturn.SaleReturn |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
