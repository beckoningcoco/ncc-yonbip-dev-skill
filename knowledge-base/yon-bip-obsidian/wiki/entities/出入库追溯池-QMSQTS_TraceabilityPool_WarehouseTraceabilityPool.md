---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.WarehouseTraceabilityPool"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 出入库追溯池 (`QMSQTS.TraceabilityPool.WarehouseTraceabilityPool`)

> QMSQTS | 物理表：`qms_qts_w_tracepool`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 出入库追溯池 |
| 物理表 | `qms_qts_w_tracepool` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:00:54.8380` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（45个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `WarehouseTraceabilityPoolSNList` | 出入库追溯池序列号子表 | `` | 128d9732-b80e-4229-989f-a50ea749a7f8 |
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
| 18 | `lendCustom` | 借出客户ID | `lend_custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 19 | `mainOrgID` | 管理组织ID | `main_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 20 | `memo` | 备注 | `memo` | String |
| 21 | `modifier` | 修改人名称 | `modifier` | String |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `oddNumber` | 单号 | `odd_number` | String |
| 26 | `orderChildRowID` | 订单孙表ID | `order_child_row_id` | Long |
| 27 | `orderId` | 订单ID | `order_id` | Long |
| 28 | `orderRowId` | 订单行ID | `order_row_id` | Long |
| 29 | `productID` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `receiveaddr` | 收货人地址 | `receive_addr` | String |
| 32 | `repositoryID` | 仓库ID | `repository_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 33 | `repositoryNumber` | 货位 | `repository_number` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 34 | `rowNumber` | 行号 | `row_number` | Decimal |
| 35 | `sourceBillID` | 来源单据ID | `source_bill_id` | Long |
| 36 | `sourceBillNum` | 来源单据号 | `source_bill_num` | String |
| 37 | `sourceBillRowID` | 来源单据行ID | `source_bill_row_id` | Long |
| 38 | `sourceBillRowNum` | 来源单据行号 | `source_bill_row_num` | Decimal |
| 39 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 40 | `stockStatus` | 库存状态 | `stock_status` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 41 | `supplierID` | 供应商ID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 42 | `trackingClue` | 跟踪线索 | `tracking_clue` | Long |
| 43 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 44 | `unitID` | 计量单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 45 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainOrgID` | 管理组织ID | `org.func.BaseOrg` | Service |  |
| 2 | `supplierID` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 3 | `productID` | 物料ID | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `lendCustom` | 借出客户ID | `aa.merchant.Merchant` | Service |  |
| 6 | `deptID` | 部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `batchID` | 批次ID | `st.batchno.Batchno` | Service |  |
| 10 | `extractResultID` | 抽取结果ID | `QMSQTS.TraceabilityResult.TraceabilityResult` | None |  |
| 11 | `repositoryNumber` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 12 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `customerID` | 客户ID | `aa.merchant.Merchant` | Service |  |
| 14 | `repositoryID` | 仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 15 | `stockStatus` | 库存状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 16 | `unitID` | 计量单位ID | `pc.unit.Unit` | Service |  |
| 17 | `WarehouseTraceabilityPoolSNList` | 出入库追溯池序列号子表 | `QMSQTS.TraceabilityPool.WarehouseTraceabilityPoolSN` | None | true |
