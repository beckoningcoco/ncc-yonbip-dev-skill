---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectification"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改 (`qmsu.rectification.QmsuProblemRectification`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改 |
| 物理表 | `qmsu_problem_rectification` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:49.1950` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（110个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `code` | 单据编号 | `code` | String |
| 3 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 4 | `rectificationTitle` | 整改标题 | `rectification_title` | String |
| 5 | `project` | 项目 | `project` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 6 | `synergyStatus` | 协同状态 | `synergy_status` | String |
| 7 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 8 | `purEnterpriseName` | 采购商 | `pur_enterprise_name` | String |
| 9 | `tplid` | 模板id | `tplid` | Long |
| 10 | `status` | 状态 | `status` | Short |
| 11 | `transTypeName` | 交易类型名称 | `trans_type_name` | String |
| 12 | `purchaseOrg` | 采购组织 | `purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 13 | `purchaseOrgName` | 采购组织名称 | `purchase_org_name` | String |
| 14 | `dept` | 采购部门 | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 15 | `deptName` | 采购部门名称 | `dept_name` | String |
| 16 | `purchaserName` | 采购员名称 | `purchaser_name` | String |
| 17 | `supplierName` | 供应商名称 | `supplier_name` | String |
| 18 | `supplierContactName` | 供方联系人名称 | `supplier_contact_name` | String |
| 19 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 20 | `reportTime` | 完成报告时间 | `report_time` | DateTime |
| 21 | `closeTime` | 问题关闭时间 | `close_time` | DateTime |
| 22 | `projectCode` | 项目编码 | `project_code` | String |
| 23 | `projectName` | 项目名称 | `project_name` | String |
| 24 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 25 | `wbsName` | WBS任务 | `wbs_name` | String |
| 26 | `activityCode` | 活动编码 | `activity_code` | String |
| 27 | `activityName` | 活动名称 | `activity_name` | String |
| 28 | `defectTypeName` | 缺陷类型名称 | `defect_type_name` | String |
| 29 | `problemTypeName` | 问题类型名称 | `problem_type_name` | String |
| 30 | `icaConfirmorId` | 确认人id | `ica_confirmor_id` | String |
| 31 | `pcaConfirmorId` | 确认人id | `pca_confirmor_id` | String |
| 32 | `validatorId` | 验证人Id | `validator_id` | String |
| 33 | `ctId` | 自定义项特征组id | `ct_id` | bd2fc7f6-fa6a-4b36-aed9-fb0db14a1210 |
| 34 | `openRichText` | 是否开启富文本 | `open_rich_text` | Boolean |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 36 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 37 | `printCount` | 打印次数 | `printCount` | Integer |
| 38 | `tenant` | 租户ID | `tenant_id` | String |
| 39 | `createTime` | 创建时间 | `create_time` | DateTime |
| 40 | `createDate` | 创建日期 | `create_date` | Date |
| 41 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 42 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 43 | `creator` | 创建人名称 | `creator` | String |
| 44 | `modifier` | 修改人名称 | `modifier` | String |
| 45 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 46 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 47 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 48 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 49 | `source` | 上游单据类型 | `source` | String |
| 50 | `upcode` | 上游单据号 | `upcode` | String |
| 51 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 52 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 53 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 54 | `dr` | 逻辑删除标记 | `dr` | Short |
| 55 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 56 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 57 | `purchaser` | 采购员 | `purchaser` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 58 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 59 | `supplierContact` | 供方联系人 | `supplier_contact` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 60 | `icaRequestTime` | ICA要求时间 | `ica_request_time` | DateTime |
| 61 | `pcaRequestTime` | PCA要求时间 | `pca_request_time` | DateTime |
| 62 | `completionRequestTime` | 整改要求完成时间 | `completion_request_time` | DateTime |
| 63 | `icaFeedbackTime` | ICA反馈时间 | `ica_feadback_time` | DateTime |
| 64 | `pcaFeedbackTime` | PCA反馈时间 | `pca_feadback_time` | DateTime |
| 65 | `completionTime` | 整改完成时间 | `completion_time` | DateTime |
| 66 | `remark` | 备注 | `remark` | String |
| 67 | `pubts` | 时间戳 | `pubts` | DateTime |
| 68 | `problemType` | 问题类型 | `problem_type` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 69 | `defectType` | 缺陷类型 | `defect_type` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 70 | `emergencyLevel` | 紧急程度 | `emergency_level` | String |
| 71 | `importanceDegree` | 重视程度 | `importance_degree` | String |
| 72 | `problemTime` | 问题发生时间 | `problem_time` | DateTime |
| 73 | `problemFinder` | 问题发现人员 | `problem_finder` | String |
| 74 | `problemLocationOccur` | 问题发生地点 | `problem_location_occured` | String |
| 75 | `problemBriefDescription` | 问题简述 | `problem_brief_description` | String |
| 76 | `problemDescription` | 问题描述 | `problem_description` | String |
| 77 | `identifyCause` | 识别原因 | `identifyCause` | String |
| 78 | `problemSummary` | 问题总结 | `problem_summary` | String |
| 79 | `icaSuggestion` | ICA意见 | `ica_suggestion` | String |
| 80 | `icaAttachment` | ICA附件 | `ica_attachment` | String |
| 81 | `problemDescriptionAttachment` | 问题描述附件 | `problem_description_attachment` | String |
| 82 | `icaConfirmor` | 确认人 | `ica_confirmor` | String |
| 83 | `icaConfirmTime` | 确认时间 | `ica_confirm_time` | DateTime |
| 84 | `pcaSuggestion` | PCA意见 | `pca_suggestion` | String |
| 85 | `pcaAttachment` | PCA附件 | `pca_attachment` | String |
| 86 | `pcaConfirmor` | 确认人 | `pca_confirmor` | String |
| 87 | `pcaConfirmTime` | 确认时间 | `pca_confirm_time` | DateTime |
| 88 | `validationResult` | 验证结果 | `validation_result` | String |
| 89 | `validationResultDescription` | 验证结果描述 | `validation_result_description` | String |
| 90 | `validationAttachment` | 验证附件 | `validation_attachment` | String |
| 91 | `validator` | 验证人 | `validator` | String |
| 92 | `validateTime` | 验证时间 | `validate_time` | DateTime |
| 93 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 94 | `sourceBillType` | 来源单据类型 | `source_bill_type` | String |
| 95 | `sourceBillNo` | 来源单据号 | `source_bill_no` | String |
| 96 | `sourceBillId` | 来源单据id | `source_bill_id` | Long |
| 97 | `sourceBillDate` | 来源单据日期 | `source_bill_date` | Date |
| 98 | `erpId` | 外部系统单据的id | `erp_id` | String |
| 99 | `createType` | 创建方式 | `create_type` | String |
| 100 | `associationList` | 问题整改关联信息 | `` | 41c906dc-e266-4601-8640-19dc23f15356 |
| 101 | `executeVerificationList` | 问题整改执行措施 | `` | 49d0eac6-19d6-4eaf-a967-84301bd0073a |
| 102 | `materialList` | 问题整改物料信息 | `` | 7757744b-dc56-4815-a9a8-0f374beba04d |
| 103 | `measurePermanentList` | 问题整改永久措施 | `` | f897488e-5184-4b35-98ea-2c5d32f74bd6 |
| 104 | `measurePreventionList` | 问题整改预防措施 | `` | 0d6151e1-cdd7-48ab-b629-9dac379de434 |
| 105 | `measureTemporaryList` | 问题整改临时措施 | `` | 4d930bf2-2a68-4478-a7b2-34c36096d75d |
| 106 | `memberList` | 问题整改小组成员 | `` | e88c2d3e-224c-4e3d-9376-199e8162efbe |
| 107 | `qmsuProblemRectificationAttrextItem` | 问题整改自由自定义项 | `` | ba505012-2a7d-44ce-994e-3bb8e88e471c |
| 108 | `qmsuProblemRectificationUserdefItem` | 问题整改固定自定义项 | `` | 67ba3218-bb07-40ce-8879-f6d13d55d629 |
| 109 | `rootCauseList` | 问题整改根本原因 | `` | 8970ea5f-b265-47d0-ae07-9126991f2c9c |
| 110 | `synergyList` | 问题整改协同历史 | `` | 0343f4ef-4672-4981-876e-82fb54ba8df1 |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationCt` | None |  |
| 2 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 3 | `materialList` | 问题整改物料信息 | `qmsu.rectification.QmsuProblemRectificationMaterial` | None | true |
| 4 | `associationList` | 问题整改关联信息 | `qmsu.rectification.QmsuProblemRectificationAssociation` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `project` | 项目 | `bd.project.ProjectVO` | Service |  |
| 8 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 9 | `rootCauseList` | 问题整改根本原因 | `qmsu.rectification.QmsuProblemRectificationRootCause` | None | true |
| 10 | `measurePermanentList` | 问题整改永久措施 | `qmsu.rectification.QmsuProblemRectificationMeasurePermanent` | None | true |
| 11 | `executeVerificationList` | 问题整改执行措施 | `qmsu.rectification.QmsuProblemRectificationExecuteVerification` | None | true |
| 12 | `memberList` | 问题整改小组成员 | `qmsu.rectification.QmsuProblemRectificationMember` | None | true |
| 13 | `supplier` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 14 | `purchaseOrg` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
| 15 | `measureTemporaryList` | 问题整改临时措施 | `qmsu.rectification.QmsuProblemRectificationMeasureTemporary` | None | true |
| 16 | `synergyList` | 问题整改协同历史 | `qmsu.rectification.QmsuProblemRectificationSynergy` | None | true |
| 17 | `qmsuProblemRectificationAttrextItem` | 问题整改自由自定义项 | `qmsu.rectification.QmsuProblemRectificationAttrextItem` | None | true |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 19 | `purchaser` | 采购员 | `bd.staff.Staff` | Service |  |
| 20 | `dept` | 采购部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 21 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 22 | `qmsuProblemRectificationUserdefItem` | 问题整改固定自定义项 | `qmsu.rectification.QmsuProblemRectificationUserdefItem` | None | true |
| 23 | `measurePreventionList` | 问题整改预防措施 | `qmsu.rectification.QmsuProblemRectificationMeasurePrevention` | None | true |
| 24 | `defectType` | 缺陷类型 | `bctask.basedoc.CustomerDocVO` | Service |  |
| 25 | `problemType` | 问题类型 | `bctask.basedoc.CustomerDocVO` | Service |  |
| 26 | `supplierContact` | 供方联系人 | `aa.vendor.VendorContacts` | Service |  |
