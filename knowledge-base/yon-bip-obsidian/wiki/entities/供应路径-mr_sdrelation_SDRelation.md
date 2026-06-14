---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.sdrelation.SDRelation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供应路径 (`mr.sdrelation.SDRelation`)

> MR | 物理表：`mr_sd_relation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应路径 |
| 物理表 | `mr_sd_relation` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:10.5280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `id` | ID | `id` | Long |
| 5 | `name` | 名称 | `name` | String |
| 6 | `code` | 编码 | `code` | String |
| 7 | `allocationMethod` | 分配方式 | `allocation_method` | AllocationMethodEnum |
| 8 | `remark` | 备注 | `remark` | String |
| 9 | `stopstatus` | 启用状态 | `stopstatus` | Boolean |
| 10 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 11 | `datasub` | 应用来源 | `datasub` | String |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `sdRelationDemand` | 供应路径-需求 | `` | 35696f11-f0cd-42aa-bf8a-b41478e12e67 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 6 | `sdRelationDemand` | 供应路径-需求 | `mr.sdrelation.SDRelationDemand` | None | true |
