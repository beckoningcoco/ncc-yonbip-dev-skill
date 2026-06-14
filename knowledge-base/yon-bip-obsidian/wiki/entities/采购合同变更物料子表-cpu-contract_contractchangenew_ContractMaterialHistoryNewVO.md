---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.ContractMaterialHistoryNewVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同变更物料子表 (`cpu-contract.contractchangenew.ContractMaterialHistoryNewVO`)

> ycContractManagement | 物理表：`cpu_ct_material_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同变更物料子表 |
| 物理表 | `cpu_ct_material_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:44:22.3890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（192个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ContractBodyVODefineCharacter` | 采购合同物料特征属性组 | `defineCharacter` | fc837e06-6b78-4dcb-adfb-8e0e74e12f1f |
| 2 | `ContractBodyVOFreeCharacteristics` | 采购合同自由项特征组 | `instance_id` | 92e74a9c-8ac2-49e1-b524-e8f0d8e62190 |
| 3 | `ERPProjectId` | Erp项目id | `erp_project_id` | String |
| 4 | `contractHistoryId` | 合同历史主表id | `contract_history_id` | 49f97b1c-2c1f-4fc9-855d-6a465985bdf3 |
| 5 | `contractId` | 合同主表id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 6 | `dr` | dr | `dr` | Integer |
| 7 | `erpCtbid` | erp合同子表id(pk) | `erp_ct_bid` | String |
| 8 | `expenseItemId` | 费用项目 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 9 | `formulaId` | 价格公式id | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 |
| 10 | `formulaName` | 价格公式 | `formula_name` | String |
| 11 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 12 | `mainMetrologyName` | 主计量单位name | `main_metrology_name` | String |
| 13 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 14 | `payContractBid` | 付款合同表体主键 | `pay_contract_bid` | String |
| 15 | `payContractId` | 付款合同主键 | `pay_contract_id` | String |
| 16 | `pritemidErpProductVersion` | 需求来源类型 | `erp_product_version` | String |
| 17 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 18 | `costTemplateId` | 成本项报价模版ID | `cost_template_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a |
| 19 | `descrMaterialMark` | 描述性物料标识:1是,0否 | `descr_material_mark` | Integer |
| 20 | `lineCloseReason` | 行关闭原因 | `line_close_reason` | String |
| 21 | `occupiedByProductSupply` | 下推商品供货清单状态 | `occupied_by_product_supply` | String |
| 22 | `natWithholdingTax` | 本币代扣税额 | `nat_withholding_tax` | Decimal |
| 23 | `oriWithholdingTax` | 代扣税额 | `ori_withholding_tax` | Decimal |
| 24 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb |
| 25 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal |
| 26 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal |
| 27 | `purchaseExchRateNum` | 采购换算率分子 | `purchase_exch_ratenum` | Decimal |
| 28 | `purchaseExchRateDen` | 采购换算率分母 | `purchase_exch_rateden` | Decimal |
| 29 | `linecloser` | 行关闭人 | `linecloser` | String |
| 30 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 31 | `cumulativeMoney` | 累计下单无税金额 | `cumulative_money` | Decimal |
| 32 | `cumulativeTaxMoney` | 累计下单含税金额 | `cumulative_tax_money` | Decimal |
| 33 | `lineStatus` | 行状态 | `line_status` | Short |
| 34 | `materialName` | 采购商物料名称 | `material_name` | String |
| 35 | `reqDeptName` | 需求部门名称 | `req_dept_name` | String |
| 36 | `processesId` | 工序ID | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 37 | `materialCode` | 物料编码 | `material_code` | String |
| 38 | `discountTaxType` | 扣税类别 | `discount_tax_type` | Integer |
| 39 | `priceMark` | 价格标识 | `price_mark` | Integer |
| 40 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 41 | `natTaxPrice` | 本币含税单价 | `nat_tax_price` | Decimal |
| 42 | `firstSrcLineId` | 源头单据子表id | `first_src_line_id` | Long |
| 43 | `erpApplyorderType` | ERP请购单类型 | `erp_applyorder_type` | String |
| 44 | `reqUapProjectId` | 平台项目档案id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 45 | `natPrice` | 本币无税单价 | `nat_price` | Decimal |
| 46 | `firstSrc` | 源头单据类型 | `first_src` | String |
| 47 | `internalFileId` | 内控附件 | `internal_file_id` | String |
| 48 | `natTaxMoney` | 本币含税金额 | `nat_tax_money` | Decimal |
| 49 | `firstSrcLineNo` | 源头单据子表行号 | `first_src_line_no` | String |
| 50 | `applyorderBid` | 请购单子表id | `applyorder_bid` | String |
| 51 | `natMoney` | 本币无税金额 | `nat_money` | Decimal |
| 52 | `natTax` | 本币税额 | `nat_tax` | Decimal |
| 53 | `firstSrcId` | 源头单据主表id | `first_src_id` | Long |
| 54 | `applyorderHid` | 请购单主表id | `applyorder_hid` | String |
| 55 | `tax` | 税额 | `tax` | Decimal |
| 56 | `externalFileId` | 对外附件 | `external_file_id` | String |
| 57 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 58 | `firstSrcCode` | 源头单据号 | `first_src_code` | String |
| 59 | `requireId` | 采购需求id | `require_id` | Long |
| 60 | `srcBillRowNum` | 来源单据行号 | `src_bill_rowno` | Integer |
| 61 | `purchaseUnitCode` | 采购单位code | `purchase_unit_code` | String |
| 62 | `releasedBudgetMny` | 应释放单项预算占用不含税金额 | `released_budget_mny` | Decimal |
| 63 | `releasedBudgetTaxmny` | 应释放单项预算占用含税金额 | `released_budget_taxmny` | Decimal |
| 64 | `reqDeptId` | 需求部门id | `req_dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 65 | `settlementType` | 结算基准日 | `settlement_type` | String |
| 66 | `shelfLife` | 质保期 | `shelf_life` | Integer |
| 67 | `singleBudgetApplyBid` | 单项预算申请明细 | `single_budget_applybid` | 0dd17389-d0ee-4f01-b34b-9a17be57afcb |
| 68 | `singleBudgetApplyId` | 单项预算申请单 | `single_budget_applyid` | c89a2b73-7637-4642-abc1-c49bf1a5c460 |
| 69 | `skuId` | 商品skuid | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 70 | `source` | 上游单据类型 | `source` | String |
| 71 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 72 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 73 | `sourcebid` | 需求来源子表id | `sourcebid` | String |
| 74 | `sourcehid` | 需求来源主表id | `sourcehid` | String |
| 75 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 76 | `ts` | 时间戳 | `ts` | DateTime |
| 77 | `upcode` | 上游单据号 | `upcode` | String |
| 78 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 79 | `id` | id | `id` | Long |
| 80 | `materialId` | 采购商物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 81 | `unitid` | 单位ID | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 82 | `srcBillId` | 来源单据ID | `src_bill_id` | Long |
| 83 | `srcBillBid` | 来源单据BID | `src_bill_bid` | Long |
| 84 | `firstBillId` | 源头单据ID | `first_bill_id` | Long |
| 85 | `firstBillBid` | 源头单据BID | `first_bill_bid` | Long |
| 86 | `contractMetarialId` | 原合同物料ID | `contract_metarial_id` | 07141343-35c1-4687-b99c-405bfa7a3096 |
| 87 | `materialClassId` | 采购商物料分类id | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 88 | `spec` | 规格 | `spec` | String |
| 89 | `takerOrgName` | 收票组织 | `taker_orgname` | String |
| 90 | `model` | 型号 | `model` | String |
| 91 | `materialClassCode` | 物料分类编码 | `material_class_code` | String |
| 92 | `productId` | 商品id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 93 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 94 | `productName` | 商品sku详细属性信息 | `product_name` | String |
| 95 | `skuUrl` | 商品图片 | `sku_url` | String |
| 96 | `materialDesc` | 物料描述 | `material_desc` | String |
| 97 | `reqOrgId` | 需求组织id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 98 | `brand` | 品牌 | `brand` | String |
| 99 | `purchaseNum` | 采购数量 | `purchase_num` | Decimal |
| 100 | `purchaseUnitName` | 采购单位 | `purchase_unit_name` | String |
| 101 | `purchaseUnitId` | 采购单位id | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 102 | `purchaseExchRate` | 采购换算率 | `purchase_exch_rate` | Decimal |
| 103 | `mainNum` | 主数量 | `main_num` | Decimal |
| 104 | `taxCategoryId` | 税率id | `tax_category_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 105 | `mainMetrologyId` | 主计量id | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 106 | `mainMetrologyCode` | 主计量code | `main_metrology_code` | String |
| 107 | `accomplishedQuantity` | 已下单主数量 | `accomplished_quantity` | Decimal |
| 108 | `unitCode` | 计价单位编码 | `unit_code` | String |
| 109 | `quotaProportion` | 配额比例 | `quota_proportion` | Decimal |
| 110 | `quotaPercentage` | 配额百分比% | `quota_percentage` | Decimal |
| 111 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 112 | `brandId` | 品牌Id | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 |
| 113 | `brandCode` | 品牌编码 | `brand_code` | String |
| 114 | `brandErpId` | brandErpId | `brand_erp_id` | String |
| 115 | `num` | 计价数量 | `num` | Decimal |
| 116 | `unit` | 计价单位 | `unit` | String |
| 117 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal |
| 118 | `overExecRate` | 可超量比例 | `over_exec_rate` | Decimal |
| 119 | `enableExecNum` | 可执行数量 | `enable_exec_num` | Decimal |
| 120 | `price` | 无税单价 | `price` | Decimal |
| 121 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 122 | `taxrate` | 税率% | `taxrate` | Decimal |
| 123 | `allowDecreasePriceRatio` | 允许调价比例%(-) | `allow_decrease_price_ratio` | Decimal |
| 124 | `allowIncreasePriceRatio` | 允许调价比例%(+) | `allow_increase_price_ratio` | Decimal |
| 125 | `isOnShelf` | 超市上架 | `is_on_shelf` | Boolean |
| 126 | `benchmarkType` | 基准价参考 | `benchmark_type` | String |
| 127 | `reqPlanDeptName` | 需求部门 | `req_plan_deptname` | String |
| 128 | `addressName` | 参考地区 | `address_name` | String |
| 129 | `priceValidateStartdate` | 价格有效期(起) | `price_validate_startdate` | Date |
| 130 | `priceValidateDate` | 价格有效期(止) | `price_validate_date` | Date |
| 131 | `gift` | 赠品 | `gift` | String |
| 132 | `planArriveDate` | 计划到货日期 | `plan_arrive_date` | DateTime |
| 133 | `reqContact` | 需求人 | `b_req_contact` | String |
| 134 | `reqOrgName` | 需求组织 | `req_org_name` | String |
| 135 | `receiveOrgName` | 收货组织 | `receive_org_name` | String |
| 136 | `refNo` | 供应商协议号 | `ref_no` | String |
| 137 | `receivePersonName` | 收货人 | `receive_person_name` | String |
| 138 | `pritemid` | 需求id | `pritemid` | Long |
| 139 | `receivePersonTel` | 联系方式 | `receive_person_tel` | String |
| 140 | `deliveryAddress` | 收货地址 | `delivery_address` | String |
| 141 | `suppProductName` | 询价供应商 报价商品名称  (品牌/产地/材质) | `supp_product_name` | String |
| 142 | `stockCycle` | 备货周期 | `stock_cycle` | String |
| 143 | `firstBillType` | 来源类型 | `first_billtype` | String |
| 144 | `supplyDelivery` | 交货方式说明 | `supply_delivery` | String |
| 145 | `erpCtCode` | ERP合同号 | `erp_ct_code` | String |
| 146 | `firstBillcode` | 来源单号 | `first_billcode` | String |
| 147 | `firstBillRowno` | 来源行号 | `first_bill_rowno` | Long |
| 148 | `supplyOfferDes` | 报价说明 | `supply_offer_des` | String |
| 149 | `erpCtid` | ERP合同表体主键 | `erp_ct_id` | String |
| 150 | `reqId` | 需求单号 | `reqid` | Long |
| 151 | `supplyPayment` | 付款方式 | `supply_payment` | String |
| 152 | `rowNum` | 行号 | `lineno` | Decimal |
| 153 | `memo` | 备注 | `memo` | String |
| 154 | `ERPProjectName` | Erp项目名称 | `erp_project_name` | String |
| 155 | `taxFullPrice` | 含税单价全额预付 | `tax_full_price` | Decimal |
| 156 | `taxFullMoney` | 含税总价全额预付 | `tax_full_money` | Decimal |
| 157 | `taxPartialPrice` | 含税单价部分预付 | `tax_partial_price` | Decimal |
| 158 | `taxPartialMoney` | 含税总价部分预付 | `tax_partial_money` | Decimal |
| 159 | `province_id` | 找钢网参考地区-省 | `province_id` | Long |
| 160 | `city_id` | 找钢网参考地区-市 | `city_id` | Long |
| 161 | `district_id` | 找钢网参考地区-区 | `district_id` | Long |
| 162 | `executionStatus` | 行执行状态 | `execution_status` | Integer |
| 163 | `taxlessFullPrice` | 无税单价全额预付 | `taxless_full_price` | Decimal |
| 164 | `taxlessFullMoney` | 无税总价全额预付 | `taxless_full_money` | Decimal |
| 165 | `taxlessPartialPrice` | 无税单价部分预付 | `taxless_partial_price` | Decimal |
| 166 | `taxlessPartialMoney` | 无税总价部分预付 | `taxless_partial_money` | Decimal |
| 167 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 168 | `taxMoney` | 含税金额合计 | `tax_money` | Decimal |
| 169 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 170 | `money` | 无税金额合计 | `money` | Decimal |
| 171 | `srcBillType` | srcBillType | `src_billtype` | String |
| 172 | `srcBillcode` | srcBillcode | `src_billcode` | String |
| 173 | `reqSrcBillCode` | reqSrcBillCode | `req_src_billcode` | String |
| 174 | `reqSrcRowNo` | reqSrcRowNo | `req_src_rowno` | String |
| 175 | `changingAction` | 变更动作 | `changing_action` | String |
| 176 | `changingInfo` | 变更信息 | `changing_info` | String |
| 177 | `reqPlanDeptId` | 需求计划部门id | `req_plan_deptid` | 14302233-1394-4a70-94e1-bed51636f312 |
| 178 | `reqPlanPsnId` | 需求计划员id | `req_plan_psnid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 179 | `reqContactId` | 需求人id | `b_req_contact_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 180 | `reqDate` | 需求时间 | `req_date` | DateTime |
| 181 | `reqErpRelatedInfo` | ERP相关信息 | `req_erp_related_info` | String |
| 182 | `takerOrgId` | 收票组织id | `taker_orgid` | 14302233-1394-4a70-94e1-bed51636f312 |
| 183 | `takerOrgCode` | 收票组织code | `taker_orgcode` | String |
| 184 | `qualitypriceId` | 优质优价方案id | `qualityprice_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 |
| 185 | `ContractBodyNewVODefineCharacter` | 物料变更特征属性组 | `defineCharacter` | 7d70e1b7-4b9a-4f29-a752-30a9c37a8c72 |
| 186 | `ContractBodyNewVOFreeCharacteristics` | 物料变更自由项特征组 | `instance_id` | 78fe65db-f064-4732-ab1b-9c380edb49b6 |
| 187 | `dimensionPricingId` | 价格目录数据id | `dimension_pricing_id` | String |
| 188 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 189 | `priceStrategy` | 取价策略id | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 |
| 190 | `cpuContractSkuext` | 合同物料SKU属性扩展表 | `` | 481112c5-b377-4bc8-b51d-eb53985c33f5 |
| 191 | `defines` | 表体物料变更自定义项 | `` | 5d5f0368-a945-41b7-90f9-e9c56a72b7a7 |
| 192 | `pubts` | 时间戳 | `ts` | DateTime |

---

## 关联属性（42个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目 | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `processesId` | 工序ID | `ed.operation.Operation` | Service |  |
| 3 | `reqDeptId` | 需求部门id | `org.func.BaseOrg` | Service |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `reqPlanDeptId` | 需求计划部门id | `org.func.BaseOrg` | Service |  |
| 6 | `ContractBodyNewVOFreeCharacteristics` | 物料变更自由项特征组 | `cpu-contract.contractchangenew.CTHistoryCharacteristicsDefine` | None |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `singleBudgetApplyId` | 单项预算申请单 | `znbzbx.memoapply.MemoApplyVO` | Service |  |
| 9 | `defines` | 表体物料变更自定义项 | `cpu-contract.contractchangenew.ContractMaterialHistoryNewVODefine` | None | true |
| 10 | `priceStrategy` | 取价策略id | `aa.pricestrategy.PriceStrategy` | Service |  |
| 11 | `contractMetarialId` | 原合同物料ID | `cpu-contract.contract.ContractBodyVO` | None |  |
| 12 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 13 | `reqOrgId` | 需求组织id | `org.func.BaseOrg` | Service |  |
| 14 | `skuId` | 商品skuid | `pc.product.ProductSKU` | Service |  |
| 15 | `purchaseUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 16 | `reqUapProjectId` | 平台项目档案id | `bd.project.ProjectVO` | Service |  |
| 17 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 18 | `materialClassId` | 采购商物料分类id | `pc.cls.ManagementClass` | Service |  |
| 19 | `productId` | 商品id | `pc.product.Product` | Service |  |
| 20 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 21 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 22 | `singleBudgetApplyBid` | 单项预算申请明细 | `znbzbx.memoapply.MemoApplyBVO` | Service |  |
| 23 | `ContractBodyVOFreeCharacteristics` | 采购合同自由项特征组 | `cpu-contract.contract.CTCharacteristicsDefine` | None |  |
| 24 | `takerOrgId` | 收票组织id | `org.func.BaseOrg` | Service |  |
| 25 | `materialId` | 采购商物料id | `pc.product.Product` | Service |  |
| 26 | `reqContactId` | 需求人id | `bd.staff.Staff` | Service |  |
| 27 | `costTemplateId` | 成本项报价模版ID | `aa.costitem.CostItemTemplate` | Service |  |
| 28 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | Service |  |
| 29 | `reqPlanPsnId` | 需求计划员id | `bd.staff.Staff` | Service |  |
| 30 | `mainMetrologyId` | 主计量id | `pc.unit.Unit` | Service |  |
| 31 | `ContractBodyVODefineCharacter` | 采购合同物料特征属性组 | `cpu-contract.contract.CTCharacterDefine` | None |  |
| 32 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 33 | `formulaId` | 价格公式id | `aa.priceformula.PriceFormula` | Service |  |
| 34 | `brandId` | 品牌Id | `pc.brand.Brand` | Service |  |
| 35 | `contractId` | 合同主表id | `cpu-contract.contract.ContractVO` | None |  |
| 36 | `unitid` | 单位ID | `pc.unit.Unit` | Service |  |
| 37 | `ContractBodyNewVODefineCharacter` | 物料变更特征属性组 | `cpu-contract.contractchangenew.CTHistoryCharacterDefine` | None |  |
| 38 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 39 | `contractHistoryId` | 合同历史主表id | `cpu-contract.contractchangenew.ContractHistryNewVO` | None | true |
| 40 | `qualitypriceId` | 优质优价方案id | `aa.qualitypricescheme.QualitypriceScheme` | Service |  |
| 41 | `taxCategoryId` | 税率id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 42 | `cpuContractSkuext` | 合同物料SKU属性扩展表 | `cpu-contract.contractchangenew.CpuContractSkuextHistoryNew` | None | true |
