---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.timebucket.TimeBucket"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 时格资料 (`mr.timebucket.TimeBucket`)

> MR | 物理表：`mr_time_bucket`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 时格资料 |
| 物理表 | `mr_time_bucket` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 09:33:17.8590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 时格编码 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `datasub` | 应用来源 | `datasub` | String |
| 6 | `code` | 时格编码 | `code` | String |
| 7 | `name` | 时格名称 | `name` | String |
| 8 | `remark` | 备注 | `remark` | String |
| 9 | `prefabFlag` | 系统预置 | `prefab_flag` | Boolean |
| 10 | `creator` | 创建人 | `creator` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `modifier` | 修改人 | `modifier` | String |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `timeBucketPeriod` | 时格周期 | `` | 10c07e87-d716-4e10-9cda-7e211d4ff608 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `timeBucketPeriod` | 时格周期 | `mr.timebucket.TimeBucketPeriod` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `orgId` | 组织ID | `aa.baseorg.OrgMV` | Service |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
