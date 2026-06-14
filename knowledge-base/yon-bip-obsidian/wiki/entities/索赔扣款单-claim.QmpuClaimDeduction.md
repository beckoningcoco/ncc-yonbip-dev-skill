---
tags: ["BIP", "元数据", "数据字典", "ycQualityCollaboration", "qmpu.claim.QmpuClaimDeduction"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 索赔扣款单 (`qmpu.claim.QmpuClaimDeduction`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycQualityCollaboration 模块实体元数据字典。
> 物理表：`qmpu_claim_deduction` | 所属应用：`ycQualityCollaboration`
> 来源：元数据API `queryByUri` 返回的 `qmpu.claim.QmpuClaimDeduction` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 索赔扣款单 |
| 物理表 | `qmpu_claim_deduction` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycQualityCollaboration` |
| 业务对象ID | `e2a533bd-7ef1-4e0e-b24c-75aaccd630cc` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:31.3310` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 索赔单主键 |
| 编码 | `code` | `code` | String | 单据编号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:38:23:000
- **安装来源**: `/app/data_scripts/src/cpu-synergy-server/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-synergy/0010_iuap_common/DML/0270_iuap_metadata/202601/202601191021_metadata_qmpu-claim_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `e0be2b7a-7b8c-4b8c-8134-7cc8e48c262b`

## 业务场景

- `print`
- `workflow`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `transtype`
- `report`
- `billcode`
- `userdefine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`, `dataAuth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 12 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 打印次数 (`IPrintCount`) | `base.itf.IPrintCount` | 66 | 1 |
| 4 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 5 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 6 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 7 | 租户接口 (`ITenant`) | `ucfbase.ucfbaseItf.ITenant` | 77 | 1 |
| 8 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 9 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 10 | 项目结构属性 (`projectStructureProperties`) | `BGDM.wbs.projectStructureProperties` | 49 | 2 |
| 11 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 12 | 审批提交信息 (`ISubmitInfo`) | `ucfbase.ucfbaseItf.ISubmitInfo` | 85 | 4 |

---

## 直接属性（共 106 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 2 | `id` | 索赔单主键 | `id` | Long | `long` |  | ✓ |
| 3 | `code` | 单据编号 | `code` | String | `text` |  | ✓ |
| 4 | `claimTitle` | 索赔扣款标题 | `claim_title` | String | `text` |  | ✓ |
| 5 | `billDate` | 单据日期 | `bill_date` | DateTime | `timestamp` |  | ✓ |
| 6 | `createType` | 创建方式 | `createType` | String | `text` |  | ✓ |
| 7 | `projectId` | 项目id | `projectId` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 8 | `purchaseName` | 采购商 | `purchase_name` | String | `text` |  | ✓ |
| 9 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |  | ✓ |
| 10 | `submitTime` | 提交时间 | `submit_time` | DateTime | `dateTime` |  | ✓ |
| 11 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 12 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime | `dateTime` |  | ✓ |
| 13 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 14 | `openapiParam` | openapi保存状态1:开立,4:已审核 | `openapi_param` | String | `text` |  | ✓ |
| 15 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |  | ✓ |
| 16 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 17 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 18 | `dept` | 采购部门 | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 19 | `expenseMaterial` | 费用物料 | `expense_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 20 | `billingOrg` | 收票组织 | `billing_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 21 | `purchaseOrg` | 采购组织 | `purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | ✓ |
| 22 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 24 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 25 | `dr` | dr | `dr` | Short | `short` |  | ✓ |
| 26 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 28 | `erpId` | 外部系统单据id | `erpId` | String | `text` |  | ✓ |
| 29 | `tenant` | 租户ID | `tenant_id` | String | `text` | ✓ | ✓ |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 31 | `handlePerson` | 处理人 | `handle_person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 32 | `checkedAmount` | 已对账金额 | `checked_amount` | Decimal | `number` |  | ✓ |
| 33 | `lastTotalAmount` | 原索赔扣款总额 | `last_total_amount` | Decimal | `number` |  | ✓ |
| 34 | `uncheckAmount` | 可对账金额 | `uncheck_amount` | Decimal | `number` |  | ✓ |
| 35 | `postFailReason` | 过账失败原因 | `fail_reason` | String | `text` |  | ✓ |
| 36 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 37 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 38 | `status` | 单据状态 | `workflow_status` | Integer | `int` |  | ✓ |
| 39 | `expenseItem` | 费用项目 | `expense_item` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |  | ✓ |
| 40 | `ctId` | 自定义项特征组id | `ct_id` | 43566d96-c8d1-4e03-8ba6-3f0f44048459 | `UserDefine` |  | ✓ |
| 41 | `vendorBillId` | 供应商问题整改id | `vendor_bill_id` | String | `text` |  | ✓ |
| 42 | `invoicedAmount` | 已开票金额 | `invoiced_amount` | Decimal | `number` |  | ✓ |
| 43 | `confirmerName` | 确认人 | `confirmer_name` | String | `text` |  | ✓ |
| 44 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 45 | `postStatus` | 过账状态(不过账、未过账、过账中、过账成功、过账失败) | `post_status` | String | `text` |  | ✓ |
| 46 | `printCount` | 打印次数 | `printCount` | Integer | `int` |  | ✓ |
| 47 | `claimFile` | 索赔扣款附件 | `claim_file` | String | `text` |  | ✓ |
| 48 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 49 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 50 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 51 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 52 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 53 | `maxAppealNumber` | 最大申诉次数 | `max_appeal_number` | Integer | `int` |  | ✓ |
| 54 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 55 | `agentConfirmPersonName` | 代确认人 | `agent_confirm_person_name` | String | `text` |  | ✓ |
| 56 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 57 | `agentConfirmPersonId` | 代确认人id | `agent_confirm_person_id` | String | `text` |  | ✓ |
| 58 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 59 | `executeParam` | 执行跟踪参数0:采购商1:供应商 | `execute_param` | String | `text` |  | ✓ |
| 60 | `purchaser` | 采购员 | `purchaser` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 61 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 62 | `supplierContact` | 供方联系人 | `supplier_contact` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |  | ✓ |
| 63 | `tradeType` | 交易类型 | `trade_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 64 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 65 | `claimStatus` | 状态 | `status` | String | `text` |  | ✓ |
| 66 | `synergyStatus` | 协同状态 | `synergy_status` | String | `text` |  | ✓ |
| 67 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 68 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 69 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 70 | `creator` | 创建人 | `creator` | String | `text` |  | ✓ |
| 71 | `claimDescription` | 索赔扣款说明 | `claim_description` | String | `text` |  | ✓ |
| 72 | `confirmDescription` | 确认说明 | `confirm_description` | String | `text` |  | ✓ |
| 73 | `feedbackTime` | 要求反馈时间 | `feedback_time` | DateTime | `timestamp` |  | ✓ |
| 74 | `confirmFile` | 供应商确认附件 | `confirm_file` | String | `text` |  | ✓ |
| 75 | `appealContent` | 申诉内容 | `appeal_content` | String | `text` |  | ✓ |
| 76 | `claimTotalAmount` | 索赔扣款总额 | `claim_total_amount` | Decimal | `number` |  | ✓ |
| 77 | `confirmDate` | 确认时间 | `confirm_date` | DateTime | `timestamp` |  | ✓ |
| 78 | `currencyIdDiwork` | 币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 79 | `appealOpinion` | 申诉意见 | `appeal_opinion` | String | `text` |  | ✓ |
| 80 | `processMode` | 处理方式 | `process_mode` | String | `text` |  | ✓ |
| 81 | `appealDate` | 申诉日期 | `appeal_date` | DateTime | `timestamp` |  | ✓ |
| 82 | `appealNumber` | 申诉次数 | `appeal_number` | Integer | `int` |  | ✓ |
| 83 | `appealFile` | 申诉附件 | `appeal_file` | String | `text` |  | ✓ |
| 84 | `appealProcessResult` | 申诉处理结果 | `appeal_process_result` | String | `text` |  | ✓ |
| 85 | `resolutionDes` | 决议说明 | `resolution_des` | String | `text` |  | ✓ |
| 86 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 87 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 88 | `appealProcessDate` | 申诉处理日期 | `appeal_process_date` | DateTime | `timestamp` |  | ✓ |
| 89 | `executiveResultDes` | 执行结果说明 | `executive_result_des` | String | `text` |  | ✓ |
| 90 | `executiveFile` | 执行附件 | `executive_file` | String | `text` |  | ✓ |
| 91 | `executiveDate` | 实际执行时间 | `executive_date` | DateTime | `timestamp` |  | ✓ |
| 92 | `appealList` | 索赔扣款申诉历史 | `` | 60817a7a-ed1e-487a-977b-3963fcb8e2a4 | `` |  |  |
| 93 | `claimAppealStatus` | 申诉状态 | `claim_appeal_status` | ClaimAppealStatus | `` |  | ✓ |
| 94 | `claimType` | 单据类型 | `claim_type` | ClaimType | `` |  | ✓ |
| 95 | `define` | 索赔扣款单主表自由自定义项 | `` | 137e46cf-cf06-427a-b372-9d0cc47e34d9 | `` |  |  |
| 96 | `detailsList` | 索赔扣款明细 | `` | d33a9745-420b-4a86-a92d-8e94a6898027 | `` |  |  |
| 97 | `originList` | 索赔扣款来源信息 | `` | abbe4190-9972-461b-b2ef-d6bb9f871b6c | `` |  |  |
| 98 | `puClaimSourceId` | 索赔扣款 | `pu_claim_source_id` | Long | `long` |  | ✓ |
| 99 | `reassignmentList` | 索赔扣款转派历史 | `` | 3d7ed8f3-d5ae-447a-afff-59a4750fb7e7 | `` |  |  |
| 100 | `relationList` | 索赔扣款关联信息 | `` | 1875845f-9619-448a-849d-d17b44b78c52 | `` |  |  |
| 101 | `suClaimAppealSourceId` | 索赔扣款处理申诉单 | `su_claim_appeal_source_id` | Long | `long` |  | ✓ |
| 102 | `synergy` | 是否与供应商协同 | `is_synergy` | Short | `short` |  | ✓ |
| 103 | `synergyList` | 索赔扣款协同历史 | `` | 048016d6-2544-447b-99bb-ea48e3bf0272 | `` |  |  |
| 104 | `tplid` | 模板id | `tplid` | Long | `long` |  | ✓ |
| 105 | `userdefItem` | 索赔扣款主表固定自定义项 | `` | ba0aec7c-1209-4367-b229-376e2f68a6d2 | `` |  |  |
| 106 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` |  | ✓ |

---

## 关联属性（共 30 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `expenseItem` | 费用项目 | `bd.expenseitem.ExpenseItem` | `expense_item` |  →  |  |  | Service |  |
| 2 | `submitter` | 提交人 | `base.user.BipUser` | `submitter` |  →  |  |  | Service |  |
| 3 | `ctId` | 自定义项特征组id | `qmpu.claim.QmpuClaimDeductionCt` | `ct_id` |  →  |  |  | None |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | `activity` |  →  |  |  | Service |  |
| 5 | `creatorId` | 创建人id | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | `wbs` |  →  |  |  | Service |  |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 9 | `originList` | 索赔扣款来源信息 | `qmpu.claim.QmpuClaimDeductionOrigin` | `` | originList → claimDeductionId | 0..n | true | None |  |
| 10 | `billingOrg` | 收票组织 | `org.func.BaseOrg` | `billing_org` |  →  |  |  | Service |  |
| 11 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | `withdrawpp` |  →  |  |  | Service |  |
| 12 | `reassignmentList` | 索赔扣款转派历史 | `qmpu.claim.QmpuClaimDeductionReassignment` | `` | reassignmentList → claimdeductionId | 0..n | true | None |  |
| 13 | `detailsList` | 索赔扣款明细 | `qmpu.claim.QmpuClaimDeductionDetails` | `` | detailsList → claimdeductionId | 1..n | true | None |  |
| 14 | `currencyIdDiwork` | 币种id | `bd.currencytenant.CurrencyTenantVO` | `currency_id_diwork` |  →  |  |  | Service |  |
| 15 | `supplier` | 供应商 | `aa.vendor.Vendor` | `supplier` |  →  |  |  | Service |  |
| 16 | `define` | 索赔扣款单主表自由自定义项 | `qmpu.claim.QmpuClaimDeductionFreeDefine` | `` | define → id | 1 | true | None | ⚠️ |
| 17 | `purchaseOrg` | 采购组织 | `org.func.PurchaseOrg` | `purchase_org` |  →  |  |  | Service |  |
| 18 | `tradeType` | 交易类型 | `bd.bill.TransType` | `trade_type` |  →  |  |  | Service |  |
| 19 | `userdefItem` | 索赔扣款主表固定自定义项 | `qmpu.claim.QmpuClaimDeductionUserdefItem` | `` | userdefItem → id | 1 | true | None | ⚠️ |
| 20 | `synergyList` | 索赔扣款协同历史 | `qmpu.claim.QmpuClaimDeductionSynergy` | `` | synergyList → claimdeductionId | 0..n | true | None |  |
| 21 | `handlePerson` | 处理人 | `bd.staff.Staff` | `handle_person` |  →  |  |  | Service |  |
| 22 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 23 | `purchaser` | 采购员 | `bd.staff.Staff` | `purchaser` |  →  |  |  | Service |  |
| 24 | `relationList` | 索赔扣款关联信息 | `qmpu.claim.QmpuClaimDeductionRelation` | `` | relationList → claimDeductionId | 0..n | true | None |  |
| 25 | `dept` | 采购部门 | `bd.adminOrg.AdminOrgVO` | `dept_id` |  →  |  |  | Service |  |
| 26 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 27 | `appealList` | 索赔扣款申诉历史 | `qmpu.claim.QmpuClaimDeductionAppeal` | `` | appealList → claimDeductionId | 0..n | true | None |  |
| 28 | `projectId` | 项目id | `bd.project.ProjectVO` | `projectId` |  →  |  |  | Service |  |
| 29 | `supplierContact` | 供方联系人 | `aa.vendor.VendorContacts` | `supplier_contact` |  →  |  |  | Service |  |
| 30 | `expenseMaterial` | 费用物料 | `pc.product.Product` | `expense_material` |  →  |  |  | Service |  |

### Composition（子表）

- **originList**: `originList` → `qmpu.claim.QmpuClaimDeductionOrigin` | 0..n
- **reassignmentList**: `reassignmentList` → `qmpu.claim.QmpuClaimDeductionReassignment` | 0..n
- **detailsList**: `detailsList` → `qmpu.claim.QmpuClaimDeductionDetails` | 1..n
- **define**: `define` → `qmpu.claim.QmpuClaimDeductionFreeDefine` | 1 ⚠️ 已废弃
- **userdefItem**: `userdefItem` → `qmpu.claim.QmpuClaimDeductionUserdefItem` | 1 ⚠️ 已废弃
- **synergyList**: `synergyList` → `qmpu.claim.QmpuClaimDeductionSynergy` | 0..n
- **relationList**: `relationList` → `qmpu.claim.QmpuClaimDeductionRelation` | 0..n
- **appealList**: `appealList` → `qmpu.claim.QmpuClaimDeductionAppeal` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `expenseItem` (费用项目) | `bd.expenseitem.ExpenseItem` | `expense_item` |
| `submitter` (提交人) | `base.user.BipUser` | `submitter` |
| `activity` (活动) | `pgrm.projecttask.ProjectScheduleTask` | `activity` |
| `creatorId` (创建人id) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `wbs` (WBS) | `BGDM.wbs.wbs_doc` | `wbs` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `billingOrg` (收票组织) | `org.func.BaseOrg` | `billing_org` |
| `withdrawpp` (撤回提交的人) | `base.user.BipUser` | `withdrawpp` |
| `currencyIdDiwork` (币种id) | `bd.currencytenant.CurrencyTenantVO` | `currency_id_diwork` |
| `supplier` (供应商) | `aa.vendor.Vendor` | `supplier` |
| `purchaseOrg` (采购组织) | `org.func.PurchaseOrg` | `purchase_org` |
| `tradeType` (交易类型) | `bd.bill.TransType` | `trade_type` |
| `handlePerson` (处理人) | `bd.staff.Staff` | `handle_person` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `purchaser` (采购员) | `bd.staff.Staff` | `purchaser` |
| `dept` (采购部门) | `bd.adminOrg.AdminOrgVO` | `dept_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `projectId` (项目id) | `bd.project.ProjectVO` | `projectId` |
| `supplierContact` (供方联系人) | `aa.vendor.VendorContacts` | `supplier_contact` |
| `expenseMaterial` (费用物料) | `pc.product.Product` | `expense_material` |
