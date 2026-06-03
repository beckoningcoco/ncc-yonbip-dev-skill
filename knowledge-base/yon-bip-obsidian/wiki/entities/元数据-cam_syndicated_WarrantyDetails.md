---
tags: [BIP, 元数据, 数据字典, cam.syndicated.WarrantyDetails]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 担保明细 (`cam.syndicated.WarrantyDetails`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_syndicated_warranty_details` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 担保明细 |
| 物理表 | `cam_syndicated_warranty_details` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `contract` | `` |
| `contractAccEntity` | `` |
| `cam_define_character_def` | `` |
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

> 共 25 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditSubagreement` | `creditSubagreement` | `creditSubagreement` | 授信子协议号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `contractCode` | `contractCode` | `contractCode` | 合同编号 |
| `guaranteeType` | `guaranteeType` | `guaranteeType` | 担保方式 |
| `srcOccupyCode` | `srcOccupyCode` | `srcOccupyCode` | 来源占用单编码 |
| `srcOccupyType` | `srcOccupyType` | `srcOccupyType` | 来源占用单类型 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信信息主表id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `contract` | `contract` | `contract` | 担保合同id |
| `contractAccEntity` | `contractAccEntity` | `contractAccEntity` | 合同会计主体 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `endDate` | `endDate` | `endDate` | 到期日期 |
| `startDate` | `startDate` | `startDate` | 开始日期 |
| `term` | `term` | `term` | 担保期限 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `srcOccupyId` | `srcOccupyId` | `srcOccupyId` | 来源占用单 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 担保合同金额 |
| `balance` | `balance` | `balance` | 担保合同余额 |
| `currentGuaranteeAmount` | `currentGuaranteeAmount` | `currentGuaranteeAmount` | 本次担保额度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 特征组 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
