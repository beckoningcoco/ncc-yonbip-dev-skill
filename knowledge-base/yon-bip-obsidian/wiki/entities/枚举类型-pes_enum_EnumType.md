---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.enum.EnumType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 枚举类型 (`pes.enum.EnumType`)

> IMP_PES | 物理表：`cbo_enums_type`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 枚举类型 |
| 物理表 | `cbo_enums_type` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:14.5340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `extended` | 可扩展 | `extended` | Integer |
| 4 | `isSystem` | 是否系统预置 | `Is_System` | Integer |
| 5 | `visible` | 是否显示 | `visible` | Integer |
| 6 | `memo` | 备注 | `memo` | String |
| 7 | `createUser` | 创建者 | `create_user` | String |
| 8 | `createTimeStr` | 创建时间 | `create_time` | String |
| 9 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 10 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 11 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `id` | ID | `id` | String |
| 13 | `dr` | 逻辑删除 | `dr` | Integer |
| 14 | `tenant` | 租户ID | `tenant_id` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `ts` | 版本号 | `ts` | String |
| 18 | `enumValueList` | 枚举值 | `` | bc55507b-7e08-4a2b-998a-dd9b3e953f8d |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `enumValueList` | 枚举值 | `pes.enum.EnumValue` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
