---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMOrderProcess"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单工序 (`osm.OSMOrder.OSMOrderProcess`)

> OSM | 物理表：`po_order_process`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单工序 |
| 物理表 | `po_order_process` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:36.3110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（77个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 2 | `checkType` | 质检方式 | `check_type` | Short |
| 3 | `computingCosts` | 计算成本 | `computing_costs` | Short |
| 4 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 5 | `doScheduling` | 参与调度 | `do_scheduling` | Short |
| 6 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 7 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 8 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 9 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 10 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 11 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 12 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 13 | `ecnUser` | 变更人 | `ecn_user` | String |
| 14 | `executeOrgId` | 执行组织ID | `execute_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 15 | `externalSystemAutoId` | 外部系统工序ID | `external_system_auto_id` | String |
| 16 | `finishGoodsId` | 完工库位ID | `finish_goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 17 | `finishWarehouseId` | 完工仓库ID | `finish_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 18 | `firstCheck` | 首检 | `first_check` | String |
| 19 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 20 | `id` | ID | `id` | Long |
| 21 | `immediateHandover` | 即时交接 | `immediate_handover` | Short |
| 22 | `inspection` | 检验 | `inspection` | Boolean |
| 23 | `isOutsource` | 委外 | `is_outsource` | Short |
| 24 | `mainChangeRate` | 生产-主计量换算率 | `main_change_rate` | Decimal |
| 25 | `mainChangeRateDen` | 生产-主计量换算率分母 | `main_change_rateden` | Decimal |
| 26 | `mainChangeRateNum` | 生产-主计量换算率分子 | `main_change_ratenum` | Decimal |
| 27 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 28 | `nextId` | 后序ID | `next_id` | Long |
| 29 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 30 | `occupyProduction` | 占用产能 | `occupy_production` | Short |
| 31 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 32 | `opSequenceNum` | 工序序列 | `op_sequence_num` | Integer |
| 33 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 34 | `operationControlId` | 工序控制码ID | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 35 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 36 | `orderId` | 生产订单ID | `order_id` | Long |
| 37 | `orderProductId` | 订单母件ID | `order_product_id` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 38 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 39 | `osmSendQty` | 委外下达数量 | `osm_send_qty` | Decimal |
| 40 | `outChangeRate` | 产出-主计量换算率 | `out_change_rate` | Decimal |
| 41 | `outChangeRateDen` | 产出-主计量换算率分母 | `out_change_rateden` | Decimal |
| 42 | `outChangeRateNum` | 产出-主计量换算率分子 | `out_change_ratenum` | Decimal |
| 43 | `outChangeType` | 换算方式 | `out_change_type` | ChangeType |
| 44 | `outUnitId` | 产出单位ID | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 45 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 46 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 47 | `planEndDate` | 计划完工时间 | `plan_end_date` | DateTime |
| 48 | `planStartDate` | 计划开工时间 | `plan_start_date` | DateTime |
| 49 | `preId` | 前序ID | `pre_id` | Long |
| 50 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 51 | `prepareTime` | 准备时间 | `prepare_time` | Decimal |
| 52 | `procPlanCreate` | 工序作业计划创建 | `proc_plan_create` | Short |
| 53 | `procPlanId` | 工序作业计划ID | `proc_plan_id` | Long |
| 54 | `processDefineDts` | 工序自定义项特征组 | `define_cts` | 6d41a8d1-aee4-49ff-bf48-69e8f1edc2d6 |
| 55 | `processTime` | 加工时间 | `process_time` | Decimal |
| 56 | `processType` | 加工类型 | `process_type` | Short |
| 57 | `prodQty` | 计划生产件数 | `prod_qty` | Decimal |
| 58 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 59 | `pubts` | 时间戳 | `pubts` | DateTime |
| 60 | `qty` | 计划生产数量(主计量) | `qty` | Decimal |
| 61 | `reportWork` | 报告点 | `report_work` | Short |
| 62 | `reworkQty` | 计划返工数量 | `rework_qty` | Decimal |
| 63 | `reworkSubQty` | 计划返工件数 | `rework_sub_qty` | Decimal |
| 64 | `routingOperationId` | 工艺路线行ID | `route_operation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 65 | `sn` | 顺序号 | `sn` | Decimal |
| 66 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 67 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 68 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 69 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 70 | `transferProcplanProdQty` | 转工序作业计划件数数量(生产单位) | `transfer_procplan_prod_qty` | Decimal |
| 71 | `transferProcplanQty` | 转工序作业计划数量(主计量单位) | `transfer_procplan_qty` | Decimal |
| 72 | `trunOsmApplyQty` | 转委外申请数量 | `trun_osmapply_qty` | Decimal |
| 73 | `trunOsmQty` | 转委外数量 | `trun_osm_qty` | Decimal |
| 74 | `vendorAuth` | 委外供应商权限 | `vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 75 | `vendorId` | 委外商ID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 76 | `workCenterId` | 工作中心ID | `workCenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 77 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `finishGoodsId` | 完工库位ID | `aa.goodsposition.GoodsPosition` | Service |  |
| 2 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `operationControlId` | 工序控制码ID | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 5 | `vendorId` | 委外商ID | `aa.vendor.Vendor` | Service |  |
| 6 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 7 | `orderProductId` | 订单母件ID | `osm.OSMOrder.OSMOrderProduct` | None | true |
| 8 | `routingOperationId` | 工艺路线行ID | `ed.routing.RoutingOperation` | Service |  |
| 9 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 10 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
| 11 | `processDefineDts` | 工序自定义项特征组 | `po.order.ProcessDefineCharacteristics` | None |  |
| 12 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 13 | `executeOrgId` | 执行组织ID | `org.func.BaseOrg` | Service |  |
| 14 | `finishWarehouseId` | 完工仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 15 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 16 | `operationId` | 标准工序ID | `ed.operation.Operation` | Service |  |
| 17 | `outUnitId` | 产出单位ID | `pc.unit.Unit` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 19 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
