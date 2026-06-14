---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.costitem.CostItemTemplateApplyScope"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 适用范围 (`aa.costitem.CostItemTemplateApplyScope`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_costpricing_template_apply_scope` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.costitem.CostItemTemplateApplyScope` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用范围 |
| 物理表 | `cpu_costpricing_template_apply_scope` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:32.4380` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-05-24 00:20:33:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202505161438_metadata_aa-costitem_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `b1a7bd03-dd80-4a58-9fc9-8e0309dc143b`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 7 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `costItemTemplateId` | 报价模板ID | `costItemTemplate_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a | `quote` |  | ✓ |
| 2 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 4 | `scopeMaterail` | 适用范围物料 | `` | d4a46bdc-ce4b-4a0e-94a5-a7e41070d776 | `` |  |  |
| 5 | `scopeMaterailClass` | 适用范围物料分类 | `` | c9683cd3-0b0b-4e2d-a9f1-50c2bbf5c0ed | `` |  |  |
| 6 | `scopePurOrg` | 适用范围组织 | `` | 8cafa358-5548-4e01-a64c-56cc6e62cb22 | `` |  |  |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `costItemTemplateId` | 报价模板ID | `aa.costitem.CostItemTemplate` | `costItemTemplate_id` | applyScopes → costItemTemplateId | 0..n | true | None |  |
| 3 | `scopePurOrg` | 适用范围组织 | `aa.costitem.CostItemTemplateApplyScopeOrg` | `` | scopePurOrg → applyScopeId | 0..n | true | None |  |
| 4 | `scopeMaterail` | 适用范围物料 | `aa.costitem.CostItemTemplateApplyScopeMaterial` | `` | scopeMaterail → applyScopeId | 0..n | true | None |  |
| 5 | `scopeMaterailClass` | 适用范围物料分类 | `aa.costitem.CostItemTemplateApplyScopeMaterialClass` | `` | scopeMaterailClass → applyScopeId | 0..n | true | None |  |

### Composition（子表）

- **costItemTemplateId**: `applyScopes` → `aa.costitem.CostItemTemplate` | 0..n
- **scopePurOrg**: `scopePurOrg` → `aa.costitem.CostItemTemplateApplyScopeOrg` | 0..n
- **scopeMaterail**: `scopeMaterail` → `aa.costitem.CostItemTemplateApplyScopeMaterial` | 0..n
- **scopeMaterailClass**: `scopeMaterailClass` → `aa.costitem.CostItemTemplateApplyScopeMaterialClass` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
