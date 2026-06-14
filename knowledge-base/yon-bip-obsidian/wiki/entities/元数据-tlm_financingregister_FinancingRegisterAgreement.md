---
tags: [BIP, 元数据, 数据字典, tlm.financingregister.FinancingRegisterAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 金融合同关联授信 (`tlm.financingregister.FinancingRegisterAgreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingregister_agreement` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 金融合同关联授信 |
| 物理表 | `tlm_financingregister_agreement` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 42 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `agreement_currency` | `` |
| `agreement` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `agreement_define_character` | `` |
| `mainid` | `` |
| `protocol_currency` | `bd_currencytenantreflist` |
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

> 共 42 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `is_new` | `is_new` | `isNew` | 是否保持关联 |
| `is_add` | `is_add` | `isAdd` | 是否新增 |
| `warning_msg` | `warning_msg` | `warningMsg` | 授信占用方式为控制时预警提示信息 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `occupy_id` | `occupy_id` | `occupyId` | 登记单id |
| `release_id` | `release_id` | `releaseId` | 释放单id |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreement_currency` | `agreement_currency` | `agreementCurrency` | 授信币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 业务币种id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `mainid` | `mainid` | `mainid` | 融资登记主表id |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型ID |
| `agreement` | `agreement` | `agreement` | 授信id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 核算汇率折算方式 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreement_mainid` | `agreement_mainid` | `agreement_mainid` | 授信主表id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `occupancy_ratio` | `occupancy_ratio` | `occupancyRatio` | 授信占用比例 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 核算汇率 |
| `current_amount` | `current_amount` | `currentAmount` | 本次占用额度 |
| `total_amount` | `total_amount` | `totalAmount` | 总占用额度 |
| `current_amount_changed` | `current_amount_changed` | `currentAmountChanged` | 变更后占用额度(业务币种) |
| `remain_amount` | `remain_amount` | `remainAmount` | 剩余占用额度 |
| `current_sx_amount` | `current_sx_amount` | `currentSxAmount` | 本次占用额度(授信币种) |
| `current_sx_amount_changed` | `current_sx_amount_changed` | `currentSxAmountChanged` | 变更后占用额度(授信币种) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreement_define_character` | `agreement_define_character` | `fRAgreementCharacterDef` | 授信自定义项 |
