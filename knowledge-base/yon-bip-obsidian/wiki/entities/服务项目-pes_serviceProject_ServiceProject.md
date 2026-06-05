---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceProject.ServiceProject"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务项目 (`pes.serviceProject.ServiceProject`)

> IMP_PES | 物理表：`sms_projects`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务项目 |
| 物理表 | `sms_projects` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:17.4850` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `tos_id` | 服务类型id | `tos_id` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 4 | `is_effective` | 启用状态 | `is_effective` | Integer |
| 5 | `memo` | 备注 | `memo` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `createUser` | 创建者 | `create_user` | String |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 17 | `id` | ID | `id` | String |
| 18 | `dr` | 逻辑删除 | `dr` | Integer |
| 19 | `tenant` | 租户ID | `tenant_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `tos_id` | 服务类型id | `pes.tos.Tos` | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
