---
tags: [BIP, 元数据, 数据字典, 流水台账, EIA, FIEIA.FIEIA.LedgerVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 流水账主表 (`FIEIA.FIEIA.LedgerVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 财务（EIA）模块流水台账的完整元数据字典。
> 来源：元数据API返回的 `FIEIA.FIEIA.LedgerVO` 实体完整定义。
> 物理表：`ia_ledger` | 业务对象ID：`d3b8a63d-5608-44ad-936d-e61341de9f10`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流水账主表 |
| 描述 |  |
| 物理表 | `ia_ledger` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 数据权限场景 | `bill_maintain` |
| 构建时间戳 | `1780448758041` |

## 部署信息


## 业务场景

- `classified`

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | String | 唯一标识 |
| 编码 | `code` | `code` | String | 单据编号（isCode）|

## 继承接口

- **逻辑删除** (`iuap.busiObj.LogicDelete`) → 字段 `dr` → `dr`
- **编码** (`iuap.busiObj.Code`) → 字段 `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`) → 字段 `ytenant_id` → `ytenant_id`
- **成本流水账业务财务事务** (`ecc.costcenterjournal.ITccAdapter`) → 字段 `dtc_gtxid ` → `dtc_gtxid `
- **成本流水账业务财务事务** (`ecc.costcenterjournal.ITccAdapter`) → 字段 `dtc_status` → `dtc_status`
- **审计信息** (`iuap.busiObj.IAuditInfo`) → 字段 `create_time` → `create_time`
- **审计信息** (`iuap.busiObj.IAuditInfo`) → 字段 `creator` → `creator`
- **审计信息** (`iuap.busiObj.IAuditInfo`) → 字段 `modifier` → `modifier`
- **审计信息** (`iuap.busiObj.IAuditInfo`) → 字段 `modify_time` → `modify_time`

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `FIEIA.FIEIA.LedgerBodyVO` | composition (header) |

## 服务引用（关联引用）

| 字段名 | 数据库列 | 引用实体 | 引用类型 |
|--------|---------|---------|---------|
| `supplier_id` | `supplier_id` | `yssupplier.aa_vendor` | reference |
| `accpurpose_id` | `accpurpose_id` | `finbd.bd_accpurposeref` | reference |
| `` | `` | `` | reference |
| `modifier` | `modifier` | `bip-usercenter.bip_user_ref` | reference |
| `busi_period_id` | `busi_period_id` | `finbd.bd_period` | reference |
| `profit_center_id` | `profit_center_id` | `finbd.bd_allaccbodyref_inner` | reference |
| `accentity_id` | `accentity_id` | `finbd.bd_allaccbodyref_inner` | reference |
| `sale_org_id` | `sale_org_id` | `ucf-org-center.bd_salesorg` | reference |
| `busi_cost_center_id` | `busi_cost_center_id` | `finbd.bd_costcenterref` | reference |
| `busi_trade_type_id` | `busi_trade_type_id` | `ucfbasedoc.bd_billtyperef` | reference |
| `write_off_reason` | `write_off_reason` | `productcenter.aa_reasonref` | reference |
| `pur_org_id` | `pur_org_id` | `ucf-org-center.bd_purchaseorg` | reference |
| `mm_org_id` | `mm_org_id` | `ucf-org-center.org_pure_tree_ref` | reference |
| `req_cost_center_id` | `req_cost_center_id` | `finbd.bd_costcenterref` | reference |
| `busi_bill_type_id` | `busi_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` | reference |
| `src_bill_type_id` | `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` | reference |
| `write_off_src_data_id` | `write_off_src_data_id` | `` | reference |
| `fi_event_id` | `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` | reference |
| `busi_dept_id` | `busi_dept_id` | `ucf-org-center.org_unit_tree_ref` | reference |
| `period_id` | `period_id` | `finbd.bd_period` | reference |
| `creator` | `creator` | `bip-usercenter.bip_user_ref` | reference |
| `control_scope_id` | `control_scope_id` | `finbd.bd_controlscoperef` | reference |
| `stock_org_id` | `stock_org_id` | `ucf-org-center.bd_inventoryorg` | reference |
| `accbook_id` | `accbook_id` | `fiepub.fiepub_accountbookref` | reference |
| `osm_org_id` | `osm_org_id` | `ucf-org-center.org_pure_tree_ref` | reference |
| `req_org_id` | `req_org_id` | `ucf-org-center.org_pure_tree_ref` | reference |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` | reference |
| `free_ch_id` | `free_ch_id` | `` | reference |
| `ytenant_id` | `ytenant_id` | `` | reference |
| `warehouse_id` | `warehouse_id` | `productcenter.aa_warehouse` | reference |
| `opp_profit_center_id` | `opp_profit_center_id` | `finbd.bd_allaccbodyref_inner` | reference |
| `req_dept_id` | `req_dept_id` | `ucf-org-center.org_unit_tree_ref` | reference |
| `invoice_supplier_id` | `invoice_supplier_id` | `yssupplier.aa_vendor` | reference |
| `acc_year_id` | `acc_year_id` | `finbd.bd_periodyear` | reference |
| `customer_id` | `customer_id` | `productcenter.aa_invoicemerchantref` | reference |

## 完整字段列表

> 共 104 个直连字段 + 9 个继承字段

### 文本字段 (text) (36个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `event_entry_group_id` | `event_entry_group_id` | String | 生事项分录发送eos单据id | true | 200 |
| `acc_year_code` | `acc_year_code` | String | 会计年编码 | true | 200 |
| `busi_bill_id` | `busi_bill_id` | String | 业务单据id | true | 22 |
| `busi_bill_no` | `busi_bill_no` | String | 业务单据号 | true | 36 |
| `busi_event` | `busi_event` | String | 业务事项 | true | 22 |
| `busi_id` | `busi_id` | String |  会计事务id | true | 22 |
| `busi_period_code` | `busi_period_code` | String | 会计期间 | true | 20 |
| `busi_src_bill_id` | `busi_src_bill_id` | String | 业务来源单据id | true | 200 |
| `busi_src_bill_no` | `busi_src_bill_no` | String | 业务来源单据号 | true | 200 |
| `code` | `code` | String | 会计事务记录号 | true | 36 |
| `dtc_gtxid` | `dtc_gtxid` | String | 全局事务ID | true | 200 |
| `event_entry_msg` | `event_entry_msg` | String | 事项分录消息 | true | 255 |
| `event_voucher_id` | `event_voucher_id` | String | 事项凭证id | true | 22 |
| `event_voucher_no` | `event_voucher_no` | String |  事项凭证号 | true | 36 |
| `fi_event_code` | `fi_event_code` | String | 会计事务类型编码 | true | 22 |
| `gl_voucher_id` | `gl_voucher_id` | String | 总账凭证id | true | 22 |
| `gl_voucher_no` | `gl_voucher_no` | String | 总账凭证号 | true | 36 |
| `period_code` | `period_code` | String |  记账会计期间 | true | 20 |
| `period_status` | `period_status` | String | 业务期间状态标识 | true | 200 |
| `post_status_code` | `post_status_code` | String | 事项分录生成状态码 | true | 200 |
| `remarks` | `remarks` | String |  表头备注 | true | 255 |
| `res_voucher_id` | `res_voucher_id` | String |  责任会计凭id | true | 22 |
| `res_voucher_no` | `res_voucher_no` | String |  责任会计凭证号 | true | 36 |
| `reviewer` | `reviewer` | String | 审核人 | true | 36 |
| `src_app_code` | `src_app_code` | String | 来源应用编码 | true | 200 |
| `src_app_id` | `src_app_id` | String | 来源应用 | true | 22 |
| `src_bill_id` | `src_bill_id` | String | 来源单据id | true | 22 |
| `src_bill_no` | `src_bill_no` | String | 来源单据号 | true | 36 |
| `src_data_id` | `src_data_id` | String | 来源数据标识 | true | 200 |
| `src_data_type` | `src_data_type` | String | 来源数据类型 | true | 200 |
| `sterilisation_bill_id` | `sterilisation_bill_id` | String | 冲销单据ID | true | 22 |
| `sterilisation_bill_no` | `sterilisation_bill_no` | String | 冲销单据编号 | true | 36 |
| `sterilisation_finance_code` | `sterilisation_finance_code` | String | 冲销会计事务编号 | true | 36 |
| `sterilisation_finance_id` | `sterilisation_finance_id` | String |  冲销会计事务ID | true | 22 |
| `write_off_src_data_code` | `write_off_src_data_code` | String | 冲销来源会计事务号 | true | 200 |
| `id` | `id` | String | 主键 | true | 22 |

### 引用字段 (quote) (33个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `acc_year_id` | `acc_year_id` | c1fb756f-95cc-4faf-b1bf-7cea0aa99973 | 会计年ID | true | 36 |
| `accbook_id` | `accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | 账簿 | true | 36 |
| `accentity_id` | `accentity_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |  会计主体 | true | 36 |
| `accpurpose_id` | `accpurpose_id` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | 核算目的 | true | 36 |
| `busi_bill_type_id` | `busi_bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | 业务单据类型 | true | 36 |
| `busi_cost_center_id` | `busi_cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | 成本中心 | true | 36 |
| `busi_dept_id` | `busi_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | 部门 | true | 36 |
| `busi_period_id` | `busi_period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | 会计期间(系统) | true | 36 |
| `busi_trade_type_id` | `busi_trade_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 业务单据交易类型 | true | 36 |
| `control_scope_id` | `control_scope_id` | b382fbab-2ecb-4733-bdb3-a6d3b81bf726 | 管控范围 | true | 36 |
| `customer_id` | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 客户 | true | 36 |
| `fi_event_id` | `fi_event_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | 会计事务类型id | true | 36 |
| `invoice_supplier_id` | `invoice_supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | 开票供应商 | true | 36 |
| `mm_org_id` | `mm_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 生产组织 | true | 36 |
| `opp_profit_center_id` | `opp_profit_center_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |  对方利润中心 | true | 36 |
| `osm_org_id` | `osm_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 委外组织 | true | 36 |
| `period_id` | `period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | 记账会计期间id | true | 36 |
| `profit_center_id` | `profit_center_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |  利润中心 | true | 36 |
| `pur_org_id` | `pur_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | 采购组织 | true | 36 |
| `req_cost_center_id` | `req_cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | 需求部门成本中心 | true | 36 |
| `req_dept_id` | `req_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | 需求部门 | true | 36 |
| `req_org_id` | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 需求组织 | true | 36 |
| `sale_org_id` | `sale_org_id` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 | 销售组织 | true | 36 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 来源单据交易类型 | true | 36 |
| `src_bill_type_id` | `src_bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | 来源单据类型 | true | 36 |
| `stock_org_id` | `stock_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |  库存组织 | true | 36 |
| `supplier_id` | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | 供货供应商 | true | 36 |
| `warehouse_id` | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |  仓库 | true | 36 |
| `write_off_reason` | `write_off_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 | 冲销原因 | true | 36 |
| `write_off_src_data_id` | `write_off_src_data_id` | a15694b9-27ef-461a-9830-1924714141ad | 冲销来源会计事务id | true | 36 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 | true | 36 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 | true | 36 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id | true | 36 |

### 日期字段 (date) (5个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `book_date` | `book_date` | String | 记账日期 | true | 23 |
| `busi_bill_date` | `busi_bill_date` | String | 业务单据日期 | true | 23 |
| `rate_date` | `rate_date` | String | 汇率日期 | true | 23 |
| `review_date` | `review_date` | String | 审核日期 | true | 23 |
| `src_bill_date` | `src_bill_date` | String | 来源单据日期 | true | 23 |

### 日期时间字段 (dateTime) (5个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `register_time` | `register_time` | Date | 登账时间 | true | 23 |
| `send_version` | `send_version` | Date | 会计事务数据版本号 | true | 50 |
| `pubts` | `pubts` | DateTime | 时间戳 | true |  |
| `create_time` | `create_time` | DateTime | 创建时间 | true |  |
| `modify_time` | `modify_time` | DateTime | 修改时间 | true |  |

### 布尔字段 (switch) (6个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `bln_inner_settle` | `bln_inner_settle` | Boolean | 是否内部交易 | true | 1 |
| `bln_inserted` | `bln_inserted` | Boolean | 插单标识 | true | 1 |
| `bln_paired` | `bln_paired` | Boolean | 是否成对单据 | true | 1 |
| `bln_return` | `bln_return` | Boolean |  退货标识 | true | 1 |
| `bln_send_goods` | `bln_send_goods` | Boolean | 发出商品标识 | true | 1 |
| `bln_write_off` | `bln_write_off` | Boolean | 冲销标识 | true | 1 |

### 枚举字段 (singleOption) (14个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `bill_direction` | `bill_direction` | fieia_billDirection | 单据方向 | true | 36 |
| `carryover_cost_bill_type` | `carryover_cost_bill_type` | fieia_carryoverCostBillTypeEnum | 结转成本单据 | true | 36 |
| `entrust_proc_m_direction` | `entrust_proc_m_direction` | fieia_direction | 委外业务方向 | true | 36 |
| `entrusted_proc_direction` | `entrusted_proc_direction` | fieia_direction | 受托加工方向 | true | 36 |
| `entry_mode` | `entry_mode` | EntryModeEnum | 分录方式 | true | 36 |
| `event_entry_status` | `event_entry_status` | fieia_eventEntryStatus | 事项分录状态 | true | 36 |
| `ia_busi_type` | `ia_busi_type` | BusiTypeEnum | 存货业务类型 | true | 36 |
| `in_stock_type` | `in_stock_type` | InStockType | 入库类型 | true | 36 |
| `input_tax_acc_direction` | `input_tax_acc_direction` | fieia_direction | 进项税方向 | true | 36 |
| `period_type` | `period_type` | fieia_periodType | 期间类型 | true | 36 |
| `reduce_price_ready_direction` | `reduce_price_ready_direction` | fieia_direction | 跌价准备方向 | true | 36 |
| `send_goods_direction` | `send_goods_direction` | fieia_direction |  发出商品方向 | true | 36 |
| `src_fi_event_type` | `src_fi_event_type` | fieia_financeSrcType | 事务来源类型 | true | 36 |
| `write_off_state` | `write_off_state` | eia_writeOffStatusEnum | 冲销状态 | true | 36 |

### 整数字段 (int) (1个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `dtc_status` | `dtc_status` | Integer | 全局事务状态 | true |  |

### 短整数字段 (short) (1个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `dr` | `dr` | Short | 逻辑删除 | true |  |

### 长整数字段 (long) (1个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `src_bill_version` | `src_bill_version` | Long | 来源单据版本 | true | 22 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `free_ch_id` | `free_ch_id` | b4306bd6-61bd-4032-89aa-0ad9f7d02c61 | 流水账自定义项特征 | true | 200 |

###  (1个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `` | `` | 29246951-146b-4d57-82e5-bf809faa454e | 流水账子表 |  |  |

### 继承字段 (9个)

| 字段名 | 数据库列 | 来源接口 | 类型 | 显示名 |
|--------|---------|---------|------|------|
| `dr` | `dr` | 逻辑删除 | Short | 逻辑删除 |
| `code` | `code` | 编码 | String | 编码 |
| `ytenant_id` | `ytenant_id` | 统一租户接口 | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `dtc_gtxid ` | `dtc_gtxid ` | 成本流水账业务财务事务 | String | yts全局分布式事务ID |
| `dtc_status` | `dtc_status` | 成本流水账业务财务事务 | Short | 分布式事务的状态 |
| `create_time` | `create_time` | 审计信息 | Timestamp | 创建时间 |
| `creator` | `creator` | 审计信息 | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 审计信息 | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `modify_time` | `modify_time` | 审计信息 | Timestamp | 修改时间 |
