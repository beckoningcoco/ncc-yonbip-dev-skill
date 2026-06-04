---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidsuppliernotification.CpuSupMaterialNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果明细 (`lawbid.bidsuppliernotification.CpuSupMaterialNotice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_material_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果明细 |
| 物理表 | `cpu_bid_material_notice` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:44.4660` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 供应商端中标通知书物料孙表主键 |

## 部署信息

- 部署时间: 2025-10-24 23:57:24:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 5 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidNotificationId` | 中标通知书子表主键 | `bid_notification_id` | 9c1d8ecb-d209-4867-bb6d-e85e4fd22365 |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `materialDetailId` | 采购结果物料表主键 | `material_detail_id` | 23f77ada-9b2b-43f8-963c-0d689e9b2464 |
| 6 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 9 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `ytenant` | 租户 | `ytenant_id` | String |
| 12 | `id` | 供应商端中标通知书物料孙表主键 | `id` | Long |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidNotificationId` | 中标通知书子表主键 | `lawbid.bidsuppliernotification.CpuSupNotification` | None | true |
| 2 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `materialDetailId` | 采购结果物料表主键 | `lawbid.decisionresult.CpuDsnMaterialDetail` | None |  |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 6 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
