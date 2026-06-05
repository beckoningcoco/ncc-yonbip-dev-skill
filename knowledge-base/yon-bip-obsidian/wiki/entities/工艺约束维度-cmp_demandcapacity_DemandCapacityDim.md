---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.demandcapacity.DemandCapacityDim"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工艺约束维度 (`cmp.demandcapacity.DemandCapacityDim`)

> DCRP | 物理表：`cmp_demand_capacity_dim`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工艺约束维度 |
| 物理表 | `cmp_demand_capacity_dim` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 14:00:09.7010` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `demandCapacityId` | 工艺约束ID | `demand_capacity_id` | 1550bbc9-2eed-432c-84cd-6c36a16d9507 |
| 4 | `characterId` | 特征ID | `character_id` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 5 | `characterCode` | 特征编码 | `character_code` | String |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `characterId` | 特征ID | `base.character.Character` | Service |  |
| 3 | `demandCapacityId` | 工艺约束ID | `cmp.demandcapacity.DemandCapacity` | None | true |
