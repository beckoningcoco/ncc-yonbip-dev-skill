---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.proceTaskReport.ProceTaskReportDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序任务汇报明细 (`sfc.proceTaskReport.ProceTaskReportDetail`)

> IMPSFC | 物理表：`imp_sfc_procetaskrep_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序任务汇报明细 |
| 物理表 | `imp_sfc_procetaskrep_detail` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:22:14.9750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（84个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `badItem` | 不良项目 | `bad_item` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 2 | `badReason` | 不良原因 | `bad_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `createType` | 创建方式 | `create_type` | String |
| 5 | `sourceOrderRowno` | 来源订单行号 | `source_order_rowno` | Decimal |
| 6 | `sourceOrderCode` | 来源订单单号 | `source_order_code` | String |
| 7 | `sourceOrderDetailId` | 来源订单子表id | `source_order_detail_id` | Long |
| 8 | `sourceOrderId` | 来源订单主表id | `source_order_id` | Long |
| 9 | `sourceOrderType` | 来源订单类型 | `source_order_type` | String |
| 10 | `voucherId` | 业务单据主表id | `voucher_id` | Long |
| 11 | `voucherCode` | 业务单据单号 | `voucher_code` | String |
| 12 | `voucherType` | 业务单据类型 | `voucher_type` | String |
| 13 | `voucherLineno` | 业务单据行号 | `voucher_lineno` | Decimal |
| 14 | `voucherChildId` | 业务单据子表id | `voucher_child_id` | Long |
| 15 | `freeCharacteristics` | 工序任务汇报自由项特征组 | `free_characteristics` | 99fa2f34-05ff-444b-b0c4-9eb2d8a96a61 |
| 16 | `id` | ID | `id` | Long |
| 17 | `lineno` | 行号 | `lineno` | Decimal |
| 18 | `mainQty` | 数量(主单位) | `main_qty` | Decimal |
| 19 | `mainTotalReworkHandledNum` | 累计返工已处理数量(主计量) | `main_total_rework_handled_num` | Decimal |
| 20 | `outQty` | 数量(产出) | `out_qty` | Decimal |
| 21 | `outTotalReworkHandledNum` | 累计返工已处理数量(产出) | `out_total_rework_handled_num` | Decimal |
| 22 | `proQty` | 数量(生产) | `pro_qty` | Decimal |
| 23 | `proTotalReworkHandledNum` | 累计返工已处理数量(生产) | `pro_total_rework_handled_num` | Decimal |
| 24 | `proceTaskId` | 工序任务汇报ID | `proce_task_id` | 5b6b44a2-42c1-49e8-9351-f34ff6838c71 |
| 25 | `processInCharge` | 责任工序 | `process_in_charge` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 26 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime |
| 28 | `recommendReworkProcessId` | 建议返工工序 | `recommend_rework_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 29 | `reportType` | 汇报结果 | `report_type` | Short |
| 30 | `rowno` | 序号 | `rowno` | Integer |
| 31 | `selfDefineCharacter` | 工序任务汇报自定义项 | `self_define_character` | 3efc1f9e-5a55-4fcb-b319-ec04bff6aab7 |
| 32 | `teamInCharge` | 责任班组 | `team_in_charge` | d1ce258a-6311-4719-846d-998458841d05 |
| 33 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 34 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 35 | `totalTurnNum1` | 累计转出数量(生产) | `total_turn_num1` | Decimal |
| 36 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 37 | `userInCharge` | 责任人 | `user_in_charge` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 38 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 39 | `batch` | 批次id | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 40 | `batchNo` | 批次号 | `batch_no` | String |
| 41 | `define1` | 自定义项1 | `define1` | String |
| 42 | `define10` | 自定义项10 | `define10` | String |
| 43 | `define11` | 自定义项11 | `define11` | String |
| 44 | `define12` | 自定义项12 | `define12` | String |
| 45 | `define13` | 自定义项13 | `define13` | String |
| 46 | `define14` | 自定义项14 | `define14` | String |
| 47 | `define15` | 自定义项15 | `define15` | String |
| 48 | `define16` | 自定义项16 | `define16` | String |
| 49 | `define17` | 自定义项17 | `define17` | String |
| 50 | `define18` | 自定义项18 | `define18` | String |
| 51 | `define19` | 自定义项19 | `define19` | String |
| 52 | `define2` | 自定义项2 | `define2` | String |
| 53 | `define20` | 自定义项20 | `define20` | String |
| 54 | `define21` | 自定义项21 | `define21` | String |
| 55 | `define22` | 自定义项22 | `define22` | String |
| 56 | `define23` | 自定义项23 | `define23` | String |
| 57 | `define24` | 自定义项24 | `define24` | String |
| 58 | `define25` | 自定义项25 | `define25` | String |
| 59 | `define26` | 自定义项26 | `define26` | String |
| 60 | `define27` | 自定义项27 | `define27` | String |
| 61 | `define28` | 自定义项28 | `define28` | String |
| 62 | `define29` | 自定义项29 | `define29` | String |
| 63 | `define3` | 自定义项3 | `define3` | String |
| 64 | `define30` | 自定义项30 | `define30` | String |
| 65 | `define4` | 自定义项4 | `define4` | String |
| 66 | `define5` | 自定义项5 | `define5` | String |
| 67 | `define6` | 自定义项6 | `define6` | String |
| 68 | `define7` | 自定义项7 | `define7` | String |
| 69 | `define8` | 自定义项8 | `define8` | String |
| 70 | `define9` | 自定义项9 | `define9` | String |
| 71 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 72 | `locationId` | 仓库 | `location_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 73 | `proceTaskLineId` | 工序任务汇报信息ID | `proce_task_line_id` | de66617d-1de0-4dca-8844-cfc180a45de8 |
| 74 | `proceTaskReportDetailDefine` | 工序任务汇报明细自定义表 | `` | c7ea9c51-c3a6-42ab-86c6-771dd5ef0140 |
| 75 | `proceTaskReportDetailSn` | 工序任务汇报序列号 | `` | 20e0df91-9d47-498f-b442-4cd52e31e80c |
| 76 | `proceTaskReportDetailUserDf` | 工序任务汇报明细固定自定义项 | `` | 6ccdbbf0-a73e-4147-bbcd-cb4ce9876d12 |
| 77 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 78 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 79 | `scrapNoStockOutQty` | 报废不入库数量（产出） | `scrap_no_stock_out_qty` | Decimal |
| 80 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 81 | `storageId` | 货位 | `storage_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 82 | `totalStockAuxQty` | 累计入库件数 | `total_stock_aux_qty` | Decimal |
| 83 | `totalStockOutQty` | 累计入库数量（产出） | `total_stock_out_qty` | Decimal |
| 84 | `totalStockQty` | 累计入库数量 | `total_stock_qty` | Decimal |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `proceTaskReportDetailDefine` | 工序任务汇报明细自定义表 | `sfc.proceTaskReport.ProceTaskReportDetailDefine` | None | true |
| 2 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `selfDefineCharacter` | 工序任务汇报自定义项 | `sfc.proceTaskReport.ProcTaskReportDetailSelfDefineCharacter` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `batch` | 批次id | `st.batchno.Batchno` | Service |  |
| 6 | `processInCharge` | 责任工序 | `po.order.OrderProcess` | Service |  |
| 7 | `proceTaskId` | 工序任务汇报ID | `sfc.proceTaskReport.proceTaskReport` | None | true |
| 8 | `recommendReworkProcessId` | 建议返工工序 | `po.order.OrderProcess` | Service |  |
| 9 | `badItem` | 不良项目 | `QMSDFM.badItems.badItems` | Service |  |
| 10 | `freeCharacteristics` | 工序任务汇报自由项特征组 | `sfc.proceTaskReport.ProcTaskReportDetailFreeCharacter` | None |  |
| 11 | `locationId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 12 | `badReason` | 不良原因 | `aa.reason.Reason` | Service |  |
| 13 | `proceTaskLineId` | 工序任务汇报信息ID | `sfc.proceTaskReport.proceTaskReportLine` | None |  |
| 14 | `proceTaskReportDetailSn` | 工序任务汇报序列号 | `sfc.proceTaskReport.ProceTaskReportDetailSn` | None | true |
| 15 | `proceTaskReportDetailUserDf` | 工序任务汇报明细固定自定义项 | `sfc.proceTaskReport.ProceTaskReportDetailUserDf` | None | true |
| 16 | `teamInCharge` | 责任班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 17 | `userInCharge` | 责任人 | `bd.staff.Staff` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 19 | `storageId` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
