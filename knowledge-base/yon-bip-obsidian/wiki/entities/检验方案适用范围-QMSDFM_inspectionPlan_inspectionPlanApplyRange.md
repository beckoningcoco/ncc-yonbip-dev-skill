---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlan.inspectionPlanApplyRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验方案适用范围 (`QMSDFM.inspectionPlan.inspectionPlanApplyRange`)

> QIC | 物理表：`qms_dfm_inspectionplan_apply_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验方案适用范围 |
| 物理表 | `qms_dfm_inspectionplan_apply_range` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:56.2870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 适用范围ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 适用范围ID | `id` | Long |
| 3 | `orgId` | orgId | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `inspectionPlanId` | 检验方案ID | `inspectionplan_id` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 5 | `inspectionPlanDetailId` | 检验方案主表ID | `inspectionplan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 6 | `isApplied` | 使用组织是否已启用 | `is_applied` | Boolean |
| 7 | `remark` | 共享失败原因 | `remark` | String |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `tenant` | 租户ID | `tenant_id` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `creator` | 创建人名称 | `creator` | String |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectionPlanDetailId` | 检验方案主表ID | `QMSDFM.inspectionPlan.inspectionPlanDetail` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `inspectionPlanId` | 检验方案ID | `QMSDFM.inspectionPlan.inspectionPlan` | None | true |
| 6 | `orgId` | orgId | `org.func.QualityOrg` | Service |  |
