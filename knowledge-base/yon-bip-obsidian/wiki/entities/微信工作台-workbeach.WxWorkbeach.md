---
tags: ["BIP", "元数据", "数据字典", "ycBase", "wx.workbeach.WxWorkbeach"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 微信工作台 (`wx.workbeach.WxWorkbeach`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_wx_workbeach` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `wx.workbeach.WxWorkbeach` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 微信工作台 |
| 物理表 | `cpu_wx_workbeach` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 业务对象ID | `8b4cb209-3904-49a4-8360-aabcb2ea76e7` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:37.7290` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:41:12:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202603201622_metadata_wx-workbeach_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `735c8705-bd06-4b7c-8709-12ad3eab9eac`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `apps` | 微信工作台应用 | `` | 3e388191-a39a-4688-813c-ef8e1fbca536 | `` |  |  |
| 2 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 3 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 5 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 7 | `customApps` | 微信工作台用户级应用 | `` | 32cca05b-437c-4348-b130-940ee60dd846 | `` |  |  |
| 8 | `customTodos` | 微信工作台用户级待办 | `` | e4c11ea6-15eb-419e-b802-832f570d3fe1 | `` |  |  |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `isSys` | 是否系统级 | `is_sys` | Short | `short` |  | ✓ |
| 12 | `microServiceCode` | 微服务编码 | `micro_service_code` | String | `text` |  | ✓ |
| 13 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 17 | `name` | 名称 | `name` | String | `text` |  | ✓ |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 19 | `sysId` | 系统级标识 | `sys_id` | Long | `long` |  | ✓ |
| 20 | `todos` | 微信工作台待办 | `` | a62af691-eedf-4ccc-baec-222218cbe858 | `` |  |  |
| 21 | `wtype` | 工作台类型 | `wtype` | Short | `short` |  | ✓ |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `customTodos` | 微信工作台用户级待办 | `wx.workbeach.WxWorkbeachTodoCustom` | `` | customTodos → workbeachId | 0..n | true | None |  |
| 2 | `customApps` | 微信工作台用户级应用 | `wx.workbeach.WxWorkbeachAppCustom` | `` | customApps → workbeachId | 0..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `todos` | 微信工作台待办 | `wx.workbeach.WxWorkbeachTodo` | `` | todos → workbeachId | 1..n | true | None |  |
| 7 | `apps` | 微信工作台应用 | `wx.workbeach.WxWorkbeachApp` | `` | apps → workbeachId | 1..n | true | None |  |

### Composition（子表）

- **customTodos**: `customTodos` → `wx.workbeach.WxWorkbeachTodoCustom` | 0..n
- **customApps**: `customApps` → `wx.workbeach.WxWorkbeachAppCustom` | 0..n
- **todos**: `todos` → `wx.workbeach.WxWorkbeachTodo` | 1..n
- **apps**: `apps` → `wx.workbeach.WxWorkbeachApp` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
