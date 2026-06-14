---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.enum.EnumValue"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 枚举值 (`pes.enum.EnumValue`)

> IMP_PES | 物理表：`cbo_enum_values`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 枚举值 |
| 物理表 | `cbo_enum_values` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:35.5710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `enumsType` | 枚举类型 | `enumsType` | 052e03f5-2818-45c5-9b59-5b704fa20f6c |
| 2 | `valueIndex` | 序号 | `valueIndex` | Integer |
| 3 | `code` | 编码 | `code` | String |
| 4 | `name` | 名称 | `name` | String |
| 5 | `isSystem` | 是否系统预置 | `Is_System` | Integer |
| 6 | `modifiable` | 可修改 | `modifiable` | Integer |
| 7 | `memo` | 备注 | `memo` | String |
| 8 | `createUser` | 创建者 | `create_user` | String |
| 9 | `createTimeStr` | 创建时间 | `create_time` | String |
| 10 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 11 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 12 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 13 | `id` | ID | `id` | String |
| 14 | `dr` | 逻辑删除 | `dr` | Integer |
| 15 | `tenant` | 租户 | `TENANT_ID` | String |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enumsType` | 枚举类型 | `pes.enum.EnumType` | None | true |
| 3 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
