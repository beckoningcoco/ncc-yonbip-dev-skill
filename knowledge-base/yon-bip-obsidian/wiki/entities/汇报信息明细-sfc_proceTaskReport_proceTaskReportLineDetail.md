---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.proceTaskReport.proceTaskReportLineDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 汇报信息明细 (`sfc.proceTaskReport.proceTaskReportLineDetail`)

> IMPSFC | 物理表：`imp_sfc_procetaskrep_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇报信息明细 |
| 物理表 | `imp_sfc_procetaskrep_detail` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:26:13.4640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（81个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `badItem` | 不良项目 | `bad_item` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 2 | `badReason` | 不良原因 | `bad_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 3 | `batch` | 批次id | `batch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 4 | `batchNo` | 批次号 | `batch_no` | String |
| 5 | `createType` | 创建方式 | `create_type` | String |
| 6 | `define1` | 自定义项1 | `define1` | String |
| 7 | `define10` | 自定义项10 | `define10` | String |
| 8 | `define11` | 自定义项11 | `define11` | String |
| 9 | `define12` | 自定义项12 | `define12` | String |
| 10 | `define13` | 自定义项13 | `define13` | String |
| 11 | `define14` | 自定义项14 | `define14` | String |
| 12 | `define15` | 自定义项15 | `define15` | String |
| 13 | `define16` | 自定义项16 | `define16` | String |
| 14 | `define17` | 自定义项17 | `define17` | String |
| 15 | `define18` | 自定义项18 | `define18` | String |
| 16 | `define19` | 自定义项19 | `define19` | String |
| 17 | `define2` | 自定义项2 | `define2` | String |
| 18 | `define20` | 自定义项20 | `define20` | String |
| 19 | `define21` | 自定义项21 | `define21` | String |
| 20 | `define22` | 自定义项22 | `define22` | String |
| 21 | `define23` | 自定义项23 | `define23` | String |
| 22 | `define24` | 自定义项24 | `define24` | String |
| 23 | `define25` | 自定义项25 | `define25` | String |
| 24 | `define26` | 自定义项26 | `define26` | String |
| 25 | `define27` | 自定义项27 | `define27` | String |
| 26 | `define28` | 自定义项28 | `define28` | String |
| 27 | `define29` | 自定义项29 | `define29` | String |
| 28 | `define3` | 自定义项3 | `define3` | String |
| 29 | `define30` | 自定义项30 | `define30` | String |
| 30 | `define4` | 自定义项4 | `define4` | String |
| 31 | `define5` | 自定义项5 | `define5` | String |
| 32 | `define6` | 自定义项6 | `define6` | String |
| 33 | `define7` | 自定义项7 | `define7` | String |
| 34 | `define8` | 自定义项8 | `define8` | String |
| 35 | `define9` | 自定义项9 | `define9` | String |
| 36 | `dr` | 逻辑删除标记 | `dr` | Short |
| 37 | `freeCharacteristics` | 工序任务汇报明细自由项特征组 | `free_characteristics` | 99fa2f34-05ff-444b-b0c4-9eb2d8a96a61 |
| 38 | `id` | ID | `id` | Long |
| 39 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 40 | `lineno` | 行号 | `lineno` | Decimal |
| 41 | `locationId` | 仓库 | `location_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 42 | `mainQty` | 数量(主单位) | `main_qty` | Decimal |
| 43 | `mainTotalReworkHandledNum` | 累计返工已处理数量(主计量) | `main_total_rework_handled_num` | Decimal |
| 44 | `outQty` | 数量(产出) | `out_qty` | Decimal |
| 45 | `outTotalReworkHandledNum` | 累计返工已处理数量(产出) | `out_total_rework_handled_num` | Decimal |
| 46 | `proQty` | 数量(生产) | `pro_qty` | Decimal |
| 47 | `proTotalReworkHandledNum` | 累计返工已处理数量(生产) | `pro_total_rework_handled_num` | Decimal |
| 48 | `proceTaskId` | 工序任务汇报ID | `proce_task_id` | 5b6b44a2-42c1-49e8-9351-f34ff6838c71 |
| 49 | `proceTaskLineId` | 工序任务汇报信息ID | `proce_task_line_id` | de66617d-1de0-4dca-8844-cfc180a45de8 |
| 50 | `processInCharge` | 责任工序 | `process_in_charge` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 51 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 52 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 53 | `pubts` | 时间戳 | `pubts` | DateTime |
| 54 | `recommendReworkProcessId` | 建议返工工序 | `recommend_rework_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 55 | `reportType` | 汇报结果 | `report_type` | Short |
| 56 | `rowno` | 序号 | `rowno` | Integer |
| 57 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 58 | `scrapNoStockOutQty` | 报废不入库数量（产出） | `scrap_no_stock_out_qty` | Decimal |
| 59 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 60 | `selfDefineCharacter` | 工序任务汇报明细自定义项 | `self_define_character` | 3efc1f9e-5a55-4fcb-b319-ec04bff6aab7 |
| 61 | `sourceOrderCode` | 来源订单单号 | `source_order_code` | String |
| 62 | `sourceOrderDetailId` | 来源订单子表id | `source_order_detail_id` | Long |
| 63 | `sourceOrderId` | 来源订单主表id | `source_order_id` | Long |
| 64 | `sourceOrderRowno` | 来源订单行号 | `source_order_rowno` | Decimal |
| 65 | `sourceOrderType` | 来源订单类型 | `source_order_type` | String |
| 66 | `storageId` | 货位 | `storage_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 67 | `teamInCharge` | 责任班组 | `team_in_charge` | d1ce258a-6311-4719-846d-998458841d05 |
| 68 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 69 | `totalStockAuxQty` | 累计入库件数 | `total_stock_aux_qty` | Decimal |
| 70 | `totalStockOutQty` | 累计入库数量（产出） | `total_stock_out_qty` | Decimal |
| 71 | `totalStockQty` | 累计入库数量 | `total_stock_qty` | Decimal |
| 72 | `totalTurnNum` | 累计转出数量 | `total_turn_num` | Decimal |
| 73 | `totalTurnNum1` | 累计转出数量(生产) | `total_turn_num1` | Decimal |
| 74 | `totalTurnNum2` | 累计转出数量(产出) | `total_turn_num2` | Decimal |
| 75 | `userInCharge` | 责任人 | `user_in_charge` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 76 | `voucherChildId` | 业务单据子表id | `voucher_child_id` | Long |
| 77 | `voucherCode` | 业务单据单号 | `voucher_code` | String |
| 78 | `voucherId` | 业务单据主表id | `voucher_id` | Long |
| 79 | `voucherLineno` | 业务单据行号 | `voucher_lineno` | Decimal |
| 80 | `voucherType` | 业务单据类型 | `voucher_type` | String |
| 81 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 2 | `selfDefineCharacter` | 工序任务汇报明细自定义项 | `sfc.proceTaskReport.ProcTaskReportDetailSelfDefineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `batch` | 批次id | `st.batchno.Batchno` | Service |  |
| 5 | `processInCharge` | 责任工序 | `po.order.OrderProcess` | Service |  |
| 6 | `proceTaskId` | 工序任务汇报ID | `sfc.proceTaskReport.proceTaskReport` | None |  |
| 7 | `recommendReworkProcessId` | 建议返工工序 | `po.order.OrderProcess` | Service |  |
| 8 | `badItem` | 不良项目 | `QMSDFM.badItems.badItems` | Service |  |
| 9 | `freeCharacteristics` | 工序任务汇报明细自由项特征组 | `sfc.proceTaskReport.ProcTaskReportDetailFreeCharacter` | None |  |
| 10 | `locationId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 11 | `badReason` | 不良原因 | `aa.reason.Reason` | Service |  |
| 12 | `proceTaskLineId` | 工序任务汇报信息ID | `sfc.proceTaskReport.proceTaskReportLine` | None | true |
| 13 | `teamInCharge` | 责任班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 14 | `userInCharge` | 责任人 | `bd.staff.Staff` | Service |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 16 | `storageId` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
