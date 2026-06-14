---
tags: [BIP, 元数据, 数据字典, voucher.rebate.StepCondition]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 阶梯设置 (`voucher.rebate.StepCondition`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_rebatesharesetting_stepcondition` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 阶梯设置 |
| 物理表 | `udh_rebatesharesetting_stepcondition` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 8 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `stepConditionDetails` | `voucher.rebate.StepConditionDetail` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `shareSettingDetailId` | `` |
| `ytenant_id` | `` |
| `iBizId` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `basis` | `basis` | `basis` | 阶梯依据 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iBizId` | `iBizId` | `bizId` | 供应商ID |
| `shareSettingDetailId` | `shareSettingDetailId` | `shareSettingDetailId` | 账户使用明细ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `stepConditionDetails` | 阶梯设置明细 |
