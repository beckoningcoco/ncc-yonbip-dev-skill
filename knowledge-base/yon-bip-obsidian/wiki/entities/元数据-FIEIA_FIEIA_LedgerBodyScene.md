---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.LedgerBodyScene]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料明细 (`FIEIA.FIEIA.LedgerBodyScene`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`7a81b995-4432-4f45-9738-2547c307759a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料明细 |
| 物理表 | `ia_ledger_b` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 342 个 |
| 子表 | 2 个 |
| 关联引用 | 95 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `costItems` | `FIEIA.FIEIA.FiEventCostItemVO` | composition |
| `costElements` | `FIEIA.FIEIA.FiEventCostElementsVO` | composition |

## 关联引用 (95个)

| 字段名 | 引用类型 |
|--------|---------|
| `mo_carry_down_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `order_trade_type_id` | `transtype.bd_billtyperef` |
| `product_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs_id` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `busi_event` | `yonbip-fi-eeac.RefTable_02c132dc2` |
| `ipv_price_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `collector_id` | `finbd.bd_costcollectoritem01listref` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `sale_org_id` | `ucf-org-center.bd_salesorg_na` |
| `ipv_price_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `busi_wbs_id` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `oo_carry_down_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `busi_cost_center_id` | `finbd.bd_costcenterref` |
| `busi_trade_type_id` | `transtype.bd_billtyperef` |
| `org_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `oo_carry_down_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `mm_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `work_center_id` | `engineeringdata.ed_workcenter_ref` |
| `req_cost_center_id` | `finbd.bd_costcenterref` |
| `global_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `busi_bill_type_id` | `transtype.bd_billtypetreeref` |
| `en_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `group_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `period_id` | `finbd.bd_period` |
| `opposite_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `product_id` | `productcenter.baseProductRef` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `en_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `req_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `free_ch_id` | `` |
| `mainbus_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `ppv_price_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `ppv_price_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `opp_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `transfer_carry_down_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `entrust_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `header_id` | `` |
| `req_dept_id` | `ucf-org-center.admin_dept_tree_ref_na` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `accbook_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `` | `` |
| `ipv_rate_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `mo_carry_down_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `supplier_id` | `yssupplier.aa_vendorSimpleRef` |
| `activity_id` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `oo_trade_type_id` | `transtype.bd_billtyperef` |
| `en_pricedif_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `std_process_id` | `engineeringdata.ed_operation_ref` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `entrust_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `inventory_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `mo_trade_type_id` | `transtype.bd_billtyperef` |
| `ori_bill_trade_type_id` | `transtype.bd_billtyperef` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `pur_org_id` | `ucf-org-center.bd_purchaseorg_na` |
| `inventory_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `order_bill_type_id` | `transtype.bd_billtypetreeref` |
| `company_id` | `finbd.bd_allaccbodyref_inner` |
| `inputtax_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `src_bill_type_id` | `transtype.bd_billtypetreeref` |
| `write_off_src_data_id` | `` |
| `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `busi_dept_id` | `ucf-org-center.admin_dept_tree_ref_na` |
| `control_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `write_off_src_data_h_id` | `` |
| `cost_domain_id` | `yonbip-fi-eia.RefTable_d2cb816115` |
| `control_scope_id` | `finbd.bd_controlscoperef` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `inventory_obj_id` | `` |
| `osm_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `src_bill_trade_type_id` | `transtype.bd_billtyperef` |
| `ori_bill_type_id` | `transtype.bd_billtypetreeref` |
| `mat_ch_id` | `` |
| `decready_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `en_ratedif_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `so_trade_type_id` | `transtype.bd_billtyperef` |
| `po_trade_type_id` | `transtype.bd_billtyperef` |
| `invoice_supplier_id` | `yssupplier.aa_vendorSimpleRef` |
| `ipv_rate_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `mainbus_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `customer_id` | `productcenter.aa_merchantref` |

## 字段列表（按类型分组）

> 共 342 个直连字段

### 文本字段 (95个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `entry_account_method` | `entry_account_method` | `entryAccountMethod` | 入账方式 |
| `remarks_b` | `remarks_b` | `remarksB` | 备注 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行id |
| `src_data_id` | `src_data_id` | `srcDataId` | 来源数据行ID |
| `src_data_type` | `src_data_type` | `srcDataType` | 来源数据类型 |
| `write_off_src_data_h_code` | `write_off_src_data_h_code` | `writeOffSrcDataHCode` | 冲销来源会计事务号 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `accbook_cost_source` | `accbook_cost_source` | `accbookCostSource` | 账簿本币成本来源 |
| `accbook_cost_source_memo` | `accbook_cost_source_memo` | `accbookCostSourceMemo` | 账簿本币成本来源描述 |
| `batch_no` | `batch_no` | `batchNo` | 批次号 |
| `book_date` | `book_date` | `bookDate` | 记账日期 |
| `busi_bill_date` | `busi_bill_date` | `busiBillDate` | 业务单据日期 |
| `busi_bill_id` | `busi_bill_id` | `busiBillId` | 业务单据id |
| `busi_bill_no` | `busi_bill_no` | `busiBillNo` | 业务单据号 |
| `busi_bill_row_id` | `busi_bill_row_id` | `busiBillRowId` | 业务单据行id |
| `busi_id` | `busi_id` | `busiId` | 会计事务ID |
| `busi_man_id` | `busi_man_id` | `busiManId` | 业务员 |
| `busi_src_bill_id` | `busi_src_bill_id` | `busiSrcBillId` | 业务来源单据id |
| `busi_src_bill_row_id` | `busi_src_bill_row_id` | `busiSrcBillRowId` | 业务来源单据行id |
| `carry_over_of_cost_method` | `carry_over_of_cost_method` | `carryOverOfCostMethod` | 发出商品结转方式 |
| `code` | `code` | `code` | 会计事务记录号 |
| `control_cost_source` | `control_cost_source` | `controlCostSource` | 管控范围本币成本来源 |
| `control_cost_source_memo` | `control_cost_source_memo` | `controlCostSourceMemo` | 管控范围本币成本来源描述 |
| `error_message` | `error_message` | `errorMessage` | 错误提示 |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 会计事务类型编码 |
| `free10` | `free10` | `free10` | 规格10 |
| `free1` | `free1` | `free1` | 规格1 |
| `free2` | `free2` | `free2` | 规格2 |
| `free3` | `free3` | `free3` | 规格3 |
| `free4` | `free4` | `free4` | 规格4 |
| `free5` | `free5` | `free5` | 规格5 |
| `free6` | `free6` | `free6` | 规格6 |
| `free7` | `free7` | `free7` | 规格7 |
| `free8` | `free8` | `free8` | 规格8 |
| `free9` | `free9` | `free9` | 规格9 |
| `global_cost_source` | `global_cost_source` | `globalCostSource` | 全局本币成本来源 |
| `global_cost_source_memo` | `global_cost_source_memo` | `globalCostSourceMemo` | 全局本币成本来源描述 |
| `group_cost_source` | `group_cost_source` | `groupCostSource` | 集团本币成本来源 |
| `group_cost_source_memo` | `group_cost_source_memo` | `groupCostSourceMemo` | 集团本币成本来源描述 |
| `ia_sku_id` | `ia_sku_id` | `iaSkuId` | 存货SKU |
| `mo_b_id` | `mo_b_id` | `moBId` | 生产订单子表id |
| `mo_code` | `mo_code` | `moCode` | 生产订单单据号 |
| `mo_g_id` | `mo_g_id` | `moGId` | 生产订单孙表id |
| `mo_id` | `mo_id` | `moId` | 生产订单单据id |
| `mto_id` | `mto_id` | `mtoId` | mto订单ID |
| `mto_no` | `mto_no` | `mtoNo` | mto订单号 |
| `mto_row_id` | `mto_row_id` | `mtoRowId` | mto订单行ID |
| `oo_b_id` | `oo_b_id` | `ooBId` | 委外订单子表id |
| `oo_code` | `oo_code` | `ooCode` | 委外订单单据号 |
| `oo_g_id` | `oo_g_id` | `ooGId` | 委外订单孙表id |
| `oo_id` | `oo_id` | `ooId` | 委外订单单据id |
| `opp_washed_row_id` | `opp_washed_row_id` | `oppWashedRowId` | 冲销对方行ID |
| `order_b_id` | `order_b_id` | `orderBId` | 其他订单子表id |
| `order_g_id` | `order_g_id` | `orderGId` | 其他订单孙表id |
| `order_id` | `order_id` | `orderId` | 其他订单单据id |
| `order_no` | `order_no` | `orderNo` | 其他订单单据号 |
| `org_cost_source` | `org_cost_source` | `orgCostSource` | 组织本币成本来源 |
| `org_cost_source_memo` | `org_cost_source_memo` | `orgCostSourceMemo` | 组织本币成本来源描述 |
| `ori_bill_date` | `ori_bill_date` | `oriBillDate` | 源头单据日期 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据id |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据编号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行id |
| `output_type` | `output_type` | `outputType` | 产出类型 |
| `pair_group_num` | `pair_group_num` | `pairGroupNum` | 形态转换的组号 |
| `pair_key` | `pair_key` | `pairKey` | 成对关系 |
| `pair_source` | `pair_source` | `pairSource` | 成对线索 |
| `period_code` | `period_code` | `periodCode` | 记账会计期间编码 |
| `period_status` | `period_status` | `periodStatus` | 是否期末调整标识 |
| `po_b_id` | `po_b_id` | `poBId` | 采购订单子表id |
| `po_code` | `po_code` | `poCode` | 采购订单编号 |
| `po_g_id` | `po_g_id` | `poGId` | 采购订单孙表id |
| `po_id` | `po_id` | `poId` | 采购订单单据id |
| `product_date` | `product_date` | `productDate` | 生产日期 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `reserve` | `reserve` | `reserve` | 预留对象 |
| `send_goods_group` | `send_goods_group` | `sendGoodsGroup` | 发出商品分组 |
| `send_goods_group_name` | `send_goods_group_name` | `sendGoodsGroupName` | 发出商品分组名称 |
| `send_goods_group_type` | `send_goods_group_type` | `sendGoodsGroupType` | 发出商品分组类型 |
| `so_b_id` | `so_b_id` | `soBId` | 销售订单子表id |
| `so_code` | `so_code` | `soCode` | 销售订单单据号 |
| `so_g_id` | `so_g_id` | `soGId` | 销售订单孙表id |
| `so_id` | `so_id` | `soId` | 销售订单单据id |
| `sort_no` | `sort_no` | `sortNo` | 记账序号 |
| `specify_method` | `specify_method` | `specifyMethod` | 成本指定方式 |
| `sterilisation_bill_row_id` | `sterilisation_bill_row_id` | `sterilisationBillRowId` | 冲销单据行号 |
| `stock_status` | `stock_status` | `stockStatus` | 库存状态 |
| `storekeeper_id` | `storekeeper_id` | `storekeeperId` | 库管员 |
| `tax_item` | `tax_item` | `taxItem` | 税目 |
| `validity_date` | `validity_date` | `validityDate` | 失效日期 |
| `id` | `id` | `id` | 主键 |
| `busi_sort_no` | `busi_sort_no` | `busiSortNo` | 业务记账序号 |
| `std_price_dimension` | `std_price_dimension` | `stdPriceDimension` | 标准取价匹配模式 |

### 引用字段 (91个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `header_id` | `header_id` | `header` | 业务核算主表 |
| `activity_id` | `activity_id` | `activity` | 活动 |
| `wbs_id` | `wbs_id` | `wbs` | WBS |
| `busi_event` | `busi_event` | `busiEvent` | 业务事项 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源单据交易类型 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `write_off_src_data_h_id` | `write_off_src_data_h_id` | `writeOffSrcDataHId` | 冲销来源会计事务id |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源会计事务行ID |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿id |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿本币 |
| `accbook_trade_rate_type` | `accbook_trade_rate_type` | `accbookTradeRateType` | 账簿本币交易汇率类型 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `busi_bill_type_id` | `busi_bill_type_id` | `busiBillTypeId` | 业务单据类型 |
| `busi_cost_center_id` | `busi_cost_center_id` | `busiCostCenter` | 成本中心 |
| `busi_dept_id` | `busi_dept_id` | `busiDept` | 部门 |
| `busi_trade_type_id` | `busi_trade_type_id` | `busiTradeTypeId` | 业务交易类型 |
| `busi_wbs_id` | `busi_wbs_id` | `busiWbs` | 业务WBS |
| `company_id` | `company_id` | `company` | 公司 |
| `control_currtype_id` | `control_currtype_id` | `controlCurrtypeId` | 管控范围本币 |
| `control_scope_id` | `control_scope_id` | `controlScope` | 管控范围 |
| `control_trade_rate_type` | `control_trade_rate_type` | `controlTradeRateType` | 管控范围本币交易汇率类型 |
| `cost_domain_id` | `cost_domain_id` | `costDomainId` | 成本域 |
| `currency_id` | `currency_id` | `currencyId` | 原币 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `decready_acc_id` | `decready_acc_id` | `decreadyAccId` | 跌价准备科目 |
| `en_acc_id` | `en_acc_id` | `enAccId` | 发出商品科目 |
| `en_acc_v_id` | `en_acc_v_id` | `enAccVId` | 发出商品科目版本ID |
| `en_pricedif_acc_id` | `en_pricedif_acc_id` | `enPricedifAccId` | 发出商品价差科目 |
| `en_ratedif_acc_id` | `en_ratedif_acc_id` | `enRatedifAccId` | 发出商品汇差科目 |
| `entrust_acc_id` | `entrust_acc_id` | `entrustAccId` | 委托发出物资 |
| `entrust_acc_v_id` | `entrust_acc_v_id` | `entrustAccVId` | 委托加工物资版本ID |
| `fi_event_id` | `fi_event_id` | `fiEventId` | 会计事务类型id |
| `global_currtype_id` | `global_currtype_id` | `globalCurrtypeId` | 全局本币 |
| `global_trade_rate_type` | `global_trade_rate_type` | `globalTradeRateType` | 全局本币交易汇率类型 |
| `group_currtype_id` | `group_currtype_id` | `groupCurrtypeId` | 集团本币 |
| `group_trade_rate_type` | `group_trade_rate_type` | `groupTradeRateType` | 集团本币交易汇率类型 |
| `inputtax_acc_id` | `inputtax_acc_id` | `inputtaxAccId` | 进项税科目 |
| `inventory_acc_id` | `inventory_acc_id` | `inventoryAccId` | 存货科目 |
| `inventory_acc_v_id` | `inventory_acc_v_id` | `inventoryAccVId` | 存货科目版本ID |
| `inventory_obj_id` | `inventory_obj_id` | `inventoryObjId` | 存货对象 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `ipv_price_acc_id` | `ipv_price_acc_id` | `ipvPriceAccId` | 结算价格差异科目 |
| `ipv_price_acc_v_id` | `ipv_price_acc_v_id` | `ipvPriceAccVId` | 结算价格差异科目版本ID |
| `ipv_rate_acc_id` | `ipv_rate_acc_id` | `ipvRateAccId` | 汇率差异科目 |
| `ipv_rate_acc_v_id` | `ipv_rate_acc_v_id` | `ipvRateAccVId` | 汇率差异科目版本ID |
| `mainbus_acc_id` | `mainbus_acc_id` | `mainbusAccId` | 主营业务成本科目 |
| `material_id` | `material_id` | `materialId` | 物料ID |
| `mm_org_id` | `mm_org_id` | `mmOrg` | 生产组织 |
| `mo_carry_down_acc_id` | `mo_carry_down_acc_id` | `moCarryDownAccId` | 生产入库结转科目 |
| `mo_carry_down_acc_v_id` | `mo_carry_down_acc_v_id` | `moCarryDownAccVId` | 生成入库科目结转科目版本ID |
| `mo_trade_type_id` | `mo_trade_type_id` | `moTradetypeId` | 生产订单交易类型 |
| `oo_carry_down_acc_id` | `oo_carry_down_acc_id` | `ooCarryDownAccId` | 委外入库结转科目 |
| `oo_carry_down_acc_v_id` | `oo_carry_down_acc_v_id` | `ooCarryDownAccVId` | 委外入库接转科目 |
| `oo_trade_type_id` | `oo_trade_type_id` | `ooTradetypeId` | 委外订单交易类型 |
| `opp_profit_center_id` | `opp_profit_center_id` | `oppProfitCenter` | 对方利润中心 |
| `opposite_acc_id` | `opposite_acc_id` | `oppositeAccId` | 对方科目 |
| `order_bill_type_id` | `order_bill_type_id` | `orderBilltypeId` | 其他订单单据类型 |
| `order_trade_type_id` | `order_trade_type_id` | `orderTradetypeId` | 其他订单交易类型 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织本币 |
| `org_trade_rate_type` | `org_trade_rate_type` | `orgTradeRateType` | 组织本币交易汇率类型 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradetypeId` | 源头交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型 |
| `osm_org_id` | `osm_org_id` | `osmOrg` | 委外组织 |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `po_trade_type_id` | `po_trade_type_id` | `poTradetypeId` | 采购订单交易类型 |
| `ppv_price_acc_id` | `ppv_price_acc_id` | `ppvPriceAccId` | 业务差异科目 |
| `ppv_price_acc_v_id` | `ppv_price_acc_v_id` | `ppvPriceAccVId` | 业务差异科目版本ID |
| `product_acc_id` | `product_acc_id` | `productAccId` | 生产成本科目 |
| `product_id` | `product_id` | `productId` | 产品ID |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `pur_org_id` | `pur_org_id` | `purOrg` | 采购组织 |
| `req_cost_center_id` | `req_cost_center_id` | `reqCostCenter` | 需求部门成本中心 |
| `req_dept_id` | `req_dept_id` | `reqDept` | 需求部门 |
| `req_org_id` | `req_org_id` | `reqOrg` | 需求组织 |
| `sale_org_id` | `sale_org_id` | `saleOrg` | 销售组织 |
| `so_trade_type_id` | `so_trade_type_id` | `soTradetypeId` | 销售订单交易类型 |
| `std_process_id` | `std_process_id` | `stdProcessId` | 标准工序id |
| `stock_org_id` | `stock_org_id` | `stockOrg` | 库存组织 |
| `supplier_id` | `supplier_id` | `supplierId` | 供货供应商 |
| `transfer_carry_down_acc_id` | `transfer_carry_down_acc_id` | `transferCarryDownAccId` | 组装拆卸入库结转科目 |
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |
| `work_center_id` | `work_center_id` | `workCenterId` | 工作中心id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `collector_id` | `collector_id` | `collectorId` | 成本收集器 |
| `mainbus_acc_v_id` | `mainbus_acc_v_id` | `mainbusAccVId` | 主营业务成本科目版本id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |
| `bln_allow_zero` | `bln_allow_zero` | `blnAllowZero` | 零成本 |
| `bln_cost_domain_transfer` | `bln_cost_domain_transfer` | `blnCostDomainTransfer` | 同成本域调拨 |
| `bln_fixed_asset` | `bln_fixed_asset` | `blnFixedAsset` | 是否转固 |
| `bln_return` | `bln_return` | `blnReturn` | 退货标识 |
| `bln_self_consume` | `bln_self_consume` | `blnSelfConsume` | 是否自耗 |
| `bln_send_goods` | `bln_send_goods` | `blnSendGoods` | 发出商品标识 |
| `bln_specified_diff` | `bln_specified_diff` | `blnSpecifiedDiff` | 是否指定处理尾差 |
| `bln_specify_cost` | `bln_specify_cost` | `blnSpecifyCost` | 是否携带成本 |
| `bln_update_cost` | `bln_update_cost` | `blnUpdateCost` | 是否更新存货 |
| `bln_waste` | `bln_waste` | `blnWaste` | 是否废品 |

### 枚举字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |
| `bill_direction` | `bill_direction` | `billDirection` | 单据方向 |
| `bln_gift` | `bln_gift` | `blnGift` | 物料业务类型 |
| `compute_method` | `compute_method` | `computeMethod` | 计算方式 |
| `cost_accounting_method` | `cost_accounting_method` | `costAccountingMethod` | 委外成本核算方式 |
| `inout_direction` | `inout_direction` | `inoutDirection` | 出入库方向 |
| `osm_busi_type` | `osm_busi_type` | `osmBusiType` | 委外业务类型 |
| `owner_type` | `owner_type` | `ownerType` | 货权归属 |
| `pair_type` | `pair_type` | `pairType` | 成对类型 |
| `price_method` | `price_method` | `priceMethod` | 计价方式 |
| `sale_style` | `sale_style` | `saleStyle` | 商品售卖类型 |
| `src_fi_event_type` | `src_fi_event_type` | `srcFiEventType` | 会计事务来源类型 |
| `status` | `status` | `status` | 计算状态 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_currency_rate_ops` | `accbook_currency_rate_ops` | `accbookCurrencyRateOps` | 账簿币汇率折算方式 |
| `control_currency_rate_ops` | `control_currency_rate_ops` | `controlCurrencyRateOps` | 管控范围币汇率折算方式 |
| `global_currency_rate_ops` | `global_currency_rate_ops` | `globalCurrencyRateOps` | 全局币汇率折算方式 |
| `group_currency_rate_ops` | `group_currency_rate_ops` | `groupCurrencyRateOps` | 集团币汇率折算方式 |
| `org_trade_rate_ops` | `org_trade_rate_ops` | `orgTradeRateOps` | 组织币汇率折算方式 |
| `rollup_level` | `rollup_level` | `rollupLevel` | 卷积层级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_version` | `src_bill_version` | `srcBillVersion` | 来源单据版本号 |

### 数值字段 (117个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_row_no` | `src_bill_row_no` | `srcBillRowNo` | 来源单据行号 |
| `accbook_amount` | `accbook_amount` | `accbookAmount` | 账簿本币成本金额 |
| `accbook_balance_amount` | `accbook_balance_amount` | `accbookBalanceAmount` | 账簿本币结余金额 |
| `accbook_busi_dif` | `accbook_busi_dif` | `accbookBusiDif` | 账簿本币业务差异 |
| `accbook_trade_rate` | `accbook_trade_rate` | `accbookCurrencyRate` | 账簿本币交易汇率 |
| `accbook_ipv_dif` | `accbook_ipv_dif` | `accbookIpvDif` | 账簿本币结算差异 |
| `accbook_ipv_rate_dif` | `accbook_ipv_rate_dif` | `accbookIpvRateDif` | 账簿本币汇率差异 |
| `accbook_ppd_dif` | `accbook_ppd_dif` | `accbookPpdDif` | 账簿本币生产价格差异 |
| `accbook_price` | `accbook_price` | `accbookPrice` | 账簿本币成本单价 |
| `accbook_settled_amount` | `accbook_settled_amount` | `accbookSettledAmount` | 账簿本币结算后金额 |
| `accbook_settled_price` | `accbook_settled_price` | `accbookSettledPrice` | 账簿本币结算后单价 |
| `accbook_std_amount` | `accbook_std_amount` | `accbookStdAmount` | 账簿本币标准金额 |
| `accbook_std_price` | `accbook_std_price` | `accbookStdPrice` | 账簿本币标准单价 |
| `accbook_this_busi_dif` | `accbook_this_busi_dif` | `accbookThisBusiDif` | 账簿本币本层业务差异 |
| `accbook_this_cost_amount` | `accbook_this_cost_amount` | `accbookThisCostAmount` | 账簿本币本层成本金额 |
| `accbook_this_cost_price` | `accbook_this_cost_price` | `accbookThisCostPrice` | 账簿本币本层成本单价 |
| `accbook_this_ppd_dif` | `accbook_this_ppd_dif` | `accbookThisPpdDif` | 账簿本币本层生产价格差异 |
| `accbook_this_std_amount` | `accbook_this_std_amount` | `accbookThisStdAmount` | 账簿本币本层标准金额 |
| `accbook_this_std_price` | `accbook_this_std_price` | `accbookThisStdPrice` | 账簿本币本层标准单价 |
| `balance_num` | `balance_num` | `balanceNum` | 剩余数量 |
| `busi_bill_row_no` | `busi_bill_row_no` | `busiBillRowNo` | 单据行号 |
| `control_amount` | `control_amount` | `controlAmount` | 管控范围本币成本金额 |
| `control_balance_amount` | `control_balance_amount` | `controlBalanceAmount` | 管控范围本币结余金额 |
| `control_busi_dif` | `control_busi_dif` | `controlBusiDif` | 管控范围本币业务差异 |
| `control_trade_rate` | `control_trade_rate` | `controlCurrencyRate` | 管控范围本币交易汇率 |
| `control_ipv_dif` | `control_ipv_dif` | `controlIpvDif` | 管控范围本币结算差异 |
| `control_ipv_rate_dif` | `control_ipv_rate_dif` | `controlIpvRateDif` | 管控范围本币汇率差异 |
| `control_ppd_dif` | `control_ppd_dif` | `controlPpdDif` | 管控范围本币生产价格差异 |
| `control_price` | `control_price` | `controlPrice` | 管控范围本币成本单价 |
| `control_settled_amount` | `control_settled_amount` | `controlSettledAmount` | 管控范围本币结算后金额 |
| `control_settled_price` | `control_settled_price` | `controlSettledPrice` | 管控范围本币结算后单价 |
| `control_std_amount` | `control_std_amount` | `controlStdAmount` | 管控范围本币标准金额 |
| `control_std_price` | `control_std_price` | `controlStdPrice` | 管控范围本币标准单价 |
| `control_this_busi_dif` | `control_this_busi_dif` | `controlThisBusiDif` | 管控范围本币本层业务差异 |
| `control_this_cost_amount` | `control_this_cost_amount` | `controlThisCostAmount` | 管控范围本币本层成本金额 |
| `control_this_cost_price` | `control_this_cost_price` | `controlThisCostPrice` | 管控范围本币本层成本单价 |
| `control_this_ppd_dif` | `control_this_ppd_dif` | `controlThisPpdDif` | 管控范围本币本层生产价格差异 |
| `control_this_std_amount` | `control_this_std_amount` | `controlThisStdAmount` | 管控范围本币本层标准金额 |
| `control_this_std_price` | `control_this_std_price` | `controlThisStdPrice` | 管控范围本币本层标准单价 |
| `cost_amount` | `cost_amount` | `costAmount` | 成本金额 |
| `cost_price` | `cost_price` | `costPrice` | 成本单价 |
| `dis_assemble_ratio` | `dis_assemble_ratio` | `disAssembleRatio` | 拆分比例 |
| `global_amount` | `global_amount` | `globalAmount` | 全局本币成本金额 |
| `global_balance_amount` | `global_balance_amount` | `globalBalanceAmount` | 全局本币结余金额 |
| `global_busi_dif` | `global_busi_dif` | `globalBusiDif` | 全局本币业务差异 |
| `global_trade_rate` | `global_trade_rate` | `globalCurrencyRate` | 全局本币交易汇率 |
| `global_ipv_dif` | `global_ipv_dif` | `globalIpvDif` | 全局本币结算差异 |
| `global_ipv_rate_dif` | `global_ipv_rate_dif` | `globalIpvRateDif` | 全局本币汇率差异 |
| `global_ppd_dif` | `global_ppd_dif` | `globalPpdDif` | 全局本币生产价格差异 |
| `global_price` | `global_price` | `globalPrice` | 全局本币成本单价 |
| `global_settled_amount` | `global_settled_amount` | `globalSettledAmount` | 全局本币结算后金额 |
| `global_settled_price` | `global_settled_price` | `globalSettledPrice` | 全局本币结算后单价 |
| `global_std_amount` | `global_std_amount` | `globalStdAmount` | 全局本币标准金额 |
| `global_std_price` | `global_std_price` | `globalStdPrice` | 全局本币标准单价 |
| `global_this_busi_dif` | `global_this_busi_dif` | `globalThisBusiDif` | 全局本币本层业务差异 |
| `global_this_cost_amount` | `global_this_cost_amount` | `globalThisCostAmount` | 全局本币本层成本金额 |
| `global_this_cost_price` | `global_this_cost_price` | `globalThisCostPrice` | 全局本币本层成本单价 |
| `global_this_ppd_dif` | `global_this_ppd_dif` | `globalThisPpdDif` | 全局本币本层生产价格差异 |
| `global_this_std_amount` | `global_this_std_amount` | `globalThisStdAmount` | 全局本币本层标准金额 |
| `global_this_std_price` | `global_this_std_price` | `globalThisStdPrice` | 全局本币本层标准单价 |
| `group_amount` | `group_amount` | `groupAmount` | 集团本币成本金额 |
| `group_balance_amount` | `group_balance_amount` | `groupBalanceAmount` | 集团本币结余金额 |
| `group_busi_dif` | `group_busi_dif` | `groupBusiDif` | 集团本币业务差异 |
| `group_trade_rate` | `group_trade_rate` | `groupCurrencyRate` | 集团本币交易汇率 |
| `group_ipv_dif` | `group_ipv_dif` | `groupIpvDif` | 集团本币结算差异 |
| `group_ipv_rate_dif` | `group_ipv_rate_dif` | `groupIpvRateDif` | 集团本币汇率差异 |
| `group_ppd_dif` | `group_ppd_dif` | `groupPpdDif` | 集团本币生产价格差异 |
| `group_price` | `group_price` | `groupPrice` | 集团本币成本单价 |
| `group_settled_amount` | `group_settled_amount` | `groupSettledAmount` | 集团本币结算后金额 |
| `group_settled_price` | `group_settled_price` | `groupSettledPrice` | 集团本币结算后单价 |
| `group_std_amount` | `group_std_amount` | `groupStdAmount` | 集团本币标准金额 |
| `group_std_price` | `group_std_price` | `groupStdPrice` | 集团本币标准单价 |
| `group_this_busi_dif` | `group_this_busi_dif` | `groupThisBusiDif` | 集团本币本层业务差异 |
| `group_this_cost_amount` | `group_this_cost_amount` | `groupThisCostAmount` | 集团本币本层成本金额 |
| `group_this_cost_price` | `group_this_cost_price` | `groupThisCostPrice` | 集团本币本层成本单价 |
| `group_this_ppd_dif` | `group_this_ppd_dif` | `groupThisPpdDif` | 集团本币本层生产价格差异 |
| `group_this_std_amount` | `group_this_std_amount` | `groupThisStdAmount` | 集团本币本层标准金额 |
| `group_this_std_price` | `group_this_std_price` | `groupThisStdPrice` | 集团本币本层标准单价 |
| `mo_row_no` | `mo_row_no` | `moRowNo` | 生产订单行号 |
| `mto_row_no` | `mto_row_no` | `mtoRowNo` | mto订单行号 |
| `no_deduction_tax` | `no_deduction_tax` | `noDeductionTax` | 不可抵扣税额 |
| `no_settle_num` | `no_settle_num` | `noSettleNum` | 未结算数量 |
| `notax_amount` | `notax_amount` | `notaxAmount` | 无税金额 |
| `notax_price` | `notax_price` | `notaxPrice` | 无税单价 |
| `num` | `num` | `num` | 主计量数量 |
| `oo_row_no` | `oo_row_no` | `ooRowNo` | 委外订单行号 |
| `order_row_no` | `order_row_no` | `orderRowNo` | 其他订单行号 |
| `org_amount` | `org_amount` | `orgAmount` | 组织本币成本金额 |
| `org_balance_amount` | `org_balance_amount` | `orgBalanceAmount` | 组织本币结余金额 |
| `org_busi_dif` | `org_busi_dif` | `orgBusiDif` | 组织本币业务差异 |
| `org_ipv_dif` | `org_ipv_dif` | `orgIpvDif` | 组织本币结算差异 |
| `org_ipv_rate_dif` | `org_ipv_rate_dif` | `orgIpvRateDif` | 组织本币汇率差异 |
| `org_ppd_dif` | `org_ppd_dif` | `orgPpdDif` | 组织本币生产价格差异 |
| `org_price` | `org_price` | `orgPrice` | 组织本币成本单价 |
| `org_settled_amount` | `org_settled_amount` | `orgSettledAmount` | 组织本币结算后金额 |
| `org_settled_price` | `org_settled_price` | `orgSettledPrice` | 组织本币结算后单价 |
| `org_std_amount` | `org_std_amount` | `orgStdAmount` | 组织本币标准金额 |
| `org_std_price` | `org_std_price` | `orgStdPrice` | 组织本币标准单价 |
| `org_this_busi_dif` | `org_this_busi_dif` | `orgThisBusiDif` | 组织本币本层业务差异 |
| `org_this_cost_amount` | `org_this_cost_amount` | `orgThisCostAmount` | 组织本币本层成本金额 |
| `org_this_cost_price` | `org_this_cost_price` | `orgThisCostPrice` | 组织本币本层成本单价 |
| `org_this_ppd_dif` | `org_this_ppd_dif` | `orgThisPpdDif` | 组织本币本层生产价格差异 |
| `org_this_std_amount` | `org_this_std_amount` | `orgThisStdAmount` | 组织本币本层标准金额 |
| `org_this_std_price` | `org_this_std_price` | `orgThisStdPrice` | 组织本币本层标准单价 |
| `org_trade_rate` | `org_trade_rate` | `orgTradeRate` | 组织本币交易汇率 |
| `ori_bill_row_no` | `ori_bill_row_no` | `oriBillRowNo` | 源头单据行号 |
| `po_row_no` | `po_row_no` | `poRowNo` | 采购订单行号 |
| `process_sort_no` | `process_sort_no` | `processSortNo` | 工序顺序号 |
| `so_row_no` | `so_row_no` | `soRowNo` | 销售订单行号 |
| `tax` | `tax` | `tax` | 税额 |
| `tax_amount` | `tax_amount` | `taxAmount` | 含税金额 |
| `tax_price` | `tax_price` | `taxPrice` | 含税单价 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `accbook_this_balance_amount` | `accbook_this_balance_amount` | `accbookThisBalanceAmount` | 账簿本币本层结余金额 |
| `global_this_balance_amount` | `global_this_balance_amount` | `globalThisBalanceAmount` | 全局币本层结余金额 |
| `group_this_balance_amount` | `group_this_balance_amount` | `groupThisBalanceAmount` | 集团币本层结余金额 |
| `org_this_balance_amount` | `org_this_balance_amount` | `orgThisBalanceAmount` | 组织币本层结余金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 业务核算子表自定义项特征 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `costItems` | 费用项目 |
| `` | `` | `costElements` | 分项明细 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mat_ch_id` | `mat_ch_id` | `matChId` | 物料自由项特征组 |
