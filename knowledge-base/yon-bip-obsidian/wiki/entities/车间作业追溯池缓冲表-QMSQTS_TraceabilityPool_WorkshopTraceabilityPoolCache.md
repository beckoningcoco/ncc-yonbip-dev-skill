---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.WorkshopTraceabilityPoolCache"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 车间作业追溯池缓冲表 (`QMSQTS.TraceabilityPool.WorkshopTraceabilityPoolCache`)

> QMSQTS | 物理表：`qms_qts_c_tracepool_cache`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 车间作业追溯池缓冲表 |
| 物理表 | `qms_qts_c_tracepool_cache` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:00:47.2950` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（79个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `accBackQ` | 累计退回数量 | `acc_back_q` | Decimal |
| 2 | `accExecuteQ` | 累计执行数量 | `acc_execute_q` | Decimal |
| 3 | `accFinishQ` | 累计完成数量 | `acc_finish_q` | Decimal |
| 4 | `accInQ` | 累计转入数量 | `acc_in_q` | Decimal |
| 5 | `accOutQ` | 累计转出数量 | `acc_out_q` | Decimal |
| 6 | `accOuterAssignQ` | 累计外协分派数量 | `acc_outer_assign_q` | Decimal |
| 7 | `accOuterBackQ` | 累计外发收回数量 | `acc_outer_back_q` | Decimal |
| 8 | `accOuterPassQ` | 累计外协合格数量 | `acc_outer_pass_q` | Decimal |
| 9 | `accOuterRetryQ` | 累计外协代返工数量 | `acc_outer_retry_q` | Decimal |
| 10 | `accOuterReturnQ` | 累计外协转自返数量 | `acc_outer_return_q` | Decimal |
| 11 | `accOuterScrapQ` | 累计外协报废数量 | `acc_outer_scrap_q` | Decimal |
| 12 | `accPassOutQ` | 累计合格转出数量 | `acc_pass_out_q` | Decimal |
| 13 | `accPassQ` | 累计合格数量 | `acc_pass_q` | Decimal |
| 14 | `accRetryOutQ` | 累计返工转出数量 | `acc_retry_out_q` | Decimal |
| 15 | `accRetryQ` | 累计返工处理数量 | `acc_retry_q` | Decimal |
| 16 | `accScrapOutQ` | 累计报废转出数量 | `acc_scrap_out_q` | Decimal |
| 17 | `accScrapQ` | 累计报废数量 | `acc_scrap_q` | Decimal |
| 18 | `accToOuterQ` | 累计转外发数量 | `acc_to_outer_q` | Decimal |
| 19 | `accToRetryQ` | 累计待返工数量 | `acc_to_retry_q` | Decimal |
| 20 | `actualEndTime` | 实际完工时间 | `actual_end_time` | DateTime |
| 21 | `actualStartTime` | 实际开工时间 | `actual_start_time` | DateTime |
| 22 | `batchID` | 批次ID | `batch_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 23 | `batchNumber` | 批次号 | `batch_number` | String |
| 24 | `billDate` | 单据日期 | `bill_date` | DateTime |
| 25 | `billID` | 单据ID | `bill_id` | Long |
| 26 | `billRowID` | 单据行ID | `bill_row_id` | Long |
| 27 | `billType` | 单据类型 | `bill_type` | String |
| 28 | `createDate` | 创建日期 | `create_date` | Date |
| 29 | `createTime` | 创建时间 | `create_time` | DateTime |
| 30 | `creator` | 创建人名称 | `creator` | String |
| 31 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 32 | `deviceID` | 设备ID | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 33 | `dr` | 逻辑删除标记 | `dr` | Short |
| 34 | `id` | ID | `id` | Long |
| 35 | `isClose` | 关闭 | `is_close` | Short |
| 36 | `isHold` | 挂起 | `is_hold` | Short |
| 37 | `isSubClose` | 子关闭 | `is_sub_close` | Short |
| 38 | `mainUnitID` | 主计量单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 39 | `memberID` | 人员ID | `member_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 40 | `modifier` | 修改人名称 | `modifier` | String |
| 41 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 42 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 43 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 44 | `oddNumber` | 单号 | `odd_number` | String |
| 45 | `osmReachQ` | 委外下达数量 | `osm_reach_q` | Decimal |
| 46 | `outputUnitID` | 产出单位 | `output_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 47 | `passInStockQ` | 合格在制入库数量 | `pass_in_stock_q` | Decimal |
| 48 | `planEndTime` | 计划完工时间 | `plan_end_time` | DateTime |
| 49 | `planProcessQ` | 计划加工数量 | `plan_process_q` | Decimal |
| 50 | `planStartTime` | 计划开工时间 | `plan_start_time` | DateTime |
| 51 | `predictOutputQ` | 预计产出数量 | `predict_output_q` | Decimal |
| 52 | `processCount` | 加工件数 | `process_count` | Decimal |
| 53 | `processID` | 工序ID | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 54 | `processNumber` | 加工数量 | `process_number` | Decimal |
| 55 | `processOrder` | 工序顺序号 | `process_order` | Decimal |
| 56 | `processSubUnitID` | 子表生产单位ID | `process_sub_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 57 | `processType` | 加工类型 | `process_type` | Integer |
| 58 | `processUnitID` | 生产单位ID | `process_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 59 | `productDeptID` | 生产部门ID | `product_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 60 | `productID` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 61 | `productOrgID` | 生产组织ID | `product_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 62 | `pubts` | 时间戳 | `pubts` | DateTime |
| 63 | `shiftID` | 班次ID | `shift_id` | String |
| 64 | `sourceBillID` | 来源单据ID | `source_bill_id` | Long |
| 65 | `sourceBillNum` | 来源单据号 | `source_bill_num` | String |
| 66 | `sourceBillRowID` | 来源单据行ID | `source_bill_row_id` | Long |
| 67 | `sourceBillRowNum` | 来源单据行号 | `source_bill_row_num` | String |
| 68 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 69 | `splitInQ` | 分割转入数量 | `split_in_q` | Decimal |
| 70 | `splitOutQ` | 分割转出数量 | `split_out_q` | Decimal |
| 71 | `stockOrgID` | 库存组织ID | `stock_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 72 | `teamGroupID` | 班组ID | `team_group_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 73 | `toOSMApplyQ` | 转委外申请数量 | `to_osm_apply_q` | Decimal |
| 74 | `toOSMOrderQ` | 转委外订单数量 | `to_osm_order_q` | Decimal |
| 75 | `transType` | 交易类型 | `trans_type` | String |
| 76 | `unitRateForO` | 产出主计量换算率 | `unit_rate_for_o` | Decimal |
| 77 | `unitRateForP` | 生产主计量换算率 | `unit_rate_for_p` | Decimal |
| 78 | `workCenterID` | 工作中心ID | `work_center` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 79 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `teamGroupID` | 班组ID | `bd.timemodel.TeamDefinition` | Service |  |
| 2 | `processSubUnitID` | 子表生产单位ID | `pc.unit.Unit` | Service |  |
| 3 | `productID` | 物料ID | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `productOrgID` | 生产组织ID | `org.func.BaseOrg` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `batchID` | 批次ID | `st.batchno.Batchno` | Service |  |
| 9 | `outputUnitID` | 产出单位 | `pc.unit.Unit` | Service |  |
| 10 | `productDeptID` | 生产部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 11 | `deviceID` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 12 | `processUnitID` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 13 | `processID` | 工序ID | `ed.operation.Operation` | Service |  |
| 14 | `workCenterID` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 15 | `stockOrgID` | 库存组织ID | `org.func.InventoryOrg` | Service |  |
| 16 | `mainUnitID` | 主计量单位ID | `pc.unit.Unit` | Service |  |
| 17 | `memberID` | 人员ID | `bd.staff.Staff` | Service |  |
