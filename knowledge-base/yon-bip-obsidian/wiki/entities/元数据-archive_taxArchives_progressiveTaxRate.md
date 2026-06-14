---
tags: [BIP, 元数据, 数据字典, archive.taxArchives.progressiveTaxRate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 累进税率 (`archive.taxArchives.progressiveTaxRate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`progressive_tax_rate` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`eef18317-c20c-46f8-9408-416f8e938a19`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 累进税率 |
| 物理表 | `progressive_tax_rate` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `tax_rate_archive_id` | `` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_rate_archive_id` | `tax_rate_archive_id` | `taxRateArchiveId` | 税率档案ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accumulate_tax_in_begin` | `accumulate_tax_in_begin` | `accumulateTaxInBegin` | 累计应纳税所得额> |
| `accumulate_tax_in_end` | `accumulate_tax_in_end` | `accumulateTaxInEnd` | 累计应纳税所得额≤ |
| `progressive_tax_rate` | `progressive_tax_rate` | `progressiveTaxRate` | 累进税率 |
| `quick_deduction` | `quick_deduction` | `quickDeduction` | 速算扣除数 |
