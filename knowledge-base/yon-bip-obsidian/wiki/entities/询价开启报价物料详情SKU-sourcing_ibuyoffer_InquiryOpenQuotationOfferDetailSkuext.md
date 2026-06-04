---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.InquiryOpenQuotationOfferDetailSkuext"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价开启报价物料详情SKU (`sourcing.ibuyoffer.InquiryOpenQuotationOfferDetailSkuext`)

> ycSouringInquiry | 物理表：`cpu_qtoffer_detail_skuext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价开启报价物料详情SKU |
| 物理表 | `cpu_qtoffer_detail_skuext` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:34.3890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 1c974b37-f526-407e-9f50-58ad42f31ed3 | 主键 |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billBid` | 询价开启报价物料详情ID | `bill_bid` | c54dde4d-2136-4c68-bd74-99b9b48eed11 |
| 2 | `billId` | 询价开启报价子表id | `bill_id` | f70b091f-0b67-4a95-9dda-ecdccace3269 |
| 3 | `id` | 主键 | `id` | 1c974b37-f526-407e-9f50-58ad42f31ed3 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billBid` | 询价开启报价物料详情ID | `sourcing.ibuyoffer.InquiryOpenQuotationOfferDetail` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `billId` | 询价开启报价子表id | `sourcing.ibuyoffer.InquiryOpenQuotationOffer` | None |  |
| 4 | `id` | 主键 | `sourcing.ibuyoffer.CpuQtOfferDetailSkuext` | None |  |
