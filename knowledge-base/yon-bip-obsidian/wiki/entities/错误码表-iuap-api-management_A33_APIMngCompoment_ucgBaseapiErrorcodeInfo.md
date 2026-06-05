---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiErrorcodeInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 错误码表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiErrorcodeInfo`)

> INPAPI | 物理表：`ucg_baseapi_errorcode_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 错误码表 |
| 物理表 | `ucg_baseapi_errorcode_info` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:02:58.2370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `applicationcode` | applicationcode | `applicationCode` | String |
| 3 | `defErrorId` | defErrorId | `def_error_id` | String |
| 4 | `dr` | dr | `dr` | Integer |
| 5 | `errorCode` | errorCode | `error_code` | String |
| 6 | `errorMessage` | errorMessage | `error_message` | String |
| 7 | `errorType` | errorType | `error_type` | String |
| 8 | `errorcodeDesc` | errorcodeDesc | `errorcode_desc` | String |
| 9 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 10 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 11 | `id` | id | `id` | String |
| 12 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 13 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None |  |
