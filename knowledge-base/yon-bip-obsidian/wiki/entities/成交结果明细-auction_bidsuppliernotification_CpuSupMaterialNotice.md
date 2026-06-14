---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidsuppliernotification.CpuSupMaterialNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果明细 (`auction.bidsuppliernotification.CpuSupMaterialNotice`)

> ycSouringAuction | 物理表：`cpu_bid_material_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果明细 |
| 物理表 | `cpu_bid_material_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:01.5090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 供应商端中标通知书物料孙表主键 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 供应商端中标通知书物料孙表主键 | `id` | Long |
| 2 | `bidNotificationId` | 中标通知书子表主键 | `bid_notification_id` | c7c4bda3-d51b-427d-ba87-7c5cced5b862 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `materialDetailId` | 采购结果物料表主键 | `material_detail_id` | aa63adff-d8eb-4dad-83ce-0bc6e33c0b3a |
| 7 | `projectId` | 招标项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `sectionId` | 招标标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 10 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 12 | `ytenant` | 租户 | `ytenant_id` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidNotificationId` | 中标通知书子表主键 | `auction.bidsuppliernotification.CpuSupNotification` | None | true |
| 2 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `materialDetailId` | 采购结果物料表主键 | `auction.decisionresult.CpuDsnMaterialDetail` | None |  |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 招标标段主键 | `auction.project.AuctionSection` | None |  |
| 6 | `projectId` | 招标项目主键 | `auction.project.AuctionProject` | None |  |
