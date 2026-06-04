---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.costitem.CostItem"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成本项 (`aa.costitem.CostItem`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_cost_item` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.costitem.CostItem` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本项 |
| 物理表 | `cpu_price_cost_item` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `77e78588-7a49-4d3c-b039-7d952bc26ce0` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:23.9510` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `code` | `code` | String | 成本项编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:29:22:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509111106_metadata_aa-costitem_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `55b791a2-be3b-4cbd-85a4-9a2abd60e2fd`

## 业务场景

- `UITemplate`
- `billcode`
- `userdefine`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `MasterData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 4 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 5 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |

---

## 直接属性（共 25 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 成本项编码 | `code` | String | `text` |  | ✓ |
| 2 | `orgId` | 采购组织 | `org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | ✓ |
| 3 | `brand` | 品牌 | `brand` | String | `text` |  | ✓ |
| 4 | `costItemCharacterDefine` | 成本项特征自定义项 | `define_character_id` | eb86a6fe-0da1-4679-9848-abeed19894cd | `UserDefine` |  | ✓ |
| 5 | `costItemDescription` | 成本项描述 | `cost_item_description` | String | `text` |  | ✓ |
| 6 | `manufacturer` | 生产厂商 | `manufacturer` | String | `text` |  | ✓ |
| 7 | `model` | 型号 | `model` | String | `text` |  | ✓ |
| 8 | `specification` | 规格说明 | `specification` | String | `text` |  | ✓ |
| 9 | `supplyId` | 来源供应商 | `supply_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 10 | `supplyTenantId` | 来源供应商租户Id | `supply_tenant_id` | String | `text` |  | ✓ |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 13 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 14 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 15 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 18 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 20 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 21 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 22 | `id` | id | `id` | Long | `long` |  | ✓ |
| 23 | `name` | 成本项名称 | `name` | String | `multiLanguage` |  | ✓ |
| 24 | `unitId` | 计价单位id | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 25 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `costItemCharacterDefine` | 成本项特征自定义项 | `aa.costitem.CostItemCharacterDefine` | `define_character_id` |  →  |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `supplyId` | 来源供应商 | `aa.vendor.Vendor` | `supply_id` |  →  |  |  | Service |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 6 | `unitId` | 计价单位id | `pc.unit.Unit` | `unit_id` |  →  |  |  | Service |  |
| 7 | `orgId` | 采购组织 | `org.func.PurchaseOrg` | `org_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `supplyId` (来源供应商) | `aa.vendor.Vendor` | `supply_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `unitId` (计价单位id) | `pc.unit.Unit` | `unit_id` |
| `orgId` (采购组织) | `org.func.PurchaseOrg` | `org_id` |
