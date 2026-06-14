---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.qualitypricehistory.PriceHisLibHeadEntity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 优质优价历史库表头 (`aa.qualitypricehistory.PriceHisLibHeadEntity`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_history` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.qualitypricehistory.PriceHisLibHeadEntity` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优质优价历史库表头 |
| 物理表 | `cpu_price_history` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `5e8b72fa-8d2c-4828-81a7-d61c56733c4b` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:15.9260` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:38:00:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202510311023_metadata_aa-qualitypricehistory_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `bb4217b6-d71f-4917-9ffa-4a761f8d6b67`

## 术语标记

`BusinessData`, `dataAuth`, `data_auth`, `doc`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 19 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `billCode` | 单据编码 | `bill_code` | String | `text` |  | ✓ |
| 2 | `billId` | 单据ID | `bill_id` | String | `text` |  | ✓ |
| 3 | `billRow` | 单据号 | `bill_row` | String | `text` |  | ✓ |
| 4 | `billType` | 单据类型 | `bill_type` | BillTypeEnum | `` |  | ✓ |
| 5 | `bodys` | 优质优价历史库表体 | `` | 27ec13d5-6bfd-4f9e-9ea1-a7a8b86a7f8d | `` |  |  |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 7 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 8 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 9 | `customerId` | 客户ID | `customerId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `materialId` | 物料id | `materialId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 13 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 15 | `organizationId` | 组织id | `organizationId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 17 | `schemeId` | 方案ID | `scheme_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 | `quote` |  | ✓ |
| 18 | `vendorId` | 供应商id | `vendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `organizationId` | 组织id | `org.func.BaseOrg` | `organizationId` |  →  |  |  | Service |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `customerId` | 客户ID | `aa.merchant.Merchant` | `customerId` |  →  |  |  | Service |  |
| 6 | `vendorId` | 供应商id | `aa.vendor.Vendor` | `vendorId` |  →  |  |  | Service |  |
| 7 | `bodys` | 优质优价历史库表体 | `aa.qualitypricehistory.PriceHisLibBodyEntity` | `` | bodys → headId | 1..n | true | None |  |
| 8 | `schemeId` | 方案ID | `aa.qualitypricescheme.QualitypriceScheme` | `scheme_id` |  →  |  |  | None |  |
| 9 | `materialId` | 物料id | `pc.product.Product` | `materialId` |  →  |  |  | Service |  |

### Composition（子表）

- **bodys**: `bodys` → `aa.qualitypricehistory.PriceHisLibBodyEntity` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `organizationId` (组织id) | `org.func.BaseOrg` | `organizationId` |
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `customerId` (客户ID) | `aa.merchant.Merchant` | `customerId` |
| `vendorId` (供应商id) | `aa.vendor.Vendor` | `vendorId` |
| `materialId` (物料id) | `pc.product.Product` | `materialId` |
