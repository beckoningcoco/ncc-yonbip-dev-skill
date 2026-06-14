---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.claimconfirm.QmsuClaimdeductionAppealHistory"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 索赔扣款申诉历史 (`qmsu.claimconfirm.QmsuClaimdeductionAppealHistory`)

> ycSaleCoor | 物理表：`qmsu_claim_deduction_appealhistory`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 索赔扣款申诉历史 |
| 物理表 | `qmsu_claim_deduction_appealhistory` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:00.8380` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `appealNumber` | 申诉次数 | `appeal_number` | Integer |
| 3 | `claimTotalAmount` | 修改后索赔扣款总额 | `claim_total_amount` | Decimal |
| 4 | `lastTotalAmount` | 原索赔扣款总额 | `last_total_amount` | Decimal |
| 5 | `tenant` | 租户ID | `tenant_id` | String |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `claimConfirmId` | 扣款单 | `claim_confirm_id` | b630deb1-70f2-4adf-acc7-112076c77dca |
| 11 | `appealDate` | 申诉日期 | `appeal_date` | DateTime |
| 12 | `appealContent` | 申诉内容 | `appeal_content` | String |
| 13 | `appealFile` | 申诉附件 | `appeal_file` | String |
| 14 | `appealOpinion` | 申诉意见 | `appeal_opinion` | String |
| 15 | `appealProcessDate` | 申诉处理日期 | `appeal_process_date` | DateTime |
| 16 | `appealProcessResult` | 申诉处理结果 | `appeal_process_result` | String |
| 17 | `resolutionDes` | 决议说明 | `resolution_des` | String |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `claimConfirmId` | 扣款单 | `qmsu.claimconfirm.QmsuClaimDeductionConfirm` | None | true |
