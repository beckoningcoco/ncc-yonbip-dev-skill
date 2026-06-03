---
tags: [BIP, 元数据, 数据字典, dsfa.taskplan.TaskPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务计划 (`dsfa.taskplan.TaskPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`dsfa_taskplan` | domain：`yycrm` | 应用：`DSFA` | 业务对象ID：`ed1ea752-6ad7-4204-a8e4-2fe18b9d8d35`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务计划 |
| 物理表 | `dsfa_taskplan` |
| 数据库 schema | `yycrm` |
| 所属应用 | `DSFA` |
| 直连字段 | 57 个 |
| 子表 | 9 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `taskPlanExecutorList` | `dsfa.taskplan.TaskPlanExecutor` | composition |
| `taskPlanRouteList` | `dsfa.taskplan.TaskPlanRoute` | composition |
| `taskPlanFreeDef` | `dsfa.taskplan.TaskPlanFreeDef` | composition |
| `planCustomerAppList` | `dsfa.taskplan.TaskPlanCustomerApp` | composition |
| `planTerminalList` | `dsfa.taskplan.TaskPlanTerminal` | composition |
| `planCustomerList` | `dsfa.taskplan.TaskPlanCustomer` | composition |
| `planTerminalAppList` | `dsfa.taskplan.TaskPlanTerminalApp` | composition |
| `taskPlanItemList` | `dsfa.taskplan.TaskPlanItem` | composition |
| `taskPlanRemindRuleList` | `dsfa.taskplan.TaskPlanRemindRule` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `excute_dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `originator_id` | `ucf-staff-center.bd_staff_ref` |
| `taskplanDefineCharacter` | `` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `terminal` | `yycrm.dsfa_storeterminal` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `partner_person` | `yycrm.cust_customerref` |
| `task_trans_type` | `yycrm.act_tasktranstyperef` |
| `partner_dept` | `yycrm.prm_partnerdepartmentref` |
| `iCustID` | `` |
| `customer_id` | `yycrm.cust_customerref` |

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
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
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

## 字段列表（按类型分组）

> 共 57 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `excutors` | `excutors` | `excutors` | 执行人 |
| `code` | `code` | `code` | 计划编码 |
| `summary` | `summary` | `summary` | 计划摘要 |
| `content` | `content` | `content` | 计划内容 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `create_week` | `create_week` | `createWeek` | 拜访日期 |
| `create_month` | `create_month` | `createMonth` | 拜访日期 |
| `bustype_extend` | `bustype_extend` | `bustypeExtend` | 计划类型扩展字段 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `task_trans_type` | `task_trans_type` | `taskTransType` | 任务类型id |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `terminal` | `terminal` | `terminal` | 终端 |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `org` | `org` | `org` | 销售组织id |
| `salearea` | `salearea` | `saleArea` | 区域id |
| `dept` | `dept` | `dept` | 部门id |
| `excute_dept` | `excute_dept` | `excuteDept` | 执行部门id |
| `ower` | `ower` | `ower` | 发起人2 |
| `iCustID` | `iCustID` | `cust` | 伙伴ID |
| `originator_id` | `originator_id` | `originator` | 发起人ID |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员ID |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `is_circle_task` | `is_circle_task` | `circleTask` | 周期任务 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_object` | `business_object` | `businessObject` | 拜访对象 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `route_count` | `route_count` | `routeCount` | 拜访路线数 |
| `create_frequency` | `create_frequency` | `createFrequency` | 周期频率 |
| `terminal_count` | `terminal_count` | `terminalCount` | 拜访终端数 |
| `customer_count` | `customer_count` | `customerCount` | 拜访客户数 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taskplanDefineCharacter` | `taskplanDefineCharacter` | `taskPlanDefineCharacter` | 拜访计划特征组 |

### other (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `planCustomerAppList` | 计划客户App |
| `` | `` | `planCustomerList` | 计划客户 |
| `` | `` | `planTerminalAppList` | 计划终端App |
| `` | `` | `planTerminalList` | 计划终端 |
| `` | `` | `taskPlanExecutorList` | 任务计划执行人 |
| `` | `` | `taskPlanFreeDef` | 任务主表自定义项 |
| `` | `` | `taskPlanItemList` | 任务计划明细 |
| `` | `` | `taskPlanRemindRuleList` | 提醒规则 |
| `` | `` | `taskPlanRouteList` | 任务计划路线 |
