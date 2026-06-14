---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.wallet.WalletFeeItem"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包支持的费用项配置表 (`ewallet.wallet.WalletFeeItem`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_wallet_fee_item` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.wallet.WalletFeeItem` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包支持的费用项配置表 |
| 物理表 | `cpu_ew_wallet_fee_item` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:18:49.8670` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:56:14:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202511281541_metadata_ewallet-wallet.zip`
- **安装人**: mongoTools
- **安装排名**: `8127be0a-f034-40b0-a352-caf550ca66f2`

## 术语标记

`MasterData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 19 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `accountName` | 账号名称 | `account_name` | String | `text` |  | ✓ |
| 3 | `accountNo` | 账号 | `account_no` | String | `text` |  | ✓ |
| 4 | `accountSecretKey` | 账号私钥 | `account_secret_key` | String | `text` |  | ✓ |
| 5 | `appId` | 应用编码 | `app_id` | 9570ff1b-f366-41e2-ab57-362405a1da6d | `quote` |  | ✓ |
| 6 | `bankOutlets` | 银行网点 | `bank_outlets` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |  | ✓ |
| 7 | `bankType` | 银行类别 | `bank_type` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |  | ✓ |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 9 | `currencies` | 电子钱包费用项支持的币种 | `` | 55cf24f2-7c1b-49d4-a1d4-52418b095eba | `` |  |  |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 11 | `enable` | 启用 | `enable` | String | `text` |  | ✓ |
| 12 | `feeItemDefCode` | 费用项定义编码 | `fee_item_def_code` | String | `text` |  | ✓ |
| 13 | `feeItemDefId` | 费用项定义 | `fee_item_def_id` | f907bf0d-9962-47cf-8a30-da9a3d007d60 | `quote` |  | ✓ |
| 14 | `operates` | 电子钱包费用项支持的操作 | `` | db0b8663-4445-4769-905e-7e26906df8b0 | `` |  |  |
| 15 | `payTypeId` | 支付方式 | `pay_type_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b | `quote` |  | ✓ |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 17 | `uniformSocialCreditCode` | 统一社会信用代码 | `uniform_social_credit_code` | String | `text` |  | ✓ |
| 18 | `walletId` | 电子钱包 | `wallet_id` | a9a8b3c1-bae2-4f21-ba1d-02628dc747d1 | `quote` |  | ✓ |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `walletId` | 电子钱包 | `ewallet.wallet.Wallet` | `wallet_id` | walletFeeItems → walletId | 1..n | true | None |  |
| 2 | `bankOutlets` | 银行网点 | `bd.bank.BankDotVO` | `bank_outlets` |  →  |  |  | Service |  |
| 3 | `payTypeId` | 支付方式 | `ewallet.config.PayType` | `pay_type_id` |  →  |  |  | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `operates` | 电子钱包费用项支持的操作 | `ewallet.wallet.WalletFeeItemOperate` | `` | operates → feeItemId | 0..n | true | None |  |
| 6 | `bankType` | 银行类别 | `bd.bank.BankVO` | `bank_type` |  →  |  |  | Service |  |
| 7 | `appId` | 应用编码 | `ewallet.feeitemdefinition.App` | `app_id` |  →  |  |  | None |  |
| 8 | `feeItemDefId` | 费用项定义 | `ewallet.feeitemdefinition.FeeItemDefinition` | `fee_item_def_id` |  →  |  |  | None |  |
| 9 | `currencies` | 电子钱包费用项支持的币种 | `ewallet.wallet.WalletFeeItemCurrency` | `` | currencies → feeItemId | 1..n | true | None |  |

### Composition（子表）

- **walletId**: `walletFeeItems` → `ewallet.wallet.Wallet` | 1..n
- **operates**: `operates` → `ewallet.wallet.WalletFeeItemOperate` | 0..n
- **currencies**: `currencies` → `ewallet.wallet.WalletFeeItemCurrency` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `bankOutlets` (银行网点) | `bd.bank.BankDotVO` | `bank_outlets` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `bankType` (银行类别) | `bd.bank.BankVO` | `bank_type` |
