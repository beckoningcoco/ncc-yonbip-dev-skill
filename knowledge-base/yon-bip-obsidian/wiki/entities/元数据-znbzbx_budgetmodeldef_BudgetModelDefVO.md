---
tags: [BIP, 元数据, 数据字典, znbzbx.budgetmodeldef.BudgetModelDefVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算模型定义 (`znbzbx.budgetmodeldef.BudgetModelDefVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_budgetmodeldef` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`5ad35c31-ea60-4aae-af2a-9b42e6226ff1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算模型定义 |
| 物理表 | `znbz_budgetmodeldef` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 41 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `BudgetModelDefBVO` | `znbzbx.budgetmodeldef.BudgetModelDefBVO` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 41 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vcubecode` | `vcubecode` | `vcubecode` | 模型编码 |
| `vsyscode` | `vsyscode` | `vsyscode` | 所属预算系统编码 |
| `vsysname` | `vsysname` | `vsysname` | 所属预算系统 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `budget_cycle` | `budget_cycle` | `budgetCycle` | 预算周期 |
| `dimension` | `dimension` | `dimension` | 编制维度 |
| `system_version` | `system_version` | `systemVersion` | 系统版本 |
| `vcubename2` | `vcubename2` | `vcubename2` | 模型名称（英语） |
| `vcubename3` | `vcubename3` | `vcubename3` | 模型名称（繁体） |
| `vcubename4` | `vcubename4` | `vcubename4` | 模型名称（印尼语） |
| `vcubename5` | `vcubename5` | `vcubename5` | 模型名称（日语） |
| `vcubename6` | `vcubename6` | `vcubename6` | 模型名称（韩语） |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元ID |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ieffectstatus` | `ieffectstatus` | `ieffectstatus` | 生效状态 |
| `system_preset` | `system_preset` | `systemPreset` | 是否系统预制 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vcubename` | `vcubename` | `vcubename` | 模型名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `BudgetModelDefBVO` | 预算模型定义子表 |
