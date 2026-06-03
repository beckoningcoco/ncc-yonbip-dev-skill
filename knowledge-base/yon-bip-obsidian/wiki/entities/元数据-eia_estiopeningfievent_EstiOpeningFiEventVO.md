---
tags: [BIP, 元数据, 数据字典, eia.estiopeningfievent.EstiOpeningFiEventVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 暂估期初主表 (`eia.estiopeningfievent.EstiOpeningFiEventVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`5bb48654-c664-4ef5-85e2-2549df94844f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 暂估期初主表 |
| 物理表 | `ia_ledger` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 64 个 |
| 子表 | 1 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `eia.estiopeningfievent.EstiOpeningFiEventBodyVO` | composition |

## 关联引用 (28个)

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
| `busi_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `busi_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `write_off_reason` | `productcenter.aa_reasonref` |
| `pur_org_id` | `ucf-org-center.bd_purchaseorg` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `write_off_src_data_id` | `` |
| `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
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
| `invoice_supplier_id` | `yssupplier.aa_vendor` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (4个, 7字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 64 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `periodCode` | 记账会计期间 |
| `busi_period_code` | `busi_period_code` | `busiPeriodCode` | 会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 会计事务类型编码 |
| `busi_id` | `busi_id` | `busiId` | 会计事务流水ID |
| `book_date` | `book_date` | `bookDate` | 记账日期 |
| `event_voucher_no` | `event_voucher_no` | `eventVoucherNo` | 事项凭证号 |
| `gl_voucher_no` | `gl_voucher_no` | `glVoucherNo` | 总账凭证号 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `busi_bill_code` | `busi_bill_code` | `busiBillCode` | 业务单据号 |
| `remarks` | `remarks` | `remarks` | 表头备注 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | id |
| `event_entry_msg` | `event_entry_msg` | `eventEntryMsg` | 事项分录异常信息 |
| `event_voucher_id` | `event_voucher_id` | `eventVoucherId` | 事项凭证id |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态码 |
| `src_data_id` | `src_data_id` | `srcDataId` | 来源数据行标识 |
| `src_data_type` | `src_data_type` | `srcDataType` | 来源数据类型 |
| `write_off_src_data_code` | `write_off_src_data_code` | `writeOffSrcDataCode` | 冲销来源会计事务记录号 |

### 引用字段 (26个)

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
| `pur_org_id` | `pur_org_id` | `purOrg` | 采购组织 |
| `osm_org_id` | `osm_org_id` | `osmOrg` | 委外组织 |
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `opp_profit_center_id` | `opp_profit_center_id` | `oppProfitCenter` | 对方利润中心 |
| `busi_dept_id` | `busi_dept_id` | `busiDeptId` | 业务部门 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `supplier_id` | `supplier_id` | `supplierId` | 供货供应商 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源交易类型 |
| `busi_event` | `busi_event` | `busiEvent` | 业务事项 |
| `busi_trade_type_id` | `busi_trade_type_id` | `busiTradeTypeId` | 业务单据交易类型 |
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

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `entrust_proc_m_direction` | `entrust_proc_m_direction` | `entrustProcMDirection` | 委外业务方向 |
| `period_type` | `period_type` | `periodType` | 期间类型 |
| `bill_direction` | `bill_direction` | `billDirection` | 单据方向 |
| `event_entry_status` | `event_entry_status` | `eventEntryStatus` | 事项分录状态 |
| `ia_busi_type` | `ia_busi_type` | `iaBusiType` | 存货业务类型 |
| `src_fi_event_type` | `src_fi_event_type` | `srcFiEventType` | 事务来源类型 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 暂估期初综合信息 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项特征组 |
