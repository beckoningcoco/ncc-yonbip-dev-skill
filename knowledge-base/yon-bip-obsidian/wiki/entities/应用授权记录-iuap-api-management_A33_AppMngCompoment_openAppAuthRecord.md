---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.openAppAuthRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 应用授权记录 (`iuap-api-management.A33_AppMngCompoment.openAppAuthRecord`)

> INPAPI | 物理表：`open_app_auth_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应用授权记录 |
| 物理表 | `open_app_auth_record` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:51.6010` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `appId` | appId | `app_id` | String |
| 2 | `authBeginTime` | authBeginTime | `auth_begin_time` | Date |
| 3 | `authExpireTime` | authExpireTime | `auth_expire_time` | Date |
| 4 | `diworkAppId` | diworkAppId | `diwork_app_id` | String |
| 5 | `dr` | dr | `dr` | Integer |
| 6 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 7 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 8 | `id` | id | `id` | String |
| 9 | `suitId` | suitId | `suit_id` | 251724f2-6415-4c4e-8097-a264bcd9c4f1 |
| 10 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `userId` | userId | `user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 12 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `suitId` | suitId | `iuap-api-management.A33_AppMngCompoment.openSuitInfo` | None | true |
| 2 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `userId` | userId | `base.user.BipUser` | Service |  |
