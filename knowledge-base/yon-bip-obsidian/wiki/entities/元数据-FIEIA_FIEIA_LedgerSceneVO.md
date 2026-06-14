---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.LedgerSceneVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务核算主表 (`FIEIA.FIEIA.LedgerSceneVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`7a81b995-4432-4f45-9738-2547c307759a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务核算主表 |
| 物理表 | `ia_ledger` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 95 个 |
| 子表 | 1 个 |
| 关联引用 | 36 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `FIEIA.FIEIA.LedgerBodyScene` | composition |

## 关联引用 (36个)

| 字段名 | 引用类型 |
|--------|---------|
| `supplier_id` | `yssupplier.aa_vendor` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `busi_event` | `yonbip-fi-eeac.RefTable_02c132dc2` |
| `busi_period_id` | `finbd.bd_period` |
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `sale_org_id` | `ucf-org-center.bd_salesorg` |
| `busi_cost_center_id` | `finbd.bd_costcenterref` |
| `busi_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `write_off_reason` | `productcenter.aa_reasonref` |
| `pur_org_id` | `ucf-org-center.bd_purchaseorg` |
| `mm_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `req_cost_center_id` | `finbd.bd_costcenterref` |
| `busi_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `write_off_src_data_id` | `` |
| `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `busi_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `osm_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `req_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `src_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `opp_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `req_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `invoice_supplier_id` | `yssupplier.aa_vendor` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 95 个直连字段

### 文本字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `book_date` | `book_date` | `bookDate` | 记账日期 |
| `busi_period_code` | `busi_period_code` | `busiPeriodCode` | 会计期间 |
| `event_entry_msg` | `event_entry_msg` | `eventEntryMsg` | 事项分录消息 |
| `event_voucher_id` | `event_voucher_id` | `eventVoucherId` | 事项凭证id |
| `event_voucher_no` | `event_voucher_no` | `eventVoucherNo` | 事项凭证号 |
| `gl_voucher_id` | `gl_voucher_id` | `glVoucherId` | 总账凭证id |
| `gl_voucher_no` | `gl_voucher_no` | `glVoucherNo` | 总账凭证号 |
| `period_code` | `period_code` | `periodCode` | 记账会计期间 |
| `period_status` | `period_status` | `periodStatus` | 业务期间状态标识 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `res_voucher_id` | `res_voucher_id` | `resVoucherId` | 责任会计凭id |
| `res_voucher_no` | `res_voucher_no` | `resVoucherNo` | 责任会计凭证号 |
| `review_date` | `review_date` | `reviewDate` | 审核日期 |
| `reviewer` | `reviewer` | `reviewer` | 审核人 |
| `sterilisation_bill_id` | `sterilisation_bill_id` | `sterilisationBillId` | 冲销单据ID |
| `sterilisation_bill_no` | `sterilisation_bill_no` | `sterilisationBillNo` | 冲销单据编号 |
| `sterilisation_finance_code` | `sterilisation_finance_code` | `sterilisationFinanceCode` | 冲销会计事务编号 |
| `sterilisation_finance_id` | `sterilisation_finance_id` | `sterilisationFinanceId` | 冲销会计事务ID |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `busi_bill_id` | `busi_bill_id` | `busiBillId` | 业务单据id |
| `busi_bill_no` | `busi_bill_no` | `busiBillNo` | 业务单据号 |
| `busi_id` | `busi_id` | `busiId` | 会计事务流水id |
| `code` | `code` | `code` | 会计事务记录号 |
| `control_scope_id` | `control_scope_id` | `controlScope` | 管控范围 |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 会计事务类型编码 |
| `post_status_code` | `post_status_code` | `postStatusCode` | 生成事项分录状态码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_app_code` | `src_app_code` | `srcAppCode` | 来源应用编码 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_data_id` | `src_data_id` | `srcDataId` | 来源数据标识 |
| `src_data_type` | `src_data_type` | `srcDataType` | 来源数据类型 |
| `write_off_src_data_code` | `write_off_src_data_code` | `writeOffSrcDataCode` | 冲销来源会计事务号 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_cost_center_id` | `busi_cost_center_id` | `busiCostCenter` | 成本中心 |
| `busi_dept_id` | `busi_dept_id` | `busiDept` | 部门 |
| `busi_period_id` | `busi_period_id` | `busiPeriod` | 会计期间id |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `mm_org_id` | `mm_org_id` | `mmOrg` | 生产组织 |
| `opp_profit_center_id` | `opp_profit_center_id` | `oppProfitCenter` | 对方利润中心 |
| `osm_org_id` | `osm_org_id` | `osmOrg` | 委外组织 |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `pur_org_id` | `pur_org_id` | `purOrg` | 采购组织 |
| `req_cost_center_id` | `req_cost_center_id` | `reqCostCenter` | 需求部门成本中心 |
| `req_dept_id` | `req_dept_id` | `reqDept` | 需求部门 |
| `req_org_id` | `req_org_id` | `reqOrg` | 需求组织 |
| `sale_org_id` | `sale_org_id` | `saleOrg` | 销售组织 |
| `stock_org_id` | `stock_org_id` | `stockOrg` | 库存组织 |
| `supplier_id` | `supplier_id` | `supplierId` | 供货供应商 |
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `busi_bill_type_id` | `busi_bill_type_id` | `busiBillTypeId` | 业务单据类型 |
| `busi_event` | `busi_event` | `busiEvent` | 业务事项 |
| `busi_trade_type_id` | `busi_trade_type_id` | `busiTradeTypeId` | 业务交易类型 |
| `fi_event_id` | `fi_event_id` | `fiEventId` | 会计事务类型 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源单据交易类型 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `write_off_reason` | `write_off_reason` | `writeOffReason` | 冲销原因 |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源会计事务id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_bill_date` | `busi_bill_date` | `busiBillDate` | 业务单据日期 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `register_time` | `register_time` | `registerTime` | 登账时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_inner_settle` | `bln_inner_settle` | `blnInnerSettle` | 是否内部交易 |
| `bln_paired` | `bln_paired` | `blnPaired` | 是否成对单据 |
| `bln_return` | `bln_return` | `blnReturn` | 退货标识 |
| `bln_send_goods` | `bln_send_goods` | `blnSendGoods` | 发出商品标识 |
| `bln_inserted` | `bln_inserted` | `blnInserted` | 插单标识 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_direction` | `bill_direction` | `billDirection` | 单据方向 |
| `entrust_proc_m_direction` | `entrust_proc_m_direction` | `entrustProcMDirection` | 委外业务方向 |
| `entrusted_proc_direction` | `entrusted_proc_direction` | `entrustedProcDirection` | 受托加工方向 |
| `event_entry_status` | `event_entry_status` | `eventEntryStatus` | 事项分录状态 |
| `ia_busi_type` | `ia_busi_type` | `iaBusiType` | 存货业务类型 |
| `input_tax_acc_direction` | `input_tax_acc_direction` | `inputTaxAccDirection` | 进项税方向 |
| `period_type` | `period_type` | `periodType` | 期间类型 |
| `reduce_price_ready_direction` | `reduce_price_ready_direction` | `reducePriceReadyDirection` | 跌价准备方向 |
| `send_goods_direction` | `send_goods_direction` | `sendGoodsDirection` | 发出商品方向 |
| `src_fi_event_type` | `src_fi_event_type` | `srcFiEventType` | 事项来源类型 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_version` | `src_bill_version` | `srcBillVersion` | 来源单据版本号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 业务核算主表自定义项特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 物料明细 |
