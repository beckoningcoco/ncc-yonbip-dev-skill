---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.bidnoticenew.CpuBidNoticeBody"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标公示子表 (`sourcing.bidnoticenew.CpuBidNoticeBody`)

> ycSouringInquiry | 物理表：`cpu_bidnotice_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标公示子表 |
| 物理表 | `cpu_bidnotice_b` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:04.2450` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标志 | `dr` | Integer |
| 3 | `hid` | 中标公示主表id | `hid` | d6f728d0-ec25-4ac7-81ab-74ad55dc3b93 |
| 4 | `id` | 主键 | `id` | Long |
| 5 | `pricedecisionBid` | 定标单子表id | `pricedecision_bid` | 5ad37a5c-0251-495d-8791-6c08a9d69254 |
| 6 | `publish` | 是否发布 | `publish` | String |
| 7 | `pubts` | 业务时间戳 | `ts` | DateTime |
| 8 | `ts` | 业务时间戳 | `ts` | DateTime |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `hid` | 中标公示主表id | `sourcing.bidnoticenew.CpuBidNotice` | None | true |
| 2 | `pricedecisionBid` | 定标单子表id | `sourcing.pricedecision.PriceDecisionDetail` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
