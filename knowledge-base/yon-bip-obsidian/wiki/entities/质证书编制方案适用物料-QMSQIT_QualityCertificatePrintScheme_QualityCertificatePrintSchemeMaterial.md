---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeMaterial"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质证书编制方案适用物料 (`QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeMaterial`)

> QMSQIT | 物理表：`qms_qit_qualitycertificate_psm`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质证书编制方案适用物料 |
| 物理表 | `qms_qit_qualitycertificate_psm` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:12.8680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `freect_h` | 编制方案自由项特征组 | `freect_h` | 9126d924-0dfd-4fb0-963c-e9a8cbda8123 |
| 7 | `id` | ID | `id` | String |
| 8 | `is_default` | 是否是默认方案 | `is_default` | Short |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `pk_customer` | 客户 | `pk_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 14 | `pk_material_class_id` | 物料分类 | `pk_material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 15 | `pk_material_id` | 物料 | `pk_material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 16 | `pk_psd_id` | 打印方案详情id | `pk_psd_id` | 4b9a6bc4-87cd-4697-8e38-0c73ada8e8df |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `schemeMaterialDefineCharacter` | 自定义项特征组 | `definect_b` | 905d9da6-9255-4d59-ba1b-987a6668d035 |
| 19 | `tenant` | 租户ID | `tenant_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `freect_h` | 编制方案自由项特征组 | `QMSQIT.QualityCertificatePrintScheme.QualityCertPrintSchemeFree` | None |  |
| 2 | `schemeMaterialDefineCharacter` | 自定义项特征组 | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeMaterialCharacter` | None |  |
| 3 | `pk_customer` | 客户 | `aa.merchant.Merchant` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `pk_material_class_id` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `pk_psd_id` | 打印方案详情id | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeDetail` | None | true |
| 9 | `pk_material_id` | 物料 | `pc.product.Product` | Service |  |
