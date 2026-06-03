---
tags: [BIP, 元数据, 数据字典, drft.billtype.BillType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据类型 (`drft.billtype.BillType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_billtype` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`0d24caf6-2aaa-4fe1-ae04-ff94dce9ff27`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据类型 |
| 物理表 | `drft_billtype` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

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
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtypeno` | `billtypeno` | `billtypeno` | 票据类型编码 |
| `paymentdate` | `paymentdate` | `paymentdate` | 付款期 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
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
| `isEnabled` | `isEnabled` | `isEnabled` | 是否启用 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billsourcetype` | `billsourcetype` | `billsourcetype` | 票据来源 |
| `supticketcatecory` | `supticketcatecory` | `supticketcatecory` | 供票平台类别 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 隐藏票据类型名称 |
| `billtypename` | `billtypename` | `billtypename` | 票据类型名称 |
| `description` | `description` | `description` | 备注 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billbtype` | `billbtype` | `billbtype` | 票据大类 |
| `payperiodunit` | `payperiodunit` | `payperiodunit` | 付款期单位 |
| `iselecbill` | `iselecbill` | `iselecbill` | 票据标识 |
