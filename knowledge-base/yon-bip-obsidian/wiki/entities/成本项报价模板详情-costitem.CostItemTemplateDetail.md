---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.costitem.CostItemTemplateDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成本项报价模板详情 (`aa.costitem.CostItemTemplateDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_costpricing_template_detail` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.costitem.CostItemTemplateDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本项报价模板详情 |
| 物理表 | `cpu_costpricing_template_detail` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:33.9070` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:38:04:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512021636_metadata_aa-costitem_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `e51821f9-fc93-45ce-9eac-515e6dfd31fa`

## 术语标记

`isAssigned`, `isExtend`, `ConfigData`, `tree_tag`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 树型结构 (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |

---

## 直接属性（共 28 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `costitemid` | 成本项id | `costitem_id` | ac44f4aa-24eb-4fb1-bfae-1949bc4b5931 | `quote` |  | ✓ |
| 2 | `sn` | 序号 | `sn` | String | `text` |  | ✓ |
| 3 | `costItemTemplateId` | 报价模板ID | `costItemTemplate_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a | `quote` |  | ✓ |
| 4 | `costitem_code` | 成本项编码 | `code` | String | `text` |  | ✓ |
| 5 | `costitem_name` | 成本项名称 | `name` | String | `text` |  | ✓ |
| 6 | `specification` | 规格说明 | `specification` | String | `text` |  | ✓ |
| 7 | `model` | 型号 | `model` | String | `text` |  | ✓ |
| 8 | `brand` | 品牌 | `brand` | String | `text` |  | ✓ |
| 9 | `manufacturer` | 生产厂商 | `manufacturer` | String | `text` |  | ✓ |
| 10 | `costItemDescription` | 成本项描述 | `cost_item_description` | String | `text` |  | ✓ |
| 11 | `costNum` | 成本项用量 | `cost_num` | Decimal | `number` |  | ✓ |
| 12 | `unitId` | 计价单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 13 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 14 | `parent` | 上级 | `parent_id` | 7e287994-88f0-4ee4-b700-5c20c6e96fff | `quote` |  | ✓ |
| 15 | `realPath` | 路径 | `real_path` | String | `text` |  | ✓ |
| 16 | `costItemTemplateDetailCharacterDefine` | 成本项报价模板详情特征自定义项 | `define_character_id` | 32bc9ea7-ab74-4d47-a6f6-3a9247096931 | `UserDefine` |  | ✓ |
| 17 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String | `text` |  | ✓ |
| 18 | `taxPriority` | 价格标识 | `taxPriority` | Integer | `int` |  | ✓ |
| 19 | `ismakeupitem` | 是否参与成本项构成 | `ismakeupitem` | Short | `short` |  | ✓ |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 21 | `level` | 层级 | `level` | Integer | `int` |  | ✓ |
| 22 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 23 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | ✓ |
| 24 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 25 | `name` | 节点标题 | `name` | String | `text` |  | ✓ |
| 26 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 28 | `code` | 成本项编码 | `code` | String | `text` |  | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `costitemid` | 成本项id | `aa.costitem.CostItem` | `costitem_id` |  →  |  |  | None |  |
| 2 | `parent` | 上级 | `aa.costitem.CostItemTemplateDetail` | `parent_id` |  →  |  |  | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `costItemTemplateId` | 报价模板ID | `aa.costitem.CostItemTemplate` | `costItemTemplate_id` | detail → costItemTemplateId | 1..n | true | None |  |
| 5 | `unitId` | 计价单位 | `pc.unit.Unit` | `unit_id` |  →  |  |  | Service |  |
| 6 | `costItemTemplateDetailCharacterDefine` | 成本项报价模板详情特征自定义项 | `aa.costitem.CostItemTemplateDetailCharacterDefine` | `define_character_id` |  →  |  |  | None |  |

### Composition（子表）

- **costItemTemplateId**: `detail` → `aa.costitem.CostItemTemplate` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `unitId` (计价单位) | `pc.unit.Unit` | `unit_id` |
