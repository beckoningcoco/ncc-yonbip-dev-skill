---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.originalrecord.OriginalRecordHead"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 原始记录 (`QMSQIT.originalrecord.OriginalRecordHead`)

> QMSQIT | 物理表：`qms_qit_originalrecord_h`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 原始记录 |
| 物理表 | `qms_qit_originalrecord_h` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:41:53.6940` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（71个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 质检组织id | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 单据编号 | `code` | String |
| 6 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 8 | `sourceRowId` | 请检来源单据行id | `source_row_id` | String |
| 9 | `judgmentResult` | 判定结果 | `judgment_result` | String |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `inspectDate` | 检验日期 | `inspect_date` | Date |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `dynamicInspectionPlanId` | 动态检验方案id | `dynamic_inspection_plan_id` | f9c8adf8-5485-417b-bb35-f242b0995126 |
| 14 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 15 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 16 | `batchNoId` | 批次号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 17 | `inspectDept` | 检验部门 | `inspect_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 18 | `sourceOriRecordId` | 来源原始记录id | `source_ori_record_id` | Long |
| 19 | `checkOrg` | 请检组织 | `check_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 20 | `checkNumber` | 请检数量 | `check_number` | Decimal |
| 21 | `operationSequence` | 工序顺序号 | `operation_sequence` | String |
| 22 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 23 | `inspectStepOrder` | 检验步骤顺序 | `inspect_step_order` | Integer |
| 24 | `tplid` | 模板id | `tplid` | Long |
| 25 | `status` | 单据状态 | `status` | Short |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short |
| 27 | `sourceCode` | 请检来源单据号 | `source_code` | String |
| 28 | `reinspectReason` | 复验原因 | `reinspect_reason` | String |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 30 | `inspectionPlanId` | 检验方案id | `inspection_plan_id` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 31 | `checkApplyId` | 检验申请id | `checkapply_id` | String |
| 32 | `definect_h` | 自定义项特征 | `definect_h` | 99af7907-3d48-4019-bdf4-b07047f924a6 |
| 33 | `checkType` | 检验类型 | `check_type` | String |
| 34 | `batchNo` | 批次号 | `batch_no` | String |
| 35 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 36 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 37 | `inspectionStepConfig` | 检验步骤配置id | `inspection_step_config` | d793bf8a-3e9f-444b-a8ac-5f95511b2a46 |
| 38 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 39 | `sampleId` | 样品id | `sample_id` | 8ae568a3-5aa6-44ed-8283-9fe5a36cf435 |
| 40 | `vsourceId` | 来源单据id | `vsource_id` | String |
| 41 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 42 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 43 | `inspectNum` | 检验数量 | `inspect_num` | Decimal |
| 44 | `checkApplyCode` | 检验申请单号 | `checkapply_code` | String |
| 45 | `isNeedResample` | 是否需重新取样 | `is_need_resample` | Short |
| 46 | `returncount` | 退回次数 | `returncount` | Short |
| 47 | `verifystate` | 审批状态 | `verifystate` | Short |
| 48 | `supplierId` | 供应商ID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 49 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 50 | `inspecterId` | 检验员id | `inspecter_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 51 | `customId` | 客户id | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 52 | `freect_h` | 自由项特征组实体 | `freect_h` | aa8dbc09-f6fe-4f16-b3a9-864886b477f4 |
| 53 | `processId` | 工序id | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 54 | `resampleMoment` | 重新取样时机 | `resample_moment` | String |
| 55 | `isReinspectRecord` | 是否复验记录 | `is_reinspectrecord` | Short |
| 56 | `unitId` | 计量单位id | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 57 | `sourceRowNo` | 请检来源单据行号 | `source_rowno` | String |
| 58 | `checkPlanDetailId` | 检验方案主表id | `checkplan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 59 | `pubts` | 时间戳 | `pubts` | DateTime |
| 60 | `auditDate` | 审批日期 | `audit_date` | Date |
| 61 | `createDate` | 创建日期 | `create_date` | Date |
| 62 | `currentStage` | 当前检验阶段 | `current_stage` | String |
| 63 | `creator` | 创建人名称 | `creator` | String |
| 64 | `auditor` | 审批人名称 | `auditor` | String |
| 65 | `inspectStep` | 检验步骤 | `inspect_step` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 66 | `createTime` | 创建时间 | `create_time` | DateTime |
| 67 | `sourceBillId` | 请检来源单据id | `source_bill_id` | String |
| 68 | `isNeedReinspect` | 是否需复验 | `is_need_reinspect` | Short |
| 69 | `OriginalRecordBodyList` | 原始记录检验信息 | `` | 2f3c0bbe-d860-4c86-a9ea-e6cb44ee68ea |
| 70 | `OriginalRecordEquipmentList` | 原始记录检验仪器设备 | `` | bf986381-d38d-469f-a8bc-9b735ab971a3 |
| 71 | `OriginalRecordMethodList` | 原始记录检测方法 | `` | af649b28-a601-4a36-bbe0-40e03c337e92 |

---

## 关联属性（28个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierId` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 2 | `inspecterId` | 检验员id | `bd.staff.Staff` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 6 | `customId` | 客户id | `aa.merchant.Merchant` | Service |  |
| 7 | `dynamicInspectionPlanId` | 动态检验方案id | `QMSQIT.dynamicinspectplan.DynamicInspectPlan` | None |  |
| 8 | `orgId` | 质检组织id | `org.func.QualityOrg` | Service |  |
| 9 | `freect_h` | 自由项特征组实体 | `QMSQIT.originalrecord.OriginalRecordFree` | None |  |
| 10 | `processId` | 工序id | `ed.operation.Operation` | Service |  |
| 11 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 12 | `unitId` | 计量单位id | `pc.unit.Unit` | Service |  |
| 13 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 14 | `inspectionPlanId` | 检验方案id | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 15 | `definect_h` | 自定义项特征 | `QMSQIT.originalrecord.OriginalRecordHDefineCharacter` | None |  |
| 16 | `inspectDept` | 检验部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 17 | `OriginalRecordMethodList` | 原始记录检测方法 | `QMSQIT.originalrecord.OriginalRecordInspectMethod` | None | true |
| 18 | `inspectionStepConfig` | 检验步骤配置id | `QMSQIT.inspectionstepconfig.InspectionStepConfig` | None |  |
| 19 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 20 | `sampleId` | 样品id | `QMSQIT.samplerecord.SampleRecord` | None |  |
| 21 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 22 | `checkOrg` | 请检组织 | `org.func.BaseOrg` | Service |  |
| 23 | `inspectStep` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 24 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 25 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 26 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 27 | `OriginalRecordBodyList` | 原始记录检验信息 | `QMSQIT.originalrecord.OriginalRecordBody` | None | true |
| 28 | `OriginalRecordEquipmentList` | 原始记录检验仪器设备 | `QMSQIT.originalrecord.OriginalRecordEquipment` | None | true |
