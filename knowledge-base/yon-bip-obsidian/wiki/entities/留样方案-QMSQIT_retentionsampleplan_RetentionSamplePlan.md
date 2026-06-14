---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.retentionsampleplan.RetentionSamplePlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 留样方案 (`QMSQIT.retentionsampleplan.RetentionSamplePlan`)

> QMSQIT | 物理表：`qms_qit_retentionsample_plan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 留样方案 |
| 物理表 | `qms_qit_retentionsample_plan` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:41:42.9900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `enable` | 启用 | `enable` | sys_intboolean |
| 7 | `templateId` | 留样对象模板 | `template_id` | 9cf5f5cd-70ea-4d73-bb89-e348a0630dc2 |
| 8 | `checkType` | 检验类型 | `check_type` | String |
| 9 | `userDefineCharacterHead` | 自定义项实体 | `head_dct` | f400f26b-9492-4439-8228-5dfd087b6a29 |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `enablets` | 启用时间 | `enablets` | DateTime |
| 20 | `disablets` | 停用时间 | `disablets` | DateTime |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `requirementsList` | 留样要求 | `` | 0de969f5-7fef-49b6-b0f2-4cc90e4b60d1 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `requirementsList` | 留样要求 | `QMSQIT.retentionsampleplan.RetentionSampleRequirements` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `templateId` | 留样对象模板 | `QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate` | None |  |
| 6 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 7 | `userDefineCharacterHead` | 自定义项实体 | `QMSQIT.retentionsampleplan.RetentionSamplePlanDCT` | None |  |
