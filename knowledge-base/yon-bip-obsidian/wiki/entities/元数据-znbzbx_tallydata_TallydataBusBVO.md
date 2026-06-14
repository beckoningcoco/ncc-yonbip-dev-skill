---
tags: [BIP, 元数据, 数据字典, znbzbx.tallydata.TallydataBusBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 个人账单业务子表 (`znbzbx.tallydata.TallydataBusBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_tallydata_bus_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 个人账单业务子表 |
| 物理表 | `znbz_tallydata_bus_b` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `pk_tallydata` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `card_no` | `card_no` | `card_no` | 有效身份证号 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `ocr_or_tax_parse` | `ocr_or_tax_parse` | `ocr_or_tax_parse` | ocr/税票识别 |
| `traveler` | `traveler` | `traveler` | 出行人 |
| `vclass` | `vclass` | `vclass` | 等级 |
| `vendaddr` | `vendaddr` | `vendaddr` | 到达地 |
| `vendaddr_transport` | `vendaddr_transport` | `vendaddr_transport` | 到达地 |
| `vgoods_name_transport` | `vgoods_name_transport` | `vgoods_name_transport` | 运输货物名称 |
| `vstartaddr` | `vstartaddr` | `vstartaddr` | 出发地 |
| `vstartaddr_transport` | `vstartaddr_transport` | `vstartaddr_transport` | 起运地 |
| `vtransport_no` | `vtransport_no` | `vtransport_no` | 运输工具车牌号 |
| `vtransport_type` | `vtransport_type` | `vtransport_type` | 运输工具种类 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_tallydata` | `pk_tallydata` | `pk_tallydata` | 主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `travel_date` | `travel_date` | `travel_date` | 出行日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_vtraffic_type` | `pk_vtraffic_type` | `pk_vtraffic_type` | 交通工具类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nlineno` | `nlineno` | `nlineno` | 行号 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
