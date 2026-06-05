---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.constraint.ChangeOverConstraint"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 换产时间约束 (`cmp.constraint.ChangeOverConstraint`)

> DCRP | 物理表：`cmp_changeover_constraint`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 换产时间约束 |
| 物理表 | `cmp_changeover_constraint` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:26.4750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `changeDim` | 换产维度 | `change_dim` | String |
| 7 | `constraintType` | 约束类型 | `constraint_type` | String |
| 8 | `enable` | 启用 | `enable` | sys_intboolean |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `enablets` | 启用时间 | `enablets` | DateTime |
| 11 | `disablets` | 停用时间 | `disablets` | DateTime |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `creator` | 创建人名称 | `creator` | String |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `characterList` | 约束特征 | `` | 575a7921-bfa7-44ee-80b5-757765546bfd |
| 22 | `cmponstraintScopeList` | 换产约束范围 | `` | 03b20007-6afc-4ea3-b115-a10ca2f7696d |
| 23 | `dimFromList` | 约束维度从 | `` | c9043593-fa55-49bf-b59b-d1aa0dbfbcff |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `characterList` | 约束特征 | `cmp.constraint.ConstraintCharacters` | None | true |
| 5 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 6 | `cmponstraintScopeList` | 换产约束范围 | `cmp.constraint.CmponstraintScope` | None | true |
| 7 | `dimFromList` | 约束维度从 | `cmp.constraint.ConstraintDimFrom` | None | true |
