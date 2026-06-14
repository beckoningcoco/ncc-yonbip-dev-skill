---
tags: [BIP, 元数据, 数据字典, lgm.guaranteeregister.GuaranteeRegisterContract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开函登记关联担保 (`lgm.guaranteeregister.GuaranteeRegisterContract`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`lgm_guaranteeregister_contract` | domain：`yonbip-fi-ctmlgm` | 应用：`LGM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开函登记关联担保 |
| 物理表 | `lgm_guaranteeregister_contract` |
| domain/服务域 | `yonbip-fi-ctmlgm` |
| schema | `yonbip_fi_ctmlc` |
| 所属应用 | `LGM` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `contract` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isOwnAdd` | `isOwnAdd` | `isOwnAdd` | 是否手动添加 |
| `srcOccupyCode` | `srcOccupyCode` | `srcOccupyCode` | 来源占用单code |
| `srcOccupyType` | `srcOccupyType` | `srcOccupyType` | 来源占用单类型 |
| `backItem1` | `backItem1` | `backItem1` | backItem1 |
| `backItem2` | `backItem2` | `backItem2` | backItem2 |
| `backItem3` | `backItem3` | `backItem3` | backItem3 |
| `backItem4` | `backItem4` | `backItem4` | backItem4 |
| `backItem5` | `backItem5` | `backItem5` | backItem5 |
| `` | `auditor` | `auditor` | 审批人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 开函登记id |
| `contract` | `contract` | `contract` | 担保合同id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `srcOccupyId` | `srcOccupyId` | `srcOccupyId` | 来源占用单Id |
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `current_guarantee_amount` | `current_guarantee_amount` | `currentGuaranteeAmount` | 本次占用额度 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
