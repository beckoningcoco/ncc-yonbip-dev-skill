---
tags: ["BIP", "元数据", "数据字典", "ycBase", "bctask.noticetemplate.NoticeTemplateBusinessType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 公告模板业务类型 (`bctask.noticetemplate.NoticeTemplateBusinessType`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_notice_template_business_type` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `bctask.noticetemplate.NoticeTemplateBusinessType` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公告模板业务类型 |
| 物理表 | `cpu_notice_template_business_type` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 业务对象ID | `26d358ec-5220-4457-b3b0-fd73111ef304` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:44.9520` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:30:33:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202512041459_metadata_bctask-noticetemplate_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `34310a2b-ef93-40de-882c-52fd0a24a838`

## 业务场景

- `dataMultilanguage`

## 术语标记

`ConfigData`, `isMain`

## 约束

- **UK_code** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 16 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 2 | `dataRule` | 数据规则 | `data_rule` | String | `text` |  | ✓ |
| 3 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 4 | `domain` | 服务域 | `domain` | String | `text` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `enable` | 启用 | `enable` | Short | `short` |  | ✓ |
| 7 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 8 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 9 | `iorder` | 序号 | `iorder` | Integer | `int` |  | ✓ |
| 10 | `isSys` | 是否系统预制 | `is_sys` | Short | `short` |  | ✓ |
| 11 | `microServiceCode` | 微服务编码 | `micro_service_code` | String | `text` |  | ✓ |
| 12 | `name` | 名称 | `name` | String | `multiLanguage` |  | ✓ |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 14 | `sysId` | 系统预制 | `sys_id` | Long | `long` |  | ✓ |
| 15 | `templateTypes` | 公告模板类型 | `` | ffb680e8-d532-4018-8abe-9143613f9129 | `` |  |  |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `templateTypes` | 公告模板类型 | `bctask.noticetemplate.NoticeTemplateType` | `` | templateTypes → businessTypeId | 1..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **templateTypes**: `templateTypes` → `bctask.noticetemplate.NoticeTemplateType` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
