---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.area.MrpArea"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划区域 (`mr.area.MrpArea`)

> MR | 物理表：`mr_mrp_area`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划区域 |
| 物理表 | `mr_mrp_area` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:21.6090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `code` | String | 编码 |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | id | `id` | Long |
| 4 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `code` | 编码 | `code` | String |
| 6 | `name` | 名称 | `name` | String |
| 7 | `areaType` | 类型 | `area_type` | AreaType |
| 8 | `datasub` | 应用来源 | `datasub` | String |
| 9 | `isControlStockHand` | 仓库只控制现存量 | `is_control_stock_hand` | Boolean |
| 10 | `remark` | 备注 | `remark` | String |
| 11 | `stopstatus` | 启用状态 | `stopstatus` | Boolean |
| 12 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 13 | `creator` | 创建人 | `creator` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `modifier` | 修改人 | `modifier` | String |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `mrpAreaDetail` | 计划区域明细 | `` | a5cb929e-b8a2-4a65-a13d-8f0eae794b97 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `mrpAreaDetail` | 计划区域明细 | `mr.area.MrpAreaDetail` | None | true |
| 5 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
