---
tags: [BIP, 元数据, 数据字典, tlm.financingregister.FinancingRegisterUnderwriter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 金融合同监管账户子表 (`tlm.financingregister.FinancingRegisterUnderwriter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingregister_underwriter` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 金融合同监管账户子表 |
| 物理表 | `tlm_financingregister_underwriter` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 57 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `settlement_method` | `aa_settlemethodref` |
| `type` | `` |
| `protocol_currency` | `bd_currencytenantreflist` |
| `org_id` | `` |
| `collection_acc` | `bd_enterprisebankacctref` |
| `org_type` | `` |
| `underwriter_define_character` | `` |
| `mainid` | `` |
| `settle_account` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `underwriter` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
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

> 共 57 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `role` | `role` | `role` | 承销商角色 |
| `is_underwriter` | `is_underwriter` | `isUnderwriter` | 是否扣除承销费 |
| `settlement_id` | `settlement_id` | `settlementId` | 结算单id |
| `unsettlement_id` | `unsettlement_id` | `unSettlementId` | 待结算id |
| `settlementb_Id` | `settlementb_Id` | `settlementBId` | 结算明细id |
| `settlement_no` | `settlement_no` | `settlementNo` | 结算单号 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `remark1` | `remark1` | `remark1` | 备用1 |
| `remark2` | `remark2` | `remark2` | 备用2 |
| `remark3` | `remark3` | `remark3` | 备用3 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `sell_method` | `sell_method` | `sellMethod` | 销售方式 |
| `use_agreement` | `use_agreement` | `useAgreement` | 是否占用授信 |
| `is_remit` | `is_remit` | `isRemit` | 是否打融资款 |
| `settlement_status` | `settlement_status` | `settlementStatus` | 结算状态 |
| `manager` | `manager` | `manager` | 负责人 |
| `phone` | `phone` | `phone` | 联系电话 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `underwriter` | `underwriter` | `underwriter` | 承销商ID |
| `org_id` | `org_id` | `orgId` | 监管机构 |
| `org_type` | `org_type` | `orgType` | 监管机构类型 |
| `type` | `type` | `type` | 承销商机构类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `collection_acc` | `collection_acc` | `collectionAcc` | 融资款收款账户id |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式id |
| `settle_account` | `settle_account` | `settleAccount` | 对方账户名称id |
| `mainid` | `mainid` | `mainid` | 融资登记主表id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
| `settlement_date` | `settlement_date` | `settlementDate` | 实际结算日期 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `supervise_ratio` | `supervise_ratio` | `superviseRatio` | 监管比例(%) |
| `plan_amount_capital` | `plan_amount_capital` | `planAmountCapital` | 实际融入金额(本金币种) |
| `real_amount_capital` | `real_amount_capital` | `realAmountCapital` | 实际收款金额(本金币种) |
| `percent` | `percent` | `percent` | 承销比例(%) |
| `amount_protocol` | `amount_protocol` | `amountProtocol` | 承销金额(协议币种) |
| `plan_amount_protocol` | `plan_amount_protocol` | `planAmountProtocol` | 计划融资金额(协议币种) |
| `real_amount_protocol` | `real_amount_protocol` | `realAmountProtocol` | 实际收款金额(协议币种) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `underwriter_define_character` | `underwriter_define_character` | `financingRegisterUnderwriterCharacterDef` | 监管账户自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
