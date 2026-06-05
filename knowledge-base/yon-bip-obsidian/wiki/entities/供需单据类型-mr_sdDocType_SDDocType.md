---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.sdDocType.SDDocType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供需单据类型 (`mr.sdDocType.SDDocType`)

> MR | 物理表：`mr_sd_doctype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供需单据类型 |
| 物理表 | `mr_sd_doctype` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:40.2620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `name` | 名称 | `name` | String |
| 5 | `code` | 编码 | `code` | String |
| 6 | `sdType` | 供需类型 | `sd_type` | mr_sd_type_enum |
| 7 | `docType` | 需求类型 | `doc_type` | mr_demand_type_enum |
| 8 | `formId` | 单据类型 | `form_id` | String |
| 9 | `srcType` | 来源类型 | `src_type` | mr_doc_src_type_enum |
| 10 | `srcdataid` | 来源数据id | `srcdataid` | Long |
| 11 | `sequence` | 顺序号 | `sequence` | Integer |
| 12 | `extensible` | 可扩展 | `extensible` | Boolean |
| 13 | `extendedCondition` | 扩展条件 | `extended_condition` | String |
| 14 | `enableTransTypes` | 可配交易类型 | `enable_trans_types` | Boolean |
| 15 | `docFullName` | 实体全称 | `doc_full_name` | String |
| 16 | `boContext` | 业务对象上下文 | `bo_context` | String |
| 17 | `supplyQuantity` | 供应量 | `supply_qty` | String |
| 18 | `lrpPlanFlag` | LRP计划标识 | `lrp_plan_flag` | Boolean |
| 19 | `nullBizDate` | 是否支持业务日期为空 | `null_biz_date` | Boolean |
| 20 | `remark` | 备注 | `remark` | String |
| 21 | `enabled` | 启用 | `enabled` | Boolean |
| 22 | `sysFixCon` | 系统固定条件 | `sys_fix_con` | String |
| 23 | `datasub` | 应用来源 | `datasub` | String |
| 24 | `creator` | 创建人名称 | `creator` | String |
| 25 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `createDate` | 创建日期 | `create_date` | Date |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `modifier` | 修改人名称 | `modifier` | String |
| 29 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 31 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
