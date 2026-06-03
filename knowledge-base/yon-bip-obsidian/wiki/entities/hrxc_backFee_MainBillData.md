---
tags: [BIP, metadata, hrxc, MainBillData]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结报主数据 (hrxc.backFee.MainBillData)

> Platform: BIP V5 | Table: st_settlement_bill_main_data | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 结报主数据 |
| uri | hrxc.backFee.MainBillData |
| tableName | st_settlement_bill_main_data |
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
| 1 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | backFee | 退付手续费 | back_fee | number | Decimal |  |  | nullable |
| 2 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 3 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 4 | creator | 创建人名称 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 5 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 6 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 7 | isLinked | 是否跳转链接 | is_link | switch | Boolean |  |  | nullable |
| 8 | mainDatas | 结报单 | - | - | hrxc.backFee.SettlementBill |  |  |  |
| 9 | modifier | 修改人名称 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 10 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 11 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 12 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 13 | payAmount | 实缴金额 | pay_amount | number | Decimal |  |  | nullable |
| 14 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 15 | settleYear | 结报年度 | settle_year | int | Integer |  |  | nullable |
| 16 | settlementBillNo | 结报单号 | settlement_bill_no | text | String |  |  | nullable |
| 17 | state | 结报单状态 | state | int | Integer |  |  | nullable |
| 18 | stateDesc | 状态详情 | state_desc | text | String |  |  | nullable |
| 19 | taxAuthority | 税款所属机关 | tax_authority | text | String |  |  | nullable |
| 20 | taxOrgId | 扣缴义务人 | tax_org_id | quote | hrxc.taxOrg.WaTaxOrg |  |  | nullable |
| 21 | taxPayerName | 纳税人名称 | tax_payer_name | text | String |  |  | nullable |
| 22 | taxPayerNo | 纳税人识别号 | tax_payer_no | text | String |  |  | nullable |
| 23 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creatorId | 创建人 | creatorId | base.user.User |
| 2 | modifierId | 修改人 | modifierId | base.user.User |
| 3 | taxOrgId | 扣缴义务人 | tax_org_id | hrxc.taxOrg.WaTaxOrg |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | mainDatas | 结报单 | hrxc.backFee.SettlementBill |
