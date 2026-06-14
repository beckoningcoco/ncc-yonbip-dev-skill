---
tags: [BIP, 元数据, 数据字典, drft.drftnoteinformation.DrftNoteInformationContract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 担保信息 (`drft.drftnoteinformation.DrftNoteInformationContract`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_noteinformation_contract` | domain：`drft` | 应用：`DRFT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 担保信息 |
| 物理表 | `drft_noteinformation_contract` |
| domain/服务域 | `drft` |
| schema | `ctmdrft` |
| 所属应用 | `DRFT` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `contractid` | `bd_currencytenantreflist` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 卡片主表关联标识 |
| `contractid` | `contractid` | `contractId` | 担保合同id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 担保子表id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 占用担保金额 |
| `olcamount` | `olcamount` | `olcamount` | 组织本币占用担保金额 |
| `contractrate` | `contractrate` | `contractrate` | 担保比例% |
| `residuerelease` | `residuerelease` | `residuerelease` | 担保剩余可释放额度 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
