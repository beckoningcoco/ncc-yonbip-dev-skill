---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.CpuPriceBodyStep"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价子表价格阶梯明细 (`sourcing.ibuyoffer.CpuPriceBodyStep`)

> ycSouringInquiry | 物理表：`cpu_price_detail_step`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价子表价格阶梯明细 |
| 物理表 | `cpu_price_detail_step` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:45.1280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `offerBId` | 报价单子表id | `offer_b_id` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `stepBId` | 阶梯价子表id | `step_b_id` | 02c5d065-2e0e-435a-82c2-edd034ab6eef |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `stepBId` | 阶梯价子表id | `aa.quotation.BiQuotationBody` | Service |  |
| 2 | `offerBId` | 报价单子表id | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
