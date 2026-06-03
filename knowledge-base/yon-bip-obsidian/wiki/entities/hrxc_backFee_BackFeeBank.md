---
tags: [BIP, metadata, hrxc, BackFeeBank]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退费银行信息 (hrxc.backFee.BackFeeBank)

> Platform: BIP V5 | Table: st_backfee_bank | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退费银行信息 |
| uri | hrxc.backFee.BackFeeBank |
| tableName | st_backfee_bank |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |

---

## All Fields (18)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bankAccount | 银行账号' | bank_account | text | String |  |  | nullable |
| 2 | bankBranchCode | 银行网点编码 | bank_branch_code | text | String |  |  | nullable |
| 3 | bankBranchName | 银行网点名称 | bank_branch_name | text | String |  |  | nullable |
| 4 | bankCode | 开户行编码 | bank_code | text | String |  |  | nullable |
| 5 | bankName | 开户行名称 | bank_name | text | String |  |  | nullable |
| 6 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 7 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 8 | creator | 创建人名称 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 9 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 10 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 11 | modifier | 修改人名称 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 12 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 13 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 14 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 15 | payee | 收款人 | payee | text | String |  |  | nullable |
| 16 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 17 | taxOrgId | 扣缴义务人 | tax_org_id | text | String |  |  | nullable |
| 18 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creatorId | 创建人 | creatorId | base.user.User |
| 2 | modifierId | 修改人 | modifierId | base.user.User |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
