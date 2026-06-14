---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractrequisition.SubcontractRequisitionProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单行 (`po.subcontractrequisition.SubcontractRequisitionProduct`)

> OSM | 物理表：`po_subcontract_requisition_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单行 |
| 物理表 | `po_subcontract_requisition_product` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:43.6530` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（117个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 2 | `contractQtyDU` | 累计转合同件数 | `contract_qty_du` | Decimal |
| 3 | `contractQtyMU` | 累计转合同数量 | `contract_qty_mu` | Decimal |
| 4 | `firstsourceid` | 源头单据主表id | `first_source_id` | Long |
| 5 | `fromQuantity` | 从数量 | `from_quantity` | Decimal |
| 6 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 7 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 8 | `quantityControl` | 数量控制 | `quantity_control` | Boolean |
| 9 | `toQuantity` | 到数量 | `to_quantity` | Decimal |
| 10 | `defineCharacteristicsPro` | 自定义项特征组 | `define_cts` | 4ad24a70-6292-4bb2-a488-e5b67af13777 |
| 11 | `firstlineno` | 源头单据行号 | `first_line_no` | String |
| 12 | `pushStatus` | 已下推任务 | `push_status` | Boolean |
| 13 | `backRemark` | 任务退回原因 | `back_remark` | String |
| 14 | `ycNeedId` | 采购需求ID | `yc_need_id` | Long |
| 15 | `ycCoordStatus` | 云采协同状态 | `yc_coord_status` | Integer |
| 16 | `coordRemark` | 协同失败原因 | `coord_remark` | String |
| 17 | `backTime` | 任务退回时间 | `back_time` | DateTime |
| 18 | `backUser` | 任务退回人 | `back_user` | String |
| 19 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 20 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 21 | `preId` | 前序ID | `pre_id` | Long |
| 22 | `nextId` | 后序ID | `next_id` | Long |
| 23 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 24 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 25 | `endOp` | 末序 | `end_op` | Boolean |
| 26 | `sourcePoOrderCode` | 来源生产订单号 | `source_po_order_code` | String |
| 27 | `sourcePoOrderProductRowno` | 来源生产订单行号 | `source_po_order_product_rowno` | Decimal |
| 28 | `sourcePoOrderId` | 来源生产订单ID | `source_po_order_id` | Long |
| 29 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 30 | `sourceSfcProcPlanId` | 来源工序作业计划行ID | `source_sfc_proc_plan_id` | Long |
| 31 | `sourcePoOrderProductId` | 来源生产订单行ID | `source_po_order_product_id` | Long |
| 32 | `continuousOsm` | 连续委外 | `continuous_osm` | Boolean |
| 33 | `associationOsmOrderProductId` | 关联行 | `association_osm_order_product_id` | Long |
| 34 | `productionOrgId` | 生产组织 | `production_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 35 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 36 | `sourceSfcFlowCardId` | 来源工序流转卡工序id | `source_sfc_flow_card_id` | Long |
| 37 | `suggestVendorId` | 建议委外商 | `suggest_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 38 | `reqExecStatus` | 执行状态 | `req_exec_status` | OsmReqExecStatus |
| 39 | `projectMaterialDetailId` | 项目物资清单明细ID | `project_material_detail_id` | String |
| 40 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 41 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 42 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 43 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 44 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 45 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 46 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 76dbe54c-b89d-4574-aa7f-1f0fe6421625 |
| 47 | `sourceLineNo` | 来源单据行号 | `source_line_no` | Decimal |
| 48 | `bomQuantity` | BOM单位数量 | `bom_quantity` | Decimal |
| 49 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 50 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 51 | `lineNo` | 行号 | `line_no` | Decimal |
| 52 | `subcontractRequisitionId` | 单据id | `subcontract_requisition_id` | 7d6905c0-a11a-44da-bad1-2990cbce269e |
| 53 | `id` | ID | `id` | Long |
| 54 | `materialId` | 制造物料id | `material_id` | Long |
| 55 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 56 | `skuId` | SKU编码id | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 57 | `demandQuantityMU` | 需求数量 | `demand_quantity_mu` | Decimal |
| 58 | `mainUnitId` | 主计量ID | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 59 | `demandQuantityDU` | 需求件数 | `demand_quantity_du` | Decimal |
| 60 | `demandUnitId` | 需求单位ID | `demand_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 61 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 62 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 63 | `scrap` | 废品率 | `scrap` | Decimal |
| 64 | `requisitionDate` | 需求日期 | `requisition_date` | Date |
| 65 | `bomOrgId` | BOM组织id | `bom_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 66 | `bomVerId` | bom版本Id | `bom_ver_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 67 | `rcvOrgId` | 收货组织id | `rcv_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 68 | `warehouseId` | 仓库Id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 69 | `subcontractOrgId` | 委外组织id | `subcontract_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 70 | `firstsource` | 源头单据类型 | `first_source` | String |
| 71 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 72 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 73 | `sourceType` | 来源单据类型 | `source_type` | String |
| 74 | `source` | 来源单据类型(推拉单) | `source` | String |
| 75 | `sourceid` | 来源单据主表id | `sourceid` | Long |
| 76 | `upcode` | 来源单据号 | `upcode` | String |
| 77 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 78 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 79 | `subcontractQuantityMU` | 累计转订单数量 | `subcontract_quantity_mu` | Decimal |
| 80 | `subcontractQuantityDU` | 累计转订单件数 | `subcontract_quantity_du` | Decimal |
| 81 | `linecloseReasonId` | 行关闭原因ID | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 82 | `linecloser` | 行关闭人 | `linecloser` | String |
| 83 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 84 | `remark` | 备注 | `remark` | String |
| 85 | `free1` | 物料规格1 | `free1` | String |
| 86 | `free2` | 物料规格2 | `free2` | String |
| 87 | `free3` | 物料规格3 | `free3` | String |
| 88 | `free4` | 香雪产地 | `free4` | String |
| 89 | `free5` | 组织 | `free5` | String |
| 90 | `free6` | 物料规格6 | `free6` | String |
| 91 | `free7` | 物料规格7 | `free7` | String |
| 92 | `free8` | 物料规格8 | `free8` | String |
| 93 | `free9` | 物料规格9 | `free9` | String |
| 94 | `free10` | 物料规格10 | `free10` | String |
| 95 | `pubts` | 时间戳 | `pubts` | DateTime |
| 96 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 97 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 98 | `rowno` | 行号 | `rowno` | Integer |
| 99 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 100 | `planOrderType` | 计划订单类型 | `plan_order_type` | Short |
| 101 | `bizDocAutoId` | 业务单据子表id | `biz_doc_auto_id` | Long |
| 102 | `bizDocCode` | 业务单据号 | `biz_doc_code` | String |
| 103 | `bizDocId` | 业务单据id | `biz_doc_id` | Long |
| 104 | `bizDocLineNo` | 业务单据行号 | `biz_doc_line_no` | Decimal |
| 105 | `bizDocType` | 业务单据类型 | `biz_doc_type` | String |
| 106 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 107 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 108 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 109 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 110 | `entrustCustomer` | 受托客户 | `entrust_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 111 | `entrustProcessType` | 受托加工类型 | `entrust_process_type` | Short |
| 112 | `orderProductUserdefItem` | 产品表固定自定义项 | `` | 3c4e97a7-fe77-4d7f-9a71-339efa5f58ea |
| 113 | `productExtItem` | 产品自由自定义项 | `` | 4877a17e-6df6-426d-96e5-3b53d1abf92c |
| 114 | `startDate` | 开工日期 | `start_date` | DateTime |
| 115 | `subcontractRequisitionByProduct` | 委外申请单联副产品 | `` | 0d81bc02-b4d6-486f-bdfc-7702f35c8aee |
| 116 | `subcontractRequisitionMaterial` | 委外申请单行材料 | `` | 183e1151-4f0f-4e80-8b78-20b1480dc8bb |
| 117 | `subcontractRequisitionProcess` | 工序 | `` | e8543cf3-c89d-40ac-8ef2-369317b016f2 |

