---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.optransorder.OpTransOrderDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 在制交接单明细 (`sfc.optransorder.OpTransOrderDetail`)

> IMPSFC | 物理表：`imp_sfc_op_trans_order_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 在制交接单明细 |
| 物理表 | `imp_sfc_op_trans_order_detail` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:49.4700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（65个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `freeCharacteristics` | 在制交接单明细自由项特征组 | `free_characteristics` | 181a8571-6d78-4af4-afc5-169853bb4e63 |
| 3 | `orderCode` | 生产订单号 | `order_code` | String |
| 4 | `orderProductLineNo` | 生产订单行号 | `order_line_no` | Decimal |
| 5 | `selfDefineCharacterDetail` | 在制交接单明细自定义项 | `self_define_character` | 7927f51e-5427-4d66-8375-2d9a72a7c0f2 |
| 6 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Short |
| 7 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 8 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 9 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 10 | `rowno` | 序号 | `rowno` | Integer |
| 11 | `sourceLineno` | 来源单据行号 | `source_lineno` | Decimal |
| 12 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 13 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 15 | `lineno` | 行号 | `lineno` | Decimal |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `id` | ID | `id` | Long |
| 18 | `opTransOrderId` | 在制交接单id | `op_trans_order_id` | 968fb30d-f419-47fe-b86c-e17c070030b3 |
| 19 | `orderId` | 生产订单ID | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 20 | `orderProductId` | 生产订单行ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 21 | `materialId` | 制造物料 | `material_id` | Long |
| 22 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 23 | `skuId` | 物料SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 24 | `dOrderProcessId` | 转出工序 | `d_order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 25 | `dOpSn` | 转出工序顺序号 | `d_op_sn` | Decimal |
| 26 | `dOrgId` | 转出组织 | `d_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 27 | `dWorkCenterId` | 转出工作中心ID | `d_work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 28 | `transQty` | 交接数量 | `trans_qty` | Decimal |
| 29 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 30 | `transQty1` | 交接件数 | `trans_qty1` | Decimal |
| 31 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 32 | `transQty2` | 交接数量(产出) | `trans_qty2` | Decimal |
| 33 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 34 | `mainChangeRate` | 生产主计量转换率 | `main_change_rate` | Decimal |
| 35 | `outChangeRate` | 产出主计量转换率 | `out_change_rate` | Decimal |
| 36 | `deliverId` | 转出人 | `deliver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 37 | `receiptId` | 接收人 | `receipt_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 38 | `rOrderProcessId` | 转入工序 | `r_order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 39 | `rOpSn` | 转入工序顺序号 | `r_op_sn` | Decimal |
| 40 | `rWorkCenterId` | 转入工作中心ID | `r_work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 41 | `procPlanId` | 转入工序作业计划ID | `proc_plan_id` | 48e1a533-51f0-4a5a-9465-6fff30ce5229 |
| 42 | `rOrgId` | 转入组织 | `r_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 43 | `qualifiedTurnQty` | 交接合格数量 | `qualified_turn_qty` | Decimal |
| 44 | `qualifiedTurnQty1` | 交接合格件数 | `qualified_turn_qty1` | Decimal |
| 45 | `qualifiedTurnQty2` | 交接合格数量(产出) | `qualified_turn_qty2` | Decimal |
| 46 | `reworkTurnQty` | 交接返工数量 | `rework_turn_qty` | Decimal |
| 47 | `reworkTurnQty1` | 交接返工件数 | `rework_turn_qty1` | Decimal |
| 48 | `reworkTurnQty2` | 交接返工数量(产出) | `rework_turn_qty2` | Decimal |
| 49 | `status` | 状态 | `status` | Integer |
| 50 | `source` | 上游单据类型 | `source` | String |
| 51 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 52 | `upcode` | 上游单据号 | `upcode` | String |
| 53 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 54 | `dCostCenterId` | 转出成本中心 | `d_cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 55 | `rCostCenterId` | 转入成本中心 | `r_cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 56 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 57 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 58 | `opSequenceId` | 订单工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 59 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 60 | `opTransOrderDetailExtItem` | 表体自由自定义项 | `` | f30b3d90-fdee-4a4d-9c75-9d2aab2aa161 |
| 61 | `opTransOrderDetailSn` | 工序任务汇报序列号 | `` | 5356147b-040c-45d5-a0ca-a8459763b44d |
| 62 | `opTransOrderDetailUserdefItem` | 表体固定自定义项 | `` | 916b6f62-f094-4982-8ff1-52d339813fe2 |
| 63 | `outChangeRateDen` | 产出换算率分母 | `out_change_rateden` | Decimal |
| 64 | `outChangeRateNum` | 产出换算率分子 | `out_change_ratenum` | Decimal |
| 65 | `procPlanDetailId` | 转入工序作业计划明细ID | `proc_plan_detail_id` | 7e33a4bf-edce-447c-8e6f-0717cec2b092 |

---

## 关联属性（29个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rCostCenterId` | 转入成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 2 | `dOrderProcessId` | 转出工序 | `po.order.OrderProcess` | Service |  |
| 3 | `opTransOrderId` | 在制交接单id | `sfc.optransorder.OpTransOrder` | None | true |
| 4 | `orderId` | 生产订单ID | `po.order.Order` | Service |  |
| 5 | `rOrderProcessId` | 转入工序 | `po.order.OrderProcess` | Service |  |
| 6 | `opTransOrderDetailExtItem` | 表体自由自定义项 | `sfc.optransorder.OpTransOrderDetailExtItem` | None | true |
| 7 | `dWorkCenterId` | 转出工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 8 | `rOrgId` | 转入组织 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `receiptId` | 接收人 | `bd.staff.Staff` | Service |  |
| 10 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 11 | `skuId` | 物料SKU | `pc.product.ProductSKU` | Service |  |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 13 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 14 | `dCostCenterId` | 转出成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 15 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 16 | `opSequenceId` | 订单工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 17 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 18 | `dOrgId` | 转出组织 | `aa.baseorg.OrgMV` | Service |  |
| 19 | `rWorkCenterId` | 转入工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 20 | `opTransOrderDetailSn` | 工序任务汇报序列号 | `sfc.optransorder.OpTransOrderDetailSn` | None | true |
| 21 | `orderProductId` | 生产订单行ID | `po.order.OrderProduct` | Service |  |
| 22 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 23 | `deliverId` | 转出人 | `bd.staff.Staff` | Service |  |
| 24 | `procPlanId` | 转入工序作业计划ID | `sfc.procPlan.ProcPlan` | None |  |
| 25 | `freeCharacteristics` | 在制交接单明细自由项特征组 | `sfc.optransorder.OpTransOrderFreeCharacter` | None |  |
| 26 | `selfDefineCharacterDetail` | 在制交接单明细自定义项 | `sfc.optransorder.OpTransOrderSelfDefineCharacterDetail` | None |  |
| 27 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 28 | `opTransOrderDetailUserdefItem` | 表体固定自定义项 | `sfc.optransorder.OpTransOrderDetailUserdefItem` | None | true |
| 29 | `procPlanDetailId` | 转入工序作业计划明细ID | `sfc.procPlan.ProcPlanDetail` | None |  |
