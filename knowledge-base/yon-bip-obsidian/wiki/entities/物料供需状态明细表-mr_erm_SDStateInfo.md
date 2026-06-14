---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.erm.SDStateInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料供需状态明细表 (`mr.erm.SDStateInfo`)

> MR | 物理表：`mr_sd_state_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料供需状态明细表 |
| 物理表 | `mr_sd_state_info` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:12:21.1920` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（49个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `stockOrgId` | 库存组织 | `stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `sdType` | 供需类型 | `sd_type` | mr_sd_type_enum |
| 5 | `docTypeCode` | 单据类型编码 | `doc_type_code` | String |
| 6 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `docId` | 单据ID | `doc_id` | Long |
| 8 | `docNo` | 单据号 | `doc_no` | String |
| 9 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 10 | `docLineId` | 单据行ID | `doc_line_id` | Long |
| 11 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 12 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 9740365f-a3af-4f79-9cf6-32f0af3a4572 |
| 14 | `unitId` | 主计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `assistUnitId` | 辅计量单位 | `assist_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 17 | `sdQty` | 供需原量 | `sd_qty` | Decimal |
| 18 | `balQty` | 供需余量 | `bal_qty` | Decimal |
| 19 | `consumQty` | 冲销数量 | `consum_qty` | Decimal |
| 20 | `availableQty` | 可用数量 | `available_qty` | Decimal |
| 21 | `sdDate` | 供需日期 | `sd_date` | DateTime |
| 22 | `reRangeQty` | 重排数量 | `re_range_qty` | Decimal |
| 23 | `reRangeDate` | 重排日期 | `re_range_date` | DateTime |
| 24 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 25 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 26 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 27 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 28 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 29 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 30 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 31 | `remark` | 备注 | `remark` | String |
| 32 | `priority` | 优先级 | `priority` | Decimal |
| 33 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | 41847a12-d803-45d8-ad1f-ce6d9b710626 |
| 34 | `srcDocTypeCode` | 来源单据类型编码 | `src_doc_type_code` | String |
| 35 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 36 | `srcDocId` | 来源单据ID | `src_doc_id` | Long |
| 37 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 38 | `srcDocLineId` | 来源单据行ID | `src_doc_line_id` | Long |
| 39 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | String |
| 40 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 41 | `rootDocId` | 源头单据ID | `root_doc_id` | Long |
| 42 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 43 | `rootDocLineId` | 源头单据行ID | `root_doc_line_id` | Long |
| 44 | `datasub` | 应用来源 | `datasub` | String |
| 45 | `sdStateId` | 物料供需状ID | `sd_state_id` | 001dafc8-e9fe-4557-a0bf-50a0823dccdb |
| 46 | `closeSign` | 关闭标识 | `close_sign` | Boolean |
| 47 | `pubts` | 时间戳 | `pubts` | DateTime |
| 48 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 49 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 3 | `userDefineCharacter` | 自定义项特征 | `mr.erm.SDStateInfoDCT` | None |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 7 | `assistUnitId` | 辅计量单位 | `pc.unit.Unit` | Service |  |
| 8 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 9 | `sdStateId` | 物料供需状ID | `mr.erm.SDState` | None | true |
| 10 | `freeCharacteristics` | 自由项特征组 | `mr.erm.SDStateInfoFCT` | None |  |
| 11 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 12 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 13 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 14 | `stockOrgId` | 库存组织 | `org.func.BaseOrg` | Service |  |
| 15 | `unitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 16 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
