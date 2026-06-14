---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.MrpReset"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 重排建议表 (`mr.planworkbench.MrpReset`)

> MR | 物理表：`mr_mrp_reset`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 重排建议表 |
| 物理表 | `mr_mrp_reset` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:49.9500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（56个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 6 | `docId` | 单据 | `doc_id` | Long |
| 7 | `docLineId` | 单据行 | `doc_line_id` | Long |
| 8 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 9 | `docNo` | 单据号 | `doc_no` | String |
| 10 | `docOrg` | 供需组织 | `doc_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 11 | `docQty` | 单据数量 | `doc_qty` | Decimal |
| 12 | `docType` | 单据类型 | `doc_type` | String |
| 13 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 14 | `executeChangeDate` | 执行变更日期 | `execute_change_date` | DateTime |
| 15 | `executeChangeQty` | 执行变更数量 | `execute_change_qty` | Decimal |
| 16 | `executeChangeType` | 执行变更类型 | `execute_change_type` | String |
| 17 | `executeResult` | 执行结果说明 | `execute_result` | String |
| 18 | `executeState` | 执行状态 | `execute_state` | ExecuteStateEnum |
| 19 | `executeTime` | 执行时间 | `execute_time` | DateTime |
| 20 | `executeUser` | 执行人 | `execute_user` | String |
| 21 | `executeUserID` | 执行人ID | `execute_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `failureReason` | 执行失败原因 | `failure_reason` | String |
| 23 | `id` | ID | `id` | Long |
| 24 | `impactType` | 影响类型 | `impact_type` | String |
| 25 | `mainUnit` | 主计量单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 26 | `materialId` | 制造物料 | `material_id` | Long |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 31 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 32 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 33 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 34 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 35 | `productId` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime |
| 37 | `remark` | 备注 | `remark` | String |
| 38 | `reserveid` | 跟踪线索ID | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 39 | `resetDate` | 建议日期 | `reset_date` | DateTime |
| 40 | `resetDateType` | 日期建议类型 | `reset_date_type` | ResetTypeDateEnum |
| 41 | `resetQty` | 建议数量 | `reset_qty` | Decimal |
| 42 | `resetQuantityType` | 数量建议类型 | `reset_quantity_type` | ResetTypeQtyEnum |
| 43 | `rootDocDate` | 源头单据日期 | `root_doc_date` | DateTime |
| 44 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 45 | `rootDocLineId` | 源头单据行 | `root_doc_line_id` | Long |
| 46 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 47 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 48 | `rootDocOrgId` | 源头单据组织 | `root_doc_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 49 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | DocTypeEnum |
| 50 | `sdInfoId` | 供需明细信息 | `sd_info_id` | dde99445-beaa-46b6-af8f-0f18e24f04f7 |
| 51 | `sdType` | 供需类型 | `sd_type` | SDTypeEnum |
| 52 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 53 | `suggestReserveid` | 建议跟踪线索ID | `suggest_reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 54 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 55 | `warehouseID` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 56 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 2 | `docOrg` | 供需组织 | `org.func.BaseOrg` | Service |  |
| 3 | `productId` | product | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 跟踪线索ID | `st.reservation.Reservation` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `rootDocOrgId` | 源头单据组织 | `org.func.BaseOrg` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 10 | `suggestReserveid` | 建议跟踪线索ID | `st.reservation.Reservation` | Service |  |
| 11 | `warehouseID` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 12 | `executeUserID` | 执行人ID | `base.user.User` | Service |  |
| 13 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 14 | `sdInfoId` | 供需明细信息 | `mr.planworkbench.SDInfo` | None |  |
| 15 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
