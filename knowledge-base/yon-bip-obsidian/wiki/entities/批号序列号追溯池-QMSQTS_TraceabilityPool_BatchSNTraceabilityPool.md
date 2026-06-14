---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.BatchSNTraceabilityPool"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 批号序列号追溯池 (`QMSQTS.TraceabilityPool.BatchSNTraceabilityPool`)

> QMSQTS | 物理表：`qms_qts_b_tracepool`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 批号序列号追溯池 |
| 物理表 | `qms_qts_b_tracepool` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:00:50.3220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（45个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `BatchSNTraceabilityPoolBodyList` | 批号序列号追溯池子表 | `` | 9ac945db-92eb-41c2-81b7-b1aad4700809 |
| 2 | `amount` | 数量 | `amount` | Decimal |
| 3 | `batchID` | 批次ID | `batch_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 4 | `batchNumber` | 批次号 | `batch_number` | String |
| 5 | `billType` | 单据类型 | `bill_type` | String |
| 6 | `bomID` | bomID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 7 | `bomVersion` | BOM版本 | `bomVersion` | String |
| 8 | `businessDate` | 业务日期 | `business_date` | DateTime |
| 9 | `code` | 编码 | `code` | String |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `deptID` | 部门ID | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `factoryID` | 工厂ID | `factory_id` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 |
| 17 | `freeCT` | 自由项特征组 | `free_ct` | 7bca099b-3235-470d-ab3c-b9ccc5a92c53 |
| 18 | `id` | id | `id` | Long |
| 19 | `mainID` | 序列号主表ID | `main_id` | Long |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 24 | `originOrderID` | 源头订单ID | `origin_order_id` | String |
| 25 | `originOrderNum` | 源头订单号 | `origin_order_num` | String |
| 26 | `originOrderRowID` | 源头订单行ID | `origin_order_row_id` | String |
| 27 | `originOrderRowNum` | 源头订单行号 | `origin_order_row_num` | String |
| 28 | `originOrderType` | 源头订单类型 | `origin_order_type` | String |
| 29 | `processID` | 工序ID | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 30 | `processOrder` | 工序顺序号 | `process_order` | Decimal |
| 31 | `productID` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |
| 33 | `purchaseOrgID` | 采购组织ID | `purchase_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 34 | `remark` | 备注 | `remark` | String |
| 35 | `serialNumber` | 序列号 | `serial_number` | String |
| 36 | `serialNumberID` | 序列号ID | `serial_number_id` | b77de1a0-2e36-47ba-9bd9-3cda94fd9680 |
| 37 | `sourceOrderID` | 来源订单ID | `source_order_id` | String |
| 38 | `sourceOrderNum` | 来源订单号 | `source_order_num` | String |
| 39 | `sourceOrderRowID` | 来源订单行ID | `source_order_row_id` | String |
| 40 | `sourceOrderRowNum` | 来源订单行号 | `source_order_row_num` | String |
| 41 | `sourceOrderType` | 来源订单类型 | `source_order_type` | String |
| 42 | `stockOrgID` | 库存组织ID | `stock_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 43 | `supplierID` | 供应商ID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 44 | `unitID` | 计量单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 45 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `serialNumberID` | 序列号ID | `sn.serialnumber.SNstateReport` | Service |  |
| 2 | `bomID` | bomID | `ed.bom.Bom` | Service |  |
| 3 | `supplierID` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 4 | `productID` | 物料ID | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `factoryID` | 工厂ID | `org.func.FactoryOrg` | Service |  |
| 7 | `deptID` | 部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `BatchSNTraceabilityPoolBodyList` | 批号序列号追溯池子表 | `QMSQTS.TraceabilityPool.BatchSNTraceabilityPoolBody` | None | true |
| 11 | `purchaseOrgID` | 采购组织ID | `org.func.PurchaseOrg` | Service |  |
| 12 | `batchID` | 批次ID | `st.batchno.Batchno` | Service |  |
| 13 | `processID` | 工序ID | `ed.operation.Operation` | Service |  |
| 14 | `freeCT` | 自由项特征组 | `QMSQTS.TraceabilityPool.BatchSNTraceabilityPoolFreeCT` | None |  |
| 15 | `stockOrgID` | 库存组织ID | `org.func.InventoryOrg` | Service |  |
| 16 | `unitID` | 计量单位ID | `pc.unit.Unit` | Service |  |
