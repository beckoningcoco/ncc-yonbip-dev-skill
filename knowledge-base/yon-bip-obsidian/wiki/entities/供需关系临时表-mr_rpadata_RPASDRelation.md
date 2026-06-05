---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPASDRelation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供需关系临时表 (`mr.rpadata.RPASDRelation`)

> MR | 物理表：`mr_rpa_sd_relation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供需关系临时表 |
| 物理表 | `mr_rpa_sd_relation` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:17.1400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `allotCategory` | 计划分类 | `allot_category` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 2 | `allotItem` | 物料 | `allot_item` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 3 | `allotOrg` | 组织 | `allot_org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `allotType` | 分配类型 | `allot_type` | AllotTypeEnum |
| 5 | `createDate` | 创建日期 | `create_date` | Date |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `crossOrgFlag` | 跨组织入库 | `cross_org_flag` | Boolean |
| 10 | `demandOrgId` | 需求组织 | `demand_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 11 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 12 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 13 | `expiryDate` | 失效日期 | `expiry_date` | DateTime |
| 14 | `id` | ID | `id` | Long |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 20 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 21 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `ratio` | 比例 | `ratio` | Decimal |
| 24 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 25 | `sdRelationId` | 供需关系ID | `sd_relation_id` | Long |
| 26 | `sequence` | 顺序号 | `sequence` | Integer |
| 27 | `supplyOrgId` | 供应组织 | `supply_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 28 | `supplyType` | 供应类型 | `supply_type` | SupplyTypeEnum |
| 29 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 30 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 2 | `demandOrgId` | 需求组织 | `aa.baseorg.OrgMV` | Service |  |
| 3 | `allotItem` | 物料 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 8 | `supplyOrgId` | 供应组织 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `allotCategory` | 计划分类 | `aa.baseorg.OrgMV` | Service |  |
| 10 | `allotOrg` | 组织 | `aa.baseorg.OrgMV` | Service |  |
| 11 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
