---
tags: [BIP, 元数据, 数据字典, tlm.investmentquota.InvestmentQuota]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资额度 (`tlm.investmentquota.InvestmentQuota`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_investmentquota` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`e48dbe04-f83c-492a-8745-d31928eb1eeb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资额度 |
| 物理表 | `tlm_investmentquota` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 51 个 |
| 子表 | 2 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ExecutionRecord` | `tlm.investmentquota.ExecutionRecord` | composition |
| `InvestmentQuota_b` | `tlm.investmentquota.InvestmentQuota_b` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `investmentquotaCharacterDef` | `` |
| `localcurrency` | `` |
| `activity` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `dept_id` | `` |
| `` | `` |
| `wbs` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `project_id` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 17字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 51 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quotacode` | `quotacode` | `quotacode` | 额度登记单号 |
| `code` | `code` | `code` | 单据编号 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `term` | `term` | `term` | 额度期限 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `occupationmethod` | `occupationmethod` | `occupationmethod` | 占用方式 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `project_id` | `project_id` | `projectid` | 项目 |
| `wbs` | `wbs` | `wbs` | wbs |
| `activity` | `activity` | `activity` | 活动 |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `localcurrency` | `localcurrency` | `localcurrency` | 本币币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quotadate` | `quotadate` | `quotadate` | 单据日期 |
| `effectivedate` | `effectivedate` | `effectivedate` | 额度生效日 |
| `duedate` | `duedate` | `duedate` | 额度到期日 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isWfControlled` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限数量 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `effectivestatus` | `effectivestatus` | `effectivestatus` | 生效状态 |
| `controlmodel` | `controlmodel` | `controlmodel` | 控制方式 |
| `verifystate` | `verifystate` | `verifystate` | 审批状态 |
| `returncount` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `totalinvestmentamount` | `totalinvestmentamount` | `totalinvestmentamount` | 投资总额度(本币币种) |
| `investmentlimitamount` | `investmentlimitamount` | `investmentlimitamount` | 累计投资限额(本币币种) |
| `occupiedamount` | `occupiedamount` | `occupiedamount` | 已占用额度(本币币种) |
| `releasedamount` | `releasedamount` | `releasedamount` | 已释放额度(本币币种) |
| `availableamount` | `availableamount` | `availableamount` | 可用额度(本币币种) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `investmentquotaCharacterDef` | `investmentquotaCharacterDef` | `investmentquotaCharacterDef` | 投资额度特征 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ExecutionRecord` | 额度执行记录 |
| `` | `` | `InvestmentQuota_b` | 投资额度子表 |
