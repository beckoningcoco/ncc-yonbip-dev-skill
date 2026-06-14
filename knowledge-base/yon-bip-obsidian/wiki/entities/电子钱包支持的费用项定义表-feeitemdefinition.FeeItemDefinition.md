---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.feeitemdefinition.FeeItemDefinition"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包支持的费用项定义表 (`ewallet.feeitemdefinition.FeeItemDefinition`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_fee_item_definition` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.feeitemdefinition.FeeItemDefinition` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包支持的费用项定义表 |
| 物理表 | `cpu_ew_fee_item_definition` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `2c011f0e-ea82-4835-a2e5-de9f07f6f76c` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:17.7260` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 费用项编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:56:19:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512051240_metadata_ewallet-feeitemdefinition_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `7ebaaa3f-969d-4592-9d08-68b93eef74d0`

## 业务场景

- `dataMultilanguage`

## 术语标记

`MasterData`

## 约束

- **code** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 5 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 直接属性（共 21 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `appId` | 所属应用 | `app_id` | 9570ff1b-f366-41e2-ab57-362405a1da6d | `quote` |  | ✓ |
| 2 | `billType` | 单据类型 | `bill_type` | String | `text` |  | ✓ |
| 3 | `billnum` | 单据编码 | `billnum` | String | `text` |  | ✓ |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 5 | `code` | 费用项编码 | `code` | String | `text` |  | ✓ |
| 6 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 8 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 10 | `domainKey` | 微服务编码 | `domain_key` | String | `text` |  | ✓ |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 12 | `feeType` | 费用类型 | `fee_type` | String | `text` |  | ✓ |
| 13 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 14 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 18 | `name` | 费用项名称 | `name` | String | `multiLanguage` |  | ✓ |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 20 | `remark` | 费用项描述 | `remark` | String | `text` |  | ✓ |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `appId` | 所属应用 | `ewallet.feeitemdefinition.App` | `app_id` |  →  |  |  | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
