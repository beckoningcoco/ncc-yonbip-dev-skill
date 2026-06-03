---
tags: [BIP, metadata, hrxc, WaPayslipSchemeTopitem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工资条默认项目设置 (hrxc.payslipRule.WaPayslipSchemeTopitem)

> Platform: BIP V5 | Table: wa_payslip_scheme_topitem | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 工资条默认项目设置 |
| uri | hrxc.payslipRule.WaPayslipSchemeTopitem |
| tableName | wa_payslip_scheme_topitem |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | itemName | 项目名称 | item_name | text | String |  |  | nullable |
| 2 | itemId | 项目主键 | item_id | text | String |  |  | nullable |
| 3 | payslipSchemeId | 工资条规则主键 | payslip_scheme_id | quote | hrxc.payslipRule.WaPayslipScheme |  |  | nullable |
| 4 | itemType | 项目类型,0:web端,1:移动端 | item_type | int | Integer |  |  | nullable |
| 5 | showOrder | 顺序 | show_order | int | Integer |  |  | nullable |
| 6 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 7 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 8 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 9 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 10 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 11 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 12 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 13 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 14 | tenant | 租户主键(旧) | tenant_id | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | payslipSchemeId | 工资条规则主键 | payslip_scheme_id | hrxc.payslipRule.WaPayslipScheme |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | base.user.BipUser |
| 4 | modifier | 修改人 | MODIFIER | base.user.BipUser |