---

## 关联属性（28个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rcvOrgId` | 收货组织id | `aa.baseorg.OrgMV` | Service |  |
| 2 | `productExtItem` | 产品自由自定义项 | `po.subcontractrequisition.SubcontractRequisitionProductExtItem` | None | true |
| 3 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `subcontractRequisitionProcess` | 工序 | `po.subcontractrequisition.SubcontractRequisitionProcess` | None | true |
| 7 | `bomVerId` | bom版本Id | `ed.bom.Bom` | Service |  |
| 8 | `defineCharacteristicsPro` | 自定义项特征组 | `po.subcontractrequisition.ProductDefineCharacteristics` | None |  |
| 9 | `entrustCustomer` | 受托客户 | `aa.merchant.Merchant` | Service |  |
| 10 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 11 | `suggestVendorId` | 建议委外商 | `aa.vendor.Vendor` | Service |  |
| 12 | `subcontractRequisitionByProduct` | 委外申请单联副产品 | `po.subcontractrequisition.SubcontractRequisitionByProduct` | None | true |
| 13 | `skuId` | SKU编码id | `pc.product.ProductSKU` | Service |  |
| 14 | `mainUnitId` | 主计量ID | `pc.unit.Unit` | Service |  |
| 15 | `demandUnitId` | 需求单位ID | `pc.unit.Unit` | Service |  |
| 16 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 17 | `subcontractOrgId` | 委外组织id | `aa.baseorg.OrgMV` | Service |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 19 | `bomOrgId` | BOM组织id | `aa.baseorg.OrgMV` | Service |  |
| 20 | `linecloseReasonId` | 行关闭原因ID | `aa.reason.Reason` | Service |  |
| 21 | `subcontractRequisitionMaterial` | 委外申请单行材料 | `po.subcontractrequisition.SubcontractRequisitionMaterial` | None | true |
| 22 | `freeCharacteristics` | 自由项特征组 | `po.subcontractrequisition.ProductFreeCharacteristics` | None |  |
| 23 | `warehouseId` | 仓库Id | `aa.warehouse.Warehouse` | Service |  |
| 24 | `orderProductUserdefItem` | 产品表固定自定义项 | `po.subcontractrequisition.SubcontractRequisitionProductDefine` | None | true |
| 25 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 26 | `subcontractRequisitionId` | 单据id | `po.subcontractrequisition.SubcontractRequisition` | None | true |
| 27 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 28 | `productionOrgId` | 生产组织 | `org.func.BaseOrg` | Service |  |
