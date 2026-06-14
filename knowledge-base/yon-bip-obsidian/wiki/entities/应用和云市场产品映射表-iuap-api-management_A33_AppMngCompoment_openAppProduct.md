---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.openAppProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 应用和云市场产品映射表 (`iuap-api-management.A33_AppMngCompoment.openAppProduct`)

> INPAPI | 物理表：`open_app_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应用和云市场产品映射表 |
| 物理表 | `open_app_product` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:38.8480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `appId` | appId | `app_id` | 58766359-42c9-491a-a74a-938b95d4d38d |
| 2 | `dr` | dr | `dr` | Integer |
| 3 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 4 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 5 | `id` | id | `id` | String |
| 6 | `platform` | platform | `platform` | String |
| 7 | `productId` | productId | `product_id` | String |
| 8 | `productName` | productName | `product_name` | String |
| 9 | `yswProductId` | yswProductId | `ysw_product_id` | String |
| 10 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `appId` | appId | `iuap-api-management.A33_AppMngCompoment.openApp` | None | true |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
