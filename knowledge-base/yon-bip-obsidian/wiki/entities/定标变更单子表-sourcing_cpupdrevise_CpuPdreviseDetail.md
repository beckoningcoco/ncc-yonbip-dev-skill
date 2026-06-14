---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.cpupdrevise.CpuPdreviseDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标变更单子表 (`sourcing.cpupdrevise.CpuPdreviseDetail`)

> ycSouringInquiry | 物理表：`cpu_pdrevise_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标变更单子表 |
| 物理表 | `cpu_pdrevise_detail` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:05.5480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（117个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `cpuPdreviseDetailFreeCharacteristics` | 定标变更单子表自由项特征组 | `free_characters_id` | f323d480-e785-46f1-871e-d6f326f8b75c |
| 2 | `rowno` | 行号 | `rowno` | String |
| 3 | `vbuyofferBillcode` | 询价单号 | `vbuyoffer_billcode` | String |
| 4 | `puorgDocName` | 寻源采购组织 | `puorg_doc_name` | String |
| 5 | `puPsnName` | 采购员 | `pu_psn_name` | String |
| 6 | `decideTime` | 定标日期 | `decide_time` | DateTime |
| 7 | `materialCode` | 物料编码 | `material_code` | String |
| 8 | `materialName` | 物料名称 | `material_name` | String |
| 9 | `materialDesc` | 物料描述 | `material_desc` | String |
| 10 | `spec` | 规格 | `spec` | String |
| 11 | `model` | 型号 | `model` | String |
| 12 | `priceStrategy` | 取价策略id | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 |
| 13 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | eb9690f1-b4ed-4223-8ce3-06710f2c6242 |
| 14 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 15 | `sourcecode` | ERP请购单号 | `sourcecode` | String |
| 16 | `pritemid` | 采购需求号 | `pritemid` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 17 | `reviseReason` | 变更理由 | `revise_reason` | String |
| 18 | `supEnterpriseName` | 原中标供应商 | `sup_enterprise_name` | String |
| 19 | `quotaNum` | 原中标数量 | `quota_num` | Decimal |
| 20 | `quotaUnit` | 报价单位 | `quota_unit` | String |
| 21 | `bidNumType` | 原中标类型1. 现金 2. 承兑 3. 账期 | `bid_num_type` | String |
| 22 | `quotaPrice` | 原中标现金单价(含税) | `quota_price` | Decimal |
| 23 | `quotaMoney` | 原中标现金金额(含税) | `quota_money` | Decimal |
| 24 | `noTaxPrice` | 原中标现金单价(无税) | `no_tax_price` | Decimal |
| 25 | `noTaxMoney` | 原中标现金金额(无税) | `no_tax_money` | Decimal |
| 26 | `acceptancePrice` | 原中标承兑单价(含税) | `acceptance_price` | Decimal |
| 27 | `acceptanceMny` | 原中标承兑金额(含税) | `acceptance_mny` | Decimal |
| 28 | `acceptanceNoTaxPrice` | 原中标承兑单价(无税) | `acceptance_no_tax_price` | Decimal |
| 29 | `acceptanceNoTaxMny` | 原中标承兑金额(无税) | `acceptance_no_tax_mny` | Decimal |
| 30 | `paymentPrice` | 原中标账期单价(含税) | `payment_price` | Decimal |
| 31 | `paymentMny` | 原中标账期金额(含税) | `payment_mny` | Decimal |
| 32 | `paymentNoTaxPrice` | 原中标账期单价(无税) | `payment_no_tax_price` | Decimal |
| 33 | `paymentNoTaxMny` | 原中标账期金额(无税) | `payment_no_tax_mny` | Decimal |
| 34 | `taxrate` | 原中标税率 | `taxrate` | String |
| 35 | `exchangeRate` | 原中标单位换算率 | `exchange_rate` | Decimal |
| 36 | `quotaProportion` | 原中标配额比例 | `quota_proportion` | Decimal |
| 37 | `quotaPercentage` | 原中标配额百分比 | `quota_percentage` | Decimal |
| 38 | `newSupEnterpriseName` | 新中标供应商 | `new_sup_enterprise_name` | String |
| 39 | `newQuotaNum` | 新中标数量 | `new_quota_num` | Decimal |
| 40 | `newTaxrate` | 新中标税率 | `new_taxrate` | String |
| 41 | `newBidNumType` | 新中标类型(1. 现金 2. 承兑 3. 账期) | `new_bid_num_type` | String |
| 42 | `newExchangeRate` | 新中标单位换算率 | `new_exchange_rate` | Decimal |
| 43 | `newNoTaxPrice` | 新中标现金单价(无税) | `new_no_tax_price` | Decimal |
| 44 | `newQuotaPrice` | 新中标现金单价(含税) | `new_quota_price` | Decimal |
| 45 | `newQuotaMoney` | 新中标现金金额(含税) | `new_quota_money` | Decimal |
| 46 | `newNoTaxMoney` | 新中标现金金额(无税) | `new_no_tax_money` | Decimal |
| 47 | `newAcceptancePrice` | 新中标承兑单价(含税) | `new_acceptance_price` | Decimal |
| 48 | `newAcceptanceNoTaxPrice` | 新中标承兑单价(无税) | `new_acceptance_no_tax_price` | Decimal |
| 49 | `newPaymentPrice` | 新中标账期单价(含税) | `new_payment_price` | Decimal |
| 50 | `newPaymentNoTaxPrice` | 新中标账期单价(无税) | `new_payment_no_tax_price` | Decimal |
| 51 | `newAcceptanceMny` | 新中标承兑金额(含税) | `new_acceptance_mny` | Decimal |
| 52 | `newAcceptanceNoTaxMny` | 新中标承兑金额(无税) | `new_acceptance_no_tax_mny` | Decimal |
| 53 | `newPaymentMny` | 新中标账期金额(含税) | `new_payment_mny` | Decimal |
| 54 | `newPaymentNoTaxMny` | 新中标账期金额(无税) | `new_payment_no_tax_mny` | Decimal |
| 55 | `newQuotaProportion` | 新中标配额比例 | `new_quota_proportion` | Decimal |
| 56 | `newQuotaPercentage` | 新中标配额百分比 | `new_quota_percentage` | Decimal |
| 57 | `subject` | 项目 | `subject` | String |
| 58 | `memo` | 备注 | `memo` | String |
| 59 | `status` | 变更单行状态 | `status` | String |
| 60 | `id` | ID | `id` | Long |
| 61 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 62 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 63 | `createTime` | 创建时间 | `create_time` | DateTime |
| 64 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 65 | `creator` | 创建人 | `creator` | String |
| 66 | `modifier` | 修改人 | `modifier` | String |
| 67 | `dr` | ts | `dr` | String |
| 68 | `reviseHid` | 定标变更单主表ID | `revise_hid` | e286a252-d5eb-4115-8c1c-a01093deae58 |
| 69 | `cpuPdheadId` | 定标单主表id | `cpu_pdhead_id` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 70 | `cpuPdbodyId` | 定标单物料子表ID | `cpu_pdbody_id` | 5ad37a5c-0251-495d-8791-6c08a9d69254 |
| 71 | `buyofferid` | 询价单主表ID | `buyofferid` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 72 | `buyofferdetailid` | 询价单子表ID | `buyofferdetailid` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 73 | `quotaofferid` | 原报价单主表ID | `quotaofferid` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 74 | `quotaofferdetailid` | 原报价单子表ID | `quotaofferdetailid` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 75 | `newQuotaofferid` | 新报价单主表ID | `new_quotaofferid` | Long |
| 76 | `newQuotaofferdetailid` | 新报价单子表id | `new_quotaofferdetailid` | Long |
| 77 | `decideUserId` | 定标人id | `decide_user_id` | Long |
| 78 | `decideUserName` | 定标人 | `decide_user_name` | String |
| 79 | `puorgDocId` | 采购组织 | `puorg_doc_id` | 8006983d-d605-473b-b0c4-0e9469aaacff |
| 80 | `puPsnId` | 采购员id | `pu_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 81 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 82 | `sourcerowno` | 来源单据行号-ERP请购单相关 | `sourcerowno` | String |
| 83 | `supEnterpriseId` | 原中标供应商租户ID | `sup_enterprise_id` | Long |
| 84 | `supplierDocId` | 原中标供应商档案ID | `supplier_doc_id` | Long |
| 85 | `newSupEnterpriseId` | 新中标供应商租户id | `new_sup_enterprise_id` | Long |
| 86 | `newSupplierDocId` | 新中标供应商档案ID | `new_supplier_doc_id` | Long |
| 87 | `pubts` | 逻辑删除标志 | `pubts` | DateTime |
| 88 | `quotaReason` | 原供应商中标理由 | `quota_reason` | String |
| 89 | `rowStatus` | 原行状态(定标单行原始状态) | `row_status` | String |
| 90 | `newRowStatus` | 新行状态(定标单行原始状态) | `new_row_status` | String |
| 91 | `deliveryDate` | 原供应商交货日期 | `delivery_date` | DateTime |
| 92 | `stockCycle` | 原供应商备货周期 | `stock_cycle` | String |
| 93 | `shelfLife` | 原供应商质保期 | `shelf_life` | Integer |
| 94 | `ip` | 原供应商报价ip | `ip` | String |
| 95 | `identityQuantity` | 原供应商修改报价数量 | `identity_quantity` | Decimal |
| 96 | `isReplace` | 原供应商报价来源 | `is_replace` | Boolean |
| 97 | `ts` | 逻辑删除标志 | `ts` | DateTime |
| 98 | `priceType` | 原供应商报价类型(正式报价:null; 参考转正:1 ; 参考报价:2) | `price_type` | String |
| 99 | `newQuotaReason` | 新供应商中标理由 | `new_quota_reason` | String |
| 100 | `newDeliveryDate` | 新供应商交货日期 | `new_delivery_date` | DateTime |
| 101 | `newStockCycle` | 新供应商备货周期 | `new_stock_cycle` | String |
| 102 | `newShelfLife` | 新供应商质保期 | `new_shelf_life` | Integer |
| 103 | `newMemo` | 新供应商备注 | `new_memo` | String |
| 104 | `newIp` | 新供应商报价ip | `new_ip` | String |
| 105 | `newIdentityQuantity` | 新供应商修改报价数量 | `new_identity_quantity` | Decimal |
| 106 | `newIsReplace` | 新供应商报价来源 | `new_is_replace` | Boolean |
| 107 | `newPriceType` | 新供应商报价类型(正式报价:null; 参考转正:1 ; 参考报价:2) | `new_price_type` | String |
| 108 | `supplierDocName` | 原中标供应商档案名称 | `supplier_doc_name` | String |
| 109 | `newSupplierDocName` | 新中标供应商档案名称 | `new_supplier_doc_name` | String |
| 110 | `cunit` | 单位 | `cunit` | String |
| 111 | `cpuPdreviseDetailDefineCharacter` | 定标变更单子表自定义项 | `define_character_id` | 3fb3b071-739c-4b68-a1a7-cd66f970385b |
| 112 | `newCpuPdbodyId` | 定标(主表)主键(变更后的) | `new_cpu_pdbody_id` | Long |
| 113 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 114 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 115 | `bodydefine` | 定标变更单子表自由自定义项 | `` | a72b6ab7-49bb-4026-9669-8830ce871d60 |
| 116 | `costs` | 定标变更子表成本项明细 | `` | d0fb3afc-da95-42ca-8d74-c4203f8e784c |
| 117 | `steps` | 定标变更子表价格阶梯明细 | `` | e4b5297f-c6c8-4c3b-8815-5028e6e29223 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `buyofferdetailid` | 询价单子表ID | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
| 2 | `costs` | 定标变更子表成本项明细 | `sourcing.cpupdrevise.CpuPdreviseDetailCost` | None | true |
| 3 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `bodydefine` | 定标变更单子表自由自定义项 | `sourcing.cpupdrevise.CpuPdreviseDetailFreeDefine` | None | true |
| 6 | `cpuPdreviseDetailDefineCharacter` | 定标变更单子表自定义项 | `sourcing.cpupdrevise.CpuPdreviseDetailDefineCharacter` | None |  |
| 7 | `cpuPdheadId` | 定标单主表id | `sourcing.pricedecision.PriceDecision` | None |  |
| 8 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 9 | `steps` | 定标变更子表价格阶梯明细 | `sourcing.cpupdrevise.CpuPdreviseDetailStep` | None | true |
| 10 | `dimensionPricingId` | 报价ID | `aa.pricecenter.BiPriceEntity` | Service |  |
| 11 | `buyofferid` | 询价单主表ID | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 12 | `priceStrategy` | 取价策略id | `aa.pricestrategy.PriceStrategy` | Service |  |
| 13 | `cpuPdreviseDetailFreeCharacteristics` | 定标变更单子表自由项特征组 | `sourcing.cpupdrevise.CpuPdreviseDetailFreeCharacters` | None |  |
| 14 | `puorgDocId` | 采购组织 | `bd.adminOrg.PurchaseOrgVO` | Service |  |
| 15 | `quotaofferid` | 原报价单主表ID | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
| 16 | `reviseHid` | 定标变更单主表ID | `sourcing.cpupdrevise.CpuPdrevise` | None | true |
| 17 | `cpuPdbodyId` | 定标单物料子表ID | `sourcing.pricedecision.PriceDecisionDetail` | None |  |
| 18 | `pritemid` | 采购需求号 | `sourcing.pureq.IpuPuReq` | None |  |
| 19 | `quotaofferdetailid` | 原报价单子表ID | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None |  |
| 20 | `puPsnId` | 采购员id | `bd.staff.Staff` | Service |  |
