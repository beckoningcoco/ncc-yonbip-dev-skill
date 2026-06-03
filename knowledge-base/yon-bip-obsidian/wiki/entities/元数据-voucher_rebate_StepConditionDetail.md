---
tags: [BIP, 元数据, 数据字典, voucher.rebate.StepConditionDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 阶梯设置明细 (`voucher.rebate.StepConditionDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_rebatesharesetting_stepconditiondetail` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 阶梯设置明细 |
| 物理表 | `udh_rebatesharesetting_stepconditiondetail` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `unitType` | `` |
| `ytenant_id` | `` |
| `iBizId` | `` |
| `stepConditionId` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iBizId` | `iBizId` | `bizId` | 供应商ID |
| `stepConditionId` | `stepConditionId` | `stepConditionId` | 阶梯设置表ID |
| `unitType` | `unitType` | `unitType` | 计量单位ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lowerQty` | `lowerQty` | `lowerQty` | 数量下限 |
| `maxMoney` | `maxMoney` | `maxMoney` | 单位最大使用金额 |
| `maxRatio` | `maxRatio` | `maxRatio` | 最大使用比例 |
| `upperQty` | `upperQty` | `upperQty` | 数量上限 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
