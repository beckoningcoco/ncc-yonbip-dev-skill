---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamReturn"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API返回值参数表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamReturn`)

> INPAPI | 物理表：`ucg_baseapi_param_return`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API返回值参数表 |
| 物理表 | `ucg_baseapi_param_return` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:56.8060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `applicationcode` | applicationcode | `applicationCode` | String |
| 3 | `arr` | arr | `arr` | Integer |
| 4 | `baseType` | baseType | `base_type` | Integer |
| 5 | `defParamId` | defParamId | `def_param_id` | String |
| 6 | `defaultValue` | defaultValue | `default_value` | String |
| 7 | `defineHidden` | defineHidden | `define_hidden` | Integer |
| 8 | `dr` | dr | `dr` | Integer |
| 9 | `enableMulti` | 参数是否支持多语 | `enable_multi` | Integer |
| 10 | `example` | example | `example` | String |
| 11 | `fullName` | fullName | `full_name` | String |
| 12 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 13 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 14 | `id` | id | `id` | String |
| 15 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 16 | `name` | name | `name` | String |
| 17 | `paramDesc` | paramDesc | `param_desc` | String |
| 18 | `paramOrder` | paramOrder | `param_order` | Integer |
| 19 | `paramType` | paramType | `param_type` | String |
| 20 | `parentId` | parentId | `parent_id` | 39f282bf-6025-4a62-a888-72a2d3227772 |
| 21 | `refType` | refType | `ref_type` | String |
| 22 | `refTypeContext` | refTypeContext | `ref_type_context` | String |
| 23 | `required` | required | `required` | Integer |
| 24 | `visible` | visible | `visible` | Integer |
| 25 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None |  |
| 3 | `parentId` | parentId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamReturn` | None |  |
