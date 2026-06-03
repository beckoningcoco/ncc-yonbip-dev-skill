---
tags: [BIP, 元数据, 数据字典, GL.GL.AbsVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 抽象凭证表头 (`GL.GL.AbsVoucher`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_voucherbill_h` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`deb85554-fd8e-4946-a6d2-a1dbc3b70561`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 抽象凭证表头 |
| 物理表 | `gl_voucherbill_h` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 35 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `AbsVoucherBodyList` | `GL.GL.AbsVoucherBody` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `trans_type` | `ucfbasedoc.bd_billtyperef` |
| `vouchertype_id` | `fiepub.epub_vouchertype_ref` |
| `billtype` | `ucfbasedoc.bd_billtypetreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `fi_event_id` | `yonbip-fi-eaai.RefTable_9a7b845a30` |
| `accentity_id` | `finbd.bd_allaccbodyref_all` |

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

> 共 35 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 摘要 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 财务事务编号 |
| `fi_event_voucher_id` | `fi_event_voucher_id` | `fiEventVoucherId` | 事项凭证ID |
| `fi_event_voucher_no` | `fi_event_voucher_no` | `fiEventVoucherNo` | 事项凭证(分录)号 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accBook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体/组织 |
| `auditor` | `auditor` | `auditor` | 审核人 |
| `billtype` | `billtype` | `billType` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `fi_event_id` | `fi_event_id` | `fiEvent` | 财务事务ID |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `trans_type` | `trans_type` | `transType` | 交易类型 |
| `vouchertype_id` | `vouchertype_id` | `voucherType` | 凭证类型 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `fi_event_status` | `fi_event_status` | `fiEventStatus` | 过账状态 |
| `periodunion` | `periodunion` | `periodunion` | 会计期间 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attched_num` | `attched_num` | `attachedBill` | 附单据数 |
| `bln_attched` | `bln_attched` | `hasAttachment` | 是否有附件 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `global_total_crebit_amount` | `global_total_crebit_amount` | `totalCreditGlobal` | 贷方本币合计_全局 |
| `group_total_crebit_amount` | `group_total_crebit_amount` | `totalCreditGroup` | 贷方本币合计_集团 |
| `accbook_total_crebit_amount` | `accbook_total_crebit_amount` | `totalCreditOrg` | 贷方本币合计_账簿 |
| `org_total_crebit_amount` | `org_total_crebit_amount` | `totalCreditOrganiz` | 贷方本币合计_组织 |
| `global_total_debit_amount` | `global_total_debit_amount` | `totalDebitGlobal` | 借方本币合计_全局 |
| `group_total_debit_amount` | `group_total_debit_amount` | `totalDebitGroup` | 借方本币合计_集团 |
| `accbook_total_debit_amount` | `accbook_total_debit_amount` | `totalDebitOrg` | 借方本币合计_账簿 |
| `org_total_debit_amount` | `org_total_debit_amount` | `totalDebitOrganiz` | 借方本币合计_组织 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `AbsVoucherBodyList` | 抽象凭证表体 |
