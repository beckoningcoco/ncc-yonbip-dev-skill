---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.claimconfirm.QmsuClaimDeductionConfirm"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 索赔扣款单 (`qmsu.claimconfirm.QmsuClaimDeductionConfirm`)

> ycSaleCoor | 物理表：`qmsu_claim_deduction_confirm`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 索赔扣款单 |
| 物理表 | `qmsu_claim_deduction_confirm` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:51.1360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `code` | String | 单据编码 |

---

## 直接属性（101个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `pubts` | 时间戳 | `pubts` | DateTime |
| 2 | `id` | id | `id` | Long |
| 3 | `code` | 单据编码 | `code` | String |
| 4 | `claimTitle` | 索赔扣款标题 | `claim_title` | String |
| 5 | `billDate` | 单据日期 | `bill_date` | Date |
| 6 | `createType` | 创建方式 | `createType` | String |
| 7 | `projectId` | 项目id | `projectId` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 8 | `tradeType` | 索赔扣款类型 | `trade_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 9 | `purchase` | 采购商 | `purchase` | String |
| 10 | `purchaseOrgId` | 采购组织 | `purchase_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 11 | `deptName` | 采购部门名称 | `dept_name` | String |
| 12 | `billingOrgName` | 收票组织 | `billing_org_name` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 16 | `source` | 上游单据类型 | `source` | String |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `supplier` | 供应商名称 | `supplier` | String |
| 21 | `purchaseOrg` | 采购组织 | `purchase_org` | String |
| 22 | `tenant` | 租户ID | `tenant_id` | String |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `handlePerson` | 采购商处理人 | `handle_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 25 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 26 | `purchaser` | 采购员 | `purchaser` | String |
| 27 | `checkedAmount` | 已对账金额 | `checked_amount` | Decimal |
| 28 | `lastTotalAmount` | 原索赔扣款总额 | `last_total_amount` | Decimal |
| 29 | `uncheckAmount` | 可对账金额 | `uncheck_amount` | Decimal |
| 30 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 31 | `tradeTypeName` | 索赔类型 | `trade_type_name` | String |
| 32 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 33 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 34 | `projectName` | 项目名称 | `project_name` | String |
| 35 | `returncount` | 退回次数 | `returncount` | Short |
| 36 | `verifystate` | 审批状态 | `verifystate` | Short |
| 37 | `ctId` | 自定义项特征组id | `ct_id` | 12b317a9-1aa2-4e54-8b04-e7122650c9fb |
| 38 | `vendorBillId` | 供应商问题整改id | `vendor_bill_id` | String |
| 39 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 40 | `invoicedAmount` | 已开票金额 | `invoiced_amount` | Decimal |
| 41 | `confirmerName` | 确认人 | `confirmer_name` | String |
| 42 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 43 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 44 | `currencyName` | 币种名称 | `currency_name` | String |
| 45 | `projectCode` | 项目编码 | `project_code` | String |
| 46 | `printCount` | 打印次数 | `printCount` | Integer |
| 47 | `claimFile` | 索赔扣款附件 | `claim_file` | String |
| 48 | `supplierContactName` | 供方联系人 | `supplier_contact_name` | String |
| 49 | `createDate` | 创建日期 | `create_date` | Date |
| 50 | `auditDate` | 审批日期 | `audit_date` | Date |
| 51 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 52 | `creator` | 创建人名称 | `creator` | String |
| 53 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 54 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 55 | `maxAppealNumber` | 最大申诉次数 | `max_appeal_number` | Integer |
| 56 | `auditor` | 审批人名称 | `auditor` | String |
| 57 | `dept` | 采购部门 | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 58 | `agentConfirmPersonName` | 代确认人 | `agent_confirm_person_name` | String |
| 59 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 60 | `agentConfirmPersonId` | 代确认人id | `agent_confirm_person_id` | String |
| 61 | `createTime` | 创建时间 | `create_time` | DateTime |
| 62 | `upcode` | 上游单据号 | `upcode` | String |
| 63 | `executeParam` | 执行跟踪参数0:采购商1:供应商 | `execute_param` | String |
| 64 | `billingOrg` | 收票组织 | `billing_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 65 | `purchaserId` | 采购员 | `purchaser_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 66 | `supplierId` | 供应商 | `supplierId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 67 | `supplierContact` | 供方联系人 | `supplier_contact` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 68 | `synergyStatus` | 协同状态 | `synergy_status` | String |
| 69 | `remark` | 备注 | `remark` | String |
| 70 | `claimDescription` | 索赔扣款说明 | `claim_description` | String |
| 71 | `upstreamId` | 上游单据 | `upstream_id` | Long |
| 72 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 73 | `feedbackTime` | 要求反馈时间 | `feedback_time` | DateTime |
| 74 | `claimTotalAmount` | 索赔扣款总额 | `claim_total_amount` | Decimal |
| 75 | `currencyIdDiwork` | 币种 | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 76 | `processMode` | 处理方式 | `process_mode` | String |
| 77 | `confirmDescription` | 确认说明 | `confirm_description` | String |
| 78 | `confirmFile` | 供应商确认附件 | `confirm_file` | String |
| 79 | `confirmDate` | 确认日期 | `confirm_date` | DateTime |
| 80 | `appealContent` | 申诉内容 | `appeal_content` | String |
| 81 | `appealOpinion` | 申诉意见 | `appeal_opinion` | String |
| 82 | `appealDate` | 申诉日期 | `appeal_date` | DateTime |
| 83 | `appealNumber` | 申诉次数 | `appeal_number` | Integer |
| 84 | `appealFile` | 申诉附件 | `appeal_file` | String |
| 85 | `appealProcessResult` | 申诉处理结果 | `appeal_process_result` | String |
| 86 | `resolutionDes` | 决议说明 | `resolution_des` | String |
| 87 | `appealProcessDate` | 申诉处理日期 | `appeal_process_date` | DateTime |
| 88 | `executiveResultDes` | 执行结果说明 | `executive_result_des` | String |
| 89 | `executiveFile` | 执行附件 | `executive_file` | String |
| 90 | `executiveDate` | 实际执行时间 | `executive_date` | DateTime |
| 91 | `claimAppealStatus` | 申诉状态 | `claim_appeal_status` | ClaimAppealStatus |
| 92 | `claimOriginList` | 索赔扣款来源信息 | `` | 2e8fa46e-b0ba-4ef3-b717-0f839ccac3d6 |
| 93 | `claimRelationList` | 索赔扣款关联信息 | `` | 48636be5-b564-411c-8c8f-89a576a3ff88 |
| 94 | `claimType` | 单据类型 | `claim_type` | ClaimType |
| 95 | `define` | 索赔扣款单主表自由自定义项 | `` | 5aac2b24-1311-4b59-951f-3bf4a698f7e8 |
| 96 | `details` | 索赔扣款明细 | `` | 78cdec17-31be-4f7b-a291-697671b792ff |
| 97 | `puClaimSourceId` | 采方索赔扣款 | `pu_claim_source_id` | Long |
| 98 | `qmsuClaimHistories` | 索赔扣款申诉历史 | `` | 7438d578-a196-46ea-af66-702102e1476f |
| 99 | `suClaimSourceId` | 供方索赔扣款 | `su_claim_source_id` | Long |
| 100 | `synergyList` | 索赔扣款协同历史 | `` | 0f42fa76-4cc1-46f6-ac42-ce0de89ca8e3 |
| 101 | `userdefItem` | 索赔扣款主表固定自定义项 | `` | d605bb64-d804-4813-8db6-aa939edb42e4 |

