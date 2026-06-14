---
tags: [BIP, 元数据, 数据字典, ampub.linerefer.LineReferHeadVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 参考点类型 (`ampub.linerefer.LineReferHeadVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_line_refer` | domain：`ucf-amc-aim` | 应用：`AMPUB` | 业务对象ID：`fddf49b5-e394-4dd4-bfd2-a449b718877e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 参考点类型 |
| 物理表 | `pam_line_refer` |
| domain/服务域 | `ucf-amc-aim` |
| schema | `amc_aim` |
| 所属应用 | `AMPUB` |
| 直连字段 | 21 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `category` | `ampub.linerefer.LineReferCategoryVO` | composition |
| `defines` | `ampub.linerefer.LineReferHeadVODefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `` |
| `` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 10字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `default_color` | `default_color` | `default_color` | 默认颜色 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |
| `sysid` | `sysid` | `sysid` | 系统标识 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ref_point_type` | `ref_point_type` | `ref_point_type` | 参照点形态 |
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 参考点类型自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `category` | 参考点类型资产类别子表 |
| `` | `` | `defines` | 参考点类型主表自定义项 |
