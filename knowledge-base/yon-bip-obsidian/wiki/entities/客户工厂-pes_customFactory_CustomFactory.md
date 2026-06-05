---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.customFactory.CustomFactory"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 客户工厂 (`pes.customFactory.CustomFactory`)

> IMP_PES | 物理表：`imp_pes_custom_factory`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户工厂 |
| 物理表 | `imp_pes_custom_factory` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:19.7520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `code` | String | 编码 |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `factoryCategory` | 客户工厂类别 | `factory_category` | bc55507b-7e08-4a2b-998a-dd9b3e953f8d |
| 5 | `parent` | 父节点 | `parent_id` | cfde0823-db21-43ef-94cd-0b511e013ba6 |
| 6 | `customId` | 关联客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 7 | `positionId` | 位置 | `position_id` | 95577e23-979f-4f09-a629-61fea93e576d |
| 8 | `address` | 详细地址 | `address` | String |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `longitude` | 经度 | `longitude` | String |
| 11 | `latitude` | 纬度 | `latitude` | String |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `id` | 主键 | `id` | Long |
| 21 | `level` | 层级 | `level` | Integer |
| 22 | `path` | 路径 | `path` | String |
| 23 | `sort` | 排序号 | `sort_num` | Integer |
| 24 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 25 | `tenant` | 租户ID | `tenant_id` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime |
| 28 | `customFactoryDetailList` | 客户工厂联系人信息 | `` | 09b1c4c1-bdaf-453b-87c1-51a91368c705 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 父节点 | `pes.customFactory.CustomFactory` | None |  |
| 2 | `positionId` | 位置 | `bd.region.BaseRegionVO` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `factoryCategory` | 客户工厂类别 | `pes.enum.EnumValue` | None |  |
| 7 | `customFactoryDetailList` | 客户工厂联系人信息 | `pes.customFactory.CustomFactoryDetail` | None | true |
| 8 | `customId` | 关联客户 | `aa.merchant.Merchant` | Service |  |
| 9 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
