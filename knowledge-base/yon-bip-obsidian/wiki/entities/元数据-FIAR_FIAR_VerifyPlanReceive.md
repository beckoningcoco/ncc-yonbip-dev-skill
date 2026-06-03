---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.VerifyPlanReceive]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 核销方案 (`FIAR.FIAR.VerifyPlanReceive`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_verify_plan_h` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`5a66d4d4-0775-4b29-b908-20c5c6952821`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 核销方案 |
| 物理表 | `arap_verify_plan_h` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 25 个 |
| 子表 | 3 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `VerifyMatchReceiveList` | `FIAR.FIAR.VerifyMatchReceive` | composition |
| `VerifyRangeReceiveList` | `FIAR.FIAR.VerifyRangeReceive` | composition |
| `VerifyOrderReceiveList` | `FIAR.FIAR.VerifyOrderReceive` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `mid_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `plan_code` | `plan_code` | `planCode` | 方案编码 |
| `plan_name` | `plan_name` | `planName` | 方案名称 |
| `remarks` | `remarks` | `remarks` | 方案描述 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `creator` | `creator` | `creator` | 创建人 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `mid_currency_id` | `mid_currency_id` | `midCurrency` | 中间币种 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arap_order` | `arap_order` | `arapOrder` | 应收核销顺序 |
| `bln_default` | `bln_default` | `blnDefault` | 默认方案 |
| `colpay_order` | `colpay_order` | `colpayOrder` | 收款退款核销顺序 |
| `verify_curr_rule` | `verify_curr_rule` | `verifyCurrRule` | 币种核销规则 |
| `arap_event_type` | `arap_event_type` | `verifyEventType` | 核销会计事务类型 |
| `verify_way` | `verify_way` | `verifyWay` | 核销方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `max_exec_seconds` | `max_exec_seconds` | `maxExecSeconds` | 执行超时时间 |
| `tolerance` | `tolerance` | `tolerance` | 异币种核销容差额 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `VerifyMatchReceiveList` | 匹配规则 |
| `` | `` | `VerifyOrderReceiveList` | 核销分类 |
| `` | `` | `VerifyRangeReceiveList` | 核销范围 |
