---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.WorkshopTraceabilityPool"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 车间作业追溯池 (`QMSQTS.TraceabilityPool.WorkshopTraceabilityPool`)

> QMSQTS | 物理表：`qms_qts_c_tracepool`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 车间作业追溯池 |
| 物理表 | `qms_qts_c_tracepool` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:24.0180` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（80个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `WorkshopTraceabilityPoolSNList` | 车间作业追溯池序列号子表 | `` | fdc165bd-a235-41d7-8b39-e174adaaee47 |
| 2 | `accBackQ` | 累计退回数量 | `acc_back_q` | Decimal |
| 3 | `accExecuteQ` | 累计执行数量 | `acc_execute_q` | Decimal |
| 4 | `accFinishQ` | 累计完成数量 | `acc_finish_q` | Decimal |
| 5 | `accInQ` | 累计转入数量 | `acc_in_q` | Decimal |
| 6 | `accOutQ` | 累计转出数量 | `acc_out_q` | Decimal |
| 7 | `accOuterAssignQ` | 累计外协分派数量 | `acc_outer_assign_q` | Decimal |
| 8 | `accOuterBackQ` | 累计外发收回数量 | `acc_outer_back_q` | Decimal |
| 9 | `accOuterPassQ` | 累计外协合格数量 | `acc_outer_pass_q` | Decimal |
| 10 | `accOuterRetryQ` | 累计外协代返工数量 | `acc_outer_retry_q` | Decimal |
| 11 | `accOuterReturnQ` | 累计外协转自返数量 | `acc_outer_return_q` | Decimal |
| 12 | `accOuterScrapQ` | 累计外协报废数量 | `acc_outer_scrap_q` | Decimal |
| 13 | `accPassOutQ` | 累计合格转出数量 | `acc_pass_out_q` | Decimal |
| 14 | `accPassQ` | 累计合格数量 | `acc_pass_q` | Decimal |
| 15 | `accRetryOutQ` | 累计返工转出数量 | `acc_retry_out_q` | Decimal |
| 16 | `accRetryQ` | 累计返工处理数量 | `acc_retry_q` | Decimal |
| 17 | `accScrapOutQ` | 累计报废转出数量 | `acc_scrap_out_q` | Decimal |
| 18 | `accScrapQ` | 累计报废数量 | `acc_scrap_q` | Decimal |
| 19 | `accToOuterQ` | 累计转外发数量 | `acc_to_outer_q` | Decimal |
| 20 | `accToRetryQ` | 累计待返工数量 | `acc_to_retry_q` | Decimal |
| 21 | `actualEndTime` | 实际完工时间 | `actual_end_time` | DateTime |
| 22 | `actualStartTime` | 实际开工时间 | `actual_start_time` | DateTime |
| 23 | `batchID` | 批次ID | `batch_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 24 | `batchNumber` | 批次号 | `batch_number` | String |
| 25 | `billDate` | 单据日期 | `bill_date` | DateTime |
| 26 | `billID` | 单据ID | `bill_id` | Long |
| 27 | `billRowID` | 单据行ID | `bill_row_id` | Long |
| 28 | `billType` | 单据类型 | `bill_type` | String |
| 29 | `createDate` | 创建日期 | `create_date` | Date |
| 30 | `createTime` | 创建时间 | `create_time` | DateTime |
| 31 | `creator` | 创建人名称 | `creator` | String |
| 32 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `deviceID` | 设备ID | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short |
| 35 | `id` | ID | `id` | Long |
| 36 | `isClose` | 关闭 | `is_close` | Short |
| 37 | `isHold` | 挂起 | `is_hold` | Short |
| 38 | `isSubClose` | 子关闭 | `is_sub_close` | Short |
| 39 | `mainUnitID` | 主计量单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 40 | `memberID` | 人员ID | `member_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 41 | `modifier` | 修改人名称 | `modifier` | String |
| 42 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 43 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 44 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 45 | `oddNumber` | 单号 | `odd_number` | String |
| 46 | `osmReachQ` | 委外下达数量 | `osm_reach_q` | Decimal |
| 47 | `outputUnitID` | 产出单位 | `output_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 48 | `passInStockQ` | 合格在制入库数量 | `pass_in_stock_q` | Decimal |
| 49 | `planEndTime` | 计划完工时间 | `plan_end_time` | DateTime |
| 50 | `planProcessQ` | 计划加工数量 | `plan_process_q` | Decimal |
| 51 | `planStartTime` | 计划开工时间 | `plan_start_time` | DateTime |
| 52 | `predictOutputQ` | 预计产出数量 | `predict_output_q` | Decimal |
| 53 | `processCount` | 加工件数 | `process_count` | Decimal |
| 54 | `processID` | 工序ID | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 55 | `processNumber` | 加工数量 | `process_number` | Decimal |
| 56 | `processOrder` | 工序顺序号 | `process_order` | Decimal |
| 57 | `processSubUnitID` | 子表生产单位ID | `process_sub_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 58 | `processType` | 加工类型 | `process_type` | Integer |
| 59 | `processUnitID` | 生产单位ID | `process_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 60 | `productDeptID` | 生产部门ID | `product_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 61 | `productID` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 62 | `productOrgID` | 生产组织ID | `product_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 63 | `pubts` | 时间戳 | `pubts` | DateTime |
| 64 | `shiftID` | 班次ID | `shift_id` | String |
| 65 | `sourceBillID` | 来源单据ID | `source_bill_id` | Long |
| 66 | `sourceBillNum` | 来源单据号 | `source_bill_num` | String |
| 67 | `sourceBillRowID` | 来源单据行ID | `source_bill_row_id` | Long |
| 68 | `sourceBillRowNum` | 来源单据行号 | `source_bill_row_num` | String |
| 69 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 70 | `splitInQ` | 分割转入数量 | `split_in_q` | Decimal |
| 71 | `splitOutQ` | 分割转出数量 | `split_out_q` | Decimal |
| 72 | `stockOrgID` | 库存组织ID | `stock_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 73 | `teamGroupID` | 班组ID | `team_group_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 74 | `toOSMApplyQ` | 转委外申请数量 | `to_osm_apply_q` | Decimal |
| 75 | `toOSMOrderQ` | 转委外订单数量 | `to_osm_order_q` | Decimal |
| 76 | `transType` | 交易类型 | `trans_type` | String |
| 77 | `unitRateForO` | 产出主计量换算率 | `unit_rate_for_o` | Decimal |
| 78 | `unitRateForP` | 生产主计量换算率 | `unit_rate_for_p` | Decimal |
| 79 | `workCenterID` | 工作中心ID | `work_center` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 80 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（18个）

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
| 15 | `WorkshopTraceabilityPoolSNList` | 车间作业追溯池序列号子表 | `QMSQTS.TraceabilityPool.WorkshopTraceabilityPoolSN` | None | true |
| 16 | `stockOrgID` | 库存组织ID | `org.func.InventoryOrg` | Service |  |
| 17 | `mainUnitID` | 主计量单位ID | `pc.unit.Unit` | Service |  |
| 18 | `memberID` | 人员ID | `bd.staff.Staff` | Service |  |
