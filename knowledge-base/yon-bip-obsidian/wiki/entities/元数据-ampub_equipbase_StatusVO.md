---
tags: [BIP, 元数据, 数据字典, ampub.equipbase.StatusVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产使用状态 (`ampub.equipbase.StatusVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_status` | domain：`ucf-amc-ambd` | 应用：`AMBD` | 业务对象ID：`dea236d9-ebef-422a-9158-e3ffdd481396`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产使用状态 |
| 物理表 | `pam_status` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AMBD` |
| 直连字段 | 28 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `ampub.equipbase.StatusVODefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `` |
| `tenantid` | `` |
| `` | `` |

## 继承接口 (6个, 13字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **ERP来源信息** (`baseapp.itf.IErpInfo`)
  - `erpcode` → `erpcode`
  - `erpid` → `erpid`
  - `gatewayid` → `gatewayid`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status_code` | `status_code` | `status_code` | 编码 |
| `cbg_color` | `cbg_color` | `cbg_color` | 背景颜色 |
| `cfg_color` | `cfg_color` | `cfg_color` | 字体颜色 |
| `memo` | `memo` | `memo` | 备注 |
| `pk_org` | `pk_org` | `pk_org` | 组织 |
| `id` | `id` | `id` | 主键 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `pk_group` | `pk_group` | `pk_group` | 集团 |
| `gatewayid` | `gatewayid` | `gatewayid` | 网关主键 |
| `erpcode` | `erpcode` | `erpcode` | erp系统编码 |
| `status_name_resid` | `status_name_resid` | `status_name_resid` | 名称多语资源号 |
| `erpid` | `erpid` | `erpid` | erp系统主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pre_flag` | `pre_flag` | `pre_flag` | 预置标记 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status_type` | `status_type` | `status_type` | 状态分类 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status_name` | `status_name` | `status_name` | 名称 |

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
| `user_defines` | `user_defines` | `userDefines` | 资产使用状态自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 资产使用状态自定义项 |
