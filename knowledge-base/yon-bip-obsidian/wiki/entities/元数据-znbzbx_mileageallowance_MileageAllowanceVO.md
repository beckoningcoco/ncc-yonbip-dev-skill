---
tags: [BIP, 元数据, 数据字典, znbzbx.mileageallowance.MileageAllowanceVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 里程补贴主表 (`znbzbx.mileageallowance.MileageAllowanceVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_mileageallowance` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`1b1ff8da-c3d8-466f-9ebb-f1447f9e99f6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 里程补贴主表 |
| 物理表 | `znbz_mileageallowance` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 23 个 |
| 子表 | 4 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `AllowanceGroupVO` | `znbzbx.mileageallowance.AllowanceGroupVO` | composition |
| `AllowanceConfigVO` | `znbzbx.mileageallowance.AllowanceConfigVO` | composition |
| `AllowanceDimensionVO` | `znbzbx.mileageallowance.AllowanceDimensionVO` | composition |
| `AllowancePriceVO` | `znbzbx.mileageallowance.AllowancePriceVO` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `cfinaceorg` | `ucf-org-center.org_unit_tree_ref` |
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rulecode` | `rulecode` | `rulecode` | 规则代码 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元ID |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iallowancetype` | `iallowancetype` | `iallowancetype` | 里程补贴模式 |
| `configtype` | `configtype` | `configtype` | 配置模式 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rulename` | `rulename` | `rulename` | 规则名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `AllowanceConfigVO` | 里程补贴单价简易配置 |
| `` | `` | `AllowanceDimensionVO` | 匹配维度 |
| `` | `` | `AllowanceGroupVO` | 匹配组 |
| `` | `` | `AllowancePriceVO` | 里程补贴单价 |
