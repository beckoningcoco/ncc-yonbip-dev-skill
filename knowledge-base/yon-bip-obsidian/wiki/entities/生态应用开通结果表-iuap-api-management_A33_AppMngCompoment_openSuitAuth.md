---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.openSuitAuth"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生态应用开通结果表 (`iuap-api-management.A33_AppMngCompoment.openSuitAuth`)

> INPAPI | 物理表：`open_suit_auth`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生态应用开通结果表 |
| 物理表 | `open_suit_auth` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:41.5290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `appId` | appId | `app_id` | String |
| 2 | `authStatus` | authStatus | `auth_status` | String |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 5 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 6 | `id` | id | `id` | String |
| 7 | `isvId` | isvId | `isv_id` | String |
| 8 | `market` | market | `market` | String |
| 9 | `operateBy` | operateBy | `operate_by` | String |
| 10 | `orderId` | orderId | `order_id` | String |
| 11 | `orderTime` | orderTime | `order_time` | String |
| 12 | `platform` | platform | `platform` | String |
| 13 | `productlineCode` | productlineCode | `productline_code` | String |
| 14 | `source` | source | `source` | Integer |
| 15 | `suitId` | suitId | `suit_id` | 251724f2-6415-4c4e-8097-a264bcd9c4f1 |
| 16 | `suitKey` | suitKey | `suit_key` | 7ae90a43-2005-4d0f-9692-e45f61aa2e0d |
| 17 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 18 | `updateBy` | updateBy | `update_by` | String |
| 19 | `userId` | userId | `user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 20 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `suitKey` | suitKey | `iuap-api-management.A33_AppMngCompoment.ucgBaseapiApp` | None | true |
| 2 | `suitId` | suitId | `iuap-api-management.A33_AppMngCompoment.openSuitInfo` | None |  |
| 3 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `userId` | userId | `base.user.BipUser` | Service |  |
