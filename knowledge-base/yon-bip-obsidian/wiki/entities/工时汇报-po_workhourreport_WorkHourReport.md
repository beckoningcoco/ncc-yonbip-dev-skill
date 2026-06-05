---
tags: ["BIP", "元数据", "数据字典", "PO", "po.workhourreport.WorkHourReport"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工时汇报 (`po.workhourreport.WorkHourReport`)

> PO | 物理表：`po_work_ho_report`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工时汇报 |
| 物理表 | `po_work_ho_report` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:54.6760` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（72个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `sourceDocCode` | 来源单据号 | `source_doc_code` | String |
| 3 | `teamId` | 班组 | `team_id` | d1ce258a-6311-4719-846d-998458841d05 |
| 4 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 5 | `staffId` | 员工 | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 6 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `writeOffEnable` | 冲销标识 | `write_off_enable` | Short |
| 8 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 9 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 10 | `writeOffStatus` | 冲销状态 | `write_off_status` | Integer |
| 11 | `writeOffSourceid` | 冲销线索主表ID | `write_off_sourceid` | Long |
| 12 | `writeOffUpcode` | 冲销单据号 | `write_off_upcode` | String |
| 13 | `writeOffReason` | 冲销原因 | `write_off_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 14 | `accountingDate` | 记账日期 | `accounting_date` | String |
| 15 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 16 | `orderCode` | 生产订单号 | `po_order_code` | String |
| 17 | `financeOrgId` | 会计主体组织 | `finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 18 | `remarks` | 备注 | `remarks` | String |
| 19 | `createType` | 创建方式 | `create_type` | Integer |
| 20 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 21 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 22 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 23 | `returncount` | 退回次数 | `returncount` | Short |
| 24 | `verifystate` | 审批状态 | `verifystate` | Short |
| 25 | `actualPrepareTime` | 实际准备工时 | `actual_prepare_time` | Decimal |
| 26 | `actualProcessTime` | 实际加工工时 | `actual_process_time` | Decimal |
| 27 | `auditDate` | 审批日期 | `audit_date` | Date |
| 28 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 29 | `auditor` | 审批人名称 | `auditor` | String |
| 30 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 31 | `batchNo` | 生产批次 | `batch_no` | String |
| 32 | `consumptionCategory` | 耗用类别 | `consumption_category` | Short |
| 33 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 34 | `createDate` | 创建日期 | `create_date` | Date |
| 35 | `createTime` | 创建时间 | `create_time` | DateTime |
| 36 | `creator` | 创建人名称 | `creator` | String |
| 37 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 38 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 0780ace0-62ed-45b6-a7aa-6abe375f0c56 |
| 39 | `id` | ID | `id` | Long |
| 40 | `lineNo` | 生产订单行号 | `line_no` | Decimal |
| 41 | `materialId` | 制造物料 | `material_id` | Long |
| 42 | `modifier` | 修改人名称 | `modifier` | String |
| 43 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 44 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 45 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 46 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 47 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 48 | `planPrepareTime` | 计划准备工时 | `plan_prepare_time` | Decimal |
| 49 | `planProcessTime` | 计划加工工时 | `plan_process_time` | Decimal |
| 50 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 51 | `productDeptId` | 生产部门 | `product_dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 52 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 53 | `productOrderId` | 生产订单ID | `product_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 54 | `productOrderLineId` | 生产订单行ID | `product_order_line_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 55 | `pubts` | 时间戳 | `pubts` | DateTime |
| 56 | `reportDefineCharacter` | 工时汇报自定义项 | `report_define_ct` | 5f075d17-18c6-46e5-9328-d59c58228db9 |
| 57 | `sn` | 顺序号 | `sn` | Decimal |
| 58 | `sourceDocId` | 来源单据号 | `source_doc_id` | Long |
| 59 | `sourceDocLineId` | 来源单据行号 | `source_doc_line_id` | Long |
| 60 | `sourceDocType` | 来源单据类型 | `source_doc_type` | String |
| 61 | `status` | 单据状态 | `status` | Short |
| 62 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 63 | `timeUnit` | 工时单位 | `time_unit` | Short |
| 64 | `tplid` | 模板id | `tplid` | Long |
| 65 | `virtualAccbodyId` | 利润中心 | `virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 66 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 67 | `workCategory` | 工时类别 | `work_category` | Short |
| 68 | `workCenter` | 工作中心 | `work_center` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 69 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 70 | `attrDefines` | 工时汇报自由自定义项 | `` | 9b976d21-0724-43ef-b038-4ad0e4a7217b |
| 71 | `defines` | 工时汇报固定自定义项 | `` | 1f5507c5-0399-41ff-8d48-196302eb936b |
| 72 | `workHourReportDetail` | 工时汇报明细 | `` | 0b87c8bd-f620-4fd6-97c9-d7a72bd4b8a8 |

---

## 关联属性（30个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `productOrderId` | 生产订单ID | `po.order.Order` | None |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `productDeptId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 8 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 9 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 10 | `defines` | 工时汇报固定自定义项 | `po.workhourreport.WorkHourReportDefine` | None | true |
| 11 | `productOrderLineId` | 生产订单行ID | `po.order.OrderProduct` | None |  |
| 12 | `writeOffReason` | 冲销原因 | `aa.reason.Reason` | Service |  |
| 13 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 14 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 15 | `reportDefineCharacter` | 工时汇报自定义项 | `po.workhourreport.ReportDefineCharacter` | None |  |
| 16 | `workHourReportDetail` | 工时汇报明细 | `po.workhourreport.WorkHourReportDetail` | None | true |
| 17 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 18 | `attrDefines` | 工时汇报自由自定义项 | `po.workhourreport.WorkHourReportAttrDefine` | None | true |
| 19 | `financeOrgId` | 会计主体组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 20 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 21 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 22 | `virtualAccbodyId` | 利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 23 | `workCenter` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 24 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 25 | `freeCharacteristics` | 自由项特征组 | `po.workhourreport.ReportFreeCharacteristics` | None |  |
| 26 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | None |  |
| 27 | `teamId` | 班组 | `bd.timemodel.TeamDefinition` | Service |  |
| 28 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 29 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 30 | `staffId` | 员工 | `bd.staff.Staff` | Service |  |
