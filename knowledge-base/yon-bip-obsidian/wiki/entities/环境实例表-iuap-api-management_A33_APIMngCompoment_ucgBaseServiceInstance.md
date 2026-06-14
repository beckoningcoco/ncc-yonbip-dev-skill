---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseServiceInstance"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 环境实例表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseServiceInstance`)

> INPAPI | 物理表：`ucg_base_service_instance`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 环境实例表 |
| 物理表 | `ucg_base_service_instance` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:50.3360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `config` | config | `config` | String |
| 2 | `dbInfo` | dbInfo | `db_Info` | String |
| 3 | `description` | description | `description` | String |
| 4 | `dr` | dr | `dr` | Integer |
| 5 | `environmentId` | environmentId | `environment_id` | 654492ed-944c-4120-b0ab-013707901ee6 |
| 6 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 7 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 8 | `id` | id | `id` | String |
| 9 | `sequenceNum` | sequenceNum | `sequence_num` | Integer |
| 10 | `serviceAddress` | serviceAddress | `service_address` | String |
| 11 | `weight` | weight | `weight` | String |
| 12 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `environmentId` | environmentId | `iuap-api-management.A33_APIMngCompoment.ucgBaseEnvironment` | None | true |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
