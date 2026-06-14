---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.checkProject.checkProjectApplyRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验项目适用范围 (`QMSDFM.checkProject.checkProjectApplyRange`)

> QIC | 物理表：`qms_dfm_checkproject_apply_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验项目适用范围 |
| 物理表 | `qms_dfm_checkproject_apply_range` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:28.9840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 适用范围id |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | 适用范围id | `id` | Long |
| 4 | `orgId` | 使用组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `detailId` | 检验项目主表id | `detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 6 | `inspectionItemId` | 检验项目id | `inspection_item_id` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 7 | `isApplied` | 使用组织是否已使用 | `is_applied` | Boolean |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `inspectionItemId` | 检验项目id | `QMSDFM.checkProject.checkProject` | None | true |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `detailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | None |  |
| 6 | `orgId` | 使用组织 | `org.func.QualityOrg` | Service |  |
