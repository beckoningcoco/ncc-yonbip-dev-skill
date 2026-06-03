---
tags: [BIP, 元数据, 数据字典, dsfa.visitsummary.VisitSummary]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访小结 (`dsfa.visitsummary.VisitSummary`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`dsfa_visitsummary` | domain：`yycrm` | 应用：`DSFA` | 业务对象ID：`e52fa0bd-abc5-459d-99ef-2dc1ab763548`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访小结 |
| 物理表 | `dsfa_visitsummary` |
| 数据库 schema | `yycrm` |
| 所属应用 | `DSFA` |
| 直连字段 | 72 个 |
| 子表 | 3 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `visitSummaryDisplay` | `dsfa.visitsummary.VisitSummaryDisplay` | composition |
| `headDef` | `dsfa.visitsummary.VisitSummaryDef` | composition |
| `visitPhotoReviewList` | `dsfa.visitsummary.VisitPhotoReview` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `next_task_transtype` | `yycrm.act_tasktranstyperef` |
| `reform_summary` | `yycrm.dsfa_visitsummaryref` |
| `visitsummaryDefineCharacter` | `` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `src_summary` | `yycrm.dsfa_visitsummaryref` |
| `salearea` | `productcenter.aa_salearearef` |
| `reform_action` | `yycrm.act_actionref` |
| `terminal` | `yycrm.dsfa_storeterminal` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `reform_creator` | `ucf-staff-center.bd_staff_ref` |
| `partner_person` | `ucf-staff-center.bd_staff_ref` |
| `action_id` | `yycrm.act_actionref` |
| `partner_dept` | `yycrm.prm_partnerdepartmentref` |
| `recent_reviewer` | `ucf-staff-center.bd_staff_ref` |
| `iCustID` | `yycrm.cust_customerref` |
| `task_id` | `yycrm.act_taskref` |
| `customer` | `yycrm.cust_customerref` |
| `review_scorer` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (7个, 22字段)

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

> 共 72 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `review_score_desc` | `review_score_desc` | `reviewScoreDesc` | 评分说明 |
| `reform_desc` | `reform_desc` | `reformDesc` | 整改说明 |
| `rectify_method` | `rectify_method` | `rectifyMethod` | 整改方式 |
| `reform_action_code` | `reform_action_code` | `reformActionCode` | 整改临时行动编码 |
| `code` | `code` | `code` | 小结单号 |
| `summary` | `summary` | `summary` | 拜访总结 |
| `` | `auditor` | `auditor` | 审批人 |
| `unqualified_reason` | `unqualified_reason` | `unqualifiedReason` | 不合格原因 |
| `unqualified_description` | `unqualified_description` | `unqualifiedDescription` | 检核结果说明 |
| `reform_summary_code` | `reform_summary_code` | `reformSummaryCode` | 整改小结单号 |
| `src_summary_code` | `src_summary_code` | `srcSummaryCode` | 来源小结单号 |
| `` | `creator` | `creator` | 制单人 |
| `` | `modifier` | `modifier` | 修改人 |
| `display_picture` | `display_picture` | `displayPicture` | 陈列照片 |
| `picture_1` | `picture_1` | `picture1` | 照片1 |
| `picture_2` | `picture_2` | `picture2` | 照片2 |
| `picture_3` | `picture_3` | `picture3` | 照片3 |
| `picture_4` | `picture_4` | `picture4` | 照片4 |
| `picture_5` | `picture_5` | `picture5` | 照片5 |
| `picture_6` | `picture_6` | `picture6` | 照片6 |
| `picture_7` | `picture_7` | `picture7` | 照片7 |
| `picture_8` | `picture_8` | `picture8` | 照片8 |
| `picture_9` | `picture_9` | `picture9` | 照片9 |
| `picture_10` | `picture_10` | `picture10` | 照片10 |
| `photo_result` | `photo_result` | `photoResult` | 照片审核结果 |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reform_creator` | `reform_creator` | `reformCreator` | 整改发起人 |
| `next_task_transtype` | `next_task_transtype` | `nextTaskTransType` | 下次拜访任务类型 |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |
| `review_scorer` | `review_scorer` | `reviewScorer` | 评分人 |
| `iCustID` | `iCustID` | `cust` | 伙伴 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员 |
| `customer` | `customer` | `customer` | 客户 |
| `terminal` | `terminal` | `terminal` | 终端 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `reform_action` | `reform_action` | `reformAction` | 整改临时行动id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `org` | `org` | `org` | 销售组织ID |
| `bustype` | `bustype` | `bustype` | 交易类型ID |
| `task_id` | `task_id` | `taskId` | 任务 |
| `action_id` | `action_id` | `actionId` | 行动 |
| `ower` | `ower` | `ower` | 执行人ID |
| `dept` | `dept` | `dept` | 部门ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `recent_reviewer` | `recent_reviewer` | `recentReviewer` | 最近检核人 |
| `reform_summary` | `reform_summary` | `reformSummary` | 整改小结id |
| `src_summary` | `src_summary` | `srcSummary` | 来源小结id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `next_task_date` | `next_task_date` | `nextTaskDate` | 下次拜访日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bBringPhoto` | `bBringPhoto` | `bringPhoto` | 整改带入照片 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `review_reuslt` | `review_reuslt` | `reviewReuslt` | 检核状态 |
| `reform_status` | `reform_status` | `reformStatus` | 整改状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `review_score` | `review_score` | `reviewScore` | 检核评分 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reform_date` | `reform_date` | `reformDate` | 整改日期 |
| `check_date` | `check_date` | `checkDate` | 最近检核日期 |
| `review_score_time` | `review_score_time` | `reviewScoreTime` | 评分时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 制单时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `visitsummaryDefineCharacter` | `visitsummaryDefineCharacter` | `visitsummaryDefineCharacter` | 自定义项特征属性组 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `headDef` | 拜访小结主表自定义项 |
| `` | `` | `visitPhotoReviewList` | 小结照片审核 |
| `` | `` | `visitSummaryDisplay` | 拜访小结陈列规格子表 |
