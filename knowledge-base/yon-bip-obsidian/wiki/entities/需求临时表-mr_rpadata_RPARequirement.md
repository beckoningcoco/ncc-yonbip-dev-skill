---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPARequirement"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 需求临时表 (`mr.rpadata.RPARequirement`)

> MR | 物理表：`mr_rpa_requirement`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 需求临时表 |
| 物理表 | `mr_rpa_requirement` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:24.5880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（67个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bomId` | BOMID | `bom_id` | Long |
| 2 | `bomSubitemId` | BOM子项ID | `bom_subitem_id` | Long |
| 3 | `closeSign` | 关闭标识 | `close_sign` | Boolean |
| 4 | `consumQty` | 冲销量 | `consum_qty` | Decimal |
| 5 | `createType` | 创建类型 | `create_type` | Integer |
| 6 | `deductMethod` | 冲销方式 | `deduct_method` | DeductMethodEnum |
| 7 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 8 | `docId` | 单据 | `doc_id` | Long |
| 9 | `docLineId` | 单据行 | `doc_line_id` | Long |
| 10 | `docLineNo` | 行号 | `doc_line_no` | String |
| 11 | `docNo` | 单号 | `doc_no` | String |
| 12 | `docOrgId` | 单据组织 | `doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 13 | `docQty` | 需求原量 | `doc_qty` | Decimal |
| 14 | `docTypeId` | 单据类型 | `doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 15 | `id` | ID | `id` | Long |
| 16 | `llc` | 低阶码 | `llc` | Integer |
| 17 | `mainUom` | 主单位 | `main_uom` | String |
| 18 | `materialId` | 制造物料 | `material_id` | Long |
| 19 | `netQty` | 净需求量 | `net_qty` | Decimal |
| 20 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 21 | `origSdDate` | 原始供需日期 | `orig_sd_date` | DateTime |
| 22 | `parentProductId` | 上阶母件物料 | `parent_product_id` | Long |
| 23 | `parentSupplyId` | 上阶母件供应ID | `parent_supply_id` | Long |
| 24 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 25 | `planStaffId` | 计划员 | `plan_staff_id` | Long |
| 26 | `priority` | 优先级 | `priority` | Long |
| 27 | `productCode` | 料号 | `product_code` | String |
| 28 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 29 | `productName` | 名称 | `product_name` | String |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 32 | `remark` | 备注 | `remark` | String |
| 33 | `replaceQty` | 替代数量 | `replace_qty` | Decimal |
| 34 | `replaceSign` | 替代标识 | `replace_sign` | Boolean |
| 35 | `reqDate` | 需求日期 | `req_date` | DateTime |
| 36 | `reqId` | 需求id | `req_id` | Long |
| 37 | `reqQty` | 需求量 | `reqQty` | Decimal |
| 38 | `requirementDecomposeQty` | 需求分解量 | `requirement_decompose_qty` | Decimal |
| 39 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 40 | `rootDocDate` | 源头单据日期 | `root_doc_date` | DateTime |
| 41 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 42 | `rootDocLineId` | 源头单据行 | `root_doc_line_id` | Long |
| 43 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 44 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 45 | `rootDocOrgId` | 源头单据组织 | `root_doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 46 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | DocTypeEnum |
| 47 | `rootReqId` | 根需求Id | `root_req_id` | Long |
| 48 | `sdOrgId` | 供需组织 | `sd_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 49 | `sendQty` | 出货量 | `send_qty` | Decimal |
| 50 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 51 | `sourceReqId` | 来源需求Id | `source_req_id` | Long |
| 52 | `sourceReqOrgId` | 来源需求组织 | `source_req_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 53 | `specName` | 规格 | `spec_name` | String |
| 54 | `srcDocDate` | 来源单据日期 | `src_doc_date` | DateTime |
| 55 | `srcDocId` | 来源单据 | `src_doc_id` | Long |
| 56 | `srcDocLineId` | 来源单据行 | `src_doc_line_id` | Long |
| 57 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 58 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 59 | `srcDocOrgId` | 来源单据组织 | `src_doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 60 | `srcDocTypeCode` | 来源单据类型编码 | `src_doc_type_code` | DocTypeEnum |
| 61 | `srcDocTypeId` | 来源单据类型 | `src_doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 62 | `state` | 状态 | `state` | RequirementOrderTypeEnum |
| 63 | `supplyDeductionQty` | 供应扣减量 | `supply_deduction_qty` | Decimal |
| 64 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 65 | `unitQty` | 单位用量 | `unit_qty` | Decimal |
| 66 | `usageType` | 用量类型 | `usage_type` | UsageTypeEnum |
| 67 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `docOrgId` | 单据组织 | `aa.baseorg.OrgMV` | Service |  |
| 2 | `srcDocOrgId` | 来源单据组织 | `aa.baseorg.OrgMV` | Service |  |
| 3 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 5 | `sourceReqOrgId` | 来源需求组织 | `aa.baseorg.OrgMV` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `rootDocOrgId` | 源头单据组织 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 10 | `srcDocTypeId` | 来源单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 11 | `sdOrgId` | 供需组织 | `aa.baseorg.OrgMV` | Service |  |
| 12 | `docTypeId` | 单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 13 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 14 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
