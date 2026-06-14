---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "PES.standardAllot.StandardAllotDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务项目标准分配明细 (`PES.standardAllot.StandardAllotDetail`)

> IMP_PES | 物理表：`sms_allot_std_lines`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务项目标准分配明细 |
| 物理表 | `sms_allot_std_lines` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:31.5950` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `stdId` | 服务标准id | `std_id` | 98445ec1-4f62-4ff1-8586-5f434484ce2e |
| 2 | `isEffective` | 启用状态 | `is_effective` | Boolean |
| 3 | `memo` | 备注 | `memo` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `createUser` | 创建人 | `create_user` | DateTime |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `lastModifyUser` | 修改人 | `last_modify_user` | DateTime |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `lastModified` | 修改时间 | `last_modified` | DateTime |
| 15 | `allotStdId` | 服务项目标准主表id | `allot_std_id` | eb39b0ca-1f77-4946-83eb-9424e55b95ce |
| 16 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 17 | `isVisible` | 是否可见 | `is_visible` | Boolean |
| 18 | `id` | id | `id` | String |
| 19 | `dr` | DR | `dr` | Short |
| 20 | `tenant` | 租户ID | `tenant_id` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `ts` | 时间戳 | `ts` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `stdId` | 服务标准id | `pes.serviceProject.ServiceStandard` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `allotStdId` | 服务项目标准主表id | `PES.standardAllot.StandardAllot` | None | true |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
