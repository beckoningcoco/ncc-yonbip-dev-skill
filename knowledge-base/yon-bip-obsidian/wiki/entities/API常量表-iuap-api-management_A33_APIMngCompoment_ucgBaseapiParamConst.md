---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamConst"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API常量表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamConst`)

> INPAPI | 物理表：`ucg_baseapi_param_const`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API常量表 |
| 物理表 | `ucg_baseapi_param_const` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:30.7080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `applicationcode` | applicationcode | `applicationCode` | String |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 5 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 6 | `id` | id | `id` | String |
| 7 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 8 | `name` | name | `name` | String |
| 9 | `paramDesc` | paramDesc | `param_desc` | String |
| 10 | `paramOrder` | paramOrder | `param_order` | Integer |
| 11 | `paramType` | paramType | `param_type` | String |
| 12 | `requestParamType` | requestParamType | `request_param_type` | String |
| 13 | `value` | value | `value` | String |
| 14 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None | true |
