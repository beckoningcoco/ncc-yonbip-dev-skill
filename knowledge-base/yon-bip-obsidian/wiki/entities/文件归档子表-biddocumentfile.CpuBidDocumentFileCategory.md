---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.biddocumentfile.CpuBidDocumentFileCategory"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 文件归档子表 (`bctask.biddocumentfile.CpuBidDocumentFileCategory`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_bid_document_file_category` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.biddocumentfile.CpuBidDocumentFileCategory` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件归档子表 |
| 物理表 | `cpu_bid_document_file_category` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:15:39.5240` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:41:08:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202603171537_metadata_bctask-biddocumentfile.zip`
- **安装人**: mongoTools
- **安装排名**: `2cbb6bce-011c-4dcc-8752-b2ff1a9059b1`

## 术语标记

`ConfigData`

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
| 1 | `bidDocumentId` | 归档主表主键 | `bid_document_id` | efa0835f-95d8-4e2b-abf8-7174705f2667 | `quote` |  | ✓ |
| 2 | `categoryName` | 文件分类名称 | `category_name` | String | `text` |  | ✓ |
| 3 | `documentItems` | 文件归档孙表 | `` | eb96f974-7949-4a57-befe-b38a43d75d95 | `` |  |  |
| 4 | `dr` | 删除标志 | `dr` | Short | `short` |  | ✓ |
| 5 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 6 | `isFromTemplate` | 分类是否来源于模板参照 | `isFromTemplate` | Boolean | `switch` |  | ✓ |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 8 | `rowNo` | 行号 | `row_no` | Integer | `int` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 10 | `ytenantId` | 租户 | `ytenant_id` | String | `text` |  | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `bidDocumentId` | 归档主表主键 | `bctask.biddocumentfile.CpuBidDocumentFile` | `bid_document_id` | bidDocumentFileCategorys → bidDocumentId | 0..n | true | None |  |
| 3 | `documentItems` | 文件归档孙表 | `bctask.biddocumentfile.CpuBidDocumentFileItem` | `` | documentItems → bidDocumentCategoryId | 0..n | true | None |  |

### Composition（子表）

- **bidDocumentId**: `bidDocumentFileCategorys` → `bctask.biddocumentfile.CpuBidDocumentFile` | 0..n
- **documentItems**: `documentItems` → `bctask.biddocumentfile.CpuBidDocumentFileItem` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
