---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.transapply.TransApply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包交易申请单信息表 (`ewallet.transapply.TransApply`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_trans_apply` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.transapply.TransApply` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包交易申请单信息表 |
| 物理表 | `cpu_ew_trans_apply` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `54e935aa-1ff1-46c6-a5e5-fd8eab69a50e` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:20.4280` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 单据编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:56:20:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512080917_metadata_ewallet-transapply.zip`
- **安装人**: mongoTools
- **安装排名**: `667deccb-1972-49fd-a267-6085f8c025fe`

## 业务场景

- `extdevelop`
- `UITemplate`
- `imextmp`
- `transtype`
- `report`
- `billcode`
- `userdefine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `dataAuth`, `data_auth`, `isMain`, `isMasterOrg`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 4 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 5 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 6 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |

---

## 直接属性（共 51 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `walletId` | 电子钱包 | `wallet_id` | a9a8b3c1-bae2-4f21-ba1d-02628dc747d1 | `quote` |  | ✓ |
| 3 | `feeItemDefId` | 费用项 | `fee_item_def_id` | f907bf0d-9962-47cf-8a30-da9a3d007d60 | `quote` |  | ✓ |
| 4 | `applyCreator` | 申请人 | `apply_creator` | String | `text` |  | ✓ |
| 5 | `applyTime` | 申请时间 | `apply_time` | Date | `date` |  | ✓ |
| 6 | `bizSourceAdminUser` | 来源业务负责人 | `biz_source_admin_user` | String | `text` |  | ✓ |
| 7 | `bizSourceCode` | 来源业务单据编号 | `biz_source_code` | String | `text` |  | ✓ |
| 8 | `bizSourceId` | 来源业务单据标识 | `biz_source_id` | String | `text` |  | ✓ |
| 9 | `bizSourceTitle` | 来源业务单据名称 | `biz_source_title` | String | `text` |  | ✓ |
| 10 | `bizSourceType` | 来源业务单据类型 | `biz_source_type` | String | `text` |  | ✓ |
| 11 | `bizStatus` | 业务状态 | `biz_status` | String | `text` |  | ✓ |
| 12 | `creatorEmail` | 创建人邮箱 | `creator_email` | String | `text` |  | ✓ |
| 13 | `creatorMobile` | 创建人电话 | `creator_mobile` | String | `text` |  | ✓ |
| 14 | `isProxy` | 是否代申请 | `is_proxy` | String | `text` |  | ✓ |
| 15 | `modifierEmail` | 修改人邮箱 | `modifier_email` | String | `text` |  | ✓ |
| 16 | `modifierMobile` | 修改人电话 | `modifier_mobile` | String | `text` |  | ✓ |
| 17 | `purOrgId` | 采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 18 | `sourceTitle` | 来源单据名称 | `source_title` | String | `text` |  | ✓ |
| 19 | `viewRangeCode` | 单据查看范围编码 | `view_range_code` | String | `text` |  | ✓ |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 21 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 22 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 23 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 24 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 26 | `applyStatus` | 交易单状态 | `apply_status` | String | `text` |  | ✓ |
| 27 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 28 | `mainOrgId` | 主组织 | `main_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 29 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 30 | `verifystate` | 是否审批流控制 | `verifystate` | Short | `short` |  | ✓ |
| 31 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 32 | `sourceId` | 来源单据标识 | `source_id` | String | `text` |  | ✓ |
| 33 | `sourceType` | 来源单据类型 | `source_type` | String | `text` |  | ✓ |
| 34 | `sourceCode` | 来源单据编号 | `source_code` | String | `text` |  | ✓ |
| 35 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 36 | `creator` | 制单人 | `creator` | String | `text` |  | ✓ |
| 37 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 38 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 39 | `modifier` | 修改人 | `modifier` | String | `text` |  | ✓ |
| 40 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 41 | `code` | 单据编码 | `code` | String | `text` |  | ✓ |
| 42 | `applyType` | 申请单类型 | `apply_type` | String | `text` |  | ✓ |
| 43 | `exceptionType` | 异常类型 | `exception_type` | String | `text` |  | ✓ |
| 44 | `remark` | 说明 | `remark` | String | `text` |  | ✓ |
| 45 | `exceptionReason` | 异常原因 | `exception_reason` | String | `text` |  | ✓ |
| 46 | `rejectReason` | 驳回原因 | `reject_reason` | String | `text` |  | ✓ |
| 47 | `fileId` | 费用附件 | `file_id` | String | `text` |  | ✓ |
| 48 | `transApplyDefineCharacter` | 交易单管理表头自定义项特征 | `define_character_id` | 1527b836-8c3b-4ed2-b258-f7796975b33a | `UserDefine` |  | ✓ |
| 49 | `define` | 交易单管理自由自定义项 | `` | a0f3a119-6fdb-4334-8eb3-77149e200adc | `` |  |  |
| 50 | `details` | 电子钱包采购商交易申请交易明细表 | `` | 63cadd3d-d65a-4295-9c09-e1c816b82328 | `` |  |  |
| 51 | `flows` | 电子钱包交易申请交易流水表 | `` | 15da1204-a7c2-4fd1-8f12-9e1595c8d013 | `` |  |  |

---

## 关联属性（共 12 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `mainOrgId` | 主组织 | `org.func.BaseOrg` | `main_org_id` |  →  |  |  | Service |  |
| 2 | `purOrgId` | 采购组织 | `org.func.BaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 3 | `walletId` | 电子钱包 | `ewallet.wallet.Wallet` | `wallet_id` |  →  |  |  | None |  |
| 4 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type` |  →  |  |  | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `flows` | 电子钱包交易申请交易流水表 | `ewallet.transapply.TransApplyFlow` | `` | flows → applyId | 0..n | true | None |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 9 | `define` | 交易单管理自由自定义项 | `ewallet.transapply.TransApplyFreeDefine` | `` | define → id | 1 | true | None | ⚠️ |
| 10 | `details` | 电子钱包采购商交易申请交易明细表 | `ewallet.transapply.TransApplyDetail` | `` | details → applyId | 0..n | true | None |  |
| 11 | `transApplyDefineCharacter` | 交易单管理表头自定义项特征 | `ewallet.transapply.TransApplyDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 12 | `feeItemDefId` | 费用项 | `ewallet.feeitemdefinition.FeeItemDefinition` | `fee_item_def_id` |  →  |  |  | None |  |

### Composition（子表）

- **flows**: `flows` → `ewallet.transapply.TransApplyFlow` | 0..n
- **define**: `define` → `ewallet.transapply.TransApplyFreeDefine` | 1 ⚠️ 已废弃
- **details**: `details` → `ewallet.transapply.TransApplyDetail` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `mainOrgId` (主组织) | `org.func.BaseOrg` | `main_org_id` |
| `purOrgId` (采购组织) | `org.func.BaseOrg` | `pur_org_id` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
