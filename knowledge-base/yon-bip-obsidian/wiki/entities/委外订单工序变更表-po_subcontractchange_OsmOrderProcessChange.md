---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmOrderProcessChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单工序变更表 (`po.subcontractchange.OsmOrderProcessChange`)

> OSM | 物理表：`osm_order_process_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单工序变更表 |
| 物理表 | `osm_order_process_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:22.6060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（81个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 2 | `checkType` | 质检方式 | `check_type` | Short |
| 3 | `computingCosts` | 计算成本 | `computing_costs` | Short |
| 4 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 5 | `doScheduling` | 参与调度 | `do_scheduling` | Short |
| 6 | `executeOrgId` | 执行组织ID | `execute_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 7 | `trunOsmQty` | 转委外数量 | `trun_osm_qty` | Decimal |
| 8 | `inspection` | 检验 | `inspection` | Boolean |
| 9 | `trunOsmApplyQty` | 转委外申请数量 | `trun_osmapply_qty` | Decimal |
| 10 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 11 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 14 | `osmSendQty` | 委外下达数量 | `osm_send_qty` | Decimal |
| 15 | `externalSystemAutoId` | 外部系统工序ID | `external_system_auto_id` | String |
| 16 | `finishGoodsId` | 完工库位ID | `finish_goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 17 | `finishWarehouseId` | 完工仓库ID | `finish_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 18 | `firstCheck` | 首检 | `first_check` | String |
| 19 | `id` | id | `id` | Long |
| 20 | `immediateHandover` | 即时交接 | `immediate_handover` | Short |
| 21 | `isOutsource` | 委外 | `is_outsource` | Short |
| 22 | `mainChangeRate` | 生产-主计量换算率 | `main_change_rate` | Decimal |
| 23 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `nextId` | 后序ID | `next_id` | Long |
| 25 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 26 | `occupyProduction` | 占用产能 | `occupy_production` | Short |
| 27 | `operationControlId` | 工序控制码ID | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 28 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 29 | `orderId` | 生产订单ID | `order_id` | Long |
| 30 | `orderProductId` | 产品id | `order_product_id` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 31 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 32 | `originalOrderProductId` | 原单产品id | `original_order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 33 | `originalProcessId` | 原单工序id | `original_order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 34 | `outChangeRate` | 产出-主计量换算率 | `out_change_rate` | Decimal |
| 35 | `outChangeType` | 换算方式 | `out_change_type` | ChangeType |
| 36 | `outUnitId` | 产出单位ID | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 37 | `planEndDate` | 计划完工时间 | `plan_end_date` | DateTime |
| 38 | `planStartDate` | 计划开工时间 | `plan_start_date` | DateTime |
| 39 | `preId` | 前序ID | `pre_id` | Long |
| 40 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 41 | `prepareTime` | 准备时间 | `prepare_time` | Decimal |
| 42 | `procPlanCreate` | 工序作业计划创建 | `proc_plan_create` | Short |
| 43 | `procPlanId` | 工序作业计划ID | `proc_plan_id` | Long |
| 44 | `processDefineDts` | 工序自定义项特征组 | `define_cts` | 6d41a8d1-aee4-49ff-bf48-69e8f1edc2d6 |
| 45 | `processTime` | 加工时间 | `process_time` | Decimal |
| 46 | `processType` | 加工类型 | `process_type` | Short |
| 47 | `prodQty` | 计划生产件数 | `prod_qty` | Decimal |
| 48 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 49 | `pubts` | 时间戳 | `pubts` | DateTime |
| 50 | `qty` | 计划生产数量(主计量) | `qty` | Decimal |
| 51 | `reportWork` | 报工 | `report_work` | Short |
| 52 | `routingOperationId` | 工艺路线行ID | `route_operation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 53 | `sn` | 顺序号 | `sn` | Decimal |
| 54 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 55 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 56 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 57 | `transferProcplanProdQty` | 转工序作业计划件数数量(生产单位) | `transfer_procplan_prod_qty` | Decimal |
| 58 | `transferProcplanQty` | 转工序作业计划数量(主计量单位) | `transfer_procplan_qty` | Decimal |
| 59 | `vendorAuth` | 委外供应商权限 | `vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 60 | `vendorId` | 委外商ID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 61 | `workCenterId` | 工作中心ID | `workCenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 62 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 63 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 64 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 65 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 66 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 67 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 68 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 69 | `ecnUser` | 变更人 | `ecn_user` | String |
| 70 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 71 | `mainChangeRateDen` | 生产-主计量换算率分母 | `main_change_rateden` | Decimal |
| 72 | `mainChangeRateNum` | 生产-主计量换算率分子 | `main_change_ratenum` | Decimal |
| 73 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 74 | `opSequenceNum` | 工序序列 | `op_sequence_num` | Integer |
| 75 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 76 | `orderProcessAttrextItem` | 工序表自由自定义项 | `` | 258a7d02-2b76-4a45-aa26-78963405be46 |
| 77 | `orderProcessUserdefItem` | 委外工序表固定自定义项 | `` | 258dd5a9-450c-43b2-a610-899cf524e83b |
| 78 | `outChangeRateDen` | 产出-主计量换算率分母 | `out_change_rateden` | Decimal |
| 79 | `outChangeRateNum` | 产出-主计量换算率分子 | `out_change_ratenum` | Decimal |
| 80 | `reworkQty` | 计划返工数量 | `rework_qty` | Decimal |
| 81 | `reworkSubQty` | 计划返工件数 | `rework_sub_qty` | Decimal |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `originalOrderProductId` | 原单产品id | `po.order.OrderProduct` | None |  |
| 2 | `finishGoodsId` | 完工库位ID | `aa.goodsposition.GoodsPosition` | Service |  |
| 3 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `orderProcessAttrextItem` | 工序表自由自定义项 | `po.subcontractchange.OsmOrderProcessChangeAttrextItem` | None | true |
| 6 | `originalProcessId` | 原单工序id | `po.order.OrderProcess` | None |  |
| 7 | `operationControlId` | 工序控制码ID | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 8 | `vendorId` | 委外商ID | `aa.vendor.Vendor` | Service |  |
| 9 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 10 | `orderProductId` | 产品id | `po.subcontractchange.OsmOrderProductChange` | None | true |
| 11 | `routingOperationId` | 工艺路线行ID | `ed.routing.RoutingOperation` | Service |  |
| 12 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 13 | `orderProcessUserdefItem` | 委外工序表固定自定义项 | `po.subcontractchange.OsmOrderProcessChangeDefine` | None | true |
| 14 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
| 15 | `processDefineDts` | 工序自定义项特征组 | `po.order.ProcessDefineCharacteristics` | None |  |
| 16 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 17 | `executeOrgId` | 执行组织ID | `org.func.BaseOrg` | Service |  |
| 18 | `finishWarehouseId` | 完工仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 19 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 20 | `operationId` | 标准工序ID | `ed.operation.Operation` | Service |  |
| 21 | `outUnitId` | 产出单位ID | `pc.unit.Unit` | Service |  |
| 22 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 23 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
