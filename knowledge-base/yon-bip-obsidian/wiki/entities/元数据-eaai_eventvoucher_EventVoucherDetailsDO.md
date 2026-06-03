---
tags: [BIP, 元数据, 数据字典, eaai.eventvoucher.EventVoucherDetailsDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 事项分录明细 (`eaai.eventvoucher.EventVoucherDetailsDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aai_voucher_record` | domain：`yonbip-fi-eaai` | 应用：`AAI` | 业务对象ID：`98f70a5f-8833-436d-bfcc-966d309e5c22`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 事项分录明细 |
| 物理表 | `aai_voucher_record` |
| 数据库 schema | `yonbip-fi-eaai` |
| 所属应用 | `AAI` |
| 直连字段 | 292 个 |
| 关联引用 | 119 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `CashFlowDOList` | `eaai.eventvoucher.CashFlowDO` | composition |

## 关联引用 (119个)

| 字段名 | 引用类型 |
|--------|---------|
| `inventory_org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `contract_type` | `ucfbasedoc.bd_billtyperef` |
| `invoice_type_id` | `ucfbasedoc.bd_invoiceref` |
| `supplier_type_id` | `yssupplier.aa_vendorclassificationref` |
| `wbs` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `cost_element_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `cost_item_id` | `finbd.bd_expenseitemallref` |
| `fa_subcategory_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `goods_sort` | `productcenter.pc_presentationclassref` |
| `fa_usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `fund_busi_obj` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `global_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `activity_type_id` | `finbd.bd_activitytyperef` |
| `main_unit_id` | `productcenter.pc_unitref` |
| `corp_id` | `finbd.bd_allaccbodyref_inner` |
| `src_system_id` | `fiepub.fiepub_sourceapplicationref` |
| `control_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `two_level_accentity_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `cost_collector_id` | `finbd.bd_costcollectoritem01listref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `prod_org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `src_accbook_id` | `fiepub.fiepub_accountbookref` |
| `ar_rconfim_rule` | `fiepub.fiepub_receivable_confirm_ref` |
| `rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `activity` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `source_trad_type` | `ucfbasedoc.bd_billtyperef` |
| `busi_dept_id` | `ucf-org-center.admin_dept_tree_ref_na` |
| `busi_event_id` | `yonbip-fi-eeac.fieeac_busi_event_treeref` |
| `payment_type` | `finbd.bd_paymenttyperef` |
| `person_attributes` | `ucf-staff-center.bd_psnl_catg_ref` |
| `def3_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `cost_element_id` | `fiepub.fiepub_accsubjectref` |
| `customer_id` | `productcenter.baseMerchantRef` |
| `fa_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `income_confirm_rule` | `fiepub.fiepub_income_confirm_ref` |
| `merge_rule_id` | `` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `dept_nature` | `ucf-org-center.org_deptTyperef` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `opp_accentity_id` | `finbd.bd_allaccbodyref` |
| `employee_id` | `ucf-staff-center.bd_staff_all_ref` |
| `inner_org` | `finbd.bd_allaccbodyref` |
| `ori_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `outsourcing_org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `def1_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `fa_mgmt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `group_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `fa_impairment_reason` | `yonbip-fi-efa.fa_impairmentreasonref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `material_sort` | `productcenter.pc_managementclassref` |
| `sales_order_id` | `udinghuo.voucher_orderlistref` |
| `src_trad_type` | `ucfbasedoc.bd_billtyperef` |
| `salary_item` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `def1_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `financial_product` | `yonbip-fi-ctmtlm.tlm_financialProductAllRef` |
| `org_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `accsubject_id` | `fiepub.fiepub_accsubjectref` |
| `cost_item_type_id` | `finbd.bd_expenseitemtyperef` |
| `fa_impairment_unit_id` | `yonbip-fi-efa.fa_impairmentunit_ref` |
| `acc_book_property_id` | `fiepub.epub_accountbookpropertyref` |
| `bank_account` | `ucfbasedoc.bd_enterprisebank` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `warehouse_keeper_id` | `ucf-staff-center.bd_staff_all_ref` |
| `salesman_id` | `ucf-staff-center.bd_staff_all_ref` |
| `` | `` |
| `fa_add_way` | `yonbip-fi-efa.at_addwayref` |
| `fi_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `free_ch_id` | `` |
| `fa_position_id` | `ucf-amc-ambd.ampub_location_ref` |
| `project_class` | `ucfbasedoc.bd_projectclasstreeref` |
| `cost_field` | `yonbip-fi-eia.RefTable_0e6f869743` |
| `bank_id` | `ucfbasedoc.bd_bankdotref` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `cash_flow_attach_item` | `fiepub.fiepub_cashflowitecommref` |
| `def2_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `header_id` | `` |
| `opp_fa_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `control_scope_id` | `finbd.bd_controlscoperef` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `receive_agreement` | `ucfbasedoc.bd_receiveagreementref` |
| `fa_reduce_way` | `finbd.bd_reducewayref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `fa_use_dept` | `ucf-org-center.org_unit_tree_ref` |
| `multi_accentity_trans_id` | `finbd.bd_allaccbodyref` |
| `material_cost_sort` | `productcenter.pc_costclassref` |
| `opp_activity_type_id` | `finbd.bd_activitytyperef` |
| `opp_writeoff_subject` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `accsubject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `customer_type_id` | `productcenter.aa_custcategoryref` |
| `def3_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `src_bill_org_id` | `finbd.bd_allaccbodyref_inner` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `settle_mode` | `productcenter.aa_settlemethodref` |
| `accbook_type_id` | `fiepub.fiepub_accountbooktypelistref` |
| `fi_event_id` | `yonbip-fi-eeac.fieeac_fievent_ref` |
| `maker_id` | `bip-usercenter.bip_user_ref` |
| `business_partner_id` | `productcenter.base_businesspartnerref` |
| `voucher_type` | `fiepub.epub_vouchertype_ref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `cost_component_id` | `fiepub.epub_component_ref` |
| `def2_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `mat_ch_id` | `` |
| `busi_org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `sales_order_row_id` | `developplatform.RefTable_5f2b718276` |
| `cash_account` | `ucfbasedoc.bd_enterprisecashacct` |
| `pay_agreement` | `ucfbasedoc.bd_payagreementref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `cash_flow_main_item` | `fiepub.fiepub_cashflowitecommref` |

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

> 共 292 个直连字段

### 文本字段 (94个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bank_reconciliation_no` | `bank_reconciliation_no` | String | 银行对账码 |
| `batch_no` | `batch_no` | String | 批次号 |
| `busi_date` | `busi_date` | String | 业务日期 |
| `busi_rel_message_1` | `busi_rel_message_1` | String | 业务关联信息1 |
| `busi_rel_message_10` | `busi_rel_message_10` | String | 业务关联信息10 |
| `busi_rel_message_2` | `busi_rel_message_2` | String | 业务关联信息2 |
| `busi_rel_message_3` | `busi_rel_message_3` | String | 业务关联信息3 |
| `busi_rel_message_4` | `busi_rel_message_4` | String | 业务关联信息4 |
| `busi_rel_message_5` | `busi_rel_message_5` | String | 业务关联信息5 |
| `busi_rel_message_6` | `busi_rel_message_6` | String | 业务关联信息6 |
| `busi_rel_message_7` | `busi_rel_message_7` | String | 业务关联信息7 |
| `busi_rel_message_8` | `busi_rel_message_8` | String | 业务关联信息8 |
| `busi_rel_message_9` | `busi_rel_message_9` | String | 业务关联信息9 |
| `coa_plan_id` | `coa_plan_id` | String | 分摊方案id |
| `coa_type_id` | `coa_type_id` | String | 分摊方案类型 |
| `contract_no` | `contract_no` | String | 合同编号 |
| `control_convert_type` | `control_convert_type` | String | 管控范围币折算参数 |
| `convert_type` | `convert_type` | String | 本币折算参数 |
| `cooperate_no` | `cooperate_no` | String | 协同号 |
| `currtype_convert_param` | `currtype_convert_param` | String | 多本币自动折算 |
| `direction` | `direction` | String | 方向 |
| `edit_rule_id` | `edit_rule_id` | String | 修改规则 |
| `fa_change_direction` | `fa_change_direction` | String | 固定资产调整方向 |
| `fa_code` | `fa_code` | String | 固定资产编码 |
| `fa_entity_code` | `fa_entity_code` | String | 固定资产实物编码 |
| `fa_label_no` | `fa_label_no` | String | 固定资产标签号 |
| `fa_location` | `fa_location` | String | 固定资产存放地点 |
| `fa_name` | `fa_name` | String | 固定资产名称 |
| `fi_app_code` | `fi_app_code` | String | 财务应用编码 |
| `fi_event_fullname` | `fi_event_fullname` | String | 会计事务fullname |
| `fi_event_record_id` | `fi_event_record_id` | String | 会计事务对应的记录的id |
| `fi_event_record_no` | `fi_event_record_no` | String | 会计事务记录号 |
| `fi_event_row_id` | `fi_event_row_id` | String | 会计事务行id |
| `fi_event_subject_field` | `fi_event_subject_field` | String | 反写科目对应的科目字段路径 |
| `fi_event_subject_fullname` | `fi_event_subject_fullname` | String | 反写科目对应的对象的fullname |
| `fi_event_subject_row_id` | `fi_event_subject_row_id` | String | 反写科目对应的对象的行id |
| `gl_group_id` | `gl_group_id` | String | 总账凭证分组ID |
| `gl_voucher_id` | `gl_voucher_id` | String | 总账凭证ID |
| `gl_voucher_no` | `gl_voucher_no` | String | 总账凭证号 |
| `global_convert_type` | `global_convert_type` | String | 全局币折算参数 |
| `group_convert_type` | `group_convert_type` | String | 集团币折算参数 |
| `invoice_code` | `invoice_code` | String | 发票代码 |
| `invoice_no` | `invoice_no` | String | 发票号码 |
| `make_date` | `make_date` | String | 制单日期 |
| `merge_record_id` | `merge_record_id` | String | 合并后明细行主键(总账凭证明细行主键 |
| `note_no` | `note_no` | String | 票据号 |
| `opp_clue_id` | `opp_clue_id` | String | 对方线索 |
| `order_no` | `order_no` | String | 订单编号 |
| `ori_bill_id` | `ori_bill_id` | String | 源头单据id |
| `ori_bill_no` | `ori_bill_no` | String | 源头单据号 |
| `ori_row_id` | `ori_row_id` | String | 源头单据行ID |
| `period_code` | `period_code` | String | 会计期间code |
| `period_year` | `period_year` | String | 期间年 |
| `produce_product` | `produce_product` | String | 生产产品 |
| `product_order_id` | `product_order_id` | String | 产品订单 |
| `production_order_id` | `production_order_id` | String | 生产订单 |
| `production_order_row` | `production_order_row` | String | 生产订单行 |
| `remarks` | `remarks` | String | 备注 |
| `repair_order_id` | `repair_order_id` | String | 维修工单 |
| `retailer_id` | `retailer_id` | String | 散户 |
| `send_ecc_state` | `send_ecc_state` | String | 传成本状态(已过期) |
| `settle_redflush_fi_app_code` | `settle_redflush_fi_app_code` | String | 红冲财务应用编码 |
| `settle_redflush_fi_app_id` | `settle_redflush_fi_app_id` | String | 红冲财务应用ID |
| `settle_redflush_period_year` | `settle_redflush_period_year` | String | 红冲的期间年编码 |
| `settle_redflush_type` | `settle_redflush_type` | String | 红冲标识 |
| `settle_redflush_voucher_id` | `settle_redflush_voucher_id` | String | 被红冲分录ID |
| `smart_check_no` | `smart_check_no` | String | 勾兑号 |
| `src_app_code` | `src_app_code` | String | 来源应用编码 |
| `src_bill_date` | `src_bill_date` | String | 来源单据日期 |
| `src_bill_id` | `src_bill_id` | String | 来源单据id |
| `src_bill_no` | `src_bill_no` | String | 来源单据号 |
| `src_busi_obj_code` | `src_busi_obj_code` | String | 来源业务对象编码 |
| `src_module` | `src_module` | String | 来源模块 |
| `src_row_id` | `src_row_id` | String | 来源单据行ID |
| `summary` | `summary` | String | 摘要 |
| `tax_code` | `tax_code` | String | 税码 |
| `verify_code` | `verify_code` | String | 核销编码 |
| `verify_no` | `verify_no` | String | 核销号 |
| `verify_src` | `verify_src` | String | 核销来源 |
| `voucher_no` | `voucher_no` | String | 事项分录编码 |
| `voucher_tmpl_b_id` | `voucher_tmpl_b_id` | String | 凭证模板分录id |
| `voucher_tmpl_code` | `voucher_tmpl_code` | String | 凭证模板编码 |
| `voucher_tmpl_id` | `voucher_tmpl_id` | String | 凭证模板ID |
| `writeoff_oppose_no` | `writeoff_oppose_no` | String | 冲销对方编码-事项分录 |
| `writeoffed_voucher_id` | `writeoffed_voucher_id` | String | 被冲销凭证ID |
| `ytenant_id` | `ytenant_id` | String | 租户 |
| `ori_system` | `ori_system` | String | 源头系统 |
| `external_source_system_id` | `external_source_system_id` | String | 外部来源系统id |
| `external_source_system_name` | `external_source_system_name` | String | 外部来源系统名称 |
| `external_source_data_id` | `external_source_data_id` | String | 外部来源数据标识 |
| `external_source_data_type` | `external_source_data_type` | String | 外部来源数据类型 |
| `external_source_data_id_h` | `external_source_data_id_h` | String | 主表外部来源数据标识 |
| `external_source_data_code` | `external_source_data_code` | String | 外部来源数据编码 |
| `id` | `id` | String | 主键 |

### 引用字段 (116个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cost_collector_id` | `cost_collector_id` | 22c0d2ea-cdd1-4f0d-84c0-51399359321a | 成本收集器 |
| `multi_accentity_trans_id` | `multi_accentity_trans_id` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 交易主体 |
| `ar_rconfim_rule` | `ar_rconfim_rule` | 6a35b065-d5fb-496e-81dc-b5d776992cd5 | 应收确认规则 |
| `acc_book_property_id` | `acc_book_property_id` | 887e9fc5-8422-44b9-a5ab-b262a82a6144 | 账簿属性 |
| `accsubject_vid` | `accsubject_vid` | ce8d451a-3779-4a48-ba8b-894e68a87fed | 科目多版本id |
| `accbook_id` | `accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | 账簿 |
| `accbook_type_id` | `accbook_type_id` | 9e073034-63ae-4aba-a113-1b28396f35e6 | 账簿类型 |
| `accentity_id` | `accentity_id` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | 核算目的 |
| `accsubject_id` | `accsubject_id` | b56c7f52-183c-4cea-a310-d6ee902365af | 会计科目 |
| `activity` | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | 活动 |
| `activity_type_id` | `activity_type_id` | acbdbe5a-3db1-4c88-aa59-9d89338af77b | 资源对象 |
| `auditor` | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 审核人 |
| `bank_account` | `bank_account` | fbc20885-a507-45bd-a986-74d3fc28d38a | 银行账户 |
| `bank_id` | `bank_id` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | 银行网点 |
| `busi_dept_id` | `busi_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | 业务部门 |
| `busi_event_id` | `busi_event_id` | 2440bd9e-542c-47ea-9070-dbfcaf3eed65 | 业务事项ID |
| `busi_org_id` | `busi_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 业务组织 |
| `business_partner_id` | `business_partner_id` | c1627369-6457-4828-883d-756b79bd0f46 | 业务伙伴 |
| `cash_account` | `cash_account` | 39f4ff02-fea2-4a92-adf2-37d02207f799 | 现金账户 |
| `cash_flow_attach_item` | `cash_flow_attach_item` | b109e775-1973-4764-95d6-5f6efd9f0070 | 现金流量附表项目 |
| `cash_flow_main_item` | `cash_flow_main_item` | b109e775-1973-4764-95d6-5f6efd9f0070 | 现金流量主表项目 |
| `contract_type` | `contract_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 合同类型 |
| `control_currtype_id` | `control_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 管控范围币币种 |
| `control_rate_type_id` | `control_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 管控范围币汇率类型 |
| `control_scope_id` | `control_scope_id` | b382fbab-2ecb-4733-bdb3-a6d3b81bf726 | 管控范围 |
| `corp_id` | `corp_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | 公司 |
| `cost_center_id` | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | 成本中心 |
| `cost_component_id` | `cost_component_id` | 9ca79507-a571-4739-b43b-6813863c523c | 成本组件 |
| `cost_element_id` | `cost_element_id` | b56c7f52-183c-4cea-a310-d6ee902365af | 成本要素 |
| `cost_element_vid` | `cost_element_vid` | ce8d451a-3779-4a48-ba8b-894e68a87fed | 成本要素 |
| `cost_field` | `cost_field` | 0119be07-4d2d-4cfe-89f4-18e7682aed24 | 成本域 |
| `cost_item_id` | `cost_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | 费用项目 |
| `cost_item_type_id` | `cost_item_type_id` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | 费用项目类型 |
| `currtype_id` | `currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 本币 |
| `customer_id` | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 客户 |
| `customer_type_id` | `customer_type_id` | 3198ce2d-0e64-462d-bacf-54d18171756a | 客户分类 |
| `def1_currtype_id` | `def1_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 自定义1币种 |
| `def1_rate_type_id` | `def1_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 自定义1币汇率类型 |
| `def2_currtype_id` | `def2_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 自定义2币种 |
| `def2_rate_type_id` | `def2_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 自定义2币汇率类型 |
| `def3_currtype_id` | `def3_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 自定义3币种 |
| `def3_rate_type_id` | `def3_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 自定义3币汇率类型 |
| `dept_nature` | `dept_nature` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | 部门性质 |
| `employee_id` | `employee_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | 员工 |
| `fa_add_way` | `fa_add_way` | 90b23222-89e6-49ad-8107-be12c999ca3d | 固定资产增加方式 |
| `fa_category_id` | `fa_category_id` | e3a3baa9-5255-43e2-8378-505c497511fc | 固定资产类别 |
| `fa_impairment_reason` | `fa_impairment_reason` | 8aff10cb-2442-4563-86e2-db1b868d63fd | 减值原因 |
| `fa_impairment_unit_id` | `fa_impairment_unit_id` | 1b6e5282-2c87-4941-82bc-6a333b9a7cab | 减值单元 |
| `fa_mgmt_dept_id` | `fa_mgmt_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | 固定资产管理部门 |
| `fa_position_id` | `fa_position_id` | 169a916d-6125-4f85-b67a-ba82a4cb6008 | 固定资产存放位置 |
| `fa_reduce_way` | `fa_reduce_way` | 060d7148-378e-4821-a3e2-dfaed1c85451 | 减少方式 |
| `fa_subcategory_id` | `fa_subcategory_id` | f66d1948-cc5f-49e2-9cc2-731adf89792f | 固定资产子类别 |
| `fa_usage_state_id` | `fa_usage_state_id` | 01a5dc9d-3f44-4543-a7fa-c7046979f819 | 固定资产使用状态 |
| `fa_use_dept` | `fa_use_dept` | a4352e3c-3eda-4539-a7a9-ec00799be118 | 固定资产使用部门 |
| `fi_app_id` | `fi_app_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 财务应用ID |
| `fi_event_id` | `fi_event_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | 会计事务ID |
| `financial_product` | `financial_product` | 36e41d51-4662-4717-938f-653735bb0286 | 金融产品 |
| `fund_busi_obj` | `fund_busi_obj` | e969728a-efe8-49db-86b0-5f8e18c2f098 | 资金业务对象 |
| `global_currtype_id` | `global_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 全局币币种 |
| `global_rate_type_id` | `global_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 全局币汇率类型 |
| `goods_sort` | `goods_sort` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | 商品分类 |
| `group_currtype_id` | `group_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 集团币币种 |
| `group_rate_type` | `group_rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 集团币汇率类型 |
| `header_id` | `header_id` | 02432060-86e8-4d77-baa3-289fea883ad8 | 事项分录id |
| `income_confirm_rule` | `income_confirm_rule` | eccc0509-7a53-4ccd-b62e-4517366eb283 | 收入确认规则 |
| `inner_org` | `inner_org` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 内部单位 |
| `inventory_org_id` | `inventory_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 库存组织 |
| `invoice_type_id` | `invoice_type_id` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b | 发票类型 |
| `main_unit_id` | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 主单位 |
| `maker_id` | `maker_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 制单人 |
| `material_cost_sort` | `material_cost_sort` | 80e9c421-f9e9-4752-b1e9-7c240cb2fc1f | 物料成本分类 |
| `material_id` | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料 |
| `material_sort` | `material_sort` | b295ef54-c421-4865-aca3-f5a9207a8d50 | 物料分类 |
| `merge_rule_id` | `merge_rule_id` | 13c3898d-86d1-4c2f-a1df-857a8dd4611b | 分录合并规则 |
| `opp_accentity_id` | `opp_accentity_id` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 对方会计主体 |
| `opp_activity_type_id` | `opp_activity_type_id` | acbdbe5a-3db1-4c88-aa59-9d89338af77b | 消耗资源 |
| `opp_fa_id` | `opp_fa_id` | 13e4faa9-491f-4106-97ce-3715a3e10d34 | 对方固定资产 |
| `opp_writeoff_subject` | `opp_writeoff_subject` | ce8d451a-3779-4a48-ba8b-894e68a87fed | 对方冲销科目 |
| `org_currtype_id` | `org_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 组织币币种 |
| `org_rate_type_id` | `org_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 组织币汇率类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | 源头单据类型 |
| `ori_currtype_id` | `ori_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 原币币种 |
| `outsourcing_org_id` | `outsourcing_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 委外组织 |
| `pay_agreement` | `pay_agreement` | 3cce8052-512e-4e51-9b6e-57adff40948c | 付款协议 |
| `payment_type` | `payment_type` | 14b092f3-5d27-4a47-82a0-d6bad074c9f1 | 款项类型 |
| `period_id` | `period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | 会计期间 |
| `person_attributes` | `person_attributes` | 03a11361-aad7-416c-95cd-ccd64f14d503 | 人员类别 |
| `prod_org_id` | `prod_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 生产组织 |
| `profit_center_id` | `profit_center_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | 利润中心 |
| `project_class` | `project_class` | 5924adca-3894-4034-85ac-3a1b9222c69d | 项目类别 |
| `project_id` | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | 项目 |
| `rate_type_id` | `rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 本币汇率类型 |
| `receive_agreement` | `receive_agreement` | e336f779-f1e5-4530-b6d5-fa2e5ed1c302 | 收款协议 |
| `salary_item` | `salary_item` | 36b421ee-8637-4276-a23d-36b428927090 | 薪资项目 |
| `sales_order_id` | `sales_order_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 | 销售订单 |
| `sales_order_row_id` | `sales_order_row_id` | 3722d563-08aa-453d-ac82-6b8cf906b1ab | 销售订单行 |
| `salesman_id` | `salesman_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | 业务员 |
| `settle_mode` | `settle_mode` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | 结算方式 |
| `source_trad_type` | `source_trad_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 源头交易类型 |
| `src_accbook_id` | `src_accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | 来源账簿 |
| `src_app_id` | `src_app_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 来源应用ID |
| `src_bill_org_id` | `src_bill_org_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | 来源数据的组织 |
| `src_bill_type_id` | `src_bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | 来源单据类型 |
| `src_system_id` | `src_system_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 来源系统主键 |
| `src_trad_type` | `src_trad_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 来源交易类型 |
| `supplier_id` | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | 供应商 |
| `supplier_type_id` | `supplier_type_id` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | 供应商分类 |
| `tax_subject_id` | `tax_subject_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | 税目 |
| `two_level_accentity_id` | `two_level_accentity_id` | 14302233-1394-4a70-94e1-bed51636f312 | 内部核算单元 |
| `voucher_type` | `voucher_type` | 4a2cdeef-16cd-46c6-91b6-629eaf7be9e1 | 凭证类型 |
| `warehouse_id` | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 仓库 |
| `warehouse_keeper_id` | `warehouse_keeper_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | 库管员 |
| `wbs` | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | WBS |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |

### 日期字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `expire_date` | `expire_date` | String | 到期日 |
| `fa_create_card_date` | `fa_create_card_date` | String | 固定资产建卡日期 |
| `note_date` | `note_date` | String | 票据日期 |
| `rate_date` | `rate_date` | String | 汇率日期 |
| `start_date` | `start_date` | String | 起算日 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `audit_time` | `audit_time` | Date | 审核时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |

### 枚举字段 (31个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `audit_state` | `audit_state` | fa_disposalbillstate | 审核状态 |
| `bln_acc_clear` | `bln_acc_clear` | BooleanEnum | 清账状态 |
| `bln_accrued` | `bln_accrued` | BooleanEnum | 是否被预提关联 |
| `bln_adjust_quantity` | `bln_adjust_quantity` | BooleanEnum | 是否数量调整1:是0否 |
| `bln_amt` | `bln_amt` | BooleanEnum | 是否被摊销关联 |
| `bln_aux_voucher_detail` | `bln_aux_voucher_detail` | BooleanEnum | 是否为辅凭证分录 |
| `bln_begin_period_split` | `bln_begin_period_split` | BooleanEnum | 期初拆分数据标识 |
| `bln_begin_split_completed` | `bln_begin_split_completed` | BooleanEnum | 期初被完全拆分标识 |
| `bln_coa` | `bln_coa` | BooleanEnum | 是否被分摊 |
| `bln_effective` | `bln_effective` | BooleanEnum | 事项分录状态 |
| `bln_gift` | `bln_gift` | BooleanEnum | 赠品 |
| `bln_manual` | `bln_manual` | BooleanEnum | 手工凭证 |
| `bln_period_begin` | `bln_period_begin` | BooleanEnum | 期初事项分录 |
| `bln_recalculate` | `bln_recalculate` | BooleanEnum | 重算 |
| `bln_red_remark` | `bln_red_remark` | BooleanEnum | 红字标志 |
| `bln_resp_voucher` | `bln_resp_voucher` | BooleanEnum | 责任凭证分录特殊标记 |
| `bln_writeoff` | `bln_writeoff` | BooleanEnum | 是否冲销单 |
| `control_rate_ops` | `control_rate_ops` | ExchangeRateMethod | 管控范围币汇率折算方式 |
| `def1_rate_ops` | `def1_rate_ops` | ExchangeRateMethod | 自定义币种1汇率折算方式 |
| `def2_rate_ops` | `def2_rate_ops` | ExchangeRateMethod | 自定义币种2汇率折算方式 |
| `def3_rate_ops` | `def3_rate_ops` | ExchangeRateMethod | 自定义币种3汇率折算方式 |
| `global_rate_ops` | `global_rate_ops` | ExchangeRateMethod | 全局币汇率折算方式 |
| `group_rate_ops` | `group_rate_ops` | ExchangeRateMethod | 集团币汇率折算方式 |
| `org_rate_ops` | `org_rate_ops` | ExchangeRateMethod | 组织币汇率折算方式 |
| `rate_ops` | `rate_ops` | ExchangeRateMethod | 本币汇率折算方式 |
| `rp_object_type` | `rp_object_type` | ObjectTypeEnum | 往来对象类型 |
| `send_gl_operation` | `send_gl_operation` | fieaai_sendGlOperation | 传总账操作 |
| `send_gl_state` | `send_gl_state` | fieaai_sendgl_state | 传总账状态 |
| `send_gl_type` | `send_gl_type` | fieaai_transfertoglenum | 传总账类型 |
| `voucher_category` | `voucher_category` | epca_vouchercategory | 凭证分类 |
| `writeoff_status` | `writeoff_status` | WriteOffStateEnum | 冲销状态 |

### 整数 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `attached_num` | `attached_num` | Integer | 附单据数 |
| `original_record_no` | `original_record_no` | Integer | 原分录号 |
| `period_begin_type` | `period_begin_type` | Integer | 期初余额标识 |
| `event_record_no` | `event_record_no` | Integer | 分录号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `external_source_data_version` | `external_source_data_version` | Long | 外部来源数据版本号 |

### 数值字段 (33个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `amount` | `amount` | Decimal | 本币金额 |
| `control_amount` | `control_amount` | Decimal | 管控范围币金额 |
| `control_credit_total` | `control_credit_total` | Decimal | 管控范围币贷方金额 |
| `control_debit_total` | `control_debit_total` | Decimal | 管控范围币借方金额 |
| `control_rate` | `control_rate` | Decimal | 管控范围币汇率 |
| `credit_total` | `credit_total` | Decimal | 本币贷方金额 |
| `debit_total` | `debit_total` | Decimal | 本币借方金额 |
| `def1_amount` | `def1_amount` | Decimal | 自定义1币种金额 |
| `def1_rate` | `def1_rate` | Decimal | 自定义1币汇率 |
| `def2_amount` | `def2_amount` | Decimal | 自定义2币种金额 |
| `def2_rate` | `def2_rate` | Decimal | 自定义2币汇率 |
| `def3_amount` | `def3_amount` | Decimal | 自定义3币种金额 |
| `def3_rate` | `def3_rate` | Decimal | 自定义3币汇率 |
| `global_amount` | `global_amount` | Decimal | 全局币金额 |
| `global_credit_total` | `global_credit_total` | Decimal | 全局币贷方金额 |
| `global_debit_total` | `global_debit_total` | Decimal | 全局币借方金额 |
| `global_rate` | `global_rate` | Decimal | 全局币汇率 |
| `group_amount` | `group_amount` | Decimal | 集团币金额 |
| `group_credit_total` | `group_credit_total` | Decimal | 集团币贷方金额 |
| `group_debit_total` | `group_debit_total` | Decimal | 集团币借方金额 |
| `group_rate` | `group_rate` | Decimal | 集团币汇率 |
| `org_amount` | `org_amount` | Decimal | 组织币金额 |
| `org_credit_total` | `org_credit_total` | Decimal | 组织币贷方金额 |
| `org_debit_total` | `org_debit_total` | Decimal | 组织币借方金额 |
| `org_rate` | `org_rate` | Decimal | 组织币汇率 |
| `ori_amount` | `ori_amount` | Decimal | 原币金额 |
| `plan_proportion` | `plan_proportion` | Decimal | 计划比例 |
| `quantity` | `quantity` | Decimal | 数量 |
| `rate` | `rate` | Decimal | 本币汇率 |
| `src_bill_amount` | `src_bill_amount` | Decimal | 来源数据的金额 |
| `tax_excluded_price` | `tax_excluded_price` | Decimal | 单价 |
| `tax_included_price` | `tax_included_price` | Decimal | 含税单价 |
| `tax_rate` | `tax_rate` | Decimal | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `free_ch_id` | `free_ch_id` | b669816b-6f1d-4218-9e4a-45340f03bed7 | 事项分录表体自定义项 |

### FreeCT (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `mat_ch_id` | `mat_ch_id` | 61d6104d-d7e8-4d2a-ad5f-7486873a6405 | 物料自由项特征组 |

### other (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | eb68ffcf-a665-4b0a-8aaf-97e34858958b | 现金流量项目 |
