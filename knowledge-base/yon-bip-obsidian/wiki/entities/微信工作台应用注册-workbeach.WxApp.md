---
tags: ["BIP", "元数据", "数据字典", "ycBase", "wx.workbeach.WxApp"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 微信工作台应用注册 (`wx.workbeach.WxApp`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_wx_app` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `wx.workbeach.WxApp` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 微信工作台应用注册 |
| 物理表 | `cpu_wx_app` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `580b975c-db9b-425f-a35b-015848328766` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:34.6460` |

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
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 19 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `billno` | 单据类型 | `billno` | String | `text` |  | ✓ |
| 2 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 3 | `dataRule` | 数据规则 | `data_rule` | String | `text` |  | ✓ |
| 4 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 5 | `domain` | 微服务标识 | `domain` | String | `text` |  | ✓ |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 7 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 8 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 9 | `icon` | 图标 | `icon` | String | `text` |  | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `isSys` | 是否系统级 | `is_sys` | Short | `short` |  | ✓ |
| 12 | `microServiceCode` | 微服务编码 | `micro_service_code` | String | `text` |  | ✓ |
| 13 | `name` | 名称 | `name` | String | `text` |  | ✓ |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 15 | `serviceCode` | 服务标识 | `service_code` | String | `text` |  | ✓ |
| 16 | `sysId` | 系统级标识 | `sys_id` | Long | `long` |  | ✓ |
| 17 | `worder` | 顺序号 | `worder` | Integer | `int` |  | ✓ |
| 18 | `wurl` | 跳转地址 | `wurl` | String | `text` |  | ✓ |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 1 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
