---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.InquiryOpenQuotationOfferDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价开启报价物料详情 (`sourcing.ibuyoffer.InquiryOpenQuotationOfferDetail`)

> ycSouringInquiry | 物理表：`cpu_qtoffer_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价开启报价物料详情 |
| 物理表 | `cpu_qtoffer_detail` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:50.4080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 | 主键 |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `cpuofferid` | 询价开启报价子表id | `cpuofferid` | f70b091f-0b67-4a95-9dda-ecdccace3269 |
| 2 | `offerId` | 询价单id | `offer_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 3 | `offerBId` | 询价单子表id | `offer_b_id` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 4 | `id` | 主键 | `id` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `sku` | 询价开启报价物料详情SKU | `` | 43e5a74f-316e-4382-8020-5332ab09bd80 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuofferid` | 询价开启报价子表id | `sourcing.ibuyoffer.InquiryOpenQuotationOffer` | None | true |
| 2 | `offerBId` | 询价单子表id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `offerId` | 询价单id | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 5 | `id` | 主键 | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None |  |
| 6 | `sku` | 询价开启报价物料详情SKU | `sourcing.ibuyoffer.InquiryOpenQuotationOfferDetailSkuext` | None | true |
