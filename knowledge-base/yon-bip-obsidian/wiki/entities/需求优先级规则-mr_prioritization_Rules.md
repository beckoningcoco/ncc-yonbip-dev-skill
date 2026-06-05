---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.prioritization.Rules"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 需求优先级规则 (`mr.prioritization.Rules`)

> MR | 物理表：`mr_prioritization_rules`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 需求优先级规则 |
| 物理表 | `mr_prioritization_rules` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:26.4720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `name` | 名称 | `name` | String |
| 6 | `code` | 编码 | `code` | String |
| 7 | `remark` | 备注 | `remark` | String |
| 8 | `datasub` | 应用来源 | `datasub` | String |
| 9 | `enable` | 启用 | `enable` | sys_intboolean |
| 10 | `enablets` | 启用时间 | `enablets` | DateTime |
| 11 | `disablets` | 停用时间 | `disablets` | DateTime |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `child` | 需求优先级规则子表 | `` | 54f75249-619b-48a4-b5b8-d28877b636da |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 6 | `child` | 需求优先级规则子表 | `mr.prioritization.Child` | None | true |
