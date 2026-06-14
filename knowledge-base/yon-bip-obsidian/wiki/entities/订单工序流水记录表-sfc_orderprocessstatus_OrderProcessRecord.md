---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.orderprocessstatus.OrderProcessRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单工序流水记录表 (`sfc.orderprocessstatus.OrderProcessRecord`)

> IMPSFC | 物理表：`imp_sfc_order_process_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单工序流水记录表 |
| 物理表 | `imp_sfc_order_process_record` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:53.9500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（89个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `outConversionRate` | 产出换算率 | `out_conversion_rate` | Decimal |
| 2 | `orderId` | 生产订单ID | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 3 | `totalReworkTurnNum` | 累计返工转出数量 | `total_rework_turn_num` | Decimal |
| 4 | `totalScrapNum` | 累计报废数量 | `total_scrap_num` | Decimal |
| 5 | `scheduleProdNum` | 计划生产数量 | `schedule_prod_num` | Decimal |
| 6 | `totalCompleteNum` | 累计完成数量 | `total_complete_num` | Decimal |
| 7 | `nextId` | 后工序 | `next_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 8 | `workCenterId` | 工作中心ID | `workCenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 9 | `outConversionRateNum` | 产出换算率分子 | `out_conversion_ratenum` | Decimal |
| 10 | `outConversionRateDen` | 产出换算率分母 | `out_conversion_rateden` | Decimal |
| 11 | `prodConversionRateNum` | 生产换算率分子 | `prod_conversion_ratenum` | Decimal |
| 12 | `prodConversionRateDen` | 生产换算率分母 | `prod_conversion_rateden` | Decimal |
| 13 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 14 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 25 | `dr` | 逻辑删除标记 | `dr` | Short |
| 26 | `id` | 主键 | `id` | Long |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime |
| 28 | `scheduleOutputNum2` | 预计产出数量(产出) | `schedule_output_num2` | Decimal |
| 29 | `totalScrapTurnoutNum` | 累计报废转出数量 | `total_scrap_turnout_num` | Decimal |
| 30 | `scheduleProdNum2` | 计划生产数量(产出) | `schedule_prod_num2` | Decimal |
| 31 | `scheduleOutputNum1` | 预计产出件数 | `schedule_output_num1` | Decimal |
| 32 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 33 | `outUnitId` | 产出单位ID | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 34 | `scheduleProdNum1` | 计划生产件数 | `schedule_prod_num1` | Decimal |
| 35 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 36 | `scheduleOutputNum` | 预计产出数量 | `schedule_output_num` | Decimal |
| 37 | `batchNo` | 批次号 | `batch_no` | String |
| 38 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 39 | `totalReworkNum` | 累计待返工数量 | `total_rework_num` | Decimal |
| 40 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 41 | `orderProductId` | 生产订单行ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 42 | `materialId` | 制造物料 | `material_id` | Long |
| 43 | `totalScrapTurnoutNum2` | 累计报废转出数量(产出) | `total_scrap_turnout_num2` | Decimal |
| 44 | `totalScrapTurnoutNum1` | 累计报废转出件数 | `total_scrap_turnout_num1` | Decimal |
| 45 | `totalReworkTurnNum2` | 累计返工转出数量(产出) | `total_rework_turn_num2` | Decimal |
| 46 | `totalReworkTurnNum1` | 累计返工转出件数 | `total_rework_turn_num1` | Decimal |
| 47 | `orderProcessId` | 订单工序ID | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 48 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 49 | `totalReworkProcessNum2` | 累计返工处理数量(产出) | `total_re_pro_num2` | Decimal |
| 50 | `totalQualifiedTurnNum1` | 累计合格转出件数 | `total_qualified_turn_num1` | Decimal |
| 51 | `totalReworkProcessNum1` | 累计返工处理件数 | `total_re_pro_num1` | Decimal |
| 52 | `totalQualifiedTurnNum2` | 累计合格转出数量(产出) | `total_qualified_turn_num2` | Decimal |
| 53 | `actualEndTime` | 实际结束时间 | `actual_end_time` | DateTime |
| 54 | `totalExecNum` | 累计执行数量 | `total_exec_num` | Decimal |
| 55 | `preId` | 前工序 | `pre_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 56 | `actualStartTime` | 实际开始时间 | `actual_start_time` | DateTime |
| 57 | `splitTurninNum` | 分割转入数量 | `split_turnin_num` | Decimal |
| 58 | `totalExecNum2` | 累计执行数量(产出) | `total_exec_num2` | Decimal |
| 59 | `totalExecNum1` | 累计执行件数 | `total_exec_num1` | Decimal |
| 60 | `totalQualifiedNum2` | 累计合格数量(产出) | `total_qualified_num2` | Decimal |
| 61 | `totalQualifiedNum1` | 累计合格件数 | `total_qualified_num1` | Decimal |
| 62 | `totalQualifiedNum` | 累计合格数量 | `total_qualified_num` | Decimal |
| 63 | `totalReworkTurninNum1` | 累计返工转入件数 | `total_rework_turnin_num1` | Decimal |
| 64 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 65 | `totalReworkTurninNum2` | 累计返工转入数量(产出) | `total_rework_turnin_num2` | Decimal |
| 66 | `splitTurnoutNum` | 分割转出数量 | `split_turnout_num` | Decimal |
| 67 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 68 | `processType` | 加工类型 | `process_type` | Short |
| 69 | `totalReworkProcessNum` | 累计返工处理数量 | `total_re_pro_num` | Decimal |
| 70 | `orderLineNo` | 生产订单行号 | `order_line_no` | Decimal |
| 71 | `prodConversionRate` | 生产换算率 | `prod_conversion_rate` | Decimal |
| 72 | `totalReworkNum2` | 累计待返工数量(产出) | `total_rework_num2` | Decimal |
| 73 | `totalCompleteNum1` | 累计完成件数 | `total_complete_num1` | Decimal |
| 74 | `totalReworkNum1` | 累计待返工件数 | `total_rework_num1` | Decimal |
| 75 | `totalCompleteNum2` | 累计完成数量(产出) | `total_complete_num2` | Decimal |
| 76 | `totalTurninNum` | 累计转入数量 | `total_turnin_num` | Decimal |
| 77 | `totalTurninNum1` | 累计转入件数 | `total_turnin_num1` | Decimal |
| 78 | `totalTurninNum2` | 累计转入数量(产出) | `total_turnin_num2` | Decimal |
| 79 | `totalScrapNum2` | 累计报废数量(产出) | `total_scrap_num2` | Decimal |
| 80 | `splitTurnoutNum2` | 分割转出数量(产出) | `split_turnout_num2` | Decimal |
| 81 | `totalScrapNum1` | 累计报废件数 | `total_scrap_num1` | Decimal |
| 82 | `splitTurnoutNum1` | 分割转出件数 | `split_turnout_num1` | Decimal |
| 83 | `totalQualifiedTurnNum` | 累计合格转出数量 | `total_qualified_turn_num` | Decimal |
| 84 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 85 | `totalReworkTurninNum` | 累计返工转入数量 | `total_rework_turnin_num` | Decimal |
| 86 | `executeOrgId` | 执行组织ID | `execute_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 87 | `splitTurninNum1` | 分割转入件数 | `split_turnin_num1` | Decimal |
| 88 | `splitTurninNum2` | 分割转入数量(产出) | `split_turnin_num2` | Decimal |
| 89 | `orderCode` | 生产订单号 | `order_code` | String |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `preId` | 前工序 | `po.order.OrderProcess` | Service |  |
| 2 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 3 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 4 | `orderId` | 生产订单ID | `po.order.Order` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `orderProductId` | 生产订单行ID | `po.order.OrderProduct` | Service |  |
| 9 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 10 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
| 11 | `nextId` | 后工序 | `po.order.OrderProcess` | Service |  |
| 12 | `orderProcessId` | 订单工序ID | `po.order.OrderProcess` | Service |  |
| 13 | `executeOrgId` | 执行组织ID | `org.func.BaseOrg` | Service |  |
| 14 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 15 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 16 | `operationId` | 标准工序ID | `ed.operation.Operation` | Service |  |
| 17 | `outUnitId` | 产出单位ID | `pc.unit.Unit` | Service |  |
| 18 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 19 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 20 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
