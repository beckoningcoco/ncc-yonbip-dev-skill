---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucg_measure_api_config"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API与计量规则配置表 (`iuap-api-management.A33_APIMngCompoment.ucg_measure_api_config`)

> INPAPI | 物理表：`ucg_measure_api_config`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API与计量规则配置表 |
| 物理表 | `ucg_measure_api_config` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:52.7680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `api_id` | api_id | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `charge_status` | charge_status | `charge_status` | Short |
| 3 | `id` | id | `id` | String |
| 4 | `measure_id` | measure_id | `measure_id` | 58795a5d-1323-48c0-a9dd-d0c996ef0447 |
| 5 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `api_id` | api_id | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None |  |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `measure_id` | measure_id | `iuap-api-management.A33_APIMngCompoment.ucg_measure_rule` | None |  |
