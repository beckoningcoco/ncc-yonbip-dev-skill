---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiClassify"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API分类表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiClassify`)

> INPAPI | 物理表：`ucg_baseapi_api_classify`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API分类表 |
| 物理表 | `ucg_baseapi_api_classify` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:23.7310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | code |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicationcode` | applicationcode | `applicationCode` | String |
| 2 | `code` | code | `code` | String |
| 3 | `description` | description | `description` | String |
| 4 | `dr` | dr | `dr` | Integer |
| 5 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 6 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 7 | `icon` | icon | `icon` | String |
| 8 | `id` | id | `id` | String |
| 9 | `isvId` | isvId | `isv_id` | String |
| 10 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 11 | `name` | name | `name` | String |
| 12 | `parentId` | parentId | `parent_id` | 09b8ff01-839e-4dd3-a532-58e1f2046085 |
| 13 | `preset` | preset | `preset` | Integer |
| 14 | `productId` | productId | `product_id` | 8bcc7790-ab21-49d6-b562-6c5f28da3d04 |
| 15 | `sort` | sort | `sort` | Integer |
| 16 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | productId | `iuap-api-management.A33_APIMngCompoment.ucgBaseProductInfo` | None | true |
| 2 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `parentId` | parentId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiClassify` | None |  |
