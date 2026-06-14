---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.procMoveRecord.ProcMoveRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转记录 (`sfc.procMoveRecord.ProcMoveRecord`)

> IMPSFC | 物理表：`imp_sfc_proc_move_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转记录 |
| 物理表 | `imp_sfc_proc_move_record` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:50.7670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（84个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `transferOrderProcessId` | 转出生产订单工序 | `transfer_order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 2 | `transferSplitNum2` | 分割转移数量(产出单位) | `transfer_split_num2` | Decimal |
| 3 | `transferSplitNum1` | 分割转移数量(生产单位) | `transfer_split_num1` | Decimal |
| 4 | `serviceDate` | 业务日期 | `service_date` | Date |
| 5 | `receiveTeamId` | 转入班组 | `receive_team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 6 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 7 | `receiveWarehouseId` | 转入存储地点 | `receive_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 8 | `reworkTeamId` | 返工责任班组 | `rework_team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `transferUserId` | 转出人 | `transfer_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 12 | `transferStandardProcessId` | 转出标准工序 | `transfer_standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 13 | `prodUnitId` | 生产单位 | `prod_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `receiveUserId` | 接收人 | `receive_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `receiveOrderProcessNo` | 转入工序顺序号 | `receive_order_process_no` | Decimal |
| 17 | `receiveStandardProcessId` | 转入标准工序 | `receive_standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 18 | `outBillCode` | 转出单据号 | `out_billcode` | String |
| 19 | `scrapType` | 报废类型 | `scrap_type` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 20 | `id` | ID | `id` | Long |
| 21 | `transferQualifiedNum2` | 转移合格数量(产出单位) | `transfer_qualified_num2` | Decimal |
| 22 | `reworkUserId` | 返工责任人 | `rework_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 23 | `transferQualifiedNum1` | 转移合格数量(生产单位) | `transfer_qualified_num1` | Decimal |
| 24 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 25 | `transferSplitNum` | 分割转移数量 | `transfer_split_num` | Decimal |
| 26 | `transferWorkcenterId` | 转出工作中心 | `transfer_workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 27 | `transferScrapNum` | 转移报废数量 | `transfer_scrap_num` | Decimal |
| 28 | `transferScrapNum1` | 转移报废数量(生产单位) | `transfer_scrap_num1` | Decimal |
| 29 | `transferScrapNum2` | 转移报废数量(产出单位) | `transfer_scrap_num2` | Decimal |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 31 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 32 | `orderProductId` | 生产订单行 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 33 | `transferOrderProcessNo` | 转出工序顺序号 | `transfer_order_process_no` | Decimal |
| 34 | `materialId` | 制造物料 | `material_id` | Long |
| 35 | `inBillLineNo` | 转入单据行号 | `in_lineno` | Decimal |
| 36 | `transferWarehouseId` | 转出存储地点 | `transfer_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 37 | `scrapTeamId` | 报废责任班组 | `scrap_team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 38 | `transferCostcenterId` | 转出成本中心 | `transfer_costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 39 | `billId` | 业务单据 | `bill_id` | Long |
| 40 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 41 | `inBillCode` | 转入单据号 | `in_billcode` | String |
| 42 | `transferTeamId` | 转出班组 | `transfer_team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 43 | `transferReworkNum2` | 转移返工数量(产出单位) | `transfer_rework_num2` | Decimal |
| 44 | `transferReworkNum1` | 转移返工数量(生产单位) | `transfer_rework_num1` | Decimal |
| 45 | `code` | 编码 | `code` | String |
| 46 | `receiveBatchId` | 转入批次 | `receive_batchid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 47 | `billLineNo` | 业务单据行号 | `bill_lineno` | String |
| 48 | `outBillLineNo` | 转出单据行号 | `out_lineno` | Decimal |
| 49 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 50 | `transferNum1` | 转移数量(生产单位) | `transfer_num1` | Decimal |
| 51 | `transferNum2` | 转移数量(产出单位) | `transfer_num2` | Decimal |
| 52 | `inBillType` | 转入单据类型 | `in_billtype` | String |
| 53 | `receiveOrderProcessId` | 转入生产订单工序 | `receive_order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 54 | `scrapUserId` | 报废负责人 | `scrap_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 55 | `outBillType` | 转出单据类型 | `out_billtype` | String |
| 56 | `transferBatchNo` | 转出批次号 | `transfer_batch_no` | String |
| 57 | `transferNum` | 转移数量 | `transfer_num` | Decimal |
| 58 | `transferGoodsId` | 转出库位 | `transfer_goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 59 | `unitId` | 主计量 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 60 | `pubts` | 时间戳 | `pubts` | DateTime |
| 61 | `receiveGoodsId` | 转入库位 | `receive_goods_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 62 | `createDate` | 创建日期 | `create_date` | Date |
| 63 | `transferQualifiedNum` | 转移合格数量 | `transfer_qualified_num` | Decimal |
| 64 | `creator` | 创建人名称 | `creator` | String |
| 65 | `receiveOrgId` | 转入组织 | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 66 | `inBillId` | 转入单据 | `in_billid` | Long |
| 67 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 68 | `billType` | 业务单据类型 | `bill_type` | String |
| 69 | `transferOrgId` | 转出组织 | `transfer_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 70 | `transferBatchId` | 转出批次 | `transfer_batchid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 71 | `outBillLineId` | 转出单据行 | `out_lineid` | Long |
| 72 | `billCode` | 业务单据编号 | `bill_code` | String |
| 73 | `billLineId` | 业务单据行 | `bill_lineid` | Long |
| 74 | `outputUnitId` | 产出单位 | `output_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 75 | `transferReworkNum` | 转移返工数量 | `transfer_rework_num` | Decimal |
| 76 | `receiveBatchNo` | 转入批次号 | `receive_batch_no` | String |
| 77 | `receiveCostcenterid` | 转入成本中心 | `receive_costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 78 | `outBillId` | 转出单据 | `out_billid` | Long |
| 79 | `createTime` | 创建时间 | `create_time` | DateTime |
| 80 | `inBillLineId` | 转入单据行 | `in_lineid` | Long |
| 81 | `reworkReason` | 返工原因 | `rework_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 82 | `receiveWorkcenterId` | 转入工作中心 | `receive_workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 83 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 84 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |

---

## 关联属性（38个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transferOrderProcessId` | 转出生产订单工序 | `po.order.OrderProcess` | Service |  |
| 2 | `receiveBatchId` | 转入批次 | `st.batchno.Batchno` | Service |  |
| 3 | `receiveTeamId` | 转入班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 4 | `orderId` | 生产订单 | `po.order.Order` | Service |  |
| 5 | `receiveWarehouseId` | 转入存储地点 | `aa.warehouse.Warehouse` | Service |  |
| 6 | `reworkTeamId` | 返工责任班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `transferUserId` | 转出人 | `bd.staff.Staff` | Service |  |
| 10 | `transferStandardProcessId` | 转出标准工序 | `ed.operation.Operation` | Service |  |
| 11 | `prodUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 12 | `receiveOrderProcessId` | 转入生产订单工序 | `po.order.OrderProcess` | Service |  |
| 13 | `scrapUserId` | 报废负责人 | `bd.staff.Staff` | Service |  |
| 14 | `receiveUserId` | 接收人 | `bd.staff.Staff` | Service |  |
| 15 | `receiveStandardProcessId` | 转入标准工序 | `ed.operation.Operation` | Service |  |
| 16 | `transferGoodsId` | 转出库位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 17 | `unitId` | 主计量 | `pc.unit.Unit` | Service |  |
| 18 | `scrapType` | 报废类型 | `aa.reason.Reason` | Service |  |
| 19 | `reworkUserId` | 返工责任人 | `bd.staff.Staff` | Service |  |
| 20 | `receiveGoodsId` | 转入库位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 21 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 22 | `transferWorkcenterId` | 转出工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 23 | `receiveOrgId` | 转入组织 | `org.func.BaseOrg` | Service |  |
| 24 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 25 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | Service |  |
| 26 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 27 | `transferOrgId` | 转出组织 | `org.func.BaseOrg` | Service |  |
| 28 | `transferBatchId` | 转出批次 | `st.batchno.Batchno` | Service |  |
| 29 | `orderProductId` | 生产订单行 | `po.order.OrderProduct` | Service |  |
| 30 | `outputUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 31 | `receiveCostcenterid` | 转入成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 32 | `scrapTeamId` | 报废责任班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 33 | `transferWarehouseId` | 转出存储地点 | `aa.warehouse.Warehouse` | Service |  |
| 34 | `transferCostcenterId` | 转出成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 35 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 36 | `reworkReason` | 返工原因 | `aa.reason.Reason` | Service |  |
| 37 | `receiveWorkcenterId` | 转入工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 38 | `transferTeamId` | 转出班组 | `bd.timemodel.TeamDefinition` | Service |  |
