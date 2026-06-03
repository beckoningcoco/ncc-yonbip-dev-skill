---
tags: [BIP, metadata, hrxc, WaTaxApplyOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 扣缴义务人适用组织 (hrxc.taxOrg.WaTaxApplyOrg)

> Platform: BIP V5 | Table: wa_tax_apply_org | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 扣缴义务人适用组织 |
| uri | hrxc.taxOrg.WaTaxApplyOrg |
| tableName | wa_tax_apply_org |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (12)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkWaTaxOrg | 扣缴义务人主键 | PK_WA_TAX_ORG | quote | hrxc.taxOrg.WaTaxOrg |  |  | nullable |
| 2 | applyOrg | 适用组织 | apply_org | quote | org.func.BaseOrg |  |  | nullable |
| 3 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 4 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 5 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 6 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 7 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 8 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 9 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 10 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 11 | yTenantId | 友户通租户主键 | YTENANT_ID | quote | yht.tenant.YhtTenant |  |  | nullable |
| 12 | tenant | 租户ID | TENANTID | text | String |  |  | nullable |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | pkWaTaxOrg | 扣缴义务人主键 | PK_WA_TAX_ORG | hrxc.taxOrg.WaTaxOrg |
| 2 | applyOrg | 适用组织 | apply_org | org.func.BaseOrg |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | CREATOR | base.user.BipUser |
| 5 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 6 | yTenantId | 友户通租户主键 | YTENANT_ID | yht.tenant.YhtTenant |
