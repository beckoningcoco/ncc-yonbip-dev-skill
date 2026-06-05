---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.dynamicinspectplan.DynamicInspectPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 动态检验方案 (`QMSQIT.dynamicinspectplan.DynamicInspectPlan`)

> QMSQIT | 物理表：`qms_qit_dynamic_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 动态检验方案 |
| 物理表 | `qms_qit_dynamic_plan` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:41:52.2150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（43个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 编码 | `code` | String |
| 6 | `bustype` | 交易类型 | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `inspectStepId` | 检验步骤 | `inspectstep_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 8 | `applyTemplateId` | 适用对象模板 | `applytemplate_id` | 9cf5f5cd-70ea-4d73-bb89-e348a0630dc2 |
| 9 | `inspectionType` | 检验类型 | `inspect_type` | String |
| 10 | `version` | 版本 | `version` | String |
| 11 | `isSingleSampleMethod` | 单一取样方式 | `is_single_sample_method` | Short |
| 12 | `sampleMethodId` | 取样方式 | `samplemethod_id` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 13 | `validFrom` | 有效期从 | `valid_from` | Date |
| 14 | `validEnd` | 有效期止 | `valid_end` | Date |
| 15 | `note` | 备注 | `note` | String |
| 16 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 1e2850f3-6789-4ce8-ac0b-84cce3d4f44f |
| 17 | `sampleMethodDetailId` | 取样方式主表id | `sample_method_detailid` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 18 | `detectionBasicId` | 检测依据 | `detectionbasic_id` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 19 | `name` | 名称 | `name` | String |
| 20 | `dr` | 逻辑删除标记 | `dr` | Short |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime |
| 22 | `createDate` | 创建日期 | `create_date` | Date |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 24 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 25 | `creator` | 创建人名称 | `creator` | String |
| 26 | `modifier` | 修改人名称 | `modifier` | String |
| 27 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 28 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `enable` | 启用 | `enable` | sys_intboolean |
| 30 | `enablets` | 启用时间 | `enablets` | DateTime |
| 31 | `disablets` | 停用时间 | `disablets` | DateTime |
| 32 | `auditor` | 审批人名称 | `auditor` | String |
| 33 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 34 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 35 | `auditDate` | 审批日期 | `audit_date` | Date |
| 36 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 37 | `verifystate` | 审批状态 | `verifystate` | Short |
| 38 | `returncount` | 退回次数 | `returncount` | Short |
| 39 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 40 | `tplid` | 模板id | `tplid` | Long |
| 41 | `status` | 单据状态 | `status` | Short |
| 42 | `pubts` | 时间戳 | `pubts` | DateTime |
| 43 | `inspectItemList` | 检验项目 | `` | f926d74c-ff03-4613-b3e0-9162876b39b0 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `detectionBasicId` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 2 | `sampleMethodId` | 取样方式 | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `inspectItemList` | 检验项目 | `QMSQIT.dynamicinspectplan.InspectItem` | None | true |
| 7 | `bustype` | 交易类型 | `bd.bill.TransType` | Service |  |
| 8 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 9 | `inspectStepId` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 10 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 11 | `defineCharacteristics` | 自定义项特征组 | `QMSQIT.dynamicinspectplan.DynamicInspectPlanDefineCharacter` | None |  |
| 12 | `applyTemplateId` | 适用对象模板 | `QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate` | None |  |
| 13 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
