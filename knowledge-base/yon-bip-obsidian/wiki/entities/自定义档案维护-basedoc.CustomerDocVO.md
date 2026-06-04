---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.basedoc.CustomerDocVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 自定义档案维护 (`bctask.basedoc.CustomerDocVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_user_def_doc` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.basedoc.CustomerDocVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义档案维护 |
| 物理表 | `cpu_user_def_doc` |
| 数据库 schema | `cpu-pubapp` |
| 所属应用 | `ycBase` |
| 业务对象ID | `675e5255-f0c7-4bd2-89e2-4cc0eddaa94e` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:09.2620` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:41:08:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202603061105_metadata_bctask-basedoc_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `5a7e3f0b-7f75-4902-981f-dfcf847750c3`

## 业务场景

- `dataMultilanguage`

## 术语标记

`MasterData`, `doc`, `tree_tag`

## 约束

- **type_id_doc_code** (transformKey): 档案类型 — 唯一字段: `['code', 'custdocdefid', 'dr']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 树型结构 (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |
| 4 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 21 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `code` | 编码 | `doc_code` | String | `text` |  | ✓ |
| 3 | `name` | 名称 | `doc_name` | String | `multiLanguage` |  | ✓ |
| 4 | `parent` | 上级档案 | `parentid` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 5 | `custdocdefid` | 档案定义 | `type_id` | e7db564f-40be-4ff2-a31b-f3ba6ee39caa | `quote` |  | ✓ |
| 6 | `enable` | 状态 | `enable_status` | Boolean | `switch` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 9 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 10 | `enterpriseId` | 租户ID | `enterprise_id` | Long | `long` |  | ✓ |
| 11 | `isSys` | 系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 12 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 13 | `level` | 层级 | `level` | Integer | `int` |  | ✓ |
| 14 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 15 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | ✓ |
| 16 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 19 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 20 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 21 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `parent` | 上级档案 | `bctask.basedoc.CustomerDocVO` | `parentid` |  →  |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `custdocdefid` | 档案定义 | `bctask.basedoc.CustomerDocDefVO` | `type_id` |  →  |  |  | None |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
