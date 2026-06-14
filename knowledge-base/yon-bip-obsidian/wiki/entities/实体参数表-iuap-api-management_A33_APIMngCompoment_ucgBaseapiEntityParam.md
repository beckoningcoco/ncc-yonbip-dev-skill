---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiEntityParam"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 实体参数表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiEntityParam`)

> INPAPI | 物理表：`ucg_baseapi_entity_param`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 实体参数表 |
| 物理表 | `ucg_baseapi_entity_param` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:29.3350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicationcode` | applicationcode | `applicationCode` | String |
| 2 | `arr` | arr | `arr` | Integer |
| 3 | `baseType` | baseType | `base_type` | Integer |
| 4 | `defaultValue` | defaultValue | `default_value` | String |
| 5 | `dr` | dr | `dr` | Integer |
| 6 | `entityCode` | entityCode | `entity_code` | String |
| 7 | `entityId` | entityId | `entity_id` | 449b6a32-dd4e-463b-b313-1f52f60cffef |
| 8 | `example` | example | `example` | String |
| 9 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 10 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 11 | `id` | id | `id` | String |
| 12 | `maxLength` | maxLength | `max_length` | String |
| 13 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 14 | `name` | name | `name` | String |
| 15 | `paramDesc` | paramDesc | `param_desc` | String |
| 16 | `paramOrder` | paramOrder | `param_order` | Integer |
| 17 | `paramType` | paramType | `param_type` | String |
| 18 | `parentId` | parentId | `parent_id` | d5bfb150-eee5-407d-ae36-cdb3c823f51e |
| 19 | `refType` | refType | `ref_type` | String |
| 20 | `refTypeContext` | refTypeContext | `ref_type_context` | String |
| 21 | `required` | required | `required` | Integer |
| 22 | `visible` | visible | `visible` | Integer |
| 23 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `entityId` | entityId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiEntity` | None | true |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `parentId` | parentId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiEntityParam` | None |  |
