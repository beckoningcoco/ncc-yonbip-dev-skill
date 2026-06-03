---
tags: [BIP, 元数据, 数据字典, cam.creditapply.CreditApplyAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信明细 (`cam.creditapply.CreditApplyAgreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_creditapply_agreement` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信明细 |
| 物理表 | `cam_creditapply_agreement` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 36 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `finProducts` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `useEnterprise` | `ucf-org-center.bd_financeorgtreeref_na` |
| `cam_define_character_def` | `` |
| `mainid` | `` |
| `creditVarieties` | `cam_creditvariety_ref` |
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

> 共 36 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isOwnAdd` | `isOwnAdd` | `isOwnAdd` | 是否自己添加 |
| `backItem1` | `backItem1` | `backItem1` | backItem1 |
| `backItem2` | `backItem2` | `backItem2` | backItem2 |
| `backItem3` | `backItem3` | `backItem3` | backItem3 |
| `backItem4` | `backItem4` | `backItem4` | backItem4 |
| `backItem5` | `backItem5` | `backItem5` | backItem5 |
| `backItem6` | `backItem6` | `backItem6` | backItem6 |
| `canDelete` | `canDelete` | `canDelete` | 是否可以删除 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `backup` | `backup` | `backup` | 备注 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信申请主表id |
| `useEnterprise` | `useEnterprise` | `useEnterprise` | 使用企业id |
| `creditVarieties` | `creditVarieties` | `creditVarieties` | 授信类别id |
| `finProducts` | `finProducts` | `finProducts` | 金融品种id |
| `` | `auditorId` | `auditorId` | 审批人 |
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

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `freeze` | `freeze` | `freeze` | 是否冻结 |
| `exclusive` | `exclusive` | `exclusive` | 是否专享 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditVarietiesLimit` | `creditVarietiesLimit` | `creditVarietiesLimit` | 授信类别限额 |
| `creditOccupyAmt` | `creditOccupyAmt` | `creditOccupyAmt` | 已占用额度（授信类别） |
| `creditRemainingAvailableAmt` | `creditRemainingAvailableAmt` | `creditRemainingAvailableAmt` | 剩余可用额度（授信类别） |
| `finProductsLimit` | `finProductsLimit` | `finProductsLimit` | 金融产品限额 |
| `finOccupyAmt` | `finOccupyAmt` | `finOccupyAmt` | 已占用额度（金融产品） |
| `finRemainingAvailableAmt` | `finRemainingAvailableAmt` | `finRemainingAvailableAmt` | 剩余可用额度（金融产品） |
| `finRemainingActualAvailableAmt` | `finRemainingActualAvailableAmt` | `finRemainingActualAvailableAmt` | 金融产品实际剩余可用额度 |
| `backItem7` | `backItem7` | `backItem7` | backItem7 |
| `backItem8` | `backItem8` | `backItem8` | backItem8 |
| `creditVarietyActualAvailableAmt` | `creditVarietyActualAvailableAmt` | `creditVarietyActualAvailableAmt` | 授信类别实际剩余可用额度 |
| `finUnReleaseAmt` | `finUnReleaseAmt` | `finUnReleaseAmt` | 金融产品未释放额度(授信币种) |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 授信申请明细特征 |
