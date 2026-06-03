---
tags: [BIP, metadata, hrjx, PmPubIndicator]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标公共表 (hrjx.pmCore.PmPubIndicator)

> Platform: BIP V5 | Table: pm_pub_indicator | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 指标公共表 |
| uri | hrjx.pmCore.PmPubIndicator |
| tableName | pm_pub_indicator |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (9)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | indiclassid | 指标分类 | indiclassid | quote | hrjx.pmCore.PmPubIndiclass |  |  | nullable |
| 2 | indiname | 指标名称 | indiname | text | String |  |  | isName,nullable |
| 3 | indicode | 指标代码 | indicode | text | String |  |  | isCode,nullable |
| 4 | industry | 所属行业 | industry | text | String |  |  | nullable |
| 5 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 6 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 7 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 8 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | indiclassid | 指标分类 | indiclassid | hrjx.pmCore.PmPubIndiclass |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
