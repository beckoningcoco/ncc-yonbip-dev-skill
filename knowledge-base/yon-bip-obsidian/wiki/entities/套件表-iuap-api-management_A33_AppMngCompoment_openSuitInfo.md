---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.openSuitInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 套件表 (`iuap-api-management.A33_AppMngCompoment.openSuitInfo`)

> INPAPI | 物理表：`open_suit_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 套件表 |
| 物理表 | `open_suit_info` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:59.7970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicationId` | applicationId | `application_id` | 7ae90a43-2005-4d0f-9692-e45f61aa2e0d |
| 2 | `callBackUrl` | callBackUrl | `call_back_url` | String |
| 3 | `classifyPk` | classifyPk | `classify_pk` | String |
| 4 | `createrUserId` | createrUserId | `creater_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 5 | `description` | description | `description` | String |
| 6 | `dr` | dr | `dr` | Integer |
| 7 | `email` | email | `email` | String |
| 8 | `encodingAesKey` | encodingAesKey | `encoding_aes_key` | String |
| 9 | `eventCallbackUrl` | eventCallbackUrl | `event_callback_url` | String |
| 10 | `eventRegisterStatus` | eventRegisterStatus | `event_register_status` | Integer |
| 11 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 12 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 13 | `id` | id | `id` | String |
| 14 | `isvId` | isvId | `isv_id` | String |
| 15 | `logoPath` | logoPath | `logo_path` | String |
| 16 | `msgCode` | msgCode | `msg_code` | String |
| 17 | `name` | name | `name` | String |
| 18 | `openAppAuthRecordList` | 应用授权记录 | `` | ba2f9402-d4cb-453f-9496-0d497db4f278 |
| 19 | `serviceCode` | serviceCode | `service_code` | String |
| 20 | `suitKey` | suitKey | `suit_key` | 7ae90a43-2005-4d0f-9692-e45f61aa2e0d |
| 21 | `suitSecret` | suitSecret | `suit_secret` | String |
| 22 | `ticketAutoEnable` | ticketAutoEnable | `ticket_auto_enable` | Integer |
| 23 | `updateUserId` | updateUserId | `update_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 24 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `openAppAuthRecordList` | 应用授权记录 | `iuap-api-management.A33_AppMngCompoment.openAppAuthRecord` | None | true |
| 2 | `suitKey` | suitKey | `iuap-api-management.A33_AppMngCompoment.ucgBaseapiApp` | None |  |
| 3 | `updateUserId` | updateUserId | `base.user.BipUser` | Service |  |
| 4 | `createrUserId` | createrUserId | `base.user.BipUser` | Service |  |
| 5 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `applicationId` | applicationId | `iuap-api-management.A33_AppMngCompoment.ucgBaseapiApp` | None | true |
