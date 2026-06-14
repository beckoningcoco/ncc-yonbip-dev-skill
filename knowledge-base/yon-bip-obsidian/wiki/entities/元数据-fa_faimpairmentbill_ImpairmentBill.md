---
tags: [BIP, 元数据, 数据字典, fa.faimpairmentbill.ImpairmentBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产减值单 (`fa.faimpairmentbill.ImpairmentBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_impairment` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f72ee487-da6b-4411-b344-7739d770b213`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产减值单 |
| 物理表 | `fa_bill_impairment` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 34 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `fa.faimpairmentbill.ImpairmentBillDetail` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `bill_trade_type_id` | `transtype.bd_billtyperef` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |

## 继承接口 (2个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `writeoff_bill_code` | `writeoff_bill_code` | `billCodeRecall` | 冲销编码 |
| `writeoff_bill_id` | `writeoff_bill_id` | `billIdRecall` | 冲销id |
| `imp_bill_type` | `imp_bill_type` | `billbdType` | 减值单单据类型(正常单据还是撤销单据) |
| `busi_post_failure_reason` | `busi_post_failure_reason` | `busiPostFailureReason` | 业务过账失败原因 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |
| `ori_app_id` | `ori_app_id` | `oriAppId` | 源头应用ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradeTypeId` | 源头交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型ID |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `remarks` | `remarks` | `remarks` | 备注 |
| `bill_date` | `bill_date` | `vouchdate` | 单据日期 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bill_trade_type_id` | `bill_trade_type_id` | `billTradeTypeId` | 交易类型 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
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
| `busi_post_status` | `busi_post_status` | `busiPostStatus` | 业务过账过账状态 |
| `bln_cgu` | `bln_cgu` | `isCgu` | 是否为cgu新增 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_version` | `busi_post_version` | `busiPostVersion` | 业务过账版本 |
| `tpl_id` | `tpl_id` | `tplId` | 模板ID |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 减值单表体 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
