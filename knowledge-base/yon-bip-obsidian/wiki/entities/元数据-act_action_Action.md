---
tags: [BIP, 元数据, 数据字典, act.action.Action]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行动 (`act.action.Action`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_action` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`6818e0f6-2151-4ecc-95d1-d42235cab8df`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行动 |
| 物理表 | `act_action` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `ACT` |
| 直连字段 | 48 个 |
| 子表 | 3 个 |
| 关联引用 | 32 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `actionActivityList` | `act.action.ActionActivity` | composition |
| `actionItemList` | `act.action.ActionItem` | composition |
| `headDef` | `act.action.ActionDef` | composition |

## 关联引用 (32个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `activity` | `yycrm.mka_activityref` |
| `industry` | `` |
| `sign_out_id` | `` |
| `source_action` | `` |
| `oppt` | `yycrm.sfa_opptref` |
| `clue` | `yycrm.sfa_clueref` |
| `contact` | `yycrm.cust_contactref` |
| `contract_draft` | `yycrm.sfa_contractdraftref` |
| `visit_execute_rule_id` | `` |
| `tenant_id` | `` |
| `assist_task` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `actionDefineCharacter` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `reform_action` | `` |
| `terminal` | `yxybase.aa_storeterminal` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `actiontypesetting` | `` |
| `bustype` | `` |
| `partner_person` | `` |
| `sign_in_id` | `` |
| `partner_dept` | `` |
| `iCustID` | `` |
| `task_id` | `yycrm.act_taskref` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (5个, 15字段)

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
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 48 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `code` | `code` | `code` | 行动编号 |
| `finished_condition` | `finished_condition` | `finishedcondition` | 完成状态 |

### 引用字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `industry` | `industry` | `industry` | 行业 |
| `sign_out_id` | `sign_out_id` | `signOutId` | 签退id |
| `visit_execute_rule_id` | `visit_execute_rule_id` | `visitExecuteRuleId` | 拜访执行规则id |
| `assist_task` | `assist_task` | `assistTask` | 协访任务 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `sign_in_id` | `sign_in_id` | `signInId` | 签到id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `iCustID` | `iCustID` | `cust` | 客户 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员 |
| `reform_action` | `reform_action` | `reformAction` | 整改行动id |
| `source_action` | `source_action` | `sourceAction` | 整改来源行动id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `actiontypesetting` | `actiontypesetting` | `actiontypesetting` | 行动类型ID |
| `task_id` | `task_id` | `taskId` | 任务ID |
| `clue` | `clue` | `clue` | 线索ID |
| `customer` | `customer` | `customer` | 客户ID |
| `contact` | `contact` | `contact` | 联系人ID |
| `oppt` | `oppt` | `oppt` | 商机ID |
| `terminal` | `terminal` | `terminal` | 终端ID |
| `activity` | `activity` | `activity` | 活动ID |
| `contract_draft` | `contract_draft` | `contractDraft` | 合同草案ID |
| `org` | `org` | `org` | 销售组织ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `dept` | `dept` | `dept` | 部门ID |
| `ower` | `ower` | `ower` | 负责人ID |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partner_execute` | `partner_execute` | `partnerExecute` | 伙伴执行 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `businessrootobject` | `businessrootobject` | `businessRootObject` | 业务来源对象 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_duration` | `sign_duration` | `signDuration` | 停留时长 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_in_distance` | `sign_in_distance` | `signInDistance` | 签到距离 |
| `sign_out_distance` | `sign_out_distance` | `signOutDistance` | 签退距离 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actionDefineCharacter` | `actionDefineCharacter` | `actionDefineCharacter` | 行动自定义项特征属性组 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `actiontime` | `actiontime` | `actionTime` | 行动日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `actionActivityList` | 行动活动 |
| `` | `` | `actionItemList` | 行动事项 |
| `` | `` | `headDef` | 行动主表自定义项 |
