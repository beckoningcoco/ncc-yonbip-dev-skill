---
tags: [BIP, 元数据, 数据字典, cam.agreement.AgreementFeePlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信费用计划 (`cam.agreement.AgreementFeePlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_agreementfee_plan` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信费用计划 |
| 物理表 | `cam_agreementfee_plan` |
| domain/服务域 | `yonbip-fi-ctmcam` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `CAM` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `fee_currency` | `bd_currencytenantreflist` |
| `mainid` | `` |
| `agreementfee_plan_character_def` | `` |
| `fee_item` | `finbd.bd_expenseitemref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fee_plan` | `fee_plan` | `feePlan` | 费用计划编号 |
| `fee_scheme` | `fee_scheme` | `feeScheme` | 费用方案编号 |
| `backItem1` | `backItem1` | `backItem1` | backItem1 |
| `backItem2` | `backItem2` | `backItem2` | backItem2 |
| `backItem3` | `backItem3` | `backItem3` | backItem3 |
| `backItem4` | `backItem4` | `backItem4` | backItem4 |
| `backItem5` | `backItem5` | `backItem5` | 备用字段5 |
| `backItem6` | `backItem6` | `backItem6` | 备用字段6 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信合同主表id |
| `fee_item` | `fee_item` | `feeItem` | 费用项目Id |
| `fee_currency` | `fee_currency` | `feeCurrency` | 费用币种id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fee_date` | `fee_date` | `feeDate` | 费用日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `backItem10` | `backItem10` | `backItem10` | 备用字段10 |
| `backItem9` | `backItem9` | `backItem9` | 备用字段9 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fee_amt` | `fee_amt` | `feeAmt` | 费用金额 |
| `executed_amt` | `executed_amt` | `executedAmt` | 已执行金额 |
| `backItem7` | `backItem7` | `backItem7` | 备用字段7 |
| `backItem8` | `backItem8` | `backItem8` | 备用字段8 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreementfee_plan_character_def` | `agreementfee_plan_character_def` | `agreementFeePlanCharacterDef` | 授信合同费用计划特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
