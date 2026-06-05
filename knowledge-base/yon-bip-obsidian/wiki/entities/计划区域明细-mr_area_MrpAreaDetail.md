---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.area.MrpAreaDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划区域明细 (`mr.area.MrpAreaDetail`)

> MR | 物理表：`mr_mrp_area_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划区域明细 |
| 物理表 | `mr_mrp_area_detail` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:12:05.3560` |

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
| 4 | `mrpAreaId` | 区域计划主表关联标识 | `mrp_area_id` | 332b10c1-76bf-45d5-8aa7-421964568756 |
| 5 | `deptId` | 部门id | `dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 6 | `whId` | 仓库id | `wh_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 7 | `inventoryDeptId` | 库存部门 | `inventory_dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 8 | `inventoryWhId` | 库存仓库 | `inventory_wh_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 9 | `reWhId` | 收货仓id | `re_wh_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 10 | `deWhId` | 发货仓id | `de_wh_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `deWhId` | 发货仓id | `aa.warehouse.Warehouse` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `mrpAreaId` | 区域计划主表关联标识 | `mr.area.MrpArea` | None | true |
| 4 | `deptId` | 部门id | `aa.baseorg.DeptMV` | Service |  |
| 5 | `inventoryDeptId` | 库存部门 | `aa.baseorg.DeptMV` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `whId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 9 | `inventoryWhId` | 库存仓库 | `aa.warehouse.Warehouse` | Service |  |
| 10 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 11 | `reWhId` | 收货仓id | `aa.warehouse.Warehouse` | Service |  |
