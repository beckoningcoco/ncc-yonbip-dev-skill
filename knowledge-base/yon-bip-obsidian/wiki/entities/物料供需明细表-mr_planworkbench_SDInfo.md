---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.SDInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料供需明细表 (`mr.planworkbench.SDInfo`)

> MR | 物理表：`mr_mrp_sd_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料供需明细表 |
| 物理表 | `mr_mrp_sd_info` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:21.0700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（85个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 6 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 7 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 8 | `productId` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 9 | `freeCharacteristics` | 自由特征组实体 | `free_characteristics` | f87bab34-a20d-42d8-9771-775309b77760 |
| 10 | `materialId` | 制造物料 | `material_id` | Long |
| 11 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 12 | `sdOrgId` | 供需组织 | `sd_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 13 | `sdType` | 供需类型 | `sd_type` | mr_sd_type_enum |
| 14 | `docTypeId` | 供需单据类型 | `doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 15 | `docOrg` | 单据组织 | `doc_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 16 | `docTypeCode` | 单据类型编码 | `doc_type_code` | DocTypeEnum |
| 17 | `docId` | 单据 | `doc_id` | Long |
| 18 | `docNo` | 单据号 | `doc_no` | String |
| 19 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 20 | `docLineId` | 单据行 | `doc_line_id` | Long |
| 21 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 22 | `docQty` | 单据原量 | `doc_qty` | Decimal |
| 23 | `balQty` | 单据余量 | `bal_qty` | Decimal |
| 24 | `consumQty` | 冲销量 | `consum_qty` | Decimal |
| 25 | `netQty` | 供需数量 | `net_qty` | Decimal |
| 26 | `unreturnedBorrowingQty` | 借用未还量 | `unreturned_borrowing_qty` | Decimal |
| 27 | `decomposeQty` | 已分解量 | `decompose_qty` | Decimal |
| 28 | `deductionQty` | 已扣减量 | `deduction_qty` | Decimal |
| 29 | `replaceQty` | 替代数量 | `replace_qty` | Decimal |
| 30 | `uom` | 单位 | `uom` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `origSdDate` | 原始供需日期 | `orig_sd_date` | DateTime |
| 32 | `sdDate` | 供需日期 | `sd_date` | DateTime |
| 33 | `defineCharacteristics` | 备料自定义项特征实体 | `define_characteristics` | 63209295-ca2a-4c70-88d0-fc11c96d39eb |
| 34 | `createType` | 创建类型 | `create_type` | Integer |
| 35 | `priority` | 优先级 | `priority` | Long |
| 36 | `percentage` | 拆分比例 | `percentage` | Integer |
| 37 | `srcSourceProductId` | 来源物料id | `src_source_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 38 | `entrustedSupplyType` | 受托加工供应方式 | `entrusted_supply_type` | entrustedSupplyTypeEnum |
| 39 | `entrustedType` | 受托加工类型 | `entrusted_type` | entrustedTypeEnum |
| 40 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 41 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 42 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 43 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 44 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 45 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 46 | `reserveMethod` | 预留方式 | `reserve_method` | ReserveMethodEnum |
| 47 | `reserveid` | 预留对象Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 48 | `free1` | 规格1 | `free1` | String |
| 49 | `free10` | 规格10 | `free10` | String |
| 50 | `free2` | 规格2 | `free2` | String |
| 51 | `free3` | 规格3 | `free3` | String |
| 52 | `free4` | 规格4 | `free4` | String |
| 53 | `free5` | 规格5 | `free5` | String |
| 54 | `free6` | 规格6 | `free6` | String |
| 55 | `free7` | 规格7 | `free7` | String |
| 56 | `free8` | 规格8 | `free8` | String |
| 57 | `free9` | 规格9 | `free9` | String |
| 58 | `remark` | 备注 | `remark` | String |
| 59 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 60 | `sysState` | 实体状态 | `sys_state` | EntityState |
| 61 | `srcDocOrgId` | 来源单据组织 | `src_doc_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 62 | `srcDocTypeId` | 来源单据类型 | `src_doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 63 | `srcDocTypeCode` | 来源单据类型编码 | `src_doc_type_code` | DocTypeEnum |
| 64 | `srcDocId` | 来源单据 | `src_doc_id` | Long |
| 65 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 66 | `srcDocLineId` | 来源单据行 | `src_doc_line_id` | Long |
| 67 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 68 | `srcDocDate` | 来源单据日期 | `src_doc_date` | DateTime |
| 69 | `rootDocOrgId` | 源头单据组织 | `root_doc_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 70 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | DocTypeEnum |
| 71 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 72 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 73 | `rootDocLineId` | 源头单据行 | `root_doc_line_id` | Long |
| 74 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 75 | `rootDocDate` | 源头单据日期 | `root_doc_date` | DateTime |
| 76 | `datasub` | 应用来源 | `datasub` | String |
| 77 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 78 | `creator` | 创建人名称 | `creator` | String |
| 79 | `createDate` | 创建日期 | `create_date` | Date |
| 80 | `createTime` | 创建时间 | `create_time` | DateTime |
| 81 | `modifier` | 修改人名称 | `modifier` | String |
| 82 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 83 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 84 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 85 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（25个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `srcDocOrgId` | 来源单据组织 | `org.func.BaseOrg` | Service |  |
| 2 | `reserveid` | 预留对象Id | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 5 | `srcSourceProductId` | 来源物料id | `pc.product.Product` | Service |  |
| 6 | `rootDocOrgId` | 源头单据组织 | `org.func.BaseOrg` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 11 | `srcDocTypeId` | 来源单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 12 | `sdOrgId` | 供需组织 | `org.func.BaseOrg` | Service |  |
| 13 | `uom` | 单位 | `pc.unit.Unit` | Service |  |
| 14 | `docTypeId` | 供需单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 15 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 16 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 17 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 18 | `docOrg` | 单据组织 | `org.func.BaseOrg` | Service |  |
| 19 | `productId` | product | `pc.product.Product` | Service |  |
| 20 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 21 | `defineCharacteristics` | 备料自定义项特征实体 | `mr.planworkbench.SDInfoDCT` | None |  |
| 22 | `freeCharacteristics` | 自由特征组实体 | `mr.planworkbench.SDInfoFCT` | None |  |
| 23 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 24 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 25 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
