---
tags: [BIP, 元数据, 数据字典, sfa.tendersheet.TenderSheetDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投标单明细 (`sfa.tendersheet.TenderSheetDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_tender_sheet_detail` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标单明细 |
| 物理表 | `sfa_tender_sheet_detail` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `oppt` | `` |
| `tender_result` | `` |
| `ytenant_id` | `` |
| `tender_review_detail_id` | `` |
| `tendersheetdetaildefinecharacter` | `` |
| `` | `` |
| `tender_sheet_id` | `` |
| `review_id` | `` |

## 继承接口 (2个, 9字段)

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

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bag` | `bag` | `bag` | 包 |
| `` | `creator` | `creator` | 创建人名称 |
| `guarantee_code` | `guarantee_code` | `guaranteeCode` | 保证金单号 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `tender_segment` | `tender_segment` | `segment` | 标段 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `oppt` | `oppt` | `oppt` | 商机 |
| `review_id` | `review_id` | `reviewId` | 投标复盘单 |
| `tender_result` | `tender_result` | `tenderResult` | 投标状态 |
| `tender_review_detail_id` | `tender_review_detail_id` | `tenderReviewDetailId` | 投标复盘单明细id |
| `tender_sheet_id` | `tender_sheet_id` | `tenderSheetId` | 投标单 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guarantee_status` | `guarantee_status` | `guaranteeStatus` | 保证金状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lineNo` | `lineNo` | `lineNo` | 行号 |
| `nat_tendermoney` | `nat_tendermoney` | `natTenderMoney` | 本币投标金额 |
| `original_lineNo` | `original_lineNo` | `originalLineNo` | 原始行号 |
| `tender_money` | `tender_money` | `tenderMoney` | 投标金额 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tendersheetdetaildefinecharacter` | `tendersheetdetaildefinecharacter` | `tenderSheetDetailDefineCharacter` | 投标明细特征 |
