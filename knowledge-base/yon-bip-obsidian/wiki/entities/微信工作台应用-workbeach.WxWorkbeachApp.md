---
tags: ["BIP", "元数据", "数据字典", "ycBase", "wx.workbeach.WxWorkbeachApp"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 微信工作台应用 (`wx.workbeach.WxWorkbeachApp`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_wx_workbeach_app` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `wx.workbeach.WxWorkbeachApp` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 微信工作台应用 |
| 物理表 | `cpu_wx_workbeach_app` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:19:21.6780` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:41:12:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202603201622_metadata_wx-workbeach_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `735c8705-bd06-4b7c-8709-12ad3eab9eac`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 7 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `appId` | 应用 | `app_id` | 473b7b81-241d-4218-b3cf-dac52b986a66 | `quote` |  | ✓ |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 3 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 4 | `microServiceCode` | 微服务编码 | `micro_service_code` | String | `text` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 6 | `workbeachId` | 工作台 | `workbeach_id` | 51556736-4cf3-4086-b5cd-00b2d01823d7 | `quote` |  | ✓ |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `workbeachId` | 工作台 | `wx.workbeach.WxWorkbeach` | `workbeach_id` | apps → workbeachId | 1..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `appId` | 应用 | `wx.workbeach.WxApp` | `app_id` |  →  |  |  | None |  |

### Composition（子表）

- **workbeachId**: `apps` → `wx.workbeach.WxWorkbeach` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
