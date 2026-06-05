---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.erm.RealtimeSDInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 实时供需明细表 (`mr.erm.RealtimeSDInfo`)

> MR | 物理表：`mr_realtime_sd_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 实时供需明细表 |
| 物理表 | `mr_realtime_sd_info` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:42.2160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（48个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `stockOrgId` | 库存组织 | `stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `sdType` | 供需类型 | `sd_type` | mr_sd_type_enum |
| 5 | `docTypeCode` | 单据类型编码 | `doc_type_code` | String |
| 6 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `docNo` | 单据号 | `doc_no` | String |
| 8 | `docId` | 单据ID | `doc_id` | Long |
| 9 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 10 | `docLineId` | 单据行ID | `doc_line_id` | Long |
| 11 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 12 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | d9e21d28-68a3-4569-9542-d59686460e13 |
| 14 | `unitId` | 主计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `assistUnitId` | 辅计量单位 | `assist_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 17 | `sdQty` | 供需原量 | `sd_qty` | Decimal |
| 18 | `balQty` | 供需余量 | `bal_qty` | Decimal |
| 19 | `consumQty` | 冲销数量 | `consum_qty` | Decimal |
| 20 | `sdDate` | 供需日期 | `sd_date` | DateTime |
| 21 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 22 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 23 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 24 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 25 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 26 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 27 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 28 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 29 | `userDefineCharacter` | 自定义项特征实体 | `user_define_character` | 78c8c093-7004-42b3-9eb9-73bba5a0ce29 |
| 30 | `remark` | 备注 | `remark` | String |
| 31 | `srcDocTypeCode` | 来源单据类型编码 | `src_doc_type_code` | String |
| 32 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 33 | `srcDocId` | 来源单据ID | `src_doc_id` | Long |
| 34 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 35 | `srcDocLineId` | 来源单据行ID | `src_doc_line_id` | Long |
| 36 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | String |
| 37 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 38 | `rootDocId` | 源头单据ID | `root_doc_id` | Long |
| 39 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 40 | `rootDocLineId` | 源头单据行ID | `root_doc_line_id` | Long |
| 41 | `closeSign` | 关闭标识 | `close_sign` | Boolean |
| 42 | `datasub` | 应用来源 | `datasub` | String |
| 43 | `pubts` | 时间戳 | `pubts` | DateTime |
| 44 | `bomComponentId` | bom子件ID | `bom_component_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 45 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 46 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 47 | `dataType` | 数据类型 | `data_type` | String |
| 48 | `rollingDetailId` | 滚动计划明细ID | `rolling_detail_id` | 53b04213-a389-4d6c-b628-8173a527565c |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 3 | `userDefineCharacter` | 自定义项特征实体 | `mr.erm.RealtimeSDInfoDCT` | None |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `bomComponentId` | bom子件ID | `ed.bom.BomComponent` | Service |  |
| 7 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 8 | `assistUnitId` | 辅计量单位 | `pc.unit.Unit` | Service |  |
| 9 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 10 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 11 | `rollingDetailId` | 滚动计划明细ID | `mr.plan.RollingDetail` | None |  |
| 12 | `freeCharacteristics` | 自由项特征组 | `mr.erm.RealtimeSDInfoFCT` | None |  |
| 13 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 14 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 15 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 16 | `stockOrgId` | 库存组织 | `org.func.BaseOrg` | Service |  |
| 17 | `unitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 18 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
