---
tags: [BIP, 元数据, 数据字典, EAR.FIAR.arapLedgerGXBalance]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 事务孙余额表 (`EAR.FIAR.arapLedgerGXBalance`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g_x_balance` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`303c93aa-7963-47b7-86f3-eba4245b41ac`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 事务孙余额表 |
| 物理表 | `arap_ledger_g_x_balance` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAR` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finance_org_id` | `finance_org_id` | `financeOrgId` | 会计主体ID |
| `acc_book_id` | `acc_book_id` | `accBookId` | 财务账簿ID |
| `event_type_id` | `event_type_id` | `eventTypeId` | 会计事务类型ID |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 应收应付会计事务类型(枚举...) |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `creator` | `creator` | `creator` | 创建人ID |
| `id` | `id` | `id` | ID |
| `modifier` | `modifier` | `modifier` | 修改人ID |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态(0解冻; 1冻结) |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年度ID |
| `acc_period_id` | `acc_period_id` | `accPeriodId` | 会计期间ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_balance` | `ori_balance` | `oriBalance` | 余额 |
| `ori_ocupy_amount` | `ori_ocupy_amount` | `oriOcupyAmount` | 预占用金额 |
| `acc_balance` | `acc_balance` | `accBalance` | 本币余额 |
| `org_balance` | `org_balance` | `orgBalance` | 组织币余额 |
| `grp_balance` | `grp_balance` | `grpBalance` | 集团币余额 |
| `gbl_balance` | `gbl_balance` | `gblBalance` | 全局币余额 |
