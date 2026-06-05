---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPAOrg"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 组织临时表 (`mr.rpadata.RPAOrg`)

> MR | 物理表：`mr_rpa_org`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织临时表 |
| 物理表 | `mr_rpa_org` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:08.0120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `calculationOrder` | 计算顺序 | `calculation_order` | Integer |
| 2 | `code` | 编码 | `code` | String |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `docOrgId` | 组织档案 | `doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 8 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 9 | `factoryOrgFlag` | 工厂职能 | `factory_org_flag` | Boolean |
| 10 | `id` | ID | `id` | Long |
| 11 | `inventoryOrgFlag` | 库存职能 | `inventory_org_flag` | Boolean |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 17 | `outside` | 不在关系内 | `outside` | Boolean |
| 18 | `planCategoryId` | 计划分类 | `plan_category_id` | Long |
| 19 | `planOrgFlag` | 计划职能 | `plan_org_flag` | Boolean |
| 20 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 21 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `purchaseOrgFlag` | 采购职能 | `purchase_org_flag` | Boolean |
| 24 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 25 | `salesOrgFlag` | 销售职能 | `sales_org_flag` | Boolean |
| 26 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `docOrgId` | 组织档案 | `aa.baseorg.OrgMV` | Service |  |
| 2 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 7 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
