---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.openApp"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生态应用表 (`iuap-api-management.A33_AppMngCompoment.openApp`)

> INPAPI | 物理表：`open_app`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生态应用表 |
| 物理表 | `open_app` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:05.4220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（43个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `appCode` | appCode | `app_code` | String |
| 2 | `appType` | appType | `app_type` | Integer |
| 3 | `appUrl` | appUrl | `app_url` | String |
| 4 | `bussType` | bussType | `buss_type` | String |
| 5 | `clientStatus` | clientStatus | `client_status` | Integer |
| 6 | `clientType` | clientType | `client_type` | String |
| 7 | `clientUrl` | clientUrl | `client_url` | String |
| 8 | `description` | description | `description` | String |
| 9 | `devModel` | devModel | `dev_model` | Integer |
| 10 | `domainCode` | domainCode | `domain_code` | String |
| 11 | `dr` | dr | `dr` | Integer |
| 12 | `encryptType` | encryptType | `encrypt_type` | String |
| 13 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 14 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 15 | `home` | home | `home` | Integer |
| 16 | `id` | id | `id` | String |
| 17 | `isvId` | isvId | `isv_id` | String |
| 18 | `logoPath` | logoPath | `logo_path` | String |
| 19 | `name` | name | `name` | String |
| 20 | `nameEn` | nameEn | `name_en` | String |
| 21 | `nameTw` | nameTw | `name_tw` | String |
| 22 | `nativeAuth` | nativeAuth | `native_auth` | Integer |
| 23 | `nativeRedirectUrl` | nativeRedirectUrl | `native_redirect_url` | String |
| 24 | `navShow` | navShow | `nav_show` | Integer |
| 25 | `openAppProductList` | 应用和云市场产品映射表 | `` | 1a7757f9-7ecc-490a-a8c6-f87c9611e589 |
| 26 | `openAppServiceList` | 生态应用服务表 | `` | c7df68f2-52d2-4fde-8ee6-656df4b8433e |
| 27 | `openNewTab` | openNewTab | `open_new_tab` | Integer |
| 28 | `phoneStatus` | phoneStatus | `phone_status` | Integer |
| 29 | `phoneUrl` | phoneUrl | `phone_url` | String |
| 30 | `pubEnv` | pubEnv | `pub_env` | String |
| 31 | `pushDiwork` | pushDiwork | `push_diwork` | Integer |
| 32 | `pushYht` | pushYht | `push_yht` | Integer |
| 33 | `resCode` | resCode | `res_code` | String |
| 34 | `status` | status | `status` | String |
| 35 | `strategy` | strategy | `strategy` | String |
| 36 | `suitId` | suitId | `suit_id` | 251724f2-6415-4c4e-8097-a264bcd9c4f1 |
| 37 | `type` | type | `type` | String |
| 38 | `typeCode` | typeCode | `type_code` | String |
| 39 | `updateUserId` | updateUserId | `update_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 40 | `userId` | userId | `user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 41 | `webStatus` | webStatus | `web_status` | Integer |
| 42 | `webUrl` | webUrl | `web_url` | String |
| 43 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `updateUserId` | updateUserId | `base.user.BipUser` | Service |  |
| 2 | `suitId` | suitId | `iuap-api-management.A33_AppMngCompoment.openSuitInfo` | None |  |
| 3 | `openAppProductList` | 应用和云市场产品映射表 | `iuap-api-management.A33_AppMngCompoment.openAppProduct` | None | true |
| 4 | `openAppServiceList` | 生态应用服务表 | `iuap-api-management.A33_AppMngCompoment.openAppService` | None | true |
| 5 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `userId` | userId | `base.user.BipUser` | Service |  |
