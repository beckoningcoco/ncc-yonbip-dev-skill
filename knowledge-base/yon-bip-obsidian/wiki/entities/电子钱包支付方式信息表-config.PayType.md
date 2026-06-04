---
tags: ["BIP", "元数据", "数据字典", "ewallet.config.PayType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包支付方式信息表 (`ewallet.config.PayType`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP  模块实体元数据字典。
> 物理表：`cpu_ew_pay_type` | 所属应用：``
> 来源：元数据API `queryByUri` 返回的 `ewallet.config.PayType` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包支付方式信息表 |
| 物理表 | `cpu_ew_pay_type` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `` |
| 业务对象ID | `54993336-7dae-4f55-9e5b-3c6d453b0cc1` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:16.3320` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 支付方式编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:56:20:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512051623_metadata_ewallet-config_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3b4fd430-b6f5-45e8-9346-70bbd6831ddd`

## 业务场景

- `dataMultilanguage`

## 术语标记

`isMain`, `MasterData`

## 约束

- **code** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 5 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 21 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 支付方式编码 | `code` | String | `text` |  | ✓ |
| 2 | `isApprove` | 是否需要审批 | `is_approve` | Boolean | `switch` |  | ✓ |
| 3 | `isSupport` | 电子钱包是否已支持 | `is_support` | Boolean | `switch` |  | ✓ |
| 4 | `name` | 支付方式名称 | `name` | String | `multiLanguage` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 9 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 10 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 15 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 16 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 17 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 18 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 19 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 21 | `payChannels` | 电子钱包支付渠道信息表 | `` | b393d7d2-4cc7-469d-b5b7-9b06f9b9d5e8 | `` |  |  |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `payChannels` | 电子钱包支付渠道信息表 | `ewallet.config.PayChannel` | `` | payChannels → payTypeId | 1..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |

### Composition（子表）

- **payChannels**: `payChannels` → `ewallet.config.PayChannel` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
