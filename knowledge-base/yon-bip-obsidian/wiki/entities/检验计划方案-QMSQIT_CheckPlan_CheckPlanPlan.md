---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.CheckPlan.CheckPlanPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验计划方案 (`QMSQIT.CheckPlan.CheckPlanPlan`)

> QMSQIT | 物理表：`qms_qit_checkplanplan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验计划方案 |
| 物理表 | `qms_qit_checkplanplan` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:41:56.9310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `qualityinSpectionCenter` | 质检组织 | `qualityinspectioncenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `note` | 备注 | `note` | String |
| 5 | `planDefineCharacter` | 自定义项特征组 | `definect_h` | 2346bebb-1d6b-4ea3-9267-66d22345b229 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `CheckPlanSourceList` | 检验计划来源 | `` | eb284525-353f-4a98-8939-7d155a238d65 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `planDefineCharacter` | 自定义项特征组 | `QMSQIT.CheckPlan.CheckPlanPlanDefineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `qualityinSpectionCenter` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 6 | `CheckPlanSourceList` | 检验计划来源 | `QMSQIT.CheckPlan.CheckPlanSource` | None | true |
