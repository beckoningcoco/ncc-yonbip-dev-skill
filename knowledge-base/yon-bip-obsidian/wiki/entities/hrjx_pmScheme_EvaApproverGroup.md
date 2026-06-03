---
tags: [BIP, metadata, hrjx, EvaApproverGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结果审核跨考核组实体 (hrjx.pmScheme.EvaApproverGroup)

> Platform: BIP V5 | Table: pm_eva_appr_group | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 结果审核跨考核组实体 |
| uri | hrjx.pmScheme.EvaApproverGroup |
| tableName | pm_eva_appr_group |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (13)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 2 | groupid | 组id | groupid | quote | hrjx.pmScheme.EvaGroup |  |  | nullable |
| 3 | multigroupname | 跨考核组名称 | multigroupname | text | String |  |  | nullable |
| 4 | multigroupid | 结果审核跨组id | multigroupid | text | String |  |  | nullable |
| 5 | distid | 强制分布id | distid | quote | hrjx.pmScheme.Distribution |  |  | nullable |
| 6 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 7 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 8 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 9 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 10 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 11 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 12 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 13 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 2 | groupid | 组id | groupid | hrjx.pmScheme.EvaGroup |
| 3 | distid | 强制分布id | distid | hrjx.pmScheme.Distribution |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
