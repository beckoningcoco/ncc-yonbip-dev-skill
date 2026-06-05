---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.reqchange.OsmReqProductChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单产品变更 (`osm.reqchange.OsmReqProductChange`)

> OSM | 物理表：`osm_req_product_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单产品变更 |
| 物理表 | `osm_req_product_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:53.2410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（118个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 2 | `associationOsmOrderProductId` | 关联行(废弃) | `association_osm_order_product_id` | Long |
| 3 | `backRemark` | 任务退回原因 | `back_remark` | String |
| 4 | `backTime` | 任务退回时间 | `back_time` | DateTime |
| 5 | `backUser` | 任务退回人 | `back_user` | String |
| 6 | `bizDocAutoId` | 业务单据子表id | `biz_doc_auto_id` | Long |
| 7 | `bizDocCode` | 业务单据号 | `biz_doc_code` | String |
| 8 | `bizDocId` | 业务单据id | `biz_doc_id` | Long |
| 9 | `bizDocLineNo` | 业务单据行号 | `biz_doc_line_no` | Decimal |
| 10 | `bizDocType` | 业务单据类型 | `biz_doc_type` | String |
| 11 | `bomOrgId` | bom组织 | `bom_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 12 | `bomQuantity` | BOM单位数量 | `bom_quantity` | Decimal |
| 13 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 14 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 15 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 16 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `bomVerId` | BOM版本 | `bom_ver_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 18 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 19 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 20 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 21 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 22 | `continuousOsm` | 连续委外(废弃) | `continuous_osm` | Boolean |
| 23 | `contractQtyDU` | 累计转合同件数 | `contract_qty_du` | Decimal |
| 24 | `contractQtyMU` | 累计转合同数量 | `contract_qty_mu` | Decimal |
| 25 | `coordRemark` | 协同失败原因 | `coord_remark` | String |
| 26 | `defineCharacteristicsPro` | 自定义项特征组 | `define_cts` | c5d9d626-75d3-4519-81d5-bb2677fa5181 |
| 27 | `demandQuantityDU` | 需求件数 | `demand_quantity_du` | Decimal |
| 28 | `demandQuantityMU` | 需求数量 | `demand_quantity_mu` | Decimal |
| 29 | `demandUnitId` | 需求单位 | `demand_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 30 | `endOp` | 末序 | `end_op` | Boolean |
| 31 | `entrustCustomer` | 受托客户 | `entrust_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 32 | `entrustProcessType` | 受托加工类型 | `entrust_process_type` | Short |
| 33 | `firstlineno` | 源头单据行号 | `first_line_no` | String |
| 34 | `firstsource` | 源头单据类型 | `first_source` | String |
| 35 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 36 | `firstsourceid` | 源头单据主表id | `first_source_id` | Long |
| 37 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 38 | `free1` | 规格1 | `free1` | String |
| 39 | `free10` | 规格10 | `free10` | String |
| 40 | `free2` | 规格2 | `free2` | String |
| 41 | `free3` | 规格3 | `free3` | String |
| 42 | `free4` | 规格4 | `free4` | String |
| 43 | `free5` | 规格5 | `free5` | String |
| 44 | `free6` | 规格6 | `free6` | String |
| 45 | `free7` | 规格7 | `free7` | String |
| 46 | `free8` | 规格8 | `free8` | String |
| 47 | `free9` | 规格9 | `free9` | String |
| 48 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 50d6da64-faad-4e24-b6cb-40b26ad4bbfa |
| 49 | `fromQuantity` | 从数量 | `from_quantity` | Decimal |
| 50 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 51 | `id` | id | `id` | Long |
| 52 | `lineNo` | 行号 | `line_no` | Decimal |
| 53 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 54 | `linecloseReasonId` | 关闭原因 | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 55 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 56 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 57 | `linecloser` | 行关闭人 | `linecloser` | String |
| 58 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 59 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 60 | `materialId` | 制造物料ID | `material_id` | Long |
| 61 | `nextId` | 后序ID | `next_id` | Long |
| 62 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 63 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 64 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 65 | `originalReqId` | 原委外申请单ID | `original_req_id` | 7d6905c0-a11a-44da-bad1-2990cbce269e |
| 66 | `originalReqProductId` | 原委外申请单行ID | `original_req_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 67 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 68 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 69 | `planOrderType` | 计划订单类型 | `plan_order_type` | Short |
| 70 | `preId` | 前序ID | `pre_id` | Long |
| 71 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 72 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 73 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 74 | `productionOrgId` | 生产组织 | `production_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 75 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 76 | `projectMaterialDetailId` | 项目物资清单明细ID | `project_material_detail_id` | String |
| 77 | `pubts` | 时间戳 | `pubts` | DateTime |
| 78 | `pushStatus` | 已下推任务 | `push_status` | Boolean |
| 79 | `quantityControl` | 数量控制 | `quantity_control` | Boolean |
| 80 | `rcvOrgId` | 收货组织 | `rcv_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 81 | `remark` | 备注 | `remark` | String |
| 82 | `reqExecStatus` | 执行状态 | `req_exec_status` | OsmReqExecStatus |
| 83 | `reqId` | 委外申请单ID | `req_id` | 32c4f8c4-e185-47d8-835b-019dba922d76 |
| 84 | `requisitionDate` | 需求日期 | `requisition_date` | Date |
| 85 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 86 | `rowno` | 序号 | `rowno` | Integer |
| 87 | `scrap` | 子件耗损率% | `scrap` | Decimal |
| 88 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 89 | `source` | 来源单据类型(推拉单) | `source` | String |
| 90 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 91 | `sourceLineNo` | 来源单据行号 | `source_line_no` | Decimal |
| 92 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 93 | `sourcePoOrderCode` | 来源生产订单号 | `source_po_order_code` | String |
| 94 | `sourcePoOrderId` | 来源生产订单ID | `source_po_order_id` | Long |
| 95 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 96 | `sourcePoOrderProductId` | 来源生产订单行ID | `source_po_order_product_id` | Long |
| 97 | `sourcePoOrderProductRowno` | 来源生产订单行号 | `source_po_order_product_rowno` | Decimal |
| 98 | `sourceSfcFlowCardId` | 来源工序流转卡工序id | `source_sfc_flow_card_id` | Long |
| 99 | `sourceSfcProcPlanId` | 来源工序作业计划行ID | `source_sfc_proc_plan_id` | Long |
| 100 | `sourceType` | 来源单据类型 | `source_type` | String |
| 101 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 102 | `sourceid` | 来源单据主表id | `sourceid` | Long |
| 103 | `startDate` | 开工日期 | `start_date` | DateTime |
| 104 | `subcontractOrgId` | 委外组织 | `subcontract_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 105 | `subcontractQuantityDU` | 累计转订单件数 | `subcontract_quantity_du` | Decimal |
| 106 | `subcontractQuantityMU` | 累计转订单数量 | `subcontract_quantity_mu` | Decimal |
| 107 | `subcontractRequisitionByProductChange` | 委外申请单联副产品变更 | `` | 986bbfa7-1437-4963-84fa-0f4dca9aaaa1 |
| 108 | `subcontractRequisitionId` | 委外申请单id | `subcontract_requisition_id` | 7d6905c0-a11a-44da-bad1-2990cbce269e |
| 109 | `subcontractRequisitionMaterialChange` | 委外申请单材料变更 | `` | 73665e43-d577-4e75-aa5e-a68e1c6cf044 |
| 110 | `subcontractRequisitionProcessChange` | 委外申请单工序变更 | `` | a322c148-6e5f-4300-9125-88aafb0ae8e0 |
| 111 | `suggestVendorId` | 建议委外商 | `suggest_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 112 | `toQuantity` | 到数量 | `to_quantity` | Decimal |
| 113 | `upcode` | 来源单据号 | `upcode` | String |
| 114 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 115 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 116 | `ycCoordStatus` | 云采协同状态 | `yc_coord_status` | Integer |
| 117 | `ycNeedId` | 采购需求ID | `yc_need_id` | Long |
| 118 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（29个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rcvOrgId` | 收货组织 | `aa.baseorg.OrgMV` | Service |  |
| 2 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 5 | `bomVerId` | BOM版本 | `ed.bom.Bom` | Service |  |
| 6 | `subcontractRequisitionByProductChange` | 委外申请单联副产品变更 | `osm.reqchange.OsmReqByproductChange` | None | true |
| 7 | `defineCharacteristicsPro` | 自定义项特征组 | `osm.reqchange.OsmReqProductDefineCharacteristics` | None |  |
| 8 | `entrustCustomer` | 受托客户 | `aa.merchant.Merchant` | Service |  |
| 9 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 10 | `suggestVendorId` | 建议委外商 | `aa.vendor.Vendor` | Service |  |
| 11 | `subcontractRequisitionMaterialChange` | 委外申请单材料变更 | `osm.reqchange.OsmReqMaterialChange` | None | true |
| 12 | `originalReqId` | 原委外申请单ID | `po.subcontractrequisition.SubcontractRequisition` | None |  |
| 13 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 14 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 15 | `demandUnitId` | 需求单位 | `pc.unit.Unit` | Service |  |
| 16 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 17 | `subcontractOrgId` | 委外组织 | `aa.baseorg.OrgMV` | Service |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 19 | `bomOrgId` | bom组织 | `aa.baseorg.OrgMV` | Service |  |
| 20 | `linecloseReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 21 | `subcontractRequisitionProcessChange` | 委外申请单工序变更 | `osm.reqchange.OsmReqProcessChange` | None | true |
| 22 | `originalReqProductId` | 原委外申请单行ID | `po.subcontractrequisition.SubcontractRequisitionProduct` | None |  |
| 23 | `reqId` | 委外申请单ID | `osm.reqchange.OsmReqChange` | None | true |
| 24 | `freeCharacteristics` | 自由项特征组 | `osm.reqchange.OsmReqProductChangeFreeCharacteristics` | None |  |
| 25 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 26 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 27 | `subcontractRequisitionId` | 委外申请单id | `po.subcontractrequisition.SubcontractRequisition` | None |  |
| 28 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 29 | `productionOrgId` | 生产组织 | `org.func.BaseOrg` | Service |  |
