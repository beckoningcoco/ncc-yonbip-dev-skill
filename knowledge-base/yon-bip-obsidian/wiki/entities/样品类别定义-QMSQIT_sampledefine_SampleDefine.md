---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.sampledefine.SampleDefine"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 样品类别定义 (`QMSQIT.sampledefine.SampleDefine`)

> QMSQIT | 物理表：`qms_qit_sample_define`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 样品类别定义 |
| 物理表 | `qms_qit_sample_define` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:12.8190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `code` | String | 编码 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `configureLatitude` | 配置维度 | `configure_latitude` | String |
| 7 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `productTypeId` | 物料分类 | `product_type_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 9 | `inspectType` | 检验类型 | `inspect_type` | String |
| 10 | `sampleType` | 样品类型 | `sample_type` | String |
| 11 | `sampleUsage` | 样品用途 | `sample_usage` | String |
| 12 | `sampleDefineCharacter` | 自定义项特征 | `sampledefine_dct` | d5eacdb5-7ad9-4fa8-be67-729b1d3cd985 |
| 13 | `productCharacterGroup` | 自定义项特征组 | `product_fct` | 54e87f7c-cc97-44bb-bde4-a6faa2b2ba85 |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `applicableObjectList` | 适用对象 | `` | 3a74d1d1-7c74-4778-9277-f5325a2a65f1 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `applicableObjectList` | 适用对象 | `QMSQIT.sampledefine.ApplicableObject` | None | true |
| 4 | `sampleDefineCharacter` | 自定义项特征 | `QMSQIT.sampledefine.SampleDefineDCT` | None |  |
| 5 | `productCharacterGroup` | 自定义项特征组 | `QMSQIT.sampledefine.SampleDefineProductFCT` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 9 | `productTypeId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
