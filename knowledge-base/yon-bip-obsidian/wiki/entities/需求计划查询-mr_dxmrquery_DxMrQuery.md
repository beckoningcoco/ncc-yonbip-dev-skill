---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.dxmrquery.DxMrQuery"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 需求计划查询 (`mr.dxmrquery.DxMrQuery`)

> MR | 物理表：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 需求计划查询 |
| 物理表 | `` |
| 数据库 schema | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:34.5750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `id` | ID | `id` | Long |
| 6 | `modifier` | 修改人名称 | `modifier` | String |
| 7 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 10 | `planScheme` | 计划方案 | `plan_scheme` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `planScheme` | 计划方案 | `mr.planscheme.PlanScheme` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
