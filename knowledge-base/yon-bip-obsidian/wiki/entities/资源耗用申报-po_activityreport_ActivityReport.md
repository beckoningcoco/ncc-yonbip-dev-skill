---
tags: ["BIP", "元数据", "数据字典", "PO", "po.activityreport.ActivityReport"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 资源耗用申报 (`po.activityreport.ActivityReport`)

> PO | 物理表：`po_activity_report`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资源耗用申报 |
| 物理表 | `po_activity_report` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:56.2890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（66个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `fiEventAccountingDate` | 会计事务记账日期 | `fiEventAccountingDate` | String |
| 2 | `fiEventCode` | 会计事务类型编码 | `fiEventCode` | String |
| 3 | `fiEventDataId` | 会计事务数据ID | `fiEventDataId` | String |
| 4 | `fiEventId` | 会计事务类型ID | `fiEventId` | String |
| 5 | `selfDefineCharacter` | 资源耗用申报自定义项特征属性 | `self_define_character` | a26e135d-93dc-4079-a9b8-0a2e2eb61b7c |
| 6 | `financeOrgId` | 会计主体组织 | `finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 7 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 8 | `createType` | 创建方式 | `create_type` | Short |
| 9 | `writeOffEnable` | 启用冲销 | `write_off_enable` | Short |
| 10 | `writeOffStatus` | 冲销状态 | `write_off_status` | Short |
| 11 | `writeOffSourceid` | 冲销线索主表id | `write_off_sourceid` | Long |
| 12 | `writeOffUpcode` | 冲销单据号 | `write_off_upcode` | String |
| 13 | `writeOffReason` | 冲销原因 | `write_off_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 14 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 15 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 16 | `sourceType` | 来源上级单据类型 | `source_type` | String |
| 17 | `postAccountStatus` | 过账状态 | `postAccountStatus` | Short |
| 18 | `postAccountVersion` | 过账版本 | `postAccountVersion` | Long |
| 19 | `printCount` | 打印次数 | `printCount` | Integer |
| 20 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 21 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 22 | `tplid` | 模板id | `tplid` | Long |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `id` | ID | `id` | Long |
| 25 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 26 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 27 | `activityReportType` | 汇报类型 | `activity_report_type` | Integer |
| 28 | `code` | 单据编号 | `code` | String |
| 29 | `status` | 单据状态 | `status` | Short |
| 30 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 31 | `operatorId` | 报告人 | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 32 | `vouchdate` | 汇报时间 | `vouchdate` | Date |
| 33 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 34 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 35 | `orderProductId` | 生产订单行 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 36 | `materialId` | 制造物料 | `material_id` | Long |
| 37 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 38 | `skuId` | 物料SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 39 | `quantity` | 加工数量 | `quantity` | Decimal |
| 40 | `mainUnitId` | 主单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 41 | `direction` | 方向 | `direction` | Integer |
| 42 | `reportMethod` | 申报方式 | `report_method` | String |
| 43 | `memo` | 备注 | `memo` | String |
| 44 | `createDate` | 创建日期 | `create_date` | Date |
| 45 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 46 | `auditDate` | 审核日期 | `audit_date` | Date |
| 47 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 6d517e70-75d7-4b2d-b614-b7770c5f4f15 |
| 48 | `pubts` | 时间戳 | `pubts` | DateTime |
| 49 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 50 | `verifystate` | 审批状态 | `verifystate` | Short |
| 51 | `returncount` | 退回次数 | `returncount` | Short |
| 52 | `barCode` | 单据条码 | `bar_code` | String |
| 53 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 54 | `isFlowCoreBill` | 是否核心单据 | `isFlowCoreBill` | Boolean |
| 55 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 56 | `creator` | 创建人 | `creator` | String |
| 57 | `createTime` | 创建时间 | `create_time` | DateTime |
| 58 | `modifierId` | 最后修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 59 | `modifier` | 最后修改人 | `modifier` | String |
| 60 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 61 | `auditorId` | 审核人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 62 | `auditor` | 审核人 | `auditor` | String |
| 63 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 64 | `activityReportDetail` | 资源耗用申报明细 | `` | 5002246f-ca10-4198-b74b-982cad6d9426 |
| 65 | `activityReportExtItem` | 表头自由自定义项 | `` | 9d4c6967-7ec1-43ba-af5b-38c11ba6ccef |
| 66 | `activityReportUserdefItem` | 表头固定自定义项 | `` | 2b43fd8a-a231-40fd-babe-a888fc7811f6 |

---

## 关联属性（27个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `orderId` | 生产订单 | `po.order.Order` | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 最后修改人 | `base.user.User` | Service |  |
| 5 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 6 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 7 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 8 | `writeOffReason` | 冲销原因 | `aa.reason.Reason` | Service |  |
| 9 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 10 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 11 | `activityReportUserdefItem` | 表头固定自定义项 | `po.activityreport.ActivityReportUserdefItem` | None | true |
| 12 | `operatorId` | 报告人 | `bd.staff.Staff` | Service |  |
| 13 | `skuId` | 物料SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 15 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
| 16 | `financeOrgId` | 会计主体组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 17 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 18 | `selfDefineCharacter` | 资源耗用申报自定义项特征属性 | `po.activityreport.ActivityReportSelfDefineCharacter` | None |  |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 20 | `orderProductId` | 生产订单行 | `po.order.OrderProduct` | None |  |
| 21 | `activityReportDetail` | 资源耗用申报明细 | `po.activityreport.ActivityReportDetail` | None | true |
| 22 | `auditorId` | 审核人 | `base.user.User` | Service |  |
| 23 | `freeCharacteristics` | 自由项特征组 | `po.activityreport.ActivityReportFreeCharacter` | None |  |
| 24 | `activityReportExtItem` | 表头自由自定义项 | `po.activityreport.ActivityReportExtItem` | None | true |
| 25 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 26 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 27 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
