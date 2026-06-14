---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.TransferSettleRowVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 内部结算综合信息 (`FIEIA.FIEIA.TransferSettleRowVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`527116e1-3c67-4d7f-a453-5cb1da314750`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 内部结算综合信息 |
| 物理表 | `` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 82 个 |
| 子表 | 0 个 |
| 关联引用 | 18 个 |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `write_off_src_data_h_id` | `` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `busi_event` | `yonbip-fi-eeac.RefTable_02c132dc2` |
| `collector_id` | `finbd.bd_costcollectoritem01listref` |
| `src_bill_trade_type_id` | `transtype.bd_billtyperef` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `header_id` | `` |
| `company_id` | `finbd.bd_allaccbodyref_inner` |
| `src_bill_type_id` | `transtype.bd_billtypetreeref` |
| `write_off_src_data_id` | `` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 82 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `periodCode` |  记账会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `batch_no` | `batch_no` | `batchNo` | 批次号 |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `opp_profit_center_id` | `opp_profit_center_id` | `oppProfitCenter` | 对方利润中心 |
| `settle_supplier` | `settle_supplier` | `settleSupplier` | 结算供应商 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_busi_id` | `src_busi_id` | `srcBusiId` | 来源业务id |
| `src_busi_row_id` | `src_busi_row_id` | `srcBusiRowId` | 来源业务行id |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行id |
| `busi_bill_type` | `busi_bill_type` | `busiBillType` | 业务类型 |
| `top_src_bill_id` | `top_src_bill_id` | `topSrcBillId` | 源头单据ID |
| `top_src_bill_code` | `top_src_bill_code` | `topSrcBillCode` | 源头单据号 |
| `top_src_b_ill_row_id` | `top_src_b_ill_row_id` | `topSrcBillRowId` | 源头单据行ID |
| `remarks_b` | `remarks_b` | `remarksB` | 备注 |
| `pre_settle_in_id` | `pre_settle_in_id` | `preSettleInId` | 待结算单调入主表ID |
| `pre_settle_in_row_id` | `pre_settle_in_row_id` | `preSettleInRowId` | 待结算单调入子表ID |
| `id` | `id` | `id` | id |
| `busi_sort_no` | `busi_sort_no` | `busiSortNo` | 业务记账序号 |
| `src_data_id` | `src_data_id` | `srcDataId` | 来源数据行ID |
| `src_data_type` | `src_data_type` | `srcDataType` | 来源数据类型 |
| `write_off_src_data_h_code` | `write_off_src_data_h_code` | `writeOffSrcDataHCode` | 冲销来源会计事务号 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `accentity_id` | `accentity_id` | `accentity` |  会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `company_id` | `company_id` | `company` | 公司 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `rate_type` | `rate_type` | `rateType` | 汇率类型 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源单据交易类型 |
| `busi_event` | `busi_event` | `busiEvent` | 业务事项 |
| `header_id` | `header_id` | `header` | 内部结算 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `collector_id` | `collector_id` | `collectorId` | 成本收集器 |
| `write_off_src_data_h_id` | `write_off_src_data_h_id` | `writeOffSrcDataHId` | 冲销来源会计事务id |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源会计事务行ID |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_gift` | `bln_gift` | `blnGift` | 是否赠品 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |
| `material` | `material` | `material` | 物料 |
| `busi_cost_center_id` | `busi_cost_center_id` | `busiCostCenter` | 成本中心 |
| `src_bill_version` | `src_bill_version` | `srcBillVersion` | 来源单据版本号 |
| `main_unit` | `main_unit` | `mainUnit` | 主单位 |
| `unit` | `unit` | `unit` | 单位 |

### 数值字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settle_rate` | `settle_rate` | `settleRate` | 结算汇率 |
| `src_bill_row_no` | `src_bill_row_no` | `srcBillRowNo` | 来源单据行号 |
| `busi_bill_row_id` | `busi_bill_row_id` | `busiBillRowNo` | 业务单据行号 |
| `top_src_bill_row_no` | `top_src_bill_row_no` | `topSrcBillRowNo` | 源头单据行号 |
| `settle_num` | `settle_num` | `settleNum` | 结算数量 |
| `ori_cost_price` | `ori_cost_price` | `oriCostPrice` | 原币成本单价 |
| `ori_cost_amount` | `ori_cost_amount` | `oriCostAmount` | 原币成本金额 |
| `ori_notax_price` | `ori_notax_price` | `oriNotaxPrice` | 原币无税单价 |
| `ori_notax_amount` | `ori_notax_amount` | `oriNotaxAmount` | 原币无税金额 |
| `ori_no_deduction_tax` | `ori_no_deduction_tax` | `oriNoDeductionTax` | 原币不可抵扣税额 |
| `ori_tax_price` | `ori_tax_price` | `oriTaxPrice` | 原币含税单价 |
| `ori_tax_amount` | `ori_tax_amount` | `oriTaxAmount` | 原币含税金额 |
| `esti_price` | `esti_price` | `estiPrice` | 暂估单价 |
| `esti_amount` | `esti_amount` | `estiAmount` | 暂估金额 |
| `settle_amount` | `settle_amount` | `settleAmount` | 结算金额 |
| `settle_price` | `settle_price` | `settlePrice` | 结算单价 |
| `notax_price` | `notax_price` | `notaxPrice` | 本币无税单价 |
| `notax_amount` | `notax_amount` | `notaxAmount` | 本币无税金额 |
| `tax` | `tax` | `tax` | 本币税额 |
| `no_deduction_tax` | `no_deduction_tax` | `noDeductionTax` | 本币不可抵扣税额 |
| `tax_price` | `tax_price` | `taxPrice` | 本币含税单价 |
| `tax_amount` | `tax_amount` | `taxAmount` | 本币含税金额 |
| `ori_tax` | `ori_tax` | `oriTax` | 原币税额 |
| `esti_ori_amount` | `esti_ori_amount` | `estiOriAmount` | 暂估原币金额 |
| `esti_ori_price` | `esti_ori_price` | `estiOriPrice` | 暂估原币单价 |
