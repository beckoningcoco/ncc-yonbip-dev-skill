---
tags: [BIP, metadata, hrxc, SettlementBill]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结报单 (hrxc.backFee.SettlementBill)

> Platform: BIP V5 | Table: st_settlement_bill | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 结报单 |
| uri | hrxc.backFee.SettlementBill |
| tableName | st_settlement_bill |
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

## All Fields (30)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | backFee | 退付手续费 | back_fee | number | Decimal |  |  | nullable |
| 2 | bankAccount | 银行账号 | bank_account | text | String |  |  | nullable |
| 3 | bankBranchName | 银行网点名称 | bank_branch_name | text | String |  |  | nullable |
| 4 | bankName | 开户行名称 | bank_name | text | String |  |  | nullable |
| 5 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 6 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 7 | creator | 创建人名称 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 8 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 9 | errorInfo | 错误信息 | error_info | text | String |  |  | nullable |
| 10 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 11 | inventoryDatas | 单户清册数据 | - | - | hrxc.backFee.InventoryData |  |  |  |
| 12 | mainId | 结报主数据主键 | main_id | quote | hrxc.backFee.MainBillData |  |  | nullable |
| 13 | modifier | 修改人名称 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 14 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 15 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 16 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 17 | payAmount | 实缴金额 | pay_amount | number | Decimal |  |  | nullable |
| 18 | payee | 收款人 | payee | text | String |  |  | nullable |
| 19 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 20 | settleYear | 结报年度 | settle_year | int | Integer |  |  | nullable |
| 21 | settlementBillNo | 结报单号 | settlement_bill_no | text | String |  |  | nullable |
| 22 | settlementDetails | 结报单明细 | - | - | hrxc.backFee.SettlementDetail |  |  |  |
| 23 | state | 结报单状态 | state | int | Integer |  |  | nullable |
| 24 | stateDesc | 状态详情 | state_desc | text | String |  |  | nullable |
| 25 | status | 详情查询状态 | status | int | Integer |  |  | nullable |
| 26 | taxAuthority | 税款所属机关 | tax_authority | text | String |  |  | nullable |
| 27 | taxOrgId | 扣缴义务人 | tax_org_id | quote | hrxc.taxOrg.WaTaxOrg |  |  | nullable |
| 28 | taxPayerName | 纳税人名称 | tax_payer_name | text | String |  |  | nullable |
| 29 | taxPayerNo | 纳税人识别号 | tax_payer_no | text | String |  |  | nullable |
| 30 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creatorId | 创建人 | creatorId | base.user.User |
| 2 | mainId | 结报主数据主键 | main_id | hrxc.backFee.MainBillData |
| 3 | modifierId | 修改人 | modifierId | base.user.User |
| 4 | taxOrgId | 扣缴义务人 | tax_org_id | hrxc.taxOrg.WaTaxOrg |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | settlementDetails | 结报单明细 | hrxc.backFee.SettlementDetail |
| 2 | inventoryDatas | 单户清册数据 | hrxc.backFee.InventoryData |
