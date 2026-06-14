---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.FinishTraceabilityPool"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 完工到货追溯池 (`QMSQTS.TraceabilityPool.FinishTraceabilityPool`)

> QMSQTS | 物理表：`qms_qts_f_tracepool`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 完工到货追溯池 |
| 物理表 | `qms_qts_f_tracepool` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:00:56.4110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `FinishTraceabilityPoolSNList` | 完工到货追溯池序列号子表 | `` | b9bf4752-c408-4a49-8d8d-aea7d4415f68 |
| 2 | `amount` | 数量 | `amount` | Decimal |
| 3 | `batchID` | 批次ID | `batch_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 4 | `batchNumber` | 批次号 | `batch_number` | String |
| 5 | `billDate` | 单据日期 | `bill_date` | DateTime |
| 6 | `billID` | 单据ID | `bill_id` | Long |
| 7 | `billRowID` | 单据行ID | `bill_row_id` | Long |
| 8 | `billType` | 单据类型 | `bill_type` | String |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `customerID` | 客户ID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 14 | `deptID` | 部门ID | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `extractResultID` | 抽取结果ID | `extract_result_id` | e2a251d9-0802-41a7-aeb6-4d7c379b93f1 |
| 17 | `id` | id | `id` | Long |
| 18 | `mainOrgID` | 管理组织ID | `main_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `modifier` | 修改人名称 | `modifier` | String |
| 20 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 23 | `oddNumber` | 单号 | `odd_number` | String |
| 24 | `productID` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `rowNumber` | 行号 | `row_number` | Decimal |
| 27 | `sourceBillID` | 来源单据ID | `source_bill_id` | Long |
| 28 | `sourceBillNum` | 来源单据号 | `source_bill_num` | String |
| 29 | `sourceBillRowID` | 来源单据行ID | `source_bill_row_id` | Long |
| 30 | `sourceBillRowNum` | 来源单据行号 | `source_bill_row_num` | Decimal |
| 31 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 32 | `supplierID` | 供应商ID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 33 | `trackingClue` | 跟踪线索 | `tracking_clue` | Long |
| 34 | `transType` | 交易类型 | `trans_type` | Long |
| 35 | `unitID` | 计量单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 36 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `extractResultID` | 抽取结果ID | `QMSQTS.TraceabilityResult.TraceabilityResult` | None |  |
| 2 | `mainOrgID` | 管理组织ID | `org.func.BaseOrg` | Service |  |
| 3 | `supplierID` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 4 | `productID` | 物料ID | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `customerID` | 客户ID | `aa.merchant.Merchant` | Service |  |
| 7 | `deptID` | 部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `unitID` | 计量单位ID | `pc.unit.Unit` | Service |  |
| 11 | `batchID` | 批次ID | `st.batchno.Batchno` | Service |  |
| 12 | `FinishTraceabilityPoolSNList` | 完工到货追溯池序列号子表 | `QMSQTS.TraceabilityPool.FinishTraceabilityPoolSN` | None | true |
