---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplepreparation.SamplePreparation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 制样单 (`QMSQIT.samplepreparation.SamplePreparation`)

> QMSQIT | 物理表：`qms_qit_sample_preparation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 制样单 |
| 物理表 | `qms_qit_sample_preparation` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:41:58.4330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（60个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `orgId` | 质检组织id | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 单据编号 | `code` | String |
| 5 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 6 | `sampleDate` | 制样日期 | `sample_date` | Date |
| 7 | `status` | 单据状态 | `status` | String |
| 8 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 9 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 10 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 11 | `batchNo` | 批次号id | `batch_no` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 12 | `freeCts` | 自由特征组实体 | `free_cts` | 80150792-6dc4-40d7-b697-1e899807fc3b |
| 13 | `vendor` | 供应商 | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 14 | `operation` | 工序 | `operation` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 15 | `merchant` | 客户 | `merchant` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 16 | `sampleNum` | 制样个数 | `sample_num` | Integer |
| 17 | `sampleQuantity` | 制样数量 | `sample_quantity` | Decimal |
| 18 | `sampleUnit` | 制样单位 | `sample_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `sampleUser` | 制样人 | `sample_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 20 | `sampleDepartment` | 制样部门 | `sample_department` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 21 | `inspectionType` | 检验类型 | `inspection_type` | String |
| 22 | `inspectApplyCode` | 请检申请单号 | `inspect_apply_code` | String |
| 23 | `inspectApplyId` | 检验申请id | `inspect_apply_id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 24 | `requestInspectType` | 请检来源单据类型 | `request_inspect_type` | String |
| 25 | `requestInspectCode` | 请检来源单据号 | `request_inspect_code` | String |
| 26 | `requestInspectLineNo` | 请检来源单据行号 | `request_inspect_line_no` | Integer |
| 27 | `originBillType` | 源头单据类型 | `origin_bill_type` | String |
| 28 | `originBillCode` | 源头单据号 | `origin_bill_code` | String |
| 29 | `originBillLineNo` | 源头单据行号 | `origin_bill_line_no` | Integer |
| 30 | `headDct` | 自定义项实体 | `head_dct` | 4ff23198-1248-44dc-a0b6-d90cbcc1fccc |
| 31 | `samplePreparationPlan` | 制样方案 | `sample_preparation_plan` | d0c92763-f04e-4002-9fbb-7e88ab1acdf0 |
| 32 | `inspectStepId` | 检验步骤 | `inspect_step_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 33 | `documentId` | 源头单据id | `document_id` | String |
| 34 | `batchNoId` | 批次号 | `batch_no_id` | String |
| 35 | `dr` | 逻辑删除标记 | `dr` | Short |
| 36 | `createTime` | 创建时间 | `create_time` | DateTime |
| 37 | `createDate` | 创建日期 | `create_date` | Date |
| 38 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 39 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 40 | `creator` | 创建人名称 | `creator` | String |
| 41 | `modifier` | 修改人名称 | `modifier` | String |
| 42 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 43 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 44 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 45 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 46 | `source` | 上游单据类型 | `source` | String |
| 47 | `upcode` | 上游单据号 | `upcode` | String |
| 48 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 49 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 50 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 51 | `auditor` | 审批人名称 | `auditor` | String |
| 52 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 53 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 54 | `auditDate` | 审批日期 | `audit_date` | Date |
| 55 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 56 | `verifystate` | 审批状态 | `verifystate` | Short |
| 57 | `returncount` | 退回次数 | `returncount` | Short |
| 58 | `pubts` | 时间戳 | `pubts` | DateTime |
| 59 | `sampleDetailList` | 制样信息 | `` | 913fedde-5ffc-489d-8967-aa9b4c6d5c64 |
| 60 | `samplePrepareStepList` | 制样步骤 | `` | 5011f1d9-1d67-4995-a201-366677f7255f |

---

## 关联属性（22个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `batchNo` | 批次号id | `st.batchno.Batchno` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `sampleDepartment` | 制样部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `sampleUnit` | 制样单位 | `pc.unit.Unit` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `merchant` | 客户 | `aa.merchant.Merchant` | Service |  |
| 9 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 10 | `samplePreparationPlan` | 制样方案 | `QMSQIT.samplepreparationplan.SamplePreparationPlan` | None |  |
| 11 | `orgId` | 质检组织id | `org.func.QualityOrg` | Service |  |
| 12 | `inspectStepId` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 13 | `headDct` | 自定义项实体 | `QMSQIT.samplepreparation.SamplePreparationDCT` | None |  |
| 14 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 15 | `samplePrepareStepList` | 制样步骤 | `QMSQIT.samplepreparation.SamplePrepareStep` | None | true |
| 16 | `freeCts` | 自由特征组实体 | `QMSQIT.samplepreparation.SamplePreparationFCT` | None |  |
| 17 | `vendor` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 18 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 19 | `sampleDetailList` | 制样信息 | `QMSQIT.samplepreparation.SampleDetail` | None | true |
| 20 | `inspectApplyId` | 检验申请id | `QMSQIT.LLCheckApply.LLCheckApply` | None |  |
| 21 | `operation` | 工序 | `ed.operation.Operation` | Service |  |
| 22 | `sampleUser` | 制样人 | `bd.staff.Staff` | Service |  |
