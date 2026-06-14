---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricestrategy.PriceStrategy"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 取价策略 (`aa.pricestrategy.PriceStrategy`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_strategy` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricestrategy.PriceStrategy` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取价策略 |
| 物理表 | `cpu_price_strategy` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `e5061d58-8ef0-4f1f-a57e-c04d890a7756` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:20.7410` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 取价策略编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:38:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512121542_metadata_aa-pricestrategy_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `669a50e6-942b-423a-b70e-073f07baa491`

## 业务场景

- `dataMultilanguage`
- `billcode`

## 术语标记

`ConfigData`, `dataAuth`, `data_auth`, `isMain`

## 约束

- **code,ytenant_transform** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 4 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 5 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 6 | 系统预置 (`PreSet`) | `aa.pricestrategy.PreSet` | 14 | 1 |

---

## 直接属性（共 20 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 取价策略编码 | `code` | String | `text` |  | ✓ |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 3 | `creatorName` | 创建人 | `creatorName` | String | `text` |  | ✓ |
| 4 | `name` | 取价策略名称 | `name` | String | `multiLanguage` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 6 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 7 | `modifyTime` | 更新时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 8 | `modifierName` | 更新人 | `modifierName` | String | `text` |  | ✓ |
| 9 | `priority` | 优先级 | `priority` | Integer | `int` |  | ✓ |
| 10 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 11 | `enable` | 状态 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 12 | `applyOrganization` | 取价策略适用范围 | `` | 5a3b027e-7349-452e-beac-6f3225f7f465 | `` |  |  |
| 13 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 14 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 15 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 16 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 17 | `nscene` | 业务场景 | `nscene` | NsceneEnum | `` |  | ✓ |
| 18 | `preSet` | 是否系统预置 | `preSet` | String | `text` |  | ✓ |
| 19 | `priceProcess` | 取价过程 | `` | 8ee858ec-61fd-43ce-bb59-b12e93a365cd | `` |  |  |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `priceProcess` | 取价过程 | `aa.pricestrategy.PriceProcess` | `` | priceProcess → priceStrategyId | 1..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `applyOrganization` | 取价策略适用范围 | `aa.pricestrategy.ApplyOrganization` | `` | applyOrganization → priceStrategyId | 1..n | true | None |  |

### Composition（子表）

- **priceProcess**: `priceProcess` → `aa.pricestrategy.PriceProcess` | 1..n
- **applyOrganization**: `applyOrganization` → `aa.pricestrategy.ApplyOrganization` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
