---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitydemand.CapacityDemandSchemaExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力需求排产方案表(订单平行表) (`cmp.capacitydemand.CapacityDemandSchemaExt`)

> DCRP | 物理表：`cmp_capacity_demand_schema_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力需求排产方案表(订单平行表) |
| 物理表 | `cmp_capacity_demand_schema_ext` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:08.4770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | c09df742-e522-466c-a5ac-757f34e80092 | 能力需求ID |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 能力需求ID | `id` | c09df742-e522-466c-a5ac-757f34e80092 |
| 2 | `operationEndTime` | 工序完工日期 | `operation_end_time` | DateTime |
| 3 | `operationStartTime` | 工序开工日期 | `operation_start_time` | DateTime |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 能力需求ID | `cmp.capacitydemand.CapacityDemand` | None | true |
