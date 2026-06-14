---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.OsmInConfirmFiEventVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 委外入库确认 (`FIEIA.FIEIA.OsmInConfirmFiEventVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`35398192-b208-4bce-8f51-6581daee09a4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外入库确认 |
| 物理表 | `ia_ledger` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 87 个 |
| 子表 | 1 个 |
| 关联引用 | 32 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `FIEIA.FIEIA.OsmInConfirmFiEventRowVO` | composition |

## 关联引用 (32个)

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
| `busi_cost_center_id` | `finbd.bd_costcenterref` |
| `busi_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `write_off_reason` | `productcenter.aa_reasonref` |
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

## 继承接口 (2个, 2字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`

## 字段列表（按类型分组）

> 共 87 个直连字段

### 文本字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `periodCode` | 记账会计期间 |
| `busi_period_code` | `busi_period_code` | `busiPeriodCode` | 会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `src_app_code` | `src_app_code` | `srcAppCode` | 来源应用编码 |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 会计事务类型编码 |
| `busi_id` | `busi_id` | `busiId` | 会计事务流水id |
| `book_date` | `book_date` | `bookDate` | 记账日期 |
| `review_date` | `review_date` | `reviewDate` | 审核日期 |
| `reviewer` | `reviewer` | `reviewer` | 审核人 |
| `event_entry_msg` | `event_entry_msg` | `eventEntryMsg` | 事项分录消息 |
| `event_voucher_id` | `event_voucher_id` | `eventVoucherId` | 事项凭证id |
| `event_voucher_no` | `event_voucher_no` | `eventVoucherNo` | 事项凭证号 |
| `gl_voucher_id` | `gl_voucher_id` | `glVoucherId` | 总账凭证id |
| `gl_voucher_no` | `gl_voucher_no` | `glVoucherNo` | 总账凭证号 |
| `res_voucher_id` | `res_voucher_id` | `resVoucherId` | 责任会计凭id |
| `res_voucher_no` | `res_voucher_no` | `resVoucherNo` | 责任会计凭证号 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `busi_bill_id` | `busi_bill_id` | `busiBillId` | 业务单据id |
| `busi_bill_no` | `busi_bill_no` | `busiBillNo` | 业务单据号 |
| `busi_src_bill_id` | `busi_src_bill_id` | `busiSrcBillId` | 业务来源单据id |
| `busi_src_bill_no` | `busi_src_bill_no` | `busiSrcBillNo` | 业务来源单据号 |
| `sterilisation_bill_no` | `sterilisation_bill_no` | `sterilisationBillNo` | 冲销单据编号 |
| `sterilisation_bill_id` | `sterilisation_bill_id` | `sterilisationBillId` | 冲销单据ID |
| `sterilisation_finance_id` | `sterilisation_finance_id` | `sterilisationFinanceId` | 冲销会计事务ID |
| `sterilisation_finance_code` | `sterilisation_finance_code` | `sterilisationFinanceCode` | 冲销会计事务编号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `control_scope_id` | `control_scope_id` | `controlScope` | 管控范围 |
| `period_status` | `period_status` | `periodStatus` | 业务期间状态标识 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | id |
| `post_status_code` | `post_status_code` | `postStatusCode` | 生成事项分录状态码 |
| `src_data_id` | `src_data_id` | `srcDataId` | 来源数据标识 |
| `src_data_type` | `src_data_type` | `srcDataType` | 来源数据类型 |
| `write_off_src_data_code` | `write_off_src_data_code` | `writeOffSrcDataCode` | 冲销来源会计事务号 |

### 引用字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `busi_period_id` | `busi_period_id` | `busiPeriod` | 会计期间id |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `fi_event_id` | `fi_event_id` | `fiEventId` | 会计事务类型 |
| `stock_org_id` | `stock_org_id` | `stockOrg` | 库存组织 |
| `osm_org_id` | `osm_org_id` | `osmOrg` | 委外组织 |
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `opp_profit_center_id` | `opp_profit_center_id` | `oppProfitCenter` | 对方利润中心 |
| `busi_dept_id` | `busi_dept_id` | `busiDept` | 部门 |
| `busi_cost_center_id` | `busi_cost_center_id` | `busiCostCenter` | 成本中心 |
| `req_dept_id` | `req_dept_id` | `reqDept` | 需求部门 |
| `req_cost_center_id` | `req_cost_center_id` | `reqCostCenter` | 需求部门成本中心 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `supplier_id` | `supplier_id` | `supplierId` | 供货供应商 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源单据交易类型 |
| `busi_event` | `busi_event` | `busiEvent` | 业务事项 |
| `busi_bill_type_id` | `busi_bill_type_id` | `busiBillTypeId` | 业务单据类型 |
| `busi_trade_type_id` | `busi_trade_type_id` | `busiTradeTypeId` | 业务交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `write_off_reason` | `write_off_reason` | `writeOffReason` | 冲销原因 |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源会计事务id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `busi_bill_date` | `busi_bill_date` | `busiBillDate` | 业务单据日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `register_time` | `register_time` | `registerTime` | 登账时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_inserted` | `bln_inserted` | `blnInserted` | 插单标识 |
| `bln_return` | `bln_return` | `blnReturn` | 退货标识 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `entrust_proc_m_direction` | `entrust_proc_m_direction` | `entrustProcMDirection` | 委外业务方向 |
| `period_type` | `period_type` | `periodType` | 期间类型 |
| `bill_direction` | `bill_direction` | `billDirection` | 单据方向 |
| `src_fi_event_type` | `src_fi_event_type` | `srcFiEventType` | 事项来源类型 |
| `event_entry_status` | `event_entry_status` | `eventEntryStatus` | 事项分录状态 |
| `ia_busi_type` | `ia_busi_type` | `iaBusiType` | 存货业务类型 |
| `in_stock_type` | `in_stock_type` | `inStockType` | 入库类型 |
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
| `free_ch_id` | `free_ch_id` | `freeChId` | 委外入库确认自定义项特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 委外入库确认综合信息 |
