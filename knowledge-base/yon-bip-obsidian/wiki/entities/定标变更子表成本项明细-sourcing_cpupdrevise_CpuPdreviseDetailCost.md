---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.cpupdrevise.CpuPdreviseDetailCost"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标变更子表成本项明细 (`sourcing.cpupdrevise.CpuPdreviseDetailCost`)

> ycSouringInquiry | 物理表：`cpu_pdrevise_detail_cost`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标变更子表成本项明细 |
| 物理表 | `cpu_pdrevise_detail_cost` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:30.8770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `offerBId` | 定标变更单子表id | `offer_b_id` | 3ec5f7f3-ec1d-4add-8da5-1c4048fcdc82 |
| 2 | `costBId` | 成本项子表id | `cost_b_id` | 575c0982-2f70-4b26-844f-be557a7e5732 |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `id` | 主键 | `id` | Long |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `offerBId` | 定标变更单子表id | `sourcing.cpupdrevise.CpuPdreviseDetail` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `costBId` | 成本项子表id | `aa.costquote.CpuCostpricingDetail` | Service |  |
