---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.ucgBaseapiApp"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API调用 (`iuap-api-management.A33_AppMngCompoment.ucgBaseapiApp`)

> INPAPI | 物理表：`ucg_baseapi_app`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API调用 |
| 物理表 | `ucg_baseapi_app` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:51.3350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `appCode` | appCode | `app_code` | String |
| 2 | `appKey` | appKey | `app_key` | String |
| 3 | `appSecret` | appSecret | `app_secret` | String |
| 4 | `bindUser` | bindUser | `bind_user` | String |
| 5 | `bindUserType` | bindUserType | `bind_user_type` | String |
| 6 | `callBackUrl` | callBackUrl | `call_back_url` | String |
| 7 | `createWay` | createWay | `create_way` | Integer |
| 8 | `description` | description | `description` | String |
| 9 | `dr` | dr | `dr` | Integer |
| 10 | `email` | email | `email` | String |
| 11 | `enable` | enable | `enable` | Integer |
| 12 | `encodingAesKey` | encodingAesKey | `encoding_aes_key` | String |
| 13 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 14 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 15 | `id` | id | `id` | String |
| 16 | `isvId` | isvId | `isv_id` | String |
| 17 | `openSuitAuthList` | 生态应用开通结果表 | `` | 1adfd596-cd74-44b6-9a93-34c1a440dd1e |
| 18 | `openSuitInfoList` | 套件表 | `` | 251724f2-6415-4c4e-8097-a264bcd9c4f1 |
| 19 | `source` | source | `source` | Integer |
| 20 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 21 | `ticketAutoEnable` | ticketAutoEnable | `ticket_auto_enable` | Integer |
| 22 | `ucgBaseapiAppApiList` | 应用和API授权表 | `` | fb3cd413-6647-4295-85ae-a88fb77aed02 |
| 23 | `ucgBaseapiPrivateAppList` | 自建应用表 | `` | aacddf5a-1668-4269-9df8-184c351c528a |
| 24 | `userId` | userId | `user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 25 | `visible` | visible | `visible` | Integer |
| 26 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ucgBaseapiAppApiList` | 应用和API授权表 | `iuap-api-management.A33_AppMngCompoment.ucgBaseapiAppApi` | None | true |
| 2 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ucgBaseapiPrivateAppList` | 自建应用表 | `iuap-api-management.A33_AppMngCompoment.ucgBaseapiPrivateApp` | None | true |
| 5 | `userId` | userId | `base.user.BipUser` | Service |  |
| 6 | `openSuitAuthList` | 生态应用开通结果表 | `iuap-api-management.A33_AppMngCompoment.openSuitAuth` | None | true |
| 7 | `openSuitInfoList` | 套件表 | `iuap-api-management.A33_AppMngCompoment.openSuitInfo` | None | true |
