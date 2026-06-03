---
tags: [BIP, 元数据, 数据字典, drft.drftnoteinformationtran.DrftNoteInformationTran]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据信息子表 (`drft.drftnoteinformationtran.DrftNoteInformationTran`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_noteinformation_tran` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`2eff64c9-f226-4538-90ec-cec39c945750`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据信息子表 |
| 物理表 | `drft_noteinformation_tran` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_register` | `` |
| `` | `` |
| `accentity` | `` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `outerhid` | `outerhid` | `outerhid` | 关联业务表头主键 |
| `outerbid` | `outerbid` | `outerbid` | 关联业务表体主键 |
| `upstreamhid` | `upstreamhid` | `upstreamhid` | 关联上游业务表头主键 |
| `upstreambid` | `upstreambid` | `upstreambid` | 关联上游业务表体主键 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `pk_register` | `pk_register` | `pk_register` | 票据信息主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cancel_flag` | `cancel_flag` | `cancelFlag` | 作废标识(true: 已作废, false: 未作废) |
| `split_flag` | `split_flag` | `splitFlag` | 拆包标识(true: 已被拆包使用, false: 未被拆包使用) |
| `iselec` | `iselec` | `iselec` | 是否直联 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `note_status` | `note_status` | `noteStatus` | 票据状态 |
| `checkresult` | `checkresult` | `checkresult` | 集票宝对账结果 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_business` | `pk_business` | `pk_business` | 业务主表主键 |
| `bill_range_start` | `bill_range_start` | `billRangeStart` | 开始区间 |
| `bill_range_end` | `bill_range_end` | `billRangeEnd` | 结束区间 |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主键 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `trans_money` | `trans_money` | `transMoney` | 交易金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
