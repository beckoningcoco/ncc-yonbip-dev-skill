---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BoardPriceQuotationOffer"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标谈判页报价单子表 (`sourcing.ibuyoffer.BoardPriceQuotationOffer`)

> ycSouringInquiry | 物理表：`cpu_qtoffer`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标谈判页报价单子表 |
| 物理表 | `cpu_qtoffer` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:11.2720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | f481bff4-9adb-490e-997f-bedc510ce69b | 主键 |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 2 | `offerId` | Id | `offer_id` | bd4e6c1e-0715-41c2-baad-fe84e969ec90 |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `offerId` | Id | `sourcing.ibuyoffer.BoardPriceVO` | None | true |
| 3 | `id` | 主键 | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
| 4 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
