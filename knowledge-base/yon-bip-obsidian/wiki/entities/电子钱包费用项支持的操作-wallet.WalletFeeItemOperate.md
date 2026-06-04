---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.wallet.WalletFeeItemOperate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包费用项支持的操作 (`ewallet.wallet.WalletFeeItemOperate`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_wallet_fee_item_operate` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.wallet.WalletFeeItemOperate` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包费用项支持的操作 |
| 物理表 | `cpu_ew_wallet_fee_item_operate` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:15.6170` |

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

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 9 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `bizOperateCode` | 业务操作编码 | `biz_operate_code` | String | `text` |  | ✓ |
| 2 | `bizOperateId` | 业务操作 | `biz_operate_id` | a490b735-637a-4ae8-bc31-3378c904ffe5 | `quote` |  | ✓ |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 5 | `feeItemId` | 费用项 | `fee_item_id` | 324a6ef0-21df-432b-a753-7abac923e4d1 | `quote` |  | ✓ |
| 6 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 8 | `walletId` | 电子钱包 | `wallet_id` | Long | `long` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `feeItemId` | 费用项 | `ewallet.wallet.WalletFeeItem` | `fee_item_id` | operates → feeItemId | 0..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `bizOperateId` | 业务操作 | `ewallet.config.BizOperateDef` | `biz_operate_id` |  →  |  |  | None |  |

### Composition（子表）

- **feeItemId**: `operates` → `ewallet.wallet.WalletFeeItem` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
