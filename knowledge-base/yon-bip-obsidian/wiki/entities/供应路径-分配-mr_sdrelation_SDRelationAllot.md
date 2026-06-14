---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.sdrelation.SDRelationAllot"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供应路径-分配 (`mr.sdrelation.SDRelationAllot`)

> MR | 物理表：`mr_sd_relation_allot`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应路径-分配 |
| 物理表 | `mr_sd_relation_allot` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:17.5800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 计划组织 |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `sdRelationId` | 计划供需关系 | `sd_relation_id` | 74c9c075-099a-4899-9dec-dc38983fc69b |
| 6 | `allotType` | 分配类型 | `allot_type` | AllotTypeEnum |
| 7 | `allotOrg` | 分配组织ID | `allot_org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 8 | `allotCategory` | 计划分类 | `allot_category` | 5f9b1ee7-d6e8-4ba0-b5d7-6728fa089ae3 |
| 9 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 10 | `allotItem` | 物料 | `allot_item` | Long |
| 11 | `sdRelationAllotFct` | 自由特征组实体 | `free_characteristics` | 50296076-cf12-4b16-bf00-6c7960a5e45a |
| 12 | `sdRelationAllotDct` | 供应路径分配自定义项 | `sd_relation_allot_dct` | 99bcf6c4-9c07-484a-be9c-510ea9cb501e |
| 13 | `remark` | 备注 | `remark` | String |
| 14 | `stopstatus` | 启用状态 | `stopstatus` | Boolean |
| 15 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 16 | `datasub` | 应用来源 | `datasub` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `creator` | 创建人名称 | `creator` | String |
| 19 | `createDate` | 创建日期 | `create_date` | Date |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `characterList` | 供应路径分配特征 | `` | ec903ee2-37c5-4d82-b504-fe5b9fbda45f |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 2 | `sdRelationAllotFct` | 自由特征组实体 | `mr.sdrelation.SDRelationAllotFct` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `sdRelationAllotDct` | 供应路径分配自定义项 | `mr.sdrelation.sdRelationAllotDct` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `sdRelationId` | 计划供需关系 | `mr.sdrelation.SDRelation` | None |  |
| 8 | `characterList` | 供应路径分配特征 | `mr.sdrelation.SDRelationAllotCharacters` | None | true |
| 9 | `allotCategory` | 计划分类 | `pc.cls.PlanClass` | Service |  |
| 10 | `allotOrg` | 分配组织ID | `aa.baseorg.OrgMV` | Service |  |
| 11 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
