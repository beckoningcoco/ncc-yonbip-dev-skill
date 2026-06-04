---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contract.CTHeaderDefine"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同自定义项 (`cpu-contract.contract.CTHeaderDefine`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycContractManagement 模块实体元数据字典。
> 物理表：`cpu_ct_header_define` | 所属应用：`ycContractManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-contract.contract.CTHeaderDefine` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同自定义项 |
| 物理表 | `cpu_ct_header_define` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycContractManagement` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:12.2380` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | String | ID |

## 部署信息

- **部署时间**: 2024-01-27 01:36:30:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V3_R5_2312/0010_iuap_common/DML/0270_iuap_metadata/202312251610_metadata_cpu-contract-contract.zip`
- **安装人**: migration
- **安装排名**: `e43e2638-b6ad-4fe3-bcda-700cf719c658`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `CG::ctxType::global`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 特征基础接口 (`ICharacteristcs`) | `ucfbase.character.ICharacteristcs` | 5 | 0 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 14 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `FJTZ` | 附件特征 | `vcol53` | String | `attachment` |  |  |
| 2 | `Test002` | Test | `vcol3` | b9dcc421-d980-4ecd-81b0-7952a682055a | `quote` |  |  |
| 3 | `Test01` | Test01 | `bcol1` | Boolean | `switch` |  |  |
| 4 | `Test05` | Test文本 | `vcol4` | Test01 | `singleOption` |  |  |
| 5 | `Test06` | Test员工 | `vcol5` | 5d917a02-153f-4482-b3dc-b445e7639ca3 | `quote` |  |  |
| 6 | `YYJTEST001` | 合同类型yyj | `vcol6` | cdcd6c71-c57f-4d69-923a-04f2806aca60 | `quote` |  |  |
| 7 | `cgbm0001` | 使用部门 | `vcol2` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  |  |
| 8 | `cstz001` | 测试特征字段 | `vcol54` | String | `attachment` |  |  |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `id` | ID | `id` | String | `text` |  | ✓ |
| 11 | `jylx_memo` | 交易类型备注 | `vcol1` | String | `text` |  |  |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 13 | `tzbbb` | cb合同备注 | `vcol55` | String | `text` |  |  |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `Test06` | Test员工 | `bd.customerdoc_0004.0004` | `vcol5` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `cgbm0001` | 使用部门 | `bd.adminOrg.AdminOrgVO` | `vcol2` |  →  |  |  | Service |  |
| 4 | `YYJTEST001` | 合同类型yyj | `bd.customerdoc_YYJTEST001.YYJTEST001` | `vcol6` |  →  |  |  | Service |  |
| 5 | `Test002` | Test | `bd.customerdoc_11.11` | `vcol3` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `Test06` (Test员工) | `bd.customerdoc_0004.0004` | `vcol5` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `cgbm0001` (使用部门) | `bd.adminOrg.AdminOrgVO` | `vcol2` |
| `YYJTEST001` (合同类型yyj) | `bd.customerdoc_YYJTEST001.YYJTEST001` | `vcol6` |
| `Test002` (Test) | `bd.customerdoc_11.11` | `vcol3` |
