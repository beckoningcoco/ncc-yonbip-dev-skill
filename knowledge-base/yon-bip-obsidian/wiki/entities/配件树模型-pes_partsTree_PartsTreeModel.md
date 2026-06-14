---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.partsTree.PartsTreeModel"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 配件树模型 (`pes.partsTree.PartsTreeModel`)

> IMP_PES | 物理表：`imp_pes_parts_tree_model`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配件树模型 |
| 物理表 | `imp_pes_parts_tree_model` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:57.6420` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `code` | String | 编码 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `productCategoryId` | 产品分类ID | `product_category_Id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `equipCategoryId` | 设备类别ID | `eauip_category_Id` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 6 | `enable` | 启用状态 | `enable` | sys_intboolean |
| 7 | `desc` | 描述 | `desc` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `creator` | 创建人 | `creator` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifier` | 最后修改人 | `modifier` | String |
| 14 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `id` | id | `id` | Long |
| 17 | `enablets` | 启用时间 | `enablets` | DateTime |
| 18 | `disablets` | 停用时间 | `disablets` | DateTime |
| 19 | `parent` | 上级节点ID | `parent_id` | aebac340-12aa-4ebf-975f-919001321347 |
| 20 | `level` | 层级 | `level` | Integer |
| 21 | `path` | 路径 | `path` | String |
| 22 | `sort` | 排序号 | `sort_num` | Integer |
| 23 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 24 | `tenant` | 租户ID | `tenant_id` | String |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `partsDetailList` | 配件树模型配件信息 | `` | 39f930e7-a61d-48f0-bf57-622b1000b060 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级节点ID | `pes.partsTree.PartsTreeModel` | None |  |
| 2 | `productCategoryId` | 产品分类ID | `pc.cls.ManagementClass` | Service |  |
| 3 | `equipCategoryId` | 设备类别ID | `ampub.ambase.CategoryVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `partsDetailList` | 配件树模型配件信息 | `pes.partsTree.PartsDetail` | None | true |
| 8 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
