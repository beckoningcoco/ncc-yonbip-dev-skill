---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质证书编制方案详情 (`QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeDetail`)

> QMSQIT | 物理表：`qms_qit_qualitycertificate_psd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质证书编制方案详情 |
| 物理表 | `qms_qit_qualitycertificate_psd` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:47.3040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auditDate` | 审批日期 | `audit_date` | DateTime |
| 2 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 3 | `auditor` | 审批人名称 | `auditor` | String |
| 4 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `bustype` | 交易类型 | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 6 | `code` | 打印方案编码 | `code` | String |
| 7 | `createDate` | 创建日期 | `create_date` | Date |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `creator` | 创建人名称 | `creator` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `enable_status` | 启用状态 | `enable_status` | Short |
| 13 | `id` | ID | `id` | String |
| 14 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `name` | 打印方案名称 | `name` | String |
| 20 | `note` | 备注 | `note` | String |
| 21 | `pk_management_org` | 管理组织 | `pk_management_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 22 | `pk_ps_id` | 打印方案ID | `pk_ps_id` | 3479d923-f5d7-4f42-8816-d70a3f0c7aa1 |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `returncount` | 退回次数 | `returncount` | Short |
| 25 | `tenant` | 租户ID | `tenant_id` | String |
| 26 | `verifystate` | 审批状态 | `verifystate` | Short |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 28 | `qualityCertificate` | 质证书编制方案 | `` | 3479d923-f5d7-4f42-8816-d70a3f0c7aa1 |
| 29 | `qualityCertificatePrintSchemeItemsList` | 质证书编制方案检验项目 | `` | e44c2877-82d6-4c3b-a11a-ec4615760064 |
| 30 | `qualityCertificatePrintSchemeMaterialList` | 质证书编制方案适用物料 | `` | 57b32226-4074-4995-9d21-fbd8e4136d57 |
| 31 | `schemeDefineCharacter` | 自定义项特征组 | `definect_h` | c54fa1ac-b19e-4439-a189-2028af86e01e |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_management_org` | 管理组织 | `org.func.QualityOrg` | Service |  |
| 2 | `schemeDefineCharacter` | 自定义项特征组 | `QMSQIT.QualityCertificatePrintScheme.QualityCertPrintSchemeDefineCharacter` | None |  |
| 3 | `qualityCertificatePrintSchemeItemsList` | 质证书编制方案检验项目 | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeItems` | None | true |
| 4 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `qualityCertificatePrintSchemeMaterialList` | 质证书编制方案适用物料 | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeMaterial` | None | true |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `pk_ps_id` | 打印方案ID | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintScheme` | None |  |
| 10 | `qualityCertificate` | 质证书编制方案 | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintScheme` | None | true |
| 11 | `bustype` | 交易类型 | `bd.bill.TransType` | Service |  |
