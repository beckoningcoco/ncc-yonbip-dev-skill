---
tags: ["BIP", "元数据", "数据字典", "ycBase", "category.level.Application"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购品类定级申请 (`category.level.Application`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_category_level_application` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `category.level.Application` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购品类定级申请 |
| 物理表 | `cpu_category_level_application` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 业务对象ID | `40898fa9-2c7a-46e6-9a92-dd6c19446141` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:29.2850` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 单据编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:41:14:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202604152013_metadata_category-level.zip`
- **安装人**: mongoTools
- **安装排名**: `03995fcc-802c-4cfd-beaf-72651c24cdec`

## 业务场景

- `extdevelop`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `transtype`
- `billcode`
- `userdefine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 6 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |

---

## 直接属性（共 30 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 单据编码 | `code` | String | `text` |  | ✓ |
| 2 | `name` | 单据名称 | `name` | String | `text` |  | ✓ |
| 3 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 4 | `applyOrgId` | 申请组织 | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 5 | `applyPsnId` | 申请人 | `apply_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 6 | `applyDate` | 申请日期 | `apply_date` | Date | `date` |  | ✓ |
| 7 | `applyReason` | 申请理由 | `apply_reason` | String | `text` |  | ✓ |
| 8 | `attachment` | 附件 | `attachment` | String | `text` |  | ✓ |
| 9 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 10 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 11 | `isEnableEvaluation` | 是否开启评估流程 | `is_enable_evaluation` | String | `text` |  | ✓ |
| 12 | `applicationDefineCharacter` | 特征 | `define_character_id` | 137ec953-c390-4d00-9430-2c02479e8469 | `UserDefine` |  | ✓ |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 14 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 17 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 18 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 19 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 21 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 22 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 23 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 24 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 25 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 26 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 27 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 28 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 30 | `detailList` | 采购品类定级申请详情 | `` | d4f90d37-bcf2-404b-b2e3-977168f137ab | `` |  |  |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applicationDefineCharacter` | 特征 | `category.level.ApplicationDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 2 | `applyOrgId` | 申请组织 | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 3 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `applyPsnId` | 申请人 | `bd.staff.Staff` | `apply_psn_id` |  →  |  |  | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 8 | `transTypeId` | 交易类型 | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 9 | `detailList` | 采购品类定级申请详情 | `category.level.ApplicationDetail` | `` | detailList → applicationId | 1..n | true | None |  |

### Composition（子表）

- **detailList**: `detailList` → `category.level.ApplicationDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `applyOrgId` (申请组织) | `org.func.BaseOrg` | `apply_org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `applyPsnId` (申请人) | `bd.staff.Staff` | `apply_psn_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
| `transTypeId` (交易类型) | `bd.bill.TransType` | `trans_type_id` |
