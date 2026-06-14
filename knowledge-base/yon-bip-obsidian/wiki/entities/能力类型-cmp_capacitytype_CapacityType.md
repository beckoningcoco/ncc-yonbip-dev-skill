---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitytype.CapacityType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力类型 (`cmp.capacitytype.CapacityType`)

> DCRP | 物理表：`cmp_capacity_type`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力类型 |
| 物理表 | `cmp_capacity_type` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:27.9460` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `code` | 编码 | `code` | String |
| 4 | `name` | 名称 | `name` | String |
| 5 | `preset` | 是否系统预置 | `preset` | Short |
| 6 | `memo` | 备注 | `memo` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enable` | 启用 | `enable` | sys_intboolean |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime |
| 10 | `disablets` | 停用时间 | `disablets` | DateTime |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
