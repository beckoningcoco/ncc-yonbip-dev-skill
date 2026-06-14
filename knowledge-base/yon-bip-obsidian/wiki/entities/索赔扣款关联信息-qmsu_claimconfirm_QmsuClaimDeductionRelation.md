---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.claimconfirm.QmsuClaimDeductionRelation"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 索赔扣款关联信息 (`qmsu.claimconfirm.QmsuClaimDeductionRelation`)

> ycSaleCoor | 物理表：`qmsu_claim_deduction_relation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 索赔扣款关联信息 |
| 物理表 | `qmsu_claim_deduction_relation` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:58.3950` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `ctId` | 自定义项特征组id | `ct_id` | 04965ab2-7189-4194-8747-6001f921ee4c |
| 3 | `tenant` | 租户ID | `tenant_id` | String |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `claimConfirmId` | 扣款单 | `claim_confirm_id` | b630deb1-70f2-4adf-acc7-112076c77dca |
| 9 | `relationType` | 关联单据类型 | `relation_type` | AssociatedType |
| 10 | `title` | 标题 | `title` | String |
| 11 | `relationNo` | 关联单据号 | `relation_no` | String |
| 12 | `relationDate` | 关联单据日期 | `relation_date` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.claimconfirm.QmsuClaimDeductionRelationCt` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `claimConfirmId` | 扣款单 | `qmsu.claimconfirm.QmsuClaimDeductionConfirm` | None | true |
