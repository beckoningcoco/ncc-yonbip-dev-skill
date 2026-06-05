---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.BatchSNTraceabilityPoolBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 批号序列号追溯池子表 (`QMSQTS.TraceabilityPool.BatchSNTraceabilityPoolBody`)

> QMSQTS | 物理表：`qms_qts_b_tracepool_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 批号序列号追溯池子表 |
| 物理表 | `qms_qts_b_tracepool_b` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:01:14.3360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `amount` | 数量 | `amount` | Decimal |
| 2 | `batchID` | 批次号ID | `batch_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 3 | `batchNumber` | 批次号 | `batch_number` | String |
| 4 | `billType` | 单据类型 | `bill_type` | String |
| 5 | `childID` | 序列号子表ID | `child_id` | Long |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `freeCT` | 自由项特征组 | `free_ct` | 86507d07-14de-4bc5-8247-141e87d63f35 |
| 12 | `grandDr` | 序列号孙表删除标记 | `grand_dr` | Integer |
| 13 | `grandID` | 序列号孙表ID | `grand_id` | Long |
| 14 | `id` | ID | `id` | Long |
| 15 | `lineNumber` | 行号 | `line_number` | Decimal |
| 16 | `mainID` | 序列号主表ID | `main_id` | Long |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `parentID` | 主表ID | `parent_id` | bcf81a4d-a9f4-47f6-827e-554f03906794 |
| 22 | `productID` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `purchaseOrgID` | 采购组织 | `purchase_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 25 | `remark` | 备注 | `remark` | String |
| 26 | `serialNumber` | 序列号 | `serial_number` | String |
| 27 | `serialNumberID` | 序列号ID | `serial_number_id` | b77de1a0-2e36-47ba-9bd9-3cda94fd9680 |
| 28 | `sourceOrderID` | 来源订单ID | `source_order_id` | String |
| 29 | `sourceOrderNum` | 来源订单号 | `source_order_num` | String |
| 30 | `sourceOrderRowID` | 来源订单行ID | `source_order_row_id` | String |
| 31 | `sourceOrderRowNum` | 来源订单行号 | `source_order_row_num` | String |
| 32 | `sourceOrderType` | 来源订单类型 | `source_order_type` | String |
| 33 | `supplierDeptID` | 供应部门ID | `supplier_dept_id` | String |
| 34 | `supplierID` | 供应商ID | `supplierID` | Long |
| 35 | `supplierOrgID` | 供应组织ID | `supplier_org_id` | String |
| 36 | `supplierStockID` | 供应仓库ID | `supplier_stock_id` | String |
| 37 | `unitID` | 物料计量单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 38 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `serialNumberID` | 序列号ID | `sn.serialnumber.SNstateReport` | Service |  |
| 2 | `productID` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `freeCT` | 自由项特征组 | `QMSQTS.TraceabilityPool.BatchSNTraceabilityPoolBodyFreeCT` | None |  |
| 7 | `unitID` | 物料计量单位ID | `pc.unit.Unit` | Service |  |
| 8 | `purchaseOrgID` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
| 9 | `batchID` | 批次号ID | `st.batchno.Batchno` | Service |  |
| 10 | `parentID` | 主表ID | `QMSQTS.TraceabilityPool.BatchSNTraceabilityPool` | None | true |
