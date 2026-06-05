---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.kmsCategoryTree.KmsCategoryTreeVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 故障分类 (`pes.kmsCategoryTree.KmsCategoryTreeVO`)

> IMP_PES | 物理表：`kms_categories`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 故障分类 |
| 物理表 | `kms_categories` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:50.5120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `parent` | 父id | `parent_id` | e47c578a-b780-4988-aa12-97132d21f153 |
| 5 | `productCategoryId` | 产品分类 | `product_category_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 6 | `productId` | 产品 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 7 | `equipmentType` | 设备类别 | `equipment_type` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 8 | `isEffective` | 生效 | `is_effective` | Short |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `createUser` | 创建者 | `create_user` | String |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 21 | `id` | ID | `id` | String |
| 22 | `level` | 层级 | `level` | Integer |
| 23 | `level_code` | 层级编码 | `level_code` | String |
| 24 | `path` | 路径 | `path` | String |
| 25 | `sort` | 排序 | `sort_num` | Integer |
| 26 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 27 | `dr` | 逻辑删除 | `dr` | Integer |
| 28 | `tenant` | 租户ID | `tenant_id` | String |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 父id | `pes.kmsCategoryTree.KmsCategoryTreeVO` | None |  |
| 2 | `productCategoryId` | 产品分类 | `pc.cls.ManagementClass` | Service |  |
| 3 | `productId` | 产品 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `equipmentType` | 设备类别 | `ampub.ambase.CategoryVO` | Service |  |
| 8 | `orgId` | 组织id | `org.func.BaseOrg` | Service |  |
