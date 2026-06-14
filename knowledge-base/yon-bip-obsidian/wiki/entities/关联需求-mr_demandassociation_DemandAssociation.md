---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.demandassociation.DemandAssociation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 关联需求 (`mr.demandassociation.DemandAssociation`)

> MR | 物理表：`mr_lrp_association`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关联需求 |
| 物理表 | `mr_lrp_association` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:31.5260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（73个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `vouchDate` | 单据日期 | `vouch_date` | DateTime |
| 6 | `orderCode` | 需求单号 | `order_code` | String |
| 7 | `orderRowNo` | 需求行号 | `order_row_no` | String |
| 8 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 9 | `departmentId` | 需求部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 10 | `materialId` | 制造物料 | `material_id` | Long |
| 11 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 12 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `freeCharacteristics` | 关联需求自由特征组实体 | `mr_demand_association_fct` | 815a94df-92e6-454e-9e58-25b8e4d0ba87 |
| 14 | `userDefineCharacter` | 关联需求自定义项实体 | `mr_demand_association_dct` | 01ef0a05-124e-45be-8c00-a75da3f77a6d |
| 15 | `demandNumber` | 需求数量 | `demand_number` | Decimal |
| 16 | `assistUnit` | 单位 | `assist_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `mainUom` | 主计量单位 | `main_uom` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `mainUomQuantity` | 主计量需求量 | `main_quantity` | Decimal |
| 19 | `assistChangeRate` | 换算率 | `assist_change_rate` | Decimal |
| 20 | `demandDate` | 需求日期 | `demand_date` | DateTime |
| 21 | `bomId` | BOM表体ID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 22 | `substituteFlag` | BOM替代标识 | `substitute_flag` | String |
| 23 | `warehouseId` | 需求仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 24 | `stockOrgId` | 库存组织id | `stock_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 25 | `priority` | 优先级 | `priority` | Integer |
| 26 | `remark` | 备注 | `remark` | String |
| 27 | `productStatus` | 物料状态 | `product_status` | Short |
| 28 | `capacityStatus` | 能力状态 | `capacity_status` | Short |
| 29 | `estimateStatus` | 交期状态 | `estimate_status` | Short |
| 30 | `estimateDate` | 预估交期 | `estimate_date` | DateTime |
| 31 | `simulateFlag` | 模拟需求 | `simulate_flag` | Boolean |
| 32 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 33 | `entrustedType` | 受托加工类型 | `entrusted_type` | entrustedTypeEnum |
| 34 | `isSelect` | 是否选择 | `is_select` | Short |
| 35 | `planProperty` | 计划属性 | `plan_property` | PlanPropertyEnum |
| 36 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | DocTypeEnum |
| 37 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 38 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 39 | `srcDocTypeCode` | 来源单据类型编码 | `src_doc_type_code` | DocTypeEnum |
| 40 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 41 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 42 | `entrustedSupplyType` | 受托加工供应方式 | `entrusted_supply_type` | entrustedSupplyTypeEnum |
| 43 | `srcDocLineId` | 来源单据行id | `src_doc_line_id` | Long |
| 44 | `rootDocLineId` | 源头单据行id | `root_doc_line_id` | Long |
| 45 | `mdsPush` | MDS下推 | `mds_push` | Short |
| 46 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 47 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 48 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 49 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 50 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 51 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 52 | `createTime` | 创建时间 | `create_time` | DateTime |
| 53 | `createDate` | 创建日期 | `create_date` | Date |
| 54 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 55 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 56 | `creator` | 创建人名称 | `creator` | String |
| 57 | `modifier` | 修改人名称 | `modifier` | String |
| 58 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 59 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 60 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 61 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 62 | `orderType` | 订单类型 | `order_type` | LRPOrderTypeEnum |
| 63 | `orderId` | 订单id | `order_id` | Long |
| 64 | `orderRowId` | 订单行id | `order_row_id` | Long |
| 65 | `executeDate` | 创建时间 | `execute_date` | DateTime |
| 66 | `planParamId` | 计划参数 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 67 | `operationException` | 运算异常信息 | `operation_exception` | String |
| 68 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 69 | `pubts` | 时间戳 | `pubts` | DateTime |
| 70 | `DemandAssociationAttrextItem` | 关联需求自由自定义项 | `` | fd22e5f4-9778-494a-9237-105dd577daaa |
| 71 | `DemandAssociationUserdefItem` | 关联需求固定自定义项 | `` | e6216eda-2831-4756-ae8d-964fc905d581 |
| 72 | `assistChangeRateDen` | 换算率分母 | `assist_change_rateden` | Decimal |
| 73 | `assistChangeRateNum` | 换算率分子 | `assist_change_ratenum` | Decimal |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `assistUnit` | 单位 | `pc.unit.Unit` | Service |  |
| 2 | `bomId` | BOM表体ID | `ed.bom.Bom` | Service |  |
| 3 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 5 | `userDefineCharacter` | 关联需求自定义项实体 | `mr.demandassociation.DemandAssociationDCT` | None |  |
| 6 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `departmentId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 9 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 10 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 11 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 12 | `DemandAssociationAttrextItem` | 关联需求自由自定义项 | `mr.demandassociation.DemandAssociationAttrextItem` | None | true |
| 13 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 14 | `mainUom` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 15 | `freeCharacteristics` | 关联需求自由特征组实体 | `mr.demandassociation.DemandAssociationFCT` | None |  |
| 16 | `warehouseId` | 需求仓库 | `aa.warehouse.Warehouse` | Service |  |
| 17 | `DemandAssociationUserdefItem` | 关联需求固定自定义项 | `mr.demandassociation.DemandAssociationUserdefItem` | None | true |
| 18 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 19 | `stockOrgId` | 库存组织id | `aa.baseorg.OrgMV` | Service |  |
| 20 | `planParamId` | 计划参数 | `mr.planworkbench.PlanParam` | None |  |
| 21 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 22 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 23 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
