---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.claimconfirm.QmsuClaimDeductionConfirmDetails"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 索赔扣款明细 (`qmsu.claimconfirm.QmsuClaimDeductionConfirmDetails`)

> ycSaleCoor | 物理表：`qmsu_claim_deduction_details`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 索赔扣款明细 |
| 物理表 | `qmsu_claim_deduction_details` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:54.3610` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `claimConfirmId` | 索赔扣款确认单 | `claim_confirm_id` | b630deb1-70f2-4adf-acc7-112076c77dca |
| 3 | `claimProject` | 索赔扣款项目 | `claim_project` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 4 | `returncount` | 退回次数 | `returncount` | Short |
| 5 | `verifystate` | 审批状态 | `verifystate` | Short |
| 6 | `ctId` | 自定义项特征组id | `ct_id` | c8a64a3f-5edc-47c7-8c88-b437f7c8804c |
| 7 | `modifier` | 修改人名称 | `modifier` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `tenant` | 租户ID | `tenant_id` | String |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `auditDate` | 审批日期 | `audit_date` | Date |
| 17 | `creator` | 创建人名称 | `creator` | String |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 21 | `auditor` | 审批人名称 | `auditor` | String |
| 22 | `materialCode` | 物料编码 | `material_code` | String |
| 23 | `materialName` | 物料名称 | `material_name` | String |
| 24 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `createTime` | 创建时间 | `create_time` | DateTime |
| 26 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 27 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 28 | `dctId` | 自由项特征组id | `dct_id` | 5fb00108-995f-4371-9fae-25c635a2ebee |
| 29 | `claimReason` | 索赔扣款理由 | `claim_reason` | String |
| 30 | `claimAmount` | 索赔扣款金额 | `claim_amount` | Decimal |
| 31 | `materialID` | 物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 32 | `unitId` | 单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `amount` | 数量 | `amount` | Decimal |
| 34 | `manuFactor` | 生产厂家 | `manu_factor` | String |
| 35 | `productionBatch` | 生产批次 | `production_batch` | String |
| 36 | `manuDate` | 生产日期 | `manu_date` | DateTime |
| 37 | `arrivalDate` | 到货日期 | `arrival_date` | DateTime |
| 38 | `claimAppealAmount` | 索赔扣款处理申诉金额 | `claim_appeal_amount` | Decimal |
| 39 | `define` | 索赔扣款明细表自由自定义项 | `` | 5f3bb3d1-b6b1-4439-870b-a501c814a6a3 |
| 40 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 41 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 42 | `puClaimDetailSourceId` | 采方索赔扣款子表 | `pu_claim_detail_source_id` | Long |
| 43 | `puClaimSourceId` | 采方索赔扣款主表 | `pu_claim_source_id` | Long |
| 44 | `source` | 上游单据类型 | `source` | String |
| 45 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 46 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 47 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 48 | `suClaimDetailSourceId` | 供方索赔扣款子表 | `su_claim_detail_source_id` | Long |
| 49 | `suClaimSourceId` | 供方索赔扣款主表 | `su_claim_source_id` | Long |
| 50 | `upcode` | 上游单据号 | `upcode` | String |
| 51 | `userdefItem` | 索赔扣款明细表固定自定义项 | `` | 9f000879-036a-45f4-a1fd-3de42feaaed6 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `claimProject` | 索赔扣款项目 | `bctask.basedoc.CustomerDocVO` | Service |  |
| 2 | `ctId` | 自定义项特征组id | `qmsu.claimconfirm.QmsuClaimDeductionDetailsCt` | None |  |
| 3 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `define` | 索赔扣款明细表自由自定义项 | `qmsu.claimconfirm.QmsuClaimDeductionDetailsFreeDefine` | None | true |
| 8 | `unitId` | 单位 | `pc.unit.Unit` | Service |  |
| 9 | `materialID` | 物料 | `pc.product.Product` | Service |  |
| 10 | `claimConfirmId` | 索赔扣款确认单 | `qmsu.claimconfirm.QmsuClaimDeductionConfirm` | None | true |
| 11 | `dctId` | 自由项特征组id | `qmsu.claimconfirm.QmsuClaimDeductionDetailsDct` | None |  |
| 12 | `userdefItem` | 索赔扣款明细表固定自定义项 | `qmsu.claimconfirm.QmsuClaimDeductionConfirmDetailsUserdefItem` | None | true |
