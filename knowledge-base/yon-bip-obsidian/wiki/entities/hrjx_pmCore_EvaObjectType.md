---
tags: [BIP, metadata, hrjx, EvaObjectType]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核对象类型 (hrjx.pmCore.EvaObjectType)

> Platform: BIP V5 | Table: pm_eva_object_type | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核对象类型 |
| uri | hrjx.pmCore.EvaObjectType |
| tableName | pm_eva_object_type |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
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
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (17)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 编码 | code | text | String |  |  | isCode,nullable |
| 2 | name | 名称 | name | multiLanguage | String |  |  | isName,nullable |
| 3 | applyobj | 适用对象 | applyobj | int | Integer |  |  | nullable |
| 4 | enable | 启用状态 | enablestate | int | Integer |  |  | nullable,uiDesign |
| 5 | explanation | 说明 | explanation | multiLanguage | String |  |  | nullable |
| 6 | issystem | 系统预制 | issystem | int | Integer |  |  | nullable |
| 7 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 8 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 9 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 10 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable |
| 11 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 12 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 13 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 14 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 15 | tenant | 租户 | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 16 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 17 | innercode | 内部编码 | innercode | text | String |  |  | nullable |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | tenant | 租户 | tenantid | yht.tenant.YhtTenant |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
