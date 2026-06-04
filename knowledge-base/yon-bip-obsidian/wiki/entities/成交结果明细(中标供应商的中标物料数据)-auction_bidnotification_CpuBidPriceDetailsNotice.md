---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidnotification.CpuBidPriceDetailsNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果明细(中标供应商的中标物料数据) (`auction.bidnotification.CpuBidPriceDetailsNotice`)

> ycSouringAuction | 物理表：`cpu_bid_price_details_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果明细(中标供应商的中标物料数据) |
| 物理表 | `cpu_bid_price_details_notice` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:58.9440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `noticeCandidateId` | 成交结果(中标供应商数据) | `candidate_id` | 20315b69-f4de-44c4-a019-7b126cf46781 |
| 3 | `materialDetailId` | 调整定标明细(竞拍结果中标供应商的中标物料数据) | `material_detail_id` | aa63adff-d8eb-4dad-83ce-0bc6e33c0b3a |
| 4 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 8 | `ytenant` | 租户 | `ytenant_id` | String |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `projectId` | 竞拍项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 12 | `sectionId` | 竞拍标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `materialDetailId` | 调整定标明细(竞拍结果中标供应商的中标物料数据) | `auction.decisionresult.CpuDsnMaterialDetail` | None |  |
| 3 | `noticeCandidateId` | 成交结果(中标供应商数据) | `auction.bidnotification.CpuNoticeCandidate` | None | true |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 竞拍标段主键 | `auction.project.AuctionSection` | None |  |
| 6 | `projectId` | 竞拍项目主键 | `auction.project.AuctionProject` | None |  |
