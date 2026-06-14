---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityobject.CapacityObjectLoc"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力对象位置 (`cmp.capacityobject.CapacityObjectLoc`)

> DCRP | 物理表：`cmp_capacity_object_loc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力对象位置 |
| 物理表 | `cmp_capacity_object_loc` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 14:00:01.2200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `capacityObjectId` | 加工中心 | `capacity_object_id` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `id` | ID | `id` | Long |
| 7 | `modifier` | 修改人名称 | `modifier` | String |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `moldCavityLocCode` | 模腔位置 | `mold_cavity_loc_code` | String |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `capacityObjectId` | 加工中心 | `cmp.capacityobject.CapacityObject` | None | true |