---

## 关联属性（24个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.claimconfirm.QmsuClaimDeductionConfirmCt` | None |  |
| 2 | `synergyList` | 索赔扣款协同历史 | `qmsu.claimconfirm.QmsuClaimDeductionSynergy` | None | true |
| 3 | `supplierId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 4 | `handlePerson` | 采购商处理人 | `bd.staff.Staff` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `dept` | 采购部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 11 | `purchaseOrgId` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
| 12 | `claimRelationList` | 索赔扣款关联信息 | `qmsu.claimconfirm.QmsuClaimDeductionRelation` | None | true |
| 13 | `claimOriginList` | 索赔扣款来源信息 | `qmsu.claimconfirm.QmsuClaimDeductionOrigin` | None | true |
| 14 | `billingOrg` | 收票组织 | `org.func.BaseOrg` | Service |  |
| 15 | `qmsuClaimHistories` | 索赔扣款申诉历史 | `qmsu.claimconfirm.QmsuClaimdeductionAppealHistory` | None | true |
| 16 | `purchaserId` | 采购员 | `bd.staff.Staff` | Service |  |
| 17 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 18 | `currencyIdDiwork` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 19 | `define` | 索赔扣款单主表自由自定义项 | `qmsu.claimconfirm.QmsuClaimDeductionFreeDefine` | None | true |
| 20 | `details` | 索赔扣款明细 | `qmsu.claimconfirm.QmsuClaimDeductionConfirmDetails` | None | true |
| 21 | `projectId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 22 | `supplierContact` | 供方联系人 | `aa.vendor.VendorContacts` | Service |  |
| 23 | `tradeType` | 索赔扣款类型 | `bd.bill.TransType` | Service |  |
| 24 | `userdefItem` | 索赔扣款主表固定自定义项 | `qmsu.claimconfirm.QmsuClaimDeductionConfirmUserdefItem` | None | true |
