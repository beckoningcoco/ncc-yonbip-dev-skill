---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintScheme"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质证书编制方案 (`QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintScheme`)

> QMSQIT | 物理表：`qms_qit_qualitycertificate_ps`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质证书编制方案 |
| 物理表 | `qms_qit_qualitycertificate_ps` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:14.1890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auditDate` | 审批日期 | `audit_date` | DateTime |
| 2 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 3 | `auditor` | 审批人名称 | `auditor` | String |
| 4 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `code` | 打印方案编码 | `code` | String |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `detailId` | 详情ID | `detail_id` | 4b9a6bc4-87cd-4697-8e38-0c73ada8e8df |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `id` | ID | `id` | String |
| 13 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `name` | 打印方案名称 | `name` | String |
| 19 | `pk_management_org` | 管理组织 | `pk_management_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `qualityCertificatePrintSchemeRangeList` | 质证书编制方案适用范围 | `` | 07415f40-2491-431d-a9cf-9bb41a505e22 |
| 22 | `returncount` | 退回次数 | `returncount` | Short |
| 23 | `tenant` | 租户ID | `tenant_id` | String |
| 24 | `verifystate` | 审批状态 | `verifystate` | Short |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_management_org` | 管理组织 | `org.func.QualityOrg` | Service |  |
| 2 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `detailId` | 详情ID | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeDetail` | None | true |
| 7 | `qualityCertificatePrintSchemeRangeList` | 质证书编制方案适用范围 | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeRange` | None | true |
