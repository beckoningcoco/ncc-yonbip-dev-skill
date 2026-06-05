---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.dispatchinfo.DispatchInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 派工单信息 (`sfc.dispatchinfo.DispatchInfo`)

> IMPSFC | 物理表：`imp_sfc_dispatch_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 派工单信息 |
| 物理表 | `imp_sfc_dispatch_info` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:40.8540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `creator` | 创建人名称 | `creator` | String |
| 2 | `code` | 编码 | `code` | String |
| 3 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `modifier` | 修改人名称 | `modifier` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `dispatchTime` | 派工时间 | `dispatch_time` | DateTime |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `id` | ID | `id` | Long |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `dispatchUserId` | 派工人 | `dispatch_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `ProcPlanList` | 派工工作台 | `` | 761ed5f1-5945-4f06-9c91-92368fe92ebe |
| 17 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `ProcPlanList` | 派工工作台 | `sfc.dispatchinfo.DispatchWorkbench` | None | true |
| 5 | `dispatchUserId` | 派工人 | `base.user.User` | Service |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
