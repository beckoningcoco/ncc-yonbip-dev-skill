---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricetype.PriceTypeObject"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定价类型单据属性 (`aa.pricetype.PriceTypeObject`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_pricetype_object` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricetype.PriceTypeObject` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价类型单据属性 |
| 物理表 | `cpu_price_pricetype_object` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:51.6460` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:53:02:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202603230943_metadata_aa-pricetype_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `7c1532b7-cb70-408e-a44a-e502198d8c3f`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 11 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `formId` | 表单id | `form_id` | String | `text` |  | ✓ |
| 2 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 3 | `priceType` | 定价类型 | `price_type` | 8495de5e-0f17-483c-947c-a5a8a35739e6 | `quote` |  | ✓ |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 5 | `souAttr` | 关联单据属性 | `sou_attr` | String | `text` |  | ✓ |
| 6 | `souAttrName` | 关联单据属性名称 | `sou_attr_name` | String | `text` |  | ✓ |
| 7 | `souAttrNameResid` | 关联单据属性名称多语资源码 | `sou_attr_name_resid` | String | `text` |  | ✓ |
| 8 | `souObject` | 关联单据 | `sou_object` | String | `text` |  | ✓ |
| 9 | `souObjectName` | 关联单据名称 | `sou_object_name` | String | `text` |  | ✓ |
| 10 | `souObjectNameResid` | 关联单据名称多语资源码 | `sou_object_name_resid` | String | `text` |  | ✓ |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `priceType` | 定价类型 | `aa.pricetype.PriceType` | `price_type` | priceTypeObjectList → priceType | 0..n | true | None |  |

### Composition（子表）

- **priceType**: `priceTypeObjectList` → `aa.pricetype.PriceType` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
