---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricetype.PriceOrder"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 取价顺序 (`aa.pricetype.PriceOrder`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_priceorder` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricetype.PriceOrder` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取价顺序 |
| 物理表 | `cpu_price_priceorder` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `5da7cc56-2364-47ed-afe3-ba2be071a339` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:22.3400` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主表id |
| 编码 | `code` | `code` | String | 取价顺序编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:38:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512121543_metadata_aa-pricetype_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `6b6cfdbd-ddcb-4639-9704-8c8bb86f1db2`

## 业务场景

- `dataMultilanguage`
- `billcode`

## 术语标记

`ConfigData`

## 约束

- **code,ytenant_transform** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 4 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 5 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 6 | 系统预置 (`PreSet`) | `aa.pricestrategy.PreSet` | 14 | 1 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 取价顺序编码 | `code` | String | `text` |  | ✓ |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 3 | `modifyTime` | 更新时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 4 | `creatorName` | 创建人 | `creatorName` | String | `text` |  | ✓ |
| 5 | `modifierName` | 更新人 | `modifierName` | String | `text` |  | ✓ |
| 6 | `name` | 取价顺序名称 | `name` | String | `multiLanguage` |  | ✓ |
| 7 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 8 | `id` | 主表id | `id` | Long | `long` |  | ✓ |
| 9 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 10 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 11 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 12 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 14 | `preSet` | 是否系统预置 | `preSet` | String | `text` |  | ✓ |
| 15 | `priceOrderList` | 取价顺序-子表 | `` | 2907fd4b-29e1-45e5-8a9f-b78ee2c0ba08 | `` |  |  |
| 16 | `priceOrderTypeList` | 取价顺序-定价类型-子表 | `` | 97e3dd71-41db-44b5-89d1-d52ea22839f1 | `` |  |  |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `priceOrderList` | 取价顺序-子表 | `aa.pricetype.PriceOrderDetail` | `` | priceOrderList → priceOrderId | 1..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `priceOrderTypeList` | 取价顺序-定价类型-子表 | `aa.pricetype.PriceOrderType` | `` | priceOrderTypeList → priceOrderId | 1..n | true | None |  |

### Composition（子表）

- **priceOrderList**: `priceOrderList` → `aa.pricetype.PriceOrderDetail` | 1..n
- **priceOrderTypeList**: `priceOrderTypeList` → `aa.pricetype.PriceOrderType` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
