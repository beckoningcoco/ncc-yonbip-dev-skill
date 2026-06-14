---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseProductInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 一级分类表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseProductInfo`)

> INPAPI | 物理表：`ucg_base_product_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 一级分类表 |
| 物理表 | `ucg_base_product_info` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:02.5720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | code |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicationcode` | applicationcode | `applicationCode` | String |
| 2 | `applyFlag` | applyFlag | `apply_flag` | String |
| 3 | `code` | code | `code` | String |
| 4 | `contactId` | contactId | `contact_id` | String |
| 5 | `cusEmail` | cusEmail | `cus_email` | String |
| 6 | `cusName` | cusName | `cus_name` | String |
| 7 | `cusPhone` | cusPhone | `cus_phone` | String |
| 8 | `description` | description | `description` | String |
| 9 | `dr` | dr | `dr` | Integer |
| 10 | `enable` | enable | `enable` | Integer |
| 11 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 12 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 13 | `healthId` | healthId | `health_id` | String |
| 14 | `icon` | icon | `icon` | String |
| 15 | `id` | id | `id` | String |
| 16 | `introduceImg` | introduceImg | `introduce_img` | String |
| 17 | `isOpen` | isOpen | `is_open` | Integer |
| 18 | `isvId` | isvId | `isv_id` | String |
| 19 | `message` | message | `message` | String |
| 20 | `microServiceCode` | microServiceCode | `micro_service_code` | String |
| 21 | `name` | name | `name` | String |
| 22 | `preset` | preset | `preset` | Integer |
| 23 | `productClassifyId` | 集成系统 | `product_classify_id` | de37a839-f646-48ea-8622-af9aa06d7898 |
| 24 | `showOpen` | showOpen | `show_open` | Integer |
| 25 | `sort` | sort | `sort` | Integer |
| 26 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 27 | `ucgBaseEnvironmentList` | 环境配置表 | `` | 654492ed-944c-4120-b0ab-013707901ee6 |
| 28 | `ucgBaseReturnPluginConfigList` | 返回值映射配置表 | `` | e1f26b40-54a4-4674-a013-ed47a70285b9 |
| 29 | `ucgBaseapiApiClassifyList` | API分类表 | `` | 09b8ff01-839e-4dd3-a532-58e1f2046085 |
| 30 | `unionConnectFlag` | unionConnectFlag | `union_connect_flag` | String |
| 31 | `updateTime` | updateTime | `update_time` | Date |
| 32 | `userId` | userId | `user_id` | String |
| 33 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productClassifyId` | 集成系统 | `iuap-ipaas-base.A47_integrate.ipbIntegrateSys` | None |  |
| 2 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ucgBaseEnvironmentList` | 环境配置表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseEnvironment` | None | true |
| 5 | `ucgBaseReturnPluginConfigList` | 返回值映射配置表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseReturnPluginConfig` | None | true |
| 6 | `ucgBaseapiApiClassifyList` | API分类表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiClassify` | None | true |
