---
tags: [BIP, metadata, hrjx, Dimensionality]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核人类别实体 (hrjx.pmCore.Dimensionality)

> Platform: BIP V5 | Table: pm_dimensionality | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核人类别实体 |
| uri | hrjx.pmCore.Dimensionality |
| tableName | pm_dimensionality |
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

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | dimtype | 考核关系 | dimtype | int | Integer |  |  | nullable |
| 2 | enable | 启用状态 | enablestate | int | Integer |  |  | nullable,uiDesign |
| 3 | dimremark | 说明 | dimremark | multiLanguage | String |  |  | nullable |
| 4 | issystem | 是否系统项 | issystem | switch | Boolean |  |  | nullable |
| 5 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 6 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 7 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 8 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 9 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 10 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 11 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 12 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 13 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 15 | dimcode | 编码 | dimcode | text | String |  |  | isCode,nullable |
| 16 | dimname | 名称 | dimname | multiLanguage | String |  |  | isName,nullable |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
