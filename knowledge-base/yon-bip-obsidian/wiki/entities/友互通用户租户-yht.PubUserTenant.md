---
tags: ["BIP", "元数据", "数据字典", "basedoc.yht.PubUserTenant"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 友互通用户租户 (`basedoc.yht.PubUserTenant`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP  模块实体元数据字典。
> 物理表：`idx_user_relation` | 所属应用：``
> 来源：元数据API `queryByUri` 返回的 `basedoc.yht.PubUserTenant` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 友互通用户租户 |
| 物理表 | `idx_user_relation` |
| 数据库 schema | `esdomin` |
| 所属应用 | `` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:29.0740` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `user_id` | `user_id` | String | ID |

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 直接属性（共 9 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `dr` | 删除标识 | `is_dele` | Integer | `int` |  |  |
| 2 | `id` | ID | `user_id` | String | `text` |  |  |
| 3 | `pubUserID` | 用户表中用户id | `pub_user_id` | String | `text` |  |  |
| 4 | `tenant` | 租户id | `tenant_id` | String | `text` |  |  |
| 5 | `ts` | 用户创建时间 | `user_ts` | Long | `long` |  |  |
| 6 | `typeID` | 用户类型 | `type_id` | String | `text` |  |  |
| 7 | `userCode` | 用户编码 | `user_code` | String | `text` |  |  |
| 8 | `userID` | 关系表用户id | `user_id` | String | `text` |  |  |
| 9 | `userName` | 用户名称 | `user_name` | String | `text` |  |  |

---

