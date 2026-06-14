---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteStgy"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 后端策略 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteStgy`)

> INPAPI | 物理表：`ucg_baseapi_api_route_stgy`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 后端策略 |
| 物理表 | `ucg_baseapi_api_route_stgy` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:55.4390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `connectUrl` | connectUrl | `connect_url` | String |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `effeMode` | effeMode | `effe_mode` | Integer |
| 5 | `functionId` | functionId | `function_id` | String |
| 6 | `functionName` | functionName | `function_name` | String |
| 7 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 8 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 9 | `id` | id | `id` | String |
| 10 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 11 | `pathJoin` | pathJoin | `path_join` | Integer |
| 12 | `rpcAppName` | rpcAppName | `rpc_app_name` | String |
| 13 | `rpcMethodName` | rpcMethodName | `rpc_method_name` | String |
| 14 | `rpcServiceName` | rpcServiceName | `rpc_service_name` | String |
| 15 | `rpcServiceUrl` | rpcServiceUrl | `rpc_service_url` | String |
| 16 | `serviceHttpMethod` | serviceHttpMethod | `service_http_method` | String |
| 17 | `sort` | sort | `sort` | Integer |
| 18 | `stgyName` | stgyName | `stgy_name` | String |
| 19 | `timeOut` | timeOut | `time_out` | Integer |
| 20 | `ucgBaseapiApiRouteParamList` | 后端策略参数 | `` | b46f5fa9-1b23-48a1-b79c-79704c72a6bd |
| 21 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None |  |
| 3 | `ucgBaseapiApiRouteParamList` | 后端策略参数 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteParam` | None | true |
