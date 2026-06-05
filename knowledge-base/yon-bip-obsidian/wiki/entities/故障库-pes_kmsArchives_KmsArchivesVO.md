---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.kmsArchives.KmsArchivesVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 故障库 (`pes.kmsArchives.KmsArchivesVO`)

> IMP_PES | 物理表：`kms_archives`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 故障库 |
| 物理表 | `kms_archives` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:50.1510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | 故障编码 |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 故障编码 | `code` | String |
| 3 | `name` | 故障名称 | `name` | String |
| 4 | `isEffective` | 启用状态 | `is_effective` | Short |
| 5 | `memo` | 故障描述 | `memo` | String |
| 6 | `kmsCategoryId` | 故障分类ID | `category_id` | e47c578a-b780-4988-aa12-97132d21f153 |
| 7 | `equCategory` | 设备分类ID | `equ_category` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 8 | `productId` | 产品id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 9 | `kmsDiscoveryId` | 发现途径ID | `discovery_id` | d4bc442d-75d5-4b4c-acf3-08da47ad8da3 |
| 10 | `kmsPhenomenonId` | 故障现象ID | `phenomenon_id` | 65e98554-367c-4e88-b6f9-cd54b8d800f8 |
| 11 | `phenomenonMemo` | 故障现象描述 | `phenomenon_memo` | String |
| 12 | `kmsCauseId` | 故障原因Id | `cause_id` | 9570bc86-5dde-4ed9-8e03-a4d3816338e9 |
| 13 | `causeMemo` | 故障原因描述 | `cause_memo` | String |
| 14 | `kmsMeasureId` | 故障措施ID | `measure_id` | a1c0b4a2-6a45-4ec3-a7a8-c7e2ed23d182 |
| 15 | `measureMemo` | 故障措施描述 | `measure_memo` | String |
| 16 | `productType` | 产品类型 | `product_type` | String |
| 17 | `srcId` | 来源 | `src_id` | String |
| 18 | `srcType` | 来源类型 | `src_type` | String |
| 19 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | 88d0c8a4-eba0-41e7-bbd5-9c0497c9514e |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `creator` | 创建人名称 | `creator` | String |
| 22 | `createUser` | 创建者 | `create_user` | String |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `modifier` | 修改人名称 | `modifier` | String |
| 27 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 31 | `id` | id | `id` | String |
| 32 | `dr` | 删除标识 | `dr` | Integer |
| 33 | `tenant` | 租户ID | `tenant_id` | String |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `kmsPhenomenonId` | 故障现象ID | `PES.kmsPhenomena.KmsPhenomenaVO` | None |  |
| 2 | `kmsMeasureId` | 故障措施ID | `pes.kmsMeasures.KmsMeasuresVO` | None |  |
| 3 | `productId` | 产品id | `pc.product.Product` | Service |  |
| 4 | `userDefineCharacter` | 自定义项特征 | `pes.kmsArchives.KmsArchivesDefcharacter` | None |  |
| 5 | `kmsDiscoveryId` | 发现途径ID | `pes.kmsDiscovery.KmsDiscoveryVO` | None |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `kmsCategoryId` | 故障分类ID | `pes.kmsCategoryTree.KmsCategoryTreeVO` | None |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `kmsCauseId` | 故障原因Id | `pes.kmsCauses.KmsCausesVO` | None |  |
| 11 | `equCategory` | 设备分类ID | `ampub.ambase.CategoryVO` | Service |  |
| 12 | `orgId` | 组织id | `org.func.BaseOrg` | Service |  |
