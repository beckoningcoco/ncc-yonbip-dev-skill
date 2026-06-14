---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.claimconfirm.QmsuClaimDeductionOrigin"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 索赔扣款来源信息 (`qmsu.claimconfirm.QmsuClaimDeductionOrigin`)

> ycSaleCoor | 物理表：`qmsu_claim_deduction_origin`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 索赔扣款来源信息 |
| 物理表 | `qmsu_claim_deduction_origin` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:57.1060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `claimConfirmId` | 扣款单 | `claim_confirm_id` | b630deb1-70f2-4adf-acc7-112076c77dca |
| 2 | `sourceId` | 来源单据id(上游id) | `source_id` | String |
| 3 | `ctId` | 自定义项特征组 | `ct_id` | a074a83c-953a-4ded-8636-357d7507e2b6 |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 7 | `id` | id | `id` | Long |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `tenant` | 租户ID | `tenant_id` | String |
| 10 | `sourceBillRowNo` | 来源单据行号 | `source_bill_row_no` | Long |
| 11 | `dctId` | 自由项特征组 | `dct_id` | 5468c3de-5f7f-4ef2-9d23-4092268bd013 |
| 12 | `sourceBillType` | 来源单据类型 | `source_bill_type` | OriginType |
| 13 | `sourceBillNo` | 来源单据号 | `source_bill_no` | String |
| 14 | `sourceBillDate` | 来源单据日期 | `source_bill_date` | DateTime |
| 15 | `materialID` | 物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 16 | `materialCode` | 物料编码 | `material_code` | String |
| 17 | `materialName` | 物料名称 | `material_name` | String |
| 18 | `amount` | 数量 | `amount` | Decimal |
| 19 | `purchaseUnitId` | 单位(采购单位Id) | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组 | `qmsu.claimconfirm.QmsuClaimDeductionOriginCt` | None |  |
| 2 | `purchaseUnitId` | 单位(采购单位Id) | `pc.unit.Unit` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `materialID` | 物料 | `pc.product.Product` | Service |  |
| 5 | `claimConfirmId` | 扣款单 | `qmsu.claimconfirm.QmsuClaimDeductionConfirm` | None | true |
| 6 | `dctId` | 自由项特征组 | `qmsu.claimconfirm.QmsuClaimDeductionOriginDct` | None |  |
