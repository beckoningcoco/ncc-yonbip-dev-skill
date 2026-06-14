---
tags: [BIP, 元数据, 数据字典, tlm.financingapply.FinancingApplyParity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 比价信息子表 (`tlm.financingapply.FinancingApplyParity`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingapply_parity` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价信息子表 |
| 物理表 | `tlm_financingapply_parity` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `financing_org_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `base_rate_type` | `tlm_interestrateRef` |
| `parity_define_character` | `` |
| `supplier` | `yssupplier.aa_vendor` |
| `mainid` | `` |
| `tenant_id` | `` |
| `customer` | `productcenter.aa_merchantref` |

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

> 共 38 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 融资机构类型 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `repayment_type` | `repayment_type` | `repaymentType` | 还款方式 |
| `repayment_cycle` | `repayment_cycle` | `repaymentCycle` | 还款周期 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融资登记主表id |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 融资机构ID |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率类型id |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `customer` | `customer` | `customer` | 客户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `record_create_index` | `record_create_index` | `recordCreateIndex` | 明细创建顺序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `base_rate` | `base_rate` | `baseRate` | 基准利率（%） |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `protocol_rate` | `protocol_rate` | `protocolRate` | 预计利率（%） |

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
| `parity_define_character` | `parity_define_character` | `financingApplyParityCharacterDef` | 比价信息子表特征 |
