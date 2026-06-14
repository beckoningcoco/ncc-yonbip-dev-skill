---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategory.SupplycategoryBody"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供货目录子表 (`cpubase.supplycategory.SupplycategoryBody`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_supplycategory_freeze` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategory.SupplycategoryBody` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供货目录子表 |
| 物理表 | `cpu_supplycategory_freeze` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:16.9930` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:38:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512031023_metadata_cpubase-supplycategory_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `980ed22d-25b0-4b98-9b4f-05fd7a4b1568`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `autoUnFreeze` | 自动解冻 | `auto_unfreeze` | String | `text` |  | ✓ |
| 2 | `bizBillId` | 冻结业务id | `biz_bill_id` | 427ba203-6c5b-4cab-a900-9210ca35c601 | `quote` |  | ✓ |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 4 | `freezingEndDate` | 冻结结束日期 | `freezing_end_date` | DateTime | `timestamp` |  | ✓ |
| 5 | `freezingReason` | 冻结原因 | `freezing_reason` | String | `text` |  | ✓ |
| 6 | `freezingStartDate` | 冻结开始日期 | `freezing_start_date` | DateTime | `timestamp` |  | ✓ |
| 7 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 9 | `supplycategoryId` | 供货目录id | `supplycategory_id` | f4ad7e8e-0903-40e5-befb-ac6fcef517c3 | `quote` |  | ✓ |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `supplycategoryId` | 供货目录id | `cpubase.supplycategory.Supplycategory` | `supplycategory_id` | supplyCategopry → supplycategoryId | 0..n | true | None |  |
| 2 | `bizBillId` | 冻结业务id | `aa.supplybusinessaction.BusinessBillAction` | `biz_bill_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **supplycategoryId**: `supplyCategopry` → `cpubase.supplycategory.Supplycategory` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `bizBillId` (冻结业务id) | `aa.supplybusinessaction.BusinessBillAction` | `biz_bill_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
