---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BuyOfferBodyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价单物料子表 (`sourcing.ibuyoffer.BuyOfferBodyVO`)

> ycSouringInquiry | 物理表：`ipu_quotation_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价单物料子表 |
| 物理表 | `ipu_quotation_detail` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:41.1000` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（123个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `rowNo` | 行号 | `row_no` | Long |
| 2 | `singleBudgetApplyid` | 单项预算申请单主键 | `single_budget_applyid` | c89a2b73-7637-4642-abc1-c49bf1a5c460 |
| 3 | `materialClassId` | 物料分类id | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 4 | `expenseItemId` | 费用项目名称主键 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 5 | `buyOfferBodyVODefineCharacter` | 询价单子表自定义项 | `define_character_id` | 1b6af02f-95c3-4141-a0df-37df938a72b0 |
| 6 | `singleBudgetApplybid` | 单项预算申请单明细主键 | `single_budget_applybid` | 0dd17389-d0ee-4f01-b34b-9a17be57afcb |
| 7 | `productDesc` | 物料描述 | `product_desc` | String |
| 8 | `buyOfferBodyVOFreeCharacteristics` | 询价单子表自由项特征组 | `free_characters_id` | 1f5b1dc0-020e-4e50-b7f0-08cf7c196198 |
| 9 | `purchaseunitcode` | 采购单位编码 | `purchaseUnitCode` | String |
| 10 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 11 | `processId` | 工序 | `process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 12 | `firstQutoBid` | 源头询价单子id | `first_qutoBid` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 13 | `lineno` | 行号 | `row_no` | Long |
| 14 | `invpurexchrateNum` | 换算率分子 | `invPurExchRatenum` | Decimal |
| 15 | `invpurexchrateDen` | 换算率分母 | `invPurExchRateden` | Decimal |
| 16 | `invpriceexchrateNum` | 计价换算率分子 | `invpriceexchratenum` | Decimal |
| 17 | `invpriceexchrateDen` | 计价换算率分母 | `invpriceexchrateden` | Decimal |
| 18 | `skuId` | 物料SKU ID | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 19 | `buyofferStatus` | 单据状态 | `buyoffer_status` | String |
| 20 | `sourceid` | 上游单据主表id | `sourceid` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 21 | `srcQutoBid` | 来源询价单子id | `src_qutoBid` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 22 | `strategyId` | 管控策略id | `strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 23 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 24 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 25 | `priceMark` | 价格标识 | `price_mark` | Short |
| 26 | `purchaseunitid` | 采购单位id | `purchaseUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 27 | `headBillType` | 源头单据类型 | `head_bill_type` | String |
| 28 | `purchasenum` | 采购数量 | `purchaseNum` | Decimal |
| 29 | `headBillCode` | 源头单据号 | `head_bill_code` | String |
| 30 | `productCode` | 物料编码 | `product_code` | String |
| 31 | `unitCode` | 计价单位编码 | `unit_code` | String |
| 32 | `headBillRowno` | 源头单据行号 | `head_bill_rowno` | String |
| 33 | `productName` | 物料名称 | `product_name` | String |
| 34 | `headBillId` | 源头单据主表id | `head_bill_id` | String |
| 35 | `purchaseamount` | 计价数量 | `purchaseAmount` | Decimal |
| 36 | `headBillBId` | 源头单据子表id | `head_bill_b_id` | String |
| 37 | `mainnum` | 主数量 | `mainNum` | Decimal |
| 38 | `purchaseunitname` | 采购单位 | `purchaseUnitName` | String |
| 39 | `mainunitcode` | 主单位编码 | `mainUnitCode` | String |
| 40 | `unit` | 计价单位 | `unit` | String |
| 41 | `mainunitid` | 主单位id | `mainUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 42 | `invpurexchrate` | 采购换算率 | `invPurExchRate` | Decimal |
| 43 | `mainunitname` | 主单位 | `mainUnitName` | String |
| 44 | `invpriceexchrate` | 计价换算率 | `invPriceExchRate` | Decimal |
| 45 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 46 | `reqdate` | 需求时间 | `reqdate` | DateTime |
| 47 | `reqOrgName` | 需求组织 | `req_org_name` | String |
| 48 | `reqOrgid` | 需求组织id | `req_orgid` | 14302233-1394-4a70-94e1-bed51636f312 |
| 49 | `receiveOrgName` | 收货组织 | `receive_org_name` | String |
| 50 | `receivePersonName` | 收货人 | `receive_person_name` | String |
| 51 | `reqdeptCode` | 需求部门编码 | `reqdept_code` | String |
| 52 | `reqdeptId` | 需求部门id | `reqdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 53 | `reqContactId` | 需求人id | `req_contact_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 54 | `plannerName` | 计划员名称 | `planner_name` | String |
| 55 | `planDeptName` | 计划部门名称 | `plan_dept_name` | String |
| 56 | `suggestSupplierName` | 建议供应商名称 | `suggest_supplier_name` | String |
| 57 | `planDeptid` | 计划部门id | `plan_deptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 58 | `planMny` | 计划金额 | `plan_mny` | Decimal |
| 59 | `planPrice` | 计划价 | `plan_price` | Decimal |
| 60 | `nmaxPrice` | 最高限价 | `nmax_price` | Decimal |
| 61 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 62 | `reqUapProjectId` | 项目id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 63 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 64 | `receivePersonTel` | 收货人电话 | `receive_person_tel` | String |
| 65 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 66 | `ERPProjectName` | 项目名称 | `erp_project_name` | String |
| 67 | `suggestSupplierId` | 建议供应商id | `suggest_supplier_id` | String |
| 68 | `reqdeptName` | 需求部门name | `reqdept_name` | String |
| 69 | `suggestSupplierDocId` | 建议供应商id(云采档案) | `suggest_supplier_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 70 | `bmemo` | 备注 | `bmemo` | String |
| 71 | `reqErpRelatedInfo` | ERP相关信息 | `req_erp_related_info` | String |
| 72 | `reqCodeErp` | ERP单据号/项目 | `req_code_erp` | String |
| 73 | `ERPProjectId` | erp项目id | `erp_project_id` | String |
| 74 | `reqRownoErp` | ERP请购单行号 | `req_rowno_erp` | String |
| 75 | `detailFile` | 管理附件 | `detail_file` | String |
| 76 | `dr` | 删除标识 | `dr` | Integer |
| 77 | `modifier` | 更新人 | `modifier` | String |
| 78 | `pubts` | 时间戳 | `pubts` | DateTime |
| 79 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 80 | `puorgDocId` | 采购组织id | `puorg_doc_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 81 | `invPurExchRateType` | 采购换算率类型 | `invPurExchRateType` | Short |
| 82 | `id` | ID | `id` | Long |
| 83 | `plannerid` | 计划人id(云采档案) | `plannerid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 84 | `productSpec` | 商品规格 | `product_spec` | String |
| 85 | `productType` | 商品型号 | `product_type` | String |
| 86 | `pritemid` | 外部pr的行的标识(采购需求) | `pritemid` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 87 | `unitid` | 计价单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 88 | `productId` | 外部商品id(物料id) | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 89 | `puorgDocName` | 采购组织name(云采档案) | `puorg_doc_name` | String |
| 90 | `quotationid` | 询价单 | `quotationid` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 91 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 92 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 93 | `sysVersion` | 系统标识 | `sys_version` | Integer |
| 94 | `createTime` | 创建时间 | `create_time` | DateTime |
| 95 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 96 | `modifiedtime` | 更新时间 | `modifiedtime` | DateTime |
| 97 | `creator` | 创建人 | `creator` | String |
| 98 | `erpProductId` | ERP 物料id | `erp_product_id` | String |
| 99 | `sourcebid` | 来源bid | `sourcebid` | String |
| 100 | `quotaUnit` | 特殊报价单位 | `quota_unit` | String |
| 101 | `reqContact` | 需求联系人(需求人) | `req_contact` | String |
| 102 | `refNo` | 供应商协议号 | `ref_no` | String |
| 103 | `unpdReleased` | 未定标释放行标示 | `unpd_released` | Boolean |
| 104 | `updateTime` | 更新时间 | `update_time` | DateTime |
| 105 | `createPin` | 创建人 | `create_pin` | String |
| 106 | `updatePin` | 更新人 | `update_pin` | String |
| 107 | `currencyName` | 币种名称 | `currency_name` | String |
| 108 | `currencyCode` | 币种编码 | `currency_code` | String |
| 109 | `orderSplit` | 订单弹性分单条件标识 | `order_split` | String |
| 110 | `orderSplitName` | 订单弹性分单条件标识名称 | `order_split_name` | String |
| 111 | `currencyIdDiwork` | 询价币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 112 | `currencyCodeDiwork` | 询价币种编码 | `currency_code_diwork` | String |
| 113 | `currencyNameDiwork` | 询价币种名称 | `currency_name_diwork` | String |
| 114 | `currencyTypeSignDiwork` | 询价币种符号 | `currency_type_sign_diwork` | String |
| 115 | `priceStrategy` | 取价策略id | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 |
| 116 | `dimensionPricingId` | 动态维度报价组id | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 117 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a |
| 118 | `costcenterId` | 成本中心id | `costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 119 | `bodyfreedefines` | 询价单物料子表自由自定义项 | `` | 27c7bb72-d39e-489f-91c4-7b41d48bbd56 |
| 120 | `businessType` | 业务类型 | `business_type` | String |
| 121 | `buyofferDetailSku` | 询价单物料子表SKU扩展表 | `` | b8353955-9cf2-4765-95e8-33821dc3dff8 |
| 122 | `costs` | 询价子表成本项明细 | `` | b29a6369-8e02-453f-8f72-c021b8b7b932 |
| 123 | `steps` | 询价子表价格阶梯明细 | `` | cdada250-fcfd-4e61-b539-6bfb78e3061b |

---

## 关联属性（40个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目名称主键 | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 3 | `quotationid` | 询价单 | `sourcing.ibuyoffer.BuyOfferVO` | None | true |
| 4 | `buyofferDetailSku` | 询价单物料子表SKU扩展表 | `sourcing.ibuyoffer.BuyOfferBodySkuVO` | None | true |
| 5 | `reqdeptId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 6 | `singleBudgetApplybid` | 单项预算申请单明细主键 | `znbzbx.memoapply.MemoApplyBVO` | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `buyOfferBodyVODefineCharacter` | 询价单子表自定义项 | `sourcing.ibuyoffer.BuyOfferBodyDefineCharacter` | None |  |
| 9 | `costcenterId` | 成本中心id | `bd.costcenter.CostCenter` | Service |  |
| 10 | `priceStrategy` | 取价策略id | `aa.pricestrategy.PriceStrategy` | Service |  |
| 11 | `buyOfferBodyVOFreeCharacteristics` | 询价单子表自由项特征组 | `sourcing.ibuyoffer.BuyOfferBodyFreeCharacters` | None |  |
| 12 | `processId` | 工序 | `ed.operation.Operation` | Service |  |
| 13 | `currencyIdDiwork` | 询价币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 14 | `strategyId` | 管控策略id | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | Service |  |
| 15 | `bodyfreedefines` | 询价单物料子表自由自定义项 | `sourcing.ibuyoffer.BuyOfferBodyVOFreeDefine` | None | true |
| 16 | `skuId` | 物料SKU ID | `pc.product.ProductSKU` | Service |  |
| 17 | `sourceid` | 上游单据主表id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
| 18 | `costs` | 询价子表成本项明细 | `sourcing.ibuyoffer.BuyOfferBodyCost` | None | true |
| 19 | `reqUapProjectId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 20 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 21 | `materialClassId` | 物料分类id | `pc.cls.ManagementClass` | Service |  |
| 22 | `planDeptid` | 计划部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 23 | `productId` | 外部商品id(物料id) | `pc.product.Product` | Service |  |
| 24 | `costQuoteGroupId` | 成本项报价组id | `aa.costitem.CostItemTemplate` | Service |  |
| 25 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 26 | `firstQutoBid` | 源头询价单子id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
| 27 | `reqContactId` | 需求人id | `bd.staff.Staff` | Service |  |
| 28 | `steps` | 询价子表价格阶梯明细 | `sourcing.ibuyoffer.BuyOfferBodyStep` | None | true |
| 29 | `singleBudgetApplyid` | 单项预算申请单主键 | `znbzbx.memoapply.MemoApplyVO` | Service |  |
| 30 | `dimensionPricingId` | 动态维度报价组id | `aa.quotation.BiQuotationHead` | Service |  |
| 31 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 32 | `puorgDocId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 33 | `plannerid` | 计划人id(云采档案) | `bd.staff.Staff` | Service |  |
| 34 | `pritemid` | 外部pr的行的标识(采购需求) | `sourcing.pureq.IpuPuReq` | None |  |
| 35 | `unitid` | 计价单位id | `pc.unit.Unit` | Service |  |
| 36 | `mainunitid` | 主单位id | `pc.unit.Unit` | Service |  |
| 37 | `srcQutoBid` | 来源询价单子id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
| 38 | `reqOrgid` | 需求组织id | `org.func.BaseOrg` | Service |  |
| 39 | `suggestSupplierDocId` | 建议供应商id(云采档案) | `aa.vendor.Vendor` | Service |  |
| 40 | `purchaseunitid` | 采购单位id | `pc.unit.Unit` | Service |  |
