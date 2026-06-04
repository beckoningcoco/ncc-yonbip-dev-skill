---
tags: ["BIP", "元数据", "数据字典", "ycQualityCollaboration", "qmpu.rectification.QmpuProblemRectification"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改 (`qmpu.rectification.QmpuProblemRectification`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycQualityCollaboration 模块实体元数据字典。
> 物理表：`qmpu_problem_rectification` | 所属应用：`ycQualityCollaboration`
> 来源：元数据API `queryByUri` 返回的 `qmpu.rectification.QmpuProblemRectification` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改 |
| 物理表 | `qmpu_problem_rectification` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycQualityCollaboration` |
| 业务对象ID | `44e2bb11-2802-4fc4-9660-133069e57379` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:34.8730` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 单据编号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:38:24:000
- **安装来源**: `/app/data_scripts/src/cpu-synergy-server/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-synergy/0010_iuap_common/DML/0270_iuap_metadata/202601/202601191021_metadata_qmpu-rectification_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `499086fd-a7a9-4e98-ba5a-ce60786f9c38`

## 业务场景

- `print`
- `workflow`
- `DataAuth`
- `imextmp`
- `transtype`
- `report`
- `billcode`
- `dataPrivacy`
- `userdefine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`, `dataAuth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 11 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 租户接口 (`ITenant`) | `ucfbase.ucfbaseItf.ITenant` | 77 | 1 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 5 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 6 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 7 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 8 | 打印次数 (`IPrintCount`) | `base.itf.IPrintCount` | 66 | 1 |
| 9 | 项目结构属性 (`projectStructureProperties`) | `BGDM.wbs.projectStructureProperties` | 49 | 2 |
| 10 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 11 | 审批提交信息 (`ISubmitInfo`) | `ucfbase.ucfbaseItf.ISubmitInfo` | 85 | 4 |

---

## 直接属性（共 103 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `code` | 单据编号 | `code` | String | `text` |  | ✓ |
| 3 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` |  | ✓ |
| 4 | `rectificationTitle` | 整改标题 | `rectification_title` | String | `text` |  | ✓ |
| 5 | `status` | 状态 | `status` | Short | `short` |  | ✓ |
| 6 | `project` | 项目 | `project` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 7 | `synergyStatus` | 流转状态 | `synergy_status` | String | `text` |  | ✓ |
| 8 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 9 | `dept` | 采购部门 | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 10 | `bsynergy` | 是否需要与供应商协同 | `bsynergy` | Integer | `int` |  | ✓ |
| 11 | `publishTime` | 发布时间 | `publish_time` | DateTime | `timestamp` |  | ✓ |
| 12 | `reportTime` | 完成报告时间 | `report_time` | DateTime | `timestamp` |  | ✓ |
| 13 | `closeTime` | 问题关闭时间 | `close_time` | DateTime | `timestamp` |  | ✓ |
| 14 | `claimRef` | 是否已被索赔扣款引用 | `claim_ref` | Boolean | `switch` |  | ✓ |
| 15 | `icaConfirmorId` | 确认人id | `ica_confirmor_id` | String | `text` |  | ✓ |
| 16 | `pcaConfirmorId` | 确认人id | `pca_confirmor_id` | String | `text` |  | ✓ |
| 17 | `validatorId` | 验证人Id | `validator_id` | String | `text` |  | ✓ |
| 18 | `vendorBillId` | 供应商问题整改id | `vendor_bill_id` | String | `text` |  | ✓ |
| 19 | `ctId` | 自定义项特征组id | `ct_id` | c2307fc0-96a3-48c3-8500-d0e34fb349f8 | `UserDefine` |  | ✓ |
| 20 | `openRichText` | 是否开启富文本 | `open_rich_text` | Boolean | `switch` |  | ✓ |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 22 | `tenant` | 租户ID | `tenant_id` | String | `text` | ✓ | ✓ |
| 23 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 24 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 27 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 28 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 29 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 30 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 31 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 32 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 33 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 34 | `submitTime` | 提交时间 | `submit_time` | DateTime | `dateTime` |  | ✓ |
| 35 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 36 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime | `dateTime` |  | ✓ |
| 37 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 38 | `printCount` | 打印次数 | `printCount` | Integer | `int` |  | ✓ |
| 39 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |  | ✓ |
| 40 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |  | ✓ |
| 41 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 42 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 43 | `tplid` | 模板id | `tplid` | Long | `long` |  | ✓ |
| 44 | `purEnterpriseName` | 采购商 | `pur_enterprise_name` | String | `text` |  | ✓ |
| 45 | `purchaseOrg` | 采购组织 | `purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | ✓ |
| 46 | `purchaser` | 采购员 | `purchaser` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 47 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 48 | `supplierContact` | 供方联系人 | `supplier_contact` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |  | ✓ |
| 49 | `icaRequestTime` | ICA要求时间 | `ica_request_time` | DateTime | `timestamp` |  | ✓ |
| 50 | `pcaRequestTime` | PCA要求时间 | `pca_request_time` | DateTime | `timestamp` |  | ✓ |
| 51 | `completionRequestTime` | 整改要求完成时间 | `completion_request_time` | DateTime | `timestamp` |  | ✓ |
| 52 | `icaFeedbackTime` | ICA反馈时间 | `ica_feadback_time` | DateTime | `timestamp` |  | ✓ |
| 53 | `pcaFeedbackTime` | PCA反馈时间 | `pca_feadback_time` | DateTime | `timestamp` |  | ✓ |
| 54 | `completionTime` | 整改完成时间 | `completion_time` | DateTime | `timestamp` |  | ✓ |
| 55 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 56 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 57 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String | `text` |  | ✓ |
| 58 | `problemType` | 问题类型 | `problem_type` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 59 | `defectType` | 缺陷类型 | `defect_type` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 60 | `emergencyLevel` | 紧急程度 | `emergency_level` | String | `text` |  | ✓ |
| 61 | `importanceDegree` | 重视程度 | `importance_degree` | String | `text` |  | ✓ |
| 62 | `problemTime` | 问题发生时间 | `problem_time` | DateTime | `timestamp` |  | ✓ |
| 63 | `problemFinder` | 问题发现人员 | `problem_finder` | String | `text` |  | ✓ |
| 64 | `problemLocationOccur` | 问题发生地点 | `problem_location_occured` | String | `text` |  | ✓ |
| 65 | `problemBriefDescription` | 问题简述 | `problem_brief_description` | String | `text` |  | ✓ |
| 66 | `problemDescription` | 问题描述 | `problem_description` | String | `text` |  | ✓ |
| 67 | `identifyCause` | 识别原因 | `identifyCause` | String | `text` |  | ✓ |
| 68 | `problemSummary` | 问题总结 | `problem_summary` | String | `text` |  | ✓ |
| 69 | `icaSuggestion` | ICA意见 | `ica_suggestion` | String | `text` |  | ✓ |
| 70 | `icaAttachment` | ICA附件 | `ica_attachment` | String | `text` |  | ✓ |
| 71 | `problemDescriptionAttachment` | 问题描述附件 | `problem_description_attachment` | String | `text` |  | ✓ |
| 72 | `icaConfirmor` | 确认人 | `ica_confirmor` | String | `text` |  | ✓ |
| 73 | `icaConfirmTime` | 确认时间 | `ica_confirm_time` | DateTime | `timestamp` |  | ✓ |
| 74 | `pcaSuggestion` | PCA意见 | `pca_suggestion` | String | `text` |  | ✓ |
| 75 | `pcaAttachment` | PCA附件 | `pca_attachment` | String | `text` |  | ✓ |
| 76 | `pcaConfirmor` | 确认人 | `pca_confirmor` | String | `text` |  | ✓ |
| 77 | `pcaConfirmTime` | 确认时间 | `pca_confirm_time` | DateTime | `timestamp` |  | ✓ |
| 78 | `validationResult` | 验证结果 | `validation_result` | String | `text` |  | ✓ |
| 79 | `validationResultDescription` | 验证结果描述 | `validation_result_description` | String | `text` |  | ✓ |
| 80 | `validationAttachment` | 验证附件 | `validation_attachment` | String | `text` |  | ✓ |
| 81 | `validator` | 验证人 | `validator` | String | `text` |  | ✓ |
| 82 | `validateTime` | 验证时间 | `validate_time` | DateTime | `timestamp` |  | ✓ |
| 83 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 84 | `verifystate` | 审核状态 | `verifystate` | Short | `short` |  | ✓ |
| 85 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 86 | `createType` | 创建方式 | `create_type` | String | `text` |  | ✓ |
| 87 | `isClaim` | 是否生成索赔扣款单 | `is_claim` | Boolean | `switch` |  | ✓ |
| 88 | `creator` | 创建人 | `creator` | String | `text` |  | ✓ |
| 89 | `erpId` | 外部系统单据的id | `erp_id` | String | `text` |  | ✓ |
| 90 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 91 | `associationList` | 问题整改关联信息 | `` | 476f7a52-e414-4716-b306-99580fe7e778 | `` |  |  |
| 92 | `executeVerificationList` | 问题整改执行措施 | `` | a5c8f699-94e4-4126-9348-4f3c2a1f39bf | `` |  |  |
| 93 | `handlePerson` | 处理人 | `handle_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 94 | `materialList` | 问题整改物料信息 | `` | 458bdfd6-ae23-468a-92f6-9d8918d29738 | `` |  |  |
| 95 | `measurePermanentList` | 问题整改永久措施 | `` | 1b53369a-a1cb-4772-9f2f-c14df8ebf569 | `` |  |  |
| 96 | `measurePreventionList` | 问题整改预防措施 | `` | 19e75548-1d40-446f-81c8-60b65b19db05 | `` |  |  |
| 97 | `measureTemporaryList` | 问题整改临时措施 | `` | 5d095e67-3cd2-419b-95d0-7efca5d11240 | `` |  |  |
| 98 | `memberList` | 问题整改小组成员 | `` | 73a74345-e56f-448b-931e-60c0e1f3c0f6 | `` |  |  |
| 99 | `qmpuProblemRectificationAttrextItem` | 问题整改自由自定义项 | `` | 9ec0b10b-7e01-461d-95d2-842792f72234 | `` |  |  |
| 100 | `qmpuProblemRectificationUserdefItem` | 问题整改固定自定义项 | `` | 4c9ac717-af8e-4229-b0fd-79e45c54f0d2 | `` |  |  |
| 101 | `reassignmentList` | 问题整改转派历史 | `` | f8784b9f-c101-4b42-afca-ed1ad2a92c09 | `` |  |  |
| 102 | `rootCauseList` | 问题整改根本原因 | `` | 0fea1b10-90a9-40d8-a711-a8e3eaae2e98 | `` |  |  |
| 103 | `synergyList` | 问题整改协同历史 | `` | 4a0506c5-d5e8-47b7-a55b-ff9d89fcef80 | `` |  |  |

---

## 关联属性（共 32 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | `submitter` |  →  |  |  | Service |  |
| 2 | `ctId` | 自定义项特征组id | `qmpu.rectification.QmpuRectificationCt` | `ct_id` |  →  |  |  | None |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | `activity` |  →  |  |  | Service |  |
| 4 | `materialList` | 问题整改物料信息 | `qmpu.rectification.QmpuProblemRectificationMaterial` | `` | materialList → rectificationId | 0..n | true | None |  |
| 5 | `associationList` | 问题整改关联信息 | `qmpu.rectification.QmpuProblemRectificationAssociation` | `` | associationList → rectificationId | 0..n | true | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 8 | `project` | 项目 | `bd.project.ProjectVO` | `project` |  →  |  |  | Service |  |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | `wbs` |  →  |  |  | Service |  |
| 10 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 11 | `qmpuProblemRectificationUserdefItem` | 问题整改固定自定义项 | `qmpu.rectification.QmpuProblemRectificationUserdefItem` | `` | qmpuProblemRectificationUserdefItem → id | 1 | true | None | ⚠️ |
| 12 | `rootCauseList` | 问题整改根本原因 | `qmpu.rectification.QmpuProblemRectificationRootCause` | `` | rootCauseList → rectificationId | 0..n | true | None |  |
| 13 | `measurePermanentList` | 问题整改永久措施 | `qmpu.rectification.QmpuProblemRectificationMeasurePermanent` | `` | measurePermanentList → rectificationId | 0..n | true | None |  |
| 14 | `executeVerificationList` | 问题整改执行措施 | `qmpu.rectification.QmpuProblemRectificationExecuteVerification` | `` | executeVerificationList → rectificationId | 0..n | true | None |  |
| 15 | `memberList` | 问题整改小组成员 | `qmpu.rectification.QmpuProblemRectificationMember` | `` | memberList → rectificationId | 0..n | true | None |  |
| 16 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | `withdrawpp` |  →  |  |  | Service |  |
| 17 | `reassignmentList` | 问题整改转派历史 | `qmpu.rectification.QmpuProblemRectificationReassignment` | `` | reassignmentList → rectificationId | 0..n | true | None |  |
| 18 | `supplier` | 供应商 | `aa.vendor.Vendor` | `supplier` |  →  |  |  | Service |  |
| 19 | `purchaseOrg` | 采购组织 | `org.func.PurchaseOrg` | `purchase_org` |  →  |  |  | Service |  |
| 20 | `measureTemporaryList` | 问题整改临时措施 | `qmpu.rectification.QmpuProblemRectificationMeasureTemporary` | `` | measureTemporaryList → rectificationId | 0..n | true | None |  |
| 21 | `synergyList` | 问题整改协同历史 | `qmpu.rectification.QmpuProblemRectificationSynergy` | `` | synergyList → rectificationId | 0..n | true | None |  |
| 22 | `handlePerson` | 处理人 | `bd.staff.Staff` | `handle_person` |  →  |  |  | Service |  |
| 23 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 24 | `purchaser` | 采购员 | `bd.staff.Staff` | `purchaser` |  →  |  |  | Service |  |
| 25 | `qmpuProblemRectificationAttrextItem` | 问题整改自由自定义项 | `qmpu.rectification.QmpuProblemRectificationAttrextItem` | `` | qmpuProblemRectificationAttrextItem → id | 1 | true | None | ⚠️ |
| 26 | `dept` | 采购部门 | `bd.adminOrg.AdminOrgVO` | `dept_id` |  →  |  |  | Service |  |
| 27 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 28 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type` |  →  |  |  | Service |  |
| 29 | `measurePreventionList` | 问题整改预防措施 | `qmpu.rectification.QmpuProblemRectificationMeasurePrevention` | `` | measurePreventionList → rectificationId | 0..n | true | None |  |
| 30 | `defectType` | 缺陷类型 | `bctask.basedoc.CustomerDocVO` | `defect_type` |  →  |  |  | Service |  |
| 31 | `problemType` | 问题类型 | `bctask.basedoc.CustomerDocVO` | `problem_type` |  →  |  |  | Service |  |
| 32 | `supplierContact` | 供方联系人 | `aa.vendor.VendorContacts` | `supplier_contact` |  →  |  |  | Service |  |

### Composition（子表）

- **materialList**: `materialList` → `qmpu.rectification.QmpuProblemRectificationMaterial` | 0..n
- **associationList**: `associationList` → `qmpu.rectification.QmpuProblemRectificationAssociation` | 0..n
- **qmpuProblemRectificationUserdefItem**: `qmpuProblemRectificationUserdefItem` → `qmpu.rectification.QmpuProblemRectificationUserdefItem` | 1 ⚠️ 已废弃
- **rootCauseList**: `rootCauseList` → `qmpu.rectification.QmpuProblemRectificationRootCause` | 0..n
- **measurePermanentList**: `measurePermanentList` → `qmpu.rectification.QmpuProblemRectificationMeasurePermanent` | 0..n
- **executeVerificationList**: `executeVerificationList` → `qmpu.rectification.QmpuProblemRectificationExecuteVerification` | 0..n
- **memberList**: `memberList` → `qmpu.rectification.QmpuProblemRectificationMember` | 0..n
- **reassignmentList**: `reassignmentList` → `qmpu.rectification.QmpuProblemRectificationReassignment` | 0..n
- **measureTemporaryList**: `measureTemporaryList` → `qmpu.rectification.QmpuProblemRectificationMeasureTemporary` | 0..n
- **synergyList**: `synergyList` → `qmpu.rectification.QmpuProblemRectificationSynergy` | 0..n
- **qmpuProblemRectificationAttrextItem**: `qmpuProblemRectificationAttrextItem` → `qmpu.rectification.QmpuProblemRectificationAttrextItem` | 1 ⚠️ 已废弃
- **measurePreventionList**: `measurePreventionList` → `qmpu.rectification.QmpuProblemRectificationMeasurePrevention` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `submitter` (提交人) | `base.user.BipUser` | `submitter` |
| `activity` (活动) | `pgrm.projecttask.ProjectScheduleTask` | `activity` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `project` (项目) | `bd.project.ProjectVO` | `project` |
| `wbs` (WBS) | `BGDM.wbs.wbs_doc` | `wbs` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `withdrawpp` (撤回提交的人) | `base.user.BipUser` | `withdrawpp` |
| `supplier` (供应商) | `aa.vendor.Vendor` | `supplier` |
| `purchaseOrg` (采购组织) | `org.func.PurchaseOrg` | `purchase_org` |
| `handlePerson` (处理人) | `bd.staff.Staff` | `handle_person` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `purchaser` (采购员) | `bd.staff.Staff` | `purchaser` |
| `dept` (采购部门) | `bd.adminOrg.AdminOrgVO` | `dept_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type` |
| `defectType` (缺陷类型) | `bctask.basedoc.CustomerDocVO` | `defect_type` |
| `problemType` (问题类型) | `bctask.basedoc.CustomerDocVO` | `problem_type` |
| `supplierContact` (供方联系人) | `aa.vendor.VendorContacts` | `supplier_contact` |
