---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.tos.Tos"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务类型 (`pes.tos.Tos`)

> IMP_PES | 物理表：`sms_tos`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务类型 |
| 物理表 | `sms_tos` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:49.8170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `ID` | String | 主键 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `isEffective` | 生效 | `is_effective` | Boolean |
| 4 | `isSystem` | 系统预置 | `is_system` | Boolean |
| 5 | `memo` | 备注 | `memo` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 15 | `type` | 类型 | `type` | Integer |
| 16 | `id` | 主键 | `ID` | String |
| 17 | `tenant` | 租户ID | `tenant_id` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
