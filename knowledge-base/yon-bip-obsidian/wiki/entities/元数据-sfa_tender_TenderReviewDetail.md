---
tags: [BIP, 元数据, 数据字典, sfa.tender.TenderReviewDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投标复盘明细 (`sfa.tender.TenderReviewDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_tender_review_detail` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标复盘明细 |
| 物理表 | `sfa_tender_review_detail` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `lost_target` | `` |
| `oppt` | `` |
| `tender_result` | `` |
| `review_reason_new` | `` |
| `ytenant_id` | `` |
| `tenderReviewDetailDefineCharacter` | `` |
| `` | `` |
| `currency` | `` |
| `review_id` | `` |
| `tendersheetdetail_id` | `` |

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

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `segment_txt` | `segment_txt` | `segment` | 标段 |
| `bag` | `bag` | `bag` | 包 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `review_id` | `review_id` | `reviewId` | 投标复盘 |
| `tendersheetdetail_id` | `tendersheetdetail_id` | `tenderSheetDetail` | 投标单明细 |
| `oppt` | `oppt` | `oppt` | 商机 |
| `tender_result` | `tender_result` | `tenderResult` | 投标状态 |
| `lost_target` | `lost_target` | `lostTarget` | 丢标对象 |
| `review_reason_new` | `review_reason_new` | `reviewReason` | 复盘原因 |
| `currency` | `currency` | `currency` | 币种 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lineNo` | `lineNo` | `lineNo` | 行号 |
| `tender_money` | `tender_money` | `tenderMoney` | 投标金额 |
| `win_tender_money` | `win_tender_money` | `winTenderMoney` | 中标金额 |
| `loss_tender_money` | `loss_tender_money` | `lossTenderMoney` | 丢标金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenderReviewDetailDefineCharacter` | `tenderReviewDetailDefineCharacter` | `tenderReviewDetailDefineCharacter` | 投标复盘明细特征 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
