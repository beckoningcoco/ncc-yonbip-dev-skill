---
tags: [BIP, 元数据, 数据字典, cam.creditapply.CreditApplyContract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信申请关联担保 (`cam.creditapply.CreditApplyContract`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_creditapply_contract` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信申请关联担保 |
| 物理表 | `cam_creditapply_contract` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `contract` | `yonbip-fi-ctmgrm.grm_guarantee_contractref` |
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

> 共 29 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isOwnAdd` | `isOwnAdd` | `isOwnAdd` | 是否自己添加 |
| `contractAccEntity` | `contractAccEntity` | `contractAccEntity` | 担保会计主体 |
| `backItem1` | `backItem1` | `backItem1` | backItem1 |
| `backItem2` | `backItem2` | `backItem2` | backItem2 |
| `backItem3` | `backItem3` | `backItem3` | backItem3 |
| `backItem4` | `backItem4` | `backItem4` | backItem4 |
| `backItem5` | `backItem5` | `backItem5` | backItem5 |
| `backItem6` | `backItem6` | `backItem6` | backItem6 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `srcOccupyCode` | `srcOccupyCode` | `srcOccupyCode` | 来源占用单code |
| `srcOccupyType` | `srcOccupyType` | `srcOccupyType` | 来源占用单类型 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信申请主表id |
| `contract` | `contract` | `contract` | 担保合同id |
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

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `srcOccupyId` | `srcOccupyId` | `srcOccupyId` | 来源占用单Id |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currentGuaranteeAmount` | `currentGuaranteeAmount` | `currentGuaranteeAmount` | 本次担保额度 |
| `backItem7` | `backItem7` | `backItem7` | backItem7 |
| `backItem8` | `backItem8` | `backItem8` | backItem8 |
| `contract_balance` | `contract_balance` | `contractBalance` | 担保合同余额 |
| `originalGuaranteeAmount` | `originalGuaranteeAmount` | `originalGuaranteeAmount` | 原担保额度 |
| `un_release_amt` | `un_release_amt` | `unReleaseAmt` | 未释放担保额度 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 授信申请担保明细特征 |
