---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.biddocumentfile.CpuBidDocumentFile"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 文件归档 (`bctask.biddocumentfile.CpuBidDocumentFile`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_bid_document_file` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.biddocumentfile.CpuBidDocumentFile` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件归档 |
| 物理表 | `cpu_bid_document_file` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `f47ebe1a-60c4-4c38-912e-cdb15d8a9dae` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:25.3870` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:41:08:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202603171537_metadata_bctask-biddocumentfile.zip`
- **安装人**: mongoTools
- **安装排名**: `2cbb6bce-011c-4dcc-8752-b2ff1a9059b1`

## 业务场景

- `dataMultilanguage`
- `UITemplate`
- `SaveEffective`
- `bpm`

## 术语标记

`ConfigData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 3 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |

---

## 直接属性（共 47 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `addDirectory` | 归档时允许补充目录 | `add_directory` | Integer | `int` |  | ✓ |
| 2 | `archiveSource` | 归档数据来源 | `archive_source` | Integer | `int` |  | ✓ |
| 3 | `archiveStatus` | 状态 | `archive_status` | String | `text` |  | ✓ |
| 4 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 5 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 7 | `auditorId` | 审批人ID | `auditor_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 8 | `bidDocumentFileCategorys` | 文件归档子表 | `` | a0a81aa8-153d-477a-95d4-ee0f8663cf6c | `` |  |  |
| 9 | `bidProjectCode` | 项目编号 | `bid_project_code` | String | `text` |  | ✓ |
| 10 | `bidProjectId` | 项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 | `quote` |  | ✓ |
| 11 | `bidProjectName` | 项目名称 | `bid_project_name` | String | `text` |  | ✓ |
| 12 | `bidSectionCode` | 业务单据编号 | `bid_section_code` | String | `text` |  | ✓ |
| 13 | `bidSectionId` | 业务单据ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 | `quote` |  | ✓ |
| 14 | `bidSectionName` | 业务单据名称 | `bid_section_name` | String | `text` |  | ✓ |
| 15 | `bidType` | 竞争方式 | `bid_type` | String | `text` |  | ✓ |
| 16 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 17 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 18 | `createTime` | 创建日期 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 20 | `creatorId` | 创建人ID | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 21 | `documentStartRing` | 归档开始时间 | `document_start_ring` | String | `text` |  | ✓ |
| 22 | `dr` | 删除标志 | `dr` | Short | `short` |  | ✓ |
| 23 | `entrustOrgId` | 委托单位 | `entrust_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 24 | `entrustOrgPsnId` | 委托单位联系人 | `entrust_org_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 25 | `entrustlinkDepartmentId` | 委托单位联系人所属部门 | `entrust_link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 26 | `fileSort` | 文件分类 | `file_sort` | Integer | `int` |  | ✓ |
| 27 | `flowSource` | 审批源 | `flow_source` | String | `text` |  | ✓ |
| 28 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 29 | `ifTemplate` | 是否为模板 | `if_template` | Integer | `int` |  | ✓ |
| 30 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer | `int` |  | ✓ |
| 31 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 32 | `linkDepartmentId` | 采购组织联系人所属部门 | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 33 | `linkPersonId` | 采购组织联系人 | `link_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 34 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 35 | `modifierId` | 更新人ID | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 36 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 37 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 38 | `oldBillNum` | 原始单据号 | `old_bill_num` | String | `text` |  | ✓ |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 40 | `purOrgId` | 采购组织主键 | `pur_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | ✓ |
| 41 | `purchaseId` | 采购方式主键 | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 | `quote` |  | ✓ |
| 42 | `purchaseType` | 采购类型 | `purchase_type` | String | `text` |  | ✓ |
| 43 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 44 | `templateId` | 归档模板主键 | `template_id` | 7e433e39-043e-426d-8a56-6bdd40985ac9 | `quote` |  | ✓ |
| 45 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 47 | `ytenantId` | 租户 | `ytenant_id` | String | `text` |  | ✓ |

---

## 关联属性（共 15 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `entrustlinkDepartmentId` | 委托单位联系人所属部门 | `org.func.BaseOrg` | `entrust_link_department_id` |  →  |  |  | Service |  |
| 2 | `purOrgId` | 采购组织主键 | `org.func.PurchaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 3 | `entrustOrgId` | 委托单位 | `org.func.BaseOrg` | `entrust_org_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `linkPersonId` | 采购组织联系人 | `bd.staff.Staff` | `link_person_id` |  →  |  |  | Service |  |
| 6 | `purchaseId` | 采购方式主键 | `lawbid.purchasedoc.PurchaseDoc` | `purchase_id` |  →  |  |  | Service |  |
| 7 | `creatorId` | 创建人ID | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 8 | `modifierId` | 更新人ID | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 9 | `linkDepartmentId` | 采购组织联系人所属部门 | `org.func.BaseOrg` | `link_department_id` |  →  |  |  | Service |  |
| 10 | `templateId` | 归档模板主键 | `bctask.biddocument.BidDocument` | `template_id` |  →  |  |  | None |  |
| 11 | `bidProjectId` | 项目ID | `lawbid.project.LawbidProject` | `bid_project_id` |  →  |  |  | Service |  |
| 12 | `entrustOrgPsnId` | 委托单位联系人 | `bd.staff.Staff` | `entrust_org_psn_id` |  →  |  |  | Service |  |
| 13 | `auditorId` | 审批人ID | `base.user.User` | `auditor_id` |  →  |  |  | Service |  |
| 14 | `bidSectionId` | 业务单据ID | `lawbid.section.LawbidSection` | `bid_section_id` |  →  |  |  | Service |  |
| 15 | `bidDocumentFileCategorys` | 文件归档子表 | `bctask.biddocumentfile.CpuBidDocumentFileCategory` | `` | bidDocumentFileCategorys → bidDocumentId | 0..n | true | None |  |

### Composition（子表）

- **bidDocumentFileCategorys**: `bidDocumentFileCategorys` → `bctask.biddocumentfile.CpuBidDocumentFileCategory` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `entrustlinkDepartmentId` (委托单位联系人所属部门) | `org.func.BaseOrg` | `entrust_link_department_id` |
| `purOrgId` (采购组织主键) | `org.func.PurchaseOrg` | `pur_org_id` |
| `entrustOrgId` (委托单位) | `org.func.BaseOrg` | `entrust_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `linkPersonId` (采购组织联系人) | `bd.staff.Staff` | `link_person_id` |
| `purchaseId` (采购方式主键) | `lawbid.purchasedoc.PurchaseDoc` | `purchase_id` |
| `creatorId` (创建人ID) | `base.user.User` | `creator_id` |
| `modifierId` (更新人ID) | `base.user.User` | `modifier_id` |
| `linkDepartmentId` (采购组织联系人所属部门) | `org.func.BaseOrg` | `link_department_id` |
| `bidProjectId` (项目ID) | `lawbid.project.LawbidProject` | `bid_project_id` |
| `entrustOrgPsnId` (委托单位联系人) | `bd.staff.Staff` | `entrust_org_psn_id` |
| `auditorId` (审批人ID) | `base.user.User` | `auditor_id` |
| `bidSectionId` (业务单据ID) | `lawbid.section.LawbidSection` | `bid_section_id` |
