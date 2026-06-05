---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckResultExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验记录处理结果明细扩展表 (`QMSDFM.dfmCheck.QmsDfmCheckResultExt`)

> QIC | 物理表：`qms_dfm_inspect_result_expinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验记录处理结果明细扩展表 |
| 物理表 | `qms_dfm_inspect_result_expinfo` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:43.7630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 2a6cf07e-35bd-4452-b1f2-41a012211384 | 处理结果明细id |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `adjustedStockNum` | 已调整库存数量 | `adjusted_stock_num` | Decimal |
| 2 | `adjustedStockSubNum` | 已调整库存件数 | `adjusted_stock_subnum` | Decimal |
| 3 | `batchNoId` | 批次id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 4 | `destroySimpleResp` | 破坏样本承担方 | `destroySimpleResp` | Short |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `finalConclusion` | 最终结论 | `final_conclusion` | Short |
| 7 | `id` | 处理结果明细id | `id` | 2a6cf07e-35bd-4452-b1f2-41a012211384 |
| 8 | `inspectResultSource` | 检验结果来源 | `inspectresult_source` | Short |
| 9 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 10 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 11 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 12 | `invStockExchRateDen` | 库存换算率分母 | `invstockexchrateden` | Decimal |
| 13 | `invStockExchRateNum` | 库存换算率分子 | `invstockexchratenum` | Decimal |
| 14 | `isGenerateBarcode` | 自动生码 | `is_generate_barcode` | Boolean |
| 15 | `isMultiInspect` | 是否多版本检验 | `is_multiinspect` | Short |
| 16 | `isSecondReject` | 是否二次不良处理 | `is_secondreject` | Short |
| 17 | `othOutStockQty` | 其他出库数量 | `othOutStockQty` | Decimal |
| 18 | `pk_inspectdept` | 检验部门 | `pk_inspectdept` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 19 | `pk_inspecter` | 检验员 | `pk_inspecter` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `resSourceRowID` | 检验结果源单行ID | `ressource_row_id` | String |
| 22 | `reworkOperationId` | 标准建议返工工序ID | `rework_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 23 | `sampleRecordCode` | 样品编号 | `sample_record_code` | String |
| 24 | `scrapOperationId` | 标准责任工序ID | `scrap_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 25 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 26 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 27 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 28 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 29 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 30 | `totalReturnStockQty` | 累计退库数量 | `totalReturnStockQty` | Decimal |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_inspecter` | 检验员 | `bd.staff.Staff` | Service |  |
| 2 | `batchNoId` | 批次id | `st.batchno.Batchno` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `reworkOperationId` | 标准建议返工工序ID | `ed.operation.Operation` | Service |  |
| 5 | `scrapOperationId` | 标准责任工序ID | `ed.operation.Operation` | Service |  |
| 6 | `pk_inspectdept` | 检验部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 7 | `id` | 处理结果明细id | `QMSDFM.dfmCheck.QmsDfmCheckResult` | None | true |
