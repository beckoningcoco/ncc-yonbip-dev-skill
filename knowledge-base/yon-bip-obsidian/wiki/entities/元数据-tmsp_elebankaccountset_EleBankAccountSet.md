---
tags: [BIP, 元数据, 数据字典, tmsp.elebankaccountset.EleBankAccountSet]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账户业务范围设置 (`tmsp.elebankaccountset.EleBankAccountSet`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tmsp_elebankaccountset` | domain：`yonbip-fi-ctmtmsp` | 应用：`TMSP` | 业务对象ID：`86ccfb06-3bb2-427b-8fda-94d760211eaa`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账户业务范围设置 |
| 物理表 | `tmsp_elebankaccountset` |
| 数据库 schema | `yonbip-fi-ctmtmsp` |
| 所属应用 | `TMSP` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `enterprisebankaccount` | `ucfbasedoc.bd_enterprisebank` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_table` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bankInfo` | `bankInfo` | `bankInfo` | 银行返回信息 |
| `contact_name` | `contact_name` | `contactName` | 联系人姓名 |
| `contact_phone` | `contact_phone` | `contactPhone` | 联系人电话 |
| `credit_code` | `credit_code` | `creditCode` | 社会统一信用代码 |
| `customNo` | `customNo` | `customNo` | 客户号 |
| `customNum` | `customNum` | `customNum` | 客户号开放银行 |
| `customer_name` | `customer_name` | `customerName` | 客户名称 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `enterprisebankaccount` | `enterprisebankaccount` | `enterpriseBankAccount` | 企业银行账户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `logout` | `logout` | `logout` | 是否注销 |
| `openBill` | `openBill` | `openBill` | 开通银行票据池 |
| `openflag` | `openflag` | `openFlag` | 开通银企连服务 |
| `openTicketService` | `openTicketService` | `openTicketService` | 开通银行电票 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `signStatus` | `signStatus` | `signStatus` | 签约状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenantId` | 租户id |
