---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "suppliermgr.template.exDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 认证信息要求表 (`suppliermgr.template.exDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_target_template_detail` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `suppliermgr.template.exDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 认证信息要求表 |
| 物理表 | `cpu_target_template_detail` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:31:01.7040` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 明细子表id |

## 部署信息

- **部署时间**: 2026-05-22 23:46:02:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202604171116_metadata_suppliermgr-template.zip`
- **安装人**: mongoTools
- **安装排名**: `93e9ed03-29c3-4116-b344-b490cc083d53`

## 术语标记

`MasterData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 档案状态 (`Enable`) | `common.base.Enable` | 98 | 3 |
| 2 | 审计信息 (`AuditInfo`) | `common.base.AuditInfo` | 179 | 4 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `targetId` | 模版组织id | `target_id` | 6ce0285a-5c64-4f45-a3b1-8a01ef51a8c7 | `quote` |  | ✓ |
| 2 | `reduct` | 减分项 | `reduct` | Integer | `int` |  | ✓ |
| 3 | `id` | 明细子表id | `id` | Long | `long` |  | ✓ |
| 4 | `vetoItem` | 否决项 | `veto_item` | Integer | `int` |  | ✓ |
| 5 | `vetoItemScore` | 否决项分值 | `veto_item_score` | Decimal | `number` |  | ✓ |
| 6 | `fileId` | 采购方附件 | `buyer_file_id` | String | `text` |  | ✓ |
| 7 | `fullScore` | 分数 | `full_score` | String | `text` |  | ✓ |
| 8 | `scoreWeight` | 权重% | `score_weight` | String | `text` |  | ✓ |
| 9 | `approveDesc` | 审核说明 | `approve_desc` | String | `text` |  | ✓ |
| 10 | `creationtime` | 创建时间 | `creationtime` | DateTime | `timestamp` |  | ✓ |
| 11 | `creator` | 创建人 | `creator` | ec9cb2fe-b176-4a1d-8db8-ac8188b468a9 | `quote` |  | ✓ |
| 12 | `disablets` | 停用时间 | `disablets` | DateTime | `timestamp` |  | ✓ |
| 13 | `enable` | 启用状态 | `enable` | enable | `` |  | ✓ |
| 14 | `enablets` | 启用时间 | `enablets` | DateTime | `timestamp` |  | ✓ |
| 15 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | ✓ |
| 16 | `modifier` | 修改人 | `modifier` | ec9cb2fe-b176-4a1d-8db8-ac8188b468a9 | `quote` |  | ✓ |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 18 | `scoreDim` | 评分维度 | `score_dim` | String | `text` |  | ✓ |
| 19 | `templateDetailCharacter` | 认证信息要求特征 | `template_detail_character` | a3b39e08-bf2b-4765-acaa-92d492e85f2c | `UserDefine` |  | ✓ |
| 20 | `templateExId` | 模版扩展表ID | `template_ex_id` | 9f0d99e1-d303-4a82-9dab-179c0808bf85 | `quote` |  | ✓ |
| 21 | `templateId` | 模版id | `template_id` | 0f1b9f8e-a486-4e1c-a5ee-b4aa7534106f | `quote` |  | ✓ |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `basedoc.yht.PubUserTenant` | `creator` |  →  |  |  | Service |  |
| 2 | `targetId` | 模版组织id | `suppliermgr.target.Target` | `target_id` |  →  |  |  | None |  |
| 3 | `templateExId` | 模版扩展表ID | `suppliermgr.template.link` | `template_ex_id` |  →  |  |  | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `modifier` | 修改人 | `basedoc.yht.PubUserTenant` | `modifier` |  →  |  |  | Service |  |
| 6 | `templateDetailCharacter` | 认证信息要求特征 | `suppliermgr.template.TemplateDetailCharacter` | `template_detail_character` |  →  |  |  | None |  |
| 7 | `templateId` | 模版id | `suppliermgr.template.Template` | `template_id` | exDetails → templateId | 0..n | true | None |  |

### Composition（子表）

- **templateId**: `exDetails` → `suppliermgr.template.Template` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `basedoc.yht.PubUserTenant` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `basedoc.yht.PubUserTenant` | `modifier` |
