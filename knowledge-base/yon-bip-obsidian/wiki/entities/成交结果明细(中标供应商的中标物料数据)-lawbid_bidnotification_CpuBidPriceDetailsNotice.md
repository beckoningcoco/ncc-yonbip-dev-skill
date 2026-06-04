---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidnotification.CpuBidPriceDetailsNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果明细(中标供应商的中标物料数据) (`lawbid.bidnotification.CpuBidPriceDetailsNotice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_price_details_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果明细(中标供应商的中标物料数据) |
| 物理表 | `cpu_bid_price_details_notice` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:34.3860` |

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
| 5 | `materialDetailId` | 调整定标明细(采购结果中标供应商的中标物料数据) | `material_detail_id` | 23f77ada-9b2b-43f8-963c-0d689e9b2464 |
| 6 | `noticeCandidateId` | 成交结果(中标供应商数据) | `candidate_id` | 52039748-0763-40ba-acf7-a947829e8d94 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 10 | `ytenant` | 租户 | `ytenant_id` | String |
| 11 | `id` | id | `id` | Long |
| 12 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 13 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `materialDetailId` | 调整定标明细(采购结果中标供应商的中标物料数据) | `lawbid.decisionresult.CpuDsnMaterialDetail` | None |  |
| 3 | `noticeCandidateId` | 成交结果(中标供应商数据) | `lawbid.bidnotification.CpuNoticeCandidate` | None | true |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 6 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
