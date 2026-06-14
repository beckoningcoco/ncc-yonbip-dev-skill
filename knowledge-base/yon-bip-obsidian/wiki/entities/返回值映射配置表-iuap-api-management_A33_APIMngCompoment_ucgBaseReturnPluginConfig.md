---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseReturnPluginConfig"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 返回值映射配置表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseReturnPluginConfig`)

> INPAPI | 物理表：`ucg_base_return_plugin_config`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返回值映射配置表 |
| 物理表 | `ucg_base_return_plugin_config` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:22.3410` |

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
| 3 | `data` | data | `data` | String |
| 4 | `dr` | dr | `dr` | Integer |
| 5 | `filter` | filter | `filter` | Integer |
| 6 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 7 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 8 | `id` | id | `id` | String |
| 9 | `message` | message | `message` | String |
| 10 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 11 | `relateId` | relateId | `relate_id` | 8bcc7790-ab21-49d6-b562-6c5f28da3d04 |
| 12 | `relateLevel` | relateLevel | `relate_level` | String |
| 13 | `successCode` | successCode | `success_code` | String |
| 14 | `successType` | successType | `success_type` | String |
| 15 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `relateId` | relateId | `iuap-api-management.A33_APIMngCompoment.ucgBaseProductInfo` | None | true |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
