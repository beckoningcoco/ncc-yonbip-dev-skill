---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidnotification.CpuBidMaterialNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 通知书明细(全部供应商的全部物料数据) (`auction.bidnotification.CpuBidMaterialNotice`)

> ycSouringAuction | 物理表：`cpu_bid_material_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通知书明细(全部供应商的全部物料数据) |
| 物理表 | `cpu_bid_material_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:57.6390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `materialDetailId` | 调整定标明细(竞拍结果全部供应商的全部物料数据) | `material_detail_id` | aa63adff-d8eb-4dad-83ce-0bc6e33c0b3a |
| 3 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 7 | `ytenant` | 租户 | `ytenant_id` | String |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `projectId` | 竞拍项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 11 | `sectionId` | 竞拍标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 12 | `bidNotificationId` | 通知书(全部供应商数据) | `bid_notification_id` | 2df66a90-6367-40f9-a49e-8791263e7967 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidNotificationId` | 通知书(全部供应商数据) | `auction.bidnotification.CpuBidNotification` | None | true |
| 2 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `materialDetailId` | 调整定标明细(竞拍结果全部供应商的全部物料数据) | `auction.decisionresult.CpuDsnMaterialDetail` | None |  |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 竞拍标段主键 | `auction.project.AuctionSection` | None |  |
| 6 | `projectId` | 竞拍项目主键 | `auction.project.AuctionProject` | None |  |
