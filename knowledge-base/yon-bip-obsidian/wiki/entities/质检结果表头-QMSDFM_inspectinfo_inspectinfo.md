---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectinfo.inspectinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质检结果表头 (`QMSDFM.inspectinfo.inspectinfo`)

> QIC | 物理表：`qms_dfm_inspectinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质检结果表头 |
| 物理表 | `qms_dfm_inspectinfo` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:45.7660` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `srcbillcode` | String | 请检来源单据号 |

---

## 直接属性（83个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `createDate` | 创建日期 | `create_date` | Date |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `freect_h` | 表头自由项特征组实体 | `freect_h` | dbc09f3f-9d94-4805-933b-3785d34a220c |
| 7 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `creator` | 创建人 | `creator` | String |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `orderProcessSn` | 工序顺序号 | `order_process_sn` | String |
| 13 | `valid_until` | 有效期至 | `valid_until` | Date |
| 14 | `product_date` | 生产日期 | `product_date` | Date |
| 15 | `orderProcessId` | 工序 | `order_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 16 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 17 | `shelflife` | 保质期 | `shelflife` | String |
| 18 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 19 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 20 | `multiInspectStatus` | 多版本检验状态 | `multi_inspectstatus` | Short |
| 21 | `shelflife_unit` | 保质期单位 | `shelflife_unit` | String |
| 22 | `h_define1` | 检验前批次号属性1 | `h_define1` | String |
| 23 | `h_define3` | 检验前批次号属性3 | `h_define3` | String |
| 24 | `h_define4` | 检验前批次号属性4 | `h_define4` | String |
| 25 | `h_define5` | 检验前批次号属性5 | `h_define5` | String |
| 26 | `h_define6` | 检验前批次号属性6 | `h_define6` | String |
| 27 | `h_define7` | 检验前批次号属性7 | `h_define7` | String |
| 28 | `h_define8` | 检验前批次号属性8 | `h_define8` | String |
| 29 | `h_define9` | 检验前批次号属性9 | `h_define9` | String |
| 30 | `h_define10` | 检验前批次号属性10 | `h_define10` | String |
| 31 | `h_define11` | 检验前批次号属性11 | `h_define11` | String |
| 32 | `h_define12` | 检验前批次号属性12 | `h_define12` | String |
| 33 | `h_define13` | 检验前批次号属性13 | `h_define13` | String |
| 34 | `h_define14` | 检验前批次号属性14 | `h_define14` | String |
| 35 | `h_define15` | 检验前批次号属性15 | `h_define15` | String |
| 36 | `h_define16` | 检验前批次号属性16 | `h_define16` | String |
| 37 | `h_define17` | 检验前批次号属性17 | `h_define17` | String |
| 38 | `h_define18` | 检验前批次号属性18 | `h_define18` | String |
| 39 | `h_define19` | 检验前批次号属性19 | `h_define19` | String |
| 40 | `h_define20` | 检验前批次号属性20 | `h_define20` | String |
| 41 | `h_define21` | 检验前批次号属性21 | `h_define21` | String |
| 42 | `h_define22` | 检验前批次号属性22 | `h_define22` | String |
| 43 | `h_define23` | 检验前批次号属性23 | `h_define23` | String |
| 44 | `h_define24` | 检验前批次号属性24 | `h_define24` | String |
| 45 | `h_define25` | 检验前批次号属性25 | `h_define25` | String |
| 46 | `h_define26` | 检验前批次号属性26 | `h_define26` | String |
| 47 | `h_define27` | 检验前批次号属性27 | `h_define27` | String |
| 48 | `h_define28` | 检验前批次号属性28 | `h_define28` | String |
| 49 | `h_define29` | 检验前批次号属性29 | `h_define29` | String |
| 50 | `h_define30` | 检验前批次号属性30 | `h_define30` | String |
| 51 | `checkType` | 检验类型 | `checkType` | String |
| 52 | `h_define2` | 检验前批次号属性2 | `h_define2` | String |
| 53 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 54 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 55 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 56 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 57 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 58 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 59 | `modifier` | 修改人 | `modifier` | String |
| 60 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 61 | `pk_dept` | 部门ID | `pk_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 62 | `pk_org` | 请检组织ID | `pk_org` | 598482c6-0ad7-493a-b944-5493a8b9fb8e |
| 63 | `batchno` | 批次号 | `batchno` | String |
| 64 | `srcbilltype` | 请检来源单据类型 | `srcbilltype` | String |
| 65 | `pk_materialsku` | 物料SKU | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 66 | `srcbillcode` | 请检来源单据号 | `srcbillcode` | String |
| 67 | `pk_material` | 物料ID | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 68 | `amount` | 数量 | `amount` | Decimal |
| 69 | `srcrowno` | 请检来源单据行号 | `srcrowno` | String |
| 70 | `srcid` | 请检来源单据ID | `srcid` | String |
| 71 | `srcbid` | 请检来源单据行ID | `srcbid` | String |
| 72 | `num` | 累计检验数量 | `num` | Decimal |
| 73 | `pk_unit` | 主计量ID | `pk_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 74 | `businessdate` | 业务日期 | `businessdate` | DateTime |
| 75 | `firstrowID` | 请检源头单据行ID | `firstrowID` | String |
| 76 | `firstID` | 请检源头单据ID | `firstID` | String |
| 77 | `firstbilltype` | 请检源头单据类型 | `firstbilltype` | String |
| 78 | `firstbillcode` | 请检源头单据号 | `firstbillcode` | String |
| 79 | `firstrowno` | 请检源头单据行号 | `firstrowno` | String |
| 80 | `pubts` | 时间戳 | `pubts` | DateTime |
| 81 | `src_num` | 来源单据行数量 | `src_num` | Decimal |
| 82 | `detailList` | 处理结果明细 | `` | 4c689e62-6856-4782-8816-ed511f092e68 |
| 83 | `resultList` | 处理结果 | `` | 8b4f0ba8-d789-45d8-8576-1805da6eb5cd |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `pk_unit` | 主计量ID | `pc.unit.Unit` | Service |  |
| 7 | `pk_org` | 请检组织ID | `bd.adminOrg.InventoryOrgVO` | Service |  |
| 8 | `pk_materialsku` | 物料SKU | `pc.product.ProductSKU` | Service |  |
| 9 | `pk_material` | 物料ID | `pc.product.Product` | Service |  |
| 10 | `freect_h` | 表头自由项特征组实体 | `QMSDFM.inspectinfo.InspectInfoFree` | None |  |
| 11 | `pk_dept` | 部门ID | `bd.adminOrg.DeptOrgVO` | Service |  |
| 12 | `orderProcessId` | 工序 | `ed.operation.Operation` | Service |  |
| 13 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 14 | `detailList` | 处理结果明细 | `QMSDFM.inspectinfo.inspectresultdetail` | None | true |
| 15 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 16 | `resultList` | 处理结果 | `QMSDFM.inspectinfo.inspectresult` | None | true |
