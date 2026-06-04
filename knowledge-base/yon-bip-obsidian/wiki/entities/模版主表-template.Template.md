---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "suppliermgr.template.Template"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 模版主表 (`suppliermgr.template.Template`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_target_template` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `suppliermgr.template.Template` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 模版主表 |
| 物理表 | `cpu_target_template` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `903f244d-7ea4-42ed-9793-a4ef85be064c` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:18:59.4330` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主表id |
| 编码 | `code` | `code` | String | 模板编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:46:02:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604171116_metadata_suppliermgr-template.zip`
- **安装人**: mongoTools
- **安装排名**: `93e9ed03-29c3-4116-b344-b490cc083d53`

## 业务场景

- `extdevelop`
- `FieldAuth`
- `UITemplate`
- `DataAuth`
- `billcode`
- `userdefine`

## 术语标记

`isMain`, `MasterData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 档案状态 (`Enable`) | `common.base.Enable` | 98 | 3 |
| 2 | 审计信息 (`AuditInfo`) | `common.base.AuditInfo` | 179 | 4 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 直接属性（共 32 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `name` | 模板名称 | `name` | String | `multiLanguage` |  | ✓ |
| 2 | `code` | 模板编码 | `code` | String | `text` |  | ✓ |
| 3 | `orgId` | 组织id | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 4 | `temClassId` | 所属分类id | `class_id` | a09b9c2e-1a22-4510-8452-38c2b7f141a1 | `quote` |  | ✓ |
| 5 | `scoreForm` | 评分形式 | `score_form` | Integer | `int` |  | ✓ |
| 6 | `businessTypeId` | businessTypeId | `business_type_id` | 13ce1d98-af37-49c9-afba-bfb377aa5cd5 | `quote` |  | ✓ |
| 7 | `scoreType` | 分数类型 | `score_type` | Integer | `int` |  | ✓ |
| 8 | `ability` | 等级体系id | `ability_id` | 960ce6ff-03b4-4afc-ba32-2342d2e50e5b | `quote` |  | ✓ |
| 9 | `reviewType` | 评审类型 | `review_type` | Integer | `int` |  | ✓ |
| 10 | `totalScore` | 评分总分 | `total_score` | Decimal | `number` |  | ✓ |
| 11 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 12 | `fileId` | 附件 | `file_id` | String | `text` |  | ✓ |
| 13 | `source` | 模板来源 | `source` | String | `text` |  | ✓ |
| 14 | `id` | 主表id | `id` | Long | `long` |  | ✓ |
| 15 | `qualifySupportAuth` | 资质证件是否在认证范围中 | `qualify_support_auth` | String | `text` |  | ✓ |
| 16 | `qualifySupportScore` | 资质证件是否支持评分 | `qualify_support_score` | String | `text` |  | ✓ |
| 17 | `qualifySynVendor` | 资质证件是否同步供应商档案 | `qualify_sync_vendor` | String | `text` |  | ✓ |
| 18 | `creationtime` | 创建时间 | `creationtime` | DateTime | `timestamp` |  | ✓ |
| 19 | `creator` | 创建人 | `creator` | ec9cb2fe-b176-4a1d-8db8-ac8188b468a9 | `quote` |  | ✓ |
| 20 | `disablets` | 停用时间 | `disablets` | DateTime | `timestamp` |  | ✓ |
| 21 | `enable` | 启用状态 | `enable` | enable | `` |  | ✓ |
| 22 | `enablets` | 启用时间 | `enablets` | DateTime | `timestamp` |  | ✓ |
| 23 | `exDetails` | 认证信息要求表 | `` | a454aac5-e665-4b98-831c-0eca03181c84 | `` |  |  |
| 24 | `isSys` | 是否预置 | `is_sys` | Short | `short` |  | ✓ |
| 25 | `links` | 环节 | `` | 9f0d99e1-d303-4a82-9dab-179c0808bf85 | `` |  |  |
| 26 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | ✓ |
| 27 | `modifier` | 修改人 | `modifier` | ec9cb2fe-b176-4a1d-8db8-ac8188b468a9 | `quote` |  | ✓ |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 29 | `qualifys` | 资质证件要求表 | `` | 5f4b4371-4fce-4413-ba10-a841d7494fca | `` |  |  |
| 30 | `templateCharacter` | 模板管理特征 | `template_character` | ce6017a5-b2b8-4de6-a075-1eb04ae4e358 | `UserDefine` |  | ✓ |
| 31 | `uuid` | uuid | `uuid` | String | `text` |  | ✓ |
| 32 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 11 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `exDetails` | 认证信息要求表 | `suppliermgr.template.exDetail` | `` | exDetails → templateId | 0..n | true | None |  |
| 2 | `qualifys` | 资质证件要求表 | `suppliermgr.template.TemplateQualify` | `` | qualifys → templateId | 0..n | true | None |  |
| 3 | `creator` | 创建人 | `basedoc.yht.PubUserTenant` | `creator` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `temClassId` | 所属分类id | `suppliermgr.template.TemplateClass` | `class_id` |  →  |  |  | None |  |
| 6 | `templateCharacter` | 模板管理特征 | `suppliermgr.template.TemplateCharacter` | `template_character` |  →  |  |  | None |  |
| 7 | `modifier` | 修改人 | `basedoc.yht.PubUserTenant` | `modifier` |  →  |  |  | Service |  |
| 8 | `links` | 环节 | `suppliermgr.template.link` | `` | links → templateId | 0..n | true | None |  |
| 9 | `ability` | 等级体系id | `aa.supplyability.SupplyAbility` | `ability_id` |  →  |  |  | Service |  |
| 10 | `orgId` | 组织id | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |
| 11 | `businessTypeId` | businessTypeId | `suppliermgr.template.ApplicableOrg` | `business_type_id` |  →  |  |  | None |  |

### Composition（子表）

- **exDetails**: `exDetails` → `suppliermgr.template.exDetail` | 0..n
- **qualifys**: `qualifys` → `suppliermgr.template.TemplateQualify` | 0..n
- **links**: `links` → `suppliermgr.template.link` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `basedoc.yht.PubUserTenant` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `basedoc.yht.PubUserTenant` | `modifier` |
| `ability` (等级体系id) | `aa.supplyability.SupplyAbility` | `ability_id` |
| `orgId` (组织id) | `bd.adminOrg.BaseOrgVO` | `org_id` |
