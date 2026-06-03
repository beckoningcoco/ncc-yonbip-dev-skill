---
tags: [BIP, 元数据, 数据字典, eia.accountparam.AccountParamVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 存货参数 (`eia.accountparam.AccountParamVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_account_param` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`cea17e61-e57b-4d5e-b936-933d3fb06130`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 存货参数 |
| 物理表 | `ia_account_param` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 53 个 |
| 子表 | 4 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `turnOutItemList` | `eia.accountparam.turnOutItem` | composition |
| `bizDimensionList` | `eia.accountparam.bizDimension` | composition |
| `paramsAuthDataList` | `eia.accountparam.paramAuditData` | composition |
| `AccountParamVO_assignedUnitCostList` | `eia.accountparam.AccountParamVO_assignedUnitCost` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `assigned_unit_cost` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 53 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `entry_method` | `entry_method` | `entryMethod` | 分录推送方式 |
| `cal_sort_method` | `cal_sort_method` | `calSortMethod` | 成本计算时序 |
| `abn_out_adjust_schema_a` | `abn_out_adjust_schema_a` | `abnBalAutogenOutAdjustSchemaA` | 异常结存(数量为正,金额为零)处理方式 |
| `abn_out_adjust_schema_b` | `abn_out_adjust_schema_b` | `abnBalAutogenOutAdjustSchemaB` | 异常结存(数量为正,金额为负)处理方式 |
| `abn_out_adjust_schema_c` | `abn_out_adjust_schema_c` | `abnBalAutogenOutAdjustSchemaC` | 异常结存(数量为零,金额不为零)处理方式 |
| `abn_out_pricing_schema` | `abn_out_pricing_schema` | `abnBalOutAdjustPricingSchema` | 异常结存出库调整取价方案 |
| `abn_out_adjust_share_basis` | `abn_out_adjust_share_basis` | `abnBalOutAdjustShareBasis` | 异常结存计入损益分摊依据 |
| `auto_pricing_scene` | `auto_pricing_scene` | `autoPricingScene` | 自动取价场景 |
| `close_account_handle_method` | `close_account_handle_method` | `closeAccountHandleMethod` | 关账后数据处理方式 |
| `cost_domain_create_method` | `cost_domain_create_method` | `costDomainCreateMethod` | 成本域创建方式 |
| `estimate_settle_handle_method` | `estimate_settle_handle_method` | `estimateSettleHandleMethod` | 暂估结算处理方式 |
| `get_lead_cost_scen` | `get_lead_cost_scen` | `getLeadCostScen` | 取线索成本场景 |
| `in_pricing_scheme` | `in_pricing_scheme` | `inPricingScheme` | 入库单取价方案 |
| `month_calculate_mode` | `month_calculate_mode` | `monthCalculateMode` | 成本计算模式 |
| `order_account_gen_out_adjust` | `order_account_gen_out_adjust` | `orderSettleInAdjustGenOutAdjust` | 订单结算入库调整生成出库调整 |
| `out_pricing_scheme` | `out_pricing_scheme` | `outPricingScheme` | 出库单取价方案 |
| `settle_account_gen_out_adjust` | `settle_account_gen_out_adjust` | `purchSettleInAdjustGenOutAdjust` | 采购结算入库调整生成出库调整 |
| `get_ori_cost_scope` | `get_ori_cost_scope` | `returnStockFetchSrcCostBizScope` | 退库取源单成本业务范围 |
| `sg_pricing_scheme` | `sg_pricing_scheme` | `sgPricingScheme` | 发出商品结转取价方案 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_check_inv_close` | `bln_check_inv_close` | `blnCheckInvClose` | 关账校验库存关账 |
| `bln_sg_adjust_carry_cost` | `bln_sg_adjust_carry_cost` | `blnSgAdjustCarryCost` | 发出商品调整联动生成结转调整事务 |
| `bln_out_adjust_hist_cost` | `bln_out_adjust_hist_cost` | `blnOutAdjustHistCost` | 先进先出计价-结算差异追溯调整出库成本 |
| `bln_real_entry` | `bln_real_entry` | `blnRealEntry` | 日常分录 |
| `bln_auto_cal` | `bln_auto_cal` | `blnAutoCal` | 自动计算 |
| `bln_auto_clear` | `bln_auto_clear` | `accountingClearOutCost` | 核算清空出库携带成本 |
| `bln_cost_reg` | `bln_cost_reg` | `blnCostReg` | 是否支持按成本域计算 |
| `bln_settle_latest_balance_num` | `bln_settle_latest_balance_num` | `blnSettleLatestBalanceNum` | 结算考虑最新结存数量 |
| `bln_rewrite_esti` | `bln_rewrite_esti` | `invoiceSettleRewriteInEstimateCost` | 结算/费用暂估回写入库成本 |
| `bln_autocal` | `bln_autocal` | `isAutoPricing` | 是否自动取价 |
| `bln_recal` | `bln_recal` | `monthEndCostReCal` | 月末是否重算 |
| `bln_get_ori_cost` | `bln_get_ori_cost` | `returnStockFetchSrcCost` | 退库取源单成本 |
| `bln_transfer_out` | `bln_transfer_out` | `blnTransferOut` | 产品成本入库调整是否转出历史出库 |
| `bln_dim_cost_anomaly_auto_transfer` | `bln_dim_cost_anomaly_auto_transfer` | `blnDimCostAnomalyAutoTransfer` | 存货业务维度成本异常自动转移 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `disassemble_in_weight` | `disassemble_in_weight` | `disassembleInWeight` | 拆卸入库分摊权重 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_period` | `cost_period` | `costPeriod` | 计算期间(1,2,3) 默认2 |
| `cost_query_period_count` | `cost_query_period_count` | `costQueryPeriodCount` | 取价向前追溯期间数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `item_stock_adjust_limit` | `item_stock_adjust_limit` | `itemStockAdjustLimit` | 分项明细结存金额调整阈值 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assigned_unit_cost` | `assigned_unit_cost` | `assignedUnitCost` | 允许指定单价得会计事务 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `turnOutItemList` | 转出项 |
| `` | `` | `AccountParamVO_assignedUnitCostList` | 允许指定单价得会计事务多选引用子实体 |
| `` | `` | `bizDimensionList` | 业务维度 |
| `` | `` | `paramsAuthDataList` | 参数数据审计表 |
