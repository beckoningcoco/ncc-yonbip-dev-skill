---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.checkProjectClass.checkProjectClassApplyRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验项目分类适用范围 (`QMSDFM.checkProjectClass.checkProjectClassApplyRange`)

> QIC | 物理表：`qms_dfm_checkprojectclass_apply_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验项目分类适用范围 |
| 物理表 | `qms_dfm_checkprojectclass_apply_range` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:58.7050` |

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
| 4 | `orgId` | 组织Id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `checkProjectClassId` | 检验项目分类 | `check_project_class_id` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `isApplied` | 使用组织是否已启用 | `is_applied` | Boolean |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `note` | 备注 | `note` | String |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orgId` | 组织Id | `org.func.BaseOrg` | Service |  |
| 5 | `checkProjectClassId` | 检验项目分类 | `QMSDFM.checkProjectClass.checkProjectClass` | None | true |
