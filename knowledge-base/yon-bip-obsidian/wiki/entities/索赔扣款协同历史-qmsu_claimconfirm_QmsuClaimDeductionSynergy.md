---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.claimconfirm.QmsuClaimDeductionSynergy"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 索赔扣款协同历史 (`qmsu.claimconfirm.QmsuClaimDeductionSynergy`)

> ycSaleCoor | 物理表：`qmsu_claim_deduction_synergy`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 索赔扣款协同历史 |
| 物理表 | `qmsu_claim_deduction_synergy` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:59.5780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `action` | 业务动作 | `action` | String |
| 2 | `claimConfirmId` | 索赔扣款单id | `claim_confirm_id` | b630deb1-70f2-4adf-acc7-112076c77dca |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 5 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 6 | `modifier` | 修改人名称 | `modifier` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `tenant` | 租户ID | `tenant_id` | String |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 13 | `id` | 主键 | `id` | Long |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `entityTag` | 身份标签 | `entity_tag` | EntityTag |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `creator` | 处理人 | `creator` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `claimConfirmId` | 索赔扣款单id | `qmsu.claimconfirm.QmsuClaimDeductionConfirm` | None | true |
