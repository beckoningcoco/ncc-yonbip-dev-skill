---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.passbill.passbill"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 紧急放行单 (`QMSQIT.passbill.passbill`)

> QMSQIT | 物理表：`qms_qit_passbill`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 紧急放行单 |
| 物理表 | `qms_qit_passbill` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:06.5130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 紧急放行单号 |

---

## 直接属性（64个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `pk_productdept` | 生产部门 | `pk_productdept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `definect_h` | 表头自定义项特征 | `definect_h` | 21207bae-72f6-4b4d-9fbb-2f405dce9f59 |
| 4 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 5 | `tplid` | 模板id | `tplid` | Long |
| 6 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 7 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 8 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 9 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 10 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 11 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 12 | `pk_material` | 物料 | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `printCount` | 打印次数 | `printCount` | Integer |
| 14 | `previewPrintCount` | 预览打印次数 | `previewPrintCount` | Integer |
| 15 | `directPrintCount` | 直接打印次数 | `directPrintCount` | Integer |
| 16 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 17 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 20 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 21 | `status` | 单据状态 | `status` | Short |
| 22 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 23 | `creator` | 创建人id | `creator` | String |
| 24 | `modifier` | 修改人id | `modifier` | String |
| 25 | `checktype` | 检验类型 | `checktype` | String |
| 26 | `auditor` | 审批人 | `auditor` | String |
| 27 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 28 | `pk_org` | 质检组织id | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 29 | `id` | ID | `id` | String |
| 30 | `code` | 紧急放行单号 | `code` | String |
| 31 | `bustype` | 交易类型id | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 32 | `verifystate` | 单据状态 | `verifystate` | Short |
| 33 | `pk_stockorg` | 库存组织id | `pk_stockorg` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 34 | `pk_applyorg` | 申请组织id | `pk_applyorg` | 14302233-1394-4a70-94e1-bed51636f312 |
| 35 | `pk_applydept` | 申请部门id | `pk_applydept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 36 | `pk_applypsn` | 申请人id | `pk_applypsn` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 37 | `applydate` | 申请日期 | `applydate` | Date |
| 38 | `pk_puorg` | 采购组织id | `pk_puorg` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 39 | `pk_supplier` | 供应商id | `pk_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 40 | `pk_pudept` | 采购部门id | `pk_pudept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 41 | `pk_pupsn` | 采购员id | `pk_pupsn` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 42 | `sourcebillid` | 来源单据主键 | `sourcebillid` | String |
| 43 | `sourcebilltype` | 来源单据类型 | `sourcebilltype` | String |
| 44 | `sourcebillcode` | 来源单据号 | `sourcebillcode` | String |
| 45 | `applyreason` | 申请原因 | `applyreason` | String |
| 46 | `sourcedate` | 来源业务日期 | `sourcedate` | Date |
| 47 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 48 | `returncount` | 退回次数 | `returncount` | Short |
| 49 | `tenant` | 租户ID | `tenant_id` | String |
| 50 | `dr` | 逻辑删除标记 | `dr` | Short |
| 51 | `pubts` | 时间戳 | `pubts` | DateTime |
| 52 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 53 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 54 | `createTime` | 创建时间 | `create_time` | DateTime |
| 55 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 56 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 57 | `auditDate` | 审批日期 | `audit_date` | Date |
| 58 | `fbillstatus` | 单据状态 | `fbillstatus` | Integer |
| 59 | `defines` | 紧急放行单表头自定义项 | `` | 3ddd27c8-9c31-44a6-bfed-b37d7119dda7 |
| 60 | `qam_passbill_bList` | 紧急放行单表体 | `` | cf02fe1f-63c6-43ae-a9c4-10b33ff5947c |
| 61 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 62 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 63 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 64 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_applyorg` | 申请组织id | `org.func.BaseOrg` | Service |  |
| 2 | `pk_puorg` | 采购组织id | `org.func.PurchaseOrg` | Service |  |
| 3 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 7 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 8 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 9 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 10 | `pk_org` | 质检组织id | `org.func.QualityOrg` | Service |  |
| 11 | `defines` | 紧急放行单表头自定义项 | `QMSQIT.passbill.passbill_define` | None | true |
| 12 | `pk_supplier` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 13 | `pk_material` | 物料 | `pc.product.Product` | Service |  |
| 14 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 15 | `pk_pupsn` | 采购员id | `bd.staff.Staff` | Service |  |
| 16 | `pk_applypsn` | 申请人id | `bd.staff.Staff` | Service |  |
| 17 | `definect_h` | 表头自定义项特征 | `QMSQIT.passbill.PassbillDefineCharacter` | None |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 19 | `pk_productdept` | 生产部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 20 | `bustype` | 交易类型id | `bd.bill.TransType` | Service |  |
| 21 | `qam_passbill_bList` | 紧急放行单表体 | `QMSQIT.passbill.passbill_b` | None | true |
| 22 | `pk_applydept` | 申请部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 23 | `pk_pudept` | 采购部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 24 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 25 | `pk_stockorg` | 库存组织id | `org.func.InventoryOrg` | Service |  |
| 26 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
