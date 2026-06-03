---
tags: [BIP, 元数据, 数据字典, cam.syndicated.CreditDetails]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信明细 (`cam.syndicated.CreditDetails`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_syndicated_credit_details` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信明细 |
| 物理表 | `cam_syndicated_credit_details` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `finProducts` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `currency` | `` |
| `useEnterprise` | `` |
| `cam_define_character_def` | `` |
| `mainid` | `` |
| `creditVarieties` | `` |
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

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `backup` | `backup` | `backup` | 备注 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `creditSubagreement` | `creditSubagreement` | `creditSubagreement` | 授信子协议号 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信信息主表id |
| `finProducts` | `finProducts` | `finProducts` | 金融产品 |
| `useEnterprise` | `useEnterprise` | `useEnterprise` | 使用企业 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `currency` | `currency` | `currency` | 授信币种 |
| `creditVarieties` | `creditVarieties` | `creditVarieties` | 授信类别 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exclusive` | `exclusive` | `exclusive` | 是否专享 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finProductsLimit` | `finProductsLimit` | `finProductsLimit` | 金融产品限额 |
| `creditVarietiesLimit` | `creditVarietiesLimit` | `creditVarietiesLimit` | 授信类别限额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 自由项自定义项 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
