---
tags: [BIP, 元数据, 数据字典, EFA.allocate.FaAllocateRequest]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产调拨申请 (`EFA.allocate.FaAllocateRequest`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_allocate_request` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`55a96603-bf16-4e61-99a9-c0f92810a8c2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产调拨申请 |
| 物理表 | `fa_bill_allocate_request` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaAllocateRequestDetailList` | `EFA.allocate.FaAllocateRequestDetail` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `request_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `in_accentity_id` | `finbd.bd_allaccbodyref` |
| `applicant` | `ucf-staff-center.bd_staff_all_ref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `out_accentity_id` | `finbd.bd_allaccbodyref` |
| `` | `` |

## 继承接口 (5个, 12字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remarks` | `remarks` | `remarks` | 备注 |
| `bill_date` | `bill_date` | `vouchdate` | 单据日期 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicant` | `applicant` | `applicant` | 申请人 |
| `bill_trade_type_id` | `bill_trade_type_id` | `billTradeTypeId` | 交易类型 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `in_accentity_id` | `in_accentity_id` | `inAccentityId` | 调入会计主体ID |
| `out_accentity_id` | `out_accentity_id` | `outAccentityId` | 调出会计主体ID |
| `request_dept_id` | `request_dept_id` | `requestDeptId` | 申请部门 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征id |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaAllocateRequestDetailList` | 固定资产调拨申请明细 |
