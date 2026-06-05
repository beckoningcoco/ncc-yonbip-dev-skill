---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.SDTree"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供需追溯明细表 (`mr.planworkbench.SDTree`)

> MR | 物理表：`mr_mrp_sd_tree`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供需追溯明细表 |
| 物理表 | `mr_mrp_sd_tree` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:28.9480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（71个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `parentId` | 父Id | `parent_id` | Long |
| 6 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 7 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 8 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 9 | `materialId` | 制造物料 | `material_id` | Long |
| 10 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 11 | `docOrg` | 单据组织 | `doc_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `docTypeCode` | 单据类型编码 | `doc_type_code` | DocTypeEnum |
| 13 | `docId` | 单据 | `doc_id` | Long |
| 14 | `docNo` | 单据号 | `doc_no` | String |
| 15 | `docLineId` | 单据行 | `doc_line_id` | Long |
| 16 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 17 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 18 | `docQty` | 单据原量 | `doc_qty` | Decimal |
| 19 | `balQty` | 单据余量 | `bal_qty` | Decimal |
| 20 | `matchQty` | 匹配数量 | `match_qty` | Decimal |
| 21 | `decomposeQty` | 已分解量 | `decompose_qty` | Decimal |
| 22 | `deductionQty` | 已扣减量 | `deduction_qty` | Decimal |
| 23 | `sdOrgId` | 供需组织 | `sd_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 24 | `sdType` | 供需类型 | `sd_type` | mr_sd_type_enum |
| 25 | `rootSDInfoId` | 根供需明细信息 | `root_sd_info_id` | dde99445-beaa-46b6-af8f-0f18e24f04f7 |
| 26 | `sdInfoId` | 供需明细信息 | `sd_info_id` | dde99445-beaa-46b6-af8f-0f18e24f04f7 |
| 27 | `parentBalQty` | 上级供需单据余量 | `parent_bal_qty` | Decimal |
| 28 | `parentSDInfoId` | 父节点供需明细信息 | `parent_sd_info_id` | dde99445-beaa-46b6-af8f-0f18e24f04f7 |
| 29 | `sdDate` | 供需日期 | `sd_date` | DateTime |
| 30 | `origSdDate` | 原始供需日期 | `orig_sd_date` | DateTime |
| 31 | `netQty` | 供需数量 | `net_qty` | Decimal |
| 32 | `usageType` | 用量类型 | `usage_type` | ItemUsageTypeEnum |
| 33 | `unreturnedBorrowingQty` | 借用未还量 | `unreturned_borrowing_qty` | Decimal |
| 34 | `entrustedSupplyType` | 受托加工供应方式 | `entrusted_supply_type` | entrustedSupplyTypeEnum |
| 35 | `entrustedType` | 受托加工类型 | `entrusted_type` | entrustedTypeEnum |
| 36 | `reserveMethod` | 预留方式 | `reserve_method` | ReserveMethodEnum |
| 37 | `reserveid` | 预留对象Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 38 | `departmentId` | 生产 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 39 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 40 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 41 | `remark` | 备注 | `remark` | String |
| 42 | `llc` | 低阶码 | `llc` | Integer |
| 43 | `mergeRootDocId` | 合并源头单据 | `merge_root_doc_id` | Long |
| 44 | `productId` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 45 | `datasub` | 应用来源 | `datasub` | String |
| 46 | `sysState` | 实体状态 | `sys_state` | EntityState |
| 47 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 48 | `srcDocOrgId` | 来源单据组织 | `src_doc_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 49 | `srcDocTypeCode` | 来源单据类型编码 | `src_doc_type_code` | DocTypeEnum |
| 50 | `srcDocTypeId` | 来源单据类型 | `src_doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 51 | `srcDocId` | 来源单据 | `src_doc_id` | Long |
| 52 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 53 | `srcDocLineId` | 来源单据行 | `src_doc_line_id` | Long |
| 54 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 55 | `srcDocDate` | 来源单据日期 | `src_doc_date` | DateTime |
| 56 | `rootDocOrgId` | 源头单据组织 | `root_doc_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 57 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | DocTypeEnum |
| 58 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 59 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 60 | `rootDocLineId` | 源头单据行 | `root_doc_line_id` | Long |
| 61 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 62 | `rootDocDate` | 源头单据日期 | `root_doc_date` | DateTime |
| 63 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 64 | `creator` | 创建人名称 | `creator` | String |
| 65 | `createDate` | 创建日期 | `create_date` | Date |
| 66 | `createTime` | 创建时间 | `create_time` | DateTime |
| 67 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 68 | `modifier` | 修改人名称 | `modifier` | String |
| 69 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 70 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 71 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `srcDocOrgId` | 来源单据组织 | `org.func.BaseOrg` | Service |  |
| 2 | `docOrg` | 单据组织 | `org.func.BaseOrg` | Service |  |
| 3 | `productId` | product | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 预留对象Id | `st.reservation.Reservation` | Service |  |
| 5 | `rootSDInfoId` | 根供需明细信息 | `mr.planworkbench.SDInfo` | None |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `departmentId` | 生产 | `aa.baseorg.DeptMV` | Service |  |
| 8 | `rootDocOrgId` | 源头单据组织 | `org.func.BaseOrg` | Service |  |
| 9 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 10 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 11 | `parentSDInfoId` | 父节点供需明细信息 | `mr.planworkbench.SDInfo` | None |  |
| 12 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 13 | `srcDocTypeId` | 来源单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 14 | `sdOrgId` | 供需组织 | `org.func.BaseOrg` | Service |  |
| 15 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 16 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 17 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 18 | `sdInfoId` | 供需明细信息 | `mr.planworkbench.SDInfo` | None |  |
| 19 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 20 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
