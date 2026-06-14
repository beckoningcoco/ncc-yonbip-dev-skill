---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.biddocument.BidDocument"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 归档目录设置 (`bctask.biddocument.BidDocument`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_bid_document` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.biddocument.BidDocument` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 归档目录设置 |
| 物理表 | `cpu_bid_document` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 业务对象ID | `4f171cb0-aca3-4eb1-bafc-20c7c5977704` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:26.9820` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `template_code` | `template_code` | String | 模板编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:41:09:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202603171546_metadata_bctask-biddocument.zip`
- **安装人**: mongoTools
- **安装排名**: `efd010da-1b8f-4b2f-85ff-a2d2c6fa0837`

## 业务场景

- `extdevelop`
- `dataMultilanguage`
- `UITemplate`
- `billcode`
- `SaveEffective`

## 术语标记

`ConfigData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 直接属性（共 26 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `addDirectory` | 允许补充分类 | `add_directory` | Integer | `int` |  | ✓ |
| 2 | `archiveSource` | 归档数据来源 | `archive_source` | Integer | `int` |  | ✓ |
| 3 | `bidTypes` | 归档目录设置适用的竞争方式 | `` | 77778314-b334-41da-a326-9bc162d348f6 | `` |  |  |
| 4 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 5 | `code` | 模板编码 | `template_code` | String | `text` |  | ✓ |
| 6 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 8 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 9 | `creatorId` | 创建人ID | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 10 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 11 | `documentCategories` | 归档目录设置归档目录信息 | `` | e0847978-b4a4-4db9-b484-1e91a7335589 | `` |  |  |
| 12 | `documentStartRing` | 归档时机 | `document_start_ring` | String | `text` |  | ✓ |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 14 | `enable` | 状态 | `enable` | Integer | `int` |  | ✓ |
| 15 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 16 | `fileSort` | 允许文档分类 | `file_sort` | Integer | `int` |  | ✓ |
| 17 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 18 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 19 | `modifierId` | 更新人ID | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 23 | `purchaseMode` | 归档目录设置适用的采购方式 | `` | 44441bc9-ea53-4d80-900d-2dd3d1bce684 | `` |  |  |
| 24 | `purchaseTypes` | 归档目录设置适用的采购类型 | `` | 5c78eabb-7220-4150-bb9b-1bc4057f9557 | `` |  |  |
| 25 | `templateName` | 模板名称 | `template_name` | String | `text` |  | ✓ |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `bidTypes` | 归档目录设置适用的竞争方式 | `bctask.biddocument.ArchiveTemplateBidType` | `` | bidTypes → bidDocumentId | 0..n | true | None |  |
| 2 | `documentCategories` | 归档目录设置归档目录信息 | `bctask.biddocument.BidDocumentCategory` | `` | documentCategories → bidDocumentId | 1..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `purchaseMode` | 归档目录设置适用的采购方式 | `bctask.biddocument.ArchiveTemplatePurchaseMode` | `` | purchaseMode → bidDocumentId | 0..n | true | None |  |
| 5 | `purchaseTypes` | 归档目录设置适用的采购类型 | `bctask.biddocument.ArchiveTemplatePurchaseType` | `` | purchaseTypes → bidDocumentId | 0..n | true | None |  |
| 6 | `creatorId` | 创建人ID | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 7 | `modifierId` | 更新人ID | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |

### Composition（子表）

- **bidTypes**: `bidTypes` → `bctask.biddocument.ArchiveTemplateBidType` | 0..n
- **documentCategories**: `documentCategories` → `bctask.biddocument.BidDocumentCategory` | 1..n
- **purchaseMode**: `purchaseMode` → `bctask.biddocument.ArchiveTemplatePurchaseMode` | 0..n
- **purchaseTypes**: `purchaseTypes` → `bctask.biddocument.ArchiveTemplatePurchaseType` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人ID) | `base.user.User` | `creator_id` |
| `modifierId` (更新人ID) | `base.user.User` | `modifier_id` |
