---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiEntity"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 实体表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiEntity`)

> INPAPI | 物理表：`ucg_baseapi_entity`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 实体表 |
| 物理表 | `ucg_baseapi_entity` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:48.6020` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicationcode` | applicationcode | `applicationCode` | String |
| 2 | `code` | code | `code` | String |
| 3 | `createUserId` | createUserId | `create_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `createUserName` | createUserName | `create_user_name` | String |
| 5 | `description` | description | `description` | String |
| 6 | `dr` | dr | `dr` | Integer |
| 7 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 8 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 9 | `id` | id | `id` | String |
| 10 | `isvId` | isvId | `isv_id` | String |
| 11 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 12 | `name` | name | `name` | String |
| 13 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `ucgBaseapiEntityParamList` | 实体参数表 | `` | d5bfb150-eee5-407d-ae36-cdb3c823f51e |
| 15 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `createUserId` | createUserId | `base.user.BipUser` | Service |  |
| 2 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `ucgBaseapiEntityParamList` | 实体参数表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiEntityParam` | None | true |
| 4 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
