---
tags: [BIP, 元数据, 数据字典, mka.summary.Summary]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动小结 (`mka.summary.Summary`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_summary` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：`515ce500-b09c-460d-b3bc-1b5b227a951f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 活动小结 |
| 物理表 | `mka_summary` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 86 个 |
| 子表 | 6 个 |
| 关联引用 | 33 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `photoReviewList` | `mka.summary.PhotoReview` | composition |
| `summaryMaterialList` | `mka.summary.SummaryMaterial` | composition |
| `headDef` | `mka.summary.SummaryDef` | composition |
| `actualCostList` | `mka.summary.ActualCost` | composition |
| `summaryParticipantList` | `mka.summary.SummaryParticipant` | composition |
| `summaryDisplay` | `mka.summary.SummaryDisplay` | composition |

## 关联引用 (33个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `activity` | `yycrm.mka_activityref` |
| `bizFlowId` | `` |
| `reform_summary` | `yycrm.mka_summaryref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `plan` | `yycrm.mka_marketingplanref` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `display` | `yycrm.mka_displayref` |
| `src_summary` | `yycrm.mka_summaryref` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `reform_action` | `yycrm.act_actionref` |
| `review_person` | `ucf-staff-center.bd_staff_ref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `reform_creator` | `ucf-staff-center.bd_staff_ref` |
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `action_id` | `yycrm.act_actionref` |
| `summaryDefineCharacter` | `` |
| `partner_dept` | `yycrm.prm_partnerdepartmentref` |
| `iCustID` | `yycrm.cust_customerref` |
| `task_id` | `yycrm.act_taskref` |
| `review_scorer` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (8个, 24字段)

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
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 86 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `review_score_desc` | `review_score_desc` | `reviewScoreDesc` | 评分说明 |
| `summaryContent` | `summaryContent` | `summaryContent` | 总结 |
| `review_person_name` | `review_person_name` | `reviewPersonName` | 审核人名称 |
| `rectify_method` | `rectify_method` | `rectifyMethod` | 整改方式 |
| `reform_action_code` | `reform_action_code` | `reformActionCode` | 整改临时行动编码 |
| `reform_desc` | `reform_desc` | `reformDesc` | 整改说明 |
| `code` | `code` | `code` | 小结单号 |
| `unqualified_reason` | `unqualified_reason` | `unqualifiedReason` | 照片不合格原因 |
| `` | `creator` | `creator` | 制单人 |
| `unqualified_description` | `unqualified_description` | `unqualifiedDescription` | 检核结果说明 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `picture_1` | `picture_1` | `picture1` | 照片1 |
| `photo_result` | `photo_result` | `photoResult` | 照片审核结果 |
| `picture_2` | `picture_2` | `picture2` | 照片2 |
| `picture_3` | `picture_3` | `picture3` | 照片3 |
| `display_picture` | `display_picture` | `displayPicture` | 陈列照片 |
| `picture_4` | `picture_4` | `picture4` | 照片4 |
| `picture_5` | `picture_5` | `picture5` | 照片5 |
| `picture_6` | `picture_6` | `picture6` | 照片6 |
| `picture_7` | `picture_7` | `picture7` | 照片7 |
| `picture_8` | `picture_8` | `picture8` | 照片8 |
| `picture_9` | `picture_9` | `picture9` | 照片9 |
| `picture_10` | `picture_10` | `picture10` | 照片10 |

### 引用字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程ID |
| `currency` | `currency` | `currency` | 币种 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员 |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `reform_action` | `reform_action` | `reformAction` | 整改临时行动id |
| `reform_creator` | `reform_creator` | `reformCreator` | 整改发起人 |
| `reform_summary` | `reform_summary` | `reformSummary` | 整改结果 |
| `src_summary` | `src_summary` | `srcSummary` | 来源小结 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `iCustID` | `iCustID` | `cust` | 客户ID |
| `` | `modifierId` | `modifierId` | 修改人 |
| `plan` | `plan` | `plan` | 营销方案 |
| `review_person` | `review_person` | `reviewPerson` | 审核人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `org` | `org` | `org` | 销售组织ID |
| `bustype` | `bustype` | `bustype` | 交易类型ID |
| `activity` | `activity` | `activity` | 营销活动Id |
| `task_id` | `task_id` | `taskId` | 任务id |
| `action_id` | `action_id` | `actionId` | 行动id |
| `ower` | `ower` | `ower` | 负责人ID |
| `dept` | `dept` | `dept` | 部门ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `display` | `display` | `display` | 陈列规格ID |
| `review_scorer` | `review_scorer` | `reviewScorer` | 评分人id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否流程核心单据 |
| `bBringPhoto` | `bBringPhoto` | `bBringPhoto` | 整改带入照片 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `review_status` | `review_status` | `reviewStatus` | 检核状态 |
| `review_reuslt` | `review_reuslt` | `reviewReuslt` | 照片最终检核结果 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reality_num` | `reality_num` | `realityNum` | 实际人数 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isCloseStatus` | `isCloseStatus` | `isCloseStatus` | 关闭状态 |
| `reform_status` | `reform_status` | `reformStatus` | 整改状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `terminalReality` | `terminalReality` | `terminalReality` | 终端真实 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settled_amount_total` | `settled_amount_total` | `settledAmountTotal` | 已结算金额 |
| `assume_amount_total` | `assume_amount_total` | `assumeAmountTotal` | 承担金额 |
| `review_score` | `review_score` | `reviewScore` | 检核评分 |
| `actualCost` | `actualCost` | `actualCost` | 实际费用 |
| `actualSale` | `actualSale` | `actualSale` | 实际销量 |
| `actualRate` | `actualRate` | `actualRate` | 实际费率 |

### timestamp (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_date` | `check_date` | `checkDate` | 最近检核日期 |
| `reform_date` | `reform_date` | `reformDate` | 整改日期 |
| `review_time` | `review_time` | `reviewTime` | 审核时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 制单时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `review_score_time` | `review_score_time` | `reviewScoreTime` | 评分时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `summaryDefineCharacter` | `summaryDefineCharacter` | `summaryDefineCharacter` | 活动小结自定义项特征属性组 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `actualCostList` | 活动小结活动费用 |
| `` | `` | `headDef` | 活动小结主表自定义项 |
| `` | `` | `photoReviewList` | 活动照片审核 |
| `` | `` | `summaryDisplay` | 活动小结活动陈列 |
| `` | `` | `summaryMaterialList` | 活动小结活动物料 |
| `` | `` | `summaryParticipantList` | 小结参与人 |
