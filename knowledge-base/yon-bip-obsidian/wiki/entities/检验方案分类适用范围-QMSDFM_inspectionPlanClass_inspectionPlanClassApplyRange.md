---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlanClass.inspectionPlanClassApplyRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验方案分类适用范围 (`QMSDFM.inspectionPlanClass.inspectionPlanClassApplyRange`)

> QIC | 物理表：`qms_dfm_inspection_plan_class_apply_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验方案分类适用范围 |
| 物理表 | `qms_dfm_inspection_plan_class_apply_range` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:03.6220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `orgId` | orgId | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 3 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 4 | `creator` | 创建人 | `creator` | String |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime |
| 6 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `modifier` | 修改人 | `modifier` | String |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `inspectionPlanClassDetailId` | 检验方案分类详情id | `inspection_plan_class_detail_id` | f1cf9402-df2d-414f-90f0-a0f75c3fabeb |
| 12 | `inspectionPlanClassId` | 检验方案分类id | `inspection_plan_class_id` | fb967f62-dd79-432d-88d0-aa4789da86d4 |
| 13 | `isApplied` | 使用组织是否已启用 | `is_applied` | Boolean |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `tenant` | 租户ID | `tenant_id` | String |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectionPlanClassId` | 检验方案分类id | `QMSDFM.inspectionPlanClass.inspectionplanclass` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 5 | `inspectionPlanClassDetailId` | 检验方案分类详情id | `QMSDFM.inspectionPlanClass.inspectionPlanClassDetail` | None |  |
| 6 | `orgId` | orgId | `org.func.QualityOrg` | Service |  |
