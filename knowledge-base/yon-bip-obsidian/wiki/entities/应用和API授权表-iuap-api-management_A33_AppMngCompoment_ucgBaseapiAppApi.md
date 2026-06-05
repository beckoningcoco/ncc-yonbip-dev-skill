---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.ucgBaseapiAppApi"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 应用和API授权表 (`iuap-api-management.A33_AppMngCompoment.ucgBaseapiAppApi`)

> INPAPI | 物理表：`ucg_baseapi_app_api`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应用和API授权表 |
| 物理表 | `ucg_baseapi_app_api` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:45.2600` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiCode` | apiCode | `api_code` | String |
| 2 | `apiId` | apiId | `api_id` | String |
| 3 | `applicationId` | applicationId | `application_id` | 7ae90a43-2005-4d0f-9692-e45f61aa2e0d |
| 4 | `approvalIsvId` | approvalIsvId | `approval_isv_id` | String |
| 5 | `dr` | dr | `dr` | Integer |
| 6 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 7 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 8 | `id` | id | `id` | String |
| 9 | `isvId` | isvId | `isv_id` | String |
| 10 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `type` | type | `type` | String |
| 12 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `applicationId` | applicationId | `iuap-api-management.A33_AppMngCompoment.ucgBaseapiApp` | None | true |
