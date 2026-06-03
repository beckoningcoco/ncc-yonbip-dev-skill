---
tags: [BIP, metadata, hrjx, Grade]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核等级 (hrjx.pmCore.Grade)

> Platform: BIP V5 | Table: pm_grade | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核等级 |
| uri | hrjx.pmCore.Grade |
| tableName | pm_grade |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 树型结构 (ITree) | base.itf.ITree |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 5 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |

---

## All Fields (25)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | gradecode | 等级编码 | gradecode | text | String |  |  | isCode,nullable |
| 2 | vid | 组织id | vid | quote | org.func.BaseOrgTimeline |  |  | migrationIgnoreRef,nullable |
| 3 | gradetype | 等级规则类型 | gradetype | int | Integer |  |  | nullable |
| 4 | enable | 启用状态 | enablestate | short | Short |  |  | nullable,uiDesign |
| 5 | graderemark | 备注 | graderemark | multiLanguage | String |  |  | nullable |
| 6 | sort | 序号 | sort_num | long | Long |  |  | nullable |
| 7 | parent | 上级分类 | parent_id | long | Long |  |  | nullable |
| 8 | level | 层级 | level | int | Integer |  |  | nullable |
| 9 | isEnd | 是否末级 | isEnd | int | Integer |  |  | nullable |
| 10 | path | 全路径 | path | text | String |  |  | nullable |
| 11 | apply_module | apply_module | apply_module | short | Short |  |  | nullable |
| 12 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 13 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 14 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 15 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 16 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 17 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 18 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 19 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 20 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 21 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 22 | gradeScopeList | 考核等级规则实体适用范围 | - | - | hrjx.pmCore.GradeScope |  |  |  |
| 23 | gradename | 等级名称 | gradename | multiLanguage | String |  |  | isName,nullable |
| 24 | oGradeItem | 考核等级项 | - | - | hrjx.pmCore.GradeItem |  |  |  |
| 25 | orgid | 所属组织 | orgid | quote | org.func.AdminOrg |  |  | nullable |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | vid | 组织id | vid | org.func.BaseOrgTimeline |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 6 | orgid | 所属组织 | orgid | org.func.AdminOrg |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | gradeScopeList | 考核等级规则实体适用范围 | hrjx.pmCore.GradeScope |
| 2 | oGradeItem | 考核等级项 | hrjx.pmCore.GradeItem |
