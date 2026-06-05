---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质证书编制方案适用范围 (`QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeRange`)

> QMSQIT | 物理表：`qms_qit_qualitycertificate_psr`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质证书编制方案适用范围 |
| 物理表 | `qms_qit_qualitycertificate_psr` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:52.4440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `id` | ID | `id` | String |
| 7 | `is_apply` | 使用组织是否已启用 | `is_apply` | String |
| 8 | `is_management` | 是否是管理组织 | `is_management` | String |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `pk_ps_id` | 打印方案ID | `pk_ps_id` | 3479d923-f5d7-4f42-8816-d70a3f0c7aa1 |
| 14 | `pk_psd_id` | 打印方案详情ID | `pk_psd_id` | 4b9a6bc4-87cd-4697-8e38-0c73ada8e8df |
| 15 | `pk_use_org` | 使用组织ID | `pk_use_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `tenant` | 租户ID | `tenant_id` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `pk_use_org` | 使用组织ID | `org.func.QualityOrg` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `pk_ps_id` | 打印方案ID | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintScheme` | None | true |
| 6 | `pk_psd_id` | 打印方案详情ID | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeDetail` | None |  |
