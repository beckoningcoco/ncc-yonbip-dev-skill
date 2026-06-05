---
tags: ["BIP", "元数据", "数据字典", "PO", "po.processoutput.ProcessOutput"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序产量 (`po.processoutput.ProcessOutput`)

> PO | 物理表：`po_process_output`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序产量 |
| 物理表 | `po_process_output` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:45.6160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（68个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `quantityType` | 数量类型 | `quantity_type` | Short |
| 2 | `reason` | 原因 | `reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 3 | `rProductionDepartmentId` | 责任生产部门 | `r_production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 4 | `cOrgId` | 对方组织 | `c_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `orderId` | 生产订单Id | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 6 | `modifier` | 修改人名称 | `modifier` | String |
| 7 | `cTeamId` | 对方班组 | `c_team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `cWorkCenterId` | 对方工作中心Id | `c_work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 10 | `cUserId` | 对方人员 | `c_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 11 | `sourceCode` | 来源单据号 | `source_code` | String |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `workCenterId` | 工作中心Id | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 14 | `id` | ID | `id` | Long |
| 15 | `cCostCenterId` | 对方成本中心Id | `c_cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 16 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `defineDts` | 自定义项特征组 | `define_dts` | 4ad92265-414f-4685-81a1-1a9e439715ca |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 20 | `isEndSn` | 末序 | `is_end_sn` | Boolean |
| 21 | `out_sys_code` | 外部来源编码 | `out_sys_code` | String |
| 22 | `rWorkCenterId` | 责任工作中心Id | `r_work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 23 | `orderProductId` | 生产订单行Id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 24 | `orderProcessId` | 工序Id | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 25 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 26 | `sourceType` | 来源单据类型 | `source_type` | Short |
| 27 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 28 | `cProductionDepartmentId` | 对方生产部门 | `c_production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 29 | `rCostCenterId` | 责任成本中心Id | `r_cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 30 | `isHeadSn` | 首序 | `is_head_sn` | Boolean |
| 31 | `sourceLineNo` | 来源单据行号 | `source_line_no` | String |
| 32 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `rOrderProcessId` | 责任工序Id | `r_order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 34 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 35 | `rUserId` | 责任人员 | `r_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 36 | `businessDate` | 业务日期 | `business_date` | Date |
| 37 | `costCenterId` | 成本中心Id | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 38 | `cOrderProcessId` | 对方工序Id | `c_order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 39 | `rOrgId` | 责任组织 | `r_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 40 | `processType` | 工序业务类型 | `process_type` | Short |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime |
| 42 | `out_sys_type` | 外部来源类型 | `out_sys_type` | String |
| 43 | `createDate` | 创建日期 | `create_date` | Date |
| 44 | `creator` | 创建人名称 | `creator` | String |
| 45 | `quantity` | 数量 | `quantity` | Decimal |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 47 | `isOutsource` | 委外 | `is_outsource` | Boolean |
| 48 | `out_sys_id` | 外部来源线索 | `out_sys_id` | String |
| 49 | `userId` | 人员 | `user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 50 | `sourceDocId` | 来源单据ID | `source_doc_id` | Long |
| 51 | `rTeamId` | 责任班组 | `r_team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 52 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 0a0cd172-63a1-4e90-b497-a29554a16a7e |
| 53 | `createTime` | 创建时间 | `create_time` | DateTime |
| 54 | `out_sys_version` | 外部来源版本 | `out_sys_version` | String |
| 55 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 56 | `sourceDetailId` | 来源单据行ID | `source_detail_id` | Long |
| 57 | `transferType` | 转移类型 | `transfer_type` | Short |
| 58 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 59 | `cFinanceOrgId` | 对方会计主体组织 | `c_finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 60 | `financeOrgId` | 会计主体组织 | `finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 61 | `opSequenceId` | 工序序列ID | `op_sequence_id` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 62 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 63 | `sourceDocClueId` | 来源单据线索Id | `source_doc_clue_id` | Long |
| 64 | `sourceOrderCode` | 来源订单号 | `source_order_code` | String |
| 65 | `sourceOrderDetailId` | 来源订单行ID | `source_order_detail_id` | Long |
| 66 | `sourceOrderDocId` | 来源订单ID | `source_order_doc_id` | Long |
| 67 | `sourceOrderLineNo` | 来源订单行号 | `source_order_line_no` | String |
| 68 | `sourceOrderType` | 来源订单类型 | `source_order_type` | Short |

---

## 关联属性（36个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `reason` | 原因 | `aa.reason.Reason` | Service |  |
| 2 | `rProductionDepartmentId` | 责任生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 3 | `cOrgId` | 对方组织 | `aa.baseorg.OrgMV` | Service |  |
| 4 | `rCostCenterId` | 责任成本中心Id | `bd.costcenter.CostCenter` | Service |  |
| 5 | `orderId` | 生产订单Id | `po.order.Order` | None |  |
| 6 | `cTeamId` | 对方班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `cWorkCenterId` | 对方工作中心Id | `ed.workcenter.WorkCenter` | Service |  |
| 10 | `rOrderProcessId` | 责任工序Id | `po.order.OrderProcess` | None |  |
| 11 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
| 12 | `rUserId` | 责任人员 | `bd.staff.Staff` | Service |  |
| 13 | `cUserId` | 对方人员 | `bd.staff.Staff` | Service |  |
| 14 | `cFinanceOrgId` | 对方会计主体组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 15 | `costCenterId` | 成本中心Id | `bd.costcenter.CostCenter` | Service |  |
| 16 | `cOrderProcessId` | 对方工序Id | `po.order.OrderProcess` | None |  |
| 17 | `workCenterId` | 工作中心Id | `ed.workcenter.WorkCenter` | Service |  |
| 18 | `rOrgId` | 责任组织 | `aa.baseorg.OrgMV` | Service |  |
| 19 | `cCostCenterId` | 对方成本中心Id | `bd.costcenter.CostCenter` | Service |  |
| 20 | `defineDts` | 自定义项特征组 | `po.processoutput.ProcessOutputDefineCharacteristics` | None |  |
| 21 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 22 | `financeOrgId` | 会计主体组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 23 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 24 | `opSequenceId` | 工序序列ID | `po.order.OrderOpSequence` | None |  |
| 25 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 26 | `rWorkCenterId` | 责任工作中心Id | `ed.workcenter.WorkCenter` | Service |  |
| 27 | `orderProductId` | 生产订单行Id | `po.order.OrderProduct` | None |  |
| 28 | `userId` | 人员 | `bd.staff.Staff` | Service |  |
| 29 | `rTeamId` | 责任班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 30 | `freeCharacteristics` | 自由项特征组 | `po.processoutput.ProcessOutputFreeCharacteristics` | None |  |
| 31 | `orderProcessId` | 工序Id | `po.order.OrderProcess` | None |  |
| 32 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 33 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 34 | `cProductionDepartmentId` | 对方生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 35 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 36 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
