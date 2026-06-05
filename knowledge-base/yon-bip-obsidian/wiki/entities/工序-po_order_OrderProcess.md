---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderProcess"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序 (`po.order.OrderProcess`)

> PO | 物理表：`po_order_process`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序 |
| 物理表 | `po_order_process` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:23:06.0500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（79个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `externalSystemAutoId` | 外部系统工序ID | `external_system_auto_id` | String |
| 2 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 3 | `vendorAuth` | 委外供应商权限 | `vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 4 | `id` | ID | `id` | Long |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `trunOsmQty` | 转委外数量 | `trun_osm_qty` | Decimal |
| 7 | `inspection` | 检验 | `inspection` | Boolean |
| 8 | `trunOsmApplyQty` | 转委外申请数量 | `trun_osmapply_qty` | Decimal |
| 9 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 10 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 11 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 14 | `osmSendQty` | 委外下达数量 | `osm_send_qty` | Decimal |
| 15 | `orderId` | 生产订单ID | `order_id` | Long |
| 16 | `orderProductId` | 生产订单行ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 17 | `processType` | 加工类型 | `process_type` | Short |
| 18 | `sn` | 顺序号 | `sn` | Decimal |
| 19 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 20 | `workCenterId` | 工作中心ID | `workCenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 21 | `operationControlId` | 工序控制码ID | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 22 | `mainUnitId` | 主计量单位ID | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `qty` | 计划生产数量 | `qty` | Decimal |
| 24 | `planStartDate` | 计划开工时间 | `plan_start_date` | DateTime |
| 25 | `planEndDate` | 计划完工时间 | `plan_end_date` | DateTime |
| 26 | `isOutsource` | 委外 | `is_outsource` | Short |
| 27 | `vendorId` | 委外商ID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 28 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 29 | `prepareTime` | 计划准备时间 | `prepare_time` | Decimal |
| 30 | `processTime` | 计划加工时间 | `process_time` | Decimal |
| 31 | `reportWork` | 报告点 | `report_work` | Short |
| 32 | `immediateHandover` | 自动交接 | `immediate_handover` | Short |
| 33 | `checkType` | 质检方式 | `check_type` | Short |
| 34 | `firstCheck` | 首检 | `first_check` | String |
| 35 | `occupyProduction` | 占用产能 | `occupy_production` | Short |
| 36 | `doScheduling` | 参与调度 | `do_scheduling` | Short |
| 37 | `computingCosts` | 计算成本 | `computing_costs` | Short |
| 38 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 39 | `executeOrgId` | 执行组织ID | `execute_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 40 | `preId` | 前序ID | `pre_id` | Long |
| 41 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 42 | `nextId` | 后序ID | `next_id` | Long |
| 43 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 44 | `finishWarehouseId` | 完工仓库ID | `finish_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 45 | `finishGoodsId` | 完工库位ID | `finish_goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 46 | `routingOperationId` | 工艺路线行ID | `route_operation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 47 | `procPlanCreate` | 工序作业计划创建 | `proc_plan_create` | Short |
| 48 | `procPlanId` | 工序作业计划ID | `proc_plan_id` | Long |
| 49 | `productionUnitId` | 生产单位ID | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 50 | `mainChangeRate` | 生产-主计量换算率 | `main_change_rate` | Decimal |
| 51 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 52 | `prodQty` | 计划生产件数 | `prod_qty` | Decimal |
| 53 | `outUnitId` | 产出单位ID | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 54 | `outChangeRate` | 产出-主计量换算率 | `out_change_rate` | Decimal |
| 55 | `outChangeType` | 换算方式 | `out_change_type` | ChangeType |
| 56 | `transferProcplanQty` | 转工序作业计划数量 | `transfer_procplan_qty` | Decimal |
| 57 | `transferProcplanProdQty` | 转工序作业计划件数 | `transfer_procplan_prod_qty` | Decimal |
| 58 | `sourceautoid` | 来源ID | `source_autoid` | Long |
| 59 | `processDefineDts` | 自定义项特征组 | `define_cts` | 6d41a8d1-aee4-49ff-bf48-69e8f1edc2d6 |
| 60 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 61 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 62 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 63 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 64 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 65 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 66 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 67 | `ecnUser` | 变更人 | `ecn_user` | String |
| 68 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 69 | `mainChangeRateDen` | 生产-主计量换算率分母 | `main_change_rateden` | Decimal |
| 70 | `mainChangeRateNum` | 生产-主计量换算率分子 | `main_change_ratenum` | Decimal |
| 71 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 72 | `opSequenceNum` | 工序序列 | `op_sequence_num` | Integer |
| 73 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 74 | `orderProcessAttrextItem` | 工序表自由自定义项 | `` | f8aad437-02c1-46dd-ad13-64d233388153 |
| 75 | `orderProcessUserdefItem` | 工序表固定自定义项 | `` | 4a58354d-e618-407f-b0a8-35d27b9f0d53 |
| 76 | `outChangeRateDen` | 产出-主计量换算率分母 | `out_change_rateden` | Decimal |
| 77 | `outChangeRateNum` | 产出-主计量换算率分子 | `out_change_ratenum` | Decimal |
| 78 | `reworkQty` | 计划返工数量 | `rework_qty` | Decimal |
| 79 | `reworkSubQty` | 计划返工件数 | `rework_sub_qty` | Decimal |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `finishGoodsId` | 完工库位ID | `aa.goodsposition.GoodsPosition` | Service |  |
| 2 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `orderProcessAttrextItem` | 工序表自由自定义项 | `po.order.OrderProcessAttrextItem` | None | true |
| 5 | `operationControlId` | 工序控制码ID | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 6 | `vendorId` | 委外商ID | `aa.vendor.Vendor` | Service |  |
| 7 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 8 | `orderProductId` | 生产订单行ID | `po.order.OrderProduct` | None | true |
| 9 | `routingOperationId` | 工艺路线行ID | `ed.routing.RoutingOperation` | Service |  |
| 10 | `productionUnitId` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 11 | `orderProcessUserdefItem` | 工序表固定自定义项 | `po.order.OrderProcessUserdefItem` | None | true |
| 12 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
| 13 | `processDefineDts` | 自定义项特征组 | `po.order.ProcessDefineCharacteristics` | None |  |
| 14 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 15 | `executeOrgId` | 执行组织ID | `org.func.BaseOrg` | Service |  |
| 16 | `finishWarehouseId` | 完工仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 17 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 18 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 19 | `outUnitId` | 产出单位ID | `pc.unit.Unit` | Service |  |
| 20 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 21 | `mainUnitId` | 主计量单位ID | `pc.unit.Unit` | Service |  |
