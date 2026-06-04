---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.TalkMaterialSupply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判物料与供应商关系表 (`sourcing.ibuyoffer.TalkMaterialSupply`)

> ycSouringInquiry | 物理表：`cpu_biddoc_materialsupplyrelation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判物料与供应商关系表 |
| 物理表 | `cpu_biddoc_materialsupplyrelation` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:20.4280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `talksId` | 谈判单id | `talks_id` | f948c8ae-1c2d-4dc3-8290-38c81d361f90 |
| 3 | `supEnterpriseId` | 租户id | `sup_enterprise_id` | Long |
| 4 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `materialName` | 物料名称 | `material_name` | String |
| 6 | `supplierDocId` | 供应商档案 | `supplier_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `supplierDocName` | 供应商档案名称 | `supplier_doc_name` | String |
| 8 | `pritemid` | 采购需求id | `pritemid` | Long |
| 9 | `offerBId` | 询价单子表id | `offer_b_id` | Long |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierDocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `talksId` | 谈判单id | `sourcing.ibuyoffer.BiddocTalksVO` | None | true |
