---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitydemand.CapacityDemandSource"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力需求线索/订单线索 (`cmp.capacitydemand.CapacityDemandSource`)

> DCRP | 物理表：`cmp_capacity_demand_source`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力需求线索/订单线索 |
| 物理表 | `cmp_capacity_demand_source` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:04.5910` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `capacityDemandId` | 能力需求ID | `capacity_demand_id` | c09df742-e522-466c-a5ac-757f34e80092 |
| 4 | `srcDocId` | 源头ID(订单ID) | `src_doc_id` | Long |
| 5 | `srcDocType` | 源头单据类型 | `src_doc_type` | String |
| 6 | `srcDocNo` | 源头单据号 | `src_doc_no` | String |
| 7 | `targetDocId` | 来源目标ID(订单ID) | `target_doc_id` | Long |
| 8 | `targetDocType` | 来源目标单据类型 | `target_doc_type` | String |
| 9 | `targetDocNo` | 来源目标号 | `target_doc_no` | String |
| 10 | `sourceType` | 来源目标类型(10:来源,20:去向) | `source_type` | String |
| 11 | `quantity` | 数量 | `quantity` | Decimal |
| 12 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 13 | `mainQuantity` | 主数量 | `main_quantity` | Decimal |
| 14 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 18 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主单位 | `pc.unit.Unit` | Service |  |
| 2 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `capacityDemandId` | 能力需求ID | `cmp.capacitydemand.CapacityDemand` | None |  |
