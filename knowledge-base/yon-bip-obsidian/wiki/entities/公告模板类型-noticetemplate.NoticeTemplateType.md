---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.noticetemplate.NoticeTemplateType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 公告模板类型 (`bctask.noticetemplate.NoticeTemplateType`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_notice_template_type` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.noticetemplate.NoticeTemplateType` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公告模板类型 |
| 物理表 | `cpu_notice_template_type` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:15:51.2620` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:30:33:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202512041459_metadata_bctask-noticetemplate_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `34310a2b-ef93-40de-882c-52fd0a24a838`

## 术语标记

`ConfigData`

## 约束

- **UK_code** (transformKey): code — 唯一字段: `['code', 'billNo']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `billNo` | UI模板单据编码 | `bill_no` | String | `text` |  | ✓ |
| 2 | `bizObject` | 业务对象 | `biz_object` | String | `text` |  | ✓ |
| 3 | `businessTypeId` | 业务类型 | `business_type_id` | 7c191065-2c91-48d3-a75f-5ccca8aa3c62 | `quote` |  | ✓ |
| 4 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 5 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 7 | `enable` | 启用 | `enable` | Short | `short` |  | ✓ |
| 8 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 9 | `formId` | 单据类型 | `form_id` | String | `text` |  | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `iorder` | 序号 | `iorder` | Integer | `int` |  | ✓ |
| 12 | `isSys` | 是否系统预制 | `is_sys` | Short | `short` |  | ✓ |
| 13 | `mainEntity` | 主实体 | `main_entity` | String | `text` |  | ✓ |
| 14 | `microServiceCode` | 微服务编码 | `micro_service_code` | String | `text` |  | ✓ |
| 15 | `name` | 名称 | `name` | String | `multiLanguage` |  | ✓ |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 17 | `sysId` | 系统预制 | `sys_id` | Long | `long` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `businessTypeId` | 业务类型 | `bctask.noticetemplate.NoticeTemplateBusinessType` | `business_type_id` | templateTypes → businessTypeId | 1..n | true | None |  |

### Composition（子表）

- **businessTypeId**: `templateTypes` → `bctask.noticetemplate.NoticeTemplateBusinessType` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
