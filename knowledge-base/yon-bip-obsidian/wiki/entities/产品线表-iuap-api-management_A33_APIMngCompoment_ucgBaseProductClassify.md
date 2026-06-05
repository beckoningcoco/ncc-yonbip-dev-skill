---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseProductClassify"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 产品线表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseProductClassify`)

> INPAPI | 物理表：`ucg_base_product_classify`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 产品线表 |
| 物理表 | `ucg_base_product_classify` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:08.0890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（39个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applyFlag` | applyFlag | `apply_flag` | String |
| 2 | `code` | code | `code` | String |
| 3 | `cusEmail` | cusEmail | `cus_email` | String |
| 4 | `cusName` | cusName | `cus_name` | String |
| 5 | `cusPhone` | cusPhone | `cus_phone` | String |
| 6 | `description` | description | `description` | String |
| 7 | `descriptionDetail` | descriptionDetail | `description_detail` | String |
| 8 | `descriptionDetailResid` | descriptionDetailResid | `description_detail_resid` | String |
| 9 | `descriptionResid` | descriptionResid | `description_resid` | String |
| 10 | `docCode` | docCode | `doc_code` | String |
| 11 | `dr` | dr | `dr` | Integer |
| 12 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 13 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 14 | `icon` | icon | `icon` | String |
| 15 | `iconWhite` | iconWhite | `icon_white` | String |
| 16 | `id` | id | `id` | String |
| 17 | `introduceImg` | introduceImg | `introduce_img` | String |
| 18 | `introduceImgUrl` | introduceImgUrl | `introduce_img_url` | String |
| 19 | `introduceTwImg` | introduceTwImg | `introduce_tw_img` | String |
| 20 | `introduceUsImg` | introduceUsImg | `introduce_us_img` | String |
| 21 | `isvId` | isvId | `isv_id` | String |
| 22 | `monthCallCount` | monthCallCount | `month_call_count` | String |
| 23 | `monthCallCountResid` | monthCallCountResid | `month_call_count_resid` | String |
| 24 | `name` | name | `name` | String |
| 25 | `nameResid` | nameResid | `name_resid` | String |
| 26 | `openType` | openType | `open_type` | Integer |
| 27 | `openapiCount` | openapiCount | `openapi_count` | String |
| 28 | `preset` | preset | `preset` | Integer |
| 29 | `productDocCode` | productDocCode | `product_doc_code` | String |
| 30 | `showOpen` | showOpen | `show_open` | Integer |
| 31 | `sort` | sort | `sort` | Integer |
| 32 | `tenantId` | tenantId | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 33 | `totalCallCount` | totalCallCount | `total_call_count` | String |
| 34 | `totalCallCountResid` | totalCallCountResid | `total_call_count_resid` | String |
| 35 | `type` | type | `type` | String |
| 36 | `unionConnectFlag` | unionConnectFlag | `union_connect_flag` | String |
| 37 | `updateTime` | updateTime | `update_time` | Date |
| 38 | `urlIntroduce` | urlIntroduce | `url_introduce` | String |
| 39 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `tenantId` | tenantId | `yht.tenant.YhtTenant` | Service |  |
| 2 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
