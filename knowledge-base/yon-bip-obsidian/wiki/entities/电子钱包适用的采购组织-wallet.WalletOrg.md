---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.wallet.WalletOrg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包适用的采购组织 (`ewallet.wallet.WalletOrg`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_wallet_org` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.wallet.WalletOrg` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包适用的采购组织 |
| 物理表 | `cpu_ew_wallet_org` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:18:51.2290` |

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

`data_auth`, `MasterData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 7 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `purOrgId` | 适用采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 6 | `walletId` | 电子钱包 | `wallet_id` | a9a8b3c1-bae2-4f21-ba1d-02628dc747d1 | `quote` |  | ✓ |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purOrgId` | 适用采购组织 | `org.func.BaseOrg` | `pur_org_id` |  →  |  |  | Service |  |
| 2 | `walletId` | 电子钱包 | `ewallet.wallet.Wallet` | `wallet_id` | walletOrg → walletId | 1..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **walletId**: `walletOrg` → `ewallet.wallet.Wallet` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purOrgId` (适用采购组织) | `org.func.BaseOrg` | `pur_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
