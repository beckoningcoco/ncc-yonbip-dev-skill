---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidnotification.CpuBidMaterialNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 通知书明细(全部供应商的全部物料数据) (`lawbid.bidnotification.CpuBidMaterialNotice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_material_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通知书明细(全部供应商的全部物料数据) |
| 物理表 | `cpu_bid_material_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:32.9880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `rowNo` | 行号 | `row_no` | Decimal |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `materialDetailId` | 调整定标明细(采购结果全部供应商的全部物料数据) | `material_detail_id` | 23f77ada-9b2b-43f8-963c-0d689e9b2464 |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 9 | `ytenant` | 租户 | `ytenant_id` | String |
| 10 | `id` | id | `id` | Long |
| 11 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 12 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 13 | `bidNotificationId` | 通知书(全部供应商数据) | `bid_notification_id` | c808d2fa-67bf-41bf-b89e-485c23d30e3e |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidNotificationId` | 通知书(全部供应商数据) | `lawbid.bidnotification.CpuBidNotification` | None | true |
| 2 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `materialDetailId` | 调整定标明细(采购结果全部供应商的全部物料数据) | `lawbid.decisionresult.CpuDsnMaterialDetail` | None |  |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 6 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
