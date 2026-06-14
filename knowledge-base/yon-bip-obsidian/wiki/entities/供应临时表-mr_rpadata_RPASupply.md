---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPASupply"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供应临时表 (`mr.rpadata.RPASupply`)

> MR | 物理表：`mr_rpa_supply`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应临时表 |
| 物理表 | `mr_rpa_supply` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:15.3360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bomId` | BOMID | `bom_id` | Long |
| 2 | `createType` | 创建类型 | `create_type` | Integer |
| 3 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 4 | `docId` | 单据 | `doc_id` | Long |
| 5 | `docLineId` | 单据行 | `doc_line_id` | Long |
| 6 | `docLineNo` | 行号 | `doc_line_no` | String |
| 7 | `docNo` | 单号 | `doc_no` | String |
| 8 | `docOrgId` | 单据组织 | `doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 9 | `docQty` | 供应原量 | `doc_qty` | Decimal |
| 10 | `docTypeId` | 单据类型 | `doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 11 | `id` | ID | `id` | Long |
| 12 | `llc` | 低阶码 | `llc` | Integer |
| 13 | `lotAdjustQty` | 批量调整数量 | `lot_adjust_qty` | Decimal |
| 14 | `mainUom` | 主单位 | `main_uom` | String |
| 15 | `materialId` | 制造物料 | `material_id` | Long |
| 16 | `netQty` | 净供应量 | `net_qty` | Decimal |
| 17 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 18 | `origSdDate` | 原始供需日期 | `orig_sd_date` | DateTime |
| 19 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 20 | `priority` | 优先级 | `priority` | Long |
| 21 | `productCode` | 料号 | `product_code` | String |
| 22 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 23 | `productName` | 名称 | `product_name` | String |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 26 | `remark` | 备注 | `remark` | String |
| 27 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 28 | `rootDocDate` | 源头单据日期 | `root_doc_date` | DateTime |
| 29 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 30 | `rootDocLineId` | 源头单据行 | `root_doc_line_id` | Long |
| 31 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 32 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 33 | `rootDocOrgId` | 源头单据组织 | `root_doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 34 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | DocTypeEnum |
| 35 | `sdOrgId` | 供需组织 | `sd_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 36 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 37 | `specName` | 规格 | `spec_name` | String |
| 38 | `srcDocDate` | 来源单据日期 | `src_doc_date` | DateTime |
| 39 | `srcDocId` | 来源单据 | `src_doc_id` | Long |
| 40 | `srcDocLineId` | 来源单据行 | `src_doc_line_id` | Long |
| 41 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 42 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 43 | `srcDocOrgId` | 来源单据组织 | `src_doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 44 | `srcDocTypeCode` | 来源单据类型编码 | `src_doc_type_code` | DocTypeEnum |
| 45 | `srcDocTypeId` | 来源单据类型 | `src_doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 46 | `state` | 状态 | `state` | RequirementOrderTypeEnum |
| 47 | `supplyDate` | 供应日期 | `supply_date` | DateTime |
| 48 | `supplyId` | 供应id | `supply_id` | Long |
| 49 | `supplyQty` | 供应量 | `supply_qty` | Decimal |
| 50 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 51 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `docOrgId` | 单据组织 | `aa.baseorg.OrgMV` | Service |  |
| 2 | `srcDocOrgId` | 来源单据组织 | `aa.baseorg.OrgMV` | Service |  |
| 3 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `rootDocOrgId` | 源头单据组织 | `aa.baseorg.OrgMV` | Service |  |
| 7 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 9 | `srcDocTypeId` | 来源单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 10 | `sdOrgId` | 供需组织 | `aa.baseorg.OrgMV` | Service |  |
| 11 | `docTypeId` | 单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 12 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 13 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
