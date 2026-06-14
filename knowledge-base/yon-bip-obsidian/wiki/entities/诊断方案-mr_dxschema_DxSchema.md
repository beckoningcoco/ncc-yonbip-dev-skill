---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.dxschema.DxSchema"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 诊断方案 (`mr.dxschema.DxSchema`)

> MR | 物理表：`mr_dx_schema`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 诊断方案 |
| 物理表 | `mr_dx_schema` |
| domain/服务域 | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:41.3390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `name` | 名称 | `name` | String |
| 5 | `code` | 编码 | `code` | String |
| 6 | `name2` | 名称(英文) | `name` | String |
| 7 | `name3` | 名称(繁体) | `name` | String |
| 8 | `name4` | 名称(法语) | `name` | String |
| 9 | `name5` | 名称(备用) | `name` | String |
| 10 | `name6` | 名称(备用) | `name` | String |
| 11 | `memo` | 描述 | `memo` | String |
| 12 | `type` | 类型 | `type` | String |
| 13 | `billNumber` | 页面 | `bill_number` | String |
| 14 | `scriptId` | 脚本Id | `scriptId` | String |
| 15 | `order` | 顺序 | `order` | Integer |
| 16 | `config` | 配置 | `config` | String |
| 17 | `enable` | 启用 | `enable` | Boolean |
| 18 | `datasub` | 应用来源 | `datasub` | String |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `createDate` | 创建日期 | `create_date` | Date |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime |
| 24 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime |
| 28 | `schemaItem` | 诊断项⽬ | `` | 565c5ff3-136a-4079-b863-5754dfa35f51 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `schemaItem` | 诊断项⽬ | `mr.dxschema.DxSchemaItem` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
