---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BuyOfferBodyCost"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价子表成本项明细 (`sourcing.ibuyoffer.BuyOfferBodyCost`)

> ycSouringInquiry | 物理表：`cpu_buyoffer_detail_cost`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价子表成本项明细 |
| 物理表 | `cpu_buyoffer_detail_cost` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:35.2420` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `costBId` | 成本项子表id | `cost_b_id` | 575c0982-2f70-4b26-844f-be557a7e5732 |
| 2 | `id` | ID | `id` | Long |
| 3 | `offerBId` | 报价单子表id | `offer_b_id` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `offerBId` | 报价单子表id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `costBId` | 成本项子表id | `aa.costquote.CpuCostpricingDetail` | Service |  |
