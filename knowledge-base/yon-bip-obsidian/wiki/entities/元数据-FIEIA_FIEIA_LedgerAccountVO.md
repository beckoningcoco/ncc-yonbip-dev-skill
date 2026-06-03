---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.LedgerAccountVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 核算主表 (`FIEIA.FIEIA.LedgerAccountVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_b_x_account` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`1555141c-9307-4a84-a70d-bd186c4ae607`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 核算主表 |
| 物理表 | `ia_ledger_b_x_account` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 205 个 |
| 子表 | 1 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `FIEIA.FIEIA.LedgerAccountBodyVO` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `cost_domain_id` | `yonbip-fi-eia.RefTable_0e6f869743` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `` | `` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `inventory_obj_id` | `` |
| `ytenant_id` | `` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `write_off_src_data_id` | `` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 205 个直连字段

### 文本字段 (47个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `std_price_dimension` | `std_price_dimension` | `stdPriceDimension` | 标准取价匹配模式 |
| `busi_sort_no` | `busi_sort_no` | `busiSortNo` | 业务记账序号 |
| `accbook_cost_form` | `accbook_cost_form` | `accbookCostForm` | 账簿本币成本组成 |
| `accbook_cost_source_memo` | `accbook_cost_source_memo` | `accbookCostSourceMemo` | 账簿本币成本来源描述 |
| `accbook_trade_rate_type` | `accbook_trade_rate_type` | `accbookTradeRateType` | 账簿本币交易汇率类型 |
| `batch_no` | `batch_no` | `batchNo` | 批次号 |
| `book_date` | `book_date` | `bookDate` | 记账日期 |
| `busi_bill_date` | `busi_bill_date` | `busiBillDate` | 单据日期 |
| `busi_bill_id` | `busi_bill_id` | `busiBillId` | 业务单据id |
| `busi_bill_no` | `busi_bill_no` | `busiBillNo` | 单据编号 |
| `busi_bill_row_id` | `busi_bill_row_id` | `busiBillRowId` | 业务单据行id |
| `busi_id` | `busi_id` | `busiId` | 会计事务id |
| `busi_src_bill_id` | `busi_src_bill_id` | `busiSrcBillId` | 业务来源单据id |
| `busi_src_bill_row_id` | `busi_src_bill_row_id` | `busiSrcBillRowId` | 业务来源单据行id |
| `code` | `code` | `code` | 会计事务编号 |
| `control_cost_form` | `control_cost_form` | `controlCostForm` | 管控范围本币成本组成 |
| `control_cost_source_memo` | `control_cost_source_memo` | `controlCostSourceMemo` | 管控范围本币成本来源描述 |
| `control_scope_id` | `control_scope_id` | `controlScope` | 管控范围 |
| `control_trade_rate_type` | `control_trade_rate_type` | `controlTradeRateType` | 管控范围本币交易汇率类型 |
| `entry_account_method` | `entry_account_method` | `entryAccountMethod` | 入账方式 |
| `error_message` | `error_message` | `errorMessage` | 错误提示 |
| `error_solution` | `error_solution` | `errorSolution` | 解决方案 |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 会计事务类型编码 |
| `fi_event_id` | `fi_event_id` | `fiEventId` | 会计事务类型id |
| `global_cost_form` | `global_cost_form` | `globalCostForm` | 全局本币成本组成 |
| `global_cost_source_memo` | `global_cost_source_memo` | `globalCostSourceMemo` | 全局本币成本来源描述 |
| `global_trade_rate_type` | `global_trade_rate_type` | `globalTradeRateType` | 全局本币交易汇率类型 |
| `group_cost_form` | `group_cost_form` | `groupCostForm` | 集团本币成本组成 |
| `group_cost_source_memo` | `group_cost_source_memo` | `groupCostSourceMemo` | 集团本币成本来源描述 |
| `group_trade_rate_type` | `group_trade_rate_type` | `groupTradeRateType` | 集团本币交易汇率类型 |
| `header_id` | `header_id` | `header` | 流水账主表 |
| `org_cost_form` | `org_cost_form` | `orgCostForm` | 组织本币成本组成 |
| `org_cost_source_memo` | `org_cost_source_memo` | `orgCostSourceMemo` | 组织本币成本来源描述 |
| `pair_key` | `pair_key` | `pairKey` | 成对线索 |
| `pair_type` | `pair_type` | `pairType` | 成对类型 |
| `period_code` | `period_code` | `periodCode` | 记账会计期间编码 |
| `period_status` | `period_status` | `periodStatus` | 业务期间状态标识 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `send_goods_group` | `send_goods_group` | `sendGoodsGroup` | 计算分组 |
| `sort_no` | `sort_no` | `sortNo` | 记账序号 |
| `specify_method` | `specify_method` | `specifyMethod` | 指定方式 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行id |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `std_price_version` | `std_price_version` | `stdPriceVersion` | 标准价版本号 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿本币 |
| `control_currtype_id` | `control_currtype_id` | `controlCurrtypeId` | 管控范围本币 |
| `global_currtype_id` | `global_currtype_id` | `globalCurrtypeId` | 全局本币 |
| `group_currtype_id` | `group_currtype_id` | `groupCurrtypeId` | 集团本币 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织本币 |
| `org_trade_rate_type` | `org_trade_rate_type` | `orgTradeRateType` | 组织本币交易汇率类型 |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `stock_org_id` | `stock_org_id` | `stockOrg` | 库存组织 |
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源会计事务行id |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `accbook_id` | `accbook_id` | `accbook` | 核算账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `cost_domain_id` | `cost_domain_id` | `costDomainId` | 成本域(租户) |
| `inventory_obj_id` | `inventory_obj_id` | `inventoryObjId` | 存货对象 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_inserted` | `bln_inserted` | `blnInserted` | 插单标识 |
| `bln_not_verification` | `bln_not_verification` | `blnNotVerification` | 是否不核销 |
| `bln_paired` | `bln_paired` | `blnPaired` | 成对标识 |
| `bln_return` | `bln_return` | `blnReturn` | 退货标识 |
| `bln_send_goods` | `bln_send_goods` | `blnSendGoods` | 发出商品标识 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |

### 枚举字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_cost_source` | `accbook_cost_source` | `accbookCostSource` | 账簿本币成本来源 |
| `bill_direction` | `bill_direction` | `billDirection` | 单据方向 |
| `bln_gift` | `bln_gift` | `blnGift` | 物料业务类型 |
| `compute_method` | `compute_method` | `computeMethod` | 计算方式 |
| `control_cost_source` | `control_cost_source` | `controlCostSource` | 管控范围本币成本来源 |
| `cost_accounting_method` | `cost_accounting_method` | `costAccountingMethod` | 委外成本核算方式 |
| `global_cost_source` | `global_cost_source` | `globalCostSource` | 全局本币成本来源 |
| `group_cost_source` | `group_cost_source` | `groupCostSource` | 集团本币成本来源 |
| `inout_direction` | `inout_direction` | `inoutDirection` | 出入库方向 |
| `org_cost_source` | `org_cost_source` | `orgCostSource` | 组织本币成本来源 |
| `osm_busi_type` | `osm_busi_type` | `osmBusiType` | 委外业务类型 |
| `price_method` | `price_method` | `priceMethod` | 计价方式 |
| `src_fi_event_type` | `src_fi_event_type` | `srcFiEventType` | 会计事务来源类型 |
| `status` | `status` | `status` | 计算状态 |
| `org_trade_rate_ops` | `org_trade_rate_ops` | `orgTradeRateOps` | 组织币汇率折算方式 |
| `control_currency_rate_ops` | `control_currency_rate_ops` | `controlCurrencyRateOps` | 管控范围币汇率折算方式 |
| `group_currency_rate_ops` | `group_currency_rate_ops` | `groupCurrencyRateOps` | 集团币汇率折算方式 |
| `global_currency_rate_ops` | `global_currency_rate_ops` | `globalCurrencyRateOps` | 全局币汇率折算方式 |
| `accbook_currency_rate_ops` | `accbook_currency_rate_ops` | `accbookCurrencyRateOps` | 账簿币汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rollup_level` | `rollup_level` | `rollupLevel` | 卷积层级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (108个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_amount` | `accbook_amount` | `accbookAmount` | 账簿本币成本金额 |
| `accbook_balance_amount` | `accbook_balance_amount` | `accbookBalanceAmount` | 账簿本币结余金额 |
| `accbook_busi_dif` | `accbook_busi_dif` | `accbookBusiDif` | 账簿本币业务差异 |
| `accbook_ipv_dif` | `accbook_ipv_dif` | `accbookIpvDif` | 账簿本币结算差异 |
| `accbook_ipv_rate_dif` | `accbook_ipv_rate_dif` | `accbookIpvRateDif` | 账簿本币汇率差异 |
| `accbook_ppd_dif` | `accbook_ppd_dif` | `accbookPpdDif` | 账簿本币生产价格差异 |
| `accbook_price` | `accbook_price` | `accbookPrice` | 账簿本币成本单价 |
| `accbook_reserv_dif1` | `accbook_reserv_dif1` | `accbookReservDif1` | 账簿本币预留差异1 |
| `accbook_reserv_dif2` | `accbook_reserv_dif2` | `accbookReservDif2` | 账簿本币预留差异2 |
| `accbook_settled_amount` | `accbook_settled_amount` | `accbookSettledAmount` | 账簿本币结算后金额 |
| `accbook_settled_price` | `accbook_settled_price` | `accbookSettledPrice` | 账簿本币结算后单价 |
| `accbook_std_amount` | `accbook_std_amount` | `accbookStdAmount` | 账簿本币标准金额 |
| `accbook_std_price` | `accbook_std_price` | `accbookStdPrice` | 账簿本币标准单价 |
| `accbook_this_balance_amount` | `accbook_this_balance_amount` | `accbookThisBalanceAmount` | 账簿本币本层结余金额 |
| `accbook_this_busi_dif` | `accbook_this_busi_dif` | `accbookThisBusiDif` | 账簿本币本层业务差异 |
| `accbook_this_cost_amount` | `accbook_this_cost_amount` | `accbookThisCostAmount` | 账簿本币本层成本金额 |
| `accbook_this_cost_price` | `accbook_this_cost_price` | `accbookThisCostPrice` | 账簿本币本层成本单价 |
| `accbook_this_ppd_dif` | `accbook_this_ppd_dif` | `accbookThisPpdDif` | 账簿本币本层生产价格差异 |
| `accbook_this_std_amount` | `accbook_this_std_amount` | `accbookThisStdAmount` | 账簿本币本层标准金额 |
| `accbook_this_std_price` | `accbook_this_std_price` | `accbookThisStdPrice` | 账簿本币本层标准单价 |
| `accbook_trade_rate` | `accbook_trade_rate` | `accbookTradeRate` | 账簿本币交易汇率 |
| `balance_num` | `balance_num` | `balanceNum` | 剩余数量 |
| `control_amount` | `control_amount` | `controlAmount` | 管控范围本币成本金额 |
| `control_balance_amount` | `control_balance_amount` | `controlBalanceAmount` | 管控范围本币结余金额 |
| `control_busi_dif` | `control_busi_dif` | `controlBusiDif` | 管控范围本币业务差异 |
| `control_ipv_dif` | `control_ipv_dif` | `controlIpvDif` | 管控范围本币结算差异 |
| `control_ipv_rate_dif` | `control_ipv_rate_dif` | `controlIpvRateDif` | 管控范围本币汇率差异 |
| `control_ppd_dif` | `control_ppd_dif` | `controlPpdDif` | 管控范围本币生产价格差异 |
| `control_price` | `control_price` | `controlPrice` | 管控范围本币成本单价 |
| `control_reserv_dif1` | `control_reserv_dif1` | `controlReservDif1` | 管控范围本币预留差异1 |
| `control_reserv_dif2` | `control_reserv_dif2` | `controlReservDif2` | 管控范围本币预留差异2 |
| `control_settled_amount` | `control_settled_amount` | `controlSettledAmount` | 管控范围本币结算后金额 |
| `control_settled_price` | `control_settled_price` | `controlSettledPrice` | 管控范围本币结算后单价 |
| `control_std_amount` | `control_std_amount` | `controlStdAmount` | 管控范围本币标准金额 |
| `control_std_price` | `control_std_price` | `controlStdPrice` | 管控范围本币标准单价 |
| `control_this_balance_amount` | `control_this_balance_amount` | `controlThisBalanceAmount` | 管控范围本币本层结余金额 |
| `control_this_busi_dif` | `control_this_busi_dif` | `controlThisBusiDif` | 管控范围本币本层业务差异 |
| `control_this_cost_amount` | `control_this_cost_amount` | `controlThisCostAmount` | 管控范围本币本层成本金额 |
| `control_this_cost_price` | `control_this_cost_price` | `controlThisCostPrice` | 管控范围本币本层成本单价 |
| `control_this_ppd_dif` | `control_this_ppd_dif` | `controlThisPpdDif` | 管控范围本币本层生产价格差异 |
| `control_this_std_amount` | `control_this_std_amount` | `controlThisStdAmount` | 管控范围本币本层标准金额 |
| `control_this_std_price` | `control_this_std_price` | `controlThisStdPrice` | 管控范围本币本层标准单价 |
| `control_trade_rate` | `control_trade_rate` | `controlTradeRate` | 管控范围本币交易汇率 |
| `global_amount` | `global_amount` | `globalAmount` | 全局本币成本金额 |
| `global_balance_amount` | `global_balance_amount` | `globalBalanceAmount` | 全局本币结余金额 |
| `global_busi_dif` | `global_busi_dif` | `globalBusiDif` | 全局本币业务差异 |
| `global_ipv_dif` | `global_ipv_dif` | `globalIpvDif` | 全局本币结算差异 |
| `global_ipv_rate_dif` | `global_ipv_rate_dif` | `globalIpvRateDif` | 全局本币汇率差异 |
| `global_ppd_dif` | `global_ppd_dif` | `globalPpdDif` | 全局本币生产价格差异 |
| `global_price` | `global_price` | `globalPrice` | 全局本币成本单价 |
| `global_reserv_dif1` | `global_reserv_dif1` | `globalReservDif1` | 全局本币预留差异1 |
| `global_reserv_dif2` | `global_reserv_dif2` | `globalReservDif2` | 全局本币预留差异2 |
| `global_settled_amount` | `global_settled_amount` | `globalSettledAmount` | 全局本币结算后金额 |
| `global_settled_price` | `global_settled_price` | `globalSettledPrice` | 全局本币结算后单价 |
| `global_std_amount` | `global_std_amount` | `globalStdAmount` | 全局本币标准金额 |
| `global_std_price` | `global_std_price` | `globalStdPrice` | 全局本币标准单价 |
| `global_this_balance_amount` | `global_this_balance_amount` | `globalThisBalanceAmount` | 全局本币本层结余金额 |
| `global_this_busi_dif` | `global_this_busi_dif` | `globalThisBusiDif` | 全局本币本层业务差异 |
| `global_this_cost_amount` | `global_this_cost_amount` | `globalThisCostAmount` | 全局本币本层成本金额 |
| `global_this_cost_price` | `global_this_cost_price` | `globalThisCostPrice` | 全局本币本层成本单价 |
| `global_this_ppd_dif` | `global_this_ppd_dif` | `globalThisPpdDif` | 全局本币本层生产价格差异 |
| `global_this_std_amount` | `global_this_std_amount` | `globalThisStdAmount` | 全局本币本层标准金额 |
| `global_this_std_price` | `global_this_std_price` | `globalThisStdPrice` | 全局本币本层标准单价 |
| `global_trade_rate` | `global_trade_rate` | `globalTradeRate` | 全局本币交易汇率 |
| `group_amount` | `group_amount` | `groupAmount` | 集团本币成本金额 |
| `group_balance_amount` | `group_balance_amount` | `groupBalanceAmount` | 集团本币结余金额 |
| `group_busi_dif` | `group_busi_dif` | `groupBusiDif` | 集团本币业务差异 |
| `group_ipv_dif` | `group_ipv_dif` | `groupIpvDif` | 集团本币结算差异 |
| `group_ipv_rate_dif` | `group_ipv_rate_dif` | `groupIpvRateDif` | 集团本币汇率差异 |
| `group_ppd_dif` | `group_ppd_dif` | `groupPpdDif` | 集团本币生产价格差异 |
| `group_price` | `group_price` | `groupPrice` | 集团本币成本单价 |
| `group_reserv_dif1` | `group_reserv_dif1` | `groupReservDif1` | 集团本币预留差异1 |
| `group_reserv_dif2` | `group_reserv_dif2` | `groupReservDif2` | 集团本币预留差异2 |
| `group_settled_amount` | `group_settled_amount` | `groupSettledAmount` | 集团本币结算后金额 |
| `group_settled_price` | `group_settled_price` | `groupSettledPrice` | 集团本币结算后单价 |
| `group_std_amount` | `group_std_amount` | `groupStdAmount` | 集团本币标准金额 |
| `group_std_price` | `group_std_price` | `groupStdPrice` | 集团本币标准单价 |
| `group_this_balance_amount` | `group_this_balance_amount` | `groupThisBalanceAmount` | 集团本币本层结余金额 |
| `group_this_busi_dif` | `group_this_busi_dif` | `groupThisBusiDif` | 集团本币本层业务差异 |
| `group_this_cost_amount` | `group_this_cost_amount` | `groupThisCostAmount` | 集团本币本层成本金额 |
| `group_this_cost_price` | `group_this_cost_price` | `groupThisCostPrice` | 集团本币本层成本单价 |
| `group_this_ppd_dif` | `group_this_ppd_dif` | `groupThisPpdDif` | 集团本币本层生产价格差异 |
| `group_this_std_amount` | `group_this_std_amount` | `groupThisStdAmount` | 集团本币本层标准金额 |
| `group_this_std_price` | `group_this_std_price` | `groupThisStdPrice` | 集团本币本层标准单价 |
| `group_trade_rate` | `group_trade_rate` | `groupTradeRate` | 集团本币交易汇率 |
| `num` | `num` | `num` | 数量 |
| `org_amount` | `org_amount` | `orgAmount` | 组织本币成本金额 |
| `org_balance_amount` | `org_balance_amount` | `orgBalanceAmount` | 组织本币结余金额 |
| `org_busi_dif` | `org_busi_dif` | `orgBusiDif` | 组织本币业务差异 |
| `org_ipv_dif` | `org_ipv_dif` | `orgIpvDif` | 组织本币结算差异 |
| `org_ipv_rate_dif` | `org_ipv_rate_dif` | `orgIpvRateDif` | 组织本币汇率差异 |
| `org_ppd_dif` | `org_ppd_dif` | `orgPpdDif` | 组织本币生产价格差异 |
| `org_price` | `org_price` | `orgPrice` | 组织本币成本单价 |
| `org_reserv_dif1` | `org_reserv_dif1` | `orgReservDif1` | 组织本币预留差异1 |
| `org_reserv_dif2` | `org_reserv_dif2` | `orgReservDif2` | 组织本币预留差异2 |
| `org_settled_amount` | `org_settled_amount` | `orgSettledAmount` | 组织本币结算后金额 |
| `org_settled_price` | `org_settled_price` | `orgSettledPrice` | 组织本币结算后单价 |
| `org_std_amount` | `org_std_amount` | `orgStdAmount` | 组织本币标准金额 |
| `org_std_price` | `org_std_price` | `orgStdPrice` | 组织本币标准单价 |
| `org_this_balance_amount` | `org_this_balance_amount` | `orgThisBalanceAmount` | 组织本币本层结余金额 |
| `org_this_busi_dif` | `org_this_busi_dif` | `orgThisBusiDif` | 组织本币本层业务差异 |
| `org_this_cost_amount` | `org_this_cost_amount` | `orgThisCostAmount` | 组织本币本层成本金额 |
| `org_this_cost_price` | `org_this_cost_price` | `orgThisCostPrice` | 组织本币本层成本单价 |
| `org_this_ppd_dif` | `org_this_ppd_dif` | `orgThisPpdDif` | 组织本币本层生产价格差异 |
| `org_this_std_amount` | `org_this_std_amount` | `orgThisStdAmount` | 组织本币本层标准金额 |
| `org_this_std_price` | `org_this_std_price` | `orgThisStdPrice` | 组织本币本层标准单价 |
| `org_trade_rate` | `org_trade_rate` | `orgTradeRate` | 组织本币交易汇率 |
| `settled_num` | `settled_num` | `settledNum` | 结算数量 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 核算子表 |
