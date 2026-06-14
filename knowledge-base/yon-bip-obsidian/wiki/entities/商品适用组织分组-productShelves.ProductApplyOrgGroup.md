---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.productShelves.ProductApplyOrgGroup"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商品适用组织分组 (`mall.productShelves.ProductApplyOrgGroup`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_supplycategory_applyorg_group` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.productShelves.ProductApplyOrgGroup` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品适用组织分组 |
| 物理表 | `cpu_supplycategory_applyorg_group` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:21.9970` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:40:39:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202512151131_metadata_mall-productShelves_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `e0b76a86-4ee5-4f68-8393-31f409701e91`

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
| 1 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 2 | `customerId` | 采购商企业ID | `customer_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 3 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 4 | `orgGroupId` | 适用组织分组ID | `org_group_id` | eaf94f0e-f195-4ef6-908b-c219fbaf47b0 | `quote` |  | ✓ |
| 5 | `orgIds` | 组织ids | `org_ids` | String | `text` |  | ✓ |
| 6 | `productShelvesId` | 商品货架id | `supplycategory_id` | 5f5d18df-3d80-4cc1-8413-93fd4e2c2b20 | `quote` |  | ✓ |
| 7 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `productShelvesId` | 商品货架id | `mall.productShelves.ProductShelves` | `supplycategory_id` | applyOrgGroup → productShelvesId | 0..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `orgGroupId` | 适用组织分组ID | `bcres.orgGroup.OrgGroup` | `org_group_id` |  →  |  |  | Service |  |
| 4 | `customerId` | 采购商企业ID | `cpu-privilege.enterprise.EnterprisePOJO` | `customer_id` |  →  |  |  | Service |  |

### Composition（子表）

- **productShelvesId**: `applyOrgGroup` → `mall.productShelves.ProductShelves` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `orgGroupId` (适用组织分组ID) | `bcres.orgGroup.OrgGroup` | `org_group_id` |
| `customerId` (采购商企业ID) | `cpu-privilege.enterprise.EnterprisePOJO` | `customer_id` |
