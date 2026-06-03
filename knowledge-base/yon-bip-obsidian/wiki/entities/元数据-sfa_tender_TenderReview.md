---
tags: [BIP, 元数据, 数据字典, sfa.tender.TenderReview]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投标复盘 (`sfa.tender.TenderReview`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_tender_review` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`b2a298ee-2187-48ab-956c-252257c5b983`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标复盘 |
| 物理表 | `sfa_tender_review` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 40 个 |
| 子表 | 2 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `reviewDefine` | `sfa.tender.TenderReviewDefine` | composition |
| `details` | `sfa.tender.TenderReviewDetail` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `tender` | `yycrm.sfa_tendersheetref` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `ytenant_id` | `` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `salearea` | `productcenter.aa_salearearef` |
| `industry` | `productcenter.aa_customertraderef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `partnerPerson` | `ucf-staff-center.bd_staff_ref` |
| `reviewDefineCharacter` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `partner_dept` | `` |
| `iCustID` | `yycrm.cust_customerref` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (8个, 24字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **交易类型** (`crmc.base.IBustype`)
  - `bustype` → `bustype`

## 字段列表（按类型分组）

> 共 40 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `note` | `note` | `note` | 复盘备注 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tender` | `tender` | `tender` | 投标单 |
| `currency` | `currency` | `currency` | 币种 |
| `project_id` | `project_id` | `project` | 项目 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `dept` | `dept` | `dept` | 部门 |
| `industry` | `industry` | `industry` | 行业(ID) |
| `` | `modifierId` | `modifierId` | 修改人 |
| `iCustID` | `iCustID` | `cust` | 伙伴ID |
| `org` | `org` | `org` | 管理组织 |
| `partnerPerson` | `partnerPerson` | `partnerPerson` | 伙伴负责人ID |
| `ower` | `ower` | `ower` | 所有者 |
| `salearea` | `salearea` | `saleArea` | 销售区域 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `customer` | `customer` | `customer` | 客户ID |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tender_money` | `tender_money` | `tenderMoney` | 投标金额 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `reviewDate` | `reviewDate` | `reviewDate` | 复盘日期 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `reviewDefine` | 投标复盘自定义项 |
| `` | `` | `details` | 投标复盘明细 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reviewDefineCharacter` | `reviewDefineCharacter` | `reviewDefineCharacter` | 投标复盘自定义项特征 |
