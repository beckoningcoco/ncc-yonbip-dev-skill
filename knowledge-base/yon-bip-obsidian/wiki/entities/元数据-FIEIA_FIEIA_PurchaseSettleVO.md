---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.PurchaseSettleVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发票结算 (`FIEIA.FIEIA.PurchaseSettleVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`72bc4c28-9d63-4cb6-b24c-ee83ca8bbc49`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发票结算 |
| 物理表 | `` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 62 个 |
| 子表 | 1 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `FIEIA.FIEIA.PurchaseSettleRowVO` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `` | `` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `busi_event` | `yonbip-fi-eeac.RefTable_02c132dc2` |
| `src_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `busi_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `write_off_reason` | `productcenter.aa_reasonref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `busi_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `write_off_src_data_id` | `` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |

## 继承接口 (2个, 2字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`

## 字段列表（按类型分组）

> 共 62 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `periodCode` | 结算单所在期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `src_app_code` | `src_app_code` | `srcAppCode` | 来源应用编码 |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 会计事务类型编码 |
| `busi_id` | `busi_id` | `busiId` | 会计事务流水id |
| `reviewer` | `reviewer` | `reviewer` | 审核人 |
| `settletype` | `settletype` | `settletype` | 结算类型 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `busi_bill_id` | `busi_bill_id` | `busiBillId` | 业务单据id |
| `busi_bill_no` | `busi_bill_no` | `busiBillNo` | 业务单据号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `control_scope_id` | `control_scope_id` | `controlScope` | 管控范围 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | id |
| `book_date` | `book_date` | `bookDate` | 记账日期 |
| `event_entry_msg` | `event_entry_msg` | `eventEntryMsg` | 事项分录消息 |
| `event_entry_status` | `event_entry_status` | `eventEntryStatus` | 事项分录状态 |
| `post_status_code` | `post_status_code` | `postStatusCode` | 生成事项分录状态码 |
| `src_data_id` | `src_data_id` | `srcDataId` | 来源数据标识 |
| `src_data_type` | `src_data_type` | `srcDataType` | 来源数据类型 |
| `write_off_src_data_code` | `write_off_src_data_code` | `writeOffSrcDataCode` | 冲销来源会计事务号 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `fi_event_id` | `fi_event_id` | `fiEventId` | 会计事务类型 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `rate_type` | `rate_type` | `rateType` | 汇率类型 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源单据交易类型 |
| `busi_event` | `busi_event` | `busiEvent` | 业务事项 |
| `busi_bill_type_id` | `busi_bill_type_id` | `busiBillTypeId` | 业务单据类型 |
| `busi_trade_type_id` | `busi_trade_type_id` | `busiTradeTypeId` | 业务交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency` | `currency` | `currency` | 币种 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `write_off_reason` | `write_off_reason` | `writeOffReason` | 冲销原因 |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源会计事务id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `review_date` | `review_date` | `reviewDate` | 审核日期 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `busi_bill_date` | `busi_bill_date` | `busiBillDate` | 业务单据日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |
| `register_time` | `register_time` | `registerTime` | 登账时间 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_inserted` | `bln_inserted` | `blnInserted` | 插单标识 |
| `bln_esti_adjust` | `bln_esti_adjust` | `blnEstiAdjust` | 是否已暂估调整 |
| `bln_cross_org_osm` | `bln_cross_org_osm` | `blnCrossOrgOsm` | 跨组织委外结算标识 |
| `bln_calc_esti` | `bln_calc_esti` | `blnCalcEsti` | 暂估回冲计算标识 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
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

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_rate` | `tax_rate` | `taxRate` | 汇率 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 发票结算综合信息 |
