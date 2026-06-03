---
tags: [BIP, 元数据, 数据字典, act.followrecord.FollowRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 跟进记录 (`act.followrecord.FollowRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_followrecord` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`1dcdcd51-d20e-4a3d-9884-178000848c43`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 跟进记录 |
| 物理表 | `act_followrecord` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 82 个 |
| 子表 | 10 个 |
| 关联引用 | 44 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `followMotionList` | `act.followrecord.FollowMotion` | composition |
| `followNextContactList` | `act.followrecord.FollowNextContact` | composition |
| `followRecordParticipantList` | `act.followrecord.FollowRecordParticipant` | composition |
| `headDef` | `act.followrecord.FollowRecordDef` | composition |
| `followContactList` | `act.followrecord.FollowContact` | composition |
| `followRecordTaxInvoiceList` | `act.followrecord.FollowRecordTaxInvoice` | composition |
| `authDimensionList` | `act.followrecord.AuthBusiobjectDimensionFollowRecord` | composition |
| `followRecordSitePhotoList` | `act.followrecord.FollowRecordSitePhoto` | composition |
| `followRecordRemarkList` | `act.followrecord.FollowRecordRemark` | composition |
| `followRecordExpenseList` | `act.followrecord.FollowRecordExpense` | composition |

## 关联引用 (44个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `bizFlowId` | `` |
| `attachment_group_item_id` | `` |
| `final_user` | `yycrm.cust_customerref` |
| `oppt` | `yycrm.sfa_opptref` |
| `attachment_group_id` | `` |
| `clue` | `yycrm.sfa_clueref` |
| `contact` | `yycrm.cust_contactref` |
| `contract_draft` | `yycrm.sfa_contractdraftref` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `motion` | `yycrm.sfa_motionref` |
| `oCustomerIndustry_id` | `productcenter.aa_customertraderef` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `processStage` | `yycrm.sfa_processstageref` |
| `opptReport` | `yycrm.sfa_opptreportref` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_dept_list_ref` |
| `bustype` | `transtype.bd_billtyperef` |
| `followRecordDefineCharacter` | `` |
| `partner_person` | `yycrm.cust_contactref` |
| `tender_sheet` | `yycrm.sfa_tendersheetref` |
| `sign_in_id` | `yycrm.act_signexecuterefer` |
| `actionid` | `yycrm.act_actionref` |
| `csp_record_id` | `` |
| `oppt_stage` | `yycrm.sfa_processstageref` |
| `follow_method_doc` | `yycrm.crmc_custdocref` |
| `partner_dept` | `yycrm.prm_partnerdepartmentref` |
| `iCustID` | `yycrm.cust_customerref` |
| `taskid` | `yycrm.act_taskref` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (8个, 24字段)

- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 82 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据号 |
| `sign_in_img` | `sign_in_img` | `signInImg` | 签到图片 |
| `picture_5` | `picture_5` | `picture5` | 照片5 |
| `picture_4` | `picture_4` | `picture4` | 照片4 |
| `picture_3` | `picture_3` | `picture3` | 照片3 |
| `picture_2` | `picture_2` | `picture2` | 照片2 |
| `remind_time` | `remind_time` | `remindTime` | 提醒时间 |
| `next_follow_remind` | `next_follow_remind` | `nextFollowRemind` | 下次跟进提醒 |
| `followup_context_rich_text` | `followup_context_rich_text` | `followUpContextRichText` | 下次跟进内容(富文本) |
| `` | `auditor` | `auditor` | 审批人名称 |
| `follow_context_rich_text` | `follow_context_rich_text` | `followContextRichText` | 跟进内容(富文本) |
| `from_bill_num` | `from_bill_num` | `fromBillNum` | 来源单据 |
| `followcontext` | `followcontext` | `followContext` | 跟进内容 |
| `followupcontext` | `followupcontext` | `followUpContext` | 下次跟进内容 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `picture_1` | `picture_1` | `picture1` | 照片1 |

### 引用字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `csp_record_id` | `csp_record_id` | `cspRecordId` | 通话记录id |
| `taskid` | `taskid` | `taskId` | 任务ID |
| `actionid` | `actionid` | `actionId` | 行动ID |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程ID |
| `follow_method_doc` | `follow_method_doc` | `followMethodDoc` | 跟进方式 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `attachment_group_id` | `attachment_group_id` | `attachmentGroupId` | 附件分组 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `oCustomerIndustry_id` | `oCustomerIndustry_id` | `customerIndustry` | 行业 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `attachment_group_item_id` | `attachment_group_item_id` | `attachmentGroupItemId` | 附件分组项 |
| `final_user` | `final_user` | `finalUser` | 最终用户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `opptReport` | `opptReport` | `opptReport` | 商机报备 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `tender_sheet` | `tender_sheet` | `tenderSheet` | 投标单 |
| `sign_in_id` | `sign_in_id` | `signInId` | 签到id |
| `clue` | `clue` | `clue` | 线索ID |
| `customer` | `customer` | `customer` | 客户ID |
| `contact` | `contact` | `contact` | 联系人ID |
| `oppt` | `oppt` | `oppt` | 商机ID |
| `contract_draft` | `contract_draft` | `contractDraft` | 合同草案ID |
| `oppt_stage` | `oppt_stage` | `opptStage` | 关联阶段ID |
| `processStage` | `processStage` | `processStage` | 商机流程阶段ID |
| `motion` | `motion` | `motion` | 关联动作ID |
| `org` | `org` | `org` | 销售组织ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `dept` | `dept` | `dept` | 部门ID |
| `ower` | `ower` | `ower` | 负责人ID |
| `iCustID` | `iCustID` | `cust` | 伙伴ID |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴负责人ID |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否流程核心单据 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourcedocument` | `sourcedocument` | `sourceDocument` | 来源单据 |
| `followupmethod` | `followupmethod` | `followUpMethod` | 跟进方式 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_biz_email` | `source_biz_email` | `sourceBizEmail` | 是否来源邮件记录 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `from_bill_num_data_id` | `from_bill_num_data_id` | `fromBillNumDataId` | 来源单据ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `total_amount` | `total_amount` | `totalAmount` | 申请金额 |
| `total_settled_amount` | `total_settled_amount` | `totalSettledAmount` | 已结算金额 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `followtime` | `followtime` | `followTime` | 跟进日期 |
| `remind_date_time` | `remind_date_time` | `remindDateTime` | 提醒日期 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `followuptime` | `followuptime` | `followUpTime` | 下次跟进日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `followRecordDefineCharacter` | `followRecordDefineCharacter` | `followRecordDefineCharacter` | 跟进记录主表自定义项 |

### other (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `followNextContactList` | 下次联系人 |
| `` | `` | `authDimensionList` | 相关管理维度-跟进记录关联数据表 |
| `` | `` | `followContactList` | 跟进记录联系人 |
| `` | `` | `followMotionList` | 跟进记录关联动作 |
| `` | `` | `followRecordExpenseList` | 费用 |
| `` | `` | `followRecordParticipantList` | 跟进记录参与人 |
| `` | `` | `followRecordRemarkList` | 备注 |
| `` | `` | `followRecordSitePhotoList` | 现场图片 |
| `` | `` | `followRecordTaxInvoiceList` | 跟进记录税票 |
| `` | `` | `headDef` | 跟进记录主表自定义项 |
