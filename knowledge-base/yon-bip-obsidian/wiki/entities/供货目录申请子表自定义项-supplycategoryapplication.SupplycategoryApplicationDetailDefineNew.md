---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategoryapplication.SupplycategoryApplicationDetailDefineNew"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供货目录申请子表自定义项 (`cpubase.supplycategoryapplication.SupplycategoryApplicationDetailDefineNew`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_supplycategory_application_detail_defineCharacter` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategoryapplication.SupplycategoryApplicationDetailDefineNew` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供货目录申请子表自定义项 |
| 物理表 | `cpu_supplycategory_application_detail_defineCharacter` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `e7162c6a-ae0b-467d-8879-fffe40293c4b` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:56.1840` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | String | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:38:06:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512161648_metadata_cpubase-supplycategoryapplication_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `1aa10efd-7349-4fe0-95af-ad7701f67fcb`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `CG::ctxType::global`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 特征基础接口 (`ICharacteristcs`) | `ucfbase.character.ICharacteristcs` | 5 | 0 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 6 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `GYSLX` | 供应商类型 | `vcol1` | be53d2f7-648f-4b53-9d00-6c473f6bb8eb | `quote` |  |  |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 3 | `ghfj001` | 现场考察附件 | `vcol55` | String | `attachment` |  |  |
| 4 | `id` | ID | `id` | String | `text` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `GYSLX` | 供应商类型 | `bd.customerdoc_9435.9435` | `vcol1` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `GYSLX` (供应商类型) | `bd.customerdoc_9435.9435` | `vcol1` |
