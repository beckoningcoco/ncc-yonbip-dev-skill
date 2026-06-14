---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.dxschema.DxSchemaItem"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 诊断项⽬ (`mr.dxschema.DxSchemaItem`)

> MR | 物理表：`mr_dx_schema_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 诊断项⽬ |
| 物理表 | `mr_dx_schema_item` |
| domain/服务域 | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:15:39.7590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `defaultClass` | 预处理脚本 | `default_class` | String |
| 7 | `defaultCondition` | 条件 | `default_condition` | String |
| 8 | `defaultScriptType` | 默认脚本类型 | `default_script_type` | String |
| 9 | `enable` | 启⽤ | `enable` | Boolean |
| 10 | `id` | ID | `id` | Long |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `name` | 名称 | `name` | String |
| 16 | `name2` | 名称（英文） | `name` | String |
| 17 | `name3` | 名称（繁体） | `name` | String |
| 18 | `name4` | 名称（法语） | `name` | String |
| 19 | `name5` | 名称（备用） | `name` | String |
| 20 | `name6` | 名称（备用） | `name` | String |
| 21 | `order` | 顺序 | `order` | Integer |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `schemeId` | 诊断方案 | `scheme_id` | b532cc9c-bfd8-4094-a58d-73eda903902a |
| 24 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `schemeId` | 诊断方案 | `mr.dxschema.DxSchema` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
