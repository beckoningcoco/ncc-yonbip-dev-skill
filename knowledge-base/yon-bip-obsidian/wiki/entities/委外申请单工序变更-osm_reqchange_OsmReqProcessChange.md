---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.reqchange.OsmReqProcessChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单工序变更 (`osm.reqchange.OsmReqProcessChange`)

> OSM | 物理表：`osm_req_process_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单工序变更 |
| 物理表 | `osm_req_process_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:55.5470` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（58个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 2 | `checkType` | 质检方式 | `check_type` | Short |
| 3 | `computingCosts` | 计算成本 | `computing_costs` | Short |
| 4 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 5 | `doScheduling` | 参与调度 | `do_scheduling` | Short |
| 6 | `executeOrgId` | 执行组织ID | `execute_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 7 | `finishGoodsId` | 完工库位ID | `finish_goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 8 | `finishWarehouseId` | 完工仓库ID | `finish_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 9 | `firstCheck` | 首检 | `first_check` | Short |
| 10 | `id` | id | `id` | Long |
| 11 | `immediateHandover` | 即时交接 | `immediate_handover` | Short |
| 12 | `inspection` | 检验 | `inspection` | Boolean |
| 13 | `isOutsource` | 委外 | `is_outsource` | Short |
| 14 | `mainChangeRate` | 生产-主计量换算率 | `main_change_rate` | Decimal |
| 15 | `mainChangeRateDen` | 生产-主计量换算率分母 | `main_change_rateden` | Decimal |
| 16 | `mainChangeRateNum` | 生产-主计量换算率分子 | `main_change_ratenum` | Decimal |
| 17 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `nextId` | 后序ID | `next_id` | Long |
| 19 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 20 | `occupyProduction` | 占用产能 | `occupy_production` | Short |
| 21 | `operationControlId` | 工序控制码ID | `operation_control_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 22 | `operationId` | 工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 23 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 24 | `originalReqProcessId` | 原委外申请单工序ID | `original_req_process_id` | e8543cf3-c89d-40ac-8ef2-369317b016f2 |
| 25 | `originalReqProductId` | 原委外申请行ID | `original_req_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 26 | `outChangeRate` | 换算率 | `out_change_rate` | Decimal |
| 27 | `outChangeRateDen` | 换算率分母 | `out_change_rateden` | Decimal |
| 28 | `outChangeRateNum` | 换算率分子 | `out_change_ratenum` | Decimal |
| 29 | `outChangeType` | 换算方式 | `out_change_type` | ChangeType |
| 30 | `outUnitId` | 产出单位ID | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `planEndDate` | 计划完工时间 | `plan_end_date` | DateTime |
| 32 | `planStartDate` | 计划开工时间 | `plan_start_date` | DateTime |
| 33 | `preId` | 前序ID | `pre_id` | Long |
| 34 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 35 | `prepareTime` | 准备时间 | `prepare_time` | Decimal |
| 36 | `procPlanCreate` | 工序作业计划创建 | `proc_plan_create` | Short |
| 37 | `procPlanId` | 工序作业计划ID | `proc_plan_id` | Long |
| 38 | `processDefineDts` | 自定义项特征组 | `define_cts` | 29e088ec-f9fa-49ab-b0ca-e532bcf4e5eb |
| 39 | `processTime` | 加工时间 | `process_time` | Decimal |
| 40 | `processType` | 加工类型 | `process_type` | Short |
| 41 | `prodQty` | 计划生产件数 | `prod_qty` | Decimal |
| 42 | `productionUnitId` | 工序产出单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 43 | `pubts` | 时间戳 | `pubts` | DateTime |
| 44 | `qty` | 计划生产数量 | `qty` | Decimal |
| 45 | `reportWork` | 报工 | `report_work` | Short |
| 46 | `reqProductId` | 产品id | `req_product_id` | 3b18adf7-8938-4841-b5af-5f11d4a5b9b0 |
| 47 | `routingOperationId` | 工艺路线行ID | `route_operation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 48 | `sn` | 顺序号 | `sn` | Decimal |
| 49 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 50 | `subcontractRequisitionId` | 委外申请单id | `subcontract_requisition_id` | Long |
| 51 | `subcontractRequisitionProductId` | 委外申请单行ID | `subcontract_requisition_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 52 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 53 | `transferProcplanProdQty` | 转工序作业计划件数数量（生产单位） | `transfer_procplan_prod_qty` | Decimal |
| 54 | `transferProcplanQty` | 转工序作业计划数量（主计量单位） | `transfer_procplan_qty` | Decimal |
| 55 | `vendorAuth` | 委外供应商权限 | `vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 56 | `vendorId` | 委外商ID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 57 | `workCenterId` | 工作中心ID | `workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 58 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `finishGoodsId` | 完工库位ID | `aa.goodsposition.GoodsPosition` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `operationControlId` | 工序控制码ID | `ed.operationcontrolcode.OperationControlCode` | Service |  |
| 4 | `vendorId` | 委外商ID | `aa.vendor.Vendor` | Service |  |
| 5 | `vendorAuth` | 委外供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 6 | `routingOperationId` | 工艺路线行ID | `ed.routing.RoutingOperation` | Service |  |
| 7 | `reqProductId` | 产品id | `osm.reqchange.OsmReqProductChange` | None | true |
| 8 | `productionUnitId` | 工序产出单位 | `pc.unit.Unit` | Service |  |
| 9 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
| 10 | `originalReqProductId` | 原委外申请行ID | `po.subcontractrequisition.SubcontractRequisitionProduct` | None |  |
| 11 | `processDefineDts` | 自定义项特征组 | `osm.reqchange.OsmReqProcessChangeDefineCharacteristics` | None |  |
| 12 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 13 | `executeOrgId` | 执行组织ID | `org.func.BaseOrg` | Service |  |
| 14 | `finishWarehouseId` | 完工仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 15 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 16 | `operationId` | 工序 | `ed.operation.Operation` | Service |  |
| 17 | `subcontractRequisitionProductId` | 委外申请单行ID | `po.subcontractrequisition.SubcontractRequisitionProduct` | None |  |
| 18 | `originalReqProcessId` | 原委外申请单工序ID | `po.subcontractrequisition.SubcontractRequisitionProcess` | None |  |
| 19 | `outUnitId` | 产出单位ID | `pc.unit.Unit` | Service |  |
| 20 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
