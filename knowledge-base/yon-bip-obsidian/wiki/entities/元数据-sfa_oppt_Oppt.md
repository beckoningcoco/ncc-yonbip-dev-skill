---
tags: [BIP, 元数据, 数据字典, sfa.oppt.Oppt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商机 (`sfa.oppt.Oppt`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_oppt` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`9942237f-2389-45d5-a153-1737738767ab`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商机 |
| 物理表 | `sfa_oppt` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 143 个 |
| 子表 | 5 个 |
| 关联引用 | 63 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headDef` | `sfa.oppt.OpptDef` | composition |
| `authDimensionList` | `sfa.oppt.AuthBusiobjectDimensionOppt` | composition |
| `opptItemList` | `sfa.oppt.OpptItem` | composition |
| `opptStageProgressList` | `sfa.oppt.OpptStageProgress` | composition |
| `opptParticipantList` | `sfa.oppt.OpptParticipant` | composition |

## 关联引用 (63个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `yycrm.sfa_opptref` |
| `country` | `ucfbasedoc.bd_countryref` |
| `finance_org` | `ucf-org-center.bd_financeorgtreeref` |
| `win_order_reason_state` | `yycrm.crmc_custdocref` |
| `receive_return_apply_person` | `ucf-staff-center.bd_staff_ref` |
| `` | `bip-usercenter.aa_user` |
| `nat_currency` | `ucfbasedoc.bd_currencytenantref` |
| `attachment_group_id` | `` |
| `clue_id` | `yycrm.sfa_clueref` |
| `contact` | `yycrm.cust_contactref` |
| `last_receiver` | `ucf-staff-center.bd_staff_ref` |
| `close_reason` | `yycrm.crmc_custdocref` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `settle_customer` | `yycrm.cust_customerref` |
| `salearea` | `productcenter.aa_salearearef` |
| `opptDefineCharacter` | `` |
| `lose_order_object` | `yycrm.sfa_competeopponentref` |
| `report_person` | `` |
| `tender_sheet_detail` | `` |
| `tender_review_detail` | `` |
| `close_person` | `ucf-staff-center.bd_staff_ref` |
| `oppt_source` | `yycrm.crmc_custdocref` |
| `transType` | `transtype.bd_billtyperef` |
| `validity_id` | `` |
| `action_id` | `yycrm.act_actionref` |
| `partner_dept` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `invalid_reason` | `yycrm.crmc_custdocref` |
| `last_allocate_operator` | `bip-usercenter.aa_user` |
| `source_high_seas` | `yycrm.sfa_oppthighseasref` |
| `last_ower` | `ucf-staff-center.bd_staff_ref` |
| `high_seas` | `yycrm.sfa_oppthighseasref` |
| `industry` | `productcenter.aa_customertraderef` |
| `attachment_group_item_id` | `` |
| `final_user` | `yycrm.cust_customerref` |
| `opptreport_id` | `yycrm.sfa_opptreportref` |
| `follow_id` | `yycrm.act_followrecordref` |
| `tender_review` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `oppt_trans_type` | `yycrm.sfa_oppttranstyperef` |
| `process_id` | `yycrm.sfa_processref` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `suspend_reason` | `yycrm.crmc_custdocref` |
| `process_stage` | `yycrm.sfa_processstageref` |
| `lose_order_reason_state` | `yycrm.crmc_custdocref` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `invalid_person` | `ucf-staff-center.bd_staff_ref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `tender_sheet` | `yycrm.sfa_tendersheetref` |
| `judge_person` | `` |
| `oppt_stage` | `yycrm.sfa_stageref` |
| `iCustID` | `yycrm.cust_customerref` |
| `task_id` | `yycrm.act_taskref` |
| `customer_id` | `yycrm.cust_customerref` |

## 继承接口 (7个, 22字段)

- **位置信息** (`base.itf.IPosition`)
  - `` → ``
  - `` → ``
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 143 个直连字段

### 文本字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_project_id` | `advance_project_id` | `advanceProjectId` | 提前立项id |
| `marketing_activities` | `marketing_activities` | `marketingActivities` | 营销活动 |
| `region` | `region` | `region` | 所在地区 |
| `code` | `code` | `code` | 商机编号 |
| `opptgroup_id` | `opptgroup_id` | `opptgroupId` | 商机群id |
| `operation_status` | `operation_status` | `operationStatus` | 商机业务操作状态 |
| `stop_no` | `stop_no` | `stopNo` | 暂停版本号 |
| `recover_no` | `recover_no` | `recoverNo` | 恢复版本号 |
| `stage_change_no` | `stage_change_no` | `stageChangeNo` | 阶段变更版本号 |
| `version_no` | `version_no` | `versionNo` | 变更版本号 |
| `name` | `name` | `name` | 商机名称 |
| `stage_duration` | `stage_duration` | `stageDuration` | 当前阶段时长 |
| `curr_total_duration` | `curr_total_duration` | `currTotalDuration` | 商机总时长 |
| `non_follow_Up_duration` | `non_follow_Up_duration` | `nonFollowUpDuration` | 未跟进时长 |
| `bid_content_link` | `bid_content_link` | `bidContentLink` | 招投标源链接 |
| `region_code` | `region_code` | `regionCode` | 省市区编码 |
| `address` | `address` | `address` | 详细地址 |
| `description` | `description` | `description` | 描述 |
| `project_number` | `project_number` | `projectNumber` | 项目编号 |
| `win_order_remark` | `win_order_remark` | `winOrderRemark` | 赢单备注 |
| `lose_order_remark` | `lose_order_remark` | `loseOrderRemark` | 丢单备注 |
| `suspend_remark` | `suspend_remark` | `suspendRemark` | 暂停备注 |
| `invalid_remark` | `invalid_remark` | `invalidRemark` | 作废备注 |
| `close_remark` | `close_remark` | `closeRemark` | 关闭备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `picture_1` | `picture_1` | `picture1` | 照片1 |
| `path` | `path` | `path` | 路径 |
| `largeText1` | `largeText1` | `largeText1` | 大字段1 |
| `largeText2` | `largeText2` | `largeText2` | 大字段2 |
| `largeText3` | `largeText3` | `largeText3` | 大字段3 |
| `largeText4` | `largeText4` | `largeText4` | 大字段4 |
| `largeText5` | `largeText5` | `largeText5` | 大字段5 |

### 引用字段 (57个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachment_group_id` | `attachment_group_id` | `attachmentGroupId` | 附件分组 |
| `attachment_group_item_id` | `attachment_group_item_id` | `attachmentGroupItemId` | 附件分组项 |
| `clue_id` | `clue_id` | `clue` | 线索 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `judge_person` | `judge_person` | `judgePerson` | 最终判定人 |
| `report_person` | `report_person` | `reportPerson` | 报备人 |
| `validity_id` | `validity_id` | `validityId` | 有效期设置 |
| `last_ower` | `last_ower` | `lastOwer` | 最近负责人 |
| `last_receiver` | `last_receiver` | `lastReceiver` | 最近领取人 |
| `last_allocate_operator` | `last_allocate_operator` | `lastAllocateOperator` | 最近分配操作人 |
| `contact` | `contact` | `contact` | 联系人 |
| `tender_sheet_detail` | `tender_sheet_detail` | `tenderSheetDetail` | 投标单明细 |
| `finance_org` | `finance_org` | `financeOrg` | 会计主体 |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `high_seas` | `high_seas` | `highSeas` | 所属公海 |
| `source_high_seas` | `source_high_seas` | `sourceHighSeas` | 来源公海 |
| `receive_return_apply_person` | `receive_return_apply_person` | `receiveReturnApplyPerson` | 申领退回申请人 |
| `opptreport_id` | `opptreport_id` | `opptreportId` | 来源报备单 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `customer_id` | `customer_id` | `customer` | 客户ID |
| `final_user` | `final_user` | `finalUser` | 最终用户ID |
| `settle_customer` | `settle_customer` | `settleCustomer` | 开票客户ID |
| `oppt_trans_type` | `oppt_trans_type` | `opptTransType` | 商机交易类型ID |
| `oppt_stage` | `oppt_stage` | `opptStage` | 商机阶段ID |
| `transType` | `transType` | `transType` | 商机平台交易类型ID |
| `process_stage` | `process_stage` | `processStage` | 商机流程阶段ID |
| `oppt_source` | `oppt_source` | `opptSource` | 商机来源id |
| `industry` | `industry` | `industry` | 行业ID |
| `parent_id` | `parent_id` | `parent` | 主商机 |
| `currency` | `currency` | `currency` | 币种ID |
| `country` | `country` | `country` | 国家id |
| `ower` | `ower` | `ower` | 负责人 |
| `dept` | `dept` | `dept` | 部门ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `org` | `org` | `org` | 销售组织ID |
| `win_order_reason_state` | `win_order_reason_state` | `winOrderReason` | 赢单原因id |
| `lose_order_object` | `lose_order_object` | `loseOrderObject` | 丢单对象ID |
| `lose_order_reason_state` | `lose_order_reason_state` | `loseOrderReason` | 丢单原因id |
| `project_id` | `project_id` | `projectId` | 项目立项主键 |
| `suspend_reason` | `suspend_reason` | `suspendReason` | 暂停原因id |
| `invalid_reason` | `invalid_reason` | `invalidReason` | 作废原因id |
| `process_id` | `process_id` | `process` | 流程id |
| `task_id` | `task_id` | `taskId` | 任务ID |
| `action_id` | `action_id` | `actionId` | 行动ID |
| `tender_sheet` | `tender_sheet` | `tenderSheet` | 投标单ID |
| `invalid_person` | `invalid_person` | `invalidPerson` | 作废人ID |
| `close_reason` | `close_reason` | `closeReason` | 关闭原因id |
| `close_person` | `close_person` | `closePerson` | 关闭人ID |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `follow_id` | `follow_id` | `followId` | 跟进记录ID |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴负责人ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `iCustID` | `iCustID` | `cust` | 伙伴ID |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |
| `tender_review` | `tender_review` | `tenderReview` | 投标复盘 |
| `tender_review_detail` | `tender_review_detail` | `tenderReviewDetail` | 投标复盘明细 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `oppt_state` | `oppt_state` | `opptState` | 商机状态 |
| `win_lose_order_state` | `win_lose_order_state` | `winLoseOrderState` | 赢丢单状态 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `return_high_seas_count` | `return_high_seas_count` | `returnHighSeasCount` | 退回公海次数 |
| `retake_high_seas_count` | `retake_high_seas_count` | `retakeHighSeasCount` | 收回公海次数 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `judge_status` | `judge_status` | `judgeStatus` | 判定状态 |
| `receive_return_apply_status` | `receive_return_apply_status` | `receiveReturnApplyStatus` | 申领退回申请状态 1-申领中|2-退回中 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate` | `exch_rate` | `exchRate` | 汇率 |
| `nat_currency_expect_sign_money` | `nat_currency_expect_sign_money` | `natCurrencyExpectSignMoney` | 本币预计签单金额 |
| `winning_rate` | `winning_rate` | `winningRate` | 赢单率% |
| `expect_sign_num` | `expect_sign_num` | `expectSignNum` | 预计签单数量 |
| `expect_sign_money` | `expect_sign_money` | `expectSignMoney` | 预计签单金额 |
| `expect_fee` | `expect_fee` | `expectFee` | 预计费用 |
| `actual_fee` | `actual_fee` | `actualFee` | 实际费用 |
| `` | `longitude` | `longitude` | 经度 |
| `` | `latitude` | `latitude` | 纬度 |
| `win_order_money` | `win_order_money` | `winOrderMoney` | 赢单金额 |
| `lose_order_money` | `lose_order_money` | `loseOrderMoney` | 丢单金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `opptDefineCharacter` | `opptDefineCharacter` | `opptDefineCharacter` | 商机主表自定义项特征属性组 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `` | `` | `authDimensionList` | 相关管理维度-商机关联数据表 |
| `` | `` | `headDef` | 商机主表自定义项扩展 |
| `` | `` | `opptItemList` | 商机子表 |
| `` | `` | `opptParticipantList` | 商机参与人 |
| `` | `` | `opptStageProgressList` | 商机阶段进度 |

### timestamp (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `judge_time` | `judge_time` | `judgeTime` | 最终判定时间 |
| `validity_start_date` | `validity_start_date` | `validityStartDate` | 有效期起始日 |
| `validity_end_date` | `validity_end_date` | `validityEndDate` | 有效期结束日 |
| `report_time` | `report_time` | `reportTime` | 报备时间 |
| `last_receive_time` | `last_receive_time` | `lastReceiveTime` | 最近领取时间 |
| `last_allocate_time` | `last_allocate_time` | `lastAllocateTime` | 最近分配时间 |
| `first_enter_high_seas_time` | `first_enter_high_seas_time` | `firstEnterHighSeasTime` | 首次进公海时间 |
| `last_enter_high_seas_time` | `last_enter_high_seas_time` | `lastEnterHighSeasTime` | 最后进公海时间 |
| `receive_return_apply_time` | `receive_return_apply_time` | `receiveReturnApplyTime` | 申领退回时间 |
| `oppt_date` | `oppt_date` | `opptDate` | 商机日期 |
| `stage_start_time` | `stage_start_time` | `stageStartTime` | 当前阶段开始时间 |
| `first_stage_start_time` | `first_stage_start_time` | `firstStageStartTime` | 第一个阶段的开始时间 |
| `Rece_Follow_Up_Time` | `Rece_Follow_Up_Time` | `receFollowUpTime` | 最近跟进时间 |
| `expect_sign_date` | `expect_sign_date` | `expectSignDate` | 预计签单日期 |
| `expect_tender_date` | `expect_tender_date` | `expectTenderDate` | 预计投标日期 |
| `win_order_date` | `win_order_date` | `winOrderDate` | 赢单日期 |
| `lose_order_date` | `lose_order_date` | `loseOrderDate` | 丢单日期 |
| `suspend_Time` | `suspend_Time` | `suspendTime` | 暂停时间 |
| `invalid_Time` | `invalid_Time` | `invalidTime` | 作废时间 |
| `close_Time` | `close_Time` | `closeTime` | 关闭时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
