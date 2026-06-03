---
tags: [BIP, metadata, hrxc, WaPayslipSchemeCategoryitem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工资条明细设置 (hrxc.payslipRule.WaPayslipSchemeCategoryitem)

> Platform: BIP V5 | Table: wa_payslip_scheme_categoryitem | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 工资条明细设置 |
| uri | hrxc.payslipRule.WaPayslipSchemeCategoryitem |
| tableName | wa_payslip_scheme_categoryitem |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 5 | 树型结构 (ITree) | ucfbase.ucfbaseItf.ITree |

---

## All Fields (34)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | name | 项目分组名称 | name | text | String |  |  | nullable,uiDesign |
| 2 | categoryName | 分类名称 | category_name | multiLanguage | String |  |  | nullable |
| 3 | categoryName2 | 分类名称2 | category_name2 | text | String |  |  | nullable |
| 4 | categoryName3 | 分类名称3 | category_name3 | text | String |  |  | nullable |
| 5 | categoryName4 | 分类名称4 | category_name4 | text | String |  |  | nullable |
| 6 | categoryName5 | 分类名称5 | category_name5 | text | String |  |  | nullable |
| 7 | categoryName6 | 分类名称6 | category_name6 | text | String |  |  | nullable |
| 8 | payslipItemName | 项目显示名称 | payslip_item_name | multiLanguage | String |  |  | nullable |
| 9 | itemName | 项目名称 | item_name | text | String |  |  | nullable |
| 10 | itemId | 项目主键 | item_id | text | String |  |  | nullable |
| 11 | payslipSchemeId | 工资条规则主键 | payslip_scheme_id | quote | hrxc.payslipRule.WaPayslipScheme |  |  | nullable |
| 12 | showOrder | 顺序 | show_order | int | Integer |  |  | nullable |
| 13 | itemType | 项目类型 | item_type | int | Integer |  |  | nullable |
| 14 | parent | 上级分类 | parent_id | text | String |  |  | nullable |
| 15 | level | 层级 | level | int | Integer |  |  | nullable,uiHide |
| 16 | path | 路径 | path | text | String |  |  | nullable,uiHide |
| 17 | sort | 排序号 | sort_num | int | Integer |  |  | nullable,uiDesign,uiHide |
| 18 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable,uiHide |
| 19 | isSum | 自助端显示分组合计 | is_sum | int | Integer |  |  | nullable |
| 20 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 21 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 22 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 23 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 24 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 25 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 26 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 27 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 28 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 29 | payslipItemName2 | 项目显示名称2 | payslip_item_name2 | text | String |  |  | nullable |
| 30 | payslipItemName3 | 项目显示名称3 | payslip_item_name3 | text | String |  |  | nullable |
| 31 | payslipItemName4 | 项目显示名称4 | payslip_item_name4 | text | String |  |  | nullable |
| 32 | payslipItemName5 | 项目显示名称5 | payslip_item_name5 | text | String |  |  | nullable |
| 33 | payslipItemName6 | 项目显示名称6 | payslip_item_name6 | text | String |  |  | nullable |
| 34 | zeroShow | 是否显示0值 | zero_show | int | Integer |  |  | nullable |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | payslipSchemeId | 工资条规则主键 | payslip_scheme_id | hrxc.payslipRule.WaPayslipScheme |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | base.user.BipUser |
| 4 | modifier | 修改人 | MODIFIER | base.user.BipUser |
