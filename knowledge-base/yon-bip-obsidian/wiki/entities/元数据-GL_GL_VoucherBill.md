---
tags: [BIP, 元数据, 数据字典, GL.GL.VoucherBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 凭证单表头 (`GL.GL.VoucherBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_voucherbill_h` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`5914531a-f98e-4a65-8547-a579a84824ac`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 凭证单表头 |
| 物理表 | `gl_voucherbill_h` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 62 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `VoucherBillBodyList` | `GL.GL.VoucherBillBody` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `vouchertype_id` | `fiepub.epub_vouchertype_ref` |
| `billtype` | `ucfbasedoc.bd_billtypetreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_all` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `trans_type` | `ucfbasedoc.bd_billtyperef` |
| `` | `` |
| `free_characteristic` | `` |
| `fi_event_id` | `yonbip-fi-eaai.RefTable_9a7b845a30` |
| `currtype_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (3个, 7字段)

- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 62 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billdate` | `billdate` | `billdate` | 单据日期 |
| `def1` | `def1` | `def1` | 自定义项1 |
| `def2` | `def2` | `def2` | 自定义项2 |
| `def3` | `def3` | `def3` | 自定义项3 |
| `def4` | `def4` | `def4` | 自定义项4 |
| `def5` | `def5` | `def5` | 自定义项5 |
| `def6` | `def6` | `def6` | 自定义项6 |
| `def7` | `def7` | `def7` | 自定义项7 |
| `def8` | `def8` | `def8` | 自定义项8 |
| `def9` | `def9` | `def9` | 自定义项9 |
| `gl_voucher_errmsg` | `gl_voucher_errmsg` | `glVoucherErrmsg` | 生成凭证失败原因 |
| `gl_voucher_id` | `gl_voucher_id` | `glVoucherId` | 总账凭证ID |
| `gl_voucher_no` | `gl_voucher_no` | `glVoucherNo` | 总账凭证号 |
| `remark` | `remark` | `remark` | 备注 |
| `rev_link_src_head` | `rev_link_src_head` | `revLinkSrcHead` | 冲销源凭证单 |
| `description` | `description` | `description` | 摘要 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `fi_event_code` | `fi_event_code` | `fiEventCode` | 财务事务编号 |
| `fi_event_voucher_id` | `fi_event_voucher_id` | `fiEventVoucherId` | 事项凭证ID |
| `fi_event_voucher_no` | `fi_event_voucher_no` | `fiEventVoucherNo` | 事项凭证(分录)号 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currtype_id` | `currtype_id` | `currtype` | 币种 |
| `accbook_id` | `accbook_id` | `accBook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体/组织 |
| `billtype` | `billtype` | `billType` | 单据类型 |
| `fi_event_id` | `fi_event_id` | `fiEvent` | 财务事务ID |
| `trans_type` | `trans_type` | `transType` | 交易类型 |
| `vouchertype_id` | `vouchertype_id` | `voucherType` | 凭证类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_date` | `busi_date` | `busiDate` | 业务日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billstatus` | `billstatus` | `billstatus` | 单据状态(废弃) |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `fi_event_status` | `fi_event_status` | `fiEventStatus` | 过账状态 |
| `periodunion` | `periodunion` | `periodunion` | 会计期间 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `be_reversal_status` | `be_reversal_status` | `beReversalStatus` | 被冲销状态 |
| `reversal_status` | `reversal_status` | `reversalStatus` | 冲销状态 |
| `attched_num` | `attched_num` | `attachedBill` | 附单据数 |
| `bln_attched` | `bln_attched` | `hasAttachment` | 是否有附件 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `original_total_crebit_amount` | `original_total_crebit_amount` | `originalTotalCrebitAmount` | 贷方原币币合计 |
| `original_total_debit_amount` | `original_total_debit_amount` | `originalTotalDebitAmount` | 借方原币币合计 |
| `global_total_crebit_amount` | `global_total_crebit_amount` | `totalCreditGlobal` | 贷方本币合计_全局 |
| `group_total_crebit_amount` | `group_total_crebit_amount` | `totalCreditGroup` | 贷方本币合计_集团 |
| `accbook_total_crebit_amount` | `accbook_total_crebit_amount` | `totalCreditOrg` | 贷方本币合计_账簿 |
| `org_total_crebit_amount` | `org_total_crebit_amount` | `totalCreditOrganiz` | 贷方本币合计_组织 |
| `global_total_debit_amount` | `global_total_debit_amount` | `totalDebitGlobal` | 借方本币合计_全局 |
| `group_total_debit_amount` | `group_total_debit_amount` | `totalDebitGroup` | 借方本币合计_集团 |
| `accbook_total_debit_amount` | `accbook_total_debit_amount` | `totalDebitOrg` | 借方本币合计_账簿 |
| `org_total_debit_amount` | `org_total_debit_amount` | `totalDebitOrganiz` | 借方本币合计_组织 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_characteristic` | `free_characteristic` | `freeCharacteristic` | 自定义表头特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `VoucherBillBodyList` | 凭证单表体 |
