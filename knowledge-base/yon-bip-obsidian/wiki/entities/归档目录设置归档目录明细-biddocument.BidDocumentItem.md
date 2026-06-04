---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.biddocument.BidDocumentItem"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 归档目录设置归档目录明细 (`bctask.biddocument.BidDocumentItem`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_bid_document_item` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.biddocument.BidDocumentItem` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 归档目录设置归档目录明细 |
| 物理表 | `cpu_bid_document_item` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:30.7790` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:41:09:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202603171546_metadata_bctask-biddocument.zip`
- **安装人**: mongoTools
- **安装排名**: `efd010da-1b8f-4b2f-85ff-a2d2c6fa0837`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `bidDocumentCategoryId` | 所属归档分类 | `bid_document_category_id` | e0847978-b4a4-4db9-b484-1e91a7335589 | `quote` |  | ✓ |
| 2 | `bidDocumentId` | 模板 | `bid_document_id` | Long | `long` |  | ✓ |
| 3 | `billnum` | 单据编码 | `billnum` | String | `text` |  | ✓ |
| 4 | `classifyCode` | 打印模板分类 | `classify_code` | String | `text` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `fileName` | 文件名称 | `file_name` | String | `text` |  | ✓ |
| 7 | `fileSource` | 文件来源 | `file_source` | String | `text` |  | ✓ |
| 8 | `fileSourceId` | 文件来源 | `file_source_id` | 49c3fbcd-905a-4266-84e2-454aa04c93d5 | `quote` |  | ✓ |
| 9 | `fileSourceType` | 文件来源分类 | `file_source_type` | Integer | `int` |  | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `ifUpload` | 支持补充上传 | `if_upload` | Integer | `int` |  | ✓ |
| 12 | `printTemplate` | 打印模板主键 | `print_template` | Long | `long` |  | ✓ |
| 13 | `printTemplateCode` | 打印模板编号 | `print_template_code` | String | `text` |  | ✓ |
| 14 | `printTemplateName` | 打印模板名称 | `print_template_name` | String | `text` |  | ✓ |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 16 | `remarks` | 备注 | `remarks` | String | `text` |  | ✓ |
| 17 | `rowNo` | 顺序 | `row_no` | Integer | `int` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `fileSourceId` | 文件来源 | `bctask.biddocument.BidDocumentFileSource` | `file_source_id` |  →  |  |  | None |  |
| 2 | `bidDocumentCategoryId` | 所属归档分类 | `bctask.biddocument.BidDocumentCategory` | `bid_document_category_id` | documentItems → bidDocumentCategoryId | 1..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **bidDocumentCategoryId**: `documentItems` → `bctask.biddocument.BidDocumentCategory` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
