---
tags: ["BIP", "元数据", "数据字典", "ewallet.config.PayChannel"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包支付渠道信息表 (`ewallet.config.PayChannel`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP  模块实体元数据字典。
> 物理表：`cpu_ew_pay_channel` | 所属应用：``
> 来源：元数据API `queryByUri` 返回的 `ewallet.config.PayChannel` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包支付渠道信息表 |
| 物理表 | `cpu_ew_pay_channel` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:16:22.0090` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 支付渠道编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:56:20:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512051623_metadata_ewallet-config_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3b4fd430-b6f5-45e8-9346-70bbd6831ddd`

## 术语标记

`MasterData`

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

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 2 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 3 | `code` | 支付渠道编码 | `code` | String | `text` |  | ✓ |
| 4 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 7 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 8 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 9 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 10 | `protocolType` | 协议类型 | `protocol_type` | String | `text` |  | ✓ |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 14 | `payTypeId` | 支付方式 | `pay_type_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b | `quote` |  | ✓ |
| 15 | `interfaceKey` | 接口 | `interface_key` | String | `text` |  | ✓ |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 17 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 18 | `name` | 支付渠道名称 | `name` | String | `multiLanguage` |  | ✓ |
| 19 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 21 | `domainKey` | 接口服务域 | `domain_key` | String | `text` |  | ✓ |
| 22 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `payTypeId` | 支付方式 | `ewallet.config.PayType` | `pay_type_id` | payChannels → payTypeId | 1..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |

### Composition（子表）

- **payTypeId**: `payChannels` → `ewallet.config.PayType` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
