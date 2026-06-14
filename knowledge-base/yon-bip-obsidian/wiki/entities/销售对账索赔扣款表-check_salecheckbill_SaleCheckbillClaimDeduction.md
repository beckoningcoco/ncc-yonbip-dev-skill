---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.salecheckbill.SaleCheckbillClaimDeduction"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售对账索赔扣款表 (`check.salecheckbill.SaleCheckbillClaimDeduction`)

> ycSaleCoor | 物理表：`sale_checkbill_claim_deduction`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售对账索赔扣款表 |
| 物理表 | `sale_checkbill_claim_deduction` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:07.2630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `checkClaimId` | 采购对账单索赔扣款子表id | `check_claim_id` | d97f94e0-038a-471e-ae1c-ad426e0101ed |
| 3 | `checkbillId` | 销售对账单id | `checkbill_id` | eb98f64a-4bef-4ee9-b533-1996de0de769 |
| 4 | `claimDescription` | 索赔扣款说明 | `claim_description` | String |
| 5 | `claimId` | 索赔扣款单id | `claim_id` | Long |
| 6 | `claimTitle` | 索赔扣款标题 | `claim_title` | String |
| 7 | `claimTotalAmount` | 索赔扣款总额 | `claim_total_amount` | Decimal |
| 8 | `code` | 索赔扣款单编码 | `code` | String |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `currCheckAmount` | 本次对账扣款金额 | `curr_check_amount` | Decimal |
| 14 | `date` | 单据日期 | `date` | Date |
| 15 | `detailDefineCharacter` | 销售对账单索赔扣款特征自定义项 | `detail_define_character` | 16d66bec-2933-4680-8d46-227513b3cb0d |
| 16 | `dr` | 删除标记 | `dr` | Integer |
| 17 | `expenseItemId` | 费用项目 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 18 | `expenseItemName` | 费用项目 | `expense_item_name` | String |
| 19 | `freeCharacteristics` | 销售对账单索赔扣款自由项特征组 | `free_characteristics` | 9859cfac-3444-43f8-bd83-f2c627cc9bdb |
| 20 | `handleType` | 处理方式 | `handle_type` | String |
| 21 | `id` | id | `id` | String |
| 22 | `invoicableAmount` | 可开票金额 | `invoicable_amount` | Decimal |
| 23 | `invoicedAmount` | 已开票金额 | `invoiced_amount` | Decimal |
| 24 | `isShareMaterial` | 是否分摊到物料 | `is_share_material` | Boolean |
| 25 | `materialId` | 费用物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 26 | `materialName` | 费用物料 | `material_name` | String |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 31 | `puCheckBillId` | 采购对账单id | `pucheckbill_id` | 0e70a14d-2339-4067-9754-340c3292e12b |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |
| 33 | `purchaseCode` | 采购员code | `purchase_code` | String |
| 34 | `purchaseId` | 采购员id | `purchase_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 35 | `purchaseName` | 采购员 | `purchase_name` | String |
| 36 | `purchaseOrg` | 采购组织 | `purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 37 | `purchaseOrgName` | 采购组织 | `purchase_org_name` | String |
| 38 | `receiveOrg` | 收票组织 | `receive_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 39 | `receiveOrgName` | 收票组织 | `receive_org_name` | String |
| 40 | `supDocCode` | 供应商编码 | `sup_doc_code` | String |
| 41 | `supDocId` | 供应商id | `sup_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 42 | `supDocName` | 供应商 | `sup_doc_name` | String |
| 43 | `transtypeId` | 扣款交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 44 | `transtypeName` | 扣款交易类型 | `transtype_name` | String |
| 45 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `checkbillId` | 销售对账单id | `check.salecheckbill.SaleCheckBillVO` | None | true |
| 2 | `expenseItemId` | 费用项目 | `bd.expenseitem.ExpenseItem` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `purchaseId` | 采购员id | `bd.staff.Staff` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `materialId` | 费用物料id | `pc.product.Product` | Service |  |
| 8 | `detailDefineCharacter` | 销售对账单索赔扣款特征自定义项 | `check.salecheckbill.UserDefineMaterialCharacteristics` | None |  |
| 9 | `checkClaimId` | 采购对账单索赔扣款子表id | `check.pucheckbill.PuCheckbillClaimDeduction` | None |  |
| 10 | `freeCharacteristics` | 销售对账单索赔扣款自由项特征组 | `check.salecheckbill.SaleCheckbillClaimDeductionFreeCharacter` | None |  |
| 11 | `supDocId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 12 | `puCheckBillId` | 采购对账单id | `check.pucheckbill.PuCheckBillVO` | None |  |
| 13 | `receiveOrg` | 收票组织 | `org.func.BaseOrg` | Service |  |
| 14 | `transtypeId` | 扣款交易类型id | `bd.bill.TransType` | Service |  |
| 15 | `purchaseOrg` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
