---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseEnvironment"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 环境配置表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseEnvironment`)

> INPAPI | 物理表：`ucg_base_environment`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 环境配置表 |
| 物理表 | `ucg_base_environment` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:19.5260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `clientId` | clientId | `client_id` | String |
| 2 | `dr` | dr | `dr` | Integer |
| 3 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 4 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 5 | `id` | id | `id` | String |
| 6 | `lbType` | lbType | `lb_type` | Integer |
| 7 | `productClassifyId` | productClassifyId | `product_classify_id` | 189fd5ab-adcf-4447-bdd0-2cb5ba743aab |
| 8 | `productId` | productId | `product_id` | 8bcc7790-ab21-49d6-b562-6c5f28da3d04 |
| 9 | `type` | type | `type` | String |
| 10 | `ucgBaseServiceInstanceList` | 环境实例表 | `` | 95d4b733-1ab4-4d72-820d-2226ba63af10 |
| 11 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productClassifyId` | productClassifyId | `iuap-api-management.A33_APIMngCompoment.ucgBaseProductClassify` | None |  |
| 2 | `productId` | productId | `iuap-api-management.A33_APIMngCompoment.ucgBaseProductInfo` | None | true |
| 3 | `ucgBaseServiceInstanceList` | 环境实例表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseServiceInstance` | None | true |
| 4 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
