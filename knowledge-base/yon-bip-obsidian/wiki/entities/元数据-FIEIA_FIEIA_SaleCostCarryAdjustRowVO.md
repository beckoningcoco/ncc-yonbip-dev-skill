---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.SaleCostCarryAdjustRowVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售成本结转调整综合信息 (`FIEIA.FIEIA.SaleCostCarryAdjustRowVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`6e9d25f2-68a0-40c2-a824-8aac441a8b16`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售成本结转调整综合信息 |
| 物理表 | `ia_ledger_b` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 359 个 |
| 子表 | 1 个 |
| 关联引用 | 77 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `costElements` | `FIEIA.FIEIA.SaleCostCarryAdjustCostElemVO` | composition |

## 关联引用 (77个)

| 字段名 | 引用类型 |
|--------|---------|
| `ori_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs_id` | `` |
| `busi_event` | `yonbip-fi-eeac.RefTable_02c132dc2` |
| `ipv_price_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `collector_id` | `finbd.bd_costcollectoritem01listref` |
| `busi_man_id` | `ucf-staff-center.bd_staff_all_ref` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `sale_org_id` | `ucf-org-center.bd_salesorg` |
| `ipv_price_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `busi_wbs_id` | `yonbip-pm-commonbd.RefTable_1906842236` |
| `busi_cost_center_id` | `finbd.bd_costcenterref` |
| `busi_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `order_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `org_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `en_pricedif_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `req_cost_center_id` | `finbd.bd_costcenterref` |
| `global_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `busi_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `en_acc_id` | `fiepub.fiepub_accsubjectref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `group_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `period_id` | `finbd.bd_period` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `en_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `req_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `free_ch_id` | `` |
| `mainbus_acc_id` | `fiepub.fiepub_accsubjectref` |
| `ppv_price_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `ppv_price_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `opp_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `header_id` | `` |
| `req_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `accbook_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ipv_rate_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `activity_id` | `` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `en_pricedif_acc_id` | `fiepub.fiepub_accsubjectref` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `inventory_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `en_ratedif_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `inventory_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `ia_sku_id` | `` |
| `order_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `company_id` | `finbd.bd_allaccbodyref_inner` |
| `src_bill_type_id` | `transtype.bd_billtypetreeref` |
| `write_off_src_data_id` | `` |
| `busi_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `control_trade_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `write_off_src_data_h_id` | `` |
| `cost_domain_id` | `yonbip-fi-eia.RefTable_0e6f869743` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `inventory_obj_id` | `` |
| `src_bill_trade_type_id` | `transtype.bd_billtyperef` |
| `ori_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `mat_ch_id` | `` |
| `en_ratedif_acc_id` | `fiepub.fiepub_accsubjectref` |
| `so_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `invoice_supplier_id` | `yssupplier.aa_vendor` |
| `ipv_rate_acc_id` | `fiepub.epub_accsubject_treetableref` |
| `mainbus_acc_v_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 359 个直连字段

### 文本字段 (82个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_bill_row_no` | `busi_bill_row_no` | `busiBillRowNo` | 单据行号 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `busi_id` | `busi_id` | `busiId` | 会计事务ID |
| `fi_event_id` | `fi_event_id` | `fiEventId` | 会计事务类型id |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 会计事务类型编码 |
| `period_code` | `period_code` | `periodCode` | 记账会计期间编码 |
| `book_date` | `book_date` | `bookDate` | 记账日期 |
| `sort_no` | `sort_no` | `sortNo` | 记账序号 |
| `batch_no` | `batch_no` | `batchNo` | 批次号 |
| `mto_id` | `mto_id` | `mtoId` | mto订单ID |
| `mto_no` | `mto_no` | `mtoNo` | mto订单号 |
| `mto_row_id` | `mto_row_id` | `mtoRowId` | mto订单行Id |
| `so_id` | `so_id` | `soId` | 销售订单单据id |
| `so_code` | `so_code` | `soCode` | 销售订单单据号 |
| `so_g_id` | `so_g_id` | `soGId` | 销售订单孙表id |
| `so_b_id` | `so_b_id` | `soBId` | 销售订单子表id |
| `output_type` | `output_type` | `outputType` | 产出类型 |
| `rate_date` | `rate_date` | `rateDate` | 汇率日期 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行id |
| `busi_bill_id` | `busi_bill_id` | `busiBillId` | 业务单据id |
| `busi_bill_no` | `busi_bill_no` | `busiBillNo` | 业务单据号 |
| `busi_bill_date` | `busi_bill_date` | `busiBillDate` | 业务单据日期 |
| `busi_bill_row_id` | `busi_bill_row_id` | `busiBillRowId` | 业务单据行id |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据id |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据编号 |
| `ori_bill_date` | `ori_bill_date` | `oriBillDate` | 源头单据日期 |
| `ori_bill_row_id` | `ori_bill_row_id` | `oriBillRowId` | 源头单据行id |
| `ori_bill_row_no` | `ori_bill_row_no` | `oriBillRowNo` | 源头单据行号 |
| `product_date` | `product_date` | `productDate` | 生产日期 |
| `validity_date` | `validity_date` | `validityDate` | 有效期至 |
| `reserve` | `reserve` | `reserve` | 预留对象 |
| `stock_status` | `stock_status` | `stockStatus` | 库存状态 |
| `order_id` | `order_id` | `orderId` | 其他订单单据id |
| `order_no` | `order_no` | `orderNo` | 其他订单单据号 |
| `order_g_id` | `order_g_id` | `orderGId` | 其他订单孙表id |
| `order_row_no` | `order_row_no` | `orderRowNo` | 其他订单行号 |
| `order_b_id` | `order_b_id` | `orderBId` | 其他订单子表id |
| `pair_key` | `pair_key` | `pairKey` | 成对关系 |
| `send_goods_group` | `send_goods_group` | `sendGoodsGroup` | 发出商品分组 |
| `send_goods_group_type` | `send_goods_group_type` | `sendGoodsGroupType` | 发出商品分组类型 |
| `send_goods_group_name` | `send_goods_group_name` | `sendGoodsGroupName` | 发出商品分组名称 |
| `send_goods_group_basis` | `send_goods_group_basis` | `sendGoodsGroupBasis` | 发出商品分组依据 |
| `pair_source` | `pair_source` | `pairSource` | 成对线索 |
| `sterilisation_bill_row_id` | `sterilisation_bill_row_id` | `sterilisationBillRowId` | 冲销单据行号 |
| `opp_washed_row_id` | `opp_washed_row_id` | `oppWashedRowId` | 冲销对方行ID |
| `remarks_b` | `remarks_b` | `remarksB` | 备注 |
| `accbook_cost_source_memo` | `accbook_cost_source_memo` | `accbookCostSourceMemo` | 账簿本币成本来源描述 |
| `org_cost_source_memo` | `org_cost_source_memo` | `orgCostSourceMemo` | 组织本币成本来源描述 |
| `group_cost_source_memo` | `group_cost_source_memo` | `groupCostSourceMemo` | 集团本币成本来源描述 |
| `global_cost_source_memo` | `global_cost_source_memo` | `globalCostSourceMemo` | 全局本币成本来源描述 |
| `tax_item` | `tax_item` | `taxItem` | 税目 |
| `control_cost_source` | `control_cost_source` | `controlCostSource` | 管控范围本币成本来源 |
| `control_cost_source_memo` | `control_cost_source_memo` | `controlCostSourceMemo` | 管控本币成本来源描述 |
| `code` | `code` | `code` | 会计事务记录号 |
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
| `id` | `id` | `id` | id |
| `status` | `status` | `status` | 计算状态 |
| `accbook_cost_form` | `accbook_cost_form` | `accbookCostForm` | 账簿本币成本组成 |
| `busi_sort_no` | `busi_sort_no` | `busiSortNo` | 业务记账序号 |
| `control_cost_form` | `control_cost_form` | `controlCostForm` | 管控范围本币成本组成 |
| `entry_account_method` | `entry_account_method` | `entryAccountMethod` | 入账方式 |
| `global_cost_form` | `global_cost_form` | `globalCostForm` | 全局本币成本组成 |
| `group_cost_form` | `group_cost_form` | `groupCostForm` | 集团本币成本组成 |
| `org_cost_form` | `org_cost_form` | `orgCostForm` | 组织本币成本组成 |
| `period_status` | `period_status` | `periodStatus` | 业务期间状态标识 |
| `src_data_id` | `src_data_id` | `srcDataId` | 来源数据行ID |
| `src_data_type` | `src_data_type` | `srcDataType` | 来源数据类型 |
| `std_price_dimension` | `std_price_dimension` | `stdPriceDimension` | 标准取价匹配模式 |
| `work_center_id` | `work_center_id` | `workCenterId` | 工作中心 |
| `write_off_src_data_h_code` | `write_off_src_data_h_code` | `writeOffSrcDataHCode` | 冲销来源会计事务号 |

### 引用字段 (74个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿id |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `cost_domain_id` | `cost_domain_id` | `costDomainId` | 成本域 |
| `stock_org_id` | `stock_org_id` | `stockOrg` | 库存组织 |
| `sale_org_id` | `sale_org_id` | `saleOrg` | 销售组织 |
| `req_org_id` | `req_org_id` | `reqOrg` | 需求组织 |
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |
| `material_id` | `material_id` | `materialId` | 物料ID |
| `wbs_id` | `wbs_id` | `wbs` | WBS |
| `busi_wbs_id` | `busi_wbs_id` | `busiWbs` | 业务WBS |
| `activity_id` | `activity_id` | `activity` | 活动 |
| `product_id` | `product_id` | `productId` | 产品ID |
| `project_id` | `project_id` | `projectId` | 项目 |
| `so_trade_type_id` | `so_trade_type_id` | `soTradetypeId` | 销售订单交易类型 |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `opp_profit_center_id` | `opp_profit_center_id` | `oppProfitCenter` | 对方利润中心 |
| `company_id` | `company_id` | `company` | 公司 |
| `busi_dept_id` | `busi_dept_id` | `busiDept` | 部门 |
| `busi_cost_center_id` | `busi_cost_center_id` | `busiCostCenter` | 成本中心 |
| `req_dept_id` | `req_dept_id` | `reqDept` | 需求部门 |
| `req_cost_center_id` | `req_cost_center_id` | `reqCostCenter` | 需求成本中心 |
| `invoice_supplier_id` | `invoice_supplier_id` | `invoiceSupplierId` | 开票供应商 |
| `supplier_id` | `supplier_id` | `supplierId` | 供货供应商 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `busi_man_id` | `busi_man_id` | `busiManId` | 业务员 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源单据交易类型 |
| `busi_event` | `busi_event` | `busiEvent` | 业务事项 |
| `busi_bill_type_id` | `busi_bill_type_id` | `busiBillTypeId` | 业务单据类型 |
| `busi_trade_type_id` | `busi_trade_type_id` | `busiTradeTypeId` | 业务交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradeTypeId` | 源头交易类型 |
| `order_bill_type_id` | `order_bill_type_id` | `orderBillTypeId` | 其他订单单据类型 |
| `order_trade_type_id` | `order_trade_type_id` | `orderTradeTypeId` | 其他订单交易类型 |
| `currency_id` | `currency_id` | `currencyId` | 原币 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿本币 |
| `accbook_trade_rate_type` | `accbook_trade_rate_type` | `accbookTradeRateType` | 账簿本币交易汇率类型 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织本币 |
| `org_trade_rate_type` | `org_trade_rate_type` | `orgTradeRateType` | 组织本币交易汇率类型 |
| `group_currtype_id` | `group_currtype_id` | `groupCurrtypeId` | 集团本币 |
| `group_trade_rate_type` | `group_trade_rate_type` | `groupTradeRateType` | 集团本币交易汇率类型 |
| `global_currtype_id` | `global_currtype_id` | `globalCurrtypeId` | 全局本币 |
| `global_trade_rate_type` | `global_trade_rate_type` | `globalTradeRateType` | 全局本币交易汇率类型 |
| `inventory_acc_id` | `inventory_acc_id` | `inventoryAccId` | 存货科目 |
| `inventory_acc_v_id` | `inventory_acc_v_id` | `inventoryAccVId` | 存货科目版本ID |
| `en_acc_id` | `en_acc_id` | `enAccId` | 发出商品科目 |
| `en_acc_v_id` | `en_acc_v_id` | `enAccVId` | 发出商品科目版本ID |
| `mainbus_acc_id` | `mainbus_acc_id` | `mainbusAccId` | 主营业务成本科目 |
| `mainbus_acc_v_id` | `mainbus_acc_v_id` | `mainbusAccVId` | 销售成本科目版本ID |
| `en_ratedif_acc_id` | `en_ratedif_acc_id` | `enRatedifAccId` | 发出商品汇差科目 |
| `en_ratedif_acc_v_id` | `en_ratedif_acc_v_id` | `enRatedifAccVId` | 发出商品汇差科目科目版本 |
| `en_pricedif_acc_id` | `en_pricedif_acc_id` | `enPricedifAccId` | 发出商品价差科目 |
| `en_pricedif_acc_v_id` | `en_pricedif_acc_v_id` | `enPricedifAccVId` | 发出商品价差科目版本ID |
| `ipv_rate_acc_id` | `ipv_rate_acc_id` | `ipvRateAccId` | 汇率差异科目 |
| `ipv_rate_acc_v_id` | `ipv_rate_acc_v_id` | `ipvRateAccVId` | 汇率差异科目版本ID |
| `ppv_price_acc_id` | `ppv_price_acc_id` | `ppvPriceAccId` | 业务差异科目 |
| `ppv_price_acc_v_id` | `ppv_price_acc_v_id` | `ppvPriceAccVId` | 业务差异科目版本ID |
| `ipv_price_acc_id` | `ipv_price_acc_id` | `ipvPriceAccId` | 结算价格差异科目 |
| `ipv_price_acc_v_id` | `ipv_price_acc_v_id` | `ipvPriceAccVId` | 结算价格差异科目版本ID |
| `control_currtype_id` | `control_currtype_id` | `controlCurrtypeId` | 管控范围本币 |
| `control_trade_rate_type` | `control_trade_rate_type` | `controlTradeRateType` | 管控范围本币交易汇率类型 |
| `header_id` | `header_id` | `header` | 销售成本结转调整 |
| `ia_sku_id` | `ia_sku_id` | `iaSkuId` | 存货SKU |
| `inventory_obj_id` | `inventory_obj_id` | `inventoryObjId` | 存货对象 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `collector_id` | `collector_id` | `collectorId` | 成本收集器 |
| `write_off_src_data_h_id` | `write_off_src_data_h_id` | `writeOffSrcDataHId` | 冲销来源会计事务id |
| `write_off_src_data_id` | `write_off_src_data_id` | `writeOffSrcDataId` | 冲销来源会计事务行ID |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_update_cost` | `bln_update_cost` | `blnUpdateCost` | 是否更新存货 |
| `bln_waste` | `bln_waste` | `blnWaste` | 是否废品 |
| `bln_specify_cost` | `bln_specify_cost` | `blnSpecifyCost` | 是否携带成本 |
| `bln_specified_diff` | `bln_specified_diff` | `blnSpecifiedDiff` | 是否指定处理尾差 |
| `bln_allow_zero` | `bln_allow_zero` | `blnAllowZero` | 零成本 |
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 冲销标识 |

### 枚举字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_gift` | `bln_gift` | `blnGift` | 是否赠品 |
| `sale_style` | `sale_style` | `saleStyle` | 商品售卖类型 |
| `price_method` | `price_method` | `priceMethod` | 计价方式 |
| `compute_method` | `compute_method` | `computeMethod` | 计算方式 |
| `dir` | `dir` | `dir` | 计算方向 |
| `pair_type` | `pair_type` | `pairType` | 成对类型 |
| `carry_over_method` | `carry_over_method` | `carryOverMethod` | 结转方式 |
| `carry_over_of_cost_method` | `carry_over_of_cost_method` | `carryOverOfCostMethod` | 发出商品结转方式 |
| `accbook_cost_source` | `accbook_cost_source` | `accbookCostSource` | 账簿本币成本来源 |
| `org_cost_source` | `org_cost_source` | `orgCostSource` | 组织本币成本来源 |
| `group_cost_source` | `group_cost_source` | `groupCostSource` | 集团本币成本来源 |
| `global_cost_source` | `global_cost_source` | `globalCostSource` | 全局本币成本来源 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_trade_rate` | `org_trade_rate` | `orgTradeRate` | 组织本币交易汇率 |
| `accbook_currency_rate_ops` | `accbook_currency_rate_ops` | `accbookCurrencyRateOps` | 账簿本币汇率折算方式 |
| `control_currency_rate_ops` | `control_currency_rate_ops` | `controlCurrencyRateOps` | 管控范围币汇率折算方式 |
| `global_currency_rate_ops` | `global_currency_rate_ops` | `globalCurrencyRateOps` | 全局币汇率折算方式 |
| `group_currency_rate_ops` | `group_currency_rate_ops` | `groupCurrencyRateOps` | 集团币汇率折算方式 |
| `org_trade_rate_ops` | `org_trade_rate_ops` | `orgTradeRateOps` | 组织币汇率折算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `storekeeper_id` | `storekeeper_id` | `storekeeperId` | 库管员 |
| `src_bill_version` | `src_bill_version` | `srcBillVersion` | 来源单据版本号 |

### 数值字段 (169个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mto_row_no` | `mto_row_no` | `mtoRowNo` | mto订单行号 |
| `so_row_no` | `so_row_no` | `soRowNo` | 销售订单行号 |
| `src_bill_row_no` | `src_bill_row_no` | `srcBillRowNo` | 来源单据行号 |
| `num` | `num` | `num` | 主计量数量 |
| `no_settle_num` | `no_settle_num` | `noSettleNum` | 未结算数量 |
| `balance_num` | `balance_num` | `balanceNum` | 剩余数量 |
| `no_deduction_tax` | `no_deduction_tax` | `noDeductionTax` | 不可抵扣税额 |
| `cost_price` | `cost_price` | `costPrice` | 成本单价 |
| `cost_amount` | `cost_amount` | `costAmount` | 成本金额 |
| `notax_price` | `notax_price` | `notaxPrice` | 无税单价 |
| `notax_amount` | `notax_amount` | `notaxAmount` | 无税金额 |
| `tax_price` | `tax_price` | `taxPrice` | 含税单价 |
| `tax_amount` | `tax_amount` | `taxAmount` | 含税金额 |
| `accbook_price` | `accbook_price` | `accbookPrice` | 账簿本币成本单价 |
| `accbook_amount` | `accbook_amount` | `accbookAmount` | 账簿本币成本金额 |
| `accbook_std_price` | `accbook_std_price` | `accbookStdPrice` | 账簿本币标准单价 |
| `accbook_std_amount` | `accbook_std_amount` | `accbookStdAmount` | 账簿本币标准金额 |
| `accbook_trade_rate` | `accbook_trade_rate` | `accbookTradeRate` | 账簿本币交易汇率 |
| `accbook_ipv_dif` | `accbook_ipv_dif` | `accbookIpvDif` | 账簿本币结算价格差异 |
| `accbook_balance_amount` | `accbook_balance_amount` | `accbookBalanceAmount` | 账簿本币结存金额 |
| `org_price` | `org_price` | `orgPrice` | 组织本币成本单价 |
| `org_amount` | `org_amount` | `orgAmount` | 组织本币成本金额 |
| `org_std_price` | `org_std_price` | `orgStdPrice` | 组织本币标准单价 |
| `org_std_amount` | `org_std_amount` | `orgStdAmount` | 组织本币标准金额 |
| `org_ipv_dif` | `org_ipv_dif` | `orgIpvDif` | 组织本币结算价格差异 |
| `org_balance_amount` | `org_balance_amount` | `orgBalanceAmount` | 组织本币结存金额 |
| `group_price` | `group_price` | `groupPrice` | 集团本币成本单价 |
| `group_amount` | `group_amount` | `groupAmount` | 集团本币成本金额 |
| `group_std_price` | `group_std_price` | `groupStdPrice` | 集团本币标准单价 |
| `group_std_amount` | `group_std_amount` | `groupStdAmount` | 集团本币标准金额 |
| `group_trade_rate` | `group_trade_rate` | `groupTradeRate` | 集团本币交易汇率 |
| `group_ipv_dif` | `group_ipv_dif` | `groupIpvDif` | 集团本币结算价格差异 |
| `group_balance_amount` | `group_balance_amount` | `groupBalanceAmount` | 集团本币结存金额 |
| `global_price` | `global_price` | `globalPrice` | 全局本币成本单价 |
| `global_amount` | `global_amount` | `globalAmount` | 全局本币成本金额 |
| `global_std_price` | `global_std_price` | `globalStdPrice` | 全局本币标准单价 |
| `global_std_amount` | `global_std_amount` | `globalStdAmount` | 全局本币标准金额 |
| `global_trade_rate` | `global_trade_rate` | `globalTradeRate` | 全局本币交易汇率 |
| `global_ipv_dif` | `global_ipv_dif` | `globalIpvDif` | 全局本币结算价格差异 |
| `global_balance_amount` | `global_balance_amount` | `globalBalanceAmount` | 全局本币结存金额 |
| `tax` | `tax` | `tax` | 税额 |
| `control_amount` | `control_amount` | `controlAmount` | 管控范围本币成本金额 |
| `control_balance_amount` | `control_balance_amount` | `controlBalanceAmount` | 管控范围本币结存金额 |
| `control_ipv_dif` | `control_ipv_dif` | `controlIpvDif` | 管控范围本币结算价格差异 |
| `control_price` | `control_price` | `controlPrice` | 管控范围本币成本单价 |
| `control_std_amount` | `control_std_amount` | `controlStdAmount` | 管控范围本币标准金额 |
| `control_std_price` | `control_std_price` | `controlStdPrice` | 管控范围本币标准单价 |
| `control_trade_rate` | `control_trade_rate` | `controlTradeRate` | 管控范围本币交易汇率 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |
| `accbook_balance_busi_dif` | `accbook_balance_busi_dif` | `accbookBalanceBusiDif` | 账簿本币结余业务差异 |
| `accbook_balance_ipv_dif` | `accbook_balance_ipv_dif` | `accbookBalanceIpvDif` | 账簿本币结余结算差异 |
| `accbook_balance_ipv_rate_dif` | `accbook_balance_ipv_rate_dif` | `accbookBalanceIpvRateDif` | 账簿本币结余汇率差异 |
| `accbook_balance_ppd_dif` | `accbook_balance_ppd_dif` | `accbookBalancePpdDif` | 账簿本币结余生产差异 |
| `accbook_balance_std_amount` | `accbook_balance_std_amount` | `accbookBalanceStdAmount` | 账簿本币结余标准金额 |
| `accbook_balance_std_price` | `accbook_balance_std_price` | `accbookBalanceStdPrice` | 账簿本币结余标准单价 |
| `accbook_balance_this_busi_dif` | `accbook_balance_this_busi_dif` | `accbookBalanceThisBusiDif` | 账簿本币结余本层业务差异 |
| `accbook_balance_this_cost_amount` | `accbook_balance_this_cost_amount` | `accbookBalanceThisCostAmount` | 账簿本币结余本层成本金额 |
| `accbook_balance_this_ppd_dif` | `accbook_balance_this_ppd_dif` | `accbookBalanceThisPpdDif` | 账簿本币结余本层生产差异 |
| `accbook_balance_this_std_amount` | `accbook_balance_this_std_amount` | `accbookBalanceThisStdAmount` | 账簿本币结余本层标准金额 |
| `accbook_busi_dif` | `accbook_busi_dif` | `accbookBusiDif` | 账簿本币业务差异 |
| `accbook_ipv_rate_dif` | `accbook_ipv_rate_dif` | `accbookIpvRateDif` | 账簿本币汇率差异 |
| `accbook_ppd_dif` | `accbook_ppd_dif` | `accbookPpdDif` | 账簿本币生产价格差异 |
| `accbook_reserv_dif1` | `accbook_reserv_dif1` | `accbookReservDif1` | 账簿本币预留差异1 |
| `accbook_reserv_dif2` | `accbook_reserv_dif2` | `accbookReservDif2` | 账簿本币预留差异2 |
| `accbook_settled_amount` | `accbook_settled_amount` | `accbookSettledAmount` | 账簿本币结算后金额 |
| `accbook_settled_price` | `accbook_settled_price` | `accbookSettledPrice` | 账簿本币结算后单价 |
| `accbook_this_balance_amount` | `accbook_this_balance_amount` | `accbookThisBalanceAmount` | 账簿本币本层结余金额 |
| `accbook_this_busi_dif` | `accbook_this_busi_dif` | `accbookThisBusiDif` | 账簿本币本层业务差异 |
| `accbook_this_cost_amount` | `accbook_this_cost_amount` | `accbookThisCostAmount` | 账簿本币本层成本金额 |
| `accbook_this_cost_price` | `accbook_this_cost_price` | `accbookThisCostPrice` | 账簿本币本层成本单价 |
| `accbook_this_ppd_dif` | `accbook_this_ppd_dif` | `accbookThisPpdDif` | 账簿本币本层生产价格差异 |
| `accbook_this_std_amount` | `accbook_this_std_amount` | `accbookThisStdAmount` | 账簿本币本层标准金额 |
| `accbook_this_std_price` | `accbook_this_std_price` | `accbookThisStdPrice` | 账簿本币本层标准单价 |
| `control_balance_busi_dif` | `control_balance_busi_dif` | `controlBalanceBusiDif` | 管控范围本币结余业务差异 |
| `control_balance_ipv_dif` | `control_balance_ipv_dif` | `controlBalanceIpvDif` | 管控范围本币结余结算差异 |
| `control_balance_ipv_rate_dif` | `control_balance_ipv_rate_dif` | `controlBalanceIpvRateDif` | 管控范围本币结余汇率差异 |
| `control_balance_ppd_dif` | `control_balance_ppd_dif` | `controlBalancePpdDif` | 管控范围本币结余生产差异 |
| `control_balance_std_amount` | `control_balance_std_amount` | `controlBalanceStdAmount` | 管控范围本币结余标准金额 |
| `control_balance_std_price` | `control_balance_std_price` | `controlBalanceStdPrice` | 管控范围本币结余标准单价 |
| `control_balance_this_busi_dif` | `control_balance_this_busi_dif` | `controlBalanceThisBusiDif` | 管控范围本币结余本层业务差异 |
| `control_balance_this_cost_amount` | `control_balance_this_cost_amount` | `controlBalanceThisCostAmount` | 管控范围本币结余本层成本金额 |
| `control_balance_this_ppd_dif` | `control_balance_this_ppd_dif` | `controlBalanceThisPpdDif` | 管控范围本币结余本层生产差异 |
| `control_balance_this_std_amount` | `control_balance_this_std_amount` | `controlBalanceThisStdAmount` | 管控范围本币结余本层标准金额 |
| `control_busi_dif` | `control_busi_dif` | `controlBusiDif` | 管控范围本币业务差异 |
| `control_ipv_rate_dif` | `control_ipv_rate_dif` | `controlIpvRateDif` | 管控范围本币汇率差异 |
| `control_ppd_dif` | `control_ppd_dif` | `controlPpdDif` | 管控范围本币生产价格差异 |
| `control_reserv_dif1` | `control_reserv_dif1` | `controlReservDif1` | 管控范围本币预留差异1 |
| `control_reserv_dif2` | `control_reserv_dif2` | `controlReservDif2` | 管控范围本币预留差异2 |
| `control_settled_amount` | `control_settled_amount` | `controlSettledAmount` | 管控范围本币结算后金额 |
| `control_settled_price` | `control_settled_price` | `controlSettledPrice` | 管控范围本币结算后单价 |
| `control_this_balance_amount` | `control_this_balance_amount` | `controlThisBalanceAmount` | 管控范围本币本层结余金额 |
| `control_this_busi_dif` | `control_this_busi_dif` | `controlThisBusiDif` | 管控范围本币本层业务差异 |
| `control_this_cost_amount` | `control_this_cost_amount` | `controlThisCostAmount` | 管控范围本币本层成本金额 |
| `control_this_cost_price` | `control_this_cost_price` | `controlThisCostPrice` | 管控范围本币本层成本单价 |
| `control_this_ppd_dif` | `control_this_ppd_dif` | `controlThisPpdDif` | 管控范围本币本层生产价格差异 |
| `control_this_std_amount` | `control_this_std_amount` | `controlThisStdAmount` | 管控范围本币本层标准金额 |
| `control_this_std_price` | `control_this_std_price` | `controlThisStdPrice` | 管控范围本币本层标准单价 |
| `global_balance_busi_dif` | `global_balance_busi_dif` | `globalBalanceBusiDif` | 全局本币结余业务差异 |
| `global_balance_ipv_dif` | `global_balance_ipv_dif` | `globalBalanceIpvDif` | 全局本币结余结算差异 |
| `global_balance_ipv_rate_dif` | `global_balance_ipv_rate_dif` | `globalBalanceIpvRateDif` | 全局本币结余汇率差异 |
| `global_balance_ppd_dif` | `global_balance_ppd_dif` | `globalBalancePpdDif` | 全局本币结余生产差异 |
| `global_balance_std_amount` | `global_balance_std_amount` | `globalBalanceStdAmount` | 全局本币结余标准金额 |
| `global_balance_std_price` | `global_balance_std_price` | `globalBalanceStdPrice` | 全局本币结余标准单价 |
| `global_balance_this_busi_dif` | `global_balance_this_busi_dif` | `globalBalanceThisBusiDif` | 全局本币结余本层业务差异 |
| `global_balance_this_cost_amount` | `global_balance_this_cost_amount` | `globalBalanceThisCostAmount` | 全局本币结余本层成本金额 |
| `global_balance_this_ppd_dif` | `global_balance_this_ppd_dif` | `globalBalanceThisPpdDif` | 全局本币结余本层生产差异 |
| `global_balance_this_std_amount` | `global_balance_this_std_amount` | `globalBalanceThisStdAmount` | 全局本币结余本层标准金额 |
| `global_busi_dif` | `global_busi_dif` | `globalBusiDif` | 全局本币业务差异 |
| `global_ipv_rate_dif` | `global_ipv_rate_dif` | `globalIpvRateDif` | 全局本币汇率差异 |
| `global_ppd_dif` | `global_ppd_dif` | `globalPpdDif` | 全局本币生产价格差异 |
| `global_reserv_dif1` | `global_reserv_dif1` | `globalReservDif1` | 全局本币预留差异1 |
| `global_reserv_dif2` | `global_reserv_dif2` | `globalReservDif2` | 全局本币预留差异2 |
| `global_settled_amount` | `global_settled_amount` | `globalSettledAmount` | 全局本币结算后金额 |
| `global_settled_price` | `global_settled_price` | `globalSettledPrice` | 全局本币结算后单价 |
| `global_this_balance_amount` | `global_this_balance_amount` | `globalThisBalanceAmount` | 全局本币本层结余金额 |
| `global_this_busi_dif` | `global_this_busi_dif` | `globalThisBusiDif` | 全局本币本层业务差异 |
| `global_this_cost_amount` | `global_this_cost_amount` | `globalThisCostAmount` | 全局本币本层成本金额 |
| `global_this_cost_price` | `global_this_cost_price` | `globalThisCostPrice` | 全局本币本层成本单价 |
| `global_this_ppd_dif` | `global_this_ppd_dif` | `globalThisPpdDif` | 全局本币本层生产价格差异 |
| `global_this_std_amount` | `global_this_std_amount` | `globalThisStdAmount` | 全局本币本层标准金额 |
| `global_this_std_price` | `global_this_std_price` | `globalThisStdPrice` | 全局本币本层标准单价 |
| `group_balance_busi_dif` | `group_balance_busi_dif` | `groupBalanceBusiDif` | 集团本币结余业务差异 |
| `group_balance_ipv_dif` | `group_balance_ipv_dif` | `groupBalanceIpvDif` | 集团本币结余结算差异 |
| `group_balance_ipv_rate_dif` | `group_balance_ipv_rate_dif` | `groupBalanceIpvRateDif` | 集团本币结余汇率差异 |
| `group_balance_ppd_dif` | `group_balance_ppd_dif` | `groupBalancePpdDif` | 集团本币结余生产差异 |
| `group_balance_std_amount` | `group_balance_std_amount` | `groupBalanceStdAmount` | 集团本币结余标准金额 |
| `group_balance_std_price` | `group_balance_std_price` | `groupBalanceStdPrice` | 集团本币结余标准单价 |
| `group_balance_this_busi_dif` | `group_balance_this_busi_dif` | `groupBalanceThisBusiDif` | 集团本币结余本层业务差异 |
| `group_balance_this_cost_amount` | `group_balance_this_cost_amount` | `groupBalanceThisCostAmount` | 集团本币结余本层成本金额 |
| `group_balance_this_ppd_dif` | `group_balance_this_ppd_dif` | `groupBalanceThisPpdDif` | 集团本币结余本层生产差异 |
| `group_balance_this_std_amount` | `group_balance_this_std_amount` | `groupBalanceThisStdAmount` | 集团本币结余本层标准金额 |
| `group_busi_dif` | `group_busi_dif` | `groupBusiDif` | 集团本币业务差异 |
| `group_ipv_rate_dif` | `group_ipv_rate_dif` | `groupIpvRateDif` | 集团本币汇率差异 |
| `group_ppd_dif` | `group_ppd_dif` | `groupPpdDif` | 集团本币生产价格差异 |
| `group_reserv_dif1` | `group_reserv_dif1` | `groupReservDif1` | 集团本币预留差异1 |
| `group_reserv_dif2` | `group_reserv_dif2` | `groupReservDif2` | 集团本币预留差异2 |
| `group_settled_amount` | `group_settled_amount` | `groupSettledAmount` | 集团本币结算后金额 |
| `group_settled_price` | `group_settled_price` | `groupSettledPrice` | 集团本币结算后单价 |
| `group_this_balance_amount` | `group_this_balance_amount` | `groupThisBalanceAmount` | 集团本币本层结余金额 |
| `group_this_busi_dif` | `group_this_busi_dif` | `groupThisBusiDif` | 集团本币本层业务差异 |
| `group_this_cost_amount` | `group_this_cost_amount` | `groupThisCostAmount` | 集团本币本层成本金额 |
| `group_this_cost_price` | `group_this_cost_price` | `groupThisCostPrice` | 集团本币本层成本单价 |
| `group_this_ppd_dif` | `group_this_ppd_dif` | `groupThisPpdDif` | 集团本币本层生产价格差异 |
| `group_this_std_amount` | `group_this_std_amount` | `groupThisStdAmount` | 集团本币本层标准金额 |
| `group_this_std_price` | `group_this_std_price` | `groupThisStdPrice` | 集团本币本层标准单价 |
| `org_balance_busi_dif` | `org_balance_busi_dif` | `orgBalanceBusiDif` | 组织本币结余业务差异 |
| `org_balance_ipv_dif` | `org_balance_ipv_dif` | `orgBalanceIpvDif` | 组织本币结余结算差异 |
| `org_balance_ipv_rate_dif` | `org_balance_ipv_rate_dif` | `orgBalanceIpvRateDif` | 组织本币结余汇率差异 |
| `org_balance_ppd_dif` | `org_balance_ppd_dif` | `orgBalancePpdDif` | 组织本币结余生产差异 |
| `org_balance_std_amount` | `org_balance_std_amount` | `orgBalanceStdAmount` | 组织本币结余标准金额 |
| `org_balance_std_price` | `org_balance_std_price` | `orgBalanceStdPrice` | 组织本币结余标准单价 |
| `org_balance_this_busi_dif` | `org_balance_this_busi_dif` | `orgBalanceThisBusiDif` | 组织本币结余本层业务差异 |
| `org_balance_this_cost_amount` | `org_balance_this_cost_amount` | `orgBalanceThisCostAmount` | 组织本币结余本层成本金额 |
| `org_balance_this_ppd_dif` | `org_balance_this_ppd_dif` | `orgBalanceThisPpdDif` | 组织本币结余本层生产差异 |
| `org_balance_this_std_amount` | `org_balance_this_std_amount` | `orgBalanceThisStdAmount` | 组织本币结余本层标准金额 |
| `org_busi_dif` | `org_busi_dif` | `orgBusiDif` | 组织本币业务差异 |
| `org_ipv_rate_dif` | `org_ipv_rate_dif` | `orgIpvRateDif` | 组织本币汇率差异 |
| `org_ppd_dif` | `org_ppd_dif` | `orgPpdDif` | 组织本币生产价格差异 |
| `org_reserv_dif1` | `org_reserv_dif1` | `orgReservDif1` | 组织本币预留差异1 |
| `org_reserv_dif2` | `org_reserv_dif2` | `orgReservDif2` | 组织本币预留差异2 |
| `org_settled_amount` | `org_settled_amount` | `orgSettledAmount` | 组织本币结算后金额 |
| `org_settled_price` | `org_settled_price` | `orgSettledPrice` | 组织本币结算后单价 |
| `org_this_balance_amount` | `org_this_balance_amount` | `orgThisBalanceAmount` | 组织本币本层结余金 |
| `org_this_busi_dif` | `org_this_busi_dif` | `orgThisBusiDif` | 组织本币本层业务差异 |
| `org_this_cost_amount` | `org_this_cost_amount` | `orgThisCostAmount` | 组织本币本层成本金额 |
| `org_this_cost_price` | `org_this_cost_price` | `orgThisCostPrice` | 组织本币本层成本单价 |
| `org_this_ppd_dif` | `org_this_ppd_dif` | `orgThisPpdDif` | 组织本币本层生产价格差异 |
| `org_this_std_amount` | `org_this_std_amount` | `orgThisStdAmount` | 组织本币本层标准金额 |
| `org_this_std_price` | `org_this_std_price` | `orgThisStdPrice` | 组织本币本层标准单价 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mat_ch_id` | `mat_ch_id` | `matChId` | 物料自由项特征组 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 销售成本结转调整综合信息自定义项特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `costElements` | 销售成本结转调整分项信息 |
