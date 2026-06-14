---
tags: [BIP, 元数据, 数据字典, sfa.opptreport.OpptReport]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商机报备 (`sfa.opptreport.OpptReport`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_opptreport` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`2a5f18af-8e77-4f10-97e7-3ada70d90ac1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商机报备 |
| 物理表 | `sfa_opptreport` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 87 个 |
| 子表 | 4 个 |
| 关联引用 | 39 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `opptReportItemList` | `sfa.opptreport.OpptReportItem` | composition |
| `headDef` | `sfa.opptreport.OpptReportDef` | composition |
| `authDimensionList` | `sfa.opptreport.AuthBusiobjectDimensionOpptReport` | composition |
| `opptReportParticipantList` | `sfa.opptreport.OpptReportParticipant` | composition |

## 关联引用 (39个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `country` | `ucfbasedoc.bd_countryref` |
| `submitter` | `ucf-org-center.org_unit_manager_auth_ref` |
| `finance_org` | `ucf-org-center.bd_financeorgtreeref` |
| `industry` | `productcenter.aa_customertraderef` |
| `attachment_group_item_id` | `` |
| `final_user` | `yycrm.cust_customerref` |
| `follow_id` | `yycrm.act_followrecordref` |
| `nat_currency` | `ucfbasedoc.bd_currencytenantref` |
| `withdrawpp` | `ucf-org-center.org_unit_manager_auth_ref` |
| `relationoppt` | `yycrm.sfa_opptref` |
| `attachment_group_id` | `` |
| `clue_id` | `yycrm.sfa_clueref` |
| `contact` | `yycrm.cust_contactref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `oppt_trans_type` | `yycrm.sfa_oppttranstyperef` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `opptReportDefineCharacter` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `oppt_source` | `yycrm.crmc_custdocref` |
| `action_id` | `yycrm.act_actionref` |
| `judge_person` | `ucf-staff-center.bd_staff_ref` |
| `partner_dept` | `` |
| `iCustID` | `yycrm.cust_customerref` |
| `task_id` | `yycrm.act_taskref` |
| `customer_id` | `yycrm.cust_customerref` |

## 继承接口 (9个, 28字段)

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
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`

## 字段列表（按类型分组）

> 共 87 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `marketing_activities` | `marketing_activities` | `marketingActivities` | 营销活动 |
| `region` | `region` | `region` | 所在地区 |
| `rejectReason` | `rejectReason` | `rejectReason` | 驳回原因 |
| `status` | `status` | `status` | 状态 |
| `code` | `code` | `code` | 单据编号 |
| `name` | `name` | `name` | 商机报备名称 |
| `bid_content_link` | `bid_content_link` | `bidContentLink` | 招投标源链接 |
| `region_code` | `region_code` | `regionCode` | 省市区编码 |
| `address` | `address` | `address` | 详细地址 |
| `description` | `description` | `description` | 描述 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `picture_1` | `picture_1` | `picture1` | 照片1 |
| `largeText1` | `largeText1` | `largeText1` | 大字段1 |
| `largeText2` | `largeText2` | `largeText2` | 大字段2 |
| `largeText3` | `largeText3` | `largeText3` | 大字段3 |
| `largeText4` | `largeText4` | `largeText4` | 大字段4 |
| `largeText5` | `largeText5` | `largeText5` | 大字段5 |

### 引用字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attachment_group_id` | `attachment_group_id` | `attachmentGroupId` | 附件分组 |
| `attachment_group_item_id` | `attachment_group_item_id` | `attachmentGroupItemId` | 附件分组项 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `judge_person` | `judge_person` | `judgePerson` | 最终判定人 |
| `follow_id` | `follow_id` | `followId` | 跟进记录 |
| `contact` | `contact` | `contact` | 联系人 |
| `finance_org` | `finance_org` | `financeOrg` | 会计主体 |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `clue_id` | `clue_id` | `clue` | 来源线索ID |
| `task_id` | `task_id` | `taskId` | 任务ID |
| `customer_id` | `customer_id` | `customer` | 客户ID |
| `action_id` | `action_id` | `actionId` | 行动ID |
| `final_user` | `final_user` | `finalUser` | 最终用户ID |
| `oppt_trans_type` | `oppt_trans_type` | `opptTransType` | 商机交易类型ID |
| `oppt_source` | `oppt_source` | `opptSource` | 商机来源id |
| `industry` | `industry` | `industry` | 行业ID |
| `currency` | `currency` | `currency` | 币种ID |
| `relationoppt` | `relationoppt` | `relationOppt` | 关联商机 |
| `country` | `country` | `country` | 国家id |
| `ower` | `ower` | `ower` | 负责人ID |
| `dept` | `dept` | `dept` | 部门ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `org` | `org` | `org` | 销售组织ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴负责人ID |
| `iCustID` | `iCustID` | `cust` | 伙伴ID |
| `bustype` | `bustype` | `bustype` | 商机报备类型 |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customer_partner_relation` | `customer_partner_relation` | `customerPartnerRelation` | 客户伙伴关系 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_category` | `business_category` | `businessCategory` | 业务类别 |
| `judge_status` | `judge_status` | `judgeStatus` | 判定状态 |
| `opptreporttrans_gain_type` | `opptreporttrans_gain_type` | `opptReportTransGainType` | 商机报备类型取值方式 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate` | `exch_rate` | `exchRate` | 汇率 |
| `nat_currency_expect_sign_money` | `nat_currency_expect_sign_money` | `natCurrencyExpectSignMoney` | 本币预计签单金额 |
| `winning_rate` | `winning_rate` | `winningRate` | 赢单率% |
| `expect_sign_num` | `expect_sign_num` | `expectSignNum` | 预计签单数量 |
| `expect_sign_money` | `expect_sign_money` | `expectSignMoney` | 预计签单金额 |
| `expect_fee` | `expect_fee` | `expectFee` | 预计费用 |
| `` | `longitude` | `longitude` | 经度 |
| `` | `latitude` | `latitude` | 纬度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `opptReportDefineCharacter` | `opptReportDefineCharacter` | `opptReportDefineCharacter` | 商机报备主表自定义项特征属性组 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `` | `` | `authDimensionList` | 相关管理维度-商机报备关联数据表 |
| `` | `` | `headDef` | 商机报备主表自定义项扩展 |
| `` | `` | `opptReportItemList` | 商机报备子表 |
| `` | `` | `opptReportParticipantList` | 商机报备参与人 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `judge_time` | `judge_time` | `judgeTime` | 最终判定时间 |
| `oppt_date` | `oppt_date` | `opptDate` | 商机日期 |
| `expect_sign_date` | `expect_sign_date` | `expectSignDate` | 预计签单日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
