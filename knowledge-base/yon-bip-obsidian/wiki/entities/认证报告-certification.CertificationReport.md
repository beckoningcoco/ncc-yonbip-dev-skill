---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.certification.CertificationReport"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 认证报告 (`cpu-supplymgr.certification.CertificationReport`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_certification_report` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.certification.CertificationReport` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 认证报告 |
| 物理表 | `cpu_certification_report` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `7247d6ca-05df-4412-b5c8-b0f6a610baf9` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:31.9780` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |

## 部署信息

- **部署时间**: 2025-10-24 23:19:48:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202509181530_metadata_cpu-supplymgr-certification_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `bd308f5c-8382-4b9c-b70b-20ba69575b15`

## 业务场景

- `print`
- `workflow`
- `UITemplate`
- `imextmp`
- `transtype`
- `isCoreBill`
- `userdefine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 2 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 6 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 7 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 41 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyId` | 认证任务ID | `apply_id` | 91f13b22-60f1-48bd-ad2d-34ced143fa91 | `quote` |  | ✓ |
| 2 | `syncVendor` | 协同供应商 | `sync_vendor` | String | `text` |  | ✓ |
| 3 | `businessType` | 业务类型 | `business_type` | Short | `short` |  | ✓ |
| 4 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 5 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 6 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 7 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 8 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 9 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 10 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 11 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 12 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 13 | `fileId` | 附件 | `file_id` | String | `text` |  | ✓ |
| 14 | `memo` | 综述 | `memo` | String | `text` |  | ✓ |
| 15 | `approveStatus` | 审批状态 | `approve_status` | String | `text` |  | ✓ |
| 16 | `cooAbilityId` | 合作等级 | `coo_ability_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 17 | `lifecycleAbilityId` | 生命周期状态 | `lifecycle_ability_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 18 | `orgId` | 组织 | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 19 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 20 | `userDefineCharacter` | 认证报告特征属性 | `user_define_character` | 5de3e9f1-1dc1-426f-9cd1-4b0480ec8f79 | `UserDefine` |  | ✓ |
| 21 | `abilityId` | 等级体系 | `ability_id` | 960ce6ff-03b4-4afc-ba32-2342d2e50e5b | `quote` |  | ✓ |
| 22 | `abilityDetialId` | 认证等级 | `ability_detial_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 25 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 26 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 27 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 29 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 30 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 31 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 32 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 33 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 34 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 35 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 36 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 38 | `objectList` | 认证报告对象 | `` | 5dc6ef98-f8af-42df-acf8-f472b6cd4ad8 | `` |  |  |
| 39 | `orgList` | 认证报告适用组织 | `` | 9835b8a2-45d3-4814-b6c3-3fbfce093eea | `` |  |  |
| 40 | `productList` | 认证报告适用物料分类范围 | `` | 274b4348-c4d6-4c1f-8a97-0f38e41579d4 | `` |  |  |
| 41 | `reportcontentList` | 认证报告内容 | `` | 26cde2bd-c06d-4761-b1ee-cb9a4cf129f3 | `` |  |  |

---

## 关联属性（共 17 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `userDefineCharacter` | 认证报告特征属性 | `cpu-supplymgr.certification.CertificationReportDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 6 | `orgList` | 认证报告适用组织 | `cpu-supplymgr.certification.CertificationReportOrg` | `` | orgList → reportId | 0..n | true | None |  |
| 7 | `orgId` | 组织 | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |
| 8 | `objectList` | 认证报告对象 | `cpu-supplymgr.certification.CertificationReportObject` | `` | objectList → reportId | 0..n | true | None |  |
| 9 | `applyId` | 认证任务ID | `cpu-supplymgr.certification.CertificationApply` | `apply_id` |  →  |  |  | None |  |
| 10 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 11 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type` |  →  |  |  | Service |  |
| 12 | `abilityDetialId` | 认证等级 | `aa.supplyability.SupplyAbilityDetail` | `ability_detial_id` |  →  |  |  | Service |  |
| 13 | `lifecycleAbilityId` | 生命周期状态 | `aa.supplyability.SupplyAbilityDetail` | `lifecycle_ability_id` |  →  |  |  | Service |  |
| 14 | `abilityId` | 等级体系 | `aa.supplyability.SupplyAbility` | `ability_id` |  →  |  |  | Service |  |
| 15 | `cooAbilityId` | 合作等级 | `aa.supplyability.SupplyAbilityDetail` | `coo_ability_id` |  →  |  |  | Service |  |
| 16 | `productList` | 认证报告适用物料分类范围 | `cpu-supplymgr.certification.CertificationReportProduct` | `` | productList → reportId | 0..n | true | None |  |
| 17 | `reportcontentList` | 认证报告内容 | `cpu-supplymgr.certification.CertificationReportContent` | `` | reportcontentList → reportId | 0..n | true | None |  |

### Composition（子表）

- **orgList**: `orgList` → `cpu-supplymgr.certification.CertificationReportOrg` | 0..n
- **objectList**: `objectList` → `cpu-supplymgr.certification.CertificationReportObject` | 0..n
- **productList**: `productList` → `cpu-supplymgr.certification.CertificationReportProduct` | 0..n
- **reportcontentList**: `reportcontentList` → `cpu-supplymgr.certification.CertificationReportContent` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `orgId` (组织) | `bd.adminOrg.BaseOrgVO` | `org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type` |
| `abilityDetialId` (认证等级) | `aa.supplyability.SupplyAbilityDetail` | `ability_detial_id` |
| `lifecycleAbilityId` (生命周期状态) | `aa.supplyability.SupplyAbilityDetail` | `lifecycle_ability_id` |
| `abilityId` (等级体系) | `aa.supplyability.SupplyAbility` | `ability_id` |
| `cooAbilityId` (合作等级) | `aa.supplyability.SupplyAbilityDetail` | `coo_ability_id` |
