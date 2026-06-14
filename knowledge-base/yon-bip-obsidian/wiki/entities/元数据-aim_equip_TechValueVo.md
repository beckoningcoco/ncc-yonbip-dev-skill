---
tags: [BIP, 元数据, 数据字典, aim.equip.TechValueVo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 技术参数值表 (`aim.equip.TechValueVo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_techvalues` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 技术参数值表 |
| 物理表 | `pam_techvalues` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_equip` | `` |
| `tech_id` | `` |
| `ytenant_id` | `` |
| `tenantid` | `` |

## 继承接口 (4个, 6字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **ERP来源信息** (`baseapp.itf.IErpInfo`)
  - `erpcode` → `erpcode`
  - `erpid` → `erpid`
  - `gatewayid` → `gatewayid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `erpcode` | `erpcode` | `erpcode` | erp系统编码 |
| `erpid` | `erpid` | `erpid` | erp系统主键 |
| `gatewayid` | `gatewayid` | `gatewayid` | 网关主键 |
| `id` | `id` | `id` | ID |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `tech_classid` | `tech_classid` | `tech_classid` | 技术参数类型 |
| `tech_showname` | `tech_showname` | `tech_showname` | 显示名称 |
| `tech_showvalue` | `tech_showvalue` | `tech_showvalue` | 显示值 |
| `tech_value` | `tech_value` | `tech_value` | 技术参数值 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `tech_id` | `tech_id` | `tech_id` | 资产类别技术参数 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tech_index` | `tech_index` | `tech_index` | 技术参数序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
