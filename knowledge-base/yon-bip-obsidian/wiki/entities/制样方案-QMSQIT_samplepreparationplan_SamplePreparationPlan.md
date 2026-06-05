---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplepreparationplan.SamplePreparationPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 制样方案 (`QMSQIT.samplepreparationplan.SamplePreparationPlan`)

> QMSQIT | 物理表：`qms_qit_sample_preparation_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 制样方案 |
| 物理表 | `qms_qit_sample_preparation_plan` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:56.8960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 单据编号 | `code` | String |
| 5 | `templateId` | 适用对象模板 | `template_id` | 9cf5f5cd-70ea-4d73-bb89-e348a0630dc2 |
| 6 | `defCharacteristics` | 自定义特征组 | `def_characteristics` | 707885c9-b279-4021-8948-654463c20e1a |
| 7 | `inspectStepId` | 检验步骤ID | `inspect_step_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 8 | `inspectType` | 检验类型 | `inspect_type` | String |
| 9 | `name` | 名称 | `name` | String |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `enable` | 启用 | `enable` | sys_intboolean |
| 20 | `enablets` | 启用时间 | `enablets` | DateTime |
| 21 | `disablets` | 停用时间 | `disablets` | DateTime |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `samplePreparationRequirementsList` | 制样要求 | `` | 93685875-e818-4c33-9aa6-f6ef24f8c576 |
| 24 | `samplePreparationStepList` | 制样步骤 | `` | 3f937426-3e0c-4e14-a438-f09d3e40cba4 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectStepId` | 检验步骤ID | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `templateId` | 适用对象模板 | `QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate` | None |  |
| 6 | `samplePreparationStepList` | 制样步骤 | `QMSQIT.samplepreparationplan.SamplePreparationStep` | None | true |
| 7 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 8 | `defCharacteristics` | 自定义特征组 | `QMSQIT.samplepreparationplan.SamplePreparationPlanDCT` | None |  |
| 9 | `samplePreparationRequirementsList` | 制样要求 | `QMSQIT.samplepreparationplan.SamplePreparationRequirements` | None | true |
