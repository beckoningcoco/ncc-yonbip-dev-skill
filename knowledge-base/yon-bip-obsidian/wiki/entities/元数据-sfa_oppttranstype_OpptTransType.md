---
tags: [BIP, 元数据, 数据字典, sfa.oppttranstype.OpptTransType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商机类型设置 (`sfa.oppttranstype.OpptTransType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_oppttranstype` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`ee3e3ef1-3929-4a71-9ba8-397953f653fd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商机类型设置 |
| 物理表 | `sfa_oppttranstype` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 38 个 |
| 子表 | 3 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `opptTransTypeDeptList` | `sfa.oppttranstype.OpptTransTypeDept` | composition |
| `opptTransTypeRoleList` | `sfa.oppttranstype.OpptTransTypeRole` | composition |
| `opptTransTypeSaleOrgList` | `sfa.oppttranstype.OpptTransTypeSaleOrg` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `bustype` | `transtype.bd_billtyperef` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

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
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 38 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `bustype` | `bustype` | `bustype` | 商机交易类型ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_must_report` | `is_must_report` | `isMustReport` | 必须报备 |
| `is_lost_bill_approved` | `is_lost_bill_approved` | `isLostBillApproved` | 丢单需要审核 |
| `is_win_bill_approved` | `is_win_bill_approved` | `isWinBillApproved` | 赢单需要审核 |
| `win_bill_auto_closed` | `win_bill_auto_closed` | `winBillAutoClosed` | 赢单自动关闭 |
| `lost_bill_auto_closed` | `lost_bill_auto_closed` | `lostBillAutoClosed` | 丢单自动关闭 |
| `auto_win_bill_rule` | `auto_win_bill_rule` | `autoWinBillRule` | 自动赢单规则 |
| `add_oppt_select_stage` | `add_oppt_select_stage` | `addOpptSelectStage` | 新增商机可选阶段 |
| `is_close_bill_approved` | `is_close_bill_approved` | `isCloseBillApproved` | 关单需要审核 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `trigger_bill` | `trigger_bill` | `triggerBill` | 触发单据 |
| `trigger_point` | `trigger_point` | `triggerPoint` | 触发时点 |
| `potentialcust_win_process` | `potentialcust_win_process` | `potentialcustWinProcess` | 潜客的商机赢单处理 |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allow_sale_control` | `allow_sale_control` | `allowSaleControl` | 允限销控制 |
| `allow_sale_control_obj` | `allow_sale_control_obj` | `allowSaleControlObj` | 受控对象 |
| `auto_lost_bill_rule` | `auto_lost_bill_rule` | `autoLostBillRule` | 自动丢单规则 |
| `auto_lost_trigger_bill` | `auto_lost_trigger_bill` | `autoLostTriggerBill` | 自动丢单触发单据 |
| `auto_lost_trigger_point` | `auto_lost_trigger_point` | `autoLostTriggerPoint` | 自动丢单触发时点 |
| `is_activate_bill_approved` | `is_activate_bill_approved` | `isActivateBillApproved` | 激活需要审核 |
| `is_invalid_bill_approved` | `is_invalid_bill_approved` | `isInvalidBillApproved` | 作废需要审核 |
| `is_recover_bill_approved` | `is_recover_bill_approved` | `isRecoverBillApproved` | 恢复需要审核 |
| `is_stop_bill_approved` | `is_stop_bill_approved` | `isStopBillApproved` | 暂停需要审核 |
| `oppt_report_audit_auto_add_ower` | `oppt_report_audit_auto_add_ower` | `opptReportAuditAutoAddOwer` | 商机报备审核自动添加客户负责人 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `opptTransTypeDeptList` | 商机类型设置适用部门 |
| `` | `` | `opptTransTypeRoleList` | 商机类型设置适用角色 |
| `` | `` | `opptTransTypeSaleOrgList` | 商机类型设置适用销售组织 |
