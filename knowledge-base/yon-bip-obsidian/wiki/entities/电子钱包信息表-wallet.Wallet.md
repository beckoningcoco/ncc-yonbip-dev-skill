---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.wallet.Wallet"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包信息表 (`ewallet.wallet.Wallet`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_wallet` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.wallet.Wallet` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包信息表 |
| 物理表 | `cpu_ew_wallet` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `4452365c-12b8-4809-8442-24b8bab6835a` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:23.6810` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 电子钱包编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:56:14:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202511281541_metadata_ewallet-wallet.zip`
- **安装人**: mongoTools
- **安装排名**: `8127be0a-f034-40b0-a352-caf550ca66f2`

## 业务场景

- `extdevelop`
- `UITemplate`
- `billcode`

## 术语标记

`data_auth`, `isMain`, `MasterData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 6 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 24 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `adminOrgId` | 钱包管理组织 | `admin_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 3 | `adminStaffId` | 钱包管理员 | `admin_staff_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |  | ✓ |
| 4 | `fileId` | 费用附件 | `file_id` | String | `text` |  | ✓ |
| 5 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 11 | `code` | 电子钱包编码 | `code` | String | `text` |  | ✓ |
| 12 | `name` | 电子钱包名称 | `name` | String | `text` |  | ✓ |
| 13 | `openReason` | 申请原因 | `open_reason` | String | `text` |  | ✓ |
| 14 | `creatorId` | 制单人账户 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 15 | `creator` | 制单人 | `creator` | String | `text` |  | ✓ |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 17 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 18 | `modifierId` | 修改人账户 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 19 | `modifier` | 修改人 | `modifier` | String | `text` |  | ✓ |
| 20 | `modifyTime` | 最新修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `modifyDate` | 最新修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 22 | `enable` | 状态 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 23 | `walletFeeItems` | 电子钱包支持的费用项配置表 | `` | 324a6ef0-21df-432b-a753-7abac923e4d1 | `` |  |  |
| 24 | `walletOrg` | 电子钱包适用的采购组织 | `` | 1890dc18-cb68-4fc1-96b3-1b057c9b603d | `` |  |  |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `walletFeeItems` | 电子钱包支持的费用项配置表 | `ewallet.wallet.WalletFeeItem` | `` | walletFeeItems → walletId | 1..n | true | None |  |
| 2 | `adminOrgId` | 钱包管理组织 | `org.func.BaseOrg` | `admin_org_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `adminStaffId` | 钱包管理员 | `bd.staff.StaffNew` | `admin_staff_id` |  →  |  |  | Service |  |
| 5 | `creatorId` | 制单人账户 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 6 | `modifierId` | 修改人账户 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 7 | `walletOrg` | 电子钱包适用的采购组织 | `ewallet.wallet.WalletOrg` | `` | walletOrg → walletId | 1..n | true | None |  |

### Composition（子表）

- **walletFeeItems**: `walletFeeItems` → `ewallet.wallet.WalletFeeItem` | 1..n
- **walletOrg**: `walletOrg` → `ewallet.wallet.WalletOrg` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `adminOrgId` (钱包管理组织) | `org.func.BaseOrg` | `admin_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `adminStaffId` (钱包管理员) | `bd.staff.StaffNew` | `admin_staff_id` |
| `creatorId` (制单人账户) | `base.user.User` | `creator_id` |
| `modifierId` (修改人账户) | `base.user.User` | `modifier_id` |
