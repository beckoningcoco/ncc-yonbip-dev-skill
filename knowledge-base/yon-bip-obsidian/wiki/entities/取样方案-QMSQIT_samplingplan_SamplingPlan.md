---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.samplingplan.SamplingPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 取样方案 (`QMSQIT.samplingplan.SamplingPlan`)

> QMSQIT | 物理表：`qms_qit_sampling_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取样方案 |
| 物理表 | `qms_qit_sampling_plan` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:44:07.9110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `checkType` | 检验类型 | `check_type` | String |
| 2 | `code` | 编码 | `code` | String |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `detailList` | 取样要求 | `` | 35becc22-2adf-4be4-89e6-f7736d1fed04 |
| 8 | `disablets` | 停用时间 | `disablets` | DateTime |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `enable` | 启用 | `enable` | sys_intboolean |
| 11 | `enablets` | 启用时间 | `enablets` | DateTime |
| 12 | `id` | ID | `id` | Long |
| 13 | `inspectStepId` | 检验步骤ID | `inspect_step_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `name` | 名称 | `name` | String |
| 19 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `templateId` | 取样对象模板 | `template_id` | 9cf5f5cd-70ea-4d73-bb89-e348a0630dc2 |
| 22 | `userDefineCharacterHead` | 自定义项实体 | `head_dct` | 989f6f48-2a99-4478-8c90-137dbf565de5 |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectStepId` | 检验步骤ID | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `detailList` | 取样要求 | `QMSQIT.samplingplan.SamplingRequirements` | None | true |
| 6 | `templateId` | 取样对象模板 | `QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate` | None |  |
| 7 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 8 | `userDefineCharacterHead` | 自定义项实体 | `QMSQIT.samplingplan.SamplingPlanDCT` | None |  |
