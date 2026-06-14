---
tags: [BIP, 元数据, 数据字典, znbzbx.invoicecheck.InvoiceCheckBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发票查验结果子表 (`znbzbx.invoicecheck.InvoiceCheckBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_invoicecheck_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发票查验结果子表 |
| 物理表 | `znbz_invoicecheck_b` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_invoicecheck` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `crowno` | `crowno` | `crowno` | 行号 |
| `vgoodsname` | `vgoodsname` | `vgoodsname` | 项目名称 |
| `vgoodsspec` | `vgoodsspec` | `vgoodsspec` | 规格型号 |
| `vgoodsunit` | `vgoodsunit` | `vgoodsunit` | 单位 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_invoicecheck` | `pk_invoicecheck` | `pk_invoicecheck` | 主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `virtureRow` | `virtureRow` | `virtureRow` | 虚拟行号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nmny` | `nmny` | `nmny` | 无税金额 |
| `nnum` | `nnum` | `nnum` | 数量 |
| `nprice` | `nprice` | `nprice` | 单价 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 税额 |
| `ntaxrate` | `ntaxrate` | `ntaxrate` | 税率 |
| `ntotalmny` | `ntotalmny` | `ntotalmny` | 价税合计 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
