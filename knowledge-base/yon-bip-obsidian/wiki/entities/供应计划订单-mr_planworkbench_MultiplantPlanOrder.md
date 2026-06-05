---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.MultiplantPlanOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供应计划订单 (`mr.planworkbench.MultiplantPlanOrder`)

> MR | 物理表：`mr_organize_plan_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应计划订单 |
| 物理表 | `mr_organize_plan_order` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:34.8540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d | 计划订单id |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auditDate` | 审批日期 | `auditDate` | Date |
| 2 | `auditTime` | 审批时间 | `auditTime` | DateTime |
| 3 | `auditor` | 审批人名称 | `auditor` | String |
| 4 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `demandDepartmentId` | 需求部门 | `d_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 6 | `demandWarehouseId` | 需求仓库 | `d_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `id` | 计划订单id | `id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d |
| 9 | `isRelease` | 发布标识 | `is_release` | Boolean |
| 10 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 11 | `mainReqQuantity` | 主计量需求量 | `main_req_quantity` | Decimal |
| 12 | `mainReversalQuantity` | 主计量冲销数量 | `main_reversal_qty` | Decimal |
| 13 | `organizeSupplyType` | 供应方式 | `supply_type` | String |
| 14 | `planRunTime` | 计划运行时间 | `plan_run_time` | DateTime |
| 15 | `releasePeople` | 发布人id | `release_people` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `releasePeopleName` | 发布人 | `release_people_name` | String |
| 17 | `releaseTime` | 发布时间 | `release_time` | DateTime |
| 18 | `requirementQuantity` | 需求数量 | `req_quantity` | Decimal |
| 19 | `returncount` | 退回次数 | `returncount` | Short |
| 20 | `reversalQuantity` | 冲销数量 | `reversal_qty` | Decimal |
| 21 | `supplyDepartmentId` | 供应部门 | `s_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 22 | `supplyWarehouseId` | 供应仓库 | `s_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 23 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 24 | `verifyInvOrgId` | 确认入库组织 | `vs_inv_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 25 | `verifyMainQuantity` | 确认主计量数量 | `verify_main_qty` | Decimal |
| 26 | `verifyOrganizeSupplyType` | 确认供应方式 | `vs_supply_type` | String |
| 27 | `verifyQuantity` | 确认数量 | `verify_qty` | Decimal |
| 28 | `verifyReqDate` | 确认需求日期 | `verify_req_date` | DateTime |
| 29 | `verifySupplyDepartmentId` | 确认供应部门 | `vs_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 30 | `verifySupplyOrgId` | 确认供应组织 | `vs_supply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 31 | `verifySupplyWarehouseId` | 确认供应仓库 | `vs_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 32 | `verifystate` | 审批状态 | `verifystate` | Short |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `releasePeople` | 发布人id | `base.user.User` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `demandDepartmentId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 4 | `demandWarehouseId` | 需求仓库 | `aa.warehouse.Warehouse` | Service |  |
| 5 | `verifySupplyOrgId` | 确认供应组织 | `org.func.BaseOrg` | Service |  |
| 6 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 7 | `supplyDepartmentId` | 供应部门 | `aa.baseorg.DeptMV` | Service |  |
| 8 | `verifyInvOrgId` | 确认入库组织 | `org.func.BaseOrg` | Service |  |
| 9 | `id` | 计划订单id | `mr.planworkbench.PlanOrder` | None | true |
| 10 | `supplyWarehouseId` | 供应仓库 | `aa.warehouse.Warehouse` | Service |  |
| 11 | `verifySupplyWarehouseId` | 确认供应仓库 | `aa.warehouse.Warehouse` | Service |  |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 13 | `verifySupplyDepartmentId` | 确认供应部门 | `aa.baseorg.DeptMV` | Service |  |
