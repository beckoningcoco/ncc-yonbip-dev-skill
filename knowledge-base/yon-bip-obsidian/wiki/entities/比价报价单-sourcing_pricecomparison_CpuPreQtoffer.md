---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricecomparison.CpuPreQtoffer"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 比价报价单 (`sourcing.pricecomparison.CpuPreQtoffer`)

> ycSouringInquiry | 物理表：`cpu_pre_qtoffer`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价报价单 |
| 物理表 | `cpu_pre_qtoffer` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:21.7450` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `pid` | 比价单id | `pbid` | f6b61fde-72f1-44e0-8f43-608e448b2981 |
| 2 | `qtofferId` | 报价单主表id | `qtoffer_id` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 3 | `priceType` | 单价类型 | `price_type` | Integer |
| 4 | `price` | 单价 | `price` | Decimal |
| 5 | `recommendReason` | 推荐理由 | `recommend_reason` | String |
| 6 | `qtCurrencyExchRate` | 比价参考汇率 | `qt_currency_exchrate` | Decimal |
| 7 | `tenant` | 租户ID | `tenant_id` | String |
| 8 | `qtofferDetailId` | 报价单子表id | `qtoffer_detail_id` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `id` | 主键 | `id` | Long |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `ytenant` | 租户id | `ytenant_id` | String |
| 13 | `cpuPreQtofferCharacter` | 特征 | `character_id` | d814fdf4-be6f-4425-8762-671e33cff184 |
| 14 | `exchRateOps` | 汇率折算方式 | `exchRateOps` | ExchangeRateMethod |
| 15 | `isSelected` | 是否推荐 | `is_selected` | Boolean |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuPreQtofferCharacter` | 特征 | `sourcing.pricecomparison.CpuPreQtofferCharacter` | None |  |
| 2 | `qtofferDetailId` | 报价单子表id | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None |  |
| 3 | `qtofferId` | 报价单主表id | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
| 4 | `pid` | 比价单id | `sourcing.pricecomparison.CpuPreBuyoffer` | None | true |
