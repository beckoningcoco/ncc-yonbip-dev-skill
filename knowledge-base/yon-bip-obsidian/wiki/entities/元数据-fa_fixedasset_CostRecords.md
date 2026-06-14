---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.CostRecords]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 费用记录 (`fa.fixedasset.CostRecords`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_costrecords` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 费用记录 |
| 物理表 | `at_costrecords` |
| domain/服务域 | `yonyoufi` |
| schema | `figl` |
| 所属应用 | `FA` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `fixedassetsinfo` | `` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `fixedassetsinfo` | `fixedassetsinfo` | `fixedassetsinfo` | 卡片主表关联标识 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `occurdate` | `occurdate` | `occurdate` | 发生日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `money` | `money` | `money` | 金额 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balanceproject` | `balanceproject` | `balanceproject` | 收支项目 |
| `digest` | `digest` | `digest` | 摘要 |
| `remark` | `remark` | `remark` | 备注 |
