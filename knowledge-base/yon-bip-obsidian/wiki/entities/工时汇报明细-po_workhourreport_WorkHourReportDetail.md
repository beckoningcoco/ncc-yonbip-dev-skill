---
tags: ["BIP", "元数据", "数据字典", "PO", "po.workhourreport.WorkHourReportDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工时汇报明细 (`po.workhourreport.WorkHourReportDetail`)

> PO | 物理表：`po_work_ho_report_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工时汇报明细 |
| 物理表 | `po_work_ho_report_detail` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:37.5950` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（56个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `workHourReportId` | 工时汇报ID | `work_hour_report_id` | 5434487b-0a65-4748-8c2f-b412a70fc748 |
| 2 | `productOrderId` | 生产订单ID | `product_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 3 | `productOrderLineId` | 生产订单行ID | `product_order_line_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 4 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `sourceDocLineNo` | 来源单据行号 | `source_doc_line_no` | Decimal |
| 6 | `shiftId` | 班次 | `shift_id` | 566d5ab9-aeca-4f63-a0d1-1b98a161c6bc |
| 7 | `writeOffSourceid` | 冲销线索主表ID | `write_off_sourceid` | Long |
| 8 | `writeOffUpcode` | 冲销单据号 | `write_off_upcode` | String |
| 9 | `writeOffSourceautoid` | 冲销线索子表ID | `write_off_sourceautoid` | Long |
| 10 | `writeOffUplineno` | 冲销单据行号 | `write_off_uplineno` | Decimal |
| 11 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 12 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 13 | `source` | 上游单据类型 | `source` | String |
| 14 | `upcode` | 上游单据号 | `upcode` | String |
| 15 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 16 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 17 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 18 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 19 | `consumptionCategory` | 耗用类别 | `consumption_category` | Short |
| 20 | `workCategory` | 工时类别 | `work_category` | Short |
| 21 | `timeUnit` | 工时单位 | `time_unit` | Short |
| 22 | `planPrepareTime` | 计划准备工时 | `plan_prepare_time` | Decimal |
| 23 | `planProcessTime` | 计划加工工时 | `plan_process_time` | Decimal |
| 24 | `actualPrepareTime` | 实际准备工时 | `actual_prepare_time` | Decimal |
| 25 | `actualProcessTime` | 实际加工工时 | `actual_process_time` | Decimal |
| 26 | `productDeptId` | 生产部门 | `product_dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 27 | `workCenter` | 工作中心 | `work_center` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 28 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 29 | `sn` | 顺序号 | `sn` | Decimal |
| 30 | `orderLineNo` | 生产订单行号 | `order_line_no` | Decimal |
| 31 | `sourceDocType` | 来源单据类型 | `source_doc_type` | String |
| 32 | `sourceDocId` | 来源单据id | `source_doc_id` | Long |
| 33 | `sourceDocLineId` | 来源单据行id | `source_doc_line_id` | Long |
| 34 | `sourceDocCode` | 来源单据号 | `source_doc_code` | String |
| 35 | `batchNo` | 生产批次 | `batch_no` | String |
| 36 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 37 | `virtualAccbodyId` | 利润中心 | `virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 38 | `staffId` | 员工 | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 39 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 40 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 41 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 42 | `orderCode` | 生产订单号 | `po_order_code` | String |
| 43 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 3a5db427-8ac3-4cdc-9c69-32e8a3637cb1 |
| 44 | `selfDefineCharacter` | 工时汇报明细自定义项 | `report_detail_define_ct` | b65b8805-9728-4e0c-a2f3-4f2e3074ae6f |
| 45 | `financeOrgId` | 会计主体组织 | `finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 46 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 47 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 48 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 49 | `lineno` | 行号 | `lineno` | Decimal |
| 50 | `rowno` | 序号 | `rowno` | Integer |
| 51 | `id` | 主键 | `id` | Long |
| 52 | `pubts` | 时间戳 | `pubts` | DateTime |
| 53 | `sourceAutoNo` | 上游单据子表行号 | `source_auto_no` | Decimal |
| 54 | `sourceGrandchildrenId` | 上游单据孙表ID | `source_grand_children_id` | Long |
| 55 | `sourceGrandchildrenNo` | 上游单据孙表行号 | `source_grand_children_no` | Decimal |
| 56 | `standardProcessId` | 标准工序 | `standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |

---

## 关联属性（22个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `financeOrgId` | 会计主体组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 2 | `shiftId` | 班次 | `calendar.platformShift.PlatformShift` | Service |  |
| 3 | `standardProcessId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 4 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 5 | `selfDefineCharacter` | 工时汇报明细自定义项 | `po.workhourreport.ReportDetailDefineCharacter` | None |  |
| 6 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `virtualAccbodyId` | 利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 9 | `productOrderId` | 生产订单ID | `po.order.Order` | None |  |
| 10 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 11 | `productDeptId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 12 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 13 | `workHourReportId` | 工时汇报ID | `po.workhourreport.WorkHourReport` | None | true |
| 14 | `workCenter` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 15 | `productOrderLineId` | 生产订单行ID | `po.order.OrderProduct` | None |  |
| 16 | `freeCharacteristics` | 自由项特征组 | `po.workhourreport.ReportDetailFreeCharacteristics` | None |  |
| 17 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | None |  |
| 18 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 19 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 20 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 21 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 22 | `staffId` | 员工 | `bd.staff.Staff` | Service |  |
