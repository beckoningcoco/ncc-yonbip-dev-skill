---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.feeitemdefinition.App"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包支持的业务模块信息表 (`ewallet.feeitemdefinition.App`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_app` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.feeitemdefinition.App` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包支持的业务模块信息表 |
| 物理表 | `cpu_ew_app` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `c2c1d34e-21a7-48de-91c5-824f981e0121` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:10.6630` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:56:19:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512051240_metadata_ewallet-feeitemdefinition_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `7ebaaa3f-969d-4592-9d08-68b93eef74d0`

## 业务场景

- `dataMultilanguage`

## 术语标记

`isMain`, `MasterData`

## 约束

- **appCode** (transformKey): 应用编码 — 唯一字段: `['appCode']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `appCode` | 应用编码 | `app_code` | String | `text` |  | ✓ |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 3 | `domainCode` | 领域编码 | `domain_code` | String | `text` |  | ✓ |
| 4 | `domainId` | 所属领域 | `domain_id` | bb9e8772-b1b7-4d16-9655-611a7ee79525 | `quote` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 7 | `licenseCode` | 工作台计量单位编码 | `license_code` | String | `text` |  | ✓ |
| 8 | `name` | 应用名称 | `name` | String | `multiLanguage` |  | ✓ |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `domainId` | 所属领域 | `ewallet.feeitemdefinition.Domain` | `domain_id` | apps → domainId | 0..n | true | None |  |

### Composition（子表）

- **domainId**: `apps` → `ewallet.feeitemdefinition.Domain` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
