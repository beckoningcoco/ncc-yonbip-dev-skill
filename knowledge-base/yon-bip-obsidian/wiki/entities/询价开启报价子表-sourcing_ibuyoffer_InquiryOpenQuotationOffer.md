---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.InquiryOpenQuotationOffer"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价开启报价子表 (`sourcing.ibuyoffer.InquiryOpenQuotationOffer`)

> ycSouringInquiry | 物理表：`cpu_qtoffer`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价开启报价子表 |
| 物理表 | `cpu_qtoffer` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:17.8370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | f481bff4-9adb-490e-997f-bedc510ce69b | 主键 |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `offerId` | 询价开启清单Id | `offer_id` | bf62599c-f667-424e-996b-aef6b54eebae |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `id` | 主键 | `id` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 9 | `detailList` | 询价开启报价物料详情 | `` | c54dde4d-2136-4c68-bd74-99b9b48eed11 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `detailList` | 询价开启报价物料详情 | `sourcing.ibuyoffer.InquiryOpenQuotationOfferDetail` | None | true |
| 3 | `offerId` | 询价开启清单Id | `sourcing.ibuyoffer.InquiryOpenVO` | None | true |
| 4 | `id` | 主键 | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
| 5 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
