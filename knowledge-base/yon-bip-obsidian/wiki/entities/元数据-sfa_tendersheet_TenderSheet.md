---
tags: [BIP, 元数据, 数据字典, sfa.tendersheet.TenderSheet]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投标单 (`sfa.tendersheet.TenderSheet`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_tender_sheet` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`8be3b63a-6af3-4435-a4cb-c201e1e84e03`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标单 |
| 物理表 | `sfa_tender_sheet` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 87 个 |
| 子表 | 6 个 |
| 关联引用 | 37 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `tenderAttachmentList` | `sfa.tendersheet.TenderAttachment` | composition |
| `tenderStageProgressList` | `sfa.tendersheet.TenderStageProgress` | composition |
| `tenderSheetParticipantList` | `sfa.tendersheet.TenderSheetParticipant` | composition |
| `biddingAttachmentList` | `sfa.tendersheet.BiddingAttachment` | composition |
| `tenderSheetDef` | `sfa.tendersheet.TenderSheetDef` | composition |
| `tenderDetailList` | `sfa.tendersheet.TenderSheetDetail` | composition |

## 关联引用 (37个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `financeOrg` | `ucf-org-center.bd_financeorgtreeref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `industry` | `productcenter.aa_customertraderef` |
| `oppt` | `yycrm.sfa_opptref` |
| `nat_currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenderSheetDefineCharacter` | `` |
| `tender_stage` | `yycrm.sfa_stageref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `close_reason` | `yycrm.crmc_custdocref` |
| `signature_org` | `ucf-org-center.bd_salesorg_na` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `process_id` | `yycrm.sfa_processref` |
| `ytenant_id` | `` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `bidding_agency` | `yycrm.cust_customerref` |
| `process_stage` | `yycrm.sfa_processstageref` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `invalid_person` | `ucf-staff-center.bd_staff_ref` |
| `close_person` | `ucf-staff-center.bd_staff_ref` |
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `exchangerate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `partner_dept` | `` |
| `iCustID` | `yycrm.cust_customerref` |
| `customer_id` | `yycrm.cust_customerref` |
| `invalid_reason` | `yycrm.crmc_custdocref` |

## 继承接口 (7个, 22字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`

## 字段列表（按类型分组）

> 共 87 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `name` | `name` | `name` | 投标名称 |
| `version_no` | `version_no` | `versionNo` | 变更版本号 |
| `bidding_batch_no` | `bidding_batch_no` | `biddingBatchNo` | 招标批次 |
| `ct_tpl_version` | `ct_tpl_version` | `ctTplVersion` | 合同模板版本 |
| `stage_duration` | `stage_duration` | `stageDuration` | 本阶段时长 |
| `ct_tpl_name` | `ct_tpl_name` | `ctTplName` | 合同模板名称 |
| `curr_total_duration` | `curr_total_duration` | `currTotalDuration` | 当前总时长 |
| `apply_code` | `apply_code` | `applyCode` | 投标申请单编号 |
| `bid_content_link` | `bid_content_link` | `bidContentLink` | 招投标源链接 |
| `ct_tpl_id` | `ct_tpl_id` | `ctTplId` | 合同模板id |
| `ct_tpl_code` | `ct_tpl_code` | `ctTplCode` | 合同模板编码 |
| `description` | `description` | `description` | 投标描述 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审核人 |
| `invalid_remark` | `invalid_remark` | `invalidRemark` | 作废备注 |
| `close_remark` | `close_remark` | `closeRemark` | 关闭备注 |

### 引用字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 投标类型 |
| `oppt` | `oppt` | `oppt` | 商机ID |
| `` | `modifierId` | `modifierId` | 修改人 |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币币种 |
| `exchangerate_type` | `exchangerate_type` | `exchangeratetype` | 汇率类型 |
| `financeOrg` | `financeOrg` | `financeOrg` | 会计主体 |
| `bidding_agency` | `bidding_agency` | `biddingAgency` | 招标代理机构 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `customer_id` | `customer_id` | `customer` | 客户ID |
| `industry` | `industry` | `industry` | 行业ID |
| `project_id` | `project_id` | `project` | 项目ID |
| `tender_stage` | `tender_stage` | `tenderStage` | 投标阶段 |
| `currency` | `currency` | `currency` | 币种ID |
| `signature_org` | `signature_org` | `signatureOrg` | 签章主体ID |
| `org` | `org` | `org` | 销售组织ID |
| `dept` | `dept` | `dept` | 部门ID |
| `ower` | `ower` | `ower` | 负责人ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `process_id` | `process_id` | `process` | 流程id |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `process_stage` | `process_stage` | `processStage` | 流程阶段 |
| `invalid_reason` | `invalid_reason` | `invalidReason` | 作废原因id |
| `invalid_person` | `invalid_person` | `invalidPerson` | 作废人ID |
| `close_reason` | `close_reason` | `closeReason` | 关闭原因id |
| `close_person` | `close_person` | `closePerson` | 关闭人ID |
| `iCustID` | `iCustID` | `cust` | 伙伴ID |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴负责人ID |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_report` | `is_report` | `isReport` | 是否投标报备单 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_ops` | `exchange_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `deposit_type` | `deposit_type` | `depositType` | 保证金方式 |
| `tender_state` | `tender_state` | `tenderState` | 单据状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 单据状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nat_tendermoney` | `nat_tendermoney` | `natTenderMoney` | 本币投标金额 |
| `exchange_rate` | `exchange_rate` | `exchRate` | 汇率 |
| `payed_deposit_money` | `payed_deposit_money` | `payedDepositMoney` | 已付保证金 |
| `tender_num` | `tender_num` | `tenderNum` | 投标数量 |
| `tender_money` | `tender_money` | `tenderMoney` | 投标金额 |
| `deposit_money` | `deposit_money` | `depositMoney` | 保证金金额 |
| `deposit_rate` | `deposit_rate` | `depositRate` | 保证金比例 |
| `tender_progress` | `tender_progress` | `tenderProgress` | 投标进度 |

### timestamp (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `registration_date` | `registration_date` | `registrationDate` | 报名日期 |
| `stage_start_time` | `stage_start_time` | `stageStartTime` | 当前阶段开始时间 |
| `first_stage_start_time` | `first_stage_start_time` | `firstStageStartTime` | 第一个阶段的开始时间 |
| `initiate_date` | `initiate_date` | `initiateDate` | 发标日期 |
| `tender_date` | `tender_date` | `tenderDate` | 投标日期 |
| `rece_follow_up_time` | `rece_follow_up_time` | `receFollowUpTime` | 最近跟进时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审核时间 |
| `invalid_Time` | `invalid_Time` | `invalidTime` | 作废时间 |
| `close_Time` | `close_Time` | `closeTime` | 关闭时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenderSheetDefineCharacter` | `tenderSheetDefineCharacter` | `tenderSheetDefineCharacter` | 投标单自定义项特征组 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `biddingAttachmentList` | 招标附件 |
| `` | `` | `tenderAttachmentList` | 投标附件 |
| `` | `` | `tenderDetailList` | 投标单明细 |
| `` | `` | `tenderSheetDef` | 投标单主表自定义项扩展 |
| `` | `` | `tenderSheetParticipantList` | 投标单参与人 |
| `` | `` | `tenderStageProgressList` | 投标阶段进度 |
