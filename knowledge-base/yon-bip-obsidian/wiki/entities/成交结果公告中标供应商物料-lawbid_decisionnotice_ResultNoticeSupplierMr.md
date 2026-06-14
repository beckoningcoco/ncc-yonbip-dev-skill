---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionnotice.ResultNoticeSupplierMr"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果公告中标供应商物料 (`lawbid.decisionnotice.ResultNoticeSupplierMr`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_result_notice_supplier_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果公告中标供应商物料 |
| 物理表 | `cpu_result_notice_supplier_material` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:16.4030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 成交结果公告中标供应商物料主键 |

## 部署信息

- 部署时间: 2025-10-24 23:57:27:000

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
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `dsnMaterialDetailId` | 采购结果物料表主键 | `dsn_material_detail_id` | 23f77ada-9b2b-43f8-963c-0d689e9b2464 |
| 4 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `id` | 成交结果公告中标供应商物料主键 | `id` | Long |
| 6 | `noticeSupplierId` | 成交结果公告中标供应商子表主键 | `notice_supplier_id` | 7ab21ae0-8f00-4776-a322-e596f9b4fe01 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 10 | `ytenant` | 租户 | `ytenant_id` | String |
| 11 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 12 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 13 | `rowNo` | 行号 | `row_no` | Decimal |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `dsnMaterialDetailId` | 采购结果物料表主键 | `lawbid.decisionresult.CpuDsnMaterialDetail` | None |  |
| 2 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 5 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
| 6 | `noticeSupplierId` | 成交结果公告中标供应商子表主键 | `lawbid.decisionnotice.ResultNoticeSupplier` | None | true |
