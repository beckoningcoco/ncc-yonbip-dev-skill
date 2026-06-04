---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.noticetemplate.NoticeTemplateApplyPurchaseMode"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 适用采购方式 (`bctask.noticetemplate.NoticeTemplateApplyPurchaseMode`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_notice_template_apply_purchase_mode` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.noticetemplate.NoticeTemplateApplyPurchaseMode` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用采购方式 |
| 物理表 | `cpu_notice_template_apply_purchase_mode` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:15:46.1940` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:30:31:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202511171744_metadata_bctask-noticetemplate.zip`
- **安装人**: mongoTools
- **安装排名**: `7ba4e9ab-ba1a-4ab9-b644-e8a3f5ef21b4`

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

## 直接属性（共 6 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 2 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 4 | `purchaseModeId` | 采购方式 | `purchase_mode_id` | 81c6880b-694a-4667-987f-81b5615f2401 | `quote` |  | ✓ |
| 5 | `templateId` | 公告模板 | `template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 | `quote` |  | ✓ |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `purchaseModeId` | 采购方式 | `lawbid.purchasedoc.PurchaseDoc` | `purchase_mode_id` |  →  |  |  | Service |  |
| 3 | `templateId` | 公告模板 | `bctask.noticetemplate.NoticeTemplate` | `template_id` | purchaseMode → templateId | 0..n | true | None |  |

### Composition（子表）

- **templateId**: `purchaseMode` → `bctask.noticetemplate.NoticeTemplate` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `purchaseModeId` (采购方式) | `lawbid.purchasedoc.PurchaseDoc` | `purchase_mode_id` |
