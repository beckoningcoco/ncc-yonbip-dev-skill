---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planconfig.EntityProperties"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划配置 (`mr.planconfig.EntityProperties`)

> MR | 物理表：`mr_plan_entity_properties`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划配置 |
| 物理表 | `mr_plan_entity_properties` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:57.1040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `columnType` | 字段类型 | `column_type` | Short |
| 5 | `entityFullName` | 实体全称 | `entity_full_name` | String |
| 6 | `entityColumn` | 字段 | `entity_column` | String |
| 7 | `columnAlias` | 字段别名 | `column_alias` | String |
| 8 | `datasub` | 应用来源 | `datasub` | String |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 18 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
