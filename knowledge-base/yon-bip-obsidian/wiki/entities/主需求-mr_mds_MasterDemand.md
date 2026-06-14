---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.mds.MasterDemand"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 主需求 (`mr.mds.MasterDemand`)

> MR | 物理表：`mr_mds_master_demand`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 主需求 |
| 物理表 | `mr_mds_master_demand` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:46.5930` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（96个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 2 | `adjMainReqQty` | 调整后主计量需求原量 | `adj_main_req_qty` | Decimal |
| 3 | `adjPriority` | 调整后优先级 | `adj_priority` | Long |
| 4 | `adjRemainMainReqQty` | 调整后主计量需求余量 | `adj_remain_main_req_qty` | Decimal |
| 5 | `adjRemainReqQty` | 调整后需求余量 | `adj_remain_req_qty` | Decimal |
| 6 | `adjReqDate` | 调整后需求日期 | `adj_req_date` | Date |
| 7 | `adjReqQty` | 调整后需求原量 | `adj_req_qty` | Decimal |
| 8 | `auditDate` | 审批日期 | `audit_date` | Date |
| 9 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 10 | `auditor` | 审批人名称 | `auditor` | String |
| 11 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `bomId` | BOM | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 13 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 14 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 15 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 16 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 17 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 18 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 19 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 20 | `closer` | 关闭人名称 | `closer` | String |
| 21 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `code` | 编码 | `code` | String |
| 23 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 24 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 25 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 26 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 27 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 28 | `coverQty` | 主计量冲销数量 | `cover_qty` | Decimal |
| 29 | `createDate` | 创建日期 | `create_date` | Date |
| 30 | `createTime` | 创建时间 | `create_time` | DateTime |
| 31 | `creator` | 创建人名称 | `creator` | String |
| 32 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 34 | `deliveryPlanId` | 发货行ID | `delivery_plan_id` | Long |
| 35 | `dr` | 逻辑删除标记 | `dr` | Short |
| 36 | `entrustedType` | 受托加工类型 | `entrusted_type` | entrustedTypeEnum |
| 37 | `firstSourceCode` | 源头单据号 | `first_source_code` | String |
| 38 | `firstSourceId` | 源头单据id | `first_source_id` | Long |
| 39 | `firstSourceLine` | 源头单据行号 | `first_source_line` | Decimal |
| 40 | `firstSourceLineId` | 源头单据行id | `first_source_line_id` | Long |
| 41 | `firstSourceType` | 源头单据类型 | `first_source_type` | String |
| 42 | `freeCharacteristics` | 主需求自由项特征组 | `md_fct` | 04fd4d63-2b40-4b28-94d5-24ebca3276b3 |
| 43 | `id` | ID | `id` | Long |
| 44 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 45 | `mainReqQty` | 主计量需求原量 | `main_req_qty` | Decimal |
| 46 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 47 | `mergeToOrderId` | 合并后的订单id | `merge_to_order_id` | Long |
| 48 | `modifier` | 修改人名称 | `modifier` | String |
| 49 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 50 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 51 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 52 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 53 | `originId` | 原行id | `origin_id` | Long |
| 54 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 55 | `planProperty` | 计划属性 | `plan_property` | PlanPropertyEnum |
| 56 | `priority` | 优先级 | `priority` | Long |
| 57 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 58 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 59 | `pubts` | 时间戳 | `pubts` | DateTime |
| 60 | `recentPlanParamId` | 最近一次计划运算名称 | `recent_plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 61 | `remainMainReqQty` | 主计量需求余量 | `remain_main_req_qty` | Decimal |
| 62 | `remainReqQty` | 需求余量 | `remain_req_qty` | Decimal |
| 63 | `remark` | 备注 | `remark` | String |
| 64 | `reqDate` | 需求日期 | `req_date` | Date |
| 65 | `reqDepartmentId` | 需求部门 | `req_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 66 | `reqOrgId` | 需求组织 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 67 | `reqQty` | 需求原量 | `req_qty` | Decimal |
| 68 | `reqWarehouseId` | 需求仓库 | `req_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 69 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 70 | `returncount` | 退回次数 | `returncount` | Short |
| 71 | `reversalQty` | 冲销数量 | `reversal_qty` | Decimal |
| 72 | `roughAbilityStatus` | 粗能力状态 | `rough_ability_status` | Short |
| 73 | `runStatus` | 运算状态 | `run_status` | RunPlanstatus |
| 74 | `scheduleStatus` | 排产状态 | `schedule_status` | Short |
| 75 | `sendQty` | 出库量 | `send_qty` | Decimal |
| 76 | `sourceClosed` | 来源单据关闭标识 | `source_closed` | Boolean |
| 77 | `sourceCode` | 来源单据号 | `source_code` | String |
| 78 | `sourceId` | 来源单据id | `source_id` | Long |
| 79 | `sourceLine` | 来源单据行号 | `source_line` | Decimal |
| 80 | `sourceLineId` | 来源单据行id | `source_line_id` | Long |
| 81 | `sourceType` | 来源单据类型 | `source_type` | String |
| 82 | `specialReqType` | 特殊需求类型 | `special_req_type` | specialReqTypeEnum |
| 83 | `status` | 单据状态 | `status` | Short |
| 84 | `supplyOrgId` | 供应组织 | `supply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 85 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 86 | `tplid` | 模板id | `tplid` | Long |
| 87 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 88 | `unitId` | 单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 89 | `userDefineCharacter` | 主需求自定义项实体 | `md_dct` | a82b934a-44d7-4321-adf9-7b851a68d01d |
| 90 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 91 | `verifystate` | 审批状态 | `verifystate` | Short |
| 92 | `versionId` | 主需求计划版本 | `version_id` | bc3e8b64-090b-403a-b32f-42cb0efa5b2c |
| 93 | `vouchDate` | 单据日期 | `vouchdate` | Date |
| 94 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 95 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 96 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（28个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 2 | `userDefineCharacter` | 主需求自定义项实体 | `mr.mds.MasterDemandDCT` | None |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 9 | `reqWarehouseId` | 需求仓库 | `aa.warehouse.Warehouse` | Service |  |
| 10 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 11 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 12 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `unitId` | 单位 | `pc.unit.Unit` | Service |  |
| 14 | `supplyOrgId` | 供应组织 | `org.func.BaseOrg` | Service |  |
| 15 | `reqOrgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 17 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 18 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 19 | `bomId` | BOM | `ed.bom.Bom` | Service |  |
| 20 | `recentPlanParamId` | 最近一次计划运算名称 | `mr.planworkbench.PlanParam` | None |  |
| 21 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 22 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 23 | `reqDepartmentId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 24 | `versionId` | 主需求计划版本 | `mr.planscheme.Version` | None |  |
| 25 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 26 | `freeCharacteristics` | 主需求自由项特征组 | `mr.mds.MasterDemandFCT` | None |  |
| 27 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 28 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
