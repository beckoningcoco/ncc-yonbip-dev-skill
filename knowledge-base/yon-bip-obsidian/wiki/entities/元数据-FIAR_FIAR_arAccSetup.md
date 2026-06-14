---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.arAccSetup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收期初建账 (`FIAR.FIAR.arAccSetup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_acc_setup` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`8cfa247a-9cfe-4065-a461-17aff15f2ed3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收期初建账 |
| 物理表 | `arap_acc_setup` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `acc_period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `setup_creator` | `bip-usercenter.bip_user_ref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `system_type` | `system_type` | `systemType` | 系统标识 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间 |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `setup_creator` | `setup_creator` | `setupCreator` | 建账人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `setup_date` | `setup_date` | `setupDate` | 建账时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_setup` | `bln_setup` | `blnSetup` | 建账状态 |
| `setup_check_state` | `setup_check_state` | `setupCheckState` | 检查结果 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
