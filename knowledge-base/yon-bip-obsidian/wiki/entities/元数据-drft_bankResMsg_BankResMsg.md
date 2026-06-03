---
tags: [BIP, 元数据, 数据字典, drft.bankResMsg.BankResMsg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行返回数据实体 (`drft.bankResMsg.BankResMsg`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_bankResMsg` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`5f8098a3-34b7-4996-8eae-9cba16b1ecd5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 银行返回数据实体 |
| 物理表 | `drft_bankResMsg` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 61 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `change_user_id` | `` |
| `pk_register` | `` |
| `accentity` | `` |
| `electronicbill` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 5字段)

- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 61 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accto` | `accto` | `accto` | 会计主体账户 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `billrange` | `billrange` | `billrange` | 子票区间 |
| `circulateflag` | `circulateflag` | `circulateflag` | 流通标志 |
| `bank_code` | `bank_code` | `bankCode` | 会计主体银行编码 |
| `bank_num` | `bank_num` | `bankNum` | 银行流水号 |
| `bat_no` | `bat_no` | `batNo` | 批处理号 |
| `bill_type` | `bill_type` | `billType` | 票据类型 |
| `bill_id` | `bill_id` | `bill_id` | 单据主键 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `ecds_status` | `ecds_status` | `ecdsStatus` | 电票状态 |
| `instruction_code` | `instruction_code` | `instructionCode` | 指令编码 |
| `instruction_msg` | `instruction_msg` | `instructionMsg` | 指令结果 |
| `instruction_type` | `instruction_type` | `instructionType` | 指令类型 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `noteno` | `noteno` | `noteno` | 票据号 |
| `pay_result` | `pay_result` | `payResult` | 交易结果 |
| `request_no` | `request_no` | `requestNo` | 请求流水号 |
| `respond_code` | `respond_code` | `respondCode` | 响应码 |
| `respond_msg` | `respond_msg` | `respondMsg` | 响应信息 |
| `serial_num` | `serial_num` | `serialNum` | 收付云业务流水号 |
| `tran_no` | `tran_no` | `tranNo` | 交易明细号 |
| `change_user_name` | `change_user_name` | `changeusername` | 变更人名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `electronicbill` | `electronicbill` | `electronicbill` | 电票账户 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_register` | `pk_register` | `pk_register` | 票据信息主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `change_user_id` | `change_user_id` | `changeuserid` | 变更人 |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `buss_date` | `buss_date` | `bussDate` | 业务日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_new` | `is_new` | `isNew` | 是否最新 |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `instruct_status` | `instruct_status` | `instructStatus` | 指令状态 |
| `notestatus` | `notestatus` | `notestatus` | 票据状态 |
| `result_status` | `result_status` | `resultStatus` | 交易结果 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `` | `status` | `status` | 单据状态 |
| `change_status` | `change_status` | `changestatus` | 变更状态 |
| `dr` | `dr` | `dr` | 删除标识 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billrangestart` | `billrangestart` | `billrangestart` | 子票区间起始 |
| `billrangeend` | `billrangeend` | `billrangeend` | 子票区间终止 |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |
| `instruction_no` | `instruction_no` | `instructionNo` | 指令序号 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `transmoney` | `transmoney` | `transmoney` | 交易金额 |

### timestamp (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `buss_time` | `buss_time` | `bussTime` | 银行营业时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `respond_time` | `respond_time` | `respondTime` | 响应时间 |
| `send_time` | `send_time` | `sendTime` | 发送时间 |
| `change_time` | `change_time` | `changetime` | 变更时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `basebilltype` | `basebilltype` | `basebilltype` | 单据类型 |
