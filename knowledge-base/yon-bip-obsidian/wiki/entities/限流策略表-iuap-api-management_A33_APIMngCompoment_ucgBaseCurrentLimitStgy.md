---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseCurrentLimitStgy"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 限流策略表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseCurrentLimitStgy`)

> INPAPI | 物理表：`ucg_base_current_limit_stgy`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 限流策略表 |
| 物理表 | `ucg_base_current_limit_stgy` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:47.1960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createUserId` | createUserId | `create_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 2 | `currentLevel` | currentLevel | `current_level` | String |
| 3 | `description` | description | `description` | String |
| 4 | `dr` | dr | `dr` | Integer |
| 5 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 6 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 7 | `id` | id | `id` | String |
| 8 | `isvId` | isvId | `isv_id` | String |
| 9 | `name` | name | `name` | String |
| 10 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `updateUserId` | updateUserId | `update_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 12 | `userId` | userId | `user_id` | String |
| 13 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `createUserId` | createUserId | `base.user.BipUser` | Service |  |
| 2 | `updateUserId` | updateUserId | `base.user.BipUser` | Service |  |
| 3 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
