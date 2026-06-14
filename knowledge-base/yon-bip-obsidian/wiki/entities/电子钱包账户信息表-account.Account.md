---
tags: ["BIP", "元数据", "数据字典", "ewallet.account.Account"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包账户信息表 (`ewallet.account.Account`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP  模块实体元数据字典。
> 物理表：`cpu_ew_account` | 所属应用：``
> 来源：元数据API `queryByUri` 返回的 `ewallet.account.Account` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包账户信息表 |
| 物理表 | `cpu_ew_account` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `` |
| 业务对象ID | `a31f757d-3e8f-4c41-bca1-71b788eb5ad0` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:21.9170` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 账户编码（必填，isCode）|

## 部署信息

- **部署时间**: 2024-03-01 23:13:44:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcsourcing-bootstrap/scripts/db/patch/mongodb/V3_R5_2312/0001_yonbip-cpu-bcsourcing/0010_iuap_common/DML/0270_iuap_metadata/202401021353_metadata_ewallet-account.zip`
- **安装人**: migration
- **安装排名**: `025fa736-bfa5-4f04-8e80-e3ca1ee13b73`

## 业务场景

- `extdevelop`
- `UITemplate`
- `billcode`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 6 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |

---

## 直接属性（共 25 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `walletId` | 电子钱包 | `wallet_id` | a9a8b3c1-bae2-4f21-ba1d-02628dc747d1 | `quote` |  | ✓ |
| 3 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 4 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 5 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 6 | `rejectReason` | 驳回原因 | `reject_reason` | String | `text` |  | ✓ |
| 7 | `mainOrgId` | 主组织 | `main_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 8 | `creatorId` | 创建人账户 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 9 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 10 | `modifierId` | 修改人账户 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 13 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 14 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 16 | `accountStatus` | 状态 | `account_status` | String | `text` |  | ✓ |
| 17 | `code` | 账户编码 | `code` | String | `text` |  | ✓ |
| 18 | `creator` | 创建人 | `creator` | String | `text` |  | ✓ |
| 19 | `modifier` | 修改人 | `modifier` | String | `text` |  | ✓ |
| 20 | `name` | 账户名称 | `name` | String | `text` |  | ✓ |
| 21 | `openReason` | 申请原因 | `open_reason` | String | `text` |  | ✓ |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 24 | `accountBalances` | 电子钱包账户余额信息表 | `` | 30be646d-bf5c-4a63-9652-3b03ee8ad38c | `` |  |  |
| 25 | `accountOrgs` | 电子钱包账户适用的采购组织 | `` | c0105b94-e1ef-43e6-b702-a2964e2bb265 | `` |  |  |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `mainOrgId` | 主组织 | `org.func.BaseOrg` | `main_org_id` |  →  |  |  | Service |  |
| 2 | `walletId` | 电子钱包 | `ewallet.wallet.Wallet` | `wallet_id` |  →  |  |  | None |  |
| 3 | `accountOrgs` | 电子钱包账户适用的采购组织 | `ewallet.account.AccountOrg` | `` | accountOrgs → accountId | 0..n | true | None |  |
| 4 | `accountBalances` | 电子钱包账户余额信息表 | `ewallet.account.AccountBalances` | `` | accountBalances → accountId | 0..n | true | None |  |
| 5 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `creatorId` | 创建人账户 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 7 | `modifierId` | 修改人账户 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |

### Composition（子表）

- **accountOrgs**: `accountOrgs` → `ewallet.account.AccountOrg` | 0..n
- **accountBalances**: `accountBalances` → `ewallet.account.AccountBalances` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `mainOrgId` (主组织) | `org.func.BaseOrg` | `main_org_id` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人账户) | `base.user.User` | `creator_id` |
| `modifierId` (修改人账户) | `base.user.User` | `modifier_id` |
