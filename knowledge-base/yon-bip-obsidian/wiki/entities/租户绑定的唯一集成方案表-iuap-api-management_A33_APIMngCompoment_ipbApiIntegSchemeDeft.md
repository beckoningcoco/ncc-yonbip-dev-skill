---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ipbApiIntegSchemeDeft"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 租户绑定的唯一集成方案表 (`iuap-api-management.A33_APIMngCompoment.ipbApiIntegSchemeDeft`)

> INPAPI | 物理表：`ipb_api_integ_scheme_deft`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 租户绑定的唯一集成方案表 |
| 物理表 | `ipb_api_integ_scheme_deft` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:18.1320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `dr` | dr | `dr` | Integer |
| 3 | `id` | 主键 | `id` | String |
| 4 | `integSchemeCode` | integSchemeCode | `integ_scheme_code` | String |
| 5 | `integrate_type` | integrate_type | `integrate_type` | Integer |
| 6 | `invalid` | invalid | `invalid` | Integer |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None | true |
