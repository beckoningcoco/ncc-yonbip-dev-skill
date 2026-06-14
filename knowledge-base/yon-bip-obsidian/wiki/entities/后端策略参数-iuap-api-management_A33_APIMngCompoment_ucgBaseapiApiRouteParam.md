---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteParam"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 后端策略参数 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteParam`)

> INPAPI | 物理表：`ucg_baseapi_api_route_param`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 后端策略参数 |
| 物理表 | `ucg_baseapi_api_route_param` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:26.5320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `dr` | dr | `dr` | Integer |
| 3 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 4 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 5 | `id` | id | `id` | String |
| 6 | `paramCondition` | paramCondition | `param_condition` | Integer |
| 7 | `paramLocation` | paramLocation | `param_location` | String |
| 8 | `paramName` | paramName | `param_name` | String |
| 9 | `paramValue` | paramValue | `param_value` | String |
| 10 | `sort` | sort | `sort` | Integer |
| 11 | `stgyId` | stgyId | `stgy_id` | 7b1b9beb-5d9e-4ac0-b39a-f819716c6c9f |
| 12 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None |  |
| 3 | `stgyId` | stgyId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteStgy` | None | true |
