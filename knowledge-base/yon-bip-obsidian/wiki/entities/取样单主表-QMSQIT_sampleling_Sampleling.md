---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.sampleling.Sampleling"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 取样单主表 (`QMSQIT.sampleling.Sampleling`)

> QMSQIT | 物理表：`qms_qit_sampleling`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取样单主表 |
| 物理表 | `qms_qit_sampleling` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:01.4070` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `code` | String | 编码 |

---

## 直接属性（59个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 6 | `samplelingDate` | 取样日期 | `sampleling_date` | Date |
| 7 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `batchNo` | 批次 | `batch_no` | String |
| 9 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 10 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 11 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 12 | `standardProcessId` | 标准工序 | `standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 13 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 14 | `samplelingNumber` | 样品个数 | `sampleling_number` | Integer |
| 15 | `samplelingUser` | 取样人 | `sampleling_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 16 | `samplelingDept` | 取样部门 | `sampleling_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 17 | `checkType` | 检验类型 | `check_type` | String |
| 18 | `sourceDocLineNo` | 来源单据行号 | `source_doc_line_no` | Integer |
| 19 | `checkApplicationCode` | 请检申请单号 | `check_application_code` | String |
| 20 | `checkSourceBillType` | 请检来源单据类型 | `check_source_bill_type` | String |
| 21 | `checkSourceBillCode` | 请检来源单据号 | `check_source_bill_code` | String |
| 22 | `checkSourceBillLineNo` | 请检来源单据行号 | `check_source_bill_line_no` | Integer |
| 23 | `sourceBillType` | 源头单据类型 | `source_bill_type` | String |
| 24 | `sourceBillCode` | 源头单据号 | `source_bill_code` | String |
| 25 | `sourceBillLineNo` | 源头单据行号 | `source_bill_line_no` | Integer |
| 26 | `userDefineCharacterHead` | 自定义项实体 | `head_dct` | 3000c3a7-369a-4100-9eca-78fb166f303c |
| 27 | `freeCharacteristics` | 自由特征组实体 | `free_characteristics` | 90fad4b8-5755-4d2e-956c-3a1171b7a305 |
| 28 | `samplingPlan` | 取样方案 | `sampling_plan` | 5961aff7-b759-4498-a39b-6aef93301023 |
| 29 | `checkOrderDoc` | 检验申请单号 | `check_order_doc` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 30 | `makingSample` | 制样 | `making_sample` | Short |
| 31 | `originalRecord` | 原始记录 | `original_record` | Short |
| 32 | `isRetestSampling` | 是否复验取样 | `is_retest_sampling` | Short |
| 33 | `documentId` | 源头单据id | `document_id` | String |
| 34 | `batchNoId` | 批次号id | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 35 | `dr` | 逻辑删除标记 | `dr` | Short |
| 36 | `auditor` | 审批人名称 | `auditor` | String |
| 37 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 38 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 39 | `auditDate` | 审批日期 | `audit_date` | Date |
| 40 | `createTime` | 创建时间 | `create_time` | DateTime |
| 41 | `createDate` | 创建日期 | `create_date` | Date |
| 42 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 43 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 44 | `creator` | 创建人名称 | `creator` | String |
| 45 | `modifier` | 修改人名称 | `modifier` | String |
| 46 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 47 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 48 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 49 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 50 | `source` | 上游单据类型 | `source` | String |
| 51 | `upcode` | 上游单据号 | `upcode` | String |
| 52 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 53 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 54 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 55 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 56 | `verifystate` | 审批状态 | `verifystate` | Short |
| 57 | `returncount` | 退回次数 | `returncount` | Short |
| 58 | `pubts` | 时间戳 | `pubts` | DateTime |
| 59 | `detailList` | 取样信息 | `` | 4046195b-50a5-4d5d-bfe9-f66ea72c7858 |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `samplelingUser` | 取样人 | `bd.staff.Staff` | Service |  |
| 2 | `standardProcessId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 3 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `samplelingDept` | 取样部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 9 | `checkOrderDoc` | 检验申请单号 | `QMSQIT.LLCheckApply.LLCheckApply` | None |  |
| 10 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 11 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 12 | `samplingPlan` | 取样方案 | `QMSQIT.samplingplan.SamplingPlan` | None |  |
| 13 | `userDefineCharacterHead` | 自定义项实体 | `QMSQIT.sampleling.SamplelingDCT` | None |  |
| 14 | `batchNoId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 15 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 16 | `freeCharacteristics` | 自由特征组实体 | `QMSQIT.sampleling.SamplelingFCT` | None |  |
| 17 | `supplier` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 18 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 19 | `detailList` | 取样信息 | `QMSQIT.sampleling.SamplelingDetail` | None | true |
