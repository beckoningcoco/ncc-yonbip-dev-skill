---
tags: [BIP, 元数据, 数据字典, znbzbx.expensebill.ExpenseOfficialCardVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公务卡流水 (`znbzbx.expensebill.ExpenseOfficialCardVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expensebill_officialcardrecord` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公务卡流水 |
| 物理表 | `znbz_expensebill_officialcardrecord` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `` |
| `vhandledeptid` | `` |
| `pk_expensebill_b` | `` |
| `ytenant_id` | `` |
| `transactioncurrency` | `` |
| `pk_handlepsn` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cardissuingbank` | `cardissuingbank` | `cardissuingbank` | 卡片银行 |
| `customercode` | `customercode` | `customercode` | 客户号 |
| `handlecardnumber` | `handlecardnumber` | `handlecardnumber` | 持卡人卡号 |
| `handlecode` | `handlecode` | `handlecode` | 持卡人员工编号 |
| `handleemail` | `handleemail` | `handleemail` | 持卡人邮件 |
| `handlemobile` | `handlemobile` | `handlemobile` | 持卡人手机号 |
| `handlename` | `handlename` | `handlename` | 持卡人 |
| `merchantname` | `merchantname` | `merchantname` | 商户名称 |
| `transactioncategory` | `transactioncategory` | `transactioncategory` | 交易分类 |
| `transactionserialnumber` | `transactionserialnumber` | `transactionserialnumber` | 交易流水号 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `zerobalanceaccount` | `zerobalanceaccount` | `zerobalanceaccount` | 零余额账户 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `chandleorg` | `chandleorg` | `chandleorg` | 持卡人组织 |
| `pk_expensebill_b` | `pk_expensebill_b` | `pk_expensebill_b` | 报销单子表主键 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 持卡员工 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `transactioncurrency` | `transactioncurrency` | `transactioncurrency` | 交易币种 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 持卡人部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iexpensestatus` | `iexpensestatus` | `iexpensestatus` | 使用状态 |
| `sourcetype` | `sourcetype` | `sourcetype` | 来源类型 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debtmodel` | `debtmodel` | `debtmodel` | 承债模式 |
| `ireftype` | `ireftype` | `ireftype` | 流水可报销次数 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `pk_officialcardrecord` | `pk_officialcardrecord` | `pk_officialcardrecord` | 公务卡流水id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ncurrentmny` | `ncurrentmny` | `ncurrentmny` | 本次报销金额 |
| `nexpensemny` | `nexpensemny` | `nexpensemny` | 可报销金额 |
| `nfinishmny` | `nfinishmny` | `nfinishmny` | 已报销金额 |
| `transactionmny` | `transactionmny` | `transactionmny` | 交易金额 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `transactiontime` | `transactiontime` | `transactiontime` | 交易时间 |
