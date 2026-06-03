---
tags: [BIP, 元数据, 数据字典, znbzbx.tallydata.TallyTransRecordVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账单转交记录表 (`znbzbx.tallydata.TallyTransRecordVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_talltydata_transrecord` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账单转交记录表 |
| 物理表 | `znbz_talltydata_transrecord` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `vreceiverid` | `` |
| `ytenant_id` | `` |
| `voperatorid` | `` |
| `vtransferid` | `` |
| `pk_tallydata` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_tallydata` | `pk_tallydata` | `pk_tallydata` | 主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `voperatorid` | `voperatorid` | `voperatorid` | 转交时账单持有人 |
| `vreceiverid` | `vreceiverid` | `vreceiverid` | 账单接收人 |
| `vtransferid` | `vtransferid` | `vtransferid` | 账单转出人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iadmintrans` | `iadmintrans` | `iadmintrans` | 是否在企业账单转交 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtransfertime` | `dtransfertime` | `dtransfertime` | 转交时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
