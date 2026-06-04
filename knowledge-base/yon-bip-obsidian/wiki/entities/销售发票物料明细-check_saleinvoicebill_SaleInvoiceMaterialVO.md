---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.saleinvoicebill.SaleInvoiceMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售发票物料明细 (`check.saleinvoicebill.SaleInvoiceMaterialVO`)

> ycSaleCoor | 物理表：`sale_invoice_m`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售发票物料明细 |
| 物理表 | `sale_invoice_m` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:32.4550` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `invoice_mid` | String | id |

---

## 直接属性（172个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `SaleInvoiceMDefineCharacter` | 销售发票表体自定义项 | `sale_invoice_m_definecharacter` | 0333384e-f308-4e11-925a-c7d97cc879d7 |
| 2 | `SaleInvoiceMFreeCharacteristics` | 销售发票物料自由项特征组 | `saleinvoice_free_characteristics` | 4df0dda9-d398-4112-9576-0a20d04cadf8 |
| 3 | `id` | id | `invoice_mid` | String |
| 4 | `businessProcess` | 业务流程 | `business_process` | String |
| 5 | `createDate` | 创建日期 | `create_date` | Date |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `dr` | 删除标记 | `dr` | Integer |
| 10 | `isSettlement` | 是否结算 | `is_settlement` | String |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `orderId` | 订单主键 | `order_id` | String |
| 15 | `deptName` | 采购部门名称 | `dept_name` | String |
| 16 | `erpOrderCode` | ERP订单号 | `erp_order_code` | String |
| 17 | `purPersonId` | 采购员id | `pur_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 18 | `deptId` | 采购部门id | `dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `purPersonCode` | 采购员编码 | `pur_person_code` | String |
| 20 | `operationId` | 工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 21 | `operationCode` | 工序编码 | `operation_code` | String |
| 22 | `deptCode` | 采购部门编码 | `dept_code` | String |
| 23 | `operationName` | 工序名称 | `operation_name` | String |
| 24 | `purPersonName` | 采购员名称 | `pur_person_name` | String |
| 25 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 26 | `wbsName` | WBS任务 | `wbs_name` | String |
| 27 | `puCheckbillMid` | 采购对账单孙表id | `pu_checkbill_mid` | String |
| 28 | `costcenterId` | 成本中心主键 | `costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 29 | `taxRateId` | 税目 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 30 | `currencyId` | 币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 31 | `period` | 阶段 | `period` | String |
| 32 | `activityName` | 活动 | `activity_name` | String |
| 33 | `puCheckbillBid` | 采购对账单表体id | `pu_checkbill_bid` | String |
| 34 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 35 | `costcenterName` | 成本中心 | `costcenter_name` | String |
| 36 | `wareClassCode` | 物料分类编码 | `ware_class_code` | String |
| 37 | `ctjlCode` | 合同台账编号 | `ctjl_code` | String |
| 38 | `ctjlId` | 合同台账主键 | `ctjl_id` | Long |
| 39 | `checkUnit` | 商品单位 | `check_unit` | String |
| 40 | `expenseItemId` | 费用项目主键 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 41 | `expenseItemName` | 费用项目 | `expense_item_name` | String |
| 42 | `activityCode` | 活动编码 | `activity_code` | String |
| 43 | `confirmNum` | 确认数量 | `confirm_num` | Decimal |
| 44 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 45 | `payRatio` | 付款比例 | `pay_ratio` | Decimal |
| 46 | `wareClassName` | 物料分类名称 | `ware_class_name` | String |
| 47 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 48 | `wareClassId` | 物料分类 | `ware_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 49 | `puCheckbillId` | 采购对账单id | `pu_checkbill_id` | String |
| 50 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 51 | `receOrgName` | 收货组织 | `rece_org_name` | String |
| 52 | `receiveNum` | 实收数量 | `receive_num` | Decimal |
| 53 | `wareName` | 物料名称 | `ware_name` | String |
| 54 | `invoiceId` | 发票id{yuncai_check.sale_invoice} | `invoice_id` | 392eae4a-d538-4186-806f-37236c893dba |
| 55 | `wareCode` | 物料编码 | `ware_code` | String |
| 56 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 57 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 58 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 59 | `invoiceBid` | 发票表体id{yuncai_check.sale_invoice_b} | `invoice_bid` | f89c4c21-e7a1-4393-a157-7dfa13acd1a9 |
| 60 | `materialSpec` | 物料规格 | `material_spec` | String |
| 61 | `relateId` | 关联采购发票id{yuncai_check.pu_invoice} | `relate_id` | String |
| 62 | `materialModel` | 物料型号 | `material_model` | String |
| 63 | `relateBid` | 关联采购发票表体id{yuncai_check.pu_invoice_b} | `relate_bid` | String |
| 64 | `mainUnitName` | 主单位名称 | `main_unit_name` | String |
| 65 | `relateMid` | 关联采购发票孙表id{yuncai_check.pu_invoice_m} | `relate_mid` | String |
| 66 | `purUnitName` | 采购单位名称 | `pur_unit_name` | String |
| 67 | `applyMid` | 发票申请孙表id | `apply_mid` | String |
| 68 | `invPurExchRate` | 采购单位换算率 | `inv_pur_exch_rate` | Decimal |
| 69 | `applyBid` | 发票申请子表id | `apply_bid` | String |
| 70 | `priceUnitName` | 计价单位名称 | `price_unit_name` | String |
| 71 | `applyId` | 发票申请id | `apply_id` | String |
| 72 | `valuationNum` | 计价数量 | `valuation_num` | Decimal |
| 73 | `invPriceExchRate` | 计价单位换算率 | `inv_price_exch_rate` | Decimal |
| 74 | `checkbillId` | 对账单id{yuncai_check.sale_checkbill} | `checkbill_id` | String |
| 75 | `mainNum` | 主数量 | `main_num` | Decimal |
| 76 | `checkbillBid` | 对账单表体id{yuncai_check.sale_checkbill_b} | `checkbill_bid` | String |
| 77 | `purNum` | 采购数量 | `pur_num` | Decimal |
| 78 | `num` | 数量 | `num` | Decimal |
| 79 | `checkbillMid` | 对账单孙表id{yuncai_check.sale_checkbill_m} | `checkbill_mid` | String |
| 80 | `price` | 无税单价 | `price` | Decimal |
| 81 | `taxprice` | 含税单价 | `taxprice` | Decimal |
| 82 | `taxrate` | 税率 | `taxrate` | Decimal |
| 83 | `mny` | 无税金额 | `mny` | Decimal |
| 84 | `taxmny` | 含税金额 | `taxmny` | Decimal |
| 85 | `tax` | 税额 | `tax` | Decimal |
| 86 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 87 | `pkOrg` | 采购组织id{org_orgs} | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 88 | `orgCode` | orgCode | `org_code` | String |
| 89 | `wareId` | 采购单据物料id{cpu_material.cpu_material} | `ware_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 90 | `sourcebillType` | 对账来源单据类型 | `source_bill_type` | String |
| 91 | `wareCunit` | 物料单位 | `ware_cunit` | String |
| 92 | `sourcebillCode` | 对账来源单据号 | `source_bill_code` | String |
| 93 | `wareImgurl` | 物料图片url | `ware_imgurl` | String |
| 94 | `sourceBillRowno` | 来源单行号 | `source_bill_rowno` | String |
| 95 | `pubts` | 时间戳 | `ts` | DateTime |
| 96 | `sourcebillDate` | 对账来源单据日期 | `source_bill_date` | Date |
| 97 | `checkbillType` | 来源单据类型 | `check_bill_type` | String |
| 98 | `ajustTax` | 调整税额 | `ajust_tax` | Decimal |
| 99 | `checkbillCode` | 来源单据号 | `check_bill_code` | String |
| 100 | `ajustTaxmny` | 调整含税金额 | `ajust_taxmny` | Decimal |
| 101 | `checkbillRowno` | 来源单据行号 | `check_bill_rowno` | String |
| 102 | `ajustMny` | 调整无税金额 | `ajust_mny` | Decimal |
| 103 | `checkbillDate` | 来源单据日期 | `check_bill_date` | Date |
| 104 | `totalPaymny` | 累计付款 | `total_paymny` | Decimal |
| 105 | `mainUnit` | 主单位id | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 106 | `mainUnitCode` | 主单位编码 | `main_unit_code` | String |
| 107 | `purUnit` | 采购单位id | `pur_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 108 | `purUnitCode` | 采购单位编码 | `pur_unit_code` | String |
| 109 | `priceUnit` | 计价单位id | `price_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 110 | `priceUnitCode` | 计价单位编码 | `price_unit_code` | String |
| 111 | `orderCode` | 订单号 | `order_code` | String |
| 112 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 113 | `projectId` | 项目id | `project_id` | String |
| 114 | `taxType` | 扣税类别 | `tax_type` | String |
| 115 | `mnySign` | 价格标识 | `mny_sign` | String |
| 116 | `erpProjectId` | 项目ERPID | `erp_project_id` | String |
| 117 | `hstoName` | 仓库名称 | `hsto_name` | String |
| 118 | `receOrg` | 收货组织 | `rece_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 119 | `orgName` | 采购组织名称 | `org_name` | String |
| 120 | `brand` | 品牌 | `brand` | String |
| 121 | `skuId` | 物料SKU id {productsku} | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 122 | `skuCode` | SKU编码 | `sku_code` | String |
| 123 | `skuName` | SKU名称 | `sku_name` | String |
| 124 | `skuUnitDetail` | SKU规格说明 | `sku_unit_detail` | String |
| 125 | `skuType` | SKU型号 | `sku_type` | String |
| 126 | `skuUnit` | SKU规格 | `sku_unit` | String |
| 127 | `whWarrantno` | 入库单号 | `wh_warrantno` | String |
| 128 | `consumSumno` | 消耗汇总单号 | `consum_sumno` | String |
| 129 | `contractBillno` | 合同号 | `contract_billno` | String |
| 130 | `purchaseOrderno` | 采购订单号 | `purchase_orderno` | String |
| 131 | `arriveorderCode` | 到货单号 | `arriveorder_code` | String |
| 132 | `saleorderCode` | 销售订单号 | `saleorder_code` | String |
| 133 | `deliveryno` | 发货单号 | `deliveryno` | String |
| 134 | `deliveryNum` | 发货数量 | `delivery_num` | Decimal |
| 135 | `contractlineId` | 合同行id | `contractline_id` | String |
| 136 | `orderlineId` | 订单行id | `orderline_id` | String |
| 137 | `arriveorderlineId` | 到货单行id | `arriveorderline_id` | String |
| 138 | `saleorderlineId` | 销售订单行id | `saleorderline_id` | String |
| 139 | `deliveryorderlineId` | 发货单行id | `deliveryorderline_id` | String |
| 140 | `erpOrderlineId` | ERP订单行id | `erp_orderline_id` | String |
| 141 | `erpArriveorderlineId` | ERP到货单行id | `erp_arriveorderline_id` | String |
| 142 | `projectCode` | 项目编码 | `project_code` | String |
| 143 | `projectName` | 项目名称 | `project_name` | String |
| 144 | `demandOrgName` | 需求组织 | `demand_org_name` | String |
| 145 | `memo` | 备注 | `memo` | String |
| 146 | `advanceInvoiceMainNum` | 提前开票主数量 | `advance_invoice_main_num` | Decimal |
| 147 | `advanceInvoiceMny` | 提前开票无税金额 | `advance_invoice_mny` | Decimal |
| 148 | `advanceInvoiceNum` | 提前开票计价数量 | `advance_invoice_num` | Decimal |
| 149 | `advanceInvoicePurNum` | 提前开票采购数量 | `advance_invoice_pur_num` | Decimal |
| 150 | `advanceInvoiceTaxMny` | 提前开票含税金额 | `advance_invoice_tax_mny` | Decimal |
| 151 | `calculationPattern` | 计算基准 | `calculation_pattern` | Integer |
| 152 | `contractId` | 合同id | `contract_id` | String |
| 153 | `hstoCode` | 仓库编码 | `hsto_code` | String |
| 154 | `hstoId` | 仓库id | `hsto_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 155 | `invPriceExchRateDen` | 计价换算率分母 | `invpriceexchrateden` | Decimal |
| 156 | `invPriceExchRateNum` | 计价换算率分子 | `invpriceexchratenum` | Decimal |
| 157 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rateden` | Decimal |
| 158 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_ratenum` | Decimal |
| 159 | `invoiceMainNum` | 应开票主数量 | `invoice_main_num` | Decimal |
| 160 | `invoiceMny` | 应开票无税金额 | `invoice_mny` | Decimal |
| 161 | `invoiceNum` | 应开票计价数量 | `invoice_num` | Decimal |
| 162 | `invoicePrice` | 应开票无税单价 | `invoice_price` | Decimal |
| 163 | `invoicePurNum` | 应开票采购数量 | `invoice_pur_num` | Decimal |
| 164 | `invoiceTaxMny` | 应开票含税金额 | `invoice_tax_mny` | Decimal |
| 165 | `invoiceTaxPrice` | 应开票含税单价 | `invoice_tax_price` | Decimal |
| 166 | `matchBid` | 对账事项子表id | `match_bid` | ab07448d-8aa8-4c93-9981-1d80f2638c0e |
| 167 | `matchId` | 对账事项主表id | `match_id` | 3cf2adf0-16c3-4d8e-a9d5-69583d569914 |
| 168 | `matchingGroupId` | 匹配分组ID | `matching_group_id` | Long |
| 169 | `matchingStatus` |  匹配状态 | `matching_status` | Integer |
| 170 | `matchingType` | 匹配方式 | `matching_type` | Integer |
| 171 | `operator` | 操作人 | `operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 172 | `operatorName` | 操作人 | `operator_name` | String |

---

## 关联属性（30个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目主键 | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `hstoId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 3 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `SaleInvoiceMFreeCharacteristics` | 销售发票物料自由项特征组 | `check.saleinvoicebill.FreePropertyCharacteristics` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `matchBid` | 对账事项子表id | `check.checkpool.GodownEntryDetailVO` | None |  |
| 9 | `receOrg` | 收货组织 | `org.func.BaseOrg` | Service |  |
| 10 | `operator` | 操作人 | `bd.staff.Staff` | Service |  |
| 11 | `costcenterId` | 成本中心主键 | `bd.costcenter.CostCenter` | Service |  |
| 12 | `operationId` | 工序 | `ed.operation.Operation` | Service |  |
| 13 | `currencyId` | 币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 14 | `taxRateId` | 税目 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 15 | `matchId` | 对账事项主表id | `check.checkpool.GodownEntryVO` | None |  |
| 16 | `skuId` | 物料SKU id {productsku} | `pc.product.ProductSKU` | Service |  |
| 17 | `priceUnit` | 计价单位id | `pc.unit.Unit` | Service |  |
| 18 | `purPersonId` | 采购员id | `bd.staff.Staff` | Service |  |
| 19 | `mainUnit` | 主单位id | `pc.unit.Unit` | Service |  |
| 20 | `invoiceBid` | 发票表体id{yuncai_check.sale_invoice_b} | `check.saleinvoicebill.SaleInvoiceBodyVO` | None | true |
| 21 | `wareId` | 采购单据物料id{cpu_material.cpu_material} | `pc.product.Product` | Service |  |
| 22 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 23 | `deptId` | 采购部门id | `org.func.BaseOrg` | Service |  |
| 24 | `pkOrg` | 采购组织id{org_orgs} | `org.func.BaseOrg` | Service |  |
| 25 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 26 | `SaleInvoiceMDefineCharacter` | 销售发票表体自定义项 | `check.saleinvoicebill.UserDefineMaterialCharacteristics` | None |  |
| 27 | `invoiceId` | 发票id{yuncai_check.sale_invoice} | `check.saleinvoicebill.SaleInvoiceVO` | None |  |
| 28 | `wareClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 29 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 30 | `purUnit` | 采购单位id | `pc.unit.Unit` | Service |  |
