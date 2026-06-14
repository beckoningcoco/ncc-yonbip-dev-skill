---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.ARStatement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收对账单 (`FIAR.FIAR.ARStatement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`52fe0785-56b2-4eef-9fc1-962d4f231d6c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收对账单 |
| 物理表 | `arap_ledger_g` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 93 个 |
| 子表 | 1 个 |
| 关联引用 | 30 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ARStatementBody` | `FIAR.FIAR.ARStatementBody` | composition |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `b_expense_item_id` | `finbd.bd_expenseitemref` |
| `event_id` | `` |
| `b_ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `b_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `b_project_id` | `ucfbasedoc.bd_projectNewRef` |
| `h_biz_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `h_employee_id` | `bd_staff_all_ref` |
| `b_quick_type_id` | `finbd.bd_paymenttyperef` |
| `ar_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `customer_class_id` | `productcenter.aa_custcategoryref` |
| `` | `` |
| `h_supplier_id` | `yssupplier.aa_vendor` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `h_org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `b_cost_center_id` | `finbd.bd_costcenterref` |
| `ap_subject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `b_staff_id` | `bd_staff_all_ref` |
| `b_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `ytenant_id` | `` |
| `h_src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `b_material_id` | `productcenter.productref` |
| `h_partner_id` | `productcenter.base_businesspartnerref` |
| `b_opp_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `supplier_class_id` | `yssupplier.aa_vendorclassificationref` |
| `body_id` | `` |
| `agePlan` | `fiepub.fiepub_accountageref` |
| `h_biz_bill_type_id` | `transtype.bd_billtype_gridref` |
| `h_customer_id` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 93 个直连字段

### 文本字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount_direction` | `amount_direction` | `amountDirection` | 借贷方向 |
| `ap_subject_id` | `ap_subject_id` | `apSubjectid` | 应付账款科目oid |
| `ar_subject_id` | `ar_subject_id` | `arSubjectid` | 应收账款科目oid |
| `h_biz_bill_code` | `h_biz_bill_code` | `bizBillCode` | 单据编号 |
| `b_remarks` | `b_remarks` | `bremarks` | 备注(表体) |
| `b_contract_no` | `b_contract_no` | `contractNo` | 合同号 |
| `digest` | `digest` | `digest` | 处理摘要 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `h_event_code` | `h_event_code` | `eventCode` | 会计事务号 |
| `expire_date` | `expire_date` | `expireDate` | 到期日 |
| `h_remarks` | `h_remarks` | `hremarks` | 备注(表头) |
| `id` | `id` | `id` | 主键 |
| `b_invoice_no` | `b_invoice_no` | `invoiceNo` | 发票号 |
| `local_clear_time` | `local_clear_time` | `localClearTime` | 本币清账日期 |
| `h_object_type` | `h_object_type` | `objectType` | 往来对象类型 |
| `b_order_no` | `b_order_no` | `orderNo` | 订单号 |
| `orderprint0` | `orderprint0` | `orderprint0` | 账龄字段0 |
| `orderprint1` | `orderprint1` | `orderprint1` | 账龄字段1 |
| `orderprint2` | `orderprint2` | `orderprint2` | 账龄字段2 |
| `orderprint3` | `orderprint3` | `orderprint3` | 账龄字段3 |
| `orderprint4` | `orderprint4` | `orderprint4` | 账龄字段4 |
| `orderprint5` | `orderprint5` | `orderprint5` | 账龄字段5 |
| `orderprint6` | `orderprint6` | `orderprint6` | 账龄字段6 |
| `orderprint7` | `orderprint7` | `orderprint7` | 账龄字段7 |
| `orderprint8` | `orderprint8` | `orderprint8` | 账龄字段8 |
| `orderprint9` | `orderprint9` | `orderprint9` | 账龄字段9 |
| `ori_arap_event_type` | `ori_arap_event_type` | `oriArapEventType` | 源头事务类型 |
| `ori_grandson_id` | `ori_grandson_id` | `oriGrandsonid` | 源头核算BO |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agePlan` | `agePlan` | `agePlan` | 账龄方案 |
| `ap_subject_vid` | `ap_subject_vid` | `apSubjectVid` | 应付账款科目vid |
| `ar_subject_vid` | `ar_subject_vid` | `arSubjectVid` | 应收账款科目 |
| `h_biz_bill_type_id` | `h_biz_bill_type_id` | `bizBillType` | 业务事项 |
| `h_biz_bill_trade_type_id` | `h_biz_bill_trade_type_id` | `bizTradeType` | 交易类型 |
| `body_id` | `body_id` | `bodyID` | 流水账明细表id |
| `b_cost_center_id` | `b_cost_center_id` | `costCenter` | 成本中心 |
| `creator` | `creator` | `creator` | 创建人 |
| `h_customer_id` | `h_customer_id` | `customer` | 客户 |
| `customer_class_id` | `customer_class_id` | `customerClass` | 客户分类 |
| `b_dept_id` | `b_dept_id` | `dept` | 部门 |
| `h_employee_id` | `h_employee_id` | `employee` | 员工 |
| `event_id` | `event_id` | `eventID` | 流水账主表id |
| `b_expense_item_id` | `b_expense_item_id` | `expenseItem` | 费用项目 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `b_material_id` | `b_material_id` | `material` | 物料 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `b_opp_procenter_id` | `b_opp_procenter_id` | `oppProCenter` | 对方利润中心 |
| `h_org_id` | `h_org_id` | `org` | 业务组织 |
| `b_ori_currency_id` | `b_ori_currency_id` | `oriCurrency` | 币种 |
| `h_partner_id` | `h_partner_id` | `partner` | 业务伙伴 |
| `b_procenter_id` | `b_procenter_id` | `proCenter` | 利润中心 |
| `b_project_id` | `b_project_id` | `project` | 项目 |
| `b_quick_type_id` | `b_quick_type_id` | `quickType` | 款项类型 |
| `h_src_app_id` | `h_src_app_id` | `srcApp` | 来源应用 |
| `b_staff_id` | `b_staff_id` | `staff` | 业务员 |
| `h_supplier_id` | `h_supplier_id` | `supplier` | 供应商 |
| `supplier_class_id` | `supplier_class_id` | `supplierClass` | 供应商分类 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `h_acc_date` | `h_acc_date` | `accDate` | 记账日期 |
| `dateRange` | `dateRange` | `dateRange` | 日期范围 |
| `deadline` | `deadline` | `deadLine` | 截止日期 |
| `h_src_bill_date` | `h_src_bill_date` | `srcBillDate` | 单据日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agePlanDateType` | `agePlanDateType` | `agePlanDateType` | 账龄基准日期 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 会计事务 |
| `h_bln_effect` | `h_bln_effect` | `blnEffect` | 生效状态 |
| `dateType` | `dateType` | `dateType` | 日期类型 |
| `demonstrations` | `demonstrations` | `demonstrations` | 展示方式 |
| `detail_granularity` | `detail_granularity` | `detailGranularity` | 明细显示粒度 |
| `displayWay_reporter` | `displayWay_reporter` | `displayWayReporter` | 期初展示方式 |
| `displaydirection` | `displaydirection` | `displaydirection` | 红字应收展示方向 |
| `isEstimated` | `isEstimated` | `isEstimated` | 包含暂估 |
| `isShowWriteoff` | `isShowWriteoff` | `isShowWriteoff` | 仅包含未核销 |
| `src_arap_event_type` | `src_arap_event_type` | `srcArapEventType` | 来源会计事务 |

### 数值字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除标识 |
| `noDueAmount` | `noDueAmount` | `noDueAmount` | 未逾期合计 |
| `order0` | `order0` | `order0` | 账龄字段0(金额) |
| `order1` | `order1` | `order1` | 账龄字段1(金额) |
| `order2` | `order2` | `order2` | 账龄字段2(金额) |
| `order3` | `order3` | `order3` | 账龄字段3(金额) |
| `order4` | `order4` | `order4` | 账龄字段4(金额) |
| `order5` | `order5` | `order5` | 账龄字段5(金额) |
| `order6` | `order6` | `order6` | 账龄字段6(金额) |
| `order7` | `order7` | `order7` | 账龄字段7(金额) |
| `order8` | `order8` | `order8` | 账龄字段8(金额) |
| `order9` | `order9` | `order9` | 账龄字段9(金额) |
| `ori_amount` | `ori_amount` | `oriAmount` | 合计 |
| `oriAmountCredit` | `oriAmountCredit` | `oriAmountCredit` | 本期贷方 |
| `oriAmountDebit` | `oriAmountDebit` | `oriAmountDebit` | 本期借方 |
| `overDueAmount` | `overDueAmount` | `overDueAmount` | 已逾期合计 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ARStatementBody` | 应收对账明细表 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dataRange` | `dataRange` | `dataRange` | 数据范围 |
