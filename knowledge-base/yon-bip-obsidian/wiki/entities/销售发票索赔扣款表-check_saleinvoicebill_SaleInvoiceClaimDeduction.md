---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.saleinvoicebill.SaleInvoiceClaimDeduction"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售发票索赔扣款表 (`check.saleinvoicebill.SaleInvoiceClaimDeduction`)

> ycSaleCoor | 物理表：`sale_invoice_claim_deduction`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售发票索赔扣款表 |
| 物理表 | `sale_invoice_claim_deduction` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:12.5120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `claimCode` | 索赔扣款单编码 | `claim_code` | eb98f64a-4bef-4ee9-b533-1996de0de769 |
| 3 | `claimDate` | 扣款单日期 | `claim_date` | Date |
| 4 | `claimDescription` | 索赔扣款说明 | `claim_description` | String |
| 5 | `claimId` | 索赔扣款单id | `claim_id` | Long |
| 6 | `claimTitle` | 索赔扣款标题 | `claim_title` | String |
| 7 | `claimTotalAmount` | 索赔扣款总额 | `claim_total_amount` | Decimal |
| 8 | `currCheckAmount` | 本次对账扣款金额 | `curr_check_amount` | Decimal |
| 9 | `detailDefineCharacter` | 销售发票索赔扣款特征自定义项 | `detail_define_character` | 1cd38ab5-11ee-4800-82cc-233b9733541a |
| 10 | `dr` | 删除标记 | `dr` | Integer |
| 11 | `expenseItemId` | 费用项目id | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 12 | `expenseItemName` | 费用项目 | `expense_item_name` | String |
| 13 | `freeCharacteristics` | 销售发票索赔扣款自由项特征组 | `free_characteristics` | c5db2950-3351-492f-ac65-f3536f39cd68 |
| 14 | `handleType` | 处理方式 | `handle_type` | String |
| 15 | `id` | id | `id` | String |
| 16 | `invoiceAmount` | 本次开票扣款含税金额 | `invoice_amount` | Decimal |
| 17 | `invoiceId` | 销售发票主表id | `invoice_id` | 392eae4a-d538-4186-806f-37236c893dba |
| 18 | `invoiceNoTaxAmount` | 本次开票扣款无税金额 | `invoice_notax_amount` | Decimal |
| 19 | `invoiceRateAmount` | 本次开票扣款税额 | `invoice_rate_amount` | Decimal |
| 20 | `isShareMaterial` | 是否分摊到物料 | `is_share_material` | Boolean |
| 21 | `materialId` | 费用物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 22 | `materialName` | 费用物料 | `material_name` | String |
| 23 | `priceMark` | 价格标识 | `price_mark` | String |
| 24 | `puCheckClaim` | 采购对账索赔子表id | `pu_check_claim` | String |
| 25 | `puCheckId` | 采购对账主表id | `pu_check_id` | String |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `purchaseCode` | 采购员code | `purchase_code` | String |
| 28 | `purchaseId` | 采购员id | `purchase_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 29 | `purchaseName` | 采购员 | `purchase_name` | String |
| 30 | `purchaseOrg` | 采购组织id | `purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 31 | `purchaseOrgName` | 采购组织 | `purchase_org_name` | String |
| 32 | `receiveOrg` | 收票组织 | `receive_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 33 | `receiveOrgName` | 收票组织 | `receive_org_name` | String |
| 34 | `saleCheckClaim` | 销售对账索赔子表id | `sale_check_claim` | String |
| 35 | `saleCheckCode` | 销售对账单号 | `sale_check_code` | String |
| 36 | `saleCheckId` | 销售对账主表id | `sale_check_id` | String |
| 37 | `supDocCode` | 供应商编码 | `sup_doc_code` | String |
| 38 | `supDocId` | 供应商档案id | `sup_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 39 | `supDocName` | 供应商 | `sup_doc_name` | String |
| 40 | `taxRate` | 税率 | `tax_rate` | Decimal |
| 41 | `taxRateId` | 税率id | `taxrate_id` | String |
| 42 | `taxTypeFlag` | 扣税类别 | `taxtype_flag` | String |
| 43 | `transtypeId` | 扣款交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 44 | `transtypeName` | 扣款交易类型 | `transtype_name` | String |
| 45 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目id | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `freeCharacteristics` | 销售发票索赔扣款自由项特征组 | `check.saleinvoicebill.SaleInvoiceClaimDeductionFreeCharacter` | None |  |
| 3 | `supDocId` | 供应商档案id | `aa.vendor.Vendor` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `claimCode` | 索赔扣款单编码 | `check.salecheckbill.SaleCheckBillVO` | None |  |
| 6 | `purchaseId` | 采购员id | `bd.staff.Staff` | Service |  |
| 7 | `receiveOrg` | 收票组织 | `org.func.BaseOrg` | Service |  |
| 8 | `invoiceId` | 销售发票主表id | `check.saleinvoicebill.SaleInvoiceVO` | None | true |
| 9 | `materialId` | 费用物料id | `pc.product.Product` | Service |  |
| 10 | `transtypeId` | 扣款交易类型id | `bd.bill.TransType` | Service |  |
| 11 | `detailDefineCharacter` | 销售发票索赔扣款特征自定义项 | `check.saleinvoicebill.UserDefinClaimDedutionListCharacteristics` | None |  |
| 12 | `purchaseOrg` | 采购组织id | `org.func.PurchaseOrg` | Service |  |
