---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiIntegrateScheme"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API集成方案 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiIntegrateScheme`)

> INPAPI | 物理表：`ucg_baseapi_api_integrate_scheme`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API集成方案 |
| 物理表 | `ucg_baseapi_api_integrate_scheme` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:49.9880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `integrate_scheme_code` | String | integrateSchemeCode |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `connectUrl` | connectUrl | `connect_url` | String |
| 3 | `createTime` | createTime | `create_time` | Date |
| 4 | `creator` | creator | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 5 | `dr` | dr | `dr` | Integer |
| 6 | `httpRequestType` | httpRequestType | `http_request_type` | String |
| 7 | `id` | id | `id` | String |
| 8 | `integrateSchemeCode` | integrateSchemeCode | `integrate_scheme_code` | String |
| 9 | `integrateSchemeName` | integrateSchemeName | `integrate_scheme_name` | String |
| 10 | `integrate_type` | integrate_type | `integrate_type` | Integer |
| 11 | `isDefault` | isDefault | `is_default` | Integer |
| 12 | `modifier` | modifier | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `modifyTime` | modifyTime | `modify_time` | Date |
| 14 | `preset` | preset | `preset` | Integer |
| 15 | `pubts` | pubts | `pubts` | Date |
| 16 | `timeOut` | timeOut | `time_out` | String |
| 17 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | creator | `base.user.BipUser` | Service |  |
| 2 | `modifier` | modifier | `base.user.BipUser` | Service |  |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None |  |
