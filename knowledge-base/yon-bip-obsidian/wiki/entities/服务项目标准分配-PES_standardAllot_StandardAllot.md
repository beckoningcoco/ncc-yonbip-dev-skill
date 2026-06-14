---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "PES.standardAllot.StandardAllot"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务项目标准分配 (`PES.standardAllot.StandardAllot`)

> IMP_PES | 物理表：`sms_allot_stds`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务项目标准分配 |
| 物理表 | `sms_allot_stds` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:33.2880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `stdCategory` | 标准分类 | `std_category` | String |
| 4 | `equipmentType` | 设备分类id | `equipment_type` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 5 | `tosId` | 服务类型id | `tos_id` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 6 | `projectId` | 服务项目id | `project_id` | 80e2a9ee-50bc-440b-97c0-694cf5697ccc |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `creator` | 创建人 | `creator` | String |
| 9 | `createUser` | 创建人 | `create_user` | DateTime |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifier` | 最后修改人 | `modifier` | String |
| 14 | `lastModifyUser` | 修改人 | `last_modify_user` | DateTime |
| 15 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `lastModified` | 修改时间 | `last_modified` | DateTime |
| 18 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `itemCategoryId` | 料品分类 | `item_category_id` | String |
| 20 | `id` | ID | `id` | String |
| 21 | `dr` | DR | `dr` | Short |
| 22 | `tenant` | 租户ID | `tenant_id` | String |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `ts` | 时间戳 | `ts` | String |
| 26 | `standardAllotDetailList` | 服务项目标准分配明细 | `` | b1fc07bb-bb26-4c7c-98dd-b672649efaf0 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `tosId` | 服务类型id | `pes.tos.Tos` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `standardAllotDetailList` | 服务项目标准分配明细 | `PES.standardAllot.StandardAllotDetail` | None | true |
| 6 | `projectId` | 服务项目id | `pes.serviceProject.ServiceProject` | None |  |
| 7 | `equipmentType` | 设备分类id | `ampub.ambase.CategoryVO` | Service |  |
| 8 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
