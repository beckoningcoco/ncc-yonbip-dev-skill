---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.openAppServiceClient"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生态应用客户端服务信息表 (`iuap-api-management.A33_AppMngCompoment.openAppServiceClient`)

> INPAPI | 物理表：`open_app_service_client`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生态应用客户端服务信息表 |
| 物理表 | `open_app_service_client` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:53.0050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `clientOpenType` | clientOpenType | `client_open_type` | Integer |
| 2 | `clientUrl` | clientUrl | `client_url` | String |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 5 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 6 | `id` | id | `id` | String |
| 7 | `serviceId` | serviceId | `service_id` | c7df68f2-52d2-4fde-8ee6-656df4b8433e |
| 8 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `serviceId` | serviceId | `iuap-api-management.A33_AppMngCompoment.openAppService` | None | true |
