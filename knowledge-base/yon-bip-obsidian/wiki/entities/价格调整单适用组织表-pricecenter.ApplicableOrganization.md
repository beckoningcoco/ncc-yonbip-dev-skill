---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "yc.pricecenter.ApplicableOrganization"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格调整单适用组织表 (`yc.pricecenter.ApplicableOrganization`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`pu_adjustprice_applicable_organization` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `yc.pricecenter.ApplicableOrganization` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格调整单适用组织表 |
| 物理表 | `pu_adjustprice_applicable_organization` |
| domain/服务域 | `yuncai-upu-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:22.1350` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 子表关联标识 |

## 部署信息

- **部署时间**: 2025-10-24 23:29:28:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509142225_metadata_yc-pricecenter.zip`
- **安装人**: mongoTools
- **安装排名**: `0e28deaf-f6a9-4685-8624-5bc6633ee851`

## 术语标记

`BusinessData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 5 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 2 | `adjustPriceId` | 主表关联标识ID | `adjustprice_id` | 10f3f7e7-cd06-4371-8d8b-05be8212d986 | `quote` |  | ✓ |
| 3 | `organizationId` | 组织id | `organization_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 5 | `id` | 子表关联标识 | `id` | Long | `long` |  | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `organizationId` | 组织id | `org.func.BaseOrg` | `organization_id` |  →  |  |  | Service |  |
| 2 | `adjustPriceId` | 主表关联标识ID | `yc.pricecenter.AdjustPrice` | `adjustprice_id` | applicableorganization → adjustPriceId | 1..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **adjustPriceId**: `applicableorganization` → `yc.pricecenter.AdjustPrice` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `organizationId` (组织id) | `org.func.BaseOrg` | `organization_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
