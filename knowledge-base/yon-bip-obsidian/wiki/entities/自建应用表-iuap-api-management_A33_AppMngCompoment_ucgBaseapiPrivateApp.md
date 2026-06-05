---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.ucgBaseapiPrivateApp"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 自建应用表 (`iuap-api-management.A33_AppMngCompoment.ucgBaseapiPrivateApp`)

> INPAPI | 物理表：`ucg_baseapi_private_app`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自建应用表 |
| 物理表 | `ucg_baseapi_private_app` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:46.5390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `appCode` | appCode | `app_code` | String |
| 2 | `appKey` | appKey | `app_key` | 7ae90a43-2005-4d0f-9692-e45f61aa2e0d |
| 3 | `appSecret` | appSecret | `app_secret` | String |
| 4 | `contactMail` | contactMail | `contact_mail` | String |
| 5 | `contactName` | contactName | `contact_name` | String |
| 6 | `contactTel` | contactTel | `contact_tel` | String |
| 7 | `creater` | creater | `creater` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 8 | `description` | description | `description` | String |
| 9 | `diworkId` | diworkId | `diwork_id` | String |
| 10 | `dr` | dr | `dr` | Integer |
| 11 | `environment` | environment | `environment` | String |
| 12 | `eventCallbackUrl` | eventCallbackUrl | `event_callback_url` | String |
| 13 | `eventRegisterStatus` | eventRegisterStatus | `event_register_status` | Integer |
| 14 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 15 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 16 | `id` | id | `id` | String |
| 17 | `isvId` | isvId | `isv_id` | String |
| 18 | `logoPath` | logoPath | `logo_path` | String |
| 19 | `name` | name | `name` | String |
| 20 | `openStatus` | openStatus | `open_status` | Integer |
| 21 | `preset` | preset | `preset` | Integer |
| 22 | `source` | source | `source` | String |
| 23 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `updateBy` | updateBy | `update_by` | String |
| 25 | `userId` | userId | `user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 26 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creater` | creater | `base.user.BipUser` | Service |  |
| 2 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `appKey` | appKey | `iuap-api-management.A33_AppMngCompoment.ucgBaseapiApp` | None | true |
| 4 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `userId` | userId | `base.user.BipUser` | Service |  |
