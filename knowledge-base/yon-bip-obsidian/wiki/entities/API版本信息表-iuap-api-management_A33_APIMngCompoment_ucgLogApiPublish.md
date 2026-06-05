---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgLogApiPublish"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API版本信息表 (`iuap-api-management.A33_APIMngCompoment.ucgLogApiPublish`)

> INPAPI | 物理表：`ucg_log_api_publish`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API版本信息表 |
| 物理表 | `ucg_log_api_publish` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:36.1550` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiClassifyId` | apiClassifyId | `api_classify_id` | String |
| 2 | `apiClassifyName` | apiClassifyName | `api_classify_name` | String |
| 3 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 4 | `apiInfo` | apiInfo | `api_info` | String |
| 5 | `apiName` | apiName | `api_name` | String |
| 6 | `applicationcode` | applicationcode | `applicationCode` | String |
| 7 | `applyReason` | applyReason | `apply_reason` | String |
| 8 | `applyUser` | applyUser | `apply_user` | String |
| 9 | `available_dc` | available_dc | `available_dc` | Integer |
| 10 | `discard_dc` | discard_dc | `discard_dc` | Integer |
| 11 | `dr` | dr | `dr` | Integer |
| 12 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 13 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 14 | `id` | id | `id` | String |
| 15 | `initTime` | initTime | `init_time` | Date |
| 16 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 17 | `operationDay` | operationDay | `operation_day` | Integer |
| 18 | `operationMonth` | operationMonth | `operation_month` | Integer |
| 19 | `operationTime` | operationTime | `operation_time` | Date |
| 20 | `operationType` | operationType | `operation_type` | Integer |
| 21 | `operationYear` | operationYear | `operation_year` | Integer |
| 22 | `productClassifyId` | productClassifyId | `product_classify_id` | String |
| 23 | `productClassifyName` | productClassifyName | `product_classify_name` | String |
| 24 | `productId` | productId | `product_id` | String |
| 25 | `productName` | productName | `product_name` | String |
| 26 | `publishUserId` | publishUserId | `publish_user_id` | String |
| 27 | `publishUserName` | publishUserName | `publish_user_name` | String |
| 28 | `running` | running | `running` | Integer |
| 29 | `version` | version | `version` | String |
| 30 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None | true |
