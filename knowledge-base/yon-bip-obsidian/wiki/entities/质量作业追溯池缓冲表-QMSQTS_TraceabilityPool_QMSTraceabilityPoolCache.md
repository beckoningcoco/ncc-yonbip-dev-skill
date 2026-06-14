---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.QMSTraceabilityPoolCache"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质量作业追溯池缓冲表 (`QMSQTS.TraceabilityPool.QMSTraceabilityPoolCache`)

> QMSQTS | 物理表：`qms_qts_q_tracepool_cache`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质量作业追溯池缓冲表 |
| 物理表 | `qms_qts_q_tracepool_cache` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:19.9410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（101个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `actualCheckDays` | 实际检验天数 | `actual_check_days` | Decimal |
| 2 | `actualCheckEndDate` | 实际检验结束日期 | `actual_check_end_date` | DateTime |
| 3 | `afterPassStockStatus` | 放行后库存状态 | `after_pass_stock_status` | String |
| 4 | `amount` | 数量 | `amount` | Decimal |
| 5 | `applicantID` | 申请人ID | `applicant_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 6 | `applyDeptID` | 申请部门ID | `apply_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 7 | `applyOrgID` | 申请组织ID | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 8 | `applyReason` | 申请原因 | `apply_reason` | String |
| 9 | `autoFreezeStatus` | 自动冻结库存 | `auto_freeze_status` | String |
| 10 | `batchID` | 批次ID | `batch_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 11 | `batchNumber` | 批次号 | `batch_number` | String |
| 12 | `bid` | 业务对象ID | `bid` | 2e25ded4-5884-48a9-a0a8-6906c0747956 |
| 13 | `billID` | 单据ID | `bill_id` | Long |
| 14 | `billRowID` | 单据行ID | `bill_row_id` | Long |
| 15 | `billType` | 单据类型 | `bill_type` | String |
| 16 | `businessDate` | 业务日期 | `business_date` | DateTime |
| 17 | `cgwwOrgID` | 采购组织或委外组织ID | `cgww_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 18 | `checkCount` | 请检件数 | `check_count` | Decimal |
| 19 | `checkDeptID` | 检验部门ID | `check_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 20 | `checkOrgID` | 质检组织ID | `check_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 21 | `checkPlanDetailID` | 检验方案主表ID | `check_plan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 22 | `checkPlanID` | 检验方案ID | `check_plan_id` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 23 | `checkPlanVersion` | 检验方案版本 | `check_plan_version` | String |
| 24 | `checkRule` | 检验规则 | `check_rule` | String |
| 25 | `checkStepConfigID` | 检验步骤配置ID | `check_step_config_id` | d793bf8a-3e9f-444b-a8ac-5f95511b2a46 |
| 26 | `createDate` | 创建日期 | `create_date` | Date |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `creator` | 创建人名称 | `creator` | String |
| 29 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `customerID` | 客户ID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 31 | `destroySampleBearer` | 破坏样本承担方 | `destroy_sample_bearer` | Integer |
| 32 | `destroySampleMethod` | 破坏样本处理方式 | `destroy_sample_method` | Integer |
| 33 | `destroySampleNum` | 样本破坏数量 | `destroy_sample_num` | Decimal |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short |
| 35 | `freeCT` | 自由项特征组 | `free_ct` | 935d0a03-6116-4cf1-bbd3-f5c1dce4e677 |
| 36 | `id` | id | `id` | Long |
| 37 | `inspectCount` | 检验件数 | `inspect_count` | Decimal |
| 38 | `inspectRate` | 质检换算率 | `inspect_rate` | String |
| 39 | `inspectResult` | 检验结果 | `inspect_result` | String |
| 40 | `inspectSourceOrderID` | 请检来源单据ID | `inspect_source_order_id` | String |
| 41 | `inspectSourceOrderNum` | 请检来源单据号 | `inspect_source_order_num` | String |
| 42 | `inspectSourceOrderRowID` | 请检来源单据行ID | `inspect_source_order_row_id` | String |
| 43 | `inspectSourceOrderRowNum` | 请检来源单据行号 | `inspect_source_order_row_num` | String |
| 44 | `inspectSourceOrderType` | 请检来源单据类型 | `inspect_source_order_type` | String |
| 45 | `inspectStockStatus` | 质检库存状态 | `inspect_stock_status` | String |
| 46 | `inspectType` | 检验类型 | `inspect_type` | String |
| 47 | `inspectUnitID` | 检验单位ID | `inspect_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 48 | `inspectorID` | 检验员ID | `inspector_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 49 | `mergeCheck` | 合并检验 | `merge_check` | Integer |
| 50 | `modifier` | 修改人名称 | `modifier` | String |
| 51 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 52 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 53 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 54 | `oddNumber` | 单号 | `odd_number` | String |
| 55 | `originOrderID` | 源头订单ID | `origin_order_id` | String |
| 56 | `originOrderNum` | 源头订单号 | `origin_order_num` | String |
| 57 | `originOrderRowID` | 源头订单行ID | `origin_order_row_id` | String |
| 58 | `originOrderRowNum` | 源头订单行号 | `origin_order_row_num` | String |
| 59 | `originOrderType` | 源头订单类型 | `origin_order_type` | String |
| 60 | `planCheckDays` | 计划检验天数 | `plan_check_days` | Decimal |
| 61 | `planCheckEndDate` | 计划检验结束日期 | `plan_check_end_date` | DateTime |
| 62 | `processID` | 工序ID | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 63 | `processOrder` | 工序顺序号 | `process_order` | Decimal |
| 64 | `productID` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 65 | `productionDeptID` | 生产部门ID | `production_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 66 | `pubts` | 时间戳 | `pubts` | DateTime |
| 67 | `qualifiedCount` | 合格数量 | `qualified_count` | Decimal |
| 68 | `qualifiedNumber` | 合格件数 | `qualified_number` | Decimal |
| 69 | `qualifiedRate` | 合格率 | `qualified_rate` | Decimal |
| 70 | `recheck` | 复检 | `recheck` | Integer |
| 71 | `repositoryID` | 仓库ID | `repository_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 72 | `repositoryNumber` | 货位 | `repository_number` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 73 | `rowNumber` | 行号 | `row_number` | Decimal |
| 74 | `salesDeptID` | 销售部门ID | `sales_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 75 | `salesOrgID` | 销售组织ID | `sales_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 76 | `sampleQualifiedNumber` | 样本合格件数 | `sample_qualified_number` | Decimal |
| 77 | `sampleUnqualifiedNumber` | 样本不合格件数 | `sample_unqualified_number` | Decimal |
| 78 | `serialNumber` | 序列号 | `serial_number` | String |
| 79 | `sourceBillID` | 来源单据ID | `source_bill_id` | Long |
| 80 | `sourceBillNum` | 来源单据号 | `source_bill_num` | String |
| 81 | `sourceBillRowID` | 来源单据行ID | `source_bill_row_id` | Long |
| 82 | `sourceBillRowNum` | 来源单据行号 | `source_bill_row_num` | String |
| 83 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 84 | `sourceOrderID` | 来源订单ID | `source_order_id` | String |
| 85 | `sourceOrderNum` | 来源订单号 | `source_order_num` | String |
| 86 | `sourceOrderRowID` | 来源订单行ID | `source_order_row_id` | String |
| 87 | `sourceOrderRowNum` | 来源订单行号 | `source_order_row_num` | String |
| 88 | `sourceOrderType` | 来源订单类型 | `source_order_type` | String |
| 89 | `stockCount` | 库存件数 | `stock_count` | Decimal |
| 90 | `stockRate` | 库存换算率 | `stock_rate` | Decimal |
| 91 | `stockStatus` | 库存状态 | `stock_status` | String |
| 92 | `stockUnitID` | 库存单位ID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 93 | `supplierID` | 供应商或委外商ID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 94 | `thisOneCheckNum` | 本单抽检数量 | `this_one_check_num` | Decimal |
| 95 | `thisOneSampleNum` | 本单抽检件数 | `this_one_sample_num` | Decimal |
| 96 | `transType` | 交易类型 | `trans_type` | Long |
| 97 | `unitID` | 计量单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 98 | `unqualifiedCount` | 不合格数量 | `unqualified_count` | Decimal |
| 99 | `unqualifiedNumber` | 不合格件数 | `unqualified_number` | Decimal |
| 100 | `workCenterID` | 工作中心ID | `work_center` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 101 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（29个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `applyOrgID` | 申请组织ID | `org.func.BaseOrg` | Service |  |
| 2 | `productID` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `checkStepConfigID` | 检验步骤配置ID | `QMSQIT.inspectionstepconfig.InspectionStepConfig` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `productionDeptID` | 生产部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 7 | `checkPlanID` | 检验方案ID | `QMSDFM.inspectionPlan.inspectionPlan` | None |  |
| 8 | `repositoryID` | 仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 9 | `freeCT` | 自由项特征组 | `QMSQTS.TraceabilityPool.QMSTraceabilityPoolFreeCT` | None |  |
| 10 | `salesOrgID` | 销售组织ID | `org.func.BaseOrg` | Service |  |
| 11 | `stockUnitID` | 库存单位ID | `pc.unit.Unit` | Service |  |
| 12 | `supplierID` | 供应商或委外商ID | `aa.vendor.Vendor` | Service |  |
| 13 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 14 | `checkDeptID` | 检验部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 15 | `inspectorID` | 检验员ID | `bd.staff.Staff` | Service |  |
| 16 | `batchID` | 批次ID | `st.batchno.Batchno` | Service |  |
| 17 | `cgwwOrgID` | 采购组织或委外组织ID | `org.func.PurchaseOrg` | Service |  |
| 18 | `checkOrgID` | 质检组织ID | `org.func.BaseOrg` | Service |  |
| 19 | `inspectUnitID` | 检验单位ID | `pc.unit.Unit` | Service |  |
| 20 | `repositoryNumber` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 21 | `salesDeptID` | 销售部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 22 | `processID` | 工序ID | `ed.operation.Operation` | Service |  |
| 23 | `applyDeptID` | 申请部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 24 | `workCenterID` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 25 | `customerID` | 客户ID | `aa.merchant.Merchant` | Service |  |
| 26 | `unitID` | 计量单位ID | `pc.unit.Unit` | Service |  |
| 27 | `checkPlanDetailID` | 检验方案主表ID | `QMSDFM.inspectionPlan.inspectionPlanDetail` | None |  |
| 28 | `applicantID` | 申请人ID | `bd.staff.Staff` | Service |  |
| 29 | `bid` | 业务对象ID | `QMSQTS.TraceabilityPool.QMSTraceabilityPool` | None | true |
