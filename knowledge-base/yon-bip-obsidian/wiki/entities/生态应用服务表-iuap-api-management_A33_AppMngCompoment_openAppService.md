---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.openAppService"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生态应用服务表 (`iuap-api-management.A33_AppMngCompoment.openAppService`)

> INPAPI | 物理表：`open_app_service`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生态应用服务表 |
| 物理表 | `open_app_service` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:40.1660` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `appId` | appId | `app_id` | 58766359-42c9-491a-a74a-938b95d4d38d |
| 2 | `clientStatus` | clientStatus | `client_status` | Integer |
| 3 | `createrUserId` | createrUserId | `creater_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `dingdingStatus` | dingdingStatus | `dingding_status` | Integer |
| 5 | `dr` | dr | `dr` | Integer |
| 6 | `enable` | enable | `enable` | Integer |
| 7 | `everyone` | everyone | `everyone` | Integer |
| 8 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 9 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 10 | `id` | id | `id` | String |
| 11 | `name` | name | `name` | String |
| 12 | `nameEn` | nameEn | `name_en` | String |
| 13 | `nameTw` | nameTw | `name_tw` | String |
| 14 | `openAppServiceClientList` | 生态应用客户端服务信息表 | `` | f49532f3-feb8-4991-93fb-58230468ce04 |
| 15 | `openAppServiceDdList` | 生态应用钉钉服务信息表 | `` | 02d838d5-bb28-4f3e-a118-354d56b1a336 |
| 16 | `openAppServiceUspaceList` | 生态应用空间服务信息表 | `` | 5d84182f-a3f7-4994-be64-b56bbd4df25a |
| 17 | `openAppServiceWebList` | 生态应用web端服务信息表 | `` | 0d47e0ed-5dbc-472b-8b3b-e536d74ae3f6 |
| 18 | `openAppServiceWxList` | 生态应用微信服务信息表 | `` | bfabaa49-29eb-4a8e-b76f-68a40f008173 |
| 19 | `phoneStatus` | phoneStatus | `phone_status` | Integer |
| 20 | `serviceCode` | serviceCode | `service_code` | String |
| 21 | `serviceIcon` | serviceIcon | `service_icon` | String |
| 22 | `sysEveryone` | sysEveryone | `sys_everyone` | Integer |
| 23 | `updateUserId` | updateUserId | `update_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 24 | `webStatus` | webStatus | `web_status` | Integer |
| 25 | `wxStatus` | wxStatus | `wx_status` | Integer |
| 26 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `openAppServiceWebList` | 生态应用web端服务信息表 | `iuap-api-management.A33_AppMngCompoment.openAppServiceWeb` | None | true |
| 2 | `openAppServiceUspaceList` | 生态应用空间服务信息表 | `iuap-api-management.A33_AppMngCompoment.openAppServiceUspace` | None | true |
| 3 | `openAppServiceDdList` | 生态应用钉钉服务信息表 | `iuap-api-management.A33_AppMngCompoment.openAppServiceDd` | None | true |
| 4 | `updateUserId` | updateUserId | `base.user.BipUser` | Service |  |
| 5 | `appId` | appId | `iuap-api-management.A33_AppMngCompoment.openApp` | None | true |
| 6 | `openAppServiceClientList` | 生态应用客户端服务信息表 | `iuap-api-management.A33_AppMngCompoment.openAppServiceClient` | None | true |
| 7 | `openAppServiceWxList` | 生态应用微信服务信息表 | `iuap-api-management.A33_AppMngCompoment.openAppServiceWx` | None | true |
| 8 | `createrUserId` | createrUserId | `base.user.BipUser` | Service |  |
| 9 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
