---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.productShelves.ProductApplyOrg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商品适用组织 (`mall.productShelves.ProductApplyOrg`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_supplycategory_applyorg` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.productShelves.ProductApplyOrg` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品适用组织 |
| 物理表 | `cpu_supplycategory_applyorg` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:20.3270` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-10-24 23:19:35:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202509092317_metadata_mall-productShelves.zip`
- **安装人**: mongoTools
- **安装排名**: `2ca59843-3dc0-4ce4-bbc8-e7a58930aae7`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 8 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyOrgId` | 适用组织ID | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 3 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 4 | `orgInnercode` | 组织内部码 | `apply_org_code` | String | `text` |  | ✓ |
| 5 | `productId` | 商品ID | `product_id` | Long | `long` |  | ✓ |
| 6 | `productShelvesId` | 商品货架id | `supplycategory_id` | 5f5d18df-3d80-4cc1-8413-93fd4e2c2b20 | `quote` |  | ✓ |
| 7 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyOrgId` | 适用组织ID | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 2 | `productShelvesId` | 商品货架id | `mall.productShelves.ProductShelves` | `supplycategory_id` | applyOrg → productShelvesId | 0..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **productShelvesId**: `applyOrg` → `mall.productShelves.ProductShelves` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `applyOrgId` (适用组织ID) | `org.func.BaseOrg` | `apply_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
