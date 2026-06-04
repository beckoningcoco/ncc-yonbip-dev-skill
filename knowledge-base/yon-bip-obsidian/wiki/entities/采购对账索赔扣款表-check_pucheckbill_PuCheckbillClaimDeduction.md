---
tags: ["BIP", "元数据", "数据字典", "ycPurchaseSynergy", "check.pucheckbill.PuCheckbillClaimDeduction"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购对账索赔扣款表 (`check.pucheckbill.PuCheckbillClaimDeduction`)

> ycPurchaseSynergy | 物理表：`pu_checkbill_claim_deduction`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购对账索赔扣款表 |
| 物理表 | `pu_checkbill_claim_deduction` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycPurchaseSynergy` |
| 构建时间 | `2026-06-04 23:32:23.0780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `date` | 单据日期 | `date` | Date |
| 2 | `checkbillId` | 对账单id | `checkbill_id` | 0e70a14d-2339-4067-9754-340c3292e12b |
| 3 | `expenseItemId` | 费用项目 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 4 | `purchaseCode` | 采购员code | `purchase_code` | String |
| 5 | `code` | 索赔扣款单编码 | `code` | String |
| 6 | `supDocName` | 供应商 | `sup_doc_name` | String |
| 7 | `invoicedAmount` | 已开票金额 | `invoiced_amount` | Decimal |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `purchaseId` | 采购员id | `purchase_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `isShareMaterial` | 是否分摊到物料 | `is_share_material` | Boolean |
| 13 | `detailDefineCharacter` | 采购对账索赔扣款特征自定义项 | `detail_define_character` | f4462075-c3cc-4d28-a21f-619d66e37aff |
| 14 | `dr` | 删除标记 | `dr` | Integer |
| 15 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `purchaseOrgName` | 采购组织 | `purchase_org_name` | String |
| 18 | `id` | ID | `id` | String |
| 19 | `transtypeId` | 扣款交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `purchaseOrg` | 采购组织 | `purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 22 | `createDate` | 创建日期 | `create_date` | Date |
| 23 | `creator` | 创建人名称 | `creator` | String |
| 24 | `claimDescription` | 索赔扣款说明 | `claim_description` | String |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `currCheckAmount` | 本次对账扣款金额 | `curr_check_amount` | Decimal |
| 27 | `invoicableAmount` | 可开票金额 | `invoicable_amount` | Decimal |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 29 | `receiveOrgName` | 收票组织 | `receive_org_name` | String |
| 30 | `claimId` | 索赔扣款单id | `claim_id` | Long |
| 31 | `claimTitle` | 索赔扣款标题 | `claim_title` | String |
| 32 | `materialId` | 费用物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 33 | `checkClaimId` | 销售对账单索赔扣款子表id | `check_claim_id` | 9afcd0a8-961f-46aa-85f7-8bc213bf0c25 |
| 34 | `saleCheckBillId` | 销售对账单id | `salecheckbill_id` | eb98f64a-4bef-4ee9-b533-1996de0de769 |
| 35 | `supDocId` | 供应商id | `sup_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 36 | `freeCharacteristics` | 采购对账索赔扣款自由项特征组 | `free_characteristics` | 0b138da0-c041-4baf-a57a-ad2a892e440c |
| 37 | `createTime` | 创建时间 | `create_time` | DateTime |
| 38 | `handleType` | 处理方式 | `handle_type` | String |
| 39 | `receiveOrg` | 收票组织 | `receive_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 40 | `supDocCode` | 供应商编码 | `sup_doc_code` | String |
| 41 | `claimTotalAmount` | 索赔扣款总额 | `claim_total_amount` | Decimal |
| 42 | `purchaseName` | 采购员 | `purchase_name` | String |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `checkbillId` | 对账单id | `check.pucheckbill.PuCheckBillVO` | None | true |
| 2 | `expenseItemId` | 费用项目 | `bd.expenseitem.ExpenseItem` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `purchaseId` | 采购员id | `bd.staff.Staff` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `materialId` | 费用物料id | `pc.product.Product` | Service |  |
| 8 | `detailDefineCharacter` | 采购对账索赔扣款特征自定义项 | `check.pucheckbill.UserDefinClaimDedutionListCharacteristics` | None |  |
| 9 | `checkClaimId` | 销售对账单索赔扣款子表id | `check.salecheckbill.SaleCheckbillClaimDeduction` | None |  |
| 10 | `saleCheckBillId` | 销售对账单id | `check.salecheckbill.SaleCheckBillVO` | None |  |
| 11 | `freeCharacteristics` | 采购对账索赔扣款自由项特征组 | `check.pucheckbill.PuCheckbillClaimDeductionFreeCharacter` | None |  |
| 12 | `supDocId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 13 | `receiveOrg` | 收票组织 | `org.func.BaseOrg` | Service |  |
| 14 | `transtypeId` | 扣款交易类型id | `bd.bill.TransType` | Service |  |
| 15 | `purchaseOrg` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
