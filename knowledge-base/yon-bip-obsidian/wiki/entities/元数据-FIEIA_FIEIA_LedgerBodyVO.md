---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.LedgerBodyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 流水账子表 (`FIEIA.FIEIA.LedgerBodyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`d3b8a63d-5608-44ad-936d-e61341de9f10`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流水账子表 |
| 物理表 | `ia_ledger_b` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 234 个 |
| 子表 | 1 个 |
| 关联引用 | 89 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `costItems` | `FIEIA.FIEIA.LedgerGrandVO` | composition |

## 关联引用 (89个)

| 字段名 | 引用类型 |
|--------|---------|
| `mo_carry_down_acc_id` | `fiepub.fiepub_accsubjectref` |
| `order_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `product_acc_id` | `fiepub.fiepub_accsubjectref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs_id` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `collector_id` | `finbd.bd_costcollectoritem01listref` |
| `ipv_price_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `sale_org_id` | `ucf-org-center.bd_salesorg` |
| `ipv_price_acc_id` | `fiepub.fiepub_accsubjectref` |
| `busi_wbs_id` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `oo_carry_down_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `busi_cost_center_id` | `finbd.bd_costcenterref` |
| `busi_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `org_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `en_pricedif_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `oo_carry_down_acc_id` | `fiepub.fiepub_accsubjectref` |
| `mm_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `req_cost_center_id` | `finbd.bd_costcenterref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `busi_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `en_acc_id` | `fiepub.fiepub_accsubjectref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `opposite_acc_id` | `fiepub.fiepub_accsubjectref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `en_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `req_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `decready_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `free_ch_id` | `` |
| `mainbus_acc_id` | `fiepub.fiepub_accsubjectref` |
| `ppv_price_acc_id` | `fiepub.fiepub_accsubjectref` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `ppv_price_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `opp_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `transfer_carry_down_acc_id` | `fiepub.fiepub_accsubjectref` |
| `entrust_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `header_id` | `` |
| `req_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `product_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `` | `` |
| `ipv_rate_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `mo_carry_down_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `transfer_carry_down_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `activity_id` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `oo_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `en_pricedif_acc_id` | `fiepub.fiepub_accsubjectref` |
| `std_process_id` | `engineeringdata.ed_operation_ref` |
| `entrust_acc_id` | `fiepub.fiepub_accsubjectref` |
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `inventory_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `mo_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `ori_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `pur_org_id` | `ucf-org-center.bd_purchaseorg` |
| `en_ratedif_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `inventory_acc_id` | `fiepub.fiepub_accsubjectref` |
| `order_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `company_id` | `finbd.bd_allaccbodyref_inner` |
| `inputtax_acc_id` | `fiepub.fiepub_accsubjectref` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `write_off_src_data_id` | `` |
| `fi_event_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `busi_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `write_off_src_data_h_id` | `` |
| `cost_domain_id` | `yonbip-fi-eia.RefTable_0e6f869743` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `inputtax_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `inventory_obj_id` | `` |
| `osm_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `src_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `ori_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `mat_ch_id` | `` |
| `opposite_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `decready_acc_id` | `fiepub.fiepub_accsubjectref` |
| `en_ratedif_acc_id` | `fiepub.fiepub_accsubjectref` |
| `so_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `po_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `invoice_supplier_id` | `yssupplier.aa_vendor` |
| `ipv_rate_acc_id` | `fiepub.fiepub_accsubjectref` |
| `mainbus_acc_v_id` | `fiepub.fiepub_accsubjectref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (4个, 8字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 234 个直连字段

### 文本字段 (79个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ia_busi_type` | `ia_busi_type` | `iaBusiType` | 业务类型 |
| `busi_sort_no` | `busi_sort_no` | `busiSortNo` | 业务记账序号 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `batch_no` | `batch_no` | `batchNo` | 批次号 |
| `busi_bill_id` | `busi_bill_id` | `busiBillId` | 业务单据id |
| `busi_bill_no` | `busi_bill_no` | `busiBillNo` |  业务单据号 |
| `busi_bill_row_id` | `busi_bill_row_id` | `busiBillRowId` | 业务单据行id |
| `busi_event` | `busi_event` | `busiEvent` | 业务事项 |
| `busi_id` | `busi_id` | `busiId` |  会计事务ID |
| `busi_man_id` | `busi_man_id` | `busiManId` |  业务员 |
| `busi_src_bill_id` | `busi_src_bill_id` | `busiSrcBillId` | 业务来源单据id |
| `busi_src_bill_no` | `busi_src_bill_no` | `busiSrcBillNo` | 业务来源单据号 |
| `busi_src_bill_row_id` | `busi_src_bill_row_id` | `busiSrcBillRowId` | 业务来源单据行id |
| `carry_over_of_cost_method` | `carry_over_of_cost_method` | `carryOverOfCostMethod` | 发出商品结转方式 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 会计事务类型编码 |
| `free1` | `free1` | `free1` | 规格1 |
| `free10` | `free10` | `free10` | 规格10 |
| `free2` | `free2` | `free2` | 规格2 |
| `free3` | `free3` | `free3` | 规格3 |
| `free4` | `free4` | `free4` | 规格4 |
| `free5` | `free5` | `free5` | 规格5 |
| `free6` | `free6` | `free6` | 规格6 |
| `free7` | `free7` | `free7` | 规格7 |
| `free8` | `free8` | `free8` | 规格8 |
| `free9` | `free9` | `free9` | 规格9 |
| `ia_sku_id` | `ia_sku_id` | `iaSkuId` | 存货SKU |
| `mo_b_id` | `mo_b_id` | `moBId` |  生产订单子表id |
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
| `order_g_id` | `order_g_id` | `orderGId` |  其他订单孙表id |
| `order_id` | `order_id` | `orderId` | 其他订单单据id |
| `order_no` | `order_no` | `orderNo` | 其他订单单据号 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` |  源头单据id |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据编号 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行id |
| `output_type` | `output_type` | `outputType` |  产出类型 |
| `pair_group_num` | `pair_group_num` | `pairGroupNum` | 形态转换的组号 |
| `pair_key` | `pair_key` | `pairKey` | 成对关系 |
| `pair_source` | `pair_source` | `pairSource` | 成对线索 |
| `period_code` | `period_code` | `periodCode` |  记账会计期间 |
| `po_b_id` | `po_b_id` | `poBId` | 采购订单子表id |
| `po_code` | `po_code` | `poCode` | 采购订单编号 |
| `po_g_id` | `po_g_id` | `poGId` | 采购订单孙表id |
| `po_id` | `po_id` | `poId` | 采购订单单据id |
| `remarks_b` | `remarks_b` | `remarksB` | 表体备注 |
| `reserve` | `reserve` | `reserve` | 预留对象 |
| `send_goods_group` | `send_goods_group` | `sendGoodsGroup` | 发出商品分组 |
| `send_goods_group_name` | `send_goods_group_name` | `sendGoodsGroupName` | 发出商品分组名称 |
| `send_goods_group_type` | `send_goods_group_type` | `sendGoodsGroupType` | 发出商品分组类型 |
| `so_b_id` | `so_b_id` | `soBId` | 销售订单子表id |
| `so_code` | `so_code` | `soCode` | 销售订单单据号 |
| `so_g_id` | `so_g_id` | `soGId` | 销售订单孙表id |
| `so_id` | `so_id` | `soId` |  销售订单单据id |
| `sort_no` | `sort_no` | `sortNo` |  记账序号 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` |  来源单据行id |
| `src_data_id` | `src_data_id` | `srcDataId` | 来源数据行标识 |
| `src_data_type` | `src_data_type` | `srcDataType` | 来源数据类型 |
| `sterilisation_bill_row_id` | `sterilisation_bill_row_id` | `sterilisationBillRowId` | 冲销单据行id |
| `stock_status` | `stock_status` | `stockStatus` | 库存状态 |
| `storekeeper_id` | `storekeeper_id` | `storekeeperId` | 库管员 |
| `tax_item` | `tax_item` | `taxItem` |  税目 |
| `work_center_id` | `work_center_id` | `workCenterId` | 工作中心 |
| `write_off_src_data_h_code` | `write_off_src_data_h_code` | `writeOffSrcDataHCode` | 冲销来源会计事务号 |
| `entry_account_method` | `entry_account_method` | `entryAccountMethod` | 入账方式 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (86个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `collector_id` | `collector_id` | `collectorId` | 成本收集器 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` |  会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `activity_id` | `activity_id` | `activity` | 活动 |
| `busi_bill_type_id` | `busi_bill_type_id` | `busiBillTypeId` | 业务单据类型 |
| `busi_cost_center_id` | `busi_cost_center_id` | `busiCostCenter` | 业务部门成本中心  |
| `busi_dept_id` | `busi_dept_id` | `busiDept` |  业务部门 |
| `busi_trade_type_id` | `busi_trade_type_id` | `busiTradeTypeId` |  业务单据交易类型 |
| `busi_wbs_id` | `busi_wbs_id` | `busiWbs` | 业务WBS |
| `company_id` | `company_id` | `company` | 公司 |
| `cost_domain_id` | `cost_domain_id` | `costDomainId` | 成本域 |
| `currency_id` | `currency_id` | `currencyId` | 原币 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `decready_acc_id` | `decready_acc_id` | `decreadyAccId` | 跌价准备科目 |
| `decready_acc_v_id` | `decready_acc_v_id` | `decreadyAccVId` | 跌价准备科目版本ID |
| `en_acc_id` | `en_acc_id` | `enAccId` | 发出商品科目 |
| `en_acc_v_id` | `en_acc_v_id` | `enAccVId` | 发出商品科目版本ID |
| `en_pricedif_acc_id` | `en_pricedif_acc_id` | `enPricedifAccId` | 发出商品价差科目 |
| `en_pricedif_acc_v_id` | `en_pricedif_acc_v_id` | `enPricedifAccVId` | 发出商品价差科目版本ID |
| `en_ratedif_acc_id` | `en_ratedif_acc_id` | `enRatedifAccId` |  发出商品汇差科目 |
| `en_ratedif_acc_v_id` | `en_ratedif_acc_v_id` | `enRatedifAccVId` | 发出商品汇差科目版本ID |
| `entrust_acc_id` | `entrust_acc_id` | `entrustAccId` | 委托发出物资 |
| `entrust_acc_v_id` | `entrust_acc_v_id` | `entrustAccVId` | 委托发出物资版本ID |
| `fi_event_id` | `fi_event_id` | `fiEventId` | 会计事务类型id |
| `header_id` | `header_id` | `header` | 明细账主表ID |
| `inputtax_acc_id` | `inputtax_acc_id` | `inputtaxAccId` | 进项税科目 |
| `inputtax_acc_v_id` | `inputtax_acc_v_id` | `inputtaxAccVId` | 进项税科目版本ID |
| `inventory_acc_id` | `inventory_acc_id` | `inventoryAccId` | 存货科目 |
| `inventory_acc_v_id` | `inventory_acc_v_id` | `inventoryAccVId` | 存货科目版本ID |
| `inventory_obj_id` | `inventory_obj_id` | `inventoryObjId` | 存货对象 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `ipv_price_acc_id` | `ipv_price_acc_id` | `ipvPriceAccId` | 结算价格差异科目 |
| `ipv_price_acc_v_id` | `ipv_price_acc_v_id` | `ipvPriceAccVId` | 结算价格差异科目版本ID |
| `ipv_rate_acc_id` | `ipv_rate_acc_id` | `ipvRateAccId` | 汇率差异科目 |
| `ipv_rate_acc_v_id` | `ipv_rate_acc_v_id` | `ipvRateAccVId` | 汇率差异科目版本ID |
| `mainbus_acc_id` | `mainbus_acc_id` | `mainbusAccId` | 主营业务成本科目 |
| `mainbus_acc_v_id` | `mainbus_acc_v_id` | `mainbusAccVId` | 主营业务成本科目版本ID |
| `material_id` | `material_id` | `materialId` | 物料ID |
| `mm_org_id` | `mm_org_id` | `mmOrg` | 生产组织 |
| `mo_carry_down_acc_id` | `mo_carry_down_acc_id` | `moCarryDownAccId` | 生产入库结转科目 |
| `mo_carry_down_acc_v_id` | `mo_carry_down_acc_v_id` | `moCarryDownAccVId` | 生产入库结转科目版本ID |
| `mo_trade_type_id` | `mo_trade_type_id` | `moTradetypeId` | 生产订单交易类型 |
| `oo_carry_down_acc_id` | `oo_carry_down_acc_id` | `ooCarryDownAccId` | 委外入库结转科目 |
| `oo_carry_down_acc_v_id` | `oo_carry_down_acc_v_id` | `ooCarryDownAccVId` | 委外入库结转科目版本ID |
| `oo_trade_type_id` | `oo_trade_type_id` | `ooTradetypeId` | 委外订单交易类型 |
| `opp_profit_center_id` | `opp_profit_center_id` | `oppProfitCenter` |  对方利润中心 |
| `opposite_acc_id` | `opposite_acc_id` | `oppositeAccId` | 对方科目 |
| `opposite_acc_v_id` | `opposite_acc_v_id` | `oppositeAccVId` | 对方科目版本ID |
| `order_bill_type_id` | `order_bill_type_id` | `orderBilltypeId` | 其他订单单据类型 |
| `order_trade_type_id` | `order_trade_type_id` | `orderTradetypeId` | 其他订单交易类型 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` |  组织本币 |
| `org_trade_rate_type` | `org_trade_rate_type` | `orgTradeRateType` | 组织本币交易汇率类型 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradetypeId` | 源头交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型 |
| `osm_org_id` | `osm_org_id` | `osmOrg` |  委外组织 |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `po_trade_type_id` | `po_trade_type_id` | `poTradetypeId` |  采购订单交易类型 |
| `ppv_price_acc_id` | `ppv_price_acc_id` | `ppvPriceAccId` |  业务差异科目 |
| `ppv_price_acc_v_id` | `ppv_price_acc_v_id` | `ppvPriceAccVId` | 业务差异科目版本ID |
| `product_acc_id` | `product_acc_id` | `productAccId` |  生产成本科目 |
| `product_acc_v_id` | `product_acc_v_id` | `productAccVId` | 生产成本科目版本ID |
| `product_id` | `product_id` | `productId` |  产品ID |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `project_id` | `project_id` | `projectId` |  项目 |
| `pur_org_id` | `pur_org_id` | `purOrg` | 采购组织 |
| `req_cost_center_id` | `req_cost_center_id` | `reqCostCenter` | 需求部门成本中心 |
| `req_dept_id` | `req_dept_id` | `reqDept` | 需求部门 |
| `req_org_id` | `req_org_id` | `reqOrg` |  需求组织 |
| `sale_org_id` | `sale_org_id` | `saleOrg` | 销售组织(系统) |
| `so_trade_type_id` | `so_trade_type_id` | `soTradetypeId` | 销售订单交易类型 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源交易类型 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `std_process_id` | `std_process_id` | `stdProcessId` | 标准工序id |
| `stock_org_id` | `stock_org_id` | `stockOrg` | 库存组织 |
| `supplier_id` | `supplier_id` | `supplierId` | 供货供应商 |
| `transfer_carry_down_acc_id` | `transfer_carry_down_acc_id` | `transferCarryDownAccId` | 组装拆卸入库结转科目 |
| `transfer_carry_down_acc_v_id` | `transfer_carry_down_acc_v_id` | `transferCarryDownAccVId` | 组装拆卸入库结转科目版本ID |
| `warehouse_id` | `warehouse_id` | `warehouse` |  仓库 |
| `wbs_id` | `wbs_id` | `wbs` | WBS |
| `write_off_src_data_h_id` | `write_off_src_data_h_id` | `writeOffSrcDataHId` | 冲销来源会计事务id |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源数据行ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `book_date` | `book_date` | `bookDate` | 记账日期 |
| `busi_bill_date` | `busi_bill_date` | `busiBillDate` | 业务单据日期 |
| `busi_src_bill_date` | `busi_src_bill_date` | `busiSrcBillDate` | 业务来源单据日期 |
| `ori_bill_date` | `ori_bill_date` | `oriBillDate` | 源头单据日期 |
| `product_date` | `product_date` | `productDate` | 生产日期 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `validity_date` | `validity_date` | `validityDate` | 失效日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_allow_zero` | `bln_allow_zero` | `blnAllowZero` |  零成本 |
| `bln_cost_domain_transfer` | `bln_cost_domain_transfer` | `blnCostDomainTransfer` |  同成本域调拨 |
| `bln_fixed_asset` | `bln_fixed_asset` | `blnFixedAsset` | 是否转固 |
| `bln_not_verification` | `bln_not_verification` | `blnNotVerification` | 是否不核销 |
| `bln_paired` | `bln_paired` | `blnPaired` | 是否是成对单据 |
| `bln_self_consume` | `bln_self_consume` | `blnSelfConsume` | 是否自耗 |
| `bln_specified_diff` | `bln_specified_diff` | `blnSpecifiedDiff` | 是否指定处理尾差 |
| `bln_specify_cost` | `bln_specify_cost` | `blnSpecifyCost` | 是否携带成本 |
| `bln_update_cost` | `bln_update_cost` | `blnUpdateCost` | 是否更新存货 |
| `bln_verificationed` | `bln_verificationed` | `blnVerificationed` | 是否已核销 |
| `bln_waste` | `bln_waste` | `blnWaste` | 是否废品 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_direction` | `bill_direction` | `billDirection` | 单据方向 |
| `bln_gift` | `bln_gift` | `blnGift` | 物料业务类型 |
| `cost_accounting_method` | `cost_accounting_method` | `costAccountingMethod` | 委外成本核算方式 |
| `entry_mode` | `entry_mode` | `entryMode` | 分录方式 |
| `inout_direction` | `inout_direction` | `inoutDirection` | 出入库方向 |
| `osm_busi_type` | `osm_busi_type` | `osmBusiType` | 委外业务类型 |
| `owner_type` | `owner_type` | `ownerType` | 货权归属 |
| `pair_type` | `pair_type` | `pairType` | 成对类型 |
| `price_method` | `price_method` | `priceMethod` | 计价方式 |
| `sale_style` | `sale_style` | `saleStyle` | 商品售卖类型 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `related_morph_in_count` | `related_morph_in_count` | `relatedMorphInCount` | 入库单据数量 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `fi_event_group` | `fi_event_group` | `fiEventGroup` | 会计事务分组 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_bill_version` | `src_bill_version` | `srcBillVersion` | 来源单据版本 |

### 数值字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_bill_row_no` | `busi_bill_row_no` | `busiBillRowNo` | 单据行号 |
| `busi_src_bill_row_no` | `busi_src_bill_row_no` | `busiSrcBillRowNo` | 业务来源单据行号 |
| `cost_amount` | `cost_amount` | `costAmount` | 成本金额 |
| `cost_price` | `cost_price` | `costPrice` | 成本单价 |
| `dis_assemble_ratio` | `dis_assemble_ratio` | `disAssembleRatio` |  拆分比例 |
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
| `org_price` | `org_price` | `orgPrice` | 组织本币成本单价 |
| `org_trade_rate` | `org_trade_rate` | `orgTradeRate` |  组织本币交易汇率 |
| `ori_bill_row_no` | `ori_bill_row_no` | `oriBillRowNo` | 源头单据行号 |
| `osm_vice_product_num` | `osm_vice_product_num` | `osmViceProductNum` | 副产品数量 |
| `po_row_no` | `po_row_no` | `poRowNo` | 采购订单行号 |
| `process_sort_no` | `process_sort_no` | `processSortNo` | 工序顺序号 |
| `so_row_no` | `so_row_no` | `soRowNo` | 销售订单行号 |
| `src_bill_row_no` | `src_bill_row_no` | `srcBillRowNo` | 来源单据行号 |
| `tax` | `tax` | `tax` | 税额 |
| `tax_amount` | `tax_amount` | `taxAmount` | 含税金额 |
| `tax_price` | `tax_price` | `taxPrice` |  含税单价 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 流水账子表自定义项特征 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mat_ch_id` | `mat_ch_id` | `matChId` | 物料自由项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `costItems` | 费用项目表 |
