---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamMap"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API入参映射表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamMap`)

> INPAPI | 物理表：`ucg_baseapi_param_map`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API入参映射表 |
| 物理表 | `ucg_baseapi_param_map` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:33.4590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `aggregatedValueObject` | aggregatedValueObject | `aggregated_value_object` | Integer |
| 2 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 3 | `arr` | arr | `arr` | Integer |
| 4 | `baseType` | baseType | `base_type` | Integer |
| 5 | `dr` | dr | `dr` | Integer |
| 6 | `enableMulti` | enableMulti 参数是否支持多语 | `enable_multi` | Integer |
| 7 | `example` | example | `example` | String |
| 8 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 9 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 10 | `id` | id | `id` | String |
| 11 | `mapName` | mapName | `map_name` | String |
| 12 | `mapParamType` | mapParamType | `map_param_type` | String |
| 13 | `name` | name | `name` | String |
| 14 | `paramDesc` | paramDesc | `param_desc` | String |
| 15 | `paramList` | paramList | `param_list` | String |
| 16 | `paramOrder` | paramOrder | `param_order` | Integer |
| 17 | `paramType` | paramType | `param_type` | String |
| 18 | `parentId` | parentId | `parent_id` | 9620993e-3db6-4368-9bcf-1db3806632c9 |
| 19 | `primitive` | primitive | `primitive` | Integer |
| 20 | `requestParamType` | requestParamType | `request_param_type` | String |
| 21 | `serviceParamType` | serviceParamType | `service_param_type` | String |
| 22 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None | true |
| 3 | `parentId` | parentId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamMap` | None |  |
