---
tags: [BIP, 元数据, 数据字典, ampub.gradinglevel.GradingLevelVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签档案 (`ampub.gradinglevel.GradingLevelVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_grading_level` | domain：`ucf-amc-aim` | 应用：`IASS` | 业务对象ID：`59c41648-80e3-4dba-adb6-c6b0e96daa0c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签档案 |
| 物理表 | `pam_grading_level` |
| 数据库 schema | `ucf-amc-aim` |
| 所属应用 | `IASS` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `grading_level_org` | `ampub.gradinglevel.GradingLevelOrgVO` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `` |
| `` | `` |

## 继承接口 (4个, 9字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `code` | `code` | `code` | 编码 |
| `cbg_color` | `cbg_color` | `cbgColor` | 背景颜色 |
| `cfg_color` | `cfg_color` | `cfgColor` | 字体颜色 |
| `memo` | `memo` | `memo` | 描述 |
| `name_resid` | `name_resid` | `name_resid` | 名称多语资源号 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pre_flag` | `pre_flag` | `pre_flag` | 预置标记 |
| `grading_flag` | `grading_flag` | `gradingFlag` | 需定级原因 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `label_type` | `label_type` | `labelType` | 标签类别 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 自定义项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `grading_level_org` | 适用组织 |
