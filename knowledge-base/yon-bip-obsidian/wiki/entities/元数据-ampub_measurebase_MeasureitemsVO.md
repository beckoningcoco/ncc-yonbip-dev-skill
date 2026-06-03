---
tags: [BIP, 元数据, 数据字典, ampub.measurebase.MeasureitemsVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 测量项目 (`ampub.measurebase.MeasureitemsVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_meas_items` | domain：`ucf-amc-aim` | 应用：`AMPUB` | 业务对象ID：`5340460b-e199-4b1b-9d79-a8210df3b1fd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 测量项目 |
| 物理表 | `pam_meas_items` |
| 数据库 schema | `ucf-amc-aim` |
| 所属应用 | `AMPUB` |
| 直连字段 | 25 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `ampub.measurebase.MeasureitemsVODefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `` |
| `tenantid` | `` |
| `pk_measuredoc` | `productcenter.pc_unitref_new` |
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

> 共 25 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `memo` | `memo` | `memo` | 备注 |
| `pk_org` | `pk_org` | `pk_org` | 资产组织 |
| `id` | `id` | `id` | 主键 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `erpcode` | `erpcode` | `erpcode` | erp系统编码 |
| `erpid` | `erpid` | `erpid` | erp系统主键 |
| `gatewayid` | `gatewayid` | `gatewayid` | 网关主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_measuredoc` | `pk_measuredoc` | `pk_measuredoc` | 测量单位 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pre_flag` | `pre_flag` | `pre_flag` | 是否预置 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `result_type` | `result_type` | `result_type` | 测量结果类型 |
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

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
| `user_defines` | `user_defines` | `userDefines` | 测量项目自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 测量项目自定义项 |
