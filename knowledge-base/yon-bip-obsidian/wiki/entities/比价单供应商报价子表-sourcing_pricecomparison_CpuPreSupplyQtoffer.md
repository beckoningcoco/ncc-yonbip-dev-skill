---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricecomparison.CpuPreSupplyQtoffer"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 比价单供应商报价子表 (`sourcing.pricecomparison.CpuPreSupplyQtoffer`)

> ycSouringInquiry | 物理表：`cpu_pre_supply_qtoffer`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价单供应商报价子表 |
| 物理表 | `cpu_pre_supply_qtoffer` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:24.3050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `fileId` | 附件 | `file_id` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `pid` | 比价单id | `pid` | f6b61fde-72f1-44e0-8f43-608e448b2981 |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `qtofferId` | 报价单主表id | `qtoffer_id` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 7 | `supplyDocId` | 供应商id | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `qtofferId` | 报价单主表id | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
| 3 | `pid` | 比价单id | `sourcing.pricecomparison.CpuPreBuyoffer` | None | true |
| 4 | `supplyDocId` | 供应商id | `aa.vendor.Vendor` | Service |  |
