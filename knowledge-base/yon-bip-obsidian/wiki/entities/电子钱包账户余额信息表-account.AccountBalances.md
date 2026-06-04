---
tags: ["BIP", "元数据", "数据字典", "ewallet.account.AccountBalances"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包账户余额信息表 (`ewallet.account.AccountBalances`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP  模块实体元数据字典。
> 物理表：`cpu_ew_account_balances` | 所属应用：``
> 来源：元数据API `queryByUri` 返回的 `ewallet.account.AccountBalances` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包账户余额信息表 |
| 物理表 | `cpu_ew_account_balances` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:16:17.6810` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 22:09:33:000
- **安装来源**: `/app/iuap-metadata-base-common/iuap-metadata-base/metadata-bootstrap/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-metadata-base/0010_iuap_common/DML/0270_iuap_metadata/202604/202604161115_metadata_ucfbase-ucfbaseItf.zip`
- **安装人**: mongoTools
- **安装排名**: `b5b48373-4313-49fc-8cb9-9678b9a19b33`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 24 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `walletId` | 电子钱包 | `wallet_id` | a9a8b3c1-bae2-4f21-ba1d-02628dc747d1 | `quote` |  | ✓ |
| 3 | `accountId` | 账户 | `account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee | `quote` |  | ✓ |
| 4 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 5 | `bankType` | 银行类别 | `bank_type` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |  | ✓ |
| 6 | `bankOutlets` | 银行网点 | `bank_outlets` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 11 | `bankCode` | 联行号 | `bank_code` | String | `text` |  | ✓ |
| 12 | `bankAccountName` | 银行账户名称 | `bank_account_name` | String | `text` |  | ✓ |
| 13 | `bankAccount` | 银行账户 | `bank_account` | String | `text` |  | ✓ |
| 14 | `totalBalances` | 账户余额 | `total_balances` | Decimal | `number` |  | ✓ |
| 15 | `availableBalances` | 可用余额 | `available_balances` | Decimal | `number` |  | ✓ |
| 16 | `freezeBalances` | 冻结余额 | `freeze_balances` | Decimal | `number` |  | ✓ |
| 17 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 20 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 21 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 22 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `accountId` | 账户 | `ewallet.account.Account` | `account_id` | accountBalances → accountId | 0..n | true | None |  |
| 2 | `walletId` | 电子钱包 | `ewallet.wallet.Wallet` | `wallet_id` |  →  |  |  | None |  |
| 3 | `bankOutlets` | 银行网点 | `bd.bank.BankDotVO` | `bank_outlets` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `bankType` | 银行类别 | `bd.bank.BankVO` | `bank_type` |  →  |  |  | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 8 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |

### Composition（子表）

- **accountId**: `accountBalances` → `ewallet.account.Account` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `bankOutlets` (银行网点) | `bd.bank.BankDotVO` | `bank_outlets` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `bankType` (银行类别) | `bd.bank.BankVO` | `bank_type` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
| `currencyId` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
