---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标的物 (`apct.contract.ApctMaterial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_material` | domain：`apct` | 应用：`APCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标的物 |
| 物理表 | `apct_apct_material` |
| domain/服务域 | `apct` |
| schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 74 个 |
| 子表 | 0 个 |
| 关联引用 | 20 个 |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `ct_id` | `` |
| `expenseitem_id` | `finbd.bd_expenseitemref` |
| `tax_subject` | `` |
| `activity` | `` |
| `ytenant_id` | `` |
| `cost_center_id` | `` |
| `taker_org` | `` |
| `material_type_id` | `` |
| `` | `` |
| `wbs` | `` |
| `apctApctMaterialDcs` | `` |
| `profit_center_id` | `` |
| `unit_id` | `` |
| `material` | `` |
| `pk_projectapply` | `` |
| `tax_rate_id` | `` |
| `project_id` | `` |
| `tenant_id` | `` |
| `pay_term_id` | `` |

## 继承接口 (6个, 20字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 74 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `source` | `source` | `source` | 上游单据类型 |
| `upcode` | `upcode` | `upcode` | 上游单据号 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `ct_id` | `ct_id` | `ctId` | 合同 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `material` | `material` | `material` | 物料名称 |
| `taker_org` | `taker_org` | `takerOrg` | 收票组织 |
| `material_type_id` | `material_type_id` | `materialTypeId` | 物料类别 |
| `pay_term_id` | `pay_term_id` | `payTermId` | 收付款协议 |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `unit_id` | `unit_id` | `unit` | 计量单位 |
| `tax_subject` | `tax_subject` | `taxSubject` | 税目 |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 税率(%) |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `expenseitem_id` | `expenseitem_id` | `expenseitemId` | 费用项目id |
| `pk_projectapply` | `pk_projectapply` | `pk_projectapply` | 立项申请表体明细PK |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_direction` | `contract_direction` | `contractDirection` | 收支方向 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceautorowid` | `sourceautorowid` | `sourceautorowid` | 上游单据子表行id |
| `sourceautoid` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `sourceid` | `sourceid` | `sourceid` | 上游单据主表id |
| `id` | `id` | `id` | ID |

### 数值字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `paid_amt` | `paid_amt` | `paidAmt` | 已付金额 |
| `row_no` | `row_no` | `rowNo` | 基本信息行号 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `original_price` | `original_price` | `originalPrice` | 原币含税单价 |
| `no_tax_original_price` | `no_tax_original_price` | `noTaxOriginalPrice` | 原币无税单价 |
| `original_tax` | `original_tax` | `originalTax` | 原币税额 |
| `no_tax_original_money` | `no_tax_original_money` | `noTaxOriginalMoney` | 原币无税金额 |
| `local_price` | `local_price` | `localPrice` | 本币含税单价 |
| `no_tax_local_price` | `no_tax_local_price` | `noTaxLocalPrice` | 本币无税单价 |
| `local_money` | `local_money` | `localMoney` | 本币价税合计 |
| `local_tax` | `local_tax` | `localTax` | 本币税额 |
| `no_tax_local_money` | `no_tax_local_money` | `noTaxLocalMoney` | 本币无税金额 |
| `local_invoice_total` | `local_invoice_total` | `localInvoiceTotal` | 累计本币发票金额 |
| `original_invoice_total` | `original_invoice_total` | `originalInvoiceTotal` | 累计原币发票金额 |
| `local_used_amt` | `local_used_amt` | `localUsedAmt` | 本币已用金额 |
| `local_paid_amt` | `local_paid_amt` | `localPaidAmt` | 本币已付金额 |
| `unappr_refund_subject_amt` | `unappr_refund_subject_amt` | `unapprRefundSubjectAmt` | 未审批原币退款金额 |
| `appr_refund_subject_amt` | `appr_refund_subject_amt` | `apprRefundSubjectAmt` | 已审批原币退款金额 |
| `unappr_refund_subject_local_amt` | `unappr_refund_subject_local_amt` | `unapprRefundSubjectLocalAmt` | 未审批本币退款金额 |
| `appr_refund_subject_local_amt` | `appr_refund_subject_local_amt` | `apprRefundSubjectLocalAmt` | 已审批本币退款金额 |
| `paid_amt_bak` | `paid_amt_bak` | `paidAmtBak` | 已付金额备份 |
| `no_tax_original_money_bak` | `no_tax_original_money_bak` | `noTaxOriginalMoneyBak` | 原币无税金额备份 |
| `no_tax_local_money_bak` | `no_tax_local_money_bak` | `noTaxLocalMoneyBak` | 本币无税金额备份 |
| `local_invoice_total_bak` | `local_invoice_total_bak` | `localInvoiceTotalBak` | 累计本币发票金额备份 |
| `original_invoice_total_bak` | `original_invoice_total_bak` | `originalInvoiceTotalBak` | 累计原币发票金额备份 |
| `local_used_amt_bak` | `local_used_amt_bak` | `localUsedAmtBak` | 本币已用金额备份 |
| `local_paid_amt_bak` | `local_paid_amt_bak` | `localPaidAmtBak` | 本币已付金额备份 |
| `unappr_refund_subject_amt_bak` | `unappr_refund_subject_amt_bak` | `unapprRefundSubjectAmtBak` | 未审批原币退款金额备份 |
| `appr_refund_subject_amt_bak` | `appr_refund_subject_amt_bak` | `apprRefundSubjectAmtBak` | 已审批原币退款金额备份 |
| `unappr_refund_subject_local_amt_bak` | `unappr_refund_subject_local_amt_bak` | `unapprRefundSubjectLocalAmtBak` | 未审批本币退款金额备份 |
| `appr_refund_subject_local_amt_bak` | `appr_refund_subject_local_amt_bak` | `apprRefundSubjectLocalAmtBak` | 已审批本币退款金额备份 |
| `used_amt_bak` | `used_amt_bak` | `usedAmtBak` | 已用金额备份 |
| `relase_amt_bak` | `relase_amt_bak` | `releaseAmtBak` | 释放金额备份 |
| `original_total_amt` | `original_total_amt` | `originalTotalAmt` | 原币价税合计 |
| `used_amt` | `used_amt` | `usedAmt` | 已用金额 |
| `relase_amt` | `relase_amt` | `releaseAmt` | 释放金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apctApctMaterialDcs` | `apctApctMaterialDcs` | `apctApctMaterialDcs` | 标的物自定义项 |
