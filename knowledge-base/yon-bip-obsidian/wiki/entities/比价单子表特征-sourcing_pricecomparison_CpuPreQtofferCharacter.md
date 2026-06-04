---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricecomparison.CpuPreQtofferCharacter"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 比价单子表特征 (`sourcing.pricecomparison.CpuPreQtofferCharacter`)

> ycSouringInquiry | 物理表：`cpu_pre_qtoffer_character`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价单子表特征 |
| 物理表 | `cpu_pre_qtoffer_character` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:53.1740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `HGZ00002` | 合格证 | `vcol54` | String |
| 2 | `ZCY001` | 产品 | `lcol1` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `id` | ID | `id` | String |
| 5 | `n111` | 来源询价单号 | `vcol55` | String |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `ZCY001` | 产品 | `pc.product.Product` | Service |  |
